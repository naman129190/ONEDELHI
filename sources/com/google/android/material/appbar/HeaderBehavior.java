package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.rf2;
import com.onedelhi.secure.ts2;

abstract class HeaderBehavior<V extends View> extends ViewOffsetBehavior<V> {

    /* renamed from: f */
    public static final int f7706f = -1;
    @ts2

    /* renamed from: a */
    public VelocityTracker f7707a;

    /* renamed from: a */
    public OverScroller f7708a;
    @ts2

    /* renamed from: a */
    public Runnable f7709a;

    /* renamed from: a */
    public boolean f7710a;

    /* renamed from: c */
    public int f7711c = -1;

    /* renamed from: d */
    public int f7712d;

    /* renamed from: e */
    public int f7713e = -1;

    /* renamed from: com.google.android.material.appbar.HeaderBehavior$a */
    public class C1469a implements Runnable {

        /* renamed from: a */
        public final V f7714a;

        /* renamed from: a */
        public final CoordinatorLayout f7715a;

        public C1469a(CoordinatorLayout coordinatorLayout, V v) {
            this.f7715a = coordinatorLayout;
            this.f7714a = v;
        }

        public void run() {
            OverScroller overScroller;
            if (this.f7714a != null && (overScroller = HeaderBehavior.this.f7708a) != null) {
                if (overScroller.computeScrollOffset()) {
                    HeaderBehavior headerBehavior = HeaderBehavior.this;
                    headerBehavior.mo11058X(this.f7715a, this.f7714a, headerBehavior.f7708a.getCurrY());
                    jt4.m18993p1(this.f7714a, this);
                    return;
                }
                HeaderBehavior.this.mo10892V(this.f7715a, this.f7714a);
            }
        }
    }

    public HeaderBehavior() {
    }

