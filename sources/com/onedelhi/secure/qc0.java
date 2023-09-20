package com.onedelhi.secure;

import com.onedelhi.secure.ak4;

public class qc0 {

    /* renamed from: c */
    public static final String f19073c = "TransitionLayout";

    /* renamed from: a */
    public float f19074a;

    /* renamed from: a */
    public int f19075a;

    /* renamed from: a */
    public String f19076a;

    /* renamed from: a */
    public boolean f19077a;

    /* renamed from: b */
    public int f19078b;

    /* renamed from: b */
    public String f19079b;

    public qc0(qc0 qc0) {
        this.f19078b = Integer.MIN_VALUE;
        this.f19074a = Float.NaN;
        this.f19079b = null;
        this.f19076a = qc0.f19076a;
        this.f19075a = qc0.f19075a;
        this.f19078b = qc0.f19078b;
        this.f19074a = qc0.f19074a;
        this.f19079b = qc0.f19079b;
        this.f19077a = qc0.f19077a;
    }

    public qc0(qc0 qc0, Object obj) {
        this.f19078b = Integer.MIN_VALUE;
        this.f19074a = Float.NaN;
        this.f19079b = null;
        this.f19076a = qc0.f19076a;
        this.f19075a = qc0.f19075a;
        mo23096y(obj);
    }

    public qc0(String str, int i) {
        this.f19078b = Integer.MIN_VALUE;
        this.f19074a = Float.NaN;
        this.f19079b = null;
        this.f19076a = str;
        this.f19075a = i;
    }

    public qc0(String str, int i, float f) {
        this.f19078b = Integer.MIN_VALUE;
        this.f19079b = null;
        this.f19076a = str;
        this.f19075a = i;
        this.f19074a = f;
    }

    public qc0(String str, int i, int i2) {
        this.f19078b = Integer.MIN_VALUE;
        this.f19074a = Float.NaN;
        this.f19079b = null;
        this.f19076a = str;
        this.f19075a = i;
        if (i == 901) {
            this.f19074a = (float) i2;
        } else {
            this.f19078b = i2;
        }
    }

    public qc0(String str, int i, Object obj) {
        this.f19078b = Integer.MIN_VALUE;
        this.f19074a = Float.NaN;
        this.f19079b = null;
        this.f19076a = str;
        this.f19075a = i;
        mo23096y(obj);
    }

    public qc0(String str, int i, String str2) {
        this.f19078b = Integer.MIN_VALUE;
        this.f19074a = Float.NaN;
        this.f19076a = str;
        this.f19075a = i;
        this.f19079b = str2;
    }

    public qc0(String str, int i, boolean z) {
        this.f19078b = Integer.MIN_VALUE;
        this.f19074a = Float.NaN;
        this.f19079b = null;
        this.f19076a = str;
        this.f19075a = i;
        this.f19077a = z;
    }

    /* renamed from: b */
    public static int m25642b(int i) {
        int i2 = (i & (~(i >> 31))) - 255;
        return (i2 & (i2 >> 31)) + 255;
    }

    /* renamed from: c */
    public static String m25643c(int i) {
        String str = "00000000" + Integer.toHexString(i);
        return "#" + str.substring(str.length() - 8);
    }

    /* renamed from: p */
    public static int m25644p(float f, float f2, float f3) {
        float f4 = f * 6.0f;
        int i = (int) f4;
        float f5 = f4 - ((float) i);
        float f6 = f3 * 255.0f;
        int i2 = (int) (((1.0f - f2) * f6) + 0.5f);
        int i3 = (int) (((1.0f - (f5 * f2)) * f6) + 0.5f);
        int i4 = (int) (((1.0f - ((1.0f - f5) * f2)) * f6) + 0.5f);
        int i5 = (int) (f6 + 0.5f);
        if (i == 0) {
            return ((i5 << 16) + (i4 << 8) + i2) | -16777216;
        }
        if (i == 1) {
            return ((i3 << 16) + (i5 << 8) + i2) | -16777216;
        }
        if (i == 2) {
            return ((i2 << 16) + (i5 << 8) + i4) | -16777216;
        }
        if (i == 3) {
            return ((i2 << 16) + (i3 << 8) + i5) | -16777216;
        }
        if (i == 4) {
            return ((i4 << 16) + (i2 << 8) + i5) | -16777216;
        }
        if (i != 5) {
            return 0;
        }
        return ((i5 << 16) + (i2 << 8) + i3) | -16777216;
    }

    /* renamed from: s */
    public static int m25645s(float f, float f2, float f3, float f4) {
        int b = m25642b((int) (f * 255.0f));
        int b2 = m25642b((int) (f2 * 255.0f));
        return (b << 16) | (m25642b((int) (f4 * 255.0f)) << 24) | (b2 << 8) | m25642b((int) (f3 * 255.0f));
    }

