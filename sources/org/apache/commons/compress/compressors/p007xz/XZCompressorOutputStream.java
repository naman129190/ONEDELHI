package org.apache.commons.compress.compressors.p007xz;

import com.onedelhi.secure.dz4;
import com.onedelhi.secure.i31;
import com.onedelhi.secure.p02;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.commons.compress.compressors.CompressorOutputStream;

/* renamed from: org.apache.commons.compress.compressors.xz.XZCompressorOutputStream */
public class XZCompressorOutputStream extends CompressorOutputStream {
    private final dz4 out;

    public XZCompressorOutputStream(OutputStream outputStream) throws IOException {
        this.out = new dz4(outputStream, (i31) new p02());
    }

    public XZCompressorOutputStream(OutputStream outputStream, int i) throws IOException {
        this.out = new dz4(outputStream, (i31) new p02(i));
    }

    public void close() throws IOException {
        this.out.close();
    }

    public void finish() throws IOException {
        this.out.mo31274a();
    }

    public void flush() throws IOException {
        this.out.flush();
    }

    public void write(int i) throws IOException {
        this.out.write(i);
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.out.write(bArr, i, i2);
    }
}
