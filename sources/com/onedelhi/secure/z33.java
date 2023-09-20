package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

public class z33 implements ViewTreeObserver.OnPreDrawListener {
    @SuppressLint({"ThreadPoolCreation"})

    /* renamed from: a */
    public final Handler f38204a = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public final Runnable f38205a;

    /* renamed from: a */
    public final AtomicReference<View> f38206a;

    /* renamed from: b */
    public final Runnable f38207b;

    public z33(View view, Runnable runnable, Runnable runnable2) {
        this.f38206a = new AtomicReference<>(view);
        this.f38205a = runnable;
        this.f38207b = runnable2;
    }

    /* renamed from: a */
    public static void m72545a(View view, Runnable runnable, Runnable runnable2) {
        view.getViewTreeObserver().addOnPreDrawListener(new z33(view, runnable, runnable2));
    }

    public boolean onPreDraw() {
        View andSet = this.f38206a.getAndSet((Object) null);
        if (andSet == null) {
            return true;
        }
        andSet.getViewTreeObserver().removeOnPreDrawListener(this);
        this.f38204a.post(this.f38205a);
        this.f38204a.postAtFrontOfQueue(this.f38207b);
        return true;
    }
}
