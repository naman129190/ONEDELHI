package com.onedelhi.secure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.Set;

public class of1 implements Observer {

    /* renamed from: a */
    public static final int f33008a = 0;

    /* renamed from: a */
    public static final Object f33009a = null;

    /* renamed from: b */
    public static final int f33010b = 1;

    /* renamed from: a */
    public final ff1 f33011a = new ff1();

    /* renamed from: a */
    public final lf1 f33012a = new lf1();

    /* renamed from: a */
    public final nf1 f33013a = new nf1();

    /* renamed from: a */
    public final C6281ok<af1> f33014a;

    /* renamed from: a */
    public th1 f33015a;

    /* renamed from: a */
    public boolean f33016a = false;

    public of1(th1 th1, HashMap<af1, Object> hashMap) {
        C6281ok<af1> okVar = new C6281ok<>();
        this.f33014a = okVar;
        this.f33015a = th1;
        okVar.putAll(hashMap);
        for (af1 w : mo41750o()) {
            mo41758w(w);
        }
    }

    /* renamed from: u */
    public static void m59374u(Object obj) {
        if (obj instanceof od2) {
            ((od2) obj).mo21885n();
        } else if (obj instanceof f33) {
            ((f33) obj).mo15759o();
        } else if (obj instanceof d33) {
            ((d33) obj).mo14476n();
        } else if (obj instanceof ArrayList) {
            Iterator it = ((ArrayList) obj).iterator();
            while (it.hasNext()) {
                m59374u(it.next());
            }
        }
    }

    /* renamed from: a */
    public void mo41736a(af1 af1) {
        Object obj = f33009a;
        mo41758w(af1);
        if (this.f33016a) {
            af1.addObserver(this);
            if (this.f33014a.containsKey(af1)) {
                m59374u(this.f33014a.get(af1));
            }
            if (af1.mo30906j()) {
                obj = mo41737b(af1, af1.mo30899c());
            }
        }
        this.f33014a.put(af1, obj);
    }

    /* renamed from: b */
    public final Object mo41737b(af1 af1, bf1 bf1) {
        String h = bf1.mo31558h();
        if (h.equals("Point")) {
            return mo41744i(af1.mo30902f(), (kf1) bf1);
        }
        if (h.equals("LineString")) {
            return mo41740e(af1.mo30901e(), (ef1) bf1);
        }
        if (h.equals("Polygon")) {
            return mo41745j(af1.mo30903g(), (mf1) bf1);
        }
        if (h.equals("MultiPoint")) {
            return mo41742g(af1.mo30902f(), (hf1) bf1);
        }
        if (h.equals("MultiLineString")) {
            return mo41741f(af1.mo30901e(), (gf1) bf1);
        }
        if (h.equals("MultiPolygon")) {
            return mo41743h(af1.mo30903g(), (if1) bf1);
        }
        if (h.equals("GeometryCollection")) {
            return mo41738c(af1, ((cf1) bf1).mo32334a());
        }
        return null;
    }

    /* renamed from: c */
    public final ArrayList<Object> mo41738c(af1 af1, List<bf1> list) {
        ArrayList<Object> arrayList = new ArrayList<>();
        for (bf1 b : list) {
            arrayList.add(mo41737b(af1, b));
        }
        return arrayList;
    }

    /* renamed from: d */
    public void mo41739d() {
        if (!this.f33016a) {
            this.f33016a = true;
            for (af1 a : mo41750o()) {
                mo41736a(a);
            }
        }
    }

    /* renamed from: e */
    public final f33 mo41740e(ff1 ff1, ef1 ef1) {
        g33 n = ff1.mo35894n();
        n.mo16290M2(ef1.mo35211a());
        f33 e = this.f33015a.mo24966e(n);
        e.mo15760p(true);
        return e;
    }

    /* renamed from: f */
    public final ArrayList<f33> mo41741f(ff1 ff1, gf1 gf1) {
        ArrayList<f33> arrayList = new ArrayList<>();
        for (ef1 e : gf1.mo36697a()) {
            arrayList.add(mo41740e(ff1, e));
        }
        return arrayList;
    }

