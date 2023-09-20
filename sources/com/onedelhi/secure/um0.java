package com.onedelhi.secure;

import com.onedelhi.secure.nl3;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\b\u001a \u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a.\u0010\n\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\t\u001a\u00020\bH\u0000\u001a\u0010\u0010\u000b\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u0001H\u0002\u001a'\u0010\u0010\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000eH\b\u001a\u0019\u0010\u0013\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\b\"\u0018\u0010\u0016\u001a\u00020\b*\u00020\u00028@X\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\"\u0018\u0010\u0018\u001a\u00020\b*\u00020\u00028@X\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015¨\u0006\u0019"}, d2 = {"T", "Lcom/onedelhi/secure/tm0;", "", "mode", "Lcom/onedelhi/secure/un4;", "a", "Lcom/onedelhi/secure/b80;", "delegate", "", "undispatched", "e", "f", "Lcom/onedelhi/secure/vv0;", "eventLoop", "Lkotlin/Function0;", "block", "h", "", "exception", "g", "c", "(I)Z", "isCancellableMode", "d", "isReusableMode", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class um0 {

    /* renamed from: a */
    public static final int f36183a = 0;

    /* renamed from: b */
    public static final int f36184b = 1;

    /* renamed from: c */
    public static final int f36185c = 2;

    /* renamed from: d */
    public static final int f36186d = 4;

    /* renamed from: e */
    public static final int f36187e = -1;

    /* renamed from: a */
    public static final <T> void m67129a(@vr2 tm0<? super T> tm0, int i) {
        b80<? super T> g = tm0.mo38896g();
        boolean z = i == 4;
        if (z || !(g instanceof qm0) || m67131c(i) != m67131c(tm0.f35730n)) {
            m67133e(tm0, g, z);
            return;
        }
        e90 e90 = ((qm0) g).f34311a;
        b90 f = g.mo31187f();
        if (e90.mo31903S0(f)) {
            e90.mo31902Q0(f, tm0);
        } else {
            m67134f(tm0);
        }
    }

    @z73
    /* renamed from: b */
    public static /* synthetic */ void m67130b() {
    }

    /* renamed from: c */
    public static final boolean m67131c(int i) {
        return i == 1 || i == 2;
    }

    /* renamed from: d */
    public static final boolean m67132d(int i) {
        return i == 2;
    }

    /* renamed from: e */
    public static final <T> void m67133e(@vr2 tm0<? super T> tm0, @vr2 b80<? super T> b80, boolean z) {
        Object obj;
        Object m = tm0.mo38899m();
        Throwable h = tm0.mo38897h(m);
        if (h != null) {
            nl3.C6191a aVar = nl3.f32575a;
            obj = pl3.m61423a(h);
        } else {
            nl3.C6191a aVar2 = nl3.f32575a;
            obj = tm0.mo38898k(m);
        }
        Object b = nl3.m58187b(obj);
        if (z) {
            qm0 qm0 = (qm0) b80;
            b80<T> b802 = qm0.f34310a;
            Object obj2 = qm0.f34313b;
            b90 f = b802.mo31187f();
            Object c = ub4.m66925c(f, obj2);
            on4<?> g = c != ub4.f36021a ? d90.m44811g(b802, f, c) : null;
            try {
                qm0.f34310a.mo31191m0(b);
                un4 un4 = un4.f36206a;
            } finally {
                if (g == null || g.mo41920L1()) {
                    ub4.m66923a(f, c);
                }
            }
        } else {
            b80.mo31191m0(b);
        }
    }

    /* renamed from: f */
    public static final void m67134f(tm0<?> tm0) {
        vv0 b = wb4.f36943a.mo46668b();
        if (b.mo46381w1()) {
            b.mo46376i1(tm0);
            return;
        }
        b.mo46378l1(true);
        try {
            m67133e(tm0, tm0.mo38896g(), true);
            do {
            } while (b.mo46372B1());
        } catch (Throwable th) {
            b.mo46374c1(true);
            throw th;
        }
        b.mo46374c1(true);
    }

    /* renamed from: g */
    public static final void m67135g(@vr2 b80<?> b80, @vr2 Throwable th) {
        nl3.C6191a aVar = nl3.f32575a;
        b80.mo31191m0(nl3.m58187b(pl3.m61423a(th)));
    }

    /* renamed from: h */
    public static final void m67136h(@vr2 tm0<?> tm0, @vr2 vv0 vv0, @vr2 cc1<un4> cc1) {
        vv0.mo46378l1(true);
        try {
            cc1.invoke();
            do {
            } while (vv0.mo46372B1());
        } catch (Throwable th) {
            uq1.m67403d(1);
            vv0.mo46374c1(true);
            uq1.m67402c(1);
            throw th;
        }
        uq1.m67403d(1);
        vv0.mo46374c1(true);
        uq1.m67402c(1);
    }
}
