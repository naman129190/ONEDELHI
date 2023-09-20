package com.onedelhi.secure;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Build;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.onedelhi.secure.nj */
public abstract class C2982nj extends ValueAnimator {

    /* renamed from: a */
    public final Set<ValueAnimator.AnimatorUpdateListener> f17453a = new CopyOnWriteArraySet();

    /* renamed from: b */
    public final Set<Animator.AnimatorListener> f17454b = new CopyOnWriteArraySet();

    /* renamed from: a */
    public void mo21301a() {
        for (Animator.AnimatorListener onAnimationCancel : this.f17454b) {
            onAnimationCancel.onAnimationCancel(this);
        }
    }

    public void addListener(Animator.AnimatorListener animatorListener) {
        this.f17454b.add(animatorListener);
    }

    public void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f17453a.add(animatorUpdateListener);
    }

    /* renamed from: b */
    public void mo21304b(boolean z) {
        for (Animator.AnimatorListener next : this.f17454b) {
            if (Build.VERSION.SDK_INT >= 26) {
                next.onAnimationEnd(this, z);
            } else {
                next.onAnimationEnd(this);
            }
        }
    }

    /* renamed from: c */
    public void mo21305c() {
        for (Animator.AnimatorListener onAnimationRepeat : this.f17454b) {
            onAnimationRepeat.onAnimationRepeat(this);
        }
    }

    /* renamed from: d */
    public void mo21306d(boolean z) {
        for (Animator.AnimatorListener next : this.f17454b) {
            if (Build.VERSION.SDK_INT >= 26) {
                next.onAnimationStart(this, z);
            } else {
                next.onAnimationStart(this);
            }
        }
    }

    /* renamed from: e */
    public void mo21307e() {
        for (ValueAnimator.AnimatorUpdateListener onAnimationUpdate : this.f17453a) {
            onAnimationUpdate.onAnimationUpdate(this);
        }
    }

    public long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    public void removeAllListeners() {
        this.f17454b.clear();
    }

    public void removeAllUpdateListeners() {
        this.f17453a.clear();
    }

    public void removeListener(Animator.AnimatorListener animatorListener) {
        this.f17454b.remove(animatorListener);
    }

    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f17453a.remove(animatorUpdateListener);
    }

    public ValueAnimator setDuration(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }

    public void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    public void setStartDelay(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }
}
