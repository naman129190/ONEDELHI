package com.onedelhi.secure;

import android.animation.Animator;
import com.onedelhi.secure.C2218g6;

public abstract class sp1<T extends Animator> {

    /* renamed from: a */
    public tp1 f35157a;

    /* renamed from: a */
    public final float[] f35158a;

    /* renamed from: a */
    public final int[] f35159a;

    public sp1(int i) {
        this.f35158a = new float[(i * 2)];
        this.f35159a = new int[i];
    }

    /* renamed from: a */
    public abstract void mo37645a();

    /* renamed from: b */
    public float mo44430b(int i, int i2, int i3) {
        return ((float) (i - i2)) / ((float) i3);
    }

    /* renamed from: c */
    public abstract void mo37646c();

    /* renamed from: d */
    public abstract void mo37647d(@mr2 C2218g6.C2219a aVar);

    /* renamed from: e */
    public void mo44431e(@mr2 tp1 tp1) {
        this.f35157a = tp1;
    }

    /* renamed from: f */
    public abstract void mo37648f();

    /* renamed from: g */
    public abstract void mo37649g();

    /* renamed from: h */
    public abstract void mo37650h();
}
