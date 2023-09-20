package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u00008\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a4\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0005H\b¢\u0006\u0004\b\u0007\u0010\b\u001a4\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0005H\b¢\u0006\u0004\b\t\u0010\b\u001a-\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0005H\b\u001a6\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¨\u0006\u0015"}, d2 = {"T", "value", "Lcom/onedelhi/secure/ym2;", "a", "(Ljava/lang/Object;)Lcom/onedelhi/secure/ym2;", "Lkotlin/Function1;", "function", "i", "(Lcom/onedelhi/secure/ym2;Lcom/onedelhi/secure/ec1;)Ljava/lang/Object;", "e", "Lcom/onedelhi/secure/un4;", "h", "Lcom/onedelhi/secure/d34;", "Lcom/onedelhi/secure/b90;", "context", "", "capacity", "Lcom/onedelhi/secure/qo;", "onBufferOverflow", "Lcom/onedelhi/secure/m81;", "d", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class f34 {
    @vr2

    /* renamed from: a */
    public static final l84 f28163a = new l84("NONE");
    @vr2

    /* renamed from: b */
    public static final l84 f28164b = new l84("PENDING");

    @vr2
    /* renamed from: a */
    public static final <T> ym2<T> m47561a(T t) {
        if (t == null) {
            t = qs2.f34347a;
        }
        return new e34(t);
    }

    @vr2
    /* renamed from: d */
    public static final <T> m81<T> m47564d(@vr2 d34<? extends T> d34, @vr2 b90 b90, int i, @vr2 C6593qo qoVar) {
        boolean z = false;
        if (i >= 0 && i < 2) {
            z = true;
        }
        return ((z || i == -2) && qoVar == C6593qo.DROP_OLDEST) ? d34 : sx3.m64946e(d34, b90, i, qoVar);
    }

    /* renamed from: e */
    public static final <T> T m47565e(@vr2 ym2<T> ym2, @vr2 ec1<? super T, ? extends T> ec1) {
        T value;
        do {
            value = ym2.getValue();
        } while (!ym2.mo34782e(value, ec1.mo17094X(value)));
        return value;
    }

    /* renamed from: f */
    public static /* synthetic */ void m47566f() {
    }

    /* renamed from: g */
    public static /* synthetic */ void m47567g() {
    }

    /* renamed from: h */
    public static final <T> void m47568h(@vr2 ym2<T> ym2, @vr2 ec1<? super T, ? extends T> ec1) {
        T value;
        do {
            value = ym2.getValue();
        } while (!ym2.mo34782e(value, ec1.mo17094X(value)));
    }

    /* renamed from: i */
    public static final <T> T m47569i(@vr2 ym2<T> ym2, @vr2 ec1<? super T, ? extends T> ec1) {
        T value;
        T X;
        do {
            value = ym2.getValue();
            X = ec1.mo17094X(value);
        } while (!ym2.mo34782e(value, X));
        return X;
    }
}
