package com.onedelhi.secure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ml1 extends o60 implements jl1 {

    /* renamed from: c */
    public o60[] f16179c = new o60[4];

    /* renamed from: n0 */
    public int f16180n0 = 0;

    /* renamed from: a */
    public void mo18468a() {
        this.f16180n0 = 0;
        Arrays.fill(this.f16179c, (Object) null);
    }

    /* renamed from: b */
    public void mo18469b(o60 o60) {
        if (o60 != this && o60 != null) {
            int i = this.f16180n0 + 1;
            o60[] o60Arr = this.f16179c;
            if (i > o60Arr.length) {
                this.f16179c = (o60[]) Arrays.copyOf(o60Arr, o60Arr.length * 2);
            }
            o60[] o60Arr2 = this.f16179c;
            int i2 = this.f16180n0;
            o60Arr2[i2] = o60;
            this.f16180n0 = i2 + 1;
        }
    }

    /* renamed from: c */
    public void mo14908c(p60 p60) {
    }

    /* renamed from: k2 */
    public void mo20465k2(ArrayList<fx4> arrayList, int i, fx4 fx4) {
        for (int i2 = 0; i2 < this.f16180n0; i2++) {
            fx4.mo16200a(this.f16179c[i2]);
        }
        for (int i3 = 0; i3 < this.f16180n0; i3++) {
            aj1.m11225a(this.f16179c[i3], i, arrayList, fx4);
        }
    }

    /* renamed from: l2 */
    public int mo20466l2(int i) {
        int i2;
        int i3;
        for (int i4 = 0; i4 < this.f16180n0; i4++) {
            o60 o60 = this.f16179c[i4];
            if (i == 0 && (i3 = o60.f17742I) != -1) {
                return i3;
            }
            if (i == 1 && (i2 = o60.f17743J) != -1) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: n */
    public void mo15202n(o60 o60, HashMap<o60, o60> hashMap) {
        super.mo15202n(o60, hashMap);
        ml1 ml1 = (ml1) o60;
        this.f16180n0 = 0;
        int i = ml1.f16180n0;
        for (int i2 = 0; i2 < i; i2++) {
            mo18469b(hashMap.get(ml1.f16179c[i2]));
        }
    }
}
