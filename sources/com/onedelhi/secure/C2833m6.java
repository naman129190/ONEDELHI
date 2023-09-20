package com.onedelhi.secure;

import android.graphics.PointF;
import java.util.Collections;
import java.util.List;

/* renamed from: com.onedelhi.secure.m6 */
public class C2833m6 implements C3900x6<PointF, PointF> {

    /* renamed from: a */
    public final List<ez1<PointF>> f15910a;

    public C2833m6() {
        this.f15910a = Collections.singletonList(new ez1(new PointF(0.0f, 0.0f)));
    }

    public C2833m6(List<ez1<PointF>> list) {
        this.f15910a = list;
    }

    /* renamed from: a */
    public C2760lj<PointF, PointF> mo17597a() {
        return this.f15910a.get(0).mo15665h() ? new x23(this.f15910a) : new uz2(this.f15910a);
    }

    /* renamed from: b */
    public boolean mo17292b() {
        return this.f15910a.size() == 1 && this.f15910a.get(0).mo15665h();
    }

    /* renamed from: c */
    public List<ez1<PointF>> mo17293c() {
        return this.f15910a;
    }
}
