package com.onedelhi.secure;

import java.util.Queue;

public class qj2<A, B> {

    /* renamed from: a */
    public static final int f19195a = 250;

    /* renamed from: a */
    public final lb2<C3307b<A>, B> f19196a;

    /* renamed from: com.onedelhi.secure.qj2$a */
    public class C3306a extends lb2<C3307b<A>, B> {
        public C3306a(long j) {
            super(j);
        }

        /* renamed from: r */
        public void mo19408n(@mr2 C3307b<A> bVar, @ts2 B b) {
            bVar.mo23194c();
        }
    }

    @hw4
    /* renamed from: com.onedelhi.secure.qj2$b */
    public static final class C3307b<A> {

        /* renamed from: a */
        public static final Queue<C3307b<?>> f19198a = oq4.m24018f(0);

        /* renamed from: a */
        public int f19199a;

        /* renamed from: a */
        public A f19200a;

        /* renamed from: b */
        public int f19201b;

        /* renamed from: a */
        public static <A> C3307b<A> m25777a(A a, int i, int i2) {
            C3307b<A> poll;
            Queue<C3307b<?>> queue = f19198a;
            synchronized (queue) {
                poll = queue.poll();
            }
            if (poll == null) {
                poll = new C3307b<>();
            }
            poll.mo23193b(a, i, i2);
            return poll;
        }

        /* renamed from: b */
        public final void mo23193b(A a, int i, int i2) {
            this.f19200a = a;
            this.f19201b = i;
            this.f19199a = i2;
        }

        /* renamed from: c */
        public void mo23194c() {
            Queue<C3307b<?>> queue = f19198a;
            synchronized (queue) {
                queue.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C3307b)) {
                return false;
            }
            C3307b bVar = (C3307b) obj;
            return this.f19201b == bVar.f19201b && this.f19199a == bVar.f19199a && this.f19200a.equals(bVar.f19200a);
        }

        public int hashCode() {
            return (((this.f19199a * 31) + this.f19201b) * 31) + this.f19200a.hashCode();
        }
    }

    public qj2() {
        this(250);
    }

    public qj2(long j) {
        this.f19196a = new C3306a(j);
    }

    /* renamed from: a */
    public void mo23189a() {
        this.f19196a.mo19399b();
    }

    @ts2
    /* renamed from: b */
    public B mo23190b(A a, int i, int i2) {
        C3307b a2 = C3307b.m25777a(a, i, i2);
        B k = this.f19196a.mo19405k(a2);
        a2.mo23194c();
        return k;
    }

    /* renamed from: c */
    public void mo23191c(A a, int i, int i2, B b) {
        this.f19196a.mo19409o(C3307b.m25777a(a, i, i2), b);
    }
}
