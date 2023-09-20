package androidx.constraintlayout.motion.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.TextView;
import androidx.constraintlayout.motion.widget.C0393b;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.C0422b;
import androidx.constraintlayout.widget.C0426d;
import androidx.constraintlayout.widget.C0435e;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import com.onedelhi.secure.C2063ej;
import com.onedelhi.secure.ar4;
import com.onedelhi.secure.cl2;
import com.onedelhi.secure.cv4;
import com.onedelhi.secure.db0;
import com.onedelhi.secure.dk0;
import com.onedelhi.secure.dw4;
import com.onedelhi.secure.el2;
import com.onedelhi.secure.eo2;
import com.onedelhi.secure.g74;
import com.onedelhi.secure.i23;
import com.onedelhi.secure.jl1;
import com.onedelhi.secure.l81;
import com.onedelhi.secure.m60;
import com.onedelhi.secure.ml1;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.mx0;
import com.onedelhi.secure.nj1;
import com.onedelhi.secure.ny1;
import com.onedelhi.secure.o60;
import com.onedelhi.secure.p60;
import com.onedelhi.secure.pl2;
import com.onedelhi.secure.sj3;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.ve0;
import com.onedelhi.secure.y34;
import com.onedelhi.secure.yg1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class MotionLayout extends ConstraintLayout implements eo2 {

    /* renamed from: Z */
    public static final int f1950Z = 0;

    /* renamed from: a0 */
    public static final int f1951a0 = 1;

    /* renamed from: b0 */
    public static final int f1952b0 = 2;

    /* renamed from: c0 */
    public static final int f1953c0 = 3;

    /* renamed from: d */
    public static final String f1954d = "MotionLayout";

    /* renamed from: d0 */
    public static final int f1955d0 = 4;

    /* renamed from: e0 */
    public static final int f1956e0 = 5;

    /* renamed from: f0 */
    public static final int f1957f0 = 6;

    /* renamed from: g0 */
    public static final int f1958g0 = 7;

    /* renamed from: h0 */
    public static final int f1959h0 = 0;

    /* renamed from: i0 */
    public static final int f1960i0 = 1;

    /* renamed from: j0 */
    public static final int f1961j0 = 2;

    /* renamed from: k0 */
    public static final int f1962k0 = 50;

    /* renamed from: l0 */
    public static final int f1963l0 = 0;

    /* renamed from: m0 */
    public static final int f1964m0 = 1;

    /* renamed from: n */
    public static final float f1965n = 1.0E-5f;

    /* renamed from: n0 */
    public static final int f1966n0 = 2;

    /* renamed from: o0 */
    public static final int f1967o0 = 3;

    /* renamed from: v */
    public static final boolean f1968v = false;

    /* renamed from: w */
    public static boolean f1969w;

    /* renamed from: C */
    public int f1970C = -1;

    /* renamed from: D */
    public int f1971D = -1;

    /* renamed from: E */
    public int f1972E = -1;

    /* renamed from: F */
    public int f1973F = 0;

    /* renamed from: G */
    public int f1974G = 0;

    /* renamed from: H */
    public int f1975H = 0;

    /* renamed from: I */
    public int f1976I;

    /* renamed from: J */
    public int f1977J;

    /* renamed from: K */
    public int f1978K;

    /* renamed from: L */
    public int f1979L;

    /* renamed from: M */
    public int f1980M = 0;

    /* renamed from: N */
    public int f1981N = 0;

    /* renamed from: O */
    public int f1982O;

    /* renamed from: P */
    public int f1983P;

    /* renamed from: Q */
    public int f1984Q;

    /* renamed from: R */
    public int f1985R;

    /* renamed from: S */
    public int f1986S;

    /* renamed from: T */
    public int f1987T;

    /* renamed from: U */
    public int f1988U = 0;

    /* renamed from: V */
    public int f1989V = 0;

    /* renamed from: W */
    public int f1990W;

    /* renamed from: X */
    public int f1991X;

    /* renamed from: Y */
    public int f1992Y;

    /* renamed from: a */
    public float f1993a = 0.0f;

    /* renamed from: a */
    public Matrix f1994a = null;

    /* renamed from: a */
    public Rect f1995a = new Rect();

    /* renamed from: a */
    public RectF f1996a = new RectF();

    /* renamed from: a */
    public View f1997a = null;

    /* renamed from: a */
    public Interpolator f1998a;

    /* renamed from: a */
    public C0384f f1999a = new C0384f();

    /* renamed from: a */
    public C0385g f2000a;

    /* renamed from: a */
    public C0386h f2001a = new C0386h();

    /* renamed from: a */
    public C0389k f2002a;

    /* renamed from: a */
    public C0390l f2003a;

    /* renamed from: a */
    public C0391m f2004a = C0391m.UNDEFINED;

    /* renamed from: a */
    public C0393b f2005a;

    /* renamed from: a */
    public dk0 f2006a;

    /* renamed from: a */
    public ny1 f2007a = new ny1();

    /* renamed from: a */
    public y34 f2008a = new y34();

    /* renamed from: a */
    public Runnable f2009a = null;

    /* renamed from: a */
    public CopyOnWriteArrayList<C0390l> f2010a = null;

    /* renamed from: a */
    public int[] f2011a = null;

    /* renamed from: b */
    public float f2012b = 1.0f;

    /* renamed from: b */
    public long f2013b = 0;

    /* renamed from: b */
    public Interpolator f2014b = null;

    /* renamed from: b */
    public ArrayList<MotionHelper> f2015b = null;

    /* renamed from: b */
    public HashMap<View, cl2> f2016b = new HashMap<>();

    /* renamed from: c */
    public float f2017c = 0.0f;

    /* renamed from: c */
    public long f2018c;

    /* renamed from: c */
    public ArrayList<MotionHelper> f2019c = null;

    /* renamed from: c */
    public HashMap<View, cv4> f2020c = new HashMap<>();

    /* renamed from: d */
    public float f2021d = 0.0f;

    /* renamed from: d */
    public long f2022d;

    /* renamed from: d */
    public ArrayList<MotionHelper> f2023d = null;

    /* renamed from: e */
    public float f2024e = 0.0f;

    /* renamed from: e */
    public long f2025e = -1;

    /* renamed from: e */
    public ArrayList<Integer> f2026e = new ArrayList<>();

    /* renamed from: f */
    public float f2027f;

    /* renamed from: g */
    public float f2028g;

    /* renamed from: h */
    public float f2029h;

    /* renamed from: h */
    public boolean f2030h = true;

    /* renamed from: i */
    public float f2031i;

    /* renamed from: i */
    public boolean f2032i;

    /* renamed from: j */
    public float f2033j;

    /* renamed from: j */
    public boolean f2034j = false;

    /* renamed from: k */
    public float f2035k = 0.0f;

    /* renamed from: k */
    public boolean f2036k = false;

    /* renamed from: l */
    public float f2037l = 0.0f;

    /* renamed from: l */
    public boolean f2038l = false;

    /* renamed from: m */
    public float f2039m;

    /* renamed from: m */
    public boolean f2040m = true;

    /* renamed from: n */
    public boolean f2041n = false;

    /* renamed from: o */
    public boolean f2042o = false;

    /* renamed from: p */
    public boolean f2043p = false;

    /* renamed from: q */
    public boolean f2044q = false;

    /* renamed from: r */
    public boolean f2045r = false;

    /* renamed from: s */
    public boolean f2046s = false;

    /* renamed from: t */
    public boolean f2047t = false;

    /* renamed from: u */
    public boolean f2048u = false;

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$a */
    public class C0379a implements Runnable {
        public C0379a() {
        }

        public void run() {
            MotionLayout.this.f2002a.mo2876a();
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$b */
    public class C0380b implements Runnable {
        public C0380b() {
        }

        public void run() {
            boolean unused = MotionLayout.this.f2046s = false;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$c */
    public class C0381c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ View f2051a;

        public C0381c(MotionLayout motionLayout, View view) {
            this.f2051a = view;
        }

        public void run() {
            this.f2051a.setNestedScrollingEnabled(true);
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$d */
    public class C0382d implements Runnable {
        public C0382d() {
        }

        public void run() {
            MotionLayout.this.f2002a.mo2876a();
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$e */
    public static /* synthetic */ class C0383e {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2053a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.constraintlayout.motion.widget.MotionLayout$m[] r0 = androidx.constraintlayout.motion.widget.MotionLayout.C0391m.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2053a = r0
                androidx.constraintlayout.motion.widget.MotionLayout$m r1 = androidx.constraintlayout.motion.widget.MotionLayout.C0391m.UNDEFINED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f2053a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.motion.widget.MotionLayout$m r1 = androidx.constraintlayout.motion.widget.MotionLayout.C0391m.SETUP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f2053a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.motion.widget.MotionLayout$m r1 = androidx.constraintlayout.motion.widget.MotionLayout.C0391m.MOVING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f2053a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.motion.widget.MotionLayout$m r1 = androidx.constraintlayout.motion.widget.MotionLayout.C0391m.FINISHED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.C0383e.<clinit>():void");
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$f */
    public class C0384f extends el2 {

        /* renamed from: a */
        public float f2054a = 0.0f;

        /* renamed from: b */
        public float f2056b = 0.0f;

        /* renamed from: c */
        public float f2057c;

        public C0384f() {
        }

        /* renamed from: a */
        public float mo2838a() {
            return MotionLayout.this.f1993a;
        }

        /* renamed from: b */
        public void mo2839b(float f, float f2, float f3) {
            this.f2054a = f;
            this.f2056b = f2;
            this.f2057c = f3;
        }

        public float getInterpolation(float f) {
            float f2;
            float f3 = this.f2054a;
            if (f3 > 0.0f) {
                float f4 = this.f2057c;
                if (f3 / f4 < f) {
                    f = f3 / f4;
                }
                MotionLayout.this.f1993a = f3 - (f4 * f);
                f2 = (f3 * f) - (((f4 * f) * f) / 2.0f);
            } else {
                float f5 = this.f2057c;
                if ((-f3) / f5 < f) {
                    f = (-f3) / f5;
                }
                MotionLayout.this.f1993a = (f5 * f) + f3;
                f2 = (f3 * f) + (((f5 * f) * f) / 2.0f);
            }
            return f2 + this.f2056b;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$g */
    public class C0385g {

        /* renamed from: h */
        public static final int f2058h = 16;

        /* renamed from: a */
        public final int f2059a = -21965;

        /* renamed from: a */
        public DashPathEffect f2060a;

        /* renamed from: a */
        public Paint f2061a;

        /* renamed from: a */
        public Path f2062a;

        /* renamed from: a */
        public Rect f2063a = new Rect();

        /* renamed from: a */
        public boolean f2065a = false;

        /* renamed from: a */
        public float[] f2066a;

        /* renamed from: a */
        public int[] f2067a;

        /* renamed from: b */
        public final int f2068b = -2067046;

        /* renamed from: b */
        public Paint f2069b;

        /* renamed from: b */
        public float[] f2070b;

        /* renamed from: c */
        public final int f2071c = -13391360;

        /* renamed from: c */
        public Paint f2072c;

        /* renamed from: c */
        public float[] f2073c;

        /* renamed from: d */
        public final int f2074d = 1996488704;

        /* renamed from: d */
        public Paint f2075d;

        /* renamed from: e */
        public final int f2076e = 10;

        /* renamed from: e */
        public Paint f2077e;

        /* renamed from: f */
        public int f2078f;

        /* renamed from: g */
        public int f2079g = 1;

        public C0385g() {
            Paint paint = new Paint();
            this.f2061a = paint;
            paint.setAntiAlias(true);
            this.f2061a.setColor(-21965);
            this.f2061a.setStrokeWidth(2.0f);
            this.f2061a.setStyle(Paint.Style.STROKE);
            Paint paint2 = new Paint();
            this.f2069b = paint2;
            paint2.setAntiAlias(true);
            this.f2069b.setColor(-2067046);
            this.f2069b.setStrokeWidth(2.0f);
            this.f2069b.setStyle(Paint.Style.STROKE);
            Paint paint3 = new Paint();
            this.f2072c = paint3;
            paint3.setAntiAlias(true);
            this.f2072c.setColor(-13391360);
            this.f2072c.setStrokeWidth(2.0f);
            this.f2072c.setStyle(Paint.Style.STROKE);
            Paint paint4 = new Paint();
            this.f2075d = paint4;
            paint4.setAntiAlias(true);
            this.f2075d.setColor(-13391360);
            this.f2075d.setTextSize(MotionLayout.this.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.f2073c = new float[8];
            Paint paint5 = new Paint();
            this.f2077e = paint5;
            paint5.setAntiAlias(true);
            DashPathEffect dashPathEffect = new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f);
            this.f2060a = dashPathEffect;
            this.f2072c.setPathEffect(dashPathEffect);
            this.f2070b = new float[100];
            this.f2067a = new int[50];
            if (this.f2065a) {
                this.f2061a.setStrokeWidth(8.0f);
                this.f2077e.setStrokeWidth(8.0f);
                this.f2069b.setStrokeWidth(8.0f);
                this.f2079g = 4;
            }
        }

        /* renamed from: a */
        public void mo2841a(Canvas canvas, HashMap<View, cl2> hashMap, int i, int i2) {
            if (hashMap != null && hashMap.size() != 0) {
                canvas.save();
                if (!MotionLayout.this.isInEditMode() && (i2 & 1) == 2) {
                    String str = MotionLayout.this.getContext().getResources().getResourceName(MotionLayout.this.f1972E) + ar4.f25981a + MotionLayout.this.getProgress();
                    canvas.drawText(str, 10.0f, (float) (MotionLayout.this.getHeight() - 30), this.f2075d);
                    canvas.drawText(str, 11.0f, (float) (MotionLayout.this.getHeight() - 29), this.f2061a);
                }
                for (cl2 next : hashMap.values()) {
                    int q = next.mo14241q();
                    if (i2 > 0 && q == 0) {
                        q = 1;
                    }
                    if (q != 0) {
                        this.f2078f = next.mo14229e(this.f2070b, this.f2067a);
                        if (q >= 1) {
                            int i3 = i / 16;
                            float[] fArr = this.f2066a;
                            if (fArr == null || fArr.length != i3 * 2) {
                                this.f2066a = new float[(i3 * 2)];
                                this.f2062a = new Path();
                            }
                            int i4 = this.f2079g;
                            canvas.translate((float) i4, (float) i4);
                            this.f2061a.setColor(1996488704);
                            this.f2077e.setColor(1996488704);
                            this.f2069b.setColor(1996488704);
                            this.f2072c.setColor(1996488704);
                            next.mo14230f(this.f2066a, i3);
                            mo2842b(canvas, q, this.f2078f, next);
                            this.f2061a.setColor(-21965);
                            this.f2069b.setColor(-2067046);
                            this.f2077e.setColor(-2067046);
                            this.f2072c.setColor(-13391360);
                            int i5 = this.f2079g;
                            canvas.translate((float) (-i5), (float) (-i5));
                            mo2842b(canvas, q, this.f2078f, next);
                            if (q == 5) {
                                mo2850j(canvas, next);
                            }
                        }
                    }
                }
                canvas.restore();
            }
        }

        /* renamed from: b */
        public void mo2842b(Canvas canvas, int i, int i2, cl2 cl2) {
            if (i == 4) {
                mo2844d(canvas);
            }
            if (i == 2) {
                mo2847g(canvas);
            }
            if (i == 3) {
                mo2845e(canvas);
            }
            mo2843c(canvas);
            mo2851k(canvas, i, i2, cl2);
        }

        /* renamed from: c */
        public final void mo2843c(Canvas canvas) {
            canvas.drawLines(this.f2066a, this.f2061a);
        }

        /* renamed from: d */
        public final void mo2844d(Canvas canvas) {
            boolean z = false;
            boolean z2 = false;
            for (int i = 0; i < this.f2078f; i++) {
                int[] iArr = this.f2067a;
                if (iArr[i] == 1) {
                    z = true;
                }
                if (iArr[i] == 0) {
                    z2 = true;
                }
            }
            if (z) {
                mo2847g(canvas);
            }
            if (z2) {
                mo2845e(canvas);
            }
        }

        /* renamed from: e */
        public final void mo2845e(Canvas canvas) {
            float[] fArr = this.f2066a;
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[fArr.length - 2];
            float f4 = fArr[fArr.length - 1];
            canvas.drawLine(Math.min(f, f3), Math.max(f2, f4), Math.max(f, f3), Math.max(f2, f4), this.f2072c);
            canvas.drawLine(Math.min(f, f3), Math.min(f2, f4), Math.min(f, f3), Math.max(f2, f4), this.f2072c);
        }

        /* renamed from: f */
        public final void mo2846f(Canvas canvas, float f, float f2) {
            Canvas canvas2 = canvas;
            float[] fArr = this.f2066a;
            float f3 = fArr[0];
            float f4 = fArr[1];
            float f5 = fArr[fArr.length - 2];
            float f6 = fArr[fArr.length - 1];
            float min = Math.min(f3, f5);
            float max = Math.max(f4, f6);
            float min2 = f - Math.min(f3, f5);
            float max2 = Math.max(f4, f6) - f2;
            String str = "" + (((float) ((int) (((double) ((min2 * 100.0f) / Math.abs(f5 - f3))) + 0.5d))) / 100.0f);
            mo2853m(str, this.f2075d);
            canvas2.drawText(str, ((min2 / 2.0f) - ((float) (this.f2063a.width() / 2))) + min, f2 - 20.0f, this.f2075d);
            canvas.drawLine(f, f2, Math.min(f3, f5), f2, this.f2072c);
            String str2 = "" + (((float) ((int) (((double) ((max2 * 100.0f) / Math.abs(f6 - f4))) + 0.5d))) / 100.0f);
            mo2853m(str2, this.f2075d);
            canvas2.drawText(str2, f + 5.0f, max - ((max2 / 2.0f) - ((float) (this.f2063a.height() / 2))), this.f2075d);
            canvas.drawLine(f, f2, f, Math.max(f4, f6), this.f2072c);
        }

        /* renamed from: g */
        public final void mo2847g(Canvas canvas) {
            float[] fArr = this.f2066a;
            canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], this.f2072c);
        }

        /* renamed from: h */
        public final void mo2848h(Canvas canvas, float f, float f2) {
            float[] fArr = this.f2066a;
            float f3 = fArr[0];
            float f4 = fArr[1];
            float f5 = fArr[fArr.length - 2];
            float f6 = fArr[fArr.length - 1];
            float hypot = (float) Math.hypot((double) (f3 - f5), (double) (f4 - f6));
            float f7 = f5 - f3;
            float f8 = f6 - f4;
            float f9 = (((f - f3) * f7) + ((f2 - f4) * f8)) / (hypot * hypot);
            float f10 = f3 + (f7 * f9);
            float f11 = f4 + (f9 * f8);
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f10, f11);
            float hypot2 = (float) Math.hypot((double) (f10 - f), (double) (f11 - f2));
            String str = "" + (((float) ((int) ((hypot2 * 100.0f) / hypot))) / 100.0f);
            mo2853m(str, this.f2075d);
            canvas.drawTextOnPath(str, path, (hypot2 / 2.0f) - ((float) (this.f2063a.width() / 2)), -20.0f, this.f2075d);
            canvas.drawLine(f, f2, f10, f11, this.f2072c);
        }

        /* renamed from: i */
        public final void mo2849i(Canvas canvas, float f, float f2, int i, int i2) {
            Canvas canvas2 = canvas;
            String str = "" + (((float) ((int) (((double) (((f - ((float) (i / 2))) * 100.0f) / ((float) (MotionLayout.this.getWidth() - i)))) + 0.5d))) / 100.0f);
            mo2853m(str, this.f2075d);
            canvas2.drawText(str, ((f / 2.0f) - ((float) (this.f2063a.width() / 2))) + 0.0f, f2 - 20.0f, this.f2075d);
            canvas.drawLine(f, f2, Math.min(0.0f, 1.0f), f2, this.f2072c);
            String str2 = "" + (((float) ((int) (((double) (((f2 - ((float) (i2 / 2))) * 100.0f) / ((float) (MotionLayout.this.getHeight() - i2)))) + 0.5d))) / 100.0f);
            mo2853m(str2, this.f2075d);
            canvas2.drawText(str2, f + 5.0f, 0.0f - ((f2 / 2.0f) - ((float) (this.f2063a.height() / 2))), this.f2075d);
            canvas.drawLine(f, f2, f, Math.max(0.0f, 1.0f), this.f2072c);
        }

        /* renamed from: j */
        public final void mo2850j(Canvas canvas, cl2 cl2) {
            this.f2062a.reset();
            for (int i = 0; i <= 50; i++) {
                cl2.mo14231g(((float) i) / ((float) 50), this.f2073c, 0);
                Path path = this.f2062a;
                float[] fArr = this.f2073c;
                path.moveTo(fArr[0], fArr[1]);
                Path path2 = this.f2062a;
                float[] fArr2 = this.f2073c;
                path2.lineTo(fArr2[2], fArr2[3]);
                Path path3 = this.f2062a;
                float[] fArr3 = this.f2073c;
                path3.lineTo(fArr3[4], fArr3[5]);
                Path path4 = this.f2062a;
                float[] fArr4 = this.f2073c;
                path4.lineTo(fArr4[6], fArr4[7]);
                this.f2062a.close();
            }
            this.f2061a.setColor(1140850688);
            canvas.translate(2.0f, 2.0f);
            canvas.drawPath(this.f2062a, this.f2061a);
            canvas.translate(-2.0f, -2.0f);
            this.f2061a.setColor(g74.f12468c);
            canvas.drawPath(this.f2062a, this.f2061a);
        }

        /* renamed from: k */
        public final void mo2851k(Canvas canvas, int i, int i2, cl2 cl2) {
            int i3;
            int i4;
            float f;
            float f2;
            Canvas canvas2 = canvas;
            int i5 = i;
            cl2 cl22 = cl2;
            View view = cl22.f10346a;
            if (view != null) {
                i4 = view.getWidth();
                i3 = cl22.f10346a.getHeight();
            } else {
                i4 = 0;
                i3 = 0;
            }
            for (int i6 = 1; i6 < i2 - 1; i6++) {
                if (i5 != 4 || this.f2067a[i6 - 1] != 0) {
                    float[] fArr = this.f2070b;
                    int i7 = i6 * 2;
                    float f3 = fArr[i7];
                    float f4 = fArr[i7 + 1];
                    this.f2062a.reset();
                    this.f2062a.moveTo(f3, f4 + 10.0f);
                    this.f2062a.lineTo(f3 + 10.0f, f4);
                    this.f2062a.lineTo(f3, f4 - 10.0f);
                    this.f2062a.lineTo(f3 - 10.0f, f4);
                    this.f2062a.close();
                    int i8 = i6 - 1;
                    cl22.mo14247w(i8);
                    if (i5 == 4) {
                        int[] iArr = this.f2067a;
                        if (iArr[i8] == 1) {
                            mo2848h(canvas2, f3 - 0.0f, f4 - 0.0f);
                        } else if (iArr[i8] == 0) {
                            mo2846f(canvas2, f3 - 0.0f, f4 - 0.0f);
                        } else if (iArr[i8] == 2) {
                            f2 = f4;
                            f = f3;
                            mo2849i(canvas, f3 - 0.0f, f4 - 0.0f, i4, i3);
                            canvas2.drawPath(this.f2062a, this.f2077e);
                        }
                        f2 = f4;
                        f = f3;
                        canvas2.drawPath(this.f2062a, this.f2077e);
                    } else {
                        f2 = f4;
                        f = f3;
                    }
                    if (i5 == 2) {
                        mo2848h(canvas2, f - 0.0f, f2 - 0.0f);
                    }
                    if (i5 == 3) {
                        mo2846f(canvas2, f - 0.0f, f2 - 0.0f);
                    }
                    if (i5 == 6) {
                        mo2849i(canvas, f - 0.0f, f2 - 0.0f, i4, i3);
                    }
                    canvas2.drawPath(this.f2062a, this.f2077e);
                }
            }
            float[] fArr2 = this.f2066a;
            if (fArr2.length > 1) {
                canvas2.drawCircle(fArr2[0], fArr2[1], 8.0f, this.f2069b);
                float[] fArr3 = this.f2066a;
                canvas2.drawCircle(fArr3[fArr3.length - 2], fArr3[fArr3.length - 1], 8.0f, this.f2069b);
            }
        }

        /* renamed from: l */
        public final void mo2852l(Canvas canvas, float f, float f2, float f3, float f4) {
            canvas.drawRect(f, f2, f3, f4, this.f2072c);
            canvas.drawLine(f, f2, f3, f4, this.f2072c);
        }

        /* renamed from: m */
        public void mo2853m(String str, Paint paint) {
            paint.getTextBounds(str, 0, str.length(), this.f2063a);
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$h */
    public class C0386h {

        /* renamed from: a */
        public int f2080a;

        /* renamed from: a */
        public C0426d f2082a = null;

        /* renamed from: a */
        public p60 f2083a = new p60();

        /* renamed from: b */
        public int f2084b;

        /* renamed from: b */
        public C0426d f2085b = null;

        /* renamed from: b */
        public p60 f2086b = new p60();

        public C0386h() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x00e9  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x013d A[SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo2854a() {
            /*
                r18 = this;
                r0 = r18
                androidx.constraintlayout.motion.widget.MotionLayout r1 = androidx.constraintlayout.motion.widget.MotionLayout.this
                int r1 = r1.getChildCount()
                androidx.constraintlayout.motion.widget.MotionLayout r2 = androidx.constraintlayout.motion.widget.MotionLayout.this
                java.util.HashMap<android.view.View, com.onedelhi.secure.cl2> r2 = r2.f2016b
                r2.clear()
                android.util.SparseArray r2 = new android.util.SparseArray
                r2.<init>()
                int[] r3 = new int[r1]
                r5 = 0
            L_0x0017:
                if (r5 >= r1) goto L_0x0037
                androidx.constraintlayout.motion.widget.MotionLayout r6 = androidx.constraintlayout.motion.widget.MotionLayout.this
                android.view.View r6 = r6.getChildAt(r5)
                com.onedelhi.secure.cl2 r7 = new com.onedelhi.secure.cl2
                r7.<init>(r6)
                int r8 = r6.getId()
                r3[r5] = r8
                r2.put(r8, r7)
                androidx.constraintlayout.motion.widget.MotionLayout r8 = androidx.constraintlayout.motion.widget.MotionLayout.this
                java.util.HashMap<android.view.View, com.onedelhi.secure.cl2> r8 = r8.f2016b
                r8.put(r6, r7)
                int r5 = r5 + 1
                goto L_0x0017
            L_0x0037:
                r5 = 0
            L_0x0038:
                if (r5 >= r1) goto L_0x0143
                androidx.constraintlayout.motion.widget.MotionLayout r6 = androidx.constraintlayout.motion.widget.MotionLayout.this
                android.view.View r6 = r6.getChildAt(r5)
                androidx.constraintlayout.motion.widget.MotionLayout r7 = androidx.constraintlayout.motion.widget.MotionLayout.this
                java.util.HashMap<android.view.View, com.onedelhi.secure.cl2> r7 = r7.f2016b
                java.lang.Object r7 = r7.get(r6)
                r13 = r7
                com.onedelhi.secure.cl2 r13 = (com.onedelhi.secure.cl2) r13
                if (r13 != 0) goto L_0x0051
                r16 = r2
                goto L_0x013d
            L_0x0051:
                androidx.constraintlayout.widget.d r7 = r0.f2082a
                java.lang.String r14 = ")"
                java.lang.String r15 = " ("
                java.lang.String r12 = "no widget for  "
                java.lang.String r11 = "MotionLayout"
                if (r7 == 0) goto L_0x00b2
                com.onedelhi.secure.p60 r7 = r0.f2083a
                com.onedelhi.secure.o60 r7 = r0.mo2860g(r7, r6)
                if (r7 == 0) goto L_0x007d
                androidx.constraintlayout.motion.widget.MotionLayout r8 = androidx.constraintlayout.motion.widget.MotionLayout.this
                android.graphics.Rect r7 = r8.mo2753W0(r7)
                androidx.constraintlayout.widget.d r8 = r0.f2082a
                androidx.constraintlayout.motion.widget.MotionLayout r9 = androidx.constraintlayout.motion.widget.MotionLayout.this
                int r9 = r9.getWidth()
                androidx.constraintlayout.motion.widget.MotionLayout r10 = androidx.constraintlayout.motion.widget.MotionLayout.this
                int r10 = r10.getHeight()
                r13.mo14219W(r7, r8, r9, r10)
                goto L_0x00e1
            L_0x007d:
                androidx.constraintlayout.motion.widget.MotionLayout r7 = androidx.constraintlayout.motion.widget.MotionLayout.this
                int r7 = r7.f1975H
                if (r7 == 0) goto L_0x00e1
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = com.onedelhi.secure.ve0.m30008g()
                r7.append(r8)
                r7.append(r12)
                java.lang.String r8 = com.onedelhi.secure.ve0.m30012k(r6)
                r7.append(r8)
                r7.append(r15)
                java.lang.Class r8 = r6.getClass()
                java.lang.String r8 = r8.getName()
                r7.append(r8)
                r7.append(r14)
                java.lang.String r7 = r7.toString()
                android.util.Log.e(r11, r7)
                goto L_0x00e1
            L_0x00b2:
                androidx.constraintlayout.motion.widget.MotionLayout r7 = androidx.constraintlayout.motion.widget.MotionLayout.this
                boolean r7 = r7.f2046s
                if (r7 == 0) goto L_0x00e1
                androidx.constraintlayout.motion.widget.MotionLayout r7 = androidx.constraintlayout.motion.widget.MotionLayout.this
                java.util.HashMap<android.view.View, com.onedelhi.secure.cv4> r7 = r7.f2020c
                java.lang.Object r7 = r7.get(r6)
                r8 = r7
                com.onedelhi.secure.cv4 r8 = (com.onedelhi.secure.cv4) r8
                androidx.constraintlayout.motion.widget.MotionLayout r7 = androidx.constraintlayout.motion.widget.MotionLayout.this
                int r10 = r7.f1989V
                int r16 = r7.f1990W
                androidx.constraintlayout.motion.widget.MotionLayout r7 = androidx.constraintlayout.motion.widget.MotionLayout.this
                int r17 = r7.f1991X
                r7 = r13
                r9 = r6
                r4 = r11
                r11 = r16
                r16 = r2
                r2 = r12
                r12 = r17
                r7.mo14220X(r8, r9, r10, r11, r12)
                goto L_0x00e5
            L_0x00e1:
                r16 = r2
                r4 = r11
                r2 = r12
            L_0x00e5:
                androidx.constraintlayout.widget.d r7 = r0.f2085b
                if (r7 == 0) goto L_0x013d
                com.onedelhi.secure.p60 r7 = r0.f2086b
                com.onedelhi.secure.o60 r7 = r0.mo2860g(r7, r6)
                if (r7 == 0) goto L_0x0109
                androidx.constraintlayout.motion.widget.MotionLayout r2 = androidx.constraintlayout.motion.widget.MotionLayout.this
                android.graphics.Rect r2 = r2.mo2753W0(r7)
                androidx.constraintlayout.widget.d r4 = r0.f2085b
                androidx.constraintlayout.motion.widget.MotionLayout r6 = androidx.constraintlayout.motion.widget.MotionLayout.this
                int r6 = r6.getWidth()
                androidx.constraintlayout.motion.widget.MotionLayout r7 = androidx.constraintlayout.motion.widget.MotionLayout.this
                int r7 = r7.getHeight()
                r13.mo14216T(r2, r4, r6, r7)
                goto L_0x013d
            L_0x0109:
                androidx.constraintlayout.motion.widget.MotionLayout r7 = androidx.constraintlayout.motion.widget.MotionLayout.this
                int r7 = r7.f1975H
                if (r7 == 0) goto L_0x013d
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = com.onedelhi.secure.ve0.m30008g()
                r7.append(r8)
                r7.append(r2)
                java.lang.String r2 = com.onedelhi.secure.ve0.m30012k(r6)
                r7.append(r2)
                r7.append(r15)
                java.lang.Class r2 = r6.getClass()
                java.lang.String r2 = r2.getName()
                r7.append(r2)
                r7.append(r14)
                java.lang.String r2 = r7.toString()
                android.util.Log.e(r4, r2)
            L_0x013d:
                int r5 = r5 + 1
                r2 = r16
                goto L_0x0038
            L_0x0143:
                r16 = r2
                r4 = 0
            L_0x0146:
                if (r4 >= r1) goto L_0x0167
                r2 = r3[r4]
                r5 = r16
                java.lang.Object r2 = r5.get(r2)
                com.onedelhi.secure.cl2 r2 = (com.onedelhi.secure.cl2) r2
                int r6 = r2.mo14235k()
                r7 = -1
                if (r6 == r7) goto L_0x0162
                java.lang.Object r6 = r5.get(r6)
                com.onedelhi.secure.cl2 r6 = (com.onedelhi.secure.cl2) r6
                r2.mo14226b0(r6)
            L_0x0162:
                int r4 = r4 + 1
                r16 = r5
                goto L_0x0146
            L_0x0167:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.C0386h.mo2854a():void");
        }

        /* renamed from: b */
        public final void mo2855b(int i, int i2) {
            int optimizationLevel = MotionLayout.this.getOptimizationLevel();
            MotionLayout motionLayout = MotionLayout.this;
            if (motionLayout.f1971D == motionLayout.getStartState()) {
                MotionLayout motionLayout2 = MotionLayout.this;
                p60 p60 = this.f2086b;
                C0426d dVar = this.f2085b;
                motionLayout2.mo3216B(p60, optimizationLevel, (dVar == null || dVar.f2895a == 0) ? i : i2, (dVar == null || dVar.f2895a == 0) ? i2 : i);
                C0426d dVar2 = this.f2082a;
                if (dVar2 != null) {
                    MotionLayout motionLayout3 = MotionLayout.this;
                    p60 p602 = this.f2083a;
                    int i3 = dVar2.f2895a;
                    int i4 = i3 == 0 ? i : i2;
                    if (i3 == 0) {
                        i = i2;
                    }
                    motionLayout3.mo3216B(p602, optimizationLevel, i4, i);
                    return;
                }
                return;
            }
            C0426d dVar3 = this.f2082a;
            if (dVar3 != null) {
                MotionLayout motionLayout4 = MotionLayout.this;
                p60 p603 = this.f2083a;
                int i5 = dVar3.f2895a;
                motionLayout4.mo3216B(p603, optimizationLevel, i5 == 0 ? i : i2, i5 == 0 ? i2 : i);
            }
            MotionLayout motionLayout5 = MotionLayout.this;
            p60 p604 = this.f2086b;
            C0426d dVar4 = this.f2085b;
            int i6 = (dVar4 == null || dVar4.f2895a == 0) ? i : i2;
            if (dVar4 == null || dVar4.f2895a == 0) {
                i = i2;
            }
            motionLayout5.mo3216B(p604, optimizationLevel, i6, i);
        }

        /* renamed from: c */
        public void mo2856c(p60 p60, p60 p602) {
            ArrayList<o60> l2 = p60.mo14933l2();
            HashMap hashMap = new HashMap();
            hashMap.put(p60, p602);
            p602.mo14933l2().clear();
            p602.mo15202n(p60, hashMap);
            Iterator<o60> it = l2.iterator();
            while (it.hasNext()) {
                o60 next = it.next();
                o60 ejVar = next instanceof C2063ej ? new C2063ej() : next instanceof nj1 ? new nj1() : next instanceof l81 ? new l81() : next instanceof i23 ? new i23() : next instanceof jl1 ? new ml1() : new o60();
                p602.mo14931b(ejVar);
                hashMap.put(next, ejVar);
            }
            Iterator<o60> it2 = l2.iterator();
            while (it2.hasNext()) {
                o60 next2 = it2.next();
                ((o60) hashMap.get(next2)).mo15202n(next2, hashMap);
            }
        }

        @SuppressLint({"LogConditional"})
        /* renamed from: d */
        public final void mo2857d(String str, p60 p60) {
            String str2 = str + " " + ve0.m30012k((View) p60.mo21750w());
            Log.v(MotionLayout.f1954d, str2 + "  ========= " + p60);
            int size = p60.mo14933l2().size();
            for (int i = 0; i < size; i++) {
                String str3 = str2 + "[" + i + "] ";
                o60 o60 = p60.mo14933l2().get(i);
                StringBuilder sb = new StringBuilder();
                sb.append("");
                m60 m60 = o60.f17765b.f15915a;
                String str4 = db0.f27369e;
                sb.append(m60 != null ? mx0.f16794s2 : str4);
                String sb2 = sb.toString();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(sb2);
                sb3.append(o60.f17781d.f15915a != null ? "B" : str4);
                String sb4 = sb3.toString();
                StringBuilder sb5 = new StringBuilder();
                sb5.append(sb4);
                sb5.append(o60.f17748a.f15915a != null ? "L" : str4);
                String sb6 = sb5.toString();
                StringBuilder sb7 = new StringBuilder();
                sb7.append(sb6);
                if (o60.f17775c.f15915a != null) {
                    str4 = "R";
                }
                sb7.append(str4);
                String sb8 = sb7.toString();
                View view = (View) o60.mo21750w();
                String k = ve0.m30012k(view);
                if (view instanceof TextView) {
                    k = k + pl2.f33726c + ((TextView) view).getText() + pl2.f33727d;
                }
                Log.v(MotionLayout.f1954d, str3 + yg1.C3999a.f23084c + k + " " + o60 + " " + sb8);
            }
            Log.v(MotionLayout.f1954d, str2 + " done. ");
        }

        @SuppressLint({"LogConditional"})
        /* renamed from: e */
        public final void mo2858e(String str, ConstraintLayout.LayoutParams layoutParams) {
            StringBuilder sb = new StringBuilder();
            sb.append(" ");
            sb.append(layoutParams.f2591q != -1 ? "SS" : "__");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            String str2 = "|__";
            sb3.append(layoutParams.f2590p != -1 ? "|SE" : str2);
            String sb4 = sb3.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(sb4);
            sb5.append(layoutParams.f2592r != -1 ? "|ES" : str2);
            String sb6 = sb5.toString();
            StringBuilder sb7 = new StringBuilder();
            sb7.append(sb6);
            sb7.append(layoutParams.f2593s != -1 ? "|EE" : str2);
            String sb8 = sb7.toString();
            StringBuilder sb9 = new StringBuilder();
            sb9.append(sb8);
            sb9.append(layoutParams.f2558c != -1 ? "|LL" : str2);
            String sb10 = sb9.toString();
            StringBuilder sb11 = new StringBuilder();
            sb11.append(sb10);
            sb11.append(layoutParams.f2561d != -1 ? "|LR" : str2);
            String sb12 = sb11.toString();
            StringBuilder sb13 = new StringBuilder();
            sb13.append(sb12);
            sb13.append(layoutParams.f2564e != -1 ? "|RL" : str2);
            String sb14 = sb13.toString();
            StringBuilder sb15 = new StringBuilder();
            sb15.append(sb14);
            sb15.append(layoutParams.f2567f != -1 ? "|RR" : str2);
            String sb16 = sb15.toString();
            StringBuilder sb17 = new StringBuilder();
            sb17.append(sb16);
            sb17.append(layoutParams.f2570g != -1 ? "|TT" : str2);
            String sb18 = sb17.toString();
            StringBuilder sb19 = new StringBuilder();
            sb19.append(sb18);
            sb19.append(layoutParams.f2573h != -1 ? "|TB" : str2);
            String sb20 = sb19.toString();
            StringBuilder sb21 = new StringBuilder();
            sb21.append(sb20);
            sb21.append(layoutParams.f2576i != -1 ? "|BT" : str2);
            String sb22 = sb21.toString();
            StringBuilder sb23 = new StringBuilder();
            sb23.append(sb22);
            if (layoutParams.f2579j != -1) {
                str2 = "|BB";
            }
            sb23.append(str2);
            String sb24 = sb23.toString();
            Log.v(MotionLayout.f1954d, str + sb24);
        }

        @SuppressLint({"LogConditional"})
        /* renamed from: f */
        public final void mo2859f(String str, o60 o60) {
            String str2;
            String str3;
            String str4;
            StringBuilder sb = new StringBuilder();
            sb.append(" ");
            String str5 = "B";
            String str6 = "__";
            if (o60.f17765b.f15915a != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(mx0.f16794s2);
                sb2.append(o60.f17765b.f15915a.f15914a == m60.C2835b.TOP ? mx0.f16794s2 : str5);
                str2 = sb2.toString();
            } else {
                str2 = str6;
            }
            sb.append(str2);
            String sb3 = sb.toString();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(sb3);
            if (o60.f17781d.f15915a != null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str5);
                if (o60.f17781d.f15915a.f15914a == m60.C2835b.TOP) {
                    str5 = mx0.f16794s2;
                }
                sb5.append(str5);
                str3 = sb5.toString();
            } else {
                str3 = str6;
            }
            sb4.append(str3);
            String sb6 = sb4.toString();
            StringBuilder sb7 = new StringBuilder();
            sb7.append(sb6);
            String str7 = "R";
            if (o60.f17748a.f15915a != null) {
                StringBuilder sb8 = new StringBuilder();
                sb8.append("L");
                sb8.append(o60.f17748a.f15915a.f15914a == m60.C2835b.LEFT ? "L" : str7);
                str4 = sb8.toString();
            } else {
                str4 = str6;
            }
            sb7.append(str4);
            String sb9 = sb7.toString();
            StringBuilder sb10 = new StringBuilder();
            sb10.append(sb9);
            if (o60.f17775c.f15915a != null) {
                StringBuilder sb11 = new StringBuilder();
                sb11.append(str7);
                if (o60.f17775c.f15915a.f15914a == m60.C2835b.LEFT) {
                    str7 = "L";
                }
                sb11.append(str7);
                str6 = sb11.toString();
            }
            sb10.append(str6);
            String sb12 = sb10.toString();
            Log.v(MotionLayout.f1954d, str + sb12 + " ---  " + o60);
        }

        /* renamed from: g */
        public o60 mo2860g(p60 p60, View view) {
            if (p60.mo21750w() == view) {
                return p60;
            }
            ArrayList<o60> l2 = p60.mo14933l2();
            int size = l2.size();
            for (int i = 0; i < size; i++) {
                o60 o60 = l2.get(i);
                if (o60.mo21750w() == view) {
                    return o60;
                }
            }
            return null;
        }

        /* renamed from: h */
        public void mo2861h(p60 p60, C0426d dVar, C0426d dVar2) {
            this.f2082a = dVar;
            this.f2085b = dVar2;
            this.f2083a = new p60();
            this.f2086b = new p60();
            this.f2083a.mo22337U2(MotionLayout.this.f2482a.mo22324G2());
            this.f2086b.mo22337U2(MotionLayout.this.f2482a.mo22324G2());
            this.f2083a.mo14937p2();
            this.f2086b.mo14937p2();
            mo2856c(MotionLayout.this.f2482a, this.f2083a);
            mo2856c(MotionLayout.this.f2482a, this.f2086b);
            if (((double) MotionLayout.this.f2021d) > 0.5d) {
                if (dVar != null) {
                    mo2866m(this.f2083a, dVar);
                }
                mo2866m(this.f2086b, dVar2);
            } else {
                mo2866m(this.f2086b, dVar2);
                if (dVar != null) {
                    mo2866m(this.f2083a, dVar);
                }
            }
            this.f2083a.mo22341Y2(MotionLayout.this.mo3251w());
            this.f2083a.mo22343a3();
            this.f2086b.mo22341Y2(MotionLayout.this.mo3251w());
            this.f2086b.mo22343a3();
            ViewGroup.LayoutParams layoutParams = MotionLayout.this.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams.width == -2) {
                    p60 p602 = this.f2083a;
                    o60.C3032b bVar = o60.C3032b.WRAP_CONTENT;
                    p602.mo21621D1(bVar);
                    this.f2086b.mo21621D1(bVar);
                }
                if (layoutParams.height == -2) {
                    p60 p603 = this.f2083a;
                    o60.C3032b bVar2 = o60.C3032b.WRAP_CONTENT;
                    p603.mo21679Y1(bVar2);
                    this.f2086b.mo21679Y1(bVar2);
                }
            }
        }

        /* renamed from: i */
        public boolean mo2862i(int i, int i2) {
            return (i == this.f2080a && i2 == this.f2084b) ? false : true;
        }

        /* renamed from: j */
        public void mo2863j(int i, int i2) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            MotionLayout motionLayout = MotionLayout.this;
            motionLayout.f1986S = mode;
            motionLayout.f1987T = mode2;
            motionLayout.getOptimizationLevel();
            mo2855b(i, i2);
            if (((MotionLayout.this.getParent() instanceof MotionLayout) && mode == 1073741824 && mode2 == 1073741824) ? false : true) {
                mo2855b(i, i2);
                MotionLayout.this.f1982O = this.f2083a.mo21723m0();
                MotionLayout.this.f1983P = this.f2083a.mo21619D();
                MotionLayout.this.f1984Q = this.f2086b.mo21723m0();
                MotionLayout.this.f1985R = this.f2086b.mo21619D();
                MotionLayout motionLayout2 = MotionLayout.this;
                motionLayout2.f2044q = (motionLayout2.f1982O == motionLayout2.f1984Q && motionLayout2.f1983P == motionLayout2.f1985R) ? false : true;
            }
            MotionLayout motionLayout3 = MotionLayout.this;
            int i3 = motionLayout3.f1982O;
            int i4 = motionLayout3.f1983P;
            int i5 = motionLayout3.f1986S;
            if (i5 == Integer.MIN_VALUE || i5 == 0) {
                i3 = (int) (((float) i3) + (motionLayout3.f2039m * ((float) (motionLayout3.f1984Q - i3))));
            }
            int i6 = i3;
            int i7 = motionLayout3.f1987T;
            if (i7 == Integer.MIN_VALUE || i7 == 0) {
                i4 = (int) (((float) i4) + (motionLayout3.f2039m * ((float) (motionLayout3.f1985R - i4))));
            }
            MotionLayout.this.mo3215A(i, i2, i6, i4, this.f2083a.mo22333P2() || this.f2086b.mo22333P2(), this.f2083a.mo22331N2() || this.f2086b.mo22331N2());
        }

        /* renamed from: k */
        public void mo2864k() {
            mo2863j(MotionLayout.this.f1973F, MotionLayout.this.f1974G);
            MotionLayout.this.mo2752V0();
        }

        /* renamed from: l */
        public void mo2865l(int i, int i2) {
            this.f2080a = i;
            this.f2084b = i2;
        }

        /* renamed from: m */
        public final void mo2866m(p60 p60, C0426d dVar) {
            SparseArray sparseArray = new SparseArray();
            Constraints.LayoutParams layoutParams = new Constraints.LayoutParams(-2, -2);
            sparseArray.clear();
            sparseArray.put(0, p60);
            sparseArray.put(MotionLayout.this.getId(), p60);
            if (!(dVar == null || dVar.f2895a == 0)) {
                MotionLayout motionLayout = MotionLayout.this;
                motionLayout.mo3216B(this.f2086b, motionLayout.getOptimizationLevel(), View.MeasureSpec.makeMeasureSpec(MotionLayout.this.getHeight(), 1073741824), View.MeasureSpec.makeMeasureSpec(MotionLayout.this.getWidth(), 1073741824));
            }
            Iterator<o60> it = p60.mo14933l2().iterator();
            while (it.hasNext()) {
                o60 next = it.next();
                next.mo21701f1(true);
                sparseArray.put(((View) next.mo21750w()).getId(), next);
            }
            Iterator<o60> it2 = p60.mo14933l2().iterator();
            while (it2.hasNext()) {
                o60 next2 = it2.next();
                View view = (View) next2.mo21750w();
                dVar.mo3482u(view.getId(), layoutParams);
                next2.mo21691c2(dVar.mo3483u0(view.getId()));
                next2.mo21758y1(dVar.mo3463n0(view.getId()));
                if (view instanceof ConstraintHelper) {
                    dVar.mo3476s((ConstraintHelper) view, next2, layoutParams, sparseArray);
                    if (view instanceof Barrier) {
                        ((Barrier) view).mo3196I();
                    }
                }
                layoutParams.resolveLayoutDirection(MotionLayout.this.getLayoutDirection());
                MotionLayout.this.mo3232i(false, view, next2, layoutParams, sparseArray);
                next2.mo21688b2(dVar.mo3480t0(view.getId()) == 1 ? view.getVisibility() : dVar.mo3477s0(view.getId()));
            }
            Iterator<o60> it3 = p60.mo14933l2().iterator();
            while (it3.hasNext()) {
                o60 next3 = it3.next();
                if (next3 instanceof dw4) {
                    jl1 jl1 = (jl1) next3;
                    ((ConstraintHelper) next3.mo21750w()).mo2720H(p60, jl1, sparseArray);
                    ((dw4) jl1).mo14910n2();
                }
            }
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$i */
    public interface C0387i {
        /* renamed from: a */
        void mo2867a();

        /* renamed from: b */
        float mo2868b(int i);

        /* renamed from: c */
        float mo2869c(int i);

        void clear();

        /* renamed from: d */
        float mo2871d();

        /* renamed from: e */
        void mo2872e(int i, float f);

        /* renamed from: f */
        float mo2873f();

        /* renamed from: g */
        void mo2874g(int i);

        /* renamed from: h */
        void mo2875h(MotionEvent motionEvent);
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$j */
    public static class C0388j implements C0387i {

        /* renamed from: a */
        public static C0388j f2087a = new C0388j();

        /* renamed from: a */
        public VelocityTracker f2088a;

        /* renamed from: i */
        public static C0388j m2806i() {
            f2087a.f2088a = VelocityTracker.obtain();
            return f2087a;
        }

        /* renamed from: a */
        public void mo2867a() {
            VelocityTracker velocityTracker = this.f2088a;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f2088a = null;
            }
        }

        /* renamed from: b */
        public float mo2868b(int i) {
            if (this.f2088a != null) {
                return mo2868b(i);
            }
            return 0.0f;
        }

        /* renamed from: c */
        public float mo2869c(int i) {
            VelocityTracker velocityTracker = this.f2088a;
            if (velocityTracker != null) {
                return velocityTracker.getXVelocity(i);
            }
            return 0.0f;
        }

        public void clear() {
            VelocityTracker velocityTracker = this.f2088a;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }

        /* renamed from: d */
        public float mo2871d() {
            VelocityTracker velocityTracker = this.f2088a;
            if (velocityTracker != null) {
                return velocityTracker.getXVelocity();
            }
            return 0.0f;
        }

        /* renamed from: e */
        public void mo2872e(int i, float f) {
            VelocityTracker velocityTracker = this.f2088a;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(i, f);
            }
        }

        /* renamed from: f */
        public float mo2873f() {
            VelocityTracker velocityTracker = this.f2088a;
            if (velocityTracker != null) {
                return velocityTracker.getYVelocity();
            }
            return 0.0f;
        }

        /* renamed from: g */
        public void mo2874g(int i) {
            VelocityTracker velocityTracker = this.f2088a;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(i);
            }
        }

        /* renamed from: h */
        public void mo2875h(MotionEvent motionEvent) {
            VelocityTracker velocityTracker = this.f2088a;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$k */
    public class C0389k {

        /* renamed from: a */
        public float f2089a = Float.NaN;

        /* renamed from: a */
        public int f2090a = -1;

        /* renamed from: a */
        public final String f2092a = "motion.progress";

        /* renamed from: b */
        public float f2093b = Float.NaN;

        /* renamed from: b */
        public int f2094b = -1;

        /* renamed from: b */
        public final String f2095b = "motion.velocity";

        /* renamed from: c */
        public final String f2096c = "motion.StartState";

        /* renamed from: d */
        public final String f2097d = "motion.EndState";

        public C0389k() {
        }

        /* renamed from: a */
        public void mo2876a() {
            int i = this.f2090a;
            if (!(i == -1 && this.f2094b == -1)) {
                if (i == -1) {
                    MotionLayout.this.mo2759c1(this.f2094b);
                } else {
                    int i2 = this.f2094b;
                    if (i2 == -1) {
                        MotionLayout.this.setState(i, -1, -1);
                    } else {
                        MotionLayout.this.setTransition(i, i2);
                    }
                }
                MotionLayout.this.setState(C0391m.SETUP);
            }
            if (!Float.isNaN(this.f2093b)) {
                MotionLayout.this.setProgress(this.f2089a, this.f2093b);
                this.f2089a = Float.NaN;
                this.f2093b = Float.NaN;
                this.f2090a = -1;
                this.f2094b = -1;
            } else if (!Float.isNaN(this.f2089a)) {
                MotionLayout.this.setProgress(this.f2089a);
            }
        }

        /* renamed from: b */
        public Bundle mo2877b() {
            Bundle bundle = new Bundle();
            bundle.putFloat("motion.progress", this.f2089a);
            bundle.putFloat("motion.velocity", this.f2093b);
            bundle.putInt("motion.StartState", this.f2090a);
            bundle.putInt("motion.EndState", this.f2094b);
            return bundle;
        }

        /* renamed from: c */
        public void mo2878c() {
            this.f2094b = MotionLayout.this.f1972E;
            this.f2090a = MotionLayout.this.f1970C;
            this.f2093b = MotionLayout.this.getVelocity();
            this.f2089a = MotionLayout.this.getProgress();
        }

        /* renamed from: d */
        public void mo2879d(int i) {
            this.f2094b = i;
        }

        /* renamed from: e */
        public void mo2880e(float f) {
            this.f2089a = f;
        }

        /* renamed from: f */
        public void mo2881f(int i) {
            this.f2090a = i;
        }

        /* renamed from: g */
        public void mo2882g(Bundle bundle) {
            this.f2089a = bundle.getFloat("motion.progress");
            this.f2093b = bundle.getFloat("motion.velocity");
            this.f2090a = bundle.getInt("motion.StartState");
            this.f2094b = bundle.getInt("motion.EndState");
        }

        /* renamed from: h */
        public void mo2883h(float f) {
            this.f2093b = f;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$l */
    public interface C0390l {
        /* renamed from: c */
        void mo2723c(MotionLayout motionLayout, int i, boolean z, float f);

        /* renamed from: g */
        void mo2726g(MotionLayout motionLayout, int i, int i2);

        /* renamed from: i */
        void mo2649i(MotionLayout motionLayout, int i);

        /* renamed from: j */
        void mo2650j(MotionLayout motionLayout, int i, int i2, float f);
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$m */
    public enum C0391m {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    public MotionLayout(@mr2 Context context) {
        super(context);
        mo2737G0((AttributeSet) null);
    }

    public MotionLayout(@mr2 Context context, @ts2 AttributeSet attributeSet) {
        super(context, attributeSet);
        mo2737G0(attributeSet);
    }

    public MotionLayout(@mr2 Context context, @ts2 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo2737G0(attributeSet);
    }

    /* renamed from: k1 */
    public static boolean m2703k1(float f, float f2, float f3) {
        if (f > 0.0f) {
            float f4 = f / f3;
            return f2 + ((f * f4) - (((f3 * f4) * f4) / 2.0f)) > 1.0f;
        }
        float f5 = (-f) / f3;
        return f2 + ((f * f5) + (((f3 * f5) * f5) / 2.0f)) < 0.0f;
    }

    /* renamed from: A0 */
    public String mo2731A0(int i) {
        C0393b bVar = this.f2005a;
        if (bVar == null) {
            return null;
        }
        return bVar.mo2906X(i);
    }

    /* renamed from: B0 */
    public void mo2732B0(boolean z) {
        this.f1975H = z ? 2 : 1;
        invalidate();
    }

    /* renamed from: C0 */
    public cl2 mo2733C0(int i) {
        return this.f2016b.get(findViewById(i));
    }

    /* renamed from: D0 */
    public C0393b.C0395b mo2734D0(int i) {
        return this.f2005a.mo2897O(i);
    }

    /* renamed from: E0 */
    public void mo2735E0(View view, float f, float f2, float[] fArr, int i) {
        float f3;
        float f4 = this.f1993a;
        float f5 = this.f2021d;
        if (this.f1998a != null) {
            float signum = Math.signum(this.f2024e - f5);
            float interpolation = this.f1998a.getInterpolation(this.f2021d + 1.0E-5f);
            float interpolation2 = this.f1998a.getInterpolation(this.f2021d);
            f4 = (signum * ((interpolation - interpolation2) / 1.0E-5f)) / this.f2012b;
            f3 = interpolation2;
        } else {
            f3 = f5;
        }
        Interpolator interpolator = this.f1998a;
        if (interpolator instanceof el2) {
            f4 = ((el2) interpolator).mo2838a();
        }
        cl2 cl2 = this.f2016b.get(view);
        if ((i & 1) == 0) {
            cl2.mo14199C(f3, view.getWidth(), view.getHeight(), f, f2, fArr);
        } else {
            cl2.mo14240p(f3, f, f2, fArr);
        }
        if (i < 2) {
            fArr[0] = fArr[0] * f4;
            fArr[1] = fArr[1] * f4;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0039  */
    /* renamed from: F0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo2736F0(float r8, float r9, android.view.View r10, android.view.MotionEvent r11) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof android.view.ViewGroup
            r1 = 1
            if (r0 == 0) goto L_0x0036
            r0 = r10
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r2 = r0.getChildCount()
            int r2 = r2 - r1
        L_0x000d:
            if (r2 < 0) goto L_0x0036
            android.view.View r3 = r0.getChildAt(r2)
            int r4 = r3.getLeft()
            float r4 = (float) r4
            float r4 = r4 + r8
            int r5 = r10.getScrollX()
            float r5 = (float) r5
            float r4 = r4 - r5
            int r5 = r3.getTop()
            float r5 = (float) r5
            float r5 = r5 + r9
            int r6 = r10.getScrollY()
            float r6 = (float) r6
            float r5 = r5 - r6
            boolean r3 = r7.mo2736F0(r4, r5, r3, r11)
            if (r3 == 0) goto L_0x0033
            r0 = 1
            goto L_0x0037
        L_0x0033:
            int r2 = r2 + -1
            goto L_0x000d
        L_0x0036:
            r0 = 0
        L_0x0037:
            if (r0 != 0) goto L_0x0075
            android.graphics.RectF r2 = r7.f1996a
            int r3 = r10.getRight()
            float r3 = (float) r3
            float r3 = r3 + r8
            int r4 = r10.getLeft()
            float r4 = (float) r4
            float r3 = r3 - r4
            int r4 = r10.getBottom()
            float r4 = (float) r4
            float r4 = r4 + r9
            int r5 = r10.getTop()
            float r5 = (float) r5
            float r4 = r4 - r5
            r2.set(r8, r9, r3, r4)
            int r2 = r11.getAction()
            if (r2 != 0) goto L_0x006c
            android.graphics.RectF r2 = r7.f1996a
            float r3 = r11.getX()
            float r4 = r11.getY()
            boolean r2 = r2.contains(r3, r4)
            if (r2 == 0) goto L_0x0075
        L_0x006c:
            float r8 = -r8
            float r9 = -r9
            boolean r8 = r7.mo2781h0(r10, r11, r8, r9)
            if (r8 == 0) goto L_0x0075
            goto L_0x0076
        L_0x0075:
            r1 = r0
        L_0x0076:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.mo2736F0(float, float, android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: G0 */
    public final void mo2737G0(AttributeSet attributeSet) {
        C0393b bVar;
        int i;
        f1969w = isInEditMode();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0435e.C0448m.MotionLayout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            boolean z = true;
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == C0435e.C0448m.MotionLayout_layoutDescription) {
                    this.f2005a = new C0393b(getContext(), this, obtainStyledAttributes.getResourceId(index, -1));
                } else if (index == C0435e.C0448m.MotionLayout_currentState) {
                    this.f1971D = obtainStyledAttributes.getResourceId(index, -1);
                } else if (index == C0435e.C0448m.MotionLayout_motionProgress) {
                    this.f2024e = obtainStyledAttributes.getFloat(index, 0.0f);
                    this.f2034j = true;
                } else if (index == C0435e.C0448m.MotionLayout_applyMotionScene) {
                    z = obtainStyledAttributes.getBoolean(index, z);
                } else {
                    if (index == C0435e.C0448m.MotionLayout_showPaths) {
                        if (this.f1975H == 0) {
                            i = obtainStyledAttributes.getBoolean(index, false) ? 2 : 0;
                        }
                    } else if (index == C0435e.C0448m.MotionLayout_motionDebug) {
                        i = obtainStyledAttributes.getInt(index, 0);
                    }
                    this.f1975H = i;
                }
            }
            obtainStyledAttributes.recycle();
            if (this.f2005a == null) {
                Log.e(f1954d, "WARNING NO app:layoutDescription tag");
            }
            if (!z) {
                this.f2005a = null;
            }
        }
        if (this.f1975H != 0) {
            mo2783i0();
        }
        if (this.f1971D == -1 && (bVar = this.f2005a) != null) {
            this.f1971D = bVar.mo2896N();
            this.f1970C = this.f2005a.mo2896N();
            this.f1972E = this.f2005a.mo2943u();
        }
    }

    /* renamed from: H0 */
    public boolean mo2738H0() {
        return this.f2047t;
    }

    /* renamed from: I0 */
    public boolean mo2739I0() {
        return this.f2046s;
    }

    /* renamed from: J0 */
    public boolean mo2740J0() {
        return this.f2030h;
    }

    /* renamed from: K0 */
    public boolean mo2741K0(int i) {
        C0393b bVar = this.f2005a;
        if (bVar != null) {
            return bVar.mo2903U(i);
        }
        return false;
    }

    /* renamed from: L0 */
    public void mo2742L0(int i) {
        float f;
        if (!isAttachedToWindow()) {
            this.f1971D = i;
        }
        if (this.f1970C == i) {
            f = 0.0f;
        } else if (this.f1972E == i) {
            f = 1.0f;
        } else {
            setTransition(i, i);
            return;
        }
        setProgress(f);
    }

    /* renamed from: M0 */
    public int mo2743M0(String str) {
        C0393b bVar = this.f2005a;
        if (bVar == null) {
            return 0;
        }
        return bVar.mo2905W(str);
    }

    /* renamed from: N0 */
    public C0387i mo2744N0() {
        return C0388j.m2806i();
    }

    /* renamed from: O0 */
    public void mo2745O0() {
        C0393b bVar = this.f2005a;
        if (bVar != null) {
            if (bVar.mo2920i(this, this.f1971D)) {
                requestLayout();
                return;
            }
            int i = this.f1971D;
            if (i != -1) {
                this.f2005a.mo2914f(this, i);
            }
            if (this.f2005a.mo2938r0()) {
                this.f2005a.mo2935p0();
            }
        }
    }

    /* renamed from: P0 */
    public final void mo2746P0() {
        CopyOnWriteArrayList<C0390l> copyOnWriteArrayList;
        if (this.f2003a != null || ((copyOnWriteArrayList = this.f2010a) != null && !copyOnWriteArrayList.isEmpty())) {
            this.f2043p = false;
            Iterator<Integer> it = this.f2026e.iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                C0390l lVar = this.f2003a;
                if (lVar != null) {
                    lVar.mo2649i(this, next.intValue());
                }
                CopyOnWriteArrayList<C0390l> copyOnWriteArrayList2 = this.f2010a;
                if (copyOnWriteArrayList2 != null) {
                    Iterator<C0390l> it2 = copyOnWriteArrayList2.iterator();
                    while (it2.hasNext()) {
                        it2.next().mo2649i(this, next.intValue());
                    }
                }
            }
            this.f2026e.clear();
        }
    }

    @Deprecated
    /* renamed from: Q0 */
    public void mo2747Q0() {
        Log.e(f1954d, "This method is deprecated. Please call rebuildScene() instead.");
        mo2748R0();
    }

    /* renamed from: R0 */
    public void mo2748R0() {
        this.f2001a.mo2864k();
        invalidate();
    }

    /* renamed from: S0 */
    public boolean mo2749S0(C0390l lVar) {
        CopyOnWriteArrayList<C0390l> copyOnWriteArrayList = this.f2010a;
        if (copyOnWriteArrayList == null) {
            return false;
        }
        return copyOnWriteArrayList.remove(lVar);
    }

    @sj3(api = 17)
    /* renamed from: T0 */
    public void mo2750T0(int i, int i2) {
        int i3 = 1;
        this.f2046s = true;
        this.f1990W = getWidth();
        this.f1991X = getHeight();
        int rotation = getDisplay().getRotation();
        if ((rotation + 1) % 4 <= (this.f1992Y + 1) % 4) {
            i3 = 2;
        }
        this.f1989V = i3;
        this.f1992Y = rotation;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            cv4 cv4 = this.f2020c.get(childAt);
            if (cv4 == null) {
                cv4 = new cv4();
                this.f2020c.put(childAt, cv4);
            }
            cv4.mo14395a(childAt);
        }
        this.f1970C = -1;
        this.f1972E = i;
        this.f2005a.mo2931n0(-1, i);
        this.f2001a.mo2861h(this.f2482a, (C0426d) null, this.f2005a.mo2932o(this.f1972E));
        this.f2017c = 0.0f;
        this.f2021d = 0.0f;
        invalidate();
        mo2757a1(new C0380b());
        if (i2 > 0) {
            this.f2012b = ((float) i2) / 1000.0f;
        }
    }

    /* renamed from: U0 */
    public void mo2751U0(int i) {
        if (getCurrentState() == -1) {
            mo2759c1(i);
            return;
        }
        int[] iArr = this.f2011a;
        if (iArr == null) {
            this.f2011a = new int[4];
        } else if (iArr.length <= this.f1988U) {
            this.f2011a = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f2011a;
        int i2 = this.f1988U;
        this.f1988U = i2 + 1;
        iArr2[i2] = i;
    }

    /* renamed from: V0 */
    public final void mo2752V0() {
        int childCount = getChildCount();
        this.f2001a.mo2854a();
        boolean z = true;
        this.f2034j = true;
        SparseArray sparseArray = new SparseArray();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            sparseArray.put(childAt.getId(), this.f2016b.get(childAt));
        }
        int width = getWidth();
        int height = getHeight();
        int m = this.f2005a.mo2928m();
        if (m != -1) {
            for (int i3 = 0; i3 < childCount; i3++) {
                cl2 cl2 = this.f2016b.get(getChildAt(i3));
                if (cl2 != null) {
                    cl2.mo14217U(m);
                }
            }
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        int[] iArr = new int[this.f2016b.size()];
        int i4 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            cl2 cl22 = this.f2016b.get(getChildAt(i5));
            if (cl22.mo14235k() != -1) {
                sparseBooleanArray.put(cl22.mo14235k(), true);
                iArr[i4] = cl22.mo14235k();
                i4++;
            }
        }
        if (this.f2023d != null) {
            for (int i6 = 0; i6 < i4; i6++) {
                cl2 cl23 = this.f2016b.get(findViewById(iArr[i6]));
                if (cl23 != null) {
                    this.f2005a.mo2948z(cl23);
                }
            }
            Iterator<MotionHelper> it = this.f2023d.iterator();
            while (it.hasNext()) {
                it.next().mo2718e(this, this.f2016b);
            }
            for (int i7 = 0; i7 < i4; i7++) {
                cl2 cl24 = this.f2016b.get(findViewById(iArr[i7]));
                if (cl24 != null) {
                    cl24.mo14224a0(width, height, this.f2012b, getNanoTime());
                }
            }
        } else {
            for (int i8 = 0; i8 < i4; i8++) {
                cl2 cl25 = this.f2016b.get(findViewById(iArr[i8]));
                if (cl25 != null) {
                    this.f2005a.mo2948z(cl25);
                    cl25.mo14224a0(width, height, this.f2012b, getNanoTime());
                }
            }
        }
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt2 = getChildAt(i9);
            cl2 cl26 = this.f2016b.get(childAt2);
            if (!sparseBooleanArray.get(childAt2.getId()) && cl26 != null) {
                this.f2005a.mo2948z(cl26);
                cl26.mo14224a0(width, height, this.f2012b, getNanoTime());
            }
        }
        float M = this.f2005a.mo2895M();
        if (M != 0.0f) {
            boolean z2 = ((double) M) < 0.0d;
            float abs = Math.abs(M);
            float f = -3.4028235E38f;
            float f2 = Float.MAX_VALUE;
            int i10 = 0;
            float f3 = Float.MAX_VALUE;
            float f4 = -3.4028235E38f;
            while (true) {
                if (i10 >= childCount) {
                    z = false;
                    break;
                }
                cl2 cl27 = this.f2016b.get(getChildAt(i10));
                if (!Float.isNaN(cl27.f10343a)) {
                    break;
                }
                float t = cl27.mo14244t();
                float u = cl27.mo14246u();
                float f5 = z2 ? u - t : u + t;
                f3 = Math.min(f3, f5);
                f4 = Math.max(f4, f5);
                i10++;
            }
            if (z) {
                for (int i11 = 0; i11 < childCount; i11++) {
                    cl2 cl28 = this.f2016b.get(getChildAt(i11));
                    if (!Float.isNaN(cl28.f10343a)) {
                        f2 = Math.min(f2, cl28.f10343a);
                        f = Math.max(f, cl28.f10343a);
                    }
                }
                while (i < childCount) {
                    cl2 cl29 = this.f2016b.get(getChildAt(i));
                    if (!Float.isNaN(cl29.f10343a)) {
                        cl29.f10373c = 1.0f / (1.0f - abs);
                        float f6 = cl29.f10343a;
                        cl29.f10361b = abs - (z2 ? ((f - f6) / (f - f2)) * abs : ((f6 - f2) * abs) / (f - f2));
                    }
                    i++;
                }
                return;
            }
            while (i < childCount) {
                cl2 cl210 = this.f2016b.get(getChildAt(i));
                float t2 = cl210.mo14244t();
                float u2 = cl210.mo14246u();
                float f7 = z2 ? u2 - t2 : u2 + t2;
                cl210.f10373c = 1.0f / (1.0f - abs);
                cl210.f10361b = abs - (((f7 - f3) * abs) / (f4 - f3));
                i++;
            }
        }
    }

    /* renamed from: W0 */
    public final Rect mo2753W0(o60 o60) {
        this.f1995a.top = o60.mo21731p0();
        this.f1995a.left = o60.mo21728o0();
        Rect rect = this.f1995a;
        int m0 = o60.mo21723m0();
        Rect rect2 = this.f1995a;
        rect.right = m0 + rect2.left;
        int D = o60.mo21619D();
        Rect rect3 = this.f1995a;
        rect2.bottom = D + rect3.top;
        return rect3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0037, code lost:
        if (r10 != 7) goto L_0x00cf;
     */
    /* renamed from: X0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2754X0(int r10, float r11, float r12) {
        /*
            r9 = this;
            androidx.constraintlayout.motion.widget.b r0 = r9.f2005a
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            float r0 = r9.f2021d
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x000c
            return
        L_0x000c:
            r0 = 1
            r9.f2038l = r0
            long r1 = r9.getNanoTime()
            r9.f2013b = r1
            androidx.constraintlayout.motion.widget.b r1 = r9.f2005a
            int r1 = r1.mo2941t()
            float r1 = (float) r1
            r2 = 1148846080(0x447a0000, float:1000.0)
            float r1 = r1 / r2
            r9.f2012b = r1
            r9.f2024e = r11
            r9.f2034j = r0
            r1 = 0
            r2 = 7
            r3 = 6
            r4 = 2
            if (r10 == 0) goto L_0x007e
            if (r10 == r0) goto L_0x007e
            if (r10 == r4) goto L_0x007e
            r5 = 4
            if (r10 == r5) goto L_0x006c
            r5 = 5
            if (r10 == r5) goto L_0x003b
            if (r10 == r3) goto L_0x007e
            if (r10 == r2) goto L_0x007e
            goto L_0x00cf
        L_0x003b:
            float r10 = r9.f2021d
            androidx.constraintlayout.motion.widget.b r0 = r9.f2005a
            float r0 = r0.mo2884B()
            boolean r10 = m2703k1(r12, r10, r0)
            if (r10 == 0) goto L_0x004a
            goto L_0x006c
        L_0x004a:
            com.onedelhi.secure.y34 r2 = r9.f2008a
            float r3 = r9.f2021d
            float r6 = r9.f2012b
            androidx.constraintlayout.motion.widget.b r10 = r9.f2005a
            float r7 = r10.mo2884B()
            androidx.constraintlayout.motion.widget.b r10 = r9.f2005a
            float r8 = r10.mo2885C()
            r4 = r11
            r5 = r12
            r2.mo27174b(r3, r4, r5, r6, r7, r8)
            r9.f1993a = r1
        L_0x0063:
            int r10 = r9.f1971D
            r9.f2024e = r11
            r9.f1971D = r10
            com.onedelhi.secure.y34 r10 = r9.f2008a
            goto L_0x007b
        L_0x006c:
            androidx.constraintlayout.motion.widget.MotionLayout$f r10 = r9.f1999a
            float r11 = r9.f2021d
            androidx.constraintlayout.motion.widget.b r0 = r9.f2005a
            float r0 = r0.mo2884B()
            r10.mo2839b(r12, r11, r0)
            androidx.constraintlayout.motion.widget.MotionLayout$f r10 = r9.f1999a
        L_0x007b:
            r9.f1998a = r10
            goto L_0x00cf
        L_0x007e:
            if (r10 == r0) goto L_0x008a
            if (r10 != r2) goto L_0x0083
            goto L_0x008a
        L_0x0083:
            if (r10 == r4) goto L_0x0087
            if (r10 != r3) goto L_0x008b
        L_0x0087:
            r11 = 1065353216(0x3f800000, float:1.0)
            goto L_0x008b
        L_0x008a:
            r11 = 0
        L_0x008b:
            androidx.constraintlayout.motion.widget.b r10 = r9.f2005a
            int r10 = r10.mo2930n()
            com.onedelhi.secure.y34 r0 = r9.f2008a
            float r1 = r9.f2021d
            if (r10 != 0) goto L_0x00ab
            float r4 = r9.f2012b
            androidx.constraintlayout.motion.widget.b r10 = r9.f2005a
            float r5 = r10.mo2884B()
            androidx.constraintlayout.motion.widget.b r10 = r9.f2005a
            float r6 = r10.mo2885C()
            r2 = r11
            r3 = r12
            r0.mo27174b(r1, r2, r3, r4, r5, r6)
            goto L_0x0063
        L_0x00ab:
            androidx.constraintlayout.motion.widget.b r10 = r9.f2005a
            float r4 = r10.mo2892J()
            androidx.constraintlayout.motion.widget.b r10 = r9.f2005a
            float r5 = r10.mo2893K()
            androidx.constraintlayout.motion.widget.b r10 = r9.f2005a
            float r6 = r10.mo2891I()
            androidx.constraintlayout.motion.widget.b r10 = r9.f2005a
            float r7 = r10.mo2894L()
            androidx.constraintlayout.motion.widget.b r10 = r9.f2005a
            int r8 = r10.mo2890H()
            r2 = r11
            r3 = r12
            r0.mo27178f(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0063
        L_0x00cf:
            r10 = 0
            r9.f2032i = r10
            long r10 = r9.getNanoTime()
            r9.f2013b = r10
            r9.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.mo2754X0(int, float, float):void");
    }

    /* renamed from: Y0 */
    public void mo2755Y0(float f, float f2) {
        if (this.f2005a != null && this.f2021d != f) {
            this.f2038l = true;
            this.f2013b = getNanoTime();
            this.f2012b = ((float) this.f2005a.mo2941t()) / 1000.0f;
            this.f2024e = f;
            this.f2034j = true;
            this.f2008a.mo27178f(this.f2021d, f, f2, this.f2005a.mo2892J(), this.f2005a.mo2893K(), this.f2005a.mo2891I(), this.f2005a.mo2894L(), this.f2005a.mo2890H());
            int i = this.f1971D;
            this.f2024e = f;
            this.f1971D = i;
            this.f1998a = this.f2008a;
            this.f2032i = false;
            this.f2013b = getNanoTime();
            invalidate();
        }
    }

    /* renamed from: Z0 */
    public void mo2756Z0() {
        mo2764f0(1.0f);
        this.f2009a = null;
    }

    /* renamed from: a1 */
    public void mo2757a1(Runnable runnable) {
        mo2764f0(1.0f);
        this.f2009a = runnable;
    }

    /* renamed from: b */
    public void mo1562b(@mr2 View view, int i, int i2, @mr2 int[] iArr, int i3) {
        C0393b.C0395b bVar;
        C0397c J;
        int s;
        C0393b bVar2 = this.f2005a;
        if (bVar2 != null && (bVar = bVar2.f2138a) != null && bVar.mo2960K()) {
            int i4 = -1;
            if (!bVar.mo2960K() || (J = bVar.mo2959J()) == null || (s = J.mo3011s()) == -1 || view.getId() == s) {
                if (bVar2.mo2886D()) {
                    C0397c J2 = bVar.mo2959J();
                    if (!(J2 == null || (J2.mo2998f() & 4) == 0)) {
                        i4 = i2;
                    }
                    float f = this.f2017c;
                    if ((f == 1.0f || f == 0.0f) && view.canScrollVertically(i4)) {
                        return;
                    }
                }
                if (!(bVar.mo2959J() == null || (bVar.mo2959J().mo2998f() & 1) == 0)) {
                    float F = bVar2.mo2888F((float) i, (float) i2);
                    float f2 = this.f2021d;
                    if ((f2 <= 0.0f && F < 0.0f) || (f2 >= 1.0f && F > 0.0f)) {
                        view.setNestedScrollingEnabled(false);
                        view.post(new C0381c(this, view));
                        return;
                    }
                }
                float f3 = this.f2017c;
                long nanoTime = getNanoTime();
                float f4 = (float) i;
                this.f2029h = f4;
                float f5 = (float) i2;
                this.f2031i = f5;
                this.f2033j = (float) (((double) (nanoTime - this.f2022d)) * 1.0E-9d);
                this.f2022d = nanoTime;
                bVar2.mo2912d0(f4, f5);
                if (f3 != this.f2017c) {
                    iArr[0] = i;
                    iArr[1] = i2;
                }
                mo2805s0(false);
                if (iArr[0] != 0 || iArr[1] != 0) {
                    this.f2041n = true;
                }
            }
        }
    }

    /* renamed from: b1 */
    public void mo2758b1() {
        mo2764f0(0.0f);
    }

    /* renamed from: c1 */
    public void mo2759c1(int i) {
        if (!isAttachedToWindow()) {
            if (this.f2002a == null) {
                this.f2002a = new C0389k();
            }
            this.f2002a.mo2879d(i);
            return;
        }
        mo2763e1(i, -1, -1);
    }

    /* renamed from: d1 */
    public void mo2760d1(int i, int i2) {
        if (!isAttachedToWindow()) {
            if (this.f2002a == null) {
                this.f2002a = new C0389k();
            }
            this.f2002a.mo2879d(i);
            return;
        }
        mo2765f1(i, -1, -1, i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ca  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dispatchDraw(android.graphics.Canvas r10) {
        /*
            r9 = this;
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionHelper> r0 = r9.f2023d
            if (r0 == 0) goto L_0x0018
            java.util.Iterator r0 = r0.iterator()
        L_0x0008:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0018
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.motion.widget.MotionHelper r1 = (androidx.constraintlayout.motion.widget.MotionHelper) r1
            r1.mo2725f(r10)
            goto L_0x0008
        L_0x0018:
            r0 = 0
            r9.mo2805s0(r0)
            androidx.constraintlayout.motion.widget.b r1 = r9.f2005a
            if (r1 == 0) goto L_0x0027
            androidx.constraintlayout.motion.widget.g r1 = r1.f2139a
            if (r1 == 0) goto L_0x0027
            r1.mo3050d()
        L_0x0027:
            super.dispatchDraw(r10)
            androidx.constraintlayout.motion.widget.b r1 = r9.f2005a
            if (r1 != 0) goto L_0x002f
            return
        L_0x002f:
            int r1 = r9.f1975H
            r2 = 1
            r1 = r1 & r2
            if (r1 != r2) goto L_0x00f6
            boolean r1 = r9.isInEditMode()
            if (r1 != 0) goto L_0x00f6
            int r1 = r9.f1980M
            int r1 = r1 + r2
            r9.f1980M = r1
            long r3 = r9.getNanoTime()
            long r5 = r9.f2025e
            r7 = -1
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x006a
            long r5 = r3 - r5
            r7 = 200000000(0xbebc200, double:9.8813129E-316)
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 <= 0) goto L_0x006c
            int r1 = r9.f1980M
            float r1 = (float) r1
            float r5 = (float) r5
            r6 = 814313567(0x3089705f, float:1.0E-9)
            float r5 = r5 * r6
            float r1 = r1 / r5
            r5 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 * r5
            int r1 = (int) r1
            float r1 = (float) r1
            float r1 = r1 / r5
            r9.f2035k = r1
            r9.f1980M = r0
        L_0x006a:
            r9.f2025e = r3
        L_0x006c:
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r1 = 1109917696(0x42280000, float:42.0)
            r0.setTextSize(r1)
            float r1 = r9.getProgress()
            r3 = 1148846080(0x447a0000, float:1000.0)
            float r1 = r1 * r3
            int r1 = (int) r1
            float r1 = (float) r1
            r3 = 1092616192(0x41200000, float:10.0)
            float r1 = r1 / r3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            float r5 = r9.f2035k
            r4.append(r5)
            java.lang.String r5 = " fps "
            r4.append(r5)
            int r5 = r9.f1970C
            java.lang.String r5 = com.onedelhi.secure.ve0.m30013l(r9, r5)
            r4.append(r5)
            java.lang.String r5 = " -> "
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            int r4 = r9.f1972E
            java.lang.String r4 = com.onedelhi.secure.ve0.m30013l(r9, r4)
            r5.append(r4)
            java.lang.String r4 = " (progress: "
            r5.append(r4)
            r5.append(r1)
            java.lang.String r1 = " ) state="
            r5.append(r1)
            int r1 = r9.f1971D
            r4 = -1
            if (r1 != r4) goto L_0x00ca
            java.lang.String r1 = "undefined"
            goto L_0x00ce
        L_0x00ca:
            java.lang.String r1 = com.onedelhi.secure.ve0.m30013l(r9, r1)
        L_0x00ce:
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0.setColor(r4)
            r4 = 1093664768(0x41300000, float:11.0)
            int r5 = r9.getHeight()
            int r5 = r5 + -29
            float r5 = (float) r5
            r10.drawText(r1, r4, r5, r0)
            r4 = -7864184(0xffffffffff880088, float:NaN)
            r0.setColor(r4)
            int r4 = r9.getHeight()
            int r4 = r4 + -30
            float r4 = (float) r4
            r10.drawText(r1, r3, r4, r0)
        L_0x00f6:
            int r0 = r9.f1975H
            if (r0 <= r2) goto L_0x0114
            androidx.constraintlayout.motion.widget.MotionLayout$g r0 = r9.f2000a
            if (r0 != 0) goto L_0x0105
            androidx.constraintlayout.motion.widget.MotionLayout$g r0 = new androidx.constraintlayout.motion.widget.MotionLayout$g
            r0.<init>()
            r9.f2000a = r0
        L_0x0105:
            androidx.constraintlayout.motion.widget.MotionLayout$g r0 = r9.f2000a
            java.util.HashMap<android.view.View, com.onedelhi.secure.cl2> r1 = r9.f2016b
            androidx.constraintlayout.motion.widget.b r2 = r9.f2005a
            int r2 = r2.mo2941t()
            int r3 = r9.f1975H
            r0.mo2841a(r10, r1, r2, r3)
        L_0x0114:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionHelper> r0 = r9.f2023d
            if (r0 == 0) goto L_0x012c
            java.util.Iterator r0 = r0.iterator()
        L_0x011c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x012c
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.motion.widget.MotionHelper r1 = (androidx.constraintlayout.motion.widget.MotionHelper) r1
            r1.mo2721a(r10)
            goto L_0x011c
        L_0x012c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.dispatchDraw(android.graphics.Canvas):void");
    }

    /* renamed from: e0 */
    public void mo2762e0(C0390l lVar) {
        if (this.f2010a == null) {
            this.f2010a = new CopyOnWriteArrayList<>();
        }
        this.f2010a.add(lVar);
    }

    /* renamed from: e1 */
    public void mo2763e1(int i, int i2, int i3) {
        mo2765f1(i, i2, i3, -1);
    }

    /* renamed from: f0 */
    public void mo2764f0(float f) {
        C0393b bVar = this.f2005a;
        if (bVar != null) {
            float f2 = this.f2021d;
            float f3 = this.f2017c;
            if (f2 != f3 && this.f2032i) {
                this.f2021d = f3;
            }
            float f4 = this.f2021d;
            if (f4 != f) {
                this.f2038l = false;
                this.f2024e = f;
                this.f2012b = ((float) bVar.mo2941t()) / 1000.0f;
                setProgress(this.f2024e);
                this.f1998a = null;
                this.f2014b = this.f2005a.mo2946x();
                this.f2032i = false;
                this.f2013b = getNanoTime();
                this.f2034j = true;
                this.f2017c = f4;
                this.f2021d = f4;
                invalidate();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0091, code lost:
        if (r14 > 0) goto L_0x008c;
     */
    /* renamed from: f1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2765f1(int r11, int r12, int r13, int r14) {
        /*
            r10 = this;
            androidx.constraintlayout.motion.widget.b r0 = r10.f2005a
            r1 = -1
            if (r0 == 0) goto L_0x0014
            androidx.constraintlayout.widget.g r0 = r0.f2140a
            if (r0 == 0) goto L_0x0014
            int r2 = r10.f1971D
            float r12 = (float) r12
            float r13 = (float) r13
            int r12 = r0.mo3561a(r2, r11, r12, r13)
            if (r12 == r1) goto L_0x0014
            r11 = r12
        L_0x0014:
            int r12 = r10.f1971D
            if (r12 != r11) goto L_0x0019
            return
        L_0x0019:
            int r13 = r10.f1970C
            r0 = 1148846080(0x447a0000, float:1000.0)
            r2 = 0
            if (r13 != r11) goto L_0x002a
            r10.mo2764f0(r2)
            if (r14 <= 0) goto L_0x0029
            float r11 = (float) r14
            float r11 = r11 / r0
            r10.f2012b = r11
        L_0x0029:
            return
        L_0x002a:
            int r13 = r10.f1972E
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r13 != r11) goto L_0x003a
            r10.mo2764f0(r3)
            if (r14 <= 0) goto L_0x0039
            float r11 = (float) r14
            float r11 = r11 / r0
            r10.f2012b = r11
        L_0x0039:
            return
        L_0x003a:
            r10.f1972E = r11
            if (r12 == r1) goto L_0x0050
            r10.setTransition(r12, r11)
            r10.mo2764f0(r3)
            r10.f2021d = r2
            r10.mo2756Z0()
            if (r14 <= 0) goto L_0x004f
            float r11 = (float) r14
            float r11 = r11 / r0
            r10.f2012b = r11
        L_0x004f:
            return
        L_0x0050:
            r12 = 0
            r10.f2038l = r12
            r10.f2024e = r3
            r10.f2017c = r2
            r10.f2021d = r2
            long r4 = r10.getNanoTime()
            r10.f2018c = r4
            long r4 = r10.getNanoTime()
            r10.f2013b = r4
            r10.f2032i = r12
            r13 = 0
            r10.f1998a = r13
            if (r14 != r1) goto L_0x0076
            androidx.constraintlayout.motion.widget.b r4 = r10.f2005a
            int r4 = r4.mo2941t()
            float r4 = (float) r4
            float r4 = r4 / r0
            r10.f2012b = r4
        L_0x0076:
            r10.f1970C = r1
            androidx.constraintlayout.motion.widget.b r4 = r10.f2005a
            int r5 = r10.f1972E
            r4.mo2931n0(r1, r5)
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            if (r14 != 0) goto L_0x0091
            androidx.constraintlayout.motion.widget.b r14 = r10.f2005a
            int r14 = r14.mo2941t()
        L_0x008c:
            float r14 = (float) r14
            float r14 = r14 / r0
            r10.f2012b = r14
            goto L_0x0094
        L_0x0091:
            if (r14 <= 0) goto L_0x0094
            goto L_0x008c
        L_0x0094:
            int r14 = r10.getChildCount()
            java.util.HashMap<android.view.View, com.onedelhi.secure.cl2> r0 = r10.f2016b
            r0.clear()
            r0 = 0
        L_0x009e:
            if (r0 >= r14) goto L_0x00c0
            android.view.View r4 = r10.getChildAt(r0)
            com.onedelhi.secure.cl2 r5 = new com.onedelhi.secure.cl2
            r5.<init>(r4)
            java.util.HashMap<android.view.View, com.onedelhi.secure.cl2> r6 = r10.f2016b
            r6.put(r4, r5)
            int r5 = r4.getId()
            java.util.HashMap<android.view.View, com.onedelhi.secure.cl2> r6 = r10.f2016b
            java.lang.Object r4 = r6.get(r4)
            com.onedelhi.secure.cl2 r4 = (com.onedelhi.secure.cl2) r4
            r1.put(r5, r4)
            int r0 = r0 + 1
            goto L_0x009e
        L_0x00c0:
            r0 = 1
            r10.f2034j = r0
            androidx.constraintlayout.motion.widget.MotionLayout$h r1 = r10.f2001a
            com.onedelhi.secure.p60 r4 = r10.f2482a
            androidx.constraintlayout.motion.widget.b r5 = r10.f2005a
            androidx.constraintlayout.widget.d r11 = r5.mo2932o(r11)
            r1.mo2861h(r4, r13, r11)
            r10.mo2748R0()
            androidx.constraintlayout.motion.widget.MotionLayout$h r11 = r10.f2001a
            r11.mo2854a()
            r10.mo2790m0()
            int r11 = r10.getWidth()
            int r13 = r10.getHeight()
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionHelper> r1 = r10.f2023d
            if (r1 == 0) goto L_0x0139
            r1 = 0
        L_0x00e8:
            if (r1 >= r14) goto L_0x0101
            java.util.HashMap<android.view.View, com.onedelhi.secure.cl2> r4 = r10.f2016b
            android.view.View r5 = r10.getChildAt(r1)
            java.lang.Object r4 = r4.get(r5)
            com.onedelhi.secure.cl2 r4 = (com.onedelhi.secure.cl2) r4
            if (r4 != 0) goto L_0x00f9
            goto L_0x00fe
        L_0x00f9:
            androidx.constraintlayout.motion.widget.b r5 = r10.f2005a
            r5.mo2948z(r4)
        L_0x00fe:
            int r1 = r1 + 1
            goto L_0x00e8
        L_0x0101:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionHelper> r1 = r10.f2023d
            java.util.Iterator r1 = r1.iterator()
        L_0x0107:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0119
            java.lang.Object r4 = r1.next()
            androidx.constraintlayout.motion.widget.MotionHelper r4 = (androidx.constraintlayout.motion.widget.MotionHelper) r4
            java.util.HashMap<android.view.View, com.onedelhi.secure.cl2> r5 = r10.f2016b
            r4.mo2718e(r10, r5)
            goto L_0x0107
        L_0x0119:
            r1 = 0
        L_0x011a:
            if (r1 >= r14) goto L_0x015e
            java.util.HashMap<android.view.View, com.onedelhi.secure.cl2> r4 = r10.f2016b
            android.view.View r5 = r10.getChildAt(r1)
            java.lang.Object r4 = r4.get(r5)
            com.onedelhi.secure.cl2 r4 = (com.onedelhi.secure.cl2) r4
            if (r4 != 0) goto L_0x012b
            goto L_0x0136
        L_0x012b:
            float r7 = r10.f2012b
            long r8 = r10.getNanoTime()
            r5 = r11
            r6 = r13
            r4.mo14224a0(r5, r6, r7, r8)
        L_0x0136:
            int r1 = r1 + 1
            goto L_0x011a
        L_0x0139:
            r1 = 0
        L_0x013a:
            if (r1 >= r14) goto L_0x015e
            java.util.HashMap<android.view.View, com.onedelhi.secure.cl2> r4 = r10.f2016b
            android.view.View r5 = r10.getChildAt(r1)
            java.lang.Object r4 = r4.get(r5)
            com.onedelhi.secure.cl2 r4 = (com.onedelhi.secure.cl2) r4
            if (r4 != 0) goto L_0x014b
            goto L_0x015b
        L_0x014b:
            androidx.constraintlayout.motion.widget.b r5 = r10.f2005a
            r5.mo2948z(r4)
            float r7 = r10.f2012b
            long r8 = r10.getNanoTime()
            r5 = r11
            r6 = r13
            r4.mo14224a0(r5, r6, r7, r8)
        L_0x015b:
            int r1 = r1 + 1
            goto L_0x013a
        L_0x015e:
            androidx.constraintlayout.motion.widget.b r11 = r10.f2005a
            float r11 = r11.mo2895M()
            int r13 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r13 == 0) goto L_0x01bb
            r13 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r1 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r4 = 0
        L_0x016f:
            if (r4 >= r14) goto L_0x0191
            java.util.HashMap<android.view.View, com.onedelhi.secure.cl2> r5 = r10.f2016b
            android.view.View r6 = r10.getChildAt(r4)
            java.lang.Object r5 = r5.get(r6)
            com.onedelhi.secure.cl2 r5 = (com.onedelhi.secure.cl2) r5
            float r6 = r5.mo14244t()
            float r5 = r5.mo14246u()
            float r5 = r5 + r6
            float r13 = java.lang.Math.min(r13, r5)
            float r1 = java.lang.Math.max(r1, r5)
            int r4 = r4 + 1
            goto L_0x016f
        L_0x0191:
            if (r12 >= r14) goto L_0x01bb
            java.util.HashMap<android.view.View, com.onedelhi.secure.cl2> r4 = r10.f2016b
            android.view.View r5 = r10.getChildAt(r12)
            java.lang.Object r4 = r4.get(r5)
            com.onedelhi.secure.cl2 r4 = (com.onedelhi.secure.cl2) r4
            float r5 = r4.mo14244t()
            float r6 = r4.mo14246u()
            float r7 = r3 - r11
            float r7 = r3 / r7
            r4.f10373c = r7
            float r5 = r5 + r6
            float r5 = r5 - r13
            float r5 = r5 * r11
            float r6 = r1 - r13
            float r5 = r5 / r6
            float r5 = r11 - r5
            r4.f10361b = r5
            int r12 = r12 + 1
            goto L_0x0191
        L_0x01bb:
            r10.f2017c = r2
            r10.f2021d = r2
            r10.f2034j = r0
            r10.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.mo2765f1(int, int, int, int):void");
    }

    /* renamed from: g0 */
    public boolean mo2766g0(int i, cl2 cl2) {
        C0393b bVar = this.f2005a;
        if (bVar != null) {
            return bVar.mo2918h(i, cl2);
        }
        return false;
    }

    /* renamed from: g1 */
    public void mo2767g1() {
        this.f2001a.mo2861h(this.f2482a, this.f2005a.mo2932o(this.f1970C), this.f2005a.mo2932o(this.f1972E));
        mo2748R0();
    }

    public int[] getConstraintSetIds() {
        C0393b bVar = this.f2005a;
        if (bVar == null) {
            return null;
        }
        return bVar.mo2937r();
    }

    public int getCurrentState() {
        return this.f1971D;
    }

    public ArrayList<C0393b.C0395b> getDefinedTransitions() {
        C0393b bVar = this.f2005a;
        if (bVar == null) {
            return null;
        }
        return bVar.mo2939s();
    }

    public dk0 getDesignTool() {
        if (this.f2006a == null) {
            this.f2006a = new dk0(this);
        }
        return this.f2006a;
    }

    public int getEndState() {
        return this.f1972E;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.f2021d;
    }

    public C0393b getScene() {
        return this.f2005a;
    }

    public int getStartState() {
        return this.f1970C;
    }

    public float getTargetPosition() {
        return this.f2024e;
    }

    public Bundle getTransitionState() {
        if (this.f2002a == null) {
            this.f2002a = new C0389k();
        }
        this.f2002a.mo2878c();
        return this.f2002a.mo2877b();
    }

    public long getTransitionTimeMs() {
        C0393b bVar = this.f2005a;
        if (bVar != null) {
            this.f2012b = ((float) bVar.mo2941t()) / 1000.0f;
        }
        return (long) (this.f2012b * 1000.0f);
    }

    public float getVelocity() {
        return this.f1993a;
    }

    /* renamed from: h0 */
    public final boolean mo2781h0(View view, MotionEvent motionEvent, float f, float f2) {
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            motionEvent.offsetLocation(f, f2);
            boolean onTouchEvent = view.onTouchEvent(motionEvent);
            motionEvent.offsetLocation(-f, -f2);
            return onTouchEvent;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(f, f2);
        if (this.f1994a == null) {
            this.f1994a = new Matrix();
        }
        matrix.invert(this.f1994a);
        obtain.transform(this.f1994a);
        boolean onTouchEvent2 = view.onTouchEvent(obtain);
        obtain.recycle();
        return onTouchEvent2;
    }

    /* renamed from: h1 */
    public void mo2782h1(int i, C0426d dVar) {
        C0393b bVar = this.f2005a;
        if (bVar != null) {
            bVar.mo2923j0(i, dVar);
        }
        mo2767g1();
        if (this.f1971D == i) {
            dVar.mo3473r(this);
        }
    }

    /* renamed from: i0 */
    public final void mo2783i0() {
        C0393b bVar = this.f2005a;
        if (bVar == null) {
            Log.e(f1954d, "CHECK: motion scene not set! set \"app:layoutDescription=\"@xml/file\"");
            return;
        }
        int N = bVar.mo2896N();
        C0393b bVar2 = this.f2005a;
        mo2786j0(N, bVar2.mo2932o(bVar2.mo2896N()));
        SparseIntArray sparseIntArray = new SparseIntArray();
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        Iterator<C0393b.C0395b> it = this.f2005a.mo2939s().iterator();
        while (it.hasNext()) {
            C0393b.C0395b next = it.next();
            if (next == this.f2005a.f2138a) {
                Log.v(f1954d, "CHECK: CURRENT");
            }
            mo2788k0(next);
            int I = next.mo2958I();
            int B = next.mo2951B();
            String i = ve0.m30010i(getContext(), I);
            String i2 = ve0.m30010i(getContext(), B);
            if (sparseIntArray.get(I) == B) {
                Log.e(f1954d, "CHECK: two transitions with the same start and end " + i + "->" + i2);
            }
            if (sparseIntArray2.get(B) == I) {
                Log.e(f1954d, "CHECK: you can't have reverse transitions" + i + "->" + i2);
            }
            sparseIntArray.put(I, B);
            sparseIntArray2.put(B, I);
            if (this.f2005a.mo2932o(I) == null) {
                Log.e(f1954d, " no such constraintSetStart " + i);
            }
            if (this.f2005a.mo2932o(B) == null) {
                Log.e(f1954d, " no such constraintSetEnd " + i);
            }
        }
    }

    /* renamed from: i1 */
    public void mo2784i1(int i, C0426d dVar, int i2) {
        if (this.f2005a != null && this.f1971D == i) {
            int i3 = C0435e.C0442g.view_transition;
            mo2782h1(i3, mo2833z0(i));
            setState(i3, -1, -1);
            mo2782h1(i, dVar);
            C0393b.C0395b bVar = new C0393b.C0395b(-1, this.f2005a, i3, i);
            bVar.mo2964O(i2);
            setTransition(bVar);
            mo2756Z0();
        }
    }

    public boolean isAttachedToWindow() {
        return super.isAttachedToWindow();
    }

    /* renamed from: j0 */
    public final void mo2786j0(int i, C0426d dVar) {
        String i2 = ve0.m30010i(getContext(), i);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            int id = childAt.getId();
            if (id == -1) {
                Log.w(f1954d, "CHECK: " + i2 + " ALL VIEWS SHOULD HAVE ID's " + childAt.getClass().getName() + " does not!");
            }
            if (dVar.mo3455k0(id) == null) {
                Log.w(f1954d, "CHECK: " + i2 + " NO CONSTRAINTS for " + ve0.m30012k(childAt));
            }
        }
        int[] o0 = dVar.mo3466o0();
        for (int i4 = 0; i4 < o0.length; i4++) {
            int i5 = o0[i4];
            String i6 = ve0.m30010i(getContext(), i5);
            if (findViewById(o0[i4]) == null) {
                Log.w(f1954d, "CHECK: " + i2 + " NO View matches id " + i6);
            }
            if (dVar.mo3463n0(i5) == -1) {
                Log.w(f1954d, "CHECK: " + i2 + pl2.f33726c + i6 + ") no LAYOUT_HEIGHT");
            }
            if (dVar.mo3483u0(i5) == -1) {
                Log.w(f1954d, "CHECK: " + i2 + pl2.f33726c + i6 + ") no LAYOUT_HEIGHT");
            }
        }
    }

    /* renamed from: j1 */
    public void mo2787j1(int i, View... viewArr) {
        C0393b bVar = this.f2005a;
        if (bVar != null) {
            bVar.mo2942t0(i, viewArr);
        } else {
            Log.e(f1954d, " no motionScene");
        }
    }

    /* renamed from: k */
    public void mo1580k(@mr2 View view, int i) {
        C0393b bVar = this.f2005a;
        if (bVar != null) {
            float f = this.f2033j;
            if (f != 0.0f) {
                bVar.mo2913e0(this.f2029h / f, this.f2031i / f);
            }
        }
    }

    /* renamed from: k0 */
    public final void mo2788k0(C0393b.C0395b bVar) {
        if (bVar.mo2958I() == bVar.mo2951B()) {
            Log.e(f1954d, "CHECK: start and end constraint set should not be the same!");
        }
    }

    /* renamed from: l */
    public void mo1581l(@mr2 View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (!(!this.f2041n && i == 0 && i2 == 0)) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
        }
        this.f2041n = false;
    }

    /* renamed from: l0 */
    public C0426d mo2789l0(int i) {
        C0393b bVar = this.f2005a;
        if (bVar == null) {
            return null;
        }
        C0426d o = bVar.mo2932o(i);
        C0426d dVar = new C0426d();
        dVar.mo3399I(o);
        return dVar;
    }

    /* renamed from: m0 */
    public final void mo2790m0() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            cl2 cl2 = this.f2016b.get(childAt);
            if (cl2 != null) {
                cl2.mo14218V(childAt);
            }
        }
    }

    /* renamed from: n */
    public void mo1583n(@mr2 View view, int i, int i2, int i3, int i4, int i5) {
    }

    @SuppressLint({"LogConditional"})
    /* renamed from: n0 */
    public final void mo2791n0() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            Log.v(f1954d, " " + ve0.m30008g() + " " + ve0.m30012k(this) + " " + ve0.m30010i(getContext(), this.f1971D) + " " + ve0.m30012k(childAt) + childAt.getLeft() + " " + childAt.getTop());
        }
    }

    /* renamed from: o0 */
    public void mo2792o0(boolean z) {
        C0393b bVar = this.f2005a;
        if (bVar != null) {
            bVar.mo2924k(z);
        }
    }

    public void onAttachedToWindow() {
        C0393b.C0395b bVar;
        int i;
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            this.f1992Y = display.getRotation();
        }
        C0393b bVar2 = this.f2005a;
        if (!(bVar2 == null || (i = this.f1971D) == -1)) {
            C0426d o = bVar2.mo2932o(i);
            this.f2005a.mo2919h0(this);
            ArrayList<MotionHelper> arrayList = this.f2023d;
            if (arrayList != null) {
                Iterator<MotionHelper> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().mo2722b(this);
                }
            }
            if (o != null) {
                o.mo3473r(this);
            }
            this.f1970C = this.f1971D;
        }
        mo2745O0();
        C0389k kVar = this.f2002a;
        if (kVar == null) {
            C0393b bVar3 = this.f2005a;
            if (bVar3 != null && (bVar = bVar3.f2138a) != null && bVar.mo2980z() == 4) {
                mo2756Z0();
                setState(C0391m.SETUP);
                setState(C0391m.MOVING);
            }
        } else if (this.f2047t) {
            post(new C0382d());
        } else {
            kVar.mo2876a();
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C0397c J;
        int s;
        RectF r;
        C0393b bVar = this.f2005a;
        if (bVar != null && this.f2030h) {
            C0405g gVar = bVar.f2139a;
            if (gVar != null) {
                gVar.mo3058l(motionEvent);
            }
            C0393b.C0395b bVar2 = this.f2005a.f2138a;
            if (bVar2 != null && bVar2.mo2960K() && (J = bVar2.mo2959J()) != null && ((motionEvent.getAction() != 0 || (r = J.mo3010r(this, new RectF())) == null || r.contains(motionEvent.getX(), motionEvent.getY())) && (s = J.mo3011s()) != -1)) {
                View view = this.f1997a;
                if (view == null || view.getId() != s) {
                    this.f1997a = findViewById(s);
                }
                View view2 = this.f1997a;
                if (view2 != null) {
                    this.f1996a.set((float) view2.getLeft(), (float) this.f1997a.getTop(), (float) this.f1997a.getRight(), (float) this.f1997a.getBottom());
                    if (this.f1996a.contains(motionEvent.getX(), motionEvent.getY()) && !mo2736F0((float) this.f1997a.getLeft(), (float) this.f1997a.getTop(), this.f1997a, motionEvent)) {
                        return onTouchEvent(motionEvent);
                    }
                }
            }
        }
        return false;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f2045r = true;
        try {
            if (this.f2005a == null) {
                super.onLayout(z, i, i2, i3, i4);
                return;
            }
            int i5 = i3 - i;
            int i6 = i4 - i2;
            if (!(this.f1978K == i5 && this.f1979L == i6)) {
                mo2748R0();
                mo2805s0(true);
            }
            this.f1978K = i5;
            this.f1979L = i6;
            this.f1976I = i5;
            this.f1977J = i6;
            this.f2045r = false;
        } finally {
            this.f2045r = false;
        }
    }

    public void onMeasure(int i, int i2) {
        if (this.f2005a == null) {
            super.onMeasure(i, i2);
            return;
        }
        boolean z = false;
        boolean z2 = (this.f1973F == i && this.f1974G == i2) ? false : true;
        if (this.f2048u) {
            this.f2048u = false;
            mo2745O0();
            mo2746P0();
            z2 = true;
        }
        if (this.f2488b) {
            z2 = true;
        }
        this.f1973F = i;
        this.f1974G = i2;
        int N = this.f2005a.mo2896N();
        int u = this.f2005a.mo2943u();
        if ((z2 || this.f2001a.mo2862i(N, u)) && this.f1970C != -1) {
            super.onMeasure(i, i2);
            this.f2001a.mo2861h(this.f2482a, this.f2005a.mo2932o(N), this.f2005a.mo2932o(u));
            this.f2001a.mo2864k();
            this.f2001a.mo2865l(N, u);
        } else {
            if (z2) {
                super.onMeasure(i, i2);
            }
            z = true;
        }
        if (this.f2044q || z) {
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int m0 = this.f2482a.mo21723m0() + getPaddingLeft() + getPaddingRight();
            int D = this.f2482a.mo21619D() + paddingTop;
            int i3 = this.f1986S;
            if (i3 == Integer.MIN_VALUE || i3 == 0) {
                int i4 = this.f1982O;
                m0 = (int) (((float) i4) + (this.f2039m * ((float) (this.f1984Q - i4))));
                requestLayout();
            }
            int i5 = this.f1987T;
            if (i5 == Integer.MIN_VALUE || i5 == 0) {
                int i6 = this.f1983P;
                D = (int) (((float) i6) + (this.f2039m * ((float) (this.f1985R - i6))));
                requestLayout();
            }
            setMeasuredDimension(m0, D);
        }
        mo2824t0();
    }

    public boolean onNestedFling(@mr2 View view, float f, float f2, boolean z) {
        return false;
    }

    public boolean onNestedPreFling(@mr2 View view, float f, float f2) {
        return false;
    }

    public void onRtlPropertiesChanged(int i) {
        C0393b bVar = this.f2005a;
        if (bVar != null) {
            bVar.mo2929m0(mo3251w());
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C0393b bVar = this.f2005a;
        if (bVar == null || !this.f2030h || !bVar.mo2938r0()) {
            return super.onTouchEvent(motionEvent);
        }
        C0393b.C0395b bVar2 = this.f2005a.f2138a;
        if (bVar2 != null && !bVar2.mo2960K()) {
            return super.onTouchEvent(motionEvent);
        }
        this.f2005a.mo2915f0(motionEvent, getCurrentState(), this);
        if (this.f2005a.f2138a.mo2961L(4)) {
            return this.f2005a.f2138a.mo2959J().mo3012t();
        }
        return true;
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof MotionHelper) {
            MotionHelper motionHelper = (MotionHelper) view;
            if (this.f2010a == null) {
                this.f2010a = new CopyOnWriteArrayList<>();
            }
            this.f2010a.add(motionHelper);
            if (motionHelper.mo2724d()) {
                if (this.f2015b == null) {
                    this.f2015b = new ArrayList<>();
                }
                this.f2015b.add(motionHelper);
            }
            if (motionHelper.mo2728h()) {
                if (this.f2019c == null) {
                    this.f2019c = new ArrayList<>();
                }
                this.f2019c.add(motionHelper);
            }
            if (motionHelper.mo2719k()) {
                if (this.f2023d == null) {
                    this.f2023d = new ArrayList<>();
                }
                this.f2023d.add(motionHelper);
            }
        }
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<MotionHelper> arrayList = this.f2015b;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<MotionHelper> arrayList2 = this.f2019c;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    /* renamed from: p */
    public void mo1599p(@mr2 View view, @mr2 View view2, int i, int i2) {
        this.f2022d = getNanoTime();
        this.f2033j = 0.0f;
        this.f2029h = 0.0f;
        this.f2031i = 0.0f;
    }

    /* renamed from: p0 */
    public void mo2801p0(int i, boolean z) {
        boolean z2;
        C0393b.C0395b D0 = mo2734D0(i);
        if (z) {
            z2 = true;
        } else {
            C0393b bVar = this.f2005a;
            if (D0 == bVar.f2138a) {
                Iterator<C0393b.C0395b> it = bVar.mo2899Q(this.f1971D).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C0393b.C0395b next = it.next();
                    if (next.mo2960K()) {
                        this.f2005a.f2138a = next;
                        break;
                    }
                }
            }
            z2 = false;
        }
        D0.mo2966Q(z2);
    }

    /* renamed from: q0 */
    public void mo2802q0(int i, boolean z) {
        C0393b bVar = this.f2005a;
        if (bVar != null) {
            bVar.mo2926l(i, z);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r1.f2138a;
     */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo1601r(@com.onedelhi.secure.mr2 android.view.View r1, @com.onedelhi.secure.mr2 android.view.View r2, int r3, int r4) {
        /*
            r0 = this;
            androidx.constraintlayout.motion.widget.b r1 = r0.f2005a
            if (r1 == 0) goto L_0x0021
            androidx.constraintlayout.motion.widget.b$b r1 = r1.f2138a
            if (r1 == 0) goto L_0x0021
            androidx.constraintlayout.motion.widget.c r1 = r1.mo2959J()
            if (r1 == 0) goto L_0x0021
            androidx.constraintlayout.motion.widget.b r1 = r0.f2005a
            androidx.constraintlayout.motion.widget.b$b r1 = r1.f2138a
            androidx.constraintlayout.motion.widget.c r1 = r1.mo2959J()
            int r1 = r1.mo2998f()
            r1 = r1 & 2
            if (r1 == 0) goto L_0x001f
            goto L_0x0021
        L_0x001f:
            r1 = 1
            return r1
        L_0x0021:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.mo1601r(android.view.View, android.view.View, int, int):boolean");
    }

    /* renamed from: r0 */
    public void mo2803r0(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            cl2 cl2 = this.f2016b.get(getChildAt(i));
            if (cl2 != null) {
                cl2.mo14233i(z);
            }
        }
    }

    public void requestLayout() {
        C0393b bVar;
        C0393b.C0395b bVar2;
        if (!this.f2044q && this.f1971D == -1 && (bVar = this.f2005a) != null && (bVar2 = bVar.f2138a) != null) {
            int E = bVar2.mo2954E();
            if (E != 0) {
                if (E == 2) {
                    int childCount = getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        this.f2016b.get(getChildAt(i)).mo14212P();
                    }
                    return;
                }
            } else {
                return;
            }
        }
        super.requestLayout();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:156:0x024e, code lost:
        if (r1 != r2) goto L_0x0252;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x025e, code lost:
        if (r1 != r2) goto L_0x0252;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x020e A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x011a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0172  */
    /* renamed from: s0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2805s0(boolean r24) {
        /*
            r23 = this;
            r0 = r23
            long r1 = r0.f2018c
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0010
            long r1 = r23.getNanoTime()
            r0.f2018c = r1
        L_0x0010:
            float r1 = r0.f2021d
            r2 = -1
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            int r5 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r5 <= 0) goto L_0x0020
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x0020
            r0.f1971D = r2
        L_0x0020:
            boolean r5 = r0.f2042o
            r6 = 1
            r7 = 0
            if (r5 != 0) goto L_0x0032
            boolean r5 = r0.f2034j
            if (r5 == 0) goto L_0x0242
            if (r24 != 0) goto L_0x0032
            float r5 = r0.f2024e
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 == 0) goto L_0x0242
        L_0x0032:
            float r5 = r0.f2024e
            float r5 = r5 - r1
            float r1 = java.lang.Math.signum(r5)
            long r8 = r23.getNanoTime()
            android.view.animation.Interpolator r5 = r0.f1998a
            boolean r10 = r5 instanceof com.onedelhi.secure.el2
            r11 = 814313567(0x3089705f, float:1.0E-9)
            if (r10 != 0) goto L_0x0053
            long r12 = r0.f2018c
            long r12 = r8 - r12
            float r10 = (float) r12
            float r10 = r10 * r1
            float r10 = r10 * r11
            float r12 = r0.f2012b
            float r10 = r10 / r12
            goto L_0x0054
        L_0x0053:
            r10 = 0
        L_0x0054:
            float r12 = r0.f2021d
            float r12 = r12 + r10
            boolean r13 = r0.f2032i
            if (r13 == 0) goto L_0x005d
            float r12 = r0.f2024e
        L_0x005d:
            int r13 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r13 <= 0) goto L_0x0067
            float r14 = r0.f2024e
            int r14 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r14 >= 0) goto L_0x0071
        L_0x0067:
            int r14 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r14 > 0) goto L_0x0077
            float r14 = r0.f2024e
            int r14 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r14 > 0) goto L_0x0077
        L_0x0071:
            float r12 = r0.f2024e
            r0.f2034j = r7
            r14 = 1
            goto L_0x0078
        L_0x0077:
            r14 = 0
        L_0x0078:
            r0.f2021d = r12
            r0.f2017c = r12
            r0.f2018c = r8
            r15 = 2
            r16 = 925353388(0x3727c5ac, float:1.0E-5)
            if (r5 == 0) goto L_0x0106
            if (r14 != 0) goto L_0x0106
            boolean r14 = r0.f2038l
            if (r14 == 0) goto L_0x00e8
            long r2 = r0.f2013b
            long r2 = r8 - r2
            float r2 = (float) r2
            float r2 = r2 * r11
            float r2 = r5.getInterpolation(r2)
            android.view.animation.Interpolator r3 = r0.f1998a
            com.onedelhi.secure.y34 r5 = r0.f2008a
            if (r3 != r5) goto L_0x00a5
            boolean r3 = r5.mo27177e()
            if (r3 == 0) goto L_0x00a3
            r3 = 2
            goto L_0x00a6
        L_0x00a3:
            r3 = 1
            goto L_0x00a6
        L_0x00a5:
            r3 = 0
        L_0x00a6:
            r0.f2021d = r2
            r0.f2018c = r8
            android.view.animation.Interpolator r5 = r0.f1998a
            boolean r8 = r5 instanceof com.onedelhi.secure.el2
            if (r8 == 0) goto L_0x00e6
            com.onedelhi.secure.el2 r5 = (com.onedelhi.secure.el2) r5
            float r5 = r5.mo2838a()
            r0.f1993a = r5
            float r8 = java.lang.Math.abs(r5)
            float r9 = r0.f2012b
            float r8 = r8 * r9
            int r8 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r8 > 0) goto L_0x00c8
            if (r3 != r15) goto L_0x00c8
            r0.f2034j = r7
        L_0x00c8:
            int r8 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r8 <= 0) goto L_0x00d8
            r8 = 1065353216(0x3f800000, float:1.0)
            int r9 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r9 < 0) goto L_0x00d8
            r0.f2021d = r8
            r0.f2034j = r7
            r2 = 1065353216(0x3f800000, float:1.0)
        L_0x00d8:
            int r5 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r5 >= 0) goto L_0x00e6
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 > 0) goto L_0x00e6
            r0.f2021d = r4
            r0.f2034j = r7
            r12 = 0
            goto L_0x0109
        L_0x00e6:
            r12 = r2
            goto L_0x0109
        L_0x00e8:
            float r2 = r5.getInterpolation(r12)
            android.view.animation.Interpolator r3 = r0.f1998a
            boolean r5 = r3 instanceof com.onedelhi.secure.el2
            if (r5 == 0) goto L_0x00f9
            com.onedelhi.secure.el2 r3 = (com.onedelhi.secure.el2) r3
            float r3 = r3.mo2838a()
            goto L_0x0102
        L_0x00f9:
            float r12 = r12 + r10
            float r3 = r3.getInterpolation(r12)
            float r3 = r3 - r2
            float r3 = r3 * r1
            float r3 = r3 / r10
        L_0x0102:
            r0.f1993a = r3
            r12 = r2
            goto L_0x0108
        L_0x0106:
            r0.f1993a = r10
        L_0x0108:
            r3 = 0
        L_0x0109:
            float r2 = r0.f1993a
            float r2 = java.lang.Math.abs(r2)
            int r2 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r2 <= 0) goto L_0x0118
            androidx.constraintlayout.motion.widget.MotionLayout$m r2 = androidx.constraintlayout.motion.widget.MotionLayout.C0391m.MOVING
            r0.setState(r2)
        L_0x0118:
            if (r3 == r6) goto L_0x0141
            if (r13 <= 0) goto L_0x0122
            float r2 = r0.f2024e
            int r2 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x012c
        L_0x0122:
            int r2 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r2 > 0) goto L_0x0130
            float r2 = r0.f2024e
            int r2 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x0130
        L_0x012c:
            float r12 = r0.f2024e
            r0.f2034j = r7
        L_0x0130:
            r2 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x013a
            int r2 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r2 > 0) goto L_0x0141
        L_0x013a:
            r0.f2034j = r7
            androidx.constraintlayout.motion.widget.MotionLayout$m r2 = androidx.constraintlayout.motion.widget.MotionLayout.C0391m.FINISHED
            r0.setState(r2)
        L_0x0141:
            int r2 = r23.getChildCount()
            r0.f2042o = r7
            long r8 = r23.getNanoTime()
            r0.f2039m = r12
            android.view.animation.Interpolator r3 = r0.f2014b
            if (r3 != 0) goto L_0x0153
            r3 = r12
            goto L_0x0157
        L_0x0153:
            float r3 = r3.getInterpolation(r12)
        L_0x0157:
            android.view.animation.Interpolator r5 = r0.f2014b
            if (r5 == 0) goto L_0x016f
            float r10 = r0.f2012b
            float r10 = r1 / r10
            float r10 = r10 + r12
            float r5 = r5.getInterpolation(r10)
            r0.f1993a = r5
            android.view.animation.Interpolator r10 = r0.f2014b
            float r10 = r10.getInterpolation(r12)
            float r5 = r5 - r10
            r0.f1993a = r5
        L_0x016f:
            r5 = 0
        L_0x0170:
            if (r5 >= r2) goto L_0x0198
            android.view.View r10 = r0.getChildAt(r5)
            java.util.HashMap<android.view.View, com.onedelhi.secure.cl2> r11 = r0.f2016b
            java.lang.Object r11 = r11.get(r10)
            r17 = r11
            com.onedelhi.secure.cl2 r17 = (com.onedelhi.secure.cl2) r17
            if (r17 == 0) goto L_0x0195
            boolean r11 = r0.f2042o
            com.onedelhi.secure.ny1 r15 = r0.f2007a
            r18 = r10
            r19 = r3
            r20 = r8
            r22 = r15
            boolean r10 = r17.mo14208L(r18, r19, r20, r22)
            r10 = r10 | r11
            r0.f2042o = r10
        L_0x0195:
            int r5 = r5 + 1
            goto L_0x0170
        L_0x0198:
            if (r13 <= 0) goto L_0x01a0
            float r2 = r0.f2024e
            int r2 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x01aa
        L_0x01a0:
            int r2 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r2 > 0) goto L_0x01ac
            float r2 = r0.f2024e
            int r2 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x01ac
        L_0x01aa:
            r2 = 1
            goto L_0x01ad
        L_0x01ac:
            r2 = 0
        L_0x01ad:
            boolean r3 = r0.f2042o
            if (r3 != 0) goto L_0x01bc
            boolean r3 = r0.f2034j
            if (r3 != 0) goto L_0x01bc
            if (r2 == 0) goto L_0x01bc
            androidx.constraintlayout.motion.widget.MotionLayout$m r3 = androidx.constraintlayout.motion.widget.MotionLayout.C0391m.FINISHED
            r0.setState(r3)
        L_0x01bc:
            boolean r3 = r0.f2044q
            if (r3 == 0) goto L_0x01c3
            r23.requestLayout()
        L_0x01c3:
            boolean r3 = r0.f2042o
            r2 = r2 ^ r6
            r2 = r2 | r3
            r0.f2042o = r2
            int r2 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r2 > 0) goto L_0x01e7
            int r2 = r0.f1970C
            r3 = -1
            if (r2 == r3) goto L_0x01e7
            int r3 = r0.f1971D
            if (r3 == r2) goto L_0x01e7
            r0.f1971D = r2
            androidx.constraintlayout.motion.widget.b r3 = r0.f2005a
            androidx.constraintlayout.widget.d r2 = r3.mo2932o(r2)
            r2.mo3468p(r0)
            androidx.constraintlayout.motion.widget.MotionLayout$m r2 = androidx.constraintlayout.motion.widget.MotionLayout.C0391m.FINISHED
            r0.setState(r2)
            r7 = 1
        L_0x01e7:
            double r2 = (double) r12
            r8 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r5 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r5 < 0) goto L_0x0205
            int r2 = r0.f1971D
            int r3 = r0.f1972E
            if (r2 == r3) goto L_0x0205
            r0.f1971D = r3
            androidx.constraintlayout.motion.widget.b r2 = r0.f2005a
            androidx.constraintlayout.widget.d r2 = r2.mo2932o(r3)
            r2.mo3468p(r0)
            androidx.constraintlayout.motion.widget.MotionLayout$m r2 = androidx.constraintlayout.motion.widget.MotionLayout.C0391m.FINISHED
            r0.setState(r2)
            r7 = 1
        L_0x0205:
            boolean r2 = r0.f2042o
            if (r2 != 0) goto L_0x0224
            boolean r2 = r0.f2034j
            if (r2 == 0) goto L_0x020e
            goto L_0x0224
        L_0x020e:
            if (r13 <= 0) goto L_0x0216
            r2 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r3 == 0) goto L_0x021e
        L_0x0216:
            int r2 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r2 >= 0) goto L_0x0227
            int r2 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x0227
        L_0x021e:
            androidx.constraintlayout.motion.widget.MotionLayout$m r2 = androidx.constraintlayout.motion.widget.MotionLayout.C0391m.FINISHED
            r0.setState(r2)
            goto L_0x0227
        L_0x0224:
            r23.invalidate()
        L_0x0227:
            boolean r2 = r0.f2042o
            if (r2 != 0) goto L_0x0242
            boolean r2 = r0.f2034j
            if (r2 != 0) goto L_0x0242
            if (r13 <= 0) goto L_0x0237
            r2 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r3 == 0) goto L_0x023f
        L_0x0237:
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 >= 0) goto L_0x0242
            int r1 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x0242
        L_0x023f:
            r23.mo2745O0()
        L_0x0242:
            float r1 = r0.f2021d
            r2 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x0256
            int r1 = r0.f1971D
            int r2 = r0.f1972E
            if (r1 == r2) goto L_0x0251
            goto L_0x0252
        L_0x0251:
            r6 = r7
        L_0x0252:
            r0.f1971D = r2
            r7 = r6
            goto L_0x0261
        L_0x0256:
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 > 0) goto L_0x0261
            int r1 = r0.f1971D
            int r2 = r0.f1970C
            if (r1 == r2) goto L_0x0251
            goto L_0x0252
        L_0x0261:
            boolean r1 = r0.f2048u
            r1 = r1 | r7
            r0.f2048u = r1
            if (r7 == 0) goto L_0x026f
            boolean r1 = r0.f2045r
            if (r1 != 0) goto L_0x026f
            r23.requestLayout()
        L_0x026f:
            float r1 = r0.f2021d
            r0.f2017c = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.mo2805s0(boolean):void");
    }

    public void setDebugMode(int i) {
        this.f1975H = i;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z) {
        this.f2047t = z;
    }

    public void setInteractionEnabled(boolean z) {
        this.f2030h = z;
    }

    public void setInterpolatedProgress(float f) {
        if (this.f2005a != null) {
            setState(C0391m.MOVING);
            Interpolator x = this.f2005a.mo2946x();
            if (x != null) {
                setProgress(x.getInterpolation(f));
                return;
            }
        }
        setProgress(f);
    }

    public void setOnHide(float f) {
        ArrayList<MotionHelper> arrayList = this.f2019c;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f2019c.get(i).setProgress(f);
            }
        }
    }

    public void setOnShow(float f) {
        ArrayList<MotionHelper> arrayList = this.f2015b;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f2015b.get(i).setProgress(f);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0044, code lost:
        if (r5.f2021d == 0.0f) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0066, code lost:
        if (r5.f2021d == 1.0f) goto L_0x0046;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0075 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0076  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setProgress(float r6) {
        /*
            r5 = this;
            r0 = 0
            r1 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 < 0) goto L_0x000b
            int r3 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x0012
        L_0x000b:
            java.lang.String r3 = "MotionLayout"
            java.lang.String r4 = "Warning! Progress is defined for values between 0.0 and 1.0 inclusive"
            android.util.Log.w(r3, r4)
        L_0x0012:
            boolean r3 = r5.isAttachedToWindow()
            if (r3 != 0) goto L_0x0029
            androidx.constraintlayout.motion.widget.MotionLayout$k r0 = r5.f2002a
            if (r0 != 0) goto L_0x0023
            androidx.constraintlayout.motion.widget.MotionLayout$k r0 = new androidx.constraintlayout.motion.widget.MotionLayout$k
            r0.<init>()
            r5.f2002a = r0
        L_0x0023:
            androidx.constraintlayout.motion.widget.MotionLayout$k r0 = r5.f2002a
            r0.mo2880e(r6)
            return
        L_0x0029:
            if (r2 > 0) goto L_0x0049
            float r2 = r5.f2021d
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x003c
            int r1 = r5.f1971D
            int r2 = r5.f1972E
            if (r1 != r2) goto L_0x003c
            androidx.constraintlayout.motion.widget.MotionLayout$m r1 = androidx.constraintlayout.motion.widget.MotionLayout.C0391m.MOVING
            r5.setState(r1)
        L_0x003c:
            int r1 = r5.f1970C
            r5.f1971D = r1
            float r1 = r5.f2021d
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0071
        L_0x0046:
            androidx.constraintlayout.motion.widget.MotionLayout$m r0 = androidx.constraintlayout.motion.widget.MotionLayout.C0391m.FINISHED
            goto L_0x006e
        L_0x0049:
            int r2 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r2 < 0) goto L_0x0069
            float r2 = r5.f2021d
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x005e
            int r0 = r5.f1971D
            int r2 = r5.f1970C
            if (r0 != r2) goto L_0x005e
            androidx.constraintlayout.motion.widget.MotionLayout$m r0 = androidx.constraintlayout.motion.widget.MotionLayout.C0391m.MOVING
            r5.setState(r0)
        L_0x005e:
            int r0 = r5.f1972E
            r5.f1971D = r0
            float r0 = r5.f2021d
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0071
            goto L_0x0046
        L_0x0069:
            r0 = -1
            r5.f1971D = r0
            androidx.constraintlayout.motion.widget.MotionLayout$m r0 = androidx.constraintlayout.motion.widget.MotionLayout.C0391m.MOVING
        L_0x006e:
            r5.setState(r0)
        L_0x0071:
            androidx.constraintlayout.motion.widget.b r0 = r5.f2005a
            if (r0 != 0) goto L_0x0076
            return
        L_0x0076:
            r0 = 1
            r5.f2032i = r0
            r5.f2024e = r6
            r5.f2017c = r6
            r1 = -1
            r5.f2018c = r1
            r5.f2013b = r1
            r6 = 0
            r5.f1998a = r6
            r5.f2034j = r0
            r5.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.setProgress(float):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        if (r3 > 0.5f) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002d, code lost:
        if (r4 > 0) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setProgress(float r3, float r4) {
        /*
            r2 = this;
            boolean r0 = r2.isAttachedToWindow()
            if (r0 != 0) goto L_0x001c
            androidx.constraintlayout.motion.widget.MotionLayout$k r0 = r2.f2002a
            if (r0 != 0) goto L_0x0011
            androidx.constraintlayout.motion.widget.MotionLayout$k r0 = new androidx.constraintlayout.motion.widget.MotionLayout$k
            r0.<init>()
            r2.f2002a = r0
        L_0x0011:
            androidx.constraintlayout.motion.widget.MotionLayout$k r0 = r2.f2002a
            r0.mo2880e(r3)
            androidx.constraintlayout.motion.widget.MotionLayout$k r3 = r2.f2002a
            r3.mo2883h(r4)
            return
        L_0x001c:
            r2.setProgress(r3)
            androidx.constraintlayout.motion.widget.MotionLayout$m r0 = androidx.constraintlayout.motion.widget.MotionLayout.C0391m.MOVING
            r2.setState(r0)
            r2.f1993a = r4
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 0
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 == 0) goto L_0x0035
            if (r4 <= 0) goto L_0x0030
            goto L_0x0031
        L_0x0030:
            r0 = 0
        L_0x0031:
            r2.mo2764f0(r0)
            goto L_0x0044
        L_0x0035:
            int r4 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r4 == 0) goto L_0x0044
            int r4 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r4 == 0) goto L_0x0044
            r4 = 1056964608(0x3f000000, float:0.5)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x0030
            goto L_0x0031
        L_0x0044:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.setProgress(float, float):void");
    }

    public void setScene(C0393b bVar) {
        this.f2005a = bVar;
        bVar.mo2929m0(mo3251w());
        mo2748R0();
    }

    public void setStartState(int i) {
        if (!isAttachedToWindow()) {
            if (this.f2002a == null) {
                this.f2002a = new C0389k();
            }
            this.f2002a.mo2881f(i);
            this.f2002a.mo2879d(i);
            return;
        }
        this.f1971D = i;
    }

    public void setState(int i, int i2, int i3) {
        setState(C0391m.SETUP);
        this.f1971D = i;
        this.f1970C = -1;
        this.f1972E = -1;
        C0422b bVar = this.f2480a;
        if (bVar != null) {
            bVar.mo3328e(i, (float) i2, (float) i3);
            return;
        }
        C0393b bVar2 = this.f2005a;
        if (bVar2 != null) {
            bVar2.mo2932o(i).mo3473r(this);
        }
    }

    public void setState(C0391m mVar) {
        C0391m mVar2 = C0391m.FINISHED;
        if (mVar != mVar2 || this.f1971D != -1) {
            C0391m mVar3 = this.f2004a;
            this.f2004a = mVar;
            C0391m mVar4 = C0391m.MOVING;
            if (mVar3 == mVar4 && mVar == mVar4) {
                mo2826u0();
            }
            int i = C0383e.f2053a[mVar3.ordinal()];
            if (i == 1 || i == 2) {
                if (mVar == mVar4) {
                    mo2826u0();
                }
                if (mVar != mVar2) {
                    return;
                }
            } else if (!(i == 3 && mVar == mVar2)) {
                return;
            }
            mo2827v0();
        }
    }

    public void setTransition(int i) {
        C0393b bVar;
        int i2;
        if (this.f2005a != null) {
            C0393b.C0395b D0 = mo2734D0(i);
            this.f1970C = D0.mo2958I();
            this.f1972E = D0.mo2951B();
            if (!isAttachedToWindow()) {
                if (this.f2002a == null) {
                    this.f2002a = new C0389k();
                }
                this.f2002a.mo2881f(this.f1970C);
                this.f2002a.mo2879d(this.f1972E);
                return;
            }
            float f = Float.NaN;
            int i3 = this.f1971D;
            float f2 = 0.0f;
            if (i3 == this.f1970C) {
                f = 0.0f;
            } else if (i3 == this.f1972E) {
                f = 1.0f;
            }
            this.f2005a.mo2933o0(D0);
            this.f2001a.mo2861h(this.f2482a, this.f2005a.mo2932o(this.f1970C), this.f2005a.mo2932o(this.f1972E));
            mo2748R0();
            if (this.f2021d != f) {
                if (f == 0.0f) {
                    mo2803r0(true);
                    bVar = this.f2005a;
                    i2 = this.f1970C;
                } else if (f == 1.0f) {
                    mo2803r0(false);
                    bVar = this.f2005a;
                    i2 = this.f1972E;
                }
                bVar.mo2932o(i2).mo3473r(this);
            }
            if (!Float.isNaN(f)) {
                f2 = f;
            }
            this.f2021d = f2;
            if (Float.isNaN(f)) {
                Log.v(f1954d, ve0.m30008g() + " transitionToStart ");
                mo2758b1();
                return;
            }
            setProgress(f);
        }
    }

    public void setTransition(int i, int i2) {
        if (!isAttachedToWindow()) {
            if (this.f2002a == null) {
                this.f2002a = new C0389k();
            }
            this.f2002a.mo2881f(i);
            this.f2002a.mo2879d(i2);
            return;
        }
        C0393b bVar = this.f2005a;
        if (bVar != null) {
            this.f1970C = i;
            this.f1972E = i2;
            bVar.mo2931n0(i, i2);
            this.f2001a.mo2861h(this.f2482a, this.f2005a.mo2932o(i), this.f2005a.mo2932o(i2));
            mo2748R0();
            this.f2021d = 0.0f;
            mo2758b1();
        }
    }

    public void setTransition(C0393b.C0395b bVar) {
        this.f2005a.mo2933o0(bVar);
        setState(C0391m.SETUP);
        float f = this.f1971D == this.f2005a.mo2943u() ? 1.0f : 0.0f;
        this.f2021d = f;
        this.f2017c = f;
        this.f2024e = f;
        this.f2018c = bVar.mo2961L(1) ? -1 : getNanoTime();
        int N = this.f2005a.mo2896N();
        int u = this.f2005a.mo2943u();
        if (N != this.f1970C || u != this.f1972E) {
            this.f1970C = N;
            this.f1972E = u;
            this.f2005a.mo2931n0(N, u);
            this.f2001a.mo2861h(this.f2482a, this.f2005a.mo2932o(this.f1970C), this.f2005a.mo2932o(this.f1972E));
            this.f2001a.mo2865l(this.f1970C, this.f1972E);
            this.f2001a.mo2864k();
            mo2748R0();
        }
    }

    public void setTransitionDuration(int i) {
        C0393b bVar = this.f2005a;
        if (bVar == null) {
            Log.e(f1954d, "MotionScene not defined");
        } else {
            bVar.mo2925k0(i);
        }
    }

    public void setTransitionListener(C0390l lVar) {
        this.f2003a = lVar;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.f2002a == null) {
            this.f2002a = new C0389k();
        }
        this.f2002a.mo2882g(bundle);
        if (isAttachedToWindow()) {
            this.f2002a.mo2876a();
        }
    }

    /* renamed from: t0 */
    public final void mo2824t0() {
        boolean z;
        float signum = Math.signum(this.f2024e - this.f2021d);
        long nanoTime = getNanoTime();
        Interpolator interpolator = this.f1998a;
        float f = this.f2021d + (!(interpolator instanceof y34) ? ((((float) (nanoTime - this.f2018c)) * signum) * 1.0E-9f) / this.f2012b : 0.0f);
        if (this.f2032i) {
            f = this.f2024e;
        }
        int i = (signum > 0.0f ? 1 : (signum == 0.0f ? 0 : -1));
        if ((i <= 0 || f < this.f2024e) && (signum > 0.0f || f > this.f2024e)) {
            z = false;
        } else {
            f = this.f2024e;
            z = true;
        }
        if (interpolator != null && !z) {
            f = this.f2038l ? interpolator.getInterpolation(((float) (nanoTime - this.f2013b)) * 1.0E-9f) : interpolator.getInterpolation(f);
        }
        if ((i > 0 && f >= this.f2024e) || (signum <= 0.0f && f <= this.f2024e)) {
            f = this.f2024e;
        }
        this.f2039m = f;
        int childCount = getChildCount();
        long nanoTime2 = getNanoTime();
        Interpolator interpolator2 = this.f2014b;
        if (interpolator2 != null) {
            f = interpolator2.getInterpolation(f);
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            cl2 cl2 = this.f2016b.get(childAt);
            if (cl2 != null) {
                cl2.mo14208L(childAt, f, nanoTime2, this.f2007a);
            }
        }
        if (this.f2044q) {
            requestLayout();
        }
    }

    public String toString() {
        Context context = getContext();
        return ve0.m30010i(context, this.f1970C) + "->" + ve0.m30010i(context, this.f1972E) + " (pos:" + this.f2021d + " Dpos/Dt:" + this.f1993a;
    }

    /* renamed from: u0 */
    public final void mo2826u0() {
        CopyOnWriteArrayList<C0390l> copyOnWriteArrayList;
        if ((this.f2003a != null || ((copyOnWriteArrayList = this.f2010a) != null && !copyOnWriteArrayList.isEmpty())) && this.f2037l != this.f2017c) {
            if (this.f1981N != -1) {
                C0390l lVar = this.f2003a;
                if (lVar != null) {
                    lVar.mo2726g(this, this.f1970C, this.f1972E);
                }
                CopyOnWriteArrayList<C0390l> copyOnWriteArrayList2 = this.f2010a;
                if (copyOnWriteArrayList2 != null) {
                    Iterator<C0390l> it = copyOnWriteArrayList2.iterator();
                    while (it.hasNext()) {
                        it.next().mo2726g(this, this.f1970C, this.f1972E);
                    }
                }
                this.f2043p = true;
            }
            this.f1981N = -1;
            float f = this.f2017c;
            this.f2037l = f;
            C0390l lVar2 = this.f2003a;
            if (lVar2 != null) {
                lVar2.mo2650j(this, this.f1970C, this.f1972E, f);
            }
            CopyOnWriteArrayList<C0390l> copyOnWriteArrayList3 = this.f2010a;
            if (copyOnWriteArrayList3 != null) {
                Iterator<C0390l> it2 = copyOnWriteArrayList3.iterator();
                while (it2.hasNext()) {
                    it2.next().mo2650j(this, this.f1970C, this.f1972E, this.f2017c);
                }
            }
            this.f2043p = true;
        }
    }

    /* renamed from: v0 */
    public void mo2827v0() {
        int i;
        CopyOnWriteArrayList<C0390l> copyOnWriteArrayList;
        if ((this.f2003a != null || ((copyOnWriteArrayList = this.f2010a) != null && !copyOnWriteArrayList.isEmpty())) && this.f1981N == -1) {
            this.f1981N = this.f1971D;
            if (!this.f2026e.isEmpty()) {
                ArrayList<Integer> arrayList = this.f2026e;
                i = arrayList.get(arrayList.size() - 1).intValue();
            } else {
                i = -1;
            }
            int i2 = this.f1971D;
            if (!(i == i2 || i2 == -1)) {
                this.f2026e.add(Integer.valueOf(i2));
            }
        }
        mo2746P0();
        Runnable runnable = this.f2009a;
        if (runnable != null) {
            runnable.run();
        }
        int[] iArr = this.f2011a;
        if (iArr != null && this.f1988U > 0) {
            mo2759c1(iArr[0]);
            int[] iArr2 = this.f2011a;
            System.arraycopy(iArr2, 1, iArr2, 0, iArr2.length - 1);
            this.f1988U--;
        }
    }

    /* renamed from: w0 */
    public final void mo2828w0(MotionLayout motionLayout, int i, int i2) {
        C0390l lVar = this.f2003a;
        if (lVar != null) {
            lVar.mo2726g(this, i, i2);
        }
        CopyOnWriteArrayList<C0390l> copyOnWriteArrayList = this.f2010a;
        if (copyOnWriteArrayList != null) {
            Iterator<C0390l> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().mo2726g(motionLayout, i, i2);
            }
        }
    }

    /* renamed from: x */
    public void mo2829x(int i) {
        C0393b.C0395b bVar;
        if (i != 0) {
            try {
                C0393b bVar2 = new C0393b(getContext(), this, i);
                this.f2005a = bVar2;
                if (this.f1971D == -1) {
                    this.f1971D = bVar2.mo2896N();
                    this.f1970C = this.f2005a.mo2896N();
                    this.f1972E = this.f2005a.mo2943u();
                }
                if (isAttachedToWindow()) {
                    Display display = getDisplay();
                    this.f1992Y = display == null ? 0 : display.getRotation();
                    C0393b bVar3 = this.f2005a;
                    if (bVar3 != null) {
                        C0426d o = bVar3.mo2932o(this.f1971D);
                        this.f2005a.mo2919h0(this);
                        ArrayList<MotionHelper> arrayList = this.f2023d;
                        if (arrayList != null) {
                            Iterator<MotionHelper> it = arrayList.iterator();
                            while (it.hasNext()) {
                                it.next().mo2722b(this);
                            }
                        }
                        if (o != null) {
                            o.mo3473r(this);
                        }
                        this.f1970C = this.f1971D;
                    }
                    mo2745O0();
                    C0389k kVar = this.f2002a;
                    if (kVar == null) {
                        C0393b bVar4 = this.f2005a;
                        if (bVar4 != null && (bVar = bVar4.f2138a) != null && bVar.mo2980z() == 4) {
                            mo2756Z0();
                            setState(C0391m.SETUP);
                            setState(C0391m.MOVING);
                        }
                    } else if (this.f2047t) {
                        post(new C0379a());
                    } else {
                        kVar.mo2876a();
                    }
                } else {
                    this.f2005a = null;
                }
            } catch (Exception e) {
                throw new IllegalArgumentException("unable to parse MotionScene file", e);
            } catch (Exception e2) {
                throw new IllegalArgumentException("unable to parse MotionScene file", e2);
            }
        } else {
            this.f2005a = null;
        }
    }

    /* renamed from: x0 */
    public void mo2830x0(int i, boolean z, float f) {
        C0390l lVar = this.f2003a;
        if (lVar != null) {
            lVar.mo2723c(this, i, z, f);
        }
        CopyOnWriteArrayList<C0390l> copyOnWriteArrayList = this.f2010a;
        if (copyOnWriteArrayList != null) {
            Iterator<C0390l> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().mo2723c(this, i, z, f);
            }
        }
    }

    /* renamed from: y0 */
    public void mo2831y0(int i, float f, float f2, float f3, float[] fArr) {
        String str;
        HashMap<View, cl2> hashMap = this.f2016b;
        View t = mo3248t(i);
        cl2 cl2 = hashMap.get(t);
        if (cl2 != null) {
            cl2.mo14240p(f, f2, f3, fArr);
            float y = t.getY();
            this.f2027f = f;
            this.f2028g = y;
            return;
        }
        if (t == null) {
            str = "" + i;
        } else {
            str = t.getContext().getResources().getResourceName(i);
        }
        Log.w(f1954d, "WARNING could not find view id " + str);
    }

    /* renamed from: z */
    public void mo2832z(int i) {
        this.f2480a = null;
    }

    /* renamed from: z0 */
    public C0426d mo2833z0(int i) {
        C0393b bVar = this.f2005a;
        if (bVar == null) {
            return null;
        }
        return bVar.mo2932o(i);
    }
}
