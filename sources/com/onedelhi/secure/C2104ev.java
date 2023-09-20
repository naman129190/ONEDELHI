package com.onedelhi.secure;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

@sj3(21)
/* renamed from: com.onedelhi.secure.ev */
public class C2104ev implements C2461iv {
    /* renamed from: a */
    public void mo15598a(C2366hv hvVar) {
        mo15601d(hvVar, mo15608l(hvVar));
    }

    /* renamed from: b */
    public void mo15599b(C2366hv hvVar) {
        mo15601d(hvVar, mo15608l(hvVar));
    }

    /* renamed from: c */
    public void mo15600c(C2366hv hvVar, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        hvVar.mo2634d(new in3(colorStateList, f));
        View f4 = hvVar.mo2636f();
        f4.setClipToOutline(true);
        f4.setElevation(f2);
        mo15601d(hvVar, f3);
    }

    /* renamed from: d */
    public void mo15601d(C2366hv hvVar, float f) {
        mo15612p(hvVar).mo17859g(f, hvVar.mo2635e(), hvVar.mo2632b());
        mo15602f(hvVar);
    }

    /* renamed from: e */
    public void mo14884e() {
    }

    /* renamed from: f */
    public void mo15602f(C2366hv hvVar) {
        if (!hvVar.mo2635e()) {
            hvVar.mo2631a(0, 0, 0, 0);
            return;
        }
        float l = mo15608l(hvVar);
        float i = mo15605i(hvVar);
        int ceil = (int) Math.ceil((double) jn3.m18670c(l, i, hvVar.mo2632b()));
        int ceil2 = (int) Math.ceil((double) jn3.m18671d(l, i, hvVar.mo2632b()));
        hvVar.mo2631a(ceil, ceil2, ceil, ceil2);
    }

    /* renamed from: g */
    public float mo15603g(C2366hv hvVar) {
        return hvVar.mo2636f().getElevation();
    }

    /* renamed from: h */
    public void mo15604h(C2366hv hvVar, float f) {
        mo15612p(hvVar).mo17862h(f);
    }

    /* renamed from: i */
    public float mo15605i(C2366hv hvVar) {
        return mo15612p(hvVar).mo17855d();
    }

    /* renamed from: j */
    public void mo15606j(C2366hv hvVar, float f) {
        hvVar.mo2636f().setElevation(f);
    }

    /* renamed from: k */
    public float mo15607k(C2366hv hvVar) {
        return mo15605i(hvVar) * 2.0f;
    }

    /* renamed from: l */
    public float mo15608l(C2366hv hvVar) {
        return mo15612p(hvVar).mo17854c();
    }

    /* renamed from: m */
    public ColorStateList mo15609m(C2366hv hvVar) {
        return mo15612p(hvVar).mo17853b();
    }

    /* renamed from: n */
    public void mo15610n(C2366hv hvVar, @ts2 ColorStateList colorStateList) {
        mo15612p(hvVar).mo17858f(colorStateList);
    }

    /* renamed from: o */
    public float mo15611o(C2366hv hvVar) {
        return mo15605i(hvVar) * 2.0f;
    }

    /* renamed from: p */
    public final in3 mo15612p(C2366hv hvVar) {
        return (in3) hvVar.mo2633c();
    }
}
