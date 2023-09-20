package com.onedelhi.secure;

public final class uq2 {

    /* renamed from: a */
    public static final sq2 f36229a = m67408c();

    /* renamed from: b */
    public static final sq2 f36230b = new tq2();

    /* renamed from: a */
    public static sq2 m67406a() {
        return f36229a;
    }

    /* renamed from: b */
    public static sq2 m67407b() {
        return f36230b;
    }

    /* renamed from: c */
    public static sq2 m67408c() {
        try {
            return (sq2) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
