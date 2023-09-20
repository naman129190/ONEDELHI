package com.onedelhi.secure;

import android.database.CursorWindow;
import android.os.Build;

public final class cc0 {

    @sj3(15)
    /* renamed from: com.onedelhi.secure.cc0$a */
    public static class C1881a {
        @pn0
        /* renamed from: a */
        public static CursorWindow m12435a(String str) {
            return new CursorWindow(str);
        }
    }

    @sj3(28)
    /* renamed from: com.onedelhi.secure.cc0$b */
    public static class C1882b {
        @pn0
        /* renamed from: a */
        public static CursorWindow m12436a(String str, long j) {
            return new CursorWindow(str, j);
        }
    }

    @mr2
    /* renamed from: a */
    public static CursorWindow m12434a(@ts2 String str, long j) {
        return Build.VERSION.SDK_INT >= 28 ? C1882b.m12436a(str, j) : C1881a.m12435a(str);
    }
}
