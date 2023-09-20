package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a-\u0010\u0004\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a/\u0010\u0006\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0005¨\u0006\u0007"}, d2 = {"", "T", "Lcom/onedelhi/secure/hx1;", "value", "a", "(Lcom/onedelhi/secure/hx1;Ljava/lang/Object;)Ljava/lang/Object;", "b", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1})
@uw1(name = "KClasses")
public final class ix1 {
    @vr2
    @gz3(version = "1.4")
    @tw4(markerClass = {ly0.class})
    @ib2
    /* renamed from: a */
    public static final <T> T m52726a(@vr2 hx1<T> hx1, @ss2 Object obj) {
        jt1.m53777p(hx1, "<this>");
        if (hx1.mo37606M(obj)) {
            jt1.m53775n(obj, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
            return obj;
        }
        throw new ClassCastException("Value cannot be cast to " + hx1.mo37609b0());
    }

    @gz3(version = "1.4")
    @tw4(markerClass = {ly0.class})
    @ib2
    @ss2
    /* renamed from: b */
    public static final <T> T m52727b(@vr2 hx1<T> hx1, @ss2 Object obj) {
        jt1.m53777p(hx1, "<this>");
        if (!hx1.mo37606M(obj)) {
            return null;
        }
        jt1.m53775n(obj, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.safeCast");
        return obj;
    }
}
