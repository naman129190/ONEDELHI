package com.onedelhi.secure;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class oo6 {

    /* renamed from: a */
    public static final /* synthetic */ int f18056a = 0;

    /* renamed from: a */
    public static volatile oo6 f18057a = null;

    /* renamed from: a */
    public static volatile boolean f18058a = false;

    /* renamed from: b */
    public static final oo6 f18059b = new oo6(true);

    /* renamed from: a */
    public final Map f18060a;

    public oo6() {
        this.f18060a = new HashMap();
    }

    public oo6(boolean z) {
        this.f18060a = Collections.emptyMap();
    }

    /* renamed from: a */
    public static oo6 m23967a() {
        Class<oo6> cls = oo6.class;
        oo6 oo6 = f18057a;
        if (oo6 != null) {
            return oo6;
        }
        synchronized (cls) {
            oo6 oo62 = f18057a;
            if (oo62 != null) {
                return oo62;
            }
            oo6 b = ep6.m13937b(cls);
            f18057a = b;
            return b;
        }
    }

    /* renamed from: b */
    public final mp6 mo22047b(vs6 vs6, int i) {
        return (mp6) this.f18060a.get(new mo6(vs6, i));
    }
}
