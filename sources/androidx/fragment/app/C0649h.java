package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.fragment.app.h */
public class C0649h {
    @mr2

    /* renamed from: a */
    public final FragmentManager f3866a;
    @mr2

    /* renamed from: a */
    public final CopyOnWriteArrayList<C0650a> f3867a = new CopyOnWriteArrayList<>();

    /* renamed from: androidx.fragment.app.h$a */
    public static final class C0650a {
        @mr2

        /* renamed from: a */
        public final FragmentManager.C0608m f3868a;

        /* renamed from: a */
        public final boolean f3869a;

        public C0650a(@mr2 FragmentManager.C0608m mVar, boolean z) {
            this.f3868a = mVar;
            this.f3869a = z;
        }
    }

    public C0649h(@mr2 FragmentManager fragmentManager) {
        this.f3866a = fragmentManager;
    }

    /* renamed from: a */
    public void mo4789a(@mr2 Fragment fragment, @ts2 Bundle bundle, boolean z) {
        Fragment K0 = this.f3866a.mo4527K0();
        if (K0 != null) {
            K0.getParentFragmentManager().mo4524J0().mo4789a(fragment, bundle, true);
        }
        Iterator<C0650a> it = this.f3867a.iterator();
        while (it.hasNext()) {
            C0650a next = it.next();
            if (!z || next.f3869a) {
                next.f3868a.mo4658a(this.f3866a, fragment, bundle);
            }
        }
    }

    /* renamed from: b */
    public void mo4790b(@mr2 Fragment fragment, boolean z) {
        Context f = this.f3866a.mo4518H0().mo4779f();
        Fragment K0 = this.f3866a.mo4527K0();
        if (K0 != null) {
            K0.getParentFragmentManager().mo4524J0().mo4790b(fragment, true);
        }
        Iterator<C0650a> it = this.f3867a.iterator();
        while (it.hasNext()) {
            C0650a next = it.next();
            if (!z || next.f3869a) {
                next.f3868a.mo4659b(this.f3866a, fragment, f);
            }
        }
    }

    /* renamed from: c */
    public void mo4791c(@mr2 Fragment fragment, @ts2 Bundle bundle, boolean z) {
        Fragment K0 = this.f3866a.mo4527K0();
        if (K0 != null) {
            K0.getParentFragmentManager().mo4524J0().mo4791c(fragment, bundle, true);
        }
        Iterator<C0650a> it = this.f3867a.iterator();
        while (it.hasNext()) {
            C0650a next = it.next();
            if (!z || next.f3869a) {
                next.f3868a.mo4660c(this.f3866a, fragment, bundle);
            }
        }
    }

    /* renamed from: d */
    public void mo4792d(@mr2 Fragment fragment, boolean z) {
        Fragment K0 = this.f3866a.mo4527K0();
        if (K0 != null) {
            K0.getParentFragmentManager().mo4524J0().mo4792d(fragment, true);
        }
        Iterator<C0650a> it = this.f3867a.iterator();
        while (it.hasNext()) {
            C0650a next = it.next();
            if (!z || next.f3869a) {
                next.f3868a.mo4661d(this.f3866a, fragment);
            }
        }
    }

    /* renamed from: e */
    public void mo4793e(@mr2 Fragment fragment, boolean z) {
        Fragment K0 = this.f3866a.mo4527K0();
        if (K0 != null) {
            K0.getParentFragmentManager().mo4524J0().mo4793e(fragment, true);
        }
        Iterator<C0650a> it = this.f3867a.iterator();
        while (it.hasNext()) {
            C0650a next = it.next();
            if (!z || next.f3869a) {
                next.f3868a.mo4662e(this.f3866a, fragment);
            }
        }
    }

    /* renamed from: f */
    public void mo4794f(@mr2 Fragment fragment, boolean z) {
        Fragment K0 = this.f3866a.mo4527K0();
        if (K0 != null) {
            K0.getParentFragmentManager().mo4524J0().mo4794f(fragment, true);
        }
        Iterator<C0650a> it = this.f3867a.iterator();
        while (it.hasNext()) {
            C0650a next = it.next();
            if (!z || next.f3869a) {
                next.f3868a.mo4663f(this.f3866a, fragment);
            }
        }
    }

    /* renamed from: g */
    public void mo4795g(@mr2 Fragment fragment, boolean z) {
        Context f = this.f3866a.mo4518H0().mo4779f();
        Fragment K0 = this.f3866a.mo4527K0();
        if (K0 != null) {
            K0.getParentFragmentManager().mo4524J0().mo4795g(fragment, true);
        }
        Iterator<C0650a> it = this.f3867a.iterator();
        while (it.hasNext()) {
            C0650a next = it.next();
            if (!z || next.f3869a) {
                next.f3868a.mo4664g(this.f3866a, fragment, f);
            }
        }
    }

