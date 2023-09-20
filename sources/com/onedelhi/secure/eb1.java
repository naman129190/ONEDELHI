package com.onedelhi.secure;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.perf.metrics.Trace;
import com.onedelhi.secure.nb1;
import java.util.WeakHashMap;

public class eb1 extends FragmentManager.C0608m {

    /* renamed from: a */
    public static final C7012v5 f27841a = C7012v5.m67717e();

    /* renamed from: a */
    public final C5068dz f27842a;

    /* renamed from: a */
    public final C5665i9 f27843a;

    /* renamed from: a */
    public final li4 f27844a;

    /* renamed from: a */
    public final ob1 f27845a;

    /* renamed from: a */
    public final WeakHashMap<Fragment, Trace> f27846a = new WeakHashMap<>();

    public eb1(C5068dz dzVar, li4 li4, C5665i9 i9Var, ob1 ob1) {
        this.f27842a = dzVar;
        this.f27844a = li4;
        this.f27843a = i9Var;
        this.f27845a = ob1;
    }

    /* renamed from: f */
    public void mo4663f(@mr2 FragmentManager fragmentManager, @mr2 Fragment fragment) {
        super.mo4663f(fragmentManager, fragment);
        C7012v5 v5Var = f27841a;
        v5Var.mo46001b("FragmentMonitor %s.onFragmentPaused ", fragment.getClass().getSimpleName());
        if (!this.f27846a.containsKey(fragment)) {
            v5Var.mo46011m("FragmentMonitor: missed a fragment trace from %s", fragment.getClass().getSimpleName());
            return;
        }
        Trace trace = this.f27846a.get(fragment);
        this.f27846a.remove(fragment);
        rw2<nb1.C6180a> f = this.f27845a.mo41652f(fragment);
        if (!f.mo44068d()) {
            v5Var.mo46011m("onFragmentPaused: recorder failed to trace %s", fragment.getClass().getSimpleName());
            return;
        }
        ls3.m56478a(trace, f.mo44067c());
        trace.stop();
    }

    /* renamed from: i */
    public void mo4666i(@mr2 FragmentManager fragmentManager, @mr2 Fragment fragment) {
        super.mo4666i(fragmentManager, fragment);
        f27841a.mo46001b("FragmentMonitor %s.onFragmentResumed", fragment.getClass().getSimpleName());
        Trace trace = new Trace(mo35010o(fragment), this.f27844a, this.f27842a, this.f27843a);
        trace.start();
        trace.putAttribute(g60.f28964d, fragment.getParentFragment() == null ? g60.f28968f : fragment.getParentFragment().getClass().getSimpleName());
        if (fragment.getActivity() != null) {
            trace.putAttribute(g60.f28966e, fragment.getActivity().getClass().getSimpleName());
        }
        this.f27846a.put(fragment, trace);
        this.f27845a.mo41650d(fragment);
    }

    /* renamed from: o */
    public String mo35010o(Fragment fragment) {
        return g60.f28962c + fragment.getClass().getSimpleName();
    }

    @VisibleForTesting
    /* renamed from: p */
    public WeakHashMap<Fragment, Trace> mo35011p() {
        return this.f27846a;
    }
}
