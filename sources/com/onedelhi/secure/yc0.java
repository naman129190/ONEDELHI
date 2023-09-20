package com.onedelhi.secure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

public final class yc0 {

    /* renamed from: a */
    public static final int f22975a = 1073741824;

    /* renamed from: a */
    public static int m32174a(int i) {
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((((float) i) / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: b */
    public static boolean m32175b(List<?> list) {
        if (list.size() < 2) {
            return false;
        }
        return list.size() != new HashSet(list).size();
    }

    /* renamed from: c */
    public static <T> HashSet<T> m32176c(int i) {
        return new HashSet<>(m32174a(i));
    }

    /* renamed from: d */
    public static <K, V> LinkedHashMap<K, V> m32177d(int i) {
        return new LinkedHashMap<>(m32174a(i));
    }

    /* renamed from: e */
    public static <T> List<T> m32178e(int i) {
        return i == 0 ? Collections.emptyList() : new ArrayList(i);
    }
}
