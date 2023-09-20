package com.onedelhi.secure;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.C0552c;
import com.onedelhi.secure.hl3;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

@sj3(19)
@hl3({hl3.C2354a.f13185a})
public final class at0 implements TextWatcher {

    /* renamed from: a */
    public final EditText f9525a;

    /* renamed from: a */
    public C0552c.C0559f f9526a;

    /* renamed from: b */
    public final boolean f9527b;

    /* renamed from: c */
    public boolean f9528c;

    /* renamed from: n */
    public int f9529n = Integer.MAX_VALUE;

    /* renamed from: o */
    public int f9530o = 0;

    @sj3(19)
    /* renamed from: com.onedelhi.secure.at0$a */
    public static class C1733a extends C0552c.C0559f {

        /* renamed from: a */
        public final Reference<EditText> f9531a;

        public C1733a(EditText editText) {
            this.f9531a = new WeakReference(editText);
        }

        /* renamed from: b */
        public void mo2333b() {
            super.mo2333b();
            at0.m11412e(this.f9531a.get(), 1);
        }
    }

    public at0(EditText editText, boolean z) {
        this.f9525a = editText;
        this.f9527b = z;
        this.f9528c = true;
    }

    /* renamed from: e */
    public static void m11412e(@ts2 EditText editText, int i) {
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            C0552c.m4105b().mo4179u(editableText);
            vs0.m30310b(editableText, selectionStart, selectionEnd);
        }
    }

    /* renamed from: a */
    public int mo13262a() {
        return this.f9530o;
    }

    public void afterTextChanged(Editable editable) {
    }

    /* renamed from: b */
    public final C0552c.C0559f mo13264b() {
        if (this.f9526a == null) {
            this.f9526a = new C1733a(this.f9525a);
        }
        return this.f9526a;
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* renamed from: c */
    public int mo13266c() {
        return this.f9529n;
    }

    /* renamed from: d */
    public boolean mo13267d() {
        return this.f9528c;
    }

    /* renamed from: f */
    public void mo13268f(int i) {
        this.f9530o = i;
    }

    /* renamed from: g */
    public void mo13269g(boolean z) {
        if (this.f9528c != z) {
            if (this.f9526a != null) {
                C0552c.m4105b().mo4165C(this.f9526a);
            }
            this.f9528c = z;
            if (z) {
                m11412e(this.f9525a, C0552c.m4105b().mo4170f());
            }
        }
    }

    /* renamed from: h */
    public void mo13270h(int i) {
        this.f9529n = i;
    }

    /* renamed from: i */
    public final boolean mo13271i() {
        return !this.f9528c || (!this.f9527b && !C0552c.m4111n());
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!this.f9525a.isInEditMode() && !mo13271i() && i2 <= i3 && (charSequence instanceof Spannable)) {
            int f = C0552c.m4105b().mo4170f();
            if (f != 0) {
                if (f == 1) {
                    C0552c.m4105b().mo4182x((Spannable) charSequence, i, i + i3, this.f9529n, this.f9530o);
                    return;
                } else if (f != 3) {
                    return;
                }
            }
            C0552c.m4105b().mo4183y(mo13264b());
        }
    }
}
