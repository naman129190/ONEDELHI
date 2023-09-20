package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0007\n\u0005\b20\u0001¨\u0006\u0007"}, d2 = {"T", "", "sectionName", "Lkotlin/Function0;", "block", "a", "(Ljava/lang/String;Lcom/onedelhi/secure/cc1;)Ljava/lang/Object;", "core-ktx_release"}, k = 2, mv = {1, 6, 0})
public final class dg4 {
    @xj0(message = "Use androidx.tracing.Trace instead", replaceWith = @oi3(expression = "trace(sectionName)", imports = {"androidx.tracing.trace"}))
    /* renamed from: a */
    public static final <T> T m13105a(@vr2 String str, @vr2 cc1<? extends T> cc1) {
        jt1.m53777p(str, "sectionName");
        jt1.m53777p(cc1, "block");
        cg4.m12477b(str);
        try {
            return cc1.invoke();
        } finally {
            uq1.m67403d(1);
            cg4.m12479d();
            uq1.m67402c(1);
        }
    }
}
