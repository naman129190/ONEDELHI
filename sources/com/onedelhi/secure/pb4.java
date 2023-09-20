package com.onedelhi.secure;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.Window;

public final class pb4 {
    /* renamed from: a */
    public static void m24572a(@mr2 Context context, @e64 int i) {
        Resources.Theme b;
        context.getTheme().applyStyle(i, true);
        if ((context instanceof Activity) && (b = m24573b((Activity) context)) != null) {
            b.applyStyle(i, true);
        }
    }

    @ts2
    /* renamed from: b */
    public static Resources.Theme m24573b(@mr2 Activity activity) {
        View peekDecorView;
        Context context;
        Window window = activity.getWindow();
        if (window == null || (peekDecorView = window.peekDecorView()) == null || (context = peekDecorView.getContext()) == null) {
            return null;
        }
        return context.getTheme();
    }
}
