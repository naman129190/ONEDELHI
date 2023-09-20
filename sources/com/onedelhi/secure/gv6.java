package com.onedelhi.secure;

import com.google.android.gms.common.internal.Preconditions;

public final class gv6 {
    /* renamed from: a */
    public static int m16299a(int i) {
        boolean z;
        if (!(i == 0 || i == 1)) {
            if (i == 2) {
                i = 2;
            } else {
                z = false;
                Preconditions.checkArgument(z, "granularity %d must be a Granularity.GRANULARITY_* constant", Integer.valueOf(i));
                return i;
            }
        }
        z = true;
        Preconditions.checkArgument(z, "granularity %d must be a Granularity.GRANULARITY_* constant", Integer.valueOf(i));
        return i;
    }

    /* renamed from: b */
    public static String m16300b(int i) {
        if (i == 0) {
            return "GRANULARITY_PERMISSION_LEVEL";
        }
        if (i == 1) {
            return "GRANULARITY_COARSE";
        }
        if (i == 2) {
            return "GRANULARITY_FINE";
        }
        throw new IllegalArgumentException();
    }
}
