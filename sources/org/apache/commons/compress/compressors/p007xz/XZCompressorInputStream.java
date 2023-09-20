package org.apache.commons.compress.compressors.p007xz;

import com.onedelhi.secure.cz4;
import com.onedelhi.secure.mz3;
import com.onedelhi.secure.zy4;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.compress.compressors.CompressorInputStream;

/* renamed from: org.apache.commons.compress.compressors.xz.XZCompressorInputStream */
public class XZCompressorInputStream extends CompressorInputStream {

    /* renamed from: in */
    private final InputStream f38892in;

    public XZCompressorInputStream(InputStream inputStream) throws IOException {
        this(inputStream, false);
    }

    public XZCompressorInputStream(InputStream inputStream, boolean z) throws IOException {
        this.f38892in = z ? new cz4(inputStream) : new mz3(inputStream);
    }

    public static boolean matches(byte[] bArr, int i) {
        if (i < zy4.f38504a.length) {
            return false;
        }
        int i2 = 0;
        while (true) {
            byte[] bArr2 = zy4.f38504a;
            if (i2 >= bArr2.length) {
                return true;
            }
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
            i2++;
        }
    }

    public int available() throws IOException {
        return this.f38892in.available();
    }

    public void close() throws IOException {
        this.f38892in.close();
    }

    public int read() throws IOException {
        int read = this.f38892in.read();
        int i = -1;
        if (read != -1) {
            i = 1;
        }
        count(i);
        return read;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int read = this.f38892in.read(bArr, i, i2);
        count(read);
        return read;
    }

    public long skip(long j) throws IOException {
        return this.f38892in.skip(j);
    }
}
