package com.onedelhi.secure;

import com.google.android.gms.common.api.CommonStatusCodes;

/* renamed from: com.onedelhi.secure.n2 */
public final class C2913n2 extends CommonStatusCodes {

    /* renamed from: a */
    public static final int f16993a = 20500;

    /* renamed from: b */
    public static final int f16994b = 20501;

    /* renamed from: c */
    public static final int f16995c = 20502;

    /* renamed from: d */
    public static final int f16996d = 20503;

    /* renamed from: e */
    public static final int f16997e = 20504;

    @mr2
    public static String getStatusCodeString(int i) {
        switch (i) {
            case f16993a /*20500*/:
                return "NOT_ALLOWED_SECURITY";
            case f16994b /*20501*/:
                return "NO_DATA_AVAILABLE";
            case f16995c /*20502*/:
                return "INVALID_REQUEST";
            case f16996d /*20503*/:
                return "CHALLENGE_NOT_ALLOWED";
            case f16997e /*20504*/:
                return "SESSION_INACTIVE";
            default:
                return CommonStatusCodes.getStatusCodeString(i);
        }
    }
}
