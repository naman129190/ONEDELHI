package com.onedelhi.secure;

import android.view.View;
import android.widget.ListPopupWindow;

public final class f42 {

    @sj3(19)
    /* renamed from: com.onedelhi.secure.f42$a */
    public static class C2116a {
        @pn0
        /* renamed from: a */
        public static View.OnTouchListener m14614a(ListPopupWindow listPopupWindow, View view) {
            return listPopupWindow.createDragToOpenListener(view);
        }
    }

    @ts2
    /* renamed from: a */
    public static View.OnTouchListener m14612a(@mr2 ListPopupWindow listPopupWindow, @mr2 View view) {
        return C2116a.m14614a(listPopupWindow, view);
    }

    @Deprecated
    /* renamed from: b */
    public static View.OnTouchListener m14613b(Object obj, View view) {
        return m14612a((ListPopupWindow) obj, view);
    }
}
