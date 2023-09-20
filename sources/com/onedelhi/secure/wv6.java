package com.onedelhi.secure;

public enum wv6 {
    DOUBLE(xv6.DOUBLE, 1),
    FLOAT(xv6.FLOAT, 5),
    INT64(r5, 0),
    UINT64(r5, 0),
    INT32(r11, 0),
    FIXED64(r5, 1),
    FIXED32(r11, 5),
    BOOL(xv6.BOOLEAN, 0),
    STRING(xv6.STRING, 2),
    GROUP(r13, 3),
    MESSAGE(r13, 2),
    BYTES(xv6.BYTE_STRING, 2),
    UINT32(r11, 0),
    ENUM(xv6.ENUM, 0),
    SFIXED32(r11, 5),
    SFIXED64(r5, 1),
    SINT32(r11, 0),
    SINT64(r5, 0);
    

    /* renamed from: a */
    public final xv6 f22348a;

    /* access modifiers changed from: public */
    wv6(xv6 xv6, int i) {
        this.f22348a = xv6;
    }

    /* renamed from: a */
    public final xv6 mo26709a() {
        return this.f22348a;
    }
}
