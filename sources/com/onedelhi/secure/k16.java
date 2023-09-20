package com.onedelhi.secure;

import java.util.Comparator;

public final class k16 implements Comparator {
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        i36 i36 = (i36) obj;
        i36 i362 = (i36) obj2;
        g16 g16 = new g16(i36);
        g16 g162 = new g16(i362);
        while (g16.hasNext() && g162.hasNext()) {
            int compareTo = Integer.valueOf(g16.mo16279c() & 255).compareTo(Integer.valueOf(g162.mo16279c() & 255));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(i36.mo17550f()).compareTo(Integer.valueOf(i362.mo17550f()));
    }
}
