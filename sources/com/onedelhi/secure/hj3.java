package com.onedelhi.secure;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.C1173a;
import com.bumptech.glide.C1175b;
import com.bumptech.glide.C1183d;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class hj3 implements Handler.Callback {

    /* renamed from: b */
    public static final C2353b f13130b = new C2352a();
    @hw4

    /* renamed from: b */
    public static final String f13131b = "com.bumptech.glide.manager";

    /* renamed from: c */
    public static final String f13132c = "RMRetriever";

    /* renamed from: d */
    public static final String f13133d = "key";

    /* renamed from: n */
    public static final int f13134n = 1;

    /* renamed from: o */
    public static final int f13135o = 2;

    /* renamed from: a */
    public final Bundle f13136a = new Bundle();

    /* renamed from: a */
    public final Handler f13137a;

    /* renamed from: a */
    public volatile fj3 f13138a;

    /* renamed from: a */
    public final C2353b f13139a;

    /* renamed from: a */
    public final C3042oa<View, Fragment> f13140a = new C3042oa<>();

    /* renamed from: a */
    public final pb1 f13141a;
    @hw4

    /* renamed from: a */
    public final Map<FragmentManager, gj3> f13142a = new HashMap();

    /* renamed from: b */
    public final C3042oa<View, android.app.Fragment> f13143b = new C3042oa<>();
    @hw4

    /* renamed from: b */
    public final Map<androidx.fragment.app.FragmentManager, k74> f13144b = new HashMap();

    /* renamed from: com.onedelhi.secure.hj3$a */
    public class C2352a implements C2353b {
        @mr2
        /* renamed from: a */
        public fj3 mo17313a(@mr2 C1173a aVar, @mr2 v22 v22, @mr2 ij3 ij3, @mr2 Context context) {
            return new fj3(aVar, v22, ij3, context);
        }
    }

    /* renamed from: com.onedelhi.secure.hj3$b */
    public interface C2353b {
        @mr2
        /* renamed from: a */
        fj3 mo17313a(@mr2 C1173a aVar, @mr2 v22 v22, @mr2 ij3 ij3, @mr2 Context context);
    }

    public hj3(@ts2 C2353b bVar, C1183d dVar) {
        this.f13139a = bVar == null ? f13130b : bVar;
        this.f13137a = new Handler(Looper.getMainLooper(), this);
        this.f13141a = m16799b(dVar);
    }

    @TargetApi(17)
    /* renamed from: a */
    public static void m16798a(@mr2 Activity activity) {
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    /* renamed from: b */
    public static pb1 m16799b(C1183d dVar) {
        return (!gk1.f12621d || !gk1.f12619c) ? new rn0() : dVar.mo7503b(C1175b.C1181f.class) ? new a71() : new b71();
    }

    @ts2
    /* renamed from: c */
    public static Activity m16800c(@mr2 Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return m16800c(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    /* renamed from: f */
    public static void m16801f(@ts2 Collection<Fragment> collection, @mr2 Map<View, Fragment> map) {
        if (collection != null) {
            for (Fragment next : collection) {
                if (!(next == null || next.getView() == null)) {
                    map.put(next.getView(), next);
                    m16801f(next.getChildFragmentManager().mo4516G0(), map);
                }
            }
        }
    }

    /* renamed from: u */
    public static boolean m16802u(Context context) {
        Activity c = m16800c(context);
        return c == null || !c.isFinishing();
    }

    @TargetApi(26)
    @Deprecated
    /* renamed from: d */
    public final void mo17295d(@mr2 FragmentManager fragmentManager, @mr2 C3042oa<View, android.app.Fragment> oaVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            for (android.app.Fragment next : fragmentManager.getFragments()) {
                if (next.getView() != null) {
                    oaVar.put(next.getView(), next);
                    mo17295d(next.getChildFragmentManager(), oaVar);
                }
            }
            return;
        }
        mo17296e(fragmentManager, oaVar);
    }

    @Deprecated
    /* renamed from: e */
    public final void mo17296e(@mr2 FragmentManager fragmentManager, @mr2 C3042oa<View, android.app.Fragment> oaVar) {
        int i = 0;
        while (true) {
            int i2 = i + 1;
            this.f13136a.putInt("key", i);
            android.app.Fragment fragment = null;
            try {
                fragment = fragmentManager.getFragment(this.f13136a, "key");
            } catch (Exception unused) {
            }
            if (fragment != null) {
                if (fragment.getView() != null) {
                    oaVar.put(fragment.getView(), fragment);
                    mo17295d(fragment.getChildFragmentManager(), oaVar);
                }
                i = i2;
            } else {
                return;
            }
        }
    }

    @ts2
    @Deprecated
    /* renamed from: g */
    public final android.app.Fragment mo17297g(@mr2 View view, @mr2 Activity activity) {
        this.f13143b.clear();
        mo17295d(activity.getFragmentManager(), this.f13143b);
        View findViewById = activity.findViewById(16908290);
        android.app.Fragment fragment = null;
        while (!view.equals(findViewById) && (fragment = this.f13143b.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        this.f13143b.clear();
        return fragment;
    }

    @ts2
    /* renamed from: h */
    public final Fragment mo17298h(@mr2 View view, @mr2 FragmentActivity fragmentActivity) {
        this.f13140a.clear();
        m16801f(fragmentActivity.mo4464v0().mo4516G0(), this.f13140a);
        View findViewById = fragmentActivity.findViewById(16908290);
        Fragment fragment = null;
        while (!view.equals(findViewById) && (fragment = this.f13140a.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        this.f13140a.clear();
        return fragment;
    }

    public boolean handleMessage(Message message) {
        Object obj;
        Map map;
        Object obj2;
        int i = message.what;
        Object obj3 = null;
        boolean z = true;
        if (i == 1) {
            obj2 = (FragmentManager) message.obj;
            map = this.f13142a;
        } else if (i != 2) {
            z = false;
            obj = null;
            if (z && obj3 == null && Log.isLoggable(f13132c, 5)) {
                Log.w(f13132c, "Failed to remove expected request manager fragment, manager: " + obj);
            }
            return z;
        } else {
            obj2 = (androidx.fragment.app.FragmentManager) message.obj;
            map = this.f13144b;
        }
        Object obj4 = obj2;
        obj3 = map.remove(obj2);
        obj = obj4;
        Log.w(f13132c, "Failed to remove expected request manager fragment, manager: " + obj);
        return z;
    }

    @mr2
    @Deprecated
    /* renamed from: i */
    public final fj3 mo17300i(@mr2 Context context, @mr2 FragmentManager fragmentManager, @ts2 android.app.Fragment fragment, boolean z) {
        gj3 r = mo17309r(fragmentManager, fragment);
        fj3 e = r.mo16668e();
        if (e == null) {
            e = this.f13139a.mo17313a(C1173a.m7529e(context), r.mo16666c(), r.mo16669f(), context);
            if (z) {
                e.mo15995d();
            }
            r.mo16674k(e);
        }
        return e;
    }

    @mr2
    /* renamed from: j */
    public fj3 mo17301j(@mr2 Activity activity) {
        if (oq4.m24032t()) {
            return mo17303l(activity.getApplicationContext());
        }
        if (activity instanceof FragmentActivity) {
            return mo17306o((FragmentActivity) activity);
        }
        m16798a(activity);
        this.f13141a.mo12809a(activity);
        return mo17300i(activity, activity.getFragmentManager(), (android.app.Fragment) null, m16802u(activity));
    }

    @mr2
    @TargetApi(17)
    @Deprecated
    /* renamed from: k */
    public fj3 mo17302k(@mr2 android.app.Fragment fragment) {
        if (fragment.getActivity() == null) {
            throw new IllegalArgumentException("You cannot start a load on a fragment before it is attached");
        } else if (oq4.m24032t()) {
            return mo17303l(fragment.getActivity().getApplicationContext());
        } else {
            if (fragment.getActivity() != null) {
                this.f13141a.mo12809a(fragment.getActivity());
            }
            return mo17300i(fragment.getActivity(), fragment.getChildFragmentManager(), fragment, fragment.isVisible());
        }
    }

    @mr2
    /* renamed from: l */
    public fj3 mo17303l(@mr2 Context context) {
        if (context != null) {
            if (oq4.m24033u() && !(context instanceof Application)) {
                if (context instanceof FragmentActivity) {
                    return mo17306o((FragmentActivity) context);
                }
                if (context instanceof Activity) {
                    return mo17301j((Activity) context);
                }
                if (context instanceof ContextWrapper) {
                    ContextWrapper contextWrapper = (ContextWrapper) context;
                    if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                        return mo17303l(contextWrapper.getBaseContext());
                    }
                }
            }
            return mo17307p(context);
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    @mr2
    /* renamed from: m */
    public fj3 mo17304m(@mr2 View view) {
        if (!oq4.m24032t()) {
            g43.m15509d(view);
            g43.m15510e(view.getContext(), "Unable to obtain a request manager for a view without a Context");
            Activity c = m16800c(view.getContext());
            if (c != null) {
                if (c instanceof FragmentActivity) {
                    FragmentActivity fragmentActivity = (FragmentActivity) c;
                    Fragment h = mo17298h(view, fragmentActivity);
                    return h != null ? mo17305n(h) : mo17306o(fragmentActivity);
                }
                android.app.Fragment g = mo17297g(view, c);
                return g == null ? mo17301j(c) : mo17302k(g);
            }
        }
        return mo17303l(view.getContext().getApplicationContext());
    }

    @mr2
    /* renamed from: n */
    public fj3 mo17305n(@mr2 Fragment fragment) {
        g43.m15510e(fragment.getContext(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (oq4.m24032t()) {
            return mo17303l(fragment.getContext().getApplicationContext());
        }
        if (fragment.getActivity() != null) {
            this.f13141a.mo12809a(fragment.getActivity());
        }
        return mo17312v(fragment.getContext(), fragment.getChildFragmentManager(), fragment, fragment.isVisible());
    }

    @mr2
    /* renamed from: o */
    public fj3 mo17306o(@mr2 FragmentActivity fragmentActivity) {
        if (oq4.m24032t()) {
            return mo17303l(fragmentActivity.getApplicationContext());
        }
        m16798a(fragmentActivity);
        this.f13141a.mo12809a(fragmentActivity);
        return mo17312v(fragmentActivity, fragmentActivity.mo4464v0(), (Fragment) null, m16802u(fragmentActivity));
    }

    @mr2
    /* renamed from: p */
    public final fj3 mo17307p(@mr2 Context context) {
        if (this.f13138a == null) {
            synchronized (this) {
                if (this.f13138a == null) {
                    this.f13138a = this.f13139a.mo17313a(C1173a.m7529e(context.getApplicationContext()), new C2936n9(), new nt0(), context.getApplicationContext());
                }
            }
        }
        return this.f13138a;
    }

    @mr2
    @Deprecated
    /* renamed from: q */
    public gj3 mo17308q(Activity activity) {
        return mo17309r(activity.getFragmentManager(), (android.app.Fragment) null);
    }

    @mr2
    /* renamed from: r */
    public final gj3 mo17309r(@mr2 FragmentManager fragmentManager, @ts2 android.app.Fragment fragment) {
        gj3 gj3 = (gj3) fragmentManager.findFragmentByTag(f13131b);
        if (gj3 != null) {
            return gj3;
        }
        gj3 gj32 = this.f13142a.get(fragmentManager);
        if (gj32 != null) {
            return gj32;
        }
        gj3 gj33 = new gj3();
        gj33.mo16673j(fragment);
        this.f13142a.put(fragmentManager, gj33);
        fragmentManager.beginTransaction().add(gj33, f13131b).commitAllowingStateLoss();
        this.f13137a.obtainMessage(1, fragmentManager).sendToTarget();
        return gj33;
    }

    @mr2
    /* renamed from: s */
    public k74 mo17310s(androidx.fragment.app.FragmentManager fragmentManager) {
        return mo17311t(fragmentManager, (Fragment) null);
    }

    @mr2
    /* renamed from: t */
    public final k74 mo17311t(@mr2 androidx.fragment.app.FragmentManager fragmentManager, @ts2 Fragment fragment) {
        k74 k74 = (k74) fragmentManager.mo4609q0(f13131b);
        if (k74 != null) {
            return k74;
        }
        k74 k742 = this.f13144b.get(fragmentManager);
        if (k742 != null) {
            return k742;
        }
        k74 k743 = new k74();
        k743.mo18932L(fragment);
        this.f13144b.put(fragmentManager, k743);
        fragmentManager.mo4611r().mo4865k(k743, f13131b).mo4727r();
        this.f13137a.obtainMessage(2, fragmentManager).sendToTarget();
        return k743;
    }

    @mr2
    /* renamed from: v */
    public final fj3 mo17312v(@mr2 Context context, @mr2 androidx.fragment.app.FragmentManager fragmentManager, @ts2 Fragment fragment, boolean z) {
        k74 t = mo17311t(fragmentManager, fragment);
        fj3 y = t.mo18939y();
        if (y == null) {
            y = this.f13139a.mo17313a(C1173a.m7529e(context), t.mo18937s(), t.mo18928A(), context);
            if (z) {
                y.mo15995d();
            }
            t.mo18933N(y);
        }
        return y;
    }
}
