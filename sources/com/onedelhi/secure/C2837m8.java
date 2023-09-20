package com.onedelhi.secure;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.za3;

@hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
/* renamed from: com.onedelhi.secure.m8 */
public class C2837m8 {

    /* renamed from: a */
    public int f15944a = 0;
    @mr2

    /* renamed from: a */
    public final ImageView f15945a;

    /* renamed from: a */
    public ye4 f15946a;

    /* renamed from: b */
    public ye4 f15947b;

    /* renamed from: c */
    public ye4 f15948c;

    public C2837m8(@mr2 ImageView imageView) {
        this.f15945a = imageView;
    }

    /* renamed from: a */
    public final boolean mo20169a(@mr2 Drawable drawable) {
        if (this.f15948c == null) {
            this.f15948c = new ye4();
        }
        ye4 ye4 = this.f15948c;
        ye4.mo27430a();
        ColorStateList a = fp1.m15157a(this.f15945a);
        if (a != null) {
            ye4.f23032b = true;
            ye4.f23029a = a;
        }
        PorterDuff.Mode b = fp1.m15158b(this.f15945a);
        if (b != null) {
            ye4.f23031a = true;
            ye4.f23030a = b;
        }
        if (!ye4.f23032b && !ye4.f23031a) {
            return false;
        }
        C2416i8.m17333j(drawable, ye4, this.f15945a.getDrawableState());
        return true;
    }

    /* renamed from: b */
    public void mo20170b() {
        if (this.f15945a.getDrawable() != null) {
            this.f15945a.getDrawable().setLevel(this.f15944a);
        }
    }

    /* renamed from: c */
    public void mo20171c() {
        Drawable drawable = this.f15945a.getDrawable();
        if (drawable != null) {
            jp0.m18731b(drawable);
        }
        if (drawable == null) {
            return;
        }
        if (!mo20181m() || !mo20169a(drawable)) {
            ye4 ye4 = this.f15947b;
            if (ye4 != null) {
                C2416i8.m17333j(drawable, ye4, this.f15945a.getDrawableState());
                return;
            }
            ye4 ye42 = this.f15946a;
            if (ye42 != null) {
                C2416i8.m17333j(drawable, ye42, this.f15945a.getDrawableState());
            }
        }
    }

    /* renamed from: d */
    public ColorStateList mo20172d() {
        ye4 ye4 = this.f15947b;
        if (ye4 != null) {
            return ye4.f23029a;
        }
        return null;
    }

    /* renamed from: e */
    public PorterDuff.Mode mo20173e() {
        ye4 ye4 = this.f15947b;
        if (ye4 != null) {
            return ye4.f23030a;
        }
        return null;
    }

    /* renamed from: f */
    public boolean mo20174f() {
        return !(this.f15945a.getBackground() instanceof RippleDrawable);
    }

    /* renamed from: g */
    public void mo20175g(AttributeSet attributeSet, int i) {
        int u;
        Context context = this.f15945a.getContext();
        int[] iArr = za3.C4068m.AppCompatImageView;
        af4 G = af4.m11110G(context, attributeSet, iArr, i, 0);
        ImageView imageView = this.f15945a;
        jt4.m19033z1(imageView, imageView.getContext(), iArr, attributeSet, G.mo13025B(), i, 0);
        try {
            Drawable drawable = this.f15945a.getDrawable();
            if (!(drawable != null || (u = G.mo13050u(za3.C4068m.AppCompatImageView_srcCompat, -1)) == -1 || (drawable = C3129p8.m24529b(this.f15945a.getContext(), u)) == null)) {
                this.f15945a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                jp0.m18731b(drawable);
            }
            int i2 = za3.C4068m.AppCompatImageView_tint;
            if (G.mo13026C(i2)) {
                fp1.m15159c(this.f15945a, G.mo13033d(i2));
            }
            int i3 = za3.C4068m.AppCompatImageView_tintMode;
            if (G.mo13026C(i3)) {
                fp1.m15160d(this.f15945a, jp0.m18734e(G.mo13044o(i3, -1), (PorterDuff.Mode) null));
            }
        } finally {
            G.mo13029I();
        }
    }

    /* renamed from: h */
    public void mo20176h(@mr2 Drawable drawable) {
        this.f15944a = drawable.getLevel();
    }

    /* renamed from: i */
    public void mo20177i(int i) {
        if (i != 0) {
            Drawable b = C3129p8.m24529b(this.f15945a.getContext(), i);
            if (b != null) {
                jp0.m18731b(b);
            }
            this.f15945a.setImageDrawable(b);
        } else {
            this.f15945a.setImageDrawable((Drawable) null);
        }
        mo20171c();
    }

    /* renamed from: j */
    public void mo20178j(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f15946a == null) {
                this.f15946a = new ye4();
            }
            ye4 ye4 = this.f15946a;
            ye4.f23029a = colorStateList;
            ye4.f23032b = true;
        } else {
            this.f15946a = null;
        }
        mo20171c();
    }

    /* renamed from: k */
    public void mo20179k(ColorStateList colorStateList) {
        if (this.f15947b == null) {
            this.f15947b = new ye4();
        }
        ye4 ye4 = this.f15947b;
        ye4.f23029a = colorStateList;
        ye4.f23032b = true;
        mo20171c();
    }

    /* renamed from: l */
    public void mo20180l(PorterDuff.Mode mode) {
        if (this.f15947b == null) {
            this.f15947b = new ye4();
        }
        ye4 ye4 = this.f15947b;
        ye4.f23030a = mode;
        ye4.f23031a = true;
        mo20171c();
    }

    /* renamed from: m */
    public final boolean mo20181m() {
        int i = Build.VERSION.SDK_INT;
        return i > 21 ? this.f15946a != null : i == 21;
    }
}
