package com.onedelhi.secure;

import java.util.Random;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007\u001a\f\u0010\u0003\u001a\u00020\u0000*\u00020\u0001H\u0007\u001a\t\u0010\u0004\u001a\u00020\u0000H\b\u001a\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0000¨\u0006\n"}, d2 = {"Lcom/onedelhi/secure/me3;", "Ljava/util/Random;", "a", "b", "c", "", "hi26", "low27", "", "d", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1})
public final class q23 {
    @gz3(version = "1.3")
    @vr2
    /* renamed from: a */
    public static final Random m62000a(@vr2 me3 me3) {
        Random r;
        jt1.m53777p(me3, "<this>");
        C5206f1 f1Var = me3 instanceof C5206f1 ? (C5206f1) me3 : null;
        return (f1Var == null || (r = f1Var.mo35706r()) == null) ? new d02(me3) : r;
    }

    @gz3(version = "1.3")
    @vr2
    /* renamed from: b */
    public static final me3 m62001b(@vr2 Random random) {
        me3 a;
        jt1.m53777p(random, "<this>");
        d02 d02 = random instanceof d02 ? (d02) random : null;
        return (d02 == null || (a = d02.mo34041a()) == null) ? new p23(random) : a;
    }

    @xq1
    /* renamed from: c */
    public static final me3 m62002c() {
        return o23.f32878a.mo38244b();
    }

    /* renamed from: d */
    public static final double m62003d(int i, int i2) {
        return ((double) ((((long) i) << 27) + ((long) i2))) / 9.007199254740992E15d;
    }
}