    public HeaderBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008c A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo3641E(@com.onedelhi.secure.mr2 androidx.coordinatorlayout.widget.CoordinatorLayout r12, @com.onedelhi.secure.mr2 V r13, @com.onedelhi.secure.mr2 android.view.MotionEvent r14) {
        /*
            r11 = this;
            int r0 = r14.getActionMasked()
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == r2) goto L_0x004e
            r4 = 2
            if (r0 == r4) goto L_0x002d
            r12 = 3
            if (r0 == r12) goto L_0x0072
            r12 = 6
            if (r0 == r12) goto L_0x0013
            goto L_0x004c
        L_0x0013:
            int r12 = r14.getActionIndex()
            if (r12 != 0) goto L_0x001b
            r12 = 1
            goto L_0x001c
        L_0x001b:
            r12 = 0
        L_0x001c:
            int r13 = r14.getPointerId(r12)
            r11.f7711c = r13
            float r12 = r14.getY(r12)
            r13 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 + r13
            int r12 = (int) r12
            r11.f7712d = r12
            goto L_0x004c
        L_0x002d:
            int r0 = r11.f7711c
            int r0 = r14.findPointerIndex(r0)
            if (r0 != r1) goto L_0x0036
            return r3
        L_0x0036:
            float r0 = r14.getY(r0)
            int r0 = (int) r0
            int r1 = r11.f7712d
            int r7 = r1 - r0
            r11.f7712d = r0
            int r8 = r11.mo10889S(r13)
            r9 = 0
            r4 = r11
            r5 = r12
            r6 = r13
            r4.mo11057W(r5, r6, r7, r8, r9)
        L_0x004c:
            r12 = 0
            goto L_0x0081
        L_0x004e:
            android.view.VelocityTracker r0 = r11.f7707a
            if (r0 == 0) goto L_0x0072
            r0.addMovement(r14)
            android.view.VelocityTracker r0 = r11.f7707a
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4)
            android.view.VelocityTracker r0 = r11.f7707a
            int r4 = r11.f7711c
            float r10 = r0.getYVelocity(r4)
            int r0 = r11.mo10890T(r13)
            int r8 = -r0
            r9 = 0
            r5 = r11
            r6 = r12
            r7 = r13
            r5.mo11056R(r6, r7, r8, r9, r10)
            r12 = 1
            goto L_0x0073
        L_0x0072:
            r12 = 0
        L_0x0073:
            r11.f7710a = r3
            r11.f7711c = r1
            android.view.VelocityTracker r13 = r11.f7707a
            if (r13 == 0) goto L_0x0081
            r13.recycle()
            r13 = 0
            r11.f7707a = r13
        L_0x0081:
            android.view.VelocityTracker r13 = r11.f7707a
            if (r13 == 0) goto L_0x0088
            r13.addMovement(r14)
        L_0x0088:
            boolean r13 = r11.f7710a
            if (r13 != 0) goto L_0x0090
            if (r12 == 0) goto L_0x008f
            goto L_0x0090
        L_0x008f:
            r2 = 0
        L_0x0090:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.HeaderBehavior.mo3641E(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: P */
    public boolean mo10888P(V v) {
        return false;
    }

    /* renamed from: Q */
    public final void mo11055Q() {
        if (this.f7707a == null) {
            this.f7707a = VelocityTracker.obtain();
        }
    }

    /* renamed from: R */
    public final boolean mo11056R(CoordinatorLayout coordinatorLayout, @mr2 V v, int i, int i2, float f) {
        V v2 = v;
        Runnable runnable = this.f7709a;
        if (runnable != null) {
            v.removeCallbacks(runnable);
            this.f7709a = null;
        }
        if (this.f7708a == null) {
            this.f7708a = new OverScroller(v.getContext());
        }
        this.f7708a.fling(0, mo10926H(), 0, Math.round(f), 0, 0, i, i2);
        if (this.f7708a.computeScrollOffset()) {
            CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
            C1469a aVar = new C1469a(coordinatorLayout, v);
            this.f7709a = aVar;
            jt4.m18993p1(v, aVar);
            return true;
        }
        CoordinatorLayout coordinatorLayout3 = coordinatorLayout;
        mo10892V(coordinatorLayout, v);
        return false;
    }

    /* renamed from: S */
    public int mo10889S(@mr2 V v) {
        return -v.getHeight();
    }

    /* renamed from: T */
    public int mo10890T(@mr2 V v) {
        return v.getHeight();
    }

    /* renamed from: U */
    public int mo10891U() {
        return mo10926H();
    }

    /* renamed from: V */
    public void mo10892V(CoordinatorLayout coordinatorLayout, V v) {
    }

    /* renamed from: W */
    public final int mo11057W(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        return mo10893Y(coordinatorLayout, v, mo10891U() - i, i2, i3);
    }

    /* renamed from: X */
    public int mo11058X(CoordinatorLayout coordinatorLayout, V v, int i) {
        return mo10893Y(coordinatorLayout, v, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /* renamed from: Y */
    public int mo10893Y(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        int e;
        int H = mo10926H();
        if (i2 == 0 || H < i2 || H > i3 || H == (e = rf2.m26699e(i, i2, i3))) {
            return 0;
        }
        mo10931N(e);
        return H - e;
    }

    /* renamed from: l */
    public boolean mo3652l(@mr2 CoordinatorLayout coordinatorLayout, @mr2 V v, @mr2 MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.f7713e < 0) {
            this.f7713e = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f7710a) {
            int i = this.f7711c;
            if (i == -1 || (findPointerIndex = motionEvent.findPointerIndex(i)) == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y - this.f7712d) > this.f7713e) {
                this.f7712d = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f7711c = -1;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            boolean z = mo10888P(v) && coordinatorLayout.mo3576G(v, x, y2);
            this.f7710a = z;
            if (z) {
                this.f7712d = y2;
                this.f7711c = motionEvent.getPointerId(0);
                mo11055Q();
                OverScroller overScroller = this.f7708a;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f7708a.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f7707a;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }
}
