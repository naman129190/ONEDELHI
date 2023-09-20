package com.onedelhi.secure;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class gu4 {

    /* renamed from: a */
    public final HashMap<String, au4> f12754a = new HashMap<>();

    /* renamed from: a */
    public final void mo16917a() {
        for (au4 clear : this.f12754a.values()) {
            clear.clear();
        }
        this.f12754a.clear();
    }

    /* renamed from: b */
    public final au4 mo16918b(String str) {
        return this.f12754a.get(str);
    }

    /* renamed from: c */
    public Set<String> mo16919c() {
        return new HashSet(this.f12754a.keySet());
    }

    /* renamed from: d */
    public final void mo16920d(String str, au4 au4) {
        au4 put = this.f12754a.put(str, au4);
        if (put != null) {
            put.onCleared();
        }
    }
}
