package com.onedelhi.secure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ih5 extends ef5 implements jg5 {

    /* renamed from: a */
    public w96 f13709a;

    /* renamed from: a */
    public final List f13710a;

    /* renamed from: b */
    public final List f13711b;

    public ih5(ih5 ih5) {
        super(ih5.f11215b);
        ArrayList arrayList = new ArrayList(ih5.f13710a.size());
        this.f13710a = arrayList;
        arrayList.addAll(ih5.f13710a);
        ArrayList arrayList2 = new ArrayList(ih5.f13711b.size());
        this.f13711b = arrayList2;
        arrayList2.addAll(ih5.f13711b);
        this.f13709a = ih5.f13709a;
    }

    public ih5(String str, List list, List list2, w96 w96) {
        super(str);
        this.f13710a = new ArrayList();
        this.f13709a = w96;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f13710a.add(((qh5) it.next()).mo13084b());
            }
        }
        this.f13711b = new ArrayList(list2);
    }

    /* renamed from: a */
    public final qh5 mo14991a(w96 w96, List list) {
        qh5 qh5;
        String str;
        w96 a = this.f13709a.mo26464a();
        for (int i = 0; i < this.f13710a.size(); i++) {
            if (i < list.size()) {
                str = (String) this.f13710a.get(i);
                qh5 = w96.mo26465b((qh5) list.get(i));
            } else {
                str = (String) this.f13710a.get(i);
                qh5 = qh5.f19182a;
            }
            a.mo26468e(str, qh5);
        }
        for (qh5 qh52 : this.f13711b) {
            qh5 b = a.mo26465b(qh52);
            if (b instanceof yh5) {
                b = a.mo26465b(qh52);
            }
            if (b instanceof ie5) {
                return ((ie5) b).mo17737a();
            }
        }
        return qh5.f19182a;
    }

    /* renamed from: k */
    public final qh5 mo13090k() {
        return new ih5(this);
    }
}
