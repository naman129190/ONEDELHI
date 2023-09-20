package com.onedelhi.secure;

public final class ji6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ri6 f14188a;

    /* renamed from: a */
    public final /* synthetic */ ye5 f14189a;

    /* renamed from: b */
    public final /* synthetic */ long f14190b;

    /* renamed from: b */
    public final /* synthetic */ ye5 f14191b;

    /* renamed from: b */
    public final /* synthetic */ boolean f14192b;

    /* renamed from: n */
    public final /* synthetic */ int f14193n;

    public ji6(ri6 ri6, ye5 ye5, int i, long j, boolean z, ye5 ye52) {
        this.f14188a = ri6;
        this.f14189a = ye5;
        this.f14193n = i;
        this.f14190b = j;
        this.f14192b = z;
        this.f14191b = ye52;
    }

    public final void run() {
        this.f14188a.mo23884J(this.f14189a);
        ri6.m26788d0(this.f14188a, this.f14189a, this.f14193n, this.f14190b, false, this.f14192b);
        xz6.m31807c();
        if (this.f14188a.f11205a.mo27891z().mo14110B((String) null, n36.f17072n0)) {
            ri6.m26787c0(this.f14188a, this.f14189a, this.f14191b);
        }
    }
}
