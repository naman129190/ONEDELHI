package com.onedelhi.secure;

import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, d2 = {"Lcom/onedelhi/secure/hu1;", "Lcom/onedelhi/secure/n23;", "", "cause", "exception", "Lcom/onedelhi/secure/un4;", "a", "", "d", "<init>", "()V", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 6, 0})
public class hu1 extends n23 {
    /* renamed from: a */
    public void mo37549a(@vr2 Throwable th, @vr2 Throwable th2) {
        jt1.m53777p(th, "cause");
        jt1.m53777p(th2, "exception");
        th.addSuppressed(th2);
    }

    @vr2
    /* renamed from: d */
    public List<Throwable> mo37550d(@vr2 Throwable th) {
        jt1.m53777p(th, "exception");
        Throwable[] suppressed = th.getSuppressed();
        jt1.m53776o(suppressed, "exception.suppressed");
        return C7458za.m72983t(suppressed);
    }
}
