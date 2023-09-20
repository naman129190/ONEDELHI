package com.onedelhi.secure;

import java.util.Collection;
import java.util.EnumMap;
import java.util.Map;

public class yg0 implements fg0 {

    /* renamed from: a */
    public int f37901a;

    /* renamed from: a */
    public String f37902a;

    /* renamed from: a */
    public Collection<C7363yi> f37903a;

    /* renamed from: a */
    public Map<pf0, ?> f37904a;

    public yg0() {
    }

    public yg0(Collection<C7363yi> collection) {
        this.f37903a = collection;
    }

    public yg0(Collection<C7363yi> collection, Map<pf0, ?> map, String str, int i) {
        this.f37903a = collection;
        this.f37904a = map;
        this.f37902a = str;
        this.f37901a = i;
    }

    /* renamed from: a */
    public eg0 mo35939a(Map<pf0, ?> map) {
        EnumMap enumMap = new EnumMap(pf0.class);
        enumMap.putAll(map);
        Map<pf0, ?> map2 = this.f37904a;
        if (map2 != null) {
            enumMap.putAll(map2);
        }
        Collection<C7363yi> collection = this.f37903a;
        if (collection != null) {
            enumMap.put(pf0.POSSIBLE_FORMATS, collection);
        }
        String str = this.f37902a;
        if (str != null) {
            enumMap.put(pf0.CHARACTER_SET, str);
        }
        wl2 wl2 = new wl2();
        wl2.mo46799e(enumMap);
        int i = this.f37901a;
        return i != 0 ? i != 1 ? i != 2 ? new eg0(wl2) : new lj2(wl2) : new wt1(wl2) : new eg0(wl2);
    }
}
