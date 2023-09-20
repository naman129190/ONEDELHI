package com.onedelhi.secure;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class rf1 extends rl3 {

    /* renamed from: d */
    public static final Pattern f34611d = Pattern.compile("geo:([\\-0-9.]+),([\\-0-9.]+)(?:,([\\-0-9.]+))?(?:\\?(.*))?", 2);

    /* renamed from: q */
    public qf1 mo30463k(ol3 ol3) {
        Matcher matcher = f34611d.matcher(rl3.m63723c(ol3));
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(4);
        try {
            double parseDouble = Double.parseDouble(matcher.group(1));
            if (parseDouble <= 90.0d) {
                if (parseDouble >= -90.0d) {
                    double parseDouble2 = Double.parseDouble(matcher.group(2));
                    if (parseDouble2 <= 180.0d) {
                        if (parseDouble2 >= -180.0d) {
                            double d = 0.0d;
                            if (matcher.group(3) != null) {
                                double parseDouble3 = Double.parseDouble(matcher.group(3));
                                if (parseDouble3 < 0.0d) {
                                    return null;
                                }
                                d = parseDouble3;
                            }
                            return new qf1(parseDouble, parseDouble2, d, group);
                        }
                    }
                }
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }
}
