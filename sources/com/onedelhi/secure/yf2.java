package com.onedelhi.secure;

import android.content.Context;
import android.os.Build;
import android.telephony.mbms.ServiceInfo;
import java.util.Locale;
import java.util.Set;

public final class yf2 {

    @sj3(28)
    /* renamed from: com.onedelhi.secure.yf2$a */
    public static class C3998a {
        /* renamed from: a */
        public static CharSequence m32341a(Context context, ServiceInfo serviceInfo) {
            Set<Locale> namedContentLocales = serviceInfo.getNamedContentLocales();
            if (namedContentLocales.isEmpty()) {
                return null;
            }
            String[] strArr = new String[namedContentLocales.size()];
            int i = 0;
            for (Locale languageTag : serviceInfo.getNamedContentLocales()) {
                strArr[i] = languageTag.toLanguageTag();
                i++;
            }
            Locale firstMatch = context.getResources().getConfiguration().getLocales().getFirstMatch(strArr);
            if (firstMatch == null) {
                return null;
            }
            return serviceInfo.getNameForLocale(firstMatch);
        }
    }

    @ts2
    /* renamed from: a */
    public static CharSequence m32340a(@mr2 Context context, @mr2 ServiceInfo serviceInfo) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C3998a.m32341a(context, serviceInfo);
        }
        return null;
    }
}
