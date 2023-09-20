package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;

/* renamed from: androidx.recyclerview.widget.y */
public abstract class C0951y extends RecyclerView.C0825r {

    /* renamed from: a */
    public static final float f5208a = 100.0f;

    /* renamed from: a */
    public Scroller f5209a;

    /* renamed from: a */
    public final RecyclerView.C0827t f5210a = new C0952a();

    /* renamed from: a */
    public RecyclerView f5211a;

    /* renamed from: androidx.recyclerview.widget.y$a */
    public class C0952a extends RecyclerView.C0827t {

        /* renamed from: a */
        public boolean f5213a = false;

        public C0952a() {
        }

        /* renamed from: a */
        public void mo5915a(RecyclerView recyclerView, int i) {
            super.mo5915a(recyclerView, i);
            if (i == 0 && this.f5213a) {
                this.f5213a = false;
                C0951y.this.mo6560l();
            }
        }

        /* renamed from: b */
        public void mo5916b(RecyclerView recyclerView, int i, int i2) {
            if (i != 0 || i2 != 0) {
                this.f5213a = true;
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.y$b */
    public class C0953b extends C0933o {
        public C0953b(Context context) {
            super(context);
        }

        /* renamed from: p */
        public void mo5588p(View view, RecyclerView.C0797c0 c0Var, RecyclerView.C0793b0.C0794a aVar) {
            C0951y yVar = C0951y.this;
            RecyclerView recyclerView = yVar.f5211a;
            if (recyclerView != null) {
                int[] c = yVar.mo6476c(recyclerView.getLayoutManager(), view);
                int i = c[0];
                int i2 = c[1];
                int x = mo6473x(Math.max(Math.abs(i), Math.abs(i2)));
                if (x > 0) {
                    aVar.mo5603l(i, i2, x, this.f5172a);
                }
            }
        }

        /* renamed from: w */
        public float mo6472w(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }
    }

    /* renamed from: a */
    public boolean mo5914a(int i, int i2) {
        RecyclerView.C0819p layoutManager = this.f5211a.getLayoutManager();
        if (layoutManager == null || this.f5211a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f5211a.getMinFlingVelocity();
        return (Math.abs(i2) > minFlingVelocity || Math.abs(i) > minFlingVelocity) && mo6559k(layoutManager, i, i2);
    }

    /* renamed from: b */
    public void mo6554b(@ts2 RecyclerView recyclerView) throws IllegalStateException {
        RecyclerView recyclerView2 = this.f5211a;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                mo6557g();
            }
            this.f5211a = recyclerView;
            if (recyclerView != null) {
                mo6558j();
                this.f5209a = new Scroller(this.f5211a.getContext(), new DecelerateInterpolator());
                mo6560l();
            }
        }
    }

    @ts2
    /* renamed from: c */
    public abstract int[] mo6476c(@mr2 RecyclerView.C0819p pVar, @mr2 View view);

    /* renamed from: d */
    public int[] mo6555d(int i, int i2) {
        this.f5209a.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return new int[]{this.f5209a.getFinalX(), this.f5209a.getFinalY()};
    }

    @ts2
    /* renamed from: e */
    public RecyclerView.C0793b0 mo6520e(@mr2 RecyclerView.C0819p pVar) {
        return mo6556f(pVar);
    }

    @ts2
    @Deprecated
    /* renamed from: f */
    public C0933o mo6556f(@mr2 RecyclerView.C0819p pVar) {
        if (!(pVar instanceof RecyclerView.C0793b0.C0795b)) {
            return null;
        }
        return new C0953b(this.f5211a.getContext());
    }

    /* renamed from: g */
    public final void mo6557g() {
        this.f5211a.mo5549w1(this.f5210a);
        this.f5211a.setOnFlingListener((RecyclerView.C0825r) null);
    }

    @ts2
    /* renamed from: h */
    public abstract View mo6477h(RecyclerView.C0819p pVar);

    /* renamed from: i */
    public abstract int mo6478i(RecyclerView.C0819p pVar, int i, int i2);

    /* renamed from: j */
    public final void mo6558j() throws IllegalStateException {
        if (this.f5211a.getOnFlingListener() == null) {
            this.f5211a.mo5506r(this.f5210a);
            this.f5211a.setOnFlingListener(this);
            return;
        }
        throw new IllegalStateException("An instance of OnFlingListener already set.");
    }

    /* renamed from: k */
    public final boolean mo6559k(@mr2 RecyclerView.C0819p pVar, int i, int i2) {
        RecyclerView.C0793b0 e;
        int i3;
        if (!(pVar instanceof RecyclerView.C0793b0.C0795b) || (e = mo6520e(pVar)) == null || (i3 = mo6478i(pVar, i, i2)) == -1) {
            return false;
        }
        e.mo5589q(i3);
        pVar.mo5870g2(e);
        return true;
    }

    /* renamed from: l */
    public void mo6560l() {
        RecyclerView.C0819p layoutManager;
        View h;
        RecyclerView recyclerView = this.f5211a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (h = mo6477h(layoutManager)) != null) {
            int[] c = mo6476c(layoutManager, h);
            if (c[0] != 0 || c[1] != 0) {
                this.f5211a.mo5384K1(c[0], c[1]);
            }
        }
    }
}
