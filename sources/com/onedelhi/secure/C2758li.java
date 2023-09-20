package com.onedelhi.secure;

import com.google.auto.value.AutoValue;

@AutoValue
/* renamed from: com.onedelhi.secure.li */
public abstract class C2758li {

    /* renamed from: com.onedelhi.secure.li$a */
    public enum C2759a {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR,
        INVALID_PAYLOAD
    }

    /* renamed from: a */
    public static C2758li m20708a() {
        return new C3413rf(C2759a.FATAL_ERROR, -1);
    }

    /* renamed from: d */
    public static C2758li m20709d() {
        return new C3413rf(C2759a.INVALID_PAYLOAD, -1);
    }

    /* renamed from: e */
    public static C2758li m20710e(long j) {
        return new C3413rf(C2759a.OK, j);
    }

    /* renamed from: f */
    public static C2758li m20711f() {
        return new C3413rf(C2759a.TRANSIENT_ERROR, -1);
    }

    /* renamed from: b */
    public abstract long mo19616b();

    /* renamed from: c */
    public abstract C2759a mo19617c();
}
