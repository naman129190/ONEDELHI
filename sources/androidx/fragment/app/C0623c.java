package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.C0638d;
import androidx.fragment.app.C0668n;
import com.onedelhi.secure.C3042oa;
import com.onedelhi.secure.C3345qu;
import com.onedelhi.secure.hb1;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.k43;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ot4;
import com.onedelhi.secure.px3;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.tv2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.fragment.app.c */
public class C0623c extends C0668n {

    /* renamed from: androidx.fragment.app.c$a */
    public static /* synthetic */ class C0624a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3796a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.fragment.app.n$e$c[] r0 = androidx.fragment.app.C0668n.C0673e.C0676c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3796a = r0
                androidx.fragment.app.n$e$c r1 = androidx.fragment.app.C0668n.C0673e.C0676c.GONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f3796a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.fragment.app.n$e$c r1 = androidx.fragment.app.C0668n.C0673e.C0676c.INVISIBLE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f3796a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.fragment.app.n$e$c r1 = androidx.fragment.app.C0668n.C0673e.C0676c.REMOVED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f3796a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.fragment.app.n$e$c r1 = androidx.fragment.app.C0668n.C0673e.C0676c.VISIBLE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0623c.C0624a.<clinit>():void");
        }
    }

    /* renamed from: androidx.fragment.app.c$b */
    public class C0625b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C0668n.C0673e f3798a;

        /* renamed from: a */
        public final /* synthetic */ List f3799a;

        public C0625b(List list, C0668n.C0673e eVar) {
            this.f3799a = list;
            this.f3798a = eVar;
        }

        public void run() {
            if (this.f3799a.contains(this.f3798a)) {
                this.f3799a.remove(this.f3798a);
                C0623c.this.mo4742s(this.f3798a);
            }
        }
    }

    /* renamed from: androidx.fragment.app.c$c */
    public class C0626c extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ View f3800a;

        /* renamed from: a */
        public final /* synthetic */ ViewGroup f3801a;

        /* renamed from: a */
        public final /* synthetic */ C0635k f3802a;

        /* renamed from: a */
        public final /* synthetic */ C0668n.C0673e f3804a;

        /* renamed from: a */
        public final /* synthetic */ boolean f3805a;

        public C0626c(ViewGroup viewGroup, View view, boolean z, C0668n.C0673e eVar, C0635k kVar) {
            this.f3801a = viewGroup;
            this.f3800a = view;
            this.f3805a = z;
            this.f3804a = eVar;
            this.f3802a = kVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f3801a.endViewTransition(this.f3800a);
            if (this.f3805a) {
                this.f3804a.mo4902e().mo4910a(this.f3800a);
            }
            this.f3802a.mo4760a();
        }
    }

    /* renamed from: androidx.fragment.app.c$d */
    public class C0627d implements C3345qu.C3347b {

        /* renamed from: a */
        public final /* synthetic */ Animator f3806a;

        public C0627d(Animator animator) {
            this.f3806a = animator;
        }

        public void onCancel() {
            this.f3806a.end();
        }
    }

    /* renamed from: androidx.fragment.app.c$e */
    public class C0628e implements Animation.AnimationListener {

        /* renamed from: a */
        public final /* synthetic */ View f3808a;

        /* renamed from: a */
        public final /* synthetic */ ViewGroup f3809a;

        /* renamed from: a */
        public final /* synthetic */ C0635k f3810a;

        /* renamed from: androidx.fragment.app.c$e$a */
        public class C0629a implements Runnable {
            public C0629a() {
            }

            public void run() {
                C0628e eVar = C0628e.this;
                eVar.f3809a.endViewTransition(eVar.f3808a);
                C0628e.this.f3810a.mo4760a();
            }
        }

        public C0628e(ViewGroup viewGroup, View view, C0635k kVar) {
            this.f3809a = viewGroup;
            this.f3808a = view;
            this.f3810a = kVar;
        }

        public void onAnimationEnd(Animation animation) {
            this.f3809a.post(new C0629a());
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: androidx.fragment.app.c$f */
    public class C0630f implements C3345qu.C3347b {

        /* renamed from: a */
        public final /* synthetic */ View f3813a;

        /* renamed from: a */
        public final /* synthetic */ ViewGroup f3814a;

        /* renamed from: a */
        public final /* synthetic */ C0635k f3815a;

        public C0630f(View view, ViewGroup viewGroup, C0635k kVar) {
            this.f3813a = view;
            this.f3814a = viewGroup;
            this.f3815a = kVar;
        }

        public void onCancel() {
            this.f3813a.clearAnimation();
            this.f3814a.endViewTransition(this.f3813a);
            this.f3815a.mo4760a();
        }
    }

    /* renamed from: androidx.fragment.app.c$g */
    public class C0631g implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C0668n.C0673e f3818a;

        /* renamed from: a */
        public final /* synthetic */ C3042oa f3819a;

        /* renamed from: b */
        public final /* synthetic */ C0668n.C0673e f3820b;

        /* renamed from: b */
        public final /* synthetic */ boolean f3821b;

        public C0631g(C0668n.C0673e eVar, C0668n.C0673e eVar2, boolean z, C3042oa oaVar) {
            this.f3818a = eVar;
            this.f3820b = eVar2;
            this.f3821b = z;
            this.f3819a = oaVar;
        }

        public void run() {
            C0659m.m4661f(this.f3818a.mo4903f(), this.f3820b.mo4903f(), this.f3821b, this.f3819a, false);
        }
    }

    /* renamed from: androidx.fragment.app.c$h */
    public class C0632h implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Rect f3822a;

        /* renamed from: a */
        public final /* synthetic */ View f3823a;

        /* renamed from: a */
        public final /* synthetic */ hb1 f3825a;

        public C0632h(hb1 hb1, View view, Rect rect) {
            this.f3825a = hb1;
            this.f3823a = view;
            this.f3822a = rect;
        }

        public void run() {
            this.f3825a.mo17172k(this.f3823a, this.f3822a);
        }
    }

    /* renamed from: androidx.fragment.app.c$i */
    public class C0633i implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ ArrayList f3827a;

        public C0633i(ArrayList arrayList) {
            this.f3827a = arrayList;
        }

        public void run() {
            C0659m.m4653B(this.f3827a, 4);
        }
    }

    /* renamed from: androidx.fragment.app.c$j */
    public class C0634j implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C0637m f3828a;

        public C0634j(C0637m mVar) {
            this.f3828a = mVar;
        }

        public void run() {
            this.f3828a.mo4760a();
        }
    }

    /* renamed from: androidx.fragment.app.c$k */
    public static class C0635k extends C0636l {
        @ts2

        /* renamed from: a */
        public C0638d.C0643d f3830a;

        /* renamed from: a */
        public boolean f3831a;

        /* renamed from: b */
        public boolean f3832b = false;

        public C0635k(@mr2 C0668n.C0673e eVar, @mr2 C3345qu quVar, boolean z) {
            super(eVar, quVar);
            this.f3831a = z;
        }

        @ts2
        /* renamed from: e */
        public C0638d.C0643d mo4759e(@mr2 Context context) {
            if (this.f3832b) {
                return this.f3830a;
            }
            C0638d.C0643d c = C0638d.m4538c(context, mo4761b().mo4903f(), mo4761b().mo4902e() == C0668n.C0673e.C0676c.VISIBLE, this.f3831a);
            this.f3830a = c;
            this.f3832b = true;
            return c;
        }
    }

    /* renamed from: androidx.fragment.app.c$l */
    public static class C0636l {
        @mr2

        /* renamed from: a */
        public final C0668n.C0673e f3833a;
        @mr2

        /* renamed from: a */
        public final C3345qu f3834a;

        public C0636l(@mr2 C0668n.C0673e eVar, @mr2 C3345qu quVar) {
            this.f3833a = eVar;
            this.f3834a = quVar;
        }

        /* renamed from: a */
        public void mo4760a() {
            this.f3833a.mo4901d(this.f3834a);
        }

        @mr2
        /* renamed from: b */
        public C0668n.C0673e mo4761b() {
            return this.f3833a;
        }

        @mr2
        /* renamed from: c */
        public C3345qu mo4762c() {
            return this.f3834a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0014, code lost:
            r2 = androidx.fragment.app.C0668n.C0673e.C0676c.VISIBLE;
         */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo4763d() {
            /*
                r3 = this;
                androidx.fragment.app.n$e r0 = r3.f3833a
                androidx.fragment.app.Fragment r0 = r0.mo4903f()
                android.view.View r0 = r0.mView
                androidx.fragment.app.n$e$c r0 = androidx.fragment.app.C0668n.C0673e.C0676c.m4717e(r0)
                androidx.fragment.app.n$e r1 = r3.f3833a
                androidx.fragment.app.n$e$c r1 = r1.mo4902e()
                if (r0 == r1) goto L_0x001d
                androidx.fragment.app.n$e$c r2 = androidx.fragment.app.C0668n.C0673e.C0676c.VISIBLE
                if (r0 == r2) goto L_0x001b
                if (r1 == r2) goto L_0x001b
                goto L_0x001d
            L_0x001b:
                r0 = 0
                goto L_0x001e
            L_0x001d:
                r0 = 1
            L_0x001e:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0623c.C0636l.mo4763d():boolean");
        }
    }

    /* renamed from: androidx.fragment.app.c$m */
    public static class C0637m extends C0636l {
        @ts2

        /* renamed from: a */
        public final Object f3835a;

        /* renamed from: a */
        public final boolean f3836a;
        @ts2

        /* renamed from: b */
        public final Object f3837b;

        public C0637m(@mr2 C0668n.C0673e eVar, @mr2 C3345qu quVar, boolean z, boolean z2) {
            super(eVar, quVar);
            boolean z3;
            Object obj;
            if (eVar.mo4902e() == C0668n.C0673e.C0676c.VISIBLE) {
                Fragment f = eVar.mo4903f();
                this.f3835a = z ? f.getReenterTransition() : f.getEnterTransition();
                Fragment f2 = eVar.mo4903f();
                z3 = z ? f2.getAllowReturnTransitionOverlap() : f2.getAllowEnterTransitionOverlap();
            } else {
                Fragment f3 = eVar.mo4903f();
                this.f3835a = z ? f3.getReturnTransition() : f3.getExitTransition();
                z3 = true;
            }
            this.f3836a = z3;
            if (z2) {
                Fragment f4 = eVar.mo4903f();
                obj = z ? f4.getSharedElementReturnTransition() : f4.getSharedElementEnterTransition();
            } else {
                obj = null;
            }
            this.f3837b = obj;
        }

        @ts2
        /* renamed from: e */
        public hb1 mo4764e() {
            hb1 f = mo4765f(this.f3835a);
            hb1 f2 = mo4765f(this.f3837b);
            if (f == null || f2 == null || f == f2) {
                return f != null ? f : f2;
            }
            throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + mo4761b().mo4903f() + " returned Transition " + this.f3835a + " which uses a different Transition  type than its shared element transition " + this.f3837b);
        }

        @ts2
        /* renamed from: f */
        public final hb1 mo4765f(Object obj) {
            if (obj == null) {
                return null;
            }
            hb1 hb1 = C0659m.f3948a;
            if (hb1 != null && hb1.mo7007e(obj)) {
                return hb1;
            }
            hb1 hb12 = C0659m.f3950b;
            if (hb12 != null && hb12.mo7007e(obj)) {
                return hb12;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + mo4761b().mo4903f() + " is not a valid framework Transition or AndroidX Transition");
        }

        @ts2
        /* renamed from: g */
        public Object mo4766g() {
            return this.f3837b;
        }

        @ts2
        /* renamed from: h */
        public Object mo4767h() {
            return this.f3835a;
        }

        /* renamed from: i */
        public boolean mo4768i() {
            return this.f3837b != null;
        }

        /* renamed from: j */
        public boolean mo4769j() {
            return this.f3836a;
        }
    }

    public C0623c(@mr2 ViewGroup viewGroup) {
        super(viewGroup);
    }

    /* renamed from: f */
    public void mo4741f(@mr2 List<C0668n.C0673e> list, boolean z) {
        C0668n.C0673e eVar = null;
        C0668n.C0673e eVar2 = null;
        for (C0668n.C0673e next : list) {
            C0668n.C0673e.C0676c e = C0668n.C0673e.C0676c.m4717e(next.mo4903f().mView);
            int i = C0624a.f3796a[next.mo4902e().ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                if (e == C0668n.C0673e.C0676c.VISIBLE && eVar == null) {
                    eVar = next;
                }
            } else if (i == 4 && e != C0668n.C0673e.C0676c.VISIBLE) {
                eVar2 = next;
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList<C0668n.C0673e> arrayList3 = new ArrayList<>(list);
        for (C0668n.C0673e next2 : list) {
            C3345qu quVar = new C3345qu();
            next2.mo4907j(quVar);
            arrayList.add(new C0635k(next2, quVar, z));
            C3345qu quVar2 = new C3345qu();
            next2.mo4907j(quVar2);
            boolean z2 = false;
            if (z) {
                if (next2 != eVar) {
                    arrayList2.add(new C0637m(next2, quVar2, z, z2));
                    next2.mo4899a(new C0625b(arrayList3, next2));
                }
            } else if (next2 != eVar2) {
                arrayList2.add(new C0637m(next2, quVar2, z, z2));
                next2.mo4899a(new C0625b(arrayList3, next2));
            }
            z2 = true;
            arrayList2.add(new C0637m(next2, quVar2, z, z2));
            next2.mo4899a(new C0625b(arrayList3, next2));
        }
        Map<C0668n.C0673e, Boolean> x = mo4747x(arrayList2, arrayList3, z, eVar, eVar2);
        mo4746w(arrayList, arrayList3, x.containsValue(Boolean.TRUE), x);
        for (C0668n.C0673e s : arrayList3) {
            mo4742s(s);
        }
        arrayList3.clear();
    }

    /* renamed from: s */
    public void mo4742s(@mr2 C0668n.C0673e eVar) {
        eVar.mo4902e().mo4910a(eVar.mo4903f().mView);
    }

    /* renamed from: t */
    public void mo4743t(ArrayList<View> arrayList, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!ot4.m24066c(viewGroup)) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt.getVisibility() == 0) {
                        mo4743t(arrayList, childAt);
                    }
                }
            } else if (!arrayList.contains(view)) {
                arrayList.add(viewGroup);
            }
        } else if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    /* renamed from: u */
    public void mo4744u(Map<String, View> map, @mr2 View view) {
        String x0 = jt4.m19024x0(view);
        if (x0 != null) {
            map.put(x0, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    mo4744u(map, childAt);
                }
            }
        }
    }

    /* renamed from: v */
    public void mo4745v(@mr2 C3042oa<String, View> oaVar, @mr2 Collection<String> collection) {
        Iterator<Map.Entry<String, View>> it = oaVar.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(jt4.m19024x0((View) it.next().getValue()))) {
                it.remove();
            }
        }
    }

    /* renamed from: w */
    public final void mo4746w(@mr2 List<C0635k> list, @mr2 List<C0668n.C0673e> list2, boolean z, @mr2 Map<C0668n.C0673e, Boolean> map) {
        StringBuilder sb;
        String str;
        C0638d.C0643d e;
        ViewGroup m = mo4891m();
        Context context = m.getContext();
        ArrayList arrayList = new ArrayList();
        boolean z2 = false;
        for (C0635k next : list) {
            if (!next.mo4763d() && (e = next.mo4759e(context)) != null) {
                Animator animator = e.f3849a;
                if (animator == null) {
                    arrayList.add(next);
                } else {
                    C0668n.C0673e b = next.mo4761b();
                    Fragment f = b.mo4903f();
                    if (Boolean.TRUE.equals(map.get(b))) {
                        if (FragmentManager.m4279T0(2)) {
                            Log.v("FragmentManager", "Ignoring Animator set on " + f + " as this Fragment was involved in a Transition.");
                        }
                        next.mo4760a();
                    } else {
                        boolean z3 = b.mo4902e() == C0668n.C0673e.C0676c.GONE;
                        List<C0668n.C0673e> list3 = list2;
                        if (z3) {
                            list3.remove(b);
                        }
                        View view = f.mView;
                        m.startViewTransition(view);
                        C0626c cVar = r0;
                        C0626c cVar2 = new C0626c(m, view, z3, b, next);
                        animator.addListener(cVar);
                        animator.setTarget(view);
                        animator.start();
                        next.mo4762c().mo23442d(new C0627d(animator));
                        z2 = true;
                    }
                }
            } else {
                next.mo4760a();
            }
            Map<C0668n.C0673e, Boolean> map2 = map;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0635k kVar = (C0635k) it.next();
            C0668n.C0673e b2 = kVar.mo4761b();
            Fragment f2 = b2.mo4903f();
            if (z) {
                if (FragmentManager.m4279T0(2)) {
                    sb = new StringBuilder();
                    sb.append("Ignoring Animation set on ");
                    sb.append(f2);
                    str = " as Animations cannot run alongside Transitions.";
                }
                kVar.mo4760a();
            } else if (z2) {
                if (FragmentManager.m4279T0(2)) {
                    sb = new StringBuilder();
                    sb.append("Ignoring Animation set on ");
                    sb.append(f2);
                    str = " as Animations cannot run alongside Animators.";
                }
                kVar.mo4760a();
            } else {
                View view2 = f2.mView;
                Animation animation = (Animation) k43.m19455l(((C0638d.C0643d) k43.m19455l(kVar.mo4759e(context))).f3850a);
                if (b2.mo4902e() != C0668n.C0673e.C0676c.REMOVED) {
                    view2.startAnimation(animation);
                    kVar.mo4760a();
                } else {
                    m.startViewTransition(view2);
                    C0638d.C0644e eVar = new C0638d.C0644e(animation, m, view2);
                    eVar.setAnimationListener(new C0628e(m, view2, kVar));
                    view2.startAnimation(eVar);
                }
                kVar.mo4762c().mo23442d(new C0630f(view2, m, kVar));
            }
            sb.append(str);
            Log.v("FragmentManager", sb.toString());
            kVar.mo4760a();
        }
    }

    @mr2
    /* renamed from: x */
    public final Map<C0668n.C0673e, Boolean> mo4747x(@mr2 List<C0637m> list, @mr2 List<C0668n.C0673e> list2, boolean z, @ts2 C0668n.C0673e eVar, @ts2 C0668n.C0673e eVar2) {
        Iterator<C0637m> it;
        ArrayList arrayList;
        ArrayList arrayList2;
        View view;
        View view2;
        Object obj;
        C0668n.C0673e eVar3;
        C0668n.C0673e eVar4;
        Object obj2;
        Object obj3;
        C3042oa oaVar;
        C0668n.C0673e eVar5;
        hb1 hb1;
        View view3;
        Rect rect;
        C0623c cVar;
        ArrayList arrayList3;
        C0668n.C0673e eVar6;
        ArrayList arrayList4;
        px3 px3;
        px3 px32;
        ArrayList<String> arrayList5;
        View view4;
        View view5;
        String q;
        ArrayList<String> arrayList6;
        C0623c cVar2 = this;
        boolean z2 = z;
        C0668n.C0673e eVar7 = eVar;
        C0668n.C0673e eVar8 = eVar2;
        HashMap hashMap = new HashMap();
        hb1 hb12 = null;
        for (C0637m next : list) {
            if (!next.mo4763d()) {
                hb1 e = next.mo4764e();
                if (hb12 == null) {
                    hb12 = e;
                } else if (!(e == null || hb12 == e)) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + next.mo4761b().mo4903f() + " returned Transition " + next.mo4767h() + " which uses a different Transition  type than other Fragments.");
                }
            }
        }
        if (hb12 == null) {
            for (C0637m next2 : list) {
                hashMap.put(next2.mo4761b(), Boolean.FALSE);
                next2.mo4760a();
            }
            return hashMap;
        }
        View view6 = new View(mo4891m().getContext());
        Rect rect2 = new Rect();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        C3042oa oaVar2 = new C3042oa();
        Object obj4 = null;
        View view7 = null;
        boolean z3 = false;
        for (C0637m next3 : list) {
            if (!next3.mo4768i() || eVar7 == null || eVar8 == null) {
                oaVar = oaVar2;
                arrayList4 = arrayList8;
                cVar = cVar2;
                eVar6 = eVar7;
                arrayList3 = arrayList7;
                rect = rect2;
                hb1 = hb12;
                eVar5 = eVar8;
                view3 = view6;
                view7 = view7;
            } else {
                Object B = hb12.mo7003B(hb12.mo7008g(next3.mo4766g()));
                ArrayList<String> sharedElementSourceNames = eVar2.mo4903f().getSharedElementSourceNames();
                ArrayList<String> sharedElementSourceNames2 = eVar.mo4903f().getSharedElementSourceNames();
                ArrayList<String> sharedElementTargetNames = eVar.mo4903f().getSharedElementTargetNames();
                Object obj5 = B;
                View view8 = view7;
                int i = 0;
                while (i < sharedElementTargetNames.size()) {
                    int indexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i));
                    ArrayList<String> arrayList9 = sharedElementTargetNames;
                    if (indexOf != -1) {
                        sharedElementSourceNames.set(indexOf, sharedElementSourceNames2.get(i));
                    }
                    i++;
                    sharedElementTargetNames = arrayList9;
                }
                ArrayList<String> sharedElementTargetNames2 = eVar2.mo4903f().getSharedElementTargetNames();
                Fragment f = eVar.mo4903f();
                if (!z2) {
                    px32 = f.getExitTransitionCallback();
                    px3 = eVar2.mo4903f().getEnterTransitionCallback();
                } else {
                    px32 = f.getEnterTransitionCallback();
                    px3 = eVar2.mo4903f().getExitTransitionCallback();
                }
                int i2 = 0;
                for (int size = sharedElementSourceNames.size(); i2 < size; size = size) {
                    oaVar2.put(sharedElementSourceNames.get(i2), sharedElementTargetNames2.get(i2));
                    i2++;
                    C0668n.C0673e eVar9 = eVar;
                }
                C3042oa oaVar3 = new C3042oa();
                cVar2.mo4744u(oaVar3, eVar.mo4903f().mView);
                oaVar3.mo4019u(sharedElementSourceNames);
                if (px32 != null) {
                    px32.mo22681d(sharedElementSourceNames, oaVar3);
                    int size2 = sharedElementSourceNames.size() - 1;
                    while (size2 >= 0) {
                        String str = sharedElementSourceNames.get(size2);
                        View view9 = (View) oaVar3.get(str);
                        if (view9 == null) {
                            oaVar2.remove(str);
                            arrayList6 = sharedElementSourceNames;
                        } else {
                            arrayList6 = sharedElementSourceNames;
                            if (!str.equals(jt4.m19024x0(view9))) {
                                oaVar2.put(jt4.m19024x0(view9), (String) oaVar2.remove(str));
                            }
                        }
                        size2--;
                        sharedElementSourceNames = arrayList6;
                    }
                    arrayList5 = sharedElementSourceNames;
                } else {
                    arrayList5 = sharedElementSourceNames;
                    oaVar2.mo4019u(oaVar3.keySet());
                }
                C3042oa oaVar4 = new C3042oa();
                cVar2.mo4744u(oaVar4, eVar2.mo4903f().mView);
                oaVar4.mo4019u(sharedElementTargetNames2);
                oaVar4.mo4019u(oaVar2.values());
                if (px3 != null) {
                    px3.mo22681d(sharedElementTargetNames2, oaVar4);
                    for (int size3 = sharedElementTargetNames2.size() - 1; size3 >= 0; size3--) {
                        String str2 = sharedElementTargetNames2.get(size3);
                        View view10 = (View) oaVar4.get(str2);
                        if (view10 == null) {
                            String q2 = C0659m.m4672q(oaVar2, str2);
                            if (q2 != null) {
                                oaVar2.remove(q2);
                            }
                        } else if (!str2.equals(jt4.m19024x0(view10)) && (q = C0659m.m4672q(oaVar2, str2)) != null) {
                            oaVar2.put(q, jt4.m19024x0(view10));
                        }
                    }
                } else {
                    C0659m.m4680y(oaVar2, oaVar4);
                }
                cVar2.mo4745v(oaVar3, oaVar2.keySet());
                cVar2.mo4745v(oaVar4, oaVar2.values());
                if (oaVar2.isEmpty()) {
                    arrayList7.clear();
                    arrayList8.clear();
                    eVar6 = eVar;
                    oaVar = oaVar2;
                    arrayList4 = arrayList8;
                    cVar = cVar2;
                    arrayList3 = arrayList7;
                    rect = rect2;
                    view3 = view6;
                    hb1 = hb12;
                    view7 = view8;
                    obj4 = null;
                    eVar5 = eVar2;
                } else {
                    C0659m.m4661f(eVar2.mo4903f(), eVar.mo4903f(), z2, oaVar3, true);
                    ArrayList<String> arrayList10 = arrayList5;
                    HashMap hashMap2 = hashMap;
                    Object obj6 = obj5;
                    C0631g gVar = r0;
                    View view11 = view6;
                    View view12 = view8;
                    ViewGroup m = mo4891m();
                    oaVar = oaVar2;
                    ArrayList arrayList11 = arrayList8;
                    C0631g gVar2 = new C0631g(eVar2, eVar, z, oaVar4);
                    tv2.m28961a(m, gVar);
                    arrayList7.addAll(oaVar3.values());
                    if (!arrayList10.isEmpty()) {
                        View view13 = (View) oaVar3.get(arrayList10.get(0));
                        hb12.mo7016v(obj6, view13);
                        view7 = view13;
                    } else {
                        view7 = view12;
                    }
                    arrayList4 = arrayList11;
                    arrayList4.addAll(oaVar4.values());
                    if (sharedElementTargetNames2.isEmpty() || (view5 = (View) oaVar4.get(sharedElementTargetNames2.get(0))) == null) {
                        cVar = this;
                        view4 = view11;
                    } else {
                        cVar = this;
                        tv2.m28961a(mo4891m(), new C0632h(hb12, view5, rect2));
                        view4 = view11;
                        z3 = true;
                    }
                    hb12.mo7017z(obj6, view4, arrayList7);
                    arrayList3 = arrayList7;
                    rect = rect2;
                    view3 = view4;
                    hb1 = hb12;
                    hb12.mo7014t(obj6, (Object) null, (ArrayList<View>) null, (Object) null, (ArrayList<View>) null, obj6, arrayList4);
                    Boolean bool = Boolean.TRUE;
                    eVar6 = eVar;
                    hashMap = hashMap2;
                    hashMap.put(eVar6, bool);
                    eVar5 = eVar2;
                    hashMap.put(eVar5, bool);
                    obj4 = obj6;
                }
            }
            z2 = z;
            arrayList7 = arrayList3;
            cVar2 = cVar;
            rect2 = rect;
            view6 = view3;
            eVar8 = eVar5;
            oaVar2 = oaVar;
            arrayList8 = arrayList4;
            eVar7 = eVar6;
            hb12 = hb1;
        }
        View view14 = view7;
        C3042oa oaVar5 = oaVar2;
        ArrayList arrayList12 = arrayList8;
        C0623c cVar3 = cVar2;
        C0668n.C0673e eVar10 = eVar7;
        ArrayList arrayList13 = arrayList7;
        Rect rect3 = rect2;
        hb1 hb13 = hb12;
        C0668n.C0673e eVar11 = eVar8;
        View view15 = view6;
        ArrayList arrayList14 = new ArrayList();
        Iterator<C0637m> it2 = list.iterator();
        Object obj7 = null;
        Object obj8 = null;
        while (it2.hasNext()) {
            C0637m next4 = it2.next();
            if (next4.mo4763d()) {
                hashMap.put(next4.mo4761b(), Boolean.FALSE);
                next4.mo4760a();
            } else {
                Object g = hb13.mo7008g(next4.mo4767h());
                C0668n.C0673e b = next4.mo4761b();
                boolean z4 = obj4 != null && (b == eVar10 || b == eVar11);
                if (g == null) {
                    if (!z4) {
                        hashMap.put(b, Boolean.FALSE);
                        next4.mo4760a();
                    }
                    List<C0668n.C0673e> list3 = list2;
                    arrayList = arrayList12;
                    arrayList2 = arrayList13;
                    it = it2;
                    view = view15;
                    obj = obj7;
                    eVar3 = eVar11;
                    view2 = view14;
                } else {
                    it = it2;
                    ArrayList arrayList15 = new ArrayList();
                    Object obj9 = obj7;
                    cVar3.mo4743t(arrayList15, b.mo4903f().mView);
                    if (z4) {
                        if (b == eVar10) {
                            arrayList15.removeAll(arrayList13);
                        } else {
                            arrayList15.removeAll(arrayList12);
                        }
                    }
                    if (arrayList15.isEmpty()) {
                        hb13.mo7004a(g, view15);
                        arrayList = arrayList12;
                        arrayList2 = arrayList13;
                        view = view15;
                        eVar4 = b;
                        obj3 = obj8;
                        eVar3 = eVar11;
                        obj2 = obj9;
                        List<C0668n.C0673e> list4 = list2;
                    } else {
                        hb13.mo7005b(g, arrayList15);
                        view = view15;
                        C0668n.C0673e eVar12 = b;
                        obj2 = obj9;
                        arrayList2 = arrayList13;
                        obj3 = obj8;
                        arrayList = arrayList12;
                        eVar3 = eVar11;
                        hb13.mo7014t(g, g, arrayList15, (Object) null, (ArrayList<View>) null, (Object) null, (ArrayList<View>) null);
                        if (eVar12.mo4902e() == C0668n.C0673e.C0676c.GONE) {
                            eVar4 = eVar12;
                            list2.remove(eVar4);
                            ArrayList arrayList16 = new ArrayList(arrayList15);
                            arrayList16.remove(eVar4.mo4903f().mView);
                            hb13.mo7013r(g, eVar4.mo4903f().mView, arrayList16);
                            tv2.m28961a(mo4891m(), new C0633i(arrayList15));
                        } else {
                            List<C0668n.C0673e> list5 = list2;
                            eVar4 = eVar12;
                        }
                    }
                    if (eVar4.mo4902e() == C0668n.C0673e.C0676c.VISIBLE) {
                        arrayList14.addAll(arrayList15);
                        if (z3) {
                            hb13.mo7015u(g, rect3);
                        }
                        view2 = view14;
                    } else {
                        view2 = view14;
                        hb13.mo7016v(g, view2);
                    }
                    hashMap.put(eVar4, Boolean.TRUE);
                    if (next4.mo4769j()) {
                        obj8 = hb13.mo7010n(obj3, g, (Object) null);
                        obj = obj2;
                    } else {
                        obj = hb13.mo7010n(obj2, g, (Object) null);
                        obj8 = obj3;
                    }
                }
                eVar11 = eVar3;
                obj7 = obj;
                view14 = view2;
                view15 = view;
                arrayList13 = arrayList2;
                arrayList12 = arrayList;
                it2 = it;
            }
        }
        ArrayList arrayList17 = arrayList12;
        ArrayList arrayList18 = arrayList13;
        C0668n.C0673e eVar13 = eVar11;
        Object m2 = hb13.mo7009m(obj8, obj7, obj4);
        for (C0637m next5 : list) {
            if (!next5.mo4763d()) {
                Object h = next5.mo4767h();
                C0668n.C0673e b2 = next5.mo4761b();
                boolean z5 = obj4 != null && (b2 == eVar10 || b2 == eVar13);
                if (h != null || z5) {
                    if (!jt4.m18914U0(mo4891m())) {
                        if (FragmentManager.m4279T0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Container " + mo4891m() + " has not been laid out. Completing operation " + b2);
                        }
                        next5.mo4760a();
                    } else {
                        hb13.mo16455w(next5.mo4761b().mo4903f(), m2, next5.mo4762c(), new C0634j(next5));
                    }
                }
            }
        }
        if (!jt4.m18914U0(mo4891m())) {
            return hashMap;
        }
        C0659m.m4653B(arrayList14, 4);
        ArrayList arrayList19 = arrayList17;
        ArrayList<String> o = hb13.mo17173o(arrayList19);
        hb13.mo7006c(mo4891m(), m2);
        hb13.mo17176y(mo4891m(), arrayList18, arrayList19, o, oaVar5);
        C0659m.m4653B(arrayList14, 0);
        hb13.mo7002A(obj4, arrayList18, arrayList19);
        return hashMap;
    }
}
