package com.onedelhi.secure;

import com.onedelhi.secure.C5945kw;
import com.onedelhi.secure.nl3;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a.\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"E", "Lcom/onedelhi/secure/st3;", "element", "Lcom/onedelhi/secure/kw;", "Lcom/onedelhi/secure/un4;", "b", "(Lcom/onedelhi/secure/st3;Ljava/lang/Object;)Ljava/lang/Object;", "a", "(Lcom/onedelhi/secure/st3;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/channels/ChannelsKt")
/* renamed from: com.onedelhi.secure.mw */
public final /* synthetic */ class C6148mw {

    @cf0(mo32326c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$sendBlocking$1", mo32327f = "Channels.kt", mo32328i = {}, mo32329l = {58}, mo32330m = "invokeSuspend", mo32331n = {}, mo32332s = {})
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@"}, d2 = {"E", "Lcom/onedelhi/secure/m90;", "Lcom/onedelhi/secure/un4;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.mw$a */
    public static final class C6149a extends i84 implements sc1<m90, b80<? super un4>, Object> {

        /* renamed from: a */
        public final /* synthetic */ st3<E> f32294a;

        /* renamed from: a */
        public final /* synthetic */ E f32295a;

        /* renamed from: o */
        public int f32296o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6149a(st3<? super E> st3, E e, b80<? super C6149a> b80) {
            super(2, b80);
            this.f32294a = st3;
            this.f32295a = e;
        }

        @vr2
        /* renamed from: B */
        public final b80<un4> mo22644B(@ss2 Object obj, @vr2 b80<?> b80) {
            return new C6149a(this.f32294a, this.f32295a, b80);
        }

        @ss2
        /* renamed from: D */
        public final Object mo22645D(@vr2 Object obj) {
            Object h = mt1.m57558h();
            int i = this.f32296o;
            if (i == 0) {
                pl3.m61436n(obj);
                st3<E> st3 = this.f32294a;
                E e = this.f32295a;
                this.f32296o = 1;
                if (st3.mo36801F(e, this) == h) {
                    return h;
                }
            } else if (i == 1) {
                pl3.m61436n(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return un4.f36206a;
        }

        @ss2
        /* renamed from: M */
        public final Object mo21054h0(@vr2 m90 m90, @ss2 b80<? super un4> b80) {
            return ((C6149a) mo22644B(m90, b80)).mo22645D(un4.f36206a);
        }
    }

    @cf0(mo32326c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2", mo32327f = "Channels.kt", mo32328i = {}, mo32329l = {39}, mo32330m = "invokeSuspend", mo32331n = {}, mo32332s = {})
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@"}, d2 = {"E", "Lcom/onedelhi/secure/m90;", "Lcom/onedelhi/secure/kw;", "Lcom/onedelhi/secure/un4;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.mw$b */
    public static final class C6150b extends i84 implements sc1<m90, b80<? super C5945kw<? extends un4>>, Object> {

        /* renamed from: a */
        public final /* synthetic */ st3<E> f32297a;

        /* renamed from: a */
        public /* synthetic */ Object f32298a;

        /* renamed from: b */
        public final /* synthetic */ E f32299b;

        /* renamed from: o */
        public int f32300o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6150b(st3<? super E> st3, E e, b80<? super C6150b> b80) {
            super(2, b80);
            this.f32297a = st3;
            this.f32299b = e;
        }

        @vr2
        /* renamed from: B */
        public final b80<un4> mo22644B(@ss2 Object obj, @vr2 b80<?> b80) {
            C6150b bVar = new C6150b(this.f32297a, this.f32299b, b80);
            bVar.f32298a = obj;
            return bVar;
        }

        @ss2
        /* renamed from: D */
        public final Object mo22645D(@vr2 Object obj) {
            Object obj2;
            Object h = mt1.m57558h();
            int i = this.f32300o;
            if (i == 0) {
                pl3.m61436n(obj);
                m90 m90 = (m90) this.f32298a;
                st3<E> st3 = this.f32297a;
                E e = this.f32299b;
                nl3.C6191a aVar = nl3.f32575a;
                this.f32300o = 1;
                if (st3.mo36801F(e, this) == h) {
                    return h;
                }
            } else if (i == 1) {
                try {
                    pl3.m61436n(obj);
                } catch (Throwable th) {
                    nl3.C6191a aVar2 = nl3.f32575a;
                    obj2 = nl3.m58187b(pl3.m61423a(th));
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj2 = nl3.m58187b(un4.f36206a);
            return C5945kw.m55065b(nl3.m58195j(obj2) ? C5945kw.f31471a.mo39550c(un4.f36206a) : C5945kw.f31471a.mo39548a(nl3.m58190e(obj2)));
        }

        @ss2
        /* renamed from: M */
        public final Object mo21054h0(@vr2 m90 m90, @ss2 b80<? super C5945kw<un4>> b80) {
            return ((C6150b) mo22644B(m90, b80)).mo22645D(un4.f36206a);
        }
    }

    @xj0(level = ak0.ERROR, message = "Deprecated in the favour of 'trySendBlocking'. Consider handling the result of 'trySendBlocking' explicitly and rethrow exception if necessary", replaceWith = @oi3(expression = "trySendBlocking(element)", imports = {}))
    /* renamed from: a */
    public static final <E> void m57643a(@vr2 st3<? super E> st3, E e) {
        if (!C5945kw.m55076m(st3.mo36811e(e))) {
            Object unused = C4588aq.m39010b((b90) null, new C6149a(st3, e, (b80<? super C6149a>) null), 1, (Object) null);
        }
    }

    @vr2
    /* renamed from: b */
    public static final <E> Object m57644b(@vr2 st3<? super E> st3, E e) {
        Object e2 = st3.mo36811e(e);
        if (e2 instanceof C5945kw.C5948c) {
            return ((C5945kw) C4588aq.m39010b((b90) null, new C6150b(st3, e, (b80<? super C6150b>) null), 1, (Object) null)).mo39543o();
        }
        un4 un4 = (un4) e2;
        return C5945kw.f31471a.mo39550c(un4.f36206a);
    }
}
