package com.onedelhi.secure;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import com.onedelhi.secure.fd3;

public final class we2 extends jf2<uz0> {
    @C3982yb

    /* renamed from: A */
    public static final int f36962A = fd3.C2153c.motionEasingEmphasizedAccelerateInterpolator;

    /* renamed from: a */
    public static final float f36963a = 0.8f;

    /* renamed from: b */
    public static final float f36964b = 0.3f;
    @C3982yb

    /* renamed from: x */
    public static final int f36965x = fd3.C2153c.motionDurationMedium4;
    @C3982yb

    /* renamed from: y */
    public static final int f36966y = fd3.C2153c.motionDurationShort3;
    @C3982yb

    /* renamed from: z */
    public static final int f36967z = fd3.C2153c.motionEasingEmphasizedDecelerateInterpolator;

    public we2() {
        super(m69309V0(), m69310W0());
    }

    /* renamed from: V0 */
    public static uz0 m69309V0() {
        uz0 uz0 = new uz0();
        uz0.mo45875e(0.3f);
        return uz0;
    }

    /* renamed from: W0 */
    public static fw4 m69310W0() {
        ir3 ir3 = new ir3();
        ir3.mo38210o(false);
        ir3.mo38207l(0.8f);
        return ir3;
    }

    /* renamed from: E0 */
    public /* bridge */ /* synthetic */ Animator mo6878E0(ViewGroup viewGroup, View view, th4 th4, th4 th42) {
        return super.mo6878E0(viewGroup, view, th4, th42);
    }

    /* renamed from: G0 */
    public /* bridge */ /* synthetic */ Animator mo6879G0(ViewGroup viewGroup, View view, th4 th4, th4 th42) {
        return super.mo6879G0(viewGroup, view, th4, th42);
    }

    /* renamed from: J0 */
    public /* bridge */ /* synthetic */ void mo34381J0(@mr2 fw4 fw4) {
        super.mo34381J0(fw4);
    }

    /* renamed from: L0 */
    public /* bridge */ /* synthetic */ void mo34382L0() {
        super.mo34382L0();
    }

    @mr2
    /* renamed from: N0 */
    public TimeInterpolator mo38614N0(boolean z) {
        return C1947d7.f10649a;
    }

    @C3982yb
    /* renamed from: O0 */
    public int mo34383O0(boolean z) {
        return z ? f36965x : f36966y;
    }

    @C3982yb
    /* renamed from: P0 */
    public int mo34384P0(boolean z) {
        return z ? f36967z : f36962A;
    }

    @mr2
    /* renamed from: Q0 */
    public /* bridge */ /* synthetic */ fw4 mo34385Q0() {
        return super.mo34385Q0();
    }

    @ts2
    /* renamed from: R0 */
    public /* bridge */ /* synthetic */ fw4 mo34386R0() {
        return super.mo34386R0();
    }

    /* renamed from: T0 */
    public /* bridge */ /* synthetic */ boolean mo34387T0(@mr2 fw4 fw4) {
        return super.mo34387T0(fw4);
    }

    /* renamed from: U0 */
    public /* bridge */ /* synthetic */ void mo34388U0(@ts2 fw4 fw4) {
        super.mo34388U0(fw4);
    }
}
