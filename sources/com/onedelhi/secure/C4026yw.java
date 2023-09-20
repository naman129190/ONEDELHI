package com.onedelhi.secure;

import android.text.TextUtils;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0010\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\b\u001a\r\u0010\u0004\u001a\u00020\u0003*\u00020\u0000H\b¨\u0006\u0005"}, d2 = {"", "", "a", "", "b", "core-ktx_release"}, k = 2, mv = {1, 6, 0})
/* renamed from: com.onedelhi.secure.yw */
public final class C4026yw {
    /* renamed from: a */
    public static final boolean m32745a(@vr2 CharSequence charSequence) {
        jt1.m53777p(charSequence, "<this>");
        return TextUtils.isDigitsOnly(charSequence);
    }

    /* renamed from: b */
    public static final int m32746b(@vr2 CharSequence charSequence) {
        jt1.m53777p(charSequence, "<this>");
        return TextUtils.getTrimmedLength(charSequence);
    }
}
