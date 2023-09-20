package com.onedelhi.secure;

import com.google.android.gms.common.internal.Preconditions;

public final class ri5 {

    /* renamed from: a */
    public final long f19874a;

    /* renamed from: a */
    public final Boolean f19875a;

    /* renamed from: a */
    public final Long f19876a;

    /* renamed from: a */
    public final String f19877a;

    /* renamed from: b */
    public final long f19878b;

    /* renamed from: b */
    public final Long f19879b;

    /* renamed from: b */
    public final String f19880b;

    /* renamed from: c */
    public final long f19881c;

    /* renamed from: c */
    public final Long f19882c;

    /* renamed from: d */
    public final long f19883d;

    /* renamed from: e */
    public final long f19884e;

    public ri5(String str, String str2, long j, long j2, long j3, long j4, long j5, Long l, Long l2, Long l3, Boolean bool) {
        long j6 = j;
        long j7 = j2;
        long j8 = j3;
        long j9 = j5;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        boolean z = true;
        Preconditions.checkArgument(j6 >= 0);
        Preconditions.checkArgument(j7 >= 0);
        Preconditions.checkArgument(j8 >= 0);
        Preconditions.checkArgument(j9 < 0 ? false : z);
        this.f19877a = str;
        this.f19880b = str2;
        this.f19874a = j6;
        this.f19878b = j7;
        this.f19881c = j8;
        this.f19883d = j4;
        this.f19884e = j9;
        this.f19876a = l;
        this.f19879b = l2;
        this.f19882c = l3;
        this.f19875a = bool;
    }

    /* renamed from: a */
    public final ri5 mo23872a(Long l, Long l2, Boolean bool) {
        if (bool != null) {
            bool.booleanValue();
        }
        return new ri5(this.f19877a, this.f19880b, this.f19874a, this.f19878b, this.f19881c, this.f19883d, this.f19884e, this.f19876a, l, l2, bool);
    }

    /* renamed from: b */
    public final ri5 mo23873b(long j, long j2) {
        return new ri5(this.f19877a, this.f19880b, this.f19874a, this.f19878b, this.f19881c, this.f19883d, j, Long.valueOf(j2), this.f19879b, this.f19882c, this.f19875a);
    }

    /* renamed from: c */
    public final ri5 mo23874c(long j) {
        return new ri5(this.f19877a, this.f19880b, this.f19874a, this.f19878b, this.f19881c, j, this.f19884e, this.f19876a, this.f19879b, this.f19882c, this.f19875a);
    }
}
