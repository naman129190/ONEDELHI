package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

@sj3(23)
public class vv4 extends uv4 {

    /* renamed from: h */
    public static boolean f21980h = true;

    @SuppressLint({"NewApi"})
    /* renamed from: h */
    public void mo7065h(@mr2 View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.mo7065h(view, i);
        } else if (f21980h) {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError unused) {
                f21980h = false;
            }
        }
    }
}
