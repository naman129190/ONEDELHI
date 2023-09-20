package com.onedelhi.secure;

import android.database.sqlite.SQLiteCursor;
import android.os.Build;

public final class cp3 {

    @sj3(28)
    /* renamed from: com.onedelhi.secure.cp3$a */
    public static class C1922a {
        @pn0
        /* renamed from: a */
        public static void m12690a(SQLiteCursor sQLiteCursor, boolean z) {
            sQLiteCursor.setFillWindowForwardOnly(z);
        }
    }

    /* renamed from: a */
    public static void m12689a(@mr2 SQLiteCursor sQLiteCursor, boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            C1922a.m12690a(sQLiteCursor, z);
        }
    }
}
