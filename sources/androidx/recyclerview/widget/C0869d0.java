package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import com.onedelhi.secure.ga2;
import com.onedelhi.secure.hw4;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.n33;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.ty3;

/* renamed from: androidx.recyclerview.widget.d0 */
public class C0869d0 {

    /* renamed from: a */
    public static final boolean f4850a = false;
    @hw4

    /* renamed from: a */
    public final ga2<RecyclerView.C0803f0> f4851a = new ga2<>();
    @hw4

    /* renamed from: a */
    public final ty3<RecyclerView.C0803f0, C0870a> f4852a = new ty3<>();

    /* renamed from: androidx.recyclerview.widget.d0$a */
    public static class C0870a {

        /* renamed from: a */
        public static n33.C2922a<C0870a> f4853a = new n33.C2923b(20);

        /* renamed from: b */
        public static final int f4854b = 1;

        /* renamed from: c */
        public static final int f4855c = 2;

        /* renamed from: d */
        public static final int f4856d = 4;

        /* renamed from: e */
        public static final int f4857e = 8;

        /* renamed from: f */
        public static final int f4858f = 3;

        /* renamed from: g */
        public static final int f4859g = 12;

        /* renamed from: h */
        public static final int f4860h = 14;

        /* renamed from: a */
        public int f4861a;
        @ts2

        /* renamed from: a */
        public RecyclerView.C0812m.C0816d f4862a;
        @ts2

        /* renamed from: b */
        public RecyclerView.C0812m.C0816d f4863b;

        /* renamed from: a */
        public static void m6147a() {
            do {
            } while (f4853a.mo20818b() != null);
        }

        /* renamed from: b */
        public static C0870a m6148b() {
            C0870a b = f4853a.mo20818b();
            return b == null ? new C0870a() : b;
        }

        /* renamed from: c */
        public static void m6149c(C0870a aVar) {
            aVar.f4861a = 0;
            aVar.f4862a = null;
            aVar.f4863b = null;
            f4853a.mo20817a(aVar);
        }
    }

    /* renamed from: androidx.recyclerview.widget.d0$b */
    public interface C0871b {
        /* renamed from: a */
        void mo5622a(RecyclerView.C0803f0 f0Var, @mr2 RecyclerView.C0812m.C0816d dVar, @mr2 RecyclerView.C0812m.C0816d dVar2);

        /* renamed from: b */
        void mo5623b(RecyclerView.C0803f0 f0Var, @mr2 RecyclerView.C0812m.C0816d dVar, @ts2 RecyclerView.C0812m.C0816d dVar2);

        /* renamed from: c */
        void mo5624c(RecyclerView.C0803f0 f0Var, @ts2 RecyclerView.C0812m.C0816d dVar, RecyclerView.C0812m.C0816d dVar2);

        /* renamed from: d */
        void mo5625d(RecyclerView.C0803f0 f0Var);
    }

    /* renamed from: a */
    public void mo6183a(RecyclerView.C0803f0 f0Var, RecyclerView.C0812m.C0816d dVar) {
        C0870a aVar = this.f4852a.get(f0Var);
        if (aVar == null) {
            aVar = C0870a.m6148b();
            this.f4852a.put(f0Var, aVar);
        }
        aVar.f4861a |= 2;
        aVar.f4862a = dVar;
    }

    /* renamed from: b */
    public void mo6184b(RecyclerView.C0803f0 f0Var) {
        C0870a aVar = this.f4852a.get(f0Var);
        if (aVar == null) {
            aVar = C0870a.m6148b();
            this.f4852a.put(f0Var, aVar);
        }
        aVar.f4861a |= 1;
    }

    /* renamed from: c */
    public void mo6185c(long j, RecyclerView.C0803f0 f0Var) {
        this.f4851a.mo16423n(j, f0Var);
    }

    /* renamed from: d */
    public void mo6186d(RecyclerView.C0803f0 f0Var, RecyclerView.C0812m.C0816d dVar) {
        C0870a aVar = this.f4852a.get(f0Var);
        if (aVar == null) {
            aVar = C0870a.m6148b();
            this.f4852a.put(f0Var, aVar);
        }
        aVar.f4863b = dVar;
        aVar.f4861a |= 8;
    }

    /* renamed from: e */
    public void mo6187e(RecyclerView.C0803f0 f0Var, RecyclerView.C0812m.C0816d dVar) {
        C0870a aVar = this.f4852a.get(f0Var);
        if (aVar == null) {
            aVar = C0870a.m6148b();
            this.f4852a.put(f0Var, aVar);
        }
        aVar.f4862a = dVar;
        aVar.f4861a |= 4;
    }

