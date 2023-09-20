package com.onedelhi.secure;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.onedelhi.secure.jn3;

/* renamed from: com.onedelhi.secure.fv */
public class C2202fv implements C2461iv {

    /* renamed from: a */
    public final RectF f12335a = new RectF();

    /* renamed from: com.onedelhi.secure.fv$a */
    public class C2203a implements jn3.C2531a {
        public C2203a() {
        }

        /* renamed from: a */
        public void mo14885a(Canvas canvas, RectF rectF, float f, Paint paint) {
            Canvas canvas2 = canvas;
            RectF rectF2 = rectF;
            float f2 = 2.0f * f;
            float width = (rectF.width() - f2) - 1.0f;
            float height = (rectF.height() - f2) - 1.0f;
            if (f >= 1.0f) {
                float f3 = f + 0.5f;
                float f4 = -f3;
                C2202fv.this.f12335a.set(f4, f4, f3, f3);
                int save = canvas.save();
                canvas2.translate(rectF2.left + f3, rectF2.top + f3);
                Paint paint2 = paint;
                canvas.drawArc(C2202fv.this.f12335a, 180.0f, 90.0f, true, paint2);
                canvas2.translate(width, 0.0f);
                canvas2.rotate(90.0f);
                canvas.drawArc(C2202fv.this.f12335a, 180.0f, 90.0f, true, paint2);
                canvas2.translate(height, 0.0f);
                canvas2.rotate(90.0f);
                canvas.drawArc(C2202fv.this.f12335a, 180.0f, 90.0f, true, paint2);
                canvas2.translate(width, 0.0f);
                canvas2.rotate(90.0f);
                canvas.drawArc(C2202fv.this.f12335a, 180.0f, 90.0f, true, paint2);
                canvas2.restoreToCount(save);
                float f5 = rectF2.top;
                canvas.drawRect((rectF2.left + f3) - 1.0f, f5, (rectF2.right - f3) + 1.0f, f5 + f3, paint2);
                float f6 = rectF2.bottom;
                Canvas canvas3 = canvas;
                canvas3.drawRect((rectF2.left + f3) - 1.0f, f6 - f3, (rectF2.right - f3) + 1.0f, f6, paint2);
            }
            canvas.drawRect(rectF2.left, rectF2.top + f, rectF2.right, rectF2.bottom - f, paint);
        }
    }

    /* renamed from: a */
    public void mo15598a(C2366hv hvVar) {
    }

    /* renamed from: b */
    public void mo15599b(C2366hv hvVar) {
        mo16185q(hvVar).mo18502m(hvVar.mo2632b());
        mo15602f(hvVar);
    }

    /* renamed from: c */
    public void mo15600c(C2366hv hvVar, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        jn3 p = mo16184p(context, colorStateList, f, f2, f3);
        p.mo18502m(hvVar.mo2632b());
        hvVar.mo2634d(p);
        mo15602f(hvVar);
    }

    /* renamed from: d */
    public void mo15601d(C2366hv hvVar, float f) {
        mo16185q(hvVar).mo18508q(f);
        mo15602f(hvVar);
    }

    /* renamed from: e */
    public void mo14884e() {
        jn3.f14275a = new C2203a();
    }

    /* renamed from: f */
    public void mo15602f(C2366hv hvVar) {
        Rect rect = new Rect();
        mo16185q(hvVar).mo18496h(rect);
        hvVar.mo2637g((int) Math.ceil((double) mo15611o(hvVar)), (int) Math.ceil((double) mo15607k(hvVar)));
        hvVar.mo2631a(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: g */
    public float mo15603g(C2366hv hvVar) {
        return mo16185q(hvVar).mo18501l();
    }

    /* renamed from: h */
    public void mo15604h(C2366hv hvVar, float f) {
        mo16185q(hvVar).mo18507p(f);
        mo15602f(hvVar);
    }

    /* renamed from: i */
    public float mo15605i(C2366hv hvVar) {
        return mo16185q(hvVar).mo18493g();
    }

    /* renamed from: j */
    public void mo15606j(C2366hv hvVar, float f) {
        mo16185q(hvVar).mo18509r(f);
    }

    /* renamed from: k */
    public float mo15607k(C2366hv hvVar) {
        return mo16185q(hvVar).mo18499j();
    }

    /* renamed from: l */
    public float mo15608l(C2366hv hvVar) {
        return mo16185q(hvVar).mo18497i();
    }

    /* renamed from: m */
    public ColorStateList mo15609m(C2366hv hvVar) {
        return mo16185q(hvVar).mo18492f();
    }

    /* renamed from: n */
    public void mo15610n(C2366hv hvVar, @ts2 ColorStateList colorStateList) {
        mo16185q(hvVar).mo18504o(colorStateList);
    }

    /* renamed from: o */
    public float mo15611o(C2366hv hvVar) {
        return mo16185q(hvVar).mo18500k();
    }

    /* renamed from: p */
    public final jn3 mo16184p(Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        return new jn3(context.getResources(), colorStateList, f, f2, f3);
    }

    /* renamed from: q */
    public final jn3 mo16185q(C2366hv hvVar) {
        return (jn3) hvVar.mo2633c();
    }
}
