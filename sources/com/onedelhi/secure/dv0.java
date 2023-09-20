package com.onedelhi.secure;

import android.os.Environment;
import java.io.File;

public final class dv0 {

    /* renamed from: a */
    public static final String f10946a = "EnvironmentCompat";

    /* renamed from: b */
    public static final String f10947b = "unknown";

    @sj3(19)
    /* renamed from: com.onedelhi.secure.dv0$a */
    public static class C2005a {
        @pn0
        /* renamed from: a */
        public static String m13361a(File file) {
            return Environment.getStorageState(file);
        }
    }

    @sj3(21)
    /* renamed from: com.onedelhi.secure.dv0$b */
    public static class C2006b {
        @pn0
        /* renamed from: a */
        public static String m13362a(File file) {
            return Environment.getExternalStorageState(file);
        }
    }

    @mr2
    /* renamed from: a */
    public static String m13360a(@mr2 File file) {
        return C2006b.m13362a(file);
    }
}
