package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;

/* renamed from: androidx.recyclerview.widget.u */
public class C0945u extends C0951y {

    /* renamed from: a */
    public static final int f5197a = 100;
    @ts2

    /* renamed from: a */
    public C0942t f5198a;
    @ts2

    /* renamed from: b */
    public C0942t f5199b;

    /* renamed from: androidx.recyclerview.widget.u$a */
    public class C0946a extends C0933o {
        public C0946a(Context context) {
            super(context);
        }

        /* renamed from: p */
        public void mo5588p(View view, RecyclerView.C0797c0 c0Var, RecyclerView.C0793b0.C0794a aVar) {
            C0945u uVar = C0945u.this;
            int[] c = uVar.mo6476c(uVar.f5211a.getLayoutManager(), view);
            int i = c[0];
            int i2 = c[1];
            int x = mo6473x(Math.max(Math.abs(i), Math.abs(i2)));
            if (x > 0) {
                aVar.mo5603l(i, i2, x, this.f5172a);
            }
        }

        /* renamed from: w */
        public float mo6472w(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }

        /* renamed from: y */
        public int mo6474y(int i) {
            return Math.min(100, super.mo6474y(i));
        }
    }

    @ts2
    /* renamed from: c */
    public int[] mo6476c(@mr2 RecyclerView.C0819p pVar, @mr2 View view) {
        int[] iArr = new int[2];
        if (pVar.mo5304n()) {
            iArr[0] = mo6521m(view, mo6523o(pVar));
        } else {
            iArr[0] = 0;
        }
        if (pVar.mo5307o()) {
            iArr[1] = mo6521m(view, mo6525q(pVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @ts2
    /* renamed from: e */
    public RecyclerView.C0793b0 mo6520e(@mr2 RecyclerView.C0819p pVar) {
        if (!(pVar instanceof RecyclerView.C0793b0.C0795b)) {
            return null;
        }
        return new C0946a(this.f5211a.getContext());
    }

    @ts2
    /* renamed from: h */
    public View mo6477h(RecyclerView.C0819p pVar) {
        C0942t o;
        if (pVar.mo5307o()) {
            o = mo6525q(pVar);
        } else if (!pVar.mo5304n()) {
            return null;
        } else {
            o = mo6523o(pVar);
        }
        return mo6522n(pVar, o);
    }

    /* renamed from: i */
    public int mo6478i(RecyclerView.C0819p pVar, int i, int i2) {
        C0942t p;
        int g0 = pVar.mo5869g0();
        if (g0 == 0 || (p = mo6524p(pVar)) == null) {
            return -1;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int Q = pVar.mo5828Q();
        View view = null;
        View view2 = null;
        for (int i5 = 0; i5 < Q; i5++) {
            View P = pVar.mo5825P(i5);
            if (P != null) {
                int m = mo6521m(P, p);
                if (m <= 0 && m > i3) {
                    view2 = P;
                    i3 = m;
                }
                if (m >= 0 && m < i4) {
                    view = P;
                    i4 = m;
                }
            }
        }
        boolean r = mo6526r(pVar, i, i2);
        if (r && view != null) {
            return pVar.mo5893s0(view);
        }
        if (!r && view2 != null) {
            return pVar.mo5893s0(view2);
        }
        if (r) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int s0 = pVar.mo5893s0(view) + (mo6527s(pVar) == r ? -1 : 1);
        if (s0 < 0 || s0 >= g0) {
            return -1;
        }
        return s0;
    }

    /* renamed from: m */
    public final int mo6521m(@mr2 View view, C0942t tVar) {
        return (tVar.mo6505g(view) + (tVar.mo6503e(view) / 2)) - (tVar.mo6512n() + (tVar.mo6513o() / 2));
    }

    @ts2
    /* renamed from: n */
    public final View mo6522n(RecyclerView.C0819p pVar, C0942t tVar) {
        int Q = pVar.mo5828Q();
        View view = null;
        if (Q == 0) {
            return null;
        }
        int n = tVar.mo6512n() + (tVar.mo6513o() / 2);
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < Q; i2++) {
            View P = pVar.mo5825P(i2);
            int abs = Math.abs((tVar.mo6505g(P) + (tVar.mo6503e(P) / 2)) - n);
            if (abs < i) {
                view = P;
                i = abs;
            }
        }
        return view;
    }

    @mr2
    /* renamed from: o */
    public final C0942t mo6523o(@mr2 RecyclerView.C0819p pVar) {
        C0942t tVar = this.f5199b;
        if (tVar == null || tVar.f5196a != pVar) {
            this.f5199b = C0942t.m6517a(pVar);
        }
        return this.f5199b;
    }

    @ts2
    /* renamed from: p */
    public final C0942t mo6524p(RecyclerView.C0819p pVar) {
        if (pVar.mo5307o()) {
            return mo6525q(pVar);
        }
        if (pVar.mo5304n()) {
            return mo6523o(pVar);
        }
        return null;
    }

    @mr2
    /* renamed from: q */
    public final C0942t mo6525q(@mr2 RecyclerView.C0819p pVar) {
        C0942t tVar = this.f5198a;
        if (tVar == null || tVar.f5196a != pVar) {
            this.f5198a = C0942t.m6519c(pVar);
        }
        return this.f5198a;
    }

    /* renamed from: r */
    public final boolean mo6526r(RecyclerView.C0819p pVar, int i, int i2) {
        return pVar.mo5304n() ? i > 0 : i2 > 0;
    }

    /* renamed from: s */
    public final boolean mo6527s(RecyclerView.C0819p pVar) {
        PointF a;
        int g0 = pVar.mo5869g0();
        if (!(pVar instanceof RecyclerView.C0793b0.C0795b) || (a = ((RecyclerView.C0793b0.C0795b) pVar).mo5284a(g0 - 1)) == null) {
            return false;
        }
        return a.x < 0.0f || a.y < 0.0f;
    }
}
