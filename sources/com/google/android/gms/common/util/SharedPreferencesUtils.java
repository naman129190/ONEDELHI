package com.google.android.gms.common.util;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.onedelhi.secure.mr2;

@KeepForSdk
public class SharedPreferencesUtils {
    private SharedPreferencesUtils() {
    }

    @KeepForSdk
    @Deprecated
    public static void publishWorldReadableSharedPreferences(@mr2 Context context, @mr2 SharedPreferences.Editor editor, @mr2 String str) {
        throw new IllegalStateException("world-readable shared preferences should only be used by apk");
    }
}
