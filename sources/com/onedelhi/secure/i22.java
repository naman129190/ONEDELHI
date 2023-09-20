package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a \u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a*\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\t\u001a\u0004\u0018\u00010\b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u000b"}, d2 = {"T", "Lkotlin/Function0;", "initializer", "Lcom/onedelhi/secure/w12;", "a", "Lcom/onedelhi/secure/o22;", "mode", "b", "", "lock", "c", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xs = "kotlin/LazyKt")
public class i22 {

    @ii2(mo38106k = 3, mo38107mv = {1, 7, 1}, mo38109xi = 48)
    /* renamed from: com.onedelhi.secure.i22$a */
    public /* synthetic */ class C5658a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f30058a;

        static {
            int[] iArr = new int[o22.values().length];
            iArr[o22.SYNCHRONIZED.ordinal()] = 1;
            iArr[o22.PUBLICATION.ordinal()] = 2;
            iArr[o22.NONE.ordinal()] = 3;
            f30058a = iArr;
        }
    }

    @vr2
    /* renamed from: a */
    public static final <T> w12<T> m51739a(@vr2 cc1<? extends T> cc1) {
        jt1.m53777p(cc1, "initializer");
        return new t84(cc1, (Object) null, 2, (wg0) null);
    }

    @vr2
    /* renamed from: b */
    public static final <T> w12<T> m51740b(@vr2 o22 o22, @vr2 cc1<? extends T> cc1) {
        jt1.m53777p(o22, "mode");
        jt1.m53777p(cc1, "initializer");
        int i = C5658a.f30058a[o22.ordinal()];
        if (i == 1) {
            return new t84(cc1, (Object) null, 2, (wg0) null);
        }
        if (i == 2) {
            return new qq3(cc1);
        }
        if (i == 3) {
            return new jo4(cc1);
        }
        throw new gr2();
    }

    @vr2
    /* renamed from: c */
    public static final <T> w12<T> m51741c(@ss2 Object obj, @vr2 cc1<? extends T> cc1) {
        jt1.m53777p(cc1, "initializer");
        return new t84(cc1, obj);
    }
}
