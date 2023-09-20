package com.onedelhi.secure;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C0709m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class xa1 extends au4 {

    /* renamed from: a */
    public static final C0709m.C0713b f22481a = new C3907a();

    /* renamed from: a */
    public static final String f22482a = "FragmentManager";

    /* renamed from: a */
    public final HashMap<String, Fragment> f22483a = new HashMap<>();

    /* renamed from: a */
    public final boolean f22484a;

    /* renamed from: b */
    public final HashMap<String, xa1> f22485b = new HashMap<>();

    /* renamed from: b */
    public boolean f22486b = false;

    /* renamed from: c */
    public final HashMap<String, gu4> f22487c = new HashMap<>();

    /* renamed from: c */
    public boolean f22488c = false;

    /* renamed from: d */
    public boolean f22489d = false;

    /* renamed from: com.onedelhi.secure.xa1$a */
    public class C3907a implements C0709m.C0713b {
        /* renamed from: a */
        public /* synthetic */ au4 mo4943a(Class cls, jb0 jb0) {
            return eu4.m14374b(this, cls, jb0);
        }

        @mr2
        /* renamed from: b */
        public <T extends au4> T mo4944b(@mr2 Class<T> cls) {
            return new xa1(true);
        }
    }

    public xa1(boolean z) {
        this.f22484a = z;
    }

    @mr2
    /* renamed from: g */
    public static xa1 m31360g(gu4 gu4) {
        return (xa1) new C0709m(gu4, f22481a).mo5027a(xa1.class);
    }

    /* renamed from: b */
    public void mo26845b(@mr2 Fragment fragment) {
        if (this.f22489d) {
            if (FragmentManager.m4279T0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else if (!this.f22483a.containsKey(fragment.mWho)) {
            this.f22483a.put(fragment.mWho, fragment);
            if (FragmentManager.m4279T0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
            }
        }
    }

    /* renamed from: d */
    public void mo26846d(@mr2 Fragment fragment) {
        if (FragmentManager.m4279T0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        xa1 xa1 = this.f22485b.get(fragment.mWho);
        if (xa1 != null) {
            xa1.onCleared();
            this.f22485b.remove(fragment.mWho);
        }
        gu4 gu4 = this.f22487c.get(fragment.mWho);
        if (gu4 != null) {
            gu4.mo16917a();
            this.f22487c.remove(fragment.mWho);
        }
    }

    @ts2
    /* renamed from: e */
    public Fragment mo26847e(String str) {
        return this.f22483a.get(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xa1.class != obj.getClass()) {
            return false;
        }
        xa1 xa1 = (xa1) obj;
        return this.f22483a.equals(xa1.f22483a) && this.f22485b.equals(xa1.f22485b) && this.f22487c.equals(xa1.f22487c);
    }

    @mr2
    /* renamed from: f */
    public xa1 mo26849f(@mr2 Fragment fragment) {
        xa1 xa1 = this.f22485b.get(fragment.mWho);
        if (xa1 != null) {
            return xa1;
        }
        xa1 xa12 = new xa1(this.f22484a);
        this.f22485b.put(fragment.mWho, xa12);
        return xa12;
    }

    public int hashCode() {
        return (((this.f22483a.hashCode() * 31) + this.f22485b.hashCode()) * 31) + this.f22487c.hashCode();
    }

    @mr2
    /* renamed from: i */
    public Collection<Fragment> mo26851i() {
        return new ArrayList(this.f22483a.values());
    }

    @ts2
    @Deprecated
    /* renamed from: j */
    public wa1 mo26852j() {
        if (this.f22483a.isEmpty() && this.f22485b.isEmpty() && this.f22487c.isEmpty()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f22485b.entrySet()) {
            wa1 j = ((xa1) next.getValue()).mo26852j();
            if (j != null) {
                hashMap.put(next.getKey(), j);
            }
        }
        this.f22488c = true;
        if (!this.f22483a.isEmpty() || !hashMap.isEmpty() || !this.f22487c.isEmpty()) {
            return new wa1(new ArrayList(this.f22483a.values()), hashMap, new HashMap(this.f22487c));
        }
        return null;
    }

    @mr2
    /* renamed from: k */
    public gu4 mo26853k(@mr2 Fragment fragment) {
        gu4 gu4 = this.f22487c.get(fragment.mWho);
        if (gu4 != null) {
            return gu4;
        }
        gu4 gu42 = new gu4();
        this.f22487c.put(fragment.mWho, gu42);
        return gu42;
    }

    /* renamed from: l */
    public boolean mo26854l() {
        return this.f22486b;
    }

    /* renamed from: m */
    public void mo26855m(@mr2 Fragment fragment) {
        if (!this.f22489d) {
            if ((this.f22483a.remove(fragment.mWho) != null) && FragmentManager.m4279T0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
            }
        } else if (FragmentManager.m4279T0(2)) {
            Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
        }
    }

    @Deprecated
    /* renamed from: n */
    public void mo26856n(@ts2 wa1 wa1) {
        this.f22483a.clear();
        this.f22485b.clear();
        this.f22487c.clear();
        if (wa1 != null) {
            Collection<Fragment> b = wa1.mo26473b();
            if (b != null) {
                for (Fragment next : b) {
                    if (next != null) {
                        this.f22483a.put(next.mWho, next);
                    }
                }
            }
            Map<String, wa1> a = wa1.mo26472a();
            if (a != null) {
                for (Map.Entry next2 : a.entrySet()) {
                    xa1 xa1 = new xa1(this.f22484a);
                    xa1.mo26856n((wa1) next2.getValue());
                    this.f22485b.put(next2.getKey(), xa1);
                }
            }
            Map<String, gu4> c = wa1.mo26474c();
            if (c != null) {
                this.f22487c.putAll(c);
            }
        }
        this.f22488c = false;
    }

    /* renamed from: o */
    public void mo26857o(boolean z) {
        this.f22489d = z;
    }

    public void onCleared() {
        if (FragmentManager.m4279T0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f22486b = true;
    }

    /* renamed from: p */
    public boolean mo26858p(@mr2 Fragment fragment) {
        if (!this.f22483a.containsKey(fragment.mWho)) {
            return true;
        }
        return this.f22484a ? this.f22486b : !this.f22488c;
    }

    @mr2
    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.f22483a.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f22485b.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f22487c.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
