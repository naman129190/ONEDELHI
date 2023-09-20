package org.apache.commons.compress.archivers.sevenz;

import com.onedelhi.secure.C7114w;
import com.onedelhi.secure.C7287y;
import com.onedelhi.secure.i31;
import com.onedelhi.secure.jn1;
import com.onedelhi.secure.r31;
import com.onedelhi.secure.w02;
import com.onedelhi.secure.x33;
import com.onedelhi.secure.yo3;
import com.onedelhi.secure.yy4;
import java.io.FilterInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
import org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream;
import org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream;

class Coders {
    private static final Map<SevenZMethod, CoderBase> CODER_MAP = new HashMap<SevenZMethod, CoderBase>() {
        private static final long serialVersionUID = 1664829131806520867L;

        {
            put(SevenZMethod.COPY, new CopyDecoder());
            put(SevenZMethod.LZMA, new LZMADecoder());
            put(SevenZMethod.LZMA2, new LZMA2Decoder());
            put(SevenZMethod.DEFLATE, new DeflateDecoder());
            put(SevenZMethod.BZIP2, new BZIP2Decoder());
            put(SevenZMethod.AES256SHA256, new AES256SHA256Decoder());
            put(SevenZMethod.BCJ_X86_FILTER, new BCJDecoder(new yy4()));
            put(SevenZMethod.BCJ_PPC_FILTER, new BCJDecoder(new x33()));
            put(SevenZMethod.BCJ_IA64_FILTER, new BCJDecoder(new jn1()));
            put(SevenZMethod.BCJ_ARM_FILTER, new BCJDecoder(new C7114w()));
            put(SevenZMethod.BCJ_ARM_THUMB_FILTER, new BCJDecoder(new C7287y()));
            put(SevenZMethod.BCJ_SPARC_FILTER, new BCJDecoder(new yo3()));
            put(SevenZMethod.DELTA_FILTER, new DeltaDecoder());
        }
    };

    public static class BCJDecoder extends CoderBase {
        private final i31 opts;

        public BCJDecoder(i31 i31) {
            super(new Class[0]);
            this.opts = i31;
        }

        public InputStream decode(String str, InputStream inputStream, long j, Coder coder, byte[] bArr) throws IOException {
            try {
                return this.opts.mo37821f(inputStream);
            } catch (AssertionError e) {
                IOException iOException = new IOException("BCJ filter used in " + str + " needs XZ for Java > 1.4 - see " + "http://commons.apache.org/proper/commons-compress/limitations.html#7Z");
                iOException.initCause(e);
                throw iOException;
            }
        }

        public OutputStream encode(OutputStream outputStream, Object obj) {
            return new FilterOutputStream(this.opts.mo37823h(new r31(outputStream))) {
                public void flush() {
                }
            };
        }
    }

    public static class BZIP2Decoder extends CoderBase {
        public BZIP2Decoder() {
            super(Number.class);
        }

        public InputStream decode(String str, InputStream inputStream, long j, Coder coder, byte[] bArr) throws IOException {
            return new BZip2CompressorInputStream(inputStream);
        }

        public OutputStream encode(OutputStream outputStream, Object obj) throws IOException {
            return new BZip2CompressorOutputStream(outputStream, CoderBase.numberOptionOrDefault(obj, 9));
        }
    }

    public static class CopyDecoder extends CoderBase {
        public CopyDecoder() {
            super(new Class[0]);
        }

        public InputStream decode(String str, InputStream inputStream, long j, Coder coder, byte[] bArr) throws IOException {
            return inputStream;
        }

        public OutputStream encode(OutputStream outputStream, Object obj) {
            return outputStream;
        }
    }

    public static class DeflateDecoder extends CoderBase {
        public DeflateDecoder() {
            super(Number.class);
        }

        public InputStream decode(String str, InputStream inputStream, long j, Coder coder, byte[] bArr) throws IOException {
            return new InflaterInputStream(new DummyByteAddingInputStream(inputStream), new Inflater(true));
        }

        public OutputStream encode(OutputStream outputStream, Object obj) {
            return new DeflaterOutputStream(outputStream, new Deflater(CoderBase.numberOptionOrDefault(obj, 9), true));
        }
    }

    public static class DummyByteAddingInputStream extends FilterInputStream {
        private boolean addDummyByte;

        private DummyByteAddingInputStream(InputStream inputStream) {
            super(inputStream);
            this.addDummyByte = true;
        }

        public int read() throws IOException {
            int read = super.read();
            if (read != -1 || !this.addDummyByte) {
                return read;
            }
            this.addDummyByte = false;
            return 0;
        }

        public int read(byte[] bArr, int i, int i2) throws IOException {
            int read = super.read(bArr, i, i2);
            if (read != -1 || !this.addDummyByte) {
                return read;
            }
            this.addDummyByte = false;
            bArr[i] = 0;
            return 1;
        }
    }

    public static class LZMADecoder extends CoderBase {
        public LZMADecoder() {
            super(new Class[0]);
        }

        public InputStream decode(String str, InputStream inputStream, long j, Coder coder, byte[] bArr) throws IOException {
            Coder coder2 = coder;
            byte[] bArr2 = coder2.properties;
            byte b = bArr2[0];
            int i = 1;
            long j2 = (long) bArr2[1];
            while (i < 4) {
                int i2 = i + 1;
                j2 |= (((long) coder2.properties[i2]) & 255) << (i * 8);
                i = i2;
            }
            if (j2 <= 2147483632) {
                return new w02(inputStream, j, b, (int) j2);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Dictionary larger than 4GiB maximum size used in ");
            String str2 = str;
            sb.append(str);
            throw new IOException(sb.toString());
        }
    }

    public static InputStream addDecoder(String str, InputStream inputStream, long j, Coder coder, byte[] bArr) throws IOException {
        CoderBase findByMethod = findByMethod(SevenZMethod.byId(coder.decompressionMethodId));
        if (findByMethod != null) {
            return findByMethod.decode(str, inputStream, j, coder, bArr);
        }
        throw new IOException("Unsupported compression method " + Arrays.toString(coder.decompressionMethodId) + " used in " + str);
    }

    public static OutputStream addEncoder(OutputStream outputStream, SevenZMethod sevenZMethod, Object obj) throws IOException {
        CoderBase findByMethod = findByMethod(sevenZMethod);
        if (findByMethod != null) {
            return findByMethod.encode(outputStream, obj);
        }
        throw new IOException("Unsupported compression method " + sevenZMethod);
    }

    public static CoderBase findByMethod(SevenZMethod sevenZMethod) {
        return CODER_MAP.get(sevenZMethod);
    }
}
