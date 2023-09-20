package com.onedelhi.secure;

import java.util.Iterator;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n\u001a\"\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a0\u0010\b\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\bø\u0001\u0000\u0002\u0007\n\u0005\b20\u0001¨\u0006\t"}, d2 = {"T", "", "f0", "Lcom/onedelhi/secure/cq1;", "g0", "Lkotlin/Function1;", "Lcom/onedelhi/secure/un4;", "operation", "e0", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xs = "kotlin/collections/CollectionsKt")
public class v00 extends u00 {
    /* renamed from: e0 */
    public static final <T> void m67564e0(@vr2 Iterator<? extends T> it, @vr2 ec1<? super T, un4> ec1) {
        jt1.m53777p(it, "<this>");
        jt1.m53777p(ec1, "operation");
        while (it.hasNext()) {
            ec1.mo17094X(it.next());
        }
    }

    @xq1
    /* renamed from: f0 */
    public static final <T> Iterator<T> m67565f0(Iterator<? extends T> it) {
        jt1.m53777p(it, "<this>");
        return it;
    }

    @vr2
    /* renamed from: g0 */
    public static final <T> Iterator<cq1<T>> m67566g0(@vr2 Iterator<? extends T> it) {
        jt1.m53777p(it, "<this>");
        return new eq1(it);
    }
}
