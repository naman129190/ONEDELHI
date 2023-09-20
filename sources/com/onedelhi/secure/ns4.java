package com.onedelhi.secure;

public class ns4 {

    /* renamed from: a */
    public static String f17555a = "VelocityMatrix";

    /* renamed from: a */
    public float f17556a;

    /* renamed from: b */
    public float f17557b;

    /* renamed from: c */
    public float f17558c;

    /* renamed from: d */
    public float f17559d;

    /* renamed from: e */
    public float f17560e;

    /* renamed from: f */
    public float f17561f;

    /* renamed from: a */
    public void mo21453a(float f, float f2, int i, int i2, float[] fArr) {
        int i3 = i;
        float f3 = fArr[0];
        float f4 = fArr[1];
        float f5 = (f - 0.5f) * 2.0f;
        float f6 = (f2 - 0.5f) * 2.0f;
        float f7 = f3 + this.f17558c;
        float f8 = f4 + this.f17559d;
        float f9 = f7 + (this.f17556a * f5);
        float f10 = f8 + (this.f17557b * f6);
        float radians = (float) Math.toRadians((double) this.f17560e);
        double radians2 = (double) ((float) Math.toRadians((double) this.f17561f));
        double d = (double) (((float) i2) * f6);
        fArr[0] = f9 + (((float) ((((double) (((float) (-i3)) * f5)) * Math.sin(radians2)) - (Math.cos(radians2) * d))) * radians);
        fArr[1] = f10 + (radians * ((float) ((((double) (((float) i3) * f5)) * Math.cos(radians2)) - (d * Math.sin(radians2)))));
    }

    /* renamed from: b */
    public void mo21454b() {
        this.f17560e = 0.0f;
        this.f17559d = 0.0f;
        this.f17558c = 0.0f;
        this.f17557b = 0.0f;
        this.f17556a = 0.0f;
    }

    /* renamed from: c */
    public void mo21455c(py1 py1, float f) {
        if (py1 != null) {
            this.f17560e = py1.mo22765c(f);
        }
    }

    /* renamed from: d */
    public void mo21456d(x14 x14, float f) {
        if (x14 != null) {
            this.f17560e = x14.mo26750c(f);
            this.f17561f = x14.mo26748a(f);
        }
    }

    /* renamed from: e */
    public void mo21457e(py1 py1, py1 py12, float f) {
        if (py1 != null) {
            this.f17556a = py1.mo22765c(f);
        }
        if (py12 != null) {
            this.f17557b = py12.mo22765c(f);
        }
    }

    /* renamed from: f */
    public void mo21458f(x14 x14, x14 x142, float f) {
        if (x14 != null) {
            this.f17556a = x14.mo26750c(f);
        }
        if (x142 != null) {
            this.f17557b = x142.mo26750c(f);
        }
    }

    /* renamed from: g */
    public void mo21459g(py1 py1, py1 py12, float f) {
        if (py1 != null) {
            this.f17558c = py1.mo22765c(f);
        }
        if (py12 != null) {
            this.f17559d = py12.mo22765c(f);
        }
    }

    /* renamed from: h */
    public void mo21460h(x14 x14, x14 x142, float f) {
        if (x14 != null) {
            this.f17558c = x14.mo26750c(f);
        }
        if (x142 != null) {
            this.f17559d = x142.mo26750c(f);
        }
    }
}
