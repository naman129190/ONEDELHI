package com.onedelhi.secure;

import android.graphics.PointF;

public class sg3 implements h70 {

    /* renamed from: a */
    public final C2475j6 f20363a;

    /* renamed from: a */
    public final C3030o6 f20364a;

    /* renamed from: a */
    public final C3900x6<PointF, PointF> f20365a;

    /* renamed from: a */
    public final String f20366a;

    /* renamed from: a */
    public final boolean f20367a;

    public sg3(String str, C3900x6<PointF, PointF> x6Var, C3030o6 o6Var, C2475j6 j6Var, boolean z) {
        this.f20366a = str;
        this.f20365a = x6Var;
        this.f20364a = o6Var;
        this.f20363a = j6Var;
        this.f20367a = z;
    }

    /* renamed from: a */
    public y60 mo13850a(qa2 qa2, C2861mj mjVar) {
        return new rg3(qa2, mjVar, this);
    }

    /* renamed from: b */
    public C2475j6 mo24368b() {
        return this.f20363a;
    }

    /* renamed from: c */
    public String mo24369c() {
        return this.f20366a;
    }

    /* renamed from: d */
    public C3900x6<PointF, PointF> mo24370d() {
        return this.f20365a;
    }

    /* renamed from: e */
    public C3030o6 mo24371e() {
        return this.f20364a;
    }

    /* renamed from: f */
    public boolean mo24372f() {
        return this.f20367a;
    }

    public String toString() {
        return "RectangleShape{position=" + this.f20365a + ", size=" + this.f20364a + '}';
    }
}
