package com.onedelhi.secure;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import com.google.android.material.button.MaterialButton;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.hl3;

@hl3({hl3.C2354a.LIBRARY_GROUP})
public class ke2 {
    @C3196px(api = 21)

    /* renamed from: f */
    public static final boolean f14843f = true;

    /* renamed from: g */
    public static final boolean f14844g;

    /* renamed from: a */
    public int f14845a;
    @ts2

    /* renamed from: a */
    public ColorStateList f14846a;
    @ts2

    /* renamed from: a */
    public PorterDuff.Mode f14847a;
    @ts2

    /* renamed from: a */
    public Drawable f14848a;

    /* renamed from: a */
    public LayerDrawable f14849a;

    /* renamed from: a */
    public final MaterialButton f14850a;
    @mr2

    /* renamed from: a */
    public uw3 f14851a;

    /* renamed from: a */
    public boolean f14852a = false;

    /* renamed from: b */
    public int f14853b;
    @ts2

    /* renamed from: b */
    public ColorStateList f14854b;

    /* renamed from: b */
    public boolean f14855b = false;

    /* renamed from: c */
    public int f14856c;
    @ts2

    /* renamed from: c */
    public ColorStateList f14857c;

    /* renamed from: c */
    public boolean f14858c = false;

    /* renamed from: d */
    public int f14859d;

    /* renamed from: d */
    public boolean f14860d;

    /* renamed from: e */
    public int f14861e;

    /* renamed from: e */
    public boolean f14862e = true;

    /* renamed from: f */
    public int f14863f;

    /* renamed from: g */
    public int f14864g;

    static {
        int i = Build.VERSION.SDK_INT;
        boolean z = true;
        if (i > 22) {
            z = false;
        }
        f14844g = z;
    }

    public ke2(MaterialButton materialButton, @mr2 uw3 uw3) {
        this.f14850a = materialButton;
        this.f14851a = uw3;
    }

    /* renamed from: A */
    public void mo19017A(boolean z) {
        this.f14852a = z;
        mo19027K();
    }

    /* renamed from: B */
    public void mo19018B(@ts2 ColorStateList colorStateList) {
        if (this.f14854b != colorStateList) {
            this.f14854b = colorStateList;
            mo19027K();
        }
    }

    /* renamed from: C */
    public void mo19019C(int i) {
        if (this.f14863f != i) {
            this.f14863f = i;
            mo19027K();
        }
    }

    /* renamed from: D */
    public void mo19020D(@ts2 ColorStateList colorStateList) {
        if (this.f14846a != colorStateList) {
            this.f14846a = colorStateList;
            if (mo19034f() != null) {
                wo0.m30986o(mo19034f(), this.f14846a);
            }
        }
    }

    /* renamed from: E */
    public void mo19021E(@ts2 PorterDuff.Mode mode) {
        if (this.f14847a != mode) {
            this.f14847a = mode;
            if (mo19034f() != null && this.f14847a != null) {
                wo0.m30987p(mo19034f(), this.f14847a);
            }
        }
    }

    /* renamed from: F */
    public void mo19022F(boolean z) {
        this.f14862e = z;
    }

    /* renamed from: G */
    public final void mo19023G(@zk0 int i, @zk0 int i2) {
        int k0 = jt4.m18972k0(this.f14850a);
        int paddingTop = this.f14850a.getPaddingTop();
        int j0 = jt4.m18968j0(this.f14850a);
        int paddingBottom = this.f14850a.getPaddingBottom();
        int i3 = this.f14856c;
        int i4 = this.f14859d;
        this.f14859d = i2;
        this.f14856c = i;
        if (!this.f14855b) {
            mo19024H();
        }
        jt4.m18946d2(this.f14850a, k0, (paddingTop + i) - i3, j0, (paddingBottom + i2) - i4);
    }

    /* renamed from: H */
    public final void mo19024H() {
        this.f14850a.setInternalBackground(mo19029a());
        bf2 f = mo19034f();
        if (f != null) {
            f.mo31624n0((float) this.f14864g);
            f.setState(this.f14850a.getDrawableState());
        }
    }

