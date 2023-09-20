package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C0690e;
import com.onedelhi.secure.ay2;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;
import java.util.ArrayList;

@Deprecated
/* renamed from: androidx.fragment.app.k */
public abstract class C0656k extends ay2 {

    /* renamed from: a */
    public static final String f3892a = "FragmentStatePagerAdapt";

    /* renamed from: b */
    public static final boolean f3893b = false;
    @Deprecated

    /* renamed from: d */
    public static final int f3894d = 0;

    /* renamed from: e */
    public static final int f3895e = 1;

    /* renamed from: a */
    public Fragment f3896a;

    /* renamed from: a */
    public final FragmentManager f3897a;

    /* renamed from: a */
    public C0657l f3898a;

    /* renamed from: a */
    public ArrayList<Fragment.C0590m> f3899a;

    /* renamed from: a */
    public boolean f3900a;

    /* renamed from: b */
    public ArrayList<Fragment> f3901b;

    /* renamed from: c */
    public final int f3902c;

    @Deprecated
    public C0656k(@mr2 FragmentManager fragmentManager) {
        this(fragmentManager, 0);
    }

    public C0656k(@mr2 FragmentManager fragmentManager, int i) {
        this.f3898a = null;
        this.f3899a = new ArrayList<>();
        this.f3901b = new ArrayList<>();
        this.f3896a = null;
        this.f3897a = fragmentManager;
        this.f3902c = i;
    }

    /* renamed from: b */
    public void mo4836b(@mr2 ViewGroup viewGroup, int i, @mr2 Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f3898a == null) {
            this.f3898a = this.f3897a.mo4611r();
        }
        while (this.f3899a.size() <= i) {
            this.f3899a.add((Object) null);
        }
        this.f3899a.set(i, fragment.isAdded() ? this.f3897a.mo4522I1(fragment) : null);
        this.f3901b.set(i, (Object) null);
        this.f3898a.mo4709B(fragment);
        if (fragment.equals(this.f3896a)) {
            this.f3896a = null;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: d */
    public void mo4837d(@mr2 ViewGroup viewGroup) {
        C0657l lVar = this.f3898a;
        if (lVar != null) {
            if (!this.f3900a) {
                try {
                    this.f3900a = true;
                    lVar.mo4729t();
                    this.f3900a = false;
                } catch (Throwable th) {
                    this.f3900a = false;
                    throw th;
                }
            }
            this.f3898a = null;
        }
    }

    @mr2
    /* renamed from: j */
    public Object mo4838j(@mr2 ViewGroup viewGroup, int i) {
        Fragment.C0590m mVar;
        Fragment fragment;
        if (this.f3901b.size() > i && (fragment = this.f3901b.get(i)) != null) {
            return fragment;
        }
        if (this.f3898a == null) {
            this.f3898a = this.f3897a.mo4611r();
        }
        Fragment v = mo4844v(i);
        if (this.f3899a.size() > i && (mVar = this.f3899a.get(i)) != null) {
            v.setInitialSavedState(mVar);
        }
        while (this.f3901b.size() <= i) {
            this.f3901b.add((Object) null);
        }
        v.setMenuVisibility(false);
        if (this.f3902c == 0) {
            v.setUserVisibleHint(false);
        }
        this.f3901b.set(i, v);
        this.f3898a.mo4860f(viewGroup.getId(), v);
        if (this.f3902c == 1) {
            this.f3898a.mo4710O(v, C0690e.C0693c.STARTED);
        }
        return v;
    }

    /* renamed from: k */
    public boolean mo4839k(@mr2 View view, @mr2 Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    /* renamed from: n */
    public void mo4840n(@ts2 Parcelable parcelable, @ts2 ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.f3899a.clear();
            this.f3901b.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.f3899a.add((Fragment.C0590m) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int parseInt = Integer.parseInt(str.substring(1));
                    Fragment C0 = this.f3897a.mo4504C0(bundle, str);
                    if (C0 != null) {
                        while (this.f3901b.size() <= parseInt) {
                            this.f3901b.add((Object) null);
                        }
                        C0.setMenuVisibility(false);
                        this.f3901b.set(parseInt, C0);
                    } else {
                        Log.w(f3892a, "Bad fragment at key " + str);
                    }
                }
            }
        }
    }

    @ts2
    /* renamed from: o */
    public Parcelable mo4841o() {
        Bundle bundle;
        if (this.f3899a.size() > 0) {
            bundle = new Bundle();
            Fragment.C0590m[] mVarArr = new Fragment.C0590m[this.f3899a.size()];
            this.f3899a.toArray(mVarArr);
            bundle.putParcelableArray("states", mVarArr);
        } else {
            bundle = null;
        }
        for (int i = 0; i < this.f3901b.size(); i++) {
            Fragment fragment = this.f3901b.get(i);
            if (fragment != null && fragment.isAdded()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                this.f3897a.mo4621u1(bundle, "f" + i, fragment);
            }
        }
        return bundle;
    }

    /* renamed from: q */
    public void mo4842q(@mr2 ViewGroup viewGroup, int i, @mr2 Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f3896a;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.f3902c == 1) {
                    if (this.f3898a == null) {
                        this.f3898a = this.f3897a.mo4611r();
                    }
                    this.f3898a.mo4710O(this.f3896a, C0690e.C0693c.STARTED);
                } else {
                    this.f3896a.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.f3902c == 1) {
                if (this.f3898a == null) {
                    this.f3898a = this.f3897a.mo4611r();
                }
                this.f3898a.mo4710O(fragment, C0690e.C0693c.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.f3896a = fragment;
        }
    }

    /* renamed from: t */
    public void mo4843t(@mr2 ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
        }
    }

    @mr2
    /* renamed from: v */
    public abstract Fragment mo4844v(int i);
}
