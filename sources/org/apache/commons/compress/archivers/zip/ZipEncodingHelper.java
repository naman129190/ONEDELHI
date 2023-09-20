package org.apache.commons.compress.archivers.zip;

import com.onedelhi.secure.C7400yz;
import com.onedelhi.secure.ql1;
import com.onedelhi.secure.tk4;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.apache.commons.compress.utils.Charsets;

public abstract class ZipEncodingHelper {
    private static final byte[] HEX_DIGITS = {TarConstants.LF_NORMAL, TarConstants.LF_LINK, TarConstants.LF_SYMLINK, TarConstants.LF_CHR, TarConstants.LF_BLK, TarConstants.LF_DIR, TarConstants.LF_FIFO, TarConstants.LF_CONTIG, 56, 57, 65, 66, 67, 68, 69, 70};
    public static final String UTF8 = "UTF8";
    public static final ZipEncoding UTF8_ZIP_ENCODING = new FallbackZipEncoding("UTF8");
    private static final Map<String, SimpleEncodingHolder> simpleEncodings;

    public static class SimpleEncodingHolder {
        private Simple8BitZipEncoding encoding;
        private final char[] highChars;

        public SimpleEncodingHolder(char[] cArr) {
            this.highChars = cArr;
        }

        public synchronized Simple8BitZipEncoding getEncoding() {
            if (this.encoding == null) {
                this.encoding = new Simple8BitZipEncoding(this.highChars);
            }
            return this.encoding;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        SimpleEncodingHolder simpleEncodingHolder = new SimpleEncodingHolder(new char[]{199, 252, 233, 226, 228, 224, 229, ql1.f34279c, 234, ql1.f34282d, 232, ql1.f34289h, ql1.f34288g, ql1.f34284e, 196, 197, 201, ql1.f34276b, 198, C7400yz.f38124d, 246, C7400yz.f38120b, 251, 249, 255, 214, 220, tk4.f35701h, tk4.f35702i, 165, 8359, 402, 225, ql1.f34286f, C7400yz.f38122c, 250, C7400yz.f38118a, 209, 170, 186, 191, 8976, 172, tk4.f35712s, 188, 161, 171, 187, 9617, 9618, 9619, 9474, 9508, 9569, 9570, 9558, 9557, 9571, 9553, 9559, 9565, 9564, 9563, 9488, 9492, 9524, 9516, 9500, 9472, 9532, 9566, 9567, 9562, 9556, 9577, 9574, 9568, 9552, 9580, 9575, 9576, 9572, 9573, 9561, 9560, 9554, 9555, 9579, 9578, 9496, 9484, 9608, 9604, 9612, 9616, 9600, 945, 223, 915, 960, 931, 963, 181, 964, 934, 920, 937, 948, 8734, 966, 949, 8745, 8801, tk4.f35709p, tk4.f35690M, tk4.f35689L, 8992, 8993, 247, tk4.f35687J, tk4.f35708o, 8729, tk4.f35711r, 8730, 8319, 178, 9632, tk4.f35699f});
        hashMap.put("CP437", simpleEncodingHolder);
        hashMap.put("Cp437", simpleEncodingHolder);
        hashMap.put("cp437", simpleEncodingHolder);
        hashMap.put("IBM437", simpleEncodingHolder);
        hashMap.put("ibm437", simpleEncodingHolder);
        SimpleEncodingHolder simpleEncodingHolder2 = new SimpleEncodingHolder(new char[]{199, 252, 233, 226, 228, 224, 229, ql1.f34279c, 234, ql1.f34282d, 232, ql1.f34289h, ql1.f34288g, ql1.f34284e, 196, 197, 201, ql1.f34276b, 198, C7400yz.f38124d, 246, C7400yz.f38120b, 251, 249, 255, 214, 220, 248, tk4.f35702i, 216, tk4.f35700g, 402, 225, ql1.f34286f, C7400yz.f38122c, 250, C7400yz.f38118a, 209, 170, 186, 191, tk4.f35707n, 172, tk4.f35712s, 188, 161, 171, 187, 9617, 9618, 9619, 9474, 9508, 193, 194, 192, tk4.f35704k, 9571, 9553, 9559, 9565, tk4.f35701h, 165, 9488, 9492, 9524, 9516, 9500, 9472, 9532, 227, 195, 9562, 9556, 9577, 9574, 9568, 9552, 9580, 164, ql1.f34290i, 208, 202, 203, 200, 305, 205, 206, 207, 9496, 9484, 9608, 9604, 166, 204, 9600, 211, 223, 212, 210, 245, 213, 181, 254, 222, 218, 219, 217, 253, 221, 175, 180, 173, tk4.f35709p, 8215, 190, tk4.f35710q, tk4.f35703j, 247, 184, tk4.f35708o, 168, tk4.f35711r, 185, 179, 178, 9632, tk4.f35699f});
        hashMap.put("CP850", simpleEncodingHolder2);
        hashMap.put("Cp850", simpleEncodingHolder2);
        hashMap.put("cp850", simpleEncodingHolder2);
        hashMap.put("IBM850", simpleEncodingHolder2);
        hashMap.put("ibm850", simpleEncodingHolder2);
        simpleEncodings = Collections.unmodifiableMap(hashMap);
    }

    public static void appendSurrogate(ByteBuffer byteBuffer, char c) {
        byteBuffer.put((byte) 37);
        byteBuffer.put((byte) 85);
        byte[] bArr = HEX_DIGITS;
        byteBuffer.put(bArr[(c >> 12) & 15]);
        byteBuffer.put(bArr[(c >> 8) & 15]);
        byteBuffer.put(bArr[(c >> 4) & 15]);
        byteBuffer.put(bArr[c & 15]);
    }

    public static ZipEncoding getZipEncoding(String str) {
        if (isUTF8(str)) {
            return UTF8_ZIP_ENCODING;
        }
        if (str == null) {
            return new FallbackZipEncoding();
        }
        SimpleEncodingHolder simpleEncodingHolder = simpleEncodings.get(str);
        if (simpleEncodingHolder != null) {
            return simpleEncodingHolder.getEncoding();
        }
        try {
            return new NioZipEncoding(Charset.forName(str));
        } catch (UnsupportedCharsetException unused) {
            return new FallbackZipEncoding(str);
        }
    }

    public static ByteBuffer growBuffer(ByteBuffer byteBuffer, int i) {
        byteBuffer.limit(byteBuffer.position());
        byteBuffer.rewind();
        int capacity = byteBuffer.capacity() * 2;
        if (capacity >= i) {
            i = capacity;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i);
        allocate.put(byteBuffer);
        return allocate;
    }

    public static boolean isUTF8(String str) {
        if (str == null) {
            str = Charset.defaultCharset().name();
        }
        Charset charset = Charsets.UTF_8;
        if (charset.name().equalsIgnoreCase(str)) {
            return true;
        }
        for (String equalsIgnoreCase : charset.aliases()) {
            if (equalsIgnoreCase.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
