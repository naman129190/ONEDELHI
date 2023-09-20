package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.onedelhi.secure.C3345qu;
import com.onedelhi.secure.C3740us;
import com.onedelhi.secure.ab3;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.p14;
import com.onedelhi.secure.to1;
import com.onedelhi.secure.ts2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.fragment.app.n */
public abstract class C0668n {

    /* renamed from: a */
    public final ViewGroup f3991a;

    /* renamed from: a */
    public final ArrayList<C0673e> f3992a = new ArrayList<>();

    /* renamed from: a */
    public boolean f3993a = false;

    /* renamed from: b */
    public final ArrayList<C0673e> f3994b = new ArrayList<>();

    /* renamed from: b */
    public boolean f3995b = false;

    /* renamed from: androidx.fragment.app.n$a */
    public class C0669a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C0672d f3996a;

        public C0669a(C0672d dVar) {
            this.f3996a = dVar;
        }

        public void run() {
            if (C0668n.this.f3992a.contains(this.f3996a)) {
                this.f3996a.mo4902e().mo4910a(this.f3996a.mo4903f().mView);
            }
        }
    }

    /* renamed from: androidx.fragment.app.n$b */
    public class C0670b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C0672d f3998a;

        public C0670b(C0672d dVar) {
            this.f3998a = dVar;
        }

        public void run() {
            C0668n.this.f3992a.remove(this.f3998a);
            C0668n.this.f3994b.remove(this.f3998a);
        }
    }

    /* renamed from: androidx.fragment.app.n$c */
    public static /* synthetic */ class C0671c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f4000a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f4001b;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Can't wrap try/catch for region: R(19:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004d */
        static {
            /*
                androidx.fragment.app.n$e$b[] r0 = androidx.fragment.app.C0668n.C0673e.C0675b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4001b = r0
                r1 = 1
                androidx.fragment.app.n$e$b r2 = androidx.fragment.app.C0668n.C0673e.C0675b.ADDING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f4001b     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.fragment.app.n$e$b r3 = androidx.fragment.app.C0668n.C0673e.C0675b.REMOVING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f4001b     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.fragment.app.n$e$b r4 = androidx.fragment.app.C0668n.C0673e.C0675b.NONE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                androidx.fragment.app.n$e$c[] r3 = androidx.fragment.app.C0668n.C0673e.C0676c.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f4000a = r3
                androidx.fragment.app.n$e$c r4 = androidx.fragment.app.C0668n.C0673e.C0676c.REMOVED     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f4000a     // Catch:{ NoSuchFieldError -> 0x0043 }
                androidx.fragment.app.n$e$c r3 = androidx.fragment.app.C0668n.C0673e.C0676c.VISIBLE     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f4000a     // Catch:{ NoSuchFieldError -> 0x004d }
                androidx.fragment.app.n$e$c r1 = androidx.fragment.app.C0668n.C0673e.C0676c.GONE     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                int[] r0 = f4000a     // Catch:{ NoSuchFieldError -> 0x0058 }
                androidx.fragment.app.n$e$c r1 = androidx.fragment.app.C0668n.C0673e.C0676c.INVISIBLE     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0668n.C0671c.<clinit>():void");
        }
    }

    /* renamed from: androidx.fragment.app.n$d */
    public static class C0672d extends C0673e {
        @mr2

        /* renamed from: a */
        public final C0653j f4002a;

        public C0672d(@mr2 C0673e.C0676c cVar, @mr2 C0673e.C0675b bVar, @mr2 C0653j jVar, @mr2 C3345qu quVar) {
            super(cVar, bVar, jVar.mo4821k(), quVar);
            this.f4002a = jVar;
        }

        /* renamed from: c */
        public void mo4897c() {
            super.mo4897c();
            this.f4002a.mo4823m();
        }

        /* renamed from: l */
        public void mo4898l() {
            if (mo4904g() == C0673e.C0675b.ADDING) {
                Fragment k = this.f4002a.mo4821k();
                View findFocus = k.mView.findFocus();
                if (findFocus != null) {
                    k.setFocusedView(findFocus);
                    if (FragmentManager.m4279T0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + k);
                    }
                }
                View requireView = mo4903f().requireView();
                if (requireView.getParent() == null) {
                    this.f4002a.mo4812b();
                    requireView.setAlpha(0.0f);
                }
                if (requireView.getAlpha() == 0.0f && requireView.getVisibility() == 0) {
                    requireView.setVisibility(4);
                }
                requireView.setAlpha(k.getPostOnViewCreatedAlpha());
            }
        }
    }

    /* renamed from: androidx.fragment.app.n$e */
    public static class C0673e {
        @mr2

        /* renamed from: a */
        public final Fragment f4003a;
        @mr2

        /* renamed from: a */
        public C0675b f4004a;
        @mr2

        /* renamed from: a */
        public C0676c f4005a;
        @mr2

        /* renamed from: a */
        public final HashSet<C3345qu> f4006a = new HashSet<>();
        @mr2

        /* renamed from: a */
        public final List<Runnable> f4007a = new ArrayList();

        /* renamed from: a */
        public boolean f4008a = false;

        /* renamed from: b */
        public boolean f4009b = false;

        /* renamed from: androidx.fragment.app.n$e$a */
        public class C0674a implements C3345qu.C3347b {
            public C0674a() {
            }

            public void onCancel() {
                C0673e.this.mo4900b();
            }
        }

        /* renamed from: androidx.fragment.app.n$e$b */
        public enum C0675b {
            NONE,
            ADDING,
            REMOVING
        }

        /* renamed from: androidx.fragment.app.n$e$c */
        public enum C0676c {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            @mr2
            /* renamed from: b */
            public static C0676c m4716b(int i) {
                if (i == 0) {
                    return VISIBLE;
                }
                if (i == 4) {
                    return INVISIBLE;
                }
                if (i == 8) {
                    return GONE;
                }
                throw new IllegalArgumentException("Unknown visibility " + i);
            }

            @mr2
            /* renamed from: e */
            public static C0676c m4717e(@mr2 View view) {
                return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? INVISIBLE : m4716b(view.getVisibility());
            }

            /* renamed from: a */
            public void mo4910a(@mr2 View view) {
                int i;
                int i2 = C0671c.f4000a[ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        if (FragmentManager.m4279T0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                        }
                        i = 0;
                    } else if (i2 == 3) {
                        if (FragmentManager.m4279T0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                        }
                        i = 8;
                    } else if (i2 == 4) {
                        if (FragmentManager.m4279T0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                        }
                        view.setVisibility(4);
                        return;
                    } else {
                        return;
                    }
                    view.setVisibility(i);
                    return;
                }
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    if (FragmentManager.m4279T0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                    }
                    viewGroup.removeView(view);
                }
            }
        }

        public C0673e(@mr2 C0676c cVar, @mr2 C0675b bVar, @mr2 Fragment fragment, @mr2 C3345qu quVar) {
            this.f4005a = cVar;
            this.f4004a = bVar;
            this.f4003a = fragment;
            quVar.mo23442d(new C0674a());
        }

        /* renamed from: a */
        public final void mo4899a(@mr2 Runnable runnable) {
            this.f4007a.add(runnable);
        }

        /* renamed from: b */
        public final void mo4900b() {
            if (!mo4905h()) {
                this.f4008a = true;
                if (this.f4006a.isEmpty()) {
                    mo4897c();
                    return;
                }
                Iterator it = new ArrayList(this.f4006a).iterator();
                while (it.hasNext()) {
                    ((C3345qu) it.next()).mo23439a();
                }
            }
        }

        @C3740us
        /* renamed from: c */
        public void mo4897c() {
            if (!this.f4009b) {
                if (FragmentManager.m4279T0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
                }
                this.f4009b = true;
                for (Runnable run : this.f4007a) {
                    run.run();
                }
            }
        }

        /* renamed from: d */
        public final void mo4901d(@mr2 C3345qu quVar) {
            if (this.f4006a.remove(quVar) && this.f4006a.isEmpty()) {
                mo4897c();
            }
        }

        @mr2
        /* renamed from: e */
        public C0676c mo4902e() {
            return this.f4005a;
        }

        @mr2
        /* renamed from: f */
        public final Fragment mo4903f() {
            return this.f4003a;
        }

        @mr2
        /* renamed from: g */
        public C0675b mo4904g() {
            return this.f4004a;
        }

        /* renamed from: h */
        public final boolean mo4905h() {
            return this.f4008a;
        }

        /* renamed from: i */
        public final boolean mo4906i() {
            return this.f4009b;
        }

        /* renamed from: j */
        public final void mo4907j(@mr2 C3345qu quVar) {
            mo4898l();
            this.f4006a.add(quVar);
        }

        /* renamed from: k */
        public final void mo4908k(@mr2 C0676c cVar, @mr2 C0675b bVar) {
            C0675b bVar2;
            int i = C0671c.f4001b[bVar.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    if (FragmentManager.m4279T0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f4003a + " mFinalState = " + this.f4005a + " -> REMOVED. mLifecycleImpact  = " + this.f4004a + " to REMOVING.");
                    }
                    this.f4005a = C0676c.REMOVED;
                    bVar2 = C0675b.REMOVING;
                } else if (i == 3 && this.f4005a != C0676c.REMOVED) {
                    if (FragmentManager.m4279T0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f4003a + " mFinalState = " + this.f4005a + " -> " + cVar + ". ");
                    }
                    this.f4005a = cVar;
                    return;
                } else {
                    return;
                }
            } else if (this.f4005a == C0676c.REMOVED) {
                if (FragmentManager.m4279T0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f4003a + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f4004a + " to ADDING.");
                }
                this.f4005a = C0676c.VISIBLE;
                bVar2 = C0675b.ADDING;
            } else {
                return;
            }
            this.f4004a = bVar2;
        }

        /* renamed from: l */
        public void mo4898l() {
        }

        @mr2
        public String toString() {
            return "Operation " + to1.f35745h + Integer.toHexString(System.identityHashCode(this)) + "} " + to1.f35745h + "mFinalState = " + this.f4005a + "} " + to1.f35745h + "mLifecycleImpact = " + this.f4004a + "} " + to1.f35745h + "mFragment = " + this.f4003a + "}";
        }
    }

    public C0668n(@mr2 ViewGroup viewGroup) {
        this.f3991a = viewGroup;
    }

    @mr2
    /* renamed from: n */
    public static C0668n m4684n(@mr2 ViewGroup viewGroup, @mr2 FragmentManager fragmentManager) {
        return m4685o(viewGroup, fragmentManager.mo4533M0());
    }

    @mr2
    /* renamed from: o */
    public static C0668n m4685o(@mr2 ViewGroup viewGroup, @mr2 p14 p14) {
        int i = ab3.C1684g.special_effects_controller_view_tag;
        Object tag = viewGroup.getTag(i);
        if (tag instanceof C0668n) {
            return (C0668n) tag;
        }
        C0668n a = p14.mo4644a(viewGroup);
        viewGroup.setTag(i, a);
        return a;
    }

    /* renamed from: a */
    public final void mo4880a(@mr2 C0673e.C0676c cVar, @mr2 C0673e.C0675b bVar, @mr2 C0653j jVar) {
        synchronized (this.f3992a) {
            C3345qu quVar = new C3345qu();
            C0673e h = mo4886h(jVar.mo4821k());
            if (h != null) {
                h.mo4908k(cVar, bVar);
                return;
            }
            C0672d dVar = new C0672d(cVar, bVar, jVar, quVar);
            this.f3992a.add(dVar);
            dVar.mo4899a(new C0669a(dVar));
            dVar.mo4899a(new C0670b(dVar));
        }
    }

    /* renamed from: b */
    public void mo4881b(@mr2 C0673e.C0676c cVar, @mr2 C0653j jVar) {
        if (FragmentManager.m4279T0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + jVar.mo4821k());
        }
        mo4880a(cVar, C0673e.C0675b.ADDING, jVar);
    }

    /* renamed from: c */
    public void mo4882c(@mr2 C0653j jVar) {
        if (FragmentManager.m4279T0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + jVar.mo4821k());
        }
        mo4880a(C0673e.C0676c.GONE, C0673e.C0675b.NONE, jVar);
    }

    /* renamed from: d */
    public void mo4883d(@mr2 C0653j jVar) {
        if (FragmentManager.m4279T0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + jVar.mo4821k());
        }
        mo4880a(C0673e.C0676c.REMOVED, C0673e.C0675b.REMOVING, jVar);
    }

    /* renamed from: e */
    public void mo4884e(@mr2 C0653j jVar) {
        if (FragmentManager.m4279T0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + jVar.mo4821k());
        }
        mo4880a(C0673e.C0676c.VISIBLE, C0673e.C0675b.NONE, jVar);
    }

    /* renamed from: f */
    public abstract void mo4741f(@mr2 List<C0673e> list, boolean z);

    /* renamed from: g */
    public void mo4885g() {
        if (!this.f3995b) {
            if (!jt4.m18896O0(this.f3991a)) {
                mo4888j();
                this.f3993a = false;
                return;
            }
            synchronized (this.f3992a) {
                if (!this.f3992a.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.f3994b);
                    this.f3994b.clear();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C0673e eVar = (C0673e) it.next();
                        if (FragmentManager.m4279T0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + eVar);
                        }
                        eVar.mo4900b();
                        if (!eVar.mo4906i()) {
                            this.f3994b.add(eVar);
                        }
                    }
                    mo4893q();
                    ArrayList arrayList2 = new ArrayList(this.f3992a);
                    this.f3992a.clear();
                    this.f3994b.addAll(arrayList2);
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((C0673e) it2.next()).mo4898l();
                    }
                    mo4741f(arrayList2, this.f3993a);
                    this.f3993a = false;
                }
            }
        }
    }

    @ts2
    /* renamed from: h */
    public final C0673e mo4886h(@mr2 Fragment fragment) {
        Iterator<C0673e> it = this.f3992a.iterator();
        while (it.hasNext()) {
            C0673e next = it.next();
            if (next.mo4903f().equals(fragment) && !next.mo4905h()) {
                return next;
            }
        }
        return null;
    }

    @ts2
    /* renamed from: i */
    public final C0673e mo4887i(@mr2 Fragment fragment) {
        Iterator<C0673e> it = this.f3994b.iterator();
        while (it.hasNext()) {
            C0673e next = it.next();
            if (next.mo4903f().equals(fragment) && !next.mo4905h()) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: j */
    public void mo4888j() {
        String str;
        String str2;
        boolean O0 = jt4.m18896O0(this.f3991a);
        synchronized (this.f3992a) {
            mo4893q();
            Iterator<C0673e> it = this.f3992a.iterator();
            while (it.hasNext()) {
                it.next().mo4898l();
            }
            Iterator it2 = new ArrayList(this.f3994b).iterator();
            while (it2.hasNext()) {
                C0673e eVar = (C0673e) it2.next();
                if (FragmentManager.m4279T0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: ");
                    if (O0) {
                        str2 = "";
                    } else {
                        str2 = "Container " + this.f3991a + " is not attached to window. ";
                    }
                    sb.append(str2);
                    sb.append("Cancelling running operation ");
                    sb.append(eVar);
                    Log.v("FragmentManager", sb.toString());
                }
                eVar.mo4900b();
            }
            Iterator it3 = new ArrayList(this.f3992a).iterator();
            while (it3.hasNext()) {
                C0673e eVar2 = (C0673e) it3.next();
                if (FragmentManager.m4279T0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    if (O0) {
                        str = "";
                    } else {
                        str = "Container " + this.f3991a + " is not attached to window. ";
                    }
                    sb2.append(str);
                    sb2.append("Cancelling pending operation ");
                    sb2.append(eVar2);
                    Log.v("FragmentManager", sb2.toString());
                }
                eVar2.mo4900b();
            }
        }
    }

    /* renamed from: k */
    public void mo4889k() {
        if (this.f3995b) {
            this.f3995b = false;
            mo4885g();
        }
    }

    @ts2
    /* renamed from: l */
    public C0673e.C0675b mo4890l(@mr2 C0653j jVar) {
        C0673e h = mo4886h(jVar.mo4821k());
        C0673e.C0675b g = h != null ? h.mo4904g() : null;
        C0673e i = mo4887i(jVar.mo4821k());
        return (i == null || !(g == null || g == C0673e.C0675b.NONE)) ? g : i.mo4904g();
    }

    @mr2
    /* renamed from: m */
    public ViewGroup mo4891m() {
        return this.f3991a;
    }

    /* renamed from: p */
    public void mo4892p() {
        synchronized (this.f3992a) {
            mo4893q();
            this.f3995b = false;
            int size = this.f3992a.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                C0673e eVar = this.f3992a.get(size);
                C0673e.C0676c e = C0673e.C0676c.m4717e(eVar.mo4903f().mView);
                C0673e.C0676c e2 = eVar.mo4902e();
                C0673e.C0676c cVar = C0673e.C0676c.VISIBLE;
                if (e2 == cVar && e != cVar) {
                    this.f3995b = eVar.mo4903f().isPostponed();
                    break;
                }
                size--;
            }
        }
    }

    /* renamed from: q */
    public final void mo4893q() {
        Iterator<C0673e> it = this.f3992a.iterator();
        while (it.hasNext()) {
            C0673e next = it.next();
            if (next.mo4904g() == C0673e.C0675b.ADDING) {
                next.mo4908k(C0673e.C0676c.m4716b(next.mo4903f().requireView().getVisibility()), C0673e.C0675b.NONE);
            }
        }
    }

    /* renamed from: r */
    public void mo4894r(boolean z) {
        this.f3993a = z;
    }
}
