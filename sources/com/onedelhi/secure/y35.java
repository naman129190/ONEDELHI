package com.onedelhi.secure;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public final class y35 implements r45 {

    /* renamed from: a */
    public final /* synthetic */ Bundle f22871a;

    /* renamed from: a */
    public final /* synthetic */ LayoutInflater f22872a;

    /* renamed from: a */
    public final /* synthetic */ ViewGroup f22873a;

    /* renamed from: a */
    public final /* synthetic */ FrameLayout f22874a;

    /* renamed from: a */
    public final /* synthetic */ bi0 f22875a;

    public y35(bi0 bi0, FrameLayout frameLayout, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f22875a = bi0;
        this.f22874a = frameLayout;
        this.f22872a = layoutInflater;
        this.f22873a = viewGroup;
        this.f22871a = bundle;
    }

    /* renamed from: a */
    public final void mo19275a(w22 w22) {
        this.f22874a.removeAllViews();
        this.f22874a.addView(this.f22875a.f9829a.mo13637k(this.f22872a, this.f22873a, this.f22871a));
    }

    public final int zaa() {
        return 2;
    }
}
