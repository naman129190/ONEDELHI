package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000B\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a0\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u001a%\u0010\f\u001a\u0004\u0018\u00010\t*\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\r\u001a-\u0010\u0010\u001a\u00020\u000f*\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a6\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00122\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¨\u0006\u0018"}, d2 = {"T", "", "replay", "extraBufferCapacity", "Lcom/onedelhi/secure/qo;", "onBufferOverflow", "Lcom/onedelhi/secure/xm2;", "a", "", "", "", "index", "f", "([Ljava/lang/Object;J)Ljava/lang/Object;", "item", "Lcom/onedelhi/secure/un4;", "h", "([Ljava/lang/Object;JLjava/lang/Object;)V", "Lcom/onedelhi/secure/qx3;", "Lcom/onedelhi/secure/b90;", "context", "capacity", "Lcom/onedelhi/secure/m81;", "e", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class sx3 {
    @rw1
    @vr2

    /* renamed from: a */
    public static final l84 f35242a = new l84("NO_VALUE");

    @vr2
    /* renamed from: a */
    public static final <T> xm2<T> m64942a(int i, int i2, @vr2 C6593qo qoVar) {
        boolean z = true;
        if (i >= 0) {
            if (i2 >= 0) {
                if (i <= 0 && i2 <= 0 && qoVar != C6593qo.SUSPEND) {
                    z = false;
                }
                if (z) {
                    int i3 = i2 + i;
                    if (i3 < 0) {
                        i3 = Integer.MAX_VALUE;
                    }
                    return new rx3(i, i3, qoVar);
                }
                throw new IllegalArgumentException(jt1.m53745C("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ", qoVar).toString());
            }
            throw new IllegalArgumentException(jt1.m53745C("extraBufferCapacity cannot be negative, but was ", Integer.valueOf(i2)).toString());
        }
        throw new IllegalArgumentException(jt1.m53745C("replay cannot be negative, but was ", Integer.valueOf(i)).toString());
    }

    /* renamed from: b */
    public static /* synthetic */ xm2 m64943b(int i, int i2, C6593qo qoVar, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            qoVar = C6593qo.SUSPEND;
        }
        return m64942a(i, i2, qoVar);
    }

    @vr2
    /* renamed from: e */
    public static final <T> m81<T> m64946e(@vr2 qx3<? extends T> qx3, @vr2 b90 b90, int i, @vr2 C6593qo qoVar) {
        return ((i == 0 || i == -3) && qoVar == C6593qo.SUSPEND) ? qx3 : new C5199ew(qx3, b90, i, qoVar);
    }

    /* renamed from: f */
    public static final Object m64947f(Object[] objArr, long j) {
        return objArr[(objArr.length - 1) & ((int) j)];
    }

    /* renamed from: g */
    public static /* synthetic */ void m64948g() {
    }

    /* renamed from: h */
    public static final void m64949h(Object[] objArr, long j, Object obj) {
        objArr[(objArr.length - 1) & ((int) j)] = obj;
    }
}
