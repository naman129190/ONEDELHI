package com.onedelhi.secure;

/* renamed from: com.onedelhi.secure.sr */
public class C3535sr extends C3336qr {

    /* renamed from: a */
    public float f20494a;

    public C3535sr(float f) {
        super((char[]) null);
        this.f20494a = f;
    }

    public C3535sr(char[] cArr) {
        super(cArr);
        this.f20494a = Float.NaN;
    }

    /* renamed from: A */
    public static C3336qr m27794A(char[] cArr) {
        return new C3535sr(cArr);
    }

    /* renamed from: B */
    public boolean mo24514B() {
        float j = mo23409j();
        return ((float) ((int) j)) == j;
    }

    /* renamed from: C */
    public void mo24515C(float f) {
        this.f20494a = f;
    }

    /* renamed from: j */
    public float mo23409j() {
        if (Float.isNaN(this.f20494a)) {
            this.f20494a = Float.parseFloat(mo23405e());
        }
        return this.f20494a;
    }

    /* renamed from: k */
    public int mo23410k() {
        if (Float.isNaN(this.f20494a)) {
            this.f20494a = (float) Integer.parseInt(mo23405e());
        }
        return (int) this.f20494a;
    }

    /* renamed from: y */
    public String mo22057y(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        mo23404b(sb, i);
        float j = mo23409j();
        int i3 = (int) j;
        if (((float) i3) == j) {
            sb.append(i3);
        } else {
            sb.append(j);
        }
        return sb.toString();
    }

    /* renamed from: z */
    public String mo22058z() {
        float j = mo23409j();
        int i = (int) j;
        if (((float) i) == j) {
            return "" + i;
        }
        return "" + j;
    }
}
