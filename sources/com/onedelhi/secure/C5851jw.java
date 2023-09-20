package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B9\u0012\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00130\u0012\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016J&\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0014J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016J!\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lcom/onedelhi/secure/jw;", "T", "Lcom/onedelhi/secure/zv;", "Lcom/onedelhi/secure/b90;", "context", "", "capacity", "Lcom/onedelhi/secure/qo;", "onBufferOverflow", "i", "Lcom/onedelhi/secure/m90;", "scope", "Lcom/onedelhi/secure/lg3;", "n", "Lcom/onedelhi/secure/p53;", "Lcom/onedelhi/secure/un4;", "h", "(Lcom/onedelhi/secure/p53;Lcom/onedelhi/secure/b80;)Ljava/lang/Object;", "", "Lcom/onedelhi/secure/m81;", "flows", "<init>", "(Ljava/lang/Iterable;Lcom/onedelhi/secure/b90;ILcom/onedelhi/secure/qo;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: com.onedelhi.secure.jw */
public final class C5851jw<T> extends C7517zv<T> {
    @vr2

    /* renamed from: a */
    public final Iterable<m81<T>> f30963a;

    @cf0(mo32326c = "kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge$collectTo$2$1", mo32327f = "Merge.kt", mo32328i = {}, mo32329l = {96}, mo32330m = "invokeSuspend", mo32331n = {}, mo32332s = {})
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@"}, d2 = {"T", "Lcom/onedelhi/secure/m90;", "Lcom/onedelhi/secure/un4;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.jw$a */
    public static final class C5852a extends i84 implements sc1<m90, b80<? super un4>, Object> {

        /* renamed from: a */
        public final /* synthetic */ m81<T> f30964a;

        /* renamed from: a */
        public final /* synthetic */ xt3<T> f30965a;

        /* renamed from: o */
        public int f30966o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5852a(m81<? extends T> m81, xt3<T> xt3, b80<? super C5852a> b80) {
            super(2, b80);
            this.f30964a = m81;
            this.f30965a = xt3;
        }

        @vr2
        /* renamed from: B */
        public final b80<un4> mo22644B(@ss2 Object obj, @vr2 b80<?> b80) {
            return new C5852a(this.f30964a, this.f30965a, b80);
        }

        @ss2
        /* renamed from: D */
        public final Object mo22645D(@vr2 Object obj) {
            Object h = mt1.m57558h();
            int i = this.f30966o;
            if (i == 0) {
                pl3.m61436n(obj);
                m81<T> m81 = this.f30964a;
                xt3<T> xt3 = this.f30965a;
                this.f30966o = 1;
                if (m81.mo31451a(xt3, this) == h) {
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
            return ((C5852a) mo22644B(m90, b80)).mo22645D(un4.f36206a);
        }
    }

    public C5851jw(@vr2 Iterable<? extends m81<? extends T>> iterable, @vr2 b90 b90, int i, @vr2 C6593qo qoVar) {
        super(b90, i, qoVar);
        this.f30963a = iterable;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5851jw(Iterable iterable, b90 b90, int i, C6593qo qoVar, int i2, wg0 wg0) {
        this(iterable, (i2 & 2) != 0 ? gt0.f29313a : b90, (i2 & 4) != 0 ? -2 : i, (i2 & 8) != 0 ? C6593qo.SUSPEND : qoVar);
    }

    @ss2
    /* renamed from: h */
    public Object mo31218h(@vr2 p53<? super T> p53, @vr2 b80<? super un4> b80) {
        xt3 xt3 = new xt3(p53);
        for (m81<T> aVar : this.f30963a) {
            ru1 unused = C4690bq.m40250f(p53, (b90) null, (q90) null, new C5852a(aVar, xt3, (b80<? super C5852a>) null), 3, (Object) null);
        }
        return un4.f36206a;
    }

    @vr2
    /* renamed from: i */
    public C7517zv<T> mo31219i(@vr2 b90 b90, int i, @vr2 C6593qo qoVar) {
        return new C5851jw(this.f30963a, b90, i, qoVar);
    }

    @vr2
    /* renamed from: n */
    public lg3<T> mo33948n(@vr2 m90 m90) {
        return n53.m57908e(m90, this.f38443a, this.f38445n, mo48441k());
    }
}
