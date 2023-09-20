package com.onedelhi.secure;

import java.util.Collection;
import java.util.Map;

public final class xl2 extends rv2 {

    /* renamed from: b */
    public static final im4[] f37529b = new im4[0];

    /* renamed from: a */
    public final im4[] f37530a;

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public xl2(java.util.Map<com.onedelhi.secure.pf0, ?> r3) {
        /*
            r2 = this;
            r2.<init>()
            if (r3 != 0) goto L_0x0007
            r3 = 0
            goto L_0x000f
        L_0x0007:
            com.onedelhi.secure.pf0 r0 = com.onedelhi.secure.pf0.POSSIBLE_FORMATS
            java.lang.Object r3 = r3.get(r0)
            java.util.Collection r3 = (java.util.Collection) r3
        L_0x000f:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r3 == 0) goto L_0x0055
            com.onedelhi.secure.yi r1 = com.onedelhi.secure.C7363yi.EAN_13
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L_0x0027
            com.onedelhi.secure.tq0 r1 = new com.onedelhi.secure.tq0
            r1.<init>()
        L_0x0023:
            r0.add(r1)
            goto L_0x0035
        L_0x0027:
            com.onedelhi.secure.yi r1 = com.onedelhi.secure.C7363yi.UPC_A
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L_0x0035
            com.onedelhi.secure.dm4 r1 = new com.onedelhi.secure.dm4
            r1.<init>()
            goto L_0x0023
        L_0x0035:
            com.onedelhi.secure.yi r1 = com.onedelhi.secure.C7363yi.EAN_8
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L_0x0045
            com.onedelhi.secure.vq0 r1 = new com.onedelhi.secure.vq0
            r1.<init>()
            r0.add(r1)
        L_0x0045:
            com.onedelhi.secure.yi r1 = com.onedelhi.secure.C7363yi.UPC_E
            boolean r3 = r3.contains(r1)
            if (r3 == 0) goto L_0x0055
            com.onedelhi.secure.km4 r3 = new com.onedelhi.secure.km4
            r3.<init>()
            r0.add(r3)
        L_0x0055:
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L_0x0073
            com.onedelhi.secure.tq0 r3 = new com.onedelhi.secure.tq0
            r3.<init>()
            r0.add(r3)
            com.onedelhi.secure.vq0 r3 = new com.onedelhi.secure.vq0
            r3.<init>()
            r0.add(r3)
            com.onedelhi.secure.km4 r3 = new com.onedelhi.secure.km4
            r3.<init>()
            r0.add(r3)
        L_0x0073:
            com.onedelhi.secure.im4[] r3 = f37529b
            java.lang.Object[] r3 = r0.toArray(r3)
            com.onedelhi.secure.im4[] r3 = (com.onedelhi.secure.im4[]) r3
            r2.f37530a = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.xl2.<init>(java.util.Map):void");
    }

    /* renamed from: c */
    public ol3 mo31296c(int i, C6014ll llVar, Map<pf0, ?> map) throws tr2 {
        boolean z;
        int[] p = im4.m52456p(llVar);
        im4[] im4Arr = this.f37530a;
        int i2 = 0;
        while (i2 < im4Arr.length) {
            try {
                ol3 m = im4Arr[i2].mo34504m(i, llVar, p, map);
                boolean z2 = m.mo41824b() == C7363yi.EAN_13 && m.mo41829g().charAt(0) == '0';
                Collection collection = map == null ? null : (Collection) map.get(pf0.POSSIBLE_FORMATS);
                if (collection != null) {
                    if (!collection.contains(C7363yi.UPC_A)) {
                        z = false;
                        if (z2 || !z) {
                            return m;
                        }
                        ol3 ol3 = new ol3(m.mo41829g().substring(1), m.mo41826d(), m.mo41828f(), C7363yi.UPC_A);
                        ol3.mo41831i(m.mo41827e());
                        return ol3;
                    }
                }
                z = true;
                if (z2) {
                }
                return m;
            } catch (wf3 unused) {
                i2++;
            }
        }
        throw tr2.m66179a();
    }

    public void reset() {
        for (im4 reset : this.f37530a) {
            reset.reset();
        }
    }
}
