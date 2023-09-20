package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.onedelhi.secure.C1765b8;
import com.onedelhi.secure.C2610k8;
import com.onedelhi.secure.C3056of;
import com.onedelhi.secure.C3569t8;
import com.onedelhi.secure.bf4;
import com.onedelhi.secure.dp0;
import com.onedelhi.secure.ef4;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.jb4;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ps0;
import com.onedelhi.secure.qb4;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.xe4;
import com.onedelhi.secure.za3;

public class AppCompatButton extends Button implements bf4, C3056of, ef4, ps0 {

    /* renamed from: a */
    public final C1765b8 f1338a;
    @mr2

    /* renamed from: a */
    public C2610k8 f1339a;

    /* renamed from: a */
    public final C3569t8 f1340a;

    public AppCompatButton(@mr2 Context context) {
        this(context, (AttributeSet) null);
    }

    public AppCompatButton(@mr2 Context context, @ts2 AttributeSet attributeSet) {
        this(context, attributeSet, za3.C4057b.buttonStyle);
    }

    public AppCompatButton(@mr2 Context context, @ts2 AttributeSet attributeSet, int i) {
        super(xe4.m31415b(context), attributeSet, i);
        qb4.m25632a(this, getContext());
        C1765b8 b8Var = new C1765b8(this);
        this.f1338a = b8Var;
        b8Var.mo13523e(attributeSet, i);
        C3569t8 t8Var = new C3569t8(this);
        this.f1340a = t8Var;
        t8Var.mo24756m(attributeSet, i);
        t8Var.mo24746b();
        getEmojiTextViewHelper().mo18949c(attributeSet, i);
    }

    @mr2
    private C2610k8 getEmojiTextViewHelper() {
        if (this.f1339a == null) {
            this.f1339a = new C2610k8(this);
        }
        return this.f1339a;
    }

    /* renamed from: c */
    public boolean mo1712c() {
        return getEmojiTextViewHelper().mo18948b();
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1765b8 b8Var = this.f1338a;
        if (b8Var != null) {
            b8Var.mo13520b();
        }
        C3569t8 t8Var = this.f1340a;
        if (t8Var != null) {
            t8Var.mo24746b();
        }
    }

    @hl3({hl3.C2354a.f13188c})
    public int getAutoSizeMaxTextSize() {
        if (C3056of.f17942a) {
            return super.getAutoSizeMaxTextSize();
        }
        C3569t8 t8Var = this.f1340a;
        if (t8Var != null) {
            return t8Var.mo24748e();
        }
        return -1;
    }

    @hl3({hl3.C2354a.f13188c})
    public int getAutoSizeMinTextSize() {
        if (C3056of.f17942a) {
            return super.getAutoSizeMinTextSize();
        }
        C3569t8 t8Var = this.f1340a;
        if (t8Var != null) {
            return t8Var.mo24749f();
        }
        return -1;
    }

    @hl3({hl3.C2354a.f13188c})
    public int getAutoSizeStepGranularity() {
        if (C3056of.f17942a) {
            return super.getAutoSizeStepGranularity();
        }
        C3569t8 t8Var = this.f1340a;
        if (t8Var != null) {
            return t8Var.mo24750g();
        }
        return -1;
    }

    @hl3({hl3.C2354a.f13188c})
    public int[] getAutoSizeTextAvailableSizes() {
        if (C3056of.f17942a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C3569t8 t8Var = this.f1340a;
        return t8Var != null ? t8Var.mo24751h() : new int[0];
    }

    @SuppressLint({"WrongConstant"})
    @hl3({hl3.C2354a.f13188c})
    public int getAutoSizeTextType() {
        if (C3056of.f17942a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C3569t8 t8Var = this.f1340a;
        if (t8Var != null) {
            return t8Var.mo24752i();
        }
        return 0;
    }

    @ts2
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return jb4.m18312G(super.getCustomSelectionActionModeCallback());
    }

    @ts2
    @hl3({hl3.C2354a.f13188c})
    public ColorStateList getSupportBackgroundTintList() {
        C1765b8 b8Var = this.f1338a;
        if (b8Var != null) {
            return b8Var.mo13521c();
        }
        return null;
    }

    @ts2
    @hl3({hl3.C2354a.f13188c})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1765b8 b8Var = this.f1338a;
        if (b8Var != null) {
            return b8Var.mo13522d();
        }
        return null;
    }

