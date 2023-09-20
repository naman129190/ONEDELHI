package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.to1;
import com.onedelhi.secure.vf4;
import java.util.HashMap;

@KeepForSdk
public class MapUtils {
    @KeepForSdk
    public static void writeStringMapToJson(@mr2 StringBuilder sb, @mr2 HashMap<String, String> hashMap) {
        sb.append(to1.f35745h);
        boolean z = true;
        for (String next : hashMap.keySet()) {
            if (!z) {
                sb.append(vf4.f36537c);
            }
            String str = hashMap.get(next);
            sb.append("\"");
            sb.append(next);
            sb.append("\":");
            if (str == null) {
                sb.append("null");
            } else {
                sb.append("\"");
                sb.append(str);
                sb.append("\"");
            }
            z = false;
        }
        sb.append("}");
    }
}
