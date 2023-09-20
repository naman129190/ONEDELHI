package com.onedelhi.secure;

import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.onedelhi.secure.fd3;

@sj3(21)
public class xv4 {

    /* renamed from: a */
    public static final int[] f22780a = {16843848};

    /* renamed from: a */
    public static void m31742a(@mr2 View view) {
        view.setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }

    /* renamed from: b */
    public static void m31743b(@mr2 View view, float f) {
        int integer = view.getResources().getInteger(fd3.C2159i.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = (long) integer;
        stateListAnimator.addState(new int[]{16842910, fd3.C2153c.state_liftable, -fd3.C2153c.state_lifted}, ObjectAnimator.ofFloat(view, "elevation", new float[]{0.0f}).setDuration(j));
        stateListAnimator.addState(new int[]{16842910}, ObjectAnimator.ofFloat(view, "elevation", new float[]{f}).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", new float[]{0.0f}).setDuration(0));
        view.setStateListAnimator(stateListAnimator);
    }

    /* renamed from: c */
    public static void m31744c(@mr2 View view, AttributeSet attributeSet, int i, int i2) {
        Context context = view.getContext();
        TypedArray k = ob4.m59195k(context, attributeSet, f22780a, i, i2, new int[0]);
        try {
            if (k.hasValue(0)) {
                view.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, k.getResourceId(0, 0)));
            }
        } finally {
            k.recycle();
        }
    }
}
