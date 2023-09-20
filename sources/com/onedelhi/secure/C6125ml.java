package com.onedelhi.secure;

import java.util.List;

/* renamed from: com.onedelhi.secure.ml */
public final class C6125ml {
    /* renamed from: a */
    public static C6014ll m57414a(List<ux0> list) {
        int size = (list.size() << 1) - 1;
        if (list.get(list.size() - 1).mo45860c() == null) {
            size--;
        }
        C6014ll llVar = new C6014ll(size * 12);
        int i = 0;
        int b = list.get(0).mo45860c().mo39212b();
        for (int i2 = 11; i2 >= 0; i2--) {
            if (((1 << i2) & b) != 0) {
                llVar.mo39939q(i);
            }
            i++;
        }
        for (int i3 = 1; i3 < list.size(); i3++) {
            ux0 ux0 = list.get(i3);
            int b2 = ux0.mo45859b().mo39212b();
            for (int i4 = 11; i4 >= 0; i4--) {
                if (((1 << i4) & b2) != 0) {
                    llVar.mo39939q(i);
                }
                i++;
            }
            if (ux0.mo45860c() != null) {
                int b3 = ux0.mo45860c().mo39212b();
                for (int i5 = 11; i5 >= 0; i5--) {
                    if (((1 << i5) & b3) != 0) {
                        llVar.mo39939q(i);
                    }
                    i++;
                }
            }
        }
        return llVar;
    }
}
