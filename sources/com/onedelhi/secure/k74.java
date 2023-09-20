package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bumptech.glide.C1173a;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class k74 extends Fragment {

    /* renamed from: b */
    public static final String f14770b = "SupportRMFragment";
    @ts2

    /* renamed from: a */
    public Fragment f14771a;

    /* renamed from: a */
    public final C1644a3 f14772a;
    @ts2

    /* renamed from: a */
    public fj3 f14773a;

    /* renamed from: a */
    public final ij3 f14774a;
    @ts2

    /* renamed from: a */
    public k74 f14775a;

    /* renamed from: a */
    public final Set<k74> f14776a;

    /* renamed from: com.onedelhi.secure.k74$a */
    public class C2609a implements ij3 {
        public C2609a() {
        }

        @mr2
        /* renamed from: a */
        public Set<fj3> mo16682a() {
            Set<k74> r = k74.this.mo18936r();
            HashSet hashSet = new HashSet(r.size());
            for (k74 next : r) {
                if (next.mo18939y() != null) {
                    hashSet.add(next.mo18939y());
                }
            }
            return hashSet;
        }

        public String toString() {
            return super.toString() + "{fragment=" + k74.this + "}";
        }
    }

    public k74() {
        this(new C1644a3());
    }

    @hw4
    @SuppressLint({"ValidFragment"})
    public k74(@mr2 C1644a3 a3Var) {
        this.f14774a = new C2609a();
        this.f14776a = new HashSet();
        this.f14772a = a3Var;
    }

    @ts2
    /* renamed from: D */
    public static FragmentManager m19515D(@mr2 Fragment fragment) {
        while (fragment.getParentFragment() != null) {
            fragment = fragment.getParentFragment();
        }
        return fragment.getFragmentManager();
    }

    @mr2
    /* renamed from: A */
    public ij3 mo18928A() {
        return this.f14774a;
    }

    /* renamed from: E */
    public final boolean mo18929E(@mr2 Fragment fragment) {
        Fragment w = mo18938w();
        while (true) {
            Fragment parentFragment = fragment.getParentFragment();
            if (parentFragment == null) {
                return false;
            }
            if (parentFragment.equals(w)) {
                return true;
            }
            fragment = fragment.getParentFragment();
        }
    }

    /* renamed from: G */
    public final void mo18930G(@mr2 Context context, @mr2 FragmentManager fragmentManager) {
        mo18934O();
        k74 s = C1173a.m7529e(context).mo7462o().mo17310s(fragmentManager);
        this.f14775a = s;
        if (!equals(s)) {
            this.f14775a.mo18935q(this);
        }
    }

    /* renamed from: I */
    public final void mo18931I(k74 k74) {
        this.f14776a.remove(k74);
    }

    /* renamed from: L */
    public void mo18932L(@ts2 Fragment fragment) {
        FragmentManager D;
        this.f14771a = fragment;
        if (fragment != null && fragment.getContext() != null && (D = m19515D(fragment)) != null) {
            mo18930G(fragment.getContext(), D);
        }
    }

    /* renamed from: N */
    public void mo18933N(@ts2 fj3 fj3) {
        this.f14773a = fj3;
    }

    /* renamed from: O */
    public final void mo18934O() {
        k74 k74 = this.f14775a;
        if (k74 != null) {
            k74.mo18931I(this);
            this.f14775a = null;
        }
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        FragmentManager D = m19515D(this);
        if (D != null) {
            try {
                mo18930G(getContext(), D);
            } catch (IllegalStateException e) {
                if (Log.isLoggable(f14770b, 5)) {
                    Log.w(f14770b, "Unable to register fragment with root", e);
                }
            }
        } else if (Log.isLoggable(f14770b, 5)) {
            Log.w(f14770b, "Unable to register fragment with root, ancestor detached");
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.f14772a.mo12675c();
        mo18934O();
    }

    public void onDetach() {
        super.onDetach();
        this.f14771a = null;
        mo18934O();
    }

    public void onStart() {
        super.onStart();
        this.f14772a.mo12676d();
    }

    public void onStop() {
        super.onStop();
        this.f14772a.mo12677e();
    }

    /* renamed from: q */
    public final void mo18935q(k74 k74) {
        this.f14776a.add(k74);
    }

    @mr2
    /* renamed from: r */
    public Set<k74> mo18936r() {
        k74 k74 = this.f14775a;
        if (k74 == null) {
            return Collections.emptySet();
        }
        if (equals(k74)) {
            return Collections.unmodifiableSet(this.f14776a);
        }
        HashSet hashSet = new HashSet();
        for (k74 next : this.f14775a.mo18936r()) {
            if (mo18929E(next.mo18938w())) {
                hashSet.add(next);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    @mr2
    /* renamed from: s */
    public C1644a3 mo18937s() {
        return this.f14772a;
    }

    public String toString() {
        return super.toString() + "{parent=" + mo18938w() + "}";
    }

    @ts2
    /* renamed from: w */
    public final Fragment mo18938w() {
        Fragment parentFragment = getParentFragment();
        return parentFragment != null ? parentFragment : this.f14771a;
    }

    @ts2
    /* renamed from: y */
    public fj3 mo18939y() {
        return this.f14773a;
    }
}
