package com.onedelhi.secure;

import android.graphics.Path;

public class zw3 implements h70 {

    /* renamed from: a */
    public final Path.FillType f23923a;
    @ts2

    /* renamed from: a */
    public final C2398i6 f23924a;
    @ts2

    /* renamed from: a */
    public final C2695l6 f23925a;

    /* renamed from: a */
    public final String f23926a;

    /* renamed from: a */
    public final boolean f23927a;

    /* renamed from: b */
    public final boolean f23928b;

    public zw3(String str, boolean z, Path.FillType fillType, @ts2 C2398i6 i6Var, @ts2 C2695l6 l6Var, boolean z2) {
        this.f23926a = str;
        this.f23927a = z;
        this.f23923a = fillType;
        this.f23924a = i6Var;
        this.f23925a = l6Var;
        this.f23928b = z2;
    }

    /* renamed from: a */
    public y60 mo13850a(qa2 qa2, C2861mj mjVar) {
        return new e31(qa2, mjVar, this);
    }

    @ts2
    /* renamed from: b */
    public C2398i6 mo28152b() {
        return this.f23924a;
    }

    /* renamed from: c */
    public Path.FillType mo28153c() {
        return this.f23923a;
    }

    /* renamed from: d */
    public String mo28154d() {
        return this.f23926a;
    }

    @ts2
    /* renamed from: e */
    public C2695l6 mo28155e() {
        return this.f23925a;
    }

    /* renamed from: f */
    public boolean mo28156f() {
        return this.f23928b;
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f23927a + '}';
    }
}
