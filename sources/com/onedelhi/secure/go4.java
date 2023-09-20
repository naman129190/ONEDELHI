package com.onedelhi.secure;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.stream.IntStream;

public class go4 implements Spannable {
    @mr2

    /* renamed from: a */
    public Spannable f12684a;

    /* renamed from: b */
    public boolean f12685b = false;

    @sj3(24)
    /* renamed from: com.onedelhi.secure.go4$a */
    public static class C2263a {
        /* renamed from: a */
        public static IntStream m15980a(CharSequence charSequence) {
            return charSequence.chars();
        }

        /* renamed from: b */
        public static IntStream m15981b(CharSequence charSequence) {
            return charSequence.codePoints();
        }
    }

    /* renamed from: com.onedelhi.secure.go4$b */
    public static class C2264b {
        /* renamed from: a */
        public boolean mo16756a(CharSequence charSequence) {
            return charSequence instanceof d43;
        }
    }

    @sj3(28)
    /* renamed from: com.onedelhi.secure.go4$c */
    public static class C2265c extends C2264b {
        /* renamed from: a */
        public boolean mo16756a(CharSequence charSequence) {
            return (charSequence instanceof PrecomputedText) || (charSequence instanceof d43);
        }
    }

    public go4(@mr2 Spannable spannable) {
        this.f12684a = spannable;
    }

    public go4(@mr2 Spanned spanned) {
        this.f12684a = new SpannableString(spanned);
    }

    public go4(@mr2 CharSequence charSequence) {
        this.f12684a = new SpannableString(charSequence);
    }

    /* renamed from: c */
    public static C2264b m15977c() {
        return Build.VERSION.SDK_INT < 28 ? new C2264b() : new C2265c();
    }

    /* renamed from: a */
    public final void mo16741a() {
        Spannable spannable = this.f12684a;
        if (!this.f12685b && m15977c().mo16756a(spannable)) {
            this.f12684a = new SpannableString(spannable);
        }
        this.f12685b = true;
    }

    /* renamed from: b */
    public Spannable mo16742b() {
        return this.f12684a;
    }

    public char charAt(int i) {
        return this.f12684a.charAt(i);
    }

    @mr2
    @sj3(api = 24)
    public IntStream chars() {
        return C2263a.m15980a(this.f12684a);
    }

    @mr2
    @sj3(api = 24)
    public IntStream codePoints() {
        return C2263a.m15981b(this.f12684a);
    }

    public int getSpanEnd(Object obj) {
        return this.f12684a.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        return this.f12684a.getSpanFlags(obj);
    }

    public int getSpanStart(Object obj) {
        return this.f12684a.getSpanStart(obj);
    }

    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return this.f12684a.getSpans(i, i2, cls);
    }

    public int length() {
        return this.f12684a.length();
    }

    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.f12684a.nextSpanTransition(i, i2, cls);
    }

    public void removeSpan(Object obj) {
        mo16741a();
        this.f12684a.removeSpan(obj);
    }

    public void setSpan(Object obj, int i, int i2, int i3) {
        mo16741a();
        this.f12684a.setSpan(obj, i, i2, i3);
    }

    @mr2
    public CharSequence subSequence(int i, int i2) {
        return this.f12684a.subSequence(i, i2);
    }

    @mr2
    public String toString() {
        return this.f12684a.toString();
    }
}
