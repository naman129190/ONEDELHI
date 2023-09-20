package com.onedelhi.secure;

import java.util.Iterator;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0004H\u0002¨\u0006\t"}, d2 = {"Lcom/onedelhi/secure/fq1;", "T", "Lcom/onedelhi/secure/zt3;", "Lcom/onedelhi/secure/cq1;", "", "iterator", "sequence", "<init>", "(Lcom/onedelhi/secure/zt3;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public final class fq1<T> implements zt3<cq1<? extends T>> {
    @vr2

    /* renamed from: a */
    public final zt3<T> f28625a;

    @Metadata(bv = {}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0002J\t\u0010\u0005\u001a\u00020\u0004H\u0002R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00018\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"com/onedelhi/secure/fq1$a", "", "Lcom/onedelhi/secure/cq1;", "d", "", "hasNext", "iterator", "Ljava/util/Iterator;", "b", "()Ljava/util/Iterator;", "", "index", "I", "a", "()I", "f", "(I)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.fq1$a */
    public static final class C5300a implements Iterator<cq1<? extends T>>, nx1 {
        @vr2

        /* renamed from: a */
        public final Iterator<T> f28626a;

        /* renamed from: n */
        public int f28627n;

        public C5300a(fq1<T> fq1) {
            this.f28626a = fq1.f28625a.iterator();
        }

        /* renamed from: a */
        public final int mo36246a() {
            return this.f28627n;
        }

        @vr2
        /* renamed from: b */
        public final Iterator<T> mo36247b() {
            return this.f28626a;
        }

        @vr2
        /* renamed from: d */
        public cq1<T> next() {
            int i = this.f28627n;
            this.f28627n = i + 1;
            if (i < 0) {
                s00.m64055X();
            }
            return new cq1<>(i, this.f28626a.next());
        }

        /* renamed from: f */
        public final void mo36249f(int i) {
            this.f28627n = i;
        }

        public boolean hasNext() {
            return this.f28626a.hasNext();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public fq1(@vr2 zt3<? extends T> zt3) {
        jt1.m53777p(zt3, "sequence");
        this.f28625a = zt3;
    }

    @vr2
    public Iterator<cq1<T>> iterator() {
        return new C5300a(this);
    }
}
