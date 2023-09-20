package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.transformation.FabTransformationBehavior;
import com.onedelhi.secure.C3740us;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.nl2;
import com.onedelhi.secure.s33;
import com.onedelhi.secure.ts2;
import java.util.HashMap;
import java.util.Map;

@Deprecated
public class FabTransformationSheetBehavior extends FabTransformationBehavior {
    @ts2

    /* renamed from: a */
    public Map<View, Integer> f24877a;

    public FabTransformationSheetBehavior() {
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @C3740us
    /* renamed from: K */
    public boolean mo29628K(@mr2 View view, @mr2 View view2, boolean z, boolean z2) {
        mo29663j0(view2, z);
        return super.mo29628K(view, view2, z, z2);
    }

    @mr2
    /* renamed from: h0 */
    public FabTransformationBehavior.C4300e mo29652h0(Context context, boolean z) {
        int i = z ? fd3.C2152b.mtrl_fab_transformation_sheet_expand_spec : fd3.C2152b.mtrl_fab_transformation_sheet_collapse_spec;
        FabTransformationBehavior.C4300e eVar = new FabTransformationBehavior.C4300e();
        eVar.f24866a = nl2.m22935d(context, i);
        eVar.f24867a = new s33(17, 0.0f, 0.0f);
        return eVar;
    }

    /* renamed from: j0 */
    public final void mo29663j0(@mr2 View view, boolean z) {
        int i;
        ViewParent parent = view.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                this.f24877a = new HashMap(childCount);
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = coordinatorLayout.getChildAt(i2);
                boolean z2 = (childAt.getLayoutParams() instanceof CoordinatorLayout.C0459f) && (((CoordinatorLayout.C0459f) childAt.getLayoutParams()).mo3676f() instanceof FabTransformationScrimBehavior);
                if (childAt != view && !z2) {
                    Map<View, Integer> map = this.f24877a;
                    if (z) {
                        map.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        i = 4;
                    } else if (map != null && map.containsKey(childAt)) {
                        i = this.f24877a.get(childAt).intValue();
                    }
                    jt4.m18906R1(childAt, i);
                }
            }
            if (!z) {
                this.f24877a = null;
            }
        }
    }
}
