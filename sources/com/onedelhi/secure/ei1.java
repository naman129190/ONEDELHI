package com.onedelhi.secure;

public class ei1 {

    /* renamed from: a */
    public final float[] f11234a;

    /* renamed from: a */
    public final int[] f11235a;

    public ei1(float[] fArr, int[] iArr) {
        this.f11234a = fArr;
        this.f11235a = iArr;
    }

    /* renamed from: a */
    public int[] mo15190a() {
        return this.f11235a;
    }

    /* renamed from: b */
    public float[] mo15191b() {
        return this.f11234a;
    }

    /* renamed from: c */
    public int mo15192c() {
        return this.f11235a.length;
    }

    /* renamed from: d */
    public void mo15193d(ei1 ei1, ei1 ei12, float f) {
        if (ei1.f11235a.length == ei12.f11235a.length) {
            for (int i = 0; i < ei1.f11235a.length; i++) {
                this.f11234a[i] = hj2.m16795j(ei1.f11234a[i], ei12.f11234a[i], f);
                this.f11235a[i] = od1.m23678c(f, ei1.f11235a[i], ei12.f11235a[i]);
            }
            return;
        }
        throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + ei1.f11235a.length + " vs " + ei12.f11235a.length + pl2.f33727d);
    }
}
