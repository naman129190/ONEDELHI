package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import com.onedelhi.secure.C1765b8;
import com.onedelhi.secure.C2480j8;
import com.onedelhi.secure.C2701l8;
import com.onedelhi.secure.C3040o8;
import com.onedelhi.secure.C3478s8;
import com.onedelhi.secure.C3569t8;
import com.onedelhi.secure.b70;
import com.onedelhi.secure.bf4;
import com.onedelhi.secure.dp0;
import com.onedelhi.secure.dv2;
import com.onedelhi.secure.ef4;
import com.onedelhi.secure.es0;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.jb4;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.lb4;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ps0;
import com.onedelhi.secure.qb4;
import com.onedelhi.secure.sj3;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.xe4;
import com.onedelhi.secure.za3;
import com.onedelhi.secure.zq1;

public class AppCompatEditText extends EditText implements bf4, dv2, ps0, ef4 {

    /* renamed from: a */
    public final C1765b8 f1349a;
    @mr2

    /* renamed from: a */
    public final C2480j8 f1350a;

    /* renamed from: a */
    public final lb4 f1351a;

    /* renamed from: a */
    public final C3478s8 f1352a;

    /* renamed from: a */
    public final C3569t8 f1353a;

    public AppCompatEditText(@mr2 Context context) {
        this(context, (AttributeSet) null);
    }

    public AppCompatEditText(@mr2 Context context, @ts2 AttributeSet attributeSet) {
        this(context, attributeSet, za3.C4057b.editTextStyle);
    }

    public AppCompatEditText(@mr2 Context context, @ts2 AttributeSet attributeSet, int i) {
        super(xe4.m31415b(context), attributeSet, i);
        qb4.m25632a(this, getContext());
        C1765b8 b8Var = new C1765b8(this);
        this.f1349a = b8Var;
        b8Var.mo13523e(attributeSet, i);
        C3569t8 t8Var = new C3569t8(this);
        this.f1353a = t8Var;
        t8Var.mo24756m(attributeSet, i);
        t8Var.mo24746b();
        this.f1352a = new C3478s8(this);
        this.f1351a = new lb4();
        C2480j8 j8Var = new C2480j8(this);
        this.f1350a = j8Var;
        j8Var.mo18161d(attributeSet, i);
        mo1786b(j8Var);
    }

    @ts2
    /* renamed from: a */
    public b70 mo1785a(@mr2 b70 b70) {
        return this.f1351a.mo14391a(this, b70);
    }

    /* renamed from: b */
    public void mo1786b(C2480j8 j8Var) {
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
        return this.f1350a.mo18160c();
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1765b8 b8Var = this.f1349a;
        if (b8Var != null) {
            b8Var.mo13520b();
        }
        C3569t8 t8Var = this.f1353a;
        if (t8Var != null) {
            t8Var.mo24746b();
        }
    }

