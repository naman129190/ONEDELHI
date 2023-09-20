package com.onedelhi.secure;

public enum fj0 {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);
    

    /* renamed from: n */
    public final int f28517n;

    /* access modifiers changed from: public */
    fj0(int i) {
        this.f28517n = i;
    }

    /* renamed from: a */
    public static fj0 m47925a(String str) {
        return str != null ? APP_STORE : DEVELOPER;
    }

    /* renamed from: b */
    public int mo35993b() {
        return this.f28517n;
    }

    public String toString() {
        return Integer.toString(this.f28517n);
    }
}
