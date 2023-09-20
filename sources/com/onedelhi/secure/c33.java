package com.onedelhi.secure;

import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class c33 {

    /* renamed from: a */
    public static final double f26620a = 0.1d;

    /* renamed from: a */
    public static boolean m40676a(LatLng latLng, List<LatLng> list, boolean z) {
        LatLng latLng2 = latLng;
        int size = list.size();
        if (size == 0) {
            return false;
        }
        double radians = Math.toRadians(latLng2.f7562a);
        double radians2 = Math.toRadians(latLng2.f7563b);
        LatLng latLng3 = list.get(size - 1);
        double radians3 = Math.toRadians(latLng3.f7562a);
        double radians4 = Math.toRadians(latLng3.f7563b);
        double d = radians3;
        int i = 0;
        for (LatLng next : list) {
            double k = nf2.m58060k(radians2 - radians4, -3.141592653589793d, 3.141592653589793d);
            if (radians == d && k == 0.0d) {
                return true;
            }
            double radians5 = Math.toRadians(next.f7562a);
            double radians6 = Math.toRadians(next.f7563b);
            if (m40681f(d, radians5, nf2.m58060k(radians6 - radians4, -3.141592653589793d, 3.141592653589793d), radians, k, z)) {
                i++;
            }
            d = radians5;
            radians4 = radians6;
        }
        return (i & 1) != 0;
    }

    /* renamed from: b */
    public static List<LatLng> m40677b(String str) {
        int i;
        int i2;
        int length = str.length();
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 < length) {
            int i6 = 1;
            int i7 = 0;
            while (true) {
                i = i3 + 1;
                int charAt = (str.charAt(i3) - '?') - 1;
                i6 += charAt << i7;
                i7 += 5;
                if (charAt < 31) {
                    break;
                }
                i3 = i;
            }
            int i8 = ((i6 & 1) != 0 ? ~(i6 >> 1) : i6 >> 1) + i4;
            int i9 = 1;
            int i10 = 0;
            while (true) {
                i2 = i + 1;
                int charAt2 = (str.charAt(i) - '?') - 1;
                i9 += charAt2 << i10;
                i10 += 5;
                if (charAt2 < 31) {
                    break;
                }
                i = i2;
            }
            int i11 = i9 & 1;
            int i12 = i9 >> 1;
            if (i11 != 0) {
                i12 = ~i12;
            }
            i5 += i12;
            arrayList.add(new LatLng(((double) i8) * 1.0E-5d, ((double) i5) * 1.0E-5d));
            i4 = i8;
            i3 = i2;
        }
        return arrayList;
    }

    /* renamed from: c */
    public static double m40678c(LatLng latLng, LatLng latLng2, LatLng latLng3) {
        if (latLng2.equals(latLng3)) {
            r14.m63341c(latLng3, latLng);
        }
        double radians = Math.toRadians(latLng.f7562a);
        double radians2 = Math.toRadians(latLng.f7563b);
        double radians3 = Math.toRadians(latLng2.f7562a);
        double radians4 = Math.toRadians(latLng2.f7563b);
        double radians5 = Math.toRadians(latLng3.f7562a) - radians3;
        double radians6 = Math.toRadians(latLng3.f7563b) - radians4;
        double d = (((radians - radians3) * radians5) + ((radians2 - radians4) * radians6)) / ((radians5 * radians5) + (radians6 * radians6));
        return d <= 0.0d ? r14.m63341c(latLng, latLng2) : d >= 1.0d ? r14.m63341c(latLng, latLng3) : r14.m63341c(new LatLng(latLng.f7562a - latLng2.f7562a, latLng.f7563b - latLng2.f7563b), new LatLng((latLng3.f7562a - latLng2.f7562a) * d, d * (latLng3.f7563b - latLng2.f7563b)));
    }

    /* renamed from: d */
    public static String m40679d(List<LatLng> list) {
        StringBuffer stringBuffer = new StringBuffer();
        long j = 0;
        long j2 = 0;
        for (LatLng next : list) {
            long round = Math.round(next.f7562a * 100000.0d);
            long round2 = Math.round(next.f7563b * 100000.0d);
            m40680e(round - j, stringBuffer);
            m40680e(round2 - j2, stringBuffer);
            j = round;
            j2 = round2;
        }
        return stringBuffer.toString();
    }

    /* renamed from: e */
    public static void m40680e(long j, StringBuffer stringBuffer) {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        long j2 = j << 1;
        if (i < 0) {
            j2 = ~j2;
        }
        while (j2 >= 32) {
            stringBuffer.append(Character.toChars((int) ((32 | (31 & j2)) + 63)));
            j2 >>= 5;
        }
        stringBuffer.append(Character.toChars((int) (j2 + 63)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x008e A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m40681f(double r12, double r14, double r16, double r18, double r20, boolean r22) {
        /*
            r0 = 0
            r8 = 0
            int r2 = (r20 > r0 ? 1 : (r20 == r0 ? 0 : -1))
            if (r2 < 0) goto L_0x000b
            int r2 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r2 >= 0) goto L_0x0013
        L_0x000b:
            int r2 = (r20 > r0 ? 1 : (r20 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x0014
            int r2 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r2 >= 0) goto L_0x0014
        L_0x0013:
            return r8
        L_0x0014:
            r2 = -4613618979930100456(0xbff921fb54442d18, double:-1.5707963267948966)
            int r4 = (r18 > r2 ? 1 : (r18 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x001e
            return r8
        L_0x001e:
            int r4 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x008f
            int r4 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x008f
            r2 = 4609753056924675352(0x3ff921fb54442d18, double:1.5707963267948966)
            int r4 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x008f
            int r4 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r4 < 0) goto L_0x0034
            goto L_0x008f
        L_0x0034:
            r4 = -4609115380302729960(0xc00921fb54442d18, double:-3.141592653589793)
            int r6 = (r16 > r4 ? 1 : (r16 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x003e
            return r8
        L_0x003e:
            double r4 = r16 - r20
            double r4 = r4 * r12
            double r6 = r14 * r20
            double r4 = r4 + r6
            double r4 = r4 / r16
            int r6 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r6 < 0) goto L_0x0054
            int r6 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r6 < 0) goto L_0x0054
            int r6 = (r18 > r4 ? 1 : (r18 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x0054
            return r8
        L_0x0054:
            r9 = 1
            int r6 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r6 > 0) goto L_0x0062
            int r6 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r6 > 0) goto L_0x0062
            int r0 = (r18 > r4 ? 1 : (r18 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x0062
            return r9
        L_0x0062:
            int r0 = (r18 > r2 ? 1 : (r18 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x0067
            return r9
        L_0x0067:
            if (r22 == 0) goto L_0x007c
            double r10 = java.lang.Math.tan(r18)
            r0 = r12
            r2 = r14
            r4 = r16
            r6 = r20
            double r0 = m40692q(r0, r2, r4, r6)
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto L_0x008f
            goto L_0x008e
        L_0x007c:
            double r10 = com.onedelhi.secure.nf2.m58056g(r18)
            r0 = r12
            r2 = r14
            r4 = r16
            r6 = r20
            double r0 = m40689n(r0, r2, r4, r6)
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto L_0x008f
        L_0x008e:
            r8 = 1
        L_0x008f:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.c33.m40681f(double, double, double, double, double, boolean):boolean");
    }

    /* renamed from: g */
    public static boolean m40682g(List<LatLng> list) {
        return list.get(0).equals(list.get(list.size() - 1));
    }

    /* renamed from: h */
    public static boolean m40683h(LatLng latLng, List<LatLng> list, boolean z) {
        return m40684i(latLng, list, z, 0.1d);
    }

    /* renamed from: i */
    public static boolean m40684i(LatLng latLng, List<LatLng> list, boolean z, double d) {
        return m40685j(latLng, list, true, z, d);
    }

    /* renamed from: j */
    public static boolean m40685j(LatLng latLng, List<LatLng> list, boolean z, boolean z2, double d) {
        List<LatLng> list2;
        int i;
        LatLng latLng2 = latLng;
        int size = list.size();
        if (size == 0) {
            return false;
        }
        double d2 = d / 6371009.0d;
        double c = nf2.m58052c(d2);
        double radians = Math.toRadians(latLng2.f7562a);
        double radians2 = Math.toRadians(latLng2.f7563b);
        if (z) {
            i = size - 1;
            list2 = list;
        } else {
            list2 = list;
            i = 0;
        }
        LatLng latLng3 = list2.get(i);
        double radians3 = Math.toRadians(latLng3.f7562a);
        double radians4 = Math.toRadians(latLng3.f7563b);
        if (z2) {
            double d3 = radians3;
            double d4 = radians4;
            for (LatLng next : list) {
                double radians5 = Math.toRadians(next.f7562a);
                double radians6 = Math.toRadians(next.f7563b);
                if (m40688m(d3, d4, radians5, radians6, radians, radians2, c)) {
                    return true;
                }
                d4 = radians6;
                d3 = radians5;
            }
            return false;
        }
        double d5 = radians - d2;
        double d6 = radians + d2;
        double g = nf2.m58056g(radians3);
        double g2 = nf2.m58056g(radians);
        double[] dArr = new double[3];
        Iterator<LatLng> it = list.iterator();
        while (it.hasNext()) {
            LatLng next2 = it.next();
            double d7 = d6;
            double radians7 = Math.toRadians(next2.f7562a);
            double g3 = nf2.m58056g(radians7);
            Iterator<LatLng> it2 = it;
            double radians8 = Math.toRadians(next2.f7563b);
            if (Math.max(radians3, radians7) >= d5 && Math.min(radians3, radians7) <= d7) {
                double k = nf2.m58060k(radians8 - radians4, -3.141592653589793d, 3.141592653589793d);
                double k2 = nf2.m58060k(radians2 - radians4, -3.141592653589793d, 3.141592653589793d);
                dArr[0] = k2;
                dArr[1] = k2 + 6.283185307179586d;
                dArr[2] = k2 - 6.283185307179586d;
                for (int i2 = 0; i2 < 3; i2++) {
                    double d8 = dArr[i2];
                    double d9 = g3 - g;
                    double d10 = (k * k) + (d9 * d9);
                    double d11 = 0.0d;
                    if (d10 > 0.0d) {
                        d11 = nf2.m58051b(((d8 * k) + ((g2 - g) * d9)) / d10, 0.0d, 1.0d);
                    }
                    if (nf2.m58053d(radians, nf2.m58055f(g + (d11 * d9)), d8 - (d11 * k)) < c) {
                        return true;
                    }
                }
                continue;
            }
            radians3 = radians7;
            radians4 = radians8;
            d6 = d7;
            g = g3;
            it = it2;
        }
        return false;
    }

    /* renamed from: k */
    public static boolean m40686k(LatLng latLng, List<LatLng> list, boolean z) {
        return m40687l(latLng, list, z, 0.1d);
    }

    /* renamed from: l */
    public static boolean m40687l(LatLng latLng, List<LatLng> list, boolean z, double d) {
        return m40685j(latLng, list, false, z, d);
    }

    /* renamed from: m */
    public static boolean m40688m(double d, double d2, double d3, double d4, double d5, double d6, double d7) {
        double d8 = nf2.m58053d(d, d5, d2 - d6);
        if (d8 <= d7) {
            return true;
        }
        double d9 = nf2.m58053d(d3, d5, d4 - d6);
        if (d9 <= d7) {
            return true;
        }
        double e = nf2.m58054e(nf2.m58058i(d8) * m40691p(d, d2, d3, d4, d5, d6));
        if (e > d7) {
            return false;
        }
        double d10 = nf2.m58053d(d, d3, d2 - d4);
        double d11 = ((1.0d - (d10 * 2.0d)) * e) + d10;
        if (d8 > d11 || d9 > d11) {
            return false;
        }
        if (d10 < 0.74d) {
            return true;
        }
        double d12 = 1.0d - (2.0d * e);
        return nf2.m58059j((d8 - e) / d12, (d9 - e) / d12) > 0.0d;
    }

    /* renamed from: n */
    public static double m40689n(double d, double d2, double d3, double d4) {
        return ((nf2.m58056g(d) * (d3 - d4)) + (nf2.m58056g(d2) * d4)) / d3;
    }

    /* renamed from: o */
    public static List<LatLng> m40690o(List<LatLng> list, double d) {
        List<LatLng> list2 = list;
        int size = list.size();
        if (size >= 1) {
            double d2 = 0.0d;
            if (d > 0.0d) {
                boolean g = m40682g(list);
                LatLng latLng = null;
                if (g) {
                    latLng = list2.get(list.size() - 1);
                    list2.remove(list.size() - 1);
                    list2.add(new LatLng(latLng.f7562a + 1.0E-11d, latLng.f7563b + 1.0E-11d));
                }
                Stack stack = new Stack();
                double[] dArr = new double[size];
                int i = 0;
                dArr[0] = 1.0d;
                int i2 = size - 1;
                dArr[i2] = 1.0d;
                if (size > 2) {
                    stack.push(new int[]{0, i2});
                    int i3 = 0;
                    while (stack.size() > 0) {
                        int[] iArr = (int[]) stack.pop();
                        double d3 = d2;
                        for (int i4 = iArr[0] + 1; i4 < iArr[1]; i4++) {
                            double c = m40678c(list2.get(i4), list2.get(iArr[0]), list2.get(iArr[1]));
                            if (c > d3) {
                                d3 = c;
                                i3 = i4;
                            }
                        }
                        if (d3 > d) {
                            dArr[i3] = d3;
                            stack.push(new int[]{iArr[0], i3});
                            stack.push(new int[]{i3, iArr[1]});
                        }
                        d2 = 0.0d;
                    }
                }
                if (g) {
                    list2.remove(list.size() - 1);
                    list2.add(latLng);
                }
                ArrayList arrayList = new ArrayList();
                for (LatLng next : list) {
                    if (dArr[i] != 0.0d) {
                        arrayList.add(next);
                    }
                    i++;
                }
                return arrayList;
            }
            throw new IllegalArgumentException("Tolerance must be greater than zero");
        }
        throw new IllegalArgumentException("Polyline must have at least 1 point");
    }

    /* renamed from: p */
    public static double m40691p(double d, double d2, double d3, double d4, double d5, double d6) {
        double sin = Math.sin(d);
        double cos = Math.cos(d3);
        double cos2 = Math.cos(d5);
        double d7 = d6 - d2;
        double d8 = d4 - d2;
        double sin2 = Math.sin(d7) * cos2;
        double sin3 = Math.sin(d8) * cos;
        double d9 = sin * 2.0d;
        double sin4 = Math.sin(d5 - d) + (cos2 * d9 * nf2.m58052c(d7));
        double sin5 = Math.sin(d3 - d) + (d9 * cos * nf2.m58052c(d8));
        double d10 = ((sin2 * sin2) + (sin4 * sin4)) * ((sin3 * sin3) + (sin5 * sin5));
        if (d10 <= 0.0d) {
            return 1.0d;
        }
        return ((sin2 * sin5) - (sin4 * sin3)) / Math.sqrt(d10);
    }

    /* renamed from: q */
    public static double m40692q(double d, double d2, double d3, double d4) {
        return ((Math.tan(d) * Math.sin(d3 - d4)) + (Math.tan(d2) * Math.sin(d4))) / Math.sin(d3);
    }
}
