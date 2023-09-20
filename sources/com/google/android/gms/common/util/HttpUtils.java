package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.onedelhi.secure.d57;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.rv6;
import com.onedelhi.secure.tk4;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

@KeepForSdk
public class HttpUtils {
    private static final Pattern zza = Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");
    private static final Pattern zzb = Pattern.compile("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$");
    private static final Pattern zzc = Pattern.compile("^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$");

    private HttpUtils() {
    }

    @mr2
    @KeepForSdk
    public static Map<String, String> parse(@mr2 URI uri, @mr2 String str) {
        Map<String, String> emptyMap = Collections.emptyMap();
        String rawQuery = uri.getRawQuery();
        if (rawQuery != null && rawQuery.length() > 0) {
            emptyMap = new HashMap<>();
            d57 c = d57.m12974c(rv6.m27095b('='));
            for (String f : d57.m12974c(rv6.m27095b(tk4.f35696c)).mo14533b().mo14534d(rawQuery)) {
                List f2 = c.mo14535f(f);
                if (f2.isEmpty() || f2.size() > 2) {
                    throw new IllegalArgumentException("bad parameter");
                }
                emptyMap.put(zza((String) f2.get(0), str), f2.size() == 2 ? zza((String) f2.get(1), str) : null);
            }
        }
        return emptyMap;
    }

    private static String zza(String str, String str2) {
        if (str2 == null) {
            str2 = "ISO-8859-1";
        }
        try {
            return URLDecoder.decode(str, str2);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
