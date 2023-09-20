package com.onedelhi.secure;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;
import com.onedelhi.secure.ew4;
import java.util.ArrayList;
import java.util.List;

@sj3(21)
public abstract class if2<P extends ew4> extends Visibility {

    /* renamed from: a */
    public final P f30299a;

    /* renamed from: a */
    public final List<ew4> f30300a = new ArrayList();
    @ts2

    /* renamed from: b */
    public ew4 f30301b;

    public if2(P p, @ts2 ew4 ew4) {
        this.f30299a = p;
        this.f30301b = ew4;
    }

    /* renamed from: b */
    public static void m52229b(List<Animator> list, @ts2 ew4 ew4, ViewGroup viewGroup, View view, boolean z) {
        if (ew4 != null) {
            Animator a = z ? ew4.mo32190a(viewGroup, view) : ew4.mo32191b(viewGroup, view);
            if (a != null) {
                list.add(a);
            }
        }
    }

    /* renamed from: a */
    public void mo35213a(@mr2 ew4 ew4) {
        this.f30300a.add(ew4);
    }

    /* renamed from: c */
    public void mo35214c() {
        this.f30300a.clear();
    }

    /* renamed from: d */
    public final Animator mo38058d(@mr2 ViewGroup viewGroup, @mr2 View view, boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        m52229b(arrayList, this.f30299a, viewGroup, view, z);
        m52229b(arrayList, this.f30301b, viewGroup, view, z);
        for (ew4 b : this.f30300a) {
            m52229b(arrayList, b, viewGroup, view, z);
        }
        mo38060j(viewGroup.getContext(), z);
        C2479j7.m18186a(animatorSet, arrayList);
        return animatorSet;
    }

    @mr2
    /* renamed from: e */
    public TimeInterpolator mo38059e(boolean z) {
        return C1947d7.f10650b;
    }

    @C3982yb
    /* renamed from: f */
    public int mo35215f(boolean z) {
        return 0;
    }

    @C3982yb
    /* renamed from: g */
    public int mo35216g(boolean z) {
        return 0;
    }

    @mr2
    /* renamed from: h */
    public P mo35217h() {
        return this.f30299a;
    }

    @ts2
    /* renamed from: i */
    public ew4 mo35218i() {
        return this.f30301b;
    }

    /* renamed from: j */
    public final void mo38060j(@mr2 Context context, boolean z) {
        rh4.m63626q(this, context, mo35215f(z));
        rh4.m63627r(this, context, mo35216g(z), mo38059e(z));
    }

    /* renamed from: k */
    public boolean mo35219k(@mr2 ew4 ew4) {
        return this.f30300a.remove(ew4);
    }

    /* renamed from: l */
    public void mo35220l(@ts2 ew4 ew4) {
        this.f30301b = ew4;
    }

    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return mo38058d(viewGroup, view, true);
    }

    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return mo38058d(viewGroup, view, false);
    }
}
