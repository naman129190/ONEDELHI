package com.onedelhi.secure;

import android.util.Log;
import javax.annotation.Nullable;

public final class sg6 extends ei6 {
    public sg6(dh6 dh6, String str, Long l, boolean z) {
        super(dh6, str, l, true, (ci6) null);
    }

    @Nullable
    /* renamed from: a */
    public final /* synthetic */ Object mo13705a(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            String str = this.f11247a;
            Log.e("PhenotypeFlag", "Invalid long value for " + str + ": " + ((String) obj));
            return null;
        }
    }
}
