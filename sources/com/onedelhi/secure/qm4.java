package com.onedelhi.secure;

public final class qm4 extends rl3 {
    /* renamed from: q */
    public nm4 mo30463k(ol3 ol3) {
        int indexOf;
        String c = rl3.m63723c(ol3);
        String str = null;
        if ((!c.startsWith("urlto:") && !c.startsWith("URLTO:")) || (indexOf = c.indexOf(58, 6)) < 0) {
            return null;
        }
        if (indexOf > 6) {
            str = c.substring(6, indexOf);
        }
        return new nm4(c.substring(indexOf + 1), str);
    }
}
