package com.onedelhi.secure;

import android.net.Uri;
import com.google.firebase.analytics.FirebaseAnalytics;

public final class ig2 {

    /* renamed from: a */
    public static final int f13667a = 512;

    /* renamed from: b */
    public static final int f13668b = 384;

    /* renamed from: a */
    public static boolean m17518a(Uri uri) {
        return m17519b(uri) && !m17522e(uri);
    }

    /* renamed from: b */
    public static boolean m17519b(Uri uri) {
        return uri != null && FirebaseAnalytics.C4305d.f24947P.equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    /* renamed from: c */
    public static boolean m17520c(Uri uri) {
        return m17519b(uri) && m17522e(uri);
    }

    /* renamed from: d */
    public static boolean m17521d(int i, int i2) {
        return i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && i <= 512 && i2 <= 384;
    }

    /* renamed from: e */
    public static boolean m17522e(Uri uri) {
        return uri.getPathSegments().contains("video");
    }
}
