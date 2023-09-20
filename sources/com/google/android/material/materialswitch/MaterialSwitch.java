package com.google.android.material.materialswitch;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import com.onedelhi.secure.C3129p8;
import com.onedelhi.secure.dp0;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.kp0;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.p10;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.wo0;

public class MaterialSwitch extends SwitchCompat {

    /* renamed from: H */
    public static final int f24051H = fd3.C2164n.Widget_Material3_CompoundButton_MaterialSwitch;

    /* renamed from: d */
    public static final int[] f24052d = {fd3.C2153c.state_with_icon};

    /* renamed from: b */
    public int[] f24053b;
    @mr2

    /* renamed from: c */
    public PorterDuff.Mode f24054c;
    @ts2

    /* renamed from: c */
    public Drawable f24055c;

    /* renamed from: c */
    public int[] f24056c;
    @ts2

    /* renamed from: d */
    public ColorStateList f24057d;
    @mr2

    /* renamed from: d */
    public PorterDuff.Mode f24058d;
    @ts2

    /* renamed from: d */
    public Drawable f24059d;
    @ts2

    /* renamed from: e */
    public ColorStateList f24060e;
    @ts2

    /* renamed from: e */
    public Drawable f24061e;
    @ts2

    /* renamed from: f */
    public ColorStateList f24062f;
    @ts2

    /* renamed from: f */
    public Drawable f24063f;
    @ts2

    /* renamed from: g */
    public ColorStateList f24064g;

    public MaterialSwitch(@mr2 Context context) {
        this(context, (AttributeSet) null);
    }

