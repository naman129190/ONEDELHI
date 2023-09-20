package com.onedelhi.secure;

import android.graphics.PointF;
import java.util.List;

/* renamed from: com.onedelhi.secure.r6 */
public class C3367r6 implements C3900x6<PointF, PointF> {

    /* renamed from: a */
    public final C2475j6 f19618a;

    /* renamed from: b */
    public final C2475j6 f19619b;

    public C3367r6(C2475j6 j6Var, C2475j6 j6Var2) {
        this.f19618a = j6Var;
        this.f19619b = j6Var2;
    }

    /* renamed from: a */
    public C2760lj<PointF, PointF> mo17597a() {
        return new y14(this.f19618a.mo17597a(), this.f19619b.mo17597a());
    }

    /* renamed from: b */
    public boolean mo17292b() {
        return this.f19618a.mo17292b() && this.f19619b.mo17292b();
    }

    /* renamed from: c */
    public List<ez1<PointF>> mo17293c() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }
}
