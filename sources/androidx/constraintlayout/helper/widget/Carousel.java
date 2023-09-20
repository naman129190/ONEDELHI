package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.C0393b;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.C0426d;
import androidx.constraintlayout.widget.C0435e;
import com.onedelhi.secure.C5848jv;
import com.onedelhi.secure.sj3;
import java.util.ArrayList;
import java.util.Iterator;

public class Carousel extends MotionHelper {

    /* renamed from: B */
    public static final int f1853B = 1;

    /* renamed from: C */
    public static final int f1854C = 2;

    /* renamed from: d */
    public static final String f1855d = "Carousel";

    /* renamed from: f */
    public static final boolean f1856f = false;

    /* renamed from: A */
    public int f1857A = -1;

    /* renamed from: a */
    public C0378b f1858a = null;

    /* renamed from: a */
    public MotionLayout f1859a;

    /* renamed from: a */
    public Runnable f1860a = new C0376a();

    /* renamed from: a */
    public final ArrayList<View> f1861a = new ArrayList<>();

    /* renamed from: b */
    public float f1862b = 0.9f;

    /* renamed from: c */
    public float f1863c = 2.0f;

    /* renamed from: e */
    public boolean f1864e = false;

    /* renamed from: o */
    public int f1865o = 0;

    /* renamed from: p */
    public int f1866p = 0;

    /* renamed from: q */
    public int f1867q = -1;

    /* renamed from: r */
    public int f1868r = -1;

    /* renamed from: s */
    public int f1869s = -1;

    /* renamed from: t */
    public int f1870t = -1;

    /* renamed from: u */
    public int f1871u = -1;

    /* renamed from: v */
    public int f1872v = 0;

    /* renamed from: w */
    public int f1873w = 4;

    /* renamed from: x */
    public int f1874x = 1;

    /* renamed from: y */
    public int f1875y = -1;

    /* renamed from: z */
    public int f1876z = 200;

    /* renamed from: androidx.constraintlayout.helper.widget.Carousel$a */
    public class C0376a implements Runnable {

        /* renamed from: androidx.constraintlayout.helper.widget.Carousel$a$a */
        public class C0377a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ float f1878a;

            public C0377a(float f) {
                this.f1878a = f;
            }

            public void run() {
                Carousel.this.f1859a.mo2754X0(5, 1.0f, this.f1878a);
            }
        }

        public C0376a() {
        }

