package com.onedelhi.secure;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public final class wl2 implements uf3 {

    /* renamed from: b */
    public static final uf3[] f37038b = new uf3[0];

    /* renamed from: a */
    public Map<pf0, ?> f37039a;

    /* renamed from: a */
    public uf3[] f37040a;

    /* renamed from: a */
    public ol3 mo34501a(C6969uk ukVar) throws tr2 {
        mo46799e((Map<pf0, ?>) null);
        return mo46797c(ukVar);
    }

    /* renamed from: b */
    public ol3 mo34502b(C6969uk ukVar, Map<pf0, ?> map) throws tr2 {
        mo46799e(map);
        return mo46797c(ukVar);
    }

    /* renamed from: c */
    public final ol3 mo46797c(C6969uk ukVar) throws tr2 {
        uf3[] uf3Arr = this.f37040a;
        if (uf3Arr != null) {
            int length = uf3Arr.length;
            int i = 0;
            while (i < length) {
                try {
                    return uf3Arr[i].mo34502b(ukVar, this.f37039a);
                } catch (wf3 unused) {
                    i++;
                }
            }
        }
        throw tr2.m66179a();
    }

    /* renamed from: d */
    public ol3 mo46798d(C6969uk ukVar) throws tr2 {
        if (this.f37040a == null) {
            mo46799e((Map<pf0, ?>) null);
        }
        return mo46797c(ukVar);
    }

    /* renamed from: e */
    public void mo46799e(Map<pf0, ?> map) {
        this.f37039a = map;
        boolean z = true;
        boolean z2 = map != null && map.containsKey(pf0.TRY_HARDER);
        Collection collection = map == null ? null : (Collection) map.get(pf0.POSSIBLE_FORMATS);
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (!collection.contains(C7363yi.UPC_A) && !collection.contains(C7363yi.UPC_E) && !collection.contains(C7363yi.EAN_13) && !collection.contains(C7363yi.EAN_8) && !collection.contains(C7363yi.CODABAR) && !collection.contains(C7363yi.CODE_39) && !collection.contains(C7363yi.CODE_93) && !collection.contains(C7363yi.CODE_128) && !collection.contains(C7363yi.ITF) && !collection.contains(C7363yi.RSS_14) && !collection.contains(C7363yi.RSS_EXPANDED)) {
                z = false;
            }
            if (z && !z2) {
                arrayList.add(new vl2(map));
            }
            if (collection.contains(C7363yi.QR_CODE)) {
                arrayList.add(new w83());
            }
            if (collection.contains(C7363yi.DATA_MATRIX)) {
                arrayList.add(new sd0());
            }
            if (collection.contains(C7363yi.AZTEC)) {
                arrayList.add(new C7168wh());
            }
            if (collection.contains(C7363yi.PDF_417)) {
                arrayList.add(new ox2());
            }
            if (collection.contains(C7363yi.MAXICODE)) {
                arrayList.add(new xf2());
            }
            if (z && z2) {
                arrayList.add(new vl2(map));
            }
        }
        if (arrayList.isEmpty()) {
            if (!z2) {
                arrayList.add(new vl2(map));
            }
            arrayList.add(new w83());
            arrayList.add(new sd0());
            arrayList.add(new C7168wh());
            arrayList.add(new ox2());
            arrayList.add(new xf2());
            if (z2) {
                arrayList.add(new vl2(map));
            }
        }
        this.f37040a = (uf3[]) arrayList.toArray(f37038b);
    }

    public void reset() {
        uf3[] uf3Arr = this.f37040a;
        if (uf3Arr != null) {
            for (uf3 reset : uf3Arr) {
                reset.reset();
            }
        }
    }
}
