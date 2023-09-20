package com.onedelhi.secure;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B)\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¨\u0006\u000b"}, d2 = {"Lcom/onedelhi/secure/q94;", "T", "Lcom/onedelhi/secure/zt3;", "", "iterator", "sequence", "Lkotlin/Function1;", "", "predicate", "<init>", "(Lcom/onedelhi/secure/zt3;Lcom/onedelhi/secure/ec1;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public final class q94<T> implements zt3<T> {
    @vr2

    /* renamed from: a */
    public final ec1<T, Boolean> f34032a;
    @vr2

    /* renamed from: a */
    public final zt3<T> f34033a;

    @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0002\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\t\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00018\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0013\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0003\"\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/onedelhi/secure/q94$a", "", "next", "()Ljava/lang/Object;", "", "hasNext", "Lcom/onedelhi/secure/un4;", "a", "iterator", "Ljava/util/Iterator;", "b", "()Ljava/util/Iterator;", "", "nextState", "I", "f", "()I", "i", "(I)V", "nextItem", "Ljava/lang/Object;", "d", "h", "(Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.q94$a */
    public static final class C6524a implements Iterator<T>, nx1 {

        /* renamed from: a */
        public final /* synthetic */ q94<T> f34034a;
        @ss2

        /* renamed from: a */
        public T f34035a;
        @vr2

        /* renamed from: a */
        public final Iterator<T> f34036a;

        /* renamed from: n */
        public int f34037n = -1;

        public C6524a(q94<T> q94) {
            this.f34034a = q94;
            this.f34036a = q94.f34033a.iterator();
        }

        /* renamed from: a */
        public final void mo43245a() {
            if (this.f34036a.hasNext()) {
                T next = this.f34036a.next();
                if (((Boolean) this.f34034a.f34032a.mo17094X(next)).booleanValue()) {
                    this.f34037n = 1;
                    this.f34035a = next;
                    return;
                }
            }
            this.f34037n = 0;
        }

        @vr2
        /* renamed from: b */
        public final Iterator<T> mo43246b() {
            return this.f34036a;
        }

        @ss2
        /* renamed from: d */
        public final T mo43247d() {
            return this.f34035a;
        }

        /* renamed from: f */
        public final int mo43248f() {
            return this.f34037n;
        }

        /* renamed from: h */
        public final void mo43249h(@ss2 T t) {
            this.f34035a = t;
        }

        public boolean hasNext() {
            if (this.f34037n == -1) {
                mo43245a();
            }
            return this.f34037n == 1;
        }

        /* renamed from: i */
        public final void mo43251i(int i) {
            this.f34037n = i;
        }

        public T next() {
            if (this.f34037n == -1) {
                mo43245a();
            }
            if (this.f34037n != 0) {
                T t = this.f34035a;
                this.f34035a = null;
                this.f34037n = -1;
                return t;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public q94(@vr2 zt3<? extends T> zt3, @vr2 ec1<? super T, Boolean> ec1) {
        jt1.m53777p(zt3, "sequence");
        jt1.m53777p(ec1, "predicate");
        this.f34033a = zt3;
        this.f34032a = ec1;
    }

    @vr2
    public Iterator<T> iterator() {
        return new C6524a(this);
    }
}
