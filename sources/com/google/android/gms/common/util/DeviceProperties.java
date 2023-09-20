package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import com.google.android.apps.common.proguard.SideEffectFree;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;

@KeepForSdk
public final class DeviceProperties {
    @ts2
    private static Boolean zza;
    @ts2
    private static Boolean zzb;
    @ts2
    private static Boolean zzc;
    @ts2
    private static Boolean zzd;
    @ts2
    private static Boolean zze;
    @ts2
    private static Boolean zzf;
    @ts2
    private static Boolean zzg;
    @ts2
    private static Boolean zzh;
    @ts2
    private static Boolean zzi;
    @ts2
    private static Boolean zzj;
    @ts2
    private static Boolean zzk;
    @ts2
    private static Boolean zzl;

    private DeviceProperties() {
    }

    @KeepForSdk
    public static boolean isAuto(@mr2 Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (zzi == null) {
            boolean z = false;
            if (PlatformVersion.isAtLeastO() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z = true;
            }
            zzi = Boolean.valueOf(z);
        }
        return zzi.booleanValue();
    }

    @KeepForSdk
    public static boolean isBstar(@mr2 Context context) {
        if (zzl == null) {
            boolean z = false;
            if (PlatformVersion.isAtLeastR() && context.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")) {
                z = true;
            }
            zzl = Boolean.valueOf(z);
        }
        return zzl.booleanValue();
    }

    @KeepForSdk
    public static boolean isLatchsky(@mr2 Context context) {
        if (zzf == null) {
            PackageManager packageManager = context.getPackageManager();
            boolean z = false;
            if (packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services")) {
                z = true;
            }
            zzf = Boolean.valueOf(z);
        }
        return zzf.booleanValue();
    }

    @KeepForSdk
    public static boolean isPhone(@mr2 Context context) {
        if (zza == null) {
            boolean z = false;
            if (!isTablet(context) && !isWearable(context) && !zzb(context)) {
                if (zzh == null) {
                    zzh = Boolean.valueOf(context.getPackageManager().hasSystemFeature("org.chromium.arc"));
                }
                if (!zzh.booleanValue() && !isAuto(context) && !isTv(context)) {
                    if (zzk == null) {
                        zzk = Boolean.valueOf(context.getPackageManager().hasSystemFeature("com.google.android.feature.AMATI_EXPERIENCE"));
                    }
                    if (!zzk.booleanValue() && !isBstar(context)) {
                        z = true;
                    }
                }
            }
            zza = Boolean.valueOf(z);
        }
        return zza.booleanValue();
    }

    @KeepForSdk
    public static boolean isSevenInchTablet(@mr2 Context context) {
        return zzc(context.getResources());
    }

    @TargetApi(21)
    @KeepForSdk
    public static boolean isSidewinder(@mr2 Context context) {
        return zza(context);
    }

    @KeepForSdk
    public static boolean isTablet(@mr2 Context context) {
        return isTablet(context.getResources());
    }

    @KeepForSdk
    public static boolean isTablet(@mr2 Resources resources) {
        boolean z = false;
        if (resources == null) {
            return false;
        }
        if (zzb == null) {
            if ((resources.getConfiguration().screenLayout & 15) > 3 || zzc(resources)) {
                z = true;
            }
            zzb = Boolean.valueOf(z);
        }
        return zzb.booleanValue();
    }

    @KeepForSdk
    public static boolean isTv(@mr2 Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (zzj == null) {
            boolean z = true;
            if (!packageManager.hasSystemFeature("com.google.android.tv") && !packageManager.hasSystemFeature("android.hardware.type.television") && !packageManager.hasSystemFeature("android.software.leanback")) {
                z = false;
            }
            zzj = Boolean.valueOf(z);
        }
        return zzj.booleanValue();
    }

    @KeepForSdk
    public static boolean isUserBuild() {
        int i = GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        return "user".equals(Build.TYPE);
    }

    @SideEffectFree
    @TargetApi(20)
    @KeepForSdk
    public static boolean isWearable(@mr2 Context context) {
        return zzd(context.getPackageManager());
    }

    @TargetApi(26)
    @KeepForSdk
    public static boolean isWearableWithoutPlayStore(@mr2 Context context) {
        if (isWearable(context) && !PlatformVersion.isAtLeastN()) {
            return true;
        }
        if (zza(context)) {
            return !PlatformVersion.isAtLeastO() || PlatformVersion.isAtLeastR();
        }
        return false;
    }

    @TargetApi(21)
    public static boolean zza(@mr2 Context context) {
        if (zze == null) {
            boolean z = false;
            if (PlatformVersion.isAtLeastLollipop() && context.getPackageManager().hasSystemFeature("cn.google")) {
                z = true;
            }
            zze = Boolean.valueOf(z);
        }
        return zze.booleanValue();
    }

    public static boolean zzb(@mr2 Context context) {
        if (zzg == null) {
            boolean z = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z = false;
            }
            zzg = Boolean.valueOf(z);
        }
        return zzg.booleanValue();
    }

    public static boolean zzc(@mr2 Resources resources) {
        boolean z = false;
        if (resources == null) {
            return false;
        }
        if (zzc == null) {
            Configuration configuration = resources.getConfiguration();
            if ((configuration.screenLayout & 15) <= 3 && configuration.smallestScreenWidthDp >= 600) {
                z = true;
            }
            zzc = Boolean.valueOf(z);
        }
        return zzc.booleanValue();
    }

    @SideEffectFree
    @TargetApi(20)
    public static boolean zzd(@mr2 PackageManager packageManager) {
        if (zzd == null) {
            boolean z = false;
            if (PlatformVersion.isAtLeastKitKatWatch() && packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z = true;
            }
            zzd = Boolean.valueOf(z);
        }
        return zzd.booleanValue();
    }
}
