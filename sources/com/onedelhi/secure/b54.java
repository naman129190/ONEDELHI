package com.onedelhi.secure;

import android.text.TextUtils;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\r\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\b¨\u0006\u0002"}, d2 = {"", "a", "core-ktx_release"}, k = 2, mv = {1, 6, 0})
public final class b54 {
    @vr2
    /* renamed from: a */
    public static final String m11573a(@vr2 String str) {
        jt1.m53777p(str, "<this>");
        String htmlEncode = TextUtils.htmlEncode(str);
        jt1.m53776o(htmlEncode, "htmlEncode(this)");
        return htmlEncode;
    }
}
