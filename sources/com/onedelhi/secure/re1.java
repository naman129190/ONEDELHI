package com.onedelhi.secure;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B-\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0006\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0002¨\u0006\f"}, d2 = {"Lcom/onedelhi/secure/re1;", "", "T", "Lcom/onedelhi/secure/zt3;", "", "iterator", "Lkotlin/Function0;", "getInitialValue", "Lkotlin/Function1;", "getNextValue", "<init>", "(Lcom/onedelhi/secure/cc1;Lcom/onedelhi/secure/ec1;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public final class re1<T> implements zt3<T> {
    @vr2

    /* renamed from: a */
    public final cc1<T> f34593a;
    @vr2

    /* renamed from: a */
    public final ec1<T, T> f34594a;

    @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0002\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\t\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002R$\u0010\b\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u0003\"\u0004\b\u000b\u0010\fR\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"com/onedelhi/secure/re1$a", "", "next", "()Ljava/lang/Object;", "", "hasNext", "Lcom/onedelhi/secure/un4;", "a", "nextItem", "Ljava/lang/Object;", "b", "f", "(Ljava/lang/Object;)V", "", "nextState", "I", "d", "()I", "h", "(I)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.re1$a */
    public static final class C6683a implements Iterator<T>, nx1 {

        /* renamed from: a */
        public final /* synthetic */ re1<T> f34595a;
        @ss2

        /* renamed from: a */
        public T f34596a;

        /* renamed from: n */
        public int f34597n = -2;

        public C6683a(re1<T> re1) {
            this.f34595a = re1;
        }

        /* renamed from: a */
        public final void mo43866a() {
            T t;
            if (this.f34597n == -2) {
                t = this.f34595a.f34593a.invoke();
            } else {
                ec1 d = this.f34595a.f34594a;
                T t2 = this.f34596a;
                jt1.m53774m(t2);
                t = d.mo17094X(t2);
            }
            this.f34596a = t;
            this.f34597n = t == null ? 0 : 1;
        }

        @ss2
        /* renamed from: b */
        public final T mo43867b() {
            return this.f34596a;
        }

        /* renamed from: d */
        public final int mo43868d() {
            return this.f34597n;
        }

        /* renamed from: f */
        public final void mo43869f(@ss2 T t) {
            this.f34596a = t;
        }

        /* renamed from: h */
        public final void mo43870h(int i) {
            this.f34597n = i;
        }

        public boolean hasNext() {
            if (this.f34597n < 0) {
                mo43866a();
            }
            return this.f34597n == 1;
        }

        @vr2
        public T next() {
            if (this.f34597n < 0) {
                mo43866a();
            }
            if (this.f34597n != 0) {
                T t = this.f34596a;
                jt1.m53775n(t, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.f34597n = -1;
                return t;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public re1(@vr2 cc1<? extends T> cc1, @vr2 ec1<? super T, ? extends T> ec1) {
        jt1.m53777p(cc1, "getInitialValue");
        jt1.m53777p(ec1, "getNextValue");
        this.f34593a = cc1;
        this.f34594a = ec1;
    }

    @vr2
    public Iterator<T> iterator() {
        return new C6683a(this);
    }
}
