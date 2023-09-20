package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* renamed from: com.onedelhi.secure.a9 */
public class C1670a9 {

    /* renamed from: a */
    public static final String f8904a = "android.support.AppLaunchChecker";

    /* renamed from: b */
    public static final String f8905b = "startedFromLauncher";

    /* renamed from: a */
    public static boolean m10935a(@mr2 Context context) {
        return context.getSharedPreferences(f8904a, 0).getBoolean(f8905b, false);
    }

    /* renamed from: b */
    public static void m10936b(@mr2 Activity activity) {
        Intent intent;
        SharedPreferences sharedPreferences = activity.getSharedPreferences(f8904a, 0);
        if (sharedPreferences.getBoolean(f8905b, false) || (intent = activity.getIntent()) == null || !"android.intent.action.MAIN".equals(intent.getAction())) {
            return;
        }
        if (intent.hasCategory("android.intent.category.LAUNCHER") || intent.hasCategory(qs1.f19450e)) {
            sharedPreferences.edit().putBoolean(f8905b, true).apply();
        }
    }
}
