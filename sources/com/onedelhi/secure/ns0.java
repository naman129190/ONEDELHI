package com.onedelhi.secure;

import java.util.regex.Pattern;

public final class ns0 extends C6238o0 {

    /* renamed from: d */
    public static final Pattern f32763d = Pattern.compile("[a-zA-Z0-9@.!#$%&'*+\\-/=?^_`{|}~]+");

    /* renamed from: s */
    public static boolean m58748s(String str) {
        return str != null && f32763d.matcher(str).matches() && str.indexOf(64) >= 0;
    }

    /* renamed from: t */
    public ls0 mo30463k(ol3 ol3) {
        String[] q;
        String c = rl3.m63723c(ol3);
        if (!c.startsWith("MATMSG:") || (q = C6238o0.m58876q("TO:", c)) == null) {
            return null;
        }
        for (String s : q) {
            if (!m58748s(s)) {
                return null;
            }
        }
        return new ls0(q, (String[]) null, (String[]) null, C6238o0.m58877r("SUB:", c, false), C6238o0.m58877r("BODY:", c, false));
    }
}
