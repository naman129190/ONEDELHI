package com.onedelhi.secure;

import com.onedelhi.secure.C5945kw;
import com.onedelhi.secure.l82;
import com.onedelhi.secure.nl3;
import com.onedelhi.secure.st3;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0004ghijB)\u0012 \u0010e\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b\u0018\u00010:j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`d¢\u0006\u0004\bf\u0010>J\u001b\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00028\u00002\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ+\u0010\u000f\u001a\u00020\u000b*\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\b\u001a\u00028\u00002\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\u000b2\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0002¢\u0006\u0004\b\u0014\u0010\u0015JX\u0010\u001c\u001a\u00020\u000b\"\u0004\b\u0001\u0010\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u00172\u0006\u0010\b\u001a\u00028\u00002(\u0010\u001b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b!\u0010\"J#\u0010#\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00028\u00002\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u0017H\u0014¢\u0006\u0004\b#\u0010$J\u0011\u0010&\u001a\u0004\u0018\u00010%H\u0004¢\u0006\u0004\b&\u0010'J\u001d\u0010)\u001a\b\u0012\u0002\b\u0003\u0018\u00010(2\u0006\u0010\b\u001a\u00028\u0000H\u0004¢\u0006\u0004\b)\u0010*J#\u0010-\u001a\u000e\u0012\u0002\b\u00030+j\u0006\u0012\u0002\b\u0003`,2\u0006\u0010\b\u001a\u00028\u0000H\u0004¢\u0006\u0004\b-\u0010.J\u001b\u0010/\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b/\u0010\rJ\u0017\u00101\u001a\u0002002\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b1\u00102J$\u00104\u001a\b\u0012\u0004\u0012\u00020\u000b032\u0006\u0010\b\u001a\u00028\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b4\u0010\"J\u0019\u00106\u001a\u0004\u0018\u00010\u001a2\u0006\u00105\u001a\u00020%H\u0014¢\u0006\u0004\b6\u00107J\u0019\u00108\u001a\u0002002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b8\u00109J)\u0010=\u001a\u00020\u000b2\u0018\u0010<\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u000b0:j\u0002`;H\u0016¢\u0006\u0004\b=\u0010>J\u0017\u0010@\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020?H\u0014¢\u0006\u0004\b@\u0010AJ\u0017\u0010B\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010(H\u0014¢\u0006\u0004\bB\u0010CJ\u001d\u0010E\u001a\b\u0012\u0004\u0012\u00028\u00000D2\u0006\u0010\b\u001a\u00028\u0000H\u0004¢\u0006\u0004\bE\u0010FJ\u000f\u0010H\u001a\u00020GH\u0016¢\u0006\u0004\bH\u0010IR\u0014\u0010L\u001a\u0002008BX\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0014\u0010N\u001a\u00020G8BX\u0004¢\u0006\u0006\u001a\u0004\bM\u0010IR\u001a\u0010P\u001a\u00020O8\u0004X\u0004¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u0014\u0010U\u001a\u0002008$X¤\u0004¢\u0006\u0006\u001a\u0004\bT\u0010KR\u0014\u0010V\u001a\u0002008$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0001\u0010KR\u001a\u0010Y\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00038DX\u0004¢\u0006\u0006\u001a\u0004\bW\u0010XR\u001a\u0010[\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00038DX\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010XR\u0011\u0010]\u001a\u0002008F¢\u0006\u0006\u001a\u0004\b\\\u0010KR#\u0010a\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020^8F¢\u0006\u0006\u001a\u0004\b_\u0010`R\u0014\u0010c\u001a\u00020G8TX\u0004¢\u0006\u0006\u001a\u0004\bb\u0010I\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006k"}, d2 = {"Lcom/onedelhi/secure/k1;", "E", "Lcom/onedelhi/secure/st3;", "Lcom/onedelhi/secure/iz;", "closed", "", "u", "(Lcom/onedelhi/secure/iz;)Ljava/lang/Throwable;", "element", "w", "(Ljava/lang/Object;Lcom/onedelhi/secure/iz;)Ljava/lang/Throwable;", "Lcom/onedelhi/secure/un4;", "P", "(Ljava/lang/Object;Lcom/onedelhi/secure/b80;)Ljava/lang/Object;", "Lcom/onedelhi/secure/b80;", "y", "(Lcom/onedelhi/secure/b80;Ljava/lang/Object;Lcom/onedelhi/secure/iz;)V", "cause", "A", "(Ljava/lang/Throwable;)V", "s", "(Lcom/onedelhi/secure/iz;)V", "R", "Lcom/onedelhi/secure/it3;", "select", "Lkotlin/Function2;", "", "block", "M", "(Lcom/onedelhi/secure/it3;Ljava/lang/Object;Lcom/onedelhi/secure/sc1;)V", "", "h", "()I", "H", "(Ljava/lang/Object;)Ljava/lang/Object;", "J", "(Ljava/lang/Object;Lcom/onedelhi/secure/it3;)Ljava/lang/Object;", "Lcom/onedelhi/secure/rt3;", "X", "()Lcom/onedelhi/secure/rt3;", "Lcom/onedelhi/secure/mg3;", "N", "(Ljava/lang/Object;)Lcom/onedelhi/secure/mg3;", "Lcom/onedelhi/secure/l82$b;", "Lkotlinx/coroutines/internal/AddLastDesc;", "i", "(Ljava/lang/Object;)Lcom/onedelhi/secure/l82$b;", "F", "", "L", "(Ljava/lang/Object;)Z", "Lcom/onedelhi/secure/kw;", "e", "send", "l", "(Lcom/onedelhi/secure/rt3;)Ljava/lang/Object;", "I", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function1;", "Lkotlinx/coroutines/channels/Handler;", "handler", "a0", "(Lcom/onedelhi/secure/ec1;)V", "Lcom/onedelhi/secure/l82;", "K", "(Lcom/onedelhi/secure/l82;)V", "T", "()Lcom/onedelhi/secure/mg3;", "Lcom/onedelhi/secure/k1$d;", "j", "(Ljava/lang/Object;)Lcom/onedelhi/secure/k1$d;", "", "toString", "()Ljava/lang/String;", "G", "()Z", "isFullImpl", "q", "queueDebugStateString", "Lcom/onedelhi/secure/j82;", "queue", "Lcom/onedelhi/secure/j82;", "p", "()Lcom/onedelhi/secure/j82;", "D", "isBufferAlwaysFull", "isBufferFull", "o", "()Lcom/onedelhi/secure/iz;", "closedForSend", "n", "closedForReceive", "Q", "isClosedForSend", "Lcom/onedelhi/secure/ht3;", "B", "()Lcom/onedelhi/secure/ht3;", "onSend", "m", "bufferDebugString", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "a", "b", "c", "d", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: com.onedelhi.secure.k1 */
public abstract class C5860k1<E> implements st3<E> {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f31048a = AtomicReferenceFieldUpdater.newUpdater(C5860k1.class, Object.class, "onCloseHandler");
    @rw1
    @ss2

    /* renamed from: a */
    public final ec1<E, un4> f31049a;
    @vr2

    /* renamed from: a */
    public final j82 f31050a = new j82();
    @vr2
    private volatile /* synthetic */ Object onCloseHandler = null;

    @Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0012\u001a\u00028\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0014\u0010\u000b\u001a\u00020\u00072\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000e8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/onedelhi/secure/k1$a;", "E", "Lcom/onedelhi/secure/rt3;", "Lcom/onedelhi/secure/l82$d;", "otherOp", "Lcom/onedelhi/secure/l84;", "d1", "Lcom/onedelhi/secure/un4;", "a1", "Lcom/onedelhi/secure/iz;", "closed", "c1", "", "toString", "", "b1", "()Ljava/lang/Object;", "pollResult", "element", "<init>", "(Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.k1$a */
    public static final class C5861a<E> extends rt3 {
        @rw1

        /* renamed from: a */
        public final E f31051a;

        public C5861a(E e) {
            this.f31051a = e;
        }

        /* renamed from: a1 */
        public void mo38289a1() {
        }

        @ss2
        /* renamed from: b1 */
        public Object mo38290b1() {
            return this.f31051a;
        }

        /* renamed from: c1 */
        public void mo38291c1(@vr2 C5753iz<?> izVar) {
        }

        @ss2
        /* renamed from: d1 */
        public l84 mo38292d1(@ss2 l82.C5974d dVar) {
            l84 l84 = C5937ku.f31431a;
            if (dVar != null) {
                dVar.mo39710d();
            }
            return l84;
        }

        @vr2
        public String toString() {
            return "SendBuffered@" + if0.m52225b(this) + '(' + this.f31051a + ')';
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0012\u0018\u0000*\u0004\b\u0001\u0010\u00012\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0002j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003`\u0004B\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00028\u0001¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0014¨\u0006\u000e"}, d2 = {"Lcom/onedelhi/secure/k1$b;", "E", "Lcom/onedelhi/secure/l82$b;", "Lcom/onedelhi/secure/k1$a;", "Lkotlinx/coroutines/internal/AddLastDesc;", "Lcom/onedelhi/secure/l82;", "affected", "", "e", "Lcom/onedelhi/secure/j82;", "queue", "element", "<init>", "(Lcom/onedelhi/secure/j82;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.k1$b */
    public static class C5862b<E> extends l82.C5972b<C5861a<? extends E>> {
        public C5862b(@vr2 j82 j82, E e) {
            super(j82, new C5861a(e));
        }

        @ss2
        /* renamed from: e */
        public Object mo37728e(@vr2 l82 l82) {
            if (l82 instanceof C5753iz) {
                return l82;
            }
            if (l82 instanceof mg3) {
                return C5757j0.f30529c;
            }
            return null;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u0001*\u0004\b\u0002\u0010\u00022\u00020\u00032\u00020\u0004BX\u0012\u0006\u0010\u0012\u001a\u00028\u0001\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u0016\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00020\u0018\u0012(\u0010\u001e\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001aø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u0014\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\tH\u0016J\u0014\u0010\u000e\u001a\u00020\t2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\fH\u0016J\b\u0010\u000f\u001a\u00020\tH\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016R\u001a\u0010\u0012\u001a\u00028\u00018\u0016X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"Lcom/onedelhi/secure/k1$c;", "E", "R", "Lcom/onedelhi/secure/rt3;", "Lcom/onedelhi/secure/fn0;", "Lcom/onedelhi/secure/l82$d;", "otherOp", "Lcom/onedelhi/secure/l84;", "d1", "Lcom/onedelhi/secure/un4;", "a1", "e", "Lcom/onedelhi/secure/iz;", "closed", "c1", "e1", "", "toString", "pollResult", "Ljava/lang/Object;", "b1", "()Ljava/lang/Object;", "Lcom/onedelhi/secure/k1;", "channel", "Lcom/onedelhi/secure/it3;", "select", "Lkotlin/Function2;", "Lcom/onedelhi/secure/st3;", "Lcom/onedelhi/secure/b80;", "", "block", "<init>", "(Ljava/lang/Object;Lcom/onedelhi/secure/k1;Lcom/onedelhi/secure/it3;Lcom/onedelhi/secure/sc1;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.k1$c */
    public static final class C5863c<E, R> extends rt3 implements fn0 {
        @rw1
        @vr2

        /* renamed from: a */
        public final it3<R> f31052a;
        @rw1
        @vr2

        /* renamed from: a */
        public final C5860k1<E> f31053a;
        @rw1
        @vr2

        /* renamed from: a */
        public final sc1<st3<? super E>, b80<? super R>, Object> f31054a;

        /* renamed from: a */
        public final E f31055a;

        public C5863c(E e, @vr2 C5860k1<E> k1Var, @vr2 it3<? super R> it3, @vr2 sc1<? super st3<? super E>, ? super b80<? super R>, ? extends Object> sc1) {
            this.f31055a = e;
            this.f31053a = k1Var;
            this.f31052a = it3;
            this.f31054a = sc1;
        }

        /* renamed from: a1 */
        public void mo38289a1() {
            C6303ou.m59638f(this.f31054a, this.f31053a, this.f31052a.mo35603k0(), (ec1) null, 4, (Object) null);
        }

        /* renamed from: b1 */
        public E mo38290b1() {
            return this.f31055a;
        }

        /* renamed from: c1 */
        public void mo38291c1(@vr2 C5753iz<?> izVar) {
            if (this.f31052a.mo35594D()) {
                this.f31052a.mo35606q(izVar.mo38296i1());
            }
        }

        @ss2
        /* renamed from: d1 */
        public l84 mo38292d1(@ss2 l82.C5974d dVar) {
            return (l84) this.f31052a.mo35597d0(dVar);
        }

        /* renamed from: e */
        public void mo30964e() {
            if (mo38449T0()) {
                mo39002e1();
            }
        }

        /* renamed from: e1 */
        public void mo39002e1() {
            ec1<E, un4> ec1 = this.f31053a.f31049a;
            if (ec1 != null) {
                qv2.m63197b(ec1, mo38290b1(), this.f31052a.mo35603k0().mo31187f());
            }
        }

        @vr2
        public String toString() {
            return "SendSelect@" + if0.m52225b(this) + '(' + mo38290b1() + ")[" + this.f31053a + ", " + this.f31052a + ']';
        }
    }

    @Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u0000*\u0004\b\u0001\u0010\u00012\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0002j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003`\u0004B\u0017\u0012\u0006\u0010\r\u001a\u00028\u0001\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0014J\u0016\u0010\f\u001a\u0004\u0018\u00010\u00072\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016¨\u0006\u0012"}, d2 = {"Lcom/onedelhi/secure/k1$d;", "E", "Lcom/onedelhi/secure/l82$e;", "Lcom/onedelhi/secure/mg3;", "Lkotlinx/coroutines/internal/RemoveFirstDesc;", "Lcom/onedelhi/secure/l82;", "affected", "", "e", "Lcom/onedelhi/secure/l82$d;", "Lkotlinx/coroutines/internal/PrepareOp;", "prepareOp", "j", "element", "Lcom/onedelhi/secure/j82;", "queue", "<init>", "(Ljava/lang/Object;Lcom/onedelhi/secure/j82;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.k1$d */
    public static final class C5864d<E> extends l82.C5975e<mg3<? super E>> {
        @rw1

        /* renamed from: a */
        public final E f31056a;

        public C5864d(E e, @vr2 j82 j82) {
            super(j82);
            this.f31056a = e;
        }

        @ss2
        /* renamed from: e */
        public Object mo37728e(@vr2 l82 l82) {
            if (l82 instanceof C5753iz) {
                return l82;
            }
            if (!(l82 instanceof mg3)) {
                return C5757j0.f30529c;
            }
            return null;
        }

        @ss2
        /* renamed from: j */
        public Object mo37729j(@vr2 l82.C5974d dVar) {
            l84 e0 = ((mg3) dVar.f31592a).mo37725e0(this.f31056a, dVar);
            if (e0 == null) {
                return m82.f32053a;
            }
            Object obj = C6944ub.f36019b;
            if (e0 == obj) {
                return obj;
            }
            return null;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"com/onedelhi/secure/l82$f", "Lcom/onedelhi/secure/l82$c;", "Lcom/onedelhi/secure/l82;", "Lkotlinx/coroutines/internal/Node;", "affected", "", "k", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.k1$e */
    public static final class C5865e extends l82.C5973c {

        /* renamed from: a */
        public final /* synthetic */ C5860k1 f31057a;

        /* renamed from: c */
        public final /* synthetic */ l82 f31058c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5865e(l82 l82, C5860k1 k1Var) {
            super(l82);
            this.f31058c = l82;
            this.f31057a = k1Var;
        }

        @ss2
        /* renamed from: k */
        public Object mo31084i(@vr2 l82 l82) {
            if (this.f31057a.mo31521E()) {
                return null;
            }
            return k82.m54100a();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001JX\u0010\f\u001a\u00020\u000b\"\u0004\b\u0001\u0010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u0006\u001a\u00028\u00002(\u0010\n\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"com/onedelhi/secure/k1$f", "Lcom/onedelhi/secure/ht3;", "Lcom/onedelhi/secure/st3;", "R", "Lcom/onedelhi/secure/it3;", "select", "param", "Lkotlin/Function2;", "Lcom/onedelhi/secure/b80;", "", "block", "Lcom/onedelhi/secure/un4;", "D", "(Lcom/onedelhi/secure/it3;Ljava/lang/Object;Lcom/onedelhi/secure/sc1;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.k1$f */
    public static final class C5866f implements ht3<E, st3<? super E>> {

        /* renamed from: a */
        public final /* synthetic */ C5860k1<E> f31059a;

        public C5866f(C5860k1<E> k1Var) {
            this.f31059a = k1Var;
        }

        /* renamed from: D */
        public <R> void mo31063D(@vr2 it3<? super R> it3, E e, @vr2 sc1<? super st3<? super E>, ? super b80<? super R>, ? extends Object> sc1) {
            this.f31059a.mo38986M(it3, e, sc1);
        }
    }

    public C5860k1(@ss2 ec1<? super E, un4> ec1) {
        this.f31049a = ec1;
    }

    /* renamed from: A */
    public final void mo38983A(Throwable th) {
        l84 l84;
        Object obj = this.onCloseHandler;
        if (obj != null && obj != (l84 = C5757j0.f30532f) && C5759j1.m52871a(f31048a, this, obj, l84)) {
            ((ec1) lj4.m55703q(obj, 1)).mo17094X(th);
        }
    }

    @vr2
    /* renamed from: B */
    public final ht3<E, st3<E>> mo36800B() {
        return new C5866f(this);
    }

    /* renamed from: D */
    public abstract boolean mo31520D();

    /* renamed from: E */
    public abstract boolean mo31521E();

    @ss2
    /* renamed from: F */
    public final Object mo36801F(E e, @vr2 b80<? super un4> b80) {
        if (mo31522H(e) == C5757j0.f30528b) {
            return un4.f36206a;
        }
        Object P = mo38988P(e, b80);
        return P == mt1.m57558h() ? P : un4.f36206a;
    }

    /* renamed from: G */
    public final boolean mo38984G() {
        return !(this.f31050a.mo39691M0() instanceof mg3) && mo31521E();
    }

    @vr2
    /* renamed from: H */
    public Object mo31522H(E e) {
        mg3 T;
        do {
            T = mo37694T();
            if (T == null) {
                return C5757j0.f30529c;
            }
        } while (T.mo37725e0(e, (l82.C5974d) null) == null);
        T.mo37722B(e);
        return T.mo38297s();
    }

    /* renamed from: I */
    public boolean mo36803I(@ss2 Throwable th) {
        boolean z;
        C5753iz izVar = new C5753iz(th);
        j82 j82 = this.f31050a;
        while (true) {
            l82 N0 = j82.mo39692N0();
            z = true;
            if (!(N0 instanceof C5753iz)) {
                if (N0.mo39683E0(izVar, j82)) {
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (!z) {
            izVar = (C5753iz) this.f31050a.mo39692N0();
        }
        mo38997s(izVar);
        if (z) {
            mo38983A(th);
        }
        return z;
    }

    @vr2
    /* renamed from: J */
    public Object mo31523J(E e, @vr2 it3<?> it3) {
        C5864d j = mo38992j(e);
        Object C = it3.mo35593C(j);
        if (C != null) {
            return C;
        }
        mg3 mg3 = (mg3) j.mo39711o();
        mg3.mo37722B(e);
        return mg3.mo38297s();
    }

    /* renamed from: K */
    public void mo38985K(@vr2 l82 l82) {
    }

    /* renamed from: L */
    public boolean mo36806L(E e) {
        mn4 d;
        try {
            return st3.C6793a.m64881c(this, e);
        } catch (Throwable th) {
            ec1<E, un4> ec1 = this.f31049a;
            if (ec1 == null || (d = qv2.m63199d(ec1, e, (mn4) null, 2, (Object) null)) == null) {
                throw th;
            }
            pw0.m61687a(d, th);
            throw d;
        }
    }

    /* renamed from: M */
    public final <R> void mo38986M(it3<? super R> it3, E e, sc1<? super st3<? super E>, ? super b80<? super R>, ? extends Object> sc1) {
        while (!it3.mo35605l()) {
            if (mo38984G()) {
                C5863c cVar = new C5863c(e, this, it3, sc1);
                Object l = mo31528l(cVar);
                if (l == null) {
                    it3.mo35595F(cVar);
                    return;
                } else if (l instanceof C5753iz) {
                    throw i24.m51757p(mo39000w(e, (C5753iz) l));
                } else if (l != C5757j0.f30531e && !(l instanceof kg3)) {
                    throw new IllegalStateException(("enqueueSend returned " + l + ' ').toString());
                }
            }
            Object J = mo31523J(e, it3);
            if (J != kt3.m54916d()) {
                if (J != C5757j0.f30529c && J != C6944ub.f36019b) {
                    if (J == C5757j0.f30528b) {
                        pn4.m61465d(sc1, this, it3.mo35603k0());
                        return;
                    } else if (J instanceof C5753iz) {
                        throw i24.m51757p(mo39000w(e, (C5753iz) J));
                    } else {
                        throw new IllegalStateException(jt1.m53745C("offerSelectInternal returned ", J).toString());
                    }
                }
            } else {
                return;
            }
        }
    }

    @ss2
    /* renamed from: N */
    public final mg3<?> mo38987N(E e) {
        l82 N0;
        j82 j82 = this.f31050a;
        C5861a aVar = new C5861a(e);
        do {
            N0 = j82.mo39692N0();
            if (N0 instanceof mg3) {
                return (mg3) N0;
            }
        } while (!N0.mo39683E0(aVar, j82));
        return null;
    }

    /* renamed from: P */
    public final Object mo38988P(E e, b80<? super un4> b80) {
        C5847ju<? super un4> b = C6057lu.m56509b(lt1.m56482d(b80));
        while (true) {
            if (mo38984G()) {
                rt3 tt3 = this.f31049a == null ? new tt3(e, b) : new ut3(e, b, this.f31049a);
                Object l = mo31528l(tt3);
                if (l == null) {
                    C6057lu.m56510c(b, tt3);
                    break;
                } else if (l instanceof C5753iz) {
                    mo39001y(b, e, (C5753iz) l);
                    break;
                } else if (l != C5757j0.f30531e && !(l instanceof kg3)) {
                    throw new IllegalStateException(jt1.m53745C("enqueueSend returned ", l).toString());
                }
            }
            Object H = mo31522H(e);
            if (H == C5757j0.f30528b) {
                nl3.C6191a aVar = nl3.f32575a;
                b.mo31191m0(nl3.m58187b(un4.f36206a));
                break;
            } else if (H != C5757j0.f30529c) {
                if (H instanceof C5753iz) {
                    mo39001y(b, e, (C5753iz) H);
                } else {
                    throw new IllegalStateException(jt1.m53745C("offerInternal returned ", H).toString());
                }
            }
        }
        Object A = b.mo38880A();
        if (A == mt1.m57558h()) {
            hf0.m50483c(b80);
        }
        return A == mt1.m57558h() ? A : un4.f36206a;
    }

    /* renamed from: Q */
    public final boolean mo36808Q() {
        return mo38994o() != null;
    }

    @ss2
    /* renamed from: T */
    public mg3<E> mo37694T() {
        l82 l82;
        l82 W0;
        j82 j82 = this.f31050a;
        while (true) {
            l82 = (l82) j82.mo39690L0();
            if (l82 != j82 && (l82 instanceof mg3)) {
                if (((((mg3) l82) instanceof C5753iz) && !l82.mo38447Q0()) || (W0 = l82.mo39698W0()) == null) {
                    break;
                }
                W0.mo39694P0();
            }
        }
        l82 = null;
        return (mg3) l82;
    }

    @ss2
    /* renamed from: X */
    public final rt3 mo38989X() {
        l82 l82;
        l82 W0;
        j82 j82 = this.f31050a;
        while (true) {
            l82 = (l82) j82.mo39690L0();
            if (l82 != j82 && (l82 instanceof rt3)) {
                if (((((rt3) l82) instanceof C5753iz) && !l82.mo38447Q0()) || (W0 = l82.mo39698W0()) == null) {
                    break;
                }
                W0.mo39694P0();
            }
        }
        l82 = null;
        return (rt3) l82;
    }

    /* renamed from: a0 */
    public void mo36810a0(@vr2 ec1<? super Throwable, un4> ec1) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f31048a;
        if (!C5759j1.m52871a(atomicReferenceFieldUpdater, this, (Object) null, ec1)) {
            Object obj = this.onCloseHandler;
            if (obj == C5757j0.f30532f) {
                throw new IllegalStateException("Another handler was already registered and successfully invoked");
            }
            throw new IllegalStateException(jt1.m53745C("Another handler was already registered: ", obj));
        }
        C5753iz<?> o = mo38994o();
        if (o != null && C5759j1.m52871a(atomicReferenceFieldUpdater, this, ec1, C5757j0.f30532f)) {
            ec1.mo17094X(o.f30506a);
        }
    }

    @vr2
    /* renamed from: e */
    public final Object mo36811e(E e) {
        C5753iz<?> izVar;
        C5945kw.C5947b bVar;
        Object H = mo31522H(e);
        if (H == C5757j0.f30528b) {
            return C5945kw.f31471a.mo39550c(un4.f36206a);
        }
        if (H == C5757j0.f30529c) {
            izVar = mo38994o();
            if (izVar == null) {
                return C5945kw.f31471a.mo39549b();
            }
            bVar = C5945kw.f31471a;
        } else if (H instanceof C5753iz) {
            bVar = C5945kw.f31471a;
            izVar = (C5753iz) H;
        } else {
            throw new IllegalStateException(jt1.m53745C("trySend returned ", H).toString());
        }
        return bVar.mo39548a(mo38999u(izVar));
    }

    /* renamed from: h */
    public final int mo38990h() {
        j82 j82 = this.f31050a;
        int i = 0;
        for (l82 l82 = (l82) j82.mo39690L0(); !jt1.m53768g(l82, j82); l82 = l82.mo39691M0()) {
            if (l82 instanceof l82) {
                i++;
            }
        }
        return i;
    }

    @vr2
    /* renamed from: i */
    public final l82.C5972b<?> mo38991i(E e) {
        return new C5862b(this.f31050a, e);
    }

    @vr2
    /* renamed from: j */
    public final C5864d<E> mo38992j(E e) {
        return new C5864d<>(e, this.f31050a);
    }

    @ss2
    /* renamed from: l */
    public Object mo31528l(@vr2 rt3 rt3) {
        boolean z;
        l82 N0;
        if (mo31520D()) {
            j82 j82 = this.f31050a;
            do {
                N0 = j82.mo39692N0();
                if (N0 instanceof mg3) {
                    return N0;
                }
            } while (!N0.mo39683E0(rt3, j82));
            return null;
        }
        j82 j822 = this.f31050a;
        C5865e eVar = new C5865e(rt3, this);
        while (true) {
            l82 N02 = j822.mo39692N0();
            if (!(N02 instanceof mg3)) {
                int Y0 = N02.mo39700Y0(rt3, j822, eVar);
                z = true;
                if (Y0 != 1) {
                    if (Y0 == 2) {
                        z = false;
                        break;
                    }
                } else {
                    break;
                }
            } else {
                return N02;
            }
        }
        if (!z) {
            return C5757j0.f30531e;
        }
        return null;
    }

    @vr2
    /* renamed from: m */
    public String mo31529m() {
        return "";
    }

    @ss2
    /* renamed from: n */
    public final C5753iz<?> mo38993n() {
        l82 M0 = this.f31050a.mo39691M0();
        C5753iz<?> izVar = M0 instanceof C5753iz ? (C5753iz) M0 : null;
        if (izVar == null) {
            return null;
        }
        mo38997s(izVar);
        return izVar;
    }

    @ss2
    /* renamed from: o */
    public final C5753iz<?> mo38994o() {
        l82 N0 = this.f31050a.mo39692N0();
        C5753iz<?> izVar = N0 instanceof C5753iz ? (C5753iz) N0 : null;
        if (izVar == null) {
            return null;
        }
        mo38997s(izVar);
        return izVar;
    }

    @vr2
    /* renamed from: p */
    public final j82 mo38995p() {
        return this.f31050a;
    }

    /* renamed from: q */
    public final String mo38996q() {
        l82 M0 = this.f31050a.mo39691M0();
        if (M0 == this.f31050a) {
            return "EmptyQueue";
        }
        String l82 = M0 instanceof C5753iz ? M0.toString() : M0 instanceof kg3 ? "ReceiveQueued" : M0 instanceof rt3 ? "SendQueued" : jt1.m53745C("UNEXPECTED:", M0);
        l82 N0 = this.f31050a.mo39692N0();
        if (N0 == M0) {
            return l82;
        }
        String str = l82 + ",queueSize=" + mo38990h();
        if (!(N0 instanceof C5753iz)) {
            return str;
        }
        return str + ",closedForSend=" + N0;
    }

    /* renamed from: s */
    public final void mo38997s(C5753iz<?> izVar) {
        Object c = tq1.m66116c((Object) null, 1, (wg0) null);
        while (true) {
            l82 N0 = izVar.mo39692N0();
            kg3 kg3 = N0 instanceof kg3 ? (kg3) N0 : null;
            if (kg3 == null) {
                break;
            } else if (!kg3.mo38449T0()) {
                kg3.mo39693O0();
            } else {
                c = tq1.m66121h(c, kg3);
            }
        }
        if (c != null) {
            if (!(c instanceof ArrayList)) {
                ((kg3) c).mo37723c1(izVar);
            } else {
                ArrayList arrayList = (ArrayList) c;
                int size = arrayList.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i = size - 1;
                        ((kg3) arrayList.get(size)).mo37723c1(izVar);
                        if (i < 0) {
                            break;
                        }
                        size = i;
                    }
                }
            }
        }
        mo38985K(izVar);
    }

    @vr2
    public String toString() {
        return if0.m52224a(this) + '@' + if0.m52225b(this) + '{' + mo38996q() + '}' + mo31529m();
    }

    /* renamed from: u */
    public final Throwable mo38999u(C5753iz<?> izVar) {
        mo38997s(izVar);
        return izVar.mo38296i1();
    }

    /* renamed from: w */
    public final Throwable mo39000w(E e, C5753iz<?> izVar) {
        mn4 d;
        mo38997s(izVar);
        ec1<E, un4> ec1 = this.f31049a;
        if (ec1 == null || (d = qv2.m63199d(ec1, e, (mn4) null, 2, (Object) null)) == null) {
            return izVar.mo38296i1();
        }
        pw0.m61687a(d, izVar.mo38296i1());
        throw d;
    }

    /* renamed from: y */
    public final void mo39001y(b80<?> b80, E e, C5753iz<?> izVar) {
        Object obj;
        mn4 d;
        mo38997s(izVar);
        Throwable i1 = izVar.mo38296i1();
        ec1<E, un4> ec1 = this.f31049a;
        if (ec1 == null || (d = qv2.m63199d(ec1, e, (mn4) null, 2, (Object) null)) == null) {
            nl3.C6191a aVar = nl3.f32575a;
            obj = pl3.m61423a(i1);
        } else {
            pw0.m61687a(d, i1);
            nl3.C6191a aVar2 = nl3.f32575a;
            obj = pl3.m61423a(d);
        }
        b80.mo31191m0(nl3.m58187b(obj));
    }
}
