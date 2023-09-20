package com.onedelhi.secure;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0010\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0002\b#B\u0017\u0012\u0006\u0010)\u001a\u00020\u0007\u0012\u0006\u0010*\u001a\u00020\u0003¢\u0006\u0004\b+\u0010,J\r\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b\f\u0010\rJ-\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0011\"\u0004\b\u0001\u0010\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0003¢\u0006\u0004\b\u0014\u0010\u0005J3\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u00162\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J3\u0010\u001b\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u00162\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010!\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0000j\b\u0012\u0004\u0012\u00028\u0000`\u00162\u0006\u0010 \u001a\u00020\u001dH\u0002¢\u0006\u0004\b!\u0010\"J'\u0010#\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0000j\b\u0012\u0004\u0012\u00028\u0000`\u00162\u0006\u0010 \u001a\u00020\u001dH\u0002¢\u0006\u0004\b#\u0010\"R\u0011\u0010%\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b$\u0010\u0005R\u0011\u0010(\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006-"}, d2 = {"Lcom/onedelhi/secure/o82;", "", "E", "", "d", "()Z", "element", "", "a", "(Ljava/lang/Object;)I", "l", "()Ljava/lang/Object;", "k", "()Lcom/onedelhi/secure/o82;", "R", "Lkotlin/Function1;", "transform", "", "i", "(Lcom/onedelhi/secure/ec1;)Ljava/util/List;", "g", "index", "Lkotlinx/coroutines/internal/Core;", "e", "(ILjava/lang/Object;)Lcom/onedelhi/secure/o82;", "oldHead", "newHead", "m", "(II)Lcom/onedelhi/secure/o82;", "", "j", "()J", "state", "c", "(J)Lcom/onedelhi/secure/o82;", "b", "h", "isEmpty", "f", "()I", "size", "capacity", "singleConsumer", "<init>", "(IZ)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class o82<E> {

    /* renamed from: a */
    public static final long f32898a = 1073741823;
    @rw1
    @vr2

    /* renamed from: a */
    public static final l84 f32899a = new l84("REMOVE_FROZEN");
    @vr2

    /* renamed from: a */
    public static final C6253a f32900a = new C6253a((wg0) null);

    /* renamed from: a */
    public static final /* synthetic */ AtomicLongFieldUpdater f32901a;

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f32902a;

    /* renamed from: b */
    public static final long f32903b = 1152921503533105152L;

    /* renamed from: c */
    public static final int f32904c = 8;

    /* renamed from: c */
    public static final long f32905c = 1152921504606846976L;

    /* renamed from: d */
    public static final int f32906d = 30;

    /* renamed from: d */
    public static final long f32907d = 2305843009213693952L;

    /* renamed from: e */
    public static final int f32908e = 1073741823;

    /* renamed from: f */
    public static final int f32909f = 0;

    /* renamed from: g */
    public static final int f32910g = 30;

    /* renamed from: h */
    public static final int f32911h = 60;

    /* renamed from: i */
    public static final int f32912i = 61;

    /* renamed from: j */
    public static final int f32913j = 1024;

    /* renamed from: k */
    public static final int f32914k = 0;

    /* renamed from: l */
    public static final int f32915l = 1;

    /* renamed from: m */
    public static final int f32916m = 2;
    @vr2
    private volatile /* synthetic */ Object _next = null;
    @vr2
    private volatile /* synthetic */ long _state = 0;

    /* renamed from: a */
    public final int f32917a;
    @vr2

    /* renamed from: a */
    public /* synthetic */ AtomicReferenceArray f32918a;

    /* renamed from: a */
    public final boolean f32919a;

    /* renamed from: b */
    public final int f32920b;

    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b(\u0010)J\u0015\u0010\u0004\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0004J\u0012\u0010\u0007\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\u0012\u0010\t\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\b\u001a\u00020\u0005JR\u0010\u0011\u001a\u00028\u0001\"\u0004\b\u0001\u0010\n*\u00020\u000226\u0010\u0010\u001a2\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00028\u00010\u000bH\b¢\u0006\u0004\b\u0011\u0010\u0012J\n\u0010\u0013\u001a\u00020\u0005*\u00020\u0002R\u0014\u0010\u0014\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b\u001b\u0010\u0015R\u0014\u0010\u001c\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b\u001d\u0010\u0015R\u0014\u0010\u001e\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b\u001f\u0010\u0015R\u0014\u0010 \u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b \u0010\u0015R\u0014\u0010!\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b!\u0010\u0015R\u0014\u0010\"\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b\"\u0010\u0015R\u0014\u0010$\u001a\u00020#8\u0006X\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b&\u0010\u001aR\u0014\u0010'\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b'\u0010\u0015¨\u0006*"}, d2 = {"Lcom/onedelhi/secure/o82$a;", "", "", "other", "e", "", "newHead", "b", "newTail", "c", "T", "Lkotlin/Function2;", "Lcom/onedelhi/secure/iy2;", "name", "head", "tail", "block", "d", "(JLcom/onedelhi/secure/sc1;)Ljava/lang/Object;", "a", "ADD_CLOSED", "I", "ADD_FROZEN", "ADD_SUCCESS", "CAPACITY_BITS", "CLOSED_MASK", "J", "CLOSED_SHIFT", "FROZEN_MASK", "FROZEN_SHIFT", "HEAD_MASK", "HEAD_SHIFT", "INITIAL_CAPACITY", "MAX_CAPACITY_MASK", "MIN_ADD_SPIN_CAPACITY", "Lcom/onedelhi/secure/l84;", "REMOVE_FROZEN", "Lcom/onedelhi/secure/l84;", "TAIL_MASK", "TAIL_SHIFT", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.o82$a */
    public static final class C6253a {
        public C6253a() {
        }

        public /* synthetic */ C6253a(wg0 wg0) {
            this();
        }

        /* renamed from: a */
        public final int mo41599a(long j) {
            return (j & o82.f32907d) != 0 ? 2 : 1;
        }

        /* renamed from: b */
        public final long mo41600b(long j, int i) {
            return mo41603e(j, o82.f32898a) | (((long) i) << 0);
        }

        /* renamed from: c */
        public final long mo41601c(long j, int i) {
            return mo41603e(j, o82.f32903b) | (((long) i) << 30);
        }

        /* renamed from: d */
        public final <T> T mo41602d(long j, @vr2 sc1<? super Integer, ? super Integer, ? extends T> sc1) {
            return sc1.mo21054h0(Integer.valueOf((int) ((o82.f32898a & j) >> 0)), Integer.valueOf((int) ((j & o82.f32903b) >> 30)));
        }

        /* renamed from: e */
        public final long mo41603e(long j, long j2) {
            return j & (~j2);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/onedelhi/secure/o82$b;", "", "", "index", "<init>", "(I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.o82$b */
    public static final class C6254b {
        @rw1

        /* renamed from: a */
        public final int f32921a;

        public C6254b(int i) {
            this.f32921a = i;
        }
    }

    static {
        Class<o82> cls = o82.class;
        f32902a = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_next");
        f32901a = AtomicLongFieldUpdater.newUpdater(cls, "_state");
    }

    public o82(int i, boolean z) {
        this.f32917a = i;
        this.f32919a = z;
        int i2 = i - 1;
        this.f32920b = i2;
        this.f32918a = new AtomicReferenceArray(i);
        boolean z2 = false;
        if (i2 <= 1073741823) {
            if (!((i & i2) == 0 ? true : z2)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0069 A[LOOP:1: B:19:0x0069->B:22:0x007b, LOOP_START, PHI: r0 
      PHI: (r0v7 com.onedelhi.secure.o82) = (r0v6 com.onedelhi.secure.o82), (r0v9 com.onedelhi.secure.o82) binds: [B:18:0x0061, B:22:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo41586a(@com.onedelhi.secure.vr2 E r14) {
        /*
            r13 = this;
        L_0x0000:
            long r2 = r13._state
            r0 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r0 = r0 & r2
            r6 = 0
            int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x0012
            com.onedelhi.secure.o82$a r14 = f32900a
            int r14 = r14.mo41599a(r2)
            return r14
        L_0x0012:
            com.onedelhi.secure.o82$a r0 = f32900a
            r4 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r4 = r4 & r2
            r8 = 0
            long r4 = r4 >> r8
            int r1 = (int) r4
            r4 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r4 = r4 & r2
            r9 = 30
            long r4 = r4 >> r9
            int r9 = (int) r4
            int r10 = r13.f32920b
            int r4 = r9 + 2
            r4 = r4 & r10
            r5 = r1 & r10
            r11 = 1
            if (r4 != r5) goto L_0x0030
            return r11
        L_0x0030:
            boolean r4 = r13.f32919a
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            if (r4 != 0) goto L_0x004f
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r13.f32918a
            r12 = r9 & r10
            java.lang.Object r4 = r4.get(r12)
            if (r4 == 0) goto L_0x004f
            int r0 = r13.f32917a
            r2 = 1024(0x400, float:1.435E-42)
            if (r0 < r2) goto L_0x004e
            int r9 = r9 - r1
            r1 = r9 & r5
            int r0 = r0 >> 1
            if (r1 <= r0) goto L_0x0000
        L_0x004e:
            return r11
        L_0x004f:
            int r1 = r9 + 1
            r1 = r1 & r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = f32901a
            long r11 = r0.mo41601c(r2, r1)
            r0 = r4
            r1 = r13
            r4 = r11
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L_0x0000
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r13.f32918a
            r1 = r9 & r10
            r0.set(r1, r14)
            r0 = r13
        L_0x0069:
            long r1 = r0._state
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 != 0) goto L_0x0073
            goto L_0x007d
        L_0x0073:
            com.onedelhi.secure.o82 r0 = r0.mo41596k()
            com.onedelhi.secure.o82 r0 = r0.mo41590e(r9, r14)
            if (r0 != 0) goto L_0x0069
        L_0x007d:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.o82.mo41586a(java.lang.Object):int");
    }

    /* renamed from: b */
    public final o82<E> mo41587b(long j) {
        o82<E> o82 = new o82<>(this.f32917a * 2, this.f32919a);
        int i = (int) ((f32898a & j) >> 0);
        int i2 = (int) ((f32903b & j) >> 30);
        while (true) {
            int i3 = this.f32920b;
            if ((i & i3) != (i2 & i3)) {
                Object obj = this.f32918a.get(i3 & i);
                if (obj == null) {
                    obj = new C6254b(i);
                }
                o82.f32918a.set(o82.f32920b & i, obj);
                i++;
            } else {
                o82._state = f32900a.mo41603e(j, f32905c);
                return o82;
            }
        }
    }

    /* renamed from: c */
    public final o82<E> mo41588c(long j) {
        while (true) {
            o82<E> o82 = (o82) this._next;
            if (o82 != null) {
                return o82;
            }
            C5759j1.m52871a(f32902a, this, (Object) null, mo41587b(j));
        }
    }

    /* renamed from: d */
    public final boolean mo41589d() {
        long j;
        do {
            j = this._state;
            if ((j & f32907d) != 0) {
                return true;
            }
            if ((f32905c & j) != 0) {
                return false;
            }
        } while (!f32901a.compareAndSet(this, j, j | f32907d));
        return true;
    }

    /* renamed from: e */
    public final o82<E> mo41590e(int i, E e) {
        Object obj = this.f32918a.get(this.f32920b & i);
        if (!(obj instanceof C6254b) || ((C6254b) obj).f32921a != i) {
            return null;
        }
        this.f32918a.set(i & this.f32920b, e);
        return this;
    }

    /* renamed from: f */
    public final int mo41591f() {
        long j = this._state;
        return 1073741823 & (((int) ((j & f32903b) >> 30)) - ((int) ((f32898a & j) >> 0)));
    }

    /* renamed from: g */
    public final boolean mo41592g() {
        return (this._state & f32907d) != 0;
    }

    /* renamed from: h */
    public final boolean mo41593h() {
        long j = this._state;
        return ((int) ((f32898a & j) >> 0)) == ((int) ((j & f32903b) >> 30));
    }

    @vr2
    /* renamed from: i */
    public final <R> List<R> mo41594i(@vr2 ec1<? super E, ? extends R> ec1) {
        ArrayList arrayList = new ArrayList(this.f32917a);
        long j = this._state;
        int i = (int) ((f32898a & j) >> 0);
        int i2 = (int) ((j & f32903b) >> 30);
        while (true) {
            int i3 = this.f32920b;
            if ((i & i3) == (i2 & i3)) {
                return arrayList;
            }
            Object obj = this.f32918a.get(i3 & i);
            if (obj != null && !(obj instanceof C6254b)) {
                arrayList.add(ec1.mo17094X(obj));
            }
            i++;
        }
    }

    /* renamed from: j */
    public final long mo41595j() {
        long j;
        long j2;
        do {
            j = this._state;
            if ((j & f32905c) != 0) {
                return j;
            }
            j2 = j | f32905c;
        } while (!f32901a.compareAndSet(this, j, j2));
        return j2;
    }

    @vr2
    /* renamed from: k */
    public final o82<E> mo41596k() {
        return mo41588c(mo41595j());
    }

    @ss2
    /* renamed from: l */
    public final Object mo41597l() {
        while (true) {
            long j = this._state;
            if ((f32905c & j) != 0) {
                return f32899a;
            }
            C6253a aVar = f32900a;
            int i = (int) ((f32898a & j) >> 0);
            int i2 = (int) ((f32903b & j) >> 30);
            int i3 = this.f32920b;
            if ((i2 & i3) == (i & i3)) {
                return null;
            }
            Object obj = this.f32918a.get(i3 & i);
            if (obj == null) {
                if (this.f32919a) {
                    return null;
                }
            } else if (obj instanceof C6254b) {
                return null;
            } else {
                int i4 = (i + 1) & f32908e;
                if (f32901a.compareAndSet(this, j, aVar.mo41600b(j, i4))) {
                    this.f32918a.set(this.f32920b & i, (Object) null);
                    return obj;
                } else if (this.f32919a) {
                    o82 o82 = this;
                    do {
                        o82 = o82.mo41598m(i, i4);
                    } while (o82 != null);
                    return obj;
                }
            }
        }
    }

    /* renamed from: m */
    public final o82<E> mo41598m(int i, int i2) {
        long j;
        C6253a aVar;
        int i3;
        do {
            j = this._state;
            aVar = f32900a;
            i3 = (int) ((f32898a & j) >> 0);
            if ((f32905c & j) != 0) {
                return mo41596k();
            }
        } while (!f32901a.compareAndSet(this, j, aVar.mo41600b(j, i2)));
        this.f32918a.set(this.f32920b & i3, (Object) null);
        return null;
    }
}
