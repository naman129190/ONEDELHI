package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatButton;
import com.onedelhi.secure.C2015e0;
import com.onedelhi.secure.C3129p8;
import com.onedelhi.secure.cf2;
import com.onedelhi.secure.d10;
import com.onedelhi.secure.dp0;
import com.onedelhi.secure.e83;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.jb4;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.k10;
import com.onedelhi.secure.ke2;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.nx3;
import com.onedelhi.secure.ri1;
import com.onedelhi.secure.sj3;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.uw3;
import com.onedelhi.secure.wo0;
import com.onedelhi.secure.yk0;
import com.onedelhi.secure.zk0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class MaterialButton extends AppCompatButton implements Checkable, nx3 {

    /* renamed from: a */
    public static final int[] f7972a = {16842911};

    /* renamed from: b */
    public static final String f7973b = "MaterialButton";

    /* renamed from: b */
    public static final int[] f7974b = {16842912};

    /* renamed from: s */
    public static final int f7975s = 1;

    /* renamed from: t */
    public static final int f7976t = 2;

    /* renamed from: u */
    public static final int f7977u = 3;

    /* renamed from: v */
    public static final int f7978v = 4;

    /* renamed from: w */
    public static final int f7979w = 16;

    /* renamed from: x */
    public static final int f7980x = 32;

    /* renamed from: y */
    public static final int f7981y = fd3.C2164n.Widget_MaterialComponents_Button;
    @ts2

    /* renamed from: a */
    public ColorStateList f7982a;
    @ts2

    /* renamed from: a */
    public PorterDuff.Mode f7983a;
    @ts2

    /* renamed from: a */
    public Drawable f7984a;
    @ts2

    /* renamed from: a */
    public C1525c f7985a;
    @mr2

    /* renamed from: a */
    public final ke2 f7986a;
    @mr2

    /* renamed from: a */
    public final LinkedHashSet<C1524b> f7987a;

    /* renamed from: b */
    public boolean f7988b;

    /* renamed from: c */
    public boolean f7989c;
    @e83

    /* renamed from: n */
    public int f7990n;
    @e83

    /* renamed from: o */
    public int f7991o;
    @e83

    /* renamed from: p */
    public int f7992p;
    @e83

    /* renamed from: q */
    public int f7993q;

    /* renamed from: r */
    public int f7994r;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.button.MaterialButton$a */
    public @interface C1523a {
    }

    /* renamed from: com.google.android.material.button.MaterialButton$b */
    public interface C1524b {
        /* renamed from: a */
        void mo11399a(MaterialButton materialButton, boolean z);
    }

    /* renamed from: com.google.android.material.button.MaterialButton$c */
    public interface C1525c {
        /* renamed from: a */
        void mo11400a(MaterialButton materialButton, boolean z);
    }

    /* renamed from: com.google.android.material.button.MaterialButton$d */
    public static class C1526d extends C2015e0 {
        public static final Parcelable.Creator<C1526d> CREATOR = new C1527a();

        /* renamed from: b */
        public boolean f7995b;

        /* renamed from: com.google.android.material.button.MaterialButton$d$a */
        public class C1527a implements Parcelable.ClassLoaderCreator<C1526d> {
            @mr2
            /* renamed from: a */
            public C1526d createFromParcel(@mr2 Parcel parcel) {
                return new C1526d(parcel, (ClassLoader) null);
            }

            @mr2
            /* renamed from: b */
            public C1526d createFromParcel(@mr2 Parcel parcel, ClassLoader classLoader) {
                return new C1526d(parcel, classLoader);
            }

            @mr2
            /* renamed from: c */
            public C1526d[] newArray(int i) {
                return new C1526d[i];
            }
        }

        public C1526d(@mr2 Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            mo11401b(parcel);
        }

        public C1526d(Parcelable parcelable) {
            super(parcelable);
        }

        /* renamed from: b */
        public final void mo11401b(@mr2 Parcel parcel) {
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.f7995b = z;
        }

        public void writeToParcel(@mr2 Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f7995b ? 1 : 0);
        }
    }

    public MaterialButton(@mr2 Context context) {
        this(context, (AttributeSet) null);
    }

    public MaterialButton(@mr2 Context context, @ts2 AttributeSet attributeSet) {
        this(context, attributeSet, fd3.C2153c.materialButtonStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialButton(@com.onedelhi.secure.mr2 android.content.Context r9, @com.onedelhi.secure.ts2 android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            int r6 = f7981y
            android.content.Context r9 = com.onedelhi.secure.hf2.m50488c(r9, r10, r11, r6)
            r8.<init>(r9, r10, r11)
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r8.f7987a = r9
            r9 = 0
            r8.f7988b = r9
            r8.f7989c = r9
            android.content.Context r7 = r8.getContext()
            int[] r2 = com.onedelhi.secure.fd3.C2165o.MaterialButton
            int[] r5 = new int[r9]
            r0 = r7
            r1 = r10
            r3 = r11
            r4 = r6
            android.content.res.TypedArray r0 = com.onedelhi.secure.ob4.m59195k(r0, r1, r2, r3, r4, r5)
            int r1 = com.onedelhi.secure.fd3.C2165o.MaterialButton_iconPadding
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.f7993q = r1
            int r1 = com.onedelhi.secure.fd3.C2165o.MaterialButton_iconTintMode
            r2 = -1
            int r1 = r0.getInt(r1, r2)
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r1 = com.onedelhi.secure.pv4.m61673m(r1, r2)
            r8.f7983a = r1
            android.content.Context r1 = r8.getContext()
            int r2 = com.onedelhi.secure.fd3.C2165o.MaterialButton_iconTint
            android.content.res.ColorStateList r1 = com.onedelhi.secure.af2.m38610a(r1, r0, r2)
            r8.f7982a = r1
            android.content.Context r1 = r8.getContext()
            int r2 = com.onedelhi.secure.fd3.C2165o.MaterialButton_icon
            android.graphics.drawable.Drawable r1 = com.onedelhi.secure.af2.m38614e(r1, r0, r2)
            r8.f7984a = r1
            int r1 = com.onedelhi.secure.fd3.C2165o.MaterialButton_iconGravity
            r2 = 1
            int r1 = r0.getInteger(r1, r2)
            r8.f7994r = r1
            int r1 = com.onedelhi.secure.fd3.C2165o.MaterialButton_iconSize
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.f7990n = r1
            com.onedelhi.secure.uw3$b r10 = com.onedelhi.secure.uw3.m67447e(r7, r10, r11, r6)
            com.onedelhi.secure.uw3 r10 = r10.mo45845m()
            com.onedelhi.secure.ke2 r11 = new com.onedelhi.secure.ke2
            r11.<init>(r8, r10)
            r8.f7986a = r11
            r11.mo19046r(r0)
            r0.recycle()
            int r10 = r8.f7993q
            r8.setCompoundDrawablePadding(r10)
            android.graphics.drawable.Drawable r10 = r8.f7984a
            if (r10 == 0) goto L_0x0084
            r9 = 1
        L_0x0084:
            r8.mo11358o(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @mr2
    private String getA11yClassName() {
        return (mo11333f() ? CompoundButton.class : Button.class).getName();
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & ri1.f19871d;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        int i = 0;
        for (int i2 = 0; i2 < lineCount; i2++) {
            i = Math.max(i, mo11332e(mo11331d(i2)));
        }
        return i;
    }

    /* renamed from: a */
    public void mo11329a(@mr2 C1524b bVar) {
        this.f7987a.add(bVar);
    }

    /* renamed from: b */
    public void mo11330b() {
        this.f7987a.clear();
    }

    /* renamed from: d */
    public final CharSequence mo11331d(int i) {
        return getText().subSequence(getLayout().getLineStart(i), getLayout().getLineEnd(i));
    }

    /* renamed from: e */
    public final int mo11332e(CharSequence charSequence) {
        TextPaint paint = getPaint();
        String charSequence2 = charSequence.toString();
        if (getTransformationMethod() != null) {
            charSequence2 = getTransformationMethod().getTransformation(charSequence2, this).toString();
        }
        return Math.min((int) paint.measureText(charSequence2), getLayout().getEllipsizedWidth());
    }

    /* renamed from: f */
    public boolean mo11333f() {
        ke2 ke2 = this.f7986a;
        return ke2 != null && ke2.mo19044p();
    }

    /* renamed from: g */
    public final boolean mo11334g() {
        int i = this.f7994r;
        return i == 3 || i == 4;
    }

    @ts2
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @ts2
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    @e83
    public int getCornerRadius() {
        if (mo11355l()) {
            return this.f7986a.mo19030b();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f7984a;
    }

    public int getIconGravity() {
        return this.f7994r;
    }

    @e83
    public int getIconPadding() {
        return this.f7993q;
    }

    @e83
    public int getIconSize() {
        return this.f7990n;
    }

    public ColorStateList getIconTint() {
        return this.f7982a;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f7983a;
    }

    @zk0
    public int getInsetBottom() {
        return this.f7986a.mo19031c();
    }

    @zk0
    public int getInsetTop() {
        return this.f7986a.mo19032d();
    }

    @ts2
    public ColorStateList getRippleColor() {
        if (mo11355l()) {
            return this.f7986a.mo19036h();
        }
        return null;
    }

    @mr2
    public uw3 getShapeAppearanceModel() {
        if (mo11355l()) {
            return this.f7986a.mo19037i();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (mo11355l()) {
            return this.f7986a.mo19038j();
        }
        return null;
    }

    @e83
    public int getStrokeWidth() {
        if (mo11355l()) {
            return this.f7986a.mo19039k();
        }
        return 0;
    }

    @ts2
    @hl3({hl3.C2354a.f13187b})
    public ColorStateList getSupportBackgroundTintList() {
        return mo11355l() ? this.f7986a.mo19040l() : super.getSupportBackgroundTintList();
    }

    @ts2
    @hl3({hl3.C2354a.f13187b})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return mo11355l() ? this.f7986a.mo19041m() : super.getSupportBackgroundTintMode();
    }

    /* renamed from: h */
    public final boolean mo11350h() {
        int i = this.f7994r;
        return i == 1 || i == 2;
    }

    /* renamed from: i */
    public final boolean mo11351i() {
        int i = this.f7994r;
        return i == 16 || i == 32;
    }

    public boolean isChecked() {
        return this.f7988b;
    }

    /* renamed from: j */
    public final boolean mo11353j() {
        return jt4.m18928Z(this) == 1;
    }

    /* renamed from: k */
    public boolean mo11354k() {
        return this.f7986a.mo19045q();
    }

    /* renamed from: l */
    public final boolean mo11355l() {
        ke2 ke2 = this.f7986a;
        return ke2 != null && !ke2.mo19043o();
    }

    /* renamed from: m */
    public void mo11356m(@mr2 C1524b bVar) {
        this.f7987a.remove(bVar);
    }

    /* renamed from: n */
    public final void mo11357n() {
        if (mo11350h()) {
            jb4.m18336w(this, this.f7984a, (Drawable) null, (Drawable) null, (Drawable) null);
        } else if (mo11334g()) {
            jb4.m18336w(this, (Drawable) null, (Drawable) null, this.f7984a, (Drawable) null);
        } else if (mo11351i()) {
            jb4.m18336w(this, (Drawable) null, this.f7984a, (Drawable) null, (Drawable) null);
        }
    }

    /* renamed from: o */
    public final void mo11358o(boolean z) {
        Drawable drawable = this.f7984a;
        boolean z2 = true;
        if (drawable != null) {
            Drawable mutate = wo0.m30989r(drawable).mutate();
            this.f7984a = mutate;
            wo0.m30986o(mutate, this.f7982a);
            PorterDuff.Mode mode = this.f7983a;
            if (mode != null) {
                wo0.m30987p(this.f7984a, mode);
            }
            int i = this.f7990n;
            if (i == 0) {
                i = this.f7984a.getIntrinsicWidth();
            }
            int i2 = this.f7990n;
            if (i2 == 0) {
                i2 = this.f7984a.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f7984a;
            int i3 = this.f7991o;
            int i4 = this.f7992p;
            drawable2.setBounds(i3, i4, i + i3, i2 + i4);
            this.f7984a.setVisible(true, z);
        }
        if (z) {
            mo11357n();
            return;
        }
        Drawable[] h = jb4.m18321h(this);
        Drawable drawable3 = h[0];
        Drawable drawable4 = h[1];
        Drawable drawable5 = h[2];
        if ((!mo11350h() || drawable3 == this.f7984a) && ((!mo11334g() || drawable5 == this.f7984a) && (!mo11351i() || drawable4 == this.f7984a))) {
            z2 = false;
        }
        if (z2) {
            mo11357n();
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (mo11355l()) {
            cf2.m40865f(this, this.f7986a.mo19034f());
        }
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (mo11333f()) {
            Button.mergeDrawableStates(onCreateDrawableState, f7972a);
        }
        if (isChecked()) {
            Button.mergeDrawableStates(onCreateDrawableState, f7974b);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityEvent(@mr2 AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    public void onInitializeAccessibilityNodeInfo(@mr2 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(mo11333f());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ke2 ke2;
        super.onLayout(z, i, i2, i3, i4);
        if (Build.VERSION.SDK_INT == 21 && (ke2 = this.f7986a) != null) {
            ke2.mo19026J(i4 - i2, i3 - i);
        }
        mo11363p(getMeasuredWidth(), getMeasuredHeight());
    }

    public void onRestoreInstanceState(@ts2 Parcelable parcelable) {
        if (!(parcelable instanceof C1526d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1526d dVar = (C1526d) parcelable;
        super.onRestoreInstanceState(dVar.mo14959a());
        setChecked(dVar.f7995b);
    }

    @mr2
    public Parcelable onSaveInstanceState() {
        C1526d dVar = new C1526d(super.onSaveInstanceState());
        dVar.f7995b = this.f7988b;
        return dVar;
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        mo11363p(getMeasuredWidth(), getMeasuredHeight());
    }

    /* renamed from: p */
    public final void mo11363p(int i, int i2) {
        if (this.f7984a != null && getLayout() != null) {
            if (mo11350h() || mo11334g()) {
                this.f7992p = 0;
                Layout.Alignment actualTextAlignment = getActualTextAlignment();
                int i3 = this.f7994r;
                boolean z = true;
                if (i3 == 1 || i3 == 3 || ((i3 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i3 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
                    this.f7991o = 0;
                } else {
                    int i4 = this.f7990n;
                    if (i4 == 0) {
                        i4 = this.f7984a.getIntrinsicWidth();
                    }
                    int textLayoutWidth = ((((i - getTextLayoutWidth()) - jt4.m18968j0(this)) - i4) - this.f7993q) - jt4.m18972k0(this);
                    if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
                        textLayoutWidth /= 2;
                    }
                    boolean j = mo11353j();
                    if (this.f7994r != 4) {
                        z = false;
                    }
                    if (j != z) {
                        textLayoutWidth = -textLayoutWidth;
                    }
                    if (this.f7991o != textLayoutWidth) {
                        this.f7991o = textLayoutWidth;
                        mo11358o(false);
                        return;
                    }
                    return;
                }
            } else if (mo11351i()) {
                this.f7991o = 0;
                if (this.f7994r == 16) {
                    this.f7992p = 0;
                } else {
                    int i5 = this.f7990n;
                    if (i5 == 0) {
                        i5 = this.f7984a.getIntrinsicHeight();
                    }
                    int max = Math.max(0, (((((i2 - getTextHeight()) - getPaddingTop()) - i5) - this.f7993q) - getPaddingBottom()) / 2);
                    if (this.f7992p != max) {
                        this.f7992p = max;
                        mo11358o(false);
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
            mo11358o(false);
        }
    }

    public boolean performClick() {
        if (this.f7986a.mo19045q()) {
            toggle();
        }
        return super.performClick();
    }

    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f7984a != null) {
            if (this.f7984a.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setBackground(@mr2 Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundColor(@d10 int i) {
        if (mo11355l()) {
            this.f7986a.mo19047s(i);
        } else {
            super.setBackgroundColor(i);
        }
    }

    public void setBackgroundDrawable(@mr2 Drawable drawable) {
        if (mo11355l()) {
            if (drawable != getBackground()) {
                Log.w(f7973b, "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                this.f7986a.mo19048t();
            } else {
                getBackground().setState(drawable.getState());
                return;
            }
        }
        super.setBackgroundDrawable(drawable);
    }

    public void setBackgroundResource(@dp0 int i) {
        setBackgroundDrawable(i != 0 ? C3129p8.m24529b(getContext(), i) : null);
    }

    public void setBackgroundTintList(@ts2 ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    public void setBackgroundTintMode(@ts2 PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (mo11355l()) {
            this.f7986a.mo19049u(z);
        }
    }

    public void setChecked(boolean z) {
        if (mo11333f() && isEnabled() && this.f7988b != z) {
            this.f7988b = z;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                ((MaterialButtonToggleGroup) getParent()).mo11431p(this, this.f7988b);
            }
            if (!this.f7989c) {
                this.f7989c = true;
                Iterator it = this.f7987a.iterator();
                while (it.hasNext()) {
                    ((C1524b) it.next()).mo11399a(this, this.f7988b);
                }
                this.f7989c = false;
            }
        }
    }

    public void setCornerRadius(@e83 int i) {
        if (mo11355l()) {
            this.f7986a.mo19050v(i);
        }
    }

    public void setCornerRadiusResource(@yk0 int i) {
        if (mo11355l()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @sj3(21)
    public void setElevation(float f) {
        super.setElevation(f);
        if (mo11355l()) {
            this.f7986a.mo19034f().mo31624n0(f);
        }
    }

    public void setIcon(@ts2 Drawable drawable) {
        if (this.f7984a != drawable) {
            this.f7984a = drawable;
            mo11358o(true);
            mo11363p(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.f7994r != i) {
            this.f7994r = i;
            mo11363p(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(@e83 int i) {
        if (this.f7993q != i) {
            this.f7993q = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(@dp0 int i) {
        setIcon(i != 0 ? C3129p8.m24529b(getContext(), i) : null);
    }

    public void setIconSize(@e83 int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else if (this.f7990n != i) {
            this.f7990n = i;
            mo11358o(true);
        }
    }

    public void setIconTint(@ts2 ColorStateList colorStateList) {
        if (this.f7982a != colorStateList) {
            this.f7982a = colorStateList;
            mo11358o(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f7983a != mode) {
            this.f7983a = mode;
            mo11358o(false);
        }
    }

    public void setIconTintResource(@k10 int i) {
        setIconTint(C3129p8.m24528a(getContext(), i));
    }

    public void setInsetBottom(@zk0 int i) {
        this.f7986a.mo19051w(i);
    }

    public void setInsetTop(@zk0 int i) {
        this.f7986a.mo19052x(i);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(@ts2 C1525c cVar) {
        this.f7985a = cVar;
    }

    public void setPressed(boolean z) {
        C1525c cVar = this.f7985a;
        if (cVar != null) {
            cVar.mo11400a(this, z);
        }
        super.setPressed(z);
    }

    public void setRippleColor(@ts2 ColorStateList colorStateList) {
        if (mo11355l()) {
            this.f7986a.mo19053y(colorStateList);
        }
    }

    public void setRippleColorResource(@k10 int i) {
        if (mo11355l()) {
            setRippleColor(C3129p8.m24528a(getContext(), i));
        }
    }

    public void setShapeAppearanceModel(@mr2 uw3 uw3) {
        if (mo11355l()) {
            this.f7986a.mo19054z(uw3);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (mo11355l()) {
            this.f7986a.mo19017A(z);
        }
    }

    public void setStrokeColor(@ts2 ColorStateList colorStateList) {
        if (mo11355l()) {
            this.f7986a.mo19018B(colorStateList);
        }
    }

    public void setStrokeColorResource(@k10 int i) {
        if (mo11355l()) {
            setStrokeColor(C3129p8.m24528a(getContext(), i));
        }
    }

    public void setStrokeWidth(@e83 int i) {
        if (mo11355l()) {
            this.f7986a.mo19019C(i);
        }
    }

    public void setStrokeWidthResource(@yk0 int i) {
        if (mo11355l()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @hl3({hl3.C2354a.f13187b})
    public void setSupportBackgroundTintList(@ts2 ColorStateList colorStateList) {
        if (mo11355l()) {
            this.f7986a.mo19020D(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @hl3({hl3.C2354a.f13187b})
    public void setSupportBackgroundTintMode(@ts2 PorterDuff.Mode mode) {
        if (mo11355l()) {
            this.f7986a.mo19021E(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @sj3(17)
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        mo11363p(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.f7986a.mo19022F(z);
    }

    public void toggle() {
        setChecked(!this.f7988b);
    }
}
