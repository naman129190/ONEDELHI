package com.onedelhi.secure;

public enum zf6 {
    DOUBLE(cg6.DOUBLE, 1),
    FLOAT(cg6.FLOAT, 5),
    INT64(r5, 0),
    UINT64(r5, 0),
    INT32(r11, 0),
    FIXED64(r5, 1),
    FIXED32(r11, 5),
    BOOL(cg6.BOOLEAN, 0),
    STRING(cg6.STRING, 2),
    GROUP(r13, 3),
    MESSAGE(r13, 2),
    BYTES(cg6.BYTE_STRING, 2),
    UINT32(r11, 0),
    ENUM(cg6.ENUM, 0),
    SFIXED32(r11, 5),
    SFIXED64(r5, 1),
    SINT32(r11, 0),
    SINT64(r5, 0);
    

    /* renamed from: a */
    public final cg6 f23630a;

    /* access modifiers changed from: public */
    zf6(cg6 cg6, int i) {
        this.f23630a = cg6;
    }

    /* renamed from: a */
    public final cg6 mo27964a() {
        return this.f23630a;
    }
}
