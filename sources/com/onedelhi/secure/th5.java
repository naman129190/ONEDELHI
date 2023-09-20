package com.onedelhi.secure;

import android.os.Handler;
import com.google.android.gms.common.internal.Preconditions;

public abstract class th5 {

    /* renamed from: a */
    public static volatile Handler f20847a;

    /* renamed from: a */
    public volatile long f20848a;

    /* renamed from: a */
    public final kd6 f20849a;

    /* renamed from: a */
    public final Runnable f20850a;

    public th5(kd6 kd6) {
        Preconditions.checkNotNull(kd6);
        this.f20849a = kd6;
        this.f20850a = new lh5(this, kd6);
    }

    /* renamed from: b */
    public final void mo25025b() {
        this.f20848a = 0;
        mo25028f().removeCallbacks(this.f20850a);
    }

    /* renamed from: c */
    public abstract void mo17367c();

    /* renamed from: d */
    public final void mo25026d(long j) {
        mo25025b();
        if (j >= 0) {
            this.f20848a = this.f20849a.mo15133a().currentTimeMillis();
            if (!mo25028f().postDelayed(this.f20850a, j)) {
                this.f20849a.mo15136e().mo12726r().mo25380b("Failed to schedule delayed post. time", Long.valueOf(j));
            }
        }
    }

    /* renamed from: e */
    public final boolean mo25027e() {
        return this.f20848a != 0;
    }

    /* renamed from: f */
    public final Handler mo25028f() {
        Handler handler;
        if (f20847a != null) {
            return f20847a;
        }
        synchronized (th5.class) {
            if (f20847a == null) {
                f20847a = new gr5(this.f20849a.mo15137f().getMainLooper());
            }
            handler = f20847a;
        }
        return handler;
    }
}
