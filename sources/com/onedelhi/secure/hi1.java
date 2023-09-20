package com.onedelhi.secure;

import android.graphics.Color;
import com.onedelhi.secure.wv1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class hi1 implements is4<ei1> {

    /* renamed from: a */
    public int f13113a;

    public hi1(int i) {
        this.f13113a = i;
    }

    /* renamed from: b */
    public final void mo17288b(ei1 ei1, List<Float> list) {
        int i = this.f13113a * 4;
        if (list.size() > i) {
            int size = (list.size() - i) / 2;
            double[] dArr = new double[size];
            double[] dArr2 = new double[size];
            int i2 = 0;
            while (i < list.size()) {
                if (i % 2 == 0) {
                    dArr[i2] = (double) list.get(i).floatValue();
                } else {
                    dArr2[i2] = (double) list.get(i).floatValue();
                    i2++;
                }
                i++;
            }
            for (int i3 = 0; i3 < ei1.mo15192c(); i3++) {
                int i4 = ei1.mo15190a()[i3];
                ei1.mo15190a()[i3] = Color.argb(mo17289c((double) ei1.mo15191b()[i3], dArr, dArr2), Color.red(i4), Color.green(i4), Color.blue(i4));
            }
        }
    }

    @js1(from = 0, mo18580to = 255)
    /* renamed from: c */
    public final int mo17289c(double d, double[] dArr, double[] dArr2) {
        double d2;
        double[] dArr3 = dArr;
        double[] dArr4 = dArr2;
        int i = 1;
        while (true) {
            if (i >= dArr3.length) {
                d2 = dArr4[dArr4.length - 1];
                break;
            }
            int i2 = i - 1;
            double d3 = dArr3[i2];
            double d4 = dArr3[i];
            if (dArr3[i] >= d) {
                d2 = hj2.m16794i(dArr4[i2], dArr4[i], (d - d3) / (d4 - d3));
                break;
            }
            i++;
        }
        return (int) (d2 * 255.0d);
    }

    /* renamed from: d */
    public ei1 mo13530a(wv1 wv1, float f) throws IOException {
        ArrayList arrayList = new ArrayList();
        boolean z = wv1.mo17955H() == wv1.C3877b.BEGIN_ARRAY;
        if (z) {
            wv1.mo17964b();
        }
        while (wv1.mo17970h()) {
            arrayList.add(Float.valueOf((float) wv1.mo17974m()));
        }
        if (z) {
            wv1.mo17967d();
        }
        if (this.f13113a == -1) {
            this.f13113a = arrayList.size() / 4;
        }
        int i = this.f13113a;
        float[] fArr = new float[i];
        int[] iArr = new int[i];
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < this.f13113a * 4; i4++) {
            int i5 = i4 / 4;
            double floatValue = (double) ((Float) arrayList.get(i4)).floatValue();
            int i6 = i4 % 4;
            if (i6 == 0) {
                fArr[i5] = (float) floatValue;
            } else if (i6 == 1) {
                i2 = (int) (floatValue * 255.0d);
            } else if (i6 == 2) {
                i3 = (int) (floatValue * 255.0d);
            } else if (i6 == 3) {
                iArr[i5] = Color.argb(255, i2, i3, (int) (floatValue * 255.0d));
            }
        }
        ei1 ei1 = new ei1(fArr, iArr);
        mo17288b(ei1, arrayList);
        return ei1;
    }
}
