package com.onedelhi.secure;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.C0419a;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class hv4 extends pd4 {

    /* renamed from: c */
    public static final String f13312c = "ViewTimeCycle";

    /* renamed from: com.onedelhi.secure.hv4$a */
    public static class C2367a extends hv4 {
        /* renamed from: j */
        public boolean mo17457j(View view, float f, long j, ny1 ny1) {
            view.setAlpha(mo17456g(f, j, view, ny1));
            return this.f18451a;
        }
    }

    /* renamed from: com.onedelhi.secure.hv4$b */
    public static class C2368b extends hv4 {

        /* renamed from: a */
        public SparseArray<C0419a> f13313a;

        /* renamed from: b */
        public SparseArray<float[]> f13314b = new SparseArray<>();

        /* renamed from: b */
        public float[] f13315b;

        /* renamed from: c */
        public float[] f13316c;

        /* renamed from: d */
        public String f13317d;

        public C2368b(String str, SparseArray<C0419a> sparseArray) {
            this.f13317d = str.split(vf4.f36537c)[1];
            this.f13313a = sparseArray;
        }

        /* renamed from: c */
        public void mo17458c(int i, float f, float f2, int i2, float f3) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        /* renamed from: f */
        public void mo17459f(int i) {
            int size = this.f13313a.size();
            int p = this.f13313a.valueAt(0).mo3317p();
            double[] dArr = new double[size];
            int i2 = p + 2;
            this.f13315b = new float[i2];
            this.f13316c = new float[p];
            int[] iArr = new int[2];
            iArr[1] = i2;
            iArr[0] = size;
            double[][] dArr2 = (double[][]) Array.newInstance(double.class, iArr);
            for (int i3 = 0; i3 < size; i3++) {
                int keyAt = this.f13313a.keyAt(i3);
                float[] valueAt = this.f13314b.valueAt(i3);
                dArr[i3] = ((double) keyAt) * 0.01d;
                this.f13313a.valueAt(i3).mo3313l(this.f13315b);
                int i4 = 0;
                while (true) {
                    float[] fArr = this.f13315b;
                    if (i4 >= fArr.length) {
                        break;
                    }
                    dArr2[i3][i4] = (double) fArr[i4];
                    i4++;
                }
                dArr2[i3][p] = (double) valueAt[0];
                dArr2[i3][p + 1] = (double) valueAt[1];
            }
            this.f18449a = dc0.m13061a(i, dArr, dArr2);
        }

        /* renamed from: j */
        public boolean mo17457j(View view, float f, long j, ny1 ny1) {
            View view2 = view;
            long j2 = j;
            this.f18449a.mo14612e((double) f, this.f13315b);
            float[] fArr = this.f13315b;
            float f2 = fArr[fArr.length - 2];
            float f3 = fArr[fArr.length - 1];
            long j3 = j2 - this.f18448a;
            if (Float.isNaN(this.f18446a)) {
                float a = ny1.mo21502a(view2, this.f13317d, 0);
                this.f18446a = a;
                if (Float.isNaN(a)) {
                    this.f18446a = 0.0f;
                }
            }
            float f4 = (float) ((((double) this.f18446a) + ((((double) j3) * 1.0E-9d) * ((double) f2))) % 1.0d);
            this.f18446a = f4;
            this.f18448a = j2;
            float a2 = mo22392a(f4);
            this.f18451a = false;
            int i = 0;
            while (true) {
                float[] fArr2 = this.f13316c;
                if (i >= fArr2.length) {
                    break;
                }
                boolean z = this.f18451a;
                float[] fArr3 = this.f13315b;
                this.f18451a = z | (((double) fArr3[i]) != 0.0d);
                fArr2[i] = (fArr3[i] * a2) + f3;
                i++;
            }
            mc0.m21474b(this.f13313a.valueAt(0), view2, this.f13316c);
            if (f2 != 0.0f) {
                this.f18451a = true;
            }
            return this.f18451a;
        }

        /* renamed from: k */
        public void mo17460k(int i, C0419a aVar, float f, int i2, float f2) {
            this.f13313a.append(i, aVar);
            this.f13314b.append(i, new float[]{f, f2});
            this.f18447a = Math.max(this.f18447a, i2);
        }
    }

    /* renamed from: com.onedelhi.secure.hv4$c */
    public static class C2369c extends hv4 {
        /* renamed from: j */
        public boolean mo17457j(View view, float f, long j, ny1 ny1) {
            view.setElevation(mo17456g(f, j, view, ny1));
            return this.f18451a;
        }
    }

    /* renamed from: com.onedelhi.secure.hv4$d */
    public static class C2370d extends hv4 {
        /* renamed from: j */
        public boolean mo17457j(View view, float f, long j, ny1 ny1) {
            return this.f18451a;
        }

        /* renamed from: k */
        public boolean mo17461k(View view, ny1 ny1, float f, long j, double d, double d2) {
            view.setRotation(mo17456g(f, j, view, ny1) + ((float) Math.toDegrees(Math.atan2(d2, d))));
            return this.f18451a;
        }
    }

    /* renamed from: com.onedelhi.secure.hv4$e */
    public static class C2371e extends hv4 {

        /* renamed from: b */
        public boolean f13318b = false;

        /* renamed from: j */
        public boolean mo17457j(View view, float f, long j, ny1 ny1) {
            View view2 = view;
            if (view2 instanceof MotionLayout) {
                ((MotionLayout) view2).setProgress(mo17456g(f, j, view, ny1));
            } else if (this.f13318b) {
                return false;
            } else {
                Method method = null;
                try {
                    method = view.getClass().getMethod("setProgress", new Class[]{Float.TYPE});
                } catch (NoSuchMethodException unused) {
                    this.f13318b = true;
                }
                Method method2 = method;
                if (method2 != null) {
                    try {
                        method2.invoke(view, new Object[]{Float.valueOf(mo17456g(f, j, view, ny1))});
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        Log.e(hv4.f13312c, "unable to setProgress", e);
                    }
                }
            }
            return this.f18451a;
        }
    }

    /* renamed from: com.onedelhi.secure.hv4$f */
    public static class C2372f extends hv4 {
        /* renamed from: j */
        public boolean mo17457j(View view, float f, long j, ny1 ny1) {
            view.setRotation(mo17456g(f, j, view, ny1));
            return this.f18451a;
        }
    }

    /* renamed from: com.onedelhi.secure.hv4$g */
    public static class C2373g extends hv4 {
        /* renamed from: j */
        public boolean mo17457j(View view, float f, long j, ny1 ny1) {
            view.setRotationX(mo17456g(f, j, view, ny1));
            return this.f18451a;
        }
    }

    /* renamed from: com.onedelhi.secure.hv4$h */
    public static class C2374h extends hv4 {
        /* renamed from: j */
        public boolean mo17457j(View view, float f, long j, ny1 ny1) {
            view.setRotationY(mo17456g(f, j, view, ny1));
            return this.f18451a;
        }
    }

    /* renamed from: com.onedelhi.secure.hv4$i */
    public static class C2375i extends hv4 {
        /* renamed from: j */
        public boolean mo17457j(View view, float f, long j, ny1 ny1) {
            view.setScaleX(mo17456g(f, j, view, ny1));
            return this.f18451a;
        }
    }

    /* renamed from: com.onedelhi.secure.hv4$j */
    public static class C2376j extends hv4 {
        /* renamed from: j */
        public boolean mo17457j(View view, float f, long j, ny1 ny1) {
            view.setScaleY(mo17456g(f, j, view, ny1));
            return this.f18451a;
        }
    }

    /* renamed from: com.onedelhi.secure.hv4$k */
    public static class C2377k extends hv4 {
        /* renamed from: j */
        public boolean mo17457j(View view, float f, long j, ny1 ny1) {
            view.setTranslationX(mo17456g(f, j, view, ny1));
            return this.f18451a;
        }
    }

    /* renamed from: com.onedelhi.secure.hv4$l */
    public static class C2378l extends hv4 {
        /* renamed from: j */
        public boolean mo17457j(View view, float f, long j, ny1 ny1) {
            view.setTranslationY(mo17456g(f, j, view, ny1));
            return this.f18451a;
        }
    }

    /* renamed from: com.onedelhi.secure.hv4$m */
    public static class C2379m extends hv4 {
        /* renamed from: j */
        public boolean mo17457j(View view, float f, long j, ny1 ny1) {
            view.setTranslationZ(mo17456g(f, j, view, ny1));
            return this.f18451a;
        }
    }

    /* renamed from: h */
    public static hv4 m16988h(String str, SparseArray<C0419a> sparseArray) {
        return new C2368b(str, sparseArray);
    }

    /* renamed from: i */
    public static hv4 m16989i(String str, long j) {
        hv4 hv4;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1249320806:
                if (str.equals("rotationX")) {
                    c = 0;
                    break;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c = 1;
                    break;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c = 2;
                    break;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c = 3;
                    break;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c = 4;
                    break;
                }
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    c = 5;
                    break;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c = 6;
                    break;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c = 7;
                    break;
                }
                break;
            case -40300674:
                if (str.equals(ly1.f15667d)) {
                    c = 8;
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c = 9;
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c = 10;
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c = 11;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                hv4 = new C2373g();
                break;
            case 1:
                hv4 = new C2374h();
                break;
            case 2:
                hv4 = new C2377k();
                break;
            case 3:
                hv4 = new C2378l();
                break;
            case 4:
                hv4 = new C2379m();
                break;
            case 5:
                hv4 = new C2371e();
                break;
            case 6:
                hv4 = new C2375i();
                break;
            case 7:
                hv4 = new C2376j();
                break;
            case 8:
                hv4 = new C2372f();
                break;
            case 9:
                hv4 = new C2369c();
                break;
            case 10:
                hv4 = new C2370d();
                break;
            case 11:
                hv4 = new C2367a();
                break;
            default:
                return null;
        }
        hv4.mo22394d(j);
        return hv4;
    }

    /* renamed from: g */
    public float mo17456g(float f, long j, View view, ny1 ny1) {
        long j2 = j;
        View view2 = view;
        ny1 ny12 = ny1;
        this.f18449a.mo14612e((double) f, this.f18452a);
        float[] fArr = this.f18452a;
        float f2 = fArr[1];
        int i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
        if (i == 0) {
            this.f18451a = false;
            return fArr[2];
        }
        if (Float.isNaN(this.f18446a)) {
            float a = ny12.mo21502a(view2, this.f18450a, 0);
            this.f18446a = a;
            if (Float.isNaN(a)) {
                this.f18446a = 0.0f;
            }
        }
        float f3 = (float) ((((double) this.f18446a) + ((((double) (j2 - this.f18448a)) * 1.0E-9d) * ((double) f2))) % 1.0d);
        this.f18446a = f3;
        ny12.mo21503b(view2, this.f18450a, 0, f3);
        this.f18448a = j2;
        float f4 = this.f18452a[0];
        float a2 = (mo22392a(this.f18446a) * f4) + this.f18452a[2];
        this.f18451a = (f4 == 0.0f && i == 0) ? false : true;
        return a2;
    }

    /* renamed from: j */
    public abstract boolean mo17457j(View view, float f, long j, ny1 ny1);
}
