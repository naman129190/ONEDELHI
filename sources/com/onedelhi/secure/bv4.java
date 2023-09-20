package com.onedelhi.secure;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.C0419a;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class bv4 extends x14 {

    /* renamed from: c */
    public static final String f9982c = "ViewSpline";

    /* renamed from: com.onedelhi.secure.bv4$a */
    public static class C1806a extends bv4 {
        /* renamed from: m */
        public void mo13826m(View view, float f) {
            view.setAlpha(mo26748a(f));
        }
    }

    /* renamed from: com.onedelhi.secure.bv4$b */
    public static class C1807b extends bv4 {

        /* renamed from: a */
        public SparseArray<C0419a> f9983a;

        /* renamed from: b */
        public float[] f9984b;

        /* renamed from: d */
        public String f9985d;

        public C1807b(String str, SparseArray<C0419a> sparseArray) {
            this.f9985d = str.split(vf4.f36537c)[1];
            this.f9983a = sparseArray;
        }

        /* renamed from: g */
        public void mo13827g(int i, float f) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        /* renamed from: j */
        public void mo13828j(int i) {
            int size = this.f9983a.size();
            int p = this.f9983a.valueAt(0).mo3317p();
            double[] dArr = new double[size];
            this.f9984b = new float[p];
            int[] iArr = new int[2];
            iArr[1] = p;
            iArr[0] = size;
            double[][] dArr2 = (double[][]) Array.newInstance(double.class, iArr);
            for (int i2 = 0; i2 < size; i2++) {
                dArr[i2] = ((double) this.f9983a.keyAt(i2)) * 0.01d;
                this.f9983a.valueAt(i2).mo3313l(this.f9984b);
                int i3 = 0;
                while (true) {
                    float[] fArr = this.f9984b;
                    if (i3 >= fArr.length) {
                        break;
                    }
                    dArr2[i2][i3] = (double) fArr[i3];
                    i3++;
                }
            }
            this.f22378a = dc0.m13061a(i, dArr, dArr2);
        }

        /* renamed from: m */
        public void mo13826m(View view, float f) {
            this.f22378a.mo14612e((double) f, this.f9984b);
            mc0.m21474b(this.f9983a.valueAt(0), view, this.f9984b);
        }

        /* renamed from: n */
        public void mo13829n(int i, C0419a aVar) {
            this.f9983a.append(i, aVar);
        }
    }

    /* renamed from: com.onedelhi.secure.bv4$c */
    public static class C1808c extends bv4 {
        /* renamed from: m */
        public void mo13826m(View view, float f) {
            view.setElevation(mo26748a(f));
        }
    }

    /* renamed from: com.onedelhi.secure.bv4$d */
    public static class C1809d extends bv4 {
        /* renamed from: m */
        public void mo13826m(View view, float f) {
        }

        /* renamed from: n */
        public void mo13830n(View view, float f, double d, double d2) {
            view.setRotation(mo26748a(f) + ((float) Math.toDegrees(Math.atan2(d2, d))));
        }
    }

    /* renamed from: com.onedelhi.secure.bv4$e */
    public static class C1810e extends bv4 {
        /* renamed from: m */
        public void mo13826m(View view, float f) {
            view.setPivotX(mo26748a(f));
        }
    }

    /* renamed from: com.onedelhi.secure.bv4$f */
    public static class C1811f extends bv4 {
        /* renamed from: m */
        public void mo13826m(View view, float f) {
            view.setPivotY(mo26748a(f));
        }
    }

    /* renamed from: com.onedelhi.secure.bv4$g */
    public static class C1812g extends bv4 {

        /* renamed from: a */
        public boolean f9986a = false;

        /* renamed from: m */
        public void mo13826m(View view, float f) {
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(mo26748a(f));
            } else if (!this.f9986a) {
                Method method = null;
                try {
                    method = view.getClass().getMethod("setProgress", new Class[]{Float.TYPE});
                } catch (NoSuchMethodException unused) {
                    this.f9986a = true;
                }
                if (method != null) {
                    try {
                        method.invoke(view, new Object[]{Float.valueOf(mo26748a(f))});
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        Log.e(bv4.f9982c, "unable to setProgress", e);
                    }
                }
            }
        }
    }

    /* renamed from: com.onedelhi.secure.bv4$h */
    public static class C1813h extends bv4 {
        /* renamed from: m */
        public void mo13826m(View view, float f) {
            view.setRotation(mo26748a(f));
        }
    }

    /* renamed from: com.onedelhi.secure.bv4$i */
    public static class C1814i extends bv4 {
        /* renamed from: m */
        public void mo13826m(View view, float f) {
            view.setRotationX(mo26748a(f));
        }
    }

    /* renamed from: com.onedelhi.secure.bv4$j */
    public static class C1815j extends bv4 {
        /* renamed from: m */
        public void mo13826m(View view, float f) {
            view.setRotationY(mo26748a(f));
        }
    }

    /* renamed from: com.onedelhi.secure.bv4$k */
    public static class C1816k extends bv4 {
        /* renamed from: m */
        public void mo13826m(View view, float f) {
            view.setScaleX(mo26748a(f));
        }
    }

    /* renamed from: com.onedelhi.secure.bv4$l */
    public static class C1817l extends bv4 {
        /* renamed from: m */
        public void mo13826m(View view, float f) {
            view.setScaleY(mo26748a(f));
        }
    }

    /* renamed from: com.onedelhi.secure.bv4$m */
    public static class C1818m extends bv4 {
        /* renamed from: m */
        public void mo13826m(View view, float f) {
            view.setTranslationX(mo26748a(f));
        }
    }

    /* renamed from: com.onedelhi.secure.bv4$n */
    public static class C1819n extends bv4 {
        /* renamed from: m */
        public void mo13826m(View view, float f) {
            view.setTranslationY(mo26748a(f));
        }
    }

    /* renamed from: com.onedelhi.secure.bv4$o */
    public static class C1820o extends bv4 {
        /* renamed from: m */
        public void mo13826m(View view, float f) {
            view.setTranslationZ(mo26748a(f));
        }
    }

    /* renamed from: k */
    public static bv4 m12076k(String str, SparseArray<C0419a> sparseArray) {
        return new C1807b(str, sparseArray);
    }

    /* renamed from: l */
    public static bv4 m12077l(String str) {
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
            case -797520672:
                if (str.equals(ly1.f15678o)) {
                    c = 8;
                    break;
                }
                break;
            case -760884510:
                if (str.equals(ly1.f15670g)) {
                    c = 9;
                    break;
                }
                break;
            case -760884509:
                if (str.equals(ly1.f15671h)) {
                    c = 10;
                    break;
                }
                break;
            case -40300674:
                if (str.equals(ly1.f15667d)) {
                    c = 11;
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c = 12;
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c = 13;
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c = 14;
                    break;
                }
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    c = 15;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return new C1814i();
            case 1:
                return new C1815j();
            case 2:
                return new C1818m();
            case 3:
                return new C1819n();
            case 4:
                return new C1820o();
            case 5:
                return new C1812g();
            case 6:
                return new C1816k();
            case 7:
                return new C1817l();
            case 8:
                return new C1806a();
            case 9:
                return new C1810e();
            case 10:
                return new C1811f();
            case 11:
                return new C1813h();
            case 12:
                return new C1808c();
            case 13:
                return new C1809d();
            case 14:
                return new C1806a();
            case 15:
                return new C1806a();
            default:
                return null;
        }
    }

    /* renamed from: m */
    public abstract void mo13826m(View view, float f);
}
