package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018JE\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u00022\u001c\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ^\u0010\u000f\u001a\u00020\b\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\u00022'\u0010\u0006\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\f¢\u0006\u0002\b\r2\u0006\u0010\u000e\u001a\u00028\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0016\u001a\u00020\u00118FX\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Lcom/onedelhi/secure/q90;", "", "T", "Lkotlin/Function1;", "Lcom/onedelhi/secure/b80;", "", "block", "completion", "Lcom/onedelhi/secure/un4;", "b", "(Lcom/onedelhi/secure/ec1;Lcom/onedelhi/secure/b80;)V", "R", "Lkotlin/Function2;", "Lcom/onedelhi/secure/wy0;", "receiver", "e", "(Lcom/onedelhi/secure/sc1;Ljava/lang/Object;Lcom/onedelhi/secure/b80;)V", "", "g", "()Z", "isLazy$annotations", "()V", "isLazy", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "LAZY", "ATOMIC", "UNDISPATCHED", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public enum q90 {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    @ii2(mo38106k = 3, mo38107mv = {1, 6, 0}, mo38109xi = 48)
    /* renamed from: com.onedelhi.secure.q90$a */
    public /* synthetic */ class C6518a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f34028a = null;

        static {
            int[] iArr = new int[q90.values().length];
            iArr[q90.DEFAULT.ordinal()] = 1;
            iArr[q90.ATOMIC.ordinal()] = 2;
            iArr[q90.UNDISPATCHED.ordinal()] = 3;
            iArr[q90.LAZY.ordinal()] = 4;
            f34028a = iArr;
        }
    }

    @zs1
    /* renamed from: b */
    public final <T> void mo43176b(@vr2 ec1<? super b80<? super T>, ? extends Object> ec1, @vr2 b80<? super T> b80) {
        int i = C6518a.f34028a[ordinal()];
        if (i == 1) {
            C6303ou.m59636d(ec1, b80);
        } else if (i == 2) {
            g80.m49105h(ec1, b80);
        } else if (i == 3) {
            pn4.m61462a(ec1, b80);
        } else if (i != 4) {
            throw new gr2();
        }
    }

    @zs1
    /* renamed from: e */
    public final <R, T> void mo43177e(@vr2 sc1<? super R, ? super b80<? super T>, ? extends Object> sc1, R r, @vr2 b80<? super T> b80) {
        int i = C6518a.f34028a[ordinal()];
        if (i == 1) {
            C6303ou.m59638f(sc1, r, b80, (ec1) null, 4, (Object) null);
        } else if (i == 2) {
            g80.m49106i(sc1, r, b80);
        } else if (i == 3) {
            pn4.m61463b(sc1, r, b80);
        } else if (i != 4) {
            throw new gr2();
        }
    }

    /* renamed from: g */
    public final boolean mo43178g() {
        return this == LAZY;
    }
}
