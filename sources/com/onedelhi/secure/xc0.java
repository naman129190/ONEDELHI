package com.onedelhi.secure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

public final class xc0 {

    /* renamed from: a */
    public static final int f37378a = 1073741824;

    /* renamed from: a */
    public static int m70129a(int i) {
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((((float) i) / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: b */
    public static boolean m70130b(List<?> list) {
        if (list.size() < 2) {
            return false;
        }
        return list.size() != new HashSet(list).size();
    }

    /* renamed from: c */
    public static <T> HashSet<T> m70131c(int i) {
        return new HashSet<>(m70129a(i));
    }

    /* renamed from: d */
    public static <K, V> LinkedHashMap<K, V> m70132d(int i) {
        return new LinkedHashMap<>(m70129a(i));
    }

    /* renamed from: e */
    public static <T> List<T> m70133e(int i) {
        return i == 0 ? Collections.emptyList() : new ArrayList(i);
    }
}
