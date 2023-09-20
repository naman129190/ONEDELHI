package com.onedelhi.secure;

public enum mu1 {
    VOID(Void.class, Void.class, (Class<?>) null),
    INT(r1, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.FALSE),
    STRING(String.class, String.class, ""),
    BYTE_STRING(C5173er.class, C5173er.class, C5173er.f28039a),
    ENUM(r1, Integer.class, (Class<?>) null),
    MESSAGE(Object.class, Object.class, (Class<?>) null);
    

    /* renamed from: a */
    public final Class<?> f32278a;

    /* renamed from: a */
    public final Object f32279a;

    /* renamed from: b */
    public final Class<?> f32280b;

    /* access modifiers changed from: public */
    mu1(Class<?> cls, Class<?> cls2, Object obj) {
        this.f32278a = cls;
        this.f32280b = cls2;
        this.f32279a = obj;
    }

    /* renamed from: a */
    public Class<?> mo40785a() {
        return this.f32280b;
    }

    /* renamed from: b */
    public Object mo40786b() {
        return this.f32279a;
    }

    /* renamed from: e */
    public Class<?> mo40787e() {
        return this.f32278a;
    }

    /* renamed from: g */
    public boolean mo40788g(Class<?> cls) {
        return this.f32278a.isAssignableFrom(cls);
    }
}
