package com.onedelhi.secure;

import com.onedelhi.secure.nl3;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\f\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0012\u0004\u0012\u00028\u00000\u0006:\u00014B\u001f\u0012\u0006\u0010\\\u001a\u00020\u0016\u0012\u0006\u0010]\u001a\u00020\u0016\u0012\u0006\u0010F\u001a\u00020E¢\u0006\u0004\b^\u0010_J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\b\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0012\u0010\u0013\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002J9\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00142\u0010\u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002J(\u0010$\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000eH\u0002J\b\u0010%\u001a\u00020\fH\u0002J\u0012\u0010'\u001a\u0004\u0018\u00010\u00112\u0006\u0010&\u001a\u00020\u0003H\u0002J\u0010\u0010(\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u0003H\u0002J\u0012\u0010*\u001a\u0004\u0018\u00010\u00112\u0006\u0010)\u001a\u00020\u000eH\u0002J\u001b\u0010+\u001a\u00020\f2\u0006\u0010&\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b+\u0010,J3\u0010/\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010-0\u00142\u0014\u0010.\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010-0\u0014H\u0002¢\u0006\u0004\b/\u00100J!\u00104\u001a\u0002032\f\u00102\u001a\b\u0012\u0004\u0012\u00028\u000001H@ø\u0001\u0000¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b6\u0010\nJ\u001b\u00107\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b7\u0010\u001cJ\u000f\u00108\u001a\u00020\u000eH\u0000¢\u0006\u0004\b8\u00109J%\u0010;\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010-0\u00142\u0006\u0010:\u001a\u00020\u000eH\u0000¢\u0006\u0004\b;\u0010<J\b\u0010=\u001a\u00020\u0003H\u0014J\u001f\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00142\u0006\u0010>\u001a\u00020\u0016H\u0014¢\u0006\u0004\b?\u0010@J\b\u0010A\u001a\u00020\fH\u0016J&\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00000G2\u0006\u0010C\u001a\u00020B2\u0006\u0010D\u001a\u00020\u00162\u0006\u0010F\u001a\u00020EH\u0016R\u0014\u0010J\u001a\u00020\u000e8BX\u0004¢\u0006\u0006\u001a\u0004\bI\u00109R\u0014\u0010M\u001a\u00020\u00168BX\u0004¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0014\u0010O\u001a\u00020\u00168BX\u0004¢\u0006\u0006\u001a\u0004\bN\u0010LR\u0014\u0010Q\u001a\u00020\u000e8BX\u0004¢\u0006\u0006\u001a\u0004\bP\u00109R\u0014\u0010S\u001a\u00020\u000e8BX\u0004¢\u0006\u0006\u001a\u0004\bR\u00109R\u001a\u0010W\u001a\b\u0012\u0004\u0012\u00028\u00000T8VX\u0004¢\u0006\u0006\u001a\u0004\bU\u0010VR\u001a\u0010[\u001a\u00028\u00008DX\u0004¢\u0006\f\u0012\u0004\bY\u0010Z\u001a\u0004\b\u0001\u0010X\u0002\u0004\n\u0002\b\u0019¨\u0006`"}, d2 = {"Lcom/onedelhi/secure/rx3;", "T", "Lcom/onedelhi/secure/m1;", "Lcom/onedelhi/secure/tx3;", "Lcom/onedelhi/secure/xm2;", "Lcom/onedelhi/secure/mu;", "Lcom/onedelhi/secure/kd1;", "value", "", "a0", "(Ljava/lang/Object;)Z", "b0", "Lcom/onedelhi/secure/un4;", "M", "", "newHead", "J", "", "item", "P", "", "curBuffer", "", "curSize", "newSize", "Z", "([Ljava/lang/Object;II)[Ljava/lang/Object;", "O", "(Ljava/lang/Object;Lcom/onedelhi/secure/b80;)Ljava/lang/Object;", "Lcom/onedelhi/secure/rx3$a;", "emitter", "G", "newReplayIndex", "newMinCollectorIndex", "newBufferEndIndex", "newQueueEndIndex", "e0", "H", "slot", "d0", "c0", "index", "V", "F", "(Lcom/onedelhi/secure/tx3;Lcom/onedelhi/secure/b80;)Ljava/lang/Object;", "Lcom/onedelhi/secure/b80;", "resumesIn", "Q", "([Lcom/onedelhi/secure/b80;)[Lcom/onedelhi/secure/b80;", "Lcom/onedelhi/secure/o81;", "collector", "", "a", "(Lcom/onedelhi/secure/o81;Lcom/onedelhi/secure/b80;)Ljava/lang/Object;", "l", "c", "g0", "()J", "oldIndex", "f0", "(J)[Lcom/onedelhi/secure/b80;", "K", "size", "L", "(I)[Lcom/onedelhi/secure/tx3;", "q", "Lcom/onedelhi/secure/b90;", "context", "capacity", "Lcom/onedelhi/secure/qo;", "onBufferOverflow", "Lcom/onedelhi/secure/m81;", "d", "S", "head", "X", "()I", "replaySize", "Y", "totalSize", "R", "bufferEndIndex", "W", "queueEndIndex", "", "b", "()Ljava/util/List;", "replayCache", "()Ljava/lang/Object;", "getLastReplayedLocked$annotations", "()V", "lastReplayedLocked", "replay", "bufferCapacity", "<init>", "(IILcom/onedelhi/secure/qo;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public class rx3<T> extends C6079m1<tx3> implements xm2<T>, C6142mu<T>, kd1<T> {
    @vr2

    /* renamed from: a */
    public final C6593qo f34785a;
    @ss2

    /* renamed from: a */
    public Object[] f34786a;

    /* renamed from: b */
    public long f34787b;

    /* renamed from: c */
    public long f34788c;

    /* renamed from: p */
    public final int f34789p;

    /* renamed from: q */
    public final int f34790q;

    /* renamed from: r */
    public int f34791r;

    /* renamed from: s */
    public int f34792s;

    @Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B3\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u000e"}, d2 = {"Lcom/onedelhi/secure/rx3$a;", "Lcom/onedelhi/secure/fn0;", "Lcom/onedelhi/secure/un4;", "e", "Lcom/onedelhi/secure/rx3;", "flow", "", "index", "", "value", "Lcom/onedelhi/secure/b80;", "cont", "<init>", "(Lcom/onedelhi/secure/rx3;JLjava/lang/Object;Lcom/onedelhi/secure/b80;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.rx3$a */
    public static final class C6718a implements fn0 {
        @rw1
        @vr2

        /* renamed from: a */
        public final b80<un4> f34793a;
        @rw1
        @vr2

        /* renamed from: a */
        public final rx3<?> f34794a;
        @rw1
        @ss2

        /* renamed from: a */
        public final Object f34795a;
        @rw1

        /* renamed from: b */
        public long f34796b;

        public C6718a(@vr2 rx3<?> rx3, long j, @ss2 Object obj, @vr2 b80<? super un4> b80) {
            this.f34794a = rx3;
            this.f34796b = j;
            this.f34795a = obj;
            this.f34793a = b80;
        }

        /* renamed from: e */
        public void mo30964e() {
            this.f34794a.mo44085G(this);
        }
    }

    @ii2(mo38106k = 3, mo38107mv = {1, 6, 0}, mo38109xi = 48)
    /* renamed from: com.onedelhi.secure.rx3$b */
    public /* synthetic */ class C6719b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f34797a;

        static {
            int[] iArr = new int[C6593qo.values().length];
            iArr[C6593qo.SUSPEND.ordinal()] = 1;
            iArr[C6593qo.DROP_LATEST.ordinal()] = 2;
            iArr[C6593qo.DROP_OLDEST.ordinal()] = 3;
            f34797a = iArr;
        }
    }

    @cf0(mo32326c = "kotlinx.coroutines.flow.SharedFlowImpl", mo32327f = "SharedFlow.kt", mo32328i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2}, mo32329l = {373, 380, 383}, mo32330m = "collect$suspendImpl", mo32331n = {"this", "collector", "slot", "this", "collector", "slot", "collectorJob", "this", "collector", "slot", "collectorJob"}, mo32332s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
    @ii2(mo38106k = 3, mo38107mv = {1, 6, 0}, mo38109xi = 48)
    /* renamed from: com.onedelhi.secure.rx3$c */
    public static final class C6720c extends e80 {

        /* renamed from: a */
        public final /* synthetic */ rx3<T> f34798a;

        /* renamed from: a */
        public Object f34799a;

        /* renamed from: b */
        public Object f34800b;

        /* renamed from: c */
        public Object f34801c;

        /* renamed from: d */
        public Object f34802d;

        /* renamed from: e */
        public /* synthetic */ Object f34803e;

        /* renamed from: n */
        public int f34804n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6720c(rx3<T> rx3, b80<? super C6720c> b80) {
            super(b80);
            this.f34798a = rx3;
        }

        @ss2
        /* renamed from: D */
        public final Object mo22645D(@vr2 Object obj) {
            this.f34803e = obj;
            this.f34804n |= Integer.MIN_VALUE;
            return rx3.m63973I(this.f34798a, (o81) null, this);
        }
    }

    public rx3(int i, int i2, @vr2 C6593qo qoVar) {
        this.f34789p = i;
        this.f34790q = i2;
        this.f34785a = qoVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: com.onedelhi.secure.tx3} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ab A[Catch:{ all -> 0x00d3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c2 A[Catch:{ all -> 0x00d3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ java.lang.Object m63973I(com.onedelhi.secure.rx3 r8, com.onedelhi.secure.o81 r9, com.onedelhi.secure.b80 r10) {
        /*
            boolean r0 = r10 instanceof com.onedelhi.secure.rx3.C6720c
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.onedelhi.secure.rx3$c r0 = (com.onedelhi.secure.rx3.C6720c) r0
            int r1 = r0.f34804n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f34804n = r1
            goto L_0x0018
        L_0x0013:
            com.onedelhi.secure.rx3$c r0 = new com.onedelhi.secure.rx3$c
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f34803e
            java.lang.Object r1 = com.onedelhi.secure.mt1.m57558h()
            int r2 = r0.f34804n
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0075
            if (r2 == r5) goto L_0x005e
            if (r2 == r4) goto L_0x004a
            if (r2 != r3) goto L_0x0042
            java.lang.Object r8 = r0.f34802d
            com.onedelhi.secure.ru1 r8 = (com.onedelhi.secure.ru1) r8
            java.lang.Object r9 = r0.f34801c
            com.onedelhi.secure.tx3 r9 = (com.onedelhi.secure.tx3) r9
            java.lang.Object r2 = r0.f34800b
            com.onedelhi.secure.o81 r2 = (com.onedelhi.secure.o81) r2
            java.lang.Object r5 = r0.f34799a
            com.onedelhi.secure.rx3 r5 = (com.onedelhi.secure.rx3) r5
        L_0x003b:
            com.onedelhi.secure.pl3.m61436n(r10)     // Catch:{ all -> 0x005b }
            r10 = r2
            r2 = r8
            r8 = r5
            goto L_0x00a3
        L_0x0042:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x004a:
            java.lang.Object r8 = r0.f34802d
            com.onedelhi.secure.ru1 r8 = (com.onedelhi.secure.ru1) r8
            java.lang.Object r9 = r0.f34801c
            com.onedelhi.secure.tx3 r9 = (com.onedelhi.secure.tx3) r9
            java.lang.Object r2 = r0.f34800b
            com.onedelhi.secure.o81 r2 = (com.onedelhi.secure.o81) r2
            java.lang.Object r5 = r0.f34799a
            com.onedelhi.secure.rx3 r5 = (com.onedelhi.secure.rx3) r5
            goto L_0x003b
        L_0x005b:
            r8 = move-exception
            goto L_0x00db
        L_0x005e:
            java.lang.Object r8 = r0.f34801c
            r9 = r8
            com.onedelhi.secure.tx3 r9 = (com.onedelhi.secure.tx3) r9
            java.lang.Object r8 = r0.f34800b
            com.onedelhi.secure.o81 r8 = (com.onedelhi.secure.o81) r8
            java.lang.Object r2 = r0.f34799a
            com.onedelhi.secure.rx3 r2 = (com.onedelhi.secure.rx3) r2
            com.onedelhi.secure.pl3.m61436n(r10)     // Catch:{ all -> 0x0071 }
            r10 = r8
            r8 = r2
            goto L_0x0097
        L_0x0071:
            r8 = move-exception
            r5 = r2
            goto L_0x00db
        L_0x0075:
            com.onedelhi.secure.pl3.m61436n(r10)
            com.onedelhi.secure.o1 r10 = r8.mo40416h()
            com.onedelhi.secure.tx3 r10 = (com.onedelhi.secure.tx3) r10
            boolean r2 = r9 instanceof com.onedelhi.secure.l64     // Catch:{ all -> 0x00d7 }
            if (r2 == 0) goto L_0x0094
            r2 = r9
            com.onedelhi.secure.l64 r2 = (com.onedelhi.secure.l64) r2     // Catch:{ all -> 0x00d7 }
            r0.f34799a = r8     // Catch:{ all -> 0x00d7 }
            r0.f34800b = r9     // Catch:{ all -> 0x00d7 }
            r0.f34801c = r10     // Catch:{ all -> 0x00d7 }
            r0.f34804n = r5     // Catch:{ all -> 0x00d7 }
            java.lang.Object r2 = r2.mo39677a(r0)     // Catch:{ all -> 0x00d7 }
            if (r2 != r1) goto L_0x0094
            return r1
        L_0x0094:
            r7 = r10
            r10 = r9
            r9 = r7
        L_0x0097:
            com.onedelhi.secure.b90 r2 = r0.mo31187f()     // Catch:{ all -> 0x00d3 }
            com.onedelhi.secure.ru1$b r5 = com.onedelhi.secure.ru1.f34751a     // Catch:{ all -> 0x00d3 }
            com.onedelhi.secure.b90$b r2 = r2.get(r5)     // Catch:{ all -> 0x00d3 }
            com.onedelhi.secure.ru1 r2 = (com.onedelhi.secure.ru1) r2     // Catch:{ all -> 0x00d3 }
        L_0x00a3:
            java.lang.Object r5 = r8.mo44104d0(r9)     // Catch:{ all -> 0x00d3 }
            com.onedelhi.secure.l84 r6 = com.onedelhi.secure.sx3.f35242a     // Catch:{ all -> 0x00d3 }
            if (r5 == r6) goto L_0x00c2
            if (r2 != 0) goto L_0x00ae
            goto L_0x00b1
        L_0x00ae:
            com.onedelhi.secure.xu1.m70804A(r2)     // Catch:{ all -> 0x00d3 }
        L_0x00b1:
            r0.f34799a = r8     // Catch:{ all -> 0x00d3 }
            r0.f34800b = r10     // Catch:{ all -> 0x00d3 }
            r0.f34801c = r9     // Catch:{ all -> 0x00d3 }
            r0.f34802d = r2     // Catch:{ all -> 0x00d3 }
            r0.f34804n = r3     // Catch:{ all -> 0x00d3 }
            java.lang.Object r5 = r10.mo31452c(r5, r0)     // Catch:{ all -> 0x00d3 }
            if (r5 != r1) goto L_0x00a3
            return r1
        L_0x00c2:
            r0.f34799a = r8     // Catch:{ all -> 0x00d3 }
            r0.f34800b = r10     // Catch:{ all -> 0x00d3 }
            r0.f34801c = r9     // Catch:{ all -> 0x00d3 }
            r0.f34802d = r2     // Catch:{ all -> 0x00d3 }
            r0.f34804n = r4     // Catch:{ all -> 0x00d3 }
            java.lang.Object r5 = r8.mo44084F(r9, r0)     // Catch:{ all -> 0x00d3 }
            if (r5 != r1) goto L_0x00a3
            return r1
        L_0x00d3:
            r10 = move-exception
            r5 = r8
            r8 = r10
            goto L_0x00db
        L_0x00d7:
            r9 = move-exception
            r5 = r8
            r8 = r9
            r9 = r10
        L_0x00db:
            r5.mo40418m(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.rx3.m63973I(com.onedelhi.secure.rx3, com.onedelhi.secure.o81, com.onedelhi.secure.b80):java.lang.Object");
    }

    /* renamed from: N */
    public static /* synthetic */ Object m63974N(rx3 rx3, Object obj, b80 b80) {
        if (rx3.mo34785l(obj)) {
            return un4.f36206a;
        }
        Object O = rx3.mo44091O(obj, b80);
        return O == mt1.m57558h() ? O : un4.f36206a;
    }

    /* access modifiers changed from: private */
    /* renamed from: S */
    public final long m63975S() {
        return Math.min(this.f34788c, this.f34787b);
    }

    /* renamed from: U */
    public static /* synthetic */ void m63976U() {
    }

    /* renamed from: F */
    public final Object mo44084F(tx3 tx3, b80<? super un4> b80) {
        un4 un4;
        C5847ju juVar = new C5847ju(lt1.m56482d(b80), 1);
        juVar.mo38234T();
        synchronized (this) {
            if (mo44103c0(tx3) < 0) {
                tx3.f35835a = juVar;
            } else {
                nl3.C6191a aVar = nl3.f32575a;
                juVar.mo31191m0(nl3.m58187b(un4.f36206a));
            }
            un4 = un4.f36206a;
        }
        Object A = juVar.mo38880A();
        if (A == mt1.m57558h()) {
            hf0.m50483c(b80);
        }
        return A == mt1.m57558h() ? A : un4;
    }

    /* renamed from: G */
    public final void mo44085G(C6718a aVar) {
        synchronized (this) {
            if (aVar.f34796b >= m63975S()) {
                Object[] objArr = this.f34786a;
                jt1.m53774m(objArr);
                if (sx3.m64947f(objArr, aVar.f34796b) == aVar) {
                    sx3.m64949h(objArr, aVar.f34796b, sx3.f35242a);
                    mo44086H();
                    un4 un4 = un4.f36206a;
                }
            }
        }
    }

    /* renamed from: H */
    public final void mo44086H() {
        if (this.f34790q != 0 || this.f34792s > 1) {
            Object[] objArr = this.f34786a;
            jt1.m53774m(objArr);
            while (this.f34792s > 0 && sx3.m64947f(objArr, (m63975S() + ((long) mo44099Y())) - 1) == sx3.f35242a) {
                this.f34792s--;
                sx3.m64949h(objArr, m63975S() + ((long) mo44099Y()), (Object) null);
            }
        }
    }

    /* renamed from: J */
    public final void mo44087J(long j) {
        C6239o1[] g;
        if (!(this.f31972n == 0 || (g = this.f31971a) == null)) {
            int i = 0;
            int length = g.length;
            while (i < length) {
                C6239o1 o1Var = g[i];
                i++;
                if (o1Var != null) {
                    tx3 tx3 = (tx3) o1Var;
                    long j2 = tx3.f35834a;
                    if (j2 >= 0 && j2 < j) {
                        tx3.f35834a = j;
                    }
                }
            }
        }
        this.f34788c = j;
    }

    @vr2
    /* renamed from: K */
    public tx3 mo34783i() {
        return new tx3();
    }

    @vr2
    /* renamed from: L */
    public tx3[] mo34784j(int i) {
        return new tx3[i];
    }

    /* renamed from: M */
    public final void mo44090M() {
        Object[] objArr = this.f34786a;
        jt1.m53774m(objArr);
        sx3.m64949h(objArr, m63975S(), (Object) null);
        this.f34791r--;
        long S = m63975S() + 1;
        if (this.f34787b < S) {
            this.f34787b = S;
        }
        if (this.f34788c < S) {
            mo44087J(S);
        }
    }

    /* renamed from: O */
    public final Object mo44091O(T t, b80<? super un4> b80) {
        b80<un4>[] b80Arr;
        C6718a aVar;
        C5847ju juVar = new C5847ju(lt1.m56482d(b80), 1);
        juVar.mo38234T();
        b80<un4>[] b80Arr2 = C6163n1.f32338a;
        synchronized (this) {
            if (mo44101a0(t)) {
                nl3.C6191a aVar2 = nl3.f32575a;
                juVar.mo31191m0(nl3.m58187b(un4.f36206a));
                b80Arr = mo44093Q(b80Arr2);
                aVar = null;
            } else {
                C6718a aVar3 = new C6718a(this, ((long) mo44099Y()) + m63975S(), t, juVar);
                mo44092P(aVar3);
                this.f34792s = this.f34792s + 1;
                if (this.f34790q == 0) {
                    b80Arr2 = mo44093Q(b80Arr2);
                }
                b80Arr = b80Arr2;
                aVar = aVar3;
            }
        }
        if (aVar != null) {
            C6057lu.m56508a(juVar, aVar);
        }
        int i = 0;
        int length = b80Arr.length;
        while (i < length) {
            b80<un4> b802 = b80Arr[i];
            i++;
            if (b802 != null) {
                nl3.C6191a aVar4 = nl3.f32575a;
                b802.mo31191m0(nl3.m58187b(un4.f36206a));
            }
        }
        Object A = juVar.mo38880A();
        if (A == mt1.m57558h()) {
            hf0.m50483c(b80);
        }
        return A == mt1.m57558h() ? A : un4.f36206a;
    }

    /* renamed from: P */
    public final void mo44092P(Object obj) {
        int Y = mo44099Y();
        Object[] objArr = this.f34786a;
        if (objArr == null) {
            objArr = mo44100Z((Object[]) null, 0, 2);
        } else if (Y >= objArr.length) {
            objArr = mo44100Z(objArr, Y, objArr.length * 2);
        }
        sx3.m64949h(objArr, m63975S() + ((long) Y), obj);
    }

    /* JADX WARNING: type inference failed for: r12v6, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0011, code lost:
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0011, code lost:
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        r4 = (com.onedelhi.secure.tx3) r4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: Q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.onedelhi.secure.b80<com.onedelhi.secure.un4>[] mo44093Q(com.onedelhi.secure.b80<com.onedelhi.secure.un4>[] r12) {
        /*
            r11 = this;
            int r0 = r12.length
            int r1 = r11.f31972n
            if (r1 != 0) goto L_0x0008
            goto L_0x004b
        L_0x0008:
            com.onedelhi.secure.o1[] r1 = r11.f31971a
            if (r1 != 0) goto L_0x000f
            goto L_0x004b
        L_0x000f:
            r2 = 0
            int r3 = r1.length
        L_0x0011:
            if (r2 >= r3) goto L_0x004b
            r4 = r1[r2]
            int r2 = r2 + 1
            if (r4 == 0) goto L_0x0011
            com.onedelhi.secure.tx3 r4 = (com.onedelhi.secure.tx3) r4
            com.onedelhi.secure.b80<? super com.onedelhi.secure.un4> r5 = r4.f35835a
            if (r5 != 0) goto L_0x0020
            goto L_0x0011
        L_0x0020:
            long r6 = r11.mo44103c0(r4)
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 >= 0) goto L_0x002b
            goto L_0x0011
        L_0x002b:
            int r6 = r12.length
            if (r0 < r6) goto L_0x003f
            int r6 = r12.length
            r7 = 2
            int r6 = r6 * 2
            int r6 = java.lang.Math.max(r7, r6)
            java.lang.Object[] r12 = java.util.Arrays.copyOf(r12, r6)
            java.lang.String r6 = "copyOf(this, newSize)"
            com.onedelhi.secure.jt1.m53776o(r12, r6)
        L_0x003f:
            r6 = r12
            com.onedelhi.secure.b80[] r6 = (com.onedelhi.secure.b80[]) r6
            int r7 = r0 + 1
            r6[r0] = r5
            r0 = 0
            r4.f35835a = r0
            r0 = r7
            goto L_0x0011
        L_0x004b:
            com.onedelhi.secure.b80[] r12 = (com.onedelhi.secure.b80[]) r12
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.rx3.mo44093Q(com.onedelhi.secure.b80[]):com.onedelhi.secure.b80[]");
    }

    /* renamed from: R */
    public final long mo44094R() {
        return m63975S() + ((long) this.f34791r);
    }

    /* renamed from: T */
    public final T mo44095T() {
        Object[] objArr = this.f34786a;
        jt1.m53774m(objArr);
        return sx3.m64947f(objArr, (this.f34787b + ((long) mo44098X())) - 1);
    }

    /* renamed from: V */
    public final Object mo44096V(long j) {
        Object[] objArr = this.f34786a;
        jt1.m53774m(objArr);
        Object c = sx3.m64947f(objArr, j);
        return c instanceof C6718a ? ((C6718a) c).f34795a : c;
    }

    /* renamed from: W */
    public final long mo44097W() {
        return m63975S() + ((long) this.f34791r) + ((long) this.f34792s);
    }

    /* renamed from: X */
    public final int mo44098X() {
        return (int) ((m63975S() + ((long) this.f34791r)) - this.f34787b);
    }

    /* renamed from: Y */
    public final int mo44099Y() {
        return this.f34791r + this.f34792s;
    }

    /* renamed from: Z */
    public final Object[] mo44100Z(Object[] objArr, int i, int i2) {
        if (i2 > 0) {
            Object[] objArr2 = new Object[i2];
            this.f34786a = objArr2;
            if (objArr == null) {
                return objArr2;
            }
            long S = m63975S();
            for (int i3 = 0; i3 < i; i3++) {
                long j = ((long) i3) + S;
                sx3.m64949h(objArr2, j, sx3.m64947f(objArr, j));
            }
            return objArr2;
        }
        throw new IllegalStateException("Buffer size overflow".toString());
    }

    @ss2
    /* renamed from: a */
    public Object mo31451a(@vr2 o81<? super T> o81, @vr2 b80<?> b80) {
        return m63973I(this, o81, b80);
    }

    /* renamed from: a0 */
    public final boolean mo44101a0(T t) {
        if (mo40419n() == 0) {
            return mo44102b0(t);
        }
        if (this.f34791r >= this.f34790q && this.f34788c <= this.f34787b) {
            int i = C6719b.f34797a[this.f34785a.ordinal()];
            if (i == 1) {
                return false;
            }
            if (i == 2) {
                return true;
            }
        }
        mo44092P(t);
        int i2 = this.f34791r + 1;
        this.f34791r = i2;
        if (i2 > this.f34790q) {
            mo44090M();
        }
        if (mo44098X() > this.f34789p) {
            mo44105e0(this.f34787b + 1, this.f34788c, mo44094R(), mo44097W());
        }
        return true;
    }

    @vr2
    /* renamed from: b */
    public List<T> mo34780b() {
        synchronized (this) {
            int X = mo44098X();
            if (X == 0) {
                List<T> F = s00.m64037F();
                return F;
            }
            ArrayList arrayList = new ArrayList(X);
            Object[] objArr = this.f34786a;
            jt1.m53774m(objArr);
            int i = 0;
            while (i < X) {
                int i2 = i + 1;
                arrayList.add(sx3.m64947f(objArr, this.f34787b + ((long) i)));
                i = i2;
            }
            return arrayList;
        }
    }

    /* renamed from: b0 */
    public final boolean mo44102b0(T t) {
        if (this.f34789p == 0) {
            return true;
        }
        mo44092P(t);
        int i = this.f34791r + 1;
        this.f34791r = i;
        if (i > this.f34789p) {
            mo44090M();
        }
        this.f34788c = m63975S() + ((long) this.f34791r);
        return true;
    }

    @ss2
    /* renamed from: c */
    public Object mo31452c(T t, @vr2 b80<? super un4> b80) {
        return m63974N(this, t, b80);
    }

    /* renamed from: c0 */
    public final long mo44103c0(tx3 tx3) {
        long j = tx3.f35834a;
        if (j < mo44094R()) {
            return j;
        }
        if (this.f34790q <= 0 && j <= m63975S() && this.f34792s != 0) {
            return j;
        }
        return -1;
    }

    @vr2
    /* renamed from: d */
    public m81<T> mo34781d(@vr2 b90 b90, int i, @vr2 C6593qo qoVar) {
        return sx3.m64946e(this, b90, i, qoVar);
    }

    /* renamed from: d0 */
    public final Object mo44104d0(tx3 tx3) {
        Object obj;
        b80<un4>[] b80Arr = C6163n1.f32338a;
        synchronized (this) {
            long c0 = mo44103c0(tx3);
            if (c0 < 0) {
                obj = sx3.f35242a;
            } else {
                long j = tx3.f35834a;
                Object V = mo44096V(c0);
                tx3.f35834a = c0 + 1;
                Object obj2 = V;
                b80Arr = mo44106f0(j);
                obj = obj2;
            }
        }
        int i = 0;
        int length = b80Arr.length;
        while (i < length) {
            b80<un4> b80 = b80Arr[i];
            i++;
            if (b80 != null) {
                nl3.C6191a aVar = nl3.f32575a;
                b80.mo31191m0(nl3.m58187b(un4.f36206a));
            }
        }
        return obj;
    }

    /* renamed from: e0 */
    public final void mo44105e0(long j, long j2, long j3, long j4) {
        long j5 = j;
        long j6 = j2;
        long min = Math.min(j6, j);
        for (long S = m63975S(); S < min; S = 1 + S) {
            Object[] objArr = this.f34786a;
            jt1.m53774m(objArr);
            sx3.m64949h(objArr, S, (Object) null);
        }
        this.f34787b = j5;
        this.f34788c = j6;
        this.f34791r = (int) (j3 - min);
        this.f34792s = (int) (j4 - j3);
    }

    @vr2
    /* renamed from: f0 */
    public final b80<un4>[] mo44106f0(long j) {
        long j2;
        C6239o1[] g;
        if (j > this.f34788c) {
            return C6163n1.f32338a;
        }
        long S = m63975S();
        long j3 = ((long) this.f34791r) + S;
        long j4 = 1;
        if (this.f34790q == 0 && this.f34792s > 0) {
            j3++;
        }
        if (!(this.f31972n == 0 || (g = this.f31971a) == null)) {
            int length = g.length;
            int i = 0;
            while (i < length) {
                C6239o1 o1Var = g[i];
                i++;
                if (o1Var != null) {
                    long j5 = ((tx3) o1Var).f35834a;
                    if (j5 >= 0 && j5 < j3) {
                        j3 = j5;
                    }
                }
            }
        }
        if (j3 <= this.f34788c) {
            return C6163n1.f32338a;
        }
        long R = mo44094R();
        int min = mo40419n() > 0 ? Math.min(this.f34792s, this.f34790q - ((int) (R - j3))) : this.f34792s;
        b80<un4>[] b80Arr = C6163n1.f32338a;
        long j6 = ((long) this.f34792s) + R;
        if (min > 0) {
            b80Arr = new b80[min];
            Object[] objArr = this.f34786a;
            jt1.m53774m(objArr);
            long j7 = R;
            int i2 = 0;
            while (true) {
                if (R >= j6) {
                    j2 = j3;
                    break;
                }
                long j8 = R + j4;
                Object c = sx3.m64947f(objArr, R);
                l84 l84 = sx3.f35242a;
                if (c != l84) {
                    Objects.requireNonNull(c, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    C6718a aVar = (C6718a) c;
                    int i3 = i2 + 1;
                    j2 = j3;
                    b80Arr[i2] = aVar.f34793a;
                    sx3.m64949h(objArr, R, l84);
                    long j9 = j7;
                    sx3.m64949h(objArr, j9, aVar.f34795a);
                    j7 = j9 + 1;
                    if (i3 >= min) {
                        break;
                    }
                    i2 = i3;
                    R = j8;
                    j3 = j2;
                } else {
                    long j10 = j7;
                    R = j8;
                }
                j4 = 1;
            }
            R = j7;
        } else {
            j2 = j3;
        }
        int i4 = (int) (R - S);
        long j11 = mo40419n() == 0 ? R : j2;
        long max = Math.max(this.f34787b, R - ((long) Math.min(this.f34789p, i4)));
        if (this.f34790q == 0 && max < j6) {
            Object[] objArr2 = this.f34786a;
            jt1.m53774m(objArr2);
            if (jt1.m53768g(sx3.m64947f(objArr2, max), sx3.f35242a)) {
                R++;
                max++;
            }
        }
        mo44105e0(max, j11, R, j6);
        mo44086H();
        return (b80Arr.length == 0) ^ true ? mo44093Q(b80Arr) : b80Arr;
    }

    /* renamed from: g0 */
    public final long mo44107g0() {
        long j = this.f34787b;
        if (j < this.f34788c) {
            this.f34788c = j;
        }
        return j;
    }

    /* renamed from: l */
    public boolean mo34785l(T t) {
        int i;
        boolean z;
        b80<un4>[] b80Arr = C6163n1.f32338a;
        synchronized (this) {
            i = 0;
            if (mo44101a0(t)) {
                b80Arr = mo44093Q(b80Arr);
                z = true;
            } else {
                z = false;
            }
        }
        int length = b80Arr.length;
        while (i < length) {
            b80<un4> b80 = b80Arr[i];
            i++;
            if (b80 != null) {
                nl3.C6191a aVar = nl3.f32575a;
                b80.mo31191m0(nl3.m58187b(un4.f36206a));
            }
        }
        return z;
    }

    /* renamed from: q */
    public void mo34786q() {
        synchronized (this) {
            mo44105e0(mo44094R(), this.f34788c, mo44094R(), mo44097W());
            un4 un4 = un4.f36206a;
        }
    }
}
