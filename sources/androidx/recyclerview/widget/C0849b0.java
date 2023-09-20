package androidx.recyclerview.widget;

import com.onedelhi.secure.ga2;
import com.onedelhi.secure.mr2;

/* renamed from: androidx.recyclerview.widget.b0 */
public interface C0849b0 {

    /* renamed from: androidx.recyclerview.widget.b0$a */
    public static class C0850a implements C0849b0 {

        /* renamed from: a */
        public long f4791a = 0;

        /* renamed from: androidx.recyclerview.widget.b0$a$a */
        public class C0851a implements C0856d {

            /* renamed from: a */
            public final ga2<Long> f4793a = new ga2<>();

            public C0851a() {
            }

            /* renamed from: a */
            public long mo6153a(long j) {
                Long h = this.f4793a.mo16417h(j);
                if (h == null) {
                    h = Long.valueOf(C0850a.this.mo6152b());
                    this.f4793a.mo16423n(j, h);
                }
                return h.longValue();
            }
        }

        @mr2
        /* renamed from: a */
        public C0856d mo6151a() {
            return new C0851a();
        }

        /* renamed from: b */
        public long mo6152b() {
            long j = this.f4791a;
            this.f4791a = 1 + j;
            return j;
        }
    }

    /* renamed from: androidx.recyclerview.widget.b0$b */
    public static class C0852b implements C0849b0 {

        /* renamed from: a */
        public final C0856d f4794a = new C0853a();

        /* renamed from: androidx.recyclerview.widget.b0$b$a */
        public class C0853a implements C0856d {
            public C0853a() {
            }

            /* renamed from: a */
            public long mo6153a(long j) {
                return -1;
            }
        }

        @mr2
        /* renamed from: a */
        public C0856d mo6151a() {
            return this.f4794a;
        }
    }

    /* renamed from: androidx.recyclerview.widget.b0$c */
    public static class C0854c implements C0849b0 {

        /* renamed from: a */
        public final C0856d f4796a = new C0855a();

        /* renamed from: androidx.recyclerview.widget.b0$c$a */
        public class C0855a implements C0856d {
            public C0855a() {
            }

            /* renamed from: a */
            public long mo6153a(long j) {
                return j;
            }
        }

        @mr2
        /* renamed from: a */
        public C0856d mo6151a() {
            return this.f4796a;
        }
    }

    /* renamed from: androidx.recyclerview.widget.b0$d */
    public interface C0856d {
        /* renamed from: a */
        long mo6153a(long j);
    }

    @mr2
    /* renamed from: a */
    C0856d mo6151a();
}
