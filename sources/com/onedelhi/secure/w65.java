package com.onedelhi.secure;

import android.util.Base64;
import java.security.SecureRandom;

public final class w65 {

    /* renamed from: a */
    public static final SecureRandom f22059a = new SecureRandom();

    /* renamed from: a */
    public static String m30705a() {
        byte[] bArr = new byte[16];
        f22059a.nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }
}
