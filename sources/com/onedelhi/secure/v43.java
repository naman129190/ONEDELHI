package com.onedelhi.secure;

import android.graphics.Rect;
import android.util.Log;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public abstract class v43 {

    /* renamed from: a */
    public static final String f36425a = "v43";

    /* renamed from: com.onedelhi.secure.v43$a */
    public class C7011a implements Comparator<pz3> {

        /* renamed from: a */
        public final /* synthetic */ pz3 f36426a;

        public C7011a(pz3 pz3) {
            this.f36426a = pz3;
        }

        /* renamed from: a */
        public int compare(pz3 pz3, pz3 pz32) {
            return Float.compare(v43.this.mo34241c(pz32, this.f36426a), v43.this.mo34241c(pz3, this.f36426a));
        }
    }

    /* renamed from: a */
    public List<pz3> mo45997a(List<pz3> list, pz3 pz3) {
        if (pz3 == null) {
            return list;
        }
        Collections.sort(list, new C7011a(pz3));
        return list;
    }

    /* renamed from: b */
    public pz3 mo42357b(List<pz3> list, pz3 pz3) {
        List<pz3> a = mo45997a(list, pz3);
        String str = f36425a;
        Log.i(str, "Viewfinder size: " + pz3);
        Log.i(str, "Preview in order of preference: " + a);
        return a.get(0);
    }

    /* renamed from: c */
    public float mo34241c(pz3 pz3, pz3 pz32) {
        return 0.5f;
    }

    /* renamed from: d */
    public abstract Rect mo34242d(pz3 pz3, pz3 pz32);
}
