package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;

/* renamed from: androidx.recyclerview.widget.x */
public abstract class C0950x extends RecyclerView.C0812m {

    /* renamed from: a */
    public static final String f5205a = "SimpleItemAnimator";

    /* renamed from: b */
    public static final boolean f5206b = false;

    /* renamed from: a */
    public boolean f5207a = true;

    /* renamed from: D */
    public abstract boolean mo6281D(RecyclerView.C0803f0 f0Var);

    /* renamed from: E */
    public abstract boolean mo6282E(RecyclerView.C0803f0 f0Var, RecyclerView.C0803f0 f0Var2, int i, int i2, int i3, int i4);

    /* renamed from: F */
    public abstract boolean mo6283F(RecyclerView.C0803f0 f0Var, int i, int i2, int i3, int i4);

    /* renamed from: G */
    public abstract boolean mo6284G(RecyclerView.C0803f0 f0Var);

    /* renamed from: H */
    public final void mo6536H(RecyclerView.C0803f0 f0Var) {
        mo6545Q(f0Var);
        mo5757h(f0Var);
    }

    /* renamed from: I */
    public final void mo6537I(RecyclerView.C0803f0 f0Var) {
        mo6546R(f0Var);
    }

    /* renamed from: J */
    public final void mo6538J(RecyclerView.C0803f0 f0Var, boolean z) {
        mo6547S(f0Var, z);
        mo5757h(f0Var);
    }

    /* renamed from: K */
    public final void mo6539K(RecyclerView.C0803f0 f0Var, boolean z) {
        mo6548T(f0Var, z);
    }

    /* renamed from: L */
    public final void mo6540L(RecyclerView.C0803f0 f0Var) {
        mo6549U(f0Var);
        mo5757h(f0Var);
    }

    /* renamed from: M */
    public final void mo6541M(RecyclerView.C0803f0 f0Var) {
        mo6550V(f0Var);
    }

    /* renamed from: N */
    public final void mo6542N(RecyclerView.C0803f0 f0Var) {
        mo6551W(f0Var);
        mo5757h(f0Var);
    }

    /* renamed from: O */
    public final void mo6543O(RecyclerView.C0803f0 f0Var) {
        mo6552X(f0Var);
    }

    /* renamed from: P */
    public boolean mo6544P() {
        return this.f5207a;
    }

    /* renamed from: Q */
    public void mo6545Q(RecyclerView.C0803f0 f0Var) {
    }

    /* renamed from: R */
    public void mo6546R(RecyclerView.C0803f0 f0Var) {
    }

    /* renamed from: S */
    public void mo6547S(RecyclerView.C0803f0 f0Var, boolean z) {
    }

    /* renamed from: T */
    public void mo6548T(RecyclerView.C0803f0 f0Var, boolean z) {
    }

    /* renamed from: U */
    public void mo6549U(RecyclerView.C0803f0 f0Var) {
    }

    /* renamed from: V */
    public void mo6550V(RecyclerView.C0803f0 f0Var) {
    }

    /* renamed from: W */
    public void mo6551W(RecyclerView.C0803f0 f0Var) {
    }

    /* renamed from: X */
    public void mo6552X(RecyclerView.C0803f0 f0Var) {
    }

    /* renamed from: Y */
    public void mo6553Y(boolean z) {
        this.f5207a = z;
    }

    /* renamed from: a */
    public boolean mo5751a(@mr2 RecyclerView.C0803f0 f0Var, @ts2 RecyclerView.C0812m.C0816d dVar, @mr2 RecyclerView.C0812m.C0816d dVar2) {
        int i;
        int i2;
        if (dVar == null || ((i = dVar.f4651a) == (i2 = dVar2.f4651a) && dVar.f4652b == dVar2.f4652b)) {
            return mo6281D(f0Var);
        }
        return mo6283F(f0Var, i, dVar.f4652b, i2, dVar2.f4652b);
    }

    /* renamed from: b */
    public boolean mo5752b(@mr2 RecyclerView.C0803f0 f0Var, @mr2 RecyclerView.C0803f0 f0Var2, @mr2 RecyclerView.C0812m.C0816d dVar, @mr2 RecyclerView.C0812m.C0816d dVar2) {
        int i;
        int i2;
        int i3 = dVar.f4651a;
        int i4 = dVar.f4652b;
        if (f0Var2.mo5667N()) {
            int i5 = dVar.f4651a;
            i = dVar.f4652b;
            i2 = i5;
        } else {
            i2 = dVar2.f4651a;
            i = dVar2.f4652b;
        }
        return mo6282E(f0Var, f0Var2, i3, i4, i2, i);
    }

    /* renamed from: c */
    public boolean mo5753c(@mr2 RecyclerView.C0803f0 f0Var, @mr2 RecyclerView.C0812m.C0816d dVar, @ts2 RecyclerView.C0812m.C0816d dVar2) {
        int i = dVar.f4651a;
        int i2 = dVar.f4652b;
        View view = f0Var.f4609a;
        int left = dVar2 == null ? view.getLeft() : dVar2.f4651a;
        int top = dVar2 == null ? view.getTop() : dVar2.f4652b;
        if (f0Var.mo5697z() || (i == left && i2 == top)) {
            return mo6284G(f0Var);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return mo6283F(f0Var, i, i2, left, top);
    }

    /* renamed from: d */
    public boolean mo5754d(@mr2 RecyclerView.C0803f0 f0Var, @mr2 RecyclerView.C0812m.C0816d dVar, @mr2 RecyclerView.C0812m.C0816d dVar2) {
        int i = dVar.f4651a;
        int i2 = dVar2.f4651a;
        if (i == i2 && dVar.f4652b == dVar2.f4652b) {
            mo6540L(f0Var);
            return false;
        }
        return mo6283F(f0Var, i, dVar.f4652b, i2, dVar2.f4652b);
    }

    /* renamed from: f */
    public boolean mo5755f(@mr2 RecyclerView.C0803f0 f0Var) {
        return !this.f5207a || f0Var.mo5695x();
    }
}
