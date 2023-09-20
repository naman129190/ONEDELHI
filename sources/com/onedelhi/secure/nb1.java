package com.onedelhi.secure;

import android.util.SparseIntArray;

public class nb1 {

    /* renamed from: com.onedelhi.secure.nb1$a */
    public static class C6180a {

        /* renamed from: a */
        public int f32472a;

        /* renamed from: b */
        public int f32473b;

        /* renamed from: c */
        public int f32474c;

        public C6180a(int i, int i2, int i3) {
            this.f32472a = i;
            this.f32473b = i2;
            this.f32474c = i3;
        }

        /* renamed from: a */
        public C6180a mo41014a(C6180a aVar) {
            return new C6180a(this.f32472a - aVar.mo41017d(), this.f32473b - aVar.mo41016c(), this.f32474c - aVar.mo41015b());
        }

        /* renamed from: b */
        public int mo41015b() {
            return this.f32474c;
        }

        /* renamed from: c */
        public int mo41016c() {
            return this.f32473b;
        }

        /* renamed from: d */
        public int mo41017d() {
            return this.f32472a;
        }
    }

    @mr2
    /* renamed from: a */
    public static C6180a m58022a(@ts2 SparseIntArray[] sparseIntArrayArr) {
        int i;
        int i2;
        SparseIntArray sparseIntArray;
        int i3 = 0;
        if (sparseIntArrayArr == null || (sparseIntArray = sparseIntArrayArr[0]) == null) {
            i2 = 0;
            i = 0;
        } else {
            int i4 = 0;
            i2 = 0;
            i = 0;
            while (i3 < sparseIntArray.size()) {
                int keyAt = sparseIntArray.keyAt(i3);
                int valueAt = sparseIntArray.valueAt(i3);
                i4 += valueAt;
                if (keyAt > 700) {
                    i += valueAt;
                }
                if (keyAt > 16) {
                    i2 += valueAt;
                }
                i3++;
            }
            i3 = i4;
        }
        return new C6180a(i3, i2, i);
    }
}
