package com.onedelhi.secure;

import android.annotation.SuppressLint;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

@SuppressLint({"RestrictedApi"})
public class xi0<V> extends C2382i1<V> implements ScheduledFuture<V> {

    /* renamed from: a */
    public final ScheduledFuture<?> f37478a;

    /* renamed from: com.onedelhi.secure.xi0$a */
    public class C7257a implements C7258b<V> {
        public C7257a() {
        }

        /* renamed from: a */
        public void mo47193a(Throwable th) {
            boolean unused = xi0.this.mo13748C(th);
        }

        public void set(V v) {
            boolean unused = xi0.this.mo13747B(v);
        }
    }

    /* renamed from: com.onedelhi.secure.xi0$b */
    public interface C7258b<T> {
        /* renamed from: a */
        void mo47193a(Throwable th);

        void set(T t);
    }

    /* renamed from: com.onedelhi.secure.xi0$c */
    public interface C7259c<T> {
        /* renamed from: a */
        ScheduledFuture<?> mo39264a(C7258b<T> bVar);
    }

    public xi0(C7259c<V> cVar) {
        this.f37478a = cVar.mo39264a(new C7257a());
    }

    /* renamed from: I */
    public int compareTo(Delayed delayed) {
        return this.f37478a.compareTo(delayed);
    }

    /* renamed from: b */
    public void mo17480b() {
        this.f37478a.cancel(mo17478F());
    }

    public long getDelay(TimeUnit timeUnit) {
        return this.f37478a.getDelay(timeUnit);
    }
}
