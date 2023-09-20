package com.onedelhi.secure;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.ShowFirstParty;

@ShowFirstParty
@KeepForSdk
/* renamed from: com.onedelhi.secure.mc */
public final class C2854mc {

    /* renamed from: a */
    public static final Api.AbstractClientBuilder f16060a;
    @mr2

    /* renamed from: a */
    public static final Api.ClientKey f16061a;
    @ShowFirstParty
    @mr2
    @KeepForSdk

    /* renamed from: a */
    public static final Api<C2959nc> f16062a;
    @ShowFirstParty
    @mr2
    @KeepForSdk

    /* renamed from: a */
    public static final h73 f16063a = new kq5();

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        f16061a = clientKey;
        ka5 ka5 = new ka5();
        f16060a = ka5;
        f16062a = new Api<>("Auth.PROXY_API", ka5, clientKey);
    }

    @mr2
    @KeepForSdk
    /* renamed from: a */
    public static i73 m21471a(@mr2 Activity activity, @ts2 C2959nc ncVar) {
        return new lp5(activity, ncVar);
    }

    @mr2
    @KeepForSdk
    /* renamed from: b */
    public static i73 m21472b(@mr2 Context context, @ts2 C2959nc ncVar) {
        return new lp5(context, ncVar);
    }
}
