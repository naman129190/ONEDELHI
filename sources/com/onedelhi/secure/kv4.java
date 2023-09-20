package com.onedelhi.secure;

import android.view.View;
import android.view.ViewParent;
import com.onedelhi.secure.jb3;

public class kv4 {
    @ts2
    /* renamed from: a */
    public static a32 m20050a(@mr2 View view) {
        a32 a32 = (a32) view.getTag(jb3.C2486a.view_tree_lifecycle_owner);
        if (a32 != null) {
            return a32;
        }
        while (true) {
            ViewParent parent = view.getParent();
            if (a32 != null || !(parent instanceof View)) {
                return a32;
            }
            view = (View) parent;
            a32 = (a32) view.getTag(jb3.C2486a.view_tree_lifecycle_owner);
        }
        return a32;
    }

    /* renamed from: b */
    public static void m20051b(@mr2 View view, @ts2 a32 a32) {
        view.setTag(jb3.C2486a.view_tree_lifecycle_owner, a32);
    }
}
