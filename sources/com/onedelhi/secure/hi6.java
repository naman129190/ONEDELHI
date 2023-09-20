package com.onedelhi.secure;

public final class hi6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ri6 f13121a;

    /* renamed from: a */
    public final /* synthetic */ ye5 f13122a;

    /* renamed from: b */
    public final /* synthetic */ long f13123b;

    /* renamed from: b */
    public final /* synthetic */ ye5 f13124b;

    /* renamed from: b */
    public final /* synthetic */ boolean f13125b;

    /* renamed from: c */
    public final /* synthetic */ long f13126c;

    /* renamed from: n */
    public final /* synthetic */ int f13127n;

    public hi6(ri6 ri6, ye5 ye5, long j, int i, long j2, boolean z, ye5 ye52) {
        this.f13121a = ri6;
        this.f13122a = ye5;
        this.f13123b = j;
        this.f13127n = i;
        this.f13126c = j2;
        this.f13125b = z;
        this.f13124b = ye52;
    }

    public final void run() {
        this.f13121a.mo23884J(this.f13122a);
        this.f13121a.mo23915z(this.f13123b, false);
        ri6.m26788d0(this.f13121a, this.f13122a, this.f13127n, this.f13126c, true, this.f13125b);
        xz6.m31807c();
        if (this.f13121a.f11205a.mo27891z().mo14110B((String) null, n36.f17072n0)) {
            ri6.m26787c0(this.f13121a, this.f13122a, this.f13124b);
        }
    }
}
