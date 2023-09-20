package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.mr2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.h */
public class C0887h extends C0950x {

    /* renamed from: a */
    public static TimeInterpolator f4904a = null;

    /* renamed from: c */
    public static final boolean f4905c = false;

    /* renamed from: b */
    public ArrayList<RecyclerView.C0803f0> f4906b = new ArrayList<>();

    /* renamed from: c */
    public ArrayList<RecyclerView.C0803f0> f4907c = new ArrayList<>();

    /* renamed from: d */
    public ArrayList<C0897j> f4908d = new ArrayList<>();

    /* renamed from: e */
    public ArrayList<C0896i> f4909e = new ArrayList<>();

    /* renamed from: f */
    public ArrayList<ArrayList<RecyclerView.C0803f0>> f4910f = new ArrayList<>();

    /* renamed from: g */
    public ArrayList<ArrayList<C0897j>> f4911g = new ArrayList<>();

    /* renamed from: h */
    public ArrayList<ArrayList<C0896i>> f4912h = new ArrayList<>();

    /* renamed from: i */
    public ArrayList<RecyclerView.C0803f0> f4913i = new ArrayList<>();

    /* renamed from: j */
    public ArrayList<RecyclerView.C0803f0> f4914j = new ArrayList<>();

    /* renamed from: k */
    public ArrayList<RecyclerView.C0803f0> f4915k = new ArrayList<>();

    /* renamed from: l */
    public ArrayList<RecyclerView.C0803f0> f4916l = new ArrayList<>();

    /* renamed from: androidx.recyclerview.widget.h$a */
    public class C0888a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ ArrayList f4918a;

        public C0888a(ArrayList arrayList) {
            this.f4918a = arrayList;
        }

