package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a2\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\t\u001a\u00020\u00052\n\u0010\b\u001a\u00020\u0005\"\u00020\u0003H\bø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u0002\u000b\n\u0005\b20\u0001\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"", "size", "Lkotlin/Function1;", "Lcom/onedelhi/secure/tl4;", "init", "Lcom/onedelhi/secure/ul4;", "a", "(ILcom/onedelhi/secure/ec1;)[J", "elements", "b", "([J)[J", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1})
public final class vl4 {
    @oy0
    @gz3(version = "1.3")
    @xq1
    /* renamed from: a */
    public static final long[] m68225a(int i, ec1<? super Integer, tl4> ec1) {
        jt1.m53777p(ec1, "init");
        long[] jArr = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            jArr[i2] = ec1.mo17094X(Integer.valueOf(i2)).mo45180r0();
        }
        return ul4.m67111i(jArr);
    }

    @gz3(version = "1.3")
    @xq1
    @oy0
    /* renamed from: b */
    public static final long[] m68226b(long... jArr) {
        jt1.m53777p(jArr, "elements");
        return jArr;
    }
}
