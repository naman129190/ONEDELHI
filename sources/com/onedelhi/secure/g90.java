package com.onedelhi.secure;

import com.onedelhi.secure.nl3;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¨\u0006\u0006"}, d2 = {"Lcom/onedelhi/secure/b90;", "context", "", "exception", "Lcom/onedelhi/secure/un4;", "a", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class g90 {
    @vr2

    /* renamed from: a */
    public static final List<f90> f29003a;

    static {
        Class<f90> cls = f90.class;
        f29003a = hu3.m51011c3(fu3.m48487e(ServiceLoader.load(cls, cls.getClassLoader()).iterator()));
    }

    /* renamed from: a */
    public static final void m49137a(@vr2 b90 b90, @vr2 Throwable th) {
        for (f90 handleException : f29003a) {
            try {
                handleException.handleException(b90, th);
            } catch (Throwable th2) {
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, h90.m50305c(th, th2));
            }
        }
        Thread currentThread2 = Thread.currentThread();
        try {
            nl3.C6191a aVar = nl3.f32575a;
            pw0.m61687a(th, new uk0(b90));
            nl3.m58187b(un4.f36206a);
        } catch (Throwable th3) {
            nl3.C6191a aVar2 = nl3.f32575a;
            nl3.m58187b(pl3.m61423a(th3));
        }
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }
}
