package com.onedelhi.secure;

import com.onedelhi.secure.ak4;
import java.util.HashMap;
import java.util.HashSet;

public class il2 extends fl2 {

    /* renamed from: i */
    public static final float f13732i = 20.0f;

    /* renamed from: o */
    public static final int f13733o = 2;

    /* renamed from: o */
    public static final String f13734o = "KeyPosition";

    /* renamed from: p */
    public static final int f13735p = 1;

    /* renamed from: q */
    public static final int f13736q = 0;

    /* renamed from: r */
    public static final int f13737r = 2;

    /* renamed from: a */
    public float f13738a;

    /* renamed from: b */
    public float f13739b;

    /* renamed from: c */
    public float f13740c;

    /* renamed from: d */
    public float f13741d;

    /* renamed from: e */
    public float f13742e;

    /* renamed from: f */
    public float f13743f;

    /* renamed from: g */
    public float f13744g;

    /* renamed from: h */
    public float f13745h;

    /* renamed from: k */
    public int f13746k;

    /* renamed from: l */
    public int f13747l;

    /* renamed from: m */
    public int f13748m;

    /* renamed from: n */
    public int f13749n;

    /* renamed from: n */
    public String f13750n = null;

    public il2() {
        int i = fl2.f12135j;
        this.f13746k = i;
        this.f13747l = i;
        this.f13748m = 0;
        this.f13738a = Float.NaN;
        this.f13739b = Float.NaN;
        this.f13740c = Float.NaN;
        this.f13741d = Float.NaN;
        this.f13742e = Float.NaN;
        this.f13743f = Float.NaN;
        this.f13749n = 0;
        this.f13744g = Float.NaN;
        this.f13745h = Float.NaN;
        this.f12144i = 2;
    }

    /* renamed from: A */
    public float mo17833A() {
        return this.f13745h;
    }

    /* renamed from: B */
    public boolean mo17834B(int i, int i2, e81 e81, e81 e812, float f, float f2) {
        mo17841x(i, i2, e81.mo15085a(), e81.mo15086b(), e812.mo15085a(), e812.mo15086b());
        return Math.abs(f - this.f13744g) < 20.0f && Math.abs(f2 - this.f13745h) < 20.0f;
    }

    /* renamed from: C */
    public void mo17835C(ql2 ql2, e81 e81, e81 e812, float f, float f2, String[] strArr, float[] fArr) {
        int i = this.f13749n;
        if (i == 1) {
            mo17837E(e81, e812, f, f2, strArr, fArr);
        } else if (i != 2) {
            mo17836D(e81, e812, f, f2, strArr, fArr);
        } else {
            mo17838F(ql2, e81, e812, f, f2, strArr, fArr);
        }
    }

    /* renamed from: D */
    public void mo17836D(e81 e81, e81 e812, float f, float f2, String[] strArr, float[] fArr) {
        float a = e81.mo15085a();
        float b = e81.mo15086b();
        float a2 = e812.mo15085a() - a;
        float b2 = e812.mo15086b() - b;
        if (strArr[0] != null) {
            float f3 = (f - a) / a2;
            if ("percentX".equals(strArr[0])) {
                fArr[0] = f3;
                fArr[1] = (f2 - b) / b2;
                return;
            }
            fArr[1] = f3;
            fArr[0] = (f2 - b) / b2;
            return;
        }
        strArr[0] = "percentX";
        fArr[0] = (f - a) / a2;
        strArr[1] = "percentY";
        fArr[1] = (f2 - b) / b2;
    }

    /* renamed from: E */
    public void mo17837E(e81 e81, e81 e812, float f, float f2, String[] strArr, float[] fArr) {
        float a = e81.mo15085a();
        float b = e81.mo15086b();
        float a2 = e812.mo15085a() - a;
        float b2 = e812.mo15086b() - b;
        float hypot = (float) Math.hypot((double) a2, (double) b2);
        if (((double) hypot) < 1.0E-4d) {
            System.out.println("distance ~ 0");
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            return;
        }
        float f3 = a2 / hypot;
        float f4 = b2 / hypot;
        float f5 = f2 - b;
        float f6 = f - a;
        float f7 = ((f3 * f5) - (f6 * f4)) / hypot;
        float f8 = ((f3 * f6) + (f4 * f5)) / hypot;
        if (strArr[0] == null) {
            strArr[0] = "percentX";
            strArr[1] = "percentY";
            fArr[0] = f8;
            fArr[1] = f7;
        } else if ("percentX".equals(strArr[0])) {
            fArr[0] = f8;
            fArr[1] = f7;
        }
    }

