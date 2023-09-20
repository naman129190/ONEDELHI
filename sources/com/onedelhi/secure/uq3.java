package com.onedelhi.secure;

public class uq3 {

    /* renamed from: a */
    public static uq3 f36231a;

    /* renamed from: a */
    public w03 f36232a;

    /* renamed from: a */
    public boolean f36233a;

    /* renamed from: a */
    public static synchronized uq3 m67409a() {
        uq3 uq3;
        synchronized (uq3.class) {
            if (f36231a == null) {
                f36231a = new uq3();
            }
            uq3 = f36231a;
        }
        return uq3;
    }

    /* renamed from: b */
    public w03 mo45786b() {
        return this.f36232a;
    }

    /* renamed from: c */
    public boolean mo45787c() {
        return this.f36233a;
    }

    /* renamed from: d */
    public void mo45788d(w03 w03) {
        this.f36232a = w03;
    }

    /* renamed from: e */
    public void mo45789e(boolean z) {
        this.f36233a = z;
    }
}
