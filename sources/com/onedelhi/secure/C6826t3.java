package com.onedelhi.secure;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B%\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0014¨\u0006\u0012"}, d2 = {"Lcom/onedelhi/secure/t3;", "E", "Lcom/onedelhi/secure/yv;", "Lcom/onedelhi/secure/v3;", "", "cause", "Lcom/onedelhi/secure/un4;", "m1", "exception", "", "U0", "Lcom/onedelhi/secure/b90;", "parentContext", "Lcom/onedelhi/secure/wv;", "channel", "active", "<init>", "(Lcom/onedelhi/secure/b90;Lcom/onedelhi/secure/wv;Z)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: com.onedelhi.secure.t3 */
public class C6826t3<E> extends C7391yv<E> implements C7007v3<E> {
    public C6826t3(@vr2 b90 b90, @vr2 C7184wv<E> wvVar, boolean z) {
        super(b90, wvVar, false, z);
        mo32095W0((ru1) b90.get(ru1.f34751a));
    }

    /* renamed from: U0 */
    public boolean mo32093U0(@vr2 Throwable th) {
        h90.m50304b(mo31187f(), th);
        return true;
    }

    /* renamed from: m1 */
    public void mo32125m1(@ss2 Throwable th) {
        C7184wv K1 = mo48009K1();
        CancellationException cancellationException = null;
        if (th != null) {
            if (th instanceof CancellationException) {
                cancellationException = (CancellationException) th;
            }
            if (cancellationException == null) {
                cancellationException = nw0.m58835a(jt1.m53745C(if0.m52224a(this), " was cancelled"), th);
            }
        }
        K1.mo37698c(cancellationException);
    }
}
