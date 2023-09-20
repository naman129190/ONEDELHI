package com.onedelhi.secure;

public final class vo3 extends rl3 {
    /* renamed from: q */
    public uo3 mo30463k(ol3 ol3) {
        String str;
        String c = rl3.m63723c(ol3);
        if (!c.startsWith("smsto:") && !c.startsWith("SMSTO:") && !c.startsWith("mmsto:") && !c.startsWith("MMSTO:")) {
            return null;
        }
        String substring = c.substring(6);
        int indexOf = substring.indexOf(58);
        if (indexOf >= 0) {
            str = substring.substring(indexOf + 1);
            substring = substring.substring(0, indexOf);
        } else {
            str = null;
        }
        return new uo3(substring, (String) null, (String) null, str);
    }
}
