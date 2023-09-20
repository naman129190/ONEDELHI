package com.onedelhi.secure;

import android.content.Context;
import android.provider.Settings;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import com.phonepe.intent.sdk.contracts.DeviceIdListener;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Date;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import jmjou.C7601c;
import jmjou.C7606e;

public class w25 implements C7606e {

    /* renamed from: a */
    public p15 f36858a;

    /* renamed from: a */
    public C7601c f36859a;

    /* renamed from: a */
    public static Pair<byte[], byte[]> m68740a(byte[] bArr, byte[] bArr2) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, wr0.f37095a);
            byte[] bArr3 = new byte[16];
            new SecureRandom().nextBytes(bArr3);
            Log.d("MainActivity", "encrypt: " + bArr3);
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr3);
            Cipher instance = Cipher.getInstance("AES/CTR/NoPadding");
            instance.init(1, secretKeySpec, ivParameterSpec);
            return new Pair<>(instance.doFinal(bArr), bArr3);
        } catch (Exception e) {
            m05.m56773d("MerchantTransaction", "Error in encrypting value", e);
            return null;
        }
    }

    /* renamed from: b */
    public void mo46505b(boolean z, DeviceIdListener deviceIdListener) {
        Context context = (Context) this.f36858a.f33436a.getValue();
        String str = null;
        String string = Settings.Secure.getString(context == null ? null : context.getContentResolver(), "android_id");
        jt1.m53776o(string, "getString(context?.conte…ttings.Secure.ANDROID_ID)");
        m05.m56772c("MerchantTransaction", "DeviceID" + string);
        if (deviceIdListener != null) {
            if (z) {
                String c = this.f36859a.mo48867c();
                Date date = new Date();
                try {
                    byte[] bytes = (string + ar4.f25981a + date.getTime()).getBytes();
                    MessageDigest instance = MessageDigest.getInstance("SHA-256");
                    instance.update(c.getBytes(StandardCharsets.UTF_8));
                    Pair<byte[], byte[]> a = m68740a(bytes, instance.digest());
                    if (a != null) {
                        byte[] bArr = (byte[]) a.first;
                        byte[] bArr2 = (byte[]) a.second;
                        StringBuilder sb = new StringBuilder();
                        for (byte b : bArr) {
                            String hexString = Integer.toHexString(b & 255);
                            if (hexString.length() == 1) {
                                sb.append('0');
                            }
                            sb.append(hexString);
                        }
                        StringBuilder sb2 = new StringBuilder();
                        for (byte b2 : bArr2) {
                            String hexString2 = Integer.toHexString(b2 & 255);
                            if (hexString2.length() == 1) {
                                sb2.append('0');
                            }
                            sb2.append(hexString2);
                        }
                        str = Base64.encodeToString((sb2.toString() + sb.toString() + ar4.f25981a + ((String) this.f36859a.mo48872h("com.phonepe.android.sdk.AppId"))).getBytes(StandardCharsets.UTF_8), 2);
                    }
                } catch (NoSuchAlgorithmException unused) {
                }
            } else {
                str = string;
            }
            deviceIdListener.onDeviceIdAvailable(str);
        }
    }

    public void init(C7601c cVar, C7601c.C7602a aVar) {
        this.f36859a = cVar;
        this.f36858a = (p15) cVar.mo48873i(p15.class);
    }

    public boolean isCachingAllowed() {
        return true;
    }
}
