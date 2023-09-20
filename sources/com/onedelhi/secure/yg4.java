package com.onedelhi.secure;

import java.util.Iterator;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B)\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0002J5\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0002\u0010\u00062\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00040\u0007H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/onedelhi/secure/yg4;", "T", "R", "Lcom/onedelhi/secure/zt3;", "", "iterator", "E", "Lkotlin/Function1;", "e", "(Lcom/onedelhi/secure/ec1;)Lcom/onedelhi/secure/zt3;", "sequence", "transformer", "<init>", "(Lcom/onedelhi/secure/zt3;Lcom/onedelhi/secure/ec1;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public final class yg4<T, R> implements zt3<R> {
    @vr2

    /* renamed from: a */
    public final ec1<T, R> f37914a;
    @vr2

    /* renamed from: a */
    public final zt3<T> f37915a;

    @Metadata(bv = {}, d1 = {"\u0000\u0015\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0002\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\t\u0010\u0005\u001a\u00020\u0004H\u0002R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/onedelhi/secure/yg4$a", "", "next", "()Ljava/lang/Object;", "", "hasNext", "iterator", "Ljava/util/Iterator;", "a", "()Ljava/util/Iterator;", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.yg4$a */
    public static final class C7359a implements Iterator<R>, nx1 {

        /* renamed from: a */
        public final /* synthetic */ yg4<T, R> f37916a;
        @vr2

        /* renamed from: a */
        public final Iterator<T> f37917a;

        public C7359a(yg4<T, R> yg4) {
            this.f37916a = yg4;
            this.f37917a = yg4.f37915a.iterator();
        }

        @vr2
        /* renamed from: a */
        public final Iterator<T> mo47802a() {
            return this.f37917a;
        }

        public boolean hasNext() {
            return this.f37917a.hasNext();
        }

        public R next() {
            return this.f37916a.f37914a.mo17094X(this.f37917a.next());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public yg4(@vr2 zt3<? extends T> zt3, @vr2 ec1<? super T, ? extends R> ec1) {
        jt1.m53777p(zt3, "sequence");
        jt1.m53777p(ec1, "transformer");
        this.f37915a = zt3;
        this.f37914a = ec1;
    }

    @vr2
    /* renamed from: e */
    public final <E> zt3<E> mo47801e(@vr2 ec1<? super R, ? extends Iterator<? extends E>> ec1) {
        jt1.m53777p(ec1, "iterator");
        return new p71(this.f37915a, this.f37914a, ec1);
    }

    @vr2
    public Iterator<R> iterator() {
        return new C7359a(this);
    }
}
