package com.onedelhi.secure;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u0015\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u0006\u0010\u0004\u001a\u00020\u0000\u001aO\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00052'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006¢\u0006\u0002\b\tH@ø\u0001\u0000\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u001c\u0010\u0012\u001a\u00020\u0011*\u00020\u00002\u0010\b\u0002\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f\u001a\u001e\u0010\u0016\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0015\u001a\n\u0010\u0017\u001a\u00020\u0011*\u00020\u0000\u001a\u0013\u0010\u0018\u001a\u00020\u0001HHø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\"\u001b\u0010\u001f\u001a\u00020\u001a*\u00020\u00008F¢\u0006\f\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001c\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"Lcom/onedelhi/secure/m90;", "Lcom/onedelhi/secure/b90;", "context", "m", "b", "R", "Lkotlin/Function2;", "Lcom/onedelhi/secure/b80;", "", "Lcom/onedelhi/secure/wy0;", "block", "g", "(Lcom/onedelhi/secure/sc1;Lcom/onedelhi/secure/b80;)Ljava/lang/Object;", "a", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "Lcom/onedelhi/secure/un4;", "d", "", "message", "", "c", "j", "h", "(Lcom/onedelhi/secure/b80;)Ljava/lang/Object;", "", "k", "(Lcom/onedelhi/secure/m90;)Z", "isActive$annotations", "(Lcom/onedelhi/secure/m90;)V", "isActive", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class n90 {
    @vr2
    /* renamed from: a */
    public static final m90 m58007a(@vr2 b90 b90) {
        if (b90.get(ru1.f34751a) == null) {
            b90 = b90.plus(zu1.m74305c((ru1) null, 1, (Object) null));
        }
        return new y70(b90);
    }

    @vr2
    /* renamed from: b */
    public static final m90 m58008b() {
        return new y70(w64.m69058c((ru1) null, 1, (Object) null).plus(wm0.m69462e()));
    }

    /* renamed from: c */
    public static final void m58009c(@vr2 m90 m90, @vr2 String str, @ss2 Throwable th) {
        m58010d(m90, nw0.m58835a(str, th));
    }

    /* renamed from: d */
    public static final void m58010d(@vr2 m90 m90, @ss2 CancellationException cancellationException) {
        ru1 ru1 = (ru1) m90.mo39612u().get(ru1.f34751a);
        if (ru1 != null) {
            ru1.mo32105c(cancellationException);
            return;
        }
        throw new IllegalStateException(jt1.m53745C("Scope cannot be cancelled because it does not have a job: ", m90).toString());
    }

    /* renamed from: e */
    public static /* synthetic */ void m58011e(m90 m90, String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        m58009c(m90, str, th);
    }

    /* renamed from: f */
    public static /* synthetic */ void m58012f(m90 m90, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        m58010d(m90, cancellationException);
    }

    @ss2
    /* renamed from: g */
    public static final <R> Object m58013g(@vr2 sc1<? super m90, ? super b80<? super R>, ? extends Object> sc1, @vr2 b80<? super R> b80) {
        js3 js3 = new js3(b80.mo31187f(), b80);
        Object f = pn4.m61467f(js3, js3, sc1);
        if (f == mt1.m57558h()) {
            hf0.m50483c(b80);
        }
        return f;
    }

    @ss2
    /* renamed from: h */
    public static final Object m58014h(@vr2 b80<? super b90> b80) {
        return b80.mo31187f();
    }

    /* renamed from: i */
    public static final Object m58015i(b80<? super b90> b80) {
        uq1.m67404e(3);
        throw null;
    }

    /* renamed from: j */
    public static final void m58016j(@vr2 m90 m90) {
        xu1.m70832z(m90.mo39612u());
    }

    /* renamed from: k */
    public static final boolean m58017k(@vr2 m90 m90) {
        ru1 ru1 = (ru1) m90.mo39612u().get(ru1.f34751a);
        if (ru1 == null) {
            return true;
        }
        return ru1.mo32103b();
    }

    /* renamed from: l */
    public static /* synthetic */ void m58018l(m90 m90) {
    }

    @vr2
    /* renamed from: m */
    public static final m90 m58019m(@vr2 m90 m90, @vr2 b90 b90) {
        return new y70(m90.mo39612u().plus(b90));
    }
}
