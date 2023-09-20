package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.C1410R;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import com.onedelhi.secure.ak4;
import com.onedelhi.secure.l50;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.ty3;
import com.onedelhi.secure.uc3;
import java.util.Locale;
import javax.annotation.concurrent.GuardedBy;

public final class zac {
    @GuardedBy("sCache")
    private static final ty3 zaa = new ty3();
    @GuardedBy("sCache")
    @ts2
    private static Locale zab;

    public static String zaa(Context context) {
        String packageName = context.getPackageName();
        try {
            return Wrappers.packageManager(context).getApplicationLabel(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String zab(Context context) {
        return context.getResources().getString(uc3.C3698e.common_google_play_services_notification_channel_name);
    }

    @mr2
    public static String zac(Context context, int i) {
        return context.getResources().getString(i != 1 ? i != 2 ? i != 3 ? 17039370 : uc3.C3698e.common_google_play_services_enable_button : uc3.C3698e.common_google_play_services_update_button : uc3.C3698e.common_google_play_services_install_button);
    }

    @mr2
    public static String zad(Context context, int i) {
        Resources resources = context.getResources();
        String zaa2 = zaa(context);
        if (i == 1) {
            return resources.getString(uc3.C3698e.common_google_play_services_install_text, new Object[]{zaa2});
        } else if (i != 2) {
            if (i == 3) {
                return resources.getString(uc3.C3698e.common_google_play_services_enable_text, new Object[]{zaa2});
            } else if (i == 5) {
                return zah(context, "common_google_play_services_invalid_account_text", zaa2);
            } else {
                if (i == 7) {
                    return zah(context, "common_google_play_services_network_error_text", zaa2);
                }
                if (i == 9) {
                    return resources.getString(uc3.C3698e.common_google_play_services_unsupported_text, new Object[]{zaa2});
                } else if (i == 20) {
                    return zah(context, "common_google_play_services_restricted_profile_text", zaa2);
                } else {
                    switch (i) {
                        case 16:
                            return zah(context, "common_google_play_services_api_unavailable_text", zaa2);
                        case 17:
                            return zah(context, "common_google_play_services_sign_in_failed_text", zaa2);
                        case 18:
                            return resources.getString(uc3.C3698e.common_google_play_services_updating_text, new Object[]{zaa2});
                        default:
                            return resources.getString(C1410R.string.common_google_play_services_unknown_issue, new Object[]{zaa2});
                    }
                }
            }
        } else if (DeviceProperties.isWearableWithoutPlayStore(context)) {
            return resources.getString(uc3.C3698e.common_google_play_services_wear_update_text);
        } else {
            return resources.getString(uc3.C3698e.common_google_play_services_update_text, new Object[]{zaa2});
        }
    }

    @mr2
    public static String zae(Context context, int i) {
        return (i == 6 || i == 19) ? zah(context, "common_google_play_services_resolution_required_text", zaa(context)) : zad(context, i);
    }

    @mr2
    public static String zaf(Context context, int i) {
        String zai = i == 6 ? zai(context, "common_google_play_services_resolution_required_title") : zag(context, i);
        return zai == null ? context.getResources().getString(uc3.C3698e.common_google_play_services_notification_ticker) : zai;
    }

    @ts2
    public static String zag(Context context, int i) {
        String str;
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(uc3.C3698e.common_google_play_services_install_title);
            case 2:
                return resources.getString(uc3.C3698e.common_google_play_services_update_title);
            case 3:
                return resources.getString(uc3.C3698e.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return zai(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return zai(context, "common_google_play_services_network_error_title");
            case 8:
                str = "Internal error occurred. Please see logs for detailed information";
                break;
            case 9:
                str = "Google Play services is invalid. Cannot recover.";
                break;
            case 10:
                str = "Developer error occurred. Please see logs for detailed information";
                break;
            case 11:
                str = "The application is not licensed to the user.";
                break;
            case 16:
                str = "One of the API components you attempted to connect to is not available.";
                break;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return zai(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return zai(context, "common_google_play_services_restricted_profile_title");
            default:
                str = "Unexpected error code " + i;
                break;
        }
        Log.e("GoogleApiAvailability", str);
        return null;
    }

    private static String zah(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String zai = zai(context, str);
        if (zai == null) {
            zai = resources.getString(C1410R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, zai, new Object[]{str2});
    }

    @ts2
    private static String zai(Context context, String str) {
        ty3 ty3 = zaa;
        synchronized (ty3) {
            Locale d = l50.m20228a(context.getResources().getConfiguration()).mo24214d(0);
            if (!d.equals(zab)) {
                ty3.clear();
                zab = d;
            }
            String str2 = (String) ty3.get(str);
            if (str2 != null) {
                return str2;
            }
            Resources remoteResource = GooglePlayServicesUtil.getRemoteResource(context);
            if (remoteResource == null) {
                return null;
            }
            int identifier = remoteResource.getIdentifier(str, ak4.C1709b.f9167e, "com.google.android.gms");
            if (identifier == 0) {
                Log.w("GoogleApiAvailability", "Missing resource: " + str);
                return null;
            }
            String string = remoteResource.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                Log.w("GoogleApiAvailability", "Got empty resource: " + str);
                return null;
            }
            ty3.put(str, string);
            return string;
        }
    }
}
