package com.onedelhi.secure;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

public class to1 {

    /* renamed from: a */
    public static final String[] f35738a = {"*", FirebaseMessaging.f25021e, e00.f11065f, ""};

    /* renamed from: b */
    public static final String f35739b = "com.google.android.gms.appid";

    /* renamed from: c */
    public static final String f35740c = "|S||P|";

    /* renamed from: d */
    public static final String f35741d = "|S|id";

    /* renamed from: e */
    public static final String f35742e = "|T|";

    /* renamed from: f */
    public static final String f35743f = "|";

    /* renamed from: g */
    public static final String f35744g = "token";

    /* renamed from: h */
    public static final String f35745h = "{";
    @mj1("iidPrefs")

    /* renamed from: a */
    public final SharedPreferences f35746a;

    /* renamed from: a */
    public final String f35747a;

    @hw4
    public to1(@mr2 SharedPreferences sharedPreferences, @ts2 String str) {
        this.f35746a = sharedPreferences;
        this.f35747a = str;
    }

    public to1(@mr2 w31 w31) {
        this.f35746a = w31.mo46527n().getSharedPreferences("com.google.android.gms.appid", 0);
        this.f35747a = m66072b(w31);
    }

    /* renamed from: b */
    public static String m66072b(w31 w31) {
        String m = w31.mo46529s().mo37195m();
        if (m != null) {
            return m;
        }
        String j = w31.mo46529s().mo37192j();
        if (!j.startsWith("1:") && !j.startsWith("2:")) {
            return j;
        }
        String[] split = j.split(ar4.f25981a);
        if (split.length != 4) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    @ts2
    /* renamed from: c */
    public static String m66073c(@mr2 PublicKey publicKey) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            digest[0] = (byte) (((digest[0] & 15) + 112) & 255);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    /* renamed from: a */
    public final String mo45200a(@mr2 String str, @mr2 String str2) {
        return "|T|" + str + f35743f + str2;
    }

    /* renamed from: d */
    public final String mo45201d(String str) {
        try {
            return new JSONObject(str).getString("token");
        } catch (JSONException unused) {
            return null;
        }
    }

    @ts2
    /* renamed from: e */
    public final PublicKey mo45202e(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
            Log.w("ContentValues", "Invalid key stored " + e);
            return null;
        }
    }

    @ts2
    /* renamed from: f */
    public String mo45203f() {
        synchronized (this.f35746a) {
            String g = mo45204g();
            if (g != null) {
                return g;
            }
            String h = mo45205h();
            return h;
        }
    }

    @ts2
    /* renamed from: g */
    public final String mo45204g() {
        String string;
        synchronized (this.f35746a) {
            string = this.f35746a.getString(f35741d, (String) null);
        }
        return string;
    }

    @ts2
    /* renamed from: h */
    public final String mo45205h() {
        synchronized (this.f35746a) {
            String string = this.f35746a.getString(f35740c, (String) null);
            if (string == null) {
                return null;
            }
            PublicKey e = mo45202e(string);
            if (e == null) {
                return null;
            }
            String c = m66073c(e);
            return c;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002d, code lost:
        return r4;
     */
    @com.onedelhi.secure.ts2
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo45206i() {
        /*
            r7 = this;
            android.content.SharedPreferences r0 = r7.f35746a
            monitor-enter(r0)
            java.lang.String[] r1 = f35738a     // Catch:{ all -> 0x0033 }
            int r2 = r1.length     // Catch:{ all -> 0x0033 }
            r3 = 0
        L_0x0007:
            r4 = 0
            if (r3 >= r2) goto L_0x0031
            r5 = r1[r3]     // Catch:{ all -> 0x0033 }
            java.lang.String r6 = r7.f35747a     // Catch:{ all -> 0x0033 }
            java.lang.String r5 = r7.mo45200a(r6, r5)     // Catch:{ all -> 0x0033 }
            android.content.SharedPreferences r6 = r7.f35746a     // Catch:{ all -> 0x0033 }
            java.lang.String r4 = r6.getString(r5, r4)     // Catch:{ all -> 0x0033 }
            if (r4 == 0) goto L_0x002e
            boolean r5 = r4.isEmpty()     // Catch:{ all -> 0x0033 }
            if (r5 != 0) goto L_0x002e
            java.lang.String r1 = "{"
            boolean r1 = r4.startsWith(r1)     // Catch:{ all -> 0x0033 }
            if (r1 == 0) goto L_0x002c
            java.lang.String r4 = r7.mo45201d(r4)     // Catch:{ all -> 0x0033 }
        L_0x002c:
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            return r4
        L_0x002e:
            int r3 = r3 + 1
            goto L_0x0007
        L_0x0031:
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            return r4
        L_0x0033:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.to1.mo45206i():java.lang.String");
    }
}
