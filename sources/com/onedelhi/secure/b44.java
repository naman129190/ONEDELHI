package com.onedelhi.secure;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;

@KeepForSdk
public class b44 {
    @GuardedBy("sLk")
    @ts2

    /* renamed from: a */
    public static b44 f9665a;

    /* renamed from: b */
    public static final Lock f9666b = new ReentrantLock();
    @GuardedBy("mLk")

    /* renamed from: a */
    public final SharedPreferences f9667a;

    /* renamed from: a */
    public final Lock f9668a = new ReentrantLock();

    @VisibleForTesting
    public b44(Context context) {
        this.f9667a = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    @mr2
    @KeepForSdk
    /* renamed from: b */
    public static b44 m11561b(@mr2 Context context) {
        Preconditions.checkNotNull(context);
        Lock lock = f9666b;
        lock.lock();
        try {
            if (f9665a == null) {
                f9665a = new b44(context.getApplicationContext());
            }
            b44 b44 = f9665a;
            lock.unlock();
            return b44;
        } catch (Throwable th) {
            f9666b.unlock();
            throw th;
        }
    }

    /* renamed from: k */
    public static final String m11562k(String str, String str2) {
        return str + ar4.f25981a + str2;
    }

    @KeepForSdk
    /* renamed from: a */
    public void mo13409a() {
        this.f9668a.lock();
        try {
            this.f9667a.edit().clear().apply();
        } finally {
            this.f9668a.unlock();
        }
    }

    @KeepForSdk
    @ts2
    /* renamed from: c */
    public GoogleSignInAccount mo13410c() {
        String g;
        String g2 = mo13414g("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(g2) || (g = mo13414g(m11562k("googleSignInAccount", g2))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.m8790Z2(g);
        } catch (JSONException unused) {
            return null;
        }
    }

    @KeepForSdk
    @ts2
    /* renamed from: d */
    public GoogleSignInOptions mo13411d() {
        String g;
        String g2 = mo13414g("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(g2) || (g = mo13414g(m11562k("googleSignInOptions", g2))) == null) {
            return null;
        }
        try {
            return GoogleSignInOptions.m8807T2(g);
        } catch (JSONException unused) {
            return null;
        }
    }

    @KeepForSdk
    @ts2
    /* renamed from: e */
    public String mo13412e() {
        return mo13414g("refreshToken");
    }

    @KeepForSdk
    /* renamed from: f */
    public void mo13413f(@mr2 GoogleSignInAccount googleSignInAccount, @mr2 GoogleSignInOptions googleSignInOptions) {
        Preconditions.checkNotNull(googleSignInAccount);
        Preconditions.checkNotNull(googleSignInOptions);
        mo13417j("defaultGoogleSignInAccount", googleSignInAccount.mo9213a3());
        Preconditions.checkNotNull(googleSignInAccount);
        Preconditions.checkNotNull(googleSignInOptions);
        String a3 = googleSignInAccount.mo9213a3();
        mo13417j(m11562k("googleSignInAccount", a3), googleSignInAccount.mo9214b3());
        mo13417j(m11562k("googleSignInOptions", a3), googleSignInOptions.mo9227X2());
    }

    @ts2
    /* renamed from: g */
    public final String mo13414g(@mr2 String str) {
        this.f9668a.lock();
        try {
            return this.f9667a.getString(str, (String) null);
        } finally {
            this.f9668a.unlock();
        }
    }

    /* renamed from: h */
    public final void mo13415h(@mr2 String str) {
        this.f9668a.lock();
        try {
            this.f9667a.edit().remove(str).apply();
        } finally {
            this.f9668a.unlock();
        }
    }

    /* renamed from: i */
    public final void mo13416i() {
        String g = mo13414g("defaultGoogleSignInAccount");
        mo13415h("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(g)) {
            mo13415h(m11562k("googleSignInAccount", g));
            mo13415h(m11562k("googleSignInOptions", g));
        }
    }

    /* renamed from: j */
    public final void mo13417j(@mr2 String str, @mr2 String str2) {
        this.f9668a.lock();
        try {
            this.f9667a.edit().putString(str, str2).apply();
        } finally {
            this.f9668a.unlock();
        }
    }
}
