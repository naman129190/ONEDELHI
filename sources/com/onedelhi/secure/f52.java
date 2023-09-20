package com.onedelhi.secure;

import android.view.View;
import android.widget.TextView;
import com.delhitransport.onedelhi.activities.LiveActivity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public final /* synthetic */ class f52 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ TextView f28180a;

    /* renamed from: a */
    public final /* synthetic */ LiveActivity f28181a;

    /* renamed from: a */
    public final /* synthetic */ FloatingActionButton f28182a;

    /* renamed from: b */
    public final /* synthetic */ TextView f28183b;

    public /* synthetic */ f52(LiveActivity liveActivity, TextView textView, TextView textView2, FloatingActionButton floatingActionButton) {
        this.f28181a = liveActivity;
        this.f28180a = textView;
        this.f28183b = textView2;
        this.f28182a = floatingActionButton;
    }

    public final void onClick(View view) {
        this.f28181a.m8030n2(this.f28180a, this.f28183b, this.f28182a, view);
    }
}
