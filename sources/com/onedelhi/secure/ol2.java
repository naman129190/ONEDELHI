package com.onedelhi.secure;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

public class ol2 {

    /* renamed from: a */
    public int f18004a;

    /* renamed from: a */
    public long f18005a;
    @ts2

    /* renamed from: a */
    public TimeInterpolator f18006a;

    /* renamed from: b */
    public int f18007b;

    /* renamed from: b */
    public long f18008b;

    public ol2(long j, long j2) {
        this.f18006a = null;
        this.f18004a = 0;
        this.f18007b = 1;
        this.f18005a = j;
        this.f18008b = j2;
    }

    public ol2(long j, long j2, @mr2 TimeInterpolator timeInterpolator) {
        this.f18004a = 0;
        this.f18007b = 1;
        this.f18005a = j;
        this.f18008b = j2;
        this.f18006a = timeInterpolator;
    }

    @mr2
    /* renamed from: b */
    public static ol2 m23863b(@mr2 ValueAnimator valueAnimator) {
        ol2 ol2 = new ol2(valueAnimator.getStartDelay(), valueAnimator.getDuration(), m23864f(valueAnimator));
        ol2.f18004a = valueAnimator.getRepeatCount();
        ol2.f18007b = valueAnimator.getRepeatMode();
        return ol2;
    }

    /* renamed from: f */
    public static TimeInterpolator m23864f(@mr2 ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        return ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) ? C1947d7.f10650b : interpolator instanceof AccelerateInterpolator ? C1947d7.f10651c : interpolator instanceof DecelerateInterpolator ? C1947d7.f10652d : interpolator;
    }

    /* renamed from: a */
    public void mo21979a(@mr2 Animator animator) {
        animator.setStartDelay(mo21980c());
        animator.setDuration(mo21981d());
        animator.setInterpolator(mo21982e());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(mo21984g());
            valueAnimator.setRepeatMode(mo21985h());
        }
    }

    /* renamed from: c */
    public long mo21980c() {
        return this.f18005a;
    }

    /* renamed from: d */
    public long mo21981d() {
        return this.f18008b;
    }

    @ts2
    /* renamed from: e */
    public TimeInterpolator mo21982e() {
        TimeInterpolator timeInterpolator = this.f18006a;
        return timeInterpolator != null ? timeInterpolator : C1947d7.f10650b;
    }

    public boolean equals(@ts2 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ol2)) {
            return false;
        }
        ol2 ol2 = (ol2) obj;
        if (mo21980c() == ol2.mo21980c() && mo21981d() == ol2.mo21981d() && mo21984g() == ol2.mo21984g() && mo21985h() == ol2.mo21985h()) {
            return mo21982e().getClass().equals(ol2.mo21982e().getClass());
        }
        return false;
    }

    /* renamed from: g */
    public int mo21984g() {
        return this.f18004a;
    }

    /* renamed from: h */
    public int mo21985h() {
        return this.f18007b;
    }

    public int hashCode() {
        return (((((((((int) (mo21980c() ^ (mo21980c() >>> 32))) * 31) + ((int) (mo21981d() ^ (mo21981d() >>> 32)))) * 31) + mo21982e().getClass().hashCode()) * 31) + mo21984g()) * 31) + mo21985h();
    }

    @mr2
    public String toString() {
        return 10 + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + mo21980c() + " duration: " + mo21981d() + " interpolator: " + mo21982e().getClass() + " repeatCount: " + mo21984g() + " repeatMode: " + mo21985h() + "}\n";
    }
}
