package com.onedelhi.secure;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public final class vl2 extends rv2 {

    /* renamed from: b */
    public static final rv2[] f36590b = new rv2[0];

    /* renamed from: a */
    public final rv2[] f36591a;

    public vl2(Map<pf0, ?> map) {
        Collection collection = map == null ? null : (Collection) map.get(pf0.POSSIBLE_FORMATS);
        boolean z = (map == null || map.get(pf0.ASSUME_CODE_39_CHECK_DIGIT) == null) ? false : true;
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(C7363yi.EAN_13) || collection.contains(C7363yi.UPC_A) || collection.contains(C7363yi.EAN_8) || collection.contains(C7363yi.UPC_E)) {
                arrayList.add(new xl2(map));
            }
            if (collection.contains(C7363yi.CODE_39)) {
                arrayList.add(new C7525zz(z));
            }
            if (collection.contains(C7363yi.CODE_93)) {
                arrayList.add(new b00());
            }
            if (collection.contains(C7363yi.CODE_128)) {
                arrayList.add(new C7284xz());
            }
            if (collection.contains(C7363yi.ITF)) {
                arrayList.add(new co1());
            }
            if (collection.contains(C7363yi.CODABAR)) {
                arrayList.add(new C6988uz());
            }
            if (collection.contains(C7363yi.RSS_14)) {
                arrayList.add(new he3());
            }
            if (collection.contains(C7363yi.RSS_EXPANDED)) {
                arrayList.add(new ie3());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new xl2(map));
            arrayList.add(new C7525zz());
            arrayList.add(new C6988uz());
            arrayList.add(new b00());
            arrayList.add(new C7284xz());
            arrayList.add(new co1());
            arrayList.add(new he3());
            arrayList.add(new ie3());
        }
        this.f36591a = (rv2[]) arrayList.toArray(f36590b);
    }

    /* renamed from: c */
    public ol3 mo31296c(int i, C6014ll llVar, Map<pf0, ?> map) throws tr2 {
        rv2[] rv2Arr = this.f36591a;
        int i2 = 0;
        while (i2 < rv2Arr.length) {
            try {
                return rv2Arr[i2].mo31296c(i, llVar, map);
            } catch (wf3 unused) {
                i2++;
            }
        }
        throw tr2.m66179a();
    }

    public void reset() {
        for (rv2 reset : this.f36591a) {
            reset.reset();
        }
    }
}
