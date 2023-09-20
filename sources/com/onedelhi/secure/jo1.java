package com.onedelhi.secure;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Arrays;

public class jo1 {
    /* renamed from: a */
    public static void m53678a(@mr2 TextInputLayout textInputLayout, @mr2 CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = wo0.m30989r(drawable).mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                wo0.m30986o(drawable, colorStateList);
            } else {
                wo0.m30986o(drawable, ColorStateList.valueOf(colorStateList.getColorForState(m53679b(textInputLayout, checkableImageButton), colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                wo0.m30987p(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    /* renamed from: b */
    public static int[] m53679b(@mr2 TextInputLayout textInputLayout, @mr2 CheckableImageButton checkableImageButton) {
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
        return copyOf;
    }

    /* renamed from: c */
    public static void m53680c(@mr2 TextInputLayout textInputLayout, @mr2 CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int colorForState = colorStateList.getColorForState(m53679b(textInputLayout, checkableImageButton), colorStateList.getDefaultColor());
            Drawable mutate = wo0.m30989r(drawable).mutate();
            wo0.m30986o(mutate, ColorStateList.valueOf(colorForState));
            checkableImageButton.setImageDrawable(mutate);
        }
    }

    /* renamed from: d */
    public static void m53681d(@mr2 CheckableImageButton checkableImageButton) {
        if (Build.VERSION.SDK_INT <= 22) {
            checkableImageButton.setBackground(um3.m67324b(checkableImageButton.getContext(), (int) pv4.m61665e(checkableImageButton.getContext(), 4)));
        }
    }

    /* renamed from: e */
    public static void m53682e(@mr2 CheckableImageButton checkableImageButton, @ts2 View.OnLongClickListener onLongClickListener) {
        boolean K0 = jt4.m18884K0(checkableImageButton);
        boolean z = false;
        int i = 1;
        boolean z2 = onLongClickListener != null;
        if (K0 || z2) {
            z = true;
        }
        checkableImageButton.setFocusable(z);
        checkableImageButton.setClickable(K0);
        checkableImageButton.setPressable(K0);
        checkableImageButton.setLongClickable(z2);
        if (!z) {
            i = 2;
        }
        jt4.m18906R1(checkableImageButton, i);
    }

    /* renamed from: f */
    public static void m53683f(@mr2 CheckableImageButton checkableImageButton, @ts2 View.OnClickListener onClickListener, @ts2 View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        m53682e(checkableImageButton, onLongClickListener);
    }

    /* renamed from: g */
    public static void m53684g(@mr2 CheckableImageButton checkableImageButton, @ts2 View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m53682e(checkableImageButton, onLongClickListener);
    }
}
