package com.onedelhi.secure;

import com.onedelhi.secure.C6708rs;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

@IgnoreJRERequirement
public final class i20 extends C6708rs.C6709a {

    /* renamed from: a */
    public static final C6708rs.C6709a f30047a = new i20();

    @IgnoreJRERequirement
    /* renamed from: com.onedelhi.secure.i20$a */
    public static final class C5653a<R> implements C6708rs<R, CompletableFuture<R>> {

        /* renamed from: a */
        public final Type f30048a;

        @IgnoreJRERequirement
        /* renamed from: com.onedelhi.secure.i20$a$a */
        public class C5654a implements C7181ws<R> {

            /* renamed from: a */
            public final CompletableFuture<R> f30050a;

            public C5654a(CompletableFuture<R> completableFuture) {
                this.f30050a = completableFuture;
            }

            /* renamed from: a */
            public void mo8646a(C6595qs<R> qsVar, Throwable th) {
                this.f30050a.completeExceptionally(th);
            }

            /* renamed from: b */
            public void mo8647b(C6595qs<R> qsVar, el3<R> el3) {
                if (el3.mo35472g()) {
                    this.f30050a.complete(el3.mo35468a());
                } else {
                    this.f30050a.completeExceptionally(new km1(el3));
                }
            }
        }

        public C5653a(Type type) {
            this.f30048a = type;
        }

        /* renamed from: b */
        public Type mo14261b() {
            return this.f30048a;
        }

        /* renamed from: c */
        public CompletableFuture<R> mo14260a(C6595qs<R> qsVar) {
            C5655b bVar = new C5655b(qsVar);
            qsVar.mo14269jh(new C5654a(bVar));
            return bVar;
        }
    }

    @IgnoreJRERequirement
    /* renamed from: com.onedelhi.secure.i20$b */
    public static final class C5655b<T> extends CompletableFuture<T> {

        /* renamed from: a */
        public final C6595qs<?> f30051a;

        public C5655b(C6595qs<?> qsVar) {
            this.f30051a = qsVar;
        }

        public boolean cancel(boolean z) {
            if (z) {
                this.f30051a.cancel();
            }
            return super.cancel(z);
        }
    }

    @IgnoreJRERequirement
    /* renamed from: com.onedelhi.secure.i20$c */
    public static final class C5656c<R> implements C6708rs<R, CompletableFuture<el3<R>>> {

        /* renamed from: a */
        public final Type f30052a;

        @IgnoreJRERequirement
        /* renamed from: com.onedelhi.secure.i20$c$a */
        public class C5657a implements C7181ws<R> {

            /* renamed from: a */
            public final CompletableFuture<el3<R>> f30054a;

            public C5657a(CompletableFuture<el3<R>> completableFuture) {
                this.f30054a = completableFuture;
            }

            /* renamed from: a */
            public void mo8646a(C6595qs<R> qsVar, Throwable th) {
                this.f30054a.completeExceptionally(th);
            }

            /* renamed from: b */
            public void mo8647b(C6595qs<R> qsVar, el3<R> el3) {
                this.f30054a.complete(el3);
            }
        }

        public C5656c(Type type) {
            this.f30052a = type;
        }

        /* renamed from: b */
        public Type mo14261b() {
            return this.f30052a;
        }

        /* renamed from: c */
        public CompletableFuture<el3<R>> mo14260a(C6595qs<R> qsVar) {
            C5655b bVar = new C5655b(qsVar);
            qsVar.mo14269jh(new C5657a(bVar));
            return bVar;
        }
    }

    @Nullable
    /* renamed from: a */
    public C6708rs<?, ?> mo14257a(Type type, Annotation[] annotationArr, am3 am3) {
        if (C6708rs.C6709a.m63797c(type) != CompletableFuture.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type b = C6708rs.C6709a.m63796b(0, (ParameterizedType) type);
            if (C6708rs.C6709a.m63797c(b) != el3.class) {
                return new C5653a(b);
            }
            if (b instanceof ParameterizedType) {
                return new C5656c(C6708rs.C6709a.m63796b(0, (ParameterizedType) b));
            }
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
    }
}
