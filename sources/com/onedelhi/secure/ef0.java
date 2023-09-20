package com.onedelhi.secure;

import com.onedelhi.secure.nl3;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\"\n\u0002\b\u0018\bÀ\u0002\u0018\u00002\u00020\u0001:\u0002\u0001B\n\b\u0002¢\u0006\u0005\b\u0001\u0010\bJ\u001d\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ;\u0010\u0013\u001a\u00020\u0004*\u00020\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0\u000b2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J@\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\"\b\b\u0000\u0010\u0015*\u00020\u00012\u001e\b\u0004\u0010\u0019\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0017\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00028\u00000\u0016H\b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u0011*\u00020\u0001H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u0017H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J%\u0010'\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u001aH\u0002¢\u0006\u0004\b'\u0010(J5\u0010-\u001a\b\u0012\u0004\u0012\u00020%0\u001a2\u0006\u0010)\u001a\u00020\u00112\b\u0010+\u001a\u0004\u0018\u00010*2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020%0\u001aH\u0002¢\u0006\u0004\b-\u0010.J?\u00104\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020/032\u0006\u00100\u001a\u00020/2\f\u00102\u001a\b\u0012\u0004\u0012\u00020%012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020%0\u001aH\u0002¢\u0006\u0004\b4\u00105J3\u00107\u001a\u00020/2\u0006\u00106\u001a\u00020/2\f\u00102\u001a\b\u0012\u0004\u0012\u00020%012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020%0\u001aH\u0002¢\u0006\u0004\b7\u00108J#\u0010;\u001a\u00020\u00042\n\u0010:\u001a\u0006\u0012\u0002\b\u0003092\u0006\u0010)\u001a\u00020\u0011H\u0002¢\u0006\u0004\b;\u0010<J\u001f\u0010\u0015\u001a\u00020\u00042\u0006\u0010:\u001a\u00020=2\u0006\u0010)\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010>J\u0016\u0010?\u001a\u0004\u0018\u00010=*\u00020=H\u0010¢\u0006\u0004\b?\u0010@J/\u0010B\u001a\u00020\u00042\n\u0010A\u001a\u0006\u0012\u0002\b\u00030\u00172\n\u0010:\u001a\u0006\u0012\u0002\b\u0003092\u0006\u0010)\u001a\u00020\u0011H\u0002¢\u0006\u0004\bB\u0010CJ\u001d\u0010D\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0017*\u0006\u0012\u0002\b\u000309H\u0002¢\u0006\u0004\bD\u0010EJ\u001a\u0010F\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0017*\u00020=H\u0010¢\u0006\u0004\bF\u0010GJ\u001b\u0010I\u001a\u0004\u0018\u00010H*\b\u0012\u0004\u0012\u00020%0\u001aH\u0002¢\u0006\u0004\bI\u0010JJ3\u0010L\u001a\b\u0012\u0004\u0012\u00028\u000009\"\u0004\b\u0000\u0010B2\f\u0010K\u001a\b\u0012\u0004\u0012\u00028\u0000092\b\u0010:\u001a\u0004\u0018\u00010HH\u0002¢\u0006\u0004\bL\u0010MJ\u001b\u0010N\u001a\u00020\u00042\n\u0010A\u001a\u0006\u0012\u0002\b\u00030\u0017H\u0002¢\u0006\u0004\bN\u0010OJ'\u0010R\u001a\b\u0012\u0004\u0012\u00020%0\u001a\"\b\b\u0000\u0010B*\u00020P2\u0006\u0010Q\u001a\u00028\u0000H\u0002¢\u0006\u0004\bR\u0010SJ\r\u0010T\u001a\u00020\u0004¢\u0006\u0004\bT\u0010\bJ\r\u0010U\u001a\u00020\u0004¢\u0006\u0004\bU\u0010\bJ\u0015\u0010W\u001a\u00020\u00112\u0006\u0010V\u001a\u00020\n¢\u0006\u0004\bW\u0010XJ\u0013\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u000101¢\u0006\u0004\bY\u0010ZJ\u0015\u0010]\u001a\u00020\u00112\u0006\u0010\\\u001a\u00020[¢\u0006\u0004\b]\u0010^J\u0013\u0010_\u001a\b\u0012\u0004\u0012\u00020[0\u001a¢\u0006\u0004\b_\u0010`J\u0013\u0010b\u001a\b\u0012\u0004\u0012\u00020a0\u001a¢\u0006\u0004\bb\u0010`J\u0015\u0010c\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\bc\u0010$J)\u0010d\u001a\b\u0012\u0004\u0012\u00020%0\u001a2\u0006\u0010\\\u001a\u00020[2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020%0\u001a¢\u0006\u0004\bd\u0010eJ\u001b\u0010f\u001a\u00020\u00042\n\u0010:\u001a\u0006\u0012\u0002\b\u000309H\u0000¢\u0006\u0004\bf\u0010gJ\u001b\u0010h\u001a\u00020\u00042\n\u0010:\u001a\u0006\u0012\u0002\b\u000309H\u0000¢\u0006\u0004\bh\u0010gJ)\u0010i\u001a\b\u0012\u0004\u0012\u00028\u000009\"\u0004\b\u0000\u0010B2\f\u0010K\u001a\b\u0012\u0004\u0012\u00028\u000009H\u0000¢\u0006\u0004\bi\u0010jR\u001e\u0010n\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00170k8BX\u0004¢\u0006\u0006\u001a\u0004\bl\u0010mR\u001e\u0010r\u001a\u00020\u0011*\u00020\n8BX\u0004¢\u0006\f\u0012\u0004\bp\u0010q\u001a\u0004\bo\u0010XR\u0018\u0010u\u001a\u00020\u0003*\u00020%8BX\u0004¢\u0006\u0006\u001a\u0004\bs\u0010tR\u0014\u0010x\u001a\u00020\u00038@X\u0004¢\u0006\u0006\u001a\u0004\bv\u0010wR\"\u0010y\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\by\u0010z\u001a\u0004\b{\u0010w\"\u0004\b|\u0010}R#\u0010~\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0013\n\u0004\b~\u0010z\u001a\u0004\b\u0010w\"\u0005\b\u0001\u0010}¨\u0006\u0001"}, d2 = {"Lcom/onedelhi/secure/ef0;", "", "Lkotlin/Function1;", "", "Lcom/onedelhi/secure/un4;", "t", "()Lcom/onedelhi/secure/ec1;", "M", "()V", "N", "Lcom/onedelhi/secure/ru1;", "", "Lcom/onedelhi/secure/xe0;", "map", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "builder", "", "indent", "d", "(Lcom/onedelhi/secure/ru1;Ljava/util/Map;Ljava/lang/StringBuilder;Ljava/lang/String;)V", "R", "Lkotlin/Function2;", "Lcom/onedelhi/secure/ef0$a;", "Lcom/onedelhi/secure/b90;", "create", "", "i", "(Lcom/onedelhi/secure/sc1;)Ljava/util/List;", "P", "(Ljava/lang/Object;)Ljava/lang/String;", "y", "(Lcom/onedelhi/secure/ef0$a;)Z", "Ljava/io/PrintStream;", "out", "j", "(Ljava/io/PrintStream;)V", "Ljava/lang/StackTraceElement;", "frames", "D", "(Ljava/io/PrintStream;Ljava/util/List;)V", "state", "Ljava/lang/Thread;", "thread", "coroutineTrace", "n", "(Ljava/lang/String;Ljava/lang/Thread;Ljava/util/List;)Ljava/util/List;", "", "indexOfResumeWith", "", "actualTrace", "Lcom/onedelhi/secure/ey2;", "o", "(I[Ljava/lang/StackTraceElement;Ljava/util/List;)Lcom/onedelhi/secure/ey2;", "frameIndex", "p", "(I[Ljava/lang/StackTraceElement;Ljava/util/List;)I", "Lcom/onedelhi/secure/b80;", "frame", "S", "(Lcom/onedelhi/secure/b80;Ljava/lang/String;)V", "Lcom/onedelhi/secure/p90;", "(Lcom/onedelhi/secure/p90;Ljava/lang/String;)V", "I", "(Lcom/onedelhi/secure/p90;)Lcom/onedelhi/secure/p90;", "owner", "T", "(Lcom/onedelhi/secure/ef0$a;Lcom/onedelhi/secure/b80;Ljava/lang/String;)V", "B", "(Lcom/onedelhi/secure/b80;)Lcom/onedelhi/secure/ef0$a;", "C", "(Lcom/onedelhi/secure/p90;)Lcom/onedelhi/secure/ef0$a;", "Lcom/onedelhi/secure/h24;", "O", "(Ljava/util/List;)Lcom/onedelhi/secure/h24;", "completion", "e", "(Lcom/onedelhi/secure/b80;Lcom/onedelhi/secure/h24;)Lcom/onedelhi/secure/b80;", "E", "(Lcom/onedelhi/secure/ef0$a;)V", "", "throwable", "J", "(Ljava/lang/Throwable;)Ljava/util/List;", "x", "Q", "job", "w", "(Lcom/onedelhi/secure/ru1;)Ljava/lang/String;", "h", "()[Ljava/lang/Object;", "Lcom/onedelhi/secure/we0;", "info", "m", "(Lcom/onedelhi/secure/we0;)Ljava/lang/String;", "g", "()Ljava/util/List;", "Lcom/onedelhi/secure/kf0;", "k", "f", "l", "(Lcom/onedelhi/secure/we0;Ljava/util/List;)Ljava/util/List;", "G", "(Lcom/onedelhi/secure/b80;)V", "H", "F", "(Lcom/onedelhi/secure/b80;)Lcom/onedelhi/secure/b80;", "", "q", "()Ljava/util/Set;", "capturedCoroutines", "r", "getDebugString$annotations", "(Lcom/onedelhi/secure/ru1;)V", "debugString", "A", "(Ljava/lang/StackTraceElement;)Z", "isInternalMethod", "z", "()Z", "isInstalled", "sanitizeStackTraces", "Z", "v", "L", "(Z)V", "enableCreationStackTraces", "u", "K", "<init>", "a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class ef0 {
    @ss2

    /* renamed from: a */
    public static final ec1<Boolean, un4> f27860a;
    @vr2

    /* renamed from: a */
    public static final ef0 f27861a;
    @vr2

    /* renamed from: a */
    public static final /* synthetic */ ff0 f27862a = new ff0(0);
    @vr2

    /* renamed from: a */
    public static final l40<C5125a<?>, Boolean> f27863a = new l40<>(false, 1, (wg0) null);
    @vr2

    /* renamed from: a */
    public static final String f27864a = "Coroutine creation stacktrace";
    @ss2

    /* renamed from: a */
    public static Thread f27865a;
    @vr2

    /* renamed from: a */
    public static final SimpleDateFormat f27866a = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

    /* renamed from: a */
    public static final /* synthetic */ AtomicLongFieldUpdater f27867a = AtomicLongFieldUpdater.newUpdater(ff0.class, "sequenceNumber");
    @vr2

    /* renamed from: a */
    public static final ReentrantReadWriteLock f27868a = new ReentrantReadWriteLock();

    /* renamed from: a */
    public static boolean f27869a = true;
    @vr2

    /* renamed from: b */
    public static final l40<p90, xe0> f27870b = new l40<>(true);

    /* renamed from: b */
    public static boolean f27871b = true;
    private static volatile int installations;

    @Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B'\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J \u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\b\u0010\f\u001a\u00020\u000bH\u0016R\u0014\u0010\u0010\u001a\u00020\r8\u0016X\u0005¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/onedelhi/secure/ef0$a;", "T", "Lcom/onedelhi/secure/b80;", "Lcom/onedelhi/secure/p90;", "Ljava/lang/StackTraceElement;", "P", "Lcom/onedelhi/secure/nl3;", "result", "Lcom/onedelhi/secure/un4;", "m0", "(Ljava/lang/Object;)V", "", "toString", "Lcom/onedelhi/secure/b90;", "f", "()Lcom/onedelhi/secure/b90;", "context", "i", "()Lcom/onedelhi/secure/p90;", "callerFrame", "delegate", "Lcom/onedelhi/secure/xe0;", "info", "frame", "<init>", "(Lcom/onedelhi/secure/b80;Lcom/onedelhi/secure/xe0;Lcom/onedelhi/secure/p90;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.ef0$a */
    public static final class C5125a<T> implements b80<T>, p90 {
        @rw1
        @vr2

        /* renamed from: a */
        public final b80<T> f27872a;
        @ss2

        /* renamed from: a */
        public final p90 f27873a;
        @rw1
        @vr2

        /* renamed from: a */
        public final xe0 f27874a;

        public C5125a(@vr2 b80<? super T> b80, @vr2 xe0 xe0, @ss2 p90 p90) {
            this.f27872a = b80;
            this.f27874a = xe0;
            this.f27873a = p90;
        }

        @ss2
        /* renamed from: P */
        public StackTraceElement mo35201P() {
            p90 p90 = this.f27873a;
            if (p90 == null) {
                return null;
            }
            return p90.mo35201P();
        }

        @vr2
        /* renamed from: f */
        public b90 mo31187f() {
            return this.f27872a.mo31187f();
        }

        @ss2
        /* renamed from: i */
        public p90 mo35202i() {
            p90 p90 = this.f27873a;
            if (p90 == null) {
                return null;
            }
            return p90.mo35202i();
        }

        /* renamed from: m0 */
        public void mo31191m0(@vr2 Object obj) {
            ef0.f27861a.mo35163E(this);
            this.f27872a.mo31191m0(obj);
        }

        @vr2
        public String toString() {
            return this.f27872a.toString();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "R", "Lcom/onedelhi/secure/ef0$a;", "owner", "a", "(Lcom/onedelhi/secure/ef0$a;)Ljava/lang/Object;", "com/onedelhi/secure/ef0$c"}, k = 3, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.ef0$b */
    public static final class C5126b extends d12 implements ec1<C5125a<?>, we0> {
        public C5126b() {
            super(1);
        }

        @ss2
        /* renamed from: a */
        public final we0 mo17094X(@vr2 C5125a<?> aVar) {
            b90 c;
            if (!ef0.f27861a.mo35199y(aVar) && (c = aVar.f27874a.mo47129c()) != null) {
                return new we0(aVar.f27874a, c);
            }
            return null;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "R", "Lcom/onedelhi/secure/ef0$a;", "owner", "a", "(Lcom/onedelhi/secure/ef0$a;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.ef0$c */
    public static final class C5127c extends d12 implements ec1<C5125a<?>, R> {

        /* renamed from: a */
        public final /* synthetic */ sc1<C5125a<?>, b90, R> f27875a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5127c(sc1<? super C5125a<?>, ? super b90, ? extends R> sc1) {
            super(1);
            this.f27875a = sc1;
        }

        @ss2
        /* renamed from: a */
        public final R mo17094X(@vr2 C5125a<?> aVar) {
            b90 c;
            if (!ef0.f27861a.mo35199y(aVar) && (c = aVar.f27874a.mo47129c()) != null) {
                return this.f27875a.mo21054h0(aVar, c);
            }
            return null;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "com/onedelhi/secure/z10$b", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.ef0$d */
    public static final class C5128d<T> implements Comparator {
        public final int compare(T t, T t2) {
            return z10.m72495g(Long.valueOf(((C5125a) t).f27874a.f37388a), Long.valueOf(((C5125a) t2).f27874a.f37388a));
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/onedelhi/secure/ef0$a;", "it", "", "a", "(Lcom/onedelhi/secure/ef0$a;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.ef0$e */
    public static final class C5129e extends d12 implements ec1<C5125a<?>, Boolean> {

        /* renamed from: a */
        public static final C5129e f27876a = new C5129e();

        public C5129e() {
            super(1);
        }

        @vr2
        /* renamed from: a */
        public final Boolean mo17094X(@vr2 C5125a<?> aVar) {
            return Boolean.valueOf(!ef0.f27861a.mo35199y(aVar));
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "com/onedelhi/secure/z10$b", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.ef0$f */
    public static final class C5130f<T> implements Comparator {
        public final int compare(T t, T t2) {
            return z10.m72495g(Long.valueOf(((C5125a) t).f27874a.f37388a), Long.valueOf(((C5125a) t2).f27874a.f37388a));
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "R", "Lcom/onedelhi/secure/ef0$a;", "owner", "a", "(Lcom/onedelhi/secure/ef0$a;)Ljava/lang/Object;", "com/onedelhi/secure/ef0$c"}, k = 3, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.ef0$g */
    public static final class C5131g extends d12 implements ec1<C5125a<?>, kf0> {
        public C5131g() {
            super(1);
        }

        @ss2
        /* renamed from: a */
        public final kf0 mo17094X(@vr2 C5125a<?> aVar) {
            b90 c;
            if (!ef0.f27861a.mo35199y(aVar) && (c = aVar.f27874a.mo47129c()) != null) {
                return new kf0(aVar.f27874a, c);
            }
            return null;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/onedelhi/secure/un4;", "a", "()V"}, k = 3, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.ef0$h */
    public static final class C5132h extends d12 implements cc1<un4> {

        /* renamed from: a */
        public static final C5132h f27877a = new C5132h();

        public C5132h() {
            super(0);
        }

        /* renamed from: a */
        public final void mo35210a() {
            ef0.f27870b.mo39654n();
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo35210a();
            return un4.f36206a;
        }
    }

    static {
        ef0 ef0 = new ef0();
        f27861a = ef0;
        f27860a = ef0.mo35194t();
    }

    /* renamed from: s */
    public static /* synthetic */ void m46524s(ru1 ru1) {
    }

    /* renamed from: A */
    public final boolean mo35159A(StackTraceElement stackTraceElement) {
        return t54.m65466u2(stackTraceElement.getClassName(), "kotlinx.coroutines", false, 2, (Object) null);
    }

    /* renamed from: B */
    public final C5125a<?> mo35160B(b80<?> b80) {
        p90 p90 = b80 instanceof p90 ? (p90) b80 : null;
        if (p90 == null) {
            return null;
        }
        return mo35161C(p90);
    }

    /* renamed from: C */
    public final C5125a<?> mo35161C(p90 p90) {
        while (!(p90 instanceof C5125a)) {
            p90 = p90.mo35202i();
            if (p90 == null) {
                return null;
            }
        }
        return (C5125a) p90;
    }

    /* renamed from: D */
    public final void mo35162D(PrintStream printStream, List<StackTraceElement> list) {
        for (StackTraceElement C : list) {
            printStream.print(jt1.m53745C("\n\tat ", C));
        }
    }

    /* renamed from: E */
    public final void mo35163E(C5125a<?> aVar) {
        f27863a.remove(aVar);
        p90 f = aVar.f27874a.mo47132f();
        p90 I = f == null ? null : mo35167I(f);
        if (I != null) {
            f27870b.remove(I);
        }
    }

    @vr2
    /* renamed from: F */
    public final <T> b80<T> mo35164F(@vr2 b80<? super T> b80) {
        if (!mo35200z() || mo35160B(b80) != null) {
            return b80;
        }
        return mo35180e(b80, f27871b ? mo35173O(mo35168J(new Exception())) : null);
    }

    /* renamed from: G */
    public final void mo35165G(@vr2 b80<?> b80) {
        mo35177S(b80, ye0.f37869b);
    }

    /* renamed from: H */
    public final void mo35166H(@vr2 b80<?> b80) {
        mo35177S(b80, ye0.f37870c);
    }

    /* renamed from: I */
    public final p90 mo35167I(p90 p90) {
        do {
            p90 = p90.mo35202i();
            if (p90 == null) {
                return null;
            }
        } while (p90.mo35201P() == null);
        return p90;
    }

    /* renamed from: J */
    public final <T extends Throwable> List<StackTraceElement> mo35168J(T t) {
        int i;
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i2 = -1;
        int length2 = stackTrace.length - 1;
        if (length2 >= 0) {
            while (true) {
                int i3 = length2 - 1;
                if (jt1.m53768g(stackTrace[length2].getClassName(), "kotlin.coroutines.jvm.internal.DebugProbesKt")) {
                    i2 = length2;
                    break;
                } else if (i3 < 0) {
                    break;
                } else {
                    length2 = i3;
                }
            }
        }
        if (!f27869a) {
            int i4 = length - i;
            ArrayList arrayList = new ArrayList(i4);
            int i5 = 0;
            while (i5 < i4) {
                int i6 = i5 + 1;
                arrayList.add(i5 == 0 ? i24.m51745d(f27864a) : stackTrace[i5 + i]);
                i5 = i6;
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList((length - i) + 1);
        arrayList2.add(i24.m51745d(f27864a));
        while (true) {
            i++;
            while (i < length) {
                if (mo35159A(stackTrace[i])) {
                    arrayList2.add(stackTrace[i]);
                    int i7 = i + 1;
                    while (i7 < length && mo35159A(stackTrace[i7])) {
                        i7++;
                    }
                    int i8 = i7 - 1;
                    int i9 = i8;
                    while (i9 > i && stackTrace[i9].getFileName() == null) {
                        i9--;
                    }
                    if (i9 > i && i9 < i8) {
                        arrayList2.add(stackTrace[i9]);
                    }
                    arrayList2.add(stackTrace[i8]);
                    i = i7;
                } else {
                    arrayList2.add(stackTrace[i]);
                }
            }
            return arrayList2;
        }
    }

    /* renamed from: K */
    public final void mo35169K(boolean z) {
        f27871b = z;
    }

    /* renamed from: L */
    public final void mo35170L(boolean z) {
        f27869a = z;
    }

    /* renamed from: M */
    public final void mo35171M() {
        f27865a = hc4.m50446c(false, true, (ClassLoader) null, "Coroutines Debugger Cleaner", 0, C5132h.f27877a, 21, (Object) null);
    }

    /* renamed from: N */
    public final void mo35172N() {
        Thread thread = f27865a;
        if (thread != null) {
            f27865a = null;
            thread.interrupt();
            thread.join();
        }
    }

    /* renamed from: O */
    public final h24 mo35173O(List<StackTraceElement> list) {
        h24 h24 = null;
        if (!list.isEmpty()) {
            ListIterator<StackTraceElement> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                h24 = new h24(h24, listIterator.previous());
            }
        }
        return h24;
    }

    /* renamed from: P */
    public final String mo35174P(Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(tk4.f35693a);
        sb.append(obj);
        sb.append(tk4.f35693a);
        return sb.toString();
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: Q */
    public final void mo35175Q() {
        /*
            r6 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = f27868a
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            int r2 = r0.getWriteHoldCount()
            r3 = 0
            if (r2 != 0) goto L_0x0012
            int r2 = r0.getReadHoldCount()
            goto L_0x0013
        L_0x0012:
            r2 = 0
        L_0x0013:
            r4 = 0
        L_0x0014:
            if (r4 >= r2) goto L_0x001c
            int r4 = r4 + 1
            r1.unlock()
            goto L_0x0014
        L_0x001c:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            com.onedelhi.secure.ef0 r4 = f27861a     // Catch:{ all -> 0x0086 }
            boolean r5 = r4.mo35200z()     // Catch:{ all -> 0x0086 }
            if (r5 == 0) goto L_0x007a
            int r5 = installations     // Catch:{ all -> 0x0086 }
            int r5 = r5 + -1
            installations = r5     // Catch:{ all -> 0x0086 }
            int r5 = installations     // Catch:{ all -> 0x0086 }
            if (r5 == 0) goto L_0x0041
        L_0x0035:
            if (r3 >= r2) goto L_0x003d
            int r3 = r3 + 1
            r1.lock()
            goto L_0x0035
        L_0x003d:
            r0.unlock()
            return
        L_0x0041:
            r4.mo35172N()     // Catch:{ all -> 0x0086 }
            com.onedelhi.secure.l40<com.onedelhi.secure.ef0$a<?>, java.lang.Boolean> r4 = f27863a     // Catch:{ all -> 0x0086 }
            r4.clear()     // Catch:{ all -> 0x0086 }
            com.onedelhi.secure.l40<com.onedelhi.secure.p90, com.onedelhi.secure.xe0> r4 = f27870b     // Catch:{ all -> 0x0086 }
            r4.clear()     // Catch:{ all -> 0x0086 }
            com.onedelhi.secure.g4 r4 = com.onedelhi.secure.C5359g4.f28937a     // Catch:{ all -> 0x0086 }
            boolean r4 = r4.mo36564a()     // Catch:{ all -> 0x0086 }
            if (r4 == 0) goto L_0x0062
        L_0x0056:
            if (r3 >= r2) goto L_0x005e
            int r3 = r3 + 1
            r1.lock()
            goto L_0x0056
        L_0x005e:
            r0.unlock()
            return
        L_0x0062:
            com.onedelhi.secure.ec1<java.lang.Boolean, com.onedelhi.secure.un4> r4 = f27860a     // Catch:{ all -> 0x0086 }
            if (r4 != 0) goto L_0x0067
            goto L_0x006c
        L_0x0067:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0086 }
            r4.mo17094X(r5)     // Catch:{ all -> 0x0086 }
        L_0x006c:
            com.onedelhi.secure.un4 r4 = com.onedelhi.secure.un4.f36206a     // Catch:{ all -> 0x0086 }
        L_0x006e:
            if (r3 >= r2) goto L_0x0076
            int r3 = r3 + 1
            r1.lock()
            goto L_0x006e
        L_0x0076:
            r0.unlock()
            return
        L_0x007a:
            java.lang.String r4 = "Agent was not installed"
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0086 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0086 }
            r5.<init>(r4)     // Catch:{ all -> 0x0086 }
            throw r5     // Catch:{ all -> 0x0086 }
        L_0x0086:
            r4 = move-exception
        L_0x0087:
            if (r3 >= r2) goto L_0x008f
            int r3 = r3 + 1
            r1.lock()
            goto L_0x0087
        L_0x008f:
            r0.unlock()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ef0.mo35175Q():void");
    }

    /* renamed from: R */
    public final void mo35176R(p90 p90, String str) {
        ReentrantReadWriteLock.ReadLock readLock = f27868a.readLock();
        readLock.lock();
        try {
            ef0 ef0 = f27861a;
            if (ef0.mo35200z()) {
                l40<p90, xe0> l40 = f27870b;
                xe0 remove = l40.remove(p90);
                if (remove == null) {
                    C5125a<?> C = ef0.mo35161C(p90);
                    p90 p902 = null;
                    remove = C == null ? null : C.f27874a;
                    if (remove == null) {
                        readLock.unlock();
                        return;
                    }
                    p90 f = remove.mo47132f();
                    if (f != null) {
                        p902 = ef0.mo35167I(f);
                    }
                    if (p902 != null) {
                        l40.remove(p902);
                    }
                }
                remove.mo47136j(str, (b80) p90);
                p90 I = ef0.mo35167I(p90);
                if (I == null) {
                    readLock.unlock();
                    return;
                }
                l40.put(I, remove);
                un4 un4 = un4.f36206a;
                readLock.unlock();
            }
        } finally {
            readLock.unlock();
        }
    }

    /* renamed from: S */
    public final void mo35177S(b80<?> b80, String str) {
        if (mo35200z()) {
            if (!jt1.m53768g(str, ye0.f37869b) || !f02.f28132a.mo35689q(1, 3, 30)) {
                C5125a<?> B = mo35160B(b80);
                if (B != null) {
                    mo35178T(B, b80, str);
                    return;
                }
                return;
            }
            p90 p90 = b80 instanceof p90 ? (p90) b80 : null;
            if (p90 != null) {
                mo35176R(p90, str);
            }
        }
    }

    /* renamed from: T */
    public final void mo35178T(C5125a<?> aVar, b80<?> b80, String str) {
        ReentrantReadWriteLock.ReadLock readLock = f27868a.readLock();
        readLock.lock();
        try {
            if (f27861a.mo35200z()) {
                aVar.f27874a.mo47136j(str, b80);
                un4 un4 = un4.f36206a;
                readLock.unlock();
            }
        } finally {
            readLock.unlock();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0070 A[LOOP:0: B:8:0x006a->B:10:0x0070, LOOP_END] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo35179d(com.onedelhi.secure.ru1 r7, java.util.Map<com.onedelhi.secure.ru1, com.onedelhi.secure.xe0> r8, java.lang.StringBuilder r9, java.lang.String r10) {
        /*
            r6 = this;
            java.lang.Object r0 = r8.get(r7)
            com.onedelhi.secure.xe0 r0 = (com.onedelhi.secure.xe0) r0
            java.lang.String r1 = "\t"
            r2 = 10
            if (r0 != 0) goto L_0x0027
            boolean r0 = r7 instanceof com.onedelhi.secure.js3
            if (r0 != 0) goto L_0x0062
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            java.lang.String r3 = r6.mo35193r(r7)
            r0.append(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            goto L_0x005b
        L_0x0027:
            java.util.List r3 = r0.mo47134h()
            java.lang.Object r3 = com.onedelhi.secure.a10.m35691B2(r3)
            java.lang.StackTraceElement r3 = (java.lang.StackTraceElement) r3
            java.lang.String r0 = r0.mo47133g()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r10)
            java.lang.String r5 = r6.mo35193r(r7)
            r4.append(r5)
            java.lang.String r5 = ", continuation is "
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = " at line "
            r4.append(r0)
            r4.append(r3)
            r4.append(r2)
            java.lang.String r0 = r4.toString()
        L_0x005b:
            r9.append(r0)
            java.lang.String r10 = com.onedelhi.secure.jt1.m53745C(r10, r1)
        L_0x0062:
            com.onedelhi.secure.zt3 r7 = r7.mo32124m()
            java.util.Iterator r7 = r7.iterator()
        L_0x006a:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x007a
            java.lang.Object r0 = r7.next()
            com.onedelhi.secure.ru1 r0 = (com.onedelhi.secure.ru1) r0
            r6.mo35179d(r0, r8, r9, r10)
            goto L_0x006a
        L_0x007a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ef0.mo35179d(com.onedelhi.secure.ru1, java.util.Map, java.lang.StringBuilder, java.lang.String):void");
    }

    /* renamed from: e */
    public final <T> b80<T> mo35180e(b80<? super T> b80, h24 h24) {
        if (!mo35200z()) {
            return b80;
        }
        C5125a aVar = new C5125a(b80, new xe0(b80.mo31187f(), h24, f27867a.incrementAndGet(f27862a)), h24);
        l40<C5125a<?>, Boolean> l40 = f27863a;
        l40.put(aVar, Boolean.TRUE);
        if (!mo35200z()) {
            l40.clear();
        }
        return aVar;
    }

    /* renamed from: f */
    public final void mo35181f(@vr2 PrintStream printStream) {
        synchronized (printStream) {
            f27861a.mo35185j(printStream);
            un4 un4 = un4.f36206a;
        }
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    @com.onedelhi.secure.vr2
    /* renamed from: g */
    public final java.util.List<com.onedelhi.secure.we0> mo35182g() {
        /*
            r6 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = f27868a
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            int r2 = r0.getWriteHoldCount()
            r3 = 0
            if (r2 != 0) goto L_0x0012
            int r2 = r0.getReadHoldCount()
            goto L_0x0013
        L_0x0012:
            r2 = 0
        L_0x0013:
            r4 = 0
        L_0x0014:
            if (r4 >= r2) goto L_0x001c
            int r4 = r4 + 1
            r1.unlock()
            goto L_0x0014
        L_0x001c:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            com.onedelhi.secure.ef0 r4 = f27861a     // Catch:{ all -> 0x0061 }
            boolean r5 = r4.mo35200z()     // Catch:{ all -> 0x0061 }
            if (r5 == 0) goto L_0x0055
            java.util.Set r4 = r4.mo35192q()     // Catch:{ all -> 0x0061 }
            com.onedelhi.secure.zt3 r4 = com.onedelhi.secure.a10.m35912v1(r4)     // Catch:{ all -> 0x0061 }
            com.onedelhi.secure.ef0$d r5 = new com.onedelhi.secure.ef0$d     // Catch:{ all -> 0x0061 }
            r5.<init>()     // Catch:{ all -> 0x0061 }
            com.onedelhi.secure.zt3 r4 = com.onedelhi.secure.hu3.m50939K2(r4, r5)     // Catch:{ all -> 0x0061 }
            com.onedelhi.secure.ef0$b r5 = new com.onedelhi.secure.ef0$b     // Catch:{ all -> 0x0061 }
            r5.<init>()     // Catch:{ all -> 0x0061 }
            com.onedelhi.secure.zt3 r4 = com.onedelhi.secure.hu3.m51061p1(r4, r5)     // Catch:{ all -> 0x0061 }
            java.util.List r4 = com.onedelhi.secure.hu3.m51011c3(r4)     // Catch:{ all -> 0x0061 }
        L_0x0049:
            if (r3 >= r2) goto L_0x0051
            int r3 = r3 + 1
            r1.lock()
            goto L_0x0049
        L_0x0051:
            r0.unlock()
            return r4
        L_0x0055:
            java.lang.String r4 = "Debug probes are not installed"
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0061 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0061 }
            r5.<init>(r4)     // Catch:{ all -> 0x0061 }
            throw r5     // Catch:{ all -> 0x0061 }
        L_0x0061:
            r4 = move-exception
        L_0x0062:
            if (r3 >= r2) goto L_0x006a
            int r3 = r3 + 1
            r1.lock()
            goto L_0x0062
        L_0x006a:
            r0.unlock()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ef0.mo35182g():java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0038, code lost:
        r7 = r7.mo38462V0();
     */
    @com.onedelhi.secure.vr2
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object[] mo35183h() {
        /*
            r14 = this;
            java.util.List r0 = r14.mo35182g()
            int r1 = r0.size()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r1)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r1)
            java.util.Iterator r1 = r0.iterator()
        L_0x001b:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x00bb
            java.lang.Object r5 = r1.next()
            com.onedelhi.secure.we0 r5 = (com.onedelhi.secure.we0) r5
            com.onedelhi.secure.b90 r6 = r5.mo46697a()
            com.onedelhi.secure.j90$a r7 = com.onedelhi.secure.j90.f30592a
            com.onedelhi.secure.b90$b r7 = r6.get(r7)
            com.onedelhi.secure.j90 r7 = (com.onedelhi.secure.j90) r7
            r8 = 0
            if (r7 != 0) goto L_0x0038
        L_0x0036:
            r7 = r8
            goto L_0x0043
        L_0x0038:
            java.lang.String r7 = r7.mo38462V0()
            if (r7 != 0) goto L_0x003f
            goto L_0x0036
        L_0x003f:
            java.lang.String r7 = r14.mo35174P(r7)
        L_0x0043:
            com.onedelhi.secure.e90$a r9 = com.onedelhi.secure.e90.f27717a
            com.onedelhi.secure.b90$b r9 = r6.get(r9)
            com.onedelhi.secure.e90 r9 = (com.onedelhi.secure.e90) r9
            if (r9 != 0) goto L_0x004f
            r9 = r8
            goto L_0x0053
        L_0x004f:
            java.lang.String r9 = r14.mo35174P(r9)
        L_0x0053:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "\n                {\n                    \"name\": "
            r10.append(r11)
            r10.append(r7)
            java.lang.String r7 = ",\n                    \"id\": "
            r10.append(r7)
            com.onedelhi.secure.i90$a r7 = com.onedelhi.secure.i90.f30122a
            com.onedelhi.secure.b90$b r6 = r6.get(r7)
            com.onedelhi.secure.i90 r6 = (com.onedelhi.secure.i90) r6
            if (r6 != 0) goto L_0x0070
            goto L_0x0078
        L_0x0070:
            long r6 = r6.mo37903V0()
            java.lang.Long r8 = java.lang.Long.valueOf(r6)
        L_0x0078:
            r10.append(r8)
            java.lang.String r6 = ",\n                    \"dispatcher\": "
            r10.append(r6)
            r10.append(r9)
            java.lang.String r6 = ",\n                    \"sequenceNumber\": "
            r10.append(r6)
            long r6 = r5.mo46702f()
            r10.append(r6)
            java.lang.String r6 = ",\n                    \"state\": \""
            r10.append(r6)
            java.lang.String r6 = r5.mo46703g()
            r10.append(r6)
            java.lang.String r6 = "\"\n                } \n                "
            r10.append(r6)
            java.lang.String r6 = r10.toString()
            java.lang.String r6 = com.onedelhi.secure.m54.m56948p(r6)
            r4.add(r6)
            com.onedelhi.secure.p90 r6 = r5.mo46700d()
            r3.add(r6)
            java.lang.Thread r5 = r5.mo46701e()
            r2.add(r5)
            goto L_0x001b
        L_0x00bb:
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r5 = 91
            r13.append(r5)
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 63
            r12 = 0
            java.lang.String r4 = com.onedelhi.secure.a10.m35851h3(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.append(r4)
            r4 = 93
            r13.append(r4)
            java.lang.String r4 = r13.toString()
            r5 = 0
            r1[r5] = r4
            r4 = 1
            java.lang.Thread[] r6 = new java.lang.Thread[r5]
            java.lang.Object[] r2 = r2.toArray(r6)
            java.lang.String r6 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            java.util.Objects.requireNonNull(r2, r6)
            r1[r4] = r2
            r2 = 2
            com.onedelhi.secure.p90[] r4 = new com.onedelhi.secure.p90[r5]
            java.lang.Object[] r3 = r3.toArray(r4)
            java.util.Objects.requireNonNull(r3, r6)
            r1[r2] = r3
            r2 = 3
            com.onedelhi.secure.we0[] r3 = new com.onedelhi.secure.we0[r5]
            java.lang.Object[] r0 = r0.toArray(r3)
            java.util.Objects.requireNonNull(r0, r6)
            r1[r2] = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ef0.mo35183h():java.lang.Object[]");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: i */
    public final <R> java.util.List<R> mo35184i(com.onedelhi.secure.sc1<? super com.onedelhi.secure.ef0.C5125a<?>, ? super com.onedelhi.secure.b90, ? extends R> r8) {
        /*
            r7 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = f27868a
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            int r2 = r0.getWriteHoldCount()
            r3 = 0
            if (r2 != 0) goto L_0x0012
            int r2 = r0.getReadHoldCount()
            goto L_0x0013
        L_0x0012:
            r2 = 0
        L_0x0013:
            r4 = 0
        L_0x0014:
            if (r4 >= r2) goto L_0x001c
            int r4 = r4 + 1
            r1.unlock()
            goto L_0x0014
        L_0x001c:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            r4 = 1
            com.onedelhi.secure.ef0 r5 = f27861a     // Catch:{ all -> 0x0068 }
            boolean r6 = r5.mo35200z()     // Catch:{ all -> 0x0068 }
            if (r6 == 0) goto L_0x005c
            java.util.Set r5 = r5.mo35192q()     // Catch:{ all -> 0x0068 }
            com.onedelhi.secure.zt3 r5 = com.onedelhi.secure.a10.m35912v1(r5)     // Catch:{ all -> 0x0068 }
            com.onedelhi.secure.ef0$d r6 = new com.onedelhi.secure.ef0$d     // Catch:{ all -> 0x0068 }
            r6.<init>()     // Catch:{ all -> 0x0068 }
            com.onedelhi.secure.zt3 r5 = com.onedelhi.secure.hu3.m50939K2(r5, r6)     // Catch:{ all -> 0x0068 }
            com.onedelhi.secure.ef0$c r6 = new com.onedelhi.secure.ef0$c     // Catch:{ all -> 0x0068 }
            r6.<init>(r8)     // Catch:{ all -> 0x0068 }
            com.onedelhi.secure.zt3 r8 = com.onedelhi.secure.hu3.m51061p1(r5, r6)     // Catch:{ all -> 0x0068 }
            java.util.List r8 = com.onedelhi.secure.hu3.m51011c3(r8)     // Catch:{ all -> 0x0068 }
            com.onedelhi.secure.uq1.m67403d(r4)
        L_0x004d:
            if (r3 >= r2) goto L_0x0055
            int r3 = r3 + 1
            r1.lock()
            goto L_0x004d
        L_0x0055:
            r0.unlock()
            com.onedelhi.secure.uq1.m67402c(r4)
            return r8
        L_0x005c:
            java.lang.String r8 = "Debug probes are not installed"
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0068 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0068 }
            r5.<init>(r8)     // Catch:{ all -> 0x0068 }
            throw r5     // Catch:{ all -> 0x0068 }
        L_0x0068:
            r8 = move-exception
            com.onedelhi.secure.uq1.m67403d(r4)
        L_0x006c:
            if (r3 >= r2) goto L_0x0074
            int r3 = r3 + 1
            r1.lock()
            goto L_0x006c
        L_0x0074:
            r0.unlock()
            com.onedelhi.secure.uq1.m67402c(r4)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ef0.mo35184i(com.onedelhi.secure.sc1):java.util.List");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: j */
    public final void mo35185j(java.io.PrintStream r14) {
        /*
            r13 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = f27868a
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            int r2 = r0.getWriteHoldCount()
            r3 = 0
            if (r2 != 0) goto L_0x0012
            int r2 = r0.getReadHoldCount()
            goto L_0x0013
        L_0x0012:
            r2 = 0
        L_0x0013:
            r4 = 0
        L_0x0014:
            if (r4 >= r2) goto L_0x001c
            int r4 = r4 + 1
            r1.unlock()
            goto L_0x0014
        L_0x001c:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            com.onedelhi.secure.ef0 r4 = f27861a     // Catch:{ all -> 0x00f1 }
            boolean r5 = r4.mo35200z()     // Catch:{ all -> 0x00f1 }
            if (r5 == 0) goto L_0x00e5
            java.lang.String r5 = "Coroutines dump "
            java.text.SimpleDateFormat r6 = f27866a     // Catch:{ all -> 0x00f1 }
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00f1 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x00f1 }
            java.lang.String r6 = r6.format(r7)     // Catch:{ all -> 0x00f1 }
            java.lang.String r5 = com.onedelhi.secure.jt1.m53745C(r5, r6)     // Catch:{ all -> 0x00f1 }
            r14.print(r5)     // Catch:{ all -> 0x00f1 }
            java.util.Set r4 = r4.mo35192q()     // Catch:{ all -> 0x00f1 }
            com.onedelhi.secure.zt3 r4 = com.onedelhi.secure.a10.m35912v1(r4)     // Catch:{ all -> 0x00f1 }
            com.onedelhi.secure.ef0$e r5 = com.onedelhi.secure.ef0.C5129e.f27876a     // Catch:{ all -> 0x00f1 }
            com.onedelhi.secure.zt3 r4 = com.onedelhi.secure.hu3.m51060p0(r4, r5)     // Catch:{ all -> 0x00f1 }
            com.onedelhi.secure.ef0$f r5 = new com.onedelhi.secure.ef0$f     // Catch:{ all -> 0x00f1 }
            r5.<init>()     // Catch:{ all -> 0x00f1 }
            com.onedelhi.secure.zt3 r4 = com.onedelhi.secure.hu3.m50939K2(r4, r5)     // Catch:{ all -> 0x00f1 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x00f1 }
        L_0x005d:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x00f1 }
            if (r5 == 0) goto L_0x00d7
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x00f1 }
            com.onedelhi.secure.ef0$a r5 = (com.onedelhi.secure.ef0.C5125a) r5     // Catch:{ all -> 0x00f1 }
            com.onedelhi.secure.xe0 r6 = r5.f27874a     // Catch:{ all -> 0x00f1 }
            java.util.List r7 = r6.mo47134h()     // Catch:{ all -> 0x00f1 }
            com.onedelhi.secure.ef0 r8 = f27861a     // Catch:{ all -> 0x00f1 }
            java.lang.String r9 = r6.mo47133g()     // Catch:{ all -> 0x00f1 }
            java.lang.Thread r10 = r6.f37391a     // Catch:{ all -> 0x00f1 }
            java.util.List r9 = r8.mo35189n(r9, r10, r7)     // Catch:{ all -> 0x00f1 }
            java.lang.String r10 = r6.mo47133g()     // Catch:{ all -> 0x00f1 }
            java.lang.String r11 = "RUNNING"
            boolean r10 = com.onedelhi.secure.jt1.m53768g(r10, r11)     // Catch:{ all -> 0x00f1 }
            if (r10 == 0) goto L_0x0094
            if (r9 != r7) goto L_0x0094
            java.lang.String r10 = r6.mo47133g()     // Catch:{ all -> 0x00f1 }
            java.lang.String r11 = " (Last suspension stacktrace, not an actual stacktrace)"
            java.lang.String r10 = com.onedelhi.secure.jt1.m53745C(r10, r11)     // Catch:{ all -> 0x00f1 }
            goto L_0x0098
        L_0x0094:
            java.lang.String r10 = r6.mo47133g()     // Catch:{ all -> 0x00f1 }
        L_0x0098:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f1 }
            r11.<init>()     // Catch:{ all -> 0x00f1 }
            java.lang.String r12 = "\n\nCoroutine "
            r11.append(r12)     // Catch:{ all -> 0x00f1 }
            com.onedelhi.secure.b80<T> r5 = r5.f27872a     // Catch:{ all -> 0x00f1 }
            r11.append(r5)     // Catch:{ all -> 0x00f1 }
            java.lang.String r5 = ", state: "
            r11.append(r5)     // Catch:{ all -> 0x00f1 }
            r11.append(r10)     // Catch:{ all -> 0x00f1 }
            java.lang.String r5 = r11.toString()     // Catch:{ all -> 0x00f1 }
            r14.print(r5)     // Catch:{ all -> 0x00f1 }
            boolean r5 = r7.isEmpty()     // Catch:{ all -> 0x00f1 }
            if (r5 == 0) goto L_0x00d3
            java.lang.String r5 = "\n\tat "
            java.lang.String r7 = "Coroutine creation stacktrace"
            java.lang.StackTraceElement r7 = com.onedelhi.secure.i24.m51745d(r7)     // Catch:{ all -> 0x00f1 }
            java.lang.String r5 = com.onedelhi.secure.jt1.m53745C(r5, r7)     // Catch:{ all -> 0x00f1 }
            r14.print(r5)     // Catch:{ all -> 0x00f1 }
            java.util.List r5 = r6.mo47131e()     // Catch:{ all -> 0x00f1 }
            r8.mo35162D(r14, r5)     // Catch:{ all -> 0x00f1 }
            goto L_0x005d
        L_0x00d3:
            r8.mo35162D(r14, r9)     // Catch:{ all -> 0x00f1 }
            goto L_0x005d
        L_0x00d7:
            com.onedelhi.secure.un4 r14 = com.onedelhi.secure.un4.f36206a     // Catch:{ all -> 0x00f1 }
        L_0x00d9:
            if (r3 >= r2) goto L_0x00e1
            int r3 = r3 + 1
            r1.lock()
            goto L_0x00d9
        L_0x00e1:
            r0.unlock()
            return
        L_0x00e5:
            java.lang.String r14 = "Debug probes are not installed"
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00f1 }
            java.lang.String r14 = r14.toString()     // Catch:{ all -> 0x00f1 }
            r4.<init>(r14)     // Catch:{ all -> 0x00f1 }
            throw r4     // Catch:{ all -> 0x00f1 }
        L_0x00f1:
            r14 = move-exception
        L_0x00f2:
            if (r3 >= r2) goto L_0x00fa
            int r3 = r3 + 1
            r1.lock()
            goto L_0x00f2
        L_0x00fa:
            r0.unlock()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ef0.mo35185j(java.io.PrintStream):void");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    @com.onedelhi.secure.vr2
    /* renamed from: k */
    public final java.util.List<com.onedelhi.secure.kf0> mo35186k() {
        /*
            r6 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = f27868a
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            int r2 = r0.getWriteHoldCount()
            r3 = 0
            if (r2 != 0) goto L_0x0012
            int r2 = r0.getReadHoldCount()
            goto L_0x0013
        L_0x0012:
            r2 = 0
        L_0x0013:
            r4 = 0
        L_0x0014:
            if (r4 >= r2) goto L_0x001c
            int r4 = r4 + 1
            r1.unlock()
            goto L_0x0014
        L_0x001c:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            com.onedelhi.secure.ef0 r4 = f27861a     // Catch:{ all -> 0x0061 }
            boolean r5 = r4.mo35200z()     // Catch:{ all -> 0x0061 }
            if (r5 == 0) goto L_0x0055
            java.util.Set r4 = r4.mo35192q()     // Catch:{ all -> 0x0061 }
            com.onedelhi.secure.zt3 r4 = com.onedelhi.secure.a10.m35912v1(r4)     // Catch:{ all -> 0x0061 }
            com.onedelhi.secure.ef0$d r5 = new com.onedelhi.secure.ef0$d     // Catch:{ all -> 0x0061 }
            r5.<init>()     // Catch:{ all -> 0x0061 }
            com.onedelhi.secure.zt3 r4 = com.onedelhi.secure.hu3.m50939K2(r4, r5)     // Catch:{ all -> 0x0061 }
            com.onedelhi.secure.ef0$g r5 = new com.onedelhi.secure.ef0$g     // Catch:{ all -> 0x0061 }
            r5.<init>()     // Catch:{ all -> 0x0061 }
            com.onedelhi.secure.zt3 r4 = com.onedelhi.secure.hu3.m51061p1(r4, r5)     // Catch:{ all -> 0x0061 }
            java.util.List r4 = com.onedelhi.secure.hu3.m51011c3(r4)     // Catch:{ all -> 0x0061 }
        L_0x0049:
            if (r3 >= r2) goto L_0x0051
            int r3 = r3 + 1
            r1.lock()
            goto L_0x0049
        L_0x0051:
            r0.unlock()
            return r4
        L_0x0055:
            java.lang.String r4 = "Debug probes are not installed"
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0061 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0061 }
            r5.<init>(r4)     // Catch:{ all -> 0x0061 }
            throw r5     // Catch:{ all -> 0x0061 }
        L_0x0061:
            r4 = move-exception
        L_0x0062:
            if (r3 >= r2) goto L_0x006a
            int r3 = r3 + 1
            r1.lock()
            goto L_0x0062
        L_0x006a:
            r0.unlock()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ef0.mo35186k():java.util.List");
    }

    @vr2
    /* renamed from: l */
    public final List<StackTraceElement> mo35187l(@vr2 we0 we0, @vr2 List<StackTraceElement> list) {
        return mo35189n(we0.mo46703g(), we0.mo46701e(), list);
    }

    @vr2
    /* renamed from: m */
    public final String mo35188m(@vr2 we0 we0) {
        List<StackTraceElement> l = mo35187l(we0, we0.mo46704h());
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement next : l) {
            StringBuilder sb = new StringBuilder();
            sb.append("\n                {\n                    \"declaringClass\": \"");
            sb.append(next.getClassName());
            sb.append("\",\n                    \"methodName\": \"");
            sb.append(next.getMethodName());
            sb.append("\",\n                    \"fileName\": ");
            String fileName = next.getFileName();
            sb.append(fileName == null ? null : mo35174P(fileName));
            sb.append(",\n                    \"lineNumber\": ");
            sb.append(next.getLineNumber());
            sb.append("\n                }\n                ");
            arrayList.add(m54.m56948p(sb.toString()));
        }
        return '[' + a10.m35851h3(arrayList, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (ec1) null, 63, (Object) null) + ']';
    }

    /* renamed from: n */
    public final List<StackTraceElement> mo35189n(String str, Thread thread, List<StackTraceElement> list) {
        Object obj;
        if (!jt1.m53768g(str, ye0.f37869b) || thread == null) {
            return list;
        }
        try {
            nl3.C6191a aVar = nl3.f32575a;
            obj = nl3.m58187b(thread.getStackTrace());
        } catch (Throwable th) {
            nl3.C6191a aVar2 = nl3.f32575a;
            obj = nl3.m58187b(pl3.m61423a(th));
        }
        if (nl3.m58194i(obj)) {
            obj = null;
        }
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) obj;
        if (stackTraceElementArr == null) {
            return list;
        }
        int length = stackTraceElementArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            int i2 = i + 1;
            StackTraceElement stackTraceElement = stackTraceElementArr[i];
            if (jt1.m53768g(stackTraceElement.getClassName(), i24.f30059a) && jt1.m53768g(stackTraceElement.getMethodName(), "resumeWith") && jt1.m53768g(stackTraceElement.getFileName(), "ContinuationImpl.kt")) {
                break;
            }
            i = i2;
        }
        ey2<Integer, Integer> o = mo35190o(i, stackTraceElementArr, list);
        int intValue = o.mo35665a().intValue();
        int intValue2 = o.mo35666b().intValue();
        if (intValue == -1) {
            return list;
        }
        ArrayList arrayList = new ArrayList((((list.size() + i) - intValue) - 1) - intValue2);
        int i3 = i - intValue2;
        for (int i4 = 0; i4 < i3; i4++) {
            arrayList.add(stackTraceElementArr[i4]);
        }
        int size = list.size();
        for (int i5 = intValue + 1; i5 < size; i5++) {
            arrayList.add(list.get(i5));
        }
        return arrayList;
    }

    /* renamed from: o */
    public final ey2<Integer, Integer> mo35190o(int i, StackTraceElement[] stackTraceElementArr, List<StackTraceElement> list) {
        int i2;
        int i3;
        int i4 = 0;
        while (true) {
            if (i4 >= 3) {
                i2 = -1;
                i3 = 0;
                break;
            }
            int i5 = i4 + 1;
            int p = f27861a.mo35191p((i - 1) - i4, stackTraceElementArr, list);
            if (p != -1) {
                i2 = Integer.valueOf(p);
                i3 = Integer.valueOf(i4);
                break;
            }
            i4 = i5;
        }
        return yi4.m71797a(i2, i3);
    }

    /* renamed from: p */
    public final int mo35191p(int i, StackTraceElement[] stackTraceElementArr, List<StackTraceElement> list) {
        StackTraceElement stackTraceElement = (StackTraceElement) C4478ab.m37464qf(stackTraceElementArr, i);
        if (stackTraceElement == null) {
            return -1;
        }
        int i2 = 0;
        for (StackTraceElement next : list) {
            if (jt1.m53768g(next.getFileName(), stackTraceElement.getFileName()) && jt1.m53768g(next.getClassName(), stackTraceElement.getClassName()) && jt1.m53768g(next.getMethodName(), stackTraceElement.getMethodName())) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* renamed from: q */
    public final Set<C5125a<?>> mo35192q() {
        return f27863a.keySet();
    }

    /* renamed from: r */
    public final String mo35193r(ru1 ru1) {
        return ru1 instanceof bv1 ? ((bv1) ru1).mo32150z1() : ru1.toString();
    }

    /* renamed from: t */
    public final ec1<Boolean, un4> mo35194t() {
        Object obj;
        try {
            nl3.C6191a aVar = nl3.f32575a;
            Object newInstance = Class.forName("kotlinx.coroutines.debug.internal.ByteBuddyDynamicAttach").getConstructors()[0].newInstance(new Object[0]);
            if (newInstance != null) {
                obj = nl3.m58187b((ec1) lj4.m55703q(newInstance, 1));
                if (nl3.m58194i(obj)) {
                    obj = null;
                }
                return (ec1) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Function1<kotlin.Boolean, kotlin.Unit>");
        } catch (Throwable th) {
            nl3.C6191a aVar2 = nl3.f32575a;
            obj = nl3.m58187b(pl3.m61423a(th));
        }
    }

    /* renamed from: u */
    public final boolean mo35195u() {
        return f27871b;
    }

    /* renamed from: v */
    public final boolean mo35196v() {
        return f27869a;
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    @com.onedelhi.secure.vr2
    /* renamed from: w */
    public final java.lang.String mo35197w(@com.onedelhi.secure.vr2 com.onedelhi.secure.ru1 r10) {
        /*
            r9 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = f27868a
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            int r2 = r0.getWriteHoldCount()
            r3 = 0
            if (r2 != 0) goto L_0x0012
            int r2 = r0.getReadHoldCount()
            goto L_0x0013
        L_0x0012:
            r2 = 0
        L_0x0013:
            r4 = 0
        L_0x0014:
            if (r4 >= r2) goto L_0x001c
            int r4 = r4 + 1
            r1.unlock()
            goto L_0x0014
        L_0x001c:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            com.onedelhi.secure.ef0 r4 = f27861a     // Catch:{ all -> 0x00c1 }
            boolean r5 = r4.mo35200z()     // Catch:{ all -> 0x00c1 }
            if (r5 == 0) goto L_0x00b5
            java.util.Set r4 = r4.mo35192q()     // Catch:{ all -> 0x00c1 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x00c1 }
            r5.<init>()     // Catch:{ all -> 0x00c1 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x00c1 }
        L_0x0038:
            boolean r6 = r4.hasNext()     // Catch:{ all -> 0x00c1 }
            if (r6 == 0) goto L_0x005c
            java.lang.Object r6 = r4.next()     // Catch:{ all -> 0x00c1 }
            r7 = r6
            com.onedelhi.secure.ef0$a r7 = (com.onedelhi.secure.ef0.C5125a) r7     // Catch:{ all -> 0x00c1 }
            com.onedelhi.secure.b80<T> r7 = r7.f27872a     // Catch:{ all -> 0x00c1 }
            com.onedelhi.secure.b90 r7 = r7.mo31187f()     // Catch:{ all -> 0x00c1 }
            com.onedelhi.secure.ru1$b r8 = com.onedelhi.secure.ru1.f34751a     // Catch:{ all -> 0x00c1 }
            com.onedelhi.secure.b90$b r7 = r7.get(r8)     // Catch:{ all -> 0x00c1 }
            if (r7 == 0) goto L_0x0055
            r7 = 1
            goto L_0x0056
        L_0x0055:
            r7 = 0
        L_0x0056:
            if (r7 == 0) goto L_0x0038
            r5.add(r6)     // Catch:{ all -> 0x00c1 }
            goto L_0x0038
        L_0x005c:
            r4 = 10
            int r4 = com.onedelhi.secure.t00.m65073Z(r5, r4)     // Catch:{ all -> 0x00c1 }
            int r4 = com.onedelhi.secure.hd2.m50458j(r4)     // Catch:{ all -> 0x00c1 }
            r6 = 16
            int r4 = com.onedelhi.secure.df3.m45198n(r4, r6)     // Catch:{ all -> 0x00c1 }
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap     // Catch:{ all -> 0x00c1 }
            r6.<init>(r4)     // Catch:{ all -> 0x00c1 }
            java.util.Iterator r4 = r5.iterator()     // Catch:{ all -> 0x00c1 }
        L_0x0075:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x00c1 }
            if (r5 == 0) goto L_0x0094
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x00c1 }
            r7 = r5
            com.onedelhi.secure.ef0$a r7 = (com.onedelhi.secure.ef0.C5125a) r7     // Catch:{ all -> 0x00c1 }
            com.onedelhi.secure.b80<T> r7 = r7.f27872a     // Catch:{ all -> 0x00c1 }
            com.onedelhi.secure.b90 r7 = r7.mo31187f()     // Catch:{ all -> 0x00c1 }
            com.onedelhi.secure.ru1 r7 = com.onedelhi.secure.xu1.m70805B(r7)     // Catch:{ all -> 0x00c1 }
            com.onedelhi.secure.ef0$a r5 = (com.onedelhi.secure.ef0.C5125a) r5     // Catch:{ all -> 0x00c1 }
            com.onedelhi.secure.xe0 r5 = r5.f27874a     // Catch:{ all -> 0x00c1 }
            r6.put(r7, r5)     // Catch:{ all -> 0x00c1 }
            goto L_0x0075
        L_0x0094:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c1 }
            r4.<init>()     // Catch:{ all -> 0x00c1 }
            com.onedelhi.secure.ef0 r5 = f27861a     // Catch:{ all -> 0x00c1 }
            java.lang.String r7 = ""
            r5.mo35179d(r10, r6, r4, r7)     // Catch:{ all -> 0x00c1 }
            java.lang.String r10 = r4.toString()     // Catch:{ all -> 0x00c1 }
            java.lang.String r4 = "StringBuilder().apply(builderAction).toString()"
            com.onedelhi.secure.jt1.m53776o(r10, r4)     // Catch:{ all -> 0x00c1 }
        L_0x00a9:
            if (r3 >= r2) goto L_0x00b1
            int r3 = r3 + 1
            r1.lock()
            goto L_0x00a9
        L_0x00b1:
            r0.unlock()
            return r10
        L_0x00b5:
            java.lang.String r10 = "Debug probes are not installed"
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00c1 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x00c1 }
            r4.<init>(r10)     // Catch:{ all -> 0x00c1 }
            throw r4     // Catch:{ all -> 0x00c1 }
        L_0x00c1:
            r10 = move-exception
        L_0x00c2:
            if (r3 >= r2) goto L_0x00ca
            int r3 = r3 + 1
            r1.lock()
            goto L_0x00c2
        L_0x00ca:
            r0.unlock()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ef0.mo35197w(com.onedelhi.secure.ru1):java.lang.String");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: x */
    public final void mo35198x() {
        /*
            r7 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = f27868a
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            int r2 = r0.getWriteHoldCount()
            r3 = 0
            if (r2 != 0) goto L_0x0012
            int r2 = r0.getReadHoldCount()
            goto L_0x0013
        L_0x0012:
            r2 = 0
        L_0x0013:
            r4 = 0
        L_0x0014:
            if (r4 >= r2) goto L_0x001c
            int r4 = r4 + 1
            r1.unlock()
            goto L_0x0014
        L_0x001c:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            com.onedelhi.secure.ef0 r4 = f27861a     // Catch:{ all -> 0x006a }
            int r5 = installations     // Catch:{ all -> 0x006a }
            r6 = 1
            int r5 = r5 + r6
            installations = r5     // Catch:{ all -> 0x006a }
            int r5 = installations     // Catch:{ all -> 0x006a }
            if (r5 <= r6) goto L_0x003b
        L_0x002f:
            if (r3 >= r2) goto L_0x0037
            int r3 = r3 + 1
            r1.lock()
            goto L_0x002f
        L_0x0037:
            r0.unlock()
            return
        L_0x003b:
            r4.mo35171M()     // Catch:{ all -> 0x006a }
            com.onedelhi.secure.g4 r4 = com.onedelhi.secure.C5359g4.f28937a     // Catch:{ all -> 0x006a }
            boolean r4 = r4.mo36564a()     // Catch:{ all -> 0x006a }
            if (r4 == 0) goto L_0x0052
        L_0x0046:
            if (r3 >= r2) goto L_0x004e
            int r3 = r3 + 1
            r1.lock()
            goto L_0x0046
        L_0x004e:
            r0.unlock()
            return
        L_0x0052:
            com.onedelhi.secure.ec1<java.lang.Boolean, com.onedelhi.secure.un4> r4 = f27860a     // Catch:{ all -> 0x006a }
            if (r4 != 0) goto L_0x0057
            goto L_0x005c
        L_0x0057:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x006a }
            r4.mo17094X(r5)     // Catch:{ all -> 0x006a }
        L_0x005c:
            com.onedelhi.secure.un4 r4 = com.onedelhi.secure.un4.f36206a     // Catch:{ all -> 0x006a }
        L_0x005e:
            if (r3 >= r2) goto L_0x0066
            int r3 = r3 + 1
            r1.lock()
            goto L_0x005e
        L_0x0066:
            r0.unlock()
            return
        L_0x006a:
            r4 = move-exception
        L_0x006b:
            if (r3 >= r2) goto L_0x0073
            int r3 = r3 + 1
            r1.lock()
            goto L_0x006b
        L_0x0073:
            r0.unlock()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ef0.mo35198x():void");
    }

    /* renamed from: y */
    public final boolean mo35199y(C5125a<?> aVar) {
        b90 c = aVar.f27874a.mo47129c();
        ru1 ru1 = c == null ? null : (ru1) c.get(ru1.f34751a);
        if (ru1 == null || !ru1.mo32108d()) {
            return false;
        }
        f27863a.remove(aVar);
        return true;
    }

    /* renamed from: z */
    public final boolean mo35200z() {
        return installations > 0;
    }
}
