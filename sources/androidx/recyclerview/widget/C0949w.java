package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.w */
public class C0949w {
    /* renamed from: a */
    public static int m6598a(RecyclerView.C0797c0 c0Var, C0942t tVar, View view, View view2, RecyclerView.C0819p pVar, boolean z) {
        if (pVar.mo5828Q() == 0 || c0Var.mo5609d() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(pVar.mo5893s0(view) - pVar.mo5893s0(view2)) + 1;
        }
        return Math.min(tVar.mo6513o(), tVar.mo6502d(view2) - tVar.mo6505g(view));
    }

    /* renamed from: b */
    public static int m6599b(RecyclerView.C0797c0 c0Var, C0942t tVar, View view, View view2, RecyclerView.C0819p pVar, boolean z, boolean z2) {
        if (pVar.mo5828Q() == 0 || c0Var.mo5609d() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z2 ? Math.max(0, (c0Var.mo5609d() - Math.max(pVar.mo5893s0(view), pVar.mo5893s0(view2))) - 1) : Math.max(0, Math.min(pVar.mo5893s0(view), pVar.mo5893s0(view2)));
        if (!z) {
            return max;
        }
        return Math.round((((float) max) * (((float) Math.abs(tVar.mo6502d(view2) - tVar.mo6505g(view))) / ((float) (Math.abs(pVar.mo5893s0(view) - pVar.mo5893s0(view2)) + 1)))) + ((float) (tVar.mo6512n() - tVar.mo6505g(view))));
    }

    /* renamed from: c */
    public static int m6600c(RecyclerView.C0797c0 c0Var, C0942t tVar, View view, View view2, RecyclerView.C0819p pVar, boolean z) {
        if (pVar.mo5828Q() == 0 || c0Var.mo5609d() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return c0Var.mo5609d();
        }
        return (int) ((((float) (tVar.mo6502d(view2) - tVar.mo6505g(view))) / ((float) (Math.abs(pVar.mo5893s0(view) - pVar.mo5893s0(view2)) + 1))) * ((float) c0Var.mo5609d()));
    }
}
