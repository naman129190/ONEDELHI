package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.google.android.material.chip.C1549a;
import com.onedelhi.secure.C1638a2;
import com.onedelhi.secure.C2402i7;
import com.onedelhi.secure.C2530jn;
import com.onedelhi.secure.C3740us;
import com.onedelhi.secure.C3884x1;
import com.onedelhi.secure.cf2;
import com.onedelhi.secure.dp0;
import com.onedelhi.secure.e54;
import com.onedelhi.secure.e64;
import com.onedelhi.secure.e83;
import com.onedelhi.secure.es2;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.k10;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ne2;
import com.onedelhi.secure.nl2;
import com.onedelhi.secure.nx3;
import com.onedelhi.secure.ob4;
import com.onedelhi.secure.pv4;
import com.onedelhi.secure.py0;
import com.onedelhi.secure.sa4;
import com.onedelhi.secure.sj3;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.ua4;
import com.onedelhi.secure.um3;
import com.onedelhi.secure.uw3;
import com.onedelhi.secure.yk0;
import com.onedelhi.secure.zk0;
import java.util.List;

public class Chip extends AppCompatCheckBox implements C1549a.C1550a, nx3, ne2<Chip> {

    /* renamed from: a */
    public static final int[] f8061a = {16842913};

    /* renamed from: b */
    public static final Rect f8062b = new Rect();

    /* renamed from: b */
    public static final String f8063b = "Chip";

    /* renamed from: b */
    public static final int[] f8064b = {16842911};

    /* renamed from: c */
    public static final String f8065c = "http://schemas.android.com/apk/res/android";

    /* renamed from: d */
    public static final String f8066d = "android.widget.Button";

    /* renamed from: e */
    public static final String f8067e = "android.widget.RadioButton";

    /* renamed from: f */
    public static final String f8068f = "android.view.View";

    /* renamed from: p */
    public static final int f8069p = fd3.C2164n.Widget_MaterialComponents_Chip_Action;

    /* renamed from: q */
    public static final int f8070q = 0;

    /* renamed from: r */
    public static final int f8071r = 1;

    /* renamed from: s */
    public static final int f8072s = 48;

    /* renamed from: a */
    public final Rect f8073a;

    /* renamed from: a */
    public final RectF f8074a;
    @ts2

    /* renamed from: a */
    public InsetDrawable f8075a;
    @ts2

    /* renamed from: a */
    public RippleDrawable f8076a;
    @ts2

    /* renamed from: a */
    public View.OnClickListener f8077a;
    @ts2

    /* renamed from: a */
    public CompoundButton.OnCheckedChangeListener f8078a;
    @mr2

    /* renamed from: a */
    public final C1543c f8079a;
    @ts2

    /* renamed from: a */
    public C1549a f8080a;
    @ts2

    /* renamed from: a */
    public ne2.C6183a<Chip> f8081a;

    /* renamed from: a */
    public final ua4 f8082a;
    @ts2

    /* renamed from: a */
    public CharSequence f8083a;

    /* renamed from: b */
    public boolean f8084b;

    /* renamed from: c */
    public boolean f8085c;

    /* renamed from: d */
    public boolean f8086d;

    /* renamed from: e */
    public boolean f8087e;

    /* renamed from: f */
    public boolean f8088f;

    /* renamed from: g */
    public boolean f8089g;

    /* renamed from: n */
    public int f8090n;
    @zk0(unit = 1)

    /* renamed from: o */
    public int f8091o;

    /* renamed from: com.google.android.material.chip.Chip$a */
    public class C1541a extends ua4 {
        public C1541a() {
        }

        /* renamed from: a */
        public void mo11710a(int i) {
        }

