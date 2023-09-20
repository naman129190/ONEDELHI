package com.onedelhi.secure;

/* renamed from: com.onedelhi.secure.in */
public final class C5735in extends C6238o0 {
    /* renamed from: s */
    public nm4 mo30463k(ol3 ol3) {
        String g = ol3.mo41829g();
        if (!g.startsWith("MEBKM:")) {
            return null;
        }
        String r = C6238o0.m58877r("TITLE:", g, true);
        String[] q = C6238o0.m58876q("URL:", g);
        if (q == null) {
            return null;
        }
        String str = q[0];
        if (om4.m59488q(str)) {
            return new nm4(str, r);
        }
        return null;
    }
}
