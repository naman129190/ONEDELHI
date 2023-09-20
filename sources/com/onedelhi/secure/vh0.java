package com.onedelhi.secure;

import java.util.Iterator;
import java.util.Set;

public class vh0 implements wp4 {

    /* renamed from: a */
    public final ih1 f36547a;

    /* renamed from: a */
    public final String f36548a;

    public vh0(Set<s22> set, ih1 ih1) {
        this.f36548a = m68084d(set);
        this.f36547a = ih1;
    }

    /* renamed from: b */
    public static a30<wp4> m68082b() {
        return a30.m36014h(wp4.class).mo30433b(rj0.m63683q(s22.class)).mo30437f(uh0.f36110a).mo30435d();
    }

    /* renamed from: c */
    public static /* synthetic */ wp4 m68083c(g30 g30) {
        return new vh0(g30.mo36551h(s22.class), ih1.m52278a());
    }

    /* renamed from: d */
    public static String m68084d(Set<s22> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<s22> it = set.iterator();
        while (it.hasNext()) {
            s22 next = it.next();
            sb.append(next.mo44156b());
            sb.append('/');
            sb.append(next.mo44157c());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    /* renamed from: b1 */
    public String mo46155b1() {
        if (this.f36547a.mo38096b().isEmpty()) {
            return this.f36548a;
        }
        return this.f36548a + ' ' + m68084d(this.f36547a.mo38096b());
    }
}
