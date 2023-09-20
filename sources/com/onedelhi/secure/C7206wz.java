package com.onedelhi.secure;

import com.onedelhi.secure.vs1;

/* renamed from: com.onedelhi.secure.wz */
public enum C7206wz implements vs1.C7081c {
    OK(0),
    CANCELLED(1),
    UNKNOWN(2),
    INVALID_ARGUMENT(3),
    DEADLINE_EXCEEDED(4),
    NOT_FOUND(5),
    ALREADY_EXISTS(6),
    PERMISSION_DENIED(7),
    UNAUTHENTICATED(16),
    RESOURCE_EXHAUSTED(8),
    FAILED_PRECONDITION(9),
    ABORTED(10),
    OUT_OF_RANGE(11),
    UNIMPLEMENTED(12),
    INTERNAL(13),
    UNAVAILABLE(14),
    DATA_LOSS(15),
    UNRECOGNIZED(-1);
    

    /* renamed from: A */
    public static final int f37220A = 11;

    /* renamed from: B */
    public static final int f37221B = 12;

    /* renamed from: C */
    public static final int f37222C = 13;

    /* renamed from: D */
    public static final int f37223D = 14;

    /* renamed from: E */
    public static final int f37224E = 15;

    /* renamed from: a */
    public static final vs1.C7082d<C7206wz> f37225a = null;

    /* renamed from: o */
    public static final int f37241o = 0;

    /* renamed from: p */
    public static final int f37243p = 1;

    /* renamed from: q */
    public static final int f37245q = 2;

    /* renamed from: r */
    public static final int f37247r = 3;

    /* renamed from: s */
    public static final int f37249s = 4;

    /* renamed from: t */
    public static final int f37250t = 5;

    /* renamed from: u */
    public static final int f37251u = 6;

    /* renamed from: v */
    public static final int f37252v = 7;

    /* renamed from: w */
    public static final int f37253w = 16;

    /* renamed from: x */
    public static final int f37254x = 8;

    /* renamed from: y */
    public static final int f37255y = 9;

    /* renamed from: z */
    public static final int f37256z = 10;

    /* renamed from: n */
    public final int f37257n;

    /* renamed from: com.onedelhi.secure.wz$a */
    public class C7207a implements vs1.C7082d<C7206wz> {
        /* renamed from: b */
        public C7206wz mo32393a(int i) {
            return C7206wz.m69720a(i);
        }
    }

    /* renamed from: com.onedelhi.secure.wz$b */
    public static final class C7208b implements vs1.C7083e {

        /* renamed from: a */
        public static final vs1.C7083e f37258a = null;

        static {
            f37258a = new C7208b();
        }

        /* renamed from: a */
        public boolean mo32395a(int i) {
            return C7206wz.m69720a(i) != null;
        }
    }

    /* access modifiers changed from: public */
    static {
        f37225a = new C7207a();
    }

    /* access modifiers changed from: public */
    C7206wz(int i) {
        this.f37257n = i;
    }

    /* renamed from: a */
    public static C7206wz m69720a(int i) {
        switch (i) {
            case 0:
                return OK;
            case 1:
                return CANCELLED;
            case 2:
                return UNKNOWN;
            case 3:
                return INVALID_ARGUMENT;
            case 4:
                return DEADLINE_EXCEEDED;
            case 5:
                return NOT_FOUND;
            case 6:
                return ALREADY_EXISTS;
            case 7:
                return PERMISSION_DENIED;
            case 8:
                return RESOURCE_EXHAUSTED;
            case 9:
                return FAILED_PRECONDITION;
            case 10:
                return ABORTED;
            case 11:
                return OUT_OF_RANGE;
            case 12:
                return UNIMPLEMENTED;
            case 13:
                return INTERNAL;
            case 14:
                return UNAVAILABLE;
            case 15:
                return DATA_LOSS;
            case 16:
                return UNAUTHENTICATED;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static vs1.C7082d<C7206wz> m69721b() {
        return f37225a;
    }

    /* renamed from: e */
    public static vs1.C7083e m69722e() {
        return C7208b.f37258a;
    }

    @Deprecated
    /* renamed from: g */
    public static C7206wz m69723g(int i) {
        return m69720a(i);
    }

    /* renamed from: j */
    public final int mo32392j() {
        if (this != UNRECOGNIZED) {
            return this.f37257n;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
