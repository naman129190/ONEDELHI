package com.onedelhi.secure;

import com.onedelhi.secure.kd1;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a0\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u001a(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007\u001a\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a$\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\n\u001a\u00020\t\u001a\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"T", "Lcom/onedelhi/secure/m81;", "", "capacity", "Lcom/onedelhi/secure/qo;", "onBufferOverflow", "b", "a", "g", "Lcom/onedelhi/secure/b90;", "context", "h", "e", "Lcom/onedelhi/secure/un4;", "f", "(Lcom/onedelhi/secure/b90;)V", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class x81 {
    @vr2
    /* renamed from: b */
    public static final <T> m81<T> m70013b(@vr2 m81<? extends T> m81, int i, @vr2 C6593qo qoVar) {
        C6593qo qoVar2;
        int i2;
        boolean z = true;
        if (i >= 0 || i == -2 || i == -1) {
            if (i == -1 && qoVar != C6593qo.SUSPEND) {
                z = false;
            }
            if (z) {
                if (i == -1) {
                    qoVar2 = C6593qo.DROP_OLDEST;
                    i2 = 0;
                } else {
                    i2 = i;
                    qoVar2 = qoVar;
                }
                return m81 instanceof kd1 ? kd1.C5885a.m54318a((kd1) m81, (b90) null, i2, qoVar2, 1, (Object) null) : new C5199ew(m81, (b90) null, i2, qoVar2, 2, (wg0) null);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        }
        throw new IllegalArgumentException(jt1.m53745C("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ", Integer.valueOf(i)).toString());
    }

    /* renamed from: c */
    public static /* synthetic */ m81 m70014c(m81 m81, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -2;
        }
        return m70015d(m81, i, (C6593qo) null, 2, (Object) null);
    }

    /* renamed from: d */
    public static /* synthetic */ m81 m70015d(m81 m81, int i, C6593qo qoVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -2;
        }
        if ((i2 & 2) != 0) {
            qoVar = C6593qo.SUSPEND;
        }
        return s81.m64375o(m81, i, qoVar);
    }

    @vr2
    /* renamed from: e */
    public static final <T> m81<T> m70016e(@vr2 m81<? extends T> m81) {
        return m81 instanceof C6142mu ? m81 : new C6228nu(m81);
    }

    /* renamed from: f */
    public static final void m70017f(b90 b90) {
        if (!(b90.get(ru1.f34751a) == null)) {
            throw new IllegalArgumentException(jt1.m53745C("Flow context cannot contain job in it. Had ", b90).toString());
        }
    }

    @vr2
    /* renamed from: g */
    public static final <T> m81<T> m70018g(@vr2 m81<? extends T> m81) {
        return m70015d(m81, -1, (C6593qo) null, 2, (Object) null);
    }

    @vr2
    /* renamed from: h */
    public static final <T> m81<T> m70019h(@vr2 m81<? extends T> m81, @vr2 b90 b90) {
        m70017f(b90);
        return jt1.m53768g(b90, gt0.f29313a) ? m81 : m81 instanceof kd1 ? kd1.C5885a.m54318a((kd1) m81, b90, 0, (C6593qo) null, 6, (Object) null) : new C5199ew(m81, b90, 0, (C6593qo) null, 12, (wg0) null);
    }
}
