package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aV\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0002\b\u0007ø\u0001\u0000\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\t\u0010\n\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"T", "Lcom/onedelhi/secure/b90;", "context", "Lkotlin/Function2;", "Lcom/onedelhi/secure/m90;", "Lcom/onedelhi/secure/b80;", "", "Lcom/onedelhi/secure/wy0;", "block", "a", "(Lcom/onedelhi/secure/b90;Lcom/onedelhi/secure/sc1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/BuildersKt")
/* renamed from: com.onedelhi.secure.aq */
public final /* synthetic */ class C4588aq {
    /* renamed from: a */
    public static final <T> T m39009a(@vr2 b90 b90, @vr2 sc1<? super m90, ? super b80<? super T>, ? extends Object> sc1) throws InterruptedException {
        vv0 a;
        lh1 lh1;
        Thread currentThread = Thread.currentThread();
        f80 f80 = (f80) b90.get(f80.f28189a);
        if (f80 == null) {
            a = wb4.f36943a.mo46668b();
            lh1 = lh1.f31667a;
            b90 = b90.plus(a);
        } else {
            vv0 vv0 = null;
            vv0 vv02 = f80 instanceof vv0 ? (vv0) f80 : null;
            if (vv02 != null && vv02.mo41646C1()) {
                vv0 = vv02;
            }
            a = vv0 == null ? wb4.f36943a.mo46667a() : vv0;
            lh1 = lh1.f31667a;
        }
        C5167en enVar = new C5167en(d90.m44809e(lh1, b90), currentThread, a);
        enVar.mo39611J1(q90.DEFAULT, enVar, sc1);
        return enVar.mo35512K1();
    }

    /* renamed from: b */
    public static /* synthetic */ Object m39010b(b90 b90, sc1 sc1, int i, Object obj) throws InterruptedException {
        if ((i & 1) != 0) {
            b90 = gt0.f29313a;
        }
        return C7511zp.m74220f(b90, sc1);
    }
}
