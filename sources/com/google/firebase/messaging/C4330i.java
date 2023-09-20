package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import com.onedelhi.secure.r70;
import com.onedelhi.secure.to1;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.firebase.messaging.i */
public class C4330i {

    /* renamed from: a */
    public static final String f25203a = "|T|";

    /* renamed from: b */
    public static final String f25204b = "*";

    /* renamed from: c */
    public static final String f25205c = "com.google.android.gms.appid";

    /* renamed from: d */
    public static final String f25206d = "com.google.android.gms.appid-no-backup";

    /* renamed from: a */
    public final SharedPreferences f25207a;

    /* renamed from: com.google.firebase.messaging.i$a */
    public static class C4331a {

        /* renamed from: b */
        public static final long f25208b = TimeUnit.DAYS.toMillis(7);

        /* renamed from: c */
        public static final String f25209c = "token";

        /* renamed from: d */
        public static final String f25210d = "appVersion";

        /* renamed from: e */
        public static final String f25211e = "timestamp";

        /* renamed from: a */
        public final long f25212a;

        /* renamed from: a */
        public final String f25213a;

        /* renamed from: b */
        public final String f25214b;

        public C4331a(String str, String str2, long j) {
            this.f25213a = str;
            this.f25214b = str2;
            this.f25212a = j;
        }

        /* renamed from: a */
        public static String m34883a(String str, String str2, long j) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str);
                jSONObject.put("appVersion", str2);
                jSONObject.put("timestamp", j);
                return jSONObject.toString();
            } catch (JSONException e) {
                Log.w("FirebaseMessaging", "Failed to encode token: " + e);
                return null;
            }
        }

        /* renamed from: c */
        public static C4331a m34884c(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith(to1.f35745h)) {
                return new C4331a(str, (String) null, 0);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new C4331a(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
            } catch (JSONException e) {
                Log.w("FirebaseMessaging", "Failed to parse token: " + e);
                return null;
            }
        }

        /* renamed from: b */
        public boolean mo29828b(String str) {
            return System.currentTimeMillis() > this.f25212a + f25208b || !str.equals(this.f25214b);
        }
    }

    public C4330i(Context context) {
        this.f25207a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        mo29821a(context, f25206d);
    }

    /* renamed from: a */
    public final void mo29821a(Context context, String str) {
        File file = new File(r70.m26360m(context), str);
        if (!file.exists()) {
            try {
                if (file.createNewFile() && !mo29826f()) {
                    Log.i("FirebaseMessaging", "App restored, clearing state");
                    mo29823c();
                }
            } catch (IOException e) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e.getMessage());
                }
            }
        }
    }

    /* renamed from: b */
    public final String mo29822b(String str, String str2) {
        return str + "|T|" + str2 + to1.f35743f + "*";
    }

    /* renamed from: c */
    public synchronized void mo29823c() {
        this.f25207a.edit().clear().commit();
    }

    /* renamed from: d */
    public synchronized void mo29824d(String str, String str2) {
        String b = mo29822b(str, str2);
        SharedPreferences.Editor edit = this.f25207a.edit();
        edit.remove(b);
        edit.commit();
    }

    /* renamed from: e */
    public synchronized C4331a mo29825e(String str, String str2) {
        return C4331a.m34884c(this.f25207a.getString(mo29822b(str, str2), (String) null));
    }

    /* renamed from: f */
    public synchronized boolean mo29826f() {
        return this.f25207a.getAll().isEmpty();
    }

    /* renamed from: g */
    public synchronized void mo29827g(String str, String str2, String str3, String str4) {
        String a = C4331a.m34883a(str3, str4, System.currentTimeMillis());
        if (a != null) {
            SharedPreferences.Editor edit = this.f25207a.edit();
            edit.putString(mo29822b(str, str2), a);
            edit.commit();
        }
    }
}
