package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import com.onedelhi.secure.C1765b8;
import com.onedelhi.secure.C2480j8;
import com.onedelhi.secure.C2701l8;
import com.onedelhi.secure.C3129p8;
import com.onedelhi.secure.C3569t8;
import com.onedelhi.secure.af4;
import com.onedelhi.secure.bf4;
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

public class AppCompatMultiAutoCompleteTextView extends MultiAutoCompleteTextView implements bf4, ps0, ef4 {

    /* renamed from: a */
    public static final int[] f1360a = {16843126};

    /* renamed from: a */
    public final C1765b8 f1361a;
    @mr2

    /* renamed from: a */
    public final C2480j8 f1362a;

    /* renamed from: a */
    public final C3569t8 f1363a;

    public AppCompatMultiAutoCompleteTextView(@mr2 Context context) {
        this(context, (AttributeSet) null);
    }

    public AppCompatMultiAutoCompleteTextView(@mr2 Context context, @ts2 AttributeSet attributeSet) {
        this(context, attributeSet, za3.C4057b.autoCompleteTextViewStyle);
    }

    public AppCompatMultiAutoCompleteTextView(@mr2 Context context, @ts2 AttributeSet attributeSet, int i) {
        super(xe4.m31415b(context), attributeSet, i);
        qb4.m25632a(this, getContext());
        af4 G = af4.m11110G(getContext(), attributeSet, f1360a, i, 0);
        if (G.mo13026C(0)) {
            setDropDownBackgroundDrawable(G.mo13037h(0));
        }
        G.mo13029I();
        C1765b8 b8Var = new C1765b8(this);
        this.f1361a = b8Var;
        b8Var.mo13523e(attributeSet, i);
        C3569t8 t8Var = new C3569t8(this);
        this.f1363a = t8Var;
        t8Var.mo24756m(attributeSet, i);
        t8Var.mo24746b();
        C2480j8 j8Var = new C2480j8(this);
        this.f1362a = j8Var;
        j8Var.mo18161d(attributeSet, i);
        mo1824a(j8Var);
    }

    /* renamed from: a */
    public void mo1824a(C2480j8 j8Var) {
        KeyListener keyListener = getKeyListener();
        if (j8Var.mo18159b(keyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener a = j8Var.mo18158a(keyListener);
            if (a != keyListener) {
                super.setKeyListener(a);
                super.setRawInputType(inputType);
                super.setFocusable(isFocusable);
                super.setClickable(isClickable);
                super.setLongClickable(isLongClickable);
            }
        }
    }

    /* renamed from: c */
    public boolean mo1712c() {
        return this.f1362a.mo18160c();
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1765b8 b8Var = this.f1361a;
        if (b8Var != null) {
            b8Var.mo13520b();
        }
        C3569t8 t8Var = this.f1363a;
        if (t8Var != null) {
            t8Var.mo24746b();
        }
    }

    @ts2
    @hl3({hl3.C2354a.f13188c})
    public ColorStateList getSupportBackgroundTintList() {
        C1765b8 b8Var = this.f1361a;
        if (b8Var != null) {
            return b8Var.mo13521c();
        }
        return null;
    }

    @ts2
    @hl3({hl3.C2354a.f13188c})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1765b8 b8Var = this.f1361a;
        if (b8Var != null) {
            return b8Var.mo13522d();
        }
        return null;
    }

    @ts2
    @hl3({hl3.C2354a.f13188c})
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1363a.mo24753j();
    }

    @ts2
    @hl3({hl3.C2354a.f13188c})
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1363a.mo24754k();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return this.f1362a.mo18162e(C2701l8.m20260a(super.onCreateInputConnection(editorInfo), editorInfo, this), editorInfo);
    }

    public void setBackgroundDrawable(@ts2 Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1765b8 b8Var = this.f1361a;
        if (b8Var != null) {
            b8Var.mo13524f(drawable);
        }
    }

    public void setBackgroundResource(@dp0 int i) {
        super.setBackgroundResource(i);
        C1765b8 b8Var = this.f1361a;
        if (b8Var != null) {
            b8Var.mo13525g(i);
        }
    }

    public void setCompoundDrawables(@ts2 Drawable drawable, @ts2 Drawable drawable2, @ts2 Drawable drawable3, @ts2 Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C3569t8 t8Var = this.f1363a;
        if (t8Var != null) {
            t8Var.mo24759p();
        }
    }

    @sj3(17)
    public void setCompoundDrawablesRelative(@ts2 Drawable drawable, @ts2 Drawable drawable2, @ts2 Drawable drawable3, @ts2 Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C3569t8 t8Var = this.f1363a;
        if (t8Var != null) {
            t8Var.mo24759p();
        }
    }

    public void setDropDownBackgroundResource(@dp0 int i) {
        setDropDownBackgroundDrawable(C3129p8.m24529b(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.f1362a.mo18163f(z);
    }

    public void setKeyListener(@ts2 KeyListener keyListener) {
        super.setKeyListener(this.f1362a.mo18158a(keyListener));
    }

    @hl3({hl3.C2354a.f13188c})
    public void setSupportBackgroundTintList(@ts2 ColorStateList colorStateList) {
        C1765b8 b8Var = this.f1361a;
        if (b8Var != null) {
            b8Var.mo13527i(colorStateList);
        }
    }

    @hl3({hl3.C2354a.f13188c})
    public void setSupportBackgroundTintMode(@ts2 PorterDuff.Mode mode) {
        C1765b8 b8Var = this.f1361a;
        if (b8Var != null) {
            b8Var.mo13528j(mode);
        }
    }

    @hl3({hl3.C2354a.f13188c})
    public void setSupportCompoundDrawablesTintList(@ts2 ColorStateList colorStateList) {
        this.f1363a.mo24766w(colorStateList);
        this.f1363a.mo24746b();
    }

    @hl3({hl3.C2354a.f13188c})
    public void setSupportCompoundDrawablesTintMode(@ts2 PorterDuff.Mode mode) {
        this.f1363a.mo24767x(mode);
        this.f1363a.mo24746b();
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C3569t8 t8Var = this.f1363a;
        if (t8Var != null) {
            t8Var.mo24760q(context, i);
        }
    }
}
