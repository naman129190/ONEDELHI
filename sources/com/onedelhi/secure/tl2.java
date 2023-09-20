package com.onedelhi.secure;

import java.util.ArrayList;
import java.util.Map;

public final class tl2 extends mk0 {

    /* renamed from: a */
    public static final nk0[] f35722a = new nk0[0];

    public tl2(C6190nl nlVar) {
        super(nlVar);
    }

    /* renamed from: n */
    public nk0[] mo45175n(Map<pf0, ?> map) throws tr2 {
        o31[] u = new ul2(mo40688h(), map == null ? null : (tl3) map.get(pf0.NEED_RESULT_POINT_CALLBACK)).mo45645u(map);
        if (u.length != 0) {
            ArrayList arrayList = new ArrayList();
            for (o31 j : u) {
                try {
                    arrayList.add(mo40690j(j));
                } catch (wf3 unused) {
                }
            }
            return arrayList.isEmpty() ? f35722a : (nk0[]) arrayList.toArray(f35722a);
        }
        throw tr2.m66179a();
    }
}
