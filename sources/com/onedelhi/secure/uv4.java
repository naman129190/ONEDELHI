package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.view.View;

@sj3(22)
public class uv4 extends tv4 {

    /* renamed from: g */
    public static boolean f21531g = true;

    @SuppressLint({"NewApi"})
    /* renamed from: f */
    public void mo7063f(@mr2 View view, int i, int i2, int i3, int i4) {
        if (f21531g) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f21531g = false;
            }
        }
    }
}
