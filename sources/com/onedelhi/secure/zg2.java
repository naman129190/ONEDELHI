package com.onedelhi.secure;

import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;

public final class zg2 {

    @sj3(28)
    /* renamed from: com.onedelhi.secure.zg2$a */
    public static class C4094a {
        @pn0
        /* renamed from: a */
        public static void m33140a(Menu menu, boolean z) {
            menu.setGroupDividerEnabled(z);
        }
    }

    /* renamed from: a */
    public static void m33138a(@mr2 Menu menu, boolean z) {
        if (menu instanceof g74) {
            ((g74) menu).setGroupDividerEnabled(z);
        } else if (Build.VERSION.SDK_INT >= 28) {
            C4094a.m33140a(menu, z);
        }
    }

    @Deprecated
    /* renamed from: b */
    public static void m33139b(MenuItem menuItem, int i) {
        menuItem.setShowAsAction(i);
    }
}
