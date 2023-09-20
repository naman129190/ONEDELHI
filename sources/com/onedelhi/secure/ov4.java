package com.onedelhi.secure;

import android.view.View;
import android.view.ViewParent;
import com.onedelhi.secure.mb3;

public class ov4 {
    @ts2
    /* renamed from: a */
    public static hu4 m24126a(@mr2 View view) {
        hu4 hu4 = (hu4) view.getTag(mb3.C2853a.view_tree_view_model_store_owner);
        if (hu4 != null) {
            return hu4;
        }
        while (true) {
            ViewParent parent = view.getParent();
            if (hu4 != null || !(parent instanceof View)) {
                return hu4;
            }
            view = (View) parent;
            hu4 = (hu4) view.getTag(mb3.C2853a.view_tree_view_model_store_owner);
        }
        return hu4;
    }

    /* renamed from: b */
    public static void m24127b(@mr2 View view, @ts2 hu4 hu4) {
        view.setTag(mb3.C2853a.view_tree_view_model_store_owner, hu4);
    }
}
