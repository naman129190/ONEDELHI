package org.apache.commons.compress.archivers.sevenz;

import com.onedelhi.secure.nj0;
import com.onedelhi.secure.no4;
import com.onedelhi.secure.r31;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

class DeltaDecoder extends CoderBase {
    public DeltaDecoder() {
        super(Number.class);
    }

    private int getOptionsFromCoder(Coder coder) {
        byte[] bArr = coder.properties;
        if (bArr == null || bArr.length == 0) {
            return 1;
        }
        return (bArr[0] & 255) + 1;
    }

    public InputStream decode(String str, InputStream inputStream, long j, Coder coder, byte[] bArr) throws IOException {
        return new nj0(getOptionsFromCoder(coder)).mo37821f(inputStream);
    }

    public OutputStream encode(OutputStream outputStream, Object obj) throws IOException {
        try {
            return new nj0(CoderBase.numberOptionOrDefault(obj, 1)).mo37823h(new r31(outputStream));
        } catch (no4 e) {
            throw new IOException(e.getMessage());
        }
    }

    public byte[] getOptionsAsProperties(Object obj) {
        return new byte[]{(byte) (CoderBase.numberOptionOrDefault(obj, 1) - 1)};
    }

    public Object getOptionsFromCoder(Coder coder, InputStream inputStream) {
        return Integer.valueOf(getOptionsFromCoder(coder));
    }
}
