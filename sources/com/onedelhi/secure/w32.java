package com.onedelhi.secure;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000~\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\u001a\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007\u001a&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u001a\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0007\u001a\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0007\u001a\"\u0010\u000f\u001a\u00020\u000e*\u0006\u0012\u0002\b\u00030\n2\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\fH\u0007\u001ao\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012D\b\b\u0010\u0017\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0010¢\u0006\u0002\b\u0016H\bø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001ah\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001b\u001a\u00020\u001a23\b\n\u0010\u001e\u001a-\b\u0001\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u001cH\bø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a\u0001\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012Y\b\b\u0010\u001e\u001aS\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150!¢\u0006\u0002\b\u0016H\bø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a)\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001HHø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001a)\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001HHø\u0001\u0000¢\u0006\u0004\b)\u0010'\u001a#\u0010+\u001a\u00020*\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001HHø\u0001\u0000¢\u0006\u0004\b+\u0010'\"\"\u00100\u001a\u00020\u001d*\u0006\u0012\u0002\b\u00030\n8FX\u0004¢\u0006\f\u0012\u0004\b.\u0010/\u001a\u0004\b,\u0010-\"\"\u00104\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\n8FX\u0004¢\u0006\f\u0012\u0004\b3\u0010/\u001a\u0004\b1\u00102\u0002\u0004\n\u0002\b\u0019¨\u00065"}, d2 = {"T", "Lcom/onedelhi/secure/qx3;", "Lcom/onedelhi/secure/m81;", "c", "Lcom/onedelhi/secure/b90;", "context", "h", "Lcom/onedelhi/secure/d34;", "e", "g", "Lcom/onedelhi/secure/o81;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "Lcom/onedelhi/secure/un4;", "a", "Lkotlin/Function3;", "", "Lcom/onedelhi/secure/iy2;", "name", "Lcom/onedelhi/secure/b80;", "", "Lcom/onedelhi/secure/wy0;", "action", "d", "(Lcom/onedelhi/secure/qx3;Lcom/onedelhi/secure/uc1;)Lcom/onedelhi/secure/m81;", "", "retries", "Lkotlin/Function2;", "", "predicate", "m", "(Lcom/onedelhi/secure/qx3;JLcom/onedelhi/secure/sc1;)Lcom/onedelhi/secure/m81;", "Lkotlin/Function4;", "attempt", "o", "(Lcom/onedelhi/secure/qx3;Lcom/onedelhi/secure/vc1;)Lcom/onedelhi/secure/m81;", "", "p", "(Lcom/onedelhi/secure/qx3;Lcom/onedelhi/secure/b80;)Ljava/lang/Object;", "", "q", "", "f", "k", "(Lcom/onedelhi/secure/o81;)Z", "isActive$annotations", "(Lcom/onedelhi/secure/o81;)V", "isActive", "i", "(Lcom/onedelhi/secure/o81;)Lcom/onedelhi/secure/b90;", "getCoroutineContext$annotations", "coroutineContext", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class w32 {

    @cf0(mo32326c = "kotlinx.coroutines.flow.LintKt$retry$1", mo32327f = "Lint.kt", mo32328i = {}, mo32329l = {}, mo32330m = "invokeSuspend", mo32331n = {}, mo32332s = {})
    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H@"}, d2 = {"T", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.w32$a */
    public static final class C7130a extends i84 implements sc1<Throwable, b80<? super Boolean>, Object> {

        /* renamed from: o */
        public int f36886o;

        public C7130a(b80<? super C7130a> b80) {
            super(2, b80);
        }

        @vr2
        /* renamed from: B */
        public final b80<un4> mo22644B(@ss2 Object obj, @vr2 b80<?> b80) {
            return new C7130a(b80);
        }

        @ss2
        /* renamed from: D */
        public final Object mo22645D(@vr2 Object obj) {
            mt1.m57558h();
            if (this.f36886o == 0) {
                pl3.m61436n(obj);
                return C7377yn.m71912a(true);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @ss2
        /* renamed from: M */
        public final Object mo21054h0(@vr2 Throwable th, @ss2 b80<? super Boolean> b80) {
            return ((C7130a) mo22644B(th, b80)).mo22645D(un4.f36206a);
        }
    }

    @xj0(level = ak0.ERROR, message = "cancel() is resolved into the extension of outer CoroutineScope which is likely to be an error.Use currentCoroutineContext().cancel() instead or specify the receiver of cancel() explicitly", replaceWith = @oi3(expression = "currentCoroutineContext().cancel(cause)", imports = {}))
    /* renamed from: a */
    public static final void m68786a(@vr2 o81<?> o81, @ss2 CancellationException cancellationException) {
        s81.m64333b1();
        throw new b02();
    }

    /* renamed from: b */
    public static /* synthetic */ void m68787b(o81 o81, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        m68786a(o81, cancellationException);
    }

    @vr2
    @xj0(level = ak0.ERROR, message = "Applying 'cancellable' to a SharedFlow has no effect. See the SharedFlow documentation on Operator Fusion.", replaceWith = @oi3(expression = "this", imports = {}))
    /* renamed from: c */
    public static final <T> m81<T> m68788c(@vr2 qx3<? extends T> qx3) {
        s81.m64333b1();
        throw new b02();
    }

    @xq1
    @xj0(level = ak0.WARNING, message = "SharedFlow never completes, so this operator typically has not effect, it can only catch exceptions from 'onSubscribe' operator", replaceWith = @oi3(expression = "this", imports = {}))
    /* renamed from: d */
    public static final <T> m81<T> m68789d(qx3<? extends T> qx3, uc1<? super o81<? super T>, ? super Throwable, ? super b80<? super un4>, ? extends Object> uc1) {
        return s81.m64393u(qx3, uc1);
    }

    @vr2
    @xj0(level = ak0.ERROR, message = "Applying 'conflate' to StateFlow has no effect. See the StateFlow documentation on Operator Fusion.", replaceWith = @oi3(expression = "this", imports = {}))
    /* renamed from: e */
    public static final <T> m81<T> m68790e(@vr2 d34<? extends T> d34) {
        s81.m64333b1();
        throw new b02();
    }

    @xq1
    @xj0(level = ak0.WARNING, message = "SharedFlow never completes, so this terminal operation never completes.")
    /* renamed from: f */
    public static final <T> Object m68791f(qx3<? extends T> qx3, b80<? super Integer> b80) {
        uq1.m67404e(0);
        Object Y = s81.m64321Y(qx3, b80);
        uq1.m67404e(1);
        return Y;
    }

    @vr2
    @xj0(level = ak0.ERROR, message = "Applying 'distinctUntilChanged' to StateFlow has no effect. See the StateFlow documentation on Operator Fusion.", replaceWith = @oi3(expression = "this", imports = {}))
    /* renamed from: g */
    public static final <T> m81<T> m68792g(@vr2 d34<? extends T> d34) {
        s81.m64333b1();
        throw new b02();
    }

    @vr2
    @xj0(level = ak0.ERROR, message = "Applying 'flowOn' to SharedFlow has no effect. See the SharedFlow documentation on Operator Fusion.", replaceWith = @oi3(expression = "this", imports = {}))
    /* renamed from: h */
    public static final <T> m81<T> m68793h(@vr2 qx3<? extends T> qx3, @vr2 b90 b90) {
        s81.m64333b1();
        throw new b02();
    }

    @vr2
    /* renamed from: i */
    public static final b90 m68794i(@vr2 o81<?> o81) {
        s81.m64333b1();
        throw new b02();
    }

    @xj0(level = ak0.ERROR, message = "coroutineContext is resolved into the property of outer CoroutineScope which is likely to be an error.Use currentCoroutineContext() instead or specify the receiver of coroutineContext explicitly", replaceWith = @oi3(expression = "currentCoroutineContext()", imports = {}))
    /* renamed from: j */
    public static /* synthetic */ void m68795j(o81 o81) {
    }

    /* renamed from: k */
    public static final boolean m68796k(@vr2 o81<?> o81) {
        s81.m64333b1();
        throw new b02();
    }

    @xj0(level = ak0.ERROR, message = "isActive is resolved into the extension of outer CoroutineScope which is likely to be an error.Use currentCoroutineContext().isActive or cancellable() operator instead or specify the receiver of isActive explicitly. Additionally, flow {} builder emissions are cancellable by default.", replaceWith = @oi3(expression = "currentCoroutineContext().isActive", imports = {}))
    /* renamed from: l */
    public static /* synthetic */ void m68797l(o81 o81) {
    }

    @xq1
    @xj0(level = ak0.WARNING, message = "SharedFlow never completes, so this operator has no effect.", replaceWith = @oi3(expression = "this", imports = {}))
    /* renamed from: m */
    public static final <T> m81<T> m68798m(qx3<? extends T> qx3, long j, sc1<? super Throwable, ? super b80<? super Boolean>, ? extends Object> sc1) {
        return s81.m64398v1(qx3, j, sc1);
    }

    /* renamed from: n */
    public static /* synthetic */ m81 m68799n(qx3 qx3, long j, sc1 sc1, int i, Object obj) {
        if ((i & 1) != 0) {
            j = Long.MAX_VALUE;
        }
        if ((i & 2) != 0) {
            sc1 = new C7130a((b80<? super C7130a>) null);
        }
        return s81.m64398v1(qx3, j, sc1);
    }

    @xq1
    @xj0(level = ak0.WARNING, message = "SharedFlow never completes, so this operator has no effect.", replaceWith = @oi3(expression = "this", imports = {}))
    /* renamed from: o */
    public static final <T> m81<T> m68800o(qx3<? extends T> qx3, vc1<? super o81<? super T>, ? super Throwable, ? super Long, ? super b80<? super Boolean>, ? extends Object> vc1) {
        return s81.m64404x1(qx3, vc1);
    }

    @xq1
    @xj0(level = ak0.WARNING, message = "SharedFlow never completes, so this terminal operation never completes.")
    /* renamed from: p */
    public static final <T> Object m68801p(qx3<? extends T> qx3, b80<? super List<? extends T>> b80) {
        uq1.m67404e(0);
        Object X1 = w81.m69209c(qx3, (List) null, b80, 1, (Object) null);
        uq1.m67404e(1);
        return X1;
    }

    @xq1
    @xj0(level = ak0.WARNING, message = "SharedFlow never completes, so this terminal operation never completes.")
    /* renamed from: q */
    public static final <T> Object m68802q(qx3<? extends T> qx3, b80<? super Set<? extends T>> b80) {
        uq1.m67404e(0);
        Object Z1 = w81.m69211e(qx3, (Set) null, b80, 1, (Object) null);
        uq1.m67404e(1);
        return Z1;
    }
}
