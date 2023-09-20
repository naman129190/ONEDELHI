package com.onedelhi.secure;

import android.text.InputFilter;
import android.text.Spanned;

public class wf2 implements InputFilter {

    /* renamed from: n */
    public int f36975n;

    public wf2(int i) {
        this.f36975n = i;
    }

    /* renamed from: a */
    public int mo46712a() {
        return this.f36975n;
    }

    /* renamed from: b */
    public void mo46713b(int i) {
        this.f36975n = i;
    }

    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        try {
            StringBuilder sb = new StringBuilder(spanned);
            sb.replace(i3, i4, charSequence.subSequence(i, i2).toString());
            if (Integer.parseInt(sb.toString()) <= this.f36975n) {
                return null;
            }
            return "";
        } catch (NumberFormatException unused) {
            return "";
        }
    }
}
