package com.onedelhi.secure;

import android.view.View;
import android.view.ViewParent;

public class co2 {

    /* renamed from: a */
    public final View f10436a;

    /* renamed from: a */
    public ViewParent f10437a;

    /* renamed from: a */
    public boolean f10438a;

    /* renamed from: a */
    public int[] f10439a;

    /* renamed from: b */
    public ViewParent f10440b;

    public co2(@mr2 View view) {
        this.f10436a = view;
    }

    /* renamed from: a */
    public boolean mo14288a(float f, float f2, boolean z) {
        ViewParent i;
        if (!mo14300m() || (i = mo14296i(0)) == null) {
            return false;
        }
        return ru4.m27059c(i, this.f10436a, f, f2, z);
    }

    /* renamed from: b */
    public boolean mo14289b(float f, float f2) {
        ViewParent i;
        if (!mo14300m() || (i = mo14296i(0)) == null) {
            return false;
        }
        return ru4.m27060d(i, this.f10436a, f, f2);
    }

    /* renamed from: c */
    public boolean mo14290c(int i, int i2, @ts2 int[] iArr, @ts2 int[] iArr2) {
        return mo14291d(i, i2, iArr, iArr2, 0);
    }

    /* renamed from: d */
    public boolean mo14291d(int i, int i2, @ts2 int[] iArr, @ts2 int[] iArr2, int i3) {
        ViewParent i4;
        int i5;
        int i6;
        if (!mo14300m() || (i4 = mo14296i(i3)) == null) {
            return false;
        }
        if (i != 0 || i2 != 0) {
            if (iArr2 != null) {
                this.f10436a.getLocationInWindow(iArr2);
                i6 = iArr2[0];
                i5 = iArr2[1];
            } else {
                i6 = 0;
                i5 = 0;
            }
            if (iArr == null) {
                iArr = mo14297j();
            }
            iArr[0] = 0;
            iArr[1] = 0;
            ru4.m27062f(i4, this.f10436a, i, i2, iArr, i3);
            if (iArr2 != null) {
                this.f10436a.getLocationInWindow(iArr2);
                iArr2[0] = iArr2[0] - i6;
                iArr2[1] = iArr2[1] - i5;
            }
            return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
        } else if (iArr2 == null) {
            return false;
        } else {
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
    }

    /* renamed from: e */
    public void mo14292e(int i, int i2, int i3, int i4, @ts2 int[] iArr, int i5, @ts2 int[] iArr2) {
        mo14295h(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* renamed from: f */
    public boolean mo14293f(int i, int i2, int i3, int i4, @ts2 int[] iArr) {
        return mo14295h(i, i2, i3, i4, iArr, 0, (int[]) null);
    }

    /* renamed from: g */
    public boolean mo14294g(int i, int i2, int i3, int i4, @ts2 int[] iArr, int i5) {
        return mo14295h(i, i2, i3, i4, iArr, i5, (int[]) null);
    }

    /* renamed from: h */
    public final boolean mo14295h(int i, int i2, int i3, int i4, @ts2 int[] iArr, int i5, @ts2 int[] iArr2) {
        ViewParent i6;
        int i7;
        int i8;
        int[] iArr3;
        int[] iArr4 = iArr;
        if (!mo14300m() || (i6 = mo14296i(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr4 != null) {
                iArr4[0] = 0;
                iArr4[1] = 0;
            }
            return false;
        }
        if (iArr4 != null) {
            this.f10436a.getLocationInWindow(iArr4);
            i8 = iArr4[0];
            i7 = iArr4[1];
        } else {
            i8 = 0;
            i7 = 0;
        }
        if (iArr2 == null) {
            int[] j = mo14297j();
            j[0] = 0;
            j[1] = 0;
            iArr3 = j;
        } else {
            iArr3 = iArr2;
        }
        ru4.m27065i(i6, this.f10436a, i, i2, i3, i4, i5, iArr3);
        if (iArr4 != null) {
            this.f10436a.getLocationInWindow(iArr4);
            iArr4[0] = iArr4[0] - i8;
            iArr4[1] = iArr4[1] - i7;
        }
        return true;
    }

    /* renamed from: i */
    public final ViewParent mo14296i(int i) {
        if (i == 0) {
            return this.f10437a;
        }
        if (i != 1) {
            return null;
        }
        return this.f10440b;
    }

    /* renamed from: j */
    public final int[] mo14297j() {
        if (this.f10439a == null) {
            this.f10439a = new int[2];
        }
        return this.f10439a;
    }

    /* renamed from: k */
    public boolean mo14298k() {
        return mo14299l(0);
    }

    /* renamed from: l */
    public boolean mo14299l(int i) {
        return mo14296i(i) != null;
    }

    /* renamed from: m */
    public boolean mo14300m() {
        return this.f10438a;
    }

    /* renamed from: n */
    public void mo14301n() {
        jt4.m18870G2(this.f10436a);
    }

    /* renamed from: o */
    public void mo14302o(@mr2 View view) {
        jt4.m18870G2(this.f10436a);
    }

    /* renamed from: p */
    public void mo14303p(boolean z) {
        if (this.f10438a) {
            jt4.m18870G2(this.f10436a);
        }
        this.f10438a = z;
    }

    /* renamed from: q */
    public final void mo14304q(int i, ViewParent viewParent) {
        if (i == 0) {
            this.f10437a = viewParent;
        } else if (i == 1) {
            this.f10440b = viewParent;
        }
    }

    /* renamed from: r */
    public boolean mo14305r(int i) {
        return mo14306s(i, 0);
    }

    /* renamed from: s */
    public boolean mo14306s(int i, int i2) {
        if (mo14299l(i2)) {
            return true;
        }
        if (!mo14300m()) {
            return false;
        }
        View view = this.f10436a;
        for (ViewParent parent = this.f10436a.getParent(); parent != null; parent = parent.getParent()) {
            if (ru4.m27069m(parent, view, this.f10436a, i, i2)) {
                mo14304q(i2, parent);
                ru4.m27067k(parent, view, this.f10436a, i, i2);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    /* renamed from: t */
    public void mo14307t() {
        mo14308u(0);
    }

    /* renamed from: u */
    public void mo14308u(int i) {
        ViewParent i2 = mo14296i(i);
        if (i2 != null) {
            ru4.m27071o(i2, this.f10436a, i);
            mo14304q(i, (ViewParent) null);
        }
    }
}
