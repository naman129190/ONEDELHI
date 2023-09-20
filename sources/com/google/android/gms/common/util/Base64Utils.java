package com.google.android.gms.common.util;

import android.util.Base64;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import com.onedelhi.secure.mr2;

@KeepForSdk
public final class Base64Utils {
    @mr2
    @KeepForSdk
    public static byte[] decode(@mr2 String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    @mr2
    @KeepForSdk
    public static byte[] decodeUrlSafe(@mr2 String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 10);
    }

    @ResultIgnorabilityUnspecified
    @mr2
    @KeepForSdk
    public static byte[] decodeUrlSafeNoPadding(@mr2 String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 11);
    }

    @mr2
    @KeepForSdk
    public static String encode(@mr2 byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 0);
    }

    @mr2
    @KeepForSdk
    public static String encodeUrlSafe(@mr2 byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 10);
    }

    @mr2
    @KeepForSdk
    public static String encodeUrlSafeNoPadding(@mr2 byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }
}
