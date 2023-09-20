package com.onedelhi.secure;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public abstract class n57 {

    /* renamed from: a */
    public final int f17108a;

    /* renamed from: a */
    public Boolean f17109a;

    /* renamed from: a */
    public Long f17110a;

    /* renamed from: a */
    public final String f17111a;

    /* renamed from: b */
    public Boolean f17112b;

    /* renamed from: b */
    public Long f17113b;

    public n57(String str, int i) {
        this.f17111a = str;
        this.f17108a = i;
    }

    /* renamed from: d */
    public static Boolean m22344d(String str, int i, boolean z, String str2, List list, String str3, a56 a56) {
        boolean startsWith;
        if (i == 7) {
            if (list == null || list.isEmpty()) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z && i != 2) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (i - 1) {
            case 1:
                if (str3 == null) {
                    return null;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(str3, true != z ? 66 : 0).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (a56 != null) {
                        a56.mo12731w().mo25380b("Invalid regular expression in REGEXP audience filter. expression", str3);
                    }
                    return null;
                }
            case 2:
                startsWith = str.startsWith(str2);
                break;
            case 3:
                startsWith = str.endsWith(str2);
                break;
            case 4:
                startsWith = str.contains(str2);
                break;
            case 5:
                startsWith = str.equals(str2);
                break;
            case 6:
                if (list != null) {
                    startsWith = list.contains(str);
                    break;
                } else {
                    return null;
                }
            default:
                return null;
        }
        return Boolean.valueOf(startsWith);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x009f, code lost:
        if (r8.compareTo(r5) <= 0) goto L_0x00a3;
     */
    @com.google.android.gms.common.util.VisibleForTesting
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Boolean m22345e(java.math.BigDecimal r8, com.onedelhi.secure.t46 r9, double r10) {
        /*
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r9)
            boolean r0 = r9.mo24708H()
            r1 = 0
            if (r0 == 0) goto L_0x0109
            int r0 = r9.mo24713M()
            r2 = 1
            if (r0 != r2) goto L_0x0013
            goto L_0x0109
        L_0x0013:
            int r0 = r9.mo24713M()
            r3 = 5
            if (r0 != r3) goto L_0x0028
            boolean r0 = r9.mo24712L()
            if (r0 == 0) goto L_0x0027
            boolean r0 = r9.mo24711K()
            if (r0 == 0) goto L_0x0027
            goto L_0x002f
        L_0x0027:
            return r1
        L_0x0028:
            boolean r0 = r9.mo24709I()
            if (r0 != 0) goto L_0x002f
            return r1
        L_0x002f:
            int r0 = r9.mo24713M()
            int r4 = r9.mo24713M()
            if (r4 != r3) goto L_0x0064
            java.lang.String r4 = r9.mo24706F()
            boolean r4 = com.onedelhi.secure.uq6.m29502N(r4)
            if (r4 == 0) goto L_0x0063
            java.lang.String r4 = r9.mo24705E()
            boolean r4 = com.onedelhi.secure.uq6.m29502N(r4)
            if (r4 != 0) goto L_0x004e
            goto L_0x0063
        L_0x004e:
            java.math.BigDecimal r4 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0063 }
            java.lang.String r5 = r9.mo24706F()     // Catch:{ NumberFormatException -> 0x0063 }
            r4.<init>(r5)     // Catch:{ NumberFormatException -> 0x0063 }
            java.math.BigDecimal r5 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0063 }
            java.lang.String r9 = r9.mo24705E()     // Catch:{ NumberFormatException -> 0x0063 }
            r5.<init>(r9)     // Catch:{ NumberFormatException -> 0x0063 }
            r9 = r4
            r4 = r1
            goto L_0x007a
        L_0x0063:
            return r1
        L_0x0064:
            java.lang.String r4 = r9.mo24704D()
            boolean r4 = com.onedelhi.secure.uq6.m29502N(r4)
            if (r4 != 0) goto L_0x006f
            return r1
        L_0x006f:
            java.math.BigDecimal r4 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0109 }
            java.lang.String r9 = r9.mo24704D()     // Catch:{ NumberFormatException -> 0x0109 }
            r4.<init>(r9)     // Catch:{ NumberFormatException -> 0x0109 }
            r9 = r1
            r5 = r9
        L_0x007a:
            if (r0 != r3) goto L_0x007f
            if (r9 == 0) goto L_0x00fb
            goto L_0x0083
        L_0x007f:
            if (r4 != 0) goto L_0x0083
            goto L_0x00fb
        L_0x0083:
            int r0 = r0 + -1
            r3 = 0
            if (r0 == r2) goto L_0x00f9
            r6 = 2
            if (r0 == r6) goto L_0x00e9
            r7 = 3
            if (r0 == r7) goto L_0x00a8
            r10 = 4
            if (r0 == r10) goto L_0x0093
            goto L_0x00fb
        L_0x0093:
            if (r9 == 0) goto L_0x00fb
            int r9 = r8.compareTo(r9)
            if (r9 < 0) goto L_0x00a2
            int r8 = r8.compareTo(r5)
            if (r8 > 0) goto L_0x00a2
            goto L_0x00a3
        L_0x00a2:
            r2 = 0
        L_0x00a3:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            goto L_0x00fb
        L_0x00a8:
            if (r4 != 0) goto L_0x00ab
            goto L_0x00fb
        L_0x00ab:
            r0 = 0
            int r9 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r9 == 0) goto L_0x00e2
            java.math.BigDecimal r9 = new java.math.BigDecimal
            r9.<init>(r10)
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r6)
            java.math.BigDecimal r9 = r9.multiply(r0)
            java.math.BigDecimal r9 = r4.subtract(r9)
            int r9 = r8.compareTo(r9)
            if (r9 <= 0) goto L_0x00a2
            java.math.BigDecimal r9 = new java.math.BigDecimal
            r9.<init>(r10)
            java.math.BigDecimal r10 = new java.math.BigDecimal
            r10.<init>(r6)
            java.math.BigDecimal r9 = r9.multiply(r10)
            java.math.BigDecimal r9 = r4.add(r9)
            int r8 = r8.compareTo(r9)
            if (r8 >= 0) goto L_0x00a2
            goto L_0x00a3
        L_0x00e2:
            int r8 = r8.compareTo(r4)
            if (r8 != 0) goto L_0x00a2
            goto L_0x00a3
        L_0x00e9:
            if (r4 != 0) goto L_0x00ec
            goto L_0x00fb
        L_0x00ec:
            int r8 = r8.compareTo(r4)
            if (r8 <= 0) goto L_0x00f3
            goto L_0x00f4
        L_0x00f3:
            r2 = 0
        L_0x00f4:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            return r8
        L_0x00f9:
            if (r4 != 0) goto L_0x00fc
        L_0x00fb:
            return r1
        L_0x00fc:
            int r8 = r8.compareTo(r4)
            if (r8 >= 0) goto L_0x0103
            goto L_0x0104
        L_0x0103:
            r2 = 0
        L_0x0104:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            return r8
        L_0x0109:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.n57.m22345e(java.math.BigDecimal, com.onedelhi.secure.t46, double):java.lang.Boolean");
    }

    @VisibleForTesting
    /* renamed from: f */
    public static Boolean m22346f(String str, o56 o56, a56 a56) {
        List list;
        Preconditions.checkNotNull(o56);
        if (str == null || !o56.mo21608J() || o56.mo21609K() == 1) {
            return null;
        }
        if (o56.mo21609K() == 7) {
            if (o56.mo21602B() == 0) {
                return null;
            }
        } else if (!o56.mo21607I()) {
            return null;
        }
        int K = o56.mo21609K();
        boolean G = o56.mo21605G();
        String E = (G || K == 2 || K == 7) ? o56.mo21603E() : o56.mo21603E().toUpperCase(Locale.ENGLISH);
        if (o56.mo21602B() == 0) {
            list = null;
        } else {
            List<String> F = o56.mo21604F();
            if (!G) {
                ArrayList arrayList = new ArrayList(F.size());
                for (String upperCase : F) {
                    arrayList.add(upperCase.toUpperCase(Locale.ENGLISH));
                }
                F = Collections.unmodifiableList(arrayList);
            }
            list = F;
        }
        return m22344d(str, K, G, E, list, K == 2 ? E : null, a56);
    }

    /* renamed from: g */
    public static Boolean m22347g(double d, t46 t46) {
        try {
            return m22345e(new BigDecimal(d), t46, Math.ulp(d));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: h */
    public static Boolean m22348h(long j, t46 t46) {
        try {
            return m22345e(new BigDecimal(j), t46, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: i */
    public static Boolean m22349i(String str, t46 t46) {
        if (!uq6.m29502N(str)) {
            return null;
        }
        try {
            return m22345e(new BigDecimal(str), t46, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @VisibleForTesting
    /* renamed from: j */
    public static Boolean m22350j(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    /* renamed from: a */
    public abstract int mo14029a();

    /* renamed from: b */
    public abstract boolean mo14030b();

    /* renamed from: c */
    public abstract boolean mo14031c();
}
