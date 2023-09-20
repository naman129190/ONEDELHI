package com.onedelhi.secure;

import com.onedelhi.secure.b90;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0018\u0010\u0004\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001\u001a\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u0005*\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0010\u001aP\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\u0004\b\u0000\u0010\b2/\b\u0005\u0010\u000e\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\t¢\u0006\u0002\b\rH\bø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lcom/onedelhi/secure/iq3;", "Lcom/onedelhi/secure/b90;", "currentContext", "Lcom/onedelhi/secure/un4;", "a", "Lcom/onedelhi/secure/ru1;", "collectJob", "b", "T", "Lkotlin/Function2;", "Lcom/onedelhi/secure/o81;", "Lcom/onedelhi/secure/b80;", "", "Lcom/onedelhi/secure/wy0;", "block", "Lcom/onedelhi/secure/m81;", "c", "(Lcom/onedelhi/secure/sc1;)Lcom/onedelhi/secure/m81;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class kq3 {

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "count", "Lcom/onedelhi/secure/b90$b;", "element", "a", "(ILcom/onedelhi/secure/b90$b;)Ljava/lang/Integer;"}, k = 3, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.kq3$a */
    public static final class C5927a extends d12 implements sc1<Integer, b90.C4634b, Integer> {

        /* renamed from: a */
        public final /* synthetic */ iq3<?> f31399a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5927a(iq3<?> iq3) {
            super(2);
            this.f31399a = iq3;
        }

        @vr2
        /* renamed from: a */
        public final Integer mo39402a(int i, @vr2 b90.C4634b bVar) {
            b90.C4636c key = bVar.getKey();
            b90.C4634b bVar2 = this.f31399a.f30418b.get(key);
            if (key != ru1.f34751a) {
                return Integer.valueOf(bVar != bVar2 ? Integer.MIN_VALUE : i + 1);
            }
            ru1 ru1 = (ru1) bVar2;
            ru1 b = kq3.m54834b((ru1) bVar, ru1);
            if (b == ru1) {
                if (ru1 != null) {
                    i++;
                }
                return Integer.valueOf(i);
            }
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + b + ", expected child of " + ru1 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
        }

        /* renamed from: h0 */
        public /* bridge */ /* synthetic */ Object mo21054h0(Object obj, Object obj2) {
            return mo39402a(((Number) obj).intValue(), (b90.C4634b) obj2);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"com/onedelhi/secure/kq3$b", "Lcom/onedelhi/secure/m81;", "Lcom/onedelhi/secure/o81;", "collector", "Lcom/onedelhi/secure/un4;", "a", "(Lcom/onedelhi/secure/o81;Lcom/onedelhi/secure/b80;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.kq3$b */
    public static final class C5928b implements m81<T> {

        /* renamed from: a */
        public final /* synthetic */ sc1<o81<? super T>, b80<? super un4>, Object> f31400a;

        @ii2(mo38106k = 3, mo38107mv = {1, 6, 0}, mo38109xi = 176)
        /* renamed from: com.onedelhi.secure.kq3$b$a */
        public static final class C5929a extends e80 {

            /* renamed from: a */
            public final /* synthetic */ C5928b f31401a;

            /* renamed from: a */
            public /* synthetic */ Object f31402a;

            /* renamed from: n */
            public int f31403n;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C5929a(C5928b bVar, b80<? super C5929a> b80) {
                super(b80);
                this.f31401a = bVar;
            }

            @ss2
            /* renamed from: D */
            public final Object mo22645D(@vr2 Object obj) {
                this.f31402a = obj;
                this.f31403n |= Integer.MIN_VALUE;
                return this.f31401a.mo31451a((o81) null, this);
            }
        }

        public C5928b(sc1<? super o81<? super T>, ? super b80<? super un4>, ? extends Object> sc1) {
            this.f31400a = sc1;
        }

        @ss2
        /* renamed from: a */
        public Object mo31451a(@vr2 o81<? super T> o81, @vr2 b80<? super un4> b80) {
            Object h0 = this.f31400a.mo21054h0(o81, b80);
            return h0 == mt1.m57558h() ? h0 : un4.f36206a;
        }

        @ss2
        /* renamed from: f */
        public Object mo39403f(@vr2 o81<? super T> o81, @vr2 b80<? super un4> b80) {
            uq1.m67404e(4);
            new C5929a(this, b80);
            uq1.m67404e(5);
            this.f31400a.mo21054h0(o81, b80);
            return un4.f36206a;
        }
    }

    @uw1(name = "checkContext")
    /* renamed from: a */
    public static final void m54833a(@vr2 iq3<?> iq3, @vr2 b90 b90) {
        if (((Number) b90.fold(0, new C5927a(iq3))).intValue() != iq3.f30421n) {
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + iq3.f30418b + ",\n\t\tbut emission happened in " + b90 + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
        }
    }

    @ss2
    /* renamed from: b */
    public static final ru1 m54834b(@ss2 ru1 ru1, @ss2 ru1 ru12) {
        while (ru1 != null) {
            if (ru1 == ru12 || !(ru1 instanceof js3)) {
                return ru1;
            }
            ru1 = ((js3) ru1).mo38841K1();
        }
        return null;
    }

    @vr2
    @z73
    /* renamed from: c */
    public static final <T> m81<T> m54835c(@C7381yp @vr2 sc1<? super o81<? super T>, ? super b80<? super un4>, ? extends Object> sc1) {
        return new C5928b(sc1);
    }
}