    /* renamed from: f */
    public void mo6188f() {
        this.f4852a.clear();
        this.f4851a.mo16410b();
    }

    /* renamed from: g */
    public RecyclerView.C0803f0 mo6189g(long j) {
        return this.f4851a.mo16417h(j);
    }

    /* renamed from: h */
    public boolean mo6190h(RecyclerView.C0803f0 f0Var) {
        C0870a aVar = this.f4852a.get(f0Var);
        return (aVar == null || (aVar.f4861a & 1) == 0) ? false : true;
    }

    /* renamed from: i */
    public boolean mo6191i(RecyclerView.C0803f0 f0Var) {
        C0870a aVar = this.f4852a.get(f0Var);
        return (aVar == null || (aVar.f4861a & 4) == 0) ? false : true;
    }

    /* renamed from: j */
    public void mo6192j() {
        C0870a.m6147a();
    }

    /* renamed from: k */
    public void mo6193k(RecyclerView.C0803f0 f0Var) {
        mo6198p(f0Var);
    }

    /* renamed from: l */
    public final RecyclerView.C0812m.C0816d mo6194l(RecyclerView.C0803f0 f0Var, int i) {
        C0870a q;
        RecyclerView.C0812m.C0816d dVar;
        int i2 = this.f4852a.mo25346i(f0Var);
        if (i2 >= 0 && (q = this.f4852a.mo25352q(i2)) != null) {
            int i3 = q.f4861a;
            if ((i3 & i) != 0) {
                int i4 = (~i) & i3;
                q.f4861a = i4;
                if (i == 4) {
                    dVar = q.f4862a;
                } else if (i == 8) {
                    dVar = q.f4863b;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i4 & 12) == 0) {
                    this.f4852a.mo4015o(i2);
                    C0870a.m6149c(q);
                }
                return dVar;
            }
        }
        return null;
    }

    @ts2
    /* renamed from: m */
    public RecyclerView.C0812m.C0816d mo6195m(RecyclerView.C0803f0 f0Var) {
        return mo6194l(f0Var, 8);
    }

    @ts2
    /* renamed from: n */
    public RecyclerView.C0812m.C0816d mo6196n(RecyclerView.C0803f0 f0Var) {
        return mo6194l(f0Var, 4);
    }

    /* renamed from: o */
    public void mo6197o(C0871b bVar) {
        RecyclerView.C0812m.C0816d dVar;
        RecyclerView.C0812m.C0816d dVar2;
        for (int size = this.f4852a.size() - 1; size >= 0; size--) {
            RecyclerView.C0803f0 m = this.f4852a.mo25350m(size);
            C0870a o = this.f4852a.mo4015o(size);
            int i = o.f4861a;
            if ((i & 3) != 3) {
                if ((i & 1) != 0) {
                    dVar = o.f4862a;
                    if (dVar != null) {
                        dVar2 = o.f4863b;
                    }
                } else {
                    if ((i & 14) != 14) {
                        if ((i & 12) == 12) {
                            bVar.mo5622a(m, o.f4862a, o.f4863b);
                        } else if ((i & 4) != 0) {
                            dVar = o.f4862a;
                            dVar2 = null;
                        } else if ((i & 8) == 0) {
                        }
                        C0870a.m6149c(o);
                    }
                    bVar.mo5624c(m, o.f4862a, o.f4863b);
                    C0870a.m6149c(o);
                }
                bVar.mo5623b(m, dVar, dVar2);
                C0870a.m6149c(o);
            }
            bVar.mo5625d(m);
            C0870a.m6149c(o);
        }
    }

    /* renamed from: p */
    public void mo6198p(RecyclerView.C0803f0 f0Var) {
        C0870a aVar = this.f4852a.get(f0Var);
        if (aVar != null) {
            aVar.f4861a &= -2;
        }
    }

    /* renamed from: q */
    public void mo6199q(RecyclerView.C0803f0 f0Var) {
        int w = this.f4851a.mo16433w() - 1;
        while (true) {
            if (w < 0) {
                break;
            } else if (f0Var == this.f4851a.mo16434x(w)) {
                this.f4851a.mo16428s(w);
                break;
            } else {
                w--;
            }
        }
        C0870a remove = this.f4852a.remove(f0Var);
        if (remove != null) {
            C0870a.m6149c(remove);
        }
    }
}
