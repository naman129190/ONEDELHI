package com.google.android.gms.common.util;

import android.os.Build;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.onedelhi.secure.C3196px;
import com.onedelhi.secure.C3730uo;

@KeepForSdk
public final class PlatformVersion {
    private PlatformVersion() {
    }

    @KeepForSdk
    @C3196px(api = 11)
    public static boolean isAtLeastHoneycomb() {
        return true;
    }

    @KeepForSdk
    @C3196px(api = 12)
    public static boolean isAtLeastHoneycombMR1() {
        return true;
    }

    @KeepForSdk
    @C3196px(api = 14)
    public static boolean isAtLeastIceCreamSandwich() {
        return true;
    }

    @KeepForSdk
    @C3196px(api = 15)
    public static boolean isAtLeastIceCreamSandwichMR1() {
        return true;
    }

    @KeepForSdk
    @C3196px(api = 16)
    public static boolean isAtLeastJellyBean() {
        return true;
    }

    @KeepForSdk
    @C3196px(api = 17)
    public static boolean isAtLeastJellyBeanMR1() {
        return true;
    }

    @KeepForSdk
    @C3196px(api = 18)
    public static boolean isAtLeastJellyBeanMR2() {
        return true;
    }

    @KeepForSdk
    @C3196px(api = 19)
    public static boolean isAtLeastKitKat() {
        return true;
    }

    @KeepForSdk
    @C3196px(api = 20)
    public static boolean isAtLeastKitKatWatch() {
        return true;
    }

    @KeepForSdk
    @C3196px(api = 21)
    public static boolean isAtLeastLollipop() {
        return true;
    }

    @KeepForSdk
    @C3196px(api = 22)
    public static boolean isAtLeastLollipopMR1() {
        return Build.VERSION.SDK_INT >= 22;
    }

    @KeepForSdk
    @C3196px(api = 23)
    public static boolean isAtLeastM() {
        return Build.VERSION.SDK_INT >= 23;
    }

    @KeepForSdk
    @C3196px(api = 24)
    public static boolean isAtLeastN() {
        return Build.VERSION.SDK_INT >= 24;
    }

    @KeepForSdk
    @C3196px(api = 26)
    public static boolean isAtLeastO() {
        return Build.VERSION.SDK_INT >= 26;
    }

    @KeepForSdk
    @C3196px(api = 28)
    public static boolean isAtLeastP() {
        return Build.VERSION.SDK_INT >= 28;
    }

    @KeepForSdk
    @C3196px(api = 29)
    public static boolean isAtLeastQ() {
        return Build.VERSION.SDK_INT >= 29;
    }

    @KeepForSdk
    @C3196px(api = 30)
    public static boolean isAtLeastR() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @KeepForSdk
    @C3196px(api = 31)
    public static boolean isAtLeastS() {
        return Build.VERSION.SDK_INT >= 31;
    }

    @KeepForSdk
    @C3196px(api = 32)
    public static boolean isAtLeastSv2() {
        return Build.VERSION.SDK_INT >= 32;
    }

    @KeepForSdk
    @C3196px(api = 33)
    public static boolean isAtLeastT() {
        return Build.VERSION.SDK_INT >= 33;
    }

    @KeepForSdk
    @C3196px(api = 33, codename = "UpsideDownCake")
    public static boolean isAtLeastU() {
        if (!isAtLeastT()) {
            return false;
        }
        return C3730uo.m29483l();
    }
}
