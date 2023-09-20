package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\u001aE\u0010\u0007\u001a\u0004\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u0000*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00032\u0006\u0010\u0004\u001a\u00028\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a?\u0010\u000b\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00032\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001aK\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00032\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000e\u0010\u000f**\b\u0000\u0010\u0010\u001a\u0004\b\u0000\u0010\u0000\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0011"}, d2 = {"E", "Lkotlin/Function1;", "Lcom/onedelhi/secure/un4;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "element", "Lcom/onedelhi/secure/mn4;", "undeliveredElementException", "c", "(Lcom/onedelhi/secure/ec1;Ljava/lang/Object;Lcom/onedelhi/secure/mn4;)Lcom/onedelhi/secure/mn4;", "Lcom/onedelhi/secure/b90;", "context", "b", "(Lcom/onedelhi/secure/ec1;Ljava/lang/Object;Lcom/onedelhi/secure/b90;)V", "", "a", "(Lcom/onedelhi/secure/ec1;Ljava/lang/Object;Lcom/onedelhi/secure/b90;)Lcom/onedelhi/secure/ec1;", "OnUndeliveredElement", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class qv2 {

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"E", "", "<anonymous parameter 0>", "Lcom/onedelhi/secure/un4;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.qv2$a */
    public static final class C6615a extends d12 implements ec1<Throwable, un4> {

        /* renamed from: a */
        public final /* synthetic */ b90 f34369a;

        /* renamed from: a */
        public final /* synthetic */ ec1<E, un4> f34370a;

        /* renamed from: a */
        public final /* synthetic */ E f34371a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6615a(ec1<? super E, un4> ec1, E e, b90 b90) {
            super(1);
            this.f34370a = ec1;
            this.f34371a = e;
            this.f34369a = b90;
        }

        /* renamed from: X */
        public /* bridge */ /* synthetic */ Object mo17094X(Object obj) {
            mo43733a((Throwable) obj);
            return un4.f36206a;
        }

        /* renamed from: a */
        public final void mo43733a(@vr2 Throwable th) {
            qv2.m63197b(this.f34370a, this.f34371a, this.f34369a);
        }
    }

    @vr2
    /* renamed from: a */
    public static final <E> ec1<Throwable, un4> m63196a(@vr2 ec1<? super E, un4> ec1, E e, @vr2 b90 b90) {
        return new C6615a(ec1, e, b90);
    }

    /* renamed from: b */
    public static final <E> void m63197b(@vr2 ec1<? super E, un4> ec1, E e, @vr2 b90 b90) {
        mn4 c = m63198c(ec1, e, (mn4) null);
        if (c != null) {
            h90.m50304b(b90, c);
        }
    }

    @ss2
    /* renamed from: c */
    public static final <E> mn4 m63198c(@vr2 ec1<? super E, un4> ec1, E e, @ss2 mn4 mn4) {
        try {
            ec1.mo17094X(e);
        } catch (Throwable th) {
            if (mn4 == null || mn4.getCause() == th) {
                return new mn4(jt1.m53745C("Exception in undelivered element handler for ", e), th);
            }
            pw0.m61687a(mn4, th);
        }
        return mn4;
    }

    /* renamed from: d */
    public static /* synthetic */ mn4 m63199d(ec1 ec1, Object obj, mn4 mn4, int i, Object obj2) {
        if ((i & 2) != 0) {
            mn4 = null;
        }
        return m63198c(ec1, obj, mn4);
    }
}
