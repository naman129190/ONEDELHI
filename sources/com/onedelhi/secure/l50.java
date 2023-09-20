package com.onedelhi.secure;

import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;

public final class l50 {

    @sj3(24)
    /* renamed from: com.onedelhi.secure.l50$a */
    public static class C2694a {
        @pn0
        /* renamed from: a */
        public static LocaleList m20229a(Configuration configuration) {
            return configuration.getLocales();
        }
    }

    @mr2
    /* renamed from: a */
    public static s62 m20228a(@mr2 Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 24) {
            return s62.m27265n(C2694a.m20229a(configuration));
        }
        return s62.m27259a(configuration.locale);
    }
}
