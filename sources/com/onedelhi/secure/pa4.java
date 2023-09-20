package com.onedelhi.secure;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0007¨\u0006\u0007"}, d2 = {"Lcom/onedelhi/secure/oa4;", "testContext", "Lkotlin/Function1;", "Lcom/onedelhi/secure/un4;", "Lcom/onedelhi/secure/wy0;", "testBody", "a", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class pa4 {
    @xj0(level = ak0.ERROR, message = "This API has been deprecated to integrate with Structured Concurrency.", replaceWith = @oi3(expression = "testContext.runBlockingTest(testBody)", imports = {"kotlin.coroutines.test"}))
    /* renamed from: a */
    public static final void m60832a(@vr2 oa4 oa4, @vr2 ec1<? super oa4, un4> ec1) {
        ec1.mo17094X(oa4);
        List<Throwable> F = oa4.mo41632F();
        boolean z = true;
        if (!(F instanceof Collection) || !F.isEmpty()) {
            Iterator<T> it = F.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!(((Throwable) it.next()) instanceof CancellationException)) {
                        z = false;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (!z) {
            throw new AssertionError(jt1.m53745C("Coroutine encountered unhandled exceptions:\n", oa4.mo41632F()));
        }
    }

    /* renamed from: b */
    public static /* synthetic */ void m60833b(oa4 oa4, ec1 ec1, int i, Object obj) {
        if ((i & 1) != 0) {
            oa4 = new oa4((String) null, 1, (wg0) null);
        }
        m60832a(oa4, ec1);
    }
}
