package com.onedelhi.secure;

import com.onedelhi.secure.f80;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B-\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H¤@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\tH@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\r\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\bJ\b\u0010\u000f\u001a\u00020\u000eH\u0016J)\u0010\u0012\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u0011\u001a\u00020\u0010H@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Lcom/onedelhi/secure/dw;", "S", "T", "Lcom/onedelhi/secure/zv;", "Lcom/onedelhi/secure/o81;", "collector", "Lcom/onedelhi/secure/un4;", "u", "(Lcom/onedelhi/secure/o81;Lcom/onedelhi/secure/b80;)Ljava/lang/Object;", "Lcom/onedelhi/secure/p53;", "scope", "h", "(Lcom/onedelhi/secure/p53;Lcom/onedelhi/secure/b80;)Ljava/lang/Object;", "a", "", "toString", "Lcom/onedelhi/secure/b90;", "newContext", "t", "(Lcom/onedelhi/secure/o81;Lcom/onedelhi/secure/b90;Lcom/onedelhi/secure/b80;)Ljava/lang/Object;", "Lcom/onedelhi/secure/m81;", "flow", "context", "", "capacity", "Lcom/onedelhi/secure/qo;", "onBufferOverflow", "<init>", "(Lcom/onedelhi/secure/m81;Lcom/onedelhi/secure/b90;ILcom/onedelhi/secure/qo;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: com.onedelhi.secure.dw */
public abstract class C5059dw<S, T> extends C7517zv<T> {
    @rw1
    @vr2

    /* renamed from: a */
    public final m81<S> f27627a;

    @cf0(mo32326c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", mo32327f = "ChannelFlow.kt", mo32328i = {}, mo32329l = {152}, mo32330m = "invokeSuspend", mo32331n = {}, mo32332s = {})
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H@"}, d2 = {"S", "T", "Lcom/onedelhi/secure/o81;", "it", "Lcom/onedelhi/secure/un4;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.dw$a */
    public static final class C5060a extends i84 implements sc1<o81<? super T>, b80<? super un4>, Object> {

        /* renamed from: a */
        public final /* synthetic */ C5059dw<S, T> f27628a;

        /* renamed from: a */
        public /* synthetic */ Object f27629a;

        /* renamed from: o */
        public int f27630o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5060a(C5059dw<S, T> dwVar, b80<? super C5060a> b80) {
            super(2, b80);
            this.f27628a = dwVar;
        }

        @vr2
        /* renamed from: B */
        public final b80<un4> mo22644B(@ss2 Object obj, @vr2 b80<?> b80) {
            C5060a aVar = new C5060a(this.f27628a, b80);
            aVar.f27629a = obj;
            return aVar;
        }

        @ss2
        /* renamed from: D */
        public final Object mo22645D(@vr2 Object obj) {
            Object h = mt1.m57558h();
            int i = this.f27630o;
            if (i == 0) {
                pl3.m61436n(obj);
                C5059dw<S, T> dwVar = this.f27628a;
                this.f27630o = 1;
                if (dwVar.mo34635u((o81) this.f27629a, this) == h) {
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
        public final Object mo21054h0(@vr2 o81<? super T> o81, @ss2 b80<? super un4> b80) {
            return ((C5060a) mo22644B(o81, b80)).mo22645D(un4.f36206a);
        }
    }

    public C5059dw(@vr2 m81<? extends S> m81, @vr2 b90 b90, int i, @vr2 C6593qo qoVar) {
        super(b90, i, qoVar);
        this.f27627a = m81;
    }

    /* renamed from: p */
    public static /* synthetic */ Object m45553p(C5059dw dwVar, o81 o81, b80 b80) {
        if (dwVar.f38445n == -3) {
            b90 f = b80.mo31187f();
            b90 plus = f.plus(dwVar.f38443a);
            if (jt1.m53768g(plus, f)) {
                Object u = dwVar.mo34635u(o81, b80);
                return u == mt1.m57558h() ? u : un4.f36206a;
            }
            f80.C5217b bVar = f80.f28189a;
            if (jt1.m53768g(plus.get(bVar), f.get(bVar))) {
                Object t = dwVar.mo34634t(o81, plus, b80);
                return t == mt1.m57558h() ? t : un4.f36206a;
            }
        }
        Object a = super.mo31451a(o81, b80);
        return a == mt1.m57558h() ? a : un4.f36206a;
    }

    /* renamed from: r */
    public static /* synthetic */ Object m45554r(C5059dw dwVar, p53 p53, b80 b80) {
        Object u = dwVar.mo34635u(new xt3(p53), b80);
        return u == mt1.m57558h() ? u : un4.f36206a;
    }

    @ss2
    /* renamed from: a */
    public Object mo31451a(@vr2 o81<? super T> o81, @vr2 b80<? super un4> b80) {
        return m45553p(this, o81, b80);
    }

    @ss2
    /* renamed from: h */
    public Object mo31218h(@vr2 p53<? super T> p53, @vr2 b80<? super un4> b80) {
        return m45554r(this, p53, b80);
    }

    /* renamed from: t */
    public final Object mo34634t(o81<? super T> o81, b90 b90, b80<? super un4> b80) {
        Object d = C4707bw.m40591d(b90, C4707bw.m40592e(o81, b80.mo31187f()), (Object) null, new C5060a(this, (b80<? super C5060a>) null), b80, 4, (Object) null);
        return d == mt1.m57558h() ? d : un4.f36206a;
    }

    @vr2
    public String toString() {
        return this.f27627a + " -> " + super.toString();
    }

    @ss2
    /* renamed from: u */
    public abstract Object mo34635u(@vr2 o81<? super T> o81, @vr2 b80<? super un4> b80);
}
