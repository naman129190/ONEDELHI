package com.onedelhi.secure;

import java.util.Arrays;
import java.util.Comparator;

public final class gm5 implements Comparator {

    /* renamed from: a */
    public final /* synthetic */ ef5 f12666a;

    /* renamed from: a */
    public final /* synthetic */ w96 f12667a;

    public gm5(ef5 ef5, w96 w96) {
        this.f12666a = ef5;
        this.f12667a = w96;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        qh5 qh5 = (qh5) obj;
        qh5 qh52 = (qh5) obj2;
        ef5 ef5 = this.f12666a;
        w96 w96 = this.f12667a;
        if (qh5 instanceof ej5) {
            return !(qh52 instanceof ej5) ? 1 : 0;
        }
        if (qh52 instanceof ej5) {
            return -1;
        }
        if (ef5 == null) {
            return qh5.mo13084b().compareTo(qh52.mo13084b());
        }
        return (int) sd6.m27473a(ef5.mo14991a(w96, Arrays.asList(new qh5[]{qh5, qh52})).mo13085e().doubleValue());
    }
}
