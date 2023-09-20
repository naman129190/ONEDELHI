package com.onedelhi.secure;

import com.google.android.gms.common.api.CommonStatusCodes;

public final class tf1 extends CommonStatusCodes {

    /* renamed from: a */
    public static final int f20776a = 1000;

    /* renamed from: b */
    public static final int f20777b = 1001;

    /* renamed from: c */
    public static final int f20778c = 1002;

    /* renamed from: d */
    public static final int f20779d = 1004;

    /* renamed from: e */
    public static final int f20780e = 1005;

    /* renamed from: a */
    public static int m28381a(int i) {
        if (i == 0) {
            return i;
        }
        if (i < 1000 || i >= 1006) {
            return 13;
        }
        return i;
    }

    @mr2
    public static String getStatusCodeString(int i) {
        switch (i) {
            case 1000:
                return "GEOFENCE_NOT_AVAILABLE";
            case 1001:
                return "GEOFENCE_TOO_MANY_GEOFENCES";
            case 1002:
                return "GEOFENCE_TOO_MANY_PENDING_INTENTS";
            case 1004:
                return "GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION";
            default:
                return CommonStatusCodes.getStatusCodeString(i);
        }
    }
}
