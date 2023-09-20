package com.google.android.material.radiobutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatRadioButton;
import com.onedelhi.secure.c40;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.oe2;
import com.onedelhi.secure.ts2;

public class MaterialRadioButton extends AppCompatRadioButton {

    /* renamed from: a */
    public static final int[][] f24229a = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: n */
    public static final int f24230n = fd3.C2164n.Widget_MaterialComponents_CompoundButton_RadioButton;
    @ts2

    /* renamed from: a */
    public ColorStateList f24231a;

    /* renamed from: b */
    public boolean f24232b;

    public MaterialRadioButton(@mr2 Context context) {
        this(context, (AttributeSet) null);
    }

    public MaterialRadioButton(@mr2 Context context, @ts2 AttributeSet attributeSet) {
        this(context, attributeSet, fd3.C2153c.radioButtonStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialRadioButton(@com.onedelhi.secure.mr2 android.content.Context r8, @com.onedelhi.secure.ts2 android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = f24230n
            android.content.Context r8 = com.onedelhi.secure.hf2.m50488c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = com.onedelhi.secure.fd3.C2165o.MaterialRadioButton
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.onedelhi.secure.ob4.m59195k(r0, r1, r2, r3, r4, r5)
            int r10 = com.onedelhi.secure.fd3.C2165o.MaterialRadioButton_buttonTint
            boolean r0 = r9.hasValue(r10)
            if (r0 == 0) goto L_0x0028
            android.content.res.ColorStateList r8 = com.onedelhi.secure.af2.m38610a(r8, r9, r10)
            com.onedelhi.secure.c40.m12290d(r7, r8)
        L_0x0028:
            int r8 = com.onedelhi.secure.fd3.C2165o.MaterialRadioButton_useMaterialThemeColors
            boolean r8 = r9.getBoolean(r8, r6)
            r7.f24232b = r8
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.radiobutton.MaterialRadioButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f24231a == null) {
            int d = oe2.m23718d(this, fd3.C2153c.colorControlActivated);
            int d2 = oe2.m23718d(this, fd3.C2153c.colorOnSurface);
            int d3 = oe2.m23718d(this, fd3.C2153c.colorSurface);
            int[][] iArr = f24229a;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = oe2.m23728n(d3, d, 1.0f);
            iArr2[1] = oe2.m23728n(d3, d2, 0.54f);
            iArr2[2] = oe2.m23728n(d3, d2, 0.38f);
            iArr2[3] = oe2.m23728n(d3, d2, 0.38f);
            this.f24231a = new ColorStateList(iArr, iArr2);
        }
        return this.f24231a;
    }

    /* renamed from: a */
    public boolean mo28613a() {
        return this.f24232b;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f24232b && c40.m12288b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f24232b = z;
        c40.m12290d(this, z ? getMaterialThemeColorsTintList() : null);
    }
}