    @ts2
    @hl3({hl3.C2354a.f13188c})
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1340a.mo24753j();
    }

    @ts2
    @hl3({hl3.C2354a.f13188c})
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1340a.mo24754k();
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C3569t8 t8Var = this.f1340a;
        if (t8Var != null) {
            t8Var.mo24758o(z, i, i2, i3, i4);
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C3569t8 t8Var = this.f1340a;
        if (t8Var != null && !C3056of.f17942a && t8Var.mo24755l()) {
            this.f1340a.mo24747c();
        }
    }

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().mo18950d(z);
    }

    @hl3({hl3.C2354a.f13188c})
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (C3056of.f17942a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C3569t8 t8Var = this.f1340a;
        if (t8Var != null) {
            t8Var.mo24763t(i, i2, i3, i4);
        }
    }

    @hl3({hl3.C2354a.f13188c})
    public void setAutoSizeTextTypeUniformWithPresetSizes(@mr2 int[] iArr, int i) throws IllegalArgumentException {
        if (C3056of.f17942a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C3569t8 t8Var = this.f1340a;
        if (t8Var != null) {
            t8Var.mo24764u(iArr, i);
        }
    }

    @hl3({hl3.C2354a.f13188c})
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (C3056of.f17942a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C3569t8 t8Var = this.f1340a;
        if (t8Var != null) {
            t8Var.mo24765v(i);
        }
    }

    public void setBackgroundDrawable(@ts2 Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1765b8 b8Var = this.f1338a;
        if (b8Var != null) {
            b8Var.mo13524f(drawable);
        }
    }

    public void setBackgroundResource(@dp0 int i) {
        super.setBackgroundResource(i);
        C1765b8 b8Var = this.f1338a;
        if (b8Var != null) {
            b8Var.mo13525g(i);
        }
    }

    public void setCustomSelectionActionModeCallback(@ts2 ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(jb4.m18313H(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().mo18951e(z);
    }

    public void setFilters(@mr2 InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().mo18947a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        C3569t8 t8Var = this.f1340a;
        if (t8Var != null) {
            t8Var.mo24762s(z);
        }
    }

    @hl3({hl3.C2354a.f13188c})
    public void setSupportBackgroundTintList(@ts2 ColorStateList colorStateList) {
        C1765b8 b8Var = this.f1338a;
        if (b8Var != null) {
            b8Var.mo13527i(colorStateList);
        }
    }

    @hl3({hl3.C2354a.f13188c})
    public void setSupportBackgroundTintMode(@ts2 PorterDuff.Mode mode) {
        C1765b8 b8Var = this.f1338a;
        if (b8Var != null) {
            b8Var.mo13528j(mode);
        }
    }

    @hl3({hl3.C2354a.f13188c})
    public void setSupportCompoundDrawablesTintList(@ts2 ColorStateList colorStateList) {
        this.f1340a.mo24766w(colorStateList);
        this.f1340a.mo24746b();
    }

    @hl3({hl3.C2354a.f13188c})
    public void setSupportCompoundDrawablesTintMode(@ts2 PorterDuff.Mode mode) {
        this.f1340a.mo24767x(mode);
        this.f1340a.mo24746b();
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C3569t8 t8Var = this.f1340a;
        if (t8Var != null) {
            t8Var.mo24760q(context, i);
        }
    }

    public void setTextSize(int i, float f) {
        if (C3056of.f17942a) {
            super.setTextSize(i, f);
            return;
        }
        C3569t8 t8Var = this.f1340a;
        if (t8Var != null) {
            t8Var.mo24742A(i, f);
        }
    }
}
