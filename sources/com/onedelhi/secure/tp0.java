package com.onedelhi.secure;

import java.util.Iterator;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B)\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¨\u0006\u000b"}, d2 = {"Lcom/onedelhi/secure/tp0;", "T", "Lcom/onedelhi/secure/zt3;", "", "iterator", "sequence", "Lkotlin/Function1;", "", "predicate", "<init>", "(Lcom/onedelhi/secure/zt3;Lcom/onedelhi/secure/ec1;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public final class tp0<T> implements zt3<T> {
    @vr2

    /* renamed from: a */
    public final ec1<T, Boolean> f35749a;
    @vr2

    /* renamed from: a */
    public final zt3<T> f35750a;

    @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0002\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\t\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00018\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0013\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0003\"\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/onedelhi/secure/tp0$a", "", "next", "()Ljava/lang/Object;", "", "hasNext", "Lcom/onedelhi/secure/un4;", "a", "iterator", "Ljava/util/Iterator;", "d", "()Ljava/util/Iterator;", "", "dropState", "I", "b", "()I", "h", "(I)V", "nextItem", "Ljava/lang/Object;", "f", "i", "(Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.tp0$a */
    public static final class C6894a implements Iterator<T>, nx1 {

        /* renamed from: a */
        public final /* synthetic */ tp0<T> f35751a;
        @ss2

        /* renamed from: a */
        public T f35752a;
        @vr2

        /* renamed from: a */
        public final Iterator<T> f35753a;

        /* renamed from: n */
        public int f35754n = -1;

        public C6894a(tp0<T> tp0) {
            this.f35751a = tp0;
            this.f35753a = tp0.f35750a.iterator();
        }

        /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo45209a() {
            /*
                r2 = this;
            L_0x0000:
                java.util.Iterator<T> r0 = r2.f35753a
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto L_0x0026
                java.util.Iterator<T> r0 = r2.f35753a
                java.lang.Object r0 = r0.next()
                com.onedelhi.secure.tp0<T> r1 = r2.f35751a
                com.onedelhi.secure.ec1 r1 = r1.f35749a
                java.lang.Object r1 = r1.mo17094X(r0)
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                if (r1 != 0) goto L_0x0000
                r2.f35752a = r0
                r0 = 1
            L_0x0023:
                r2.f35754n = r0
                return
            L_0x0026:
                r0 = 0
                goto L_0x0023
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.tp0.C6894a.mo45209a():void");
        }

        /* renamed from: b */
        public final int mo45210b() {
            return this.f35754n;
        }

        @vr2
        /* renamed from: d */
        public final Iterator<T> mo45211d() {
            return this.f35753a;
        }

        @ss2
        /* renamed from: f */
        public final T mo45212f() {
            return this.f35752a;
        }

        /* renamed from: h */
        public final void mo45213h(int i) {
            this.f35754n = i;
        }

        public boolean hasNext() {
            if (this.f35754n == -1) {
                mo45209a();
            }
            return this.f35754n == 1 || this.f35753a.hasNext();
        }

        /* renamed from: i */
        public final void mo45215i(@ss2 T t) {
            this.f35752a = t;
        }

        public T next() {
            if (this.f35754n == -1) {
                mo45209a();
            }
            if (this.f35754n != 1) {
                return this.f35753a.next();
            }
            T t = this.f35752a;
            this.f35752a = null;
            this.f35754n = 0;
            return t;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public tp0(@vr2 zt3<? extends T> zt3, @vr2 ec1<? super T, Boolean> ec1) {
        jt1.m53777p(zt3, "sequence");
        jt1.m53777p(ec1, "predicate");
        this.f35750a = zt3;
        this.f35749a = ec1;
    }

    @vr2
    public Iterator<T> iterator() {
        return new C6894a(this);
    }
}
