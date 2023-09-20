package org.apache.commons.compress.archivers.sevenz;

import com.onedelhi.secure.mx0;
import com.onedelhi.secure.o02;
import com.onedelhi.secure.p02;
import com.onedelhi.secure.r31;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

class LZMA2Decoder extends CoderBase {
    public LZMA2Decoder() {
        super(p02.class, Number.class);
    }

    private int getDictSize(Object obj) {
        return obj instanceof p02 ? ((p02) obj).mo42328k() : numberOptionOrDefault(obj);
    }

    private int getDictionarySize(Coder coder) throws IllegalArgumentException {
        byte b = coder.properties[0] & 255;
        if ((b & mx0.f16640e) != 0) {
            throw new IllegalArgumentException("Unsupported LZMA2 property bits");
        } else if (b > 40) {
            throw new IllegalArgumentException("Dictionary larger than 4GiB maximum size");
        } else if (b == 40) {
            return -1;
        } else {
            return ((b & 1) | 2) << ((b / 2) + 11);
        }
    }

    private p02 getOptions(Object obj) throws IOException {
        if (obj instanceof p02) {
            return (p02) obj;
        }
        p02 p02 = new p02();
        p02.mo42337t(numberOptionOrDefault(obj));
        return p02;
    }

    private int numberOptionOrDefault(Object obj) {
        return CoderBase.numberOptionOrDefault(obj, 8388608);
    }

    public InputStream decode(String str, InputStream inputStream, long j, Coder coder, byte[] bArr) throws IOException {
        try {
            return new o02(inputStream, getDictionarySize(coder));
        } catch (IllegalArgumentException e) {
            throw new IOException(e.getMessage());
        }
    }

    public OutputStream encode(OutputStream outputStream, Object obj) throws IOException {
        return getOptions(obj).mo37823h(new r31(outputStream));
    }

    public byte[] getOptionsAsProperties(Object obj) {
        int dictSize = getDictSize(obj);
        int numberOfLeadingZeros = Integer.numberOfLeadingZeros(dictSize);
        return new byte[]{(byte) (((19 - numberOfLeadingZeros) * 2) + ((dictSize >>> (30 - numberOfLeadingZeros)) - 2))};
    }

    public Object getOptionsFromCoder(Coder coder, InputStream inputStream) {
        return Integer.valueOf(getDictionarySize(coder));
    }
}
