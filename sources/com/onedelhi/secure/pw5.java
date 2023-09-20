package com.onedelhi.secure;

import android.util.Base64;
import android.util.Log;
import java.io.IOException;

public final class pw5 extends iy5 {

    /* renamed from: a */
    public final /* synthetic */ ug6 f18722a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pw5(tw5 tw5, String str, Object obj, boolean z, ug6 ug6, byte[] bArr) {
        super(tw5, "getTokenRefactor__blocked_packages", obj, true, (ey5) null);
        this.f18722a = ug6;
    }

    /* renamed from: a */
    public final Object mo14923a(Object obj) {
        try {
            return lg6.m20662l(Base64.decode((String) obj, 3));
        } catch (IOException | IllegalArgumentException unused) {
            String c = super.mo18066c();
            Log.e("PhenotypeFlag", "Invalid byte[] value for " + c + ": " + ((String) obj));
            return null;
        }
    }
}
