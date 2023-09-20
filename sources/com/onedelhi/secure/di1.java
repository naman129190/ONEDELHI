package com.onedelhi.secure;

import android.graphics.Color;
import java.util.HashMap;

public class di1 {

    /* renamed from: b */
    public static final int f27463b = 1000;

    /* renamed from: a */
    public final int f27464a;

    /* renamed from: a */
    public float[] f27465a;

    /* renamed from: a */
    public int[] f27466a;

    /* renamed from: com.onedelhi.secure.di1$b */
    public class C5030b {

        /* renamed from: a */
        public final float f27467a;

        /* renamed from: a */
        public final int f27468a;

        /* renamed from: b */
        public final int f27470b;

        public C5030b(int i, int i2, float f) {
            this.f27468a = i;
            this.f27470b = i2;
            this.f27467a = f;
        }
    }

    public di1(int[] iArr, float[] fArr) {
        this(iArr, fArr, 1000);
    }

    public di1(int[] iArr, float[] fArr, int i) {
        if (iArr.length != fArr.length) {
            throw new IllegalArgumentException("colors and startPoints should be same length");
        } else if (iArr.length != 0) {
            int i2 = 1;
            while (i2 < fArr.length) {
                if (fArr[i2] > fArr[i2 - 1]) {
                    i2++;
                } else {
                    throw new IllegalArgumentException("startPoints should be in increasing order");
                }
            }
            this.f27464a = i;
            int[] iArr2 = new int[iArr.length];
            this.f27466a = iArr2;
            this.f27465a = new float[fArr.length];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            System.arraycopy(fArr, 0, this.f27465a, 0, fArr.length);
        } else {
            throw new IllegalArgumentException("No colors have been defined");
        }
    }

    /* renamed from: c */
    public static int m45304c(int i, int i2, float f) {
        int alpha = (int) ((((float) (Color.alpha(i2) - Color.alpha(i))) * f) + ((float) Color.alpha(i)));
        float[] fArr = new float[3];
        Color.RGBToHSV(Color.red(i), Color.green(i), Color.blue(i), fArr);
        float[] fArr2 = new float[3];
        Color.RGBToHSV(Color.red(i2), Color.green(i2), Color.blue(i2), fArr2);
        if (fArr[0] - fArr2[0] > 180.0f) {
            fArr2[0] = fArr2[0] + 360.0f;
        } else if (fArr2[0] - fArr[0] > 180.0f) {
            fArr[0] = fArr[0] + 360.0f;
        }
        float[] fArr3 = new float[3];
        for (int i3 = 0; i3 < 3; i3++) {
            fArr3[i3] = ((fArr2[i3] - fArr[i3]) * f) + fArr[i3];
        }
        return Color.HSVToColor(alpha, fArr3);
    }

    /* renamed from: a */
    public final HashMap<Integer, C5030b> mo34469a() {
        HashMap<Integer, C5030b> hashMap = new HashMap<>();
        if (this.f27465a[0] != 0.0f) {
            hashMap.put(0, new C5030b(Color.argb(0, Color.red(this.f27466a[0]), Color.green(this.f27466a[0]), Color.blue(this.f27466a[0])), this.f27466a[0], ((float) this.f27464a) * this.f27465a[0]));
        }
        for (int i = 1; i < this.f27466a.length; i++) {
            int i2 = i - 1;
            Integer valueOf = Integer.valueOf((int) (((float) this.f27464a) * this.f27465a[i2]));
            int[] iArr = this.f27466a;
            int i3 = iArr[i2];
            int i4 = iArr[i];
            float[] fArr = this.f27465a;
            hashMap.put(valueOf, new C5030b(i3, i4, (fArr[i] - fArr[i2]) * ((float) this.f27464a)));
        }
        float[] fArr2 = this.f27465a;
        if (fArr2[fArr2.length - 1] != 1.0f) {
            int length = fArr2.length - 1;
            Integer valueOf2 = Integer.valueOf((int) (((float) this.f27464a) * fArr2[length]));
            int[] iArr2 = this.f27466a;
            hashMap.put(valueOf2, new C5030b(iArr2[length], iArr2[length], ((float) this.f27464a) * (1.0f - this.f27465a[length])));
        }
        return hashMap;
    }

    /* renamed from: b */
    public int[] mo34470b(double d) {
        HashMap<Integer, C5030b> a = mo34469a();
        int[] iArr = new int[this.f27464a];
        C5030b bVar = a.get(0);
        int i = 0;
        for (int i2 = 0; i2 < this.f27464a; i2++) {
            if (a.containsKey(Integer.valueOf(i2))) {
                bVar = a.get(Integer.valueOf(i2));
                i = i2;
            }
            iArr[i2] = m45304c(bVar.f27468a, bVar.f27470b, ((float) (i2 - i)) / bVar.f27467a);
        }
        if (d != 1.0d) {
            for (int i3 = 0; i3 < this.f27464a; i3++) {
                int i4 = iArr[i3];
                iArr[i3] = Color.argb((int) (((double) Color.alpha(i4)) * d), Color.red(i4), Color.green(i4), Color.blue(i4));
            }
        }
        return iArr;
    }
}
