package com.onedelhi.secure;

import android.util.Log;
import com.onedelhi.secure.n33;
import java.util.ArrayList;
import java.util.List;

public final class mz0 {

    /* renamed from: a */
    public static final int f16950a = 20;

    /* renamed from: a */
    public static final C2909g<Object> f16951a = new C2903a();

    /* renamed from: a */
    public static final String f16952a = "FactoryPools";

    /* renamed from: com.onedelhi.secure.mz0$a */
    public class C2903a implements C2909g<Object> {
        /* renamed from: a */
        public void mo20813a(@mr2 Object obj) {
        }
    }

    /* renamed from: com.onedelhi.secure.mz0$b */
    public class C2904b implements C2906d<List<T>> {
        @mr2
        /* renamed from: b */
        public List<T> mo20814a() {
            return new ArrayList();
        }
    }

    /* renamed from: com.onedelhi.secure.mz0$c */
    public class C2905c implements C2909g<List<T>> {
        /* renamed from: b */
        public void mo20813a(@mr2 List<T> list) {
            list.clear();
        }
    }

    /* renamed from: com.onedelhi.secure.mz0$d */
    public interface C2906d<T> {
        /* renamed from: a */
        T mo20814a();
    }

    /* renamed from: com.onedelhi.secure.mz0$e */
    public static final class C2907e<T> implements n33.C2922a<T> {

        /* renamed from: a */
        public final C2906d<T> f16953a;

        /* renamed from: a */
        public final C2909g<T> f16954a;

        /* renamed from: a */
        public final n33.C2922a<T> f16955a;

        public C2907e(@mr2 n33.C2922a<T> aVar, @mr2 C2906d<T> dVar, @mr2 C2909g<T> gVar) {
            this.f16955a = aVar;
            this.f16953a = dVar;
            this.f16954a = gVar;
        }

        /* renamed from: a */
        public boolean mo20817a(@mr2 T t) {
            if (t instanceof C2908f) {
                ((C2908f) t).mo20819b().mo18880b(true);
            }
            this.f16954a.mo20813a(t);
            return this.f16955a.mo20817a(t);
        }

        /* renamed from: b */
        public T mo20818b() {
            T b = this.f16955a.mo20818b();
            if (b == null) {
                b = this.f16953a.mo20814a();
                if (Log.isLoggable(mz0.f16952a, 2)) {
                    Log.v(mz0.f16952a, "Created new " + b.getClass());
                }
            }
            if (b instanceof C2908f) {
                ((C2908f) b).mo20819b().mo18880b(false);
            }
            return b;
        }
    }

    /* renamed from: com.onedelhi.secure.mz0$f */
    public interface C2908f {
        @mr2
        /* renamed from: b */
        k34 mo20819b();
    }

    /* renamed from: com.onedelhi.secure.mz0$g */
    public interface C2909g<T> {
        /* renamed from: a */
        void mo20813a(@mr2 T t);
    }

    @mr2
    /* renamed from: a */
    public static <T extends C2908f> n33.C2922a<T> m22228a(@mr2 n33.C2922a<T> aVar, @mr2 C2906d<T> dVar) {
        return m22229b(aVar, dVar, m22230c());
    }

    @mr2
    /* renamed from: b */
    public static <T> n33.C2922a<T> m22229b(@mr2 n33.C2922a<T> aVar, @mr2 C2906d<T> dVar, @mr2 C2909g<T> gVar) {
        return new C2907e(aVar, dVar, gVar);
    }

    @mr2
    /* renamed from: c */
    public static <T> C2909g<T> m22230c() {
        return f16951a;
    }

    @mr2
    /* renamed from: d */
    public static <T extends C2908f> n33.C2922a<T> m22231d(int i, @mr2 C2906d<T> dVar) {
        return m22228a(new n33.C2923b(i), dVar);
    }

    @mr2
    /* renamed from: e */
    public static <T extends C2908f> n33.C2922a<T> m22232e(int i, @mr2 C2906d<T> dVar) {
        return m22228a(new n33.C2924c(i), dVar);
    }

    @mr2
    /* renamed from: f */
    public static <T> n33.C2922a<List<T>> m22233f() {
        return m22234g(20);
    }

    @mr2
    /* renamed from: g */
    public static <T> n33.C2922a<List<T>> m22234g(int i) {
        return m22229b(new n33.C2924c(i), new C2904b(), new C2905c());
    }
}
