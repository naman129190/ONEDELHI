package com.onedelhi.secure;

public class sl3 {

    /* renamed from: a */
    public final float f35138a;

    /* renamed from: b */
    public final float f35139b;

    public sl3(float f, float f2) {
        this.f35138a = f;
        this.f35139b = f2;
    }

    /* renamed from: a */
    public static float m64699a(sl3 sl3, sl3 sl32, sl3 sl33) {
        float f = sl32.f35138a;
        float f2 = sl32.f35139b;
        return ((sl33.f35138a - f) * (sl3.f35139b - f2)) - ((sl33.f35139b - f2) * (sl3.f35138a - f));
    }

    /* renamed from: b */
    public static float m64700b(sl3 sl3, sl3 sl32) {
        return qf2.m62731a(sl3.f35138a, sl3.f35139b, sl32.f35138a, sl32.f35139b);
    }

    /* renamed from: e */
    public static void m64701e(sl3[] sl3Arr) {
        sl3 sl3;
        sl3 sl32;
        sl3 sl33;
        float b = m64700b(sl3Arr[0], sl3Arr[1]);
        float b2 = m64700b(sl3Arr[1], sl3Arr[2]);
        float b3 = m64700b(sl3Arr[0], sl3Arr[2]);
        if (b2 >= b && b2 >= b3) {
            sl33 = sl3Arr[0];
            sl32 = sl3Arr[1];
            sl3 = sl3Arr[2];
        } else if (b3 < b2 || b3 < b) {
            sl33 = sl3Arr[2];
            sl32 = sl3Arr[0];
            sl3 = sl3Arr[1];
        } else {
            sl33 = sl3Arr[1];
            sl32 = sl3Arr[0];
            sl3 = sl3Arr[2];
        }
        if (m64699a(sl32, sl33, sl3) < 0.0f) {
            sl3 sl34 = sl3;
            sl3 = sl32;
            sl32 = sl34;
        }
        sl3Arr[0] = sl32;
        sl3Arr[1] = sl33;
        sl3Arr[2] = sl3;
    }

    /* renamed from: c */
    public final float mo44403c() {
        return this.f35138a;
    }

    /* renamed from: d */
    public final float mo44404d() {
        return this.f35139b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof sl3) {
            sl3 sl3 = (sl3) obj;
            return this.f35138a == sl3.f35138a && this.f35139b == sl3.f35139b;
        }
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f35138a) * 31) + Float.floatToIntBits(this.f35139b);
    }

    public final String toString() {
        return pl2.f33726c + this.f35138a + ',' + this.f35139b + ')';
    }
}
