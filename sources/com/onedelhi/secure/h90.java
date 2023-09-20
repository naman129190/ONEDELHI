package com.onedelhi.secure;

import com.onedelhi.secure.f90;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u001a\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0000\u001a%\u0010\f\u001a\u00020\u000b2\u001a\b\u0004\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\tH\b¨\u0006\r"}, d2 = {"Lcom/onedelhi/secure/b90;", "context", "", "exception", "Lcom/onedelhi/secure/un4;", "b", "originalException", "thrownException", "c", "Lkotlin/Function2;", "handler", "Lcom/onedelhi/secure/f90;", "a", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class h90 {

    @Metadata(bv = {}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"com/onedelhi/secure/h90$a", "Lcom/onedelhi/secure/m0;", "Lcom/onedelhi/secure/f90;", "Lcom/onedelhi/secure/b90;", "context", "", "exception", "Lcom/onedelhi/secure/un4;", "handleException", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.h90$a */
    public static final class C5487a extends C6072m0 implements f90 {

        /* renamed from: a */
        public final /* synthetic */ sc1<b90, Throwable, un4> f29541a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5487a(sc1<? super b90, ? super Throwable, un4> sc1, f90.C5220b bVar) {
            super(bVar);
            this.f29541a = sc1;
        }

        public void handleException(@vr2 b90 b90, @vr2 Throwable th) {
            this.f29541a.mo21054h0(b90, th);
        }
    }

    @vr2
    /* renamed from: a */
    public static final f90 m50303a(@vr2 sc1<? super b90, ? super Throwable, un4> sc1) {
        return new C5487a(sc1, f90.f28193a);
    }

    @zs1
    /* renamed from: b */
    public static final void m50304b(@vr2 b90 b90, @vr2 Throwable th) {
        try {
            f90 f90 = (f90) b90.get(f90.f28193a);
            if (f90 == null) {
                g90.m49137a(b90, th);
            } else {
                f90.handleException(b90, th);
            }
        } catch (Throwable th2) {
            g90.m49137a(b90, m50305c(th, th2));
        }
    }

    @vr2
    /* renamed from: c */
    public static final Throwable m50305c(@vr2 Throwable th, @vr2 Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        pw0.m61687a(runtimeException, th);
        return runtimeException;
    }
}
