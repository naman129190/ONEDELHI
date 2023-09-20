package com.onedelhi.secure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.onedelhi.secure.dj */
public final class C5031dj {

    /* renamed from: a */
    public final Map<Integer, Integer> f27472a = new HashMap();

    /* renamed from: a */
    public Integer mo34472a(int i) {
        return this.f27472a.get(Integer.valueOf(i));
    }

    /* renamed from: b */
    public int[] mo34473b() {
        ArrayList arrayList = new ArrayList();
        int i = -1;
        for (Map.Entry next : this.f27472a.entrySet()) {
            if (((Integer) next.getValue()).intValue() > i) {
                i = ((Integer) next.getValue()).intValue();
                arrayList.clear();
            } else if (((Integer) next.getValue()).intValue() != i) {
            }
            arrayList.add(next.getKey());
        }
        return kx2.m55126c(arrayList);
    }

    /* renamed from: c */
    public void mo34474c(int i) {
        Integer num = this.f27472a.get(Integer.valueOf(i));
        if (num == null) {
            num = 0;
        }
        this.f27472a.put(Integer.valueOf(i), Integer.valueOf(num.intValue() + 1));
    }
}
