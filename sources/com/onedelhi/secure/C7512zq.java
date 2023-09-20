package com.onedelhi.secure;

import com.onedelhi.secure.yg1;
import java.lang.reflect.Array;
import java.util.Arrays;

/* renamed from: com.onedelhi.secure.zq */
public final class C7512zq {

    /* renamed from: a */
    public final int f38407a;

    /* renamed from: a */
    public final byte[][] f38408a;

    /* renamed from: b */
    public final int f38409b;

    public C7512zq(int i, int i2) {
        int[] iArr = new int[2];
        iArr[1] = i;
        iArr[0] = i2;
        this.f38408a = (byte[][]) Array.newInstance(byte.class, iArr);
        this.f38407a = i;
        this.f38409b = i2;
    }

    /* renamed from: a */
    public void mo48425a(byte b) {
        for (byte[] fill : this.f38408a) {
            Arrays.fill(fill, b);
        }
    }

    /* renamed from: b */
    public byte mo48426b(int i, int i2) {
        return this.f38408a[i2][i];
    }

    /* renamed from: c */
    public byte[][] mo48427c() {
        return this.f38408a;
    }

    /* renamed from: d */
    public int mo48428d() {
        return this.f38409b;
    }

    /* renamed from: e */
    public int mo48429e() {
        return this.f38407a;
    }

    /* renamed from: f */
    public void mo48430f(int i, int i2, byte b) {
        this.f38408a[i2][i] = b;
    }

    /* renamed from: g */
    public void mo48431g(int i, int i2, int i3) {
        this.f38408a[i2][i] = (byte) i3;
    }

    /* renamed from: h */
    public void mo48432h(int i, int i2, boolean z) {
        this.f38408a[i2][i] = z ? (byte) 1 : 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((this.f38407a * 2 * this.f38409b) + 2);
        for (int i = 0; i < this.f38409b; i++) {
            byte[] bArr = this.f38408a[i];
            for (int i2 = 0; i2 < this.f38407a; i2++) {
                byte b = bArr[i2];
                sb.append(b != 0 ? b != 1 ? yg1.C3999a.f23084c : " 1" : " 0");
            }
            sb.append(10);
        }
        return sb.toString();
    }
}