    /* renamed from: I */
    public final void mo19025I(@mr2 uw3 uw3) {
        if (!f14844g || this.f14855b) {
            if (mo19034f() != null) {
                mo19034f().setShapeAppearanceModel(uw3);
            }
            if (mo19042n() != null) {
                mo19042n().setShapeAppearanceModel(uw3);
            }
            if (mo19033e() != null) {
                mo19033e().setShapeAppearanceModel(uw3);
                return;
            }
            return;
        }
        int k0 = jt4.m18972k0(this.f14850a);
        int paddingTop = this.f14850a.getPaddingTop();
        int j0 = jt4.m18968j0(this.f14850a);
        int paddingBottom = this.f14850a.getPaddingBottom();
        mo19024H();
        jt4.m18946d2(this.f14850a, k0, paddingTop, j0, paddingBottom);
    }

    /* renamed from: J */
    public void mo19026J(int i, int i2) {
        Drawable drawable = this.f14848a;
        if (drawable != null) {
            drawable.setBounds(this.f14845a, this.f14856c, i2 - this.f14853b, i - this.f14859d);
        }
    }

    /* renamed from: K */
    public final void mo19027K() {
        bf2 f = mo19034f();
        bf2 n = mo19042n();
        if (f != null) {
            f.mo31568E0((float) this.f14863f, this.f14854b);
            if (n != null) {
                n.mo31566D0((float) this.f14863f, this.f14852a ? oe2.m23718d(this.f14850a, fd3.C2153c.colorSurface) : 0);
            }
        }
    }

    @mr2
    /* renamed from: L */
    public final InsetDrawable mo19028L(Drawable drawable) {
        return new InsetDrawable(drawable, this.f14845a, this.f14856c, this.f14853b, this.f14859d);
    }

