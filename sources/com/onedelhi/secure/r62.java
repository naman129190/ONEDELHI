package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import java.util.Locale;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\"\u0016\u0010\u0004\u001a\u00020\u0001*\u00020\u00008Ç\u0002¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ljava/util/Locale;", "", "a", "(Ljava/util/Locale;)I", "layoutDirection", "core-ktx_release"}, k = 2, mv = {1, 6, 0})
@SuppressLint({"ClassVerificationFailure"})
public final class r62 {
    @sj3(17)
    /* renamed from: a */
    public static final int m26347a(@vr2 Locale locale) {
        jt1.m53777p(locale, "<this>");
        return TextUtils.getLayoutDirectionFromLocale(locale);
    }
}