    /* renamed from: g */
    public final ArrayList<od2> mo41742g(lf1 lf1, hf1 hf1) {
        ArrayList<od2> arrayList = new ArrayList<>();
        for (kf1 i : hf1.mo37284a()) {
            arrayList.add(mo41744i(lf1, i));
        }
        return arrayList;
    }

    /* renamed from: h */
    public final ArrayList<d33> mo41743h(nf1 nf1, if1 if1) {
        ArrayList<d33> arrayList = new ArrayList<>();
        for (mf1 j : if1.mo38056a()) {
            arrayList.add(mo41745j(nf1, j));
        }
        return arrayList;
    }

    /* renamed from: i */
    public final od2 mo41744i(lf1 lf1, kf1 kf1) {
        sd2 x = lf1.mo39832x();
        x.mo24329e3(kf1.mo39230a());
        return this.f33015a.mo24962c(x);
    }

    /* renamed from: j */
    public final d33 mo41745j(nf1 nf1, mf1 mf1) {
        e33 n = nf1.mo41034n();
        n.mo15007M2((Iterable) mf1.mo40569a().get(0));
        for (int i = 1; i < mf1.mo40569a().size(); i++) {
            n.mo15008N2((Iterable) mf1.mo40569a().get(i));
        }
        d33 d = this.f33015a.mo24964d(n);
        d.mo14477o(true);
        return d;
    }

    /* renamed from: k */
    public ff1 mo41746k() {
        return this.f33011a;
    }

    /* renamed from: l */
    public lf1 mo41747l() {
        return this.f33012a;
    }

    /* renamed from: m */
    public nf1 mo41748m() {
        return this.f33013a;
    }

    /* renamed from: n */
    public af1 mo41749n(Object obj) {
        return this.f33014a.mo41802d(obj);
    }

    /* renamed from: o */
    public Set<af1> mo41750o() {
        return this.f33014a.keySet();
    }

    /* renamed from: p */
    public th1 mo41751p() {
        return this.f33015a;
    }

    /* renamed from: q */
    public boolean mo41752q() {
        return this.f33016a;
    }

    /* renamed from: r */
    public final void mo41753r(af1 af1) {
        mo41754s(af1, this.f33015a);
    }

    /* renamed from: s */
    public final void mo41754s(af1 af1, th1 th1) {
        m59374u(this.f33014a.get(af1));
        this.f33014a.put(af1, f33009a);
        this.f33015a = th1;
        if (th1 != null && af1.mo30906j()) {
            this.f33014a.put(af1, mo41737b(af1, af1.mo30899c()));
        }
    }

    /* renamed from: t */
    public void mo41755t(af1 af1) {
        if (this.f33014a.containsKey(af1)) {
            m59374u(this.f33014a.remove(af1));
            af1.deleteObserver(this);
        }
    }

    public void update(Observable observable, Object obj) {
        if (observable instanceof af1) {
            af1 af1 = (af1) observable;
            Object obj2 = this.f33014a.get(af1);
            Object obj3 = f33009a;
            boolean z = obj2 != obj3;
            if (z && af1.mo30906j()) {
                mo41753r(af1);
            } else if (z && !af1.mo30906j()) {
                m59374u(this.f33014a.get(af1));
                this.f33014a.put(af1, obj3);
            } else if (!z && af1.mo30906j()) {
                mo41736a(af1);
            }
        }
    }

    /* renamed from: v */
    public void mo41757v() {
        if (this.f33016a) {
            for (af1 next : this.f33014a.keySet()) {
                m59374u(this.f33014a.get(next));
                next.deleteObserver(this);
            }
            this.f33016a = false;
        }
    }

    /* renamed from: w */
    public final void mo41758w(af1 af1) {
        if (af1.mo30902f() == null) {
            af1.mo30911o(this.f33012a);
        }
        if (af1.mo30901e() == null) {
            af1.mo30910n(this.f33011a);
        }
        if (af1.mo30903g() == null) {
            af1.mo30912p(this.f33013a);
        }
    }

    /* renamed from: x */
    public void mo41759x(th1 th1) {
        for (af1 s : mo41750o()) {
            mo41754s(s, th1);
        }
    }
}
