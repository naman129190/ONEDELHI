package androidx.recyclerview.widget;

import android.util.Log;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C0849b0;
import androidx.recyclerview.widget.C0875e0;
import androidx.recyclerview.widget.C0881f;
import androidx.recyclerview.widget.C0937r;
import androidx.recyclerview.widget.RecyclerView;
import com.onedelhi.secure.k43;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.g */
public class C0885g implements C0937r.C0939b {

    /* renamed from: a */
    public final C0849b0 f4893a;

    /* renamed from: a */
    public final C0875e0 f4894a;
    @mr2

    /* renamed from: a */
    public final C0881f.C0882a.C0884b f4895a;

    /* renamed from: a */
    public final C0881f f4896a;

    /* renamed from: a */
    public C0886a f4897a = new C0886a();

    /* renamed from: a */
    public final IdentityHashMap<RecyclerView.C0803f0, C0937r> f4898a = new IdentityHashMap<>();

    /* renamed from: a */
    public List<WeakReference<RecyclerView>> f4899a = new ArrayList();

    /* renamed from: b */
    public List<C0937r> f4900b = new ArrayList();

    /* renamed from: androidx.recyclerview.widget.g$a */
    public static class C0886a {

        /* renamed from: a */
        public int f4901a;

        /* renamed from: a */
        public C0937r f4902a;

        /* renamed from: a */
        public boolean f4903a;
    }

    public C0885g(C0881f fVar, C0881f.C0882a aVar) {
        C0849b0 cVar;
        this.f4896a = fVar;
        this.f4894a = aVar.f4886a ? new C0875e0.C0876a() : new C0875e0.C0878b();
        C0881f.C0882a.C0884b bVar = aVar.f4885a;
        this.f4895a = bVar;
        if (bVar == C0881f.C0882a.C0884b.NO_STABLE_IDS) {
            cVar = new C0849b0.C0852b();
        } else if (bVar == C0881f.C0882a.C0884b.ISOLATED_STABLE_IDS) {
            cVar = new C0849b0.C0850a();
        } else if (bVar == C0881f.C0882a.C0884b.SHARED_STABLE_IDS) {
            cVar = new C0849b0.C0854c();
        } else {
            throw new IllegalArgumentException("unknown stable id mode");
        }
        this.f4893a = cVar;
    }

    /* renamed from: A */
    public void mo6246A(RecyclerView.C0803f0 f0Var, int i) {
        C0886a n = mo6268n(i);
        this.f4898a.put(f0Var, n.f4902a);
        n.f4902a.mo6494e(f0Var, n.f4901a);
        mo6253H(n);
    }

    /* renamed from: B */
    public RecyclerView.C0803f0 mo6247B(ViewGroup viewGroup, int i) {
        return this.f4894a.mo6230a(i).mo6495f(viewGroup, i);
    }

