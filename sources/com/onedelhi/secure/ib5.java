package com.onedelhi.secure;

import java.util.Arrays;
import java.util.Objects;

public class ib5 extends vb5 {

    /* renamed from: a */
    public int f13568a = 0;

    /* renamed from: a */
    public boolean f13569a;

    /* renamed from: a */
    public Object[] f13570a = new Object[4];

    public ib5(int i) {
    }

    @C7277xt
    /* renamed from: a */
    public final ib5 mo17705a(Object obj) {
        Objects.requireNonNull(obj);
        int i = this.f13568a + 1;
        Object[] objArr = this.f13570a;
        int length = objArr.length;
        if (length < i) {
            int i2 = length + (length >> 1) + 1;
            if (i2 < i) {
                int highestOneBit = Integer.highestOneBit(i - 1);
                i2 = highestOneBit + highestOneBit;
            }
            if (i2 < 0) {
                i2 = Integer.MAX_VALUE;
            }
            this.f13570a = Arrays.copyOf(objArr, i2);
        } else {
            if (this.f13569a) {
                this.f13570a = (Object[]) objArr.clone();
            }
            Object[] objArr2 = this.f13570a;
            int i3 = this.f13568a;
            this.f13568a = i3 + 1;
            objArr2[i3] = obj;
            return this;
        }
        this.f13569a = false;
        Object[] objArr22 = this.f13570a;
        int i32 = this.f13568a;
        this.f13568a = i32 + 1;
        objArr22[i32] = obj;
        return this;
    }
}