    /* renamed from: a */
    public void mo23075a(ql2 ql2) {
        int i = this.f19075a;
        switch (i) {
            case 900:
            case 902:
            case ak4.C1709b.f9170g:
                ql2.mo23210J(this.f19076a, i, this.f19078b);
                return;
            case 901:
            case ak4.C1709b.f9168f:
                ql2.mo23209I(this.f19076a, i, this.f19074a);
                return;
            case ak4.C1709b.f9164d:
                ql2.mo23211K(this.f19076a, i, this.f19079b);
                return;
            case ak4.C1709b.f9166e:
                ql2.mo23212L(this.f19076a, i, this.f19077a);
                return;
            default:
                return;
        }
    }

    /* renamed from: d */
    public qc0 mo23076d() {
        return new qc0(this);
    }

    /* renamed from: e */
    public boolean mo23077e(qc0 qc0) {
        int i;
        if (qc0 == null || (i = this.f19075a) != qc0.f19075a) {
            return false;
        }
        switch (i) {
            case 900:
            case ak4.C1709b.f9170g:
                return this.f19078b == qc0.f19078b;
            case 901:
                return this.f19074a == qc0.f19074a;
            case 902:
                return this.f19078b == qc0.f19078b;
            case ak4.C1709b.f9164d:
                return this.f19078b == qc0.f19078b;
            case ak4.C1709b.f9166e:
                return this.f19077a == qc0.f19077a;
            case ak4.C1709b.f9168f:
                return this.f19074a == qc0.f19074a;
            default:
                return false;
        }
    }

    /* renamed from: f */
    public boolean mo23078f() {
        return this.f19077a;
    }

    /* renamed from: g */
    public int mo23079g() {
        return this.f19078b;
    }

    /* renamed from: h */
    public float mo23080h() {
        return this.f19074a;
    }

    /* renamed from: i */
    public int mo23081i() {
        return this.f19078b;
    }

    /* renamed from: j */
    public int mo23082j(float[] fArr) {
        int b = m25642b((int) (((float) Math.pow((double) fArr[0], 0.45454545454545453d)) * 255.0f));
        int b2 = m25642b((int) (((float) Math.pow((double) fArr[1], 0.45454545454545453d)) * 255.0f));
        return (m25642b((int) (fArr[3] * 255.0f)) << 24) | (b << 16) | (b2 << 8) | m25642b((int) (((float) Math.pow((double) fArr[2], 0.45454545454545453d)) * 255.0f));
    }

    /* renamed from: k */
    public String mo23083k() {
        return this.f19076a;
    }

    /* renamed from: l */
    public String mo23084l() {
        return this.f19079b;
    }

    /* renamed from: m */
    public int mo23085m() {
        return this.f19075a;
    }

    /* renamed from: n */
    public float mo23086n() {
        switch (this.f19075a) {
            case 900:
                return (float) this.f19078b;
            case 901:
                return this.f19074a;
            case 902:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case ak4.C1709b.f9164d:
                throw new RuntimeException("Cannot interpolate String");
            case ak4.C1709b.f9166e:
                return this.f19077a ? 1.0f : 0.0f;
            case ak4.C1709b.f9168f:
                return this.f19074a;
            default:
                return Float.NaN;
        }
    }

    /* renamed from: o */
    public void mo23087o(float[] fArr) {
        switch (this.f19075a) {
            case 900:
                fArr[0] = (float) this.f19078b;
                return;
            case 901:
                fArr[0] = this.f19074a;
                return;
            case 902:
                int i = this.f19078b;
                float pow = (float) Math.pow((double) (((float) ((i >> 16) & 255)) / 255.0f), 2.2d);
                float pow2 = (float) Math.pow((double) (((float) ((i >> 8) & 255)) / 255.0f), 2.2d);
                fArr[0] = pow;
                fArr[1] = pow2;
                fArr[2] = (float) Math.pow((double) (((float) (i & 255)) / 255.0f), 2.2d);
                fArr[3] = ((float) ((i >> 24) & 255)) / 255.0f;
                return;
            case ak4.C1709b.f9164d:
                throw new RuntimeException("Cannot interpolate String");
            case ak4.C1709b.f9166e:
                fArr[0] = this.f19077a ? 1.0f : 0.0f;
                return;
            case ak4.C1709b.f9168f:
                fArr[0] = this.f19074a;
                return;
            default:
                return;
        }
    }

    /* renamed from: q */
    public boolean mo23088q() {
        int i = this.f19075a;
        return (i == 903 || i == 904 || i == 906) ? false : true;
    }

    /* renamed from: r */
    public int mo23089r() {
        return this.f19075a != 902 ? 1 : 4;
    }

