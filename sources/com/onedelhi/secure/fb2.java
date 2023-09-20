package com.onedelhi.secure;

import android.os.Handler;
import android.os.Looper;
import com.onedelhi.secure.hl3;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class fb2<T> {

    /* renamed from: a */
    public static Executor f12004a = Executors.newCachedThreadPool();

    /* renamed from: a */
    public final Handler f12005a;
    @ts2

    /* renamed from: a */
    public volatile eb2<T> f12006a;

    /* renamed from: a */
    public final Set<xa2<T>> f12007a;

    /* renamed from: b */
    public final Set<xa2<Throwable>> f12008b;

    /* renamed from: com.onedelhi.secure.fb2$a */
    public class C2137a implements Runnable {
        public C2137a() {
        }

        public void run() {
            if (fb2.this.f12006a != null) {
                eb2 a = fb2.this.f12006a;
                if (a.mo15104b() != null) {
                    fb2.this.mo15939i(a.mo15104b());
                } else {
                    fb2.this.mo15937g(a.mo15103a());
                }
            }
        }
    }

    /* renamed from: com.onedelhi.secure.fb2$b */
    public class C2138b extends FutureTask<eb2<T>> {
        public C2138b(Callable<eb2<T>> callable) {
            super(callable);
        }

        public void done() {
            if (!isCancelled()) {
                try {
                    fb2.this.mo15942l((eb2) get());
                } catch (InterruptedException | ExecutionException e) {
                    fb2.this.mo15942l(new eb2(e));
                }
            }
        }
    }

    @hl3({hl3.C2354a.f13185a})
    public fb2(Callable<eb2<T>> callable) {
        this(callable, false);
    }

    @hl3({hl3.C2354a.f13185a})
    public fb2(Callable<eb2<T>> callable, boolean z) {
        this.f12007a = new LinkedHashSet(1);
        this.f12008b = new LinkedHashSet(1);
        this.f12005a = new Handler(Looper.getMainLooper());
        this.f12006a = null;
        if (z) {
            try {
                mo15942l(callable.call());
            } catch (Throwable th) {
                mo15942l(new eb2(th));
            }
        } else {
            f12004a.execute(new C2138b(callable));
        }
    }

    /* renamed from: e */
    public synchronized fb2<T> mo15935e(xa2<Throwable> xa2) {
        if (!(this.f12006a == null || this.f12006a.mo15103a() == null)) {
            xa2.onResult(this.f12006a.mo15103a());
        }
        this.f12008b.add(xa2);
        return this;
    }

    /* renamed from: f */
    public synchronized fb2<T> mo15936f(xa2<T> xa2) {
        if (!(this.f12006a == null || this.f12006a.mo15104b() == null)) {
            xa2.onResult(this.f12006a.mo15104b());
        }
        this.f12007a.add(xa2);
        return this;
    }

    /* renamed from: g */
    public final synchronized void mo15937g(Throwable th) {
        ArrayList<xa2> arrayList = new ArrayList<>(this.f12008b);
        if (arrayList.isEmpty()) {
            p92.m24545f("Lottie encountered an error but no failure listener was added:", th);
            return;
        }
        for (xa2 onResult : arrayList) {
            onResult.onResult(th);
        }
    }

    /* renamed from: h */
    public final void mo15938h() {
        this.f12005a.post(new C2137a());
    }

    /* renamed from: i */
    public final synchronized void mo15939i(T t) {
        for (xa2 onResult : new ArrayList(this.f12007a)) {
            onResult.onResult(t);
        }
    }

    /* renamed from: j */
    public synchronized fb2<T> mo15940j(xa2<Throwable> xa2) {
        this.f12008b.remove(xa2);
        return this;
    }

    /* renamed from: k */
    public synchronized fb2<T> mo15941k(xa2<T> xa2) {
        this.f12007a.remove(xa2);
        return this;
    }

    /* renamed from: l */
    public final void mo15942l(@ts2 eb2<T> eb2) {
        if (this.f12006a == null) {
            this.f12006a = eb2;
            mo15938h();
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }
}
