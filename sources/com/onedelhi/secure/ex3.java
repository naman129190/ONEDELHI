package com.onedelhi.secure;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.Collections;
import java.util.List;

public class ex3 extends C2861mj {

    /* renamed from: a */
    public final z60 f11735a;

    public ex3(qa2 qa2, m12 m12) {
        super(qa2, m12);
        z60 z60 = new z60(qa2, this, new bx3("__container", m12.mo20024l(), false));
        this.f11735a = z60;
        z60.mo14994g(Collections.emptyList(), Collections.emptyList());
    }

    /* renamed from: E */
    public void mo12680E(wy1 wy1, int i, List<wy1> list, wy1 wy12) {
        this.f11735a.mo14996h(wy1, i, list, wy12);
    }

    /* renamed from: b */
    public void mo12685b(RectF rectF, Matrix matrix, boolean z) {
        super.mo12685b(rectF, matrix, z);
        this.f11735a.mo12685b(rectF, this.f16142b, z);
    }

    /* renamed from: u */
    public void mo12686u(@mr2 Canvas canvas, Matrix matrix, int i) {
        this.f11735a.mo14993f(canvas, matrix, i);
    }
}
