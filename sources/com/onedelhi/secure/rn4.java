package com.onedelhi.secure;

import java.util.Collections;
import java.util.List;

public class rn4 extends RuntimeException {

    /* renamed from: b */
    public static final long f34693b = -7466929953374883507L;

    /* renamed from: a */
    public final List<String> f34694a;

    public rn4(yh2 yh2) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f34694a = null;
    }

    public rn4(List<String> list) {
        super(m63764b(list));
        this.f34694a = list;
    }

    /* renamed from: b */
    public static String m63764b(List<String> list) {
        StringBuilder sb = new StringBuilder("Message missing required fields: ");
        boolean z = true;
        for (String next : list) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(next);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public nt1 mo43961a() {
        return new nt1(getMessage());
    }

    /* renamed from: c */
    public List<String> mo43962c() {
        return Collections.unmodifiableList(this.f34694a);
    }
}
