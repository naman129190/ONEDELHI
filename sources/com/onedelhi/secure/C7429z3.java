package com.onedelhi.secure;

import java.util.ArrayList;

/* renamed from: com.onedelhi.secure.z3 */
public final class C7429z3 extends rl3 {
    /* renamed from: q */
    public static String[] m72527q(String str, String str2) {
        ArrayList arrayList = null;
        for (int i = 1; i <= 3; i++) {
            String g = rl3.m63727g(str + i + ':', str2, 13, true);
            if (g == null) {
                break;
            }
            if (arrayList == null) {
                arrayList = new ArrayList(3);
            }
            arrayList.add(g);
        }
        if (arrayList == null) {
            return null;
        }
        return (String[]) arrayList.toArray(rl3.f34675a);
    }

    /* renamed from: r */
    public C4620b4 mo30463k(ol3 ol3) {
        String c = rl3.m63723c(ol3);
        String[] strArr = null;
        if (!c.contains("MEMORY") || !c.contains("\r\n")) {
            return null;
        }
        String g = rl3.m63727g("NAME1:", c, 13, true);
        String g2 = rl3.m63727g("NAME2:", c, 13, true);
        String[] q = m72527q("TEL", c);
        String[] q2 = m72527q("MAIL", c);
        String g3 = rl3.m63727g("MEMORY:", c, 13, false);
        String g4 = rl3.m63727g("ADD:", c, 13, true);
        if (g4 != null) {
            strArr = new String[]{g4};
        }
        return new C4620b4(rl3.m63730j(g), (String[]) null, g2, q, (String[]) null, q2, (String[]) null, (String) null, g3, strArr, (String[]) null, (String) null, (String) null, (String) null, (String[]) null, (String[]) null);
    }
}
