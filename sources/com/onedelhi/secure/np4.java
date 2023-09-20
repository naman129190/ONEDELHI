package com.onedelhi.secure;

import com.google.android.gms.common.internal.Preconditions;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public abstract class np4 implements od4 {

    /* renamed from: a */
    public final int f17526a;

    /* renamed from: b */
    public final int f17527b;

    public np4(int i, int i2) {
        this.f17526a = i;
        this.f17527b = i2;
    }

    /* JADX INFO: finally extract failed */
    @ts2
    /* renamed from: a */
    public final kd4 mo14091a(int i, int i2, int i3) {
        URL b = mo21416b(i, i2, i3);
        if (b == null) {
            return od4.f17919a;
        }
        try {
            x56.m31295b(4352);
            int i4 = this.f17526a;
            int i5 = this.f17527b;
            InputStream inputStream = b.openConnection().getInputStream();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Preconditions.checkNotNull(inputStream, "from must not be null.");
            Preconditions.checkNotNull(byteArrayOutputStream, "to must not be null.");
            byte[] bArr = new byte[4096];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    kd4 kd4 = new kd4(i4, i5, byteArrayOutputStream.toByteArray());
                    x56.m31294a();
                    return kd4;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (IOException unused) {
            x56.m31294a();
            return null;
        } catch (Throwable th) {
            x56.m31294a();
            throw th;
        }
    }

    @ts2
    /* renamed from: b */
    public abstract URL mo21416b(int i, int i2, int i3);
}
