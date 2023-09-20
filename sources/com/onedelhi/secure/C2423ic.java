package com.onedelhi.secure;

import com.google.android.gms.common.annotation.KeepForSdkWithMembers;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.common.internal.ShowFirstParty;

@KeepForSdkWithMembers
@ShowFirstParty
/* renamed from: com.onedelhi.secure.ic */
public class C2423ic extends CommonStatusCodes {
    @ShowFirstParty

    /* renamed from: a */
    public static final int f13573a = 3000;
    @ShowFirstParty

    /* renamed from: b */
    public static final int f13574b = 3001;
    @ShowFirstParty

    /* renamed from: c */
    public static final int f13575c = 3002;
    @ShowFirstParty

    /* renamed from: d */
    public static final int f13576d = 3003;
    @ShowFirstParty

    /* renamed from: e */
    public static final int f13577e = 3004;
    @ShowFirstParty

    /* renamed from: f */
    public static final int f13578f = 3005;
    @ShowFirstParty

    /* renamed from: g */
    public static final int f13579g = 3006;

    @mr2
    public static String getStatusCodeString(int i) {
        switch (i) {
            case 3000:
                return "AUTH_API_INVALID_CREDENTIALS";
            case f13574b /*3001*/:
                return "AUTH_API_ACCESS_FORBIDDEN";
            case f13575c /*3002*/:
                return "AUTH_API_CLIENT_ERROR";
            case f13576d /*3003*/:
                return "AUTH_API_SERVER_ERROR";
            case f13577e /*3004*/:
                return "AUTH_TOKEN_ERROR";
            case f13578f /*3005*/:
                return "AUTH_URL_RESOLUTION";
            case f13579g /*3006*/:
                return "AUTH_APP_CERT_ERROR";
            default:
                return CommonStatusCodes.getStatusCodeString(i);
        }
    }
}
