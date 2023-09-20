package com.onedelhi.secure;

public final class r53 extends rl3 {
    /* renamed from: q */
    public q53 mo30463k(ol3 ol3) {
        C7363yi b = ol3.mo41824b();
        if (b != C7363yi.UPC_A && b != C7363yi.UPC_E && b != C7363yi.EAN_8 && b != C7363yi.EAN_13) {
            return null;
        }
        String c = rl3.m63723c(ol3);
        if (!rl3.m63724d(c, c.length())) {
            return null;
        }
        return new q53(c, (b == C7363yi.UPC_E && c.length() == 8) ? km4.m54566s(c) : c);
    }
}
