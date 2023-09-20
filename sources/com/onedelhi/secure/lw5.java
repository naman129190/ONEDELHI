package com.onedelhi.secure;

import android.util.Log;
import javax.annotation.Nullable;

public final class lw5 extends iy5 {
    public lw5(tw5 tw5, String str, Double d, boolean z) {
        super(tw5, str, d, true, (ey5) null);
    }

    @Nullable
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo14923a(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            String c = super.mo18066c();
            Log.e("PhenotypeFlag", "Invalid double value for " + c + ": " + ((String) obj));
            return null;
        }
    }
}
