package com.onedelhi.secure;

import android.net.Uri;
import javax.annotation.Nullable;

public final class du5 {

    /* renamed from: a */
    public final ty3 f10944a;

    public du5(ty3 ty3) {
        this.f10944a = ty3;
    }

    @Nullable
    /* renamed from: a */
    public final String mo14860a(@Nullable Uri uri, @Nullable String str, @Nullable String str2, String str3) {
        if (uri == null) {
            return null;
        }
        ty3 ty3 = (ty3) this.f10944a.get(uri.toString());
        if (ty3 == null) {
            return null;
        }
        return (String) ty3.get("".concat(String.valueOf(str3)));
    }
}
