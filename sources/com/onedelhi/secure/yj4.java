package com.onedelhi.secure;

import java.util.Arrays;

public class yj4 {

    /* renamed from: e */
    public static final int f23121e = 4;

    /* renamed from: f */
    public static final int f23122f = 10;

    /* renamed from: g */
    public static final int f23123g = 10;

    /* renamed from: h */
    public static final int f23124h = 5;

    /* renamed from: a */
    public int f23125a = 0;

    /* renamed from: a */
    public float[] f23126a = new float[10];

    /* renamed from: a */
    public int[] f23127a = new int[10];

    /* renamed from: a */
    public String[] f23128a = new String[5];

    /* renamed from: a */
    public boolean[] f23129a = new boolean[4];

    /* renamed from: b */
    public int f23130b = 0;

    /* renamed from: b */
    public int[] f23131b = new int[10];

    /* renamed from: c */
    public int f23132c = 0;

    /* renamed from: c */
    public int[] f23133c = new int[10];

    /* renamed from: d */
    public int f23134d = 0;

    /* renamed from: d */
    public int[] f23135d = new int[5];

    /* renamed from: e */
    public int[] f23136e = new int[4];

    /* renamed from: a */
    public void mo27511a(int i, float f) {
        int i2 = this.f23130b;
        int[] iArr = this.f23133c;
        if (i2 >= iArr.length) {
            this.f23133c = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f23126a;
            this.f23126a = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f23133c;
        int i3 = this.f23130b;
        iArr2[i3] = i;
        float[] fArr2 = this.f23126a;
        this.f23130b = i3 + 1;
        fArr2[i3] = f;
    }

    /* renamed from: b */
    public void mo27512b(int i, int i2) {
        int i3 = this.f23125a;
        int[] iArr = this.f23127a;
        if (i3 >= iArr.length) {
            this.f23127a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f23131b;
            this.f23131b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f23127a;
        int i4 = this.f23125a;
        iArr3[i4] = i;
        int[] iArr4 = this.f23131b;
        this.f23125a = i4 + 1;
        iArr4[i4] = i2;
    }

    /* renamed from: c */
    public void mo27513c(int i, String str) {
        int i2 = this.f23132c;
        int[] iArr = this.f23135d;
        if (i2 >= iArr.length) {
            this.f23135d = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f23128a;
            this.f23128a = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f23135d;
        int i3 = this.f23132c;
        iArr2[i3] = i;
        String[] strArr2 = this.f23128a;
        this.f23132c = i3 + 1;
        strArr2[i3] = str;
    }

    /* renamed from: d */
    public void mo27514d(int i, boolean z) {
        int i2 = this.f23134d;
        int[] iArr = this.f23136e;
        if (i2 >= iArr.length) {
            this.f23136e = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f23129a;
            this.f23129a = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f23136e;
        int i3 = this.f23134d;
        iArr2[i3] = i;
        boolean[] zArr2 = this.f23129a;
        this.f23134d = i3 + 1;
        zArr2[i3] = z;
    }

    /* renamed from: e */
    public void mo27515e(int i, String str) {
        if (str != null) {
            mo27513c(i, str);
        }
    }

    /* renamed from: f */
    public void mo27516f(yj4 yj4) {
        for (int i = 0; i < this.f23125a; i++) {
            yj4.mo27512b(this.f23127a[i], this.f23131b[i]);
        }
        for (int i2 = 0; i2 < this.f23130b; i2++) {
            yj4.mo27511a(this.f23133c[i2], this.f23126a[i2]);
        }
        for (int i3 = 0; i3 < this.f23132c; i3++) {
            yj4.mo27513c(this.f23135d[i3], this.f23128a[i3]);
        }
        for (int i4 = 0; i4 < this.f23134d; i4++) {
            yj4.mo27514d(this.f23136e[i4], this.f23129a[i4]);
        }
    }

    /* renamed from: g */
    public void mo27517g(ak4 ak4) {
        for (int i = 0; i < this.f23125a; i++) {
            ak4.mo13120a(this.f23127a[i], this.f23131b[i]);
        }
        for (int i2 = 0; i2 < this.f23130b; i2++) {
            ak4.mo13122c(this.f23133c[i2], this.f23126a[i2]);
        }
        for (int i3 = 0; i3 < this.f23132c; i3++) {
            ak4.mo13124e(this.f23135d[i3], this.f23128a[i3]);
        }
        for (int i4 = 0; i4 < this.f23134d; i4++) {
            ak4.mo13123d(this.f23136e[i4], this.f23129a[i4]);
        }
    }

    /* renamed from: h */
    public void mo27518h() {
        this.f23134d = 0;
        this.f23132c = 0;
        this.f23130b = 0;
        this.f23125a = 0;
    }

    /* renamed from: i */
    public int mo27519i(int i) {
        for (int i2 = 0; i2 < this.f23125a; i2++) {
            if (this.f23127a[i2] == i) {
                return this.f23131b[i2];
            }
        }
        return -1;
    }
}
