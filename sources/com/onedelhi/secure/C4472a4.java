package com.onedelhi.secure;

/* renamed from: com.onedelhi.secure.a4 */
public final class C4472a4 extends C6238o0 {
    /* renamed from: t */
    public static String m36071t(String str) {
        int indexOf = str.indexOf(44);
        if (indexOf < 0) {
            return str;
        }
        return str.substring(indexOf + 1) + ' ' + str.substring(0, indexOf);
    }

    /* renamed from: s */
    public C4620b4 mo30463k(ol3 ol3) {
        String[] q;
        String c = rl3.m63723c(ol3);
        if (!c.startsWith("MECARD:") || (q = C6238o0.m58876q("N:", c)) == null) {
            return null;
        }
        String t = m36071t(q[0]);
        String r = C6238o0.m58877r("SOUND:", c, true);
        String[] q2 = C6238o0.m58876q("TEL:", c);
        String[] q3 = C6238o0.m58876q("EMAIL:", c);
        String r2 = C6238o0.m58877r("NOTE:", c, false);
        String[] q4 = C6238o0.m58876q("ADR:", c);
        String r3 = C6238o0.m58877r("BDAY:", c, true);
        return new C4620b4(rl3.m63730j(t), (String[]) null, r, q2, (String[]) null, q3, (String[]) null, (String) null, r2, q4, (String[]) null, C6238o0.m58877r("ORG:", c, true), !rl3.m63724d(r3, 8) ? null : r3, (String) null, C6238o0.m58876q("URL:", c), (String[]) null);
    }
}
