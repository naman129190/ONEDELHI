package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/onedelhi/secure/i60;", "", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public final class i60 {
    @rw1

    /* renamed from: a */
    public static final double f30081a = Math.log(2.0d);
    @vr2

    /* renamed from: a */
    public static final i60 f30082a = new i60();
    @rw1

    /* renamed from: b */
    public static final double f30083b;
    @rw1

    /* renamed from: c */
    public static final double f30084c;
    @rw1

    /* renamed from: d */
    public static final double f30085d;
    @rw1

    /* renamed from: e */
    public static final double f30086e;
    @rw1

    /* renamed from: f */
    public static final double f30087f;

    static {
        double ulp = Math.ulp(1.0d);
        f30083b = ulp;
        double sqrt = Math.sqrt(ulp);
        f30084c = sqrt;
        double sqrt2 = Math.sqrt(sqrt);
        f30085d = sqrt2;
        double d = (double) 1;
        f30086e = d / sqrt;
        f30087f = d / sqrt2;
    }
}
