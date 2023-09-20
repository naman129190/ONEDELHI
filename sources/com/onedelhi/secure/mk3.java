package com.onedelhi.secure;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.util.List;

public class mk3 implements ik3<Uri, Drawable> {

    /* renamed from: a */
    public static final int f16167a = 0;

    /* renamed from: a */
    public static final String f16168a = "android";

    /* renamed from: b */
    public static final int f16169b = 2;

    /* renamed from: c */
    public static final int f16170c = 0;

    /* renamed from: d */
    public static final int f16171d = 1;

    /* renamed from: e */
    public static final int f16172e = 1;

    /* renamed from: f */
    public static final int f16173f = 0;

    /* renamed from: a */
    public final Context f16174a;

    public mk3(Context context) {
        this.f16174a = context.getApplicationContext();
    }

    @ts2
    /* renamed from: c */
    public ck3<Drawable> mo14336a(@mr2 Uri uri, int i, int i2, @mr2 zw2 zw2) {
        Context d = mo20459d(uri, uri.getAuthority());
        return nr2.m23142f(ap0.m11353b(this.f16174a, d, mo20462g(d, uri)));
    }

    @mr2
    /* renamed from: d */
    public final Context mo20459d(Uri uri, String str) {
        if (str.equals(this.f16174a.getPackageName())) {
            return this.f16174a;
        }
        try {
            return this.f16174a.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            if (str.contains(this.f16174a.getPackageName())) {
                return this.f16174a;
            }
            throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e);
        }
    }

    @dp0
    /* renamed from: e */
    public final int mo20460e(Uri uri) {
        try {
            return Integer.parseInt(uri.getPathSegments().get(0));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e);
        }
    }

    @dp0
    /* renamed from: f */
    public final int mo20461f(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        String authority = uri.getAuthority();
        String str = pathSegments.get(0);
        String str2 = pathSegments.get(1);
        int identifier = context.getResources().getIdentifier(str2, str, authority);
        if (identifier == 0) {
            identifier = Resources.getSystem().getIdentifier(str2, str, "android");
        }
        if (identifier != 0) {
            return identifier;
        }
        throw new IllegalArgumentException("Failed to find resource id for: " + uri);
    }

    @dp0
    /* renamed from: g */
    public final int mo20462g(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return mo20461f(context, uri);
        }
        if (pathSegments.size() == 1) {
            return mo20460e(uri);
        }
        throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
    }

    /* renamed from: h */
    public boolean mo14337b(@mr2 Uri uri, @mr2 zw2 zw2) {
        return uri.getScheme().equals("android.resource");
    }
}
