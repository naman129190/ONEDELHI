package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.C0857c;
import androidx.recyclerview.widget.C0898i;
import androidx.recyclerview.widget.RecyclerView;
import com.onedelhi.secure.h42;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* renamed from: androidx.recyclerview.widget.d */
public class C0863d<T> {

    /* renamed from: b */
    public static final Executor f4833b = new C0868c();

    /* renamed from: a */
    public int f4834a;

    /* renamed from: a */
    public final C0857c<T> f4835a;

    /* renamed from: a */
    public final h42 f4836a;

    /* renamed from: a */
    public final List<C0867b<T>> f4837a;

    /* renamed from: a */
    public Executor f4838a;
    @ts2

    /* renamed from: b */
    public List<T> f4839b;
    @mr2

    /* renamed from: c */
    public List<T> f4840c;

    /* renamed from: androidx.recyclerview.widget.d$a */
    public class C0864a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Runnable f4842a;

        /* renamed from: a */
        public final /* synthetic */ List f4843a;

        /* renamed from: b */
        public final /* synthetic */ List f4844b;

        /* renamed from: n */
        public final /* synthetic */ int f4845n;

        /* renamed from: androidx.recyclerview.widget.d$a$a */
        public class C0865a extends C0898i.C0900b {
            public C0865a() {
            }

            /* renamed from: a */
            public boolean mo6175a(int i, int i2) {
                Object obj = C0864a.this.f4843a.get(i);
                Object obj2 = C0864a.this.f4844b.get(i2);
                if (obj != null && obj2 != null) {
                    return C0863d.this.f4835a.mo6155b().mo6327a(obj, obj2);
                }
                if (obj == null && obj2 == null) {
                    return true;
                }
                throw new AssertionError();
            }

            /* renamed from: b */
            public boolean mo6176b(int i, int i2) {
                Object obj = C0864a.this.f4843a.get(i);
                Object obj2 = C0864a.this.f4844b.get(i2);
                return (obj == null || obj2 == null) ? obj == null && obj2 == null : C0863d.this.f4835a.mo6155b().mo6328b(obj, obj2);
            }

            @ts2
            /* renamed from: c */
            public Object mo6177c(int i, int i2) {
                Object obj = C0864a.this.f4843a.get(i);
                Object obj2 = C0864a.this.f4844b.get(i2);
                if (obj != null && obj2 != null) {
                    return C0863d.this.f4835a.mo6155b().mo6329c(obj, obj2);
                }
                throw new AssertionError();
            }

            /* renamed from: d */
            public int mo6178d() {
                return C0864a.this.f4844b.size();
            }

            /* renamed from: e */
            public int mo6179e() {
                return C0864a.this.f4843a.size();
            }
        }

        /* renamed from: androidx.recyclerview.widget.d$a$b */
        public class C0866b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C0898i.C0903e f4848a;

            public C0866b(C0898i.C0903e eVar) {
                this.f4848a = eVar;
            }

            public void run() {
                C0864a aVar = C0864a.this;
                C0863d dVar = C0863d.this;
                if (dVar.f4834a == aVar.f4845n) {
                    dVar.mo6169c(aVar.f4844b, this.f4848a, aVar.f4842a);
                }
            }
        }

        public C0864a(List list, List list2, int i, Runnable runnable) {
            this.f4843a = list;
            this.f4844b = list2;
            this.f4845n = i;
            this.f4842a = runnable;
        }

        public void run() {
            C0863d.this.f4838a.execute(new C0866b(C0898i.m6288b(new C0865a())));
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$b */
    public interface C0867b<T> {
        /* renamed from: a */
        void mo6181a(@mr2 List<T> list, @mr2 List<T> list2);
    }

    /* renamed from: androidx.recyclerview.widget.d$c */
    public static class C0868c implements Executor {

        /* renamed from: a */
        public final Handler f4849a = new Handler(Looper.getMainLooper());

        public void execute(@mr2 Runnable runnable) {
            this.f4849a.post(runnable);
        }
    }

    public C0863d(@mr2 RecyclerView.C0805h hVar, @mr2 C0898i.C0904f<T> fVar) {
        this((h42) new C0848b(hVar), new C0857c.C0858a(fVar).mo6157a());
    }

    public C0863d(@mr2 h42 h42, @mr2 C0857c<T> cVar) {
        this.f4837a = new CopyOnWriteArrayList();
        this.f4840c = Collections.emptyList();
        this.f4836a = h42;
        this.f4835a = cVar;
        this.f4838a = cVar.mo6156c() != null ? cVar.mo6156c() : f4833b;
    }

    /* renamed from: a */
    public void mo6167a(@mr2 C0867b<T> bVar) {
        this.f4837a.add(bVar);
    }

    @mr2
    /* renamed from: b */
    public List<T> mo6168b() {
        return this.f4840c;
    }

    /* renamed from: c */
    public void mo6169c(@mr2 List<T> list, @mr2 C0898i.C0903e eVar, @ts2 Runnable runnable) {
        List<T> list2 = this.f4840c;
        this.f4839b = list;
        this.f4840c = Collections.unmodifiableList(list);
        eVar.mo6323e(this.f4836a);
        mo6170d(list2, runnable);
    }

    /* renamed from: d */
    public final void mo6170d(@mr2 List<T> list, @ts2 Runnable runnable) {
        for (C0867b<T> a : this.f4837a) {
            a.mo6181a(list, this.f4840c);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: e */
    public void mo6171e(@mr2 C0867b<T> bVar) {
        this.f4837a.remove(bVar);
    }

    /* renamed from: f */
    public void mo6172f(@ts2 List<T> list) {
        mo6173g(list, (Runnable) null);
    }

    /* renamed from: g */
    public void mo6173g(@ts2 List<T> list, @ts2 Runnable runnable) {
        int i = this.f4834a + 1;
        this.f4834a = i;
        List<T> list2 = this.f4839b;
        if (list != list2) {
            List<T> list3 = this.f4840c;
            if (list == null) {
                int size = list2.size();
                this.f4839b = null;
                this.f4840c = Collections.emptyList();
                this.f4836a.mo6147b(0, size);
                mo6170d(list3, runnable);
            } else if (list2 == null) {
                this.f4839b = list;
                this.f4840c = Collections.unmodifiableList(list);
                this.f4836a.mo6148c(0, list.size());
                mo6170d(list3, runnable);
            } else {
                this.f4835a.mo6154a().execute(new C0864a(list2, list, i, runnable));
            }
        } else if (runnable != null) {
            runnable.run();
        }
    }
}
