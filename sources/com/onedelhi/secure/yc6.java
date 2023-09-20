package com.onedelhi.secure;

public final class yc6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ bd6 f22976a;

    /* renamed from: b */
    public final /* synthetic */ long f22977b;

    /* renamed from: b */
    public final /* synthetic */ String f22978b;

    /* renamed from: c */
    public final /* synthetic */ String f22979c;

    /* renamed from: d */
    public final /* synthetic */ String f22980d;

    public yc6(bd6 bd6, String str, String str2, String str3, long j) {
        this.f22976a = bd6;
        this.f22978b = str;
        this.f22979c = str2;
        this.f22980d = str3;
        this.f22977b = j;
    }

    public final void run() {
        String str = this.f22978b;
        if (str == null) {
            this.f22976a.f9796a.mo23400w(this.f22979c, (fj6) null);
            return;
        }
        this.f22976a.f9796a.mo23400w(this.f22979c, new fj6(this.f22980d, str, this.f22977b));
    }
}
