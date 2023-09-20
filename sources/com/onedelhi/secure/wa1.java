package com.onedelhi.secure;

import androidx.fragment.app.Fragment;
import java.util.Collection;
import java.util.Map;

@Deprecated
public class wa1 {
    @ts2

    /* renamed from: a */
    public final Collection<Fragment> f22073a;
    @ts2

    /* renamed from: a */
    public final Map<String, wa1> f22074a;
    @ts2

    /* renamed from: b */
    public final Map<String, gu4> f22075b;

    public wa1(@ts2 Collection<Fragment> collection, @ts2 Map<String, wa1> map, @ts2 Map<String, gu4> map2) {
        this.f22073a = collection;
        this.f22074a = map;
        this.f22075b = map2;
    }

    @ts2
    /* renamed from: a */
    public Map<String, wa1> mo26472a() {
        return this.f22074a;
    }

    @ts2
    /* renamed from: b */
    public Collection<Fragment> mo26473b() {
        return this.f22073a;
    }

    @ts2
    /* renamed from: c */
    public Map<String, gu4> mo26474c() {
        return this.f22075b;
    }

    /* renamed from: d */
    public boolean mo26475d(Fragment fragment) {
        Collection<Fragment> collection = this.f22073a;
        if (collection == null) {
            return false;
        }
        return collection.contains(fragment);
    }
}