        /* renamed from: b */
        public void mo11711b(@mr2 Typeface typeface, boolean z) {
            Chip chip = Chip.this;
            chip.setText(chip.f8080a.mo11792K3() ? Chip.this.f8080a.mo11806P1() : Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    /* renamed from: com.google.android.material.chip.Chip$b */
    public class C1542b extends ViewOutlineProvider {
        public C1542b() {
        }

        @TargetApi(21)
        public void getOutline(View view, @mr2 Outline outline) {
            if (Chip.this.f8080a != null) {
                Chip.this.f8080a.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    /* renamed from: com.google.android.material.chip.Chip$c */
    public class C1543c extends py0 {
        public C1543c(Chip chip) {
            super(chip);
        }

        /* renamed from: C */
        public int mo11713C(float f, float f2) {
            return (!Chip.this.mo11596o() || !Chip.this.getCloseIconTouchBounds().contains(f, f2)) ? 0 : 1;
        }

        /* renamed from: D */
        public void mo11714D(@mr2 List<Integer> list) {
            list.add(0);
            if (Chip.this.mo11596o() && Chip.this.mo11709y() && Chip.this.f8077a != null) {
                list.add(1);
            }
        }

        /* renamed from: N */
        public boolean mo11715N(int i, int i2, Bundle bundle) {
            if (i2 != 16) {
                return false;
            }
            if (i == 0) {
                return Chip.this.performClick();
            }
            if (i == 1) {
                return Chip.this.mo11548A();
            }
            return false;
        }

        /* renamed from: Q */
        public void mo11716Q(@mr2 C1638a2 a2Var) {
            a2Var.mo12542U0(Chip.this.mo11608s());
            a2Var.mo12551X0(Chip.this.isClickable());
            a2Var.mo12548W0(Chip.this.getAccessibilityClassName());
            CharSequence text = Chip.this.getText();
            if (Build.VERSION.SDK_INT >= 23) {
                a2Var.mo12516L1(text);
            } else {
                a2Var.mo12558a1(text);
            }
        }

        /* renamed from: R */
        public void mo11717R(int i, @mr2 C1638a2 a2Var) {
            CharSequence charSequence = "";
            if (i == 1) {
                CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
                if (closeIconContentDescription == null) {
                    CharSequence text = Chip.this.getText();
                    Context context = Chip.this.getContext();
                    int i2 = fd3.C2163m.mtrl_chip_close_icon_content_description;
                    Object[] objArr = new Object[1];
                    if (!TextUtils.isEmpty(text)) {
                        charSequence = text;
                    }
                    objArr[0] = charSequence;
                    closeIconContentDescription = context.getString(i2, objArr).trim();
                }
                a2Var.mo12558a1(closeIconContentDescription);
                a2Var.mo12533R0(Chip.this.getCloseIconTouchBoundsInt());
                a2Var.mo12559b(C1638a2.C1639a.f8642e);
                a2Var.mo12577g1(Chip.this.isEnabled());
                return;
            }
            a2Var.mo12558a1(charSequence);
            a2Var.mo12533R0(Chip.f8062b);
        }

        /* renamed from: S */
        public void mo11718S(int i, boolean z) {
            if (i == 1) {
                boolean unused = Chip.this.f8087e = z;
                Chip.this.refreshDrawableState();
            }
        }
    }

    public Chip(Context context) {
        this(context, (AttributeSet) null);
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, fd3.C2153c.chipStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Chip(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = f8069p
            android.content.Context r8 = com.onedelhi.secure.hf2.m50488c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.graphics.Rect r8 = new android.graphics.Rect
            r8.<init>()
            r7.f8073a = r8
            android.graphics.RectF r8 = new android.graphics.RectF
            r8.<init>()
            r7.f8074a = r8
            com.google.android.material.chip.Chip$a r8 = new com.google.android.material.chip.Chip$a
            r8.<init>()
            r7.f8082a = r8
            android.content.Context r8 = r7.getContext()
            r7.mo11557J(r9)
            com.google.android.material.chip.a r6 = com.google.android.material.chip.C1549a.m9865a1(r8, r9, r10, r4)
            r7.mo11605p(r8, r9, r10)
            r7.setChipDrawable(r6)
            float r0 = com.onedelhi.secure.jt4.m18904R(r7)
            r6.mo31624n0(r0)
            int[] r2 = com.onedelhi.secure.fd3.C2165o.Chip
            r0 = 0
            int[] r5 = new int[r0]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.onedelhi.secure.ob4.m59195k(r0, r1, r2, r3, r4, r5)
            int r10 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r10 >= r0) goto L_0x0051
            int r10 = com.onedelhi.secure.fd3.C2165o.Chip_android_textColor
            android.content.res.ColorStateList r8 = com.onedelhi.secure.af2.m38610a(r8, r9, r10)
            r7.setTextColor(r8)
        L_0x0051:
            int r8 = com.onedelhi.secure.fd3.C2165o.Chip_shapeAppearance
            boolean r8 = r9.hasValue(r8)
            r9.recycle()
            com.google.android.material.chip.Chip$c r9 = new com.google.android.material.chip.Chip$c
            r9.<init>(r7)
            r7.f8079a = r9
            r7.mo11552E()
            if (r8 != 0) goto L_0x0069
            r7.mo11606q()
        L_0x0069:
            boolean r8 = r7.f8084b
            r7.setChecked(r8)
            java.lang.CharSequence r8 = r6.mo11806P1()
            r7.setText(r8)
            android.text.TextUtils$TruncateAt r8 = r6.mo11784I1()
            r7.setEllipsize(r8)
            r7.mo11556I()
            com.google.android.material.chip.a r8 = r7.f8080a
            boolean r8 = r8.mo11792K3()
            if (r8 != 0) goto L_0x008e
            r8 = 1
            r7.setLines(r8)
            r7.setHorizontallyScrolling(r8)
        L_0x008e:
            r8 = 8388627(0x800013, float:1.175497E-38)
            r7.setGravity(r8)
            r7.mo11555H()
            boolean r8 = r7.mo11550C()
            if (r8 == 0) goto L_0x00a2
            int r8 = r7.f8091o
            r7.setMinHeight(r8)
        L_0x00a2:
            int r8 = com.onedelhi.secure.jt4.m18928Z(r7)
            r7.f8090n = r8
            com.onedelhi.secure.xx r8 = new com.onedelhi.secure.xx
            r8.<init>(r7)
            super.setOnCheckedChangeListener(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: private */
    @mr2
    public RectF getCloseIconTouchBounds() {
        this.f8074a.setEmpty();
        if (mo11596o() && this.f8077a != null) {
            this.f8080a.mo11775F1(this.f8074a);
        }
        return this.f8074a;
    }

    /* access modifiers changed from: private */
    @mr2
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f8073a.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f8073a;
    }

    @ts2
    private sa4 getTextAppearance() {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            return aVar.mo11810Q1();
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.f8086d != z) {
            this.f8086d = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.f8085c != z) {
            this.f8085c = z;
            refreshDrawableState();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public /* synthetic */ void m9815z(CompoundButton compoundButton, boolean z) {
        ne2.C6183a<Chip> aVar = this.f8081a;
        if (aVar != null) {
            aVar.mo40875a(this, z);
        }
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f8078a;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(compoundButton, z);
        }
    }

    @C3740us
    /* renamed from: A */
    public boolean mo11548A() {
        boolean z = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f8077a;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z = true;
        }
        if (this.f8089g) {
            this.f8079a.mo22745Y(1, 1);
        }
        return z;
    }

    /* renamed from: B */
    public final void mo11549B() {
        if (this.f8075a != null) {
            this.f8075a = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            mo11553F();
        }
    }

    /* renamed from: C */
    public boolean mo11550C() {
        return this.f8088f;
    }

    /* renamed from: D */
    public final void mo11551D(@ts2 C1549a aVar) {
        if (aVar != null) {
            aVar.mo11876k3((C1549a.C1550a) null);
        }
    }

    /* renamed from: E */
    public final void mo11552E() {
        boolean z;
        if (!mo11596o() || !mo11709y() || this.f8077a == null) {
            jt4.m18849B1(this, (C3884x1) null);
            z = false;
        } else {
            jt4.m18849B1(this, this.f8079a);
            z = true;
        }
        this.f8089g = z;
    }

    /* renamed from: F */
    public final void mo11553F() {
        if (um3.f36190a) {
            mo11554G();
            return;
        }
        this.f8080a.mo11789J3(true);
        jt4.m18877I1(this, getBackgroundDrawable());
        mo11555H();
        mo11595n();
    }

    /* renamed from: G */
    public final void mo11554G() {
        this.f8076a = new RippleDrawable(um3.m67327e(this.f8080a.mo11799N1()), getBackgroundDrawable(), (Drawable) null);
        this.f8080a.mo11789J3(false);
        jt4.m18877I1(this, this.f8076a);
        mo11555H();
    }

    /* renamed from: H */
    public final void mo11555H() {
        C1549a aVar;
        if (!TextUtils.isEmpty(getText()) && (aVar = this.f8080a) != null) {
            int p1 = (int) (aVar.mo11892p1() + this.f8080a.mo11814R1() + this.f8080a.mo11825V0());
            int u1 = (int) (this.f8080a.mo11913u1() + this.f8080a.mo11817S1() + this.f8080a.mo11813R0());
            if (this.f8075a != null) {
                Rect rect = new Rect();
                this.f8075a.getPadding(rect);
                u1 += rect.left;
                p1 += rect.right;
            }
            jt4.m18946d2(this, u1, getPaddingTop(), p1, getPaddingBottom());
        }
    }

    /* renamed from: I */
    public final void mo11556I() {
        TextPaint paint = getPaint();
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        sa4 textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.mo44266n(getContext(), paint, this.f8082a);
        }
    }

    /* renamed from: J */
    public final void mo11557J(@ts2 AttributeSet attributeSet) {
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", es2.C2101r.f11625h) != null) {
                Log.w(f8063b, "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            } else if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", es2.C2101r.f11637n, 8388627) != 8388627) {
                Log.w(f8063b, "Chip text must be vertically center and start aligned");
            }
        }
    }

    /* renamed from: a */
    public void mo11558a() {
        mo11594m(this.f8091o);
        requestLayout();
        invalidateOutline();
    }

    public boolean dispatchHoverEvent(@mr2 MotionEvent motionEvent) {
        return !this.f8089g ? super.dispatchHoverEvent(motionEvent) : this.f8079a.mo22755v(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f8089g) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (!this.f8079a.mo22756w(keyEvent) || this.f8079a.mo22730B() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1549a aVar = this.f8080a;
        if ((aVar == null || !aVar.mo11845c2()) ? false : this.f8080a.mo11855f3(mo11593l())) {
            invalidate();
        }
    }

    @mr2
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f8083a)) {
            return this.f8083a;
        }
        if (!mo11608s()) {
            return isClickable() ? f8066d : "android.view.View";
        }
        ViewParent parent = getParent();
        return (!(parent instanceof ChipGroup) || !((ChipGroup) parent).mo11733l()) ? f8066d : f8067e;
    }

