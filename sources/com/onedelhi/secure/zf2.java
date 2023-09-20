package com.onedelhi.secure;

public class zf2 {

    /* renamed from: a */
    public float f23603a;

    /* renamed from: a */
    public int f23604a;

    /* renamed from: a */
    public void mo27962a(float f) {
        float f2 = this.f23603a + f;
        this.f23603a = f2;
        int i = this.f23604a + 1;
        this.f23604a = i;
        if (i == Integer.MAX_VALUE) {
            this.f23603a = f2 / 2.0f;
            this.f23604a = i / 2;
        }
    }

    /* renamed from: b */
    public float mo27963b() {
        int i = this.f23604a;
        if (i == 0) {
            return 0.0f;
        }
        return this.f23603a / ((float) i);
    }
}
