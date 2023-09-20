package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.onedelhi.secure.C3042oa;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.transition.j */
public class C1086j {

    /* renamed from: a */
    public static Transition f5715a = new AutoTransition();

    /* renamed from: a */
    public static final String f5716a = "TransitionManager";

    /* renamed from: a */
    public static ThreadLocal<WeakReference<C3042oa<ViewGroup, ArrayList<Transition>>>> f5717a = new ThreadLocal<>();

    /* renamed from: a */
    public static ArrayList<ViewGroup> f5718a = new ArrayList<>();

    /* renamed from: a */
    public C3042oa<C1071f, Transition> f5719a = new C3042oa<>();

    /* renamed from: b */
    public C3042oa<C1071f, C3042oa<C1071f, Transition>> f5720b = new C3042oa<>();

    /* renamed from: androidx.transition.j$a */
    public static class C1087a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: a */
        public ViewGroup f5721a;

        /* renamed from: a */
        public Transition f5722a;

        /* renamed from: androidx.transition.j$a$a */
        public class C1088a extends C1085i {

            /* renamed from: a */
            public final /* synthetic */ C3042oa f5724a;

            public C1088a(C3042oa oaVar) {
                this.f5724a = oaVar;
            }

            /* renamed from: e */
            public void mo6833e(@mr2 Transition transition) {
                ((ArrayList) this.f5724a.get(C1087a.this.f5721a)).remove(transition);
                transition.mo6926h0(this);
            }
        }

        public C1087a(Transition transition, ViewGroup viewGroup) {
            this.f5722a = transition;
            this.f5721a = viewGroup;
        }

        /* renamed from: a */
        public final void mo7048a() {
            this.f5721a.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f5721a.removeOnAttachStateChangeListener(this);
        }

        public boolean onPreDraw() {
            mo7048a();
            if (!C1086j.f5718a.remove(this.f5721a)) {
                return true;
            }
            C3042oa<ViewGroup, ArrayList<Transition>> e = C1086j.m7188e();
            ArrayList arrayList = e.get(this.f5721a);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                e.put(this.f5721a, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f5722a);
            this.f5722a.mo6912a(new C1088a(e));
            this.f5722a.mo6935n(this.f5721a, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((Transition) it.next()).mo6934m0(this.f5721a);
                }
            }
            this.f5722a.mo6925g0(this.f5721a);
            return true;
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            mo7048a();
            C1086j.f5718a.remove(this.f5721a);
            ArrayList arrayList = C1086j.m7188e().get(this.f5721a);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((Transition) it.next()).mo6934m0(this.f5721a);
                }
            }
            this.f5722a.mo6937o(true);
        }
    }

    /* renamed from: a */
    public static void m7184a(@mr2 ViewGroup viewGroup) {
        m7185b(viewGroup, (Transition) null);
    }

    /* renamed from: b */
    public static void m7185b(@mr2 ViewGroup viewGroup, @ts2 Transition transition) {
        if (!f5718a.contains(viewGroup) && jt4.m18914U0(viewGroup)) {
            f5718a.add(viewGroup);
            if (transition == null) {
                transition = f5715a;
            }
            Transition p = transition.clone();
            m7192j(viewGroup, p);
            C1071f.m7164g(viewGroup, (C1071f) null);
            m7191i(viewGroup, p);
        }
    }

    /* renamed from: c */
    public static void m7186c(C1071f fVar, Transition transition) {
        ViewGroup e = fVar.mo7033e();
        if (!f5718a.contains(e)) {
            C1071f c = C1071f.m7162c(e);
            if (transition == null) {
                if (c != null) {
                    c.mo7032b();
                }
                fVar.mo7031a();
                return;
            }
            f5718a.add(e);
            Transition p = transition.clone();
            p.mo6954w0(e);
            if (c != null && c.mo7034f()) {
                p.mo6940p0(true);
            }
            m7192j(e, p);
            fVar.mo7031a();
            m7191i(e, p);
        }
    }

    /* renamed from: d */
    public static void m7187d(ViewGroup viewGroup) {
        f5718a.remove(viewGroup);
        ArrayList arrayList = m7188e().get(viewGroup);
        if (arrayList != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                ((Transition) arrayList2.get(size)).mo6894E(viewGroup);
            }
        }
    }

    /* renamed from: e */
    public static C3042oa<ViewGroup, ArrayList<Transition>> m7188e() {
        C3042oa<ViewGroup, ArrayList<Transition>> oaVar;
        WeakReference weakReference = f5717a.get();
        if (weakReference != null && (oaVar = (C3042oa) weakReference.get()) != null) {
            return oaVar;
        }
        C3042oa<ViewGroup, ArrayList<Transition>> oaVar2 = new C3042oa<>();
        f5717a.set(new WeakReference(oaVar2));
        return oaVar2;
    }

    /* renamed from: g */
    public static void m7189g(@mr2 C1071f fVar) {
        m7186c(fVar, f5715a);
    }

    /* renamed from: h */
    public static void m7190h(@mr2 C1071f fVar, @ts2 Transition transition) {
        m7186c(fVar, transition);
    }

    /* renamed from: i */
    public static void m7191i(ViewGroup viewGroup, Transition transition) {
        if (transition != null && viewGroup != null) {
            C1087a aVar = new C1087a(transition, viewGroup);
            viewGroup.addOnAttachStateChangeListener(aVar);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
        }
    }

    /* renamed from: j */
    public static void m7192j(ViewGroup viewGroup, Transition transition) {
        ArrayList arrayList = m7188e().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Transition) it.next()).mo6924f0(viewGroup);
            }
        }
        if (transition != null) {
            transition.mo6935n(viewGroup, true);
        }
        C1071f c = C1071f.m7162c(viewGroup);
        if (c != null) {
            c.mo7032b();
        }
    }

    /* renamed from: f */
    public final Transition mo7044f(C1071f fVar) {
        C1071f c;
        C3042oa oaVar;
        Transition transition;
        ViewGroup e = fVar.mo7033e();
        if (e != null && (c = C1071f.m7162c(e)) != null && (oaVar = this.f5720b.get(fVar)) != null && (transition = (Transition) oaVar.get(c)) != null) {
            return transition;
        }
        Transition transition2 = this.f5719a.get(fVar);
        return transition2 != null ? transition2 : f5715a;
    }

    /* renamed from: k */
    public void mo7045k(@mr2 C1071f fVar, @mr2 C1071f fVar2, @ts2 Transition transition) {
        C3042oa oaVar = this.f5720b.get(fVar2);
        if (oaVar == null) {
            oaVar = new C3042oa();
            this.f5720b.put(fVar2, oaVar);
        }
        oaVar.put(fVar, transition);
    }

    /* renamed from: l */
    public void mo7046l(@mr2 C1071f fVar, @ts2 Transition transition) {
        this.f5719a.put(fVar, transition);
    }

    /* renamed from: m */
    public void mo7047m(@mr2 C1071f fVar) {
        m7186c(fVar, mo7044f(fVar));
    }
}
