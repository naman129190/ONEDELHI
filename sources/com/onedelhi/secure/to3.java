package com.onedelhi.secure;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public final class to3 extends rl3 {
    /* renamed from: q */
    public static void m66081q(Collection<String> collection, Collection<String> collection2, String str) {
        int indexOf = str.indexOf(59);
        String str2 = null;
        if (indexOf < 0) {
            collection.add(str);
            collection2.add((Object) null);
            return;
        }
        collection.add(str.substring(0, indexOf));
        String substring = str.substring(indexOf + 1);
        if (substring.startsWith("via=")) {
            str2 = substring.substring(4);
        }
        collection2.add(str2);
    }

    /* renamed from: r */
    public uo3 mo30463k(ol3 ol3) {
        String str;
        String c = rl3.m63723c(ol3);
        String str2 = null;
        if (!c.startsWith("sms:") && !c.startsWith("SMS:") && !c.startsWith("mms:") && !c.startsWith("MMS:")) {
            return null;
        }
        Map<String, String> m = rl3.m63732m(c);
        boolean z = false;
        if (m == null || m.isEmpty()) {
            str = null;
        } else {
            str2 = m.get(tb2.f20734g);
            str = m.get("body");
            z = true;
        }
        int indexOf = c.indexOf(63, 4);
        String substring = (indexOf < 0 || !z) ? c.substring(4) : c.substring(4, indexOf);
        int i = -1;
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        while (true) {
            int i2 = i + 1;
            int indexOf2 = substring.indexOf(44, i2);
            if (indexOf2 > i) {
                m66081q(arrayList, arrayList2, substring.substring(i2, indexOf2));
                i = indexOf2;
            } else {
                m66081q(arrayList, arrayList2, substring.substring(i2));
                String[] strArr = rl3.f34675a;
                return new uo3((String[]) arrayList.toArray(strArr), (String[]) arrayList2.toArray(strArr), str2, str);
            }
        }
    }
}
