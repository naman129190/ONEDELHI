package com.onedelhi.secure;

import android.net.Uri;
import javax.annotation.Nullable;

public final class ff6 {

    /* renamed from: a */
    public final ty3 f12058a;

    public ff6(ty3 ty3) {
        this.f12058a = ty3;
    }

    @Nullable
    /* renamed from: a */
    public final String mo15950a(@Nullable Uri uri, @Nullable String str, @Nullable String str2, String str3) {
        if (uri == null) {
            return null;
        }
        ty3 ty3 = (ty3) this.f12058a.get(uri.toString());
        if (ty3 == null) {
            return null;
        }
        return (String) ty3.get("".concat(str3));
    }
}
