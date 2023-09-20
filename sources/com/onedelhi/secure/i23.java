package com.onedelhi.secure;

import com.onedelhi.secure.m60;

public class i23 extends dw4 {
    /* renamed from: g */
    public void mo15199g(p32 p32, boolean z) {
        super.mo15199g(p32, z);
        if (this.f16180n0 > 0) {
            o60 o60 = this.f16179c[0];
            o60.mo21661S0();
            m60.C2835b bVar = m60.C2835b.LEFT;
            o60.mo21713j(bVar, this, bVar);
            m60.C2835b bVar2 = m60.C2835b.RIGHT;
            o60.mo21713j(bVar2, this, bVar2);
            m60.C2835b bVar3 = m60.C2835b.TOP;
            o60.mo21713j(bVar3, this, bVar3);
            m60.C2835b bVar4 = m60.C2835b.BOTTOM;
            o60.mo21713j(bVar4, this, bVar4);
        }
    }

    /* renamed from: v2 */
    public void mo14918v2(int i, int i2, int i3, int i4) {
        boolean z = false;
        int s2 = mo14915s2() + mo14916t2() + 0;
        int u2 = mo14917u2() + mo14914r2() + 0;
        if (this.f16180n0 > 0) {
            s2 += this.f16179c[0].mo21723m0();
            u2 += this.f16179c[0].mo21619D();
        }
        int max = Math.max(mo21656Q(), s2);
        int max2 = Math.max(mo21653P(), u2);
        if (i != 1073741824) {
            i2 = i == Integer.MIN_VALUE ? Math.min(max, i2) : i == 0 ? max : 0;
        }
        if (i3 != 1073741824) {
            i4 = i3 == Integer.MIN_VALUE ? Math.min(max2, i4) : i3 == 0 ? max2 : 0;
        }
        mo14900A2(i2, i4);
        mo21691c2(i2);
        mo21758y1(i4);
        if (this.f16180n0 > 0) {
            z = true;
        }
        mo14922z2(z);
    }
}
