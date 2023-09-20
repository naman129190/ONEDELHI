package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import com.onedelhi.secure.hb1;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.mr2;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"RestrictedApi"})
@hl3({hl3.C2354a.f13188c})
/* renamed from: androidx.transition.b */
public class C1052b extends hb1 {

    /* renamed from: androidx.transition.b$a */
    public class C1053a extends Transition.C1041f {

        /* renamed from: a */
        public final /* synthetic */ Rect f5648a;

        public C1053a(Rect rect) {
            this.f5648a = rect;
        }

        /* renamed from: a */
        public Rect mo6963a(@mr2 Transition transition) {
            return this.f5648a;
        }
    }

    /* renamed from: androidx.transition.b$b */
    public class C1054b implements Transition.C1043h {

        /* renamed from: a */
        public final /* synthetic */ View f5650a;

        /* renamed from: a */
        public final /* synthetic */ ArrayList f5652a;

        public C1054b(View view, ArrayList arrayList) {
            this.f5650a = view;
            this.f5652a = arrayList;
        }

        /* renamed from: a */
        public void mo6964a(@mr2 Transition transition) {
        }

        /* renamed from: b */
        public void mo6830b(@mr2 Transition transition) {
        }

        /* renamed from: c */
        public void mo6831c(@mr2 Transition transition) {
        }

        /* renamed from: d */
        public void mo6832d(@mr2 Transition transition) {
        }

        /* renamed from: e */
        public void mo6833e(@mr2 Transition transition) {
            transition.mo6926h0(this);
            this.f5650a.setVisibility(8);
            int size = this.f5652a.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f5652a.get(i)).setVisibility(0);
            }
        }
    }

    /* renamed from: androidx.transition.b$c */
    public class C1055c extends C1085i {

        /* renamed from: a */
        public final /* synthetic */ Object f5654a;

        /* renamed from: a */
        public final /* synthetic */ ArrayList f5655a;

        /* renamed from: b */
        public final /* synthetic */ Object f5656b;

        /* renamed from: b */
        public final /* synthetic */ ArrayList f5657b;

        /* renamed from: c */
        public final /* synthetic */ Object f5658c;

        /* renamed from: c */
        public final /* synthetic */ ArrayList f5659c;

        public C1055c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f5654a = obj;
            this.f5655a = arrayList;
            this.f5656b = obj2;
            this.f5657b = arrayList2;
            this.f5658c = obj3;
            this.f5659c = arrayList3;
        }

        /* renamed from: a */
        public void mo6964a(@mr2 Transition transition) {
            Object obj = this.f5654a;
            if (obj != null) {
                C1052b.this.mo7012q(obj, this.f5655a, (ArrayList<View>) null);
            }
            Object obj2 = this.f5656b;
            if (obj2 != null) {
                C1052b.this.mo7012q(obj2, this.f5657b, (ArrayList<View>) null);
            }
            Object obj3 = this.f5658c;
            if (obj3 != null) {
                C1052b.this.mo7012q(obj3, this.f5659c, (ArrayList<View>) null);
            }
        }

        /* renamed from: e */
        public void mo6833e(@mr2 Transition transition) {
            transition.mo6926h0(this);
        }
    }

    /* renamed from: androidx.transition.b$d */
    public class C1056d extends Transition.C1041f {

        /* renamed from: a */
        public final /* synthetic */ Rect f5660a;

        public C1056d(Rect rect) {
            this.f5660a = rect;
        }

        /* renamed from: a */
        public Rect mo6963a(@mr2 Transition transition) {
            Rect rect = this.f5660a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f5660a;
        }
    }

    /* renamed from: C */
    public static boolean m7121C(Transition transition) {
        return !hb1.m16588l(transition.mo6904P()) || !hb1.m16588l(transition.mo6905Q()) || !hb1.m16588l(transition.mo6906R());
    }

    /* renamed from: A */
    public void mo7002A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.mo6907S().clear();
            transitionSet.mo6907S().addAll(arrayList2);
            mo7012q(transitionSet, arrayList, arrayList2);
        }
    }

    /* renamed from: B */
    public Object mo7003B(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.mo6970F0((Transition) obj);
        return transitionSet;
    }

    /* renamed from: a */
    public void mo7004a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).mo6916c(view);
        }
    }

    /* renamed from: b */
    public void mo7005b(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            int i = 0;
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                int J0 = transitionSet.mo6974J0();
                while (i < J0) {
                    mo7005b(transitionSet.mo6973I0(i), arrayList);
                    i++;
                }
            } else if (!m7121C(transition) && hb1.m16588l(transition.mo6907S())) {
                int size = arrayList.size();
                while (i < size) {
                    transition.mo6916c(arrayList.get(i));
                    i++;
                }
            }
        }
    }

    /* renamed from: c */
    public void mo7006c(ViewGroup viewGroup, Object obj) {
        C1086j.m7185b(viewGroup, (Transition) obj);
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
            transition = new TransitionSet().mo6970F0(transition).mo6970F0(transition2).mo6983S0(1);
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transition != null) {
            transitionSet.mo6970F0(transition);
        }
        transitionSet.mo6970F0(transition3);
        return transitionSet;
    }

    /* renamed from: n */
    public Object mo7010n(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.mo6970F0((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.mo6970F0((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.mo6970F0((Transition) obj3);
        }
        return transitionSet;
    }

    /* renamed from: p */
    public void mo7011p(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).mo6929j0(view);
        }
    }

    /* renamed from: q */
    public void mo7012q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int J0 = transitionSet.mo6974J0();
            while (i < J0) {
                mo7012q(transitionSet.mo6973I0(i), arrayList, arrayList2);
                i++;
            }
        } else if (!m7121C(transition)) {
            List<View> S = transition.mo6907S();
            if (S.size() == arrayList.size() && S.containsAll(arrayList)) {
                int size = arrayList2 == null ? 0 : arrayList2.size();
                while (i < size) {
                    transition.mo6916c(arrayList2.get(i));
                    i++;
                }
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    transition.mo6929j0(arrayList.get(size2));
                }
            }
        }
    }

    /* renamed from: r */
    public void mo7013r(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).mo6912a(new C1054b(view, arrayList));
    }

    /* renamed from: t */
    public void mo7014t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).mo6912a(new C1055c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    /* renamed from: u */
    public void mo7015u(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).mo6943r0(new C1056d(rect));
        }
    }

    /* renamed from: v */
    public void mo7016v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            mo17172k(view, rect);
            ((Transition) obj).mo6943r0(new C1053a(rect));
        }
    }

    /* renamed from: z */
    public void mo7017z(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> S = transitionSet.mo6907S();
        S.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            hb1.m16585d(S, arrayList.get(i));
        }
        S.add(view);
        arrayList.add(view);
        mo7005b(transitionSet, arrayList);
    }
}