    /* renamed from: t */
    public void mo23090t(boolean z) {
        this.f19077a = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0022, code lost:
        r1.append(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0029, code lost:
        return r1.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002f, code lost:
        r1.append(r0);
        r1.append(r2.f19074a);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.f19076a
            r0.append(r1)
            r1 = 58
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            int r1 = r2.f19075a
            switch(r1) {
                case 900: goto L_0x006a;
                case 901: goto L_0x0064;
                case 902: goto L_0x0055;
                case 903: goto L_0x004a;
                case 904: goto L_0x0038;
                case 905: goto L_0x002a;
                default: goto L_0x0018;
            }
        L_0x0018:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "????"
        L_0x0022:
            r1.append(r0)
        L_0x0025:
            java.lang.String r0 = r1.toString()
            return r0
        L_0x002a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
        L_0x002f:
            r1.append(r0)
            float r0 = r2.f19074a
            r1.append(r0)
            goto L_0x0025
        L_0x0038:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            boolean r0 = r2.f19077a
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.append(r0)
            goto L_0x0025
        L_0x004a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = r2.f19079b
            goto L_0x0022
        L_0x0055:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            int r0 = r2.f19078b
            java.lang.String r0 = m25643c(r0)
            goto L_0x0022
        L_0x0064:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            goto L_0x002f
        L_0x006a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            int r0 = r2.f19078b
            r1.append(r0)
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.qc0.toString():java.lang.String");
    }

    /* renamed from: u */
    public void mo23092u(float f) {
        this.f19074a = f;
    }

    /* renamed from: v */
    public void mo23093v(int i) {
        this.f19078b = i;
    }

    /* renamed from: w */
    public void mo23094w(ql2 ql2, float[] fArr) {
        int i = this.f19075a;
        boolean z = true;
        switch (i) {
            case 900:
                ql2.mo23210J(this.f19076a, i, (int) fArr[0]);
                return;
            case 901:
            case ak4.C1709b.f9168f:
                ql2.mo23209I(this.f19076a, i, fArr[0]);
                return;
            case 902:
                int b = m25642b((int) (((float) Math.pow((double) fArr[0], 0.45454545454545453d)) * 255.0f));
                int b2 = m25642b((int) (((float) Math.pow((double) fArr[1], 0.45454545454545453d)) * 255.0f));
                int b3 = m25642b((int) (((float) Math.pow((double) fArr[2], 0.45454545454545453d)) * 255.0f));
                ql2.mo23210J(this.f19076a, this.f19075a, (m25642b((int) (fArr[3] * 255.0f)) << 24) | (b << 16) | (b2 << 8) | b3);
                return;
            case ak4.C1709b.f9164d:
            case ak4.C1709b.f9170g:
                throw new RuntimeException("unable to interpolate " + this.f19076a);
            case ak4.C1709b.f9166e:
                String str = this.f19076a;
                if (fArr[0] <= 0.5f) {
                    z = false;
                }
                ql2.mo23212L(str, i, z);
                return;
            default:
                return;
        }
    }

    /* renamed from: x */
    public void mo23095x(String str) {
        this.f19079b = str;
    }

    /* renamed from: y */
    public void mo23096y(Object obj) {
        switch (this.f19075a) {
            case 900:
            case 902:
            case ak4.C1709b.f9170g:
                this.f19078b = ((Integer) obj).intValue();
                return;
            case 901:
            case ak4.C1709b.f9168f:
                this.f19074a = ((Float) obj).floatValue();
                return;
            case ak4.C1709b.f9164d:
                this.f19079b = (String) obj;
                return;
            case ak4.C1709b.f9166e:
                this.f19077a = ((Boolean) obj).booleanValue();
                return;
            default:
                return;
        }
    }

    /* renamed from: z */
    public void mo23097z(float[] fArr) {
        int i;
        boolean z = true;
        switch (this.f19075a) {
            case 900:
            case ak4.C1709b.f9170g:
                i = (int) fArr[0];
                break;
            case 901:
            case ak4.C1709b.f9168f:
                this.f19074a = fArr[0];
                return;
            case 902:
                float f = fArr[0];
                float f2 = fArr[1];
                float f3 = fArr[2];
                i = ((Math.round(fArr[3] * 255.0f) & 255) << 24) | ((Math.round(((float) Math.pow((double) f, 0.5d)) * 255.0f) & 255) << 16) | ((Math.round(((float) Math.pow((double) f2, 0.5d)) * 255.0f) & 255) << 8) | (Math.round(((float) Math.pow((double) f3, 0.5d)) * 255.0f) & 255);
                break;
            case ak4.C1709b.f9164d:
                throw new RuntimeException("Cannot interpolate String");
            case ak4.C1709b.f9166e:
                if (((double) fArr[0]) <= 0.5d) {
                    z = false;
                }
                this.f19077a = z;
                return;
            default:
                return;
        }
        this.f19078b = i;
    }
}
