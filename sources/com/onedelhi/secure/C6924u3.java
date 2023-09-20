package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0001\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062-\b\u0002\u0010\u000f\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\bj\u0004\u0018\u0001`\u000e2-\u0010\u0015\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0010¢\u0006\u0002\b\u0014H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"E", "Lcom/onedelhi/secure/m90;", "Lcom/onedelhi/secure/b90;", "context", "", "capacity", "Lcom/onedelhi/secure/q90;", "start", "Lkotlin/Function1;", "", "Lcom/onedelhi/secure/iy2;", "name", "cause", "Lcom/onedelhi/secure/un4;", "Lkotlinx/coroutines/CompletionHandler;", "onCompletion", "Lkotlin/Function2;", "Lcom/onedelhi/secure/v3;", "Lcom/onedelhi/secure/b80;", "", "Lcom/onedelhi/secure/wy0;", "block", "Lcom/onedelhi/secure/st3;", "a", "(Lcom/onedelhi/secure/m90;Lcom/onedelhi/secure/b90;ILcom/onedelhi/secure/q90;Lcom/onedelhi/secure/ec1;Lcom/onedelhi/secure/sc1;)Lcom/onedelhi/secure/st3;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* renamed from: com.onedelhi.secure.u3 */
public final class C6924u3 {
    @cu2
    @vr2
    /* renamed from: a */
    public static final <E> st3<E> m66423a(@vr2 m90 m90, @vr2 b90 b90, int i, @vr2 q90 q90, @ss2 ec1<? super Throwable, un4> ec1, @vr2 sc1<? super C7007v3<E>, ? super b80<? super un4>, ? extends Object> sc1) {
        b90 e = d90.m44809e(m90, b90);
        C7184wv d = C5751iw.m52711d(i, (C6593qo) null, (ec1) null, 6, (Object) null);
        C6826t3 y12 = q90.mo43178g() ? new y12(e, d, sc1) : new C6826t3(e, d, true);
        if (ec1 != null) {
            y12.mo32078F0(ec1);
        }
        y12.mo39611J1(q90, y12, sc1);
        return y12;
    }

    /* renamed from: b */
    public static /* synthetic */ st3 m66424b(m90 m90, b90 b90, int i, q90 q90, ec1 ec1, sc1 sc1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            b90 = gt0.f29313a;
        }
        b90 b902 = b90;
        int i3 = (i2 & 2) != 0 ? 0 : i;
        if ((i2 & 4) != 0) {
            q90 = q90.DEFAULT;
        }
        q90 q902 = q90;
        if ((i2 & 8) != 0) {
            ec1 = null;
        }
        return m66423a(m90, b902, i3, q902, ec1, sc1);
    }
}
