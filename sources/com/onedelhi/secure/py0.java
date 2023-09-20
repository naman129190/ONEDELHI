package com.onedelhi.secure;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.onedelhi.secure.l91;
import java.util.ArrayList;
import java.util.List;

public abstract class py0 extends C3884x1 {

    /* renamed from: a */
    public static final l91.C2703a<C1638a2> f18779a = new C3209a();

    /* renamed from: a */
    public static final l91.C2704b<k14<C1638a2>, C1638a2> f18780a = new C3210b();

    /* renamed from: a */
    public static final String f18781a = "android.view.View";

    /* renamed from: d */
    public static final int f18782d = Integer.MIN_VALUE;

    /* renamed from: d */
    public static final Rect f18783d = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: e */
    public static final int f18784e = -1;

    /* renamed from: a */
    public int f18785a = Integer.MIN_VALUE;

    /* renamed from: a */
    public final Rect f18786a = new Rect();

    /* renamed from: a */
    public final View f18787a;

    /* renamed from: a */
    public final AccessibilityManager f18788a;

    /* renamed from: a */
    public C3211c f18789a;

    /* renamed from: a */
    public final int[] f18790a = new int[2];

    /* renamed from: b */
    public int f18791b = Integer.MIN_VALUE;

    /* renamed from: b */
    public final Rect f18792b = new Rect();

    /* renamed from: c */
    public int f18793c = Integer.MIN_VALUE;

    /* renamed from: c */
    public final Rect f18794c = new Rect();

    /* renamed from: com.onedelhi.secure.py0$a */
    public class C3209a implements l91.C2703a<C1638a2> {
        /* renamed from: b */
        public void mo19338a(C1638a2 a2Var, Rect rect) {
            a2Var.mo12611s(rect);
        }
    }

    /* renamed from: com.onedelhi.secure.py0$b */
    public class C3210b implements l91.C2704b<k14<C1638a2>, C1638a2> {
        /* renamed from: c */
        public C1638a2 mo19340b(k14<C1638a2> k14, int i) {
            return k14.mo18867y(i);
        }

        /* renamed from: d */
        public int mo19339a(k14<C1638a2> k14) {
            return k14.mo18866x();
        }
    }

    /* renamed from: com.onedelhi.secure.py0$c */
    public class C3211c extends C1740b2 {
        public C3211c() {
        }

        /* renamed from: b */
        public C1638a2 mo13373b(int i) {
            return C1638a2.m10546F0(py0.this.mo22736L(i));
        }

        /* renamed from: d */
        public C1638a2 mo13375d(int i) {
            int i2 = i == 2 ? py0.this.f18785a : py0.this.f18791b;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return mo13373b(i2);
        }

        /* renamed from: f */
        public boolean mo13377f(int i, int i2, Bundle bundle) {
            return py0.this.mo22740T(i, i2, bundle);
        }
    }

