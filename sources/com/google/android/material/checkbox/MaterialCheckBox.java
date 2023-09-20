package com.google.android.material.checkbox;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.onedelhi.secure.C1748b7;
import com.onedelhi.secure.C2218g6;
import com.onedelhi.secure.C3129p8;
import com.onedelhi.secure.af4;
import com.onedelhi.secure.c40;
import com.onedelhi.secure.dp0;
import com.onedelhi.secure.e54;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.kp0;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.oe2;
import com.onedelhi.secure.pv4;
import com.onedelhi.secure.sj3;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.wo0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class MaterialCheckBox extends AppCompatCheckBox {

    /* renamed from: a */
    public static final int[][] f8031a;

    /* renamed from: b */
    public static final int[] f8032b = {fd3.C2153c.state_indeterminate};

    /* renamed from: c */
    public static final int[] f8033c;

    /* renamed from: o */
    public static final int f8034o = fd3.C2164n.Widget_MaterialComponents_CompoundButton_CheckBox;

    /* renamed from: p */
    public static final int f8035p = 0;

    /* renamed from: q */
    public static final int f8036q = 1;

    /* renamed from: r */
    public static final int f8037r = 2;
    @SuppressLint({"DiscouragedApi"})

    /* renamed from: s */
    public static final int f8038s = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    @ts2

    /* renamed from: a */
    public ColorStateList f8039a;
    @mr2

    /* renamed from: a */
    public PorterDuff.Mode f8040a;
    @ts2

    /* renamed from: a */
    public Drawable f8041a;
    @ts2

    /* renamed from: a */
    public CompoundButton.OnCheckedChangeListener f8042a;
    @ts2

    /* renamed from: a */
    public final C1748b7 f8043a;

    /* renamed from: a */
    public final C2218g6.C2219a f8044a;
    @ts2

    /* renamed from: a */
    public CharSequence f8045a;
    @mr2

    /* renamed from: a */
    public final LinkedHashSet<C1538d> f8046a;

    /* renamed from: a */
    public int[] f8047a;
    @ts2

    /* renamed from: b */
    public ColorStateList f8048b;
    @ts2

    /* renamed from: b */
    public Drawable f8049b;
    @ts2

    /* renamed from: b */
    public CharSequence f8050b;
    @mr2

    /* renamed from: b */
    public final LinkedHashSet<C1537c> f8051b;

    /* renamed from: b */
    public boolean f8052b;
    @ts2

    /* renamed from: c */
    public ColorStateList f8053c;

    /* renamed from: c */
    public boolean f8054c;

    /* renamed from: d */
    public boolean f8055d;

    /* renamed from: e */
    public boolean f8056e;

    /* renamed from: f */
    public boolean f8057f;

    /* renamed from: n */
    public int f8058n;

    /* renamed from: com.google.android.material.checkbox.MaterialCheckBox$a */
    public class C1535a extends C2218g6.C2219a {
        public C1535a() {
        }

        /* renamed from: b */
        public void mo11537b(Drawable drawable) {
            super.mo11537b(drawable);
            ColorStateList colorStateList = MaterialCheckBox.this.f8048b;
            if (colorStateList != null) {
                wo0.m30986o(drawable, colorStateList);
            }
        }

        /* renamed from: c */
        public void mo11538c(Drawable drawable) {
            super.mo11538c(drawable);
            MaterialCheckBox materialCheckBox = MaterialCheckBox.this;
            ColorStateList colorStateList = materialCheckBox.f8048b;
            if (colorStateList != null) {
                wo0.m30985n(drawable, colorStateList.getColorForState(materialCheckBox.f8047a, MaterialCheckBox.this.f8048b.getDefaultColor()));
            }
        }
    }

    @hl3({hl3.C2354a.f13187b})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.checkbox.MaterialCheckBox$b */
    public @interface C1536b {
    }

    /* renamed from: com.google.android.material.checkbox.MaterialCheckBox$c */
    public interface C1537c {
        /* renamed from: a */
        void mo11539a(@mr2 MaterialCheckBox materialCheckBox, int i);
    }

    /* renamed from: com.google.android.material.checkbox.MaterialCheckBox$d */
    public interface C1538d {
        /* renamed from: a */
        void mo11540a(@mr2 MaterialCheckBox materialCheckBox, boolean z);
    }

    /* renamed from: com.google.android.material.checkbox.MaterialCheckBox$e */
    public static class C1539e extends View.BaseSavedState {
        @mr2
        public static final Parcelable.Creator<C1539e> CREATOR = new C1540a();

        /* renamed from: n */
        public int f8060n;

        /* renamed from: com.google.android.material.checkbox.MaterialCheckBox$e$a */
        public class C1540a implements Parcelable.Creator<C1539e> {
            /* renamed from: a */
            public C1539e createFromParcel(Parcel parcel) {
                return new C1539e(parcel, (C1535a) null);
            }

            /* renamed from: b */
            public C1539e[] newArray(int i) {
                return new C1539e[i];
            }
        }

        public C1539e(Parcel parcel) {
            super(parcel);
            this.f8060n = ((Integer) parcel.readValue(getClass().getClassLoader())).intValue();
        }

        public /* synthetic */ C1539e(Parcel parcel, C1535a aVar) {
            this(parcel);
        }

        public C1539e(Parcelable parcelable) {
            super(parcelable);
        }

        @mr2
        /* renamed from: a */
        public final String mo11541a() {
            int i = this.f8060n;
            return i != 1 ? i != 2 ? "unchecked" : "indeterminate" : "checked";
        }

        @mr2
        public String toString() {
            return "MaterialCheckBox.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " CheckedState=" + mo11541a() + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Integer.valueOf(this.f8060n));
        }
    }

    static {
        int i = fd3.C2153c.state_error;
        f8033c = new int[]{i};
        f8031a = new int[][]{new int[]{16842910, i}, new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    }

    public MaterialCheckBox(Context context) {
        this(context, (AttributeSet) null);
    }

    public MaterialCheckBox(Context context, @ts2 AttributeSet attributeSet) {
        this(context, attributeSet, fd3.C2153c.checkboxStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialCheckBox(android.content.Context r9, @com.onedelhi.secure.ts2 android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            int r4 = f8034o
            android.content.Context r9 = com.onedelhi.secure.hf2.m50488c(r9, r10, r11, r4)
            r8.<init>(r9, r10, r11)
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r8.f8046a = r9
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r8.f8051b = r9
            android.content.Context r9 = r8.getContext()
            int r0 = com.onedelhi.secure.fd3.C2157g.mtrl_checkbox_button_checked_unchecked
            com.onedelhi.secure.b7 r9 = com.onedelhi.secure.C1748b7.m11579e(r9, r0)
            r8.f8043a = r9
            com.google.android.material.checkbox.MaterialCheckBox$a r9 = new com.google.android.material.checkbox.MaterialCheckBox$a
            r9.<init>()
            r8.f8044a = r9
            android.content.Context r9 = r8.getContext()
            android.graphics.drawable.Drawable r0 = com.onedelhi.secure.c40.m12287a(r8)
            r8.f8041a = r0
            android.content.res.ColorStateList r0 = r8.getSuperButtonTintList()
            r8.f8048b = r0
            r6 = 0
            r8.setSupportButtonTintList(r6)
            int[] r2 = com.onedelhi.secure.fd3.C2165o.MaterialCheckBox
            r7 = 0
            int[] r5 = new int[r7]
            r0 = r9
            r1 = r10
            r3 = r11
            com.onedelhi.secure.af4 r10 = com.onedelhi.secure.ob4.m59196l(r0, r1, r2, r3, r4, r5)
            int r11 = com.onedelhi.secure.fd3.C2165o.MaterialCheckBox_buttonIcon
            android.graphics.drawable.Drawable r11 = r10.mo13037h(r11)
            r8.f8049b = r11
            android.graphics.drawable.Drawable r11 = r8.f8041a
            r0 = 1
            if (r11 == 0) goto L_0x007c
            boolean r11 = com.onedelhi.secure.ob4.m59192h(r9)
            if (r11 == 0) goto L_0x007c
            boolean r11 = r8.mo11502i(r10)
            if (r11 == 0) goto L_0x007c
            super.setButtonDrawable((android.graphics.drawable.Drawable) r6)
            int r11 = com.onedelhi.secure.fd3.C2157g.mtrl_checkbox_button
            android.graphics.drawable.Drawable r11 = com.onedelhi.secure.C3129p8.m24529b(r9, r11)
            r8.f8041a = r11
            r8.f8056e = r0
            android.graphics.drawable.Drawable r11 = r8.f8049b
            if (r11 != 0) goto L_0x007c
            int r11 = com.onedelhi.secure.fd3.C2157g.mtrl_checkbox_button_icon
            android.graphics.drawable.Drawable r11 = com.onedelhi.secure.C3129p8.m24529b(r9, r11)
            r8.f8049b = r11
        L_0x007c:
            int r11 = com.onedelhi.secure.fd3.C2165o.MaterialCheckBox_buttonIconTint
            android.content.res.ColorStateList r9 = com.onedelhi.secure.af2.m38611b(r9, r10, r11)
            r8.f8053c = r9
            int r9 = com.onedelhi.secure.fd3.C2165o.MaterialCheckBox_buttonIconTintMode
            r11 = -1
            int r9 = r10.mo13044o(r9, r11)
            android.graphics.PorterDuff$Mode r11 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r9 = com.onedelhi.secure.pv4.m61673m(r9, r11)
            r8.f8040a = r9
            int r9 = com.onedelhi.secure.fd3.C2165o.MaterialCheckBox_useMaterialThemeColors
            boolean r9 = r10.mo13030a(r9, r7)
            r8.f8052b = r9
            int r9 = com.onedelhi.secure.fd3.C2165o.MaterialCheckBox_centerIfNoTextEnabled
            boolean r9 = r10.mo13030a(r9, r0)
            r8.f8054c = r9
            int r9 = com.onedelhi.secure.fd3.C2165o.MaterialCheckBox_errorShown
            boolean r9 = r10.mo13030a(r9, r7)
            r8.f8055d = r9
            int r9 = com.onedelhi.secure.fd3.C2165o.MaterialCheckBox_errorAccessibilityLabel
            java.lang.CharSequence r9 = r10.mo13053x(r9)
            r8.f8045a = r9
            int r9 = com.onedelhi.secure.fd3.C2165o.MaterialCheckBox_checkedState
            boolean r11 = r10.mo13026C(r9)
            if (r11 == 0) goto L_0x00c2
            int r9 = r10.mo13044o(r9, r7)
            r8.setCheckedState(r9)
        L_0x00c2:
            r10.mo13029I()
            r8.mo11507n()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.checkbox.MaterialCheckBox.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @mr2
    private String getButtonStateDescription() {
        Resources resources;
        int i;
        int i2 = this.f8058n;
        if (i2 == 1) {
            resources = getResources();
            i = fd3.C2163m.mtrl_checkbox_state_description_checked;
        } else if (i2 == 0) {
            resources = getResources();
            i = fd3.C2163m.mtrl_checkbox_state_description_unchecked;
        } else {
            resources = getResources();
            i = fd3.C2163m.mtrl_checkbox_state_description_indeterminate;
        }
        return resources.getString(i);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f8039a == null) {
            int[][] iArr = f8031a;
            int[] iArr2 = new int[iArr.length];
            int d = oe2.m23718d(this, fd3.C2153c.colorControlActivated);
            int d2 = oe2.m23718d(this, fd3.C2153c.colorError);
            int d3 = oe2.m23718d(this, fd3.C2153c.colorSurface);
            int d4 = oe2.m23718d(this, fd3.C2153c.colorOnSurface);
            iArr2[0] = oe2.m23728n(d3, d2, 1.0f);
            iArr2[1] = oe2.m23728n(d3, d, 1.0f);
            iArr2[2] = oe2.m23728n(d3, d4, 0.54f);
            iArr2[3] = oe2.m23728n(d3, d4, 0.38f);
            iArr2[4] = oe2.m23728n(d3, d4, 0.38f);
            this.f8039a = new ColorStateList(iArr, iArr2);
        }
        return this.f8039a;
    }

    @ts2
    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f8048b;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ void m9784m() {
        this.f8049b.jumpToCurrentState();
    }

    /* renamed from: e */
    public void mo11491e(@mr2 C1537c cVar) {
        this.f8051b.add(cVar);
    }

    /* renamed from: f */
    public void mo11492f(@mr2 C1538d dVar) {
        this.f8046a.add(dVar);
    }

    /* renamed from: g */
    public void mo11493g() {
        this.f8051b.clear();
    }

    @ts2
    public Drawable getButtonDrawable() {
        return this.f8041a;
    }

    @ts2
    public Drawable getButtonIconDrawable() {
        return this.f8049b;
    }

    @ts2
    public ColorStateList getButtonIconTintList() {
        return this.f8053c;
    }

    @mr2
    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f8040a;
    }

    @ts2
    public ColorStateList getButtonTintList() {
        return this.f8048b;
    }

    public int getCheckedState() {
        return this.f8058n;
    }

    @ts2
    public CharSequence getErrorAccessibilityLabel() {
        return this.f8045a;
    }

    /* renamed from: h */
    public void mo11501h() {
        this.f8046a.clear();
    }

    /* renamed from: i */
    public final boolean mo11502i(af4 af4) {
        return af4.mo13050u(fd3.C2165o.MaterialCheckBox_android_button, 0) == f8038s && af4.mo13050u(fd3.C2165o.MaterialCheckBox_buttonCompat, 0) == 0;
    }

    public boolean isChecked() {
        return this.f8058n == 1;
    }

    /* renamed from: j */
    public boolean mo11504j() {
        return this.f8054c;
    }

    /* renamed from: k */
    public boolean mo11505k() {
        return this.f8055d;
    }

    /* renamed from: l */
    public boolean mo11506l() {
        return this.f8052b;
    }

    /* renamed from: n */
    public final void mo11507n() {
        this.f8041a = kp0.m19968c(this.f8041a, this.f8048b, c40.m12289c(this));
        this.f8049b = kp0.m19968c(this.f8049b, this.f8053c, this.f8040a);
        mo11517r();
        mo11518s();
        super.setButtonDrawable(kp0.m19966a(this.f8041a, this.f8049b));
        refreshDrawableState();
    }

    /* renamed from: o */
    public void mo11508o(@mr2 C1537c cVar) {
        this.f8051b.remove(cVar);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f8052b && this.f8048b == null && this.f8053c == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, f8032b);
        }
        if (mo11505k()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, f8033c);
        }
        this.f8047a = kp0.m19970e(onCreateDrawableState);
        mo11535t();
        return onCreateDrawableState;
    }

    public void onDraw(Canvas canvas) {
        Drawable a;
        if (!this.f8054c || !TextUtils.isEmpty(getText()) || (a = c40.m12287a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - a.getIntrinsicWidth()) / 2) * (pv4.m61672l(this) ? -1 : 1);
        int save = canvas.save();
        canvas.translate((float) width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
        if (getBackground() != null) {
            Rect bounds = a.getBounds();
            wo0.m30983l(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    public void onInitializeAccessibilityNodeInfo(@ts2 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && mo11505k()) {
            accessibilityNodeInfo.setText(accessibilityNodeInfo.getText() + ", " + this.f8045a);
        }
    }

    public void onRestoreInstanceState(@ts2 Parcelable parcelable) {
        if (!(parcelable instanceof C1539e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1539e eVar = (C1539e) parcelable;
        super.onRestoreInstanceState(eVar.getSuperState());
        setCheckedState(eVar.f8060n);
    }

    @ts2
    public Parcelable onSaveInstanceState() {
        C1539e eVar = new C1539e(super.onSaveInstanceState());
        eVar.f8060n = getCheckedState();
        return eVar;
    }

    /* renamed from: p */
    public void mo11515p(@mr2 C1538d dVar) {
        this.f8046a.remove(dVar);
    }

    /* renamed from: q */
    public final void mo11516q() {
        if (Build.VERSION.SDK_INT >= 30 && this.f8050b == null) {
            super.setStateDescription(getButtonStateDescription());
        }
    }

    /* renamed from: r */
    public final void mo11517r() {
        C1748b7 b7Var;
        if (this.f8056e) {
            C1748b7 b7Var2 = this.f8043a;
            if (b7Var2 != null) {
                b7Var2.mo13429d(this.f8044a);
                this.f8043a.mo13426c(this.f8044a);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                Drawable drawable = this.f8041a;
                if ((drawable instanceof AnimatedStateListDrawable) && (b7Var = this.f8043a) != null) {
                    int i = fd3.C2158h.checked;
                    int i2 = fd3.C2158h.unchecked;
                    ((AnimatedStateListDrawable) drawable).addTransition(i, i2, b7Var, false);
                    ((AnimatedStateListDrawable) this.f8041a).addTransition(fd3.C2158h.indeterminate, i2, this.f8043a, false);
                }
            }
        }
    }

    /* renamed from: s */
    public final void mo11518s() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        Drawable drawable = this.f8041a;
        if (!(drawable == null || (colorStateList2 = this.f8048b) == null)) {
            wo0.m30986o(drawable, colorStateList2);
        }
        Drawable drawable2 = this.f8049b;
        if (drawable2 != null && (colorStateList = this.f8053c) != null) {
            wo0.m30986o(drawable2, colorStateList);
        }
    }

    public void setButtonDrawable(@dp0 int i) {
        setButtonDrawable(C3129p8.m24529b(getContext(), i));
    }

    public void setButtonDrawable(@ts2 Drawable drawable) {
        this.f8041a = drawable;
        this.f8056e = false;
        mo11507n();
    }

    public void setButtonIconDrawable(@ts2 Drawable drawable) {
        this.f8049b = drawable;
        mo11507n();
    }

    public void setButtonIconDrawableResource(@dp0 int i) {
        setButtonIconDrawable(C3129p8.m24529b(getContext(), i));
    }

    public void setButtonIconTintList(@ts2 ColorStateList colorStateList) {
        if (this.f8053c != colorStateList) {
            this.f8053c = colorStateList;
            mo11507n();
        }
    }

    public void setButtonIconTintMode(@mr2 PorterDuff.Mode mode) {
        if (this.f8040a != mode) {
            this.f8040a = mode;
            mo11507n();
        }
    }

    public void setButtonTintList(@ts2 ColorStateList colorStateList) {
        if (this.f8048b != colorStateList) {
            this.f8048b = colorStateList;
            mo11507n();
        }
    }

    public void setButtonTintMode(@ts2 PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        mo11507n();
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.f8054c = z;
    }

    public void setChecked(boolean z) {
        setCheckedState(z ? 1 : 0);
    }

    public void setCheckedState(int i) {
        AutofillManager autofillManager;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f8058n != i) {
            this.f8058n = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            mo11516q();
            if (!this.f8057f) {
                this.f8057f = true;
                LinkedHashSet<C1537c> linkedHashSet = this.f8051b;
                if (linkedHashSet != null) {
                    Iterator it = linkedHashSet.iterator();
                    while (it.hasNext()) {
                        ((C1537c) it.next()).mo11539a(this, this.f8058n);
                    }
                }
                if (!(this.f8058n == 2 || (onCheckedChangeListener = this.f8042a) == null)) {
                    onCheckedChangeListener.onCheckedChanged(this, isChecked());
                }
                if (Build.VERSION.SDK_INT >= 26 && (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) != null) {
                    autofillManager.notifyValueChanged(this);
                }
                this.f8057f = false;
            }
        }
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        mo11535t();
    }

    public void setErrorAccessibilityLabel(@ts2 CharSequence charSequence) {
        this.f8045a = charSequence;
    }

    public void setErrorAccessibilityLabelResource(@e54 int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z) {
        if (this.f8055d != z) {
            this.f8055d = z;
            refreshDrawableState();
            Iterator it = this.f8046a.iterator();
            while (it.hasNext()) {
                ((C1538d) it.next()).mo11540a(this, this.f8055d);
            }
        }
    }

    public void setOnCheckedChangeListener(@ts2 CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f8042a = onCheckedChangeListener;
    }

    @sj3(30)
    public void setStateDescription(@ts2 CharSequence charSequence) {
        this.f8050b = charSequence;
        if (charSequence == null) {
            mo11516q();
        } else {
            super.setStateDescription(charSequence);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f8052b = z;
        c40.m12290d(this, z ? getMaterialThemeColorsTintList() : null);
    }

    /* renamed from: t */
    public final void mo11535t() {
    }

    public void toggle() {
        setChecked(!isChecked());
    }
}
