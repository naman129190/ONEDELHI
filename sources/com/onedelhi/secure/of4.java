package com.onedelhi.secure;

import android.os.Build;
import android.view.View;

public class of4 {

    @sj3(26)
    /* renamed from: com.onedelhi.secure.of4$a */
    public static class C3057a {
        @pn0
        /* renamed from: a */
        public static void m23743a(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* renamed from: a */
    public static void m23742a(@mr2 View view, @ts2 CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            C3057a.m23743a(view, charSequence);
        } else {
            rf4.m26715h(view, charSequence);
        }
    }
}
