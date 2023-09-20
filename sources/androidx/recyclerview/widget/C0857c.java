package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C0898i;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: androidx.recyclerview.widget.c */
public final class C0857c<T> {
    @mr2

    /* renamed from: a */
    public final C0898i.C0904f<T> f4798a;
    @ts2

    /* renamed from: a */
    public final Executor f4799a;
    @mr2

    /* renamed from: b */
    public final Executor f4800b;

    /* renamed from: androidx.recyclerview.widget.c$a */
    public static final class C0858a<T> {

        /* renamed from: a */
        public static final Object f4801a = new Object();

        /* renamed from: c */
        public static Executor f4802c;

        /* renamed from: a */
        public final C0898i.C0904f<T> f4803a;
        @ts2

        /* renamed from: a */
        public Executor f4804a;

        /* renamed from: b */
        public Executor f4805b;

        public C0858a(@mr2 C0898i.C0904f<T> fVar) {
            this.f4803a = fVar;
        }

        @mr2
        /* renamed from: a */
        public C0857c<T> mo6157a() {
            if (this.f4805b == null) {
                synchronized (f4801a) {
                    if (f4802c == null) {
                        f4802c = Executors.newFixedThreadPool(2);
                    }
                }
                this.f4805b = f4802c;
            }
            return new C0857c<>(this.f4804a, this.f4805b, this.f4803a);
        }

        @mr2
        /* renamed from: b */
        public C0858a<T> mo6158b(Executor executor) {
            this.f4805b = executor;
            return this;
        }

        @mr2
        @hl3({hl3.C2354a.f13185a})
        /* renamed from: c */
        public C0858a<T> mo6159c(Executor executor) {
            this.f4804a = executor;
            return this;
        }
    }

    public C0857c(@ts2 Executor executor, @mr2 Executor executor2, @mr2 C0898i.C0904f<T> fVar) {
        this.f4799a = executor;
        this.f4800b = executor2;
        this.f4798a = fVar;
    }

    @mr2
    /* renamed from: a */
    public Executor mo6154a() {
        return this.f4800b;
    }

    @mr2
    /* renamed from: b */
    public C0898i.C0904f<T> mo6155b() {
        return this.f4798a;
    }

    @ts2
    @hl3({hl3.C2354a.f13185a})
    /* renamed from: c */
    public Executor mo6156c() {
        return this.f4799a;
    }
}
