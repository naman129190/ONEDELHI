package com.onedelhi.secure;

import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.C0419a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class ku4 extends py1 {

    /* renamed from: d */
    public static final String f15078d = "ViewOscillator";

    /* renamed from: com.onedelhi.secure.ku4$a */
    public static class C2661a extends ku4 {
        /* renamed from: m */
        public void mo19201m(View view, float f) {
            view.setAlpha(mo22763a(f));
        }
    }

    /* renamed from: com.onedelhi.secure.ku4$b */
    public static class C2662b extends ku4 {

        /* renamed from: a */
        public C0419a f15079a;

        /* renamed from: a */
        public float[] f15080a = new float[1];

        /* renamed from: e */
        public void mo19202e(Object obj) {
            this.f15079a = (C0419a) obj;
        }

        /* renamed from: m */
        public void mo19201m(View view, float f) {
            this.f15080a[0] = mo22763a(f);
            mc0.m21474b(this.f15079a, view, this.f15080a);
        }
    }

    /* renamed from: com.onedelhi.secure.ku4$c */
    public static class C2663c extends ku4 {
        /* renamed from: m */
        public void mo19201m(View view, float f) {
            view.setElevation(mo22763a(f));
        }
    }

    /* renamed from: com.onedelhi.secure.ku4$d */
    public static class C2664d extends ku4 {
        /* renamed from: m */
        public void mo19201m(View view, float f) {
        }

        /* renamed from: n */
        public void mo19203n(View view, float f, double d, double d2) {
            view.setRotation(mo22763a(f) + ((float) Math.toDegrees(Math.atan2(d2, d))));
        }
    }

    /* renamed from: com.onedelhi.secure.ku4$e */
    public static class C2665e extends ku4 {

        /* renamed from: a */
        public boolean f15081a = false;

        /* renamed from: m */
        public void mo19201m(View view, float f) {
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(mo22763a(f));
            } else if (!this.f15081a) {
                Method method = null;
                try {
                    method = view.getClass().getMethod("setProgress", new Class[]{Float.TYPE});
                } catch (NoSuchMethodException unused) {
                    this.f15081a = true;
                }
                if (method != null) {
                    try {
                        method.invoke(view, new Object[]{Float.valueOf(mo22763a(f))});
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        Log.e(ku4.f15078d, "unable to setProgress", e);
                    }
                }
            }
        }
    }

    /* renamed from: com.onedelhi.secure.ku4$f */
    public static class C2666f extends ku4 {
        /* renamed from: m */
        public void mo19201m(View view, float f) {
            view.setRotation(mo22763a(f));
        }
    }

    /* renamed from: com.onedelhi.secure.ku4$g */
    public static class C2667g extends ku4 {
        /* renamed from: m */
        public void mo19201m(View view, float f) {
            view.setRotationX(mo22763a(f));
        }
    }

    /* renamed from: com.onedelhi.secure.ku4$h */
    public static class C2668h extends ku4 {
        /* renamed from: m */
        public void mo19201m(View view, float f) {
            view.setRotationY(mo22763a(f));
        }
    }

    /* renamed from: com.onedelhi.secure.ku4$i */
    public static class C2669i extends ku4 {
        /* renamed from: m */
        public void mo19201m(View view, float f) {
            view.setScaleX(mo22763a(f));
        }
    }

    /* renamed from: com.onedelhi.secure.ku4$j */
    public static class C2670j extends ku4 {
        /* renamed from: m */
        public void mo19201m(View view, float f) {
            view.setScaleY(mo22763a(f));
        }
    }

    /* renamed from: com.onedelhi.secure.ku4$k */
    public static class C2671k extends ku4 {
        /* renamed from: m */
        public void mo19201m(View view, float f) {
            view.setTranslationX(mo22763a(f));
        }
    }

    /* renamed from: com.onedelhi.secure.ku4$l */
    public static class C2672l extends ku4 {
        /* renamed from: m */
        public void mo19201m(View view, float f) {
            view.setTranslationY(mo22763a(f));
        }
    }

    /* renamed from: com.onedelhi.secure.ku4$m */
    public static class C2673m extends ku4 {
        /* renamed from: m */
        public void mo19201m(View view, float f) {
            view.setTranslationZ(mo22763a(f));
        }
    }

    /* renamed from: l */
    public static ku4 m20029l(String str) {
        if (str.startsWith("CUSTOM")) {
            return new C2662b();
        }
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
            case -40300674:
                if (str.equals(ly1.f15667d)) {
                    c = 9;
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c = 10;
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c = 11;
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c = 12;
                    break;
                }
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    c = 13;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return new C2667g();
            case 1:
                return new C2668h();
            case 2:
                return new C2671k();
            case 3:
                return new C2672l();
            case 4:
                return new C2673m();
            case 5:
                return new C2665e();
            case 6:
                return new C2669i();
            case 7:
                return new C2670j();
            case 8:
                return new C2661a();
            case 9:
                return new C2666f();
            case 10:
                return new C2663c();
            case 11:
                return new C2664d();
            case 12:
                return new C2661a();
            case 13:
                return new C2661a();
            default:
                return null;
        }
    }

    /* renamed from: m */
    public abstract void mo19201m(View view, float f);
}
