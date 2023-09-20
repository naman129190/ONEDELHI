package com.onedelhi.secure;

import com.onedelhi.secure.C6723rz;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class y33<T extends C6723rz> implements C6088m4<T> {

    /* renamed from: a */
    public final C6088m4<T> f37782a;

    /* renamed from: a */
    public final mb2<Integer, Set<? extends C6622qz<T>>> f37783a = new mb2<>(5);

    /* renamed from: a */
    public final ReadWriteLock f37784a = new ReentrantReadWriteLock();

    /* renamed from: com.onedelhi.secure.y33$a */
    public class C7302a implements Runnable {

        /* renamed from: n */
        public final int f37786n;

        public C7302a(int i) {
            this.f37786n = i;
        }

        public void run() {
            try {
                Thread.sleep((long) ((Math.random() * 500.0d) + 500.0d));
            } catch (InterruptedException unused) {
            }
            Set unused2 = y33.this.mo47572i(this.f37786n);
        }
    }

    public y33(C6088m4<T> m4Var) {
        this.f37782a = m4Var;
    }

    /* renamed from: b */
    public Collection<T> mo39419b() {
        return this.f37782a.mo39419b();
    }

    /* renamed from: c */
    public void mo39420c(T t) {
        this.f37782a.mo39420c(t);
        mo47571h();
    }

    /* renamed from: d */
    public void mo39421d(T t) {
        this.f37782a.mo39421d(t);
        mo47571h();
    }

    /* renamed from: e */
    public void mo39422e() {
        this.f37782a.mo39422e();
        mo47571h();
    }

    /* renamed from: f */
    public Set<? extends C6622qz<T>> mo39423f(double d) {
        int i = (int) d;
        Set<? extends C6622qz<T>> i2 = mo47572i(i);
        int i3 = i + 1;
        if (this.f37783a.mo20268f(Integer.valueOf(i3)) == null) {
            new Thread(new C7302a(i3)).start();
        }
        int i4 = i - 1;
        if (this.f37783a.mo20268f(Integer.valueOf(i4)) == null) {
            new Thread(new C7302a(i4)).start();
        }
        return i2;
    }

    /* renamed from: g */
    public void mo39424g(Collection<T> collection) {
        this.f37782a.mo39424g(collection);
        mo47571h();
    }

    /* renamed from: h */
    public final void mo47571h() {
        this.f37783a.mo20266d();
    }

    /* renamed from: i */
    public final Set<? extends C6622qz<T>> mo47572i(int i) {
        this.f37784a.readLock().lock();
        Set<? extends C6622qz<T>> f = this.f37783a.mo20268f(Integer.valueOf(i));
        this.f37784a.readLock().unlock();
        if (f == null) {
            this.f37784a.writeLock().lock();
            f = this.f37783a.mo20268f(Integer.valueOf(i));
            if (f == null) {
                f = this.f37782a.mo39423f((double) i);
                this.f37783a.mo20272j(Integer.valueOf(i), f);
            }
            this.f37784a.writeLock().unlock();
        }
        return f;
    }
}
