package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u001f\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\nø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"Lcom/onedelhi/secure/rd4;", "other", "Lcom/onedelhi/secure/fq0;", "b", "(Lcom/onedelhi/secure/rd4;Lcom/onedelhi/secure/rd4;)J", "", "a", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1})
public final class fe4 {
    @my0
    @xj0(level = ak0.ERROR, message = "Comparing one TimeMark to another is not a well defined operation because these time marks could have been obtained from the different time sources.")
    @gz3(version = "1.3")
    @xq1
    /* renamed from: a */
    public static final int m47758a(rd4 rd4, rd4 rd42) {
        jt1.m53777p(rd4, "<this>");
        jt1.m53777p(rd42, "other");
        throw new Error("Operation is disallowed.");
    }

    @my0
    @xj0(level = ak0.ERROR, message = "Subtracting one TimeMark from another is not a well defined operation because these time marks could have been obtained from the different time sources.")
    @gz3(version = "1.3")
    @xq1
    /* renamed from: b */
    public static final long m47759b(rd4 rd4, rd4 rd42) {
        jt1.m53777p(rd4, "<this>");
        jt1.m53777p(rd42, "other");
        throw new Error("Operation is disallowed.");
    }
}
