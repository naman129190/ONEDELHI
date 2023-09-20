package com.onedelhi.secure;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class a37 {

    /* renamed from: a */
    public final /* synthetic */ db5 f8689a;

    /* renamed from: a */
    public nb6 f8690a;

    /* renamed from: a */
    public String f8691a;

    /* renamed from: a */
    public BitSet f8692a;

    /* renamed from: a */
    public Map f8693a;

    /* renamed from: a */
    public boolean f8694a;

    /* renamed from: b */
    public BitSet f8695b;

    /* renamed from: b */
    public Map f8696b;

    public /* synthetic */ a37(db5 db5, String str, j27 j27) {
        this.f8689a = db5;
        this.f8691a = str;
        this.f8694a = true;
        this.f8692a = new BitSet();
        this.f8695b = new BitSet();
        this.f8693a = new C3042oa();
        this.f8696b = new C3042oa();
    }

    public /* synthetic */ a37(db5 db5, String str, nb6 nb6, BitSet bitSet, BitSet bitSet2, Map map, Map map2, j27 j27) {
        this.f8689a = db5;
        this.f8691a = str;
        this.f8692a = bitSet;
        this.f8695b = bitSet2;
        this.f8693a = map;
        this.f8696b = new C3042oa();
        for (Integer num : map2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) map2.get(num));
            this.f8696b.put(num, arrayList);
        }
        this.f8694a = false;
        this.f8690a = nb6;
    }

    @mr2
    /* renamed from: a */
    public final l86 mo12678a(int i) {
        ArrayList arrayList;
        List list;
        i86 C = l86.m20322C();
        C.mo17684q(i);
        C.mo17686s(this.f8694a);
        nb6 nb6 = this.f8690a;
        if (nb6 != null) {
            C.mo17687t(nb6);
        }
        kb6 F = nb6.m22628F();
        F.mo18998r(uq6.m29500H(this.f8692a));
        F.mo19000t(uq6.m29500H(this.f8695b));
        Map map = this.f8693a;
        if (map == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(map.size());
            for (Integer intValue : this.f8693a.keySet()) {
                int intValue2 = intValue.intValue();
                Long l = (Long) this.f8693a.get(Integer.valueOf(intValue2));
                if (l != null) {
                    o86 D = r86.m26500D();
                    D.mo21835r(intValue2);
                    D.mo21834q(l.longValue());
                    arrayList2.add((r86) D.mo17922m());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            F.mo18997q(arrayList);
        }
        Map map2 = this.f8696b;
        if (map2 == null) {
            list = Collections.emptyList();
        } else {
            ArrayList arrayList3 = new ArrayList(map2.size());
            for (Integer num : this.f8696b.keySet()) {
                qb6 E = tb6.m28314E();
                E.mo23074r(num.intValue());
                List list2 = (List) this.f8696b.get(num);
                if (list2 != null) {
                    Collections.sort(list2);
                    E.mo23073q(list2);
                }
                arrayList3.add((tb6) E.mo17922m());
            }
            list = arrayList3;
        }
        F.mo18999s(list);
        C.mo17685r(F);
        return (l86) C.mo17922m();
    }

    /* renamed from: c */
    public final void mo12679c(@mr2 n57 n57) {
        int a = n57.mo14029a();
        Boolean bool = n57.f17109a;
        if (bool != null) {
            BitSet bitSet = this.f8695b;
            bool.booleanValue();
            bitSet.set(a, true);
        }
        Boolean bool2 = n57.f17112b;
        if (bool2 != null) {
            this.f8692a.set(a, bool2.booleanValue());
        }
        if (n57.f17110a != null) {
            Map map = this.f8693a;
            Integer valueOf = Integer.valueOf(a);
            Long l = (Long) map.get(valueOf);
            long longValue = n57.f17110a.longValue() / 1000;
            if (l == null || longValue > l.longValue()) {
                this.f8693a.put(valueOf, Long.valueOf(longValue));
            }
        }
        if (n57.f17113b != null) {
            Map map2 = this.f8696b;
            Integer valueOf2 = Integer.valueOf(a);
            List list = (List) map2.get(valueOf2);
            if (list == null) {
                list = new ArrayList();
                this.f8696b.put(valueOf2, list);
            }
            if (n57.mo14031c()) {
                list.clear();
            }
            rw6.m27098c();
            ce5 z = this.f8689a.f11205a.mo27891z();
            String str = this.f8691a;
            k36 k36 = n36.f17041Y;
            if (z.mo14110B(str, k36) && n57.mo14030b()) {
                list.clear();
            }
            rw6.m27098c();
            boolean B = this.f8689a.f11205a.mo27891z().mo14110B(this.f8691a, k36);
            Long valueOf3 = Long.valueOf(n57.f17113b.longValue() / 1000);
            if (!B) {
                list.add(valueOf3);
            } else if (!list.contains(valueOf3)) {
                list.add(valueOf3);
            }
        }
    }
}
