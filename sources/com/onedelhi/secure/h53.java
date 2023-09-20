package com.onedelhi.secure;

import android.util.SparseArray;
import java.util.HashMap;

public final class h53 {

    /* renamed from: a */
    public static SparseArray<d53> f12914a = new SparseArray<>();

    /* renamed from: a */
    public static HashMap<d53, Integer> f12915a;

    static {
        HashMap<d53, Integer> hashMap = new HashMap<>();
        f12915a = hashMap;
        hashMap.put(d53.DEFAULT, 0);
        f12915a.put(d53.VERY_LOW, 1);
        f12915a.put(d53.HIGHEST, 2);
        for (d53 next : f12915a.keySet()) {
            f12914a.append(f12915a.get(next).intValue(), next);
        }
    }

    /* renamed from: a */
    public static int m16479a(@mr2 d53 d53) {
        Integer num = f12915a.get(d53);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + d53);
    }

    @mr2
    /* renamed from: b */
    public static d53 m16480b(int i) {
        d53 d53 = f12914a.get(i);
        if (d53 != null) {
            return d53;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i);
    }
}
