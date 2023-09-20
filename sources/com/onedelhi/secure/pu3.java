package com.onedelhi.secure;

import android.app.Service;
import android.os.Build;
import com.onedelhi.secure.hl3;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class pu3 {

    /* renamed from: a */
    public static final int f18715a = 1;

    /* renamed from: b */
    public static final int f18716b = 1;

    /* renamed from: c */
    public static final int f18717c = 2;

    @sj3(24)
    /* renamed from: com.onedelhi.secure.pu3$a */
    public static class C3193a {
        @pn0
        /* renamed from: a */
        public static void m25045a(Service service, int i) {
            service.stopForeground(i);
        }
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.onedelhi.secure.pu3$b */
    public @interface C3194b {
    }

    /* renamed from: a */
    public static void m25044a(@mr2 Service service, int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            C3193a.m25045a(service, i);
            return;
        }
        boolean z = true;
        if ((i & 1) == 0) {
            z = false;
        }
        service.stopForeground(z);
    }
}
