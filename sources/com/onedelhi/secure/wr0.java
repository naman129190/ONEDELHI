package com.onedelhi.secure;

import android.content.Context;
import android.content.SharedPreferences;
import android.provider.Settings;
import android.util.Base64;
import com.onedelhi.secure.m10;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

public class wr0 implements SharedPreferences {

    /* renamed from: a */
    public static final String f37095a = "AES";

    /* renamed from: a */
    public static final byte[] f37096a = {m10.C2804j.f15814a, m10.C2804j.f15814a, m10.C2804j.f15814a, m10.C2804j.f15814a, 38, 38, 38, 38, 35, 35, 35, 35, 36, 36, 36, 36};

    /* renamed from: b */
    public static final String f37097b = "AES/CBC/PKCS5PADDING";

    /* renamed from: a */
    public Context f37098a;

    /* renamed from: a */
    public SharedPreferences f37099a;

    /* renamed from: com.onedelhi.secure.wr0$a */
    public class C7178a implements SharedPreferences.Editor {

        /* renamed from: a */
        public SharedPreferences.Editor f37100a;

        public C7178a() {
            this.f37100a = wr0.this.f37099a.edit();
        }

        /* renamed from: a */
        public C7178a clear() {
            this.f37100a.clear();
            return this;
        }

        public void apply() {
            this.f37100a.apply();
        }

        /* renamed from: b */
        public C7178a putBoolean(String str, boolean z) {
            this.f37100a.putString(str, wr0.this.mo46837e(Boolean.toString(z)));
            return this;
        }

        /* renamed from: c */
        public C7178a putFloat(String str, float f) {
            this.f37100a.putString(str, wr0.this.mo46837e(Float.toString(f)));
            return this;
        }

        public boolean commit() {
            return this.f37100a.commit();
        }

        /* renamed from: d */
        public C7178a putInt(String str, int i) {
            this.f37100a.putString(str, wr0.this.mo46837e(Integer.toString(i)));
            return this;
        }

        /* renamed from: e */
        public C7178a putLong(String str, long j) {
            this.f37100a.putString(str, wr0.this.mo46837e(Long.toString(j)));
            return this;
        }

        /* renamed from: f */
        public C7178a putString(String str, String str2) {
            SharedPreferences.Editor editor = this.f37100a;
            if (str2 != null) {
                str2 = wr0.this.mo46837e(str2);
            }
            editor.putString(str, str2);
            return this;
        }

        /* renamed from: g */
        public C7178a remove(String str) {
            this.f37100a.remove(str);
            this.f37100a.apply();
            return this;
        }

        public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            return null;
        }
    }

    public wr0(Context context) {
        if (context != null) {
            this.f37098a = context;
            this.f37099a = context.getSharedPreferences("app_pref", 0);
        }
    }

    public wr0(Context context, String str) {
        if (context != null) {
            this.f37098a = context;
            this.f37099a = context.getSharedPreferences(str, 0);
        }
    }

    /* renamed from: c */
    public final String mo46834c(String str) {
        try {
            Cipher instance = Cipher.getInstance(f37097b);
            instance.init(2, new SecretKeySpec(mo46839f(), f37095a), new IvParameterSpec(f37096a));
            return new String(instance.doFinal(Base64.decode(str, 2)));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean contains(String str) {
        return this.f37099a.contains(str);
    }

    /* renamed from: d */
    public C7178a edit() {
        return new C7178a();
    }

    /* renamed from: e */
    public final String mo46837e(String str) {
        try {
            Cipher instance = Cipher.getInstance(f37097b);
            instance.init(1, new SecretKeySpec(mo46839f(), f37095a), new IvParameterSpec(f37096a));
            return new String(Base64.encode(instance.doFinal(str.getBytes()), 2));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: f */
    public final byte[] mo46839f() {
        String string = Settings.Secure.getString(this.f37098a.getContentResolver(), "android_id");
        int length = string.length();
        if (length > 16) {
            string = string.substring(0, 16);
        } else if (length < 16) {
            for (int i = 16 - length; i > 0; i--) {
                string = qa0.f34045b + string;
            }
        }
        char[] cArr = {'p', '@', 'y', PublicSuffixDatabase.f38853a, 'm', 'k', 'e', 'Y', '4', 'o', 'n', 'E', '9', '7', 'p', 'r'};
        char[] charArray = string.toCharArray();
        char[] cArr2 = new char[16];
        for (int i2 = 0; i2 < 16; i2++) {
            cArr2[i2] = (char) (cArr[i2] ^ charArray[i2]);
        }
        return new String(cArr2).getBytes();
    }

    public Map<String, ?> getAll() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        r3 = mo46834c(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean getBoolean(java.lang.String r3, boolean r4) {
        /*
            r2 = this;
            android.content.SharedPreferences r0 = r2.f37099a
            r1 = 0
            java.lang.String r3 = r0.getString(r3, r1)
            if (r3 == 0) goto L_0x001b
            java.lang.String r0 = "null"
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x001b
            java.lang.String r3 = r2.mo46834c(r3)
            if (r3 == 0) goto L_0x001b
            boolean r4 = java.lang.Boolean.parseBoolean(r3)
        L_0x001b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.wr0.getBoolean(java.lang.String, boolean):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        r3 = mo46834c(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public float getFloat(java.lang.String r3, float r4) {
        /*
            r2 = this;
            android.content.SharedPreferences r0 = r2.f37099a
            r1 = 0
            java.lang.String r3 = r0.getString(r3, r1)
            if (r3 == 0) goto L_0x001b
            java.lang.String r0 = "null"
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x001b
            java.lang.String r3 = r2.mo46834c(r3)
            if (r3 == 0) goto L_0x001b
            float r4 = java.lang.Float.parseFloat(r3)
        L_0x001b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.wr0.getFloat(java.lang.String, float):float");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        r3 = mo46834c(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getInt(java.lang.String r3, int r4) {
        /*
            r2 = this;
            android.content.SharedPreferences r0 = r2.f37099a
            r1 = 0
            java.lang.String r3 = r0.getString(r3, r1)
            if (r3 == 0) goto L_0x001b
            java.lang.String r0 = "null"
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x001b
            java.lang.String r3 = r2.mo46834c(r3)
            if (r3 == 0) goto L_0x001b
            int r4 = java.lang.Integer.parseInt(r3)
        L_0x001b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.wr0.getInt(java.lang.String, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        r3 = mo46834c(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long getLong(java.lang.String r3, long r4) {
        /*
            r2 = this;
            android.content.SharedPreferences r0 = r2.f37099a
            r1 = 0
            java.lang.String r3 = r0.getString(r3, r1)
            if (r3 == 0) goto L_0x001b
            java.lang.String r0 = "null"
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x001b
            java.lang.String r3 = r2.mo46834c(r3)
            if (r3 == 0) goto L_0x001b
            long r4 = java.lang.Long.parseLong(r3)
        L_0x001b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.wr0.getLong(java.lang.String, long):long");
    }

    public String getString(String str, String str2) {
        SharedPreferences sharedPreferences = this.f37099a;
        if (sharedPreferences == null) {
            return null;
        }
        String string = sharedPreferences.getString(str, (String) null);
        return (string == null || string.equalsIgnoreCase("null")) ? str2 : mo46834c(string);
    }

    public Set<String> getStringSet(String str, Set<String> set) {
        SharedPreferences sharedPreferences = this.f37099a;
        if (sharedPreferences == null) {
            return null;
        }
        return sharedPreferences.getStringSet(str, set);
    }

    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f37099a.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f37099a.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }
}
