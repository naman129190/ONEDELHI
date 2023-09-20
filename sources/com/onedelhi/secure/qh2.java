package com.onedelhi.secure;

import java.util.Iterator;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004B=\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00020\u0005H\u0002¨\u0006\r"}, d2 = {"Lcom/onedelhi/secure/qh2;", "T1", "T2", "V", "Lcom/onedelhi/secure/zt3;", "", "iterator", "sequence1", "sequence2", "Lkotlin/Function2;", "transform", "<init>", "(Lcom/onedelhi/secure/zt3;Lcom/onedelhi/secure/zt3;Lcom/onedelhi/secure/sc1;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public final class qh2<T1, T2, V> implements zt3<V> {
    @vr2

    /* renamed from: a */
    public final sc1<T1, T2, V> f34226a;
    @vr2

    /* renamed from: a */
    public final zt3<T1> f34227a;
    @vr2

    /* renamed from: b */
    public final zt3<T2> f34228b;

    @Metadata(bv = {}, d1 = {"\u0000\u0015\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0002\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\t\u0010\u0005\u001a\u00020\u0004H\u0002R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00018\u0006¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"com/onedelhi/secure/qh2$a", "", "next", "()Ljava/lang/Object;", "", "hasNext", "iterator1", "Ljava/util/Iterator;", "a", "()Ljava/util/Iterator;", "iterator2", "b", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.qh2$a */
    public static final class C6573a implements Iterator<V>, nx1 {

        /* renamed from: a */
        public final /* synthetic */ qh2<T1, T2, V> f34229a;
        @vr2

        /* renamed from: a */
        public final Iterator<T1> f34230a;
        @vr2

        /* renamed from: b */
        public final Iterator<T2> f34231b;

        public C6573a(qh2<T1, T2, V> qh2) {
            this.f34229a = qh2;
            this.f34230a = qh2.f34227a.iterator();
            this.f34231b = qh2.f34228b.iterator();
        }

        @vr2
        /* renamed from: a */
        public final Iterator<T1> mo43529a() {
            return this.f34230a;
        }

        @vr2
        /* renamed from: b */
        public final Iterator<T2> mo43530b() {
            return this.f34231b;
        }

        public boolean hasNext() {
            return this.f34230a.hasNext() && this.f34231b.hasNext();
        }

        public V next() {
            return this.f34229a.f34226a.mo21054h0(this.f34230a.next(), this.f34231b.next());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public qh2(@vr2 zt3<? extends T1> zt3, @vr2 zt3<? extends T2> zt32, @vr2 sc1<? super T1, ? super T2, ? extends V> sc1) {
        jt1.m53777p(zt3, "sequence1");
        jt1.m53777p(zt32, "sequence2");
        jt1.m53777p(sc1, "transform");
        this.f34227a = zt3;
        this.f34228b = zt32;
        this.f34226a = sc1;
    }

    @vr2
    public Iterator<V> iterator() {
        return new C6573a(this);
    }
}
