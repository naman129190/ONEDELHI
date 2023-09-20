package com.onedelhi.secure;

import com.onedelhi.secure.hl3;
import java.util.HashMap;
import java.util.Map;

@hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
public class qi2 {

    /* renamed from: a */
    public Map<String, Integer> f19194a = new HashMap();

    @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
    /* renamed from: a */
    public boolean mo23187a(String str, int i) {
        Integer num = this.f19194a.get(str);
        boolean z = false;
        int intValue = num != null ? num.intValue() : 0;
        if ((intValue & i) != 0) {
            z = true;
        }
        this.f19194a.put(str, Integer.valueOf(i | intValue));
        return !z;
    }
}
