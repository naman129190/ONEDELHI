package com.onedelhi.secure;

import java.util.Collections;
import java.util.List;

public final class mr6 extends qr6 {

    /* renamed from: a */
    public static final Class f16275a = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public mr6() {
        super((pr6) null);
    }

    public /* synthetic */ mr6(lr6 lr6) {
        super((pr6) null);
    }

    /* renamed from: a */
    public final void mo20589a(Object obj, long j) {
        Object obj2;
        List list = (List) zu6.m33464k(obj, j);
        if (list instanceof kr6) {
            obj2 = ((kr6) list).mo18559c2();
        } else if (!f16275a.isAssignableFrom(list.getClass())) {
            if (!(list instanceof ct6) || !(list instanceof xq6)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                xq6 xq6 = (xq6) list;
                if (xq6.mo23936c()) {
                    xq6.mo23934a();
                    return;
                }
                return;
            }
        } else {
            return;
        }
        zu6.m33477x(obj, j, obj2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: com.onedelhi.secure.jr6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: com.onedelhi.secure.jr6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: com.onedelhi.secure.jr6} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009c  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo20590b(java.lang.Object r5, java.lang.Object r6, long r7) {
        /*
            r4 = this;
            java.lang.Object r6 = com.onedelhi.secure.zu6.m33464k(r6, r7)
            java.util.List r6 = (java.util.List) r6
            int r0 = r6.size()
            java.lang.Object r1 = com.onedelhi.secure.zu6.m33464k(r5, r7)
            java.util.List r1 = (java.util.List) r1
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x0039
            boolean r2 = r1 instanceof com.onedelhi.secure.kr6
            if (r2 == 0) goto L_0x0020
            com.onedelhi.secure.jr6 r1 = new com.onedelhi.secure.jr6
            r1.<init>((int) r0)
            goto L_0x0035
        L_0x0020:
            boolean r2 = r1 instanceof com.onedelhi.secure.ct6
            if (r2 == 0) goto L_0x0030
            boolean r2 = r1 instanceof com.onedelhi.secure.xq6
            if (r2 == 0) goto L_0x0030
            com.onedelhi.secure.xq6 r1 = (com.onedelhi.secure.xq6) r1
            com.onedelhi.secure.xq6 r0 = r1.mo14324d2(r0)
            r1 = r0
            goto L_0x0035
        L_0x0030:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
        L_0x0035:
            com.onedelhi.secure.zu6.m33477x(r5, r7, r1)
            goto L_0x008a
        L_0x0039:
            java.lang.Class r2 = f16275a
            java.lang.Class r3 = r1.getClass()
            boolean r2 = r2.isAssignableFrom(r3)
            if (r2 == 0) goto L_0x0057
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>(r3)
            r2.addAll(r1)
        L_0x0052:
            com.onedelhi.secure.zu6.m33477x(r5, r7, r2)
            r1 = r2
            goto L_0x008a
        L_0x0057:
            boolean r2 = r1 instanceof com.onedelhi.secure.uu6
            if (r2 == 0) goto L_0x006f
            com.onedelhi.secure.jr6 r2 = new com.onedelhi.secure.jr6
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>((int) r3)
            com.onedelhi.secure.uu6 r1 = (com.onedelhi.secure.uu6) r1
            int r0 = r2.size()
            r2.addAll(r0, r1)
            goto L_0x0052
        L_0x006f:
            boolean r2 = r1 instanceof com.onedelhi.secure.ct6
            if (r2 == 0) goto L_0x008a
            boolean r2 = r1 instanceof com.onedelhi.secure.xq6
            if (r2 == 0) goto L_0x008a
            r2 = r1
            com.onedelhi.secure.xq6 r2 = (com.onedelhi.secure.xq6) r2
            boolean r3 = r2.mo23936c()
            if (r3 != 0) goto L_0x008a
            int r1 = r1.size()
            int r1 = r1 + r0
            com.onedelhi.secure.xq6 r1 = r2.mo14324d2(r1)
            goto L_0x0035
        L_0x008a:
            int r0 = r1.size()
            int r2 = r6.size()
            if (r0 <= 0) goto L_0x0099
            if (r2 <= 0) goto L_0x0099
            r1.addAll(r6)
        L_0x0099:
            if (r0 > 0) goto L_0x009c
            goto L_0x009d
        L_0x009c:
            r6 = r1
        L_0x009d:
            com.onedelhi.secure.zu6.m33477x(r5, r7, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.mr6.mo20590b(java.lang.Object, java.lang.Object, long):void");
    }
}
