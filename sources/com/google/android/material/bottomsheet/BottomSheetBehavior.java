package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.onedelhi.secure.C1638a2;
import com.onedelhi.secure.C2015e0;
import com.onedelhi.secure.C2018e2;
import com.onedelhi.secure.af2;
import com.onedelhi.secure.bf2;
import com.onedelhi.secure.d81;
import com.onedelhi.secure.e54;
import com.onedelhi.secure.e83;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.gr1;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.hw4;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.mt4;
import com.onedelhi.secure.pv4;
import com.onedelhi.secure.rf2;
import com.onedelhi.secure.sx4;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.uw3;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: A */
    public static final int f7842A = 5;

    /* renamed from: B */
    public static final int f7843B = 6;

    /* renamed from: C */
    public static final int f7844C = -1;

    /* renamed from: D */
    public static final int f7845D = 1;

    /* renamed from: E */
    public static final int f7846E = 2;

    /* renamed from: F */
    public static final int f7847F = 4;

    /* renamed from: G */
    public static final int f7848G = 8;

    /* renamed from: H */
    public static final int f7849H = -1;

    /* renamed from: I */
    public static final int f7850I = 0;

    /* renamed from: J */
    public static final int f7851J = 500;

    /* renamed from: K */
    public static final int f7852K = 500;

    /* renamed from: L */
    public static final int f7853L = -1;

    /* renamed from: M */
    public static final int f7854M = fd3.C2164n.Widget_Design_BottomSheet_Modal;

    /* renamed from: a */
    public static final String f7855a = "BottomSheetBehavior";

    /* renamed from: e */
    public static final float f7856e = 0.5f;

    /* renamed from: f */
    public static final float f7857f = 0.1f;

    /* renamed from: w */
    public static final int f7858w = 1;

    /* renamed from: x */
    public static final int f7859x = 2;

    /* renamed from: y */
    public static final int f7860y = 3;

    /* renamed from: z */
    public static final int f7861z = 4;

    /* renamed from: a */
    public float f7862a;

    /* renamed from: a */
    public int f7863a = 0;
    @ts2

    /* renamed from: a */
    public ValueAnimator f7864a;
    @ts2

    /* renamed from: a */
    public ColorStateList f7865a;
    @ts2

    /* renamed from: a */
    public VelocityTracker f7866a;

    /* renamed from: a */
    public final BottomSheetBehavior<V>.k f7867a = new C1509k(this, (C1498a) null);

    /* renamed from: a */
    public bf2 f7868a;

    /* renamed from: a */
    public final mt4.C2888c f7869a = new C1501d();
    @ts2

    /* renamed from: a */
    public mt4 f7870a;

    /* renamed from: a */
    public uw3 f7871a;
    @ts2

    /* renamed from: a */
    public WeakReference<V> f7872a;
    @mr2

    /* renamed from: a */
    public final ArrayList<C1503f> f7873a = new ArrayList<>();
    @ts2

    /* renamed from: a */
    public Map<View, Integer> f7874a;

    /* renamed from: a */
    public boolean f7875a = true;

    /* renamed from: b */
    public float f7876b = 0.5f;

    /* renamed from: b */
    public int f7877b;
    @ts2

    /* renamed from: b */
    public WeakReference<View> f7878b;

    /* renamed from: b */
    public boolean f7879b = false;

    /* renamed from: c */
    public float f7880c = -1.0f;

    /* renamed from: c */
    public int f7881c;

    /* renamed from: c */
    public boolean f7882c;

    /* renamed from: d */
    public float f7883d = 0.1f;

    /* renamed from: d */
    public int f7884d;

    /* renamed from: d */
    public boolean f7885d;

    /* renamed from: e */
    public int f7886e = -1;

    /* renamed from: e */
    public boolean f7887e;

    /* renamed from: f */
    public int f7888f = -1;

    /* renamed from: f */
    public boolean f7889f;

    /* renamed from: g */
    public int f7890g;

    /* renamed from: g */
    public boolean f7891g;

    /* renamed from: h */
    public int f7892h;

    /* renamed from: h */
    public boolean f7893h;

    /* renamed from: i */
    public int f7894i;

    /* renamed from: i */
    public boolean f7895i;

    /* renamed from: j */
    public int f7896j;

    /* renamed from: j */
    public boolean f7897j;

    /* renamed from: k */
    public int f7898k;

    /* renamed from: k */
    public boolean f7899k;

    /* renamed from: l */
    public int f7900l;

    /* renamed from: l */
    public boolean f7901l;

    /* renamed from: m */
    public int f7902m;

    /* renamed from: m */
    public boolean f7903m;

    /* renamed from: n */
    public int f7904n = 4;

    /* renamed from: n */
    public boolean f7905n;

    /* renamed from: o */
    public int f7906o = 4;

    /* renamed from: o */
    public boolean f7907o = true;

    /* renamed from: p */
    public int f7908p;

    /* renamed from: p */
    public boolean f7909p;

    /* renamed from: q */
    public int f7910q;

    /* renamed from: q */
    public boolean f7911q;

    /* renamed from: r */
    public int f7912r;

    /* renamed from: r */
    public boolean f7913r;

    /* renamed from: s */
    public int f7914s;

    /* renamed from: t */
    public int f7915t;

    /* renamed from: u */
    public int f7916u;

    /* renamed from: v */
    public int f7917v = -1;

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$a */
    public class C1498a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ View f7918a;

        /* renamed from: n */
        public final /* synthetic */ int f7920n;

        public C1498a(View view, int i) {
            this.f7918a = view;
            this.f7920n = i;
        }

        public void run() {
            BottomSheetBehavior.this.mo11260h1(this.f7918a, this.f7920n, false);
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$b */
    public class C1499b implements ValueAnimator.AnimatorUpdateListener {
        public C1499b() {
        }

        public void onAnimationUpdate(@mr2 ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f7868a != null) {
                BottomSheetBehavior.this.f7868a.mo31629p0(floatValue);
            }
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$c */
    public class C1500c implements pv4.C6478e {

        /* renamed from: a */
        public final /* synthetic */ boolean f7923a;

        public C1500c(boolean z) {
            this.f7923a = z;
        }

        /* renamed from: a */
        public sx4 mo11179a(View view, sx4 sx4, pv4.C6479f fVar) {
            boolean z;
            int i;
            int i2;
            int i3;
            gr1 f = sx4.mo24592f(sx4.C3559m.m28015i());
            gr1 f2 = sx4.mo24592f(sx4.C3559m.m28012f());
            int unused = BottomSheetBehavior.this.f7894i = f.f12723b;
            boolean l = pv4.m61672l(view);
            int paddingBottom = view.getPaddingBottom();
            int paddingLeft = view.getPaddingLeft();
            int paddingRight = view.getPaddingRight();
            if (BottomSheetBehavior.this.f7887e) {
                int unused2 = BottomSheetBehavior.this.f7892h = sx4.mo24602o();
                paddingBottom = fVar.f33795d + BottomSheetBehavior.this.f7892h;
            }
            if (BottomSheetBehavior.this.f7889f) {
                paddingLeft = (l ? fVar.f33794c : fVar.f33792a) + f.f12722a;
            }
            if (BottomSheetBehavior.this.f7891g) {
                paddingRight = (l ? fVar.f33792a : fVar.f33794c) + f.f12724c;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            boolean z2 = true;
            if (!BottomSheetBehavior.this.f7895i || marginLayoutParams.leftMargin == (i3 = f.f12722a)) {
                z = false;
            } else {
                marginLayoutParams.leftMargin = i3;
                z = true;
            }
            if (BottomSheetBehavior.this.f7897j && marginLayoutParams.rightMargin != (i2 = f.f12724c)) {
                marginLayoutParams.rightMargin = i2;
                z = true;
            }
            if (!BottomSheetBehavior.this.f7899k || marginLayoutParams.topMargin == (i = f.f12723b)) {
                z2 = z;
            } else {
                marginLayoutParams.topMargin = i;
            }
            if (z2) {
                view.setLayoutParams(marginLayoutParams);
            }
            view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
            if (this.f7923a) {
                int unused3 = BottomSheetBehavior.this.f7890g = f2.f12725d;
            }
            if (BottomSheetBehavior.this.f7887e || this.f7923a) {
                BottomSheetBehavior.this.mo11267l1(false);
            }
            return sx4;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$d */
    public class C1501d extends mt4.C2888c {

        /* renamed from: a */
        public long f7924a;

        public C1501d() {
        }

        /* renamed from: a */
        public int mo4122a(@mr2 View view, int i, int i2) {
            return view.getLeft();
        }

        /* renamed from: b */
        public int mo4123b(@mr2 View view, int i, int i2) {
            int k0 = BottomSheetBehavior.this.mo11264k0();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return rf2.m26699e(i, k0, bottomSheetBehavior.f7903m ? bottomSheetBehavior.f7914s : bottomSheetBehavior.f7902m);
        }

        /* renamed from: e */
        public int mo11284e(@mr2 View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.f7903m ? bottomSheetBehavior.f7914s : bottomSheetBehavior.f7902m;
        }

        /* renamed from: j */
        public void mo4129j(int i) {
            if (i == 1 && BottomSheetBehavior.this.f7907o) {
                BottomSheetBehavior.this.mo11244Z0(1);
            }
        }

        /* renamed from: k */
        public void mo4130k(@mr2 View view, int i, int i2, int i3, int i4) {
            BottomSheetBehavior.this.mo11257g0(i2);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x003c, code lost:
            if (r10 > r8.f7925a.f7900l) goto L_0x0125;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x008c, code lost:
            if (java.lang.Math.abs(r9.getTop() - r8.f7925a.mo11264k0()) < java.lang.Math.abs(r9.getTop() - r8.f7925a.f7900l)) goto L_0x0010;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ca, code lost:
            if (r8.f7925a.mo11256f1() == false) goto L_0x0125;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ec, code lost:
            if (java.lang.Math.abs(r10 - r8.f7925a.f7898k) < java.lang.Math.abs(r10 - r8.f7925a.f7902m)) goto L_0x0010;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x0108, code lost:
            if (r8.f7925a.mo11256f1() != false) goto L_0x00a8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x0122, code lost:
            if (r8.f7925a.mo11256f1() == false) goto L_0x0125;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0035, code lost:
            if (r11.mo11250c1(r4, (((float) r10) * 100.0f) / ((float) r11.f7914s)) != false) goto L_0x0010;
         */
        /* renamed from: l */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo4131l(@com.onedelhi.secure.mr2 android.view.View r9, float r10, float r11) {
            /*
                r8 = this;
                r0 = 0
                r1 = 6
                r2 = 3
                r3 = 4
                int r4 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
                if (r4 >= 0) goto L_0x0040
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r10 = r10.f7875a
                if (r10 == 0) goto L_0x0013
            L_0x0010:
                r1 = 3
                goto L_0x0125
            L_0x0013:
                int r10 = r9.getTop()
                long r4 = java.lang.System.currentTimeMillis()
                long r6 = r8.f7924a
                long r4 = r4 - r6
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r11 = r11.mo11256f1()
                if (r11 == 0) goto L_0x0038
                float r10 = (float) r10
                r11 = 1120403456(0x42c80000, float:100.0)
                float r10 = r10 * r11
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r11.f7914s
                float r0 = (float) r0
                float r10 = r10 / r0
                boolean r10 = r11.mo11250c1(r4, r10)
                if (r10 == 0) goto L_0x00a8
                goto L_0x0010
            L_0x0038:
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r11 = r11.f7900l
                if (r10 <= r11) goto L_0x0010
                goto L_0x0125
            L_0x0040:
                com.google.android.material.bottomsheet.BottomSheetBehavior r4 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r5 = r4.f7903m
                if (r5 == 0) goto L_0x008f
                boolean r4 = r4.mo11254e1(r9, r11)
                if (r4 == 0) goto L_0x008f
                float r10 = java.lang.Math.abs(r10)
                float r0 = java.lang.Math.abs(r11)
                int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r10 >= 0) goto L_0x005e
                r10 = 1140457472(0x43fa0000, float:500.0)
                int r10 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
                if (r10 > 0) goto L_0x0064
            L_0x005e:
                boolean r10 = r8.mo11285n(r9)
                if (r10 == 0) goto L_0x0067
            L_0x0064:
                r1 = 5
                goto L_0x0125
            L_0x0067:
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r10 = r10.f7875a
                if (r10 == 0) goto L_0x0070
                goto L_0x0010
            L_0x0070:
                int r10 = r9.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r11 = r11.mo11264k0()
                int r10 = r10 - r11
                int r10 = java.lang.Math.abs(r10)
                int r11 = r9.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.f7900l
                int r11 = r11 - r0
                int r11 = java.lang.Math.abs(r11)
                if (r10 >= r11) goto L_0x0125
                goto L_0x0010
            L_0x008f:
                int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
                if (r0 == 0) goto L_0x00cd
                float r10 = java.lang.Math.abs(r10)
                float r11 = java.lang.Math.abs(r11)
                int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
                if (r10 <= 0) goto L_0x00a0
                goto L_0x00cd
            L_0x00a0:
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r10 = r10.f7875a
                if (r10 == 0) goto L_0x00ab
            L_0x00a8:
                r1 = 4
                goto L_0x0125
            L_0x00ab:
                int r10 = r9.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r11 = r11.f7900l
                int r11 = r10 - r11
                int r11 = java.lang.Math.abs(r11)
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.f7902m
                int r10 = r10 - r0
                int r10 = java.lang.Math.abs(r10)
                if (r11 >= r10) goto L_0x00a8
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r10 = r10.mo11256f1()
                if (r10 == 0) goto L_0x0125
                goto L_0x00a8
            L_0x00cd:
                int r10 = r9.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r11 = r11.f7875a
                if (r11 == 0) goto L_0x00f0
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r11 = r11.f7898k
                int r11 = r10 - r11
                int r11 = java.lang.Math.abs(r11)
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.f7902m
                int r10 = r10 - r0
                int r10 = java.lang.Math.abs(r10)
                if (r11 >= r10) goto L_0x00a8
                goto L_0x0010
            L_0x00f0:
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r11.f7900l
                if (r10 >= r0) goto L_0x010b
                int r11 = r11.f7902m
                int r11 = r10 - r11
                int r11 = java.lang.Math.abs(r11)
                if (r10 >= r11) goto L_0x0102
                goto L_0x0010
            L_0x0102:
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r10 = r10.mo11256f1()
                if (r10 == 0) goto L_0x0125
                goto L_0x00a8
            L_0x010b:
                int r11 = r10 - r0
                int r11 = java.lang.Math.abs(r11)
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.f7902m
                int r10 = r10 - r0
                int r10 = java.lang.Math.abs(r10)
                if (r11 >= r10) goto L_0x00a8
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r10 = r10.mo11256f1()
                if (r10 == 0) goto L_0x0125
                goto L_0x00a8
            L_0x0125:
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r11 = r10.mo11258g1()
                r10.mo11260h1(r9, r1, r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.C1501d.mo4131l(android.view.View, float, float):void");
        }

        /* renamed from: m */
        public boolean mo4132m(@mr2 View view, int i) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i2 = bottomSheetBehavior.f7904n;
            if (i2 == 1 || bottomSheetBehavior.f7913r) {
                return false;
            }
            if (i2 == 3 && bottomSheetBehavior.f7915t == i) {
                WeakReference<View> weakReference = bottomSheetBehavior.f7878b;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            this.f7924a = System.currentTimeMillis();
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.f7872a;
            return weakReference2 != null && weakReference2.get() == view;
        }

        /* renamed from: n */
        public final boolean mo11285n(@mr2 View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.f7914s + bottomSheetBehavior.mo11264k0()) / 2;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$e */
    public class C1502e implements C2018e2 {

        /* renamed from: a */
        public final /* synthetic */ int f7926a;

        public C1502e(int i) {
            this.f7926a = i;
        }

        /* renamed from: a */
        public boolean mo4110a(@mr2 View view, @ts2 C2018e2.C2019a aVar) {
            BottomSheetBehavior.this.mo11242Y0(this.f7926a);
            return true;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$f */
    public static abstract class C1503f {
        /* renamed from: a */
        public void mo11286a(@mr2 View view) {
        }

        /* renamed from: b */
        public abstract void mo7562b(@mr2 View view, float f);

        /* renamed from: c */
        public abstract void mo7563c(@mr2 View view, int i);
    }

    @hl3({hl3.C2354a.f13187b})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$g */
    public @interface C1504g {
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$h */
    public static class C1505h extends C2015e0 {
        public static final Parcelable.Creator<C1505h> CREATOR = new C1506a();

        /* renamed from: b */
        public boolean f7928b;

        /* renamed from: c */
        public boolean f7929c;

        /* renamed from: d */
        public boolean f7930d;

        /* renamed from: n */
        public final int f7931n;

        /* renamed from: o */
        public int f7932o;

        /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$h$a */
        public class C1506a implements Parcelable.ClassLoaderCreator<C1505h> {
            @ts2
            /* renamed from: a */
            public C1505h createFromParcel(@mr2 Parcel parcel) {
                return new C1505h(parcel, (ClassLoader) null);
            }

            @mr2
            /* renamed from: b */
            public C1505h createFromParcel(@mr2 Parcel parcel, ClassLoader classLoader) {
                return new C1505h(parcel, classLoader);
            }

            @mr2
            /* renamed from: c */
            public C1505h[] newArray(int i) {
                return new C1505h[i];
            }
        }

        public C1505h(@mr2 Parcel parcel) {
            this(parcel, (ClassLoader) null);
        }

        public C1505h(@mr2 Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f7931n = parcel.readInt();
            this.f7932o = parcel.readInt();
            boolean z = false;
            this.f7928b = parcel.readInt() == 1;
            this.f7929c = parcel.readInt() == 1;
            this.f7930d = parcel.readInt() == 1 ? true : z;
        }

        @Deprecated
        public C1505h(Parcelable parcelable, int i) {
            super(parcelable);
            this.f7931n = i;
        }

        public C1505h(Parcelable parcelable, @mr2 BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f7931n = bottomSheetBehavior.f7904n;
            this.f7932o = bottomSheetBehavior.f7877b;
            this.f7928b = bottomSheetBehavior.f7875a;
            this.f7929c = bottomSheetBehavior.f7903m;
            this.f7930d = bottomSheetBehavior.f7905n;
        }

        public void writeToParcel(@mr2 Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f7931n);
            parcel.writeInt(this.f7932o);
            parcel.writeInt(this.f7928b ? 1 : 0);
            parcel.writeInt(this.f7929c ? 1 : 0);
            parcel.writeInt(this.f7930d ? 1 : 0);
        }
    }

    @hl3({hl3.C2354a.f13187b})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$i */
    public @interface C1507i {
    }

    @hl3({hl3.C2354a.f13187b})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$j */
    public @interface C1508j {
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$k */
    public class C1509k {

        /* renamed from: a */
        public int f7933a;

        /* renamed from: a */
        public final Runnable f7935a;

        /* renamed from: a */
        public boolean f7936a;

        /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$k$a */
        public class C1510a implements Runnable {
            public C1510a() {
            }

            public void run() {
                boolean unused = C1509k.this.f7936a = false;
                mt4 mt4 = BottomSheetBehavior.this.f7870a;
                if (mt4 == null || !mt4.mo20663o(true)) {
                    C1509k kVar = C1509k.this;
                    BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                    if (bottomSheetBehavior.f7904n == 2) {
                        bottomSheetBehavior.mo11244Z0(kVar.f7933a);
                        return;
                    }
                    return;
                }
                C1509k kVar2 = C1509k.this;
                kVar2.mo11293c(kVar2.f7933a);
            }
        }

        public C1509k() {
            this.f7935a = new C1510a();
        }

        public /* synthetic */ C1509k(BottomSheetBehavior bottomSheetBehavior, C1498a aVar) {
            this();
        }

        /* renamed from: c */
        public void mo11293c(int i) {
            WeakReference<V> weakReference = BottomSheetBehavior.this.f7872a;
            if (weakReference != null && weakReference.get() != null) {
                this.f7933a = i;
                if (!this.f7936a) {
                    jt4.m18993p1((View) BottomSheetBehavior.this.f7872a.get(), this.f7935a);
                    this.f7936a = true;
                }
            }
        }
    }

    public BottomSheetBehavior() {
    }

    public BottomSheetBehavior(@mr2 Context context, @ts2 AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        this.f7884d = context.getResources().getDimensionPixelSize(fd3.C2156f.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fd3.C2165o.BottomSheetBehavior_Layout);
        int i2 = fd3.C2165o.BottomSheetBehavior_Layout_backgroundTint;
        if (obtainStyledAttributes.hasValue(i2)) {
            this.f7865a = af2.m38610a(context, obtainStyledAttributes, i2);
        }
        if (obtainStyledAttributes.hasValue(fd3.C2165o.BottomSheetBehavior_Layout_shapeAppearance)) {
            this.f7871a = uw3.m67447e(context, attributeSet, fd3.C2153c.bottomSheetStyle, f7854M).mo45845m();
        }
        mo11251d0(context);
        mo11253e0();
        this.f7880c = obtainStyledAttributes.getDimension(fd3.C2165o.BottomSheetBehavior_Layout_android_elevation, -1.0f);
        int i3 = fd3.C2165o.BottomSheetBehavior_Layout_android_maxWidth;
        if (obtainStyledAttributes.hasValue(i3)) {
            mo11235T0(obtainStyledAttributes.getDimensionPixelSize(i3, -1));
        }
        int i4 = fd3.C2165o.BottomSheetBehavior_Layout_android_maxHeight;
        if (obtainStyledAttributes.hasValue(i4)) {
            mo11234S0(obtainStyledAttributes.getDimensionPixelSize(i4, -1));
        }
        int i5 = fd3.C2165o.BottomSheetBehavior_Layout_behavior_peekHeight;
        TypedValue peekValue = obtainStyledAttributes.peekValue(i5);
        if (peekValue == null || (i = peekValue.data) != -1) {
            mo11236U0(obtainStyledAttributes.getDimensionPixelSize(i5, -1));
        } else {
            mo11236U0(i);
        }
        mo11232Q0(obtainStyledAttributes.getBoolean(fd3.C2165o.BottomSheetBehavior_Layout_behavior_hideable, false));
        mo11229N0(obtainStyledAttributes.getBoolean(fd3.C2165o.BottomSheetBehavior_Layout_gestureInsetBottomIgnored, false));
        mo11228M0(obtainStyledAttributes.getBoolean(fd3.C2165o.BottomSheetBehavior_Layout_behavior_fitToContents, true));
        mo11240X0(obtainStyledAttributes.getBoolean(fd3.C2165o.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        mo11226K0(obtainStyledAttributes.getBoolean(fd3.C2165o.BottomSheetBehavior_Layout_behavior_draggable, true));
        mo11238W0(obtainStyledAttributes.getInt(fd3.C2165o.BottomSheetBehavior_Layout_behavior_saveFlags, 0));
        mo11230O0(obtainStyledAttributes.getFloat(fd3.C2165o.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, 0.5f));
        int i6 = fd3.C2165o.BottomSheetBehavior_Layout_behavior_expandedOffset;
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(i6);
        mo11227L0((peekValue2 == null || peekValue2.type != 16) ? obtainStyledAttributes.getDimensionPixelOffset(i6, 0) : peekValue2.data);
        this.f7887e = obtainStyledAttributes.getBoolean(fd3.C2165o.BottomSheetBehavior_Layout_paddingBottomSystemWindowInsets, false);
        this.f7889f = obtainStyledAttributes.getBoolean(fd3.C2165o.BottomSheetBehavior_Layout_paddingLeftSystemWindowInsets, false);
        this.f7891g = obtainStyledAttributes.getBoolean(fd3.C2165o.BottomSheetBehavior_Layout_paddingRightSystemWindowInsets, false);
        this.f7893h = obtainStyledAttributes.getBoolean(fd3.C2165o.BottomSheetBehavior_Layout_paddingTopSystemWindowInsets, true);
        this.f7895i = obtainStyledAttributes.getBoolean(fd3.C2165o.BottomSheetBehavior_Layout_marginLeftSystemWindowInsets, false);
        this.f7897j = obtainStyledAttributes.getBoolean(fd3.C2165o.BottomSheetBehavior_Layout_marginRightSystemWindowInsets, false);
        this.f7899k = obtainStyledAttributes.getBoolean(fd3.C2165o.BottomSheetBehavior_Layout_marginTopSystemWindowInsets, false);
        obtainStyledAttributes.recycle();
        this.f7862a = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    @mr2
    /* renamed from: i0 */
    public static <V extends View> BottomSheetBehavior<V> m9579i0(@mr2 V v) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.C0459f) {
            CoordinatorLayout.Behavior f = ((CoordinatorLayout.C0459f) layoutParams).mo3676f();
            if (f instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) f;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    /* renamed from: A0 */
    public boolean mo11216A0() {
        return this.f7885d;
    }

    /* renamed from: B */
    public boolean mo3638B(@mr2 CoordinatorLayout coordinatorLayout, @mr2 V v, @mr2 View view, @mr2 View view2, int i, int i2) {
        this.f7908p = 0;
        this.f7911q = false;
        return (i & 2) != 0;
    }

    /* renamed from: B0 */
    public boolean mo11217B0() {
        return this.f7903m;
    }

    /* renamed from: C0 */
    public final boolean mo11218C0(V v) {
        ViewParent parent = v.getParent();
        return parent != null && parent.isLayoutRequested() && jt4.m18896O0(v);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0036, code lost:
        if (r4.getTop() <= r2.f7900l) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0065, code lost:
        if (java.lang.Math.abs(r3 - r2.f7898k) < java.lang.Math.abs(r3 - r2.f7902m)) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007b, code lost:
        if (mo11256f1() != false) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008b, code lost:
        if (java.lang.Math.abs(r3 - r1) < java.lang.Math.abs(r3 - r2.f7902m)) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a7, code lost:
        if (java.lang.Math.abs(r3 - r2.f7900l) < java.lang.Math.abs(r3 - r2.f7902m)) goto L_0x00a9;
     */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3640D(@com.onedelhi.secure.mr2 androidx.coordinatorlayout.widget.CoordinatorLayout r3, @com.onedelhi.secure.mr2 V r4, @com.onedelhi.secure.mr2 android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.mo11264k0()
            r0 = 3
            if (r3 != r6) goto L_0x000f
            r2.mo11244Z0(r0)
            return
        L_0x000f:
            boolean r3 = r2.mo11219D0()
            if (r3 == 0) goto L_0x0024
            java.lang.ref.WeakReference<android.view.View> r3 = r2.f7878b
            if (r3 == 0) goto L_0x0023
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto L_0x0023
            boolean r3 = r2.f7911q
            if (r3 != 0) goto L_0x0024
        L_0x0023:
            return
        L_0x0024:
            int r3 = r2.f7908p
            r5 = 6
            r6 = 4
            if (r3 <= 0) goto L_0x003a
            boolean r3 = r2.f7875a
            if (r3 == 0) goto L_0x0030
            goto L_0x00aa
        L_0x0030:
            int r3 = r4.getTop()
            int r6 = r2.f7900l
            if (r3 <= r6) goto L_0x00aa
            goto L_0x00a9
        L_0x003a:
            boolean r3 = r2.f7903m
            if (r3 == 0) goto L_0x004a
            float r3 = r2.mo11279x0()
            boolean r3 = r2.mo11254e1(r4, r3)
            if (r3 == 0) goto L_0x004a
            r0 = 5
            goto L_0x00aa
        L_0x004a:
            int r3 = r2.f7908p
            if (r3 != 0) goto L_0x008e
            int r3 = r4.getTop()
            boolean r1 = r2.f7875a
            if (r1 == 0) goto L_0x0068
            int r5 = r2.f7898k
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.f7902m
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L_0x0092
            goto L_0x00aa
        L_0x0068:
            int r1 = r2.f7900l
            if (r3 >= r1) goto L_0x007e
            int r1 = r2.f7902m
            int r1 = r3 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r3 >= r1) goto L_0x0077
            goto L_0x00aa
        L_0x0077:
            boolean r3 = r2.mo11256f1()
            if (r3 == 0) goto L_0x00a9
            goto L_0x0092
        L_0x007e:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.f7902m
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L_0x0092
            goto L_0x00a9
        L_0x008e:
            boolean r3 = r2.f7875a
            if (r3 == 0) goto L_0x0094
        L_0x0092:
            r0 = 4
            goto L_0x00aa
        L_0x0094:
            int r3 = r4.getTop()
            int r0 = r2.f7900l
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.f7902m
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L_0x0092
        L_0x00a9:
            r0 = 6
        L_0x00aa:
            r3 = 0
            r2.mo11260h1(r4, r0, r3)
            r2.f7911q = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo3640D(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    @hl3({hl3.C2354a.f13187b})
    /* renamed from: D0 */
    public boolean mo11219D0() {
        return true;
    }

    /* renamed from: E */
    public boolean mo3641E(@mr2 CoordinatorLayout coordinatorLayout, @mr2 V v, @mr2 MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f7904n == 1 && actionMasked == 0) {
            return true;
        }
        if (mo11252d1()) {
            this.f7870a.mo20636M(motionEvent);
        }
        if (actionMasked == 0) {
            mo11222G0();
        }
        if (this.f7866a == null) {
            this.f7866a = VelocityTracker.obtain();
        }
        this.f7866a.addMovement(motionEvent);
        if (mo11252d1() && actionMasked == 2 && !this.f7909p && Math.abs(((float) this.f7916u) - motionEvent.getY()) > ((float) this.f7870a.mo20628E())) {
            this.f7870a.mo20652d(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f7909p;
    }

    /* renamed from: E0 */
    public void mo11220E0(@mr2 C1503f fVar) {
        this.f7873a.remove(fVar);
    }

    /* renamed from: F0 */
    public final void mo11221F0(V v, C1638a2.C1639a aVar, int i) {
        jt4.m19013u1(v, aVar, (CharSequence) null, mo11249c0(i));
    }

    /* renamed from: G0 */
    public final void mo11222G0() {
        this.f7915t = -1;
        VelocityTracker velocityTracker = this.f7866a;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f7866a = null;
        }
    }

    /* renamed from: H0 */
    public final void mo11223H0(@mr2 C1505h hVar) {
        int i = this.f7863a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f7877b = hVar.f7932o;
            }
            if (i == -1 || (i & 2) == 2) {
                this.f7875a = hVar.f7928b;
            }
            if (i == -1 || (i & 4) == 4) {
                this.f7903m = hVar.f7929c;
            }
            if (i == -1 || (i & 8) == 8) {
                this.f7905n = hVar.f7930d;
            }
        }
    }

    /* renamed from: I0 */
    public final void mo11224I0(V v, Runnable runnable) {
        if (mo11218C0(v)) {
            v.post(runnable);
        } else {
            runnable.run();
        }
    }

    @Deprecated
    /* renamed from: J0 */
    public void mo11225J0(C1503f fVar) {
        Log.w(f7855a, "BottomSheetBehavior now supports multiple callbacks. `setBottomSheetCallback()` removes all existing callbacks, including ones set internally by library authors, which may result in unintended behavior. This may change in the future. Please use `addBottomSheetCallback()` and `removeBottomSheetCallback()` instead to set your own callbacks.");
        this.f7873a.clear();
        if (fVar != null) {
            this.f7873a.add(fVar);
        }
    }

    /* renamed from: K0 */
    public void mo11226K0(boolean z) {
        this.f7907o = z;
    }

    /* renamed from: L0 */
    public void mo11227L0(int i) {
        if (i >= 0) {
            this.f7896j = i;
            return;
        }
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    }

    /* renamed from: M0 */
    public void mo11228M0(boolean z) {
        if (this.f7875a != z) {
            this.f7875a = z;
            if (this.f7872a != null) {
                mo11243Z();
            }
            mo11244Z0((!this.f7875a || this.f7904n != 6) ? this.f7904n : 3);
            mo11261i1();
        }
    }

    /* renamed from: N0 */
    public void mo11229N0(boolean z) {
        this.f7885d = z;
    }

    /* renamed from: O0 */
    public void mo11230O0(@d81(from = 0.0d, fromInclusive = false, mo14561to = 1.0d, toInclusive = false) float f) {
        if (f <= 0.0f || f >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f7876b = f;
        if (this.f7872a != null) {
            mo11245a0();
        }
    }

    /* renamed from: P0 */
    public void mo11231P0(float f) {
        this.f7883d = f;
    }

    /* renamed from: Q0 */
    public void mo11232Q0(boolean z) {
        if (this.f7903m != z) {
            this.f7903m = z;
            if (!z && this.f7904n == 5) {
                mo11242Y0(4);
            }
            mo11261i1();
        }
    }

    @hl3({hl3.C2354a.f13187b})
    /* renamed from: R0 */
    public void mo11233R0(boolean z) {
        this.f7903m = z;
    }

    /* renamed from: S0 */
    public void mo11234S0(@e83 int i) {
        this.f7888f = i;
    }

    /* renamed from: T0 */
    public void mo11235T0(@e83 int i) {
        this.f7886e = i;
    }

    /* renamed from: U0 */
    public void mo11236U0(int i) {
        mo11237V0(i, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* renamed from: V0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11237V0(int r4, boolean r5) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = -1
            if (r4 != r2) goto L_0x000c
            boolean r4 = r3.f7882c
            if (r4 != 0) goto L_0x0015
            r3.f7882c = r0
            goto L_0x001f
        L_0x000c:
            boolean r2 = r3.f7882c
            if (r2 != 0) goto L_0x0017
            int r2 = r3.f7877b
            if (r2 == r4) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = 0
            goto L_0x001f
        L_0x0017:
            r3.f7882c = r1
            int r4 = java.lang.Math.max(r1, r4)
            r3.f7877b = r4
        L_0x001f:
            if (r0 == 0) goto L_0x0024
            r3.mo11267l1(r5)
        L_0x0024:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo11237V0(int, boolean):void");
    }

    /* renamed from: W0 */
    public void mo11238W0(int i) {
        this.f7863a = i;
    }

    /* renamed from: X */
    public final int mo11239X(V v, @e54 int i, int i2) {
        return jt4.m18939c(v, v.getResources().getString(i), mo11249c0(i2));
    }

    /* renamed from: X0 */
    public void mo11240X0(boolean z) {
        this.f7905n = z;
    }

    /* renamed from: Y */
    public void mo11241Y(@mr2 C1503f fVar) {
        if (!this.f7873a.contains(fVar)) {
            this.f7873a.add(fVar);
        }
    }

    /* renamed from: Y0 */
    public void mo11242Y0(int i) {
        if (i == 1 || i == 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("STATE_");
            sb.append(i == 1 ? "DRAGGING" : "SETTLING");
            sb.append(" should not be set externally.");
            throw new IllegalArgumentException(sb.toString());
        } else if (this.f7903m || i != 5) {
            int i2 = (i != 6 || !this.f7875a || mo11278w0(i) > this.f7898k) ? i : 3;
            WeakReference<V> weakReference = this.f7872a;
            if (weakReference == null || weakReference.get() == null) {
                mo11244Z0(i);
                return;
            }
            View view = (View) this.f7872a.get();
            mo11224I0(view, new C1498a(view, i2));
        } else {
            Log.w(f7855a, "Cannot set state: " + i);
        }
    }

    /* renamed from: Z */
    public final void mo11243Z() {
        int b0 = mo11247b0();
        if (this.f7875a) {
            this.f7902m = Math.max(this.f7914s - b0, this.f7898k);
        } else {
            this.f7902m = this.f7914s - b0;
        }
    }

    /* renamed from: Z0 */
    public void mo11244Z0(int i) {
        View view;
        if (this.f7904n != i) {
            this.f7904n = i;
            if (i == 4 || i == 3 || i == 6 || (this.f7903m && i == 5)) {
                this.f7906o = i;
            }
            WeakReference<V> weakReference = this.f7872a;
            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                if (i == 3) {
                    mo11265k1(true);
                } else if (i == 6 || i == 5 || i == 4) {
                    mo11265k1(false);
                }
                mo11263j1(i);
                for (int i2 = 0; i2 < this.f7873a.size(); i2++) {
                    this.f7873a.get(i2).mo7563c(view, i);
                }
                mo11261i1();
            }
        }
    }

    /* renamed from: a0 */
    public final void mo11245a0() {
        this.f7900l = (int) (((float) this.f7914s) * (1.0f - this.f7876b));
    }

    /* renamed from: a1 */
    public void mo11246a1(boolean z) {
        this.f7879b = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
        r0 = r3.f7890g;
     */
    /* renamed from: b0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo11247b0() {
        /*
            r3 = this;
            boolean r0 = r3.f7882c
            if (r0 == 0) goto L_0x001d
            int r0 = r3.f7881c
            int r1 = r3.f7914s
            int r2 = r3.f7912r
            int r2 = r2 * 9
            int r2 = r2 / 16
            int r1 = r1 - r2
            int r0 = java.lang.Math.max(r0, r1)
            int r1 = r3.f7910q
            int r0 = java.lang.Math.min(r0, r1)
            int r1 = r3.f7892h
            int r0 = r0 + r1
            return r0
        L_0x001d:
            boolean r0 = r3.f7885d
            if (r0 != 0) goto L_0x0033
            boolean r0 = r3.f7887e
            if (r0 != 0) goto L_0x0033
            int r0 = r3.f7890g
            if (r0 <= 0) goto L_0x0033
            int r1 = r3.f7877b
            int r2 = r3.f7884d
            int r0 = r0 + r2
            int r0 = java.lang.Math.max(r1, r0)
            return r0
        L_0x0033:
            int r0 = r3.f7877b
            int r1 = r3.f7892h
            int r0 = r0 + r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo11247b0():int");
    }

    /* renamed from: b1 */
    public final void mo11248b1(@mr2 View view) {
        boolean z = Build.VERSION.SDK_INT >= 29 && !mo11216A0() && !this.f7882c;
        if (this.f7887e || this.f7889f || this.f7891g || this.f7895i || this.f7897j || this.f7899k || z) {
            pv4.m61664d(view, new C1500c(z));
        }
    }

    /* renamed from: c0 */
    public final C2018e2 mo11249c0(int i) {
        return new C1502e(i);
    }

    @hl3({hl3.C2354a.f13187b})
    /* renamed from: c1 */
    public boolean mo11250c1(long j, @d81(from = 0.0d, mo14561to = 100.0d) float f) {
        return false;
    }

    /* renamed from: d0 */
    public final void mo11251d0(@mr2 Context context) {
        if (this.f7871a != null) {
            bf2 bf2 = new bf2(this.f7871a);
            this.f7868a = bf2;
            bf2.mo31599Z(context);
            ColorStateList colorStateList = this.f7865a;
            if (colorStateList != null) {
                this.f7868a.mo31626o0(colorStateList);
                return;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(16842801, typedValue, true);
            this.f7868a.setTint(typedValue.data);
        }
    }

    /* renamed from: d1 */
    public final boolean mo11252d1() {
        return this.f7870a != null && (this.f7907o || this.f7904n == 1);
    }

    /* renamed from: e0 */
    public final void mo11253e0() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f7864a = ofFloat;
        ofFloat.setDuration(500);
        this.f7864a.addUpdateListener(new C1499b());
    }

    /* renamed from: e1 */
    public boolean mo11254e1(@mr2 View view, float f) {
        if (this.f7905n) {
            return true;
        }
        if (view.getTop() < this.f7902m) {
            return false;
        }
        return Math.abs((((float) view.getTop()) + (f * this.f7883d)) - ((float) this.f7902m)) / ((float) mo11247b0()) > 0.5f;
    }

    @hw4
    @hl3({hl3.C2354a.f13187b})
    /* renamed from: f0 */
    public void mo11255f0() {
        this.f7864a = null;
    }

    @hl3({hl3.C2354a.f13187b})
    /* renamed from: f1 */
    public boolean mo11256f1() {
        return false;
    }

    /* renamed from: g0 */
    public void mo11257g0(int i) {
        float f;
        float f2;
        View view = (View) this.f7872a.get();
        if (view != null && !this.f7873a.isEmpty()) {
            int i2 = this.f7902m;
            if (i > i2 || i2 == mo11264k0()) {
                int i3 = this.f7902m;
                f = (float) (i3 - i);
                f2 = (float) (this.f7914s - i3);
            } else {
                int i4 = this.f7902m;
                f = (float) (i4 - i);
                f2 = (float) (i4 - mo11264k0());
            }
            float f3 = f / f2;
            for (int i5 = 0; i5 < this.f7873a.size(); i5++) {
                this.f7873a.get(i5).mo7562b(view, f3);
            }
        }
    }

    @hl3({hl3.C2354a.f13187b})
    /* renamed from: g1 */
    public boolean mo11258g1() {
        return true;
    }

    /* renamed from: h */
    public void mo3648h(@mr2 CoordinatorLayout.C0459f fVar) {
        super.mo3648h(fVar);
        this.f7872a = null;
        this.f7870a = null;
    }

    @hw4
    @ts2
    /* renamed from: h0 */
    public View mo11259h0(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (jt4.m18920W0(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View h0 = mo11259h0(viewGroup.getChildAt(i));
                if (h0 != null) {
                    return h0;
                }
            }
        }
        return null;
    }

    /* renamed from: h1 */
    public final void mo11260h1(View view, int i, boolean z) {
        int w0 = mo11278w0(i);
        mt4 mt4 = this.f7870a;
        if (mt4 != null && (!z ? mt4.mo20647X(view, view.getLeft(), w0) : mt4.mo20645V(view.getLeft(), w0))) {
            mo11244Z0(2);
            mo11263j1(i);
            this.f7867a.mo11293c(i);
            return;
        }
        mo11244Z0(i);
    }

    /* renamed from: i1 */
    public final void mo11261i1() {
        View view;
        C1638a2.C1639a aVar;
        WeakReference<V> weakReference = this.f7872a;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            jt4.m19001r1(view, 524288);
            jt4.m19001r1(view, 262144);
            jt4.m19001r1(view, 1048576);
            int i = this.f7917v;
            if (i != -1) {
                jt4.m19001r1(view, i);
            }
            int i2 = 6;
            if (!this.f7875a && this.f7904n != 6) {
                this.f7917v = mo11239X(view, fd3.C2163m.bottomsheet_action_expand_halfway, 6);
            }
            if (this.f7903m && this.f7904n != 5) {
                mo11221F0(view, C1638a2.C1639a.f8658u, 5);
            }
            int i3 = this.f7904n;
            if (i3 == 3) {
                if (this.f7875a) {
                    i2 = 4;
                }
                aVar = C1638a2.C1639a.f8657t;
            } else if (i3 == 4) {
                if (this.f7875a) {
                    i2 = 3;
                }
                aVar = C1638a2.C1639a.f8656s;
            } else if (i3 == 6) {
                mo11221F0(view, C1638a2.C1639a.f8657t, 4);
                mo11221F0(view, C1638a2.C1639a.f8656s, 3);
                return;
            } else {
                return;
            }
            mo11221F0(view, aVar, i2);
        }
    }

    /* renamed from: j0 */
    public final int mo11262j0(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    /* renamed from: j1 */
    public final void mo11263j1(int i) {
        ValueAnimator valueAnimator;
        if (i != 2) {
            boolean z = i == 3;
            if (this.f7901l != z) {
                this.f7901l = z;
                if (this.f7868a != null && (valueAnimator = this.f7864a) != null) {
                    if (valueAnimator.isRunning()) {
                        this.f7864a.reverse();
                        return;
                    }
                    float f = z ? 0.0f : 1.0f;
                    this.f7864a.setFloatValues(new float[]{1.0f - f, f});
                    this.f7864a.start();
                }
            }
        }
    }

    /* renamed from: k */
    public void mo3651k() {
        super.mo3651k();
        this.f7872a = null;
        this.f7870a = null;
    }

    /* renamed from: k0 */
    public int mo11264k0() {
        if (this.f7875a) {
            return this.f7898k;
        }
        return Math.max(this.f7896j, this.f7893h ? 0 : this.f7894i);
    }

    /* renamed from: k1 */
    public final void mo11265k1(boolean z) {
        Map<View, Integer> map;
        int intValue;
        WeakReference<V> weakReference = this.f7872a;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (z) {
                    if (this.f7874a == null) {
                        this.f7874a = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    if (childAt != this.f7872a.get()) {
                        if (z) {
                            this.f7874a.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                            if (this.f7879b) {
                                intValue = 4;
                            }
                        } else if (this.f7879b && (map = this.f7874a) != null && map.containsKey(childAt)) {
                            intValue = this.f7874a.get(childAt).intValue();
                        }
                        jt4.m18906R1(childAt, intValue);
                    }
                }
                if (!z) {
                    this.f7874a = null;
                } else if (this.f7879b) {
                    ((View) this.f7872a.get()).sendAccessibilityEvent(8);
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo3652l(@com.onedelhi.secure.mr2 androidx.coordinatorlayout.widget.CoordinatorLayout r10, @com.onedelhi.secure.mr2 V r11, @com.onedelhi.secure.mr2 android.view.MotionEvent r12) {
        /*
            r9 = this;
            boolean r0 = r11.isShown()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x00d2
            boolean r0 = r9.f7907o
            if (r0 != 0) goto L_0x000e
            goto L_0x00d2
        L_0x000e:
            int r0 = r12.getActionMasked()
            if (r0 != 0) goto L_0x0017
            r9.mo11222G0()
        L_0x0017:
            android.view.VelocityTracker r3 = r9.f7866a
            if (r3 != 0) goto L_0x0021
            android.view.VelocityTracker r3 = android.view.VelocityTracker.obtain()
            r9.f7866a = r3
        L_0x0021:
            android.view.VelocityTracker r3 = r9.f7866a
            r3.addMovement(r12)
            r3 = 0
            r4 = -1
            r5 = 2
            if (r0 == 0) goto L_0x003c
            if (r0 == r2) goto L_0x0031
            r11 = 3
            if (r0 == r11) goto L_0x0031
            goto L_0x007f
        L_0x0031:
            r9.f7913r = r1
            r9.f7915t = r4
            boolean r11 = r9.f7909p
            if (r11 == 0) goto L_0x007f
            r9.f7909p = r1
            return r1
        L_0x003c:
            float r6 = r12.getX()
            int r6 = (int) r6
            float r7 = r12.getY()
            int r7 = (int) r7
            r9.f7916u = r7
            int r7 = r9.f7904n
            if (r7 == r5) goto L_0x006e
            java.lang.ref.WeakReference<android.view.View> r7 = r9.f7878b
            if (r7 == 0) goto L_0x0057
            java.lang.Object r7 = r7.get()
            android.view.View r7 = (android.view.View) r7
            goto L_0x0058
        L_0x0057:
            r7 = r3
        L_0x0058:
            if (r7 == 0) goto L_0x006e
            int r8 = r9.f7916u
            boolean r7 = r10.mo3576G(r7, r6, r8)
            if (r7 == 0) goto L_0x006e
            int r7 = r12.getActionIndex()
            int r7 = r12.getPointerId(r7)
            r9.f7915t = r7
            r9.f7913r = r2
        L_0x006e:
            int r7 = r9.f7915t
            if (r7 != r4) goto L_0x007c
            int r4 = r9.f7916u
            boolean r11 = r10.mo3576G(r11, r6, r4)
            if (r11 != 0) goto L_0x007c
            r11 = 1
            goto L_0x007d
        L_0x007c:
            r11 = 0
        L_0x007d:
            r9.f7909p = r11
        L_0x007f:
            boolean r11 = r9.f7909p
            if (r11 != 0) goto L_0x008e
            com.onedelhi.secure.mt4 r11 = r9.f7870a
            if (r11 == 0) goto L_0x008e
            boolean r11 = r11.mo20646W(r12)
            if (r11 == 0) goto L_0x008e
            return r2
        L_0x008e:
            java.lang.ref.WeakReference<android.view.View> r11 = r9.f7878b
            if (r11 == 0) goto L_0x0099
            java.lang.Object r11 = r11.get()
            r3 = r11
            android.view.View r3 = (android.view.View) r3
        L_0x0099:
            if (r0 != r5) goto L_0x00d1
            if (r3 == 0) goto L_0x00d1
            boolean r11 = r9.f7909p
            if (r11 != 0) goto L_0x00d1
            int r11 = r9.f7904n
            if (r11 == r2) goto L_0x00d1
            float r11 = r12.getX()
            int r11 = (int) r11
            float r0 = r12.getY()
            int r0 = (int) r0
            boolean r10 = r10.mo3576G(r3, r11, r0)
            if (r10 != 0) goto L_0x00d1
            com.onedelhi.secure.mt4 r10 = r9.f7870a
            if (r10 == 0) goto L_0x00d1
            int r10 = r9.f7916u
            float r10 = (float) r10
            float r11 = r12.getY()
            float r10 = r10 - r11
            float r10 = java.lang.Math.abs(r10)
            com.onedelhi.secure.mt4 r11 = r9.f7870a
            int r11 = r11.mo20628E()
            float r11 = (float) r11
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 <= 0) goto L_0x00d1
            r1 = 1
        L_0x00d1:
            return r1
        L_0x00d2:
            r9.f7909p = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo3652l(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    @d81(from = 0.0d, mo14561to = 1.0d)
    /* renamed from: l0 */
    public float mo11266l0() {
        return this.f7876b;
    }

    /* renamed from: l1 */
    public final void mo11267l1(boolean z) {
        View view;
        if (this.f7872a != null) {
            mo11243Z();
            if (this.f7904n == 4 && (view = (View) this.f7872a.get()) != null) {
                if (z) {
                    mo11242Y0(4);
                } else {
                    view.requestLayout();
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x00f5 A[LOOP:0: B:56:0x00ed->B:58:0x00f5, LOOP_END] */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo3653m(@com.onedelhi.secure.mr2 androidx.coordinatorlayout.widget.CoordinatorLayout r7, @com.onedelhi.secure.mr2 V r8, int r9) {
        /*
            r6 = this;
            boolean r0 = com.onedelhi.secure.jt4.m18913U(r7)
            r1 = 1
            if (r0 == 0) goto L_0x0010
            boolean r0 = com.onedelhi.secure.jt4.m18913U(r8)
            if (r0 != 0) goto L_0x0010
            r8.setFitsSystemWindows(r1)
        L_0x0010:
            java.lang.ref.WeakReference<V> r0 = r6.f7872a
            r2 = 3
            r3 = 0
            if (r0 != 0) goto L_0x006c
            android.content.res.Resources r0 = r7.getResources()
            int r4 = com.onedelhi.secure.fd3.C2156f.design_bottom_sheet_peek_height_min
            int r0 = r0.getDimensionPixelSize(r4)
            r6.f7881c = r0
            r6.mo11248b1(r8)
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r8)
            r6.f7872a = r0
            com.onedelhi.secure.bf2 r0 = r6.f7868a
            if (r0 == 0) goto L_0x0059
            com.onedelhi.secure.jt4.m18877I1(r8, r0)
            com.onedelhi.secure.bf2 r0 = r6.f7868a
            float r4 = r6.f7880c
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 != 0) goto L_0x0041
            float r4 = com.onedelhi.secure.jt4.m18904R(r8)
        L_0x0041:
            r0.mo31624n0(r4)
            int r0 = r6.f7904n
            if (r0 != r2) goto L_0x004a
            r0 = 1
            goto L_0x004b
        L_0x004a:
            r0 = 0
        L_0x004b:
            r6.f7901l = r0
            com.onedelhi.secure.bf2 r4 = r6.f7868a
            if (r0 == 0) goto L_0x0053
            r0 = 0
            goto L_0x0055
        L_0x0053:
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x0055:
            r4.mo31629p0(r0)
            goto L_0x0060
        L_0x0059:
            android.content.res.ColorStateList r0 = r6.f7865a
            if (r0 == 0) goto L_0x0060
            com.onedelhi.secure.jt4.m18881J1(r8, r0)
        L_0x0060:
            r6.mo11261i1()
            int r0 = com.onedelhi.secure.jt4.m18916V(r8)
            if (r0 != 0) goto L_0x006c
            com.onedelhi.secure.jt4.m18906R1(r8, r1)
        L_0x006c:
            com.onedelhi.secure.mt4 r0 = r6.f7870a
            if (r0 != 0) goto L_0x0078
            com.onedelhi.secure.mt4$c r0 = r6.f7869a
            com.onedelhi.secure.mt4 r0 = com.onedelhi.secure.mt4.m21950q(r7, r0)
            r6.f7870a = r0
        L_0x0078:
            int r0 = r8.getTop()
            r7.mo3583N(r8, r9)
            int r9 = r7.getWidth()
            r6.f7912r = r9
            int r7 = r7.getHeight()
            r6.f7914s = r7
            int r7 = r8.getHeight()
            r6.f7910q = r7
            int r9 = r6.f7914s
            int r7 = r9 - r7
            int r4 = r6.f7894i
            if (r7 >= r4) goto L_0x00a4
            boolean r7 = r6.f7893h
            if (r7 == 0) goto L_0x00a0
            r6.f7910q = r9
            goto L_0x00a4
        L_0x00a0:
            int r7 = r9 - r4
            r6.f7910q = r7
        L_0x00a4:
            int r7 = r6.f7910q
            int r9 = r9 - r7
            int r7 = java.lang.Math.max(r3, r9)
            r6.f7898k = r7
            r6.mo11245a0()
            r6.mo11243Z()
            int r7 = r6.f7904n
            if (r7 != r2) goto L_0x00bf
            int r7 = r6.mo11264k0()
        L_0x00bb:
            com.onedelhi.secure.jt4.m18953f1(r8, r7)
            goto L_0x00e2
        L_0x00bf:
            r9 = 6
            if (r7 != r9) goto L_0x00c5
            int r7 = r6.f7900l
            goto L_0x00bb
        L_0x00c5:
            boolean r9 = r6.f7903m
            if (r9 == 0) goto L_0x00cf
            r9 = 5
            if (r7 != r9) goto L_0x00cf
            int r7 = r6.f7914s
            goto L_0x00bb
        L_0x00cf:
            r9 = 4
            if (r7 != r9) goto L_0x00d5
            int r7 = r6.f7902m
            goto L_0x00bb
        L_0x00d5:
            if (r7 == r1) goto L_0x00da
            r9 = 2
            if (r7 != r9) goto L_0x00e2
        L_0x00da:
            int r7 = r8.getTop()
            int r0 = r0 - r7
            com.onedelhi.secure.jt4.m18953f1(r8, r0)
        L_0x00e2:
            java.lang.ref.WeakReference r7 = new java.lang.ref.WeakReference
            android.view.View r9 = r6.mo11259h0(r8)
            r7.<init>(r9)
            r6.f7878b = r7
        L_0x00ed:
            java.util.ArrayList<com.google.android.material.bottomsheet.BottomSheetBehavior$f> r7 = r6.f7873a
            int r7 = r7.size()
            if (r3 >= r7) goto L_0x0103
            java.util.ArrayList<com.google.android.material.bottomsheet.BottomSheetBehavior$f> r7 = r6.f7873a
            java.lang.Object r7 = r7.get(r3)
            com.google.android.material.bottomsheet.BottomSheetBehavior$f r7 = (com.google.android.material.bottomsheet.BottomSheetBehavior.C1503f) r7
            r7.mo11286a(r8)
            int r3 = r3 + 1
            goto L_0x00ed
        L_0x0103:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo3653m(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int):boolean");
    }

    /* renamed from: m0 */
    public float mo11268m0() {
        return this.f7883d;
    }

    /* renamed from: n */
    public boolean mo3654n(@mr2 CoordinatorLayout coordinatorLayout, @mr2 V v, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
        v.measure(mo11262j0(i, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.f7886e, marginLayoutParams.width), mo11262j0(i3, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, this.f7888f, marginLayoutParams.height));
        return true;
    }

    @hl3({hl3.C2354a.f13187b})
    /* renamed from: n0 */
    public int mo11269n0() {
        return this.f7906o;
    }

    /* renamed from: o0 */
    public bf2 mo11270o0() {
        return this.f7868a;
    }

    /* renamed from: p */
    public boolean mo3656p(@mr2 CoordinatorLayout coordinatorLayout, @mr2 V v, @mr2 View view, float f, float f2) {
        WeakReference<View> weakReference;
        if (!mo11219D0() || (weakReference = this.f7878b) == null || view != weakReference.get()) {
            return false;
        }
        return this.f7904n != 3 || super.mo3656p(coordinatorLayout, v, view, f, f2);
    }

    @e83
    /* renamed from: p0 */
    public int mo11271p0() {
        return this.f7888f;
    }

    @e83
    /* renamed from: q0 */
    public int mo11272q0() {
        return this.f7886e;
    }

    /* renamed from: r */
    public void mo3658r(@mr2 CoordinatorLayout coordinatorLayout, @mr2 V v, @mr2 View view, int i, int i2, @mr2 int[] iArr, int i3) {
        int i4;
        if (i3 != 1) {
            WeakReference<View> weakReference = this.f7878b;
            View view2 = weakReference != null ? (View) weakReference.get() : null;
            if (!mo11219D0() || view == view2) {
                int top = v.getTop();
                int i5 = top - i2;
                if (i2 <= 0) {
                    if (i2 < 0 && !view.canScrollVertically(-1)) {
                        int i6 = this.f7902m;
                        if (i5 > i6 && !this.f7903m) {
                            iArr[1] = top - i6;
                            jt4.m18953f1(v, -iArr[1]);
                            i4 = 4;
                        } else if (this.f7907o) {
                            iArr[1] = i2;
                            jt4.m18953f1(v, -i2);
                            mo11244Z0(1);
                        } else {
                            return;
                        }
                    }
                    mo11257g0(v.getTop());
                    this.f7908p = i2;
                    this.f7911q = true;
                } else if (i5 < mo11264k0()) {
                    iArr[1] = top - mo11264k0();
                    jt4.m18953f1(v, -iArr[1]);
                    i4 = 3;
                } else if (this.f7907o) {
                    iArr[1] = i2;
                    jt4.m18953f1(v, -i2);
                    mo11244Z0(1);
                    mo11257g0(v.getTop());
                    this.f7908p = i2;
                    this.f7911q = true;
                } else {
                    return;
                }
                mo11244Z0(i4);
                mo11257g0(v.getTop());
                this.f7908p = i2;
                this.f7911q = true;
            }
        }
    }

    /* renamed from: r0 */
    public int mo11273r0() {
        if (this.f7882c) {
            return -1;
        }
        return this.f7877b;
    }

    @hw4
    /* renamed from: s0 */
    public int mo11274s0() {
        return this.f7881c;
    }

    /* renamed from: t0 */
    public int mo11275t0() {
        return this.f7863a;
    }

    /* renamed from: u */
    public void mo3661u(@mr2 CoordinatorLayout coordinatorLayout, @mr2 V v, @mr2 View view, int i, int i2, int i3, int i4, int i5, @mr2 int[] iArr) {
    }

    /* renamed from: u0 */
    public boolean mo11276u0() {
        return this.f7905n;
    }

    /* renamed from: v0 */
    public int mo11277v0() {
        return this.f7904n;
    }

    /* renamed from: w0 */
    public final int mo11278w0(int i) {
        if (i == 3) {
            return mo11264k0();
        }
        if (i == 4) {
            return this.f7902m;
        }
        if (i == 5) {
            return this.f7914s;
        }
        if (i == 6) {
            return this.f7900l;
        }
        throw new IllegalArgumentException("Invalid state to get top offset: " + i);
    }

    /* renamed from: x0 */
    public final float mo11279x0() {
        VelocityTracker velocityTracker = this.f7866a;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f7862a);
        return this.f7866a.getYVelocity(this.f7915t);
    }

    /* renamed from: y */
    public void mo3665y(@mr2 CoordinatorLayout coordinatorLayout, @mr2 V v, @mr2 Parcelable parcelable) {
        C1505h hVar = (C1505h) parcelable;
        super.mo3665y(coordinatorLayout, v, hVar.mo14959a());
        mo11223H0(hVar);
        int i = hVar.f7931n;
        if (i == 1 || i == 2) {
            i = 4;
        }
        this.f7904n = i;
        this.f7906o = i;
    }

    /* renamed from: y0 */
    public boolean mo11280y0() {
        return this.f7907o;
    }

    @mr2
    /* renamed from: z */
    public Parcelable mo3666z(@mr2 CoordinatorLayout coordinatorLayout, @mr2 V v) {
        return new C1505h(super.mo3666z(coordinatorLayout, v), (BottomSheetBehavior<?>) this);
    }

    /* renamed from: z0 */
    public boolean mo11281z0() {
        return this.f7875a;
    }
}
