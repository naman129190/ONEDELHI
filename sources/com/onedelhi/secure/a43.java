package com.onedelhi.secure;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class a43 {

    /* renamed from: a */
    public int f8721a;

    /* renamed from: a */
    public final List<b43> f8722a;

    /* renamed from: a */
    public final Map<b43, Integer> f8723a;

    /* renamed from: b */
    public int f8724b;

    public a43(Map<b43, Integer> map) {
        this.f8723a = map;
        this.f8722a = new ArrayList(map.keySet());
        for (Integer intValue : map.values()) {
            this.f8721a += intValue.intValue();
        }
    }

    /* renamed from: a */
    public int mo12702a() {
        return this.f8721a;
    }

    /* renamed from: b */
    public boolean mo12703b() {
        return this.f8721a == 0;
    }

    /* renamed from: c */
    public b43 mo12704c() {
        b43 b43 = this.f8722a.get(this.f8724b);
        Integer num = this.f8723a.get(b43);
        if (num.intValue() == 1) {
            this.f8723a.remove(b43);
            this.f8722a.remove(this.f8724b);
        } else {
            this.f8723a.put(b43, Integer.valueOf(num.intValue() - 1));
        }
        this.f8721a--;
        this.f8724b = this.f8722a.isEmpty() ? 0 : (this.f8724b + 1) % this.f8722a.size();
        return b43;
    }
}
