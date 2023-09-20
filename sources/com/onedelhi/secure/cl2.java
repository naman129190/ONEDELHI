package com.onedelhi.secure;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.widget.C0426d;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class cl2 {

    /* renamed from: A */
    public static final int f10316A = 5;

    /* renamed from: B */
    public static final int f10317B = -1;

    /* renamed from: C */
    public static final int f10318C = -2;

    /* renamed from: D */
    public static final int f10319D = -3;

    /* renamed from: b */
    public static final String f10320b = "MotionController";

    /* renamed from: c */
    public static final boolean f10321c = false;

    /* renamed from: d */
    public static final boolean f10322d = false;

    /* renamed from: g */
    public static final int f10323g = 0;

    /* renamed from: h */
    public static final int f10324h = 1;

    /* renamed from: i */
    public static final int f10325i = 2;

    /* renamed from: j */
    public static final int f10326j = 3;

    /* renamed from: k */
    public static final int f10327k = 4;

    /* renamed from: l */
    public static final int f10328l = 5;

    /* renamed from: m */
    public static final int f10329m = 0;

    /* renamed from: n */
    public static final int f10330n = 1;

    /* renamed from: o */
    public static final int f10331o = 2;

    /* renamed from: p */
    public static final int f10332p = 3;

    /* renamed from: q */
    public static final int f10333q = 4;

    /* renamed from: r */
    public static final int f10334r = 5;

    /* renamed from: s */
    public static final int f10335s = 6;

    /* renamed from: t */
    public static final int f10336t = 1;

    /* renamed from: u */
    public static final int f10337u = 2;

    /* renamed from: v */
    public static final int f10338v = 0;

    /* renamed from: w */
    public static final int f10339w = 1;

    /* renamed from: x */
    public static final int f10340x = 2;

    /* renamed from: y */
    public static final int f10341y = 3;

    /* renamed from: z */
    public static final int f10342z = 4;

    /* renamed from: a */
    public float f10343a = Float.NaN;

    /* renamed from: a */
    public int f10344a;

    /* renamed from: a */
    public Rect f10345a = new Rect();

    /* renamed from: a */
    public View f10346a;

    /* renamed from: a */
    public Interpolator f10347a;

    /* renamed from: a */
    public dc0 f10348a;

    /* renamed from: a */
    public ll2 f10349a = new ll2();

    /* renamed from: a */
    public zk2 f10350a = new zk2();

    /* renamed from: a */
    public String f10351a;

    /* renamed from: a */
    public ArrayList<ll2> f10352a = new ArrayList<>();

    /* renamed from: a */
    public HashMap<String, hv4> f10353a;

    /* renamed from: a */
    public boolean f10354a = false;

    /* renamed from: a */
    public double[] f10355a;

    /* renamed from: a */
    public float[] f10356a = new float[4];

    /* renamed from: a */
    public int[] f10357a;

    /* renamed from: a */
    public dc0[] f10358a;

    /* renamed from: a */
    public dz1[] f10359a;

    /* renamed from: a */
    public String[] f10360a;

    /* renamed from: b */
    public float f10361b = 0.0f;

    /* renamed from: b */
    public int f10362b = -1;

    /* renamed from: b */
    public View f10363b;

    /* renamed from: b */
    public ll2 f10364b = new ll2();

    /* renamed from: b */
    public zk2 f10365b = new zk2();

    /* renamed from: b */
    public ArrayList<ly1> f10366b = new ArrayList<>();

    /* renamed from: b */
    public HashMap<String, bv4> f10367b;

    /* renamed from: b */
    public boolean f10368b;

    /* renamed from: b */
    public double[] f10369b;

    /* renamed from: b */
    public float[] f10370b = new float[1];

    /* renamed from: b */
    public int[] f10371b;

    /* renamed from: b */
    public String[] f10372b;

    /* renamed from: c */
    public float f10373c = 1.0f;

    /* renamed from: c */
    public int f10374c = 4;

    /* renamed from: c */
    public HashMap<String, ku4> f10375c;

    /* renamed from: d */
    public float f10376d;

    /* renamed from: d */
    public int f10377d;

    /* renamed from: e */
    public float f10378e;

    /* renamed from: e */
    public int f10379e;

    /* renamed from: f */
    public float f10380f;

    /* renamed from: f */
    public int f10381f;

    /* renamed from: com.onedelhi.secure.cl2$a */
    public class C1913a implements Interpolator {

        /* renamed from: a */
        public final /* synthetic */ ur0 f10382a;

        public C1913a(ur0 ur0) {
            this.f10382a = ur0;
        }

        public float getInterpolation(float f) {
            return (float) this.f10382a.mo17398a((double) f);
        }
    }

    public cl2(View view) {
        int i = ly1.f15666d;
        this.f10377d = i;
        this.f10379e = i;
        this.f10363b = null;
        this.f10381f = i;
        this.f10380f = Float.NaN;
        this.f10347a = null;
        this.f10368b = false;
        mo14222Z(view);
    }

    /* renamed from: v */
    public static Interpolator m12547v(Context context, int i, String str, int i2) {
        if (i == -2) {
            return AnimationUtils.loadInterpolator(context, i2);
        }
        if (i == -1) {
            return new C1913a(ur0.m29534c(str));
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
        if (i != 5) {
            return null;
        }
        return new OvershootInterpolator();
    }

    /* renamed from: A */
    public double[] mo14197A(double d) {
        this.f10358a[0].mo14611d(d, this.f10355a);
        dc0 dc0 = this.f10348a;
        if (dc0 != null) {
            double[] dArr = this.f10355a;
            if (dArr.length > 0) {
                dc0.mo14611d(d, dArr);
            }
        }
        return this.f10355a;
    }

    /* renamed from: B */
    public az1 mo14198B(int i, int i2, float f, float f2) {
        RectF rectF = new RectF();
        ll2 ll2 = this.f10349a;
        float f3 = ll2.f15485c;
        rectF.left = f3;
        float f4 = ll2.f15486d;
        rectF.top = f4;
        rectF.right = f3 + ll2.f15487e;
        rectF.bottom = f4 + ll2.f15488f;
        RectF rectF2 = new RectF();
        ll2 ll22 = this.f10364b;
        float f5 = ll22.f15485c;
        rectF2.left = f5;
        float f6 = ll22.f15486d;
        rectF2.top = f6;
        rectF2.right = f5 + ll22.f15487e;
        rectF2.bottom = f6 + ll22.f15488f;
        Iterator<ly1> it = this.f10366b.iterator();
        while (it.hasNext()) {
            ly1 next = it.next();
            if (next instanceof az1) {
                az1 az1 = (az1) next;
                if (az1.mo13350r(i, i2, rectF, rectF2, f, f2)) {
                    return az1;
                }
            }
        }
        return null;
    }

    /* renamed from: C */
    public void mo14199C(float f, int i, int i2, float f2, float f3, float[] fArr) {
        float j = mo14234j(f, this.f10370b);
        HashMap<String, bv4> hashMap = this.f10367b;
        ku4 ku4 = null;
        x14 x14 = hashMap == null ? null : hashMap.get("translationX");
        HashMap<String, bv4> hashMap2 = this.f10367b;
        x14 x142 = hashMap2 == null ? null : hashMap2.get("translationY");
        HashMap<String, bv4> hashMap3 = this.f10367b;
        x14 x143 = hashMap3 == null ? null : hashMap3.get(ly1.f15667d);
        HashMap<String, bv4> hashMap4 = this.f10367b;
        x14 x144 = hashMap4 == null ? null : hashMap4.get("scaleX");
        HashMap<String, bv4> hashMap5 = this.f10367b;
        x14 x145 = hashMap5 == null ? null : hashMap5.get("scaleY");
        HashMap<String, ku4> hashMap6 = this.f10375c;
        ku4 ku42 = hashMap6 == null ? null : hashMap6.get("translationX");
        HashMap<String, ku4> hashMap7 = this.f10375c;
        ku4 ku43 = hashMap7 == null ? null : hashMap7.get("translationY");
        HashMap<String, ku4> hashMap8 = this.f10375c;
        ku4 ku44 = hashMap8 == null ? null : hashMap8.get(ly1.f15667d);
        HashMap<String, ku4> hashMap9 = this.f10375c;
        ku4 ku45 = hashMap9 == null ? null : hashMap9.get("scaleX");
        HashMap<String, ku4> hashMap10 = this.f10375c;
        if (hashMap10 != null) {
            ku4 = hashMap10.get("scaleY");
        }
        ns4 ns4 = new ns4();
        ns4.mo21454b();
        ns4.mo21456d(x143, j);
        ns4.mo21460h(x14, x142, j);
        ns4.mo21458f(x144, x145, j);
        ns4.mo21455c(ku44, j);
        ns4.mo21459g(ku42, ku43, j);
        ns4.mo21457e(ku45, ku4, j);
        dc0 dc0 = this.f10348a;
        if (dc0 != null) {
            double[] dArr = this.f10355a;
            if (dArr.length > 0) {
                double d = (double) j;
                dc0.mo14611d(d, dArr);
                this.f10348a.mo14614g(d, this.f10369b);
                this.f10349a.mo19678E(f2, f3, fArr, this.f10357a, this.f10369b, this.f10355a);
            }
            ns4.mo21453a(f2, f3, i, i2, fArr);
            return;
        }
        int i3 = 0;
        if (this.f10358a != null) {
            double j2 = (double) mo14234j(j, this.f10370b);
            this.f10358a[0].mo14614g(j2, this.f10369b);
            this.f10358a[0].mo14611d(j2, this.f10355a);
            float f4 = this.f10370b[0];
            while (true) {
                double[] dArr2 = this.f10369b;
                if (i3 < dArr2.length) {
                    dArr2[i3] = dArr2[i3] * ((double) f4);
                    i3++;
                } else {
                    float f5 = f2;
                    float f6 = f3;
                    this.f10349a.mo19678E(f5, f6, fArr, this.f10357a, dArr2, this.f10355a);
                    ns4.mo21453a(f5, f6, i, i2, fArr);
                    return;
                }
            }
        } else {
            ll2 ll2 = this.f10364b;
            float f7 = ll2.f15485c;
            ll2 ll22 = this.f10349a;
            float f8 = f7 - ll22.f15485c;
            float f9 = ll2.f15486d - ll22.f15486d;
            ku4 ku46 = ku45;
            float f10 = (ll2.f15488f - ll22.f15488f) + f9;
            fArr[0] = (f8 * (1.0f - f2)) + (((ll2.f15487e - ll22.f15487e) + f8) * f2);
            fArr[1] = (f9 * (1.0f - f3)) + (f10 * f3);
            ns4.mo21454b();
            ns4.mo21456d(x143, j);
            ns4.mo21460h(x14, x142, j);
            ns4.mo21458f(x144, x145, j);
            ns4.mo21455c(ku44, j);
            ns4.mo21459g(ku42, ku43, j);
            ns4.mo21457e(ku46, ku4, j);
            ns4.mo21453a(f2, f3, i, i2, fArr);
        }
    }

    /* renamed from: D */
    public final float mo14200D() {
        char c;
        float f;
        float[] fArr = new float[2];
        float f2 = 1.0f / ((float) 99);
        double d = 0.0d;
        double d2 = 0.0d;
        float f3 = 0.0f;
        int i = 0;
        while (i < 100) {
            float f4 = ((float) i) * f2;
            double d3 = (double) f4;
            ur0 ur0 = this.f10349a.f15480a;
            Iterator<ll2> it = this.f10352a.iterator();
            float f5 = Float.NaN;
            float f6 = 0.0f;
            while (it.hasNext()) {
                ll2 next = it.next();
                ur0 ur02 = next.f15480a;
                if (ur02 != null) {
                    float f7 = next.f15478a;
                    if (f7 < f4) {
                        ur0 = ur02;
                        f6 = f7;
                    } else if (Float.isNaN(f5)) {
                        f5 = next.f15478a;
                    }
                }
            }
            if (ur0 != null) {
                if (Float.isNaN(f5)) {
                    f5 = 1.0f;
                }
                float f8 = f5 - f6;
                d3 = (double) ((((float) ur0.mo17398a((double) ((f4 - f6) / f8))) * f8) + f6);
            }
            this.f10358a[0].mo14611d(d3, this.f10355a);
            float f9 = f3;
            int i2 = i;
            this.f10349a.mo19689s(d3, this.f10357a, this.f10355a, fArr, 0);
            if (i2 > 0) {
                c = 0;
                f = (float) (((double) f9) + Math.hypot(d2 - ((double) fArr[1]), d - ((double) fArr[0])));
            } else {
                c = 0;
                f = f9;
            }
            d = (double) fArr[c];
            i = i2 + 1;
            f3 = f;
            d2 = (double) fArr[1];
        }
        return f3;
    }

    /* renamed from: E */
    public float mo14201E() {
        return this.f10349a.f15488f;
    }

    /* renamed from: F */
    public float mo14202F() {
        return this.f10349a.f15487e;
    }

    /* renamed from: G */
    public float mo14203G() {
        return this.f10349a.f15485c;
    }

    /* renamed from: H */
    public float mo14204H() {
        return this.f10349a.f15486d;
    }

    /* renamed from: I */
    public int mo14205I() {
        return this.f10379e;
    }

    /* renamed from: J */
    public View mo14206J() {
        return this.f10346a;
    }

    /* renamed from: K */
    public final void mo14207K(ll2 ll2) {
        int binarySearch = Collections.binarySearch(this.f10352a, ll2);
        if (binarySearch == 0) {
            Log.e("MotionController", " KeyPath position \"" + ll2.f15483b + "\" outside of range");
        }
        this.f10352a.add((-binarySearch) - 1, ll2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v59, resolved type: com.onedelhi.secure.hv4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: com.onedelhi.secure.hv4$d} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo14208L(android.view.View r21, float r22, long r23, com.onedelhi.secure.ny1 r25) {
        /*
            r20 = this;
            r0 = r20
            r11 = r21
            r1 = 0
            r2 = r22
            float r2 = r0.mo14234j(r2, r1)
            int r3 = r0.f10381f
            int r4 = com.onedelhi.secure.ly1.f15666d
            r13 = 1065353216(0x3f800000, float:1.0)
            if (r3 == r4) goto L_0x0045
            float r3 = (float) r3
            float r3 = r13 / r3
            float r4 = r2 / r3
            double r4 = (double) r4
            double r4 = java.lang.Math.floor(r4)
            float r4 = (float) r4
            float r4 = r4 * r3
            float r2 = r2 % r3
            float r2 = r2 / r3
            float r5 = r0.f10380f
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L_0x002e
            float r5 = r0.f10380f
            float r2 = r2 + r5
            float r2 = r2 % r13
        L_0x002e:
            android.view.animation.Interpolator r5 = r0.f10347a
            if (r5 == 0) goto L_0x0037
            float r2 = r5.getInterpolation(r2)
            goto L_0x0042
        L_0x0037:
            double r5 = (double) r2
            r7 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 <= 0) goto L_0x0041
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0042
        L_0x0041:
            r2 = 0
        L_0x0042:
            float r2 = r2 * r3
            float r2 = r2 + r4
        L_0x0045:
            r14 = r2
            java.util.HashMap<java.lang.String, com.onedelhi.secure.bv4> r2 = r0.f10367b
            if (r2 == 0) goto L_0x0062
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
        L_0x0052:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0062
            java.lang.Object r3 = r2.next()
            com.onedelhi.secure.bv4 r3 = (com.onedelhi.secure.bv4) r3
            r3.mo13826m(r11, r14)
            goto L_0x0052
        L_0x0062:
            java.util.HashMap<java.lang.String, com.onedelhi.secure.hv4> r2 = r0.f10353a
            r15 = 0
            if (r2 == 0) goto L_0x0096
            java.util.Collection r2 = r2.values()
            java.util.Iterator r7 = r2.iterator()
            r8 = r1
            r9 = 0
        L_0x0071:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x0092
            java.lang.Object r1 = r7.next()
            com.onedelhi.secure.hv4 r1 = (com.onedelhi.secure.hv4) r1
            boolean r2 = r1 instanceof com.onedelhi.secure.hv4.C2370d
            if (r2 == 0) goto L_0x0085
            r8 = r1
            com.onedelhi.secure.hv4$d r8 = (com.onedelhi.secure.hv4.C2370d) r8
            goto L_0x0071
        L_0x0085:
            r2 = r21
            r3 = r14
            r4 = r23
            r6 = r25
            boolean r1 = r1.mo17457j(r2, r3, r4, r6)
            r9 = r9 | r1
            goto L_0x0071
        L_0x0092:
            r16 = r9
            r9 = r8
            goto L_0x0099
        L_0x0096:
            r9 = r1
            r16 = 0
        L_0x0099:
            com.onedelhi.secure.dc0[] r1 = r0.f10358a
            r10 = 1
            if (r1 == 0) goto L_0x01ee
            r1 = r1[r15]
            double r7 = (double) r14
            double[] r2 = r0.f10355a
            r1.mo14611d(r7, r2)
            com.onedelhi.secure.dc0[] r1 = r0.f10358a
            r1 = r1[r15]
            double[] r2 = r0.f10369b
            r1.mo14614g(r7, r2)
            com.onedelhi.secure.dc0 r1 = r0.f10348a
            if (r1 == 0) goto L_0x00c2
            double[] r2 = r0.f10355a
            int r3 = r2.length
            if (r3 <= 0) goto L_0x00c2
            r1.mo14611d(r7, r2)
            com.onedelhi.secure.dc0 r1 = r0.f10348a
            double[] r2 = r0.f10369b
            r1.mo14614g(r7, r2)
        L_0x00c2:
            boolean r1 = r0.f10368b
            if (r1 != 0) goto L_0x00e2
            com.onedelhi.secure.ll2 r1 = r0.f10349a
            int[] r4 = r0.f10357a
            double[] r5 = r0.f10355a
            double[] r6 = r0.f10369b
            r17 = 0
            boolean r3 = r0.f10354a
            r2 = r14
            r18 = r3
            r3 = r21
            r12 = r7
            r7 = r17
            r8 = r18
            r1.mo19679F(r2, r3, r4, r5, r6, r7, r8)
            r0.f10354a = r15
            goto L_0x00e3
        L_0x00e2:
            r12 = r7
        L_0x00e3:
            int r1 = r0.f10379e
            int r2 = com.onedelhi.secure.ly1.f15666d
            if (r1 == r2) goto L_0x0145
            android.view.View r1 = r0.f10363b
            if (r1 != 0) goto L_0x00fb
            android.view.ViewParent r1 = r21.getParent()
            android.view.View r1 = (android.view.View) r1
            int r2 = r0.f10379e
            android.view.View r1 = r1.findViewById(r2)
            r0.f10363b = r1
        L_0x00fb:
            android.view.View r1 = r0.f10363b
            if (r1 == 0) goto L_0x0145
            int r1 = r1.getTop()
            android.view.View r2 = r0.f10363b
            int r2 = r2.getBottom()
            int r1 = r1 + r2
            float r1 = (float) r1
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            android.view.View r3 = r0.f10363b
            int r3 = r3.getLeft()
            android.view.View r4 = r0.f10363b
            int r4 = r4.getRight()
            int r3 = r3 + r4
            float r3 = (float) r3
            float r3 = r3 / r2
            int r2 = r21.getRight()
            int r4 = r21.getLeft()
            int r2 = r2 - r4
            if (r2 <= 0) goto L_0x0145
            int r2 = r21.getBottom()
            int r4 = r21.getTop()
            int r2 = r2 - r4
            if (r2 <= 0) goto L_0x0145
            int r2 = r21.getLeft()
            float r2 = (float) r2
            float r3 = r3 - r2
            int r2 = r21.getTop()
            float r2 = (float) r2
            float r1 = r1 - r2
            r11.setPivotX(r3)
            r11.setPivotY(r1)
        L_0x0145:
            java.util.HashMap<java.lang.String, com.onedelhi.secure.bv4> r1 = r0.f10367b
            if (r1 == 0) goto L_0x0173
            java.util.Collection r1 = r1.values()
            java.util.Iterator r8 = r1.iterator()
        L_0x0151:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x0173
            java.lang.Object r1 = r8.next()
            com.onedelhi.secure.x14 r1 = (com.onedelhi.secure.x14) r1
            boolean r2 = r1 instanceof com.onedelhi.secure.bv4.C1809d
            if (r2 == 0) goto L_0x0151
            double[] r2 = r0.f10369b
            int r3 = r2.length
            if (r3 <= r10) goto L_0x0151
            com.onedelhi.secure.bv4$d r1 = (com.onedelhi.secure.bv4.C1809d) r1
            r4 = r2[r15]
            r6 = r2[r10]
            r2 = r21
            r3 = r14
            r1.mo13830n(r2, r3, r4, r6)
            goto L_0x0151
        L_0x0173:
            if (r9 == 0) goto L_0x0190
            double[] r1 = r0.f10369b
            r7 = r1[r15]
            r17 = r1[r10]
            r1 = r9
            r2 = r21
            r3 = r25
            r4 = r14
            r5 = r23
            r19 = 1
            r9 = r17
            boolean r1 = r1.mo17461k(r2, r3, r4, r5, r7, r9)
            r1 = r16 | r1
            r16 = r1
            goto L_0x0192
        L_0x0190:
            r19 = 1
        L_0x0192:
            r10 = 1
        L_0x0193:
            com.onedelhi.secure.dc0[] r1 = r0.f10358a
            int r2 = r1.length
            if (r10 >= r2) goto L_0x01b7
            r1 = r1[r10]
            float[] r2 = r0.f10356a
            r1.mo14612e(r12, r2)
            com.onedelhi.secure.ll2 r1 = r0.f10349a
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.a> r1 = r1.f15481a
            java.lang.String[] r2 = r0.f10360a
            int r3 = r10 + -1
            r2 = r2[r3]
            java.lang.Object r1 = r1.get(r2)
            androidx.constraintlayout.widget.a r1 = (androidx.constraintlayout.widget.C0419a) r1
            float[] r2 = r0.f10356a
            com.onedelhi.secure.mc0.m21474b(r1, r11, r2)
            int r10 = r10 + 1
            goto L_0x0193
        L_0x01b7:
            com.onedelhi.secure.zk2 r1 = r0.f10350a
            int r2 = r1.f23779n
            if (r2 != 0) goto L_0x01dc
            r2 = 0
            int r2 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x01c8
        L_0x01c2:
            int r1 = r1.f23781o
            r11.setVisibility(r1)
            goto L_0x01dc
        L_0x01c8:
            r2 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x01d1
            com.onedelhi.secure.zk2 r1 = r0.f10365b
            goto L_0x01c2
        L_0x01d1:
            com.onedelhi.secure.zk2 r2 = r0.f10365b
            int r2 = r2.f23781o
            int r1 = r1.f23781o
            if (r2 == r1) goto L_0x01dc
            r11.setVisibility(r15)
        L_0x01dc:
            com.onedelhi.secure.dz1[] r1 = r0.f10359a
            if (r1 == 0) goto L_0x0242
            r1 = 0
        L_0x01e1:
            com.onedelhi.secure.dz1[] r2 = r0.f10359a
            int r3 = r2.length
            if (r1 >= r3) goto L_0x0242
            r2 = r2[r1]
            r2.mo14950A(r14, r11)
            int r1 = r1 + 1
            goto L_0x01e1
        L_0x01ee:
            r19 = 1
            com.onedelhi.secure.ll2 r1 = r0.f10349a
            float r2 = r1.f15485c
            com.onedelhi.secure.ll2 r3 = r0.f10364b
            float r4 = r3.f15485c
            float r4 = r4 - r2
            float r4 = r4 * r14
            float r2 = r2 + r4
            float r4 = r1.f15486d
            float r5 = r3.f15486d
            float r5 = r5 - r4
            float r5 = r5 * r14
            float r4 = r4 + r5
            float r5 = r1.f15487e
            float r6 = r3.f15487e
            float r7 = r6 - r5
            float r7 = r7 * r14
            float r7 = r7 + r5
            float r1 = r1.f15488f
            float r3 = r3.f15488f
            float r8 = r3 - r1
            float r8 = r8 * r14
            float r8 = r8 + r1
            r9 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r9
            int r10 = (int) r2
            float r4 = r4 + r9
            int r9 = (int) r4
            float r2 = r2 + r7
            int r2 = (int) r2
            float r4 = r4 + r8
            int r4 = (int) r4
            int r7 = r2 - r10
            int r8 = r4 - r9
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 != 0) goto L_0x0230
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0230
            boolean r1 = r0.f10354a
            if (r1 == 0) goto L_0x023f
        L_0x0230:
            r1 = 1073741824(0x40000000, float:2.0)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r1)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r1)
            r11.measure(r3, r1)
            r0.f10354a = r15
        L_0x023f:
            r11.layout(r10, r9, r2, r4)
        L_0x0242:
            java.util.HashMap<java.lang.String, com.onedelhi.secure.ku4> r1 = r0.f10375c
            if (r1 == 0) goto L_0x0271
            java.util.Collection r1 = r1.values()
            java.util.Iterator r8 = r1.iterator()
        L_0x024e:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x0271
            java.lang.Object r1 = r8.next()
            com.onedelhi.secure.ku4 r1 = (com.onedelhi.secure.ku4) r1
            boolean r2 = r1 instanceof com.onedelhi.secure.ku4.C2664d
            if (r2 == 0) goto L_0x026d
            com.onedelhi.secure.ku4$d r1 = (com.onedelhi.secure.ku4.C2664d) r1
            double[] r2 = r0.f10369b
            r4 = r2[r15]
            r6 = r2[r19]
            r2 = r21
            r3 = r14
            r1.mo19203n(r2, r3, r4, r6)
            goto L_0x024e
        L_0x026d:
            r1.mo19201m(r11, r14)
            goto L_0x024e
        L_0x0271:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.cl2.mo14208L(android.view.View, float, long, com.onedelhi.secure.ny1):boolean");
    }

    /* renamed from: M */
    public String mo14209M() {
        return this.f10346a.getContext().getResources().getResourceEntryName(this.f10346a.getId());
    }

    /* renamed from: N */
    public void mo14210N(View view, az1 az1, float f, float f2, String[] strArr, float[] fArr) {
        RectF rectF = new RectF();
        ll2 ll2 = this.f10349a;
        float f3 = ll2.f15485c;
        rectF.left = f3;
        float f4 = ll2.f15486d;
        rectF.top = f4;
        rectF.right = f3 + ll2.f15487e;
        rectF.bottom = f4 + ll2.f15488f;
        RectF rectF2 = new RectF();
        ll2 ll22 = this.f10364b;
        float f5 = ll22.f15485c;
        rectF2.left = f5;
        float f6 = ll22.f15486d;
        rectF2.top = f6;
        rectF2.right = f5 + ll22.f15487e;
        rectF2.bottom = f6 + ll22.f15488f;
        az1.mo13351s(view, rectF, rectF2, f, f2, strArr, fArr);
    }

    /* renamed from: O */
    public final void mo14211O(ll2 ll2) {
        ll2.mo19677D((float) ((int) this.f10346a.getX()), (float) ((int) this.f10346a.getY()), (float) this.f10346a.getWidth(), (float) this.f10346a.getHeight());
    }

    /* renamed from: P */
    public void mo14212P() {
        this.f10354a = true;
    }

    /* renamed from: Q */
    public void mo14213Q(Rect rect, Rect rect2, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        if (i != 1) {
            if (i == 2) {
                i7 = rect.left + rect.right;
                i6 = rect.top;
                i8 = rect.bottom;
            } else if (i == 3) {
                i5 = rect.left + rect.right;
                i4 = ((rect.height() / 2) + rect.top) - (i5 / 2);
            } else if (i == 4) {
                i7 = rect.left + rect.right;
                i6 = rect.bottom;
                i8 = rect.top;
            } else {
                return;
            }
            rect2.left = i2 - (((i6 + i8) + rect.width()) / 2);
            rect2.top = (i7 - rect.height()) / 2;
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
        }
        i5 = rect.left + rect.right;
        i4 = ((rect.top + rect.bottom) - rect.width()) / 2;
        rect2.left = i4;
        rect2.top = i3 - ((i5 + rect.height()) / 2);
        rect2.right = rect2.left + rect.width();
        rect2.bottom = rect2.top + rect.height();
    }

    /* renamed from: R */
    public void mo14214R(View view) {
        ll2 ll2 = this.f10349a;
        ll2.f15478a = 0.0f;
        ll2.f15483b = 0.0f;
        this.f10368b = true;
        ll2.mo19677D(view.getX(), view.getY(), (float) view.getWidth(), (float) view.getHeight());
        this.f10364b.mo19677D(view.getX(), view.getY(), (float) view.getWidth(), (float) view.getHeight());
        this.f10350a.mo28029z(view);
        this.f10365b.mo28029z(view);
    }

    /* renamed from: S */
    public void mo14215S(int i) {
        this.f10349a.f15492n = i;
    }

    /* renamed from: T */
    public void mo14216T(Rect rect, C0426d dVar, int i, int i2) {
        int i3 = dVar.f2895a;
        if (i3 != 0) {
            mo14213Q(rect, this.f10345a, i3, i, i2);
            rect = this.f10345a;
        }
        ll2 ll2 = this.f10364b;
        ll2.f15478a = 1.0f;
        ll2.f15483b = 1.0f;
        mo14211O(ll2);
        this.f10364b.mo19677D((float) rect.left, (float) rect.top, (float) rect.width(), (float) rect.height());
        this.f10364b.mo19681a(dVar.mo3471q0(this.f10344a));
        this.f10365b.mo28028y(rect, dVar, i3, this.f10344a);
    }

    /* renamed from: U */
    public void mo14217U(int i) {
        this.f10377d = i;
    }

    /* renamed from: V */
    public void mo14218V(View view) {
        ll2 ll2 = this.f10349a;
        ll2.f15478a = 0.0f;
        ll2.f15483b = 0.0f;
        ll2.mo19677D(view.getX(), view.getY(), (float) view.getWidth(), (float) view.getHeight());
        this.f10350a.mo28029z(view);
    }

    /* renamed from: W */
    public void mo14219W(Rect rect, C0426d dVar, int i, int i2) {
        int i3 = dVar.f2895a;
        if (i3 != 0) {
            mo14213Q(rect, this.f10345a, i3, i, i2);
        }
        ll2 ll2 = this.f10349a;
        ll2.f15478a = 0.0f;
        ll2.f15483b = 0.0f;
        mo14211O(ll2);
        this.f10349a.mo19677D((float) rect.left, (float) rect.top, (float) rect.width(), (float) rect.height());
        C0426d.C0427a q0 = dVar.mo3471q0(this.f10344a);
        this.f10349a.mo19681a(q0);
        this.f10343a = q0.f2905a.f3080a;
        this.f10350a.mo28028y(rect, dVar, i3, this.f10344a);
        this.f10379e = q0.f2907a.f3113a;
        C0426d.C0430c cVar = q0.f2905a;
        this.f10381f = cVar.f3091f;
        this.f10380f = cVar.f3087c;
        Context context = this.f10346a.getContext();
        C0426d.C0430c cVar2 = q0.f2905a;
        this.f10347a = m12547v(context, cVar2.f3092g, cVar2.f3086b, cVar2.f3093h);
    }

    /* renamed from: X */
    public void mo14220X(cv4 cv4, View view, int i, int i2, int i3) {
        int i4;
        ll2 ll2 = this.f10349a;
        ll2.f15478a = 0.0f;
        ll2.f15483b = 0.0f;
        Rect rect = new Rect();
        if (i != 1) {
            if (i == 2) {
                int i5 = cv4.f10501a + cv4.f10503c;
                rect.left = i3 - (((cv4.f10502b + cv4.f10504d) + cv4.mo14397c()) / 2);
                i4 = (i5 - cv4.mo14396b()) / 2;
            }
            this.f10349a.mo19677D((float) rect.left, (float) rect.top, (float) rect.width(), (float) rect.height());
            this.f10350a.mo28027x(rect, view, i, cv4.f10500a);
        }
        int i6 = cv4.f10501a + cv4.f10503c;
        rect.left = ((cv4.f10502b + cv4.f10504d) - cv4.mo14397c()) / 2;
        i4 = i2 - ((i6 + cv4.mo14396b()) / 2);
        rect.top = i4;
        rect.right = rect.left + cv4.mo14397c();
        rect.bottom = rect.top + cv4.mo14396b();
        this.f10349a.mo19677D((float) rect.left, (float) rect.top, (float) rect.width(), (float) rect.height());
        this.f10350a.mo28027x(rect, view, i, cv4.f10500a);
    }

    /* renamed from: Y */
    public void mo14221Y(int i) {
        this.f10379e = i;
        this.f10363b = null;
    }

    /* renamed from: Z */
    public void mo14222Z(View view) {
        this.f10346a = view;
        this.f10344a = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            this.f10351a = ((ConstraintLayout.LayoutParams) layoutParams).mo3253a();
        }
    }

    /* renamed from: a */
    public void mo14223a(ly1 ly1) {
        this.f10366b.add(ly1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0157, code lost:
        r11 = (java.lang.Integer) r5.get(r8);
     */
    /* renamed from: a0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo14224a0(int r18, int r19, float r20, long r21) {
        /*
            r17 = this;
            r0 = r17
            java.lang.Class<double> r1 = double.class
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            int r6 = r0.f10377d
            int r7 = com.onedelhi.secure.ly1.f15666d
            if (r6 == r7) goto L_0x0027
            com.onedelhi.secure.ll2 r7 = r0.f10349a
            r7.f15493o = r6
        L_0x0027:
            com.onedelhi.secure.zk2 r6 = r0.f10350a
            com.onedelhi.secure.zk2 r7 = r0.f10365b
            r6.mo28020q(r7, r3)
            java.util.ArrayList<com.onedelhi.secure.ly1> r6 = r0.f10366b
            if (r6 == 0) goto L_0x008e
            java.util.Iterator r6 = r6.iterator()
            r8 = 0
        L_0x0037:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L_0x008f
            java.lang.Object r9 = r6.next()
            com.onedelhi.secure.ly1 r9 = (com.onedelhi.secure.ly1) r9
            boolean r10 = r9 instanceof com.onedelhi.secure.zy1
            if (r10 == 0) goto L_0x0066
            com.onedelhi.secure.zy1 r9 = (com.onedelhi.secure.zy1) r9
            com.onedelhi.secure.ll2 r10 = new com.onedelhi.secure.ll2
            com.onedelhi.secure.ll2 r15 = r0.f10349a
            com.onedelhi.secure.ll2 r14 = r0.f10364b
            r11 = r10
            r12 = r18
            r13 = r19
            r16 = r14
            r14 = r9
            r11.<init>(r12, r13, r14, r15, r16)
            r0.mo14207K(r10)
            int r9 = r9.f9584e
            int r10 = com.onedelhi.secure.ly1.f15666d
            if (r9 == r10) goto L_0x0037
            r0.f10362b = r9
            goto L_0x0037
        L_0x0066:
            boolean r10 = r9 instanceof com.onedelhi.secure.oy1
            if (r10 == 0) goto L_0x006e
            r9.mo13346d(r4)
            goto L_0x0037
        L_0x006e:
            boolean r10 = r9 instanceof com.onedelhi.secure.cz1
            if (r10 == 0) goto L_0x0076
            r9.mo13346d(r2)
            goto L_0x0037
        L_0x0076:
            boolean r10 = r9 instanceof com.onedelhi.secure.dz1
            if (r10 == 0) goto L_0x0087
            if (r8 != 0) goto L_0x0081
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
        L_0x0081:
            com.onedelhi.secure.dz1 r9 = (com.onedelhi.secure.dz1) r9
            r8.add(r9)
            goto L_0x0037
        L_0x0087:
            r9.mo14441i(r5)
            r9.mo13346d(r3)
            goto L_0x0037
        L_0x008e:
            r8 = 0
        L_0x008f:
            r6 = 0
            if (r8 == 0) goto L_0x009c
            com.onedelhi.secure.dz1[] r9 = new com.onedelhi.secure.dz1[r6]
            java.lang.Object[] r8 = r8.toArray(r9)
            com.onedelhi.secure.dz1[] r8 = (com.onedelhi.secure.dz1[]) r8
            r0.f10359a = r8
        L_0x009c:
            boolean r8 = r3.isEmpty()
            java.lang.String r9 = ","
            java.lang.String r10 = "CUSTOM,"
            r11 = 1
            if (r8 != 0) goto L_0x0173
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            r0.f10367b = r8
            java.util.Iterator r8 = r3.iterator()
        L_0x00b2:
            boolean r12 = r8.hasNext()
            if (r12 == 0) goto L_0x010d
            java.lang.Object r12 = r8.next()
            java.lang.String r12 = (java.lang.String) r12
            boolean r13 = r12.startsWith(r10)
            if (r13 == 0) goto L_0x00fc
            android.util.SparseArray r13 = new android.util.SparseArray
            r13.<init>()
            java.lang.String[] r14 = r12.split(r9)
            r14 = r14[r11]
            java.util.ArrayList<com.onedelhi.secure.ly1> r15 = r0.f10366b
            java.util.Iterator r15 = r15.iterator()
        L_0x00d5:
            boolean r16 = r15.hasNext()
            if (r16 == 0) goto L_0x00f7
            java.lang.Object r16 = r15.next()
            r7 = r16
            com.onedelhi.secure.ly1 r7 = (com.onedelhi.secure.ly1) r7
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.a> r11 = r7.f15690a
            if (r11 != 0) goto L_0x00e9
        L_0x00e7:
            r11 = 1
            goto L_0x00d5
        L_0x00e9:
            java.lang.Object r11 = r11.get(r14)
            androidx.constraintlayout.widget.a r11 = (androidx.constraintlayout.widget.C0419a) r11
            if (r11 == 0) goto L_0x00e7
            int r7 = r7.f15688a
            r13.append(r7, r11)
            goto L_0x00e7
        L_0x00f7:
            com.onedelhi.secure.bv4 r7 = com.onedelhi.secure.bv4.m12076k(r12, r13)
            goto L_0x0100
        L_0x00fc:
            com.onedelhi.secure.bv4 r7 = com.onedelhi.secure.bv4.m12077l(r12)
        L_0x0100:
            if (r7 != 0) goto L_0x0103
            goto L_0x010b
        L_0x0103:
            r7.mo26752i(r12)
            java.util.HashMap<java.lang.String, com.onedelhi.secure.bv4> r11 = r0.f10367b
            r11.put(r12, r7)
        L_0x010b:
            r11 = 1
            goto L_0x00b2
        L_0x010d:
            java.util.ArrayList<com.onedelhi.secure.ly1> r7 = r0.f10366b
            if (r7 == 0) goto L_0x012b
            java.util.Iterator r7 = r7.iterator()
        L_0x0115:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x012b
            java.lang.Object r8 = r7.next()
            com.onedelhi.secure.ly1 r8 = (com.onedelhi.secure.ly1) r8
            boolean r11 = r8 instanceof com.onedelhi.secure.my1
            if (r11 == 0) goto L_0x0115
            java.util.HashMap<java.lang.String, com.onedelhi.secure.bv4> r11 = r0.f10367b
            r8.mo14436a(r11)
            goto L_0x0115
        L_0x012b:
            com.onedelhi.secure.zk2 r7 = r0.f10350a
            java.util.HashMap<java.lang.String, com.onedelhi.secure.bv4> r8 = r0.f10367b
            r7.mo28014a(r8, r6)
            com.onedelhi.secure.zk2 r7 = r0.f10365b
            java.util.HashMap<java.lang.String, com.onedelhi.secure.bv4> r8 = r0.f10367b
            r11 = 100
            r7.mo28014a(r8, r11)
            java.util.HashMap<java.lang.String, com.onedelhi.secure.bv4> r7 = r0.f10367b
            java.util.Set r7 = r7.keySet()
            java.util.Iterator r7 = r7.iterator()
        L_0x0145:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0173
            java.lang.Object r8 = r7.next()
            java.lang.String r8 = (java.lang.String) r8
            boolean r11 = r5.containsKey(r8)
            if (r11 == 0) goto L_0x0164
            java.lang.Object r11 = r5.get(r8)
            java.lang.Integer r11 = (java.lang.Integer) r11
            if (r11 == 0) goto L_0x0164
            int r11 = r11.intValue()
            goto L_0x0165
        L_0x0164:
            r11 = 0
        L_0x0165:
            java.util.HashMap<java.lang.String, com.onedelhi.secure.bv4> r12 = r0.f10367b
            java.lang.Object r8 = r12.get(r8)
            com.onedelhi.secure.x14 r8 = (com.onedelhi.secure.x14) r8
            if (r8 == 0) goto L_0x0145
            r8.mo13828j(r11)
            goto L_0x0145
        L_0x0173:
            boolean r7 = r2.isEmpty()
            if (r7 != 0) goto L_0x0241
            java.util.HashMap<java.lang.String, com.onedelhi.secure.hv4> r7 = r0.f10353a
            if (r7 != 0) goto L_0x0184
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            r0.f10353a = r7
        L_0x0184:
            java.util.Iterator r2 = r2.iterator()
        L_0x0188:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x01ed
            java.lang.Object r7 = r2.next()
            java.lang.String r7 = (java.lang.String) r7
            java.util.HashMap<java.lang.String, com.onedelhi.secure.hv4> r8 = r0.f10353a
            boolean r8 = r8.containsKey(r7)
            if (r8 == 0) goto L_0x019d
            goto L_0x0188
        L_0x019d:
            boolean r8 = r7.startsWith(r10)
            if (r8 == 0) goto L_0x01db
            android.util.SparseArray r8 = new android.util.SparseArray
            r8.<init>()
            java.lang.String[] r11 = r7.split(r9)
            r12 = 1
            r11 = r11[r12]
            java.util.ArrayList<com.onedelhi.secure.ly1> r12 = r0.f10366b
            java.util.Iterator r12 = r12.iterator()
        L_0x01b5:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x01d4
            java.lang.Object r13 = r12.next()
            com.onedelhi.secure.ly1 r13 = (com.onedelhi.secure.ly1) r13
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.a> r14 = r13.f15690a
            if (r14 != 0) goto L_0x01c6
            goto L_0x01b5
        L_0x01c6:
            java.lang.Object r14 = r14.get(r11)
            androidx.constraintlayout.widget.a r14 = (androidx.constraintlayout.widget.C0419a) r14
            if (r14 == 0) goto L_0x01b5
            int r13 = r13.f15688a
            r8.append(r13, r14)
            goto L_0x01b5
        L_0x01d4:
            com.onedelhi.secure.hv4 r8 = com.onedelhi.secure.hv4.m16988h(r7, r8)
            r11 = r21
            goto L_0x01e1
        L_0x01db:
            r11 = r21
            com.onedelhi.secure.hv4 r8 = com.onedelhi.secure.hv4.m16989i(r7, r11)
        L_0x01e1:
            if (r8 != 0) goto L_0x01e4
            goto L_0x0188
        L_0x01e4:
            r8.mo22395e(r7)
            java.util.HashMap<java.lang.String, com.onedelhi.secure.hv4> r13 = r0.f10353a
            r13.put(r7, r8)
            goto L_0x0188
        L_0x01ed:
            java.util.ArrayList<com.onedelhi.secure.ly1> r2 = r0.f10366b
            if (r2 == 0) goto L_0x020d
            java.util.Iterator r2 = r2.iterator()
        L_0x01f5:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x020d
            java.lang.Object r7 = r2.next()
            com.onedelhi.secure.ly1 r7 = (com.onedelhi.secure.ly1) r7
            boolean r8 = r7 instanceof com.onedelhi.secure.cz1
            if (r8 == 0) goto L_0x01f5
            com.onedelhi.secure.cz1 r7 = (com.onedelhi.secure.cz1) r7
            java.util.HashMap<java.lang.String, com.onedelhi.secure.hv4> r8 = r0.f10353a
            r7.mo14435W(r8)
            goto L_0x01f5
        L_0x020d:
            java.util.HashMap<java.lang.String, com.onedelhi.secure.hv4> r2 = r0.f10353a
            java.util.Set r2 = r2.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0217:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x0241
            java.lang.Object r7 = r2.next()
            java.lang.String r7 = (java.lang.String) r7
            boolean r8 = r5.containsKey(r7)
            if (r8 == 0) goto L_0x0234
            java.lang.Object r8 = r5.get(r7)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            goto L_0x0235
        L_0x0234:
            r8 = 0
        L_0x0235:
            java.util.HashMap<java.lang.String, com.onedelhi.secure.hv4> r9 = r0.f10353a
            java.lang.Object r7 = r9.get(r7)
            com.onedelhi.secure.hv4 r7 = (com.onedelhi.secure.hv4) r7
            r7.mo17459f(r8)
            goto L_0x0217
        L_0x0241:
            java.util.ArrayList<com.onedelhi.secure.ll2> r2 = r0.f10352a
            int r2 = r2.size()
            r5 = 2
            int r2 = r2 + r5
            com.onedelhi.secure.ll2[] r7 = new com.onedelhi.secure.ll2[r2]
            com.onedelhi.secure.ll2 r8 = r0.f10349a
            r7[r6] = r8
            int r8 = r2 + -1
            com.onedelhi.secure.ll2 r9 = r0.f10364b
            r7[r8] = r9
            java.util.ArrayList<com.onedelhi.secure.ll2> r8 = r0.f10352a
            int r8 = r8.size()
            if (r8 <= 0) goto L_0x0264
            int r8 = r0.f10362b
            r9 = -1
            if (r8 != r9) goto L_0x0264
            r0.f10362b = r6
        L_0x0264:
            java.util.ArrayList<com.onedelhi.secure.ll2> r8 = r0.f10352a
            java.util.Iterator r8 = r8.iterator()
            r9 = 1
        L_0x026b:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto L_0x027d
            java.lang.Object r11 = r8.next()
            com.onedelhi.secure.ll2 r11 = (com.onedelhi.secure.ll2) r11
            int r12 = r9 + 1
            r7[r9] = r11
            r9 = r12
            goto L_0x026b
        L_0x027d:
            r8 = 18
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>()
            com.onedelhi.secure.ll2 r11 = r0.f10364b
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.a> r11 = r11.f15481a
            java.util.Set r11 = r11.keySet()
            java.util.Iterator r11 = r11.iterator()
        L_0x0290:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x02bf
            java.lang.Object r12 = r11.next()
            java.lang.String r12 = (java.lang.String) r12
            com.onedelhi.secure.ll2 r13 = r0.f10349a
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.a> r13 = r13.f15481a
            boolean r13 = r13.containsKey(r12)
            if (r13 == 0) goto L_0x0290
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r10)
            r13.append(r12)
            java.lang.String r13 = r13.toString()
            boolean r13 = r3.contains(r13)
            if (r13 != 0) goto L_0x0290
            r9.add(r12)
            goto L_0x0290
        L_0x02bf:
            java.lang.String[] r3 = new java.lang.String[r6]
            java.lang.Object[] r3 = r9.toArray(r3)
            java.lang.String[] r3 = (java.lang.String[]) r3
            r0.f10360a = r3
            int r3 = r3.length
            int[] r3 = new int[r3]
            r0.f10371b = r3
            r3 = 0
        L_0x02cf:
            java.lang.String[] r9 = r0.f10360a
            int r10 = r9.length
            if (r3 >= r10) goto L_0x0305
            r9 = r9[r3]
            int[] r10 = r0.f10371b
            r10[r3] = r6
            r10 = 0
        L_0x02db:
            if (r10 >= r2) goto L_0x0302
            r11 = r7[r10]
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.a> r11 = r11.f15481a
            boolean r11 = r11.containsKey(r9)
            if (r11 == 0) goto L_0x02ff
            r11 = r7[r10]
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.a> r11 = r11.f15481a
            java.lang.Object r11 = r11.get(r9)
            androidx.constraintlayout.widget.a r11 = (androidx.constraintlayout.widget.C0419a) r11
            if (r11 == 0) goto L_0x02ff
            int[] r9 = r0.f10371b
            r10 = r9[r3]
            int r11 = r11.mo3317p()
            int r10 = r10 + r11
            r9[r3] = r10
            goto L_0x0302
        L_0x02ff:
            int r10 = r10 + 1
            goto L_0x02db
        L_0x0302:
            int r3 = r3 + 1
            goto L_0x02cf
        L_0x0305:
            r3 = r7[r6]
            int r3 = r3.f15493o
            int r10 = com.onedelhi.secure.ly1.f15666d
            if (r3 == r10) goto L_0x030f
            r3 = 1
            goto L_0x0310
        L_0x030f:
            r3 = 0
        L_0x0310:
            int r9 = r9.length
            int r8 = r8 + r9
            boolean[] r9 = new boolean[r8]
            r10 = 1
        L_0x0315:
            if (r10 >= r2) goto L_0x0325
            r11 = r7[r10]
            int r12 = r10 + -1
            r12 = r7[r12]
            java.lang.String[] r13 = r0.f10360a
            r11.mo19686l(r12, r9, r13, r3)
            int r10 = r10 + 1
            goto L_0x0315
        L_0x0325:
            r3 = 1
            r10 = 0
        L_0x0327:
            if (r3 >= r8) goto L_0x0332
            boolean r11 = r9[r3]
            if (r11 == 0) goto L_0x032f
            int r10 = r10 + 1
        L_0x032f:
            int r3 = r3 + 1
            goto L_0x0327
        L_0x0332:
            int[] r3 = new int[r10]
            r0.f10357a = r3
            int r3 = java.lang.Math.max(r5, r10)
            double[] r10 = new double[r3]
            r0.f10355a = r10
            double[] r3 = new double[r3]
            r0.f10369b = r3
            r3 = 1
            r10 = 0
        L_0x0344:
            if (r3 >= r8) goto L_0x0354
            boolean r11 = r9[r3]
            if (r11 == 0) goto L_0x0351
            int[] r11 = r0.f10357a
            int r12 = r10 + 1
            r11[r10] = r3
            r10 = r12
        L_0x0351:
            int r3 = r3 + 1
            goto L_0x0344
        L_0x0354:
            int[] r3 = r0.f10357a
            int r3 = r3.length
            int[] r8 = new int[r5]
            r9 = 1
            r8[r9] = r3
            r8[r6] = r2
            java.lang.Object r3 = java.lang.reflect.Array.newInstance(r1, r8)
            double[][] r3 = (double[][]) r3
            double[] r8 = new double[r2]
            r9 = 0
        L_0x0367:
            if (r9 >= r2) goto L_0x037c
            r10 = r7[r9]
            r11 = r3[r9]
            int[] r12 = r0.f10357a
            r10.mo19687q(r11, r12)
            r10 = r7[r9]
            float r10 = r10.f15478a
            double r10 = (double) r10
            r8[r9] = r10
            int r9 = r9 + 1
            goto L_0x0367
        L_0x037c:
            r9 = 0
        L_0x037d:
            int[] r10 = r0.f10357a
            int r11 = r10.length
            if (r9 >= r11) goto L_0x03be
            r10 = r10[r9]
            java.lang.String[] r11 = com.onedelhi.secure.ll2.f15466a
            int r11 = r11.length
            if (r10 >= r11) goto L_0x03bb
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String[] r11 = com.onedelhi.secure.ll2.f15466a
            int[] r12 = r0.f10357a
            r12 = r12[r9]
            r11 = r11[r12]
            r10.append(r11)
            java.lang.String r11 = " ["
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r11 = 0
        L_0x03a3:
            if (r11 >= r2) goto L_0x03bb
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r10)
            r10 = r3[r11]
            r13 = r10[r9]
            r12.append(r13)
            java.lang.String r10 = r12.toString()
            int r11 = r11 + 1
            goto L_0x03a3
        L_0x03bb:
            int r9 = r9 + 1
            goto L_0x037d
        L_0x03be:
            java.lang.String[] r9 = r0.f10360a
            int r9 = r9.length
            r10 = 1
            int r9 = r9 + r10
            com.onedelhi.secure.dc0[] r9 = new com.onedelhi.secure.dc0[r9]
            r0.f10358a = r9
            r9 = 0
        L_0x03c8:
            java.lang.String[] r10 = r0.f10360a
            int r11 = r10.length
            if (r9 >= r11) goto L_0x0424
            r10 = r10[r9]
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
        L_0x03d3:
            if (r11 >= r2) goto L_0x040b
            r15 = r7[r11]
            boolean r15 = r15.mo19695y(r10)
            if (r15 == 0) goto L_0x0406
            if (r14 != 0) goto L_0x03f5
            double[] r12 = new double[r2]
            r14 = r7[r11]
            int r14 = r14.mo19693w(r10)
            int[] r15 = new int[r5]
            r16 = 1
            r15[r16] = r14
            r15[r6] = r2
            java.lang.Object r14 = java.lang.reflect.Array.newInstance(r1, r15)
            double[][] r14 = (double[][]) r14
        L_0x03f5:
            r15 = r7[r11]
            float r15 = r15.f15478a
            double r5 = (double) r15
            r12[r13] = r5
            r5 = r7[r11]
            r6 = r14[r13]
            r15 = 0
            r5.mo19692v(r10, r6, r15)
            int r13 = r13 + 1
        L_0x0406:
            int r11 = r11 + 1
            r5 = 2
            r6 = 0
            goto L_0x03d3
        L_0x040b:
            double[] r5 = java.util.Arrays.copyOf(r12, r13)
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r14, r13)
            double[][] r6 = (double[][]) r6
            com.onedelhi.secure.dc0[] r10 = r0.f10358a
            int r9 = r9 + 1
            int r11 = r0.f10362b
            com.onedelhi.secure.dc0 r5 = com.onedelhi.secure.dc0.m13061a(r11, r5, r6)
            r10[r9] = r5
            r5 = 2
            r6 = 0
            goto L_0x03c8
        L_0x0424:
            com.onedelhi.secure.dc0[] r5 = r0.f10358a
            int r6 = r0.f10362b
            com.onedelhi.secure.dc0 r3 = com.onedelhi.secure.dc0.m13061a(r6, r8, r3)
            r6 = 0
            r5[r6] = r3
            r3 = r7[r6]
            int r3 = r3.f15493o
            int r5 = com.onedelhi.secure.ly1.f15666d
            if (r3 == r5) goto L_0x0476
            int[] r3 = new int[r2]
            double[] r5 = new double[r2]
            r8 = 2
            int[] r9 = new int[r8]
            r10 = 1
            r9[r10] = r8
            r9[r6] = r2
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r9)
            double[][] r1 = (double[][]) r1
            r15 = 0
        L_0x044a:
            if (r15 >= r2) goto L_0x0470
            r6 = r7[r15]
            int r6 = r6.f15493o
            r3[r15] = r6
            r6 = r7[r15]
            float r6 = r6.f15478a
            double r8 = (double) r6
            r5[r15] = r8
            r6 = r1[r15]
            r8 = r7[r15]
            float r8 = r8.f15485c
            double r8 = (double) r8
            r10 = 0
            r6[r10] = r8
            r6 = r1[r15]
            r8 = r7[r15]
            float r8 = r8.f15486d
            double r8 = (double) r8
            r11 = 1
            r6[r11] = r8
            int r15 = r15 + 1
            goto L_0x044a
        L_0x0470:
            com.onedelhi.secure.dc0 r1 = com.onedelhi.secure.dc0.m13062b(r3, r5, r1)
            r0.f10348a = r1
        L_0x0476:
            r1 = 2143289344(0x7fc00000, float:NaN)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r0.f10375c = r2
            java.util.ArrayList<com.onedelhi.secure.ly1> r2 = r0.f10366b
            if (r2 == 0) goto L_0x04eb
            java.util.Iterator r2 = r4.iterator()
        L_0x0487:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x04b3
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            com.onedelhi.secure.ku4 r4 = com.onedelhi.secure.ku4.m20029l(r3)
            if (r4 != 0) goto L_0x049a
            goto L_0x0487
        L_0x049a:
            boolean r5 = r4.mo22771k()
            if (r5 == 0) goto L_0x04aa
            boolean r5 = java.lang.Float.isNaN(r1)
            if (r5 == 0) goto L_0x04aa
            float r1 = r17.mo14200D()
        L_0x04aa:
            r4.mo22769i(r3)
            java.util.HashMap<java.lang.String, com.onedelhi.secure.ku4> r5 = r0.f10375c
            r5.put(r3, r4)
            goto L_0x0487
        L_0x04b3:
            java.util.ArrayList<com.onedelhi.secure.ly1> r2 = r0.f10366b
            java.util.Iterator r2 = r2.iterator()
        L_0x04b9:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x04d1
            java.lang.Object r3 = r2.next()
            com.onedelhi.secure.ly1 r3 = (com.onedelhi.secure.ly1) r3
            boolean r4 = r3 instanceof com.onedelhi.secure.oy1
            if (r4 == 0) goto L_0x04b9
            com.onedelhi.secure.oy1 r3 = (com.onedelhi.secure.oy1) r3
            java.util.HashMap<java.lang.String, com.onedelhi.secure.ku4> r4 = r0.f10375c
            r3.mo22174a0(r4)
            goto L_0x04b9
        L_0x04d1:
            java.util.HashMap<java.lang.String, com.onedelhi.secure.ku4> r2 = r0.f10375c
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
        L_0x04db:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x04eb
            java.lang.Object r3 = r2.next()
            com.onedelhi.secure.ku4 r3 = (com.onedelhi.secure.ku4) r3
            r3.mo22770j(r1)
            goto L_0x04db
        L_0x04eb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.cl2.mo14224a0(int, int, float, long):void");
    }

    /* renamed from: b */
    public void mo14225b(ArrayList<ly1> arrayList) {
        this.f10366b.addAll(arrayList);
    }

    /* renamed from: b0 */
    public void mo14226b0(cl2 cl2) {
        this.f10349a.mo19680G(cl2, cl2.f10349a);
        this.f10364b.mo19680G(cl2, cl2.f10364b);
    }

    /* renamed from: c */
    public void mo14227c(float[] fArr, int i) {
        int i2 = i;
        float f = 1.0f / ((float) (i2 - 1));
        HashMap<String, bv4> hashMap = this.f10367b;
        if (hashMap != null) {
            x14 x14 = hashMap.get("translationX");
        }
        HashMap<String, bv4> hashMap2 = this.f10367b;
        if (hashMap2 != null) {
            x14 x142 = hashMap2.get("translationY");
        }
        HashMap<String, ku4> hashMap3 = this.f10375c;
        if (hashMap3 != null) {
            ku4 ku4 = hashMap3.get("translationX");
        }
        HashMap<String, ku4> hashMap4 = this.f10375c;
        if (hashMap4 != null) {
            ku4 ku42 = hashMap4.get("translationY");
        }
        for (int i3 = 0; i3 < i2; i3++) {
            float f2 = ((float) i3) * f;
            float f3 = this.f10373c;
            float f4 = 0.0f;
            if (f3 != 1.0f) {
                float f5 = this.f10361b;
                if (f2 < f5) {
                    f2 = 0.0f;
                }
                if (f2 > f5 && ((double) f2) < 1.0d) {
                    f2 = Math.min((f2 - f5) * f3, 1.0f);
                }
            }
            double d = (double) f2;
            ur0 ur0 = this.f10349a.f15480a;
            float f6 = Float.NaN;
            Iterator<ll2> it = this.f10352a.iterator();
            while (it.hasNext()) {
                ll2 next = it.next();
                ur0 ur02 = next.f15480a;
                if (ur02 != null) {
                    float f7 = next.f15478a;
                    if (f7 < f2) {
                        ur0 = ur02;
                        f4 = f7;
                    } else if (Float.isNaN(f6)) {
                        f6 = next.f15478a;
                    }
                }
            }
            if (ur0 != null) {
                if (Float.isNaN(f6)) {
                    f6 = 1.0f;
                }
                float f8 = f6 - f4;
                d = (double) ((((float) ur0.mo17398a((double) ((f2 - f4) / f8))) * f8) + f4);
            }
            this.f10358a[0].mo14611d(d, this.f10355a);
            dc0 dc0 = this.f10348a;
            if (dc0 != null) {
                double[] dArr = this.f10355a;
                if (dArr.length > 0) {
                    dc0.mo14611d(d, dArr);
                }
            }
            this.f10349a.mo19688r(this.f10357a, this.f10355a, fArr, i3 * 2);
        }
    }

    /* renamed from: d */
    public int mo14228d(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] h = this.f10358a[0].mo14615h();
        if (iArr != null) {
            Iterator<ll2> it = this.f10352a.iterator();
            int i = 0;
            while (it.hasNext()) {
                iArr[i] = it.next().f15495q;
                i++;
            }
        }
        int i2 = 0;
        for (double d : h) {
            this.f10358a[0].mo14611d(d, this.f10355a);
            this.f10349a.mo19688r(this.f10357a, this.f10355a, fArr, i2);
            i2 += 2;
        }
        return i2 / 2;
    }

    /* renamed from: e */
    public int mo14229e(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] h = this.f10358a[0].mo14615h();
        if (iArr != null) {
            Iterator<ll2> it = this.f10352a.iterator();
            int i = 0;
            while (it.hasNext()) {
                iArr[i] = it.next().f15495q;
                i++;
            }
        }
        int i2 = 0;
        for (int i3 = 0; i3 < h.length; i3++) {
            this.f10358a[0].mo14611d(h[i3], this.f10355a);
            this.f10349a.mo19689s(h[i3], this.f10357a, this.f10355a, fArr, i2);
            i2 += 2;
        }
        return i2 / 2;
    }

    /* renamed from: f */
    public void mo14230f(float[] fArr, int i) {
        double d;
        int i2 = i;
        float f = 1.0f;
        float f2 = 1.0f / ((float) (i2 - 1));
        HashMap<String, bv4> hashMap = this.f10367b;
        ku4 ku4 = null;
        x14 x14 = hashMap == null ? null : hashMap.get("translationX");
        HashMap<String, bv4> hashMap2 = this.f10367b;
        x14 x142 = hashMap2 == null ? null : hashMap2.get("translationY");
        HashMap<String, ku4> hashMap3 = this.f10375c;
        ku4 ku42 = hashMap3 == null ? null : hashMap3.get("translationX");
        HashMap<String, ku4> hashMap4 = this.f10375c;
        if (hashMap4 != null) {
            ku4 = hashMap4.get("translationY");
        }
        ku4 ku43 = ku4;
        int i3 = 0;
        while (i3 < i2) {
            float f3 = ((float) i3) * f2;
            float f4 = this.f10373c;
            if (f4 != f) {
                float f5 = this.f10361b;
                if (f3 < f5) {
                    f3 = 0.0f;
                }
                if (f3 > f5 && ((double) f3) < 1.0d) {
                    f3 = Math.min((f3 - f5) * f4, f);
                }
            }
            float f6 = f3;
            double d2 = (double) f6;
            ur0 ur0 = this.f10349a.f15480a;
            float f7 = Float.NaN;
            Iterator<ll2> it = this.f10352a.iterator();
            float f8 = 0.0f;
            while (it.hasNext()) {
                ll2 next = it.next();
                ur0 ur02 = next.f15480a;
                double d3 = d2;
                if (ur02 != null) {
                    float f9 = next.f15478a;
                    if (f9 < f6) {
                        f8 = f9;
                        ur0 = ur02;
                    } else if (Float.isNaN(f7)) {
                        f7 = next.f15478a;
                    }
                }
                d2 = d3;
            }
            double d4 = d2;
            if (ur0 != null) {
                if (Float.isNaN(f7)) {
                    f7 = 1.0f;
                }
                float f10 = f7 - f8;
                d = (double) ((((float) ur0.mo17398a((double) ((f6 - f8) / f10))) * f10) + f8);
            } else {
                d = d4;
            }
            this.f10358a[0].mo14611d(d, this.f10355a);
            dc0 dc0 = this.f10348a;
            if (dc0 != null) {
                double[] dArr = this.f10355a;
                if (dArr.length > 0) {
                    dc0.mo14611d(d, dArr);
                }
            }
            int i4 = i3 * 2;
            float f11 = f6;
            int i5 = i3;
            this.f10349a.mo19689s(d, this.f10357a, this.f10355a, fArr, i4);
            if (ku42 != null) {
                fArr[i4] = fArr[i4] + ku42.mo22763a(f11);
            } else if (x14 != null) {
                fArr[i4] = fArr[i4] + x14.mo26748a(f11);
            }
            if (ku43 != null) {
                int i6 = i4 + 1;
                fArr[i6] = fArr[i6] + ku43.mo22763a(f11);
            } else if (x142 != null) {
                int i7 = i4 + 1;
                fArr[i7] = fArr[i7] + x142.mo26748a(f11);
            }
            i3 = i5 + 1;
            f = 1.0f;
        }
    }

    /* renamed from: g */
    public void mo14231g(float f, float[] fArr, int i) {
        this.f10358a[0].mo14611d((double) mo14234j(f, (float[]) null), this.f10355a);
        this.f10349a.mo19694x(this.f10357a, this.f10355a, fArr, i);
    }

    /* renamed from: h */
    public void mo14232h(float[] fArr, int i) {
        float f = 1.0f / ((float) (i - 1));
        for (int i2 = 0; i2 < i; i2++) {
            this.f10358a[0].mo14611d((double) mo14234j(((float) i2) * f, (float[]) null), this.f10355a);
            this.f10349a.mo19694x(this.f10357a, this.f10355a, fArr, i2 * 8);
        }
    }

    /* renamed from: i */
    public void mo14233i(boolean z) {
        if ("button".equals(ve0.m30012k(this.f10346a)) && this.f10359a != null) {
            int i = 0;
            while (true) {
                dz1[] dz1Arr = this.f10359a;
                if (i < dz1Arr.length) {
                    dz1Arr[i].mo14950A(z ? -100.0f : 100.0f, this.f10346a);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: j */
    public final float mo14234j(float f, float[] fArr) {
        float f2 = 0.0f;
        float f3 = 1.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f4 = this.f10373c;
            if (((double) f4) != 1.0d) {
                float f5 = this.f10361b;
                if (f < f5) {
                    f = 0.0f;
                }
                if (f > f5 && ((double) f) < 1.0d) {
                    f = Math.min((f - f5) * f4, 1.0f);
                }
            }
        }
        ur0 ur0 = this.f10349a.f15480a;
        float f6 = Float.NaN;
        Iterator<ll2> it = this.f10352a.iterator();
        while (it.hasNext()) {
            ll2 next = it.next();
            ur0 ur02 = next.f15480a;
            if (ur02 != null) {
                float f7 = next.f15478a;
                if (f7 < f) {
                    ur0 = ur02;
                    f2 = f7;
                } else if (Float.isNaN(f6)) {
                    f6 = next.f15478a;
                }
            }
        }
        if (ur0 != null) {
            if (!Float.isNaN(f6)) {
                f3 = f6;
            }
            float f8 = f3 - f2;
            double d = (double) ((f - f2) / f8);
            f = (((float) ur0.mo17398a(d)) * f8) + f2;
            if (fArr != null) {
                fArr[0] = (float) ur0.mo17399b(d);
            }
        }
        return f;
    }

    /* renamed from: k */
    public int mo14235k() {
        return this.f10349a.f15494p;
    }

    /* renamed from: l */
    public int mo14236l(String str, float[] fArr, int i) {
        x14 x14 = this.f10367b.get(str);
        if (x14 == null) {
            return -1;
        }
        for (int i2 = 0; i2 < fArr.length; i2++) {
            fArr[i2] = x14.mo26748a((float) (i2 / (fArr.length - 1)));
        }
        return fArr.length;
    }

    /* renamed from: m */
    public void mo14237m(double d, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.f10358a[0].mo14611d(d, dArr);
        this.f10358a[0].mo14614g(d, dArr2);
        Arrays.fill(fArr2, 0.0f);
        this.f10349a.mo19690t(d, this.f10357a, dArr, fArr, dArr2, fArr2);
    }

    /* renamed from: n */
    public float mo14238n() {
        return this.f10376d;
    }

    /* renamed from: o */
    public float mo14239o() {
        return this.f10378e;
    }

    /* renamed from: p */
    public void mo14240p(float f, float f2, float f3, float[] fArr) {
        double[] dArr;
        float j = mo14234j(f, this.f10370b);
        dc0[] dc0Arr = this.f10358a;
        int i = 0;
        if (dc0Arr != null) {
            double d = (double) j;
            dc0Arr[0].mo14614g(d, this.f10369b);
            this.f10358a[0].mo14611d(d, this.f10355a);
            float f4 = this.f10370b[0];
            while (true) {
                dArr = this.f10369b;
                if (i >= dArr.length) {
                    break;
                }
                dArr[i] = dArr[i] * ((double) f4);
                i++;
            }
            dc0 dc0 = this.f10348a;
            if (dc0 != null) {
                double[] dArr2 = this.f10355a;
                if (dArr2.length > 0) {
                    dc0.mo14611d(d, dArr2);
                    this.f10348a.mo14614g(d, this.f10369b);
                    this.f10349a.mo19678E(f2, f3, fArr, this.f10357a, this.f10369b, this.f10355a);
                    return;
                }
                return;
            }
            this.f10349a.mo19678E(f2, f3, fArr, this.f10357a, dArr, this.f10355a);
            return;
        }
        ll2 ll2 = this.f10364b;
        float f5 = ll2.f15485c;
        ll2 ll22 = this.f10349a;
        float f6 = f5 - ll22.f15485c;
        float f7 = ll2.f15486d - ll22.f15486d;
        float f8 = (ll2.f15487e - ll22.f15487e) + f6;
        float f9 = (ll2.f15488f - ll22.f15488f) + f7;
        fArr[0] = (f6 * (1.0f - f2)) + (f8 * f2);
        fArr[1] = (f7 * (1.0f - f3)) + (f9 * f3);
    }

    /* renamed from: q */
    public int mo14241q() {
        int i = this.f10349a.f15492n;
        Iterator<ll2> it = this.f10352a.iterator();
        while (it.hasNext()) {
            i = Math.max(i, it.next().f15492n);
        }
        return Math.max(i, this.f10364b.f15492n);
    }

    /* renamed from: r */
    public float mo14242r() {
        return this.f10364b.f15488f;
    }

    /* renamed from: s */
    public float mo14243s() {
        return this.f10364b.f15487e;
    }

    /* renamed from: t */
    public float mo14244t() {
        return this.f10364b.f15485c;
    }

    public String toString() {
        return " start: x: " + this.f10349a.f15485c + " y: " + this.f10349a.f15486d + " end: x: " + this.f10364b.f15485c + " y: " + this.f10364b.f15486d;
    }

    /* renamed from: u */
    public float mo14246u() {
        return this.f10364b.f15486d;
    }

    /* renamed from: w */
    public ll2 mo14247w(int i) {
        return this.f10352a.get(i);
    }

    /* renamed from: x */
    public int mo14248x(int i, int[] iArr) {
        int i2 = i;
        float[] fArr = new float[2];
        Iterator<ly1> it = this.f10366b.iterator();
        int i3 = 0;
        int i4 = 0;
        while (it.hasNext()) {
            ly1 next = it.next();
            int i5 = next.f15692c;
            if (i5 == i2 || i2 != -1) {
                iArr[i4] = 0;
                int i6 = i4 + 1;
                iArr[i6] = i5;
                int i7 = i6 + 1;
                int i8 = next.f15688a;
                iArr[i7] = i8;
                double d = (double) (((float) i8) / 100.0f);
                this.f10358a[0].mo14611d(d, this.f10355a);
                this.f10349a.mo19689s(d, this.f10357a, this.f10355a, fArr, 0);
                int i9 = i7 + 1;
                iArr[i9] = Float.floatToIntBits(fArr[0]);
                int i10 = i9 + 1;
                iArr[i10] = Float.floatToIntBits(fArr[1]);
                if (next instanceof zy1) {
                    zy1 zy1 = (zy1) next;
                    int i11 = i10 + 1;
                    iArr[i11] = zy1.f23966h;
                    int i12 = i11 + 1;
                    iArr[i12] = Float.floatToIntBits(zy1.f23959d);
                    i10 = i12 + 1;
                    iArr[i10] = Float.floatToIntBits(zy1.f23960e);
                }
                int i13 = i10 + 1;
                iArr[i4] = i13 - i4;
                i3++;
                i4 = i13;
            }
        }
        return i3;
    }

    /* renamed from: y */
    public float mo14249y(int i, float f, float f2) {
        ll2 ll2 = this.f10364b;
        float f3 = ll2.f15485c;
        ll2 ll22 = this.f10349a;
        float f4 = ll22.f15485c;
        float f5 = f3 - f4;
        float f6 = ll2.f15486d;
        float f7 = ll22.f15486d;
        float f8 = f6 - f7;
        float f9 = f4 + (ll22.f15487e / 2.0f);
        float f10 = f7 + (ll22.f15488f / 2.0f);
        float hypot = (float) Math.hypot((double) f5, (double) f8);
        if (((double) hypot) < 1.0E-7d) {
            return Float.NaN;
        }
        float f11 = f - f9;
        float f12 = f2 - f10;
        if (((float) Math.hypot((double) f11, (double) f12)) == 0.0f) {
            return 0.0f;
        }
        float f13 = (f11 * f5) + (f12 * f8);
        if (i == 0) {
            return f13 / hypot;
        }
        if (i == 1) {
            return (float) Math.sqrt((double) ((hypot * hypot) - (f13 * f13)));
        }
        if (i == 2) {
            return f11 / f5;
        }
        if (i == 3) {
            return f12 / f5;
        }
        if (i == 4) {
            return f11 / f8;
        }
        if (i != 5) {
            return 0.0f;
        }
        return f12 / f8;
    }

    /* renamed from: z */
    public int mo14250z(int[] iArr, float[] fArr) {
        Iterator<ly1> it = this.f10366b.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            ly1 next = it.next();
            int i3 = next.f15688a;
            iArr[i] = (next.f15692c * 1000) + i3;
            double d = (double) (((float) i3) / 100.0f);
            this.f10358a[0].mo14611d(d, this.f10355a);
            this.f10349a.mo19689s(d, this.f10357a, this.f10355a, fArr, i2);
            i2 += 2;
            i++;
        }
        return i;
    }
}
