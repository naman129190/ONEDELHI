package com.onedelhi.secure;

import android.animation.Animator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.hl3;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@sj3(21)
public final class ef2 extends if2<ew4> {

    /* renamed from: o */
    public static final int f27880o = 0;

    /* renamed from: p */
    public static final int f27881p = 1;

    /* renamed from: q */
    public static final int f27882q = 2;
    @C3982yb

    /* renamed from: r */
    public static final int f27883r = fd3.C2153c.motionDurationLong1;
    @C3982yb

    /* renamed from: s */
    public static final int f27884s = fd3.C2153c.motionEasingEmphasizedInterpolator;

    /* renamed from: b */
    public final boolean f27885b;

    /* renamed from: n */
    public final int f27886n;

    @hl3({hl3.C2354a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.onedelhi.secure.ef2$a */
    public @interface C5133a {
    }

    public ef2(int i, boolean z) {
        super(m46582m(i, z), m46583n());
        this.f27886n = i;
        this.f27885b = z;
    }

    /* renamed from: m */
    public static ew4 m46582m(int i, boolean z) {
        if (i == 0) {
            return new c04(z ? 8388613 : ri1.f19869b);
        } else if (i == 1) {
            return new c04(z ? 80 : 48);
        } else if (i == 2) {
            return new hr3(z);
        } else {
            throw new IllegalArgumentException("Invalid axis: " + i);
        }
    }

    /* renamed from: n */
    public static ew4 m46583n() {
        return new wz0();
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo35213a(@mr2 ew4 ew4) {
        super.mo35213a(ew4);
    }

    /* renamed from: c */
    public /* bridge */ /* synthetic */ void mo35214c() {
        super.mo35214c();
    }

    @C3982yb
    /* renamed from: f */
    public int mo35215f(boolean z) {
        return f27883r;
    }

    @C3982yb
    /* renamed from: g */
    public int mo35216g(boolean z) {
        return f27884s;
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

    /* renamed from: o */
    public int mo35221o() {
        return this.f27886n;
    }

    public /* bridge */ /* synthetic */ Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
    }

    public /* bridge */ /* synthetic */ Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
    }

    /* renamed from: p */
    public boolean mo35224p() {
        return this.f27885b;
    }
}
