package com.onedelhi.secure;

import com.onedelhi.secure.f21;
import com.onedelhi.secure.vs1;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

public final class gs3 {

    /* renamed from: a */
    public static final int f29301a = 40;

    /* renamed from: a */
    public static final ao4<?, ?> f29302a = m49726F(false);

    /* renamed from: a */
    public static final Class<?> f29303a = m49722D();

    /* renamed from: b */
    public static final ao4<?, ?> f29304b = m49726F(true);

    /* renamed from: c */
    public static final ao4<?, ?> f29305c = new co4();

    /* renamed from: A */
    public static int m49716A(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof v92) {
            v92 v92 = (v92) list;
            i = 0;
            while (i2 < size) {
                i += i00.m51418b1(v92.getLong(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + i00.m51418b1(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: A0 */
    public static void m49717A0(int i, String str, ty4 ty4) throws IOException {
        if (str != null && !str.isEmpty()) {
            ty4.mo38355p(i, str);
        }
    }

    /* renamed from: B */
    public static <UT, UB> UB m49718B(int i, List<Integer> list, vs1.C7082d<?> dVar, UB ub, ao4<UT, UB> ao4) {
        if (dVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (dVar.mo32393a(intValue) != null) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = m49738Q(i, intValue, ub, ao4);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (dVar.mo32393a(intValue2) == null) {
                    ub = m49738Q(i, intValue2, ub, ao4);
                    it.remove();
                }
            }
        }
        return ub;
    }

    /* renamed from: B0 */
    public static void m49719B0(int i, List<String> list, ty4 ty4) throws IOException {
        if (list != null && !list.isEmpty()) {
            ty4.mo38349j(i, list);
        }
    }

    /* renamed from: C */
    public static <UT, UB> UB m49720C(int i, List<Integer> list, vs1.C7083e eVar, UB ub, ao4<UT, UB> ao4) {
        if (eVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (eVar.mo32395a(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = m49738Q(i, intValue, ub, ao4);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!eVar.mo32395a(intValue2)) {
                    ub = m49738Q(i, intValue2, ub, ao4);
                    it.remove();
                }
            }
        }
        return ub;
    }

    /* renamed from: C0 */
    public static void m49721C0(int i, int i2, ty4 ty4) throws IOException {
        if (i2 != 0) {
            ty4.mo38354o(i, i2);
        }
    }

    /* renamed from: D */
    public static Class<?> m49722D() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: D0 */
    public static void m49723D0(int i, List<Integer> list, ty4 ty4, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ty4.mo38316C(i, list, z);
        }
    }

    /* renamed from: E */
    public static Object m49724E(Class<?> cls, String str) {
        try {
            Field[] declaredFields = Class.forName(cls.getName() + "$" + m49739R(str, true) + "DefaultEntryHolder").getDeclaredFields();
            if (declaredFields.length == 1) {
                return ko4.m54681S(declaredFields[0]);
            }
            throw new IllegalStateException("Unable to look up map field default entry holder class for " + str + " in " + cls.getName());
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    /* renamed from: E0 */
    public static void m49725E0(int i, long j, ty4 ty4) throws IOException {
        if (j != 0) {
            ty4.mo38314A(i, j);
        }
    }

    /* renamed from: F */
    public static ao4<?, ?> m49726F(boolean z) {
        try {
            Class<?> G = m49728G();
            if (G == null) {
                return null;
            }
            return (ao4) G.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: F0 */
    public static void m49727F0(int i, List<Long> list, ty4 ty4, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ty4.mo38360u(i, list, z);
        }
    }

    /* renamed from: G */
    public static Class<?> m49728G() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: H */
    public static <T, FT extends f21.C5210c<FT>> void m49729H(az0<FT> az0, T t, T t2) {
        f21<FT> c = az0.mo31262c(t2);
        if (!c.mo35717C()) {
            az0.mo31263d(t).mo35722J(c);
        }
    }

    /* renamed from: I */
    public static <T> void m49730I(sc2 sc2, T t, T t2, long j) {
        ko4.m54728t0(t, j, sc2.mo44276c(ko4.m54679Q(t, j), ko4.m54679Q(t2, j)));
    }

    /* renamed from: J */
    public static <T, UT, UB> void m49731J(ao4<UT, UB> ao4, T t, T t2) {
        ao4.mo31104p(t, ao4.mo31099k(ao4.mo31095g(t), ao4.mo31095g(t2)));
    }

    /* renamed from: K */
    public static ao4<?, ?> m49732K() {
        return f29302a;
    }

    /* renamed from: L */
    public static ao4<?, ?> m49733L() {
        return f29304b;
    }

    /* renamed from: M */
    public static void m49734M(Class<?> cls) {
        Class<?> cls2;
        if (!qe1.class.isAssignableFrom(cls) && (cls2 = f29303a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: N */
    public static boolean m49735N(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: O */
    public static boolean m49736O(int i, int i2, int i3) {
        if (i2 < 40) {
            return true;
        }
        long j = (long) i3;
        return ((((long) i2) - ((long) i)) + 1) + 9 <= ((2 * j) + 3) + ((j + 3) * 3);
    }

    /* renamed from: P */
    public static boolean m49737P(w11[] w11Arr) {
        if (w11Arr.length == 0) {
            return false;
        }
        return m49736O(w11Arr[0].mo46480z(), w11Arr[w11Arr.length - 1].mo46480z(), w11Arr.length);
    }

    /* renamed from: Q */
    public static <UT, UB> UB m49738Q(int i, int i2, UB ub, ao4<UT, UB> ao4) {
        if (ub == null) {
            ub = ao4.mo31102n();
        }
        ao4.mo31093e(ub, i, (long) i2);
        return ub;
    }

    /* renamed from: R */
    public static String m49739R(String str, boolean z) {
        int i;
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if ('a' <= charAt && charAt <= 'z') {
                if (z) {
                    i = charAt - ' ';
                }
                sb.append(charAt);
                z = false;
            } else if ('A' > charAt || charAt > 'Z') {
                if ('0' <= charAt && charAt <= '9') {
                    sb.append(charAt);
                }
                z = true;
            } else {
                if (i2 == 0 && !z) {
                    i = charAt + ' ';
                }
                sb.append(charAt);
                z = false;
            }
            sb.append((char) i);
            z = false;
        }
        return sb.toString();
    }

    /* renamed from: S */
    public static ao4<?, ?> m49740S() {
        return f29305c;
    }

    /* renamed from: T */
    public static void m49741T(int i, boolean z, ty4 ty4) throws IOException {
        if (z) {
            ty4.mo38342c(i, true);
        }
    }

    /* renamed from: U */
    public static void m49742U(int i, List<Boolean> list, ty4 ty4, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ty4.mo38350k(i, list, z);
        }
    }

    /* renamed from: V */
    public static void m49743V(int i, C5173er erVar, ty4 ty4) throws IOException {
        if (erVar != null && !erVar.isEmpty()) {
            ty4.mo38345f(i, erVar);
        }
    }

    /* renamed from: W */
    public static void m49744W(int i, List<C5173er> list, ty4 ty4) throws IOException {
        if (list != null && !list.isEmpty()) {
            ty4.mo38323J(i, list);
        }
    }

    /* renamed from: X */
    public static void m49745X(int i, double d, ty4 ty4) throws IOException {
        if (Double.compare(d, 0.0d) != 0) {
            ty4.mo38315B(i, d);
        }
    }

    /* renamed from: Y */
    public static void m49746Y(int i, List<Double> list, ty4 ty4, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ty4.mo38328O(i, list, z);
        }
    }

    /* renamed from: Z */
    public static void m49747Z(int i, int i2, ty4 ty4) throws IOException {
        if (i2 != 0) {
            ty4.mo38339a(i, i2);
        }
    }

    /* renamed from: a */
    public static int m49748a(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z ? i00.m51411X0(i) + i00.m51391D0(size) : size * i00.m51415a0(i, true);
    }

    /* renamed from: a0 */
    public static void m49749a0(int i, List<Integer> list, ty4 ty4, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ty4.mo38324K(i, list, z);
        }
    }

    /* renamed from: b */
    public static int m49750b(List<?> list) {
        return list.size();
    }

    /* renamed from: b0 */
    public static void m49751b0(int i, int i2, ty4 ty4) throws IOException {
        if (i2 != 0) {
            ty4.mo38351l(i, i2);
        }
    }

    /* renamed from: c */
    public static int m49752c(int i, List<C5173er> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int X0 = size * i00.m51411X0(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            X0 += i00.m51426h0(list.get(i2));
        }
        return X0;
    }

    /* renamed from: c0 */
    public static void m49753c0(int i, List<Integer> list, ty4 ty4, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ty4.mo38346g(i, list, z);
        }
    }

    /* renamed from: d */
    public static int m49754d(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e = m49756e(list);
        int X0 = i00.m51411X0(i);
        return z ? X0 + i00.m51391D0(e) : e + (size * X0);
    }

    /* renamed from: d0 */
    public static void m49755d0(int i, long j, ty4 ty4) throws IOException {
        if (j != 0) {
            ty4.mo38362w(i, j);
        }
    }

    /* renamed from: e */
    public static int m49756e(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof as1) {
            as1 as1 = (as1) list;
            i = 0;
            while (i2 < size) {
                i += i00.m51433l0(as1.getInt(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + i00.m51433l0(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: e0 */
    public static void m49757e0(int i, List<Long> list, ty4 ty4, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ty4.mo38320G(i, list, z);
        }
    }

    /* renamed from: f */
    public static int m49758f(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z ? i00.m51411X0(i) + i00.m51391D0(size * 4) : size * i00.m51435m0(i, 0);
    }

    /* renamed from: f0 */
    public static void m49759f0(int i, float f, ty4 ty4) throws IOException {
        if (Float.compare(f, 0.0f) != 0) {
            ty4.mo38317D(i, f);
        }
    }

    /* renamed from: g */
    public static int m49760g(List<?> list) {
        return list.size() * 4;
    }

    /* renamed from: g0 */
    public static void m49761g0(int i, List<Float> list, ty4 ty4, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ty4.mo38363x(i, list, z);
        }
    }

    /* renamed from: h */
    public static int m49762h(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z ? i00.m51411X0(i) + i00.m51391D0(size * 8) : size * i00.m51439o0(i, 0);
    }

    /* renamed from: h0 */
    public static void m49763h0(int i, List<?> list, ty4 ty4) throws IOException {
        if (list != null && !list.isEmpty()) {
            ty4.mo38357r(i, list);
        }
    }

    /* renamed from: i */
    public static int m49764i(List<?> list) {
        return list.size() * 8;
    }

    /* renamed from: i0 */
    public static void m49765i0(int i, List<?> list, ty4 ty4, xr3 xr3) throws IOException {
        if (list != null && !list.isEmpty()) {
            ty4.mo38330Q(i, list, xr3);
        }
    }

    /* renamed from: j */
    public static int m49766j(int i, List<yh2> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += i00.m51446s0(i, list.get(i3));
        }
        return i2;
    }

    /* renamed from: j0 */
    public static void m49767j0(int i, int i2, ty4 ty4) throws IOException {
        if (i2 != 0) {
            ty4.mo38359t(i, i2);
        }
    }

    /* renamed from: k */
    public static int m49768k(int i, List<yh2> list, xr3 xr3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += i00.m51447t0(i, list.get(i3), xr3);
        }
        return i2;
    }

    /* renamed from: k0 */
    public static void m49769k0(int i, List<Integer> list, ty4 ty4, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ty4.mo38332S(i, list, z);
        }
    }

    /* renamed from: l */
    public static int m49770l(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m = m49772m(list);
        int X0 = i00.m51411X0(i);
        return z ? X0 + i00.m51391D0(m) : m + (size * X0);
    }

    /* renamed from: l0 */
    public static void m49771l0(int i, long j, ty4 ty4) throws IOException {
        if (j != 0) {
            ty4.mo38347h(i, j);
        }
    }

    /* renamed from: m */
    public static int m49772m(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof as1) {
            as1 as1 = (as1) list;
            i = 0;
            while (i2 < size) {
                i += i00.m51451x0(as1.getInt(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + i00.m51451x0(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: m0 */
    public static void m49773m0(int i, List<Long> list, ty4 ty4, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ty4.mo38331R(i, list, z);
        }
    }

    /* renamed from: n */
    public static int m49774n(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        int o = m49776o(list);
        return z ? i00.m51411X0(i) + i00.m51391D0(o) : o + (list.size() * i00.m51411X0(i));
    }

    /* renamed from: n0 */
    public static void m49775n0(int i, List<?> list, ty4 ty4) throws IOException {
        if (list != null && !list.isEmpty()) {
            Iterator<?> it = list.iterator();
            while (it.hasNext()) {
                ((d22) it.next()).mo34160o(ty4, i);
            }
        }
    }

    /* renamed from: o */
    public static int m49776o(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof v92) {
            v92 v92 = (v92) list;
            i = 0;
            while (i2 < size) {
                i += i00.m51453z0(v92.getLong(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + i00.m51453z0(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: o0 */
    public static void m49777o0(int i, Object obj, ty4 ty4) throws IOException {
        if (obj != null) {
            ty4.mo38361v(i, obj);
        }
    }

    /* renamed from: p */
    public static int m49778p(int i, Object obj, xr3 xr3) {
        return obj instanceof d22 ? i00.m51389B0(i, (d22) obj) : i00.m51394G0(i, (yh2) obj, xr3);
    }

    /* renamed from: p0 */
    public static void m49779p0(int i, List<?> list, ty4 ty4) throws IOException {
        if (list != null && !list.isEmpty()) {
            ty4.mo38318E(i, list);
        }
    }

    /* renamed from: q */
    public static int m49780q(int i, List<?> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int X0 = i00.m51411X0(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            X0 += obj instanceof d22 ? i00.m51390C0((d22) obj) : i00.m51395H0((yh2) obj);
        }
        return X0;
    }

    /* renamed from: q0 */
    public static void m49781q0(int i, List<?> list, ty4 ty4, xr3 xr3) throws IOException {
        if (list != null && !list.isEmpty()) {
            ty4.mo38319F(i, list, xr3);
        }
    }

    /* renamed from: r */
    public static int m49782r(int i, List<?> list, xr3 xr3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int X0 = i00.m51411X0(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            X0 += obj instanceof d22 ? i00.m51390C0((d22) obj) : i00.m51396I0((yh2) obj, xr3);
        }
        return X0;
    }

    /* renamed from: r0 */
    public static void m49783r0(int i, int i2, ty4 ty4) throws IOException {
        if (i2 != 0) {
            ty4.mo38325L(i, i2);
        }
    }

    /* renamed from: s */
    public static int m49784s(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int t = m49786t(list);
        int X0 = i00.m51411X0(i);
        return z ? X0 + i00.m51391D0(t) : t + (size * X0);
    }

    /* renamed from: s0 */
    public static void m49785s0(int i, List<Integer> list, ty4 ty4, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ty4.mo38326M(i, list, z);
        }
    }

    /* renamed from: t */
    public static int m49786t(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof as1) {
            as1 as1 = (as1) list;
            i = 0;
            while (i2 < size) {
                i += i00.m51406S0(as1.getInt(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + i00.m51406S0(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: t0 */
    public static void m49787t0(int i, long j, ty4 ty4) throws IOException {
        if (j != 0) {
            ty4.mo38343d(i, j);
        }
    }

    /* renamed from: u */
    public static int m49788u(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int v = m49790v(list);
        int X0 = i00.m51411X0(i);
        return z ? X0 + i00.m51391D0(v) : v + (size * X0);
    }

    /* renamed from: u0 */
    public static void m49789u0(int i, List<Long> list, ty4 ty4, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ty4.mo38365z(i, list, z);
        }
    }

    /* renamed from: v */
    public static int m49790v(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof v92) {
            v92 v92 = (v92) list;
            i = 0;
            while (i2 < size) {
                i += i00.m51408U0(v92.getLong(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + i00.m51408U0(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: v0 */
    public static void m49791v0(int i, int i2, ty4 ty4) throws IOException {
        if (i2 != 0) {
            ty4.mo38348i(i, i2);
        }
    }

    /* renamed from: w */
    public static int m49792w(int i, List<?> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int X0 = i00.m51411X0(i) * size;
        if (list instanceof n22) {
            n22 n22 = (n22) list;
            while (i2 < size) {
                Object g2 = n22.mo36162g2(i2);
                X0 += g2 instanceof C5173er ? i00.m51426h0((C5173er) g2) : i00.m51410W0((String) g2);
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                X0 += obj instanceof C5173er ? i00.m51426h0((C5173er) obj) : i00.m51410W0((String) obj);
                i2++;
            }
        }
        return X0;
    }

    /* renamed from: w0 */
    public static void m49793w0(int i, List<Integer> list, ty4 ty4, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ty4.mo38322I(i, list, z);
        }
    }

    /* renamed from: x */
    public static int m49794x(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y = m49796y(list);
        int X0 = i00.m51411X0(i);
        return z ? X0 + i00.m51391D0(y) : y + (size * X0);
    }

    /* renamed from: x0 */
    public static void m49795x0(int i, long j, ty4 ty4) throws IOException {
        if (j != 0) {
            ty4.mo38358s(i, j);
        }
    }

    /* renamed from: y */
    public static int m49796y(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof as1) {
            as1 as1 = (as1) list;
            i = 0;
            while (i2 < size) {
                i += i00.m51414Z0(as1.getInt(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + i00.m51414Z0(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: y0 */
    public static void m49797y0(int i, List<Long> list, ty4 ty4, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ty4.mo38327N(i, list, z);
        }
    }

    /* renamed from: z */
    public static int m49798z(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int A = m49716A(list);
        int X0 = i00.m51411X0(i);
        return z ? X0 + i00.m51391D0(A) : A + (size * X0);
    }

    /* renamed from: z0 */
    public static void m49799z0(int i, Object obj, ty4 ty4) throws IOException {
        if (obj instanceof String) {
            m49717A0(i, (String) obj, ty4);
        } else {
            m49743V(i, (C5173er) obj, ty4);
        }
    }
}
