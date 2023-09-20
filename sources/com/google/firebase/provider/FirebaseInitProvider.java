package com.google.firebase.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.onedelhi.secure.hw4;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.w31;
import com.onedelhi.secure.y24;
import java.util.concurrent.atomic.AtomicBoolean;

public class FirebaseInitProvider extends ContentProvider {
    @ts2

    /* renamed from: a */
    public static y24 f25299a = y24.m71159e();
    @mr2

    /* renamed from: a */
    public static AtomicBoolean f25300a = new AtomicBoolean(false);

    /* renamed from: b */
    public static final String f25301b = "FirebaseInitProvider";
    @hw4

    /* renamed from: c */
    public static final String f25302c = "com.google.firebase.firebaseinitprovider";

    /* renamed from: a */
    public static void m35132a(@mr2 ProviderInfo providerInfo) {
        Preconditions.checkNotNull(providerInfo, "FirebaseInitProvider ProviderInfo cannot be null.");
        if (f25302c.equals(providerInfo.authority)) {
            throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
        }
    }

    @ts2
    /* renamed from: b */
    public static y24 m35133b() {
        return f25299a;
    }

    /* renamed from: c */
    public static boolean m35134c() {
        return f25300a.get();
    }

    public void attachInfo(@mr2 Context context, @mr2 ProviderInfo providerInfo) {
        m35132a(providerInfo);
        super.attachInfo(context, providerInfo);
    }

    public int delete(@mr2 Uri uri, @ts2 String str, @ts2 String[] strArr) {
        return 0;
    }

    @ts2
    public String getType(@mr2 Uri uri) {
        return null;
    }

    @ts2
    public Uri insert(@mr2 Uri uri, @ts2 ContentValues contentValues) {
        return null;
    }

    public boolean onCreate() {
        try {
            f25300a.set(true);
            Log.i(f25301b, w31.m68758x(getContext()) == null ? "FirebaseApp initialization unsuccessful" : "FirebaseApp initialization successful");
            return false;
        } finally {
            f25300a.set(false);
        }
    }

    @ts2
    public Cursor query(@mr2 Uri uri, @ts2 String[] strArr, @ts2 String str, @ts2 String[] strArr2, @ts2 String str2) {
        return null;
    }

    public int update(@mr2 Uri uri, @ts2 ContentValues contentValues, @ts2 String str, @ts2 String[] strArr) {
        return 0;
    }
}
