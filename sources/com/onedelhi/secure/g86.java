package com.onedelhi.secure;

import java.util.HashMap;
import java.util.concurrent.Callable;

public final /* synthetic */ class g86 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ b96 f12475a;

    /* renamed from: a */
    public final /* synthetic */ String f12476a;

    public /* synthetic */ g86(b96 b96, String str) {
        this.f12475a = b96;
        this.f12476a = str;
    }

    public final Object call() {
        b96 b96 = this.f12475a;
        String str = this.f12476a;
        yd6 R = b96.f21907a.mo23370W().mo26065R(str);
        HashMap hashMap = new HashMap();
        hashMap.put("platform", "android");
        hashMap.put("package_name", str);
        b96.f11205a.mo27891z().mo14124q();
        hashMap.put("gmp_version", 76003L);
        if (R != null) {
            String l0 = R.mo27405l0();
            if (l0 != null) {
                hashMap.put("app_version", l0);
            }
            hashMap.put("app_version_int", Long.valueOf(R.mo27371P()));
            hashMap.put("dynamite_version", Long.valueOf(R.mo27380Y()));
        }
        return hashMap;
    }
}
