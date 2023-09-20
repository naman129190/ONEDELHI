package com.onedelhi.secure;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public final class of0 {

    /* renamed from: a */
    public static final String f33006a = "of0";

    /* renamed from: a */
    public static final Pattern f33007a = Pattern.compile(vf4.f36537c);

    /* renamed from: a */
    public static Map<pf0, Object> m59371a(Intent intent) {
        Object obj;
        Bundle extras = intent.getExtras();
        if (extras == null || extras.isEmpty()) {
            return null;
        }
        EnumMap enumMap = new EnumMap(pf0.class);
        for (pf0 pf0 : pf0.values()) {
            if (!(pf0 == pf0.CHARACTER_SET || pf0 == pf0.NEED_RESULT_POINT_CALLBACK || pf0 == pf0.POSSIBLE_FORMATS)) {
                String name = pf0.name();
                if (extras.containsKey(name)) {
                    if (pf0.mo42584a().equals(Void.class)) {
                        obj = Boolean.TRUE;
                    } else {
                        obj = extras.get(name);
                        if (!pf0.mo42584a().isInstance(obj)) {
                            Log.w(f33006a, "Ignoring hint " + pf0 + " because it is not assignable from " + obj);
                        }
                    }
                    enumMap.put(pf0, obj);
                }
            }
        }
        Log.i(f33006a, "Hints from the Intent: " + enumMap);
        return enumMap;
    }

    /* renamed from: b */
    public static Map<pf0, ?> m59372b(Uri uri) {
        String str;
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery == null || encodedQuery.isEmpty()) {
            return null;
        }
        Map<String, String> c = m59373c(encodedQuery);
        EnumMap enumMap = new EnumMap(pf0.class);
        for (pf0 pf0 : pf0.values()) {
            if (!(pf0 == pf0.CHARACTER_SET || pf0 == pf0.NEED_RESULT_POINT_CALLBACK || pf0 == pf0.POSSIBLE_FORMATS || (str = c.get(pf0.name())) == null)) {
                Object obj = str;
                if (!pf0.mo42584a().equals(Object.class)) {
                    if (!pf0.mo42584a().equals(Void.class)) {
                        obj = str;
                        if (!pf0.mo42584a().equals(String.class)) {
                            if (pf0.mo42584a().equals(Boolean.class)) {
                                if (!str.isEmpty() && (qa0.f34045b.equals(str) || h60.f29488G.equalsIgnoreCase(str) || "no".equalsIgnoreCase(str))) {
                                    obj = Boolean.FALSE;
                                }
                            } else if (pf0.mo42584a().equals(int[].class)) {
                                boolean isEmpty = str.isEmpty();
                                String str2 = str;
                                if (!isEmpty) {
                                    char charAt = str.charAt(str.length() - 1);
                                    str2 = str;
                                    if (charAt == ',') {
                                        str2 = str.substring(0, str.length() - 1);
                                    }
                                }
                                String[] split = f33007a.split(str2);
                                int[] iArr = new int[split.length];
                                int i = 0;
                                while (i < split.length) {
                                    try {
                                        iArr[i] = Integer.parseInt(split[i]);
                                        i++;
                                    } catch (NumberFormatException unused) {
                                        Log.w(f33006a, "Skipping array of integers hint " + pf0 + " due to invalid numeric value: '" + split[i] + '\'');
                                        iArr = null;
                                    }
                                }
                                if (iArr != null) {
                                    enumMap.put(pf0, iArr);
                                }
                            } else {
                                Log.w(f33006a, "Unsupported hint type '" + pf0 + "' of type " + pf0.mo42584a());
                            }
                        }
                    }
                    obj = Boolean.TRUE;
                }
                enumMap.put(pf0, obj);
            }
        }
        Log.i(f33006a, "Hints from the URI: " + enumMap);
        return enumMap;
    }

    /* renamed from: c */
    public static Map<String, String> m59373c(String str) {
        String str2;
        HashMap hashMap = new HashMap();
        int i = 0;
        while (true) {
            if (i >= str.length()) {
                break;
            } else if (str.charAt(i) == '&') {
                i++;
            } else {
                int indexOf = str.indexOf(38, i);
                int indexOf2 = str.indexOf(61, i);
                String str3 = "";
                if (indexOf < 0) {
                    if (indexOf2 < 0) {
                        str2 = Uri.decode(str.substring(i).replace('+', ' '));
                    } else {
                        String decode = Uri.decode(str.substring(i, indexOf2).replace('+', ' '));
                        str3 = Uri.decode(str.substring(indexOf2 + 1).replace('+', ' '));
                        str2 = decode;
                    }
                    if (!hashMap.containsKey(str2)) {
                        hashMap.put(str2, str3);
                    }
                } else {
                    if (indexOf2 < 0 || indexOf2 > indexOf) {
                        String decode2 = Uri.decode(str.substring(i, indexOf).replace('+', ' '));
                        if (!hashMap.containsKey(decode2)) {
                            hashMap.put(decode2, str3);
                        }
                    } else {
                        String decode3 = Uri.decode(str.substring(i, indexOf2).replace('+', ' '));
                        String decode4 = Uri.decode(str.substring(indexOf2 + 1, indexOf).replace('+', ' '));
                        if (!hashMap.containsKey(decode3)) {
                            hashMap.put(decode3, decode4);
                        }
                    }
                    i = indexOf + 1;
                }
            }
        }
        return hashMap;
    }
}
