package com.onedelhi.secure;

import java.util.Iterator;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0002¨\u0006\u000e"}, d2 = {"Lcom/onedelhi/secure/rp0;", "T", "Lcom/onedelhi/secure/zt3;", "Lcom/onedelhi/secure/sp0;", "", "n", "a", "b", "", "iterator", "sequence", "count", "<init>", "(Lcom/onedelhi/secure/zt3;I)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public final class rp0<T> implements zt3<T>, sp0<T> {

    /* renamed from: a */
    public final int f34703a;
    @vr2

    /* renamed from: a */
    public final zt3<T> f34704a;

    @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0002\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\t\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00018\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"com/onedelhi/secure/rp0$a", "", "next", "()Ljava/lang/Object;", "", "hasNext", "Lcom/onedelhi/secure/un4;", "a", "iterator", "Ljava/util/Iterator;", "b", "()Ljava/util/Iterator;", "", "left", "I", "d", "()I", "f", "(I)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.rp0$a */
    public static final class C6707a implements Iterator<T>, nx1 {
        @vr2

        /* renamed from: a */
        public final Iterator<T> f34705a;

        /* renamed from: n */
        public int f34706n;

        public C6707a(rp0<T> rp0) {
            this.f34705a = rp0.f34704a.iterator();
            this.f34706n = rp0.f34703a;
        }

        /* renamed from: a */
        public final void mo43970a() {
            while (this.f34706n > 0 && this.f34705a.hasNext()) {
                this.f34705a.next();
                this.f34706n--;
            }
        }

        @vr2
        /* renamed from: b */
        public final Iterator<T> mo43971b() {
            return this.f34705a;
        }

        /* renamed from: d */
        public final int mo43972d() {
            return this.f34706n;
        }

        /* renamed from: f */
        public final void mo43973f(int i) {
            this.f34706n = i;
        }

        public boolean hasNext() {
            mo43970a();
            return this.f34705a.hasNext();
        }

        public T next() {
            mo43970a();
            return this.f34705a.next();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public rp0(@vr2 zt3<? extends T> zt3, int i) {
        jt1.m53777p(zt3, "sequence");
        this.f34704a = zt3;
        this.f34703a = i;
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
        }
    }

    @vr2
    /* renamed from: a */
    public zt3<T> mo37858a(int i) {
        int i2 = this.f34703a + i;
        return i2 < 0 ? new rp0(this, i) : new rp0(this.f34704a, i2);
    }

    @vr2
    /* renamed from: b */
    public zt3<T> mo37859b(int i) {
        int i2 = this.f34703a;
        int i3 = i2 + i;
        return i3 < 0 ? new p94(this, i) : new i64(this.f34704a, i2, i3);
    }

    @vr2
    public Iterator<T> iterator() {
        return new C6707a(this);
    }
}
