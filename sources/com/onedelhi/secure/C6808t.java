package com.onedelhi.secure;

/* renamed from: com.onedelhi.secure.t */
public abstract class C6808t extends C6491q0 {

    /* renamed from: a */
    public static final int f35277a = 40;

    public C6808t(C6014ll llVar) {
        super(llVar);
    }

    /* renamed from: e */
    public static void m65059e(StringBuilder sb, int i) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < 13; i4++) {
            int charAt = sb.charAt(i4 + i) - '0';
            if ((i4 & 1) == 0) {
                charAt *= 3;
            }
            i3 += charAt;
        }
        int i5 = 10 - (i3 % 10);
        if (i5 != 10) {
            i2 = i5;
        }
        sb.append(i2);
    }

    /* renamed from: f */
    public final void mo44658f(StringBuilder sb, int i) {
        sb.append("(01)");
        int length = sb.length();
        sb.append('9');
        mo44659g(sb, i, length);
    }

    /* renamed from: g */
    public final void mo44659g(StringBuilder sb, int i, int i2) {
        for (int i3 = 0; i3 < 4; i3++) {
            int f = mo42995b().mo34329f((i3 * 10) + i, 10);
            if (f / 100 == 0) {
                sb.append('0');
            }
            if (f / 10 == 0) {
                sb.append('0');
            }
            sb.append(f);
        }
        m65059e(sb, i2);
    }
}
