package com.onedelhi.secure;

import com.onedelhi.secure.hl3;

@hl3({hl3.C2354a.LIBRARY})
public class sn0 {

    /* renamed from: a */
    public final float f20449a;

    /* renamed from: a */
    public final int f20450a;

    /* renamed from: a */
    public final C3528a f20451a;

    /* renamed from: a */
    public final String f20452a;

    /* renamed from: a */
    public final boolean f20453a;

    /* renamed from: b */
    public final float f20454b;
    @d10

    /* renamed from: b */
    public final int f20455b;

    /* renamed from: b */
    public final String f20456b;

    /* renamed from: c */
    public final float f20457c;
    @d10

    /* renamed from: c */
    public final int f20458c;

    /* renamed from: d */
    public final float f20459d;

    /* renamed from: com.onedelhi.secure.sn0$a */
    public enum C3528a {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public sn0(String str, String str2, float f, C3528a aVar, int i, float f2, float f3, @d10 int i2, @d10 int i3, float f4, boolean z) {
        this.f20452a = str;
        this.f20456b = str2;
        this.f20449a = f;
        this.f20451a = aVar;
        this.f20450a = i;
        this.f20454b = f2;
        this.f20457c = f3;
        this.f20455b = i2;
        this.f20458c = i3;
        this.f20459d = f4;
        this.f20453a = z;
    }

    public int hashCode() {
        int hashCode = (((((int) (((float) (((this.f20452a.hashCode() * 31) + this.f20456b.hashCode()) * 31)) + this.f20449a)) * 31) + this.f20451a.ordinal()) * 31) + this.f20450a;
        long floatToRawIntBits = (long) Float.floatToRawIntBits(this.f20454b);
        return (((hashCode * 31) + ((int) (floatToRawIntBits ^ (floatToRawIntBits >>> 32)))) * 31) + this.f20455b;
    }
}
