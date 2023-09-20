package com.onedelhi.secure;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;

public class mt4 {

    /* renamed from: a */
    public static final Interpolator f16307a = new C2886a();

    /* renamed from: a */
    public static final String f16308a = "ViewDragHelper";

    /* renamed from: h */
    public static final int f16309h = -1;

    /* renamed from: i */
    public static final int f16310i = 0;

    /* renamed from: j */
    public static final int f16311j = 1;

    /* renamed from: k */
    public static final int f16312k = 2;

    /* renamed from: l */
    public static final int f16313l = 1;

    /* renamed from: m */
    public static final int f16314m = 2;

    /* renamed from: n */
    public static final int f16315n = 4;

    /* renamed from: o */
    public static final int f16316o = 8;

    /* renamed from: p */
    public static final int f16317p = 15;

    /* renamed from: q */
    public static final int f16318q = 1;

    /* renamed from: r */
    public static final int f16319r = 2;

    /* renamed from: s */
    public static final int f16320s = 3;

    /* renamed from: t */
    public static final int f16321t = 20;

    /* renamed from: u */
    public static final int f16322u = 256;

    /* renamed from: v */
    public static final int f16323v = 600;

    /* renamed from: a */
    public float f16324a;

    /* renamed from: a */
    public int f16325a;

    /* renamed from: a */
    public VelocityTracker f16326a;

    /* renamed from: a */
    public View f16327a;

    /* renamed from: a */
    public final ViewGroup f16328a;

    /* renamed from: a */
    public OverScroller f16329a;

    /* renamed from: a */
    public final C2888c f16330a;

    /* renamed from: a */
    public final Runnable f16331a = new C2887b();

    /* renamed from: a */
    public boolean f16332a;

    /* renamed from: a */
    public float[] f16333a;

    /* renamed from: a */
    public int[] f16334a;

    /* renamed from: b */
    public float f16335b;

    /* renamed from: b */
    public int f16336b;

    /* renamed from: b */
    public float[] f16337b;

    /* renamed from: b */
    public int[] f16338b;

    /* renamed from: c */
    public int f16339c = -1;

    /* renamed from: c */
    public float[] f16340c;

    /* renamed from: c */
    public int[] f16341c;

    /* renamed from: d */
    public int f16342d;

    /* renamed from: d */
    public float[] f16343d;

    /* renamed from: e */
    public int f16344e;

    /* renamed from: f */
    public final int f16345f;

    /* renamed from: g */
    public int f16346g;

    /* renamed from: com.onedelhi.secure.mt4$a */
    public class C2886a implements Interpolator {
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: com.onedelhi.secure.mt4$b */
    public class C2887b implements Runnable {
        public C2887b() {
        }

        public void run() {
            mt4.this.mo20641R(0);
        }
    }

    /* renamed from: com.onedelhi.secure.mt4$c */
    public static abstract class C2888c {
        /* renamed from: a */
        public int mo4122a(@mr2 View view, int i, int i2) {
            return 0;
        }

        /* renamed from: b */
        public int mo4123b(@mr2 View view, int i, int i2) {
            return 0;
        }

        /* renamed from: c */
        public int mo20675c(int i) {
            return i;
        }

        /* renamed from: d */
        public int mo4124d(@mr2 View view) {
            return 0;
        }

        /* renamed from: e */
        public int mo11284e(@mr2 View view) {
            return 0;
        }

        /* renamed from: f */
        public void mo4125f(int i, int i2) {
        }

        /* renamed from: g */
        public boolean mo4126g(int i) {
            return false;
        }

        /* renamed from: h */
        public void mo4127h(int i, int i2) {
        }

        /* renamed from: i */
        public void mo4128i(@mr2 View view, int i) {
        }

        /* renamed from: j */
        public void mo4129j(int i) {
        }

        /* renamed from: k */
        public void mo4130k(@mr2 View view, int i, int i2, @e83 int i3, @e83 int i4) {
        }

        /* renamed from: l */
        public void mo4131l(@mr2 View view, float f, float f2) {
        }

        /* renamed from: m */
        public abstract boolean mo4132m(@mr2 View view, int i);
    }

