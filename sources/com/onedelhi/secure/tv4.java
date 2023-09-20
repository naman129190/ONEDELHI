package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

@sj3(21)
public class tv4 extends sv4 {

    /* renamed from: d */
    public static boolean f21146d = true;

    /* renamed from: e */
    public static boolean f21147e = true;

    /* renamed from: f */
    public static boolean f21148f = true;

    @SuppressLint({"NewApi"})
    /* renamed from: e */
    public void mo7062e(@mr2 View view, @ts2 Matrix matrix) {
        if (f21146d) {
            try {
                view.setAnimationMatrix(matrix);
            } catch (NoSuchMethodError unused) {
                f21146d = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: i */
    public void mo7066i(@mr2 View view, @mr2 Matrix matrix) {
        if (f21147e) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f21147e = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: j */
    public void mo7067j(@mr2 View view, @mr2 Matrix matrix) {
        if (f21148f) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f21148f = false;
            }
        }
    }
}
