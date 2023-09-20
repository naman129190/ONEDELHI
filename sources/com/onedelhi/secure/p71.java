package com.onedelhi.secure;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004BC\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00050\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00020\u0005H\u0002¨\u0006\f"}, d2 = {"Lcom/onedelhi/secure/p71;", "T", "R", "E", "Lcom/onedelhi/secure/zt3;", "", "iterator", "sequence", "Lkotlin/Function1;", "transformer", "<init>", "(Lcom/onedelhi/secure/zt3;Lcom/onedelhi/secure/ec1;Lcom/onedelhi/secure/ec1;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public final class p71<T, R, E> implements zt3<E> {
    @vr2

    /* renamed from: a */
    public final ec1<T, R> f33476a;
    @vr2

    /* renamed from: a */
    public final zt3<T> f33477a;
    @vr2

    /* renamed from: b */
    public final ec1<R, Iterator<E>> f33478b;

    @Metadata(bv = {}, d1 = {"\u0000\u0015\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0002\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\t\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR*\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00018\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\n\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"com/onedelhi/secure/p71$a", "", "next", "()Ljava/lang/Object;", "", "hasNext", "a", "iterator", "Ljava/util/Iterator;", "d", "()Ljava/util/Iterator;", "itemIterator", "b", "f", "(Ljava/util/Iterator;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.p71$a */
    public static final class C6369a implements Iterator<E>, nx1 {

        /* renamed from: a */
        public final /* synthetic */ p71<T, R, E> f33479a;
        @vr2

        /* renamed from: a */
        public final Iterator<T> f33480a;
        @ss2

        /* renamed from: b */
        public Iterator<? extends E> f33481b;

        public C6369a(p71<T, R, E> p71) {
            this.f33479a = p71;
            this.f33480a = p71.f33477a.iterator();
        }

        /* renamed from: a */
        public final boolean mo42388a() {
            Iterator<? extends E> it = this.f33481b;
            if (it != null && !it.hasNext()) {
                this.f33481b = null;
            }
            while (true) {
                if (this.f33481b == null) {
                    if (this.f33480a.hasNext()) {
                        Iterator<? extends E> it2 = (Iterator) this.f33479a.f33478b.mo17094X(this.f33479a.f33476a.mo17094X(this.f33480a.next()));
                        if (it2.hasNext()) {
                            this.f33481b = it2;
                            break;
                        }
                    } else {
                        return false;
                    }
                } else {
                    break;
                }
            }
            return true;
        }

        @ss2
        /* renamed from: b */
        public final Iterator<E> mo42389b() {
            return this.f33481b;
        }

        @vr2
        /* renamed from: d */
        public final Iterator<T> mo42390d() {
            return this.f33480a;
        }

        /* renamed from: f */
        public final void mo42391f(@ss2 Iterator<? extends E> it) {
            this.f33481b = it;
        }

        public boolean hasNext() {
            return mo42388a();
        }

        public E next() {
            if (mo42388a()) {
                Iterator<? extends E> it = this.f33481b;
                jt1.m53774m(it);
                return it.next();
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public p71(@vr2 zt3<? extends T> zt3, @vr2 ec1<? super T, ? extends R> ec1, @vr2 ec1<? super R, ? extends Iterator<? extends E>> ec12) {
        jt1.m53777p(zt3, "sequence");
        jt1.m53777p(ec1, "transformer");
        jt1.m53777p(ec12, "iterator");
        this.f33477a = zt3;
        this.f33476a = ec1;
        this.f33478b = ec12;
    }

    @vr2
    public Iterator<E> iterator() {
        return new C6369a(this);
    }
}
