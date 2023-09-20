package com.onedelhi.secure;

import com.onedelhi.secure.st3;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;

@cu2
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H&J\u001a\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006H&J\u0014\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\nH'¨\u0006\r"}, d2 = {"Lcom/onedelhi/secure/eo;", "E", "Lcom/onedelhi/secure/st3;", "Lcom/onedelhi/secure/lg3;", "W", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "Lcom/onedelhi/secure/un4;", "c", "", "", "a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: com.onedelhi.secure.eo */
public interface C5168eo<E> extends st3<E> {

    @ii2(mo38106k = 3, mo38107mv = {1, 6, 0}, mo38109xi = 48)
    /* renamed from: com.onedelhi.secure.eo$a */
    public static final class C5169a {
        /* renamed from: a */
        public static /* synthetic */ void m47068a(C5168eo eoVar, CancellationException cancellationException, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    cancellationException = null;
                }
                eoVar.mo35517c(cancellationException);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        /* renamed from: b */
        public static /* synthetic */ boolean m47069b(C5168eo eoVar, Throwable th, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    th = null;
                }
                return eoVar.mo35516a(th);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        @xj0(level = ak0.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @oi3(expression = "trySend(element).isSuccess", imports = {}))
        /* renamed from: c */
        public static <E> boolean m47070c(@vr2 C5168eo<E> eoVar, E e) {
            return st3.C6793a.m64881c(eoVar, e);
        }
    }

    @vr2
    /* renamed from: W */
    lg3<E> mo30419W();

    @xj0(level = ak0.HIDDEN, message = "Binary compatibility only")
    /* renamed from: a */
    /* synthetic */ boolean mo35516a(Throwable th);

    /* renamed from: c */
    void mo35517c(@ss2 CancellationException cancellationException);
}
