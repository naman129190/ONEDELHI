package com.onedelhi.secure;

import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;

public class q30 implements s30 {
    /* renamed from: c */
    public static /* synthetic */ Object m62016c(String str, a30 a30, g30 g30) {
        try {
            x61.m69933b(str);
            return a30.mo30424k().mo32374a(g30);
        } finally {
            x61.m69932a();
        }
    }

    /* renamed from: a */
    public List<a30<?>> mo43099a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (a30 next : componentRegistrar.getComponents()) {
            String l = next.mo30425l();
            if (l != null) {
                next = next.mo30422E(new p30(l, next));
            }
            arrayList.add(next);
        }
        return arrayList;
    }
}
