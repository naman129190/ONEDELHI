package com.onedelhi.secure;

public final class m31 {

    /* renamed from: a */
    public final int f31987a;

    /* renamed from: a */
    public final int[] f31988a;

    /* renamed from: a */
    public final sl3[] f31989a;

    public m31(int i, int[] iArr, int i2, int i3, int i4) {
        this.f31987a = i;
        this.f31988a = iArr;
        float f = (float) i4;
        this.f31989a = new sl3[]{new sl3((float) i2, f), new sl3((float) i3, f)};
    }

    /* renamed from: a */
    public sl3[] mo40459a() {
        return this.f31989a;
    }

    /* renamed from: b */
    public int[] mo40460b() {
        return this.f31988a;
    }

    /* renamed from: c */
    public int mo40461c() {
        return this.f31987a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof m31) && this.f31987a == ((m31) obj).f31987a;
    }

    public int hashCode() {
        return this.f31987a;
    }
}