    public mt4(@mr2 Context context, @mr2 ViewGroup viewGroup, @mr2 C2888c cVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (cVar != null) {
            this.f16328a = viewGroup;
            this.f16330a = cVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int i = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f16345f = i;
            this.f16344e = i;
            this.f16336b = viewConfiguration.getScaledTouchSlop();
            this.f16324a = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f16335b = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f16329a = new OverScroller(context, f16307a);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    /* renamed from: p */
    public static mt4 m21949p(@mr2 ViewGroup viewGroup, float f, @mr2 C2888c cVar) {
        mt4 q = m21950q(viewGroup, cVar);
        q.f16336b = (int) (((float) q.f16336b) * (1.0f / f));
        return q;
    }

    /* renamed from: q */
    public static mt4 m21950q(@mr2 ViewGroup viewGroup, @mr2 C2888c cVar) {
        return new mt4(viewGroup.getContext(), viewGroup, cVar);
    }

    @e83
    /* renamed from: A */
    public int mo20624A() {
        return this.f16345f;
    }

    @e83
    /* renamed from: B */
    public int mo20625B() {
        return this.f16344e;
    }

    /* renamed from: C */
    public final int mo20626C(int i, int i2) {
        int i3 = i < this.f16328a.getLeft() + this.f16344e ? 1 : 0;
        if (i2 < this.f16328a.getTop() + this.f16344e) {
            i3 |= 4;
        }
        if (i > this.f16328a.getRight() - this.f16344e) {
            i3 |= 2;
        }
        return i2 > this.f16328a.getBottom() - this.f16344e ? i3 | 8 : i3;
    }

    /* renamed from: D */
    public float mo20627D() {
        return this.f16335b;
    }

    @e83
    /* renamed from: E */
    public int mo20628E() {
        return this.f16336b;
    }

    /* renamed from: F */
    public int mo20629F() {
        return this.f16325a;
    }

    /* renamed from: G */
    public boolean mo20630G(int i, int i2) {
        return mo20635L(this.f16327a, i, i2);
    }

    /* renamed from: H */
    public boolean mo20631H(int i) {
        int length = this.f16334a.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (mo20632I(i, i2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: I */
    public boolean mo20632I(int i, int i2) {
        return mo20633J(i2) && (i & this.f16334a[i2]) != 0;
    }

    /* renamed from: J */
    public boolean mo20633J(int i) {
        return ((1 << i) & this.f16342d) != 0;
    }

    /* renamed from: K */
    public final boolean mo20634K(int i) {
        if (mo20633J(i)) {
            return true;
        }
        Log.e(f16308a, "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    /* renamed from: L */
    public boolean mo20635L(@ts2 View view, int i, int i2) {
        return view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom();
    }

    /* renamed from: M */
    public void mo20636M(@mr2 MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            mo20651c();
        }
        if (this.f16326a == null) {
            this.f16326a = VelocityTracker.obtain();
        }
        this.f16326a.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.f16325a != 1) {
                        int pointerCount = motionEvent.getPointerCount();
                        while (i2 < pointerCount) {
                            int pointerId = motionEvent.getPointerId(i2);
                            if (mo20634K(pointerId)) {
                                float x = motionEvent.getX(i2);
                                float y = motionEvent.getY(i2);
                                float f = x - this.f16333a[pointerId];
                                float f2 = y - this.f16337b[pointerId];
                                mo20638O(f, f2, pointerId);
                                if (this.f16325a != 1) {
                                    View v = mo20668v((int) x, (int) y);
                                    if (mo20656h(v, f, f2) && mo20648Y(v, pointerId)) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            i2++;
                        }
                    } else if (mo20634K(this.f16339c)) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.f16339c);
                        float x2 = motionEvent.getX(findPointerIndex);
                        float y2 = motionEvent.getY(findPointerIndex);
                        float[] fArr = this.f16340c;
                        int i3 = this.f16339c;
                        int i4 = (int) (x2 - fArr[i3]);
                        int i5 = (int) (y2 - this.f16343d[i3]);
                        mo20666t(this.f16327a.getLeft() + i4, this.f16327a.getTop() + i5, i4, i5);
                    } else {
                        return;
                    }
                    mo20640Q(motionEvent);
                    return;
                } else if (actionMasked != 3) {
                    if (actionMasked == 5) {
                        int pointerId2 = motionEvent.getPointerId(actionIndex);
                        float x3 = motionEvent.getX(actionIndex);
                        float y3 = motionEvent.getY(actionIndex);
                        mo20639P(x3, y3, pointerId2);
                        if (this.f16325a == 0) {
                            mo20648Y(mo20668v((int) x3, (int) y3), pointerId2);
                            int i6 = this.f16334a[pointerId2];
                            int i7 = this.f16346g;
                            if ((i6 & i7) != 0) {
                                this.f16330a.mo4127h(i6 & i7, pointerId2);
                                return;
                            }
                            return;
                        } else if (mo20630G((int) x3, (int) y3)) {
                            mo20648Y(this.f16327a, pointerId2);
                            return;
                        } else {
                            return;
                        }
                    } else if (actionMasked == 6) {
                        int pointerId3 = motionEvent.getPointerId(actionIndex);
                        if (this.f16325a == 1 && pointerId3 == this.f16339c) {
                            int pointerCount2 = motionEvent.getPointerCount();
                            while (true) {
                                if (i2 >= pointerCount2) {
                                    i = -1;
                                    break;
                                }
                                int pointerId4 = motionEvent.getPointerId(i2);
                                if (pointerId4 != this.f16339c) {
                                    View v2 = mo20668v((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                                    View view = this.f16327a;
                                    if (v2 == view && mo20648Y(view, pointerId4)) {
                                        i = this.f16339c;
                                        break;
                                    }
                                }
                                i2++;
                            }
                            if (i == -1) {
                                mo20637N();
                            }
                        }
                        mo20660l(pointerId3);
                        return;
                    } else {
                        return;
                    }
                } else if (this.f16325a == 1) {
                    mo20664r(0.0f, 0.0f);
                }
            } else if (this.f16325a == 1) {
                mo20637N();
            }
            mo20651c();
            return;
        }
        float x4 = motionEvent.getX();
        float y4 = motionEvent.getY();
        int pointerId5 = motionEvent.getPointerId(0);
        View v3 = mo20668v((int) x4, (int) y4);
        mo20639P(x4, y4, pointerId5);
        mo20648Y(v3, pointerId5);
        int i8 = this.f16334a[pointerId5];
        int i9 = this.f16346g;
        if ((i8 & i9) != 0) {
            this.f16330a.mo4127h(i8 & i9, pointerId5);
        }
    }

    /* renamed from: N */
    public final void mo20637N() {
        this.f16326a.computeCurrentVelocity(1000, this.f16324a);
        mo20664r(mo20657i(this.f16326a.getXVelocity(this.f16339c), this.f16335b, this.f16324a), mo20657i(this.f16326a.getYVelocity(this.f16339c), this.f16335b, this.f16324a));
    }

    /* renamed from: O */
    public final void mo20638O(float f, float f2, int i) {
        boolean e = mo20653e(f, f2, i, 1);
        if (mo20653e(f2, f, i, 4)) {
            e |= true;
        }
        if (mo20653e(f, f2, i, 2)) {
            e |= true;
        }
        if (mo20653e(f2, f, i, 8)) {
            e |= true;
        }
        if (e) {
            int[] iArr = this.f16338b;
            iArr[i] = iArr[i] | e;
            this.f16330a.mo4125f(e ? 1 : 0, i);
        }
    }

    /* renamed from: P */
    public final void mo20639P(float f, float f2, int i) {
        mo20667u(i);
        float[] fArr = this.f16333a;
        this.f16340c[i] = f;
        fArr[i] = f;
        float[] fArr2 = this.f16337b;
        this.f16343d[i] = f2;
        fArr2[i] = f2;
        this.f16334a[i] = mo20626C((int) f, (int) f2);
        this.f16342d |= 1 << i;
    }

    /* renamed from: Q */
    public final void mo20640Q(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (mo20634K(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f16340c[pointerId] = x;
                this.f16343d[pointerId] = y;
            }
        }
    }

    /* renamed from: R */
    public void mo20641R(int i) {
        this.f16328a.removeCallbacks(this.f16331a);
        if (this.f16325a != i) {
            this.f16325a = i;
            this.f16330a.mo4129j(i);
            if (this.f16325a == 0) {
                this.f16327a = null;
            }
        }
    }

    /* renamed from: S */
    public void mo20642S(@e83 @js1(from = 0) int i) {
        this.f16344e = i;
    }

    /* renamed from: T */
    public void mo20643T(int i) {
        this.f16346g = i;
    }

    /* renamed from: U */
    public void mo20644U(float f) {
        this.f16335b = f;
    }

    /* renamed from: V */
    public boolean mo20645V(int i, int i2) {
        if (this.f16332a) {
            return mo20670x(i, i2, (int) this.f16326a.getXVelocity(this.f16339c), (int) this.f16326a.getYVelocity(this.f16339c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00dd, code lost:
        if (r12 != r11) goto L_0x00e6;
     */
    /* renamed from: W */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo20646W(@com.onedelhi.secure.mr2 android.view.MotionEvent r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r17.getActionMasked()
            int r3 = r17.getActionIndex()
            if (r2 != 0) goto L_0x0011
            r16.mo20651c()
        L_0x0011:
            android.view.VelocityTracker r4 = r0.f16326a
            if (r4 != 0) goto L_0x001b
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r0.f16326a = r4
        L_0x001b:
            android.view.VelocityTracker r4 = r0.f16326a
            r4.addMovement(r1)
            r4 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0104
            if (r2 == r6) goto L_0x00ff
            if (r2 == r4) goto L_0x0070
            r7 = 3
            if (r2 == r7) goto L_0x00ff
            r7 = 5
            if (r2 == r7) goto L_0x003c
            r4 = 6
            if (r2 == r4) goto L_0x0034
        L_0x0031:
            r5 = 0
            goto L_0x0135
        L_0x0034:
            int r1 = r1.getPointerId(r3)
            r0.mo20660l(r1)
            goto L_0x0031
        L_0x003c:
            int r2 = r1.getPointerId(r3)
            float r7 = r1.getX(r3)
            float r1 = r1.getY(r3)
            r0.mo20639P(r7, r1, r2)
            int r3 = r0.f16325a
            if (r3 != 0) goto L_0x0060
            int[] r1 = r0.f16334a
            r1 = r1[r2]
            int r3 = r0.f16346g
            r4 = r1 & r3
            if (r4 == 0) goto L_0x0031
            com.onedelhi.secure.mt4$c r4 = r0.f16330a
            r1 = r1 & r3
            r4.mo4127h(r1, r2)
            goto L_0x0031
        L_0x0060:
            if (r3 != r4) goto L_0x0031
            int r3 = (int) r7
            int r1 = (int) r1
            android.view.View r1 = r0.mo20668v(r3, r1)
            android.view.View r3 = r0.f16327a
            if (r1 != r3) goto L_0x0031
            r0.mo20648Y(r1, r2)
            goto L_0x0031
        L_0x0070:
            float[] r2 = r0.f16333a
            if (r2 == 0) goto L_0x0031
            float[] r2 = r0.f16337b
            if (r2 != 0) goto L_0x0079
            goto L_0x0031
        L_0x0079:
            int r2 = r17.getPointerCount()
            r3 = 0
        L_0x007e:
            if (r3 >= r2) goto L_0x00fa
            int r4 = r1.getPointerId(r3)
            boolean r7 = r0.mo20634K(r4)
            if (r7 != 0) goto L_0x008c
            goto L_0x00f7
        L_0x008c:
            float r7 = r1.getX(r3)
            float r8 = r1.getY(r3)
            float[] r9 = r0.f16333a
            r9 = r9[r4]
            float r9 = r7 - r9
            float[] r10 = r0.f16337b
            r10 = r10[r4]
            float r10 = r8 - r10
            int r7 = (int) r7
            int r8 = (int) r8
            android.view.View r7 = r0.mo20668v(r7, r8)
            if (r7 == 0) goto L_0x00b0
            boolean r8 = r0.mo20656h(r7, r9, r10)
            if (r8 == 0) goto L_0x00b0
            r8 = 1
            goto L_0x00b1
        L_0x00b0:
            r8 = 0
        L_0x00b1:
            if (r8 == 0) goto L_0x00e6
            int r11 = r7.getLeft()
            int r12 = (int) r9
            int r13 = r11 + r12
            com.onedelhi.secure.mt4$c r14 = r0.f16330a
            int r12 = r14.mo4122a(r7, r13, r12)
            int r13 = r7.getTop()
            int r14 = (int) r10
            int r15 = r13 + r14
            com.onedelhi.secure.mt4$c r5 = r0.f16330a
            int r5 = r5.mo4123b(r7, r15, r14)
            com.onedelhi.secure.mt4$c r14 = r0.f16330a
            int r14 = r14.mo4124d(r7)
            com.onedelhi.secure.mt4$c r15 = r0.f16330a
            int r15 = r15.mo11284e(r7)
            if (r14 == 0) goto L_0x00df
            if (r14 <= 0) goto L_0x00e6
            if (r12 != r11) goto L_0x00e6
        L_0x00df:
            if (r15 == 0) goto L_0x00fa
            if (r15 <= 0) goto L_0x00e6
            if (r5 != r13) goto L_0x00e6
            goto L_0x00fa
        L_0x00e6:
            r0.mo20638O(r9, r10, r4)
            int r5 = r0.f16325a
            if (r5 != r6) goto L_0x00ee
            goto L_0x00fa
        L_0x00ee:
            if (r8 == 0) goto L_0x00f7
            boolean r4 = r0.mo20648Y(r7, r4)
            if (r4 == 0) goto L_0x00f7
            goto L_0x00fa
        L_0x00f7:
            int r3 = r3 + 1
            goto L_0x007e
        L_0x00fa:
            r16.mo20640Q(r17)
            goto L_0x0031
        L_0x00ff:
            r16.mo20651c()
            goto L_0x0031
        L_0x0104:
            float r2 = r17.getX()
            float r3 = r17.getY()
            r5 = 0
            int r1 = r1.getPointerId(r5)
            r0.mo20639P(r2, r3, r1)
            int r2 = (int) r2
            int r3 = (int) r3
            android.view.View r2 = r0.mo20668v(r2, r3)
            android.view.View r3 = r0.f16327a
            if (r2 != r3) goto L_0x0125
            int r3 = r0.f16325a
            if (r3 != r4) goto L_0x0125
            r0.mo20648Y(r2, r1)
        L_0x0125:
            int[] r2 = r0.f16334a
            r2 = r2[r1]
            int r3 = r0.f16346g
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0135
            com.onedelhi.secure.mt4$c r4 = r0.f16330a
            r2 = r2 & r3
            r4.mo4127h(r2, r1)
        L_0x0135:
            int r1 = r0.f16325a
            if (r1 != r6) goto L_0x013a
            r5 = 1
        L_0x013a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.mt4.mo20646W(android.view.MotionEvent):boolean");
    }

    /* renamed from: X */
    public boolean mo20647X(@mr2 View view, int i, int i2) {
        this.f16327a = view;
        this.f16339c = -1;
        boolean x = mo20670x(i, i2, 0, 0);
        if (!x && this.f16325a == 0 && this.f16327a != null) {
            this.f16327a = null;
        }
        return x;
    }

    /* renamed from: Y */
    public boolean mo20648Y(View view, int i) {
        if (view == this.f16327a && this.f16339c == i) {
            return true;
        }
        if (view == null || !this.f16330a.mo4132m(view, i)) {
            return false;
        }
        this.f16339c = i;
        mo20652d(view, i);
        return true;
    }

    /* renamed from: a */
    public void mo20649a() {
        mo20651c();
        if (this.f16325a == 2) {
            int currX = this.f16329a.getCurrX();
            int currY = this.f16329a.getCurrY();
            this.f16329a.abortAnimation();
            int currX2 = this.f16329a.getCurrX();
            int currY2 = this.f16329a.getCurrY();
            this.f16330a.mo4130k(this.f16327a, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        mo20641R(0);
    }

    /* renamed from: b */
    public boolean mo20650b(@mr2 View view, boolean z, int i, int i2, int i3, int i4) {
        int i5;
        View view2 = view;
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i6 = i3 + scrollX;
                if (i6 >= childAt.getLeft() && i6 < childAt.getRight() && (i5 = i4 + scrollY) >= childAt.getTop() && i5 < childAt.getBottom()) {
                    if (mo20650b(childAt, true, i, i2, i6 - childAt.getLeft(), i5 - childAt.getTop())) {
                        return true;
                    }
                }
            }
        }
        return z && (view.canScrollHorizontally(-i) || view.canScrollVertically(-i2));
    }

    /* renamed from: c */
    public void mo20651c() {
        this.f16339c = -1;
        mo20659k();
        VelocityTracker velocityTracker = this.f16326a;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f16326a = null;
        }
    }

    /* renamed from: d */
    public void mo20652d(@mr2 View view, int i) {
        if (view.getParent() == this.f16328a) {
            this.f16327a = view;
            this.f16339c = i;
            this.f16330a.mo4128i(view, i);
            mo20641R(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f16328a + pl2.f33727d);
    }

    /* renamed from: e */
    public final boolean mo20653e(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.f16334a[i] & i2) != i2 || (this.f16346g & i2) == 0 || (this.f16341c[i] & i2) == i2 || (this.f16338b[i] & i2) == i2) {
            return false;
        }
        int i3 = this.f16336b;
        if (abs <= ((float) i3) && abs2 <= ((float) i3)) {
            return false;
        }
        if (abs >= abs2 * 0.5f || !this.f16330a.mo4126g(i2)) {
            return (this.f16338b[i] & i2) == 0 && abs > ((float) this.f16336b);
        }
        int[] iArr = this.f16341c;
        iArr[i] = iArr[i] | i2;
        return false;
    }

    /* renamed from: f */
    public boolean mo20654f(int i) {
        int length = this.f16333a.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (mo20655g(i, i2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public boolean mo20655g(int i, int i2) {
        if (!mo20633J(i2)) {
            return false;
        }
        boolean z = (i & 1) == 1;
        boolean z2 = (i & 2) == 2;
        float f = this.f16340c[i2] - this.f16333a[i2];
        float f2 = this.f16343d[i2] - this.f16337b[i2];
        if (!z || !z2) {
            return z ? Math.abs(f) > ((float) this.f16336b) : z2 && Math.abs(f2) > ((float) this.f16336b);
        }
        int i3 = this.f16336b;
        return (f * f) + (f2 * f2) > ((float) (i3 * i3));
    }

    /* renamed from: h */
    public final boolean mo20656h(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z = this.f16330a.mo4124d(view) > 0;
        boolean z2 = this.f16330a.mo11284e(view) > 0;
        if (!z || !z2) {
            return z ? Math.abs(f) > ((float) this.f16336b) : z2 && Math.abs(f2) > ((float) this.f16336b);
        }
        int i = this.f16336b;
        return (f * f) + (f2 * f2) > ((float) (i * i));
    }

    /* renamed from: i */
    public final float mo20657i(float f, float f2, float f3) {
        float abs = Math.abs(f);
        if (abs < f2) {
            return 0.0f;
        }
        return abs > f3 ? f > 0.0f ? f3 : -f3 : f;
    }

    /* renamed from: j */
    public final int mo20658j(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        return abs > i3 ? i > 0 ? i3 : -i3 : i;
    }

    /* renamed from: k */
    public final void mo20659k() {
        float[] fArr = this.f16333a;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f16337b, 0.0f);
            Arrays.fill(this.f16340c, 0.0f);
            Arrays.fill(this.f16343d, 0.0f);
            Arrays.fill(this.f16334a, 0);
            Arrays.fill(this.f16338b, 0);
            Arrays.fill(this.f16341c, 0);
            this.f16342d = 0;
        }
    }

    /* renamed from: l */
    public final void mo20660l(int i) {
        if (this.f16333a != null && mo20633J(i)) {
            this.f16333a[i] = 0.0f;
            this.f16337b[i] = 0.0f;
            this.f16340c[i] = 0.0f;
            this.f16343d[i] = 0.0f;
            this.f16334a[i] = 0;
            this.f16338b[i] = 0;
            this.f16341c[i] = 0;
            this.f16342d = (~(1 << i)) & this.f16342d;
        }
    }

    /* renamed from: m */
    public final int mo20661m(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        int width = this.f16328a.getWidth();
        float f = (float) (width / 2);
        float s = f + (mo20665s(Math.min(1.0f, ((float) Math.abs(i)) / ((float) width))) * f);
        int abs = Math.abs(i2);
        return Math.min(abs > 0 ? Math.round(Math.abs(s / ((float) abs)) * 1000.0f) * 4 : (int) (((((float) Math.abs(i)) / ((float) i3)) + 1.0f) * 256.0f), 600);
    }

    /* renamed from: n */
    public final int mo20662n(View view, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int j = mo20658j(i3, (int) this.f16335b, (int) this.f16324a);
        int j2 = mo20658j(i4, (int) this.f16335b, (int) this.f16324a);
        int abs = Math.abs(i);
        int abs2 = Math.abs(i2);
        int abs3 = Math.abs(j);
        int abs4 = Math.abs(j2);
        int i5 = abs3 + abs4;
        int i6 = abs + abs2;
        if (j != 0) {
            f2 = (float) abs3;
            f = (float) i5;
        } else {
            f2 = (float) abs;
            f = (float) i6;
        }
        float f5 = f2 / f;
        if (j2 != 0) {
            f4 = (float) abs4;
            f3 = (float) i5;
        } else {
            f4 = (float) abs2;
            f3 = (float) i6;
        }
        float f6 = f4 / f3;
        return (int) ((((float) mo20661m(i, j, this.f16330a.mo4124d(view))) * f5) + (((float) mo20661m(i2, j2, this.f16330a.mo11284e(view))) * f6));
    }

    /* renamed from: o */
    public boolean mo20663o(boolean z) {
        if (this.f16325a == 2) {
            boolean computeScrollOffset = this.f16329a.computeScrollOffset();
            int currX = this.f16329a.getCurrX();
            int currY = this.f16329a.getCurrY();
            int left = currX - this.f16327a.getLeft();
            int top = currY - this.f16327a.getTop();
            if (left != 0) {
                jt4.m18949e1(this.f16327a, left);
            }
            if (top != 0) {
                jt4.m18953f1(this.f16327a, top);
            }
            if (!(left == 0 && top == 0)) {
                this.f16330a.mo4130k(this.f16327a, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.f16329a.getFinalX() && currY == this.f16329a.getFinalY()) {
                this.f16329a.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z) {
                    this.f16328a.post(this.f16331a);
                } else {
                    mo20641R(0);
                }
            }
        }
        return this.f16325a == 2;
    }

    /* renamed from: r */
    public final void mo20664r(float f, float f2) {
        this.f16332a = true;
        this.f16330a.mo4131l(this.f16327a, f, f2);
        this.f16332a = false;
        if (this.f16325a == 1) {
            mo20641R(0);
        }
    }

    /* renamed from: s */
    public final float mo20665s(float f) {
        return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
    }

    /* renamed from: t */
    public final void mo20666t(int i, int i2, int i3, int i4) {
        int left = this.f16327a.getLeft();
        int top = this.f16327a.getTop();
        if (i3 != 0) {
            i = this.f16330a.mo4122a(this.f16327a, i, i3);
            jt4.m18949e1(this.f16327a, i - left);
        }
        int i5 = i;
        if (i4 != 0) {
            i2 = this.f16330a.mo4123b(this.f16327a, i2, i4);
            jt4.m18953f1(this.f16327a, i2 - top);
        }
        int i6 = i2;
        if (i3 != 0 || i4 != 0) {
            this.f16330a.mo4130k(this.f16327a, i5, i6, i5 - left, i6 - top);
        }
    }

    /* renamed from: u */
    public final void mo20667u(int i) {
        float[] fArr = this.f16333a;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f16337b;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f16340c;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f16343d;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f16334a;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f16338b;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f16341c;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f16333a = fArr2;
            this.f16337b = fArr3;
            this.f16340c = fArr4;
            this.f16343d = fArr5;
            this.f16334a = iArr;
            this.f16338b = iArr2;
            this.f16341c = iArr3;
        }
    }

    @ts2
    /* renamed from: v */
    public View mo20668v(int i, int i2) {
        for (int childCount = this.f16328a.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f16328a.getChildAt(this.f16330a.mo20675c(childCount));
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: w */
    public void mo20669w(int i, int i2, int i3, int i4) {
        if (this.f16332a) {
            this.f16329a.fling(this.f16327a.getLeft(), this.f16327a.getTop(), (int) this.f16326a.getXVelocity(this.f16339c), (int) this.f16326a.getYVelocity(this.f16339c), i, i3, i2, i4);
            mo20641R(2);
            return;
        }
        throw new IllegalStateException("Cannot flingCapturedView outside of a call to Callback#onViewReleased");
    }

    /* renamed from: x */
    public final boolean mo20670x(int i, int i2, int i3, int i4) {
        int left = this.f16327a.getLeft();
        int top = this.f16327a.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f16329a.abortAnimation();
            mo20641R(0);
            return false;
        }
        this.f16329a.startScroll(left, top, i5, i6, mo20662n(this.f16327a, i5, i6, i3, i4));
        mo20641R(2);
        return true;
    }

    /* renamed from: y */
    public int mo20671y() {
        return this.f16339c;
    }

    @ts2
    /* renamed from: z */
    public View mo20672z() {
        return this.f16327a;
    }
}