    /* renamed from: a */
    public final Drawable mo19029a() {
        bf2 bf2 = new bf2(this.f14851a);
        bf2.mo31599Z(this.f14850a.getContext());
        wo0.m30986o(bf2, this.f14846a);
        PorterDuff.Mode mode = this.f14847a;
        if (mode != null) {
            wo0.m30987p(bf2, mode);
        }
        bf2.mo31568E0((float) this.f14863f, this.f14854b);
        bf2 bf22 = new bf2(this.f14851a);
        bf22.setTint(0);
        bf22.mo31566D0((float) this.f14863f, this.f14852a ? oe2.m23718d(this.f14850a, fd3.C2153c.colorSurface) : 0);
        if (f14843f) {
            bf2 bf23 = new bf2(this.f14851a);
            this.f14848a = bf23;
            wo0.m30985n(bf23, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(um3.m67327e(this.f14857c), mo19028L(new LayerDrawable(new Drawable[]{bf22, bf2})), this.f14848a);
            this.f14849a = rippleDrawable;
            return rippleDrawable;
        }
        tm3 tm3 = new tm3(this.f14851a);
        this.f14848a = tm3;
        wo0.m30986o(tm3, um3.m67327e(this.f14857c));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bf22, bf2, this.f14848a});
        this.f14849a = layerDrawable;
        return mo19028L(layerDrawable);
    }

    /* renamed from: b */
    public int mo19030b() {
        return this.f14861e;
    }

    /* renamed from: c */
    public int mo19031c() {
        return this.f14859d;
    }

    /* renamed from: d */
    public int mo19032d() {
        return this.f14856c;
    }

    @ts2
    /* renamed from: e */
    public nx3 mo19033e() {
        LayerDrawable layerDrawable = this.f14849a;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return (nx3) (this.f14849a.getNumberOfLayers() > 2 ? this.f14849a.getDrawable(2) : this.f14849a.getDrawable(1));
    }

    @ts2
    /* renamed from: f */
    public bf2 mo19034f() {
        return mo19035g(false);
    }

    @ts2
    /* renamed from: g */
    public final bf2 mo19035g(boolean z) {
        LayerDrawable layerDrawable = this.f14849a;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (bf2) (f14843f ? (LayerDrawable) ((InsetDrawable) this.f14849a.getDrawable(0)).getDrawable() : this.f14849a).getDrawable(z ^ true ? 1 : 0);
    }

    @ts2
    /* renamed from: h */
    public ColorStateList mo19036h() {
        return this.f14857c;
    }

    @mr2
    /* renamed from: i */
    public uw3 mo19037i() {
        return this.f14851a;
    }

    @ts2
    /* renamed from: j */
    public ColorStateList mo19038j() {
        return this.f14854b;
    }

    /* renamed from: k */
    public int mo19039k() {
        return this.f14863f;
    }

    /* renamed from: l */
    public ColorStateList mo19040l() {
        return this.f14846a;
    }

    /* renamed from: m */
    public PorterDuff.Mode mo19041m() {
        return this.f14847a;
    }

    @ts2
    /* renamed from: n */
    public final bf2 mo19042n() {
        return mo19035g(true);
    }

    /* renamed from: o */
    public boolean mo19043o() {
        return this.f14855b;
    }

    /* renamed from: p */
    public boolean mo19044p() {
        return this.f14860d;
    }

    /* renamed from: q */
    public boolean mo19045q() {
        return this.f14862e;
    }

    /* renamed from: r */
    public void mo19046r(@mr2 TypedArray typedArray) {
        this.f14845a = typedArray.getDimensionPixelOffset(fd3.C2165o.MaterialButton_android_insetLeft, 0);
        this.f14853b = typedArray.getDimensionPixelOffset(fd3.C2165o.MaterialButton_android_insetRight, 0);
        this.f14856c = typedArray.getDimensionPixelOffset(fd3.C2165o.MaterialButton_android_insetTop, 0);
        this.f14859d = typedArray.getDimensionPixelOffset(fd3.C2165o.MaterialButton_android_insetBottom, 0);
        int i = fd3.C2165o.MaterialButton_cornerRadius;
        if (typedArray.hasValue(i)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(i, -1);
            this.f14861e = dimensionPixelSize;
            mo19054z(this.f14851a.mo45825w((float) dimensionPixelSize));
            this.f14858c = true;
        }
        this.f14863f = typedArray.getDimensionPixelSize(fd3.C2165o.MaterialButton_strokeWidth, 0);
        this.f14847a = pv4.m61673m(typedArray.getInt(fd3.C2165o.MaterialButton_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.f14846a = af2.m38610a(this.f14850a.getContext(), typedArray, fd3.C2165o.MaterialButton_backgroundTint);
        this.f14854b = af2.m38610a(this.f14850a.getContext(), typedArray, fd3.C2165o.MaterialButton_strokeColor);
        this.f14857c = af2.m38610a(this.f14850a.getContext(), typedArray, fd3.C2165o.MaterialButton_rippleColor);
        this.f14860d = typedArray.getBoolean(fd3.C2165o.MaterialButton_android_checkable, false);
        this.f14864g = typedArray.getDimensionPixelSize(fd3.C2165o.MaterialButton_elevation, 0);
        this.f14862e = typedArray.getBoolean(fd3.C2165o.MaterialButton_toggleCheckedStateOnClick, true);
        int k0 = jt4.m18972k0(this.f14850a);
        int paddingTop = this.f14850a.getPaddingTop();
        int j0 = jt4.m18968j0(this.f14850a);
        int paddingBottom = this.f14850a.getPaddingBottom();
        if (typedArray.hasValue(fd3.C2165o.MaterialButton_android_background)) {
            mo19048t();
        } else {
            mo19024H();
        }
        jt4.m18946d2(this.f14850a, k0 + this.f14845a, paddingTop + this.f14856c, j0 + this.f14853b, paddingBottom + this.f14859d);
    }

    /* renamed from: s */
    public void mo19047s(int i) {
        if (mo19034f() != null) {
            mo19034f().setTint(i);
        }
    }

    /* renamed from: t */
    public void mo19048t() {
        this.f14855b = true;
        this.f14850a.setSupportBackgroundTintList(this.f14846a);
        this.f14850a.setSupportBackgroundTintMode(this.f14847a);
    }

    /* renamed from: u */
    public void mo19049u(boolean z) {
        this.f14860d = z;
    }

    /* renamed from: v */
    public void mo19050v(int i) {
        if (!this.f14858c || this.f14861e != i) {
            this.f14861e = i;
            this.f14858c = true;
            mo19054z(this.f14851a.mo45825w((float) i));
        }
    }

    /* renamed from: w */
    public void mo19051w(@zk0 int i) {
        mo19023G(this.f14856c, i);
    }

    /* renamed from: x */
    public void mo19052x(@zk0 int i) {
        mo19023G(i, this.f14859d);
    }

    /* renamed from: y */
    public void mo19053y(@ts2 ColorStateList colorStateList) {
        if (this.f14857c != colorStateList) {
            this.f14857c = colorStateList;
            boolean z = f14843f;
            if (z && (this.f14850a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f14850a.getBackground()).setColor(um3.m67327e(colorStateList));
            } else if (!z && (this.f14850a.getBackground() instanceof tm3)) {
                ((tm3) this.f14850a.getBackground()).setTintList(um3.m67327e(colorStateList));
            }
        }
    }

    /* renamed from: z */
    public void mo19054z(@mr2 uw3 uw3) {
        this.f14851a = uw3;
        mo19025I(uw3);
    }
}
