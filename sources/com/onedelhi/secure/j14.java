package com.onedelhi.secure;

import android.text.Spanned;
import android.text.SpannedString;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\b\u001a<\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\b\"\n\b\u0000\u0010\u0004\u0018\u0001*\u00020\u0003*\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005H\b¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "Landroid/text/Spanned;", "c", "", "T", "", "start", "end", "", "a", "(Landroid/text/Spanned;II)[Ljava/lang/Object;", "core-ktx_release"}, k = 2, mv = {1, 6, 0})
public final class j14 {
    /* renamed from: a */
    public static final /* synthetic */ <T> T[] m18074a(Spanned spanned, int i, int i2) {
        jt1.m53777p(spanned, "<this>");
        jt1.m53786y(4, mx0.f16794s2);
        T[] spans = spanned.getSpans(i, i2, Object.class);
        jt1.m53776o(spans, "getSpans(start, end, T::class.java)");
        return spans;
    }

    /* renamed from: b */
    public static /* synthetic */ Object[] m18075b(Spanned spanned, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = spanned.length();
        }
        jt1.m53777p(spanned, "<this>");
        jt1.m53786y(4, mx0.f16794s2);
        Object[] spans = spanned.getSpans(i, i2, Object.class);
        jt1.m53776o(spans, "getSpans(start, end, T::class.java)");
        return spans;
    }

    @vr2
    /* renamed from: c */
    public static final Spanned m18076c(@vr2 CharSequence charSequence) {
        jt1.m53777p(charSequence, "<this>");
        SpannedString valueOf = SpannedString.valueOf(charSequence);
        jt1.m53776o(valueOf, "valueOf(this)");
        return valueOf;
    }
}