    @ts2
    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f8075a;
        return insetDrawable == null ? this.f8080a : insetDrawable;
    }

    @ts2
    public Drawable getCheckedIcon() {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            return aVar.mo11877l1();
        }
        return null;
    }

    @ts2
    public ColorStateList getCheckedIconTint() {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            return aVar.mo11880m1();
        }
        return null;
    }

    @ts2
    public ColorStateList getChipBackgroundColor() {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            return aVar.mo11883n1();
        }
        return null;
    }

    public float getChipCornerRadius() {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            return Math.max(0.0f, aVar.mo11886o1());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f8080a;
    }

    public float getChipEndPadding() {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            return aVar.mo11892p1();
        }
        return 0.0f;
    }

    @ts2
    public Drawable getChipIcon() {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            return aVar.mo11895q1();
        }
        return null;
    }

    public float getChipIconSize() {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            return aVar.mo11898r1();
        }
        return 0.0f;
    }

    @ts2
    public ColorStateList getChipIconTint() {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            return aVar.mo11901s1();
        }
        return null;
    }

    public float getChipMinHeight() {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            return aVar.mo11910t1();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            return aVar.mo11913u1();
        }
        return 0.0f;
    }

    @ts2
    public ColorStateList getChipStrokeColor() {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            return aVar.mo11917v1();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            return aVar.mo11920w1();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    @ts2
    public Drawable getCloseIcon() {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            return aVar.mo11926y1();
        }
        return null;
    }

    @ts2
    public CharSequence getCloseIconContentDescription() {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            return aVar.mo11929z1();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            return aVar.mo11760A1();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            return aVar.mo11763B1();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            return aVar.mo11766C1();
        }
        return 0.0f;
    }

    @ts2
    public ColorStateList getCloseIconTint() {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            return aVar.mo11772E1();
        }
        return null;
    }

    @ts2
    public TextUtils.TruncateAt getEllipsize() {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            return aVar.mo11784I1();
        }
        return null;
    }

    public void getFocusedRect(@mr2 Rect rect) {
        if (!this.f8089g || !(this.f8079a.mo22730B() == 1 || this.f8079a.mo22757x() == 1)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(getCloseIconTouchBoundsInt());
        }
    }

    @ts2
    public nl2 getHideMotionSpec() {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            return aVar.mo11787J1();
        }
        return null;
    }

    public float getIconEndPadding() {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            return aVar.mo11790K1();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            return aVar.mo11793L1();
        }
        return 0.0f;
    }

    @ts2
    public ColorStateList getRippleColor() {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            return aVar.mo11799N1();
        }
        return null;
    }

    @mr2
    public uw3 getShapeAppearanceModel() {
        return this.f8080a.getShapeAppearanceModel();
    }

    @ts2
    public nl2 getShowMotionSpec() {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            return aVar.mo11802O1();
        }
        return null;
    }

    public float getTextEndPadding() {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            return aVar.mo11814R1();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            return aVar.mo11817S1();
        }
        return 0.0f;
    }

    /* renamed from: k */
    public final void mo11592k(@mr2 C1549a aVar) {
        aVar.mo11876k3(this);
    }

    @mr2
    /* renamed from: l */
    public final int[] mo11593l() {
        int isEnabled = isEnabled();
        if (this.f8087e) {
            isEnabled++;
        }
        if (this.f8086d) {
            isEnabled++;
        }
        if (this.f8085c) {
            isEnabled++;
        }
        if (isChecked()) {
            isEnabled++;
        }
        int[] iArr = new int[isEnabled];
        int i = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i = 1;
        }
        if (this.f8087e) {
            iArr[i] = 16842908;
            i++;
        }
        if (this.f8086d) {
            iArr[i] = 16843623;
            i++;
        }
        if (this.f8085c) {
            iArr[i] = 16842919;
            i++;
        }
        if (isChecked()) {
            iArr[i] = 16842913;
        }
        return iArr;
    }

    /* renamed from: m */
    public boolean mo11594m(@zk0 int i) {
        this.f8091o = i;
        int i2 = 0;
        if (!mo11550C()) {
            if (this.f8075a != null) {
                mo11549B();
            } else {
                mo11553F();
            }
            return false;
        }
        int max = Math.max(0, i - this.f8080a.getIntrinsicHeight());
        int max2 = Math.max(0, i - this.f8080a.getIntrinsicWidth());
        if (max2 > 0 || max > 0) {
            int i3 = max2 > 0 ? max2 / 2 : 0;
            if (max > 0) {
                i2 = max / 2;
            }
            if (this.f8075a != null) {
                Rect rect = new Rect();
                this.f8075a.getPadding(rect);
                if (rect.top == i2 && rect.bottom == i2 && rect.left == i3 && rect.right == i3) {
                    mo11553F();
                    return true;
                }
            }
            if (getMinHeight() != i) {
                setMinHeight(i);
            }
            if (getMinWidth() != i) {
                setMinWidth(i);
            }
            mo11607r(i3, i2, i3, i2);
            mo11553F();
            return true;
        }
        if (this.f8075a != null) {
            mo11549B();
        } else {
            mo11553F();
        }
        return false;
    }

    /* renamed from: n */
    public final void mo11595n() {
        if (getBackgroundDrawable() == this.f8075a && this.f8080a.getCallback() == null) {
            this.f8080a.setCallback(this.f8075a);
        }
    }

    /* renamed from: o */
    public final boolean mo11596o() {
        C1549a aVar = this.f8080a;
        return (aVar == null || aVar.mo11926y1() == null) ? false : true;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        cf2.m40865f(this, this.f8080a);
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, f8061a);
        }
        if (mo11608s()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, f8064b);
        }
        return onCreateDrawableState;
    }

    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.f8089g) {
            this.f8079a.mo22737M(z, i, rect);
        }
    }

    public boolean onHoverEvent(@mr2 MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                z = false;
            }
            return super.onHoverEvent(motionEvent);
        }
        z = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        setCloseIconHovered(z);
        return super.onHoverEvent(motionEvent);
    }

    public void onInitializeAccessibilityNodeInfo(@mr2 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(mo11608s());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            C1638a2.m10547X1(accessibilityNodeInfo).mo12555Z0(C1638a2.C1641c.m10709h(chipGroup.mo28234b(this), 1, chipGroup.mo11719c() ? chipGroup.mo11730i(this) : -1, 1, false, isChecked()));
        }
    }

    @TargetApi(24)
    @ts2
    public PointerIcon onResolvePointerIcon(@mr2 MotionEvent motionEvent, int i) {
        if (!getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) {
            return null;
        }
        return PointerIcon.getSystemIcon(getContext(), 1002);
    }

    @TargetApi(17)
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.f8090n != i) {
            this.f8090n = i;
            mo11555H();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r0 != 3) goto L_0x0040;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0049 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(@com.onedelhi.secure.mr2 android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0039
            if (r0 == r3) goto L_0x002b
            r4 = 2
            if (r0 == r4) goto L_0x0021
            r1 = 3
            if (r0 == r1) goto L_0x0034
            goto L_0x0040
        L_0x0021:
            boolean r0 = r5.f8085c
            if (r0 == 0) goto L_0x0040
            if (r1 != 0) goto L_0x003e
            r5.setCloseIconPressed(r2)
            goto L_0x003e
        L_0x002b:
            boolean r0 = r5.f8085c
            if (r0 == 0) goto L_0x0034
            r5.mo11548A()
            r0 = 1
            goto L_0x0035
        L_0x0034:
            r0 = 0
        L_0x0035:
            r5.setCloseIconPressed(r2)
            goto L_0x0041
        L_0x0039:
            if (r1 == 0) goto L_0x0040
            r5.setCloseIconPressed(r3)
        L_0x003e:
            r0 = 1
            goto L_0x0041
        L_0x0040:
            r0 = 0
        L_0x0041:
            if (r0 != 0) goto L_0x0049
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L_0x004a
        L_0x0049:
            r2 = 1
        L_0x004a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public final void mo11605p(Context context, @ts2 AttributeSet attributeSet, int i) {
        TypedArray k = ob4.m59195k(context, attributeSet, fd3.C2165o.Chip, i, f8069p, new int[0]);
        this.f8088f = k.getBoolean(fd3.C2165o.Chip_ensureMinTouchTargetSize, false);
        this.f8091o = (int) Math.ceil((double) k.getDimension(fd3.C2165o.Chip_chipMinTouchTargetSize, (float) Math.ceil((double) pv4.m61665e(getContext(), 48))));
        k.recycle();
    }

    /* renamed from: q */
    public final void mo11606q() {
        setOutlineProvider(new C1542b());
    }

    /* renamed from: r */
    public final void mo11607r(int i, int i2, int i3, int i4) {
        this.f8075a = new InsetDrawable(this.f8080a, i, i2, i3, i4);
    }

    /* renamed from: s */
    public boolean mo11608s() {
        C1549a aVar = this.f8080a;
        return aVar != null && aVar.mo11828W1();
    }

    public void setAccessibilityClassName(@ts2 CharSequence charSequence) {
        this.f8083a = charSequence;
    }

    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f8076a) {
            super.setBackground(drawable);
        } else {
            Log.w(f8063b, "Do not set the background; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundColor(int i) {
        Log.w(f8063b, "Do not set the background color; Chip manages its own background drawable.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f8076a) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w(f8063b, "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundResource(int i) {
        Log.w(f8063b, "Do not set the background resource; Chip manages its own background drawable.");
    }

    public void setBackgroundTintList(@ts2 ColorStateList colorStateList) {
        Log.w(f8063b, "Do not set the background tint list; Chip manages its own background drawable.");
    }

    public void setBackgroundTintMode(@ts2 PorterDuff.Mode mode) {
        Log.w(f8063b, "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            aVar.mo11878l2(z);
        }
    }

    public void setCheckableResource(@C2530jn int i) {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            aVar.mo11881m2(i);
        }
    }

    public void setChecked(boolean z) {
        C1549a aVar = this.f8080a;
        if (aVar == null) {
            this.f8084b = z;
        } else if (aVar.mo11828W1()) {
            super.setChecked(z);
        }
    }

    public void setCheckedIcon(@ts2 Drawable drawable) {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            aVar.mo11884n2(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(@C2530jn int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(@dp0 int i) {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            aVar.mo11896q2(i);
        }
    }

    public void setCheckedIconTint(@ts2 ColorStateList colorStateList) {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            aVar.mo11899r2(colorStateList);
        }
    }

    public void setCheckedIconTintResource(@k10 int i) {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            aVar.mo11902s2(i);
        }
    }

    public void setCheckedIconVisible(@C2530jn int i) {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            aVar.mo11911t2(i);
        }
    }

    public void setCheckedIconVisible(boolean z) {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            aVar.mo11914u2(z);
        }
    }

    public void setChipBackgroundColor(@ts2 ColorStateList colorStateList) {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            aVar.mo11918v2(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(@k10 int i) {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            aVar.mo11921w2(i);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            aVar.mo11924x2(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(@yk0 int i) {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            aVar.mo11927y2(i);
        }
    }

    public void setChipDrawable(@mr2 C1549a aVar) {
        C1549a aVar2 = this.f8080a;
        if (aVar2 != aVar) {
            mo11551D(aVar2);
            this.f8080a = aVar;
            aVar.mo11919v3(false);
            mo11592k(this.f8080a);
            mo11594m(this.f8091o);
        }
    }

    public void setChipEndPadding(float f) {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            aVar.mo11930z2(f);
        }
    }

    public void setChipEndPaddingResource(@yk0 int i) {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            aVar.mo11761A2(i);
        }
    }

    public void setChipIcon(@ts2 Drawable drawable) {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            aVar.mo11764B2(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(@C2530jn int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(@dp0 int i) {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            aVar.mo11773E2(i);
        }
    }

    public void setChipIconSize(float f) {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            aVar.mo11776F2(f);
        }
    }

    public void setChipIconSizeResource(@yk0 int i) {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            aVar.mo11779G2(i);
        }
    }

    public void setChipIconTint(@ts2 ColorStateList colorStateList) {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            aVar.mo11782H2(colorStateList);
        }
    }

    public void setChipIconTintResource(@k10 int i) {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            aVar.mo11785I2(i);
        }
    }

    public void setChipIconVisible(@C2530jn int i) {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            aVar.mo11788J2(i);
        }
    }

    public void setChipIconVisible(boolean z) {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            aVar.mo11791K2(z);
        }
    }

    public void setChipMinHeight(float f) {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            aVar.mo11794L2(f);
        }
    }

    public void setChipMinHeightResource(@yk0 int i) {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            aVar.mo11797M2(i);
        }
    }

    public void setChipStartPadding(float f) {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            aVar.mo11800N2(f);
        }
    }

    public void setChipStartPaddingResource(@yk0 int i) {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            aVar.mo11803O2(i);
        }
    }

    public void setChipStrokeColor(@ts2 ColorStateList colorStateList) {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            aVar.mo11807P2(colorStateList);
        }
    }

    public void setChipStrokeColorResource(@k10 int i) {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            aVar.mo11811Q2(i);
        }
    }

    public void setChipStrokeWidth(float f) {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            aVar.mo11815R2(f);
        }
    }

    public void setChipStrokeWidthResource(@yk0 int i) {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            aVar.mo11818S2(i);
        }
    }

    @Deprecated
    public void setChipText(@ts2 CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(@e54 int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(@ts2 Drawable drawable) {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            aVar.mo11824U2(drawable);
        }
        mo11552E();
    }

    public void setCloseIconContentDescription(@ts2 CharSequence charSequence) {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            aVar.mo11826V2(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(@C2530jn int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            aVar.mo11835Y2(f);
        }
    }

    public void setCloseIconEndPaddingResource(@yk0 int i) {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            aVar.mo11838Z2(i);
        }
    }

    public void setCloseIconResource(@dp0 int i) {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            aVar.mo11841a3(i);
        }
        mo11552E();
    }

    public void setCloseIconSize(float f) {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            aVar.mo11843b3(f);
        }
    }

    public void setCloseIconSizeResource(@yk0 int i) {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            aVar.mo11846c3(i);
        }
    }

    public void setCloseIconStartPadding(float f) {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            aVar.mo11849d3(f);
        }
    }

    public void setCloseIconStartPaddingResource(@yk0 int i) {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            aVar.mo11853e3(i);
        }
    }

    public void setCloseIconTint(@ts2 ColorStateList colorStateList) {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            aVar.mo11857g3(colorStateList);
        }
    }

    public void setCloseIconTintResource(@k10 int i) {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            aVar.mo11865h3(i);
        }
    }

    public void setCloseIconVisible(@C2530jn int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    public void setCloseIconVisible(boolean z) {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            aVar.mo11873j3(z);
        }
        mo11552E();
    }

    public void setCompoundDrawables(@ts2 Drawable drawable, @ts2 Drawable drawable2, @ts2 Drawable drawable3, @ts2 Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @sj3(17)
    public void setCompoundDrawablesRelative(@ts2 Drawable drawable, @ts2 Drawable drawable2, @ts2 Drawable drawable3, @ts2 Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(@ts2 Drawable drawable, @ts2 Drawable drawable2, @ts2 Drawable drawable3, @ts2 Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(@ts2 Drawable drawable, @ts2 Drawable drawable2, @ts2 Drawable drawable3, @ts2 Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
    }

    @sj3(21)
    public void setElevation(float f) {
        super.setElevation(f);
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            aVar.mo31624n0(f);
        }
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f8080a != null) {
            if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                C1549a aVar = this.f8080a;
                if (aVar != null) {
                    aVar.mo11879l3(truncateAt);
                    return;
                }
                return;
            }
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.f8088f = z;
        mo11594m(this.f8091o);
    }

    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w(f8063b, "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(@ts2 nl2 nl2) {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            aVar.mo11882m3(nl2);
        }
    }

    public void setHideMotionSpecResource(@C2402i7 int i) {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            aVar.mo11885n3(i);
        }
    }

    public void setIconEndPadding(float f) {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            aVar.mo11888o3(f);
        }
    }

    public void setIconEndPaddingResource(@yk0 int i) {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            aVar.mo11894p3(i);
        }
    }

    public void setIconStartPadding(float f) {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            aVar.mo11897q3(f);
        }
    }

    public void setIconStartPaddingResource(@yk0 int i) {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            aVar.mo11900r3(i);
        }
    }

    @hl3({hl3.C2354a.f13187b})
    public void setInternalOnCheckedChangeListener(@ts2 ne2.C6183a<Chip> aVar) {
        this.f8081a = aVar;
    }

    public void setLayoutDirection(int i) {
        if (this.f8080a != null) {
            super.setLayoutDirection(i);
        }
    }

    public void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxWidth(@e83 int i) {
        super.setMaxWidth(i);
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            aVar.mo11903s3(i);
        }
    }

    public void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setOnCheckedChangeListener(@ts2 CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f8078a = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f8077a = onClickListener;
        mo11552E();
    }

    public void setRippleColor(@ts2 ColorStateList colorStateList) {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            aVar.mo11912t3(colorStateList);
        }
        if (!this.f8080a.mo11823U1()) {
            mo11554G();
        }
    }

    public void setRippleColorResource(@k10 int i) {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            aVar.mo11915u3(i);
            if (!this.f8080a.mo11823U1()) {
                mo11554G();
            }
        }
    }

    public void setShapeAppearanceModel(@mr2 uw3 uw3) {
        this.f8080a.setShapeAppearanceModel(uw3);
    }

    public void setShowMotionSpec(@ts2 nl2 nl2) {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            aVar.mo11922w3(nl2);
        }
    }

    public void setShowMotionSpecResource(@C2402i7 int i) {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            aVar.mo11925x3(i);
        }
    }

    public void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(z);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            super.setText(aVar.mo11792K3() ? null : charSequence, bufferType);
            C1549a aVar2 = this.f8080a;
            if (aVar2 != null) {
                aVar2.mo11928y3(charSequence);
            }
        }
    }

    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            aVar.mo11762A3(i);
        }
        mo11556I();
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            aVar.mo11762A3(i);
        }
        mo11556I();
    }

    public void setTextAppearance(@ts2 sa4 sa4) {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            aVar.mo11931z3(sa4);
        }
        mo11556I();
    }

    public void setTextAppearanceResource(@e64 int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            aVar.mo11771D3(f);
        }
    }

    public void setTextEndPaddingResource(@yk0 int i) {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            aVar.mo11774E3(i);
        }
    }

    public void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            aVar.mo11780G3(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics()));
        }
        mo11556I();
    }

    public void setTextStartPadding(float f) {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            aVar.mo11783H3(f);
        }
    }

    public void setTextStartPaddingResource(@yk0 int i) {
        C1549a aVar = this.f8080a;
        if (aVar != null) {
            aVar.mo11786I3(i);
        }
    }

    @Deprecated
    /* renamed from: t */
    public boolean mo11704t() {
        return mo11705u();
    }

    /* renamed from: u */
    public boolean mo11705u() {
        C1549a aVar = this.f8080a;
        return aVar != null && aVar.mo11834Y1();
    }

    @Deprecated
    /* renamed from: v */
    public boolean mo11706v() {
        return mo11707w();
    }

    /* renamed from: w */
    public boolean mo11707w() {
        C1549a aVar = this.f8080a;
        return aVar != null && aVar.mo11840a2();
    }

    @Deprecated
    /* renamed from: x */
    public boolean mo11708x() {
        return mo11709y();
    }

    /* renamed from: y */
    public boolean mo11709y() {
        C1549a aVar = this.f8080a;
        return aVar != null && aVar.mo11848d2();
    }
}
