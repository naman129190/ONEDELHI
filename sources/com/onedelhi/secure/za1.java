package com.onedelhi.secure;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0657l;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C0690e;

@Deprecated
public abstract class za1 extends ay2 {

    /* renamed from: a */
    public static final String f23515a = "FragmentPagerAdapter";

    /* renamed from: b */
    public static final boolean f23516b = false;
    @Deprecated

    /* renamed from: d */
    public static final int f23517d = 0;

    /* renamed from: e */
    public static final int f23518e = 1;

    /* renamed from: a */
    public Fragment f23519a;

    /* renamed from: a */
    public final FragmentManager f23520a;

    /* renamed from: a */
    public C0657l f23521a;

    /* renamed from: a */
    public boolean f23522a;

    /* renamed from: c */
    public final int f23523c;

    @Deprecated
    public za1(@mr2 FragmentManager fragmentManager) {
        this(fragmentManager, 0);
    }

    public za1(@mr2 FragmentManager fragmentManager, int i) {
        this.f23521a = null;
        this.f23519a = null;
        this.f23520a = fragmentManager;
        this.f23523c = i;
    }

    /* renamed from: x */
    public static String m32957x(int i, long j) {
        return "android:switcher:" + i + ar4.f25981a + j;
    }

    /* renamed from: b */
    public void mo4836b(@mr2 ViewGroup viewGroup, int i, @mr2 Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f23521a == null) {
            this.f23521a = this.f23520a.mo4611r();
        }
        this.f23521a.mo4731v(fragment);
        if (fragment.equals(this.f23519a)) {
            this.f23519a = null;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: d */
    public void mo4837d(@mr2 ViewGroup viewGroup) {
        C0657l lVar = this.f23521a;
        if (lVar != null) {
            if (!this.f23522a) {
                try {
                    this.f23522a = true;
                    lVar.mo4729t();
                    this.f23522a = false;
                } catch (Throwable th) {
                    this.f23522a = false;
                    throw th;
                }
            }
            this.f23521a = null;
        }
    }

    @mr2
    /* renamed from: j */
    public Object mo4838j(@mr2 ViewGroup viewGroup, int i) {
        if (this.f23521a == null) {
            this.f23521a = this.f23520a.mo4611r();
        }
        long w = mo27855w(i);
        Fragment q0 = this.f23520a.mo4609q0(m32957x(viewGroup.getId(), w));
        if (q0 != null) {
            this.f23521a.mo4870p(q0);
        } else {
            q0 = mo27854v(i);
            this.f23521a.mo4861g(viewGroup.getId(), q0, m32957x(viewGroup.getId(), w));
        }
        if (q0 != this.f23519a) {
            q0.setMenuVisibility(false);
            if (this.f23523c == 1) {
                this.f23521a.mo4710O(q0, C0690e.C0693c.STARTED);
            } else {
                q0.setUserVisibleHint(false);
            }
        }
        return q0;
    }

    /* renamed from: k */
    public boolean mo4839k(@mr2 View view, @mr2 Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    /* renamed from: n */
    public void mo4840n(@ts2 Parcelable parcelable, @ts2 ClassLoader classLoader) {
    }

    @ts2
    /* renamed from: o */
    public Parcelable mo4841o() {
        return null;
    }

    /* renamed from: q */
    public void mo4842q(@mr2 ViewGroup viewGroup, int i, @mr2 Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f23519a;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.f23523c == 1) {
                    if (this.f23521a == null) {
                        this.f23521a = this.f23520a.mo4611r();
                    }
                    this.f23521a.mo4710O(this.f23519a, C0690e.C0693c.STARTED);
                } else {
                    this.f23519a.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.f23523c == 1) {
                if (this.f23521a == null) {
                    this.f23521a = this.f23520a.mo4611r();
                }
                this.f23521a.mo4710O(fragment, C0690e.C0693c.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.f23519a = fragment;
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
    public abstract Fragment mo27854v(int i);

    /* renamed from: w */
    public long mo27855w(int i) {
        return (long) i;
    }
}
