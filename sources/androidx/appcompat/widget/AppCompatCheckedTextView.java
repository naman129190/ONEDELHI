package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import com.onedelhi.secure.C1765b8;
import com.onedelhi.secure.C1948d8;
import com.onedelhi.secure.C2610k8;
import com.onedelhi.secure.C2701l8;
import com.onedelhi.secure.C3129p8;
import com.onedelhi.secure.C3569t8;
import com.onedelhi.secure.bf4;
import com.onedelhi.secure.cf4;
import com.onedelhi.secure.dp0;
import com.onedelhi.secure.ef4;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.jb4;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ps0;
import com.onedelhi.secure.qb4;
import com.onedelhi.secure.sj3;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.xe4;
import com.onedelhi.secure.za3;

public class AppCompatCheckedTextView extends CheckedTextView implements cf4, bf4, ps0, ef4 {

    /* renamed from: a */
    public final C1765b8 f1345a;

    /* renamed from: a */
    public final C1948d8 f1346a;
    @mr2

    /* renamed from: a */
    public C2610k8 f1347a;

    /* renamed from: a */
    public final C3569t8 f1348a;

    public AppCompatCheckedTextView(@mr2 Context context) {
        this(context, (AttributeSet) null);
    }

    public AppCompatCheckedTextView(@mr2 Context context, @ts2 AttributeSet attributeSet) {
        this(context, attributeSet, za3.C4057b.checkedTextViewStyle);
    }

    public AppCompatCheckedTextView(@mr2 Context context, @ts2 AttributeSet attributeSet, int i) {
        super(xe4.m31415b(context), attributeSet, i);
        qb4.m25632a(this, getContext());
        C3569t8 t8Var = new C3569t8(this);
        this.f1348a = t8Var;
        t8Var.mo24756m(attributeSet, i);
        t8Var.mo24746b();
        C1765b8 b8Var = new C1765b8(this);
        this.f1345a = b8Var;
        b8Var.mo13523e(attributeSet, i);
        C1948d8 d8Var = new C1948d8(this);
        this.f1346a = d8Var;
        d8Var.mo14553d(attributeSet, i);
        getEmojiTextViewHelper().mo18949c(attributeSet, i);
    }

    @mr2
    private C2610k8 getEmojiTextViewHelper() {
        if (this.f1347a == null) {
            this.f1347a = new C2610k8(this);
        }
        return this.f1347a;
    }

    /* renamed from: c */
    public boolean mo1712c() {
        return getEmojiTextViewHelper().mo18948b();
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C3569t8 t8Var = this.f1348a;
        if (t8Var != null) {
            t8Var.mo24746b();
        }
        C1765b8 b8Var = this.f1345a;
        if (b8Var != null) {
            b8Var.mo13520b();
        }
        C1948d8 d8Var = this.f1346a;
        if (d8Var != null) {
            d8Var.mo14550a();
        }
    }

    @ts2
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return jb4.m18312G(super.getCustomSelectionActionModeCallback());
    }

    @ts2
    @hl3({hl3.C2354a.f13188c})
    public ColorStateList getSupportBackgroundTintList() {
        C1765b8 b8Var = this.f1345a;
        if (b8Var != null) {
            return b8Var.mo13521c();
        }
        return null;
    }

    @ts2
    @hl3({hl3.C2354a.f13188c})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1765b8 b8Var = this.f1345a;
        if (b8Var != null) {
            return b8Var.mo13522d();
        }
        return null;
    }

    @ts2
    @hl3({hl3.C2354a.f13188c})
    public ColorStateList getSupportCheckMarkTintList() {
        C1948d8 d8Var = this.f1346a;
        if (d8Var != null) {
            return d8Var.mo14551b();
        }
        return null;
    }

    @ts2
    @hl3({hl3.C2354a.f13188c})
    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C1948d8 d8Var = this.f1346a;
        if (d8Var != null) {
            return d8Var.mo14552c();
        }
        return null;
    }

    @ts2
    @hl3({hl3.C2354a.f13188c})
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1348a.mo24753j();
    }

    @ts2
    @hl3({hl3.C2354a.f13188c})
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1348a.mo24754k();
    }

    @ts2
    public InputConnection onCreateInputConnection(@mr2 EditorInfo editorInfo) {
        return C2701l8.m20260a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().mo18950d(z);
    }

    public void setBackgroundDrawable(@ts2 Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1765b8 b8Var = this.f1345a;
        if (b8Var != null) {
            b8Var.mo13524f(drawable);
        }
    }

    public void setBackgroundResource(@dp0 int i) {
        super.setBackgroundResource(i);
        C1765b8 b8Var = this.f1345a;
        if (b8Var != null) {
            b8Var.mo13525g(i);
        }
    }

    public void setCheckMarkDrawable(@dp0 int i) {
        setCheckMarkDrawable(C3129p8.m24529b(getContext(), i));
    }

    public void setCheckMarkDrawable(@ts2 Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C1948d8 d8Var = this.f1346a;
        if (d8Var != null) {
            d8Var.mo14554e();
        }
    }

    public void setCompoundDrawables(@ts2 Drawable drawable, @ts2 Drawable drawable2, @ts2 Drawable drawable3, @ts2 Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C3569t8 t8Var = this.f1348a;
        if (t8Var != null) {
            t8Var.mo24759p();
        }
    }

    @sj3(17)
    public void setCompoundDrawablesRelative(@ts2 Drawable drawable, @ts2 Drawable drawable2, @ts2 Drawable drawable3, @ts2 Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C3569t8 t8Var = this.f1348a;
        if (t8Var != null) {
            t8Var.mo24759p();
        }
    }

    public void setCustomSelectionActionModeCallback(@ts2 ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(jb4.m18313H(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().mo18951e(z);
    }

    @hl3({hl3.C2354a.f13188c})
    public void setSupportBackgroundTintList(@ts2 ColorStateList colorStateList) {
        C1765b8 b8Var = this.f1345a;
        if (b8Var != null) {
            b8Var.mo13527i(colorStateList);
        }
    }

    @hl3({hl3.C2354a.f13188c})
    public void setSupportBackgroundTintMode(@ts2 PorterDuff.Mode mode) {
        C1765b8 b8Var = this.f1345a;
        if (b8Var != null) {
            b8Var.mo13528j(mode);
        }
    }

    @hl3({hl3.C2354a.f13188c})
    public void setSupportCheckMarkTintList(@ts2 ColorStateList colorStateList) {
        C1948d8 d8Var = this.f1346a;
        if (d8Var != null) {
            d8Var.mo14555f(colorStateList);
        }
    }

    @hl3({hl3.C2354a.f13188c})
    public void setSupportCheckMarkTintMode(@ts2 PorterDuff.Mode mode) {
        C1948d8 d8Var = this.f1346a;
        if (d8Var != null) {
            d8Var.mo14556g(mode);
        }
    }

    @hl3({hl3.C2354a.f13188c})
    public void setSupportCompoundDrawablesTintList(@ts2 ColorStateList colorStateList) {
        this.f1348a.mo24766w(colorStateList);
        this.f1348a.mo24746b();
    }

    @hl3({hl3.C2354a.f13188c})
    public void setSupportCompoundDrawablesTintMode(@ts2 PorterDuff.Mode mode) {
        this.f1348a.mo24767x(mode);
        this.f1348a.mo24746b();
    }

    public void setTextAppearance(@mr2 Context context, int i) {
        super.setTextAppearance(context, i);
        C3569t8 t8Var = this.f1348a;
        if (t8Var != null) {
            t8Var.mo24760q(context, i);
        }
    }
}
