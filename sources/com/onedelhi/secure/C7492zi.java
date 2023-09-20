package com.onedelhi.secure;

import java.lang.reflect.Array;

/* renamed from: com.onedelhi.secure.zi */
public final class C7492zi {

    /* renamed from: a */
    public int f38348a;

    /* renamed from: a */
    public final C4774cj[] f38349a;

    /* renamed from: b */
    public final int f38350b;

    /* renamed from: c */
    public final int f38351c;

    public C7492zi(int i, int i2) {
        C4774cj[] cjVarArr = new C4774cj[i];
        this.f38349a = cjVarArr;
        int length = cjVarArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            this.f38349a[i3] = new C4774cj(((i2 + 4) * 17) + 1);
        }
        this.f38351c = i2 * 17;
        this.f38350b = i;
        this.f38348a = -1;
    }

    /* renamed from: a */
    public C4774cj mo48271a() {
        return this.f38349a[this.f38348a];
    }

    /* renamed from: b */
    public byte[][] mo48272b() {
        return mo48273c(1, 1);
    }

    /* renamed from: c */
    public byte[][] mo48273c(int i, int i2) {
        int[] iArr = new int[2];
        iArr[1] = this.f38351c * i;
        iArr[0] = this.f38350b * i2;
        byte[][] bArr = (byte[][]) Array.newInstance(byte.class, iArr);
        int i3 = this.f38350b * i2;
        for (int i4 = 0; i4 < i3; i4++) {
            bArr[(i3 - i4) - 1] = this.f38349a[i4 / i2].mo32397b(i);
        }
        return bArr;
    }

    /* renamed from: d */
    public void mo48274d(int i, int i2, byte b) {
        this.f38349a[i2].mo32398c(i, b);
    }

    /* renamed from: e */
    public void mo48275e() {
        this.f38348a++;
    }
}
