package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.onedelhi.secure.C1765b8;
import com.onedelhi.secure.C2035e8;
import com.onedelhi.secure.C2610k8;
import com.onedelhi.secure.C3129p8;
import com.onedelhi.secure.C3569t8;
import com.onedelhi.secure.bf4;
import com.onedelhi.secure.df4;
import com.onedelhi.secure.dp0;
import com.onedelhi.secure.ef4;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ps0;
import com.onedelhi.secure.qb4;
import com.onedelhi.secure.sj3;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.xe4;
import com.onedelhi.secure.za3;

public class AppCompatRadioButton extends RadioButton implements df4, bf4, ps0, ef4 {

    /* renamed from: a */
    public final C1765b8 f1366a;

    /* renamed from: a */
    public final C2035e8 f1367a;

    /* renamed from: a */
    public C2610k8 f1368a;

    /* renamed from: a */
    public final C3569t8 f1369a;

    public AppCompatRadioButton(Context context) {
        this(context, (AttributeSet) null);
    }

    public AppCompatRadioButton(Context context, @ts2 AttributeSet attributeSet) {
        this(context, attributeSet, za3.C4057b.radioButtonStyle);
    }

    public AppCompatRadioButton(Context context, @ts2 AttributeSet attributeSet, int i) {
        super(xe4.m31415b(context), attributeSet, i);
        qb4.m25632a(this, getContext());
        C2035e8 e8Var = new C2035e8(this);
        this.f1367a = e8Var;
        e8Var.mo15081e(attributeSet, i);
        C1765b8 b8Var = new C1765b8(this);
        this.f1366a = b8Var;
        b8Var.mo13523e(attributeSet, i);
        C3569t8 t8Var = new C3569t8(this);
        this.f1369a = t8Var;
        t8Var.mo24756m(attributeSet, i);
        getEmojiTextViewHelper().mo18949c(attributeSet, i);
    }

    @mr2
    private C2610k8 getEmojiTextViewHelper() {
        if (this.f1368a == null) {
            this.f1368a = new C2610k8(this);
        }
        return this.f1368a;
    }

    /* renamed from: c */
    public boolean mo1712c() {
        return getEmojiTextViewHelper().mo18948b();
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1765b8 b8Var = this.f1366a;
        if (b8Var != null) {
            b8Var.mo13520b();
        }
        C3569t8 t8Var = this.f1369a;
        if (t8Var != null) {
            t8Var.mo24746b();
        }
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C2035e8 e8Var = this.f1367a;
        return e8Var != null ? e8Var.mo15078b(compoundPaddingLeft) : compoundPaddingLeft;
    }

    @ts2
    @hl3({hl3.C2354a.f13188c})
    public ColorStateList getSupportBackgroundTintList() {
        C1765b8 b8Var = this.f1366a;
        if (b8Var != null) {
            return b8Var.mo13521c();
        }
        return null;
    }

    @ts2
    @hl3({hl3.C2354a.f13188c})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1765b8 b8Var = this.f1366a;
        if (b8Var != null) {
            return b8Var.mo13522d();
        }
        return null;
    }

    @ts2
    @hl3({hl3.C2354a.f13188c})
    public ColorStateList getSupportButtonTintList() {
        C2035e8 e8Var = this.f1367a;
        if (e8Var != null) {
            return e8Var.mo15079c();
        }
        return null;
    }

    @ts2
    @hl3({hl3.C2354a.f13188c})
    public PorterDuff.Mode getSupportButtonTintMode() {
        C2035e8 e8Var = this.f1367a;
        if (e8Var != null) {
            return e8Var.mo15080d();
        }
        return null;
    }

    @ts2
    @hl3({hl3.C2354a.f13188c})
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1369a.mo24753j();
    }

    @ts2
    @hl3({hl3.C2354a.f13188c})
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1369a.mo24754k();
    }

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().mo18950d(z);
    }

    public void setBackgroundDrawable(@ts2 Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1765b8 b8Var = this.f1366a;
        if (b8Var != null) {
            b8Var.mo13524f(drawable);
        }
    }

    public void setBackgroundResource(@dp0 int i) {
        super.setBackgroundResource(i);
        C1765b8 b8Var = this.f1366a;
        if (b8Var != null) {
            b8Var.mo13525g(i);
        }
    }

    public void setButtonDrawable(@dp0 int i) {
        setButtonDrawable(C3129p8.m24529b(getContext(), i));
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C2035e8 e8Var = this.f1367a;
        if (e8Var != null) {
            e8Var.mo15082f();
        }
    }

    public void setCompoundDrawables(@ts2 Drawable drawable, @ts2 Drawable drawable2, @ts2 Drawable drawable3, @ts2 Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C3569t8 t8Var = this.f1369a;
        if (t8Var != null) {
            t8Var.mo24759p();
        }
    }

    @sj3(17)
    public void setCompoundDrawablesRelative(@ts2 Drawable drawable, @ts2 Drawable drawable2, @ts2 Drawable drawable3, @ts2 Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C3569t8 t8Var = this.f1369a;
        if (t8Var != null) {
            t8Var.mo24759p();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().mo18951e(z);
    }

    public void setFilters(@mr2 InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().mo18947a(inputFilterArr));
    }

    @hl3({hl3.C2354a.f13188c})
    public void setSupportBackgroundTintList(@ts2 ColorStateList colorStateList) {
        C1765b8 b8Var = this.f1366a;
        if (b8Var != null) {
            b8Var.mo13527i(colorStateList);
        }
    }

    @hl3({hl3.C2354a.f13188c})
    public void setSupportBackgroundTintMode(@ts2 PorterDuff.Mode mode) {
        C1765b8 b8Var = this.f1366a;
        if (b8Var != null) {
            b8Var.mo13528j(mode);
        }
    }

    @hl3({hl3.C2354a.f13188c})
    public void setSupportButtonTintList(@ts2 ColorStateList colorStateList) {
        C2035e8 e8Var = this.f1367a;
        if (e8Var != null) {
            e8Var.mo15083g(colorStateList);
        }
    }

    @hl3({hl3.C2354a.f13188c})
    public void setSupportButtonTintMode(@ts2 PorterDuff.Mode mode) {
        C2035e8 e8Var = this.f1367a;
        if (e8Var != null) {
            e8Var.mo15084h(mode);
        }
    }

    @hl3({hl3.C2354a.f13188c})
    public void setSupportCompoundDrawablesTintList(@ts2 ColorStateList colorStateList) {
        this.f1369a.mo24766w(colorStateList);
        this.f1369a.mo24746b();
    }

    @hl3({hl3.C2354a.f13188c})
    public void setSupportCompoundDrawablesTintMode(@ts2 PorterDuff.Mode mode) {
        this.f1369a.mo24767x(mode);
        this.f1369a.mo24746b();
    }
}