    /* renamed from: h */
    public void mo4796h(@mr2 Fragment fragment, @ts2 Bundle bundle, boolean z) {
        Fragment K0 = this.f3866a.mo4527K0();
        if (K0 != null) {
            K0.getParentFragmentManager().mo4524J0().mo4796h(fragment, bundle, true);
        }
        Iterator<C0650a> it = this.f3867a.iterator();
        while (it.hasNext()) {
            C0650a next = it.next();
            if (!z || next.f3869a) {
                next.f3868a.mo4665h(this.f3866a, fragment, bundle);
            }
        }
    }

    /* renamed from: i */
    public void mo4797i(@mr2 Fragment fragment, boolean z) {
        Fragment K0 = this.f3866a.mo4527K0();
        if (K0 != null) {
            K0.getParentFragmentManager().mo4524J0().mo4797i(fragment, true);
        }
        Iterator<C0650a> it = this.f3867a.iterator();
        while (it.hasNext()) {
            C0650a next = it.next();
            if (!z || next.f3869a) {
                next.f3868a.mo4666i(this.f3866a, fragment);
            }
        }
    }

    /* renamed from: j */
    public void mo4798j(@mr2 Fragment fragment, @mr2 Bundle bundle, boolean z) {
        Fragment K0 = this.f3866a.mo4527K0();
        if (K0 != null) {
            K0.getParentFragmentManager().mo4524J0().mo4798j(fragment, bundle, true);
        }
        Iterator<C0650a> it = this.f3867a.iterator();
        while (it.hasNext()) {
            C0650a next = it.next();
            if (!z || next.f3869a) {
                next.f3868a.mo4667j(this.f3866a, fragment, bundle);
            }
        }
    }

    /* renamed from: k */
    public void mo4799k(@mr2 Fragment fragment, boolean z) {
        Fragment K0 = this.f3866a.mo4527K0();
        if (K0 != null) {
            K0.getParentFragmentManager().mo4524J0().mo4799k(fragment, true);
        }
        Iterator<C0650a> it = this.f3867a.iterator();
        while (it.hasNext()) {
            C0650a next = it.next();
            if (!z || next.f3869a) {
                next.f3868a.mo4668k(this.f3866a, fragment);
            }
        }
    }

    /* renamed from: l */
    public void mo4800l(@mr2 Fragment fragment, boolean z) {
        Fragment K0 = this.f3866a.mo4527K0();
        if (K0 != null) {
            K0.getParentFragmentManager().mo4524J0().mo4800l(fragment, true);
        }
        Iterator<C0650a> it = this.f3867a.iterator();
        while (it.hasNext()) {
            C0650a next = it.next();
            if (!z || next.f3869a) {
                next.f3868a.mo4669l(this.f3866a, fragment);
            }
        }
    }

    /* renamed from: m */
    public void mo4801m(@mr2 Fragment fragment, @mr2 View view, @ts2 Bundle bundle, boolean z) {
        Fragment K0 = this.f3866a.mo4527K0();
        if (K0 != null) {
            K0.getParentFragmentManager().mo4524J0().mo4801m(fragment, view, bundle, true);
        }
        Iterator<C0650a> it = this.f3867a.iterator();
        while (it.hasNext()) {
            C0650a next = it.next();
            if (!z || next.f3869a) {
                next.f3868a.mo4670m(this.f3866a, fragment, view, bundle);
            }
        }
    }

    /* renamed from: n */
    public void mo4802n(@mr2 Fragment fragment, boolean z) {
        Fragment K0 = this.f3866a.mo4527K0();
        if (K0 != null) {
            K0.getParentFragmentManager().mo4524J0().mo4802n(fragment, true);
        }
        Iterator<C0650a> it = this.f3867a.iterator();
        while (it.hasNext()) {
            C0650a next = it.next();
            if (!z || next.f3869a) {
                next.f3868a.mo4671n(this.f3866a, fragment);
            }
        }
    }

    /* renamed from: o */
    public void mo4803o(@mr2 FragmentManager.C0608m mVar, boolean z) {
        this.f3867a.add(new C0650a(mVar, z));
    }

    /* renamed from: p */
    public void mo4804p(@mr2 FragmentManager.C0608m mVar) {
        synchronized (this.f3867a) {
            int i = 0;
            int size = this.f3867a.size();
            while (true) {
                if (i >= size) {
                    break;
                } else if (this.f3867a.get(i).f3868a == mVar) {
                    this.f3867a.remove(i);
                    break;
                } else {
                    i++;
                }
            }
        }
    }
}
