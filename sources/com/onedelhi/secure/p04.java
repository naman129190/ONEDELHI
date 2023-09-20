package com.onedelhi.secure;

import com.google.android.gms.common.api.CommonStatusCodes;

public final class p04 extends CommonStatusCodes {

    /* renamed from: a */
    public static final int f18268a = 36500;

    /* renamed from: b */
    public static final int f18269b = 36501;

    /* renamed from: c */
    public static final int f18270c = 36502;

    @mr2
    public static String getStatusCodeString(int i) {
        switch (i) {
            case f18268a /*36500*/:
                return "PLATFORM_NOT_SUPPORTED";
            case f18269b /*36501*/:
                return "API_NOT_AVAILABLE";
            case f18270c /*36502*/:
                return "USER_PERMISSION_REQUIRED";
            default:
                return CommonStatusCodes.getStatusCodeString(i);
        }
    }
}
