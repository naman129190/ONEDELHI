package com.onedelhi.secure;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.Api;

/* renamed from: com.onedelhi.secure.k2 */
public final class C2591k2 {

    /* renamed from: a */
    public static final Api.AbstractClientBuilder f14684a;

    /* renamed from: a */
    public static final Api.ClientKey f14685a;
    @mr2

    /* renamed from: a */
    public static final Api f14686a;
    @Deprecated

    /* renamed from: a */
    public static final fh5 f14687a = new fh5();
    @mr2

    /* renamed from: a */
    public static final String f14688a = "com.google.android.gms.auth.START_ACCOUNT_EXPORT";
    @Deprecated

    /* renamed from: b */
    public static final fh5 f14689b = new fh5();
    @mr2

    /* renamed from: b */
    public static final String f14690b = "com.google.android.gms.auth.ACCOUNT_IMPORT_DATA_AVAILABLE";
    @mr2

    /* renamed from: c */
    public static final String f14691c = "com.google.android.gms.auth.ACCOUNT_EXPORT_DATA_AVAILABLE";
    @mr2

    /* renamed from: d */
    public static final String f14692d = "key_extra_account_type";

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        f14685a = clientKey;
        sa5 sa5 = new sa5();
        f14684a = sa5;
        f14686a = new Api("AccountTransfer.ACCOUNT_TRANSFER_API", sa5, clientKey);
    }

    @mr2
    /* renamed from: a */
    public static C2690l2 m19398a(@mr2 Activity activity) {
        return new C2690l2(activity, (x07) null);
    }

    @mr2
    /* renamed from: b */
    public static C2690l2 m19399b(@mr2 Context context) {
        return new C2690l2(context, (x07) null);
    }
}
