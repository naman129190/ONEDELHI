package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import com.bumptech.glide.C1173a;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Deprecated
public class gj3 extends Fragment {

    /* renamed from: b */
    public static final String f12605b = "RMFragment";
    @ts2

    /* renamed from: a */
    public Fragment f12606a;

    /* renamed from: a */
    public final C1644a3 f12607a;
    @ts2

    /* renamed from: a */
    public fj3 f12608a;
    @ts2

    /* renamed from: a */
    public gj3 f12609a;

    /* renamed from: a */
    public final ij3 f12610a;

    /* renamed from: a */
    public final Set<gj3> f12611a;

    /* renamed from: com.onedelhi.secure.gj3$a */
    public class C2254a implements ij3 {
        public C2254a() {
        }

        @mr2
        /* renamed from: a */
        public Set<fj3> mo16682a() {
            Set<gj3> b = gj3.this.mo16665b();
            HashSet hashSet = new HashSet(b.size());
            for (gj3 next : b) {
                if (next.mo16668e() != null) {
                    hashSet.add(next.mo16668e());
                }
            }
            return hashSet;
        }

        public String toString() {
            return super.toString() + "{fragment=" + gj3.this + "}";
        }
    }

    public gj3() {
        this(new C1644a3());
    }

    @hw4
    @SuppressLint({"ValidFragment"})
    public gj3(@mr2 C1644a3 a3Var) {
        this.f12610a = new C2254a();
        this.f12611a = new HashSet();
        this.f12607a = a3Var;
    }

    /* renamed from: a */
    public final void mo16664a(gj3 gj3) {
        this.f12611a.add(gj3);
    }

    @mr2
    @TargetApi(17)
    /* renamed from: b */
    public Set<gj3> mo16665b() {
        if (equals(this.f12609a)) {
            return Collections.unmodifiableSet(this.f12611a);
        }
        if (this.f12609a == null) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet();
        for (gj3 next : this.f12609a.mo16665b()) {
            if (mo16670g(next.getParentFragment())) {
                hashSet.add(next);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    @mr2
    /* renamed from: c */
    public C1644a3 mo16666c() {
        return this.f12607a;
    }

    @TargetApi(17)
    @ts2
    /* renamed from: d */
    public final Fragment mo16667d() {
        Fragment parentFragment = getParentFragment();
        return parentFragment != null ? parentFragment : this.f12606a;
    }

    @ts2
    /* renamed from: e */
    public fj3 mo16668e() {
        return this.f12608a;
    }

    @mr2
    /* renamed from: f */
    public ij3 mo16669f() {
        return this.f12610a;
    }

    @TargetApi(17)
    /* renamed from: g */
    public final boolean mo16670g(@mr2 Fragment fragment) {
        Fragment parentFragment = getParentFragment();
        while (true) {
            Fragment parentFragment2 = fragment.getParentFragment();
            if (parentFragment2 == null) {
                return false;
            }
            if (parentFragment2.equals(parentFragment)) {
                return true;
            }
            fragment = fragment.getParentFragment();
        }
    }

    /* renamed from: h */
    public final void mo16671h(@mr2 Activity activity) {
        mo16675l();
        gj3 q = C1173a.m7529e(activity).mo7462o().mo17308q(activity);
        this.f12609a = q;
        if (!equals(q)) {
            this.f12609a.mo16664a(this);
        }
    }

    /* renamed from: i */
    public final void mo16672i(gj3 gj3) {
        this.f12611a.remove(gj3);
    }

    /* renamed from: j */
    public void mo16673j(@ts2 Fragment fragment) {
        this.f12606a = fragment;
        if (fragment != null && fragment.getActivity() != null) {
            mo16671h(fragment.getActivity());
        }
    }

    /* renamed from: k */
    public void mo16674k(@ts2 fj3 fj3) {
        this.f12608a = fj3;
    }

    /* renamed from: l */
    public final void mo16675l() {
        gj3 gj3 = this.f12609a;
        if (gj3 != null) {
            gj3.mo16672i(this);
            this.f12609a = null;
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mo16671h(activity);
        } catch (IllegalStateException e) {
            if (Log.isLoggable(f12605b, 5)) {
                Log.w(f12605b, "Unable to register fragment with root", e);
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.f12607a.mo12675c();
        mo16675l();
    }

    public void onDetach() {
        super.onDetach();
        mo16675l();
    }

    public void onStart() {
        super.onStart();
        this.f12607a.mo12676d();
    }

    public void onStop() {
        super.onStop();
        this.f12607a.mo12677e();
    }

    public String toString() {
        return super.toString() + "{parent=" + mo16667d() + "}";
    }
}
