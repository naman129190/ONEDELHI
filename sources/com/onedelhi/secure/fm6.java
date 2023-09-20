package com.onedelhi.secure;

import java.util.Comparator;

public final class fm6 implements Comparator {
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        on6 on6 = (on6) obj;
        on6 on62 = (on6) obj2;
        dm6 dm6 = new dm6(on6);
        dm6 dm62 = new dm6(on62);
        while (dm6.hasNext() && dm62.hasNext()) {
            int compareTo = Integer.valueOf(dm6.mo14798c() & 255).compareTo(Integer.valueOf(dm62.mo14798c() & 255));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(on6.mo18486f()).compareTo(Integer.valueOf(on62.mo18486f()));
    }
}
