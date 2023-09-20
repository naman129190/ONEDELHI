package com.onedelhi.secure;

import com.onedelhi.secure.l82;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\fB\u000f\u0012\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b@\u0010>J\u0015\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0017¢\u0006\u0004\b\f\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u000e\u0010\b\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00028\u00002\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u001a\u0010\u000bJ\u000f\u0010\u001b\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ4\u0010 \u001a\u00020\u000f2\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001d2\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001dH\u0010¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00028\u00002\u0006\u0010%\u001a\u00020\"H\u0002¢\u0006\u0004\b&\u0010'R\u0017\u0010)\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b)\u0010\n\u001a\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\t8TX\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020\t8TX\u0004¢\u0006\u0006\u001a\u0004\b\u0001\u0010-R\u0014\u00103\u001a\u0002008TX\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R$\u00108\u001a\u00020\"2\u0006\u00104\u001a\u00020\"8B@BX\u000e¢\u0006\f\u001a\u0004\b5\u0010$\"\u0004\b6\u00107R$\u0010;\u001a\u00020\"2\u0006\u00104\u001a\u00020\"8B@BX\u000e¢\u0006\f\u001a\u0004\b9\u0010$\"\u0004\b:\u00107R$\u0010?\u001a\u00020(2\u0006\u00104\u001a\u00020(8B@BX\u000e¢\u0006\f\u001a\u0004\b<\u0010+\"\u0004\b=\u0010>¨\u0006A"}, d2 = {"Lcom/onedelhi/secure/y9;", "E", "Lcom/onedelhi/secure/k1;", "Lcom/onedelhi/secure/eo;", "Lcom/onedelhi/secure/lg3;", "W", "()Lcom/onedelhi/secure/lg3;", "", "cause", "", "I", "(Ljava/lang/Throwable;)Z", "a", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "Lcom/onedelhi/secure/un4;", "c", "(Ljava/util/concurrent/CancellationException;)V", "element", "", "H", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lcom/onedelhi/secure/it3;", "select", "J", "(Ljava/lang/Object;Lcom/onedelhi/secure/it3;)Ljava/lang/Object;", "b0", "c0", "()V", "Lcom/onedelhi/secure/y9$a;", "addSub", "removeSub", "n0", "(Lcom/onedelhi/secure/y9$a;Lcom/onedelhi/secure/y9$a;)V", "", "d0", "()J", "index", "e0", "(J)Ljava/lang/Object;", "", "capacity", "f0", "()I", "D", "()Z", "isBufferAlwaysFull", "isBufferFull", "", "m", "()Ljava/lang/String;", "bufferDebugString", "value", "g0", "k0", "(J)V", "head", "j0", "m0", "tail", "h0", "l0", "(I)V", "size", "<init>", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: com.onedelhi.secure.y9 */
public final class C7317y9<E> extends C5860k1<E> implements C5168eo<E> {
    @vr2
    private volatile /* synthetic */ long _head;
    @vr2
    private volatile /* synthetic */ int _size;
    @vr2
    private volatile /* synthetic */ long _tail;
    @vr2

    /* renamed from: a */
    public final List<C7318a<E>> f37830a;
    @vr2

    /* renamed from: a */
    public final ReentrantLock f37831a;
    @vr2

    /* renamed from: a */
    public final Object[] f37832a;

    /* renamed from: n */
    public final int f37833n;

    @Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0015\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\"¢\u0006\u0004\b$\u0010%J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\nJ\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\rR$\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00148F@FX\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00068TX\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\nR\u0014\u0010\u001e\u001a\u00020\u00068TX\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\nR\u0014\u0010 \u001a\u00020\u00068TX\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\nR\u0014\u0010!\u001a\u00020\u00068TX\u0004¢\u0006\u0006\u001a\u0004\b\u0001\u0010\n¨\u0006&"}, d2 = {"Lcom/onedelhi/secure/y9$a;", "E", "Lcom/onedelhi/secure/i0;", "Lcom/onedelhi/secure/lg3;", "", "cause", "", "I", "(Ljava/lang/Throwable;)Z", "w0", "()Z", "", "q0", "()Ljava/lang/Object;", "Lcom/onedelhi/secure/it3;", "select", "r0", "(Lcom/onedelhi/secure/it3;)Ljava/lang/Object;", "y0", "z0", "", "value", "x0", "()J", "A0", "(J)V", "subHead", "j0", "isBufferAlwaysEmpty", "k0", "isBufferEmpty", "D", "isBufferAlwaysFull", "isBufferFull", "Lcom/onedelhi/secure/y9;", "broadcastChannel", "<init>", "(Lcom/onedelhi/secure/y9;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.y9$a */
    public static final class C7318a<E> extends C5632i0<E> implements lg3<E> {
        @vr2
        private volatile /* synthetic */ long _subHead = 0;
        @vr2

        /* renamed from: a */
        public final C7317y9<E> f37834a;
        @vr2

        /* renamed from: a */
        public final ReentrantLock f37835a = new ReentrantLock();

        public C7318a(@vr2 C7317y9<E> y9Var) {
            super((ec1) null);
            this.f37834a = y9Var;
        }

        /* renamed from: A0 */
        public final void mo47641A0(long j) {
            this._subHead = j;
        }

        /* renamed from: D */
        public boolean mo31520D() {
            throw new IllegalStateException("Should not be used".toString());
        }

        /* renamed from: E */
        public boolean mo31521E() {
            throw new IllegalStateException("Should not be used".toString());
        }

        /* renamed from: I */
        public boolean mo36803I(@ss2 Throwable th) {
            boolean I = super.mo36803I(th);
            if (I) {
                C7317y9.m71377o0(this.f37834a, (C7318a) null, this, 1, (Object) null);
                ReentrantLock reentrantLock = this.f37835a;
                reentrantLock.lock();
                try {
                    mo47641A0(this.f37834a.mo47636j0());
                    un4 un4 = un4.f36206a;
                } finally {
                    reentrantLock.unlock();
                }
            }
            return I;
        }

        /* renamed from: j0 */
        public boolean mo31526j0() {
            return false;
        }

        /* renamed from: k0 */
        public boolean mo31527k0() {
            return mo47643x0() >= this.f37834a.mo47636j0();
        }

        /* JADX INFO: finally extract failed */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0028  */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x002c  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0030  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x003c  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x003f  */
        @com.onedelhi.secure.ss2
        /* renamed from: q0 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object mo31531q0() {
            /*
                r8 = this;
                java.util.concurrent.locks.ReentrantLock r0 = r8.f37835a
                r0.lock()
                java.lang.Object r1 = r8.mo47645z0()     // Catch:{ all -> 0x0046 }
                boolean r2 = r1 instanceof com.onedelhi.secure.C5753iz     // Catch:{ all -> 0x0046 }
                r3 = 1
                if (r2 == 0) goto L_0x000f
                goto L_0x0013
            L_0x000f:
                com.onedelhi.secure.l84 r2 = com.onedelhi.secure.C5757j0.f30530d     // Catch:{ all -> 0x0046 }
                if (r1 != r2) goto L_0x0015
            L_0x0013:
                r2 = 0
                goto L_0x0020
            L_0x0015:
                long r4 = r8.mo47643x0()     // Catch:{ all -> 0x0046 }
                r6 = 1
                long r4 = r4 + r6
                r8.mo47641A0(r4)     // Catch:{ all -> 0x0046 }
                r2 = 1
            L_0x0020:
                r0.unlock()
                boolean r0 = r1 instanceof com.onedelhi.secure.C5753iz
                r4 = 0
                if (r0 == 0) goto L_0x002c
                r0 = r1
                com.onedelhi.secure.iz r0 = (com.onedelhi.secure.C5753iz) r0
                goto L_0x002d
            L_0x002c:
                r0 = r4
            L_0x002d:
                if (r0 != 0) goto L_0x0030
                goto L_0x0035
            L_0x0030:
                java.lang.Throwable r0 = r0.f30506a
                r8.mo36803I(r0)
            L_0x0035:
                boolean r0 = r8.mo47642w0()
                if (r0 == 0) goto L_0x003c
                goto L_0x003d
            L_0x003c:
                r3 = r2
            L_0x003d:
                if (r3 == 0) goto L_0x0045
                com.onedelhi.secure.y9<E> r0 = r8.f37834a
                r2 = 3
                com.onedelhi.secure.C7317y9.m71377o0(r0, r4, r4, r2, r4)
            L_0x0045:
                return r1
            L_0x0046:
                r1 = move-exception
                r0.unlock()
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C7317y9.C7318a.mo31531q0():java.lang.Object");
        }

        /* JADX INFO: finally extract failed */
        @ss2
        /* renamed from: r0 */
        public Object mo31532r0(@vr2 it3<?> it3) {
            ReentrantLock reentrantLock = this.f37835a;
            reentrantLock.lock();
            try {
                Object z0 = mo47645z0();
                boolean z = true;
                boolean z2 = false;
                if (!(z0 instanceof C5753iz)) {
                    if (z0 != C5757j0.f30530d) {
                        if (!it3.mo35594D()) {
                            z0 = kt3.m54916d();
                        } else {
                            mo47641A0(mo47643x0() + 1);
                            z2 = true;
                        }
                    }
                }
                reentrantLock.unlock();
                C5753iz izVar = z0 instanceof C5753iz ? (C5753iz) z0 : null;
                if (izVar != null) {
                    mo36803I(izVar.f30506a);
                }
                if (!mo47642w0()) {
                    z = z2;
                }
                if (z) {
                    C7317y9.m71377o0(this.f37834a, (C7318a) null, (C7318a) null, 3, (Object) null);
                }
                return z0;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }

        /* renamed from: w0 */
        public final boolean mo47642w0() {
            C5753iz izVar;
            boolean z = false;
            while (true) {
                izVar = null;
                if (!mo47644y0() || !this.f37835a.tryLock()) {
                    break;
                }
                try {
                    Object z0 = mo47645z0();
                    if (z0 != C5757j0.f30530d) {
                        if (z0 instanceof C5753iz) {
                            izVar = (C5753iz) z0;
                            break;
                        }
                        mg3 T = mo37694T();
                        if (T == null) {
                            break;
                        } else if (T instanceof C5753iz) {
                            break;
                        } else if (T.mo37725e0(z0, (l82.C5974d) null) != null) {
                            mo47641A0(mo47643x0() + 1);
                            z = true;
                            this.f37835a.unlock();
                            T.mo37722B(z0);
                        }
                    }
                } finally {
                    this.f37835a.unlock();
                }
            }
            this.f37835a.unlock();
            if (izVar != null) {
                mo36803I(izVar.f30506a);
            }
            return z;
        }

        /* renamed from: x0 */
        public final long mo47643x0() {
            return this._subHead;
        }

        /* renamed from: y0 */
        public final boolean mo47644y0() {
            if (mo38993n() != null) {
                return false;
            }
            return !mo31527k0() || this.f37834a.mo38993n() != null;
        }

        /* renamed from: z0 */
        public final Object mo47645z0() {
            long x0 = mo47643x0();
            C5753iz<?> n = this.f37834a.mo38993n();
            if (x0 >= this.f37834a.mo47636j0()) {
                if (n == null) {
                    n = mo38993n();
                }
                return n == null ? C5757j0.f30530d : n;
            }
            Object Y = this.f37834a.mo47632e0(x0);
            C5753iz<?> n2 = mo38993n();
            return n2 != null ? n2 : Y;
        }
    }

    public C7317y9(int i) {
        super((ec1) null);
        this.f37833n = i;
        if (i < 1 ? false : true) {
            this.f37831a = new ReentrantLock();
            this.f37832a = new Object[i];
            this._head = 0;
            this._tail = 0;
            this._size = 0;
            this.f37830a = i40.m51787d();
            return;
        }
        throw new IllegalArgumentException(("ArrayBroadcastChannel capacity must be at least 1, but " + mo47633f0() + " was specified").toString());
    }

    /* renamed from: i0 */
    public static /* synthetic */ void m71376i0() {
    }

    /* renamed from: o0 */
    public static /* synthetic */ void m71377o0(C7317y9 y9Var, C7318a aVar, C7318a aVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = null;
        }
        if ((i & 2) != 0) {
            aVar2 = null;
        }
        y9Var.mo47640n0(aVar, aVar2);
    }

    /* renamed from: D */
    public boolean mo31520D() {
        return false;
    }

    /* renamed from: E */
    public boolean mo31521E() {
        return mo47635h0() >= this.f37833n;
    }

    @vr2
    /* renamed from: H */
    public Object mo31522H(E e) {
        ReentrantLock reentrantLock = this.f37831a;
        reentrantLock.lock();
        try {
            C5753iz<?> o = mo38994o();
            if (o == null) {
                int h0 = mo47635h0();
                if (h0 >= mo47633f0()) {
                    return C5757j0.f30529c;
                }
                long j0 = mo47636j0();
                this.f37832a[(int) (j0 % ((long) mo47633f0()))] = e;
                mo47638l0(h0 + 1);
                mo47639m0(j0 + 1);
                un4 un4 = un4.f36206a;
                reentrantLock.unlock();
                mo47630c0();
                return C5757j0.f30528b;
            }
            reentrantLock.unlock();
            return o;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: I */
    public boolean mo36803I(@ss2 Throwable th) {
        if (!super.mo36803I(th)) {
            return false;
        }
        mo47630c0();
        return true;
    }

    @vr2
    /* renamed from: J */
    public Object mo31523J(E e, @vr2 it3<?> it3) {
        ReentrantLock reentrantLock = this.f37831a;
        reentrantLock.lock();
        try {
            C5753iz<?> o = mo38994o();
            if (o == null) {
                int h0 = mo47635h0();
                if (h0 >= mo47633f0()) {
                    return C5757j0.f30529c;
                }
                if (!it3.mo35594D()) {
                    Object d = kt3.m54916d();
                    reentrantLock.unlock();
                    return d;
                }
                long j0 = mo47636j0();
                this.f37832a[(int) (j0 % ((long) mo47633f0()))] = e;
                mo47638l0(h0 + 1);
                mo47639m0(j0 + 1);
                un4 un4 = un4.f36206a;
                reentrantLock.unlock();
                mo47630c0();
                return C5757j0.f30528b;
            }
            reentrantLock.unlock();
            return o;
        } finally {
            reentrantLock.unlock();
        }
    }

    @vr2
    /* renamed from: W */
    public lg3<E> mo30419W() {
        C7318a aVar = new C7318a(this);
        m71377o0(this, aVar, (C7318a) null, 2, (Object) null);
        return aVar;
    }

    /* renamed from: b0 */
    public final boolean mo35516a(Throwable th) {
        boolean I = mo36803I(th);
        for (C7318a<E> d0 : this.f37830a) {
            d0.mo37697a(th);
        }
        return I;
    }

    /* renamed from: c */
    public void mo35517c(@ss2 CancellationException cancellationException) {
        mo35516a(cancellationException);
    }

    /* renamed from: c0 */
    public final void mo47630c0() {
        boolean z = false;
        boolean z2 = false;
        for (C7318a<E> w0 : this.f37830a) {
            if (w0.mo47642w0()) {
                z = true;
            }
            z2 = true;
        }
        if (z || !z2) {
            m71377o0(this, (C7318a) null, (C7318a) null, 3, (Object) null);
        }
    }

    /* renamed from: d0 */
    public final long mo47631d0() {
        long j = Long.MAX_VALUE;
        for (C7318a<E> x0 : this.f37830a) {
            j = df3.m45222v(j, x0.mo47643x0());
        }
        return j;
    }

    /* renamed from: e0 */
    public final E mo47632e0(long j) {
        return this.f37832a[(int) (j % ((long) this.f37833n))];
    }

    /* renamed from: f0 */
    public final int mo47633f0() {
        return this.f37833n;
    }

    /* renamed from: g0 */
    public final long mo47634g0() {
        return this._head;
    }

    /* renamed from: h0 */
    public final int mo47635h0() {
        return this._size;
    }

    /* renamed from: j0 */
    public final long mo47636j0() {
        return this._tail;
    }

    /* renamed from: k0 */
    public final void mo47637k0(long j) {
        this._head = j;
    }

    /* renamed from: l0 */
    public final void mo47638l0(int i) {
        this._size = i;
    }

    @vr2
    /* renamed from: m */
    public String mo31529m() {
        return "(buffer:capacity=" + this.f37832a.length + ",size=" + mo47635h0() + ')';
    }

    /* renamed from: m0 */
    public final void mo47639m0(long j) {
        this._tail = j;
    }

    /* renamed from: n0 */
    public final void mo47640n0(C7318a<E> aVar, C7318a<E> aVar2) {
        rt3 X;
        while (true) {
            ReentrantLock reentrantLock = this.f37831a;
            reentrantLock.lock();
            if (aVar != null) {
                try {
                    aVar.mo47641A0(mo47636j0());
                    boolean isEmpty = this.f37830a.isEmpty();
                    this.f37830a.add(aVar);
                    if (!isEmpty) {
                        return;
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
            if (aVar2 != null) {
                this.f37830a.remove(aVar2);
                if (mo47634g0() != aVar2.mo47643x0()) {
                    reentrantLock.unlock();
                    return;
                }
            }
            long d0 = mo47631d0();
            long j0 = mo47636j0();
            long g0 = mo47634g0();
            long v = df3.m45222v(d0, j0);
            if (v <= g0) {
                reentrantLock.unlock();
                return;
            }
            int h0 = mo47635h0();
            while (g0 < v) {
                this.f37832a[(int) (g0 % ((long) mo47633f0()))] = null;
                boolean z = h0 >= mo47633f0();
                g0++;
                mo47637k0(g0);
                h0--;
                mo47638l0(h0);
                if (z) {
                    do {
                        X = mo38989X();
                        if (X != null) {
                            if (X instanceof C5753iz) {
                            }
                        }
                    } while (X.mo38292d1((l82.C5974d) null) == null);
                    this.f37832a[(int) (j0 % ((long) mo47633f0()))] = X.mo38290b1();
                    mo47638l0(h0 + 1);
                    mo47639m0(j0 + 1);
                    un4 un4 = un4.f36206a;
                    reentrantLock.unlock();
                    X.mo38289a1();
                    mo47630c0();
                    aVar = null;
                    aVar2 = null;
                }
            }
            reentrantLock.unlock();
            return;
        }
    }
}
