package com.onedelhi.secure;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Objects;

public final class tv2 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a */
    public final View f21143a;

    /* renamed from: a */
    public ViewTreeObserver f21144a;

    /* renamed from: a */
    public final Runnable f21145a;

    public tv2(View view, Runnable runnable) {
        this.f21143a = view;
        this.f21144a = view.getViewTreeObserver();
        this.f21145a = runnable;
    }

    @mr2
    /* renamed from: a */
    public static tv2 m28961a(@mr2 View view, @mr2 Runnable runnable) {
        Objects.requireNonNull(view, "view == null");
        Objects.requireNonNull(runnable, "runnable == null");
        tv2 tv2 = new tv2(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(tv2);
        view.addOnAttachStateChangeListener(tv2);
        return tv2;
    }

    /* renamed from: b */
    public void mo25319b() {
        (this.f21144a.isAlive() ? this.f21144a : this.f21143a.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f21143a.removeOnAttachStateChangeListener(this);
    }

    public boolean onPreDraw() {
        mo25319b();
        this.f21145a.run();
        return true;
    }

    public void onViewAttachedToWindow(@mr2 View view) {
        this.f21144a = view.getViewTreeObserver();
    }

    public void onViewDetachedFromWindow(@mr2 View view) {
        mo25319b();
    }
}
