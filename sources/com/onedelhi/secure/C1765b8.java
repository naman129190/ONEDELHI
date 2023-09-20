package com.onedelhi.secure;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import com.onedelhi.secure.za3;

/* renamed from: com.onedelhi.secure.b8 */
public class C1765b8 {

    /* renamed from: a */
    public int f9729a = -1;
    @mr2

    /* renamed from: a */
    public final View f9730a;

    /* renamed from: a */
    public final C2416i8 f9731a;

    /* renamed from: a */
    public ye4 f9732a;

    /* renamed from: b */
    public ye4 f9733b;

    /* renamed from: c */
    public ye4 f9734c;

    public C1765b8(@mr2 View view) {
        this.f9730a = view;
        this.f9731a = C2416i8.m17330b();
    }

    /* renamed from: a */
    public final boolean mo13519a(@mr2 Drawable drawable) {
        if (this.f9734c == null) {
            this.f9734c = new ye4();
        }
        ye4 ye4 = this.f9734c;
        ye4.mo27430a();
        ColorStateList N = jt4.m18892N(this.f9730a);
        if (N != null) {
            ye4.f23032b = true;
            ye4.f23029a = N;
        }
        PorterDuff.Mode O = jt4.m18895O(this.f9730a);
        if (O != null) {
            ye4.f23031a = true;
            ye4.f23030a = O;
        }
        if (!ye4.f23032b && !ye4.f23031a) {
            return false;
        }
        C2416i8.m17333j(drawable, ye4, this.f9730a.getDrawableState());
        return true;
    }

    /* renamed from: b */
    public void mo13520b() {
        Drawable background = this.f9730a.getBackground();
        if (background == null) {
            return;
        }
        if (!mo13529k() || !mo13519a(background)) {
            ye4 ye4 = this.f9733b;
            if (ye4 != null) {
                C2416i8.m17333j(background, ye4, this.f9730a.getDrawableState());
                return;
            }
            ye4 ye42 = this.f9732a;
            if (ye42 != null) {
                C2416i8.m17333j(background, ye42, this.f9730a.getDrawableState());
            }
        }
    }

    /* renamed from: c */
    public ColorStateList mo13521c() {
        ye4 ye4 = this.f9733b;
        if (ye4 != null) {
            return ye4.f23029a;
        }
        return null;
    }

    /* renamed from: d */
    public PorterDuff.Mode mo13522d() {
        ye4 ye4 = this.f9733b;
        if (ye4 != null) {
            return ye4.f23030a;
        }
        return null;
    }

    /* renamed from: e */
    public void mo13523e(@ts2 AttributeSet attributeSet, int i) {
        Context context = this.f9730a.getContext();
        int[] iArr = za3.C4068m.ViewBackgroundHelper;
        af4 G = af4.m11110G(context, attributeSet, iArr, i, 0);
        View view = this.f9730a;
        jt4.m19033z1(view, view.getContext(), iArr, attributeSet, G.mo13025B(), i, 0);
        try {
            int i2 = za3.C4068m.ViewBackgroundHelper_android_background;
            if (G.mo13026C(i2)) {
                this.f9729a = G.mo13050u(i2, -1);
                ColorStateList f = this.f9731a.mo17664f(this.f9730a.getContext(), this.f9729a);
                if (f != null) {
                    mo13526h(f);
                }
            }
            int i3 = za3.C4068m.ViewBackgroundHelper_backgroundTint;
            if (G.mo13026C(i3)) {
                jt4.m18881J1(this.f9730a, G.mo13033d(i3));
            }
            int i4 = za3.C4068m.ViewBackgroundHelper_backgroundTintMode;
            if (G.mo13026C(i4)) {
                jt4.m18885K1(this.f9730a, jp0.m18734e(G.mo13044o(i4, -1), (PorterDuff.Mode) null));
            }
        } finally {
            G.mo13029I();
        }
    }

    /* renamed from: f */
    public void mo13524f(Drawable drawable) {
        this.f9729a = -1;
        mo13526h((ColorStateList) null);
        mo13520b();
    }

    /* renamed from: g */
    public void mo13525g(int i) {
        this.f9729a = i;
        C2416i8 i8Var = this.f9731a;
        mo13526h(i8Var != null ? i8Var.mo17664f(this.f9730a.getContext(), i) : null);
        mo13520b();
    }

    /* renamed from: h */
    public void mo13526h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f9732a == null) {
                this.f9732a = new ye4();
            }
            ye4 ye4 = this.f9732a;
            ye4.f23029a = colorStateList;
            ye4.f23032b = true;
        } else {
            this.f9732a = null;
        }
        mo13520b();
    }

    /* renamed from: i */
    public void mo13527i(ColorStateList colorStateList) {
        if (this.f9733b == null) {
            this.f9733b = new ye4();
        }
        ye4 ye4 = this.f9733b;
        ye4.f23029a = colorStateList;
        ye4.f23032b = true;
        mo13520b();
    }

    /* renamed from: j */
    public void mo13528j(PorterDuff.Mode mode) {
        if (this.f9733b == null) {
            this.f9733b = new ye4();
        }
        ye4 ye4 = this.f9733b;
        ye4.f23030a = mode;
        ye4.f23031a = true;
        mo13520b();
    }

    /* renamed from: k */
    public final boolean mo13529k() {
        int i = Build.VERSION.SDK_INT;
        return i > 21 ? this.f9732a != null : i == 21;
    }
}
