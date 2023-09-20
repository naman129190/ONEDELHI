package androidx.recyclerview.widget;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.onedelhi.secure.mr2;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.f */
public final class C0881f extends RecyclerView.C0805h<RecyclerView.C0803f0> {

    /* renamed from: a */
    public static final String f4882a = "ConcatAdapter";

    /* renamed from: a */
    public final C0885g f4883a;

    /* renamed from: androidx.recyclerview.widget.f$a */
    public static final class C0882a {
        @mr2

        /* renamed from: a */
        public static final C0882a f4884a = new C0882a(true, C0884b.NO_STABLE_IDS);
        @mr2

        /* renamed from: a */
        public final C0884b f4885a;

        /* renamed from: a */
        public final boolean f4886a;

        /* renamed from: androidx.recyclerview.widget.f$a$a */
        public static final class C0883a {

            /* renamed from: a */
            public C0884b f4887a;

            /* renamed from: a */
            public boolean f4888a;

            public C0883a() {
                C0882a aVar = C0882a.f4884a;
                this.f4888a = aVar.f4886a;
                this.f4887a = aVar.f4885a;
            }

            @mr2
            /* renamed from: a */
            public C0882a mo6243a() {
                return new C0882a(this.f4888a, this.f4887a);
            }

            @mr2
            /* renamed from: b */
            public C0883a mo6244b(boolean z) {
                this.f4888a = z;
                return this;
            }

            @mr2
            /* renamed from: c */
            public C0883a mo6245c(@mr2 C0884b bVar) {
                this.f4887a = bVar;
                return this;
            }
        }

        /* renamed from: androidx.recyclerview.widget.f$a$b */
        public enum C0884b {
            NO_STABLE_IDS,
            ISOLATED_STABLE_IDS,
            SHARED_STABLE_IDS
        }

        public C0882a(boolean z, @mr2 C0884b bVar) {
            this.f4886a = z;
            this.f4885a = bVar;
        }
    }

    public C0881f(@mr2 C0882a aVar, @mr2 List<? extends RecyclerView.C0805h<? extends RecyclerView.C0803f0>> list) {
        this.f4883a = new C0885g(this, aVar);
        for (RecyclerView.C0805h K : list) {
            mo6239K(K);
        }
        super.mo5704G(this.f4883a.mo6277w());
    }

    @SafeVarargs
    public C0881f(@mr2 C0882a aVar, @mr2 RecyclerView.C0805h<? extends RecyclerView.C0803f0>... hVarArr) {
        this(aVar, (List<? extends RecyclerView.C0805h<? extends RecyclerView.C0803f0>>) Arrays.asList(hVarArr));
    }

    public C0881f(@mr2 List<? extends RecyclerView.C0805h<? extends RecyclerView.C0803f0>> list) {
        this(C0882a.f4884a, list);
    }

    @SafeVarargs
    public C0881f(@mr2 RecyclerView.C0805h<? extends RecyclerView.C0803f0>... hVarArr) {
        this(C0882a.f4884a, hVarArr);
    }

    /* renamed from: A */
    public void mo5698A(@mr2 RecyclerView recyclerView) {
        this.f4883a.mo6248C(recyclerView);
    }

    /* renamed from: B */
    public boolean mo5699B(@mr2 RecyclerView.C0803f0 f0Var) {
        return this.f4883a.mo6249D(f0Var);
    }

    /* renamed from: C */
    public void mo5700C(@mr2 RecyclerView.C0803f0 f0Var) {
        this.f4883a.mo6250E(f0Var);
    }

    /* renamed from: D */
    public void mo5701D(@mr2 RecyclerView.C0803f0 f0Var) {
        this.f4883a.mo6251F(f0Var);
    }

    /* renamed from: E */
    public void mo5702E(@mr2 RecyclerView.C0803f0 f0Var) {
        this.f4883a.mo6252G(f0Var);
    }

    /* renamed from: G */
    public void mo5704G(boolean z) {
        throw new UnsupportedOperationException("Calling setHasStableIds is not allowed on the ConcatAdapter. Use the Config object passed in the constructor to control this behavior");
    }

    /* renamed from: H */
    public void mo5705H(@mr2 RecyclerView.C0805h.C0806a aVar) {
        throw new UnsupportedOperationException("Calling setStateRestorationPolicy is not allowed on the ConcatAdapter. This value is inferred from added adapters");
    }

    /* renamed from: J */
    public boolean mo6238J(int i, @mr2 RecyclerView.C0805h<? extends RecyclerView.C0803f0> hVar) {
        return this.f4883a.mo6262h(i, hVar);
    }

    /* renamed from: K */
    public boolean mo6239K(@mr2 RecyclerView.C0805h<? extends RecyclerView.C0803f0> hVar) {
        return this.f4883a.mo6263i(hVar);
    }

    @mr2
    /* renamed from: L */
    public List<? extends RecyclerView.C0805h<? extends RecyclerView.C0803f0>> mo6240L() {
        return Collections.unmodifiableList(this.f4883a.mo6271q());
    }

    /* renamed from: M */
    public void mo6241M(@mr2 RecyclerView.C0805h.C0806a aVar) {
        super.mo5705H(aVar);
    }

    /* renamed from: N */
    public boolean mo6242N(@mr2 RecyclerView.C0805h<? extends RecyclerView.C0803f0> hVar) {
        return this.f4883a.mo6254I(hVar);
    }

    /* renamed from: f */
    public int mo5710f(@mr2 RecyclerView.C0805h<? extends RecyclerView.C0803f0> hVar, @mr2 RecyclerView.C0803f0 f0Var, int i) {
        return this.f4883a.mo6274t(hVar, f0Var, i);
    }

    /* renamed from: g */
    public int mo5711g() {
        return this.f4883a.mo6275u();
    }

    /* renamed from: h */
    public long mo5712h(int i) {
        return this.f4883a.mo6272r(i);
    }

    /* renamed from: i */
    public int mo5713i(int i) {
        return this.f4883a.mo6273s(i);
    }

    /* renamed from: w */
    public void mo5727w(@mr2 RecyclerView recyclerView) {
        this.f4883a.mo6280z(recyclerView);
    }

    /* renamed from: x */
    public void mo5728x(@mr2 RecyclerView.C0803f0 f0Var, int i) {
        this.f4883a.mo6246A(f0Var, i);
    }

    @mr2
    /* renamed from: z */
    public RecyclerView.C0803f0 mo5730z(@mr2 ViewGroup viewGroup, int i) {
        return this.f4883a.mo6247B(viewGroup, i);
    }
}
