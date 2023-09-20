package com.onedelhi.secure;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.List;

@sj3(21)
public class gb1 extends hb1 {

    /* renamed from: com.onedelhi.secure.gb1$a */
    public class C2226a extends Transition.EpicenterCallback {

        /* renamed from: a */
        public final /* synthetic */ Rect f12489a;

        public C2226a(Rect rect) {
            this.f12489a = rect;
        }

        public Rect onGetEpicenter(Transition transition) {
            return this.f12489a;
        }
    }

    /* renamed from: com.onedelhi.secure.gb1$b */
    public class C2227b implements Transition.TransitionListener {

        /* renamed from: a */
        public final /* synthetic */ View f12491a;

        /* renamed from: a */
        public final /* synthetic */ ArrayList f12493a;

        public C2227b(View view, ArrayList arrayList) {
            this.f12491a = view;
            this.f12493a = arrayList;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f12491a.setVisibility(8);
            int size = this.f12493a.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f12493a.get(i)).setVisibility(0);
            }
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
            transition.removeListener(this);
            transition.addListener(this);
        }
    }

    /* renamed from: com.onedelhi.secure.gb1$c */
    public class C2228c implements Transition.TransitionListener {

        /* renamed from: a */
        public final /* synthetic */ Object f12495a;

        /* renamed from: a */
        public final /* synthetic */ ArrayList f12496a;

        /* renamed from: b */
        public final /* synthetic */ Object f12497b;

        /* renamed from: b */
        public final /* synthetic */ ArrayList f12498b;

        /* renamed from: c */
        public final /* synthetic */ Object f12499c;

        /* renamed from: c */
        public final /* synthetic */ ArrayList f12500c;

        public C2228c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f12495a = obj;
            this.f12496a = arrayList;
            this.f12497b = obj2;
            this.f12498b = arrayList2;
            this.f12499c = obj3;
            this.f12500c = arrayList3;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
            Object obj = this.f12495a;
            if (obj != null) {
                gb1.this.mo7012q(obj, this.f12496a, (ArrayList<View>) null);
            }
            Object obj2 = this.f12497b;
            if (obj2 != null) {
                gb1.this.mo7012q(obj2, this.f12498b, (ArrayList<View>) null);
            }
            Object obj3 = this.f12499c;
            if (obj3 != null) {
                gb1.this.mo7012q(obj3, this.f12500c, (ArrayList<View>) null);
            }
        }
    }

    /* renamed from: com.onedelhi.secure.gb1$d */
    public class C2229d implements Transition.TransitionListener {

        /* renamed from: a */
        public final /* synthetic */ Runnable f12502a;

        public C2229d(Runnable runnable) {
            this.f12502a = runnable;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            this.f12502a.run();
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
        }
    }

    /* renamed from: com.onedelhi.secure.gb1$e */
    public class C2230e extends Transition.EpicenterCallback {

        /* renamed from: a */
        public final /* synthetic */ Rect f12503a;

        public C2230e(Rect rect) {
            this.f12503a = rect;
        }

        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f12503a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f12503a;
        }
    }

    /* renamed from: C */
    public static boolean m15658C(Transition transition) {
        return !hb1.m16588l(transition.getTargetIds()) || !hb1.m16588l(transition.getTargetNames()) || !hb1.m16588l(transition.getTargetTypes());
    }

    /* renamed from: A */
    public void mo7002A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            mo7012q(transitionSet, arrayList, arrayList2);
        }
    }

    /* renamed from: B */
    public Object mo7003B(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    /* renamed from: a */
    public void mo7004a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    /* renamed from: b */
    public void mo7005b(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            int i = 0;
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                int transitionCount = transitionSet.getTransitionCount();
                while (i < transitionCount) {
                    mo7005b(transitionSet.getTransitionAt(i), arrayList);
                    i++;
                }
            } else if (!m15658C(transition) && hb1.m16588l(transition.getTargets())) {
                int size = arrayList.size();
                while (i < size) {
                    transition.addTarget(arrayList.get(i));
                    i++;
                }
            }
        }
    }

    /* renamed from: c */
    public void mo7006c(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    /* renamed from: e */
    public boolean mo7007e(Object obj) {
        return obj instanceof Transition;
    }

    /* renamed from: g */
    public Object mo7008g(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    /* renamed from: m */
    public Object mo7009m(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
        transitionSet.addTransition(transition3);
        return transitionSet;
    }

    /* renamed from: n */
    public Object mo7010n(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    /* renamed from: p */
    public void mo7011p(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }

    /* renamed from: q */
    public void mo7012q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                mo7012q(transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
        } else if (!m15658C(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i < size) {
                transition.addTarget(arrayList2.get(i));
                i++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                transition.removeTarget(arrayList.get(size2));
            }
        }
    }

    /* renamed from: r */
    public void mo7013r(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new C2227b(view, arrayList));
    }

    /* renamed from: t */
    public void mo7014t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new C2228c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    /* renamed from: u */
    public void mo7015u(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new C2230e(rect));
        }
    }

    /* renamed from: v */
    public void mo7016v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            mo17172k(view, rect);
            ((Transition) obj).setEpicenterCallback(new C2226a(rect));
        }
    }

    /* renamed from: w */
    public void mo16455w(@mr2 Fragment fragment, @mr2 Object obj, @mr2 C3345qu quVar, @mr2 Runnable runnable) {
        ((Transition) obj).addListener(new C2229d(runnable));
    }

    /* renamed from: z */
    public void mo7017z(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            hb1.m16585d(targets, arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        mo7005b(transitionSet, arrayList);
    }
}
