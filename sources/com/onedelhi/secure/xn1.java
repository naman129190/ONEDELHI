package com.onedelhi.secure;

public final class xn1 extends rl3 {
    /* renamed from: q */
    public wn1 mo30463k(ol3 ol3) {
        if (ol3.mo41824b() != C7363yi.EAN_13) {
            return null;
        }
        String c = rl3.m63723c(ol3);
        if (c.length() != 13) {
            return null;
        }
        if (c.startsWith("978") || c.startsWith("979")) {
            return new wn1(c);
        }
        return null;
    }
}
