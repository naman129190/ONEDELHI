package com.onedelhi.secure;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0015\u001a\u00020\u0011\u0012\u0006\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0006\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0007J\u001d\u0010\r\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0004J\u0019\u0010\u0010\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00050\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0014\u001a\u00020\u00118VX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lcom/onedelhi/secure/ot3;", "Lcom/onedelhi/secure/nt3;", "", "c", "()Z", "Lcom/onedelhi/secure/un4;", "b", "(Lcom/onedelhi/secure/b80;)Ljava/lang/Object;", "release", "()V", "g", "Lcom/onedelhi/secure/iu;", "cont", "h", "(Lcom/onedelhi/secure/iu;)Z", "j", "i", "", "a", "()I", "availablePermits", "permits", "acquiredPermits", "<init>", "(II)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class ot3 implements nt3 {

    /* renamed from: a */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f33169a;

    /* renamed from: a */
    public static final /* synthetic */ AtomicLongFieldUpdater f33170a;

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f33171a;

    /* renamed from: b */
    public static final /* synthetic */ AtomicLongFieldUpdater f33172b;

    /* renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f33173b;
    @vr2
    public volatile /* synthetic */ int _availablePermits;

    /* renamed from: a */
    public final int f33174a;
    @vr2

    /* renamed from: a */
    public final ec1<Throwable, un4> f33175a;
    @vr2
    private volatile /* synthetic */ long deqIdx = 0;
    @vr2
    private volatile /* synthetic */ long enqIdx = 0;
    @vr2
    private volatile /* synthetic */ Object head;
    @vr2
    private volatile /* synthetic */ Object tail;

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "<anonymous parameter 0>", "Lcom/onedelhi/secure/un4;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.ot3$a */
    public static final class C6302a extends d12 implements ec1<Throwable, un4> {

        /* renamed from: a */
        public final /* synthetic */ ot3 f33176a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6302a(ot3 ot3) {
            super(1);
            this.f33176a = ot3;
        }

        /* renamed from: X */
        public /* bridge */ /* synthetic */ Object mo17094X(Object obj) {
            mo41962a((Throwable) obj);
            return un4.f36206a;
        }

        /* renamed from: a */
        public final void mo41962a(@vr2 Throwable th) {
            this.f33176a.release();
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<ot3> cls2 = ot3.class;
        f33171a = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, h60.f29502U);
        f33170a = AtomicLongFieldUpdater.newUpdater(cls2, "deqIdx");
        f33173b = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "tail");
        f33172b = AtomicLongFieldUpdater.newUpdater(cls2, "enqIdx");
        f33169a = AtomicIntegerFieldUpdater.newUpdater(cls2, "_availablePermits");
    }

    public ot3(int i, int i2) {
        this.f33174a = i;
        boolean z = true;
        if (i > 0) {
            if ((i2 < 0 || i2 > i) ? false : z) {
                qt3 qt3 = new qt3(0, (qt3) null, 2);
                this.head = qt3;
                this.tail = qt3;
                this._availablePermits = i - i2;
                this.f33175a = new C6302a(this);
                return;
            }
            throw new IllegalArgumentException(jt1.m53745C("The number of acquired permits should be in 0..", Integer.valueOf(i)).toString());
        }
        throw new IllegalArgumentException(jt1.m53745C("Semaphore should have at least 1 permit, but had ", Integer.valueOf(i)).toString());
    }

    /* renamed from: a */
    public int mo41487a() {
        return Math.max(this._availablePermits, 0);
    }

    @ss2
    /* renamed from: b */
    public Object mo41488b(@vr2 b80<? super un4> b80) {
        if (f33169a.getAndDecrement(this) > 0) {
            return un4.f36206a;
        }
        Object g = mo41958g(b80);
        return g == mt1.m57558h() ? g : un4.f36206a;
    }

    /* renamed from: c */
    public boolean mo41489c() {
        int i;
        do {
            i = this._availablePermits;
            if (i <= 0) {
                return false;
            }
        } while (!f33169a.compareAndSet(this, i, i - 1));
        return true;
    }

    /* renamed from: g */
    public final Object mo41958g(b80<? super un4> b80) {
        C5847ju<? super un4> b = C6057lu.m56509b(lt1.m56482d(b80));
        while (true) {
            if (!mo41959h(b)) {
                if (f33169a.getAndDecrement(this) > 0) {
                    b.mo38242w(un4.f36206a, this.f33175a);
                    break;
                }
            } else {
                break;
            }
        }
        Object A = b.mo38880A();
        if (A == mt1.m57558h()) {
            hf0.m50483c(b80);
        }
        return A == mt1.m57558h() ? A : un4.f36206a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0052, code lost:
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x006e, code lost:
        continue;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo41959h(com.onedelhi.secure.C5744iu<? super com.onedelhi.secure.un4> r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.Object r2 = r0.tail
            com.onedelhi.secure.qt3 r2 = (com.onedelhi.secure.qt3) r2
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = f33172b
            long r3 = r3.getAndIncrement(r0)
            int r5 = com.onedelhi.secure.pt3.f33772b
            long r5 = (long) r5
            long r5 = r3 / r5
        L_0x0015:
            r7 = r2
        L_0x0016:
            long r8 = r7.mo47391o()
            int r10 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r10 < 0) goto L_0x0024
            boolean r8 = r7.mo39045g()
            if (r8 == 0) goto L_0x0032
        L_0x0024:
            java.lang.Object r8 = r7.mo39043e()
            com.onedelhi.secure.l84 r9 = com.onedelhi.secure.j40.f30571a
            if (r8 != r9) goto L_0x00b3
            com.onedelhi.secure.l84 r7 = com.onedelhi.secure.j40.f30571a
        L_0x0032:
            java.lang.Object r7 = com.onedelhi.secure.ys3.m72070b(r7)
            boolean r8 = com.onedelhi.secure.ys3.m72076h(r7)
            r9 = 0
            r10 = 1
            if (r8 != 0) goto L_0x007b
            com.onedelhi.secure.xs3 r8 = com.onedelhi.secure.ys3.m72074f(r7)
        L_0x0042:
            java.lang.Object r11 = r0.tail
            com.onedelhi.secure.xs3 r11 = (com.onedelhi.secure.xs3) r11
            long r12 = r11.mo47391o()
            long r14 = r8.mo47391o()
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 < 0) goto L_0x0054
        L_0x0052:
            r8 = 1
            goto L_0x006e
        L_0x0054:
            boolean r12 = r8.mo47393r()
            if (r12 != 0) goto L_0x005c
            r8 = 0
            goto L_0x006e
        L_0x005c:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = f33173b
            boolean r12 = com.onedelhi.secure.C5759j1.m52871a(r12, r0, r11, r8)
            if (r12 == 0) goto L_0x0071
            boolean r8 = r11.mo47390n()
            if (r8 == 0) goto L_0x0052
            r11.mo39050l()
            goto L_0x0052
        L_0x006e:
            if (r8 == 0) goto L_0x0015
            goto L_0x007b
        L_0x0071:
            boolean r11 = r8.mo47390n()
            if (r11 == 0) goto L_0x0042
            r8.mo39050l()
            goto L_0x0042
        L_0x007b:
            com.onedelhi.secure.xs3 r2 = com.onedelhi.secure.ys3.m72074f(r7)
            com.onedelhi.secure.qt3 r2 = (com.onedelhi.secure.qt3) r2
            int r5 = com.onedelhi.secure.pt3.f33772b
            long r5 = (long) r5
            long r3 = r3 % r5
            int r4 = (int) r3
            r3 = 0
            java.util.concurrent.atomic.AtomicReferenceArray r5 = r2.f34366a
            boolean r3 = r5.compareAndSet(r4, r3, r1)
            if (r3 == 0) goto L_0x009a
            com.onedelhi.secure.eu r3 = new com.onedelhi.secure.eu
            r3.<init>(r2, r4)
            r1.mo38232J(r3)
            return r10
        L_0x009a:
            com.onedelhi.secure.l84 r3 = com.onedelhi.secure.pt3.f33771a
            com.onedelhi.secure.l84 r5 = com.onedelhi.secure.pt3.f33773b
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r2.f34366a
            boolean r2 = r2.compareAndSet(r4, r3, r5)
            if (r2 == 0) goto L_0x00b2
            com.onedelhi.secure.un4 r2 = com.onedelhi.secure.un4.f36206a
            com.onedelhi.secure.ec1<java.lang.Throwable, com.onedelhi.secure.un4> r3 = r0.f33175a
            r1.mo38242w(r2, r3)
            return r10
        L_0x00b2:
            return r9
        L_0x00b3:
            com.onedelhi.secure.k40 r8 = (com.onedelhi.secure.k40) r8
            com.onedelhi.secure.xs3 r8 = (com.onedelhi.secure.xs3) r8
            if (r8 == 0) goto L_0x00bc
        L_0x00b9:
            r7 = r8
            goto L_0x0016
        L_0x00bc:
            long r8 = r7.mo47391o()
            r10 = 1
            long r8 = r8 + r10
            r10 = r7
            com.onedelhi.secure.qt3 r10 = (com.onedelhi.secure.qt3) r10
            com.onedelhi.secure.qt3 r8 = com.onedelhi.secure.pt3.m61638j(r8, r10)
            boolean r9 = r7.mo39051m(r8)
            if (r9 == 0) goto L_0x0016
            boolean r9 = r7.mo39045g()
            if (r9 == 0) goto L_0x00b9
            r7.mo39050l()
            goto L_0x00b9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ot3.mo41959h(com.onedelhi.secure.iu):boolean");
    }

    /* renamed from: i */
    public final boolean mo41960i(C5744iu<? super un4> iuVar) {
        Object Z = iuVar.mo38235Z(un4.f36206a, (Object) null, this.f33175a);
        if (Z == null) {
            return false;
        }
        iuVar.mo38233N(Z);
        return true;
    }

    /* renamed from: j */
    public final boolean mo41961j() {
        xs3 xs3;
        Object b;
        int i;
        boolean z;
        xs3 xs32;
        xs3 xs33 = (qt3) this.head;
        long andIncrement = f33170a.getAndIncrement(this);
        long h = andIncrement / ((long) pt3.f33772b);
        do {
            xs3 xs34 = xs33;
            while (true) {
                if (xs34.mo47391o() >= h && !xs34.mo39045g()) {
                    xs3 = xs34;
                    break;
                }
                Object a = xs34.mo39043e();
                if (a == j40.f30571a) {
                    xs3 = j40.f30571a;
                    break;
                }
                xs3 xs35 = (xs3) ((k40) a);
                if (xs35 == null) {
                    xs35 = pt3.m61638j(xs34.mo47391o() + 1, (qt3) xs34);
                    if (!xs34.mo39051m(xs35)) {
                        xs32 = xs34;
                        xs34 = xs32;
                    } else if (xs34.mo39045g()) {
                        xs34.mo39050l();
                    }
                }
                xs32 = xs35;
                xs34 = xs32;
            }
            b = ys3.m72070b(xs3);
            i = 0;
            if (ys3.m72076h(b)) {
                break;
            }
            xs3 f = ys3.m72074f(b);
            while (true) {
                xs3 xs36 = (xs3) this.head;
                if (xs36.mo47391o() >= f.mo47391o()) {
                    break;
                } else if (!f.mo47393r()) {
                    z = false;
                    continue;
                    break;
                } else if (C5759j1.m52871a(f33171a, this, xs36, f)) {
                    if (xs36.mo47390n()) {
                        xs36.mo39050l();
                    }
                } else if (f.mo47390n()) {
                    f.mo39050l();
                }
            }
            z = true;
            continue;
        } while (!z);
        qt3 qt3 = (qt3) ys3.m72074f(b);
        qt3.mo39040b();
        if (qt3.mo47391o() > h) {
            return false;
        }
        int h2 = (int) (andIncrement % ((long) pt3.f33772b));
        Object andSet = qt3.f34366a.getAndSet(h2, pt3.f33771a);
        if (andSet == null) {
            int f2 = pt3.f33770a;
            while (i < f2) {
                i++;
                if (qt3.f34366a.get(h2) == pt3.f33773b) {
                    return true;
                }
            }
            return !qt3.f34366a.compareAndSet(h2, pt3.f33771a, pt3.f33774c);
        } else if (andSet == pt3.f33775d) {
            return false;
        } else {
            return mo41960i((C5744iu) andSet);
        }
    }

    public void release() {
        while (true) {
            int i = this._availablePermits;
            int i2 = this.f33174a;
            if (i < i2) {
                if (f33169a.compareAndSet(this, i, i + 1) && (i >= 0 || mo41961j())) {
                    return;
                }
            } else {
                throw new IllegalStateException(jt1.m53745C("The number of released permits cannot be greater than ", Integer.valueOf(i2)).toString());
            }
        }
    }
}
