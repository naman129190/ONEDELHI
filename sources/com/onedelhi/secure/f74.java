package com.onedelhi.secure;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.onedelhi.secure.mn1;

@KeepForSdk
public final class f74 extends mn1.C2870a {

    /* renamed from: a */
    public final Fragment f11952a;

    public f74(Fragment fragment) {
        this.f11952a = fragment;
    }

    @KeepForSdk
    @ts2
    /* renamed from: k8 */
    public static f74 m14771k8(@ts2 Fragment fragment) {
        if (fragment != null) {
            return new f74(fragment);
        }
        return null;
    }

    @ts2
    /* renamed from: A */
    public final String mo15851A() {
        return this.f11952a.getTag();
    }

    @ts2
    /* renamed from: C1 */
    public final Bundle mo15852C1() {
        return this.f11952a.getArguments();
    }

    /* renamed from: G6 */
    public final int mo15853G6() {
        return this.f11952a.getId();
    }

    /* renamed from: H3 */
    public final boolean mo15854H3() {
        return this.f11952a.isDetached();
    }

    @mr2
    /* renamed from: J0 */
    public final tn1 mo15855J0() {
        return nt2.m23166l8(this.f11952a.getView());
    }

    /* renamed from: K0 */
    public final boolean mo15856K0() {
        return this.f11952a.isResumed();
    }

    /* renamed from: P */
    public final void mo15857P(boolean z) {
        this.f11952a.setHasOptionsMenu(z);
    }

    /* renamed from: Q2 */
    public final void mo15858Q2(@mr2 Intent intent, int i) {
        this.f11952a.startActivityForResult(intent, i);
    }

    /* renamed from: T2 */
    public final boolean mo15859T2() {
        return this.f11952a.isAdded();
    }

    /* renamed from: U1 */
    public final boolean mo15860U1() {
        return this.f11952a.isInLayout();
    }

    @ts2
    /* renamed from: V3 */
    public final mn1 mo15861V3() {
        return m14771k8(this.f11952a.getTargetFragment());
    }

    /* renamed from: V5 */
    public final boolean mo15862V5() {
        return this.f11952a.getUserVisibleHint();
    }

    /* renamed from: d1 */
    public final boolean mo15863d1() {
        return this.f11952a.isHidden();
    }

    /* renamed from: d2 */
    public final void mo15864d2(@mr2 Intent intent) {
        this.f11952a.startActivity(intent);
    }

    /* renamed from: e5 */
    public final boolean mo15865e5() {
        return this.f11952a.getRetainInstance();
    }

    /* renamed from: f8 */
    public final void mo15866f8(boolean z) {
        this.f11952a.setUserVisibleHint(z);
    }

    @mr2
    /* renamed from: i5 */
    public final tn1 mo15867i5() {
        return nt2.m23166l8(this.f11952a.getActivity());
    }

    /* renamed from: k7 */
    public final void mo15868k7(boolean z) {
        this.f11952a.setRetainInstance(z);
    }

    @ts2
    /* renamed from: n1 */
    public final mn1 mo15869n1() {
        return m14771k8(this.f11952a.getParentFragment());
    }

    /* renamed from: v2 */
    public final void mo15870v2(boolean z) {
        this.f11952a.setMenuVisibility(z);
    }

    /* renamed from: v3 */
    public final void mo15871v3(@mr2 tn1 tn1) {
        View view = (View) nt2.m23165k8(tn1);
        Fragment fragment = this.f11952a;
        Preconditions.checkNotNull(view);
        fragment.registerForContextMenu(view);
    }

    /* renamed from: v4 */
    public final void mo15872v4(@mr2 tn1 tn1) {
        View view = (View) nt2.m23165k8(tn1);
        Fragment fragment = this.f11952a;
        Preconditions.checkNotNull(view);
        fragment.unregisterForContextMenu(view);
    }

    /* renamed from: y2 */
    public final boolean mo15873y2() {
        return this.f11952a.isRemoving();
    }

    /* renamed from: z */
    public final boolean mo15874z() {
        return this.f11952a.isVisible();
    }

    @mr2
    /* renamed from: z0 */
    public final tn1 mo15875z0() {
        return nt2.m23166l8(this.f11952a.getResources());
    }

    public final int zzc() {
        return this.f11952a.getTargetRequestCode();
    }
}
