package com.onedelhi.secure;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

public class wd2 {

    /* renamed from: a */
    public final List<C2760lj<xw3, Path>> f22085a;

    /* renamed from: b */
    public final List<C2760lj<Integer, Integer>> f22086b;

    /* renamed from: c */
    public final List<td2> f22087c;

    public wd2(List<td2> list) {
        this.f22087c = list;
        this.f22085a = new ArrayList(list.size());
        this.f22086b = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.f22085a.add(list.get(i).mo24872b().mo17597a());
            this.f22086b.add(list.get(i).mo24873c().mo17597a());
        }
    }

    /* renamed from: a */
    public List<C2760lj<xw3, Path>> mo26492a() {
        return this.f22085a;
    }

    /* renamed from: b */
    public List<td2> mo26493b() {
        return this.f22087c;
    }

    /* renamed from: c */
    public List<C2760lj<Integer, Integer>> mo26494c() {
        return this.f22086b;
    }
}
