package com.onedelhi.secure;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class ux2 {

    @sj3(28)
    /* renamed from: com.onedelhi.secure.ux2$a */
    public static class C3748a {
        @pn0
        @ts2
        /* renamed from: a */
        public static Signature[] m29674a(@mr2 SigningInfo signingInfo) {
            return signingInfo.getApkContentsSigners();
        }

        @pn0
        /* renamed from: b */
        public static long m29675b(PackageInfo packageInfo) {
            return packageInfo.getLongVersionCode();
        }

        @pn0
        @ts2
        /* renamed from: c */
        public static Signature[] m29676c(@mr2 SigningInfo signingInfo) {
            return signingInfo.getSigningCertificateHistory();
        }

        @pn0
        /* renamed from: d */
        public static boolean m29677d(@mr2 SigningInfo signingInfo) {
            return signingInfo.hasMultipleSigners();
        }

        @pn0
        /* renamed from: e */
        public static boolean m29678e(@mr2 PackageManager packageManager, @mr2 String str, @mr2 byte[] bArr, int i) {
            return packageManager.hasSigningCertificate(str, bArr, i);
        }
    }

    /* renamed from: a */
    public static boolean m29669a(@mr2 byte[][] bArr, @mr2 byte[] bArr2) {
        for (byte[] equals : bArr) {
            if (Arrays.equals(bArr2, equals)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static byte[] m29670b(byte[] bArr) {
        try {
            return MessageDigest.getInstance("SHA256").digest(bArr);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Device doesn't support SHA256 cert checking", e);
        }
    }

    /* renamed from: c */
    public static long m29671c(@mr2 PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? C3748a.m29675b(packageInfo) : (long) packageInfo.versionCode;
    }

    @mr2
    /* renamed from: d */
    public static List<Signature> m29672d(@mr2 PackageManager packageManager, @mr2 String str) throws PackageManager.NameNotFoundException {
        Signature[] signatureArr;
        if (Build.VERSION.SDK_INT >= 28) {
            SigningInfo signingInfo = packageManager.getPackageInfo(str, 134217728).signingInfo;
            signatureArr = C3748a.m29677d(signingInfo) ? C3748a.m29674a(signingInfo) : C3748a.m29676c(signingInfo);
        } else {
            signatureArr = packageManager.getPackageInfo(str, 64).signatures;
        }
        return signatureArr == null ? Collections.emptyList() : Arrays.asList(signatureArr);
    }

    /* renamed from: e */
    public static boolean m29673e(@mr2 PackageManager packageManager, @mr2 String str, @mr2 @qz3(min = 1) Map<byte[], Integer> map, boolean z) throws PackageManager.NameNotFoundException {
        if (map.isEmpty()) {
            return false;
        }
        Set<byte[]> keySet = map.keySet();
        for (byte[] next : keySet) {
            if (next != null) {
                Integer num = map.get(next);
                if (num != null) {
                    int intValue = num.intValue();
                    if (intValue != 0 && intValue != 1) {
                        throw new IllegalArgumentException("Unsupported certificate type " + num + " when verifying " + str);
                    }
                } else {
                    throw new IllegalArgumentException("Type must be specified for cert when verifying " + str);
                }
            } else {
                throw new IllegalArgumentException("Cert byte array cannot be null when verifying " + str);
            }
        }
        List<Signature> d = m29672d(packageManager, str);
        if (z || Build.VERSION.SDK_INT < 28) {
            if (d.size() != 0 && map.size() <= d.size() && (!z || map.size() == d.size())) {
                byte[][] bArr = null;
                if (map.containsValue(1)) {
                    bArr = new byte[d.size()][];
                    for (int i = 0; i < d.size(); i++) {
                        bArr[i] = m29670b(d.get(i).toByteArray());
                    }
                }
                Iterator<byte[]> it = keySet.iterator();
                if (it.hasNext()) {
                    byte[] next2 = it.next();
                    Integer num2 = map.get(next2);
                    int intValue2 = num2.intValue();
                    if (intValue2 != 0) {
                        if (intValue2 != 1) {
                            throw new IllegalArgumentException("Unsupported certificate type " + num2);
                        } else if (!m29669a(bArr, next2)) {
                            return false;
                        }
                    } else if (!d.contains(new Signature(next2))) {
                        return false;
                    }
                    return true;
                }
            }
            return false;
        }
        for (byte[] next3 : keySet) {
            if (!C3748a.m29678e(packageManager, str, next3, map.get(next3).intValue())) {
                return false;
            }
        }
        return true;
    }
}
