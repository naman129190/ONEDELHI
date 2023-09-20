package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;

/* renamed from: androidx.recyclerview.widget.p */
public class C0934p extends C0951y {

    /* renamed from: b */
    public static final float f5177b = 1.0f;
    @ts2

    /* renamed from: a */
    public C0942t f5178a;
    @ts2

    /* renamed from: b */
    public C0942t f5179b;

    /* renamed from: c */
    public int[] mo6476c(@mr2 RecyclerView.C0819p pVar, @mr2 View view) {
        int[] iArr = new int[2];
        if (pVar.mo5304n()) {
            iArr[0] = mo6480n(view, mo6483q(pVar));
        } else {
            iArr[0] = 0;
        }
        if (pVar.mo5307o()) {
            iArr[1] = mo6480n(view, mo6484r(pVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    /* renamed from: h */
    public View mo6477h(RecyclerView.C0819p pVar) {
        C0942t q;
        if (pVar.mo5307o()) {
            q = mo6484r(pVar);
        } else if (!pVar.mo5304n()) {
            return null;
        } else {
            q = mo6483q(pVar);
        }
        return mo6482p(pVar, q);
    }

    /* renamed from: i */
    public int mo6478i(RecyclerView.C0819p pVar, int i, int i2) {
        int g0;
        View h;
        int s0;
        int i3;
        PointF a;
        int i4;
        int i5;
        if (!(pVar instanceof RecyclerView.C0793b0.C0795b) || (g0 = pVar.mo5869g0()) == 0 || (h = mo6477h(pVar)) == null || (s0 = pVar.mo5893s0(h)) == -1 || (a = ((RecyclerView.C0793b0.C0795b) pVar).mo5284a(i3)) == null) {
            return -1;
        }
        int i6 = 0;
        if (pVar.mo5304n()) {
            i4 = mo6481o(pVar, mo6483q(pVar), i, 0);
            if (a.x < 0.0f) {
                i4 = -i4;
            }
        } else {
            i4 = 0;
        }
        if (pVar.mo5307o()) {
            i5 = mo6481o(pVar, mo6484r(pVar), 0, i2);
            if (a.y < 0.0f) {
                i5 = -i5;
            }
        } else {
            i5 = 0;
        }
        if (pVar.mo5307o()) {
            i4 = i5;
        }
        if (i4 == 0) {
            return -1;
        }
        int i7 = s0 + i4;
        if (i7 >= 0) {
            i6 = i7;
        }
        return i6 >= g0 ? g0 - 1 : i6;
    }

    /* renamed from: m */
    public final float mo6479m(RecyclerView.C0819p pVar, C0942t tVar) {
        int max;
        int Q = pVar.mo5828Q();
        if (Q == 0) {
            return 1.0f;
        }
        View view = null;
        View view2 = null;
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < Q; i3++) {
            View P = pVar.mo5825P(i3);
            int s0 = pVar.mo5893s0(P);
            if (s0 != -1) {
                if (s0 < i) {
                    view = P;
                    i = s0;
                }
                if (s0 > i2) {
                    view2 = P;
                    i2 = s0;
                }
            }
        }
        if (view == null || view2 == null || (max = Math.max(tVar.mo6502d(view), tVar.mo6502d(view2)) - Math.min(tVar.mo6505g(view), tVar.mo6505g(view2))) == 0) {
            return 1.0f;
        }
        return (((float) max) * 1.0f) / ((float) ((i2 - i) + 1));
    }

    /* renamed from: n */
    public final int mo6480n(@mr2 View view, C0942t tVar) {
        return (tVar.mo6505g(view) + (tVar.mo6503e(view) / 2)) - (tVar.mo6512n() + (tVar.mo6513o() / 2));
    }

    /* renamed from: o */
    public final int mo6481o(RecyclerView.C0819p pVar, C0942t tVar, int i, int i2) {
        int[] d = mo6555d(i, i2);
        float m = mo6479m(pVar, tVar);
        if (m <= 0.0f) {
            return 0;
        }
        return Math.round(((float) (Math.abs(d[0]) > Math.abs(d[1]) ? d[0] : d[1])) / m);
    }

    @ts2
    /* renamed from: p */
    public final View mo6482p(RecyclerView.C0819p pVar, C0942t tVar) {
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
    /* renamed from: q */
    public final C0942t mo6483q(@mr2 RecyclerView.C0819p pVar) {
        C0942t tVar = this.f5179b;
        if (tVar == null || tVar.f5196a != pVar) {
            this.f5179b = C0942t.m6517a(pVar);
        }
        return this.f5179b;
    }

    @mr2
    /* renamed from: r */
    public final C0942t mo6484r(@mr2 RecyclerView.C0819p pVar) {
        C0942t tVar = this.f5178a;
        if (tVar == null || tVar.f5196a != pVar) {
            this.f5178a = C0942t.m6519c(pVar);
        }
        return this.f5178a;
    }
}
