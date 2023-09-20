package com.onedelhi.secure;

import android.app.Dialog;
import android.os.Build;
import android.view.View;

public class vk0 {

    @sj3(28)
    /* renamed from: com.onedelhi.secure.vk0$a */
    public static class C3796a {
        @pn0
        /* renamed from: a */
        public static <T> T m30203a(Dialog dialog, int i) {
            return dialog.requireViewById(i);
        }
    }

    @mr2
    /* renamed from: a */
    public static View m30202a(@mr2 Dialog dialog, int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (View) C3796a.m30203a(dialog, i);
        }
        View findViewById = dialog.findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Dialog");
    }
}
