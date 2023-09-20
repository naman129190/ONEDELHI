package com.onedelhi.secure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class n17 extends ef5 {

    /* renamed from: a */
    public final /* synthetic */ e27 f16990a;

    /* renamed from: b */
    public final boolean f16991b;

    /* renamed from: c */
    public final boolean f16992c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n17(e27 e27, boolean z, boolean z2) {
        super("log");
        this.f16990a = e27;
        this.f16991b = z;
        this.f16992c = z2;
    }

    /* renamed from: a */
    public final qh5 mo14991a(w96 w96, List list) {
        List arrayList;
        h07 d;
        sd6.m27481i("log", 1, list);
        if (list.size() == 1) {
            this.f16990a.f11076a.mo17036a(3, w96.mo26465b((qh5) list.get(0)).mo13084b(), Collections.emptyList(), this.f16991b, this.f16992c);
        } else {
            int b = sd6.m27474b(w96.mo26465b((qh5) list.get(0)).mo13085e().doubleValue());
            int i = b != 2 ? b != 3 ? b != 5 ? b != 6 ? 3 : 2 : 5 : 1 : 4;
            String b2 = w96.mo26465b((qh5) list.get(1)).mo13084b();
            if (list.size() == 2) {
                d = this.f16990a.f11076a;
                arrayList = Collections.emptyList();
            } else {
                arrayList = new ArrayList();
                for (int i2 = 2; i2 < Math.min(list.size(), 5); i2++) {
                    arrayList.add(w96.mo26465b((qh5) list.get(i2)).mo13084b());
                }
                d = this.f16990a.f11076a;
            }
            d.mo17036a(i, b2, arrayList, this.f16991b, this.f16992c);
        }
        return qh5.f19182a;
    }
}
