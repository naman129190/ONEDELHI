package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000\u001a&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u001a]\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00028\u00012\b\b\u0002\u0010\f\u001a\u00020\u000b2\"\u0010\u000f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\rH@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"T", "Lcom/onedelhi/secure/m81;", "Lcom/onedelhi/secure/zv;", "b", "Lcom/onedelhi/secure/o81;", "Lcom/onedelhi/secure/b90;", "emitContext", "e", "V", "newContext", "value", "", "countOrElement", "Lkotlin/Function2;", "Lcom/onedelhi/secure/b80;", "block", "c", "(Lcom/onedelhi/secure/b90;Ljava/lang/Object;Ljava/lang/Object;Lcom/onedelhi/secure/sc1;Lcom/onedelhi/secure/b80;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* renamed from: com.onedelhi.secure.bw */
public final class C4707bw {
    @vr2
    /* renamed from: b */
    public static final <T> C7517zv<T> m40589b(@vr2 m81<? extends T> m81) {
        C7517zv<T> zvVar = m81 instanceof C7517zv ? (C7517zv) m81 : null;
        return zvVar == null ? new C5199ew(m81, (b90) null, 0, (C6593qo) null, 14, (wg0) null) : zvVar;
    }

    /* JADX INFO: finally extract failed */
    @ss2
    /* renamed from: c */
    public static final <T, V> Object m40590c(@vr2 b90 b90, V v, @vr2 Object obj, @vr2 sc1<? super V, ? super b80<? super T>, ? extends Object> sc1, @vr2 b80<? super T> b80) {
        Object c = ub4.m66925c(b90, obj);
        try {
            Object h0 = ((sc1) lj4.m55703q(sc1, 2)).mo21054h0(v, new g24(b80, b90));
            ub4.m66923a(b90, c);
            if (h0 == mt1.m57558h()) {
                hf0.m50483c(b80);
            }
            return h0;
        } catch (Throwable th) {
            ub4.m66923a(b90, c);
            throw th;
        }
    }

    /* renamed from: d */
    public static /* synthetic */ Object m40591d(b90 b90, Object obj, Object obj2, sc1 sc1, b80 b80, int i, Object obj3) {
        if ((i & 4) != 0) {
            obj2 = ub4.m66924b(b90);
        }
        return m40590c(b90, obj, obj2, sc1, b80);
    }

    /* renamed from: e */
    public static final <T> o81<T> m40592e(o81<? super T> o81, b90 b90) {
        return o81 instanceof xt3 ? true : o81 instanceof rr2 ? o81 : new nn4(o81, b90);
    }
}
