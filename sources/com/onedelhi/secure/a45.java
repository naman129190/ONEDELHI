package com.onedelhi.secure;

import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ShowFirstParty;

public final class a45 {

    /* renamed from: a */
    public static final Api.AbstractClientBuilder f8734a;

    /* renamed from: a */
    public static final Api.ClientKey f8735a;

    /* renamed from: a */
    public static final Api f8736a;

    /* renamed from: a */
    public static final Scope f8737a = new Scope(Scopes.PROFILE);

    /* renamed from: b */
    public static final Api.AbstractClientBuilder f8738b;
    @ShowFirstParty

    /* renamed from: b */
    public static final Api.ClientKey f8739b;

    /* renamed from: b */
    public static final Api f8740b;

    /* renamed from: b */
    public static final Scope f8741b = new Scope("email");

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        f8735a = clientKey;
        Api.ClientKey clientKey2 = new Api.ClientKey();
        f8739b = clientKey2;
        l35 l35 = new l35();
        f8734a = l35;
        q35 q35 = new q35();
        f8738b = q35;
        f8736a = new Api("SignIn.API", l35, clientKey);
        f8740b = new Api("SignIn.INTERNAL_API", q35, clientKey2);
    }
}
