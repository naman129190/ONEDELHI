package com.onedelhi.secure;

public final class wo3 extends rl3 {
    /* renamed from: q */
    public ls0 mo30463k(ol3 ol3) {
        String str;
        String str2;
        String c = rl3.m63723c(ol3);
        if (!c.startsWith("smtp:") && !c.startsWith("SMTP:")) {
            return null;
        }
        String substring = c.substring(5);
        int indexOf = substring.indexOf(58);
        if (indexOf >= 0) {
            String substring2 = substring.substring(indexOf + 1);
            substring = substring.substring(0, indexOf);
            int indexOf2 = substring2.indexOf(58);
            if (indexOf2 >= 0) {
                String substring3 = substring2.substring(indexOf2 + 1);
                str2 = substring2.substring(0, indexOf2);
                str = substring3;
            } else {
                str = null;
                str2 = substring2;
            }
        } else {
            str2 = null;
            str = null;
        }
        return new ls0(new String[]{substring}, (String[]) null, (String[]) null, str2, str);
    }
}
