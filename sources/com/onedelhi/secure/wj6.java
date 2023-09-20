package com.onedelhi.secure;

import java.util.Arrays;

public final class wj6 extends qj6 {
    public wj6() {
        super(4);
    }

    /* renamed from: a */
    public final wj6 mo26612a(Object... objArr) {
        bl6.m11948b(objArr, 15);
        int i = this.f19202a + 15;
        Object[] objArr2 = this.f19204a;
        int length = objArr2.length;
        if (length < i) {
            int i2 = length + (length >> 1) + 1;
            if (i2 < i) {
                int highestOneBit = Integer.highestOneBit(i - 1);
                i2 = highestOneBit + highestOneBit;
            }
            if (i2 < 0) {
                i2 = Integer.MAX_VALUE;
            }
            this.f19204a = Arrays.copyOf(objArr2, i2);
        } else {
            if (this.f19203a) {
                this.f19204a = (Object[]) objArr2.clone();
            }
            System.arraycopy(objArr, 0, this.f19204a, this.f19202a, 15);
            this.f19202a += 15;
            return this;
        }
        this.f19203a = false;
        System.arraycopy(objArr, 0, this.f19204a, this.f19202a, 15);
        this.f19202a += 15;
        return this;
    }

    /* renamed from: b */
    public final vk6 mo26613b() {
        this.f19203a = true;
        return vk6.m30218k(this.f19204a, this.f19202a);
    }
}
