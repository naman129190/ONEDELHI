package com.onedelhi.secure;

public class jr3 {

    /* renamed from: a */
    public float f14376a;

    /* renamed from: b */
    public float f14377b;

    public jr3() {
        this(1.0f, 1.0f);
    }

    public jr3(float f, float f2) {
        this.f14376a = f;
        this.f14377b = f2;
    }

    /* renamed from: a */
    public boolean mo18552a(float f, float f2) {
        return this.f14376a == f && this.f14377b == f2;
    }

    /* renamed from: b */
    public float mo18553b() {
        return this.f14376a;
    }

    /* renamed from: c */
    public float mo18554c() {
        return this.f14377b;
    }

    /* renamed from: d */
    public void mo18555d(float f, float f2) {
        this.f14376a = f;
        this.f14377b = f2;
    }

    public String toString() {
        return mo18553b() + "x" + mo18554c();
    }
}
