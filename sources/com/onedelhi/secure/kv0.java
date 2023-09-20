package com.onedelhi.secure;

public enum kv0 {
    L(1),
    M(0),
    Q(3),
    H(2);
    

    /* renamed from: a */
    public static final kv0[] f31444a = null;

    /* renamed from: n */
    public final int f31449n;

    /* access modifiers changed from: public */
    static {
        kv0 kv0;
        kv0 kv02;
        kv0 kv03;
        kv0 kv04;
        f31444a = new kv0[]{kv02, kv0, kv04, kv03};
    }

    /* access modifiers changed from: public */
    kv0(int i) {
        this.f31449n = i;
    }

    /* renamed from: a */
    public static kv0 m55028a(int i) {
        if (i >= 0) {
            kv0[] kv0Arr = f31444a;
            if (i < kv0Arr.length) {
                return kv0Arr[i];
            }
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: b */
    public int mo39519b() {
        return this.f31449n;
    }
}
