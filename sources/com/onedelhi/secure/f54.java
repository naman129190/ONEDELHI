package com.onedelhi.secure;

import android.util.Log;
import com.onedelhi.secure.hl3;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

@hl3({hl3.C2354a.f13188c})
public class f54 {

    /* renamed from: a */
    public static final String[] f11831a = new String[0];

    /* renamed from: a */
    public static void m14636a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("?");
            if (i2 < i - 1) {
                sb.append(vf4.f36537c);
            }
        }
    }

    @ts2
    /* renamed from: b */
    public static String m14637b(@ts2 List<Integer> list) {
        if (list == null) {
            return null;
        }
        int size = list.size();
        if (size == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(Integer.toString(list.get(i).intValue()));
            if (i < size - 1) {
                sb.append(vf4.f36537c);
            }
        }
        return sb.toString();
    }

    /* renamed from: c */
    public static StringBuilder m14638c() {
        return new StringBuilder();
    }

    @ts2
    /* renamed from: d */
    public static List<Integer> m14639d(@ts2 String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        StringTokenizer stringTokenizer = new StringTokenizer(str, vf4.f36537c);
        while (stringTokenizer.hasMoreElements()) {
            try {
                arrayList.add(Integer.valueOf(Integer.parseInt(stringTokenizer.nextToken())));
            } catch (NumberFormatException e) {
                Log.e(vm3.f21887a, "Malformed integer list", e);
            }
        }
        return arrayList;
    }
}
