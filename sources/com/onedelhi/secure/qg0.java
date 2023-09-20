package com.onedelhi.secure;

import com.onedelhi.secure.C6708rs;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import okhttp3.Request;

public final class qg0 extends C6708rs.C6709a {
    @Nullable

    /* renamed from: a */
    public final Executor f34218a;

    /* renamed from: com.onedelhi.secure.qg0$a */
    public class C6570a implements C6708rs<Object, C6595qs<?>> {

        /* renamed from: a */
        public final /* synthetic */ Type f34220a;

        /* renamed from: a */
        public final /* synthetic */ Executor f34221a;

        public C6570a(Type type, Executor executor) {
            this.f34220a = type;
            this.f34221a = executor;
        }

        /* renamed from: b */
        public Type mo14261b() {
            return this.f34220a;
        }

        /* renamed from: c */
        public C6595qs<Object> mo14260a(C6595qs<Object> qsVar) {
            Executor executor = this.f34221a;
            return executor == null ? qsVar : new C6571b(executor, qsVar);
        }
    }

    /* renamed from: com.onedelhi.secure.qg0$b */
    public static final class C6571b<T> implements C6595qs<T> {

        /* renamed from: a */
        public final C6595qs<T> f34222a;

        /* renamed from: a */
        public final Executor f34223a;

        /* renamed from: com.onedelhi.secure.qg0$b$a */
        public class C6572a implements C7181ws<T> {

            /* renamed from: a */
            public final /* synthetic */ C7181ws f34225a;

            public C6572a(C7181ws wsVar) {
                this.f34225a = wsVar;
            }

            /* access modifiers changed from: private */
            /* renamed from: e */
            public /* synthetic */ void m62753e(C7181ws wsVar, Throwable th) {
                wsVar.mo8646a(C6571b.this, th);
            }

            /* access modifiers changed from: private */
            /* renamed from: f */
            public /* synthetic */ void m62754f(C7181ws wsVar, el3 el3) {
                if (C6571b.this.f34222a.isCanceled()) {
                    wsVar.mo8646a(C6571b.this, new IOException("Canceled"));
                } else {
                    wsVar.mo8647b(C6571b.this, el3);
                }
            }

            /* renamed from: a */
            public void mo8646a(C6595qs<T> qsVar, Throwable th) {
                C6571b.this.f34223a.execute(new sg0(this, this.f34225a, th));
            }

            /* renamed from: b */
            public void mo8647b(C6595qs<T> qsVar, el3<T> el3) {
                C6571b.this.f34223a.execute(new rg0(this, this.f34225a, el3));
            }
        }

        public C6571b(Executor executor, C6595qs<T> qsVar) {
            this.f34223a = executor;
            this.f34222a = qsVar;
        }

        /* renamed from: X6 */
        public C6595qs<T> clone() {
            return new C6571b(this.f34223a, this.f34222a.mo14263X6());
        }

        /* renamed from: Yb */
        public el3<T> mo14264Yb() throws IOException {
            return this.f34222a.mo14264Yb();
        }

        public void cancel() {
            this.f34222a.cancel();
        }

        public boolean isCanceled() {
            return this.f34222a.isCanceled();
        }

        public boolean isExecuted() {
            return this.f34222a.isExecuted();
        }

        /* renamed from: jh */
        public void mo14269jh(C7181ws<T> wsVar) {
            Objects.requireNonNull(wsVar, "callback == null");
            this.f34222a.mo14269jh(new C6572a(wsVar));
        }

        public Request request() {
            return this.f34222a.request();
        }

        public me4 timeout() {
            return this.f34222a.timeout();
        }
    }

    public qg0(@Nullable Executor executor) {
        this.f34218a = executor;
    }

    @Nullable
    /* renamed from: a */
    public C6708rs<?, ?> mo14257a(Type type, Annotation[] annotationArr, am3 am3) {
        Executor executor = null;
        if (C6708rs.C6709a.m63797c(type) != C6595qs.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type g = er4.m47220g(0, (ParameterizedType) type);
            if (!er4.m47225l(annotationArr, wz3.class)) {
                executor = this.f34218a;
            }
            return new C6570a(g, executor);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
