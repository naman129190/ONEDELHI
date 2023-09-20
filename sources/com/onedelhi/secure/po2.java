package com.onedelhi.secure;

import java.util.regex.Pattern;
import org.apache.http.Header;
import org.apache.http.HttpMessage;
import org.apache.http.HttpResponse;

public final class po2 {

    /* renamed from: a */
    public static final Pattern f33749a = Pattern.compile("(^|.*\\s)datatransport/\\S+ android/($|\\s.*)");

    /* renamed from: a */
    public static Long m61527a(@mr2 HttpMessage httpMessage) {
        try {
            Header firstHeader = httpMessage.getFirstHeader("content-length");
            if (firstHeader != null) {
                return Long.valueOf(Long.parseLong(firstHeader.getValue()));
            }
            return null;
        } catch (NumberFormatException unused) {
            C7012v5.m67717e().mo46000a("The content-length value is not a valid number");
            return null;
        }
    }

    /* renamed from: b */
    public static String m61528b(@mr2 HttpResponse httpResponse) {
        String value;
        Header firstHeader = httpResponse.getFirstHeader("content-type");
        if (firstHeader == null || (value = firstHeader.getValue()) == null) {
            return null;
        }
        return value;
    }

    /* renamed from: c */
    public static boolean m61529c(@ts2 String str) {
        return str == null || !f33749a.matcher(str).matches();
    }

    /* renamed from: d */
    public static void m61530d(oo2 oo2) {
        if (!oo2.mo41932i()) {
            oo2.mo41940s();
        }
        oo2.mo41927b();
    }
}
