package com.onedelhi.secure;

import java.util.Arrays;
import java.util.List;

public class bx3 implements h70 {

    /* renamed from: a */
    public final String f10007a;

    /* renamed from: a */
    public final List<h70> f10008a;

    /* renamed from: a */
    public final boolean f10009a;

    public bx3(String str, List<h70> list, boolean z) {
        this.f10007a = str;
        this.f10008a = list;
        this.f10009a = z;
    }

    /* renamed from: a */
    public y60 mo13850a(qa2 qa2, C2861mj mjVar) {
        return new z60(qa2, mjVar, this);
    }

    /* renamed from: b */
    public List<h70> mo13851b() {
        return this.f10008a;
    }

    /* renamed from: c */
    public String mo13852c() {
        return this.f10007a;
    }

    /* renamed from: d */
    public boolean mo13853d() {
        return this.f10009a;
    }

    public String toString() {
        return "ShapeGroup{name='" + this.f10007a + "' Shapes: " + Arrays.toString(this.f10008a.toArray()) + '}';
    }
}
