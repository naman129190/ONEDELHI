package com.onedelhi.secure;

/* renamed from: com.onedelhi.secure.u */
public abstract class C6912u extends C6808t {
    public C6912u(C6014ll llVar) {
        super(llVar);
    }

    /* renamed from: h */
    public abstract void mo40309h(StringBuilder sb, int i);

    /* renamed from: i */
    public abstract int mo40310i(int i);

    /* renamed from: j */
    public final void mo45345j(StringBuilder sb, int i, int i2) {
        int f = mo42995b().mo34329f(i, i2);
        mo40309h(sb, f);
        int i3 = mo40310i(f);
        int i4 = BZip2Constants.BASEBLOCKSIZE;
        for (int i5 = 0; i5 < 5; i5++) {
            if (i3 / i4 == 0) {
                sb.append('0');
            }
            i4 /= 10;
        }
        sb.append(i3);
    }
}
