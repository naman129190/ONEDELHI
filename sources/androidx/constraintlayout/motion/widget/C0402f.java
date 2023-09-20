package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.Xml;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.motion.widget.C0393b;
import androidx.constraintlayout.widget.C0426d;
import androidx.constraintlayout.widget.C0435e;
import com.onedelhi.secure.cl2;
import com.onedelhi.secure.iv4;
import com.onedelhi.secure.ly1;
import com.onedelhi.secure.ny1;
import com.onedelhi.secure.pl2;
import com.onedelhi.secure.sy1;
import com.onedelhi.secure.ur0;
import com.onedelhi.secure.ve0;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.constraintlayout.motion.widget.f */
public class C0402f {

    /* renamed from: A */
    public static final int f2253A = -2;

    /* renamed from: B */
    public static final int f2254B = 0;

    /* renamed from: C */
    public static final int f2255C = 1;

    /* renamed from: D */
    public static final int f2256D = 2;

    /* renamed from: E */
    public static final int f2257E = 3;

    /* renamed from: F */
    public static final int f2258F = 4;

    /* renamed from: G */
    public static final int f2259G = 5;

    /* renamed from: H */
    public static final int f2260H = 6;

    /* renamed from: c */
    public static String f2261c = "ViewTransition";

    /* renamed from: d */
    public static final String f2262d = "ViewTransition";

    /* renamed from: e */
    public static final String f2263e = "KeyFrameSet";

    /* renamed from: f */
    public static final String f2264f = "ConstraintOverride";

    /* renamed from: g */
    public static final String f2265g = "CustomAttribute";

    /* renamed from: h */
    public static final String f2266h = "CustomMethod";

    /* renamed from: q */
    public static final int f2267q = -1;

    /* renamed from: r */
    public static final int f2268r = 1;

    /* renamed from: s */
    public static final int f2269s = 2;

    /* renamed from: t */
    public static final int f2270t = 3;

    /* renamed from: u */
    public static final int f2271u = 4;

    /* renamed from: v */
    public static final int f2272v = 5;

    /* renamed from: w */
    public static final int f2273w = 0;

    /* renamed from: x */
    public static final int f2274x = 1;

    /* renamed from: y */
    public static final int f2275y = 2;

    /* renamed from: z */
    public static final int f2276z = -1;

    /* renamed from: a */
    public int f2277a;

    /* renamed from: a */
    public Context f2278a;

    /* renamed from: a */
    public C0426d.C0427a f2279a;

    /* renamed from: a */
    public C0426d f2280a;

    /* renamed from: a */
    public sy1 f2281a;

    /* renamed from: a */
    public String f2282a;

    /* renamed from: a */
    public boolean f2283a = false;

    /* renamed from: b */
    public int f2284b = -1;

    /* renamed from: b */
    public String f2285b = null;

    /* renamed from: c */
    public int f2286c = 0;

    /* renamed from: d */
    public int f2287d;

    /* renamed from: e */
    public int f2288e = -1;

    /* renamed from: f */
    public int f2289f = -1;

    /* renamed from: g */
    public int f2290g;

    /* renamed from: h */
    public int f2291h = 0;

    /* renamed from: i */
    public int f2292i = -1;

    /* renamed from: j */
    public int f2293j = -1;

    /* renamed from: k */
    public int f2294k = -1;

    /* renamed from: l */
    public int f2295l = -1;

    /* renamed from: m */
    public int f2296m = -1;

    /* renamed from: n */
    public int f2297n = -1;

    /* renamed from: o */
    public int f2298o = -1;

    /* renamed from: p */
    public int f2299p = -1;

    /* renamed from: androidx.constraintlayout.motion.widget.f$a */
    public class C0403a implements Interpolator {

        /* renamed from: a */
        public final /* synthetic */ ur0 f2300a;

        public C0403a(C0402f fVar, ur0 ur0) {
            this.f2300a = ur0;
        }

