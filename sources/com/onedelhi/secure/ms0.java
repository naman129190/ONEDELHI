package com.onedelhi.secure;

import java.util.Map;
import java.util.regex.Pattern;

public final class ms0 extends rl3 {

    /* renamed from: d */
    public static final Pattern f32247d = Pattern.compile(vf4.f36537c);

    /* renamed from: q */
    public ls0 mo30463k(ol3 ol3) {
        String str;
        String str2;
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        String str3;
        String c = rl3.m63723c(ol3);
        String[] strArr4 = null;
        if (c.startsWith(tb2.f20728a) || c.startsWith("MAILTO:")) {
            String substring = c.substring(7);
            int indexOf = substring.indexOf(63);
            if (indexOf >= 0) {
                substring = substring.substring(0, indexOf);
            }
            try {
                String p = rl3.m63735p(substring);
                String[] split = !p.isEmpty() ? f32247d.split(p) : null;
                Map<String, String> m = rl3.m63732m(c);
                if (m != null) {
                    if (split == null && (str3 = m.get("to")) != null) {
                        split = f32247d.split(str3);
                    }
                    String str4 = m.get(tb2.f20732e);
                    String[] split2 = str4 != null ? f32247d.split(str4) : null;
                    String str5 = m.get(tb2.f20733f);
                    if (str5 != null) {
                        strArr4 = f32247d.split(str5);
                    }
                    str = m.get("body");
                    strArr3 = split;
                    strArr = strArr4;
                    strArr2 = split2;
                    str2 = m.get(tb2.f20734g);
                } else {
                    strArr3 = split;
                    strArr2 = null;
                    strArr = null;
                    str2 = null;
                    str = null;
                }
                return new ls0(strArr3, strArr2, strArr, str2, str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        } else if (!ns0.m58748s(c)) {
            return null;
        } else {
            return new ls0(c);
        }
    }
}
