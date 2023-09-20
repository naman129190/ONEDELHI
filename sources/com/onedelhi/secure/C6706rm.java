package com.onedelhi.secure;

import java.util.ArrayList;

/* renamed from: com.onedelhi.secure.rm */
public final class C6706rm extends C6238o0 {
    /* renamed from: s */
    public static String m63738s(String str, String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        return str + ' ' + str2;
    }

    /* renamed from: t */
    public static String[] m63739t(String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList(3);
        if (str != null) {
            arrayList.add(str);
        }
        if (str2 != null) {
            arrayList.add(str2);
        }
        if (str3 != null) {
            arrayList.add(str3);
        }
        int size = arrayList.size();
        if (size == 0) {
            return null;
        }
        return (String[]) arrayList.toArray(new String[size]);
    }

    /* renamed from: u */
    public C4620b4 mo30463k(ol3 ol3) {
        String c = rl3.m63723c(ol3);
        if (!c.startsWith("BIZCARD:")) {
            return null;
        }
        String s = m63738s(C6238o0.m58877r("N:", c, true), C6238o0.m58877r("X:", c, true));
        String r = C6238o0.m58877r("T:", c, true);
        String r2 = C6238o0.m58877r("C:", c, true);
        return new C4620b4(rl3.m63730j(s), (String[]) null, (String) null, m63739t(C6238o0.m58877r("B:", c, true), C6238o0.m58877r("M:", c, true), C6238o0.m58877r("F:", c, true)), (String[]) null, rl3.m63730j(C6238o0.m58877r("E:", c, true)), (String[]) null, (String) null, (String) null, C6238o0.m58876q("A:", c), (String[]) null, r2, (String) null, r, (String[]) null, (String[]) null);
    }
}
