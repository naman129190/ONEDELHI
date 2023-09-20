package com.onedelhi.secure;

import java.io.IOException;
import java.io.InputStream;

public abstract class us3 extends InputStream {
    /* renamed from: a */
    public abstract long mo45288a() throws IOException;

    /* renamed from: b */
    public abstract long mo45289b() throws IOException;

    /* renamed from: c */
    public abstract void mo45290c(long j) throws IOException;

    public long skip(long j) throws IOException {
        if (j <= 0) {
            return 0;
        }
        long a = mo45288a();
        long b = mo45289b();
        if (b >= a) {
            return 0;
        }
        long j2 = a - b;
        if (j2 < j) {
            j = j2;
        }
        mo45290c(b + j);
        return j;
    }
}
