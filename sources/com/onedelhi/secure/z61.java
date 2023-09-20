package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

public class z61 implements ViewTreeObserver.OnDrawListener {
    @SuppressLint({"ThreadPoolCreation"})

    /* renamed from: a */
    public final Handler f38224a = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public final Runnable f38225a;

    /* renamed from: a */
    public final AtomicReference<View> f38226a;

    /* renamed from: com.onedelhi.secure.z61$a */
    public class C7437a implements View.OnAttachStateChangeListener {
        public C7437a() {
        }

        public void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver().addOnDrawListener(z61.this);
            view.removeOnAttachStateChangeListener(this);
        }

        public void onViewDetachedFromWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public z61(View view, Runnable runnable) {
        this.f38226a = new AtomicReference<>(view);
        this.f38225a = runnable;
    }

    /* renamed from: b */
    public static boolean m72592b(View view) {
        return view.getViewTreeObserver().isAlive() && m72593c(view);
    }

    /* renamed from: c */
    public static boolean m72593c(View view) {
        return view.isAttachedToWindow();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m72594d(View view) {
        view.getViewTreeObserver().removeOnDrawListener(this);
    }

    /* renamed from: e */
    public static void m72595e(View view, Runnable runnable) {
        z61 z61 = new z61(view, runnable);
        if (Build.VERSION.SDK_INT >= 26 || m72592b(view)) {
            view.getViewTreeObserver().addOnDrawListener(z61);
        } else {
            view.addOnAttachStateChangeListener(new C7437a());
        }
    }

    public void onDraw() {
        View andSet = this.f38226a.getAndSet((Object) null);
        if (andSet != null) {
            andSet.getViewTreeObserver().addOnGlobalLayoutListener(new y61(this, andSet));
            this.f38224a.postAtFrontOfQueue(this.f38225a);
        }
    }
}
