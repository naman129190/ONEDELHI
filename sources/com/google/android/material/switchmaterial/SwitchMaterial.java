package com.google.android.material.switchmaterial;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.appcompat.widget.SwitchCompat;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.js0;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.oe2;
import com.onedelhi.secure.pv4;
import com.onedelhi.secure.ts2;

public class SwitchMaterial extends SwitchCompat {

    /* renamed from: H */
    public static final int f24424H = fd3.C2164n.Widget_MaterialComponents_CompoundButton_Switch;

    /* renamed from: a */
    public static final int[][] f24425a = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    @mr2

    /* renamed from: a */
    public final js0 f24426a;
    @ts2

    /* renamed from: d */
    public ColorStateList f24427d;
    @ts2

    /* renamed from: e */
    public ColorStateList f24428e;

    /* renamed from: i */
    public boolean f24429i;

    public SwitchMaterial(@mr2 Context context) {
        this(context, (AttributeSet) null);
    }

    public SwitchMaterial(@mr2 Context context, @ts2 AttributeSet attributeSet) {
        this(context, attributeSet, fd3.C2153c.switchStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SwitchMaterial(@com.onedelhi.secure.mr2 android.content.Context r7, @com.onedelhi.secure.ts2 android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = f24424H
            android.content.Context r7 = com.onedelhi.secure.hf2.m50488c(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            android.content.Context r0 = r6.getContext()
            com.onedelhi.secure.js0 r7 = new com.onedelhi.secure.js0
            r7.<init>(r0)
            r6.f24426a = r7
            int[] r2 = com.onedelhi.secure.fd3.C2165o.SwitchMaterial
            r7 = 0
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = com.onedelhi.secure.ob4.m59195k(r0, r1, r2, r3, r4, r5)
            int r9 = com.onedelhi.secure.fd3.C2165o.SwitchMaterial_useMaterialThemeColors
            boolean r7 = r8.getBoolean(r9, r7)
            r6.f24429i = r7
            r8.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.switchmaterial.SwitchMaterial.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private ColorStateList getMaterialThemeColorsThumbTintList() {
        if (this.f24427d == null) {
            int d = oe2.m23718d(this, fd3.C2153c.colorSurface);
            int d2 = oe2.m23718d(this, fd3.C2153c.colorControlActivated);
            float dimension = getResources().getDimension(fd3.C2156f.mtrl_switch_thumb_elevation);
            if (this.f24426a.mo18577l()) {
                dimension += pv4.m61670j(this);
            }
            int e = this.f24426a.mo18570e(d, dimension);
            int[][] iArr = f24425a;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = oe2.m23728n(d, d2, 1.0f);
            iArr2[1] = e;
            iArr2[2] = oe2.m23728n(d, d2, 0.38f);
            iArr2[3] = e;
            this.f24427d = new ColorStateList(iArr, iArr2);
        }
        return this.f24427d;
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
        if (this.f24428e == null) {
            int[][] iArr = f24425a;
            int[] iArr2 = new int[iArr.length];
            int d = oe2.m23718d(this, fd3.C2153c.colorSurface);
            int d2 = oe2.m23718d(this, fd3.C2153c.colorControlActivated);
            int d3 = oe2.m23718d(this, fd3.C2153c.colorOnSurface);
            iArr2[0] = oe2.m23728n(d, d2, 0.54f);
            iArr2[1] = oe2.m23728n(d, d3, 0.32f);
            iArr2[2] = oe2.m23728n(d, d2, 0.12f);
            iArr2[3] = oe2.m23728n(d, d3, 0.12f);
            this.f24428e = new ColorStateList(iArr, iArr2);
        }
        return this.f24428e;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f24429i && getThumbTintList() == null) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
        }
        if (this.f24429i && getTrackTintList() == null) {
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        }
    }

    /* renamed from: q */
    public boolean mo28940q() {
        return this.f24429i;
    }

    public void setUseMaterialThemeColors(boolean z) {
        ColorStateList colorStateList;
        this.f24429i = z;
        if (z) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
            colorStateList = getMaterialThemeColorsTrackTintList();
        } else {
            colorStateList = null;
            setThumbTintList((ColorStateList) null);
        }
        setTrackTintList(colorStateList);
    }
}
