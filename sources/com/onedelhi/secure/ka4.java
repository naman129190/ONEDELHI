package com.onedelhi.secure;

public final class ka4 extends rl3 {
    /* renamed from: q */
    public ja4 mo30463k(ol3 ol3) {
        String str;
        String c = rl3.m63723c(ol3);
        if (!c.startsWith("tel:") && !c.startsWith("TEL:")) {
            return null;
        }
        if (c.startsWith("TEL:")) {
            str = "tel:" + c.substring(4);
        } else {
            str = c;
        }
        int indexOf = c.indexOf(63, 4);
        return new ja4(indexOf < 0 ? c.substring(4) : c.substring(4, indexOf), str, (String) null);
    }
}
