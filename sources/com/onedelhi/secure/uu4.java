package com.onedelhi.secure;

import android.animation.ValueAnimator;
import android.view.View;

public final /* synthetic */ class uu4 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ View f36295a;

    /* renamed from: a */
    public final /* synthetic */ zu4 f36296a;

    public /* synthetic */ uu4(zu4 zu4, View view) {
        this.f36296a = zu4;
        this.f36295a = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f36296a.mo1149a(this.f36295a);
    }
}
