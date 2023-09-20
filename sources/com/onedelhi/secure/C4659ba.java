package com.onedelhi.secure;

import com.onedelhi.secure.C5860k1;
import com.onedelhi.secure.l82;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B9\u0012\u0006\u00104\u001a\u00020\u001c\u0012\u0006\u00106\u001a\u000205\u0012 \u00109\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0019\u0018\u000107j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`8¢\u0006\u0004\b:\u0010;J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u00002\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0016\u001a\u00020\u00152\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00028\u0000H\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\u00158DX\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020\u00158DX\u0004¢\u0006\u0006\u001a\u0004\b(\u0010&R\u0014\u0010+\u001a\u00020\u00158DX\u0004¢\u0006\u0006\u001a\u0004\b*\u0010&R\u0014\u0010,\u001a\u00020\u00158DX\u0004¢\u0006\u0006\u001a\u0004\b\u0001\u0010&R\u0014\u0010-\u001a\u00020\u00158VX\u0004¢\u0006\u0006\u001a\u0004\b-\u0010&R\u0014\u0010/\u001a\u00020\u00158VX\u0004¢\u0006\u0006\u001a\u0004\b.\u0010&R\u0014\u00103\u001a\u0002008TX\u0004¢\u0006\u0006\u001a\u0004\b1\u00102¨\u0006<"}, d2 = {"Lcom/onedelhi/secure/ba;", "E", "Lcom/onedelhi/secure/i0;", "element", "", "H", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lcom/onedelhi/secure/it3;", "select", "J", "(Ljava/lang/Object;Lcom/onedelhi/secure/it3;)Ljava/lang/Object;", "Lcom/onedelhi/secure/rt3;", "send", "l", "(Lcom/onedelhi/secure/rt3;)Ljava/lang/Object;", "q0", "()Ljava/lang/Object;", "r0", "(Lcom/onedelhi/secure/it3;)Ljava/lang/Object;", "Lcom/onedelhi/secure/kg3;", "receive", "", "g0", "(Lcom/onedelhi/secure/kg3;)Z", "wasClosed", "Lcom/onedelhi/secure/un4;", "m0", "(Z)V", "", "currentSize", "Lcom/onedelhi/secure/l84;", "y0", "(I)Lcom/onedelhi/secure/l84;", "w0", "(ILjava/lang/Object;)V", "x0", "(I)V", "j0", "()Z", "isBufferAlwaysEmpty", "k0", "isBufferEmpty", "D", "isBufferAlwaysFull", "isBufferFull", "isEmpty", "C", "isClosedForReceive", "", "m", "()Ljava/lang/String;", "bufferDebugString", "capacity", "Lcom/onedelhi/secure/qo;", "onBufferOverflow", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(ILcom/onedelhi/secure/qo;Lcom/onedelhi/secure/ec1;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: com.onedelhi.secure.ba */
public class C4659ba<E> extends C5632i0<E> {
    @vr2

    /* renamed from: a */
    public final C6593qo f26244a;
    @vr2

    /* renamed from: a */
    public final ReentrantLock f26245a;
    @vr2

    /* renamed from: a */
    public Object[] f26246a;

    /* renamed from: n */
    public final int f26247n;

    /* renamed from: o */
    public int f26248o;
    @vr2
    private volatile /* synthetic */ int size;

    @ii2(mo38106k = 3, mo38107mv = {1, 6, 0}, mo38109xi = 48)
    /* renamed from: com.onedelhi.secure.ba$a */
    public /* synthetic */ class C4660a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f26249a;

        static {
            int[] iArr = new int[C6593qo.values().length];
            iArr[C6593qo.SUSPEND.ordinal()] = 1;
            iArr[C6593qo.DROP_LATEST.ordinal()] = 2;
            iArr[C6593qo.DROP_OLDEST.ordinal()] = 3;
            f26249a = iArr;
        }
    }

    public C4659ba(int i, @vr2 C6593qo qoVar, @ss2 ec1<? super E, un4> ec1) {
        super(ec1);
        this.f26247n = i;
        this.f26244a = qoVar;
        if (i < 1 ? false : true) {
            this.f26245a = new ReentrantLock();
            Object[] objArr = new Object[Math.min(i, 8)];
            C7458za.m73006w2(objArr, C5757j0.f30526a, 0, 0, 6, (Object) null);
            this.f26246a = objArr;
            this.size = 0;
            return;
        }
        throw new IllegalArgumentException(("ArrayChannel capacity must be at least 1, but " + i + " was specified").toString());
    }

    /* renamed from: C */
    public boolean mo31519C() {
        ReentrantLock reentrantLock = this.f26245a;
        reentrantLock.lock();
        try {
            return super.mo31519C();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: D */
    public final boolean mo31520D() {
        return false;
    }

    /* renamed from: E */
    public final boolean mo31521E() {
        return this.size == this.f26247n && this.f26244a == C6593qo.SUSPEND;
    }

    /* JADX INFO: finally extract failed */
    @vr2
    /* renamed from: H */
    public Object mo31522H(E e) {
        mg3 T;
        ReentrantLock reentrantLock = this.f26245a;
        reentrantLock.lock();
        try {
            int i = this.size;
            C5753iz<?> o = mo38994o();
            if (o == null) {
                l84 y0 = mo31535y0(i);
                if (y0 == null) {
                    if (i == 0) {
                        do {
                            T = mo37694T();
                            if (T != null) {
                                if (T instanceof C5753iz) {
                                    this.size = i;
                                    reentrantLock.unlock();
                                    return T;
                                }
                            }
                        } while (T.mo37725e0(e, (l82.C5974d) null) == null);
                        this.size = i;
                        un4 un4 = un4.f36206a;
                        reentrantLock.unlock();
                        T.mo37722B(e);
                        return T.mo38297s();
                    }
                    mo31533w0(i, e);
                    l84 l84 = C5757j0.f30528b;
                    reentrantLock.unlock();
                    return l84;
                }
                reentrantLock.unlock();
                return y0;
            }
            reentrantLock.unlock();
            return o;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @vr2
    /* renamed from: J */
    public Object mo31523J(E e, @vr2 it3<?> it3) {
        ReentrantLock reentrantLock = this.f26245a;
        reentrantLock.lock();
        try {
            int i = this.size;
            C5753iz<?> o = mo38994o();
            if (o == null) {
                l84 y0 = mo31535y0(i);
                if (y0 == null) {
                    if (i == 0) {
                        while (true) {
                            C5860k1.C5864d j = mo38992j(e);
                            Object C = it3.mo35593C(j);
                            if (C == null) {
                                this.size = i;
                                Object o2 = j.mo39711o();
                                un4 un4 = un4.f36206a;
                                reentrantLock.unlock();
                                jt1.m53774m(o2);
                                mg3 mg3 = (mg3) o2;
                                mg3.mo37722B(e);
                                return mg3.mo38297s();
                            } else if (C == C5757j0.f30529c) {
                                break;
                            } else if (C != C6944ub.f36019b) {
                                if (C != kt3.m54916d()) {
                                    if (!(C instanceof C5753iz)) {
                                        throw new IllegalStateException(jt1.m53745C("performAtomicTrySelect(describeTryOffer) returned ", C).toString());
                                    }
                                }
                                this.size = i;
                                return C;
                            }
                        }
                    }
                    if (!it3.mo35594D()) {
                        this.size = i;
                        Object d = kt3.m54916d();
                        reentrantLock.unlock();
                        return d;
                    }
                    mo31533w0(i, e);
                    l84 l84 = C5757j0.f30528b;
                    reentrantLock.unlock();
                    return l84;
                }
                reentrantLock.unlock();
                return y0;
            }
            reentrantLock.unlock();
            return o;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: g0 */
    public boolean mo31524g0(@vr2 kg3<? super E> kg3) {
        ReentrantLock reentrantLock = this.f26245a;
        reentrantLock.lock();
        try {
            return super.mo31524g0(kg3);
        } finally {
            reentrantLock.unlock();
        }
    }

    public boolean isEmpty() {
        ReentrantLock reentrantLock = this.f26245a;
        reentrantLock.lock();
        try {
            return mo37706l0();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: j0 */
    public final boolean mo31526j0() {
        return false;
    }

    /* renamed from: k0 */
    public final boolean mo31527k0() {
        return this.size == 0;
    }

    @ss2
    /* renamed from: l */
    public Object mo31528l(@vr2 rt3 rt3) {
        ReentrantLock reentrantLock = this.f26245a;
        reentrantLock.lock();
        try {
            return super.mo31528l(rt3);
        } finally {
            reentrantLock.unlock();
        }
    }

    @vr2
    /* renamed from: m */
    public String mo31529m() {
        return "(buffer:capacity=" + this.f26247n + ",size=" + this.size + ')';
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: m0 */
    public void mo31530m0(boolean z) {
        ec1<E, un4> ec1 = this.f31049a;
        ReentrantLock reentrantLock = this.f26245a;
        reentrantLock.lock();
        try {
            int i = this.size;
            mn4 mn4 = null;
            int i2 = 0;
            while (i2 < i) {
                i2++;
                Object obj = this.f26246a[this.f26248o];
                if (!(ec1 == null || obj == C5757j0.f30526a)) {
                    mn4 = qv2.m63198c(ec1, obj, mn4);
                }
                Object[] objArr = this.f26246a;
                int i3 = this.f26248o;
                objArr[i3] = C5757j0.f30526a;
                this.f26248o = (i3 + 1) % objArr.length;
            }
            this.size = 0;
            un4 un4 = un4.f36206a;
            reentrantLock.unlock();
            super.mo31530m0(z);
            if (mn4 != null) {
                throw mn4;
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @ss2
    /* renamed from: q0 */
    public Object mo31531q0() {
        ReentrantLock reentrantLock = this.f26245a;
        reentrantLock.lock();
        try {
            int i = this.size;
            if (i == 0) {
                Object o = mo38994o();
                if (o == null) {
                    o = C5757j0.f30530d;
                }
                return o;
            }
            Object[] objArr = this.f26246a;
            int i2 = this.f26248o;
            Object obj = objArr[i2];
            rt3 rt3 = null;
            objArr[i2] = null;
            this.size = i - 1;
            Object obj2 = C5757j0.f30530d;
            boolean z = false;
            if (i == this.f26247n) {
                rt3 rt32 = null;
                while (true) {
                    rt3 X = mo38989X();
                    if (X == null) {
                        rt3 = rt32;
                        break;
                    } else if (X.mo38292d1((l82.C5974d) null) != null) {
                        obj2 = X.mo38290b1();
                        rt3 = X;
                        z = true;
                        break;
                    } else {
                        X.mo39002e1();
                        rt32 = X;
                    }
                }
            }
            if (obj2 != C5757j0.f30530d && !(obj2 instanceof C5753iz)) {
                this.size = i;
                Object[] objArr2 = this.f26246a;
                objArr2[(this.f26248o + i) % objArr2.length] = obj2;
            }
            this.f26248o = (this.f26248o + 1) % this.f26246a.length;
            un4 un4 = un4.f36206a;
            reentrantLock.unlock();
            if (z) {
                jt1.m53774m(rt3);
                rt3.mo38289a1();
            }
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0051, code lost:
        if (r7 != com.onedelhi.secure.kt3.m54916d()) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0053, code lost:
        r8.size = r1;
        r8.f26246a[r8.f26248o] = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005b, code lost:
        r0.unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005e, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0061, code lost:
        if ((r7 instanceof com.onedelhi.secure.C5753iz) == false) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0063, code lost:
        r2 = r7;
        r5 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0075, code lost:
        throw new java.lang.IllegalStateException(com.onedelhi.secure.jt1.m53745C("performAtomicTrySelect(describeTryOffer) returned ", r7).toString());
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x007f A[Catch:{ all -> 0x00ba }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x008b A[Catch:{ all -> 0x00ba }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b1  */
    @com.onedelhi.secure.ss2
    /* renamed from: r0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo31532r0(@com.onedelhi.secure.vr2 com.onedelhi.secure.it3<?> r9) {
        /*
            r8 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r8.f26245a
            r0.lock()
            int r1 = r8.size     // Catch:{ all -> 0x00ba }
            if (r1 != 0) goto L_0x0015
            com.onedelhi.secure.iz r9 = r8.mo38994o()     // Catch:{ all -> 0x00ba }
            if (r9 != 0) goto L_0x0011
            com.onedelhi.secure.l84 r9 = com.onedelhi.secure.C5757j0.f30530d     // Catch:{ all -> 0x00ba }
        L_0x0011:
            r0.unlock()
            return r9
        L_0x0015:
            java.lang.Object[] r2 = r8.f26246a     // Catch:{ all -> 0x00ba }
            int r3 = r8.f26248o     // Catch:{ all -> 0x00ba }
            r4 = r2[r3]     // Catch:{ all -> 0x00ba }
            r5 = 0
            r2[r3] = r5     // Catch:{ all -> 0x00ba }
            int r2 = r1 + -1
            r8.size = r2     // Catch:{ all -> 0x00ba }
            com.onedelhi.secure.l84 r2 = com.onedelhi.secure.C5757j0.f30530d     // Catch:{ all -> 0x00ba }
            int r3 = r8.f26247n     // Catch:{ all -> 0x00ba }
            r6 = 1
            if (r1 != r3) goto L_0x0076
        L_0x0029:
            com.onedelhi.secure.i0$g r3 = r8.mo37701e0()     // Catch:{ all -> 0x00ba }
            java.lang.Object r7 = r9.mo35593C(r3)     // Catch:{ all -> 0x00ba }
            if (r7 != 0) goto L_0x0043
            java.lang.Object r5 = r3.mo39711o()     // Catch:{ all -> 0x00ba }
            com.onedelhi.secure.jt1.m53774m(r5)     // Catch:{ all -> 0x00ba }
            r2 = r5
            com.onedelhi.secure.rt3 r2 = (com.onedelhi.secure.rt3) r2     // Catch:{ all -> 0x00ba }
            java.lang.Object r2 = r2.mo38290b1()     // Catch:{ all -> 0x00ba }
        L_0x0041:
            r3 = 1
            goto L_0x0077
        L_0x0043:
            com.onedelhi.secure.l84 r3 = com.onedelhi.secure.C5757j0.f30530d     // Catch:{ all -> 0x00ba }
            if (r7 != r3) goto L_0x0048
            goto L_0x0076
        L_0x0048:
            java.lang.Object r3 = com.onedelhi.secure.C6944ub.f36019b     // Catch:{ all -> 0x00ba }
            if (r7 != r3) goto L_0x004d
            goto L_0x0029
        L_0x004d:
            java.lang.Object r2 = com.onedelhi.secure.kt3.m54916d()     // Catch:{ all -> 0x00ba }
            if (r7 != r2) goto L_0x005f
            r8.size = r1     // Catch:{ all -> 0x00ba }
            java.lang.Object[] r9 = r8.f26246a     // Catch:{ all -> 0x00ba }
            int r1 = r8.f26248o     // Catch:{ all -> 0x00ba }
            r9[r1] = r4     // Catch:{ all -> 0x00ba }
            r0.unlock()
            return r7
        L_0x005f:
            boolean r2 = r7 instanceof com.onedelhi.secure.C5753iz     // Catch:{ all -> 0x00ba }
            if (r2 == 0) goto L_0x0066
            r2 = r7
            r5 = r2
            goto L_0x0041
        L_0x0066:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00ba }
            java.lang.String r1 = "performAtomicTrySelect(describeTryOffer) returned "
            java.lang.String r1 = com.onedelhi.secure.jt1.m53745C(r1, r7)     // Catch:{ all -> 0x00ba }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00ba }
            r9.<init>(r1)     // Catch:{ all -> 0x00ba }
            throw r9     // Catch:{ all -> 0x00ba }
        L_0x0076:
            r3 = 0
        L_0x0077:
            com.onedelhi.secure.l84 r7 = com.onedelhi.secure.C5757j0.f30530d     // Catch:{ all -> 0x00ba }
            if (r2 == r7) goto L_0x008b
            boolean r7 = r2 instanceof com.onedelhi.secure.C5753iz     // Catch:{ all -> 0x00ba }
            if (r7 != 0) goto L_0x008b
            r8.size = r1     // Catch:{ all -> 0x00ba }
            java.lang.Object[] r9 = r8.f26246a     // Catch:{ all -> 0x00ba }
            int r7 = r8.f26248o     // Catch:{ all -> 0x00ba }
            int r7 = r7 + r1
            int r1 = r9.length     // Catch:{ all -> 0x00ba }
            int r7 = r7 % r1
            r9[r7] = r2     // Catch:{ all -> 0x00ba }
            goto L_0x00a1
        L_0x008b:
            boolean r9 = r9.mo35594D()     // Catch:{ all -> 0x00ba }
            if (r9 != 0) goto L_0x00a1
            r8.size = r1     // Catch:{ all -> 0x00ba }
            java.lang.Object[] r9 = r8.f26246a     // Catch:{ all -> 0x00ba }
            int r1 = r8.f26248o     // Catch:{ all -> 0x00ba }
            r9[r1] = r4     // Catch:{ all -> 0x00ba }
            java.lang.Object r9 = com.onedelhi.secure.kt3.m54916d()     // Catch:{ all -> 0x00ba }
            r0.unlock()
            return r9
        L_0x00a1:
            int r9 = r8.f26248o     // Catch:{ all -> 0x00ba }
            int r9 = r9 + r6
            java.lang.Object[] r1 = r8.f26246a     // Catch:{ all -> 0x00ba }
            int r1 = r1.length     // Catch:{ all -> 0x00ba }
            int r9 = r9 % r1
            r8.f26248o = r9     // Catch:{ all -> 0x00ba }
            com.onedelhi.secure.un4 r9 = com.onedelhi.secure.un4.f36206a     // Catch:{ all -> 0x00ba }
            r0.unlock()
            if (r3 == 0) goto L_0x00b9
            com.onedelhi.secure.jt1.m53774m(r5)
            com.onedelhi.secure.rt3 r5 = (com.onedelhi.secure.rt3) r5
            r5.mo38289a1()
        L_0x00b9:
            return r4
        L_0x00ba:
            r9 = move-exception
            r0.unlock()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C4659ba.mo31532r0(com.onedelhi.secure.it3):java.lang.Object");
    }

    /* renamed from: w0 */
    public final void mo31533w0(int i, E e) {
        if (i < this.f26247n) {
            mo31534x0(i);
            Object[] objArr = this.f26246a;
            objArr[(this.f26248o + i) % objArr.length] = e;
            return;
        }
        Object[] objArr2 = this.f26246a;
        int i2 = this.f26248o;
        objArr2[i2 % objArr2.length] = null;
        objArr2[(i + i2) % objArr2.length] = e;
        this.f26248o = (i2 + 1) % objArr2.length;
    }

    /* renamed from: x0 */
    public final void mo31534x0(int i) {
        Object[] objArr = this.f26246a;
        if (i >= objArr.length) {
            int min = Math.min(objArr.length * 2, this.f26247n);
            Object[] objArr2 = new Object[min];
            for (int i2 = 0; i2 < i; i2++) {
                Object[] objArr3 = this.f26246a;
                objArr2[i2] = objArr3[(this.f26248o + i2) % objArr3.length];
            }
            C7458za.m72944n2(objArr2, C5757j0.f30526a, i, min);
            this.f26246a = objArr2;
            this.f26248o = 0;
        }
    }

    /* renamed from: y0 */
    public final l84 mo31535y0(int i) {
        if (i < this.f26247n) {
            this.size = i + 1;
            return null;
        }
        int i2 = C4660a.f26249a[this.f26244a.ordinal()];
        if (i2 == 1) {
            return C5757j0.f30529c;
        }
        if (i2 == 2) {
            return C5757j0.f30528b;
        }
        if (i2 == 3) {
            return null;
        }
        throw new gr2();
    }
}