        public void run() {
            Iterator it = this.f4918a.iterator();
            while (it.hasNext()) {
                C0897j jVar = (C0897j) it.next();
                C0887h.this.mo6287b0(jVar.f4952a, jVar.f4951a, jVar.f4953b, jVar.f4954c, jVar.f4955d);
            }
            this.f4918a.clear();
            C0887h.this.f4911g.remove(this.f4918a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.h$b */
    public class C0889b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ ArrayList f4920a;

        public C0889b(ArrayList arrayList) {
            this.f4920a = arrayList;
        }

        public void run() {
            Iterator it = this.f4920a.iterator();
            while (it.hasNext()) {
                C0887h.this.mo6286a0((C0896i) it.next());
            }
            this.f4920a.clear();
            C0887h.this.f4912h.remove(this.f4920a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.h$c */
    public class C0890c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ ArrayList f4922a;

        public C0890c(ArrayList arrayList) {
            this.f4922a = arrayList;
        }

        public void run() {
            Iterator it = this.f4922a.iterator();
            while (it.hasNext()) {
                C0887h.this.mo6285Z((RecyclerView.C0803f0) it.next());
            }
            this.f4922a.clear();
            C0887h.this.f4910f.remove(this.f4922a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.h$d */
    public class C0891d extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ View f4923a;

        /* renamed from: a */
        public final /* synthetic */ ViewPropertyAnimator f4924a;

        /* renamed from: a */
        public final /* synthetic */ RecyclerView.C0803f0 f4925a;

        public C0891d(RecyclerView.C0803f0 f0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f4925a = f0Var;
            this.f4924a = viewPropertyAnimator;
            this.f4923a = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f4924a.setListener((Animator.AnimatorListener) null);
            this.f4923a.setAlpha(1.0f);
            C0887h.this.mo6542N(this.f4925a);
            C0887h.this.f4915k.remove(this.f4925a);
            C0887h.this.mo6290e0();
        }

        public void onAnimationStart(Animator animator) {
            C0887h.this.mo6543O(this.f4925a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.h$e */
    public class C0892e extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ View f4927a;

        /* renamed from: a */
        public final /* synthetic */ ViewPropertyAnimator f4928a;

        /* renamed from: a */
        public final /* synthetic */ RecyclerView.C0803f0 f4929a;

        public C0892e(RecyclerView.C0803f0 f0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f4929a = f0Var;
            this.f4927a = view;
            this.f4928a = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            this.f4927a.setAlpha(1.0f);
        }

        public void onAnimationEnd(Animator animator) {
            this.f4928a.setListener((Animator.AnimatorListener) null);
            C0887h.this.mo6536H(this.f4929a);
            C0887h.this.f4913i.remove(this.f4929a);
            C0887h.this.mo6290e0();
        }

        public void onAnimationStart(Animator animator) {
            C0887h.this.mo6537I(this.f4929a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.h$f */
    public class C0893f extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ int f4931a;

        /* renamed from: a */
        public final /* synthetic */ View f4932a;

        /* renamed from: a */
        public final /* synthetic */ ViewPropertyAnimator f4933a;

        /* renamed from: a */
        public final /* synthetic */ RecyclerView.C0803f0 f4934a;

        /* renamed from: b */
        public final /* synthetic */ int f4936b;

        public C0893f(RecyclerView.C0803f0 f0Var, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
            this.f4934a = f0Var;
            this.f4931a = i;
            this.f4932a = view;
            this.f4936b = i2;
            this.f4933a = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            if (this.f4931a != 0) {
                this.f4932a.setTranslationX(0.0f);
            }
            if (this.f4936b != 0) {
                this.f4932a.setTranslationY(0.0f);
            }
        }

        public void onAnimationEnd(Animator animator) {
            this.f4933a.setListener((Animator.AnimatorListener) null);
            C0887h.this.mo6540L(this.f4934a);
            C0887h.this.f4914j.remove(this.f4934a);
            C0887h.this.mo6290e0();
        }

        public void onAnimationStart(Animator animator) {
            C0887h.this.mo6541M(this.f4934a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.h$g */
    public class C0894g extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ View f4937a;

        /* renamed from: a */
        public final /* synthetic */ ViewPropertyAnimator f4938a;

        /* renamed from: a */
        public final /* synthetic */ C0896i f4939a;

        public C0894g(C0896i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f4939a = iVar;
            this.f4938a = viewPropertyAnimator;
            this.f4937a = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f4938a.setListener((Animator.AnimatorListener) null);
            this.f4937a.setAlpha(1.0f);
            this.f4937a.setTranslationX(0.0f);
            this.f4937a.setTranslationY(0.0f);
            C0887h.this.mo6538J(this.f4939a.f4946a, true);
            C0887h.this.f4916l.remove(this.f4939a.f4946a);
            C0887h.this.mo6290e0();
        }

        public void onAnimationStart(Animator animator) {
            C0887h.this.mo6539K(this.f4939a.f4946a, true);
        }
    }

    /* renamed from: androidx.recyclerview.widget.h$h */
    public class C0895h extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ View f4941a;

        /* renamed from: a */
        public final /* synthetic */ ViewPropertyAnimator f4942a;

        /* renamed from: a */
        public final /* synthetic */ C0896i f4943a;

        public C0895h(C0896i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f4943a = iVar;
            this.f4942a = viewPropertyAnimator;
            this.f4941a = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f4942a.setListener((Animator.AnimatorListener) null);
            this.f4941a.setAlpha(1.0f);
            this.f4941a.setTranslationX(0.0f);
            this.f4941a.setTranslationY(0.0f);
            C0887h.this.mo6538J(this.f4943a.f4948b, false);
            C0887h.this.f4916l.remove(this.f4943a.f4948b);
            C0887h.this.mo6290e0();
        }

        public void onAnimationStart(Animator animator) {
            C0887h.this.mo6539K(this.f4943a.f4948b, false);
        }
    }

    /* renamed from: androidx.recyclerview.widget.h$i */
    public static class C0896i {

        /* renamed from: a */
        public int f4945a;

        /* renamed from: a */
        public RecyclerView.C0803f0 f4946a;

        /* renamed from: b */
        public int f4947b;

        /* renamed from: b */
        public RecyclerView.C0803f0 f4948b;

        /* renamed from: c */
        public int f4949c;

        /* renamed from: d */
        public int f4950d;

        public C0896i(RecyclerView.C0803f0 f0Var, RecyclerView.C0803f0 f0Var2) {
            this.f4946a = f0Var;
            this.f4948b = f0Var2;
        }

        public C0896i(RecyclerView.C0803f0 f0Var, RecyclerView.C0803f0 f0Var2, int i, int i2, int i3, int i4) {
            this(f0Var, f0Var2);
            this.f4945a = i;
            this.f4947b = i2;
            this.f4949c = i3;
            this.f4950d = i4;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f4946a + ", newHolder=" + this.f4948b + ", fromX=" + this.f4945a + ", fromY=" + this.f4947b + ", toX=" + this.f4949c + ", toY=" + this.f4950d + '}';
        }
    }

    /* renamed from: androidx.recyclerview.widget.h$j */
    public static class C0897j {

        /* renamed from: a */
        public int f4951a;

        /* renamed from: a */
        public RecyclerView.C0803f0 f4952a;

        /* renamed from: b */
        public int f4953b;

        /* renamed from: c */
        public int f4954c;

        /* renamed from: d */
        public int f4955d;

        public C0897j(RecyclerView.C0803f0 f0Var, int i, int i2, int i3, int i4) {
            this.f4952a = f0Var;
            this.f4951a = i;
            this.f4953b = i2;
            this.f4954c = i3;
            this.f4955d = i4;
        }
    }

    /* renamed from: D */
    public boolean mo6281D(RecyclerView.C0803f0 f0Var) {
        mo6294i0(f0Var);
        f0Var.f4609a.setAlpha(0.0f);
        this.f4907c.add(f0Var);
        return true;
    }

    /* renamed from: E */
    public boolean mo6282E(RecyclerView.C0803f0 f0Var, RecyclerView.C0803f0 f0Var2, int i, int i2, int i3, int i4) {
        if (f0Var == f0Var2) {
            return mo6283F(f0Var, i, i2, i3, i4);
        }
        float translationX = f0Var.f4609a.getTranslationX();
        float translationY = f0Var.f4609a.getTranslationY();
        float alpha = f0Var.f4609a.getAlpha();
        mo6294i0(f0Var);
        int i5 = (int) (((float) (i3 - i)) - translationX);
        int i6 = (int) (((float) (i4 - i2)) - translationY);
        f0Var.f4609a.setTranslationX(translationX);
        f0Var.f4609a.setTranslationY(translationY);
        f0Var.f4609a.setAlpha(alpha);
        if (f0Var2 != null) {
            mo6294i0(f0Var2);
            f0Var2.f4609a.setTranslationX((float) (-i5));
            f0Var2.f4609a.setTranslationY((float) (-i6));
            f0Var2.f4609a.setAlpha(0.0f);
        }
        this.f4909e.add(new C0896i(f0Var, f0Var2, i, i2, i3, i4));
        return true;
    }

    /* renamed from: F */
    public boolean mo6283F(RecyclerView.C0803f0 f0Var, int i, int i2, int i3, int i4) {
        View view = f0Var.f4609a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) f0Var.f4609a.getTranslationY());
        mo6294i0(f0Var);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            mo6540L(f0Var);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX((float) (-i5));
        }
        if (i6 != 0) {
            view.setTranslationY((float) (-i6));
        }
        this.f4908d.add(new C0897j(f0Var, translationX, translationY, i3, i4));
        return true;
    }

    /* renamed from: G */
    public boolean mo6284G(RecyclerView.C0803f0 f0Var) {
        mo6294i0(f0Var);
        this.f4906b.add(f0Var);
        return true;
    }

    /* renamed from: Z */
    public void mo6285Z(RecyclerView.C0803f0 f0Var) {
        View view = f0Var.f4609a;
        ViewPropertyAnimator animate = view.animate();
        this.f4913i.add(f0Var);
        animate.alpha(1.0f).setDuration(mo5762m()).setListener(new C0892e(f0Var, view, animate)).start();
    }

    /* renamed from: a0 */
    public void mo6286a0(C0896i iVar) {
        RecyclerView.C0803f0 f0Var = iVar.f4946a;
        View view = null;
        View view2 = f0Var == null ? null : f0Var.f4609a;
        RecyclerView.C0803f0 f0Var2 = iVar.f4948b;
        if (f0Var2 != null) {
            view = f0Var2.f4609a;
        }
        if (view2 != null) {
            ViewPropertyAnimator duration = view2.animate().setDuration(mo5763n());
            this.f4916l.add(iVar.f4946a);
            duration.translationX((float) (iVar.f4949c - iVar.f4945a));
            duration.translationY((float) (iVar.f4950d - iVar.f4947b));
            duration.alpha(0.0f).setListener(new C0894g(iVar, duration, view2)).start();
        }
        if (view != null) {
            ViewPropertyAnimator animate = view.animate();
            this.f4916l.add(iVar.f4948b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(mo5763n()).alpha(1.0f).setListener(new C0895h(iVar, animate, view)).start();
        }
    }

    /* renamed from: b0 */
    public void mo6287b0(RecyclerView.C0803f0 f0Var, int i, int i2, int i3, int i4) {
        View view = f0Var.f4609a;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (i5 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i6 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.f4914j.add(f0Var);
        animate.setDuration(mo5764o()).setListener(new C0893f(f0Var, i5, view, i6, animate)).start();
    }

    /* renamed from: c0 */
    public final void mo6288c0(RecyclerView.C0803f0 f0Var) {
        View view = f0Var.f4609a;
        ViewPropertyAnimator animate = view.animate();
        this.f4915k.add(f0Var);
        animate.setDuration(mo5765p()).alpha(0.0f).setListener(new C0891d(f0Var, animate, view)).start();
    }

    /* renamed from: d0 */
    public void mo6289d0(List<RecyclerView.C0803f0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).f4609a.animate().cancel();
        }
    }

    /* renamed from: e0 */
    public void mo6290e0() {
        if (!mo5766q()) {
            mo5759j();
        }
    }

    /* renamed from: f0 */
    public final void mo6291f0(List<C0896i> list, RecyclerView.C0803f0 f0Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C0896i iVar = list.get(size);
            if (mo6293h0(iVar, f0Var) && iVar.f4946a == null && iVar.f4948b == null) {
                list.remove(iVar);
            }
        }
    }

    /* renamed from: g */
    public boolean mo5756g(@mr2 RecyclerView.C0803f0 f0Var, @mr2 List<Object> list) {
        return !list.isEmpty() || super.mo5756g(f0Var, list);
    }

    /* renamed from: g0 */
    public final void mo6292g0(C0896i iVar) {
        RecyclerView.C0803f0 f0Var = iVar.f4946a;
        if (f0Var != null) {
            mo6293h0(iVar, f0Var);
        }
        RecyclerView.C0803f0 f0Var2 = iVar.f4948b;
        if (f0Var2 != null) {
            mo6293h0(iVar, f0Var2);
        }
    }

    /* renamed from: h0 */
    public final boolean mo6293h0(C0896i iVar, RecyclerView.C0803f0 f0Var) {
        boolean z = false;
        if (iVar.f4948b == f0Var) {
            iVar.f4948b = null;
        } else if (iVar.f4946a != f0Var) {
            return false;
        } else {
            iVar.f4946a = null;
            z = true;
        }
        f0Var.f4609a.setAlpha(1.0f);
        f0Var.f4609a.setTranslationX(0.0f);
        f0Var.f4609a.setTranslationY(0.0f);
        mo6538J(f0Var, z);
        return true;
    }

    /* renamed from: i0 */
    public final void mo6294i0(RecyclerView.C0803f0 f0Var) {
        if (f4904a == null) {
            f4904a = new ValueAnimator().getInterpolator();
        }
        f0Var.f4609a.animate().setInterpolator(f4904a);
        mo5760k(f0Var);
    }

    /* renamed from: k */
    public void mo5760k(RecyclerView.C0803f0 f0Var) {
        View view = f0Var.f4609a;
        view.animate().cancel();
        int size = this.f4908d.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.f4908d.get(size).f4952a == f0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                mo6540L(f0Var);
                this.f4908d.remove(size);
            }
        }
        mo6291f0(this.f4909e, f0Var);
        if (this.f4906b.remove(f0Var)) {
            view.setAlpha(1.0f);
            mo6542N(f0Var);
        }
        if (this.f4907c.remove(f0Var)) {
            view.setAlpha(1.0f);
            mo6536H(f0Var);
        }
        for (int size2 = this.f4912h.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = this.f4912h.get(size2);
            mo6291f0(arrayList, f0Var);
            if (arrayList.isEmpty()) {
                this.f4912h.remove(size2);
            }
        }
        for (int size3 = this.f4911g.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = this.f4911g.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((C0897j) arrayList2.get(size4)).f4952a == f0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    mo6540L(f0Var);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f4911g.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f4910f.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = this.f4910f.get(size5);
            if (arrayList3.remove(f0Var)) {
                view.setAlpha(1.0f);
                mo6536H(f0Var);
                if (arrayList3.isEmpty()) {
                    this.f4910f.remove(size5);
                }
            }
        }
        this.f4915k.remove(f0Var);
        this.f4913i.remove(f0Var);
        this.f4916l.remove(f0Var);
        this.f4914j.remove(f0Var);
        mo6290e0();
    }

    /* renamed from: l */
    public void mo5761l() {
        int size = this.f4908d.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C0897j jVar = this.f4908d.get(size);
            View view = jVar.f4952a.f4609a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            mo6540L(jVar.f4952a);
            this.f4908d.remove(size);
        }
        for (int size2 = this.f4906b.size() - 1; size2 >= 0; size2--) {
            mo6542N(this.f4906b.get(size2));
            this.f4906b.remove(size2);
        }
        int size3 = this.f4907c.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.C0803f0 f0Var = this.f4907c.get(size3);
            f0Var.f4609a.setAlpha(1.0f);
            mo6536H(f0Var);
            this.f4907c.remove(size3);
        }
        for (int size4 = this.f4909e.size() - 1; size4 >= 0; size4--) {
            mo6292g0(this.f4909e.get(size4));
        }
        this.f4909e.clear();
        if (mo5766q()) {
            for (int size5 = this.f4911g.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = this.f4911g.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    C0897j jVar2 = (C0897j) arrayList.get(size6);
                    View view2 = jVar2.f4952a.f4609a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    mo6540L(jVar2.f4952a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f4911g.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f4910f.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = this.f4910f.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.C0803f0 f0Var2 = (RecyclerView.C0803f0) arrayList2.get(size8);
                    f0Var2.f4609a.setAlpha(1.0f);
                    mo6536H(f0Var2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f4910f.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f4912h.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = this.f4912h.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    mo6292g0((C0896i) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f4912h.remove(arrayList3);
                    }
                }
            }
            mo6289d0(this.f4915k);
            mo6289d0(this.f4914j);
            mo6289d0(this.f4913i);
            mo6289d0(this.f4916l);
            mo5759j();
        }
    }

    /* renamed from: q */
    public boolean mo5766q() {
        return !this.f4907c.isEmpty() || !this.f4909e.isEmpty() || !this.f4908d.isEmpty() || !this.f4906b.isEmpty() || !this.f4914j.isEmpty() || !this.f4915k.isEmpty() || !this.f4913i.isEmpty() || !this.f4916l.isEmpty() || !this.f4911g.isEmpty() || !this.f4910f.isEmpty() || !this.f4912h.isEmpty();
    }

    /* renamed from: x */
    public void mo5773x() {
        boolean z = !this.f4906b.isEmpty();
        boolean z2 = !this.f4908d.isEmpty();
        boolean z3 = !this.f4909e.isEmpty();
        boolean z4 = !this.f4907c.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator<RecyclerView.C0803f0> it = this.f4906b.iterator();
            while (it.hasNext()) {
                mo6288c0(it.next());
            }
            this.f4906b.clear();
            if (z2) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f4908d);
                this.f4911g.add(arrayList);
                this.f4908d.clear();
                C0888a aVar = new C0888a(arrayList);
                if (z) {
                    jt4.m18997q1(((C0897j) arrayList.get(0)).f4952a.f4609a, aVar, mo5765p());
                } else {
                    aVar.run();
                }
            }
            if (z3) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.f4909e);
                this.f4912h.add(arrayList2);
                this.f4909e.clear();
                C0889b bVar = new C0889b(arrayList2);
                if (z) {
                    jt4.m18997q1(((C0896i) arrayList2.get(0)).f4946a.f4609a, bVar, mo5765p());
                } else {
                    bVar.run();
                }
            }
            if (z4) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.f4907c);
                this.f4910f.add(arrayList3);
                this.f4907c.clear();
                C0890c cVar = new C0890c(arrayList3);
                if (z || z2 || z3) {
                    long j = 0;
                    long p = z ? mo5765p() : 0;
                    long o = z2 ? mo5764o() : 0;
                    if (z3) {
                        j = mo5763n();
                    }
                    jt4.m18997q1(((RecyclerView.C0803f0) arrayList3.get(0)).f4609a, cVar, p + Math.max(o, j));
                    return;
                }
                cVar.run();
            }
        }
    }
}
