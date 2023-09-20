package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a<\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\bø\u0001\u0000\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0007\n\u0005\b20\u0001¨\u0006\u0007"}, d2 = {"R", "", "lock", "Lkotlin/Function0;", "block", "l", "(Ljava/lang/Object;Lcom/onedelhi/secure/cc1;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xs = "kotlin/StandardKt")
public class r24 extends q24 {
    @xq1
    /* renamed from: l */
    public static final <R> R m63358l(Object obj, cc1<? extends R> cc1) {
        R invoke;
        jt1.m53777p(obj, "lock");
        jt1.m53777p(cc1, "block");
        synchronized (obj) {
            try {
                invoke = cc1.invoke();
                uq1.m67403d(1);
            } catch (Throwable th) {
                uq1.m67403d(1);
                uq1.m67402c(1);
                throw th;
            }
        }
        uq1.m67402c(1);
        return invoke;
    }
}
