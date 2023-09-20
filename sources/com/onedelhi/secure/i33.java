package com.onedelhi.secure;

import android.graphics.PointF;

public class i33 implements h70 {

    /* renamed from: a */
    public final C2396a f13456a;

    /* renamed from: a */
    public final C2475j6 f13457a;

    /* renamed from: a */
    public final C3900x6<PointF, PointF> f13458a;

    /* renamed from: a */
    public final String f13459a;

    /* renamed from: a */
    public final boolean f13460a;

    /* renamed from: b */
    public final C2475j6 f13461b;

    /* renamed from: c */
    public final C2475j6 f13462c;

    /* renamed from: d */
    public final C2475j6 f13463d;

    /* renamed from: e */
    public final C2475j6 f13464e;

    /* renamed from: f */
    public final C2475j6 f13465f;

    /* renamed from: com.onedelhi.secure.i33$a */
    public enum C2396a {
        STAR(1),
        POLYGON(2);
        

        /* renamed from: n */
        public final int f13469n;

        /* access modifiers changed from: public */
        C2396a(int i) {
            this.f13469n = i;
        }

        /* renamed from: a */
        public static C2396a m17146a(int i) {
            for (C2396a aVar : values()) {
                if (aVar.f13469n == i) {
                    return aVar;
                }
            }
            return null;
        }
    }

    public i33(String str, C2396a aVar, C2475j6 j6Var, C3900x6<PointF, PointF> x6Var, C2475j6 j6Var2, C2475j6 j6Var3, C2475j6 j6Var4, C2475j6 j6Var5, C2475j6 j6Var6, boolean z) {
        this.f13459a = str;
        this.f13456a = aVar;
        this.f13457a = j6Var;
        this.f13458a = x6Var;
        this.f13461b = j6Var2;
        this.f13462c = j6Var3;
        this.f13463d = j6Var4;
        this.f13464e = j6Var5;
        this.f13465f = j6Var6;
        this.f13460a = z;
    }

    /* renamed from: a */
    public y60 mo13850a(qa2 qa2, C2861mj mjVar) {
        return new h33(qa2, mjVar, this);
    }

    /* renamed from: b */
    public C2475j6 mo17524b() {
        return this.f13462c;
    }

    /* renamed from: c */
    public C2475j6 mo17525c() {
        return this.f13464e;
    }

    /* renamed from: d */
    public String mo17526d() {
        return this.f13459a;
    }

    /* renamed from: e */
    public C2475j6 mo17527e() {
        return this.f13463d;
    }

    /* renamed from: f */
    public C2475j6 mo17528f() {
        return this.f13465f;
    }

    /* renamed from: g */
    public C2475j6 mo17529g() {
        return this.f13457a;
    }

    /* renamed from: h */
    public C3900x6<PointF, PointF> mo17530h() {
        return this.f13458a;
    }

    /* renamed from: i */
    public C2475j6 mo17531i() {
        return this.f13461b;
    }

    /* renamed from: j */
    public C2396a mo17532j() {
        return this.f13456a;
    }

    /* renamed from: k */
    public boolean mo17533k() {
        return this.f13460a;
    }
}
