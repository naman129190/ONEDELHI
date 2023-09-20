package com.onedelhi.secure;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.C1058d;

public class kg1 {
    @ts2
    /* renamed from: a */
    public static ig1 m19782a(@mr2 View view, @mr2 ViewGroup viewGroup, @ts2 Matrix matrix) {
        return Build.VERSION.SDK_INT == 28 ? jg1.m18537b(view, viewGroup, matrix) : C1058d.m7154b(view, viewGroup, matrix);
    }

    /* renamed from: b */
    public static void m19783b(View view) {
        if (Build.VERSION.SDK_INT == 28) {
            jg1.m18541f(view);
        } else {
            C1058d.m7158f(view);
        }
    }
}
