package androidx.recyclerview.widget;

import android.view.ViewGroup;
import androidx.recyclerview.widget.C0849b0;
import androidx.recyclerview.widget.C0875e0;
import androidx.recyclerview.widget.RecyclerView;
import com.onedelhi.secure.k43;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;

/* renamed from: androidx.recyclerview.widget.r */
public class C0937r {

    /* renamed from: a */
    public int f5183a;

    /* renamed from: a */
    public final RecyclerView.C0805h<RecyclerView.C0803f0> f5184a;

    /* renamed from: a */
    public RecyclerView.C0808j f5185a = new C0938a();
    @mr2

    /* renamed from: a */
    public final C0849b0.C0856d f5186a;
    @mr2

    /* renamed from: a */
    public final C0875e0.C0880c f5187a;

    /* renamed from: a */
    public final C0939b f5188a;

    /* renamed from: androidx.recyclerview.widget.r$a */
    public class C0938a extends RecyclerView.C0808j {
        public C0938a() {
        }

        /* renamed from: a */
        public void mo5739a() {
            C0937r rVar = C0937r.this;
            rVar.f5183a = rVar.f5184a.mo5711g();
            C0937r rVar2 = C0937r.this;
            rVar2.f5188a.mo6261g(rVar2);
        }

        /* renamed from: b */
        public void mo5740b(int i, int i2) {
            C0937r rVar = C0937r.this;
            rVar.f5188a.mo6255a(rVar, i, i2, (Object) null);
        }

        /* renamed from: c */
        public void mo5741c(int i, int i2, @ts2 Object obj) {
            C0937r rVar = C0937r.this;
            rVar.f5188a.mo6255a(rVar, i, i2, obj);
        }

        /* renamed from: d */
        public void mo5742d(int i, int i2) {
            C0937r rVar = C0937r.this;
            rVar.f5183a += i2;
            rVar.f5188a.mo6256b(rVar, i, i2);
            C0937r rVar2 = C0937r.this;
            if (rVar2.f5183a > 0 && rVar2.f5184a.mo5714j() == RecyclerView.C0805h.C0806a.PREVENT_WHEN_EMPTY) {
                C0937r rVar3 = C0937r.this;
                rVar3.f5188a.mo6259e(rVar3);
            }
        }

        /* renamed from: e */
        public void mo5743e(int i, int i2, int i3) {
            boolean z = true;
            if (i3 != 1) {
                z = false;
            }
            k43.m19445b(z, "moving more than 1 item is not supported in RecyclerView");
            C0937r rVar = C0937r.this;
            rVar.f5188a.mo6260f(rVar, i, i2);
        }

        /* renamed from: f */
        public void mo5744f(int i, int i2) {
            C0937r rVar = C0937r.this;
            rVar.f5183a -= i2;
            rVar.f5188a.mo6257c(rVar, i, i2);
            C0937r rVar2 = C0937r.this;
            if (rVar2.f5183a < 1 && rVar2.f5184a.mo5714j() == RecyclerView.C0805h.C0806a.PREVENT_WHEN_EMPTY) {
                C0937r rVar3 = C0937r.this;
                rVar3.f5188a.mo6259e(rVar3);
            }
        }

        /* renamed from: g */
        public void mo5745g() {
            C0937r rVar = C0937r.this;
            rVar.f5188a.mo6259e(rVar);
        }
    }

    /* renamed from: androidx.recyclerview.widget.r$b */
    public interface C0939b {
        /* renamed from: a */
        void mo6255a(@mr2 C0937r rVar, int i, int i2, @ts2 Object obj);

        /* renamed from: b */
        void mo6256b(@mr2 C0937r rVar, int i, int i2);

        /* renamed from: c */
        void mo6257c(@mr2 C0937r rVar, int i, int i2);

        /* renamed from: d */
        void mo6258d(@mr2 C0937r rVar, int i, int i2);

        /* renamed from: e */
        void mo6259e(C0937r rVar);

        /* renamed from: f */
        void mo6260f(@mr2 C0937r rVar, int i, int i2);

        /* renamed from: g */
        void mo6261g(@mr2 C0937r rVar);
    }

    public C0937r(RecyclerView.C0805h<RecyclerView.C0803f0> hVar, C0939b bVar, C0875e0 e0Var, C0849b0.C0856d dVar) {
        this.f5184a = hVar;
        this.f5188a = bVar;
        this.f5187a = e0Var.mo6231b(this);
        this.f5186a = dVar;
        this.f5183a = hVar.mo5711g();
        hVar.mo5703F(this.f5185a);
    }

    /* renamed from: a */
    public void mo6490a() {
        this.f5184a.mo5706I(this.f5185a);
        this.f5187a.mo6234e();
    }

    /* renamed from: b */
    public int mo6491b() {
        return this.f5183a;
    }

    /* renamed from: c */
    public long mo6492c(int i) {
        return this.f5186a.mo6153a(this.f5184a.mo5712h(i));
    }

    /* renamed from: d */
    public int mo6493d(int i) {
        return this.f5187a.mo6236g(this.f5184a.mo5713i(i));
    }

    /* renamed from: e */
    public void mo6494e(RecyclerView.C0803f0 f0Var, int i) {
        this.f5184a.mo5707c(f0Var, i);
    }

    /* renamed from: f */
    public RecyclerView.C0803f0 mo6495f(ViewGroup viewGroup, int i) {
        return this.f5184a.mo5730z(viewGroup, this.f5187a.mo6235f(i));
    }
}
