package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import java.lang.reflect.Field;

public class ip1 {

    /* renamed from: a */
    public static Field f13792a = null;

    /* renamed from: a */
    public static boolean f13793a = true;

    /* renamed from: b */
    public static boolean f13794b;

    /* renamed from: a */
    public static void m17759a(@mr2 ImageView imageView, @ts2 Matrix matrix) {
        if (Build.VERSION.SDK_INT >= 29) {
            imageView.animateTransform(matrix);
        } else if (matrix == null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable != null) {
                drawable.setBounds(0, 0, (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight(), (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom());
                imageView.invalidate();
            }
        } else {
            m17761c(imageView, matrix);
        }
    }

    /* renamed from: b */
    public static void m17760b() {
        if (!f13794b) {
            try {
                Field declaredField = ImageView.class.getDeclaredField("mDrawMatrix");
                f13792a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f13794b = true;
        }
    }

    @sj3(21)
    @SuppressLint({"NewApi"})
    /* renamed from: c */
    public static void m17761c(@mr2 ImageView imageView, @ts2 Matrix matrix) {
        if (f13793a) {
            try {
                imageView.animateTransform(matrix);
            } catch (NoSuchMethodError unused) {
                f13793a = false;
            }
        }
    }
}
