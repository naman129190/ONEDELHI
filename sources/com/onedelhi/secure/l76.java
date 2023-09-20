package com.onedelhi.secure;

import java.util.Collections;
import java.util.List;

public final class l76 extends x76 {

    /* renamed from: a */
    public static final Class f15177a = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public l76() {
        super((u76) null);
    }

    public /* synthetic */ l76(i76 i76) {
        super((u76) null);
    }

    /* renamed from: a */
    public final void mo19293a(Object obj, long j) {
        Object obj2;
        List list = (List) kf6.m19750f(obj, j);
        if (list instanceof f76) {
            obj2 = ((f76) list).mo14060j2();
        } else if (!f15177a.isAssignableFrom(list.getClass())) {
            if (!(list instanceof ab6) || !(list instanceof q56)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                q56 q56 = (q56) list;
                if (q56.mo19982c()) {
                    q56.mo19980a();
                    return;
                }
                return;
            }
        } else {
            return;
        }
        kf6.m19760p(obj, j, obj2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: com.onedelhi.secure.c76} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: com.onedelhi.secure.c76} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: com.onedelhi.secure.c76} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009c  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19294b(java.lang.Object r5, java.lang.Object r6, long r7) {
        /*
            r4 = this;
            java.lang.Object r6 = com.onedelhi.secure.kf6.m19750f(r6, r7)
            java.util.List r6 = (java.util.List) r6
            int r0 = r6.size()
            java.lang.Object r1 = com.onedelhi.secure.kf6.m19750f(r5, r7)
            java.util.List r1 = (java.util.List) r1
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x0039
            boolean r2 = r1 instanceof com.onedelhi.secure.f76
            if (r2 == 0) goto L_0x0020
            com.onedelhi.secure.c76 r1 = new com.onedelhi.secure.c76
            r1.<init>((int) r0)
            goto L_0x0035
        L_0x0020:
            boolean r2 = r1 instanceof com.onedelhi.secure.ab6
            if (r2 == 0) goto L_0x0030
            boolean r2 = r1 instanceof com.onedelhi.secure.q56
            if (r2 == 0) goto L_0x0030
            com.onedelhi.secure.q56 r1 = (com.onedelhi.secure.q56) r1
            com.onedelhi.secure.q56 r0 = r1.mo12861z1(r0)
            r1 = r0
            goto L_0x0035
        L_0x0030:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
        L_0x0035:
            com.onedelhi.secure.kf6.m19760p(r5, r7, r1)
            goto L_0x008a
        L_0x0039:
            java.lang.Class r2 = f15177a
            java.lang.Class r3 = r1.getClass()
            boolean r2 = r2.isAssignableFrom(r3)
            if (r2 == 0) goto L_0x0057
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>(r3)
            r2.addAll(r1)
        L_0x0052:
            com.onedelhi.secure.kf6.m19760p(r5, r7, r2)
            r1 = r2
            goto L_0x008a
        L_0x0057:
            boolean r2 = r1 instanceof com.onedelhi.secure.ve6
            if (r2 == 0) goto L_0x006f
            com.onedelhi.secure.c76 r2 = new com.onedelhi.secure.c76
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>((int) r3)
            com.onedelhi.secure.ve6 r1 = (com.onedelhi.secure.ve6) r1
            int r0 = r2.size()
            r2.addAll(r0, r1)
            goto L_0x0052
        L_0x006f:
            boolean r2 = r1 instanceof com.onedelhi.secure.ab6
            if (r2 == 0) goto L_0x008a
            boolean r2 = r1 instanceof com.onedelhi.secure.q56
            if (r2 == 0) goto L_0x008a
            r2 = r1
            com.onedelhi.secure.q56 r2 = (com.onedelhi.secure.q56) r2
            boolean r3 = r2.mo19982c()
            if (r3 != 0) goto L_0x008a
            int r1 = r1.size()
            int r1 = r1 + r0
            com.onedelhi.secure.q56 r1 = r2.mo12861z1(r1)
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
            com.onedelhi.secure.kf6.m19760p(r5, r7, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.l76.mo19294b(java.lang.Object, java.lang.Object, long):void");
    }
}
