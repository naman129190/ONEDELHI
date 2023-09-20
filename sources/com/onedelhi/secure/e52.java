package com.onedelhi.secure;

import android.view.View;
import android.widget.TextView;
import com.delhitransport.onedelhi.activities.LiveActivity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public final /* synthetic */ class e52 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ TextView f27702a;

    /* renamed from: a */
    public final /* synthetic */ LiveActivity f27703a;

    /* renamed from: a */
    public final /* synthetic */ FloatingActionButton f27704a;

    /* renamed from: b */
    public final /* synthetic */ TextView f27705b;

    public /* synthetic */ e52(LiveActivity liveActivity, TextView textView, TextView textView2, FloatingActionButton floatingActionButton) {
        this.f27703a = liveActivity;
        this.f27702a = textView;
        this.f27705b = textView2;
        this.f27704a = floatingActionButton;
    }

    public final void onClick(View view) {
        this.f27703a.m8028m2(this.f27702a, this.f27705b, this.f27704a, view);
    }
}
