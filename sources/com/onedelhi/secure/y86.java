package com.onedelhi.secure;

import java.util.Map;

public final class y86 implements fv6 {

    /* renamed from: a */
    public final /* synthetic */ b96 f22940a;

    /* renamed from: a */
    public final /* synthetic */ String f22941a;

    public y86(b96 b96, String str) {
        this.f22940a = b96;
        this.f22941a = str;
    }

    /* renamed from: a */
    public final String mo16197a(String str) {
        Map map = (Map) this.f22940a.f9770a.get(this.f22941a);
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return (String) map.get(str);
    }
}
