package androidx.viewpager2.adapter;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.C0657l;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C0690e;
import androidx.lifecycle.C0694f;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.onedelhi.secure.C3679ua;
import com.onedelhi.secure.C3740us;
import com.onedelhi.secure.a32;
import com.onedelhi.secure.ga2;
import com.onedelhi.secure.ib1;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.k43;
import com.onedelhi.secure.l34;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;

public abstract class FragmentStateAdapter extends RecyclerView.C0805h<ib1> implements l34 {

    /* renamed from: a */
    public static final long f5899a = 10000;

    /* renamed from: a */
    public static final String f5900a = "f#";

    /* renamed from: b */
    public static final String f5901b = "s#";

    /* renamed from: a */
    public final FragmentManager f5902a;

    /* renamed from: a */
    public final C0690e f5903a;

    /* renamed from: a */
    public FragmentMaxLifecycleEnforcer f5904a;

    /* renamed from: a */
    public final ga2<Fragment> f5905a;

    /* renamed from: b */
    public final ga2<Fragment.C0590m> f5906b;

    /* renamed from: b */
    public boolean f5907b;

    /* renamed from: c */
    public final ga2<Integer> f5908c;

    /* renamed from: c */
    public boolean f5909c;

    public class FragmentMaxLifecycleEnforcer {

        /* renamed from: a */
        public long f5915a = -1;

        /* renamed from: a */
        public C0694f f5916a;

        /* renamed from: a */
        public RecyclerView.C0808j f5917a;

        /* renamed from: a */
        public ViewPager2.C1134j f5919a;

        /* renamed from: a */
        public ViewPager2 f5920a;

        /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer$a */
        public class C1119a extends ViewPager2.C1134j {
            public C1119a() {
            }

            /* renamed from: a */
            public void mo7240a(int i) {
                FragmentMaxLifecycleEnforcer.this.mo7239d(false);
            }

            /* renamed from: c */
            public void mo7241c(int i) {
                FragmentMaxLifecycleEnforcer.this.mo7239d(false);
            }
        }

        /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer$b */
        public class C1120b extends C1124d {
            public C1120b() {
                super((C1121a) null);
            }

            /* renamed from: a */
            public void mo5739a() {
                FragmentMaxLifecycleEnforcer.this.mo7239d(true);
            }
        }

        public FragmentMaxLifecycleEnforcer() {
        }

        @mr2
        /* renamed from: a */
        public final ViewPager2 mo7236a(@mr2 RecyclerView recyclerView) {
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewPager2) {
                return (ViewPager2) parent;
            }
            throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
        }

        /* renamed from: b */
        public void mo7237b(@mr2 RecyclerView recyclerView) {
            this.f5920a = mo7236a(recyclerView);
            C1119a aVar = new C1119a();
            this.f5919a = aVar;
            this.f5920a.mo7268n(aVar);
            C1120b bVar = new C1120b();
            this.f5917a = bVar;
            FragmentStateAdapter.this.mo5703F(bVar);
            C11183 r2 = new C0694f() {
                /* renamed from: g */
                public void mo669g(@mr2 a32 a32, @mr2 C0690e.C0692b bVar) {
                    FragmentMaxLifecycleEnforcer.this.mo7239d(false);
                }
            };
            this.f5916a = r2;
            FragmentStateAdapter.this.f5903a.mo4958a(r2);
        }

        /* renamed from: c */
        public void mo7238c(@mr2 RecyclerView recyclerView) {
            mo7236a(recyclerView).mo7292w(this.f5919a);
            FragmentStateAdapter.this.mo5706I(this.f5917a);
            FragmentStateAdapter.this.f5903a.mo4960c(this.f5916a);
            this.f5920a = null;
        }