        public float getInterpolation(float f) {
            return (float) this.f2300a.mo17398a((double) f);
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.f$b */
    public static class C0404b {

        /* renamed from: a */
        public float f2301a;

        /* renamed from: a */
        public final int f2302a;

        /* renamed from: a */
        public long f2303a;

        /* renamed from: a */
        public Rect f2304a = new Rect();

        /* renamed from: a */
        public Interpolator f2305a;

        /* renamed from: a */
        public C0405g f2306a;

        /* renamed from: a */
        public cl2 f2307a;

        /* renamed from: a */
        public ny1 f2308a = new ny1();

        /* renamed from: a */
        public boolean f2309a = false;

        /* renamed from: b */
        public float f2310b;

        /* renamed from: b */
        public final int f2311b;

        /* renamed from: b */
        public long f2312b;

        /* renamed from: b */
        public boolean f2313b = false;

        /* renamed from: c */
        public int f2314c;

        /* renamed from: d */
        public int f2315d;

        public C0404b(C0405g gVar, cl2 cl2, int i, int i2, int i3, Interpolator interpolator, int i4, int i5) {
            this.f2306a = gVar;
            this.f2307a = cl2;
            this.f2314c = i;
            this.f2315d = i2;
            long nanoTime = System.nanoTime();
            this.f2303a = nanoTime;
            this.f2312b = nanoTime;
            this.f2306a.mo3049c(this);
            this.f2305a = interpolator;
            this.f2302a = i4;
            this.f2311b = i5;
            if (i3 == 3) {
                this.f2313b = true;
            }
            this.f2310b = i == 0 ? Float.MAX_VALUE : 1.0f / ((float) i);
            mo3043a();
        }

        /* renamed from: a */
        public void mo3043a() {
            if (this.f2309a) {
                mo3045c();
            } else {
                mo3044b();
            }
        }

        /* renamed from: b */
        public void mo3044b() {
            long nanoTime = System.nanoTime();
            this.f2312b = nanoTime;
            float f = this.f2301a + (((float) (((double) (nanoTime - this.f2312b)) * 1.0E-6d)) * this.f2310b);
            this.f2301a = f;
            if (f >= 1.0f) {
                this.f2301a = 1.0f;
            }
            Interpolator interpolator = this.f2305a;
            float interpolation = interpolator == null ? this.f2301a : interpolator.getInterpolation(this.f2301a);
            cl2 cl2 = this.f2307a;
            boolean L = cl2.mo14208L(cl2.f10346a, interpolation, nanoTime, this.f2308a);
            if (this.f2301a >= 1.0f) {
                if (this.f2302a != -1) {
                    this.f2307a.mo14206J().setTag(this.f2302a, Long.valueOf(System.nanoTime()));
                }
                if (this.f2311b != -1) {
                    this.f2307a.mo14206J().setTag(this.f2311b, (Object) null);
                }
                if (!this.f2313b) {
                    this.f2306a.mo3057k(this);
                }
            }
            if (this.f2301a < 1.0f || L) {
                this.f2306a.mo3053g();
            }
        }

        /* renamed from: c */
        public void mo3045c() {
            long nanoTime = System.nanoTime();
            this.f2312b = nanoTime;
            float f = this.f2301a - (((float) (((double) (nanoTime - this.f2312b)) * 1.0E-6d)) * this.f2310b);
            this.f2301a = f;
            if (f < 0.0f) {
                this.f2301a = 0.0f;
            }
            Interpolator interpolator = this.f2305a;
            float interpolation = interpolator == null ? this.f2301a : interpolator.getInterpolation(this.f2301a);
            cl2 cl2 = this.f2307a;
            boolean L = cl2.mo14208L(cl2.f10346a, interpolation, nanoTime, this.f2308a);
            if (this.f2301a <= 0.0f) {
                if (this.f2302a != -1) {
                    this.f2307a.mo14206J().setTag(this.f2302a, Long.valueOf(System.nanoTime()));
                }
                if (this.f2311b != -1) {
                    this.f2307a.mo14206J().setTag(this.f2311b, (Object) null);
                }
                this.f2306a.mo3057k(this);
            }
            if (this.f2301a > 0.0f || L) {
                this.f2306a.mo3053g();
            }
        }

        /* renamed from: d */
        public void mo3046d(int i, float f, float f2) {
            if (i != 1) {
                if (i == 2) {
                    this.f2307a.mo14206J().getHitRect(this.f2304a);
                    if (!this.f2304a.contains((int) f, (int) f2) && !this.f2309a) {
                        mo3047e(true);
                    }
                }
            } else if (!this.f2309a) {
                mo3047e(true);
            }
        }

        /* renamed from: e */
        public void mo3047e(boolean z) {
            int i;
            this.f2309a = z;
            if (z && (i = this.f2315d) != -1) {
                this.f2310b = i == 0 ? Float.MAX_VALUE : 1.0f / ((float) i);
            }
            this.f2306a.mo3053g();
            this.f2312b = System.nanoTime();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0402f(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
        /*
            r9 = this;
            r9.<init>()
            r0 = -1
            r9.f2284b = r0
            r1 = 0
            r9.f2283a = r1
            r9.f2286c = r1
            r9.f2288e = r0
            r9.f2289f = r0
            r9.f2291h = r1
            r2 = 0
            r9.f2285b = r2
            r9.f2292i = r0
            r9.f2293j = r0
            r9.f2294k = r0
            r9.f2295l = r0
            r9.f2296m = r0
            r9.f2297n = r0
            r9.f2298o = r0
            r9.f2299p = r0
            r9.f2278a = r10
            int r2 = r11.getEventType()     // Catch:{ XmlPullParserException -> 0x00e7, IOException -> 0x00e2 }
        L_0x002a:
            r3 = 1
            if (r2 == r3) goto L_0x00eb
            java.lang.String r4 = "ViewTransition"
            r5 = 3
            r6 = 2
            if (r2 == r6) goto L_0x0042
            if (r2 == r5) goto L_0x0037
            goto L_0x00dc
        L_0x0037:
            java.lang.String r2 = r11.getName()     // Catch:{ XmlPullParserException -> 0x00e7, IOException -> 0x00e2 }
            boolean r2 = r4.equals(r2)     // Catch:{ XmlPullParserException -> 0x00e7, IOException -> 0x00e2 }
            if (r2 == 0) goto L_0x00dc
            return
        L_0x0042:
            java.lang.String r2 = r11.getName()     // Catch:{ XmlPullParserException -> 0x00e7, IOException -> 0x00e2 }
            int r7 = r2.hashCode()     // Catch:{ XmlPullParserException -> 0x00e7, IOException -> 0x00e2 }
            r8 = 4
            switch(r7) {
                case -1962203927: goto L_0x0075;
                case -1239391468: goto L_0x006b;
                case 61998586: goto L_0x0063;
                case 366511058: goto L_0x0059;
                case 1791837707: goto L_0x004f;
                default: goto L_0x004e;
            }     // Catch:{ XmlPullParserException -> 0x00e7, IOException -> 0x00e2 }
        L_0x004e:
            goto L_0x007f
        L_0x004f:
            java.lang.String r4 = "CustomAttribute"
            boolean r4 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x00e7, IOException -> 0x00e2 }
            if (r4 == 0) goto L_0x007f
            r4 = 3
            goto L_0x0080
        L_0x0059:
            java.lang.String r4 = "CustomMethod"
            boolean r4 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x00e7, IOException -> 0x00e2 }
            if (r4 == 0) goto L_0x007f
            r4 = 4
            goto L_0x0080
        L_0x0063:
            boolean r4 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x00e7, IOException -> 0x00e2 }
            if (r4 == 0) goto L_0x007f
            r4 = 0
            goto L_0x0080
        L_0x006b:
            java.lang.String r4 = "KeyFrameSet"
            boolean r4 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x00e7, IOException -> 0x00e2 }
            if (r4 == 0) goto L_0x007f
            r4 = 1
            goto L_0x0080
        L_0x0075:
            java.lang.String r4 = "ConstraintOverride"
            boolean r4 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x00e7, IOException -> 0x00e2 }
            if (r4 == 0) goto L_0x007f
            r4 = 2
            goto L_0x0080
        L_0x007f:
            r4 = -1
        L_0x0080:
            if (r4 == 0) goto L_0x00d9
            if (r4 == r3) goto L_0x00d1
            if (r4 == r6) goto L_0x00ca
            if (r4 == r5) goto L_0x00c2
            if (r4 == r8) goto L_0x00c2
            java.lang.String r3 = f2261c     // Catch:{ XmlPullParserException -> 0x00e7, IOException -> 0x00e2 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x00e7, IOException -> 0x00e2 }
            r4.<init>()     // Catch:{ XmlPullParserException -> 0x00e7, IOException -> 0x00e2 }
            java.lang.String r5 = com.onedelhi.secure.ve0.m30007f()     // Catch:{ XmlPullParserException -> 0x00e7, IOException -> 0x00e2 }
            r4.append(r5)     // Catch:{ XmlPullParserException -> 0x00e7, IOException -> 0x00e2 }
            java.lang.String r5 = " unknown tag "
            r4.append(r5)     // Catch:{ XmlPullParserException -> 0x00e7, IOException -> 0x00e2 }
            r4.append(r2)     // Catch:{ XmlPullParserException -> 0x00e7, IOException -> 0x00e2 }
            java.lang.String r2 = r4.toString()     // Catch:{ XmlPullParserException -> 0x00e7, IOException -> 0x00e2 }
            android.util.Log.e(r3, r2)     // Catch:{ XmlPullParserException -> 0x00e7, IOException -> 0x00e2 }
            java.lang.String r2 = f2261c     // Catch:{ XmlPullParserException -> 0x00e7, IOException -> 0x00e2 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x00e7, IOException -> 0x00e2 }
            r3.<init>()     // Catch:{ XmlPullParserException -> 0x00e7, IOException -> 0x00e2 }
            java.lang.String r4 = ".xml:"
            r3.append(r4)     // Catch:{ XmlPullParserException -> 0x00e7, IOException -> 0x00e2 }
            int r4 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x00e7, IOException -> 0x00e2 }
            r3.append(r4)     // Catch:{ XmlPullParserException -> 0x00e7, IOException -> 0x00e2 }
            java.lang.String r3 = r3.toString()     // Catch:{ XmlPullParserException -> 0x00e7, IOException -> 0x00e2 }
            android.util.Log.e(r2, r3)     // Catch:{ XmlPullParserException -> 0x00e7, IOException -> 0x00e2 }
            goto L_0x00dc
        L_0x00c2:
            androidx.constraintlayout.widget.d$a r2 = r9.f2279a     // Catch:{ XmlPullParserException -> 0x00e7, IOException -> 0x00e2 }
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.a> r2 = r2.f2909a     // Catch:{ XmlPullParserException -> 0x00e7, IOException -> 0x00e2 }
            androidx.constraintlayout.widget.C0419a.m3152q(r10, r11, r2)     // Catch:{ XmlPullParserException -> 0x00e7, IOException -> 0x00e2 }
            goto L_0x00dc
        L_0x00ca:
            androidx.constraintlayout.widget.d$a r2 = androidx.constraintlayout.widget.C0426d.m3249w(r10, r11)     // Catch:{ XmlPullParserException -> 0x00e7, IOException -> 0x00e2 }
            r9.f2279a = r2     // Catch:{ XmlPullParserException -> 0x00e7, IOException -> 0x00e2 }
            goto L_0x00dc
        L_0x00d1:
            com.onedelhi.secure.sy1 r2 = new com.onedelhi.secure.sy1     // Catch:{ XmlPullParserException -> 0x00e7, IOException -> 0x00e2 }
            r2.<init>(r10, r11)     // Catch:{ XmlPullParserException -> 0x00e7, IOException -> 0x00e2 }
            r9.f2281a = r2     // Catch:{ XmlPullParserException -> 0x00e7, IOException -> 0x00e2 }
            goto L_0x00dc
        L_0x00d9:
            r9.mo3032n(r10, r11)     // Catch:{ XmlPullParserException -> 0x00e7, IOException -> 0x00e2 }
        L_0x00dc:
            int r2 = r11.next()     // Catch:{ XmlPullParserException -> 0x00e7, IOException -> 0x00e2 }
            goto L_0x002a
        L_0x00e2:
            r10 = move-exception
            r10.printStackTrace()
            goto L_0x00eb
        L_0x00e7:
            r10 = move-exception
            r10.printStackTrace()
        L_0x00eb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0402f.<init>(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ void m3003l(View[] viewArr) {
        if (this.f2293j != -1) {
            for (View tag : viewArr) {
                tag.setTag(this.f2293j, Long.valueOf(System.nanoTime()));
            }
        }
        if (this.f2294k != -1) {
            for (View tag2 : viewArr) {
                tag2.setTag(this.f2294k, (Object) null);
            }
        }
    }

    /* renamed from: b */
    public void mo3021b(C0405g gVar, MotionLayout motionLayout, View view) {
        cl2 cl2 = new cl2(view);
        cl2.mo14214R(view);
        this.f2281a.mo24662a(cl2);
        cl2.mo14224a0(motionLayout.getWidth(), motionLayout.getHeight(), (float) this.f2288e, System.nanoTime());
        C0405g gVar2 = gVar;
        cl2 cl22 = cl2;
        new C0404b(gVar2, cl22, this.f2288e, this.f2289f, this.f2284b, mo3025f(motionLayout.getContext()), this.f2293j, this.f2294k);
    }

    /* renamed from: c */
    public void mo3022c(C0405g gVar, MotionLayout motionLayout, int i, C0426d dVar, View... viewArr) {
        if (!this.f2283a) {
            int i2 = this.f2287d;
            if (i2 == 2) {
                mo3021b(gVar, motionLayout, viewArr[0]);
                return;
            }
            if (i2 == 1) {
                int[] constraintSetIds = motionLayout.getConstraintSetIds();
                for (int i3 : constraintSetIds) {
                    if (i3 != i) {
                        C0426d z0 = motionLayout.mo2833z0(i3);
                        for (View id : viewArr) {
                            C0426d.C0427a k0 = z0.mo3455k0(id.getId());
                            C0426d.C0427a aVar = this.f2279a;
                            if (aVar != null) {
                                aVar.mo3499h(k0);
                                k0.f2909a.putAll(this.f2279a.f2909a);
                            }
                        }
                    }
                }
            }
            C0426d dVar2 = new C0426d();
            dVar2.mo3399I(dVar);
            for (View id2 : viewArr) {
                C0426d.C0427a k02 = dVar2.mo3455k0(id2.getId());
                C0426d.C0427a aVar2 = this.f2279a;
                if (aVar2 != null) {
                    aVar2.mo3499h(k02);
                    k02.f2909a.putAll(this.f2279a.f2909a);
                }
            }
            motionLayout.mo2782h1(i, dVar2);
            int i4 = C0435e.C0442g.view_transition;
            motionLayout.mo2782h1(i4, dVar);
            motionLayout.setState(i4, -1, -1);
            C0393b.C0395b bVar = new C0393b.C0395b(-1, motionLayout.f2005a, i4, i);
            for (View v : viewArr) {
                mo3041v(bVar, v);
            }
            motionLayout.setTransition(bVar);
            motionLayout.mo2757a1(new iv4(this, viewArr));
        }
    }

    /* renamed from: d */
    public boolean mo3023d(View view) {
        int i = this.f2295l;
        boolean z = i == -1 || view.getTag(i) != null;
        int i2 = this.f2296m;
        return z && (i2 == -1 || view.getTag(i2) == null);
    }

    /* renamed from: e */
    public int mo3024e() {
        return this.f2277a;
    }

    /* renamed from: f */
    public Interpolator mo3025f(Context context) {
        int i = this.f2291h;
        if (i == -2) {
            return AnimationUtils.loadInterpolator(context, this.f2292i);
        }
        if (i == -1) {
            return new C0403a(this, ur0.m29534c(this.f2285b));
        }
        if (i == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i == 1) {
            return new AccelerateInterpolator();
        }
        if (i == 2) {
            return new DecelerateInterpolator();
        }
        if (i == 4) {
            return new BounceInterpolator();
        }
        if (i == 5) {
            return new OvershootInterpolator();
        }
        if (i != 6) {
            return null;
        }
        return new AnticipateInterpolator();
    }

    /* renamed from: g */
    public int mo3026g() {
        return this.f2297n;
    }

    /* renamed from: h */
    public int mo3027h() {
        return this.f2299p;
    }

    /* renamed from: i */
    public int mo3028i() {
        return this.f2298o;
    }

    /* renamed from: j */
    public int mo3029j() {
        return this.f2284b;
    }

    /* renamed from: k */
    public boolean mo3030k() {
        return !this.f2283a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002c, code lost:
        r5 = ((androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r5.getLayoutParams()).f2555b;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo3031m(android.view.View r5) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = r4.f2290g
            r2 = -1
            if (r1 != r2) goto L_0x000e
            java.lang.String r1 = r4.f2282a
            if (r1 != 0) goto L_0x000e
            return r0
        L_0x000e:
            boolean r1 = r4.mo3023d(r5)
            if (r1 != 0) goto L_0x0015
            return r0
        L_0x0015:
            int r1 = r5.getId()
            int r2 = r4.f2290g
            r3 = 1
            if (r1 != r2) goto L_0x001f
            return r3
        L_0x001f:
            java.lang.String r1 = r4.f2282a
            if (r1 != 0) goto L_0x0024
            return r0
        L_0x0024:
            android.view.ViewGroup$LayoutParams r1 = r5.getLayoutParams()
            boolean r1 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams
            if (r1 == 0) goto L_0x003f
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r5 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r5
            java.lang.String r5 = r5.f2555b
            if (r5 == 0) goto L_0x003f
            java.lang.String r1 = r4.f2282a
            boolean r5 = r5.matches(r1)
            if (r5 == 0) goto L_0x003f
            return r3
        L_0x003f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0402f.mo3031m(android.view.View):boolean");
    }

    /* renamed from: n */
    public final void mo3032n(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0435e.C0448m.ViewTransition);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == C0435e.C0448m.ViewTransition_android_id) {
                this.f2277a = obtainStyledAttributes.getResourceId(index, this.f2277a);
            } else if (index == C0435e.C0448m.ViewTransition_motionTarget) {
                if (MotionLayout.f1969w) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, this.f2290g);
                    this.f2290g = resourceId;
                    if (resourceId != -1) {
                    }
                } else if (obtainStyledAttributes.peekValue(index).type != 3) {
                    this.f2290g = obtainStyledAttributes.getResourceId(index, this.f2290g);
                }
                this.f2282a = obtainStyledAttributes.getString(index);
            } else if (index == C0435e.C0448m.ViewTransition_onStateTransition) {
                this.f2284b = obtainStyledAttributes.getInt(index, this.f2284b);
            } else if (index == C0435e.C0448m.ViewTransition_transitionDisable) {
                this.f2283a = obtainStyledAttributes.getBoolean(index, this.f2283a);
            } else if (index == C0435e.C0448m.ViewTransition_pathMotionArc) {
                this.f2286c = obtainStyledAttributes.getInt(index, this.f2286c);
            } else if (index == C0435e.C0448m.ViewTransition_duration) {
                this.f2288e = obtainStyledAttributes.getInt(index, this.f2288e);
            } else if (index == C0435e.C0448m.ViewTransition_upDuration) {
                this.f2289f = obtainStyledAttributes.getInt(index, this.f2289f);
            } else if (index == C0435e.C0448m.ViewTransition_viewTransitionMode) {
                this.f2287d = obtainStyledAttributes.getInt(index, this.f2287d);
            } else if (index == C0435e.C0448m.ViewTransition_motionInterpolator) {
                int i2 = obtainStyledAttributes.peekValue(index).type;
                if (i2 == 1) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                    this.f2292i = resourceId2;
                    if (resourceId2 == -1) {
                    }
                } else if (i2 == 3) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f2285b = string;
                    if (string == null || string.indexOf("/") <= 0) {
                        this.f2291h = -1;
                    } else {
                        this.f2292i = obtainStyledAttributes.getResourceId(index, -1);
                    }
                } else {
                    this.f2291h = obtainStyledAttributes.getInteger(index, this.f2291h);
                }
                this.f2291h = -2;
            } else if (index == C0435e.C0448m.ViewTransition_setsTag) {
                this.f2293j = obtainStyledAttributes.getResourceId(index, this.f2293j);
            } else if (index == C0435e.C0448m.ViewTransition_clearsTag) {
                this.f2294k = obtainStyledAttributes.getResourceId(index, this.f2294k);
            } else if (index == C0435e.C0448m.ViewTransition_ifTagSet) {
                this.f2295l = obtainStyledAttributes.getResourceId(index, this.f2295l);
            } else if (index == C0435e.C0448m.ViewTransition_ifTagNotSet) {
                this.f2296m = obtainStyledAttributes.getResourceId(index, this.f2296m);
            } else if (index == C0435e.C0448m.ViewTransition_SharedValueId) {
                this.f2298o = obtainStyledAttributes.getResourceId(index, this.f2298o);
            } else if (index == C0435e.C0448m.ViewTransition_SharedValue) {
                this.f2297n = obtainStyledAttributes.getInteger(index, this.f2297n);
            }
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: o */
    public void mo3033o(boolean z) {
        this.f2283a = !z;
    }

