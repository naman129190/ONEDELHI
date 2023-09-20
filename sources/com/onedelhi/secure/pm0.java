package com.onedelhi.secure;

import android.util.Log;
import com.onedelhi.secure.im0;
import com.onedelhi.secure.mm0;
import java.io.File;
import java.io.IOException;

public class pm0 implements im0 {

    /* renamed from: a */
    public static final int f18604a = 1;

    /* renamed from: a */
    public static pm0 f18605a = null;

    /* renamed from: a */
    public static final String f18606a = "DiskLruCacheWrapper";

    /* renamed from: b */
    public static final int f18607b = 1;

    /* renamed from: a */
    public final long f18608a;

    /* renamed from: a */
    public final lm0 f18609a = new lm0();

    /* renamed from: a */
    public mm0 f18610a;

    /* renamed from: a */
    public final oq3 f18611a;

    /* renamed from: a */
    public final File f18612a;

    @Deprecated
    public pm0(File file, long j) {
        this.f18612a = file;
        this.f18608a = j;
        this.f18611a = new oq3();
    }

    /* renamed from: d */
    public static im0 m24815d(File file, long j) {
        return new pm0(file, j);
    }

    @Deprecated
    /* renamed from: e */
    public static synchronized im0 m24816e(File file, long j) {
        pm0 pm0;
        synchronized (pm0.class) {
            if (f18605a == null) {
                f18605a = new pm0(file, j);
            }
            pm0 = f18605a;
        }
        return pm0;
    }

    /* renamed from: a */
    public File mo17845a(ky1 ky1) {
        String b = this.f18611a.mo22055b(ky1);
        if (Log.isLoggable(f18606a, 2)) {
            Log.v(f18606a, "Get: Obtained: " + b + " for for Key: " + ky1);
        }
        try {
            mm0.C2869e c0 = mo22503f().mo20504c0(b);
            if (c0 != null) {
                return c0.mo20529b(0);
            }
            return null;
        } catch (IOException e) {
            if (!Log.isLoggable(f18606a, 5)) {
                return null;
            }
            Log.w(f18606a, "Unable to get from disk cache", e);
            return null;
        }
    }

    /* renamed from: b */
    public void mo17846b(ky1 ky1, im0.C2453b bVar) {
        mm0.C2867c X;
        String b = this.f18611a.mo22055b(ky1);
        this.f18609a.mo19711a(b);
        try {
            if (Log.isLoggable(f18606a, 2)) {
                Log.v(f18606a, "Put: Obtained: " + b + " for for Key: " + ky1);
            }
            try {
                mm0 f = mo22503f();
                if (f.mo20504c0(b) == null) {
                    X = f.mo20502X(b);
                    if (X != null) {
                        if (bVar.mo17850a(X.mo20519f(0))) {
                            X.mo20518e();
                        }
                        X.mo20517b();
                        this.f18609a.mo19712b(b);
                        return;
                    }
                    throw new IllegalStateException("Had two simultaneous puts for: " + b);
                }
            } catch (IOException e) {
                if (Log.isLoggable(f18606a, 5)) {
                    Log.w(f18606a, "Unable to put to disk cache", e);
                }
            } catch (Throwable th) {
                X.mo20517b();
                throw th;
            }
        } finally {
            this.f18609a.mo19712b(b);
        }
    }

    /* renamed from: c */
    public void mo17847c(ky1 ky1) {
        try {
            mo22503f().mo20496G0(this.f18611a.mo22055b(ky1));
        } catch (IOException e) {
            if (Log.isLoggable(f18606a, 5)) {
                Log.w(f18606a, "Unable to delete from disk cache", e);
            }
        }
    }

    public synchronized void clear() {
        try {
            mo22503f().mo20498K();
        } catch (IOException e) {
            try {
                if (Log.isLoggable(f18606a, 5)) {
                    Log.w(f18606a, "Unable to clear disk cache or disk cache cleared externally", e);
                }
            } catch (Throwable th) {
                mo22504g();
                throw th;
            }
        }
        mo22504g();
    }

    /* renamed from: f */
    public final synchronized mm0 mo22503f() throws IOException {
        if (this.f18610a == null) {
            this.f18610a = mm0.m21736p0(this.f18612a, 1, 1, this.f18608a);
        }
        return this.f18610a;
    }

    /* renamed from: g */
    public final synchronized void mo22504g() {
        this.f18610a = null;
    }
}
