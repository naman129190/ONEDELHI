package com.onedelhi.secure;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;

@sj3(21)
public final class rl1 extends Visibility {
    @mr2
    public Animator onAppear(@mr2 ViewGroup viewGroup, @mr2 View view, @ts2 TransitionValues transitionValues, @ts2 TransitionValues transitionValues2) {
        return ValueAnimator.ofFloat(new float[]{0.0f});
    }

    @mr2
    public Animator onDisappear(@mr2 ViewGroup viewGroup, @mr2 View view, @ts2 TransitionValues transitionValues, @ts2 TransitionValues transitionValues2) {
        return ValueAnimator.ofFloat(new float[]{0.0f});
    }
}
