package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u001a'\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\bø\u0001\u0000\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u001a'\u0010\u0005\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\bø\u0001\u0000\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u0002\u0007\n\u0005\b20\u0001¨\u0006\u0006"}, d2 = {"Lkotlin/Function0;", "Lcom/onedelhi/secure/un4;", "block", "", "b", "a", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1})
@uw1(name = "TimingKt")
public final class ve4 {
    /* renamed from: a */
    public static final long m67990a(@vr2 cc1<un4> cc1) {
        jt1.m53777p(cc1, "block");
        long nanoTime = System.nanoTime();
        cc1.invoke();
        return System.nanoTime() - nanoTime;
    }

    /* renamed from: b */
    public static final long m67991b(@vr2 cc1<un4> cc1) {
        jt1.m53777p(cc1, "block");
        long currentTimeMillis = System.currentTimeMillis();
        cc1.invoke();
        return System.currentTimeMillis() - currentTimeMillis;
    }
}
