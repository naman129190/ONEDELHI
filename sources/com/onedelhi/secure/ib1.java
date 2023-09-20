package com.onedelhi.secure;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;

public final class ib1 extends RecyclerView.C0803f0 {
    public ib1(@mr2 FrameLayout frameLayout) {
        super(frameLayout);
    }

    @mr2
    /* renamed from: R */
    public static ib1 m17372R(@mr2 ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(jt4.m18855D());
        frameLayout.setSaveEnabled(false);
        return new ib1(frameLayout);
    }

    @mr2
    /* renamed from: S */
    public FrameLayout mo17698S() {
        return (FrameLayout) this.f4609a;
    }
}
