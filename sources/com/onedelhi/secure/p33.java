package com.onedelhi.secure;

import android.view.View;
import android.widget.PopupMenu;

public final class p33 {

    @sj3(19)
    /* renamed from: com.onedelhi.secure.p33$a */
    public static class C3125a {
        @pn0
        /* renamed from: a */
        public static View.OnTouchListener m24456a(PopupMenu popupMenu) {
            return popupMenu.getDragToOpenListener();
        }
    }

    @ts2
    /* renamed from: a */
    public static View.OnTouchListener m24455a(@mr2 Object obj) {
        return C3125a.m24456a((PopupMenu) obj);
    }
}
