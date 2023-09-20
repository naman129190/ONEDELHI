package com.onedelhi.secure;

import android.view.View;
import android.view.ViewGroup;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.ne2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@hn4
@hl3({hl3.C2354a.LIBRARY_GROUP})
/* renamed from: com.onedelhi.secure.mx */
public class C6153mx<T extends ne2<T>> {

    /* renamed from: a */
    public C6155b f32302a;

    /* renamed from: a */
    public final Map<Integer, T> f32303a = new HashMap();

    /* renamed from: a */
    public final Set<Integer> f32304a = new HashSet();

    /* renamed from: a */
    public boolean f32305a;

    /* renamed from: b */
    public boolean f32306b;

    /* renamed from: com.onedelhi.secure.mx$a */
    public class C6154a implements ne2.C6183a<T> {
        public C6154a() {
        }

        /* renamed from: b */
        public void mo40875a(T t, boolean z) {
            if (!z) {
                C6153mx mxVar = C6153mx.this;
                if (!mxVar.mo40874t(t, mxVar.f32306b)) {
                    return;
                }
            } else if (!C6153mx.this.mo40861g(t)) {
                return;
            }
            C6153mx.this.mo40868n();
        }
    }

    /* renamed from: com.onedelhi.secure.mx$b */
    public interface C6155b {
        /* renamed from: a */
        void mo11755a(@mr2 Set<Integer> set);
    }

    /* renamed from: e */
    public void mo40859e(T t) {
        this.f32303a.put(Integer.valueOf(t.getId()), t);
        if (t.isChecked()) {
            mo40861g(t);
        }
        t.setInternalOnCheckedChangeListener(new C6154a());
    }

    /* renamed from: f */
    public void mo40860f(@mo1 int i) {
        ne2 ne2 = (ne2) this.f32303a.get(Integer.valueOf(i));
        if (ne2 != null && mo40861g(ne2)) {
            mo40868n();
        }
    }

    /* renamed from: g */
    public final boolean mo40861g(@mr2 ne2<T> ne2) {
        int id = ne2.getId();
        if (this.f32304a.contains(Integer.valueOf(id))) {
            return false;
        }
        ne2 ne22 = (ne2) this.f32303a.get(Integer.valueOf(mo40865k()));
        if (ne22 != null) {
            mo40874t(ne22, false);
        }
        boolean add = this.f32304a.add(Integer.valueOf(id));
        if (!ne2.isChecked()) {
            ne2.setChecked(true);
        }
        return add;
    }

    /* renamed from: h */
    public void mo40862h() {
        boolean z = !this.f32304a.isEmpty();
        for (T t : this.f32303a.values()) {
            mo40874t(t, false);
        }
        if (z) {
            mo40868n();
        }
    }

    @mr2
    /* renamed from: i */
    public Set<Integer> mo40863i() {
        return new HashSet(this.f32304a);
    }

    @mr2
    /* renamed from: j */
    public List<Integer> mo40864j(@mr2 ViewGroup viewGroup) {
        Set<Integer> i = mo40863i();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof ne2) && i.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    @mo1
    /* renamed from: k */
    public int mo40865k() {
        if (!this.f32305a || this.f32304a.isEmpty()) {
            return -1;
        }
        return this.f32304a.iterator().next().intValue();
    }

    /* renamed from: l */
    public boolean mo40866l() {
        return this.f32306b;
    }

    /* renamed from: m */
    public boolean mo40867m() {
        return this.f32305a;
    }

    /* renamed from: n */
    public final void mo40868n() {
        C6155b bVar = this.f32302a;
        if (bVar != null) {
            bVar.mo11755a(mo40863i());
        }
    }

    /* renamed from: o */
    public void mo40869o(T t) {
        t.setInternalOnCheckedChangeListener((ne2.C6183a) null);
        this.f32303a.remove(Integer.valueOf(t.getId()));
        this.f32304a.remove(Integer.valueOf(t.getId()));
    }

    /* renamed from: p */
    public void mo40870p(@ts2 C6155b bVar) {
        this.f32302a = bVar;
    }

    /* renamed from: q */
    public void mo40871q(boolean z) {
        this.f32306b = z;
    }

    /* renamed from: r */
    public void mo40872r(boolean z) {
        if (this.f32305a != z) {
            this.f32305a = z;
            mo40862h();
        }
    }

    /* renamed from: s */
    public void mo40873s(@mo1 int i) {
        ne2 ne2 = (ne2) this.f32303a.get(Integer.valueOf(i));
        if (ne2 != null && mo40874t(ne2, this.f32306b)) {
            mo40868n();
        }
    }

    /* renamed from: t */
    public final boolean mo40874t(@mr2 ne2<T> ne2, boolean z) {
        int id = ne2.getId();
        if (!this.f32304a.contains(Integer.valueOf(id))) {
            return false;
        }
        if (!z || this.f32304a.size() != 1 || !this.f32304a.contains(Integer.valueOf(id))) {
            boolean remove = this.f32304a.remove(Integer.valueOf(id));
            if (ne2.isChecked()) {
                ne2.setChecked(false);
            }
            return remove;
        }
        ne2.setChecked(true);
        return false;
    }
}
