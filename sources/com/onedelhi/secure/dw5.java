package com.onedelhi.secure;

import android.util.Log;
import javax.annotation.Nullable;

public final class dw5 extends iy5 {
    public dw5(tw5 tw5, String str, Long l, boolean z) {
        super(tw5, str, l, true, (ey5) null);
    }

    @Nullable
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo14923a(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            String c = super.mo18066c();
            Log.e("PhenotypeFlag", "Invalid long value for " + c + ": " + ((String) obj));
            return null;
        }
    }
}
