package com.onedelhi.secure;

import android.os.Bundle;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;
import java.util.ArrayList;
import java.util.Collections;

public final class x07 implements Api.ApiOptions.Optional {

    /* renamed from: a */
    public static final x07 f22370a;

    /* renamed from: a */
    public final Bundle f22371a;

    static {
        Bundle bundle = new Bundle();
        if (!bundle.containsKey("accountTypes")) {
            bundle.putStringArrayList("accountTypes", new ArrayList(0));
        }
        f22370a = new x07(bundle, (fz6) null);
    }

    public /* synthetic */ x07(Bundle bundle, fz6 fz6) {
        this.f22371a = bundle;
    }

    /* renamed from: a */
    public final Bundle mo26733a() {
        return new Bundle(this.f22371a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r7 instanceof com.onedelhi.secure.x07
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            com.onedelhi.secure.x07 r7 = (com.onedelhi.secure.x07) r7
            android.os.Bundle r1 = r6.mo26733a()
            android.os.Bundle r7 = r7.mo26733a()
            int r3 = r1.size()
            int r4 = r7.size()
            if (r3 == r4) goto L_0x001f
            return r2
        L_0x001f:
            java.util.Set r3 = r1.keySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x0027:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0049
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            boolean r5 = r7.containsKey(r4)
            if (r5 != 0) goto L_0x003a
            return r2
        L_0x003a:
            java.lang.Object r5 = r1.get(r4)
            java.lang.Object r4 = r7.get(r4)
            boolean r4 = com.google.android.gms.common.internal.Objects.equal(r5, r4)
            if (r4 != 0) goto L_0x0027
            return r2
        L_0x0049:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.x07.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Bundle a = mo26733a();
        int size = a.size();
        ArrayList arrayList = new ArrayList(size + size);
        ArrayList arrayList2 = new ArrayList(a.keySet());
        Collections.sort(arrayList2);
        int size2 = arrayList2.size();
        for (int i = 0; i < size2; i++) {
            String str = (String) arrayList2.get(i);
            arrayList.add(str);
            arrayList.add(a.get(str));
        }
        return Objects.hashCode(arrayList);
    }
}