    /* renamed from: F */
    public void mo17838F(ql2 ql2, e81 e81, e81 e812, float f, float f2, String[] strArr, float[] fArr) {
        e81.mo15085a();
        e81.mo15086b();
        e812.mo15085a();
        e812.mo15086b();
        ql2 n = ql2.mo23237n();
        int D = n.mo23204D();
        int k = n.mo23234k();
        if (strArr[0] != null) {
            float f3 = f / ((float) D);
            if ("percentX".equals(strArr[0])) {
                fArr[0] = f3;
                fArr[1] = f2 / ((float) k);
                return;
            }
            fArr[1] = f3;
            fArr[0] = f2 / ((float) k);
            return;
        }
        strArr[0] = "percentX";
        fArr[0] = f / ((float) D);
        strArr[1] = "percentY";
        fArr[1] = f2 / ((float) k);
    }

    /* renamed from: a */
    public boolean mo13120a(int i, int i2) {
        if (i == 100) {
            this.f12142g = i2;
            return true;
        } else if (i == 508) {
            this.f13746k = i2;
            return true;
        } else if (i != 510) {
            return super.mo13120a(i, i2);
        } else {
            this.f13749n = i2;
            return true;
        }
    }

    /* renamed from: b */
    public int mo13121b(String str) {
        return fk4.m14997a(str);
    }

    /* renamed from: c */
    public boolean mo13122c(int i, float f) {
        switch (i) {
            case ak4.C1714g.f9281c:
                this.f13738a = f;
                return true;
            case 504:
                break;
            case ak4.C1714g.f9285e:
                this.f13738a = f;
                break;
            case ak4.C1714g.f9287f:
                this.f13740c = f;
                return true;
            case ak4.C1714g.f9289g:
                this.f13741d = f;
                return true;
            default:
                return super.mo13122c(i, f);
        }
        this.f13739b = f;
        return true;
    }

    /* renamed from: e */
    public boolean mo13124e(int i, String str) {
        if (i != 501) {
            return super.mo13124e(i, str);
        }
        this.f13750n = str.toString();
        return true;
    }

    /* renamed from: f */
    public void mo16041f(HashMap<String, x14> hashMap) {
    }

    /* renamed from: g */
    public fl2 clone() {
        return new il2().mo16043h(this);
    }

    /* renamed from: h */
    public fl2 mo16043h(fl2 fl2) {
        super.mo16043h(fl2);
        il2 il2 = (il2) fl2;
        this.f13750n = il2.f13750n;
        this.f13747l = il2.f13747l;
        this.f13748m = il2.f13748m;
        this.f13738a = il2.f13738a;
        this.f13739b = Float.NaN;
        this.f13740c = il2.f13740c;
        this.f13741d = il2.f13741d;
        this.f13742e = il2.f13742e;
        this.f13743f = il2.f13743f;
        this.f13744g = il2.f13744g;
        this.f13745h = il2.f13745h;
        return this;
    }

    /* renamed from: i */
    public void mo16044i(HashSet<String> hashSet) {
    }

    /* renamed from: v */
    public final void mo17839v(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        float f7 = 0.0f;
        float f8 = Float.isNaN(this.f13740c) ? 0.0f : this.f13740c;
        float f9 = Float.isNaN(this.f13743f) ? 0.0f : this.f13743f;
        float f10 = Float.isNaN(this.f13741d) ? 0.0f : this.f13741d;
        if (!Float.isNaN(this.f13742e)) {
            f7 = this.f13742e;
        }
        this.f13744g = (float) ((int) (f + (f8 * f5) + (f7 * f6)));
        this.f13745h = (float) ((int) (f2 + (f5 * f9) + (f6 * f10)));
    }

    /* renamed from: w */
    public final void mo17840w(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        float f7 = this.f13740c;
        float f8 = this.f13741d;
        this.f13744g = f + (f5 * f7) + ((-f6) * f8);
        this.f13745h = f2 + (f6 * f7) + (f5 * f8);
    }

    /* renamed from: x */
    public void mo17841x(int i, int i2, float f, float f2, float f3, float f4) {
        int i3 = this.f13749n;
        if (i3 == 1) {
            mo17840w(f, f2, f3, f4);
        } else if (i3 != 2) {
            mo17839v(f, f2, f3, f4);
        } else {
            mo17842y(i, i2);
        }
    }

    /* renamed from: y */
    public final void mo17842y(int i, int i2) {
        float f = this.f13740c;
        float f2 = (float) 0;
        this.f13744g = (((float) (i - 0)) * f) + f2;
        this.f13745h = (((float) (i2 - 0)) * f) + f2;
    }

    /* renamed from: z */
    public float mo17843z() {
        return this.f13744g;
    }
}