    /* renamed from: p */
    public void mo3034p(int i) {
        this.f2277a = i;
    }

    /* renamed from: q */
    public void mo3035q(int i) {
        this.f2297n = i;
    }

    /* renamed from: r */
    public void mo3036r(int i) {
        this.f2299p = i;
    }

    /* renamed from: s */
    public void mo3037s(int i) {
        this.f2298o = i;
    }

    /* renamed from: t */
    public void mo3038t(int i) {
        this.f2284b = i;
    }

    public String toString() {
        return "ViewTransition(" + ve0.m30010i(this.f2278a, this.f2277a) + pl2.f33727d;
    }

    /* renamed from: u */
    public boolean mo3040u(int i) {
        int i2 = this.f2284b;
        return i2 == 1 ? i == 0 : i2 == 2 ? i == 1 : i2 == 3 && i == 0;
    }

    /* renamed from: v */
    public final void mo3041v(C0393b.C0395b bVar, View view) {
        int i = this.f2288e;
        if (i != -1) {
            bVar.mo2964O(i);
        }
        bVar.mo2971V(this.f2286c);
        bVar.mo2967R(this.f2291h, this.f2285b, this.f2292i);
        int id = view.getId();
        sy1 sy1 = this.f2281a;
        if (sy1 != null) {
            ArrayList<ly1> d = sy1.mo24665d(-1);
            sy1 sy12 = new sy1();
            Iterator<ly1> it = d.iterator();
            while (it.hasNext()) {
                sy12.mo24664c(it.next().clone().mo19938k(id));
            }
            bVar.mo2974t(sy12);
        }
    }
}
