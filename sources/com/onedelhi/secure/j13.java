package com.onedelhi.secure;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class j13 {

    /* renamed from: a */
    public final Comparator<fy2<String, Float>> f13977a = new C2467a();

    /* renamed from: a */
    public final Map<String, zf2> f13978a = new HashMap();

    /* renamed from: a */
    public final Set<C2468b> f13979a = new C3679ua();

    /* renamed from: a */
    public boolean f13980a = false;

    /* renamed from: com.onedelhi.secure.j13$a */
    public class C2467a implements Comparator<fy2<String, Float>> {
        public C2467a() {
        }

        /* renamed from: a */
        public int compare(fy2<String, Float> fy2, fy2<String, Float> fy22) {
            float floatValue = ((Float) fy2.f12386b).floatValue();
            float floatValue2 = ((Float) fy22.f12386b).floatValue();
            if (floatValue2 > floatValue) {
                return 1;
            }
            return floatValue > floatValue2 ? -1 : 0;
        }
    }

    /* renamed from: com.onedelhi.secure.j13$b */
    public interface C2468b {
        /* renamed from: a */
        void mo18083a(float f);
    }

    /* renamed from: a */
    public void mo18074a(C2468b bVar) {
        this.f13979a.add(bVar);
    }

    /* renamed from: b */
    public void mo18075b() {
        this.f13978a.clear();
    }

    /* renamed from: c */
    public List<fy2<String, Float>> mo18076c() {
        if (!this.f13980a) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(this.f13978a.size());
        for (Map.Entry next : this.f13978a.entrySet()) {
            arrayList.add(new fy2(next.getKey(), Float.valueOf(((zf2) next.getValue()).mo27963b())));
        }
        Collections.sort(arrayList, this.f13977a);
        return arrayList;
    }

    /* renamed from: d */
    public void mo18077d() {
        if (this.f13980a) {
            List<fy2<String, Float>> c = mo18076c();
            Log.d(h02.f12850a, "Render times:");
            for (int i = 0; i < c.size(); i++) {
                fy2 fy2 = c.get(i);
                Log.d(h02.f12850a, String.format("\t\t%30s:%.2f", new Object[]{fy2.f12385a, fy2.f12386b}));
            }
        }
    }

    /* renamed from: e */
    public void mo18078e(String str, float f) {
        if (this.f13980a) {
            zf2 zf2 = this.f13978a.get(str);
            if (zf2 == null) {
                zf2 = new zf2();
                this.f13978a.put(str, zf2);
            }
            zf2.mo27962a(f);
            if (str.equals("__container")) {
                for (C2468b a : this.f13979a) {
                    a.mo18083a(f);
                }
            }
        }
    }

    /* renamed from: f */
    public void mo18079f(C2468b bVar) {
        this.f13979a.remove(bVar);
    }

    /* renamed from: g */
    public void mo18080g(boolean z) {
        this.f13980a = z;
    }
}
