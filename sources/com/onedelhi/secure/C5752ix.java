package com.onedelhi.secure;

import java.nio.charset.Charset;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\b¨\u0006\u0004"}, d2 = {"", "charsetName", "Ljava/nio/charset/Charset;", "a", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1})
@uw1(name = "CharsetsKt")
/* renamed from: com.onedelhi.secure.ix */
public final class C5752ix {
    @xq1
    /* renamed from: a */
    public static final Charset m52725a(String str) {
        jt1.m53777p(str, "charsetName");
        Charset forName = Charset.forName(str);
        jt1.m53776o(forName, "forName(charsetName)");
        return forName;
    }
}
