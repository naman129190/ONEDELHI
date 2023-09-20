package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import com.onedelhi.secure.C1638a2;
import com.onedelhi.secure.C1740b2;
import com.onedelhi.secure.C3884x1;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: androidx.recyclerview.widget.v */
public class C0947v extends C3884x1 {

    /* renamed from: a */
    public final RecyclerView f5201a;

    /* renamed from: a */
    public final C0948a f5202a;

    /* renamed from: androidx.recyclerview.widget.v$a */
    public static class C0948a extends C3884x1 {

        /* renamed from: a */
        public final C0947v f5203a;

        /* renamed from: a */
        public Map<View, C3884x1> f5204a = new WeakHashMap();

        public C0948a(@mr2 C0947v vVar) {
            this.f5203a = vVar;
        }

        /* renamed from: a */
        public boolean mo4112a(@mr2 View view, @mr2 AccessibilityEvent accessibilityEvent) {
            C3884x1 x1Var = this.f5204a.get(view);
            return x1Var != null ? x1Var.mo4112a(view, accessibilityEvent) : super.mo4112a(view, accessibilityEvent);
        }

        @ts2
        /* renamed from: b */
        public C1740b2 mo6530b(@mr2 View view) {
            C3884x1 x1Var = this.f5204a.get(view);
            return x1Var != null ? x1Var.mo6530b(view) : super.mo6530b(view);
        }

        /* renamed from: f */
        public void mo3892f(@mr2 View view, @mr2 AccessibilityEvent accessibilityEvent) {
            C3884x1 x1Var = this.f5204a.get(view);
            if (x1Var != null) {
                x1Var.mo3892f(view, accessibilityEvent);
            } else {
                super.mo3892f(view, accessibilityEvent);
            }
        }

        /* renamed from: g */
        public void mo3893g(View view, C1638a2 a2Var) {
            if (!this.f5203a.mo6529o() && this.f5203a.f5201a.getLayoutManager() != null) {
                this.f5203a.f5201a.getLayoutManager().mo5867f1(view, a2Var);
                C3884x1 x1Var = this.f5204a.get(view);
                if (x1Var != null) {
                    x1Var.mo3893g(view, a2Var);
                    return;
                }
            }
            super.mo3893g(view, a2Var);
        }

        /* renamed from: h */
        public void mo6531h(@mr2 View view, @mr2 AccessibilityEvent accessibilityEvent) {
            C3884x1 x1Var = this.f5204a.get(view);
            if (x1Var != null) {
                x1Var.mo6531h(view, accessibilityEvent);
            } else {
                super.mo6531h(view, accessibilityEvent);
            }
        }

        /* renamed from: i */
        public boolean mo4113i(@mr2 ViewGroup viewGroup, @mr2 View view, @mr2 AccessibilityEvent accessibilityEvent) {
            C3884x1 x1Var = this.f5204a.get(viewGroup);
            return x1Var != null ? x1Var.mo4113i(viewGroup, view, accessibilityEvent) : super.mo4113i(viewGroup, view, accessibilityEvent);
        }

        /* renamed from: j */
        public boolean mo3894j(View view, int i, Bundle bundle) {
            if (this.f5203a.mo6529o() || this.f5203a.f5201a.getLayoutManager() == null) {
                return super.mo3894j(view, i, bundle);
            }
            C3884x1 x1Var = this.f5204a.get(view);
            if (x1Var != null) {
                if (x1Var.mo3894j(view, i, bundle)) {
                    return true;
                }
            } else if (super.mo3894j(view, i, bundle)) {
                return true;
            }
            return this.f5203a.f5201a.getLayoutManager().mo5905z1(view, i, bundle);
        }

        /* renamed from: l */
        public void mo6532l(@mr2 View view, int i) {
            C3884x1 x1Var = this.f5204a.get(view);
            if (x1Var != null) {
                x1Var.mo6532l(view, i);
            } else {
                super.mo6532l(view, i);
            }
        }

        /* renamed from: m */
        public void mo6533m(@mr2 View view, @mr2 AccessibilityEvent accessibilityEvent) {
            C3884x1 x1Var = this.f5204a.get(view);
            if (x1Var != null) {
                x1Var.mo6533m(view, accessibilityEvent);
            } else {
                super.mo6533m(view, accessibilityEvent);
            }
        }

        /* renamed from: n */
        public C3884x1 mo6534n(View view) {
            return this.f5204a.remove(view);
        }

        /* renamed from: o */
        public void mo6535o(View view) {
            C3884x1 E = jt4.m18859E(view);
            if (E != null && E != this) {
                this.f5204a.put(view, E);
            }
        }
    }

    public C0947v(@mr2 RecyclerView recyclerView) {
        this.f5201a = recyclerView;
        C3884x1 n = mo6528n();
        this.f5202a = (n == null || !(n instanceof C0948a)) ? new C0948a(this) : (C0948a) n;
    }

    /* renamed from: f */
    public void mo3892f(View view, AccessibilityEvent accessibilityEvent) {
        super.mo3892f(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !mo6529o()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().mo5287b1(accessibilityEvent);
            }
        }
    }

    /* renamed from: g */
    public void mo3893g(View view, C1638a2 a2Var) {
        super.mo3893g(view, a2Var);
        if (!mo6529o() && this.f5201a.getLayoutManager() != null) {
            this.f5201a.getLayoutManager().mo5863e1(a2Var);
        }
    }

    /* renamed from: j */
    public boolean mo3894j(View view, int i, Bundle bundle) {
        if (super.mo3894j(view, i, bundle)) {
            return true;
        }
        if (mo6529o() || this.f5201a.getLayoutManager() == null) {
            return false;
        }
        return this.f5201a.getLayoutManager().mo5900x1(i, bundle);
    }

    @mr2
    /* renamed from: n */
    public C3884x1 mo6528n() {
        return this.f5202a;
    }

    /* renamed from: o */
    public boolean mo6529o() {
        return this.f5201a.mo5362D0();
    }
}