    public MaterialSwitch(@mr2 Context context, @ts2 AttributeSet attributeSet) {
        this(context, attributeSet, fd3.C2153c.materialSwitchStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialSwitch(@com.onedelhi.secure.mr2 android.content.Context r7, @com.onedelhi.secure.ts2 android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = f24051H
            android.content.Context r7 = com.onedelhi.secure.hf2.m50488c(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            android.content.Context r0 = r6.getContext()
            android.graphics.drawable.Drawable r7 = super.getThumbDrawable()
            r6.f24055c = r7
            android.content.res.ColorStateList r7 = super.getThumbTintList()
            r6.f24057d = r7
            r7 = 0
            super.setThumbTintList(r7)
            android.graphics.drawable.Drawable r1 = super.getTrackDrawable()
            r6.f24061e = r1
            android.content.res.ColorStateList r1 = super.getTrackTintList()
            r6.f24062f = r1
            super.setTrackTintList(r7)
            int[] r2 = com.onedelhi.secure.fd3.C2165o.MaterialSwitch
            r7 = 0
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            com.onedelhi.secure.af4 r8 = com.onedelhi.secure.ob4.m59196l(r0, r1, r2, r3, r4, r5)
            int r9 = com.onedelhi.secure.fd3.C2165o.MaterialSwitch_thumbIcon
            android.graphics.drawable.Drawable r9 = r8.mo13037h(r9)
            r6.f24059d = r9
            int r9 = com.onedelhi.secure.fd3.C2165o.MaterialSwitch_thumbIconTint
            android.content.res.ColorStateList r9 = r8.mo13033d(r9)
            r6.f24060e = r9
            int r9 = com.onedelhi.secure.fd3.C2165o.MaterialSwitch_thumbIconTintMode
            r0 = -1
            int r9 = r8.mo13044o(r9, r0)
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r9 = com.onedelhi.secure.pv4.m61673m(r9, r1)
            r6.f24054c = r9
            int r9 = com.onedelhi.secure.fd3.C2165o.MaterialSwitch_trackDecoration
            android.graphics.drawable.Drawable r9 = r8.mo13037h(r9)
            r6.f24063f = r9
            int r9 = com.onedelhi.secure.fd3.C2165o.MaterialSwitch_trackDecorationTint
            android.content.res.ColorStateList r9 = r8.mo13033d(r9)
            r6.f24064g = r9
            int r9 = com.onedelhi.secure.fd3.C2165o.MaterialSwitch_trackDecorationTintMode
            int r9 = r8.mo13044o(r9, r0)
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r9 = com.onedelhi.secure.pv4.m61673m(r9, r0)
            r6.f24058d = r9
            r8.mo13029I()
            r6.setEnforceSwitchWidth(r7)
            r6.mo28282q()
            r6.mo28283r()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.materialswitch.MaterialSwitch.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* renamed from: s */
    public static void m33602s(@ts2 Drawable drawable, @ts2 ColorStateList colorStateList, @mr2 int[] iArr, @mr2 int[] iArr2, float f) {
        if (drawable != null && colorStateList != null) {
            wo0.m30985n(drawable, p10.m24308i(colorStateList.getColorForState(iArr, 0), colorStateList.getColorForState(iArr2, 0), f));
        }
    }

    @ts2
    public Drawable getThumbDrawable() {
        return this.f24055c;
    }

    @ts2
    public Drawable getThumbIconDrawable() {
        return this.f24059d;
    }

    @ts2
    public ColorStateList getThumbIconTintList() {
        return this.f24060e;
    }

    @mr2
    public PorterDuff.Mode getThumbIconTintMode() {
        return this.f24054c;
    }

    @ts2
    public ColorStateList getThumbTintList() {
        return this.f24057d;
    }

    @ts2
    public Drawable getTrackDecorationDrawable() {
        return this.f24063f;
    }

    @ts2
    public ColorStateList getTrackDecorationTintList() {
        return this.f24064g;
    }

    @mr2
    public PorterDuff.Mode getTrackDecorationTintMode() {
        return this.f24058d;
    }

    @ts2
    public Drawable getTrackDrawable() {
        return this.f24061e;
    }

    @ts2
    public ColorStateList getTrackTintList() {
        return this.f24062f;
    }

    public void invalidate() {
        mo28292t();
        super.invalidate();
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.f24059d != null) {
            CompoundButton.mergeDrawableStates(onCreateDrawableState, f24052d);
        }
        this.f24053b = kp0.m19971f(onCreateDrawableState);
        this.f24056c = kp0.m19970e(onCreateDrawableState);
        return onCreateDrawableState;
    }

    /* renamed from: q */
    public final void mo28282q() {
        this.f24055c = kp0.m19967b(this.f24055c, this.f24057d, getThumbTintMode());
        this.f24059d = kp0.m19967b(this.f24059d, this.f24060e, this.f24054c);
        mo28292t();
        super.setThumbDrawable(kp0.m19966a(this.f24055c, this.f24059d));
        refreshDrawableState();
    }

    /* renamed from: r */
    public final void mo28283r() {
        this.f24061e = kp0.m19967b(this.f24061e, this.f24062f, getTrackTintMode());
        this.f24063f = kp0.m19967b(this.f24063f, this.f24064g, this.f24058d);
        mo28292t();
        Drawable drawable = this.f24061e;
        if (drawable != null && this.f24063f != null) {
            drawable = new LayerDrawable(new Drawable[]{this.f24061e, this.f24063f});
        } else if (drawable == null) {
            drawable = this.f24063f;
        }
        if (drawable != null) {
            setSwitchMinWidth(drawable.getIntrinsicWidth());
        }
        super.setTrackDrawable(drawable);
    }

    public void setThumbDrawable(@ts2 Drawable drawable) {
        this.f24055c = drawable;
        mo28282q();
    }

    public void setThumbIconDrawable(@ts2 Drawable drawable) {
        this.f24059d = drawable;
        mo28282q();
    }

    public void setThumbIconResource(@dp0 int i) {
        setThumbIconDrawable(C3129p8.m24529b(getContext(), i));
    }

    public void setThumbIconTintList(@ts2 ColorStateList colorStateList) {
        this.f24060e = colorStateList;
        mo28282q();
    }

    public void setThumbIconTintMode(@mr2 PorterDuff.Mode mode) {
        this.f24054c = mode;
        mo28282q();
    }

    public void setThumbTintList(@ts2 ColorStateList colorStateList) {
        this.f24057d = colorStateList;
        mo28282q();
    }

    public void setThumbTintMode(@ts2 PorterDuff.Mode mode) {
        super.setThumbTintMode(mode);
        mo28282q();
    }

    public void setTrackDecorationDrawable(@ts2 Drawable drawable) {
        this.f24063f = drawable;
        mo28283r();
    }

    public void setTrackDecorationResource(@dp0 int i) {
        setTrackDecorationDrawable(C3129p8.m24529b(getContext(), i));
    }

    public void setTrackDecorationTintList(@ts2 ColorStateList colorStateList) {
        this.f24064g = colorStateList;
        mo28283r();
    }

    public void setTrackDecorationTintMode(@mr2 PorterDuff.Mode mode) {
        this.f24058d = mode;
        mo28283r();
    }

    public void setTrackDrawable(@ts2 Drawable drawable) {
        this.f24061e = drawable;
        mo28283r();
    }

    public void setTrackTintList(@ts2 ColorStateList colorStateList) {
        this.f24062f = colorStateList;
        mo28283r();
    }

    public void setTrackTintMode(@ts2 PorterDuff.Mode mode) {
        super.setTrackTintMode(mode);
        mo28283r();
    }

    /* renamed from: t */
    public final void mo28292t() {
        if (this.f24057d != null || this.f24060e != null || this.f24062f != null || this.f24064g != null) {
            float thumbPosition = getThumbPosition();
            ColorStateList colorStateList = this.f24057d;
            if (colorStateList != null) {
                m33602s(this.f24055c, colorStateList, this.f24053b, this.f24056c, thumbPosition);
            }
            ColorStateList colorStateList2 = this.f24060e;
            if (colorStateList2 != null) {
                m33602s(this.f24059d, colorStateList2, this.f24053b, this.f24056c, thumbPosition);
            }
            ColorStateList colorStateList3 = this.f24062f;
            if (colorStateList3 != null) {
                m33602s(this.f24061e, colorStateList3, this.f24053b, this.f24056c, thumbPosition);
            }
            ColorStateList colorStateList4 = this.f24064g;
            if (colorStateList4 != null) {
                m33602s(this.f24063f, colorStateList4, this.f24053b, this.f24056c, thumbPosition);
            }
        }
    }
}
