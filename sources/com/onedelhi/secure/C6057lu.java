package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u001a\b\u0004\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00020\u00030\u0001HHø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a5\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u001a\b\u0004\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00020\u00030\u0001HHø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0006\u001a\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0000\u001a\u0018\u0010\u000e\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\r\u001a\u00020\fH\u0000\u001a\u0018\u0010\u0011\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0007\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"T", "Lkotlin/Function1;", "Lcom/onedelhi/secure/iu;", "Lcom/onedelhi/secure/un4;", "block", "d", "(Lcom/onedelhi/secure/ec1;Lcom/onedelhi/secure/b80;)Ljava/lang/Object;", "f", "Lcom/onedelhi/secure/b80;", "delegate", "Lcom/onedelhi/secure/ju;", "b", "Lcom/onedelhi/secure/l82;", "node", "c", "Lcom/onedelhi/secure/fn0;", "handle", "a", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* renamed from: com.onedelhi.secure.lu */
public final class C6057lu {
    @zs1
    /* renamed from: a */
    public static final void m56508a(@vr2 C5744iu<?> iuVar, @vr2 fn0 fn0) {
        iuVar.mo38232J(new gn0(fn0));
    }

    @vr2
    /* renamed from: b */
    public static final <T> C5847ju<T> m56509b(@vr2 b80<? super T> b80) {
        if (!(b80 instanceof qm0)) {
            return new C5847ju<>(b80, 1);
        }
        C5847ju<T> p = ((qm0) b80).mo43671p();
        if (p == null || !p.mo38889M()) {
            p = null;
        }
        return p == null ? new C5847ju<>(b80, 2) : p;
    }

    /* renamed from: c */
    public static final void m56510c(@vr2 C5744iu<?> iuVar, @vr2 l82 l82) {
        iuVar.mo38232J(new ci3(l82));
    }

    @ss2
    /* renamed from: d */
    public static final <T> Object m56511d(@vr2 ec1<? super C5744iu<? super T>, un4> ec1, @vr2 b80<? super T> b80) {
        C5847ju juVar = new C5847ju(lt1.m56482d(b80), 1);
        juVar.mo38234T();
        ec1.mo17094X(juVar);
        Object A = juVar.mo38880A();
        if (A == mt1.m57558h()) {
            hf0.m50483c(b80);
        }
        return A;
    }

    /* renamed from: e */
    public static final <T> Object m56512e(ec1<? super C5744iu<? super T>, un4> ec1, b80<? super T> b80) {
        uq1.m67404e(0);
        C5847ju juVar = new C5847ju(lt1.m56482d(b80), 1);
        juVar.mo38234T();
        ec1.mo17094X(juVar);
        Object A = juVar.mo38880A();
        if (A == mt1.m57558h()) {
            hf0.m50483c(b80);
        }
        uq1.m67404e(1);
        return A;
    }

    @ss2
    /* renamed from: f */
    public static final <T> Object m56513f(@vr2 ec1<? super C5744iu<? super T>, un4> ec1, @vr2 b80<? super T> b80) {
        C5847ju<? super T> b = m56509b(lt1.m56482d(b80));
        ec1.mo17094X(b);
        Object A = b.mo38880A();
        if (A == mt1.m57558h()) {
            hf0.m50483c(b80);
        }
        return A;
    }

    /* renamed from: g */
    public static final <T> Object m56514g(ec1<? super C5744iu<? super T>, un4> ec1, b80<? super T> b80) {
        uq1.m67404e(0);
        C5847ju<? super T> b = m56509b(lt1.m56482d(b80));
        ec1.mo17094X(b);
        Object A = b.mo38880A();
        if (A == mt1.m57558h()) {
            hf0.m50483c(b80);
        }
        uq1.m67404e(1);
        return A;
    }
}
