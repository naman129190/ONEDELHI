package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.onedelhi.secure.C1638a2;
import com.onedelhi.secure.C2018e2;
import com.onedelhi.secure.hw4;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.mt4;
import com.onedelhi.secure.ts2;

public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: b */
    public static final int f7741b = 0;

    /* renamed from: c */
    public static final int f7742c = 1;

    /* renamed from: d */
    public static final int f7743d = 2;

    /* renamed from: e */
    public static final float f7744e = 0.5f;

    /* renamed from: e */
    public static final int f7745e = 0;

    /* renamed from: f */
    public static final float f7746f = 0.0f;

    /* renamed from: f */
    public static final int f7747f = 1;

    /* renamed from: g */
    public static final float f7748g = 0.5f;

    /* renamed from: g */
    public static final int f7749g = 2;

    /* renamed from: a */
    public float f7750a = 0.0f;

    /* renamed from: a */
    public int f7751a = 2;

    /* renamed from: a */
    public C1475c f7752a;

    /* renamed from: a */
    public final mt4.C2888c f7753a = new C1473a();

    /* renamed from: a */
    public mt4 f7754a;

    /* renamed from: a */
    public boolean f7755a;

    /* renamed from: b */
    public float f7756b = 0.5f;

    /* renamed from: b */
    public boolean f7757b;

    /* renamed from: c */
    public float f7758c = 0.0f;

    /* renamed from: d */
    public float f7759d = 0.5f;

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$a */
    public class C1473a extends mt4.C2888c {

        /* renamed from: c */
        public static final int f7760c = -1;

        /* renamed from: a */
        public int f7761a;

        /* renamed from: b */
        public int f7763b = -1;

        public C1473a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
            if (r5 != false) goto L_0x001c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
            if (r5 != false) goto L_0x0012;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
            r5 = r2.f7761a;
            r3 = r3.getWidth() + r5;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo4122a(@com.onedelhi.secure.mr2 android.view.View r3, int r4, int r5) {
            /*
                r2 = this;
                int r5 = com.onedelhi.secure.jt4.m18928Z(r3)
                r0 = 1
                if (r5 != r0) goto L_0x0009
                r5 = 1
                goto L_0x000a
            L_0x0009:
                r5 = 0
            L_0x000a:
                com.google.android.material.behavior.SwipeDismissBehavior r1 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r1 = r1.f7751a
                if (r1 != 0) goto L_0x0024
                if (r5 == 0) goto L_0x001c
            L_0x0012:
                int r5 = r2.f7761a
                int r3 = r3.getWidth()
                int r5 = r5 - r3
                int r3 = r2.f7761a
                goto L_0x0037
            L_0x001c:
                int r5 = r2.f7761a
                int r3 = r3.getWidth()
                int r3 = r3 + r5
                goto L_0x0037
            L_0x0024:
                if (r1 != r0) goto L_0x0029
                if (r5 == 0) goto L_0x0012
                goto L_0x001c
            L_0x0029:
                int r5 = r2.f7761a
                int r0 = r3.getWidth()
                int r5 = r5 - r0
                int r0 = r2.f7761a
                int r3 = r3.getWidth()
                int r3 = r3 + r0
            L_0x0037:
                int r3 = com.google.android.material.behavior.SwipeDismissBehavior.m9437I(r5, r4, r3)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.C1473a.mo4122a(android.view.View, int, int):int");
        }

        /* renamed from: b */
        public int mo4123b(@mr2 View view, int i, int i2) {
            return view.getTop();
        }

        /* renamed from: d */
        public int mo4124d(@mr2 View view) {
            return view.getWidth();
        }

        /* renamed from: i */
        public void mo4128i(@mr2 View view, int i) {
            this.f7763b = i;
            this.f7761a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        /* renamed from: j */
        public void mo4129j(int i) {
            C1475c cVar = SwipeDismissBehavior.this.f7752a;
            if (cVar != null) {
                cVar.mo11112b(i);
            }
        }

        /* renamed from: k */
        public void mo4130k(@mr2 View view, int i, int i2, int i3, int i4) {
            float width = ((float) this.f7761a) + (((float) view.getWidth()) * SwipeDismissBehavior.this.f7758c);
            float width2 = ((float) this.f7761a) + (((float) view.getWidth()) * SwipeDismissBehavior.this.f7759d);
            float f = (float) i;
            if (f <= width) {
                view.setAlpha(1.0f);
            } else if (f >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.m9436H(0.0f, 1.0f - SwipeDismissBehavior.m9438K(width, width2, f), 1.0f));
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
            r4 = r3.getLeft();
            r0 = r2.f7761a;
         */
        /* renamed from: l */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo4131l(@com.onedelhi.secure.mr2 android.view.View r3, float r4, float r5) {
            /*
                r2 = this;
                r5 = -1
                r2.f7763b = r5
                int r5 = r3.getWidth()
                boolean r0 = r2.mo11110n(r3, r4)
                if (r0 == 0) goto L_0x0023
                r0 = 0
                int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r4 < 0) goto L_0x001d
                int r4 = r3.getLeft()
                int r0 = r2.f7761a
                if (r4 >= r0) goto L_0x001b
                goto L_0x001d
            L_0x001b:
                int r0 = r0 + r5
                goto L_0x0021
            L_0x001d:
                int r4 = r2.f7761a
                int r0 = r4 - r5
            L_0x0021:
                r4 = 1
                goto L_0x0026
            L_0x0023:
                int r0 = r2.f7761a
                r4 = 0
            L_0x0026:
                com.google.android.material.behavior.SwipeDismissBehavior r5 = com.google.android.material.behavior.SwipeDismissBehavior.this
                com.onedelhi.secure.mt4 r5 = r5.f7754a
                int r1 = r3.getTop()
                boolean r5 = r5.mo20645V(r0, r1)
                if (r5 == 0) goto L_0x003f
                com.google.android.material.behavior.SwipeDismissBehavior$d r5 = new com.google.android.material.behavior.SwipeDismissBehavior$d
                com.google.android.material.behavior.SwipeDismissBehavior r0 = com.google.android.material.behavior.SwipeDismissBehavior.this
                r5.<init>(r3, r4)
                com.onedelhi.secure.jt4.m18993p1(r3, r5)
                goto L_0x004a
            L_0x003f:
                if (r4 == 0) goto L_0x004a
                com.google.android.material.behavior.SwipeDismissBehavior r4 = com.google.android.material.behavior.SwipeDismissBehavior.this
                com.google.android.material.behavior.SwipeDismissBehavior$c r4 = r4.f7752a
                if (r4 == 0) goto L_0x004a
                r4.mo11111a(r3)
            L_0x004a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.C1473a.mo4131l(android.view.View, float, float):void");
        }

        /* renamed from: m */
        public boolean mo4132m(View view, int i) {
            int i2 = this.f7763b;
            return (i2 == -1 || i2 == i) && SwipeDismissBehavior.this.mo11099G(view);
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0023 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0030 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* renamed from: n */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo11110n(@com.onedelhi.secure.mr2 android.view.View r7, float r8) {
            /*
                r6 = this;
                r0 = 0
                r1 = 0
                r2 = 1
                int r3 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r3 == 0) goto L_0x0032
                int r7 = com.onedelhi.secure.jt4.m18928Z(r7)
                if (r7 != r2) goto L_0x000f
                r7 = 1
                goto L_0x0010
            L_0x000f:
                r7 = 0
            L_0x0010:
                com.google.android.material.behavior.SwipeDismissBehavior r4 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r4 = r4.f7751a
                r5 = 2
                if (r4 != r5) goto L_0x0018
                return r2
            L_0x0018:
                if (r4 != 0) goto L_0x0025
                if (r7 == 0) goto L_0x0021
                int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r7 >= 0) goto L_0x0024
                goto L_0x0023
            L_0x0021:
                if (r3 <= 0) goto L_0x0024
            L_0x0023:
                r1 = 1
            L_0x0024:
                return r1
            L_0x0025:
                if (r4 != r2) goto L_0x0031
                if (r7 == 0) goto L_0x002c
                if (r3 <= 0) goto L_0x0031
                goto L_0x0030
            L_0x002c:
                int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r7 >= 0) goto L_0x0031
            L_0x0030:
                r1 = 1
            L_0x0031:
                return r1
            L_0x0032:
                int r8 = r7.getLeft()
                int r0 = r6.f7761a
                int r8 = r8 - r0
                int r7 = r7.getWidth()
                float r7 = (float) r7
                com.google.android.material.behavior.SwipeDismissBehavior r0 = com.google.android.material.behavior.SwipeDismissBehavior.this
                float r0 = r0.f7756b
                float r7 = r7 * r0
                int r7 = java.lang.Math.round(r7)
                int r8 = java.lang.Math.abs(r8)
                if (r8 < r7) goto L_0x004f
                r1 = 1
            L_0x004f:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.C1473a.mo11110n(android.view.View, float):boolean");
        }
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$b */
    public class C1474b implements C2018e2 {
        public C1474b() {
        }

        /* renamed from: a */
        public boolean mo4110a(@mr2 View view, @ts2 C2018e2.C2019a aVar) {
            boolean z = false;
            if (!SwipeDismissBehavior.this.mo11099G(view)) {
                return false;
            }
            boolean z2 = jt4.m18928Z(view) == 1;
            int i = SwipeDismissBehavior.this.f7751a;
            if ((i == 0 && z2) || (i == 1 && !z2)) {
                z = true;
            }
            int width = view.getWidth();
            if (z) {
                width = -width;
            }
            jt4.m18949e1(view, width);
            view.setAlpha(0.0f);
            C1475c cVar = SwipeDismissBehavior.this.f7752a;
            if (cVar != null) {
                cVar.mo11111a(view);
            }
            return true;
        }
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$c */
    public interface C1475c {
        /* renamed from: a */
        void mo11111a(View view);

        /* renamed from: b */
        void mo11112b(int i);
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$d */
    public class C1476d implements Runnable {

        /* renamed from: a */
        public final View f7765a;

        /* renamed from: b */
        public final boolean f7767b;

        public C1476d(View view, boolean z) {
            this.f7765a = view;
            this.f7767b = z;
        }

        public void run() {
            C1475c cVar;
            mt4 mt4 = SwipeDismissBehavior.this.f7754a;
            if (mt4 != null && mt4.mo20663o(true)) {
                jt4.m18993p1(this.f7765a, this);
            } else if (this.f7767b && (cVar = SwipeDismissBehavior.this.f7752a) != null) {
                cVar.mo11111a(this.f7765a);
            }
        }
    }

    /* renamed from: H */
    public static float m9436H(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    /* renamed from: I */
    public static int m9437I(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    /* renamed from: K */
    public static float m9438K(float f, float f2, float f3) {
        return (f3 - f) / (f2 - f);
    }

    /* renamed from: E */
    public boolean mo3641E(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        mt4 mt4 = this.f7754a;
        if (mt4 == null) {
            return false;
        }
        mt4.mo20636M(motionEvent);
        return true;
    }

    /* renamed from: G */
    public boolean mo11099G(@mr2 View view) {
        return true;
    }

    /* renamed from: J */
    public final void mo11100J(ViewGroup viewGroup) {
        if (this.f7754a == null) {
            this.f7754a = this.f7757b ? mt4.m21949p(viewGroup, this.f7750a, this.f7753a) : mt4.m21950q(viewGroup, this.f7753a);
        }
    }

    /* renamed from: L */
    public int mo11101L() {
        mt4 mt4 = this.f7754a;
        if (mt4 != null) {
            return mt4.mo20629F();
        }
        return 0;
    }

    @hw4
    @ts2
    /* renamed from: M */
    public C1475c mo11102M() {
        return this.f7752a;
    }

    /* renamed from: N */
    public void mo11103N(float f) {
        this.f7756b = m9436H(0.0f, f, 1.0f);
    }

    /* renamed from: O */
    public void mo11104O(float f) {
        this.f7759d = m9436H(0.0f, f, 1.0f);
    }

    /* renamed from: P */
    public void mo11105P(@ts2 C1475c cVar) {
        this.f7752a = cVar;
    }

    /* renamed from: Q */
    public void mo11106Q(float f) {
        this.f7750a = f;
        this.f7757b = true;
    }

    /* renamed from: R */
    public void mo11107R(float f) {
        this.f7758c = m9436H(0.0f, f, 1.0f);
    }

    /* renamed from: S */
    public void mo11108S(int i) {
        this.f7751a = i;
    }

    /* renamed from: T */
    public final void mo11109T(View view) {
        jt4.m19001r1(view, 1048576);
        if (mo11099G(view)) {
            jt4.m19013u1(view, C1638a2.C1639a.f8658u, (CharSequence) null, new C1474b());
        }
    }

    /* renamed from: l */
    public boolean mo3652l(@mr2 CoordinatorLayout coordinatorLayout, @mr2 V v, @mr2 MotionEvent motionEvent) {
        boolean z = this.f7755a;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.mo3576G(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f7755a = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f7755a = false;
        }
        if (!z) {
            return false;
        }
        mo11100J(coordinatorLayout);
        return this.f7754a.mo20646W(motionEvent);
    }

    /* renamed from: m */
    public boolean mo3653m(@mr2 CoordinatorLayout coordinatorLayout, @mr2 V v, int i) {
        boolean m = super.mo3653m(coordinatorLayout, v, i);
        if (jt4.m18916V(v) == 0) {
            jt4.m18906R1(v, 1);
            mo11109T(v);
        }
        return m;
    }
}
