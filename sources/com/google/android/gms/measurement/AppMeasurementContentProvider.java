package com.google.android.gms.measurement;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import com.google.android.gms.common.internal.Preconditions;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.nu5;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.za6;

@Deprecated
public class AppMeasurementContentProvider extends ContentProvider {
    public void attachInfo(@mr2 Context context, @mr2 ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if ("com.google.android.gms.measurement.google_measurement_service".equals(providerInfo.authority)) {
            throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
        }
    }

    public int delete(@mr2 Uri uri, @ts2 String str, @mr2 String[] strArr) {
        return 0;
    }

    @ts2
    public String getType(@mr2 Uri uri) {
        return null;
    }

    @ts2
    public Uri insert(@mr2 Uri uri, @mr2 ContentValues contentValues) {
        return null;
    }

    public boolean onCreate() {
        Context context = getContext();
        Preconditions.checkNotNull(context);
        za6.m32969H(context, (nu5) null, (Long) null);
        return false;
    }

    @ts2
    public Cursor query(@mr2 Uri uri, @mr2 String[] strArr, @ts2 String str, @mr2 String[] strArr2, @ts2 String str2) {
        return null;
    }

    public int update(@mr2 Uri uri, @ts2 ContentValues contentValues, @ts2 String str, @mr2 String[] strArr) {
        return 0;
    }
}
