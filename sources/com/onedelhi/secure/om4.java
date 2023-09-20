package com.onedelhi.secure;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class om4 extends rl3 {

    /* renamed from: d */
    public static final Pattern f33091d = Pattern.compile("[-._~:/?#\\[\\]@!$&'()*+,;=%A-Za-z0-9]+");

    /* renamed from: e */
    public static final Pattern f33092e = Pattern.compile(":/*([^/@]+)@[^/]+");

    /* renamed from: f */
    public static final Pattern f33093f = Pattern.compile("[a-zA-Z][a-zA-Z0-9+-.]+:");

    /* renamed from: g */
    public static final Pattern f33094g = Pattern.compile("([a-zA-Z0-9\\-]+\\.){1,6}[a-zA-Z]{2,}(:\\d{1,5})?(/|\\?|$)");

    /* renamed from: q */
    public static boolean m59488q(String str) {
        if (str.contains(" ")) {
            return false;
        }
        Matcher matcher = f33093f.matcher(str);
        if (matcher.find() && matcher.start() == 0) {
            return true;
        }
        Matcher matcher2 = f33094g.matcher(str);
        return matcher2.find() && matcher2.start() == 0;
    }

    /* renamed from: r */
    public static boolean m59489r(String str) {
        return !f33091d.matcher(str).matches() || f33092e.matcher(str).find();
    }

    /* renamed from: s */
    public nm4 mo30463k(ol3 ol3) {
        String c = rl3.m63723c(ol3);
        if (c.startsWith("URL:") || c.startsWith("URI:")) {
            return new nm4(c.substring(4).trim(), (String) null);
        }
        String trim = c.trim();
        if (!m59488q(trim) || m59489r(trim)) {
            return null;
        }
        return new nm4(trim, (String) null);
    }
}
