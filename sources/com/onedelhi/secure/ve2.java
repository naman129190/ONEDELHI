package com.onedelhi.secure;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import com.onedelhi.secure.fd3;

@sj3(21)
public final class ve2 extends if2<tz0> {

    /* renamed from: a */
    public static final float f36497a = 0.8f;

    /* renamed from: b */
    public static final float f36498b = 0.3f;
    @C3982yb

    /* renamed from: n */
    public static final int f36499n = fd3.C2153c.motionDurationMedium4;
    @C3982yb

    /* renamed from: o */
    public static final int f36500o = fd3.C2153c.motionDurationShort3;
    @C3982yb

    /* renamed from: p */
    public static final int f36501p = fd3.C2153c.motionEasingEmphasizedDecelerateInterpolator;
    @C3982yb

    /* renamed from: q */
    public static final int f36502q = fd3.C2153c.motionEasingEmphasizedAccelerateInterpolator;

    public ve2() {
        super(m67966m(), m67967n());
    }

    /* renamed from: m */
    public static tz0 m67966m() {
        tz0 tz0 = new tz0();
        tz0.mo45334e(0.3f);
        return tz0;
    }

    /* renamed from: n */
    public static ew4 m67967n() {
        hr3 hr3 = new hr3();
        hr3.mo37515o(false);
        hr3.mo37512l(0.8f);
        return hr3;
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo35213a(@mr2 ew4 ew4) {
        super.mo35213a(ew4);
    }

    /* renamed from: c */
    public /* bridge */ /* synthetic */ void mo35214c() {
        super.mo35214c();
    }

    @mr2
    /* renamed from: e */
    public TimeInterpolator mo38059e(boolean z) {
        return C1947d7.f10649a;
    }

    @C3982yb
    /* renamed from: f */
    public int mo35215f(boolean z) {
        return z ? f36499n : f36500o;
    }

    @C3982yb
    /* renamed from: g */
    public int mo35216g(boolean z) {
        return z ? f36501p : f36502q;
    }

    @mr2
    /* renamed from: h */
    public /* bridge */ /* synthetic */ ew4 mo35217h() {
        return super.mo35217h();
    }

    @ts2
    /* renamed from: i */
    public /* bridge */ /* synthetic */ ew4 mo35218i() {
        return super.mo35218i();
    }

    /* renamed from: k */
    public /* bridge */ /* synthetic */ boolean mo35219k(@mr2 ew4 ew4) {
        return super.mo35219k(ew4);
    }

    /* renamed from: l */
    public /* bridge */ /* synthetic */ void mo35220l(@ts2 ew4 ew4) {
        super.mo35220l(ew4);
    }

    public /* bridge */ /* synthetic */ Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
    }

    public /* bridge */ /* synthetic */ Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
    }
}
