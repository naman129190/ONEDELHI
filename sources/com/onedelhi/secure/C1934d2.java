package com.onedelhi.secure;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.pm.PackageManager;

/* renamed from: com.onedelhi.secure.d2 */
public final class C1934d2 {

    /* renamed from: a */
    public static final int f10585a = 1;

    /* renamed from: b */
    public static final int f10586b = 2;

    /* renamed from: c */
    public static final int f10587c = 4;

    /* renamed from: d */
    public static final int f10588d = 8;

    /* renamed from: e */
    public static final int f10589e = 32;

    /* renamed from: f */
    public static final int f10590f = -1;

    /* renamed from: g */
    public static final int f10591g = 2;

    /* renamed from: h */
    public static final int f10592h = 4;

    /* renamed from: i */
    public static final int f10593i = 8;

    /* renamed from: j */
    public static final int f10594j = 16;

    /* renamed from: k */
    public static final int f10595k = 32;

    @mr2
    /* renamed from: a */
    public static String m12878a(int i) {
        return i != 1 ? i != 2 ? i != 4 ? i != 8 ? "UNKNOWN" : "CAPABILITY_CAN_FILTER_KEY_EVENTS" : "CAPABILITY_CAN_REQUEST_ENHANCED_WEB_ACCESSIBILITY" : "CAPABILITY_CAN_REQUEST_TOUCH_EXPLORATION" : "CAPABILITY_CAN_RETRIEVE_WINDOW_CONTENT";
    }

    @mr2
    /* renamed from: b */
    public static String m12879b(int i) {
        StringBuilder sb = new StringBuilder();
        String str = "[";
        while (true) {
            sb.append(str);
            while (i > 0) {
                int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(i);
                i &= ~numberOfTrailingZeros;
                if (sb.length() > 1) {
                    sb.append(", ");
                }
                if (numberOfTrailingZeros == 1) {
                    str = "FEEDBACK_SPOKEN";
                } else if (numberOfTrailingZeros == 2) {
                    str = "FEEDBACK_HAPTIC";
                } else if (numberOfTrailingZeros == 4) {
                    str = "FEEDBACK_AUDIBLE";
                } else if (numberOfTrailingZeros == 8) {
                    str = "FEEDBACK_VISUAL";
                } else if (numberOfTrailingZeros == 16) {
                    str = "FEEDBACK_GENERIC";
                }
            }
            sb.append("]");
            return sb.toString();
        }
    }

    @ts2
    /* renamed from: c */
    public static String m12880c(int i) {
        if (i == 1) {
            return "DEFAULT";
        }
        if (i == 2) {
            return "FLAG_INCLUDE_NOT_IMPORTANT_VIEWS";
        }
        if (i == 4) {
            return "FLAG_REQUEST_TOUCH_EXPLORATION_MODE";
        }
        if (i == 8) {
            return "FLAG_REQUEST_ENHANCED_WEB_ACCESSIBILITY";
        }
        if (i == 16) {
            return "FLAG_REPORT_VIEW_IDS";
        }
        if (i != 32) {
            return null;
        }
        return "FLAG_REQUEST_FILTER_KEY_EVENTS";
    }

    /* renamed from: d */
    public static int m12881d(@mr2 AccessibilityServiceInfo accessibilityServiceInfo) {
        return accessibilityServiceInfo.getCapabilities();
    }

    @ts2
    /* renamed from: e */
    public static String m12882e(@mr2 AccessibilityServiceInfo accessibilityServiceInfo, @mr2 PackageManager packageManager) {
        return accessibilityServiceInfo.loadDescription(packageManager);
    }
}
