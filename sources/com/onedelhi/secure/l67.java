package com.onedelhi.secure;

import java.util.Collections;
import java.util.TreeMap;

public final class l67 {

    /* renamed from: a */
    public final TreeMap f15174a = new TreeMap();

    /* renamed from: b */
    public final TreeMap f15175b = new TreeMap();

    /* renamed from: c */
    public static final int m20239c(w96 w96, ih5 ih5, qh5 qh5) {
        qh5 a = ih5.mo14991a(w96, Collections.singletonList(qh5));
        if (a instanceof te5) {
            return sd6.m27474b(a.mo13085e().doubleValue());
        }
        return -1;
    }

    /* renamed from: a */
    public final void mo19289a(String str, int i, ih5 ih5, String str2) {
        TreeMap treeMap;
        if ("create".equals(str2)) {
            treeMap = this.f15175b;
        } else if ("edit".equals(str2)) {
            treeMap = this.f15174a;
        } else {
            throw new IllegalStateException("Unknown callback type: ".concat(String.valueOf(str2)));
        }
        if (treeMap.containsKey(Integer.valueOf(i))) {
            i = ((Integer) treeMap.lastKey()).intValue() + 1;
        }
        treeMap.put(Integer.valueOf(i), ih5);
    }

    /* renamed from: b */
    public final void mo19290b(w96 w96, zb5 zb5) {
        pp6 pp6 = new pp6(zb5);
        for (Integer num : this.f15174a.keySet()) {
            mb5 b = zb5.mo27901b().clone();
            int c = m20239c(w96, (ih5) this.f15174a.get(num), pp6);
            if (c == 2 || c == -1) {
                zb5.mo27906f(b);
            }
        }
        for (Integer num2 : this.f15175b.keySet()) {
            m20239c(w96, (ih5) this.f15175b.get(num2), pp6);
        }
    }
}
