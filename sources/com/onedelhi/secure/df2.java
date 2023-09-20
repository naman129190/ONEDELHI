package com.onedelhi.secure;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.hl3;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class df2 extends jf2<fw4> {

    /* renamed from: A */
    public static final int f27405A = 2;
    @C3982yb

    /* renamed from: B */
    public static final int f27406B = fd3.C2153c.motionDurationLong1;
    @C3982yb

    /* renamed from: C */
    public static final int f27407C = fd3.C2153c.motionEasingEmphasizedInterpolator;

    /* renamed from: y */
    public static final int f27408y = 0;

    /* renamed from: z */
    public static final int f27409z = 1;

    /* renamed from: f */
    public final boolean f27410f;

    /* renamed from: x */
    public final int f27411x;

    @hl3({hl3.C2354a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.onedelhi.secure.df2$a */
    public @interface C5021a {
    }

    public df2(int i, boolean z) {
        super(m45087V0(i, z), m45088W0());
        this.f27411x = i;
        this.f27410f = z;
    }

    /* renamed from: V0 */
    public static fw4 m45087V0(int i, boolean z) {
        if (i == 0) {
            return new d04(z ? 8388613 : ri1.f19869b);
        } else if (i == 1) {
            return new d04(z ? 80 : 48);
        } else if (i == 2) {
            return new ir3(z);
        } else {
            throw new IllegalArgumentException("Invalid axis: " + i);
        }
    }

    /* renamed from: W0 */
    public static fw4 m45088W0() {
        return new xz0();
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

    @C3982yb
    /* renamed from: O0 */
    public int mo34383O0(boolean z) {
        return f27406B;
    }

    @C3982yb
    /* renamed from: P0 */
    public int mo34384P0(boolean z) {
        return f27407C;
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

    /* renamed from: X0 */
    public int mo34389X0() {
        return this.f27411x;
    }

    /* renamed from: Y0 */
    public boolean mo34390Y0() {
        return this.f27410f;
    }
}