    public py0(@mr2 View view) {
        if (view != null) {
            this.f18787a = view;
            this.f18788a = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            if (jt4.m18916V(view) == 0) {
                jt4.m18906R1(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    /* renamed from: E */
    public static Rect m25131E(@mr2 View view, int i, @mr2 Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i == 17) {
            rect.set(width, 0, width, height);
        } else if (i == 33) {
            rect.set(0, height, width, height);
        } else if (i == 66) {
            rect.set(-1, 0, -1, height);
        } else if (i == 130) {
            rect.set(0, -1, width, -1);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return rect;
    }

    /* renamed from: J */
    public static int m25132J(int i) {
        if (i == 19) {
            return 33;
        }
        if (i != 21) {
            return i != 22 ? 130 : 66;
        }
        return 17;
    }

    @Deprecated
    /* renamed from: A */
    public int mo22729A() {
        return mo22757x();
    }

    /* renamed from: B */
    public final int mo22730B() {
        return this.f18791b;
    }

    /* renamed from: C */
    public abstract int mo11713C(float f, float f2);

    /* renamed from: D */
    public abstract void mo11714D(List<Integer> list);

    /* renamed from: F */
    public final void mo22731F() {
        mo22733H(-1, 1);
    }

    /* renamed from: G */
    public final void mo22732G(int i) {
        mo22733H(i, 0);
    }

    /* renamed from: H */
    public final void mo22733H(int i, int i2) {
        ViewParent parent;
        if (i != Integer.MIN_VALUE && this.f18788a.isEnabled() && (parent = this.f18787a.getParent()) != null) {
            AccessibilityEvent q = mo22750q(i, 2048);
            C3958y1.m31840i(q, i2);
            parent.requestSendAccessibilityEvent(this.f18787a, q);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x002f A[SYNTHETIC] */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo22734I(android.graphics.Rect r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L_0x0032
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x000a
            goto L_0x0032
        L_0x000a:
            android.view.View r4 = r3.f18787a
            int r4 = r4.getWindowVisibility()
            if (r4 == 0) goto L_0x0013
            return r0
        L_0x0013:
            android.view.View r4 = r3.f18787a
        L_0x0015:
            android.view.ViewParent r4 = r4.getParent()
            boolean r1 = r4 instanceof android.view.View
            if (r1 == 0) goto L_0x002f
            android.view.View r4 = (android.view.View) r4
            float r1 = r4.getAlpha()
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x002e
            int r1 = r4.getVisibility()
            if (r1 == 0) goto L_0x0015
        L_0x002e:
            return r0
        L_0x002f:
            if (r4 == 0) goto L_0x0032
            r0 = 1
        L_0x0032:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.py0.mo22734I(android.graphics.Rect):boolean");
    }

    /* renamed from: K */
    public final boolean mo22735K(int i, @ts2 Rect rect) {
        Object obj;
        k14<C1638a2> y = mo22758y();
        int i2 = this.f18791b;
        int i3 = Integer.MIN_VALUE;
        C1638a2 h = i2 == Integer.MIN_VALUE ? null : y.mo18849h(i2);
        if (i == 1 || i == 2) {
            obj = l91.m20339d(y, f18780a, f18779a, h, i, jt4.m18928Z(this.f18787a) == 1, false);
        } else if (i == 17 || i == 33 || i == 66 || i == 130) {
            Rect rect2 = new Rect();
            int i4 = this.f18791b;
            if (i4 != Integer.MIN_VALUE) {
                mo22759z(i4, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                m25131E(this.f18787a, i, rect2);
            }
            obj = l91.m20338c(y, f18780a, f18779a, h, rect2, i);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        C1638a2 a2Var = (C1638a2) obj;
        if (a2Var != null) {
            i3 = y.mo18854m(y.mo18852k(a2Var));
        }
        return mo22744X(i3);
    }

    @mr2
    /* renamed from: L */
    public C1638a2 mo22736L(int i) {
        return i == -1 ? mo22754u() : mo22753t(i);
    }

    /* renamed from: M */
    public final void mo22737M(boolean z, int i, @ts2 Rect rect) {
        int i2 = this.f18791b;
        if (i2 != Integer.MIN_VALUE) {
            mo22748o(i2);
        }
        if (z) {
            mo22735K(i, rect);
        }
    }

    /* renamed from: N */
    public abstract boolean mo11715N(int i, int i2, @ts2 Bundle bundle);

    /* renamed from: O */
    public void mo22738O(@mr2 AccessibilityEvent accessibilityEvent) {
    }

    /* renamed from: P */
    public void mo22739P(int i, @mr2 AccessibilityEvent accessibilityEvent) {
    }

    /* renamed from: Q */
    public void mo11716Q(@mr2 C1638a2 a2Var) {
    }

    /* renamed from: R */
    public abstract void mo11717R(int i, @mr2 C1638a2 a2Var);

    /* renamed from: S */
    public void mo11718S(int i, boolean z) {
    }

    /* renamed from: T */
    public boolean mo22740T(int i, int i2, Bundle bundle) {
        return i != -1 ? mo22741U(i, i2, bundle) : mo22742V(i2, bundle);
    }

    /* renamed from: U */
    public final boolean mo22741U(int i, int i2, Bundle bundle) {
        return i2 != 1 ? i2 != 2 ? i2 != 64 ? i2 != 128 ? mo11715N(i, i2, bundle) : mo22747n(i) : mo22743W(i) : mo22748o(i) : mo22744X(i);
    }

    /* renamed from: V */
    public final boolean mo22742V(int i, Bundle bundle) {
        return jt4.m18977l1(this.f18787a, i, bundle);
    }

    /* renamed from: W */
    public final boolean mo22743W(int i) {
        int i2;
        if (!this.f18788a.isEnabled() || !this.f18788a.isTouchExplorationEnabled() || (i2 = this.f18785a) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            mo22747n(i2);
        }
        this.f18785a = i;
        this.f18787a.invalidate();
        mo22745Y(i, 32768);
        return true;
    }

    /* renamed from: X */
    public final boolean mo22744X(int i) {
        int i2;
        if ((!this.f18787a.isFocused() && !this.f18787a.requestFocus()) || (i2 = this.f18791b) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            mo22748o(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.f18791b = i;
        mo11718S(i, true);
        mo22745Y(i, 8);
        return true;
    }

    /* renamed from: Y */
    public final boolean mo22745Y(int i, int i2) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.f18788a.isEnabled() || (parent = this.f18787a.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.f18787a, mo22750q(i, i2));
    }

    /* renamed from: Z */
    public final void mo22746Z(int i) {
        int i2 = this.f18793c;
        if (i2 != i) {
            this.f18793c = i;
            mo22745Y(i, 128);
            mo22745Y(i2, 256);
        }
    }

    /* renamed from: b */
    public C1740b2 mo6530b(View view) {
        if (this.f18789a == null) {
            this.f18789a = new C3211c();
        }
        return this.f18789a;
    }

    /* renamed from: f */
    public void mo3892f(View view, AccessibilityEvent accessibilityEvent) {
        super.mo3892f(view, accessibilityEvent);
        mo22738O(accessibilityEvent);
    }

    /* renamed from: g */
    public void mo3893g(View view, C1638a2 a2Var) {
        super.mo3893g(view, a2Var);
        mo11716Q(a2Var);
    }

    /* renamed from: n */
    public final boolean mo22747n(int i) {
        if (this.f18785a != i) {
            return false;
        }
        this.f18785a = Integer.MIN_VALUE;
        this.f18787a.invalidate();
        mo22745Y(i, 65536);
        return true;
    }

    /* renamed from: o */
    public final boolean mo22748o(int i) {
        if (this.f18791b != i) {
            return false;
        }
        this.f18791b = Integer.MIN_VALUE;
        mo11718S(i, false);
        mo22745Y(i, 8);
        return true;
    }

    /* renamed from: p */
    public final boolean mo22749p() {
        int i = this.f18791b;
        return i != Integer.MIN_VALUE && mo11715N(i, 16, (Bundle) null);
    }

    /* renamed from: q */
    public final AccessibilityEvent mo22750q(int i, int i2) {
        return i != -1 ? mo22751r(i, i2) : mo22752s(i2);
    }

    /* renamed from: r */
    public final AccessibilityEvent mo22751r(int i, int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        C1638a2 L = mo22736L(i);
        obtain.getText().add(L.mo12541U());
        obtain.setContentDescription(L.mo12485A());
        obtain.setScrollable(L.mo12627x0());
        obtain.setPassword(L.mo12622v0());
        obtain.setEnabled(L.mo12600o0());
        obtain.setChecked(L.mo12583i0());
        mo22739P(i, obtain);
        if (!obtain.getText().isEmpty() || obtain.getContentDescription() != null) {
            obtain.setClassName(L.mo12624w());
            C1833c2.m12209Y(obtain, this.f18787a, i);
            obtain.setPackageName(this.f18787a.getContext().getPackageName());
            return obtain;
        }
        throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
    }

    /* renamed from: s */
    public final AccessibilityEvent mo22752s(int i) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i);
        this.f18787a.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    @mr2
    /* renamed from: t */
    public final C1638a2 mo22753t(int i) {
        C1638a2 C0 = C1638a2.m10543C0();
        C0.mo12577g1(true);
        C0.mo12584i1(true);
        C0.mo12548W0("android.view.View");
        Rect rect = f18783d;
        C0.mo12533R0(rect);
        C0.mo12536S0(rect);
        C0.mo12634z1(this.f18787a);
        mo11717R(i, C0);
        if (C0.mo12541U() == null && C0.mo12485A() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        C0.mo12611s(this.f18792b);
        if (!this.f18792b.equals(rect)) {
            int p = C0.mo12602p();
            if ((p & 64) != 0) {
                throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            } else if ((p & 128) == 0) {
                C0.mo12628x1(this.f18787a.getContext().getPackageName());
                C0.mo12510J1(this.f18787a, i);
                if (this.f18785a == i) {
                    C0.mo12524O0(true);
                    C0.mo12556a(128);
                } else {
                    C0.mo12524O0(false);
                    C0.mo12556a(64);
                }
                boolean z = this.f18791b == i;
                if (z) {
                    C0.mo12556a(2);
                } else if (C0.mo12603p0()) {
                    C0.mo12556a(1);
                }
                C0.mo12587j1(z);
                this.f18787a.getLocationOnScreen(this.f18790a);
                C0.mo12614t(this.f18786a);
                if (this.f18786a.equals(rect)) {
                    C0.mo12611s(this.f18786a);
                    if (C0.f8621a != -1) {
                        C1638a2 C02 = C1638a2.m10543C0();
                        for (int i2 = C0.f8621a; i2 != -1; i2 = C02.f8621a) {
                            C02.mo12487A1(this.f18787a, -1);
                            C02.mo12533R0(f18783d);
                            mo11717R(i2, C02);
                            C02.mo12611s(this.f18792b);
                            Rect rect2 = this.f18786a;
                            Rect rect3 = this.f18792b;
                            rect2.offset(rect3.left, rect3.top);
                        }
                        C02.mo12506I0();
                    }
                    this.f18786a.offset(this.f18790a[0] - this.f18787a.getScrollX(), this.f18790a[1] - this.f18787a.getScrollY());
                }
                if (this.f18787a.getLocalVisibleRect(this.f18794c)) {
                    this.f18794c.offset(this.f18790a[0] - this.f18787a.getScrollX(), this.f18790a[1] - this.f18787a.getScrollY());
                    if (this.f18786a.intersect(this.f18794c)) {
                        C0.mo12536S0(this.f18786a);
                        if (mo22734I(this.f18786a)) {
                            C0.mo12546V1(true);
                        }
                    }
                }
                return C0;
            } else {
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
        } else {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
    }

    @mr2
    /* renamed from: u */
    public final C1638a2 mo22754u() {
        C1638a2 D0 = C1638a2.m10544D0(this.f18787a);
        jt4.m18965i1(this.f18787a, D0);
        ArrayList arrayList = new ArrayList();
        mo11714D(arrayList);
        if (D0.mo12621v() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                D0.mo12565d(this.f18787a, ((Integer) arrayList.get(i)).intValue());
            }
            return D0;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    /* renamed from: v */
    public final boolean mo22755v(@mr2 MotionEvent motionEvent) {
        if (!this.f18788a.isEnabled() || !this.f18788a.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int C = mo11713C(motionEvent.getX(), motionEvent.getY());
            mo22746Z(C);
            return C != Integer.MIN_VALUE;
        } else if (action != 10 || this.f18793c == Integer.MIN_VALUE) {
            return false;
        } else {
            mo22746Z(Integer.MIN_VALUE);
            return true;
        }
    }

    /* renamed from: w */
    public final boolean mo22756w(@mr2 KeyEvent keyEvent) {
        int i = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 61) {
            if (keyCode != 66) {
                switch (keyCode) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                        if (!keyEvent.hasNoModifiers()) {
                            return false;
                        }
                        int J = m25132J(keyCode);
                        int repeatCount = keyEvent.getRepeatCount() + 1;
                        boolean z = false;
                        while (i < repeatCount && mo22735K(J, (Rect) null)) {
                            i++;
                            z = true;
                        }
                        return z;
                    case 23:
                        break;
                    default:
                        return false;
                }
            }
            if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
                return false;
            }
            mo22749p();
            return true;
        } else if (keyEvent.hasNoModifiers()) {
            return mo22735K(2, (Rect) null);
        } else {
            if (keyEvent.hasModifiers(1)) {
                return mo22735K(1, (Rect) null);
            }
            return false;
        }
    }

    /* renamed from: x */
    public final int mo22757x() {
        return this.f18785a;
    }

    /* renamed from: y */
    public final k14<C1638a2> mo22758y() {
        ArrayList arrayList = new ArrayList();
        mo11714D(arrayList);
        k14<C1638a2> k14 = new k14<>();
        for (int i = 0; i < arrayList.size(); i++) {
            k14.mo18855n(((Integer) arrayList.get(i)).intValue(), mo22753t(((Integer) arrayList.get(i)).intValue()));
        }
        return k14;
    }

    /* renamed from: z */
    public final void mo22759z(int i, Rect rect) {
        mo22736L(i).mo12611s(rect);
    }
}