    /* renamed from: C */
    public void mo6248C(RecyclerView recyclerView) {
        int size = this.f4899a.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            WeakReference weakReference = this.f4899a.get(size);
            if (weakReference.get() == null) {
                this.f4899a.remove(size);
            } else if (weakReference.get() == recyclerView) {
                this.f4899a.remove(size);
                break;
            }
            size--;
        }
        for (C0937r rVar : this.f4900b) {
            rVar.f5184a.mo5698A(recyclerView);
        }
    }

    /* renamed from: D */
    public boolean mo6249D(RecyclerView.C0803f0 f0Var) {
        C0937r rVar = this.f4898a.get(f0Var);
        if (rVar != null) {
            boolean B = rVar.f5184a.mo5699B(f0Var);
            this.f4898a.remove(f0Var);
            return B;
        }
        throw new IllegalStateException("Cannot find wrapper for " + f0Var + ", seems like it is not bound by this adapter: " + this);
    }

    /* renamed from: E */
    public void mo6250E(RecyclerView.C0803f0 f0Var) {
        mo6276v(f0Var).f5184a.mo5700C(f0Var);
    }

    /* renamed from: F */
    public void mo6251F(RecyclerView.C0803f0 f0Var) {
        mo6276v(f0Var).f5184a.mo5701D(f0Var);
    }

    /* renamed from: G */
    public void mo6252G(RecyclerView.C0803f0 f0Var) {
        C0937r rVar = this.f4898a.get(f0Var);
        if (rVar != null) {
            rVar.f5184a.mo5702E(f0Var);
            this.f4898a.remove(f0Var);
            return;
        }
        throw new IllegalStateException("Cannot find wrapper for " + f0Var + ", seems like it is not bound by this adapter: " + this);
    }

    /* renamed from: H */
    public final void mo6253H(C0886a aVar) {
        aVar.f4903a = false;
        aVar.f4902a = null;
        aVar.f4901a = -1;
        this.f4897a = aVar;
    }

    /* renamed from: I */
    public boolean mo6254I(RecyclerView.C0805h<RecyclerView.C0803f0> hVar) {
        int x = mo6278x(hVar);
        if (x == -1) {
            return false;
        }
        C0937r rVar = this.f4900b.get(x);
        int m = mo6267m(rVar);
        this.f4900b.remove(x);
        this.f4896a.mo5725u(m, rVar.mo6491b());
        for (WeakReference<RecyclerView> weakReference : this.f4899a) {
            RecyclerView recyclerView = (RecyclerView) weakReference.get();
            if (recyclerView != null) {
                hVar.mo5698A(recyclerView);
            }
        }
        rVar.mo6490a();
        mo6264j();
        return true;
    }

    /* renamed from: a */
    public void mo6255a(@mr2 C0937r rVar, int i, int i2, @ts2 Object obj) {
        this.f4896a.mo5723s(i + mo6267m(rVar), i2, obj);
    }

    /* renamed from: b */
    public void mo6256b(@mr2 C0937r rVar, int i, int i2) {
        this.f4896a.mo5724t(i + mo6267m(rVar), i2);
    }

    /* renamed from: c */
    public void mo6257c(@mr2 C0937r rVar, int i, int i2) {
        this.f4896a.mo5725u(i + mo6267m(rVar), i2);
    }

    /* renamed from: d */
    public void mo6258d(@mr2 C0937r rVar, int i, int i2) {
        this.f4896a.mo5722r(i + mo6267m(rVar), i2);
    }

    /* renamed from: e */
    public void mo6259e(C0937r rVar) {
        mo6264j();
    }

    /* renamed from: f */
    public void mo6260f(@mr2 C0937r rVar, int i, int i2) {
        int m = mo6267m(rVar);
        this.f4896a.mo5721q(i + m, i2 + m);
    }

    /* renamed from: g */
    public void mo6261g(@mr2 C0937r rVar) {
        this.f4896a.mo5717m();
        mo6264j();
    }

    /* renamed from: h */
    public boolean mo6262h(int i, RecyclerView.C0805h<RecyclerView.C0803f0> hVar) {
        if (i < 0 || i > this.f4900b.size()) {
            throw new IndexOutOfBoundsException("Index must be between 0 and " + this.f4900b.size() + ". Given:" + i);
        }
        if (mo6277w()) {
            k43.m19445b(hVar.mo5716l(), "All sub adapters must have stable ids when stable id mode is ISOLATED_STABLE_IDS or SHARED_STABLE_IDS");
        } else if (hVar.mo5716l()) {
            Log.w(C0881f.f4882a, "Stable ids in the adapter will be ignored as the ConcatAdapter is configured not to have stable ids");
        }
        if (mo6269o(hVar) != null) {
            return false;
        }
        C0937r rVar = new C0937r(hVar, this, this.f4894a, this.f4893a.mo6151a());
        this.f4900b.add(i, rVar);
        for (WeakReference<RecyclerView> weakReference : this.f4899a) {
            RecyclerView recyclerView = (RecyclerView) weakReference.get();
            if (recyclerView != null) {
                hVar.mo5727w(recyclerView);
            }
        }
        if (rVar.mo6491b() > 0) {
            this.f4896a.mo5724t(mo6267m(rVar), rVar.mo6491b());
        }
        mo6264j();
        return true;
    }

    /* renamed from: i */
    public boolean mo6263i(RecyclerView.C0805h<RecyclerView.C0803f0> hVar) {
        return mo6262h(this.f4900b.size(), hVar);
    }

    /* renamed from: j */
    public final void mo6264j() {
        RecyclerView.C0805h.C0806a l = mo6266l();
        if (l != this.f4896a.mo5714j()) {
            this.f4896a.mo6241M(l);
        }
    }

    /* renamed from: k */
    public boolean mo6265k() {
        for (C0937r rVar : this.f4900b) {
            if (!rVar.f5184a.mo5708d()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: l */
    public final RecyclerView.C0805h.C0806a mo6266l() {
        for (C0937r next : this.f4900b) {
            RecyclerView.C0805h.C0806a j = next.f5184a.mo5714j();
            RecyclerView.C0805h.C0806a aVar = RecyclerView.C0805h.C0806a.PREVENT;
            if (j == aVar) {
                return aVar;
            }
            if (j == RecyclerView.C0805h.C0806a.PREVENT_WHEN_EMPTY && next.mo6491b() == 0) {
                return aVar;
            }
        }
        return RecyclerView.C0805h.C0806a.ALLOW;
    }

    /* renamed from: m */
    public final int mo6267m(C0937r rVar) {
        C0937r next;
        Iterator<C0937r> it = this.f4900b.iterator();
        int i = 0;
        while (it.hasNext() && (next = it.next()) != rVar) {
            i += next.mo6491b();
        }
        return i;
    }

    @mr2
    /* renamed from: n */
    public final C0886a mo6268n(int i) {
        C0886a aVar = this.f4897a;
        if (aVar.f4903a) {
            aVar = new C0886a();
        } else {
            aVar.f4903a = true;
        }
        Iterator<C0937r> it = this.f4900b.iterator();
        int i2 = i;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C0937r next = it.next();
            if (next.mo6491b() > i2) {
                aVar.f4902a = next;
                aVar.f4901a = i2;
                break;
            }
            i2 -= next.mo6491b();
        }
        if (aVar.f4902a != null) {
            return aVar;
        }
        throw new IllegalArgumentException("Cannot find wrapper for " + i);
    }

    @ts2
    /* renamed from: o */
    public final C0937r mo6269o(RecyclerView.C0805h<RecyclerView.C0803f0> hVar) {
        int x = mo6278x(hVar);
        if (x == -1) {
            return null;
        }
        return this.f4900b.get(x);
    }

    @ts2
    /* renamed from: p */
    public RecyclerView.C0805h<? extends RecyclerView.C0803f0> mo6270p(RecyclerView.C0803f0 f0Var) {
        C0937r rVar = this.f4898a.get(f0Var);
        if (rVar == null) {
            return null;
        }
        return rVar.f5184a;
    }

    /* renamed from: q */
    public List<RecyclerView.C0805h<? extends RecyclerView.C0803f0>> mo6271q() {
        if (this.f4900b.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(this.f4900b.size());
        for (C0937r rVar : this.f4900b) {
            arrayList.add(rVar.f5184a);
        }
        return arrayList;
    }

    /* renamed from: r */
    public long mo6272r(int i) {
        C0886a n = mo6268n(i);
        long c = n.f4902a.mo6492c(n.f4901a);
        mo6253H(n);
        return c;
    }

    /* renamed from: s */
    public int mo6273s(int i) {
        C0886a n = mo6268n(i);
        int d = n.f4902a.mo6493d(n.f4901a);
        mo6253H(n);
        return d;
    }

    /* renamed from: t */
    public int mo6274t(RecyclerView.C0805h<? extends RecyclerView.C0803f0> hVar, RecyclerView.C0803f0 f0Var, int i) {
        C0937r rVar = this.f4898a.get(f0Var);
        if (rVar == null) {
            return -1;
        }
        int m = i - mo6267m(rVar);
        int g = rVar.f5184a.mo5711g();
        if (m >= 0 && m < g) {
            return rVar.f5184a.mo5710f(hVar, f0Var, m);
        }
        throw new IllegalStateException("Detected inconsistent adapter updates. The local position of the view holder maps to " + m + " which is out of bounds for the adapter with size " + g + ".Make sure to immediately call notify methods in your adapter when you change the backing dataviewHolder:" + f0Var + "adapter:" + hVar);
    }

    /* renamed from: u */
    public int mo6275u() {
        int i = 0;
        for (C0937r b : this.f4900b) {
            i += b.mo6491b();
        }
        return i;
    }

    @mr2
    /* renamed from: v */
    public final C0937r mo6276v(RecyclerView.C0803f0 f0Var) {
        C0937r rVar = this.f4898a.get(f0Var);
        if (rVar != null) {
            return rVar;
        }
        throw new IllegalStateException("Cannot find wrapper for " + f0Var + ", seems like it is not bound by this adapter: " + this);
    }

    /* renamed from: w */
    public boolean mo6277w() {
        return this.f4895a != C0881f.C0882a.C0884b.NO_STABLE_IDS;
    }

    /* renamed from: x */
    public final int mo6278x(RecyclerView.C0805h<RecyclerView.C0803f0> hVar) {
        int size = this.f4900b.size();
        for (int i = 0; i < size; i++) {
            if (this.f4900b.get(i).f5184a == hVar) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: y */
    public final boolean mo6279y(RecyclerView recyclerView) {
        for (WeakReference<RecyclerView> weakReference : this.f4899a) {
            if (weakReference.get() == recyclerView) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: z */
    public void mo6280z(RecyclerView recyclerView) {
        if (!mo6279y(recyclerView)) {
            this.f4899a.add(new WeakReference(recyclerView));
            for (C0937r rVar : this.f4900b) {
                rVar.f5184a.mo5727w(recyclerView);
            }
        }
    }
}
