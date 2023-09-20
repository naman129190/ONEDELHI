package com.onedelhi.secure;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0002¨\u0006\u000e"}, d2 = {"Lcom/onedelhi/secure/p94;", "T", "Lcom/onedelhi/secure/zt3;", "Lcom/onedelhi/secure/sp0;", "", "n", "a", "b", "", "iterator", "sequence", "count", "<init>", "(Lcom/onedelhi/secure/zt3;I)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public final class p94<T> implements zt3<T>, sp0<T> {

    /* renamed from: a */
    public final int f33489a;
    @vr2

    /* renamed from: a */
    public final zt3<T> f33490a;

    @Metadata(bv = {}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0002\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\t\u0010\u0005\u001a\u00020\u0004H\u0002R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00018\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"com/onedelhi/secure/p94$a", "", "next", "()Ljava/lang/Object;", "", "hasNext", "", "left", "I", "b", "()I", "d", "(I)V", "iterator", "Ljava/util/Iterator;", "a", "()Ljava/util/Iterator;", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.p94$a */
    public static final class C6370a implements Iterator<T>, nx1 {
        @vr2

        /* renamed from: a */
        public final Iterator<T> f33491a;

        /* renamed from: n */
        public int f33492n;

        public C6370a(p94<T> p94) {
            this.f33492n = p94.f33489a;
            this.f33491a = p94.f33490a.iterator();
        }

        @vr2
        /* renamed from: a */
        public final Iterator<T> mo42398a() {
            return this.f33491a;
        }

        /* renamed from: b */
        public final int mo42399b() {
            return this.f33492n;
        }

        /* renamed from: d */
        public final void mo42400d(int i) {
            this.f33492n = i;
        }

        public boolean hasNext() {
            return this.f33492n > 0 && this.f33491a.hasNext();
        }

        public T next() {
            int i = this.f33492n;
            if (i != 0) {
                this.f33492n = i - 1;
                return this.f33491a.next();
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public p94(@vr2 zt3<? extends T> zt3, int i) {
        jt1.m53777p(zt3, "sequence");
        this.f33490a = zt3;
        this.f33489a = i;
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
        }
    }

    @vr2
    /* renamed from: a */
    public zt3<T> mo37858a(int i) {
        int i2 = this.f33489a;
        return i >= i2 ? fu3.m48489g() : new i64(this.f33490a, i, i2);
    }

    @vr2
    /* renamed from: b */
    public zt3<T> mo37859b(int i) {
        return i >= this.f33489a ? this : new p94(this.f33490a, i);
    }

    @vr2
    public Iterator<T> iterator() {
        return new C6370a(this);
    }
}
