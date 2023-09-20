package com.onedelhi.secure;

import java.util.List;

public class gi1 extends fz1<ei1> {

    /* renamed from: a */
    public final ei1 f12599a;

    public gi1(List<ez1<ei1>> list) {
        super(list);
        int i = 0;
        ei1 ei1 = (ei1) list.get(0).f11775a;
        i = ei1 != null ? ei1.mo15192c() : i;
        this.f12599a = new ei1(new float[i], new int[i]);
    }

    /* renamed from: o */
    public ei1 mo14089i(ez1<ei1> ez1, float f) {
        this.f12599a.mo15193d((ei1) ez1.f11775a, (ei1) ez1.f11779b, f);
        return this.f12599a;
    }
}
