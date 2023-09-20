package com.onedelhi.secure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class sd6 {
    /* renamed from: a */
    public static double m27473a(double d) {
        int i;
        if (Double.isNaN(d)) {
            return 0.0d;
        }
        if (Double.isInfinite(d) || d == 0.0d || i == 0) {
            return d;
        }
        return ((double) (i > 0 ? 1 : -1)) * Math.floor(Math.abs(d));
    }

    /* renamed from: b */
    public static int m27474b(double d) {
        int i;
        if (Double.isNaN(d) || Double.isInfinite(d) || d == 0.0d) {
            return 0;
        }
        return (int) ((long) ((((double) (i > 0 ? 1 : -1)) * Math.floor(Math.abs(d))) % 4.294967296E9d));
    }

    /* renamed from: c */
    public static int m27475c(w96 w96) {
        int b = m27474b(w96.mo26467d("runtime.counter").mo13085e().doubleValue() + 1.0d);
        if (b <= 1000000) {
            w96.mo26470g("runtime.counter", new te5(Double.valueOf((double) b)));
            return b;
        }
        throw new IllegalStateException("Instructions allowed exceeded");
    }

    /* renamed from: d */
    public static long m27476d(double d) {
        return ((long) m27474b(d)) & ZipConstants.ZIP64_MAGIC;
    }

    /* renamed from: e */
    public static to5 m27477e(String str) {
        to5 to5 = null;
        if (str != null && !str.isEmpty()) {
            to5 = to5.m28834a(Integer.parseInt(str));
        }
        if (to5 != null) {
            return to5;
        }
        throw new IllegalArgumentException(String.format("Unsupported commandId %s", new Object[]{str}));
    }

    /* renamed from: f */
    public static Object m27478f(qh5 qh5) {
        if (qh5.f19183b.equals(qh5)) {
            return null;
        }
        if (qh5.f19182a.equals(qh5)) {
            return "";
        }
        if (qh5 instanceof sg5) {
            return m27479g((sg5) qh5);
        }
        if (!(qh5 instanceof ld5)) {
            return !qh5.mo13085e().isNaN() ? qh5.mo13085e() : qh5.mo13084b();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ld5) qh5).iterator();
        while (it.hasNext()) {
            Object f = m27478f((qh5) it.next());
            if (f != null) {
                arrayList.add(f);
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public static Map m27479g(sg5 sg5) {
        HashMap hashMap = new HashMap();
        for (String str : sg5.mo24374a()) {
            Object f = m27478f(sg5.mo15167i(str));
            if (f != null) {
                hashMap.put(str, f);
            }
        }
        return hashMap;
    }

    /* renamed from: h */
    public static void m27480h(String str, int i, List list) {
        if (list.size() != i) {
            throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", new Object[]{str, Integer.valueOf(i), Integer.valueOf(list.size())}));
        }
    }

    /* renamed from: i */
    public static void m27481i(String str, int i, List list) {
        if (list.size() < i) {
            throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", new Object[]{str, Integer.valueOf(i), Integer.valueOf(list.size())}));
        }
    }

    /* renamed from: j */
    public static void m27482j(String str, int i, List list) {
        if (list.size() > i) {
            throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", new Object[]{str, Integer.valueOf(i), Integer.valueOf(list.size())}));
        }
    }

    /* renamed from: k */
    public static boolean m27483k(qh5 qh5) {
        if (qh5 == null) {
            return false;
        }
        Double e = qh5.mo13085e();
        return !e.isNaN() && e.doubleValue() >= 0.0d && e.equals(Double.valueOf(Math.floor(e.doubleValue())));
    }

    /* renamed from: l */
    public static boolean m27484l(qh5 qh5, qh5 qh52) {
        if (!qh5.getClass().equals(qh52.getClass())) {
            return false;
        }
        if ((qh5 instanceof ej5) || (qh5 instanceof ah5)) {
            return true;
        }
        if (!(qh5 instanceof te5)) {
            return qh5 instanceof wi5 ? qh5.mo13084b().equals(qh52.mo13084b()) : qh5 instanceof xd5 ? qh5.mo13087f().equals(qh52.mo13087f()) : qh5 == qh52;
        }
        if (Double.isNaN(qh5.mo13085e().doubleValue()) || Double.isNaN(qh52.mo13085e().doubleValue())) {
            return false;
        }
        return qh5.mo13085e().equals(qh52.mo13085e());
    }
}
