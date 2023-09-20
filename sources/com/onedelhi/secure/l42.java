package com.onedelhi.secure;

import android.widget.ListView;

public final class l42 {

    @sj3(19)
    /* renamed from: com.onedelhi.secure.l42$a */
    public static class C2693a {
        @pn0
        /* renamed from: a */
        public static boolean m20217a(ListView listView, int i) {
            return listView.canScrollList(i);
        }

        @pn0
        /* renamed from: b */
        public static void m20218b(ListView listView, int i) {
            listView.scrollListBy(i);
        }
    }

    /* renamed from: a */
    public static boolean m20215a(@mr2 ListView listView, int i) {
        return C2693a.m20217a(listView, i);
    }

    /* renamed from: b */
    public static void m20216b(@mr2 ListView listView, int i) {
        C2693a.m20218b(listView, i);
    }
}
