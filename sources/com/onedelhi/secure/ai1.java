package com.onedelhi.secure;

import com.google.android.gms.common.api.CommonStatusCodes;

public final class ai1 extends CommonStatusCodes {

    /* renamed from: a */
    public static final int f9067a = 12500;

    /* renamed from: b */
    public static final int f9068b = 12501;

    /* renamed from: c */
    public static final int f9069c = 12502;

    @mr2
    public static String getStatusCodeString(int i) {
        switch (i) {
            case f9067a /*12500*/:
                return "A non-recoverable sign in failure occurred";
            case f9068b /*12501*/:
                return "Sign in action cancelled";
            case f9069c /*12502*/:
                return "Sign-in in progress";
            default:
                return CommonStatusCodes.getStatusCodeString(i);
        }
    }
}