    @ts2
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return jb4.m18312G(super.getCustomSelectionActionModeCallback());
    }

    @ts2
    @hl3({hl3.C2354a.f13188c})
    public ColorStateList getSupportBackgroundTintList() {
        C1765b8 b8Var = this.f1349a;
        if (b8Var != null) {
            return b8Var.mo13521c();
        }
        return null;
    }

    @ts2
    @hl3({hl3.C2354a.f13188c})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1765b8 b8Var = this.f1349a;
        if (b8Var != null) {
            return b8Var.mo13522d();
        }
        return null;
    }

    @ts2
    @hl3({hl3.C2354a.f13188c})
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1353a.mo24753j();
    }

    @ts2
    @hl3({hl3.C2354a.f13188c})
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1353a.mo24754k();
    }

    @ts2
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r2.f1352a;
     */
    @com.onedelhi.secure.mr2
    @com.onedelhi.secure.sj3(api = 26)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.textclassifier.TextClassifier getTextClassifier() {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto L_0x0010
            com.onedelhi.secure.s8 r0 = r2.f1352a
            if (r0 != 0) goto L_0x000b
            goto L_0x0010
        L_0x000b:
            android.view.textclassifier.TextClassifier r0 = r0.mo24263a()
            return r0
        L_0x0010:
            android.view.textclassifier.TextClassifier r0 = super.getTextClassifier()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatEditText.getTextClassifier():android.view.textclassifier.TextClassifier");
    }

    @ts2
    public InputConnection onCreateInputConnection(@mr2 EditorInfo editorInfo) {
        String[] h0;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f1353a.mo24761r(this, onCreateInputConnection, editorInfo);
        InputConnection a = C2701l8.m20260a(onCreateInputConnection, editorInfo, this);
        if (!(a == null || Build.VERSION.SDK_INT > 30 || (h0 = jt4.m18960h0(this)) == null)) {
            es0.m13954h(editorInfo, h0);
            a = zq1.m33314d(this, a, editorInfo);
        }
        return this.f1350a.mo18162e(a, editorInfo);
    }

    public boolean onDragEvent(DragEvent dragEvent) {
        if (C3040o8.m23603a(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    public boolean onTextContextMenuItem(int i) {
        if (C3040o8.m23604b(this, i)) {
            return true;
        }
        return super.onTextContextMenuItem(i);
    }

    public void setBackgroundDrawable(@ts2 Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1765b8 b8Var = this.f1349a;
        if (b8Var != null) {
            b8Var.mo13524f(drawable);
        }
    }

    public void setBackgroundResource(@dp0 int i) {
        super.setBackgroundResource(i);
        C1765b8 b8Var = this.f1349a;
        if (b8Var != null) {
            b8Var.mo13525g(i);
        }
    }

    public void setCompoundDrawables(@ts2 Drawable drawable, @ts2 Drawable drawable2, @ts2 Drawable drawable3, @ts2 Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C3569t8 t8Var = this.f1353a;
        if (t8Var != null) {
            t8Var.mo24759p();
        }
    }

    @sj3(17)
    public void setCompoundDrawablesRelative(@ts2 Drawable drawable, @ts2 Drawable drawable2, @ts2 Drawable drawable3, @ts2 Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C3569t8 t8Var = this.f1353a;
        if (t8Var != null) {
            t8Var.mo24759p();
        }
    }

    public void setCustomSelectionActionModeCallback(@ts2 ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(jb4.m18313H(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.f1350a.mo18163f(z);
    }

    public void setKeyListener(@ts2 KeyListener keyListener) {
        super.setKeyListener(this.f1350a.mo18158a(keyListener));
    }

    @hl3({hl3.C2354a.f13188c})
    public void setSupportBackgroundTintList(@ts2 ColorStateList colorStateList) {
        C1765b8 b8Var = this.f1349a;
        if (b8Var != null) {
            b8Var.mo13527i(colorStateList);
        }
    }

    @hl3({hl3.C2354a.f13188c})
    public void setSupportBackgroundTintMode(@ts2 PorterDuff.Mode mode) {
        C1765b8 b8Var = this.f1349a;
        if (b8Var != null) {
            b8Var.mo13528j(mode);
        }
    }

    @hl3({hl3.C2354a.f13188c})
    public void setSupportCompoundDrawablesTintList(@ts2 ColorStateList colorStateList) {
        this.f1353a.mo24766w(colorStateList);
        this.f1353a.mo24746b();
    }

    @hl3({hl3.C2354a.f13188c})
    public void setSupportCompoundDrawablesTintMode(@ts2 PorterDuff.Mode mode) {
        this.f1353a.mo24767x(mode);
        this.f1353a.mo24746b();
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C3569t8 t8Var = this.f1353a;
        if (t8Var != null) {
            t8Var.mo24760q(context, i);
        }
    }

    @sj3(api = 26)
    public void setTextClassifier(@ts2 TextClassifier textClassifier) {
        C3478s8 s8Var;
        if (Build.VERSION.SDK_INT >= 28 || (s8Var = this.f1352a) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            s8Var.mo24264b(textClassifier);
        }
    }
}
