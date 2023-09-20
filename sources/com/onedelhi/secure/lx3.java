package com.onedelhi.secure;

public class lx3 implements h70 {

    /* renamed from: a */
    public final C2475j6 f15649a;

    /* renamed from: a */
    public final C2789a f15650a;

    /* renamed from: a */
    public final String f15651a;

    /* renamed from: a */
    public final boolean f15652a;

    /* renamed from: b */
    public final C2475j6 f15653b;

    /* renamed from: c */
    public final C2475j6 f15654c;

    /* renamed from: com.onedelhi.secure.lx3$a */
    public enum C2789a {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        /* renamed from: a */
        public static C2789a m21043a(int i) {
            if (i == 1) {
                return SIMULTANEOUSLY;
            }
            if (i == 2) {
                return INDIVIDUALLY;
            }
            throw new IllegalArgumentException("Unknown trim path type " + i);
        }
    }

    public lx3(String str, C2789a aVar, C2475j6 j6Var, C2475j6 j6Var2, C2475j6 j6Var3, boolean z) {
        this.f15651a = str;
        this.f15650a = aVar;
        this.f15649a = j6Var;
        this.f15653b = j6Var2;
        this.f15654c = j6Var3;
        this.f15652a = z;
    }

    /* renamed from: a */
    public y60 mo13850a(qa2 qa2, C2861mj mjVar) {
        return new ti4(mjVar, this);
    }

    /* renamed from: b */
    public C2475j6 mo19928b() {
        return this.f15653b;
    }

    /* renamed from: c */
    public String mo19929c() {
        return this.f15651a;
    }

    /* renamed from: d */
    public C2475j6 mo19930d() {
        return this.f15654c;
    }

    /* renamed from: e */
    public C2475j6 mo19931e() {
        return this.f15649a;
    }

    /* renamed from: f */
    public C2789a mo19932f() {
        return this.f15650a;
    }

    /* renamed from: g */
    public boolean mo19933g() {
        return this.f15652a;
    }

    public String toString() {
        return "Trim Path: {start: " + this.f15649a + ", end: " + this.f15653b + ", offset: " + this.f15654c + "}";
    }
}
