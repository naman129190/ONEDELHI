package com.onedelhi.secure;

import android.util.Log;
import javax.annotation.Nullable;

public final class zg6 extends ei6 {
    public zg6(dh6 dh6, String str, Double d, boolean z) {
        super(dh6, "measurement.test.double_flag", d, true, (ci6) null);
    }

    @Nullable
    /* renamed from: a */
    public final /* synthetic */ Object mo13705a(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            String str = this.f11247a;
            Log.e("PhenotypeFlag", "Invalid double value for " + str + ": " + ((String) obj));
            return null;
        }
    }
}
