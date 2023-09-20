package com.onedelhi.secure;

import com.onedelhi.secure.hl3;
import java.util.List;

@hl3({hl3.C2354a.LIBRARY})
public class p91 {

    /* renamed from: a */
    public final char f18412a;

    /* renamed from: a */
    public final double f18413a;

    /* renamed from: a */
    public final String f18414a;

    /* renamed from: a */
    public final List<bx3> f18415a;

    /* renamed from: b */
    public final double f18416b;

    /* renamed from: b */
    public final String f18417b;

    public p91(List<bx3> list, char c, double d, double d2, String str, String str2) {
        this.f18415a = list;
        this.f18412a = c;
        this.f18413a = d;
        this.f18416b = d2;
        this.f18414a = str;
        this.f18417b = str2;
    }

    /* renamed from: e */
    public static int m24535e(char c, String str, String str2) {
        return ((((0 + c) * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    /* renamed from: a */
    public List<bx3> mo22359a() {
        return this.f18415a;
    }

    /* renamed from: b */
    public double mo22360b() {
        return this.f18413a;
    }

    /* renamed from: c */
    public String mo22361c() {
        return this.f18414a;
    }

    /* renamed from: d */
    public double mo22362d() {
        return this.f18416b;
    }

    public int hashCode() {
        return m24535e(this.f18412a, this.f18417b, this.f18414a);
    }
}
