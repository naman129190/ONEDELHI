package com.onedelhi.secure;

import android.graphics.Rect;
import android.util.Log;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class p22 extends v43 {

    /* renamed from: b */
    public static final String f33440b = "p22";

    /* renamed from: com.onedelhi.secure.p22$a */
    public class C6359a implements Comparator<pz3> {

        /* renamed from: a */
        public final /* synthetic */ pz3 f33442a;

        public C6359a(pz3 pz3) {
            this.f33442a = pz3;
        }

        /* renamed from: a */
        public int compare(pz3 pz3, pz3 pz32) {
            int i = p22.m60400e(pz3, this.f33442a).f33850n - pz3.f33850n;
            int i2 = p22.m60400e(pz32, this.f33442a).f33850n - pz32.f33850n;
            if (i == 0 && i2 == 0) {
                return pz3.compareTo(pz32);
            }
            if (i == 0) {
                return -1;
            }
            if (i2 == 0) {
                return 1;
            }
            return (i >= 0 || i2 >= 0) ? (i <= 0 || i2 <= 0) ? i < 0 ? -1 : 1 : -pz3.compareTo(pz32) : pz3.compareTo(pz32);
        }
    }

    /* renamed from: e */
    public static pz3 m60400e(pz3 pz3, pz3 pz32) {
        pz3 g;
        if (!pz32.mo42985b(pz3)) {
            do {
                pz3 g2 = pz3.mo42989g(3, 2);
                pz3 = pz3.mo42989g(2, 1);
                if (pz32.mo42985b(g2)) {
                    return g2;
                }
            } while (!pz32.mo42985b(pz3));
            return pz3;
        }
        while (true) {
            g = pz3.mo42989g(2, 3);
            pz3 g3 = pz3.mo42989g(1, 2);
            if (!pz32.mo42985b(g3)) {
                break;
            }
            pz3 = g3;
        }
        return pz32.mo42985b(g) ? g : pz3;
    }

    /* renamed from: b */
    public pz3 mo42357b(List<pz3> list, pz3 pz3) {
        if (pz3 != null) {
            Collections.sort(list, new C6359a(pz3));
            String str = f33440b;
            Log.i(str, "Viewfinder size: " + pz3);
            Log.i(str, "Preview in order of preference: " + list);
        }
        return list.get(0);
    }

    /* renamed from: d */
    public Rect mo34242d(pz3 pz3, pz3 pz32) {
        pz3 e = m60400e(pz3, pz32);
        String str = f33440b;
        Log.i(str, "Preview: " + pz3 + "; Scaled: " + e + "; Want: " + pz32);
        int i = (e.f33850n - pz32.f33850n) / 2;
        int i2 = (e.f33851o - pz32.f33851o) / 2;
        return new Rect(-i, -i2, e.f33850n - i, e.f33851o - i2);
    }
}
