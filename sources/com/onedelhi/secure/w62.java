package com.onedelhi.secure;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Locale;

public class w62 {

    /* renamed from: a */
    public static final String f22055a = pj0.m61166a(-121520817018695L);

    /* renamed from: b */
    public static final String f22056b = pj0.m61166a(-121533701920583L);

    /* renamed from: c */
    public static final String f22057c = pj0.m61166a(-121546586822471L);

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.onedelhi.secure.w62$a */
    public @interface C3834a {

        /* renamed from: a */
        public static final String[] f22058a = {pj0.m61166a(-121164334733127L), pj0.m61166a(-121177219635015L)};
    }

    /* renamed from: a */
    public static String m30699a(Context context) {
        return context.getSharedPreferences(pj0.m61166a(-121190104536903L), 0).getString(pj0.m61166a(-121276003882823L), pj0.m61166a(-121349018326855L));
    }

    /* renamed from: b */
    public static Locale m30700b(Resources resources) {
        Configuration configuration = resources.getConfiguration();
        return Build.VERSION.SDK_INT >= 24 ? configuration.getLocales().get(0) : configuration.locale;
    }

    /* renamed from: c */
    public static void m30701c(Context context, String str) {
        context.getSharedPreferences(pj0.m61166a(-121361903228743L), 0).edit().putString(pj0.m61166a(-121447802574663L), str).apply();
    }

    /* renamed from: d */
    public static Context m30702d(Context context) {
        return m30704f(context, m30699a(context));
    }

    /* renamed from: e */
    public static Context m30703e(Context context, String str) {
        m30701c(context, str);
        return m30704f(context, str);
    }

    /* renamed from: f */
    public static Context m30704f(Context context, String str) {
        Locale locale = new Locale(str);
        Locale.setDefault(locale);
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(locale);
        return context.createConfigurationContext(configuration);
    }
}
