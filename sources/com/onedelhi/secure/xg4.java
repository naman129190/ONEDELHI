package com.onedelhi.secure;

import java.util.Iterator;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B/\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0002¨\u0006\f"}, d2 = {"Lcom/onedelhi/secure/xg4;", "T", "R", "Lcom/onedelhi/secure/zt3;", "", "iterator", "sequence", "Lkotlin/Function2;", "", "transformer", "<init>", "(Lcom/onedelhi/secure/zt3;Lcom/onedelhi/secure/sc1;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public final class xg4<T, R> implements zt3<R> {
    @vr2

    /* renamed from: a */
    public final sc1<Integer, T, R> f37470a;
    @vr2

    /* renamed from: a */
    public final zt3<T> f37471a;

    @Metadata(bv = {}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0002\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\t\u0010\u0005\u001a\u00020\u0004H\u0002R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"com/onedelhi/secure/xg4$a", "", "next", "()Ljava/lang/Object;", "", "hasNext", "iterator", "Ljava/util/Iterator;", "b", "()Ljava/util/Iterator;", "", "index", "I", "a", "()I", "d", "(I)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.xg4$a */
    public static final class C7253a implements Iterator<R>, nx1 {

        /* renamed from: a */
        public final /* synthetic */ xg4<T, R> f37472a;
        @vr2

        /* renamed from: a */
        public final Iterator<T> f37473a;

        /* renamed from: n */
        public int f37474n;

        public C7253a(xg4<T, R> xg4) {
            this.f37472a = xg4;
            this.f37473a = xg4.f37471a.iterator();
        }

        /* renamed from: a */
        public final int mo47178a() {
            return this.f37474n;
        }

        @vr2
        /* renamed from: b */
        public final Iterator<T> mo47179b() {
            return this.f37473a;
        }

        /* renamed from: d */
        public final void mo47180d(int i) {
            this.f37474n = i;
        }

        public boolean hasNext() {
            return this.f37473a.hasNext();
        }

        public R next() {
            sc1 d = this.f37472a.f37470a;
            int i = this.f37474n;
            this.f37474n = i + 1;
            if (i < 0) {
                s00.m64055X();
            }
            return d.mo21054h0(Integer.valueOf(i), this.f37473a.next());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public xg4(@vr2 zt3<? extends T> zt3, @vr2 sc1<? super Integer, ? super T, ? extends R> sc1) {
        jt1.m53777p(zt3, "sequence");
        jt1.m53777p(sc1, "transformer");
        this.f37471a = zt3;
        this.f37470a = sc1;
    }

    @vr2
    public Iterator<R> iterator() {
        return new C7253a(this);
    }
}
