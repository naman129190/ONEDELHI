package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.t */
public abstract class C0942t {

    /* renamed from: b */
    public static final int f5191b = Integer.MIN_VALUE;

    /* renamed from: c */
    public static final int f5192c = 0;

    /* renamed from: d */
    public static final int f5193d = 1;

    /* renamed from: a */
    public int f5194a;

    /* renamed from: a */
    public final Rect f5195a;

    /* renamed from: a */
    public final RecyclerView.C0819p f5196a;

    /* renamed from: androidx.recyclerview.widget.t$a */
    public class C0943a extends C0942t {
        public C0943a(RecyclerView.C0819p pVar) {
            super(pVar, (C0943a) null);
        }

        /* renamed from: d */
        public int mo6502d(View view) {
            return this.f5196a.mo5852b0(view) + ((RecyclerView.LayoutParams) view.getLayoutParams()).rightMargin;
        }

        /* renamed from: e */
        public int mo6503e(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.f5196a.mo5850a0(view) + layoutParams.leftMargin + layoutParams.rightMargin;
        }

        /* renamed from: f */
        public int mo6504f(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.f5196a.mo5848Z(view) + layoutParams.topMargin + layoutParams.bottomMargin;
        }

        /* renamed from: g */
        public int mo6505g(View view) {
            return this.f5196a.mo5846Y(view) - ((RecyclerView.LayoutParams) view.getLayoutParams()).leftMargin;
        }

        /* renamed from: h */
        public int mo6506h() {
            return this.f5196a.mo5904z0();
        }

        /* renamed from: i */
        public int mo6507i() {
            return this.f5196a.mo5904z0() - this.f5196a.mo5888p0();
        }

        /* renamed from: j */
        public int mo6508j() {
            return this.f5196a.mo5888p0();
        }

        /* renamed from: l */
        public int mo6510l() {
            return this.f5196a.mo5787A0();
        }

        /* renamed from: m */
        public int mo6511m() {
            return this.f5196a.mo5866f0();
        }

        /* renamed from: n */
        public int mo6512n() {
            return this.f5196a.mo5887o0();
        }

        /* renamed from: o */
        public int mo6513o() {
            return (this.f5196a.mo5904z0() - this.f5196a.mo5887o0()) - this.f5196a.mo5888p0();
        }

        /* renamed from: q */
        public int mo6515q(View view) {
            this.f5196a.mo5901y0(view, true, this.f5195a);
            return this.f5195a.right;
        }

        /* renamed from: r */
        public int mo6516r(View view) {
            this.f5196a.mo5901y0(view, true, this.f5195a);
            return this.f5195a.left;
        }

        /* renamed from: s */
        public void mo6517s(View view, int i) {
            view.offsetLeftAndRight(i);
        }

        /* renamed from: t */
        public void mo6518t(int i) {
            this.f5196a.mo5833T0(i);
        }
    }

    /* renamed from: androidx.recyclerview.widget.t$b */
    public class C0944b extends C0942t {
        public C0944b(RecyclerView.C0819p pVar) {
            super(pVar, (C0943a) null);
        }

        /* renamed from: d */
        public int mo6502d(View view) {
            return this.f5196a.mo5840W(view) + ((RecyclerView.LayoutParams) view.getLayoutParams()).bottomMargin;
        }

        /* renamed from: e */
        public int mo6503e(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.f5196a.mo5848Z(view) + layoutParams.topMargin + layoutParams.bottomMargin;
        }

        /* renamed from: f */
        public int mo6504f(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.f5196a.mo5850a0(view) + layoutParams.leftMargin + layoutParams.rightMargin;
        }

        /* renamed from: g */
        public int mo6505g(View view) {
            return this.f5196a.mo5855c0(view) - ((RecyclerView.LayoutParams) view.getLayoutParams()).topMargin;
        }

        /* renamed from: h */
        public int mo6506h() {
            return this.f5196a.mo5862e0();
        }

        /* renamed from: i */
        public int mo6507i() {
            return this.f5196a.mo5862e0() - this.f5196a.mo5884m0();
        }

        /* renamed from: j */
        public int mo6508j() {
            return this.f5196a.mo5884m0();
        }

        /* renamed from: l */
        public int mo6510l() {
            return this.f5196a.mo5866f0();
        }

        /* renamed from: m */
        public int mo6511m() {
            return this.f5196a.mo5787A0();
        }

        /* renamed from: n */
        public int mo6512n() {
            return this.f5196a.mo5891r0();
        }

        /* renamed from: o */
        public int mo6513o() {
            return (this.f5196a.mo5862e0() - this.f5196a.mo5891r0()) - this.f5196a.mo5884m0();
        }

        /* renamed from: q */
        public int mo6515q(View view) {
            this.f5196a.mo5901y0(view, true, this.f5195a);
            return this.f5195a.bottom;
        }

        /* renamed from: r */
        public int mo6516r(View view) {
            this.f5196a.mo5901y0(view, true, this.f5195a);
            return this.f5195a.top;
        }

        /* renamed from: s */
        public void mo6517s(View view, int i) {
            view.offsetTopAndBottom(i);
        }

        /* renamed from: t */
        public void mo6518t(int i) {
            this.f5196a.mo5836U0(i);
        }
    }

    public C0942t(RecyclerView.C0819p pVar) {
        this.f5194a = Integer.MIN_VALUE;
        this.f5195a = new Rect();
        this.f5196a = pVar;
    }

    public /* synthetic */ C0942t(RecyclerView.C0819p pVar, C0943a aVar) {
        this(pVar);
    }

    /* renamed from: a */
    public static C0942t m6517a(RecyclerView.C0819p pVar) {
        return new C0943a(pVar);
    }

    /* renamed from: b */
    public static C0942t m6518b(RecyclerView.C0819p pVar, int i) {
        if (i == 0) {
            return m6517a(pVar);
        }
        if (i == 1) {
            return m6519c(pVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    /* renamed from: c */
    public static C0942t m6519c(RecyclerView.C0819p pVar) {
        return new C0944b(pVar);
    }

    /* renamed from: d */
    public abstract int mo6502d(View view);

    /* renamed from: e */
    public abstract int mo6503e(View view);

    /* renamed from: f */
    public abstract int mo6504f(View view);

    /* renamed from: g */
    public abstract int mo6505g(View view);

    /* renamed from: h */
    public abstract int mo6506h();

    /* renamed from: i */
    public abstract int mo6507i();

    /* renamed from: j */
    public abstract int mo6508j();

    /* renamed from: k */
    public RecyclerView.C0819p mo6509k() {
        return this.f5196a;
    }

    /* renamed from: l */
    public abstract int mo6510l();

    /* renamed from: m */
    public abstract int mo6511m();

    /* renamed from: n */
    public abstract int mo6512n();

    /* renamed from: o */
    public abstract int mo6513o();

    /* renamed from: p */
    public int mo6514p() {
        if (Integer.MIN_VALUE == this.f5194a) {
            return 0;
        }
        return mo6513o() - this.f5194a;
    }

    /* renamed from: q */
    public abstract int mo6515q(View view);

    /* renamed from: r */
    public abstract int mo6516r(View view);

    /* renamed from: s */
    public abstract void mo6517s(View view, int i);

    /* renamed from: t */
    public abstract void mo6518t(int i);

    /* renamed from: u */
    public void mo6519u() {
        this.f5194a = mo6513o();
    }
}
