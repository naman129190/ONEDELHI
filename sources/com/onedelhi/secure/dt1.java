package com.onedelhi.secure;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a1\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0007\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¢\u0006\u0004\b\b\u0010\t\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"T", "Lcom/onedelhi/secure/b90;", "context", "Lkotlin/Function0;", "block", "b", "(Lcom/onedelhi/secure/b90;Lcom/onedelhi/secure/cc1;Lcom/onedelhi/secure/b80;)Ljava/lang/Object;", "coroutineContext", "d", "(Lcom/onedelhi/secure/b90;Lcom/onedelhi/secure/cc1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class dt1 {

    /* renamed from: a */
    public static final int f27611a = 0;

    /* renamed from: b */
    public static final int f27612b = 1;

    /* renamed from: c */
    public static final int f27613c = 2;

    /* renamed from: d */
    public static final int f27614d = 3;

    @cf0(mo32326c = "kotlinx.coroutines.InterruptibleKt$runInterruptible$2", mo32327f = "Interruptible.kt", mo32328i = {}, mo32329l = {}, mo32330m = "invokeSuspend", mo32331n = {}, mo32332s = {})
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@"}, d2 = {"T", "Lcom/onedelhi/secure/m90;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.dt1$a */
    public static final class C5055a extends i84 implements sc1<m90, b80<? super T>, Object> {

        /* renamed from: a */
        public final /* synthetic */ cc1<T> f27615a;

        /* renamed from: a */
        public /* synthetic */ Object f27616a;

        /* renamed from: o */
        public int f27617o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5055a(cc1<? extends T> cc1, b80<? super C5055a> b80) {
            super(2, b80);
            this.f27615a = cc1;
        }

        @vr2
        /* renamed from: B */
        public final b80<un4> mo22644B(@ss2 Object obj, @vr2 b80<?> b80) {
            C5055a aVar = new C5055a(this.f27615a, b80);
            aVar.f27616a = obj;
            return aVar;
        }

        @ss2
        /* renamed from: D */
        public final Object mo22645D(@vr2 Object obj) {
            mt1.m57558h();
            if (this.f27617o == 0) {
                pl3.m61436n(obj);
                return dt1.m45534d(((m90) this.f27616a).mo39612u(), this.f27615a);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @ss2
        /* renamed from: M */
        public final Object mo21054h0(@vr2 m90 m90, @ss2 b80<? super T> b80) {
            return ((C5055a) mo22644B(m90, b80)).mo22645D(un4.f36206a);
        }
    }

    @ss2
    /* renamed from: b */
    public static final <T> Object m45532b(@vr2 b90 b90, @vr2 cc1<? extends T> cc1, @vr2 b80<? super T> b80) {
        return C7511zp.m74222h(b90, new C5055a(cc1, (b80<? super C5055a>) null), b80);
    }

    /* renamed from: c */
    public static /* synthetic */ Object m45533c(b90 b90, cc1 cc1, b80 b80, int i, Object obj) {
        if ((i & 1) != 0) {
            b90 = gt0.f29313a;
        }
        return m45532b(b90, cc1, b80);
    }

    /* renamed from: d */
    public static final <T> T m45534d(b90 b90, cc1<? extends T> cc1) {
        fc4 fc4;
        try {
            fc4 = new fc4(xu1.m70805B(b90));
            fc4.mo35847d();
            T invoke = cc1.invoke();
            fc4.mo35844a();
            return invoke;
        } catch (InterruptedException e) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e);
        } catch (Throwable th) {
            fc4.mo35844a();
            throw th;
        }
    }
}
