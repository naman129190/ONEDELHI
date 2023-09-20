package com.onedelhi.secure;

public enum fr6 {
    VOID(Void.class, Void.class, (Class) null),
    INT(r1, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.FALSE),
    STRING(String.class, String.class, ""),
    BYTE_STRING(on6.class, on6.class, on6.f18031a),
    ENUM(r1, Integer.class, (Class) null),
    MESSAGE(Object.class, Object.class, (Class) null);
    

    /* renamed from: a */
    public final Class f12301a;

    /* renamed from: a */
    public final Object f12302a;

    /* renamed from: b */
    public final Class f12303b;

    /* access modifiers changed from: public */
    fr6(Class cls, Class cls2, Object obj) {
        this.f12301a = cls;
        this.f12303b = cls2;
        this.f12302a = obj;
    }

    /* renamed from: a */
    public final Class mo16148a() {
        return this.f12303b;
    }
}
