package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.text.Spannable;
import android.text.SpannableString;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\b\u001a\r\u0010\u0004\u001a\u00020\u0003*\u00020\u0001H\b\u001a%\u0010\n\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\n\u001a\u001d\u0010\r\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\bH\n¨\u0006\u000e"}, d2 = {"", "Landroid/text/Spannable;", "d", "Lcom/onedelhi/secure/un4;", "a", "", "start", "end", "", "span", "b", "Lcom/onedelhi/secure/is1;", "range", "c", "core-ktx_release"}, k = 2, mv = {1, 6, 0})
public final class i14 {
    @SuppressLint({"SyntheticAccessor"})
    /* renamed from: a */
    public static final void m17116a(@vr2 Spannable spannable) {
        jt1.m53777p(spannable, "<this>");
        Object[] spans = spannable.getSpans(0, spannable.length(), Object.class);
        jt1.m53776o(spans, "getSpans(start, end, T::class.java)");
        for (Object removeSpan : spans) {
            spannable.removeSpan(removeSpan);
        }
    }

    /* renamed from: b */
    public static final void m17117b(@vr2 Spannable spannable, int i, int i2, @vr2 Object obj) {
        jt1.m53777p(spannable, "<this>");
        jt1.m53777p(obj, "span");
        spannable.setSpan(obj, i, i2, 17);
    }

    /* renamed from: c */
    public static final void m17118c(@vr2 Spannable spannable, @vr2 is1 is1, @vr2 Object obj) {
        jt1.m53777p(spannable, "<this>");
        jt1.m53777p(is1, "range");
        jt1.m53777p(obj, "span");
        spannable.setSpan(obj, is1.mo27428i().intValue(), is1.mo27427g().intValue(), 17);
    }

    @vr2
    /* renamed from: d */
    public static final Spannable m17119d(@vr2 CharSequence charSequence) {
        jt1.m53777p(charSequence, "<this>");
        SpannableString valueOf = SpannableString.valueOf(charSequence);
        jt1.m53776o(valueOf, "valueOf(this)");
        return valueOf;
    }
}
