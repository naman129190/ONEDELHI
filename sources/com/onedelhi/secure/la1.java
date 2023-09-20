package com.onedelhi.secure;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import com.onedelhi.secure.hl3;

@hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
public abstract class la1 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a */
    public final float f15245a;

    /* renamed from: a */
    public final View f15246a;

    /* renamed from: a */
    public Runnable f15247a;

    /* renamed from: a */
    public final int[] f15248a = new int[2];

    /* renamed from: b */
    public Runnable f15249b;

    /* renamed from: b */
    public boolean f15250b;

    /* renamed from: n */
    public final int f15251n;

    /* renamed from: o */
    public final int f15252o;

    /* renamed from: p */
    public int f15253p;

    /* renamed from: com.onedelhi.secure.la1$a */
    public class C2707a implements Runnable {
        public C2707a() {
        }

        public void run() {
            ViewParent parent = la1.this.f15246a.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* renamed from: com.onedelhi.secure.la1$b */
    public class C2708b implements Runnable {
        public C2708b() {
        }

        public void run() {
            la1.this.mo19362e();
        }
    }

    public la1(View view) {
        this.f15246a = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f15245a = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f15251n = tapTimeout;
        this.f15252o = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    /* renamed from: h */
    public static boolean m20377h(View view, float f, float f2, float f3) {
        float f4 = -f3;
        return f >= f4 && f2 >= f4 && f < ((float) (view.getRight() - view.getLeft())) + f3 && f2 < ((float) (view.getBottom() - view.getTop())) + f3;
    }

    /* renamed from: a */
    public final void mo19361a() {
        Runnable runnable = this.f15249b;
        if (runnable != null) {
            this.f15246a.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f15247a;
        if (runnable2 != null) {
            this.f15246a.removeCallbacks(runnable2);
        }
    }

    /* renamed from: b */
    public abstract my3 mo1194b();

    /* renamed from: c */
    public boolean mo1195c() {
        my3 b = mo1194b();
        if (b == null || b.mo1238c()) {
            return true;
        }
        b.mo1237a();
        return true;
    }

    /* renamed from: d */
    public boolean mo1687d() {
        my3 b = mo1194b();
        if (b == null || !b.mo1238c()) {
            return true;
        }
        b.dismiss();
        return true;
    }

    /* renamed from: e */
    public void mo19362e() {
        mo19361a();
        View view = this.f15246a;
        if (view.isEnabled() && !view.isLongClickable() && mo1195c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f15250b = true;
        }
    }

    /* renamed from: f */
    public final boolean mo19363f(MotionEvent motionEvent) {
        qp0 qp0;
        View view = this.f15246a;
        my3 b = mo1194b();
        if (b == null || !b.mo1238c() || (qp0 = (qp0) b.mo1241l()) == null || !qp0.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        mo19365i(view, obtainNoHistory);
        mo19366j(qp0, obtainNoHistory);
        boolean f = qp0.mo2093f(obtainNoHistory, this.f15253p);
        obtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        return f && (actionMasked != 1 && actionMasked != 3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (r1 != 3) goto L_0x006d;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo19364g(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f15246a
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L_0x0041
            r3 = 1
            if (r1 == r3) goto L_0x003d
            r4 = 2
            if (r1 == r4) goto L_0x001a
            r6 = 3
            if (r1 == r6) goto L_0x003d
            goto L_0x006d
        L_0x001a:
            int r1 = r5.f15253p
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L_0x006d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f15245a
            boolean r6 = m20377h(r0, r4, r6, r1)
            if (r6 != 0) goto L_0x006d
            r5.mo19361a()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L_0x003d:
            r5.mo19361a()
            goto L_0x006d
        L_0x0041:
            int r6 = r6.getPointerId(r2)
            r5.f15253p = r6
            java.lang.Runnable r6 = r5.f15247a
            if (r6 != 0) goto L_0x0052
            com.onedelhi.secure.la1$a r6 = new com.onedelhi.secure.la1$a
            r6.<init>()
            r5.f15247a = r6
        L_0x0052:
            java.lang.Runnable r6 = r5.f15247a
            int r1 = r5.f15251n
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f15249b
            if (r6 != 0) goto L_0x0065
            com.onedelhi.secure.la1$b r6 = new com.onedelhi.secure.la1$b
            r6.<init>()
            r5.f15249b = r6
        L_0x0065:
            java.lang.Runnable r6 = r5.f15249b
            int r1 = r5.f15252o
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L_0x006d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.la1.mo19364g(android.view.MotionEvent):boolean");
    }

    /* renamed from: i */
    public final boolean mo19365i(View view, MotionEvent motionEvent) {
        int[] iArr = this.f15248a;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) iArr[0], (float) iArr[1]);
        return true;
    }

    /* renamed from: j */
    public final boolean mo19366j(View view, MotionEvent motionEvent) {
        int[] iArr = this.f15248a;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) (-iArr[0]), (float) (-iArr[1]));
        return true;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.f15250b;
        if (z2) {
            z = mo19363f(motionEvent) || !mo1687d();
        } else {
            z = mo19364g(motionEvent) && mo1195c();
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f15246a.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.f15250b = z;
        return z || z2;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        this.f15250b = false;
        this.f15253p = -1;
        Runnable runnable = this.f15247a;
        if (runnable != null) {
            this.f15246a.removeCallbacks(runnable);
        }
    }
}
