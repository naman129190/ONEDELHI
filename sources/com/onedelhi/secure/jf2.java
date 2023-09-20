package com.onedelhi.secure;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Visibility;
import com.onedelhi.secure.fw4;
import java.util.ArrayList;
import java.util.List;

public abstract class jf2<P extends fw4> extends Visibility {

    /* renamed from: a */
    public final P f30752a;

    /* renamed from: a */
    public final List<fw4> f30753a = new ArrayList();
    @ts2

    /* renamed from: b */
    public fw4 f30754b;

    public jf2(P p, @ts2 fw4 fw4) {
        this.f30752a = p;
        this.f30754b = fw4;
    }

    /* renamed from: K0 */
    public static void m53309K0(List<Animator> list, @ts2 fw4 fw4, ViewGroup viewGroup, View view, boolean z) {
        if (fw4 != null) {
            Animator a = z ? fw4.mo34051a(viewGroup, view) : fw4.mo34052b(viewGroup, view);
            if (a != null) {
                list.add(a);
            }
        }
    }

    /* renamed from: E0 */
    public Animator mo6878E0(ViewGroup viewGroup, View view, th4 th4, th4 th42) {
        return mo38613M0(viewGroup, view, true);
    }

    /* renamed from: G0 */
    public Animator mo6879G0(ViewGroup viewGroup, View view, th4 th4, th4 th42) {
        return mo38613M0(viewGroup, view, false);
    }

    /* renamed from: J0 */
    public void mo34381J0(@mr2 fw4 fw4) {
        this.f30753a.add(fw4);
    }

    /* renamed from: L0 */
    public void mo34382L0() {
        this.f30753a.clear();
    }

    /* renamed from: M0 */
    public final Animator mo38613M0(@mr2 ViewGroup viewGroup, @mr2 View view, boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        m53309K0(arrayList, this.f30752a, viewGroup, view, z);
        m53309K0(arrayList, this.f30754b, viewGroup, view, z);
        for (fw4 K0 : this.f30753a) {
            m53309K0(arrayList, K0, viewGroup, view, z);
        }
        mo38615S0(viewGroup.getContext(), z);
        C2479j7.m18186a(animatorSet, arrayList);
        return animatorSet;
    }

    @mr2
    /* renamed from: N0 */
    public TimeInterpolator mo38614N0(boolean z) {
        return C1947d7.f10650b;
    }

    @C3982yb
    /* renamed from: O0 */
    public int mo34383O0(boolean z) {
        return 0;
    }

    @C3982yb
    /* renamed from: P0 */
    public int mo34384P0(boolean z) {
        return 0;
    }

    @mr2
    /* renamed from: Q0 */
    public P mo34385Q0() {
        return this.f30752a;
    }

    @ts2
    /* renamed from: R0 */
    public fw4 mo34386R0() {
        return this.f30754b;
    }

    /* renamed from: S0 */
    public final void mo38615S0(@mr2 Context context, boolean z) {
        sh4.m64591q(this, context, mo34383O0(z));
        sh4.m64592r(this, context, mo34384P0(z), mo38614N0(z));
    }

    /* renamed from: T0 */
    public boolean mo34387T0(@mr2 fw4 fw4) {
        return this.f30753a.remove(fw4);
    }

    /* renamed from: U0 */
    public void mo34388U0(@ts2 fw4 fw4) {
        this.f30754b = fw4;
    }
}
