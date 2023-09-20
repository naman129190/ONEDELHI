package com.onedelhi.secure;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.C0552c;
import com.onedelhi.secure.hl3;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

@sj3(19)
@hl3({hl3.C2354a.LIBRARY})
public final class vs0 implements InputFilter {

    /* renamed from: a */
    public final TextView f21918a;

    /* renamed from: a */
    public C0552c.C0559f f21919a;

    @sj3(19)
    /* renamed from: com.onedelhi.secure.vs0$a */
    public static class C3806a extends C0552c.C0559f {

        /* renamed from: a */
        public final Reference<TextView> f21920a;

        /* renamed from: b */
        public final Reference<vs0> f21921b;

        public C3806a(TextView textView, vs0 vs0) {
            this.f21920a = new WeakReference(textView);
            this.f21921b = new WeakReference(vs0);
        }

        /* renamed from: b */
        public void mo2333b() {
            CharSequence text;
            CharSequence u;
            super.mo2333b();
            TextView textView = this.f21920a.get();
            if (mo26201c(textView, this.f21921b.get()) && textView.isAttachedToWindow() && (text = textView.getText()) != (u = C0552c.m4105b().mo4179u(text))) {
                int selectionStart = Selection.getSelectionStart(u);
                int selectionEnd = Selection.getSelectionEnd(u);
                textView.setText(u);
                if (u instanceof Spannable) {
                    vs0.m30310b((Spannable) u, selectionStart, selectionEnd);
                }
            }
        }

        /* renamed from: c */
        public final boolean mo26201c(@ts2 TextView textView, @ts2 InputFilter inputFilter) {
            InputFilter[] filters;
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return false;
            }
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    return true;
                }
            }
            return false;
        }
    }

    public vs0(@mr2 TextView textView) {
        this.f21918a = textView;
    }

    /* renamed from: b */
    public static void m30310b(Spannable spannable, int i, int i2) {
        if (i >= 0 && i2 >= 0) {
            Selection.setSelection(spannable, i, i2);
        } else if (i >= 0) {
            Selection.setSelection(spannable, i);
        } else if (i2 >= 0) {
            Selection.setSelection(spannable, i2);
        }
    }

    /* renamed from: a */
    public final C0552c.C0559f mo26199a() {
        if (this.f21919a == null) {
            this.f21919a = new C3806a(this.f21918a, this);
        }
        return this.f21919a;
    }

    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (this.f21918a.isInEditMode()) {
            return charSequence;
        }
        int f = C0552c.m4105b().mo4170f();
        if (f != 0) {
            boolean z = true;
            if (f == 1) {
                if (i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == this.f21918a.getText()) {
                    z = false;
                }
                if (!z || charSequence == null) {
                    return charSequence;
                }
                if (!(i == 0 && i2 == charSequence.length())) {
                    charSequence = charSequence.subSequence(i, i2);
                }
                return C0552c.m4105b().mo4180v(charSequence, 0, charSequence.length());
            } else if (f != 3) {
                return charSequence;
            }
        }
        C0552c.m4105b().mo4183y(mo26199a());
        return charSequence;
    }
}