        /* renamed from: d */
        public void mo7239d(boolean z) {
            int currentItem;
            Fragment h;
            if (!FragmentStateAdapter.this.mo7235c0() && this.f5920a.getScrollState() == 0 && !FragmentStateAdapter.this.f5905a.mo16421l() && FragmentStateAdapter.this.mo5711g() != 0 && (currentItem = this.f5920a.getCurrentItem()) < FragmentStateAdapter.this.mo5711g()) {
                long h2 = FragmentStateAdapter.this.mo5712h(currentItem);
                if ((h2 != this.f5915a || z) && (h = FragmentStateAdapter.this.f5905a.mo16417h(h2)) != null && h.isAdded()) {
                    this.f5915a = h2;
                    C0657l r = FragmentStateAdapter.this.f5902a.mo4611r();
                    Fragment fragment = null;
                    for (int i = 0; i < FragmentStateAdapter.this.f5905a.mo16433w(); i++) {
                        long m = FragmentStateAdapter.this.f5905a.mo16422m(i);
                        Fragment x = FragmentStateAdapter.this.f5905a.mo16434x(i);
                        if (x.isAdded()) {
                            if (m != this.f5915a) {
                                r.mo4710O(x, C0690e.C0693c.STARTED);
                            } else {
                                fragment = x;
                            }
                            x.setMenuVisibility(m == this.f5915a);
                        }
                    }
                    if (fragment != null) {
                        r.mo4710O(fragment, C0690e.C0693c.RESUMED);
                    }
                    if (!r.mo4708A()) {
                        r.mo4728s();
                    }
                }
            }
        }
    }

    /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$a */
    public class C1121a implements View.OnLayoutChangeListener {

        /* renamed from: a */
        public final /* synthetic */ FrameLayout f5924a;

        /* renamed from: a */
        public final /* synthetic */ ib1 f5926a;

        public C1121a(FrameLayout frameLayout, ib1 ib1) {
            this.f5924a = frameLayout;
            this.f5926a = ib1;
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (this.f5924a.getParent() != null) {
                this.f5924a.removeOnLayoutChangeListener(this);
                FragmentStateAdapter.this.mo7229Y(this.f5926a);
            }
        }
    }

    /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$b */
    public class C1122b extends FragmentManager.C0608m {

        /* renamed from: a */
        public final /* synthetic */ FrameLayout f5927a;

        /* renamed from: a */
        public final /* synthetic */ Fragment f5928a;

        public C1122b(Fragment fragment, FrameLayout frameLayout) {
            this.f5928a = fragment;
            this.f5927a = frameLayout;
        }

        /* renamed from: m */
        public void mo4670m(@mr2 FragmentManager fragmentManager, @mr2 Fragment fragment, @mr2 View view, @ts2 Bundle bundle) {
            if (fragment == this.f5928a) {
                fragmentManager.mo4553T1(this);
                FragmentStateAdapter.this.mo7217J(view, this.f5927a);
            }
        }
    }

    /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$c */
    public class C1123c implements Runnable {
        public C1123c() {
        }

        public void run() {
            FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
            fragmentStateAdapter.f5907b = false;
            fragmentStateAdapter.mo7221O();
        }
    }

    /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$d */
    public static abstract class C1124d extends RecyclerView.C0808j {
        public C1124d() {
        }

        public /* synthetic */ C1124d(C1121a aVar) {
            this();
        }

        /* renamed from: a */
        public abstract void mo5739a();

        /* renamed from: b */
        public final void mo5740b(int i, int i2) {
            mo5739a();
        }

        /* renamed from: c */
        public final void mo5741c(int i, int i2, @ts2 Object obj) {
            mo5739a();
        }

        /* renamed from: d */
        public final void mo5742d(int i, int i2) {
            mo5739a();
        }

        /* renamed from: e */
        public final void mo5743e(int i, int i2, int i3) {
            mo5739a();
        }

        /* renamed from: f */
        public final void mo5744f(int i, int i2) {
            mo5739a();
        }
    }

    public FragmentStateAdapter(@mr2 Fragment fragment) {
        this(fragment.getChildFragmentManager(), fragment.getLifecycle());
    }

    public FragmentStateAdapter(@mr2 FragmentActivity fragmentActivity) {
        this(fragmentActivity.mo4464v0(), fragmentActivity.getLifecycle());
    }

    public FragmentStateAdapter(@mr2 FragmentManager fragmentManager, @mr2 C0690e eVar) {
        this.f5905a = new ga2<>();
        this.f5906b = new ga2<>();
        this.f5908c = new ga2<>();
        this.f5907b = false;
        this.f5909c = false;
        this.f5902a = fragmentManager;
        this.f5903a = eVar;
        super.mo5704G(true);
    }

    @mr2
    /* renamed from: M */
    public static String m7302M(@mr2 String str, long j) {
        return str + j;
    }

    /* renamed from: Q */
    public static boolean m7303Q(@mr2 String str, @mr2 String str2) {
        return str.startsWith(str2) && str.length() > str2.length();
    }

    /* renamed from: X */
    public static long m7304X(@mr2 String str, @mr2 String str2) {
        return Long.parseLong(str.substring(str2.length()));
    }

    @C3740us
    /* renamed from: A */
    public void mo5698A(@mr2 RecyclerView recyclerView) {
        this.f5904a.mo7238c(recyclerView);
        this.f5904a = null;
    }

    /* renamed from: G */
    public final void mo5704G(boolean z) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }

    /* renamed from: J */
    public void mo7217J(@mr2 View view, @mr2 FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        } else if (view.getParent() != frameLayout) {
            if (frameLayout.getChildCount() > 0) {
                frameLayout.removeAllViews();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            frameLayout.addView(view);
        }
    }

    /* renamed from: K */
    public boolean mo7218K(long j) {
        return j >= 0 && j < ((long) mo5711g());
    }

    @mr2
    /* renamed from: L */
    public abstract Fragment mo7219L(int i);

    /* renamed from: N */
    public final void mo7220N(int i) {
        long h = mo5712h(i);
        if (!this.f5905a.mo16413d(h)) {
            Fragment L = mo7219L(i);
            L.setInitialSavedState(this.f5906b.mo16417h(h));
            this.f5905a.mo16423n(h, L);
        }
    }

    /* renamed from: O */
    public void mo7221O() {
        if (this.f5909c && !mo7235c0()) {
            C3679ua<Long> uaVar = new C3679ua<>();
            for (int i = 0; i < this.f5905a.mo16433w(); i++) {
                long m = this.f5905a.mo16422m(i);
                if (!mo7218K(m)) {
                    uaVar.add(Long.valueOf(m));
                    this.f5908c.mo16426q(m);
                }
            }
            if (!this.f5907b) {
                this.f5909c = false;
                for (int i2 = 0; i2 < this.f5905a.mo16433w(); i2++) {
                    long m2 = this.f5905a.mo16422m(i2);
                    if (!mo7222P(m2)) {
                        uaVar.add(Long.valueOf(m2));
                    }
                }
            }
            for (Long longValue : uaVar) {
                mo7230Z(longValue.longValue());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        r3 = r3.getView();
     */
    /* renamed from: P */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo7222P(long r3) {
        /*
            r2 = this;
            com.onedelhi.secure.ga2<java.lang.Integer> r0 = r2.f5908c
            boolean r0 = r0.mo16413d(r3)
            r1 = 1
            if (r0 == 0) goto L_0x000a
            return r1
        L_0x000a:
            com.onedelhi.secure.ga2<androidx.fragment.app.Fragment> r0 = r2.f5905a
            java.lang.Object r3 = r0.mo16417h(r3)
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            r4 = 0
            if (r3 != 0) goto L_0x0016
            return r4
        L_0x0016:
            android.view.View r3 = r3.getView()
            if (r3 != 0) goto L_0x001d
            return r4
        L_0x001d:
            android.view.ViewParent r3 = r3.getParent()
            if (r3 == 0) goto L_0x0024
            goto L_0x0025
        L_0x0024:
            r1 = 0
        L_0x0025:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.adapter.FragmentStateAdapter.mo7222P(long):boolean");
    }

    /* renamed from: R */
    public final Long mo7223R(int i) {
        Long l = null;
        for (int i2 = 0; i2 < this.f5908c.mo16433w(); i2++) {
            if (this.f5908c.mo16434x(i2).intValue() == i) {
                if (l == null) {
                    l = Long.valueOf(this.f5908c.mo16422m(i2));
                } else {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
            }
        }
        return l;
    }

    /* renamed from: S */
    public final void mo5728x(@mr2 ib1 ib1, int i) {
        long n = ib1.mo5684n();
        int id = ib1.mo17698S().getId();
        Long R = mo7223R(id);
        if (!(R == null || R.longValue() == n)) {
            mo7230Z(R.longValue());
            this.f5908c.mo16426q(R.longValue());
        }
        this.f5908c.mo16423n(n, Integer.valueOf(id));
        mo7220N(i);
        FrameLayout S = ib1.mo17698S();
        if (jt4.m18896O0(S)) {
            if (S.getParent() == null) {
                S.addOnLayoutChangeListener(new C1121a(S, ib1));
            } else {
                throw new IllegalStateException("Design assumption violated.");
            }
        }
        mo7221O();
    }

    @mr2
    /* renamed from: T */
    public final ib1 mo5730z(@mr2 ViewGroup viewGroup, int i) {
        return ib1.m17372R(viewGroup);
    }

    /* renamed from: U */
    public final boolean mo5699B(@mr2 ib1 ib1) {
        return true;
    }

    /* renamed from: V */
    public final void mo5700C(@mr2 ib1 ib1) {
        mo7229Y(ib1);
        mo7221O();
    }

    /* renamed from: W */
    public final void mo5702E(@mr2 ib1 ib1) {
        Long R = mo7223R(ib1.mo17698S().getId());
        if (R != null) {
            mo7230Z(R.longValue());
            this.f5908c.mo16426q(R.longValue());
        }
    }

    /* renamed from: Y */
    public void mo7229Y(@mr2 final ib1 ib1) {
        Fragment h = this.f5905a.mo16417h(ib1.mo5684n());
        if (h != null) {
            FrameLayout S = ib1.mo17698S();
            View view = h.getView();
            if (!h.isAdded() && view != null) {
                throw new IllegalStateException("Design assumption violated.");
            } else if (h.isAdded() && view == null) {
                mo7234b0(h, S);
            } else if (!h.isAdded() || view.getParent() == null) {
                if (h.isAdded()) {
                    mo7217J(view, S);
                } else if (!mo7235c0()) {
                    mo7234b0(h, S);
                    C0657l r = this.f5902a.mo4611r();
                    r.mo4865k(h, "f" + ib1.mo5684n()).mo4710O(h, C0690e.C0693c.STARTED).mo4728s();
                    this.f5904a.mo7239d(false);
                } else if (!this.f5902a.mo4550S0()) {
                    this.f5903a.mo4958a(new C0694f() {
                        /* renamed from: g */
                        public void mo669g(@mr2 a32 a32, @mr2 C0690e.C0692b bVar) {
                            if (!FragmentStateAdapter.this.mo7235c0()) {
                                a32.getLifecycle().mo4960c(this);
                                if (jt4.m18896O0(ib1.mo17698S())) {
                                    FragmentStateAdapter.this.mo7229Y(ib1);
                                }
                            }
                        }
                    });
                }
            } else if (view.getParent() != S) {
                mo7217J(view, S);
            }
        } else {
            throw new IllegalStateException("Design assumption violated.");
        }
    }

    /* renamed from: Z */
    public final void mo7230Z(long j) {
        ViewParent parent;
        Fragment h = this.f5905a.mo16417h(j);
        if (h != null) {
            if (!(h.getView() == null || (parent = h.getView().getParent()) == null)) {
                ((FrameLayout) parent).removeAllViews();
            }
            if (!mo7218K(j)) {
                this.f5906b.mo16426q(j);
            }
            if (!h.isAdded()) {
                this.f5905a.mo16426q(j);
            } else if (mo7235c0()) {
                this.f5909c = true;
            } else {
                if (h.isAdded() && mo7218K(j)) {
                    this.f5906b.mo16423n(j, this.f5902a.mo4522I1(h));
                }
                this.f5902a.mo4611r().mo4709B(h).mo4728s();
                this.f5905a.mo16426q(j);
            }
        }
    }

    /* renamed from: a */
    public final void mo7231a(@mr2 Parcelable parcelable) {
        long X;
        Object obj;
        ga2 ga2;
        if (!this.f5906b.mo16421l() || !this.f5905a.mo16421l()) {
            throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
        }
        Bundle bundle = (Bundle) parcelable;
        if (bundle.getClassLoader() == null) {
            bundle.setClassLoader(getClass().getClassLoader());
        }
        for (String str : bundle.keySet()) {
            if (m7303Q(str, f5900a)) {
                X = m7304X(str, f5900a);
                obj = this.f5902a.mo4504C0(bundle, str);
                ga2 = this.f5905a;
            } else if (m7303Q(str, f5901b)) {
                X = m7304X(str, f5901b);
                obj = (Fragment.C0590m) bundle.getParcelable(str);
                if (mo7218K(X)) {
                    ga2 = this.f5906b;
                }
            } else {
                throw new IllegalArgumentException("Unexpected key in savedState: " + str);
            }
            ga2.mo16423n(X, obj);
        }
        if (!this.f5905a.mo16421l()) {
            this.f5909c = true;
            this.f5907b = true;
            mo7221O();
            mo7232a0();
        }
    }

    /* renamed from: a0 */
    public final void mo7232a0() {
        final Handler handler = new Handler(Looper.getMainLooper());
        final C1123c cVar = new C1123c();
        this.f5903a.mo4958a(new C0694f() {
            /* renamed from: g */
            public void mo669g(@mr2 a32 a32, @mr2 C0690e.C0692b bVar) {
                if (bVar == C0690e.C0692b.ON_DESTROY) {
                    handler.removeCallbacks(cVar);
                    a32.getLifecycle().mo4960c(this);
                }
            }
        });
        handler.postDelayed(cVar, 10000);
    }

    @mr2
    /* renamed from: b */
    public final Parcelable mo7233b() {
        Bundle bundle = new Bundle(this.f5905a.mo16433w() + this.f5906b.mo16433w());
        for (int i = 0; i < this.f5905a.mo16433w(); i++) {
            long m = this.f5905a.mo16422m(i);
            Fragment h = this.f5905a.mo16417h(m);
            if (h != null && h.isAdded()) {
                this.f5902a.mo4621u1(bundle, m7302M(f5900a, m), h);
            }
        }
        for (int i2 = 0; i2 < this.f5906b.mo16433w(); i2++) {
            long m2 = this.f5906b.mo16422m(i2);
            if (mo7218K(m2)) {
                bundle.putParcelable(m7302M(f5901b, m2), this.f5906b.mo16417h(m2));
            }
        }
        return bundle;
    }

    /* renamed from: b0 */
    public final void mo7234b0(Fragment fragment, @mr2 FrameLayout frameLayout) {
        this.f5902a.mo4624v1(new C1122b(fragment, frameLayout), false);
    }

    /* renamed from: c0 */
    public boolean mo7235c0() {
        return this.f5902a.mo4564Y0();
    }

    /* renamed from: h */
    public long mo5712h(int i) {
        return (long) i;
    }

    @C3740us
    /* renamed from: w */
    public void mo5727w(@mr2 RecyclerView recyclerView) {
        k43.m19444a(this.f5904a == null);
        FragmentMaxLifecycleEnforcer fragmentMaxLifecycleEnforcer = new FragmentMaxLifecycleEnforcer();
        this.f5904a = fragmentMaxLifecycleEnforcer;
        fragmentMaxLifecycleEnforcer.mo7237b(recyclerView);
    }
}
