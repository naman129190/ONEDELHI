package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.transition.C1095n;

@sj3(19)
public class sv4 extends C1095n {

    /* renamed from: c */
    public static boolean f20546c = true;

    /* renamed from: a */
    public void mo7058a(@mr2 View view) {
    }

    @SuppressLint({"NewApi"})
    /* renamed from: c */
    public float mo7060c(@mr2 View view) {
        if (f20546c) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f20546c = false;
            }
        }
        return view.getAlpha();
    }

    /* renamed from: d */
    public void mo7061d(@mr2 View view) {
    }

    @SuppressLint({"NewApi"})
    /* renamed from: g */
    public void mo7064g(@mr2 View view, float f) {
        if (f20546c) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                f20546c = false;
            }
        }
        view.setAlpha(f);
    }
}