        public void run() {
            Carousel.this.f1859a.setProgress(0.0f);
            Carousel.this.mo2644Z();
            Carousel.this.f1858a.mo2656b(Carousel.this.f1866p);
            float velocity = Carousel.this.f1859a.getVelocity();
            if (Carousel.this.f1874x == 2 && velocity > Carousel.this.f1863c && Carousel.this.f1866p < Carousel.this.f1858a.count() - 1) {
                float Q = velocity * Carousel.this.f1862b;
                if (Carousel.this.f1866p == 0 && Carousel.this.f1865o > Carousel.this.f1866p) {
                    return;
                }
                if (Carousel.this.f1866p != Carousel.this.f1858a.count() - 1 || Carousel.this.f1865o >= Carousel.this.f1866p) {
                    Carousel.this.f1859a.post(new C0377a(Q));
                }
            }
        }
    }

    /* renamed from: androidx.constraintlayout.helper.widget.Carousel$b */
    public interface C0378b {
        /* renamed from: a */
        void mo2655a(View view, int i);

        /* renamed from: b */
        void mo2656b(int i);

        int count();
    }

    public Carousel(Context context) {
        super(context);
    }

    public Carousel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo2640U(context, attributeSet);
    }

    public Carousel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo2640U(context, attributeSet);
    }

    /* access modifiers changed from: private */
    /* renamed from: W */
    public /* synthetic */ void m2622W() {
        int i;
        MotionLayout motionLayout;
        this.f1859a.setTransitionDuration(this.f1876z);
        if (this.f1875y < this.f1866p) {
            motionLayout = this.f1859a;
            i = this.f1870t;
        } else {
            motionLayout = this.f1859a;
            i = this.f1871u;
        }
        motionLayout.mo2760d1(i, this.f1876z);
    }

    /* renamed from: S */
    public final void mo2638S(boolean z) {
        Iterator<C0393b.C0395b> it = this.f1859a.getDefinedTransitions().iterator();
        while (it.hasNext()) {
            it.next().mo2966Q(z);
        }
    }

    /* renamed from: T */
    public final boolean mo2639T(int i, boolean z) {
        MotionLayout motionLayout;
        C0393b.C0395b D0;
        if (i == -1 || (motionLayout = this.f1859a) == null || (D0 = motionLayout.mo2734D0(i)) == null || z == D0.mo2960K()) {
            return false;
        }
        D0.mo2966Q(z);
        return true;
    }

    /* renamed from: U */
    public final void mo2640U(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0435e.C0448m.Carousel);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0435e.C0448m.Carousel_carousel_firstView) {
                    this.f1867q = obtainStyledAttributes.getResourceId(index, this.f1867q);
                } else if (index == C0435e.C0448m.Carousel_carousel_backwardTransition) {
                    this.f1868r = obtainStyledAttributes.getResourceId(index, this.f1868r);
                } else if (index == C0435e.C0448m.Carousel_carousel_forwardTransition) {
                    this.f1869s = obtainStyledAttributes.getResourceId(index, this.f1869s);
                } else if (index == C0435e.C0448m.Carousel_carousel_emptyViewsBehavior) {
                    this.f1873w = obtainStyledAttributes.getInt(index, this.f1873w);
                } else if (index == C0435e.C0448m.Carousel_carousel_previousState) {
                    this.f1870t = obtainStyledAttributes.getResourceId(index, this.f1870t);
                } else if (index == C0435e.C0448m.Carousel_carousel_nextState) {
                    this.f1871u = obtainStyledAttributes.getResourceId(index, this.f1871u);
                } else if (index == C0435e.C0448m.Carousel_carousel_touchUp_dampeningFactor) {
                    this.f1862b = obtainStyledAttributes.getFloat(index, this.f1862b);
                } else if (index == C0435e.C0448m.Carousel_carousel_touchUpMode) {
                    this.f1874x = obtainStyledAttributes.getInt(index, this.f1874x);
                } else if (index == C0435e.C0448m.Carousel_carousel_touchUp_velocityThreshold) {
                    this.f1863c = obtainStyledAttributes.getFloat(index, this.f1863c);
                } else if (index == C0435e.C0448m.Carousel_carousel_infinite) {
                    this.f1864e = obtainStyledAttributes.getBoolean(index, this.f1864e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: V */
    public void mo2641V(int i) {
        this.f1866p = Math.max(0, Math.min(getCount() - 1, i));
        mo2642X();
    }

    /* renamed from: X */
    public void mo2642X() {
        int size = this.f1861a.size();
        for (int i = 0; i < size; i++) {
            View view = this.f1861a.get(i);
            if (this.f1858a.count() == 0) {
                mo2646b0(view, this.f1873w);
            } else {
                mo2646b0(view, 0);
            }
        }
        this.f1859a.mo2748R0();
        mo2644Z();
    }

    /* renamed from: Y */
    public void mo2643Y(int i, int i2) {
        int i3;
        MotionLayout motionLayout;
        this.f1875y = Math.max(0, Math.min(getCount() - 1, i));
        int max = Math.max(0, i2);
        this.f1876z = max;
        this.f1859a.setTransitionDuration(max);
        if (i < this.f1866p) {
            motionLayout = this.f1859a;
            i3 = this.f1870t;
        } else {
            motionLayout = this.f1859a;
            i3 = this.f1871u;
        }
        motionLayout.mo2760d1(i3, this.f1876z);
    }

    /* renamed from: Z */
    public final void mo2644Z() {
        C0378b bVar = this.f1858a;
        if (bVar != null && this.f1859a != null && bVar.count() != 0) {
            int size = this.f1861a.size();
            for (int i = 0; i < size; i++) {
                View view = this.f1861a.get(i);
                int i2 = (this.f1866p + i) - this.f1872v;
                if (this.f1864e) {
                    if (i2 < 0) {
                        int i3 = this.f1873w;
                        if (i3 != 4) {
                            mo2646b0(view, i3);
                        } else {
                            mo2646b0(view, 0);
                        }
                        if (i2 % this.f1858a.count() == 0) {
                            this.f1858a.mo2655a(view, 0);
                        } else {
                            C0378b bVar2 = this.f1858a;
                            bVar2.mo2655a(view, bVar2.count() + (i2 % this.f1858a.count()));
                        }
                    } else if (i2 >= this.f1858a.count()) {
                        if (i2 == this.f1858a.count()) {
                            i2 = 0;
                        } else if (i2 > this.f1858a.count()) {
                            i2 %= this.f1858a.count();
                        }
                        int i4 = this.f1873w;
                        if (i4 != 4) {
                            mo2646b0(view, i4);
                            this.f1858a.mo2655a(view, i2);
                        }
                    }
                } else if (i2 < 0 || i2 >= this.f1858a.count()) {
                    mo2646b0(view, this.f1873w);
                }
                mo2646b0(view, 0);
                this.f1858a.mo2655a(view, i2);
            }
            int i5 = this.f1875y;
            if (i5 != -1 && i5 != this.f1866p) {
                this.f1859a.post(new C5848jv(this));
            } else if (i5 == this.f1866p) {
                this.f1875y = -1;
            }
            if (this.f1868r == -1 || this.f1869s == -1) {
                Log.w(f1855d, "No backward or forward transitions defined for Carousel!");
            } else if (!this.f1864e) {
                int count = this.f1858a.count();
                if (this.f1866p == 0) {
                    mo2639T(this.f1868r, false);
                } else {
                    mo2639T(this.f1868r, true);
                    this.f1859a.setTransition(this.f1868r);
                }
                if (this.f1866p == count - 1) {
                    mo2639T(this.f1869s, false);
                    return;
                }
                mo2639T(this.f1869s, true);
                this.f1859a.setTransition(this.f1869s);
            }
        }
    }

    /* renamed from: a0 */
    public final boolean mo2645a0(int i, View view, int i2) {
        C0426d.C0427a k0;
        C0426d z0 = this.f1859a.mo2833z0(i);
        if (z0 == null || (k0 = z0.mo3455k0(view.getId())) == null) {
            return false;
        }
        k0.f2906a.f3098b = 1;
        view.setVisibility(i2);
        return true;
    }

    /* renamed from: b0 */
    public final boolean mo2646b0(View view, int i) {
        MotionLayout motionLayout = this.f1859a;
        if (motionLayout == null) {
            return false;
        }
        int[] constraintSetIds = motionLayout.getConstraintSetIds();
        boolean z = false;
        for (int a0 : constraintSetIds) {
            z |= mo2645a0(a0, view, i);
        }
        return z;
    }

    public int getCount() {
        C0378b bVar = this.f1858a;
        if (bVar != null) {
            return bVar.count();
        }
        return 0;
    }

    public int getCurrentIndex() {
        return this.f1866p;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0019  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2649i(androidx.constraintlayout.motion.widget.MotionLayout r2, int r3) {
        /*
            r1 = this;
            int r2 = r1.f1866p
            r1.f1865o = r2
            int r0 = r1.f1871u
            if (r3 != r0) goto L_0x000d
            int r2 = r2 + 1
        L_0x000a:
            r1.f1866p = r2
            goto L_0x0014
        L_0x000d:
            int r0 = r1.f1870t
            if (r3 != r0) goto L_0x0014
            int r2 = r2 + -1
            goto L_0x000a
        L_0x0014:
            boolean r2 = r1.f1864e
            r3 = 0
            if (r2 == 0) goto L_0x0034
            int r2 = r1.f1866p
            androidx.constraintlayout.helper.widget.Carousel$b r0 = r1.f1858a
            int r0 = r0.count()
            if (r2 < r0) goto L_0x0025
            r1.f1866p = r3
        L_0x0025:
            int r2 = r1.f1866p
            if (r2 >= 0) goto L_0x004e
            androidx.constraintlayout.helper.widget.Carousel$b r2 = r1.f1858a
            int r2 = r2.count()
            int r2 = r2 + -1
            r1.f1866p = r2
            goto L_0x004e
        L_0x0034:
            int r2 = r1.f1866p
            androidx.constraintlayout.helper.widget.Carousel$b r0 = r1.f1858a
            int r0 = r0.count()
            if (r2 < r0) goto L_0x0048
            androidx.constraintlayout.helper.widget.Carousel$b r2 = r1.f1858a
            int r2 = r2.count()
            int r2 = r2 + -1
            r1.f1866p = r2
        L_0x0048:
            int r2 = r1.f1866p
            if (r2 >= 0) goto L_0x004e
            r1.f1866p = r3
        L_0x004e:
            int r2 = r1.f1865o
            int r3 = r1.f1866p
            if (r2 == r3) goto L_0x005b
            androidx.constraintlayout.motion.widget.MotionLayout r2 = r1.f1859a
            java.lang.Runnable r3 = r1.f1860a
            r2.post(r3)
        L_0x005b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.helper.widget.Carousel.mo2649i(androidx.constraintlayout.motion.widget.MotionLayout, int):void");
    }

    /* renamed from: j */
    public void mo2650j(MotionLayout motionLayout, int i, int i2, float f) {
        this.f1857A = i;
    }

    @sj3(api = 17)
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getParent() instanceof MotionLayout) {
            MotionLayout motionLayout = (MotionLayout) getParent();
            for (int i = 0; i < this.f2467n; i++) {
                int i2 = this.f2462a[i];
                View t = motionLayout.mo3248t(i2);
                if (this.f1867q == i2) {
                    this.f1872v = i;
                }
                this.f1861a.add(t);
            }
            this.f1859a = motionLayout;
            if (this.f1874x == 2) {
                C0393b.C0395b D0 = motionLayout.mo2734D0(this.f1869s);
                if (D0 != null) {
                    D0.mo2970U(5);
                }
                C0393b.C0395b D02 = this.f1859a.mo2734D0(this.f1868r);
                if (D02 != null) {
                    D02.mo2970U(5);
                }
            }
            mo2644Z();
        }
    }

    public void setAdapter(C0378b bVar) {
        this.f1858a = bVar;
    }
}
