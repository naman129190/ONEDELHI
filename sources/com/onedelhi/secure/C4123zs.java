package com.onedelhi.secure;

import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.onedelhi.secure.zs */
public final class C4123zs {

    /* renamed from: com.onedelhi.secure.zs$a */
    public static final class C4124a<T> {

        /* renamed from: a */
        public bk3<Void> f23863a = bk3.m11940G();

        /* renamed from: a */
        public C4127d<T> f23864a;

        /* renamed from: a */
        public Object f23865a;

        /* renamed from: a */
        public boolean f23866a;

        /* renamed from: a */
        public void mo28081a(@mr2 Runnable runnable, @mr2 Executor executor) {
            bk3<Void> bk3 = this.f23863a;
            if (bk3 != null) {
                bk3.mo17486l(runnable, executor);
            }
        }

        /* renamed from: b */
        public void mo28082b() {
            this.f23865a = null;
            this.f23864a = null;
            this.f23863a.mo13747B(null);
        }

        /* renamed from: c */
        public boolean mo28083c(T t) {
            boolean z = true;
            this.f23866a = true;
            C4127d<T> dVar = this.f23864a;
            if (dVar == null || !dVar.mo28091b(t)) {
                z = false;
            }
            if (z) {
                mo28085e();
            }
            return z;
        }

        /* renamed from: d */
        public boolean mo28084d() {
            boolean z = true;
            this.f23866a = true;
            C4127d<T> dVar = this.f23864a;
            if (dVar == null || !dVar.mo28090a(true)) {
                z = false;
            }
            if (z) {
                mo28085e();
            }
            return z;
        }

        /* renamed from: e */
        public final void mo28085e() {
            this.f23865a = null;
            this.f23864a = null;
            this.f23863a = null;
        }

        /* renamed from: f */
        public boolean mo28086f(@mr2 Throwable th) {
            boolean z = true;
            this.f23866a = true;
            C4127d<T> dVar = this.f23864a;
            if (dVar == null || !dVar.mo28092c(th)) {
                z = false;
            }
            if (z) {
                mo28085e();
            }
            return z;
        }

        public void finalize() {
            bk3<Void> bk3;
            C4127d<T> dVar = this.f23864a;
            if (dVar != null && !dVar.isDone()) {
                dVar.mo28092c(new C4125b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f23865a));
            }
            if (!this.f23866a && (bk3 = this.f23863a) != null) {
                bk3.mo13747B(null);
            }
        }
    }

    /* renamed from: com.onedelhi.secure.zs$b */
    public static final class C4125b extends Throwable {
        public C4125b(String str) {
            super(str);
        }

        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* renamed from: com.onedelhi.secure.zs$c */
    public interface C4126c<T> {
        @ts2
        /* renamed from: a */
        Object mo28089a(@mr2 C4124a<T> aVar) throws Exception;
    }

    /* renamed from: com.onedelhi.secure.zs$d */
    public static final class C4127d<T> implements m42<T> {

        /* renamed from: a */
        public final C2382i1<T> f23867a = new C4128a();

        /* renamed from: a */
        public final WeakReference<C4124a<T>> f23868a;

        /* renamed from: com.onedelhi.secure.zs$d$a */
        public class C4128a extends C2382i1<T> {
            public C4128a() {
            }

            /* renamed from: y */
            public String mo17492y() {
                C4124a aVar = (C4124a) C4127d.this.f23868a.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + aVar.f23865a + "]";
            }
        }

        public C4127d(C4124a<T> aVar) {
            this.f23868a = new WeakReference<>(aVar);
        }

        /* renamed from: a */
        public boolean mo28090a(boolean z) {
            return this.f23867a.cancel(z);
        }

        /* renamed from: b */
        public boolean mo28091b(T t) {
            return this.f23867a.mo13747B(t);
        }

        /* renamed from: c */
        public boolean mo28092c(Throwable th) {
            return this.f23867a.mo13748C(th);
        }

        public boolean cancel(boolean z) {
            C4124a aVar = (C4124a) this.f23868a.get();
            boolean cancel = this.f23867a.cancel(z);
            if (cancel && aVar != null) {
                aVar.mo28082b();
            }
            return cancel;
        }

        public T get() throws InterruptedException, ExecutionException {
            return this.f23867a.get();
        }

        public T get(long j, @mr2 TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            return this.f23867a.get(j, timeUnit);
        }

        public boolean isCancelled() {
            return this.f23867a.isCancelled();
        }

        public boolean isDone() {
            return this.f23867a.isDone();
        }

        /* renamed from: l */
        public void mo17486l(@mr2 Runnable runnable, @mr2 Executor executor) {
            this.f23867a.mo17486l(runnable, executor);
        }

        public String toString() {
            return this.f23867a.toString();
        }
    }

    @mr2
    /* renamed from: a */
    public static <T> m42<T> m33348a(@mr2 C4126c<T> cVar) {
        C4124a aVar = new C4124a();
        C4127d<T> dVar = new C4127d<>(aVar);
        aVar.f23864a = dVar;
        aVar.f23865a = cVar.getClass();
        try {
            Object a = cVar.mo28089a(aVar);
            if (a != null) {
                aVar.f23865a = a;
            }
        } catch (Exception e) {
            dVar.mo28092c(e);
        }
        return dVar;
    }
}
