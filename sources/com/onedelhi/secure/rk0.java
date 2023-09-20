package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@hw4(otherwise = 3)
public class rk0 {

    /* renamed from: a */
    public static rk0 f34660a = null;

    /* renamed from: a */
    public static final C7012v5 f34661a = C7012v5.m67717e();

    /* renamed from: a */
    public static final String f34662a = "FirebasePerfSharedPrefs";

    /* renamed from: a */
    public volatile SharedPreferences f34663a;

    /* renamed from: a */
    public final ExecutorService f34664a;

    @hw4
    public rk0(ExecutorService executorService) {
        this.f34664a = executorService;
    }

    @hw4
    /* renamed from: c */
    public static void m63696c() {
        f34660a = null;
    }

    @SuppressLint({"ThreadPoolCreation"})
    /* renamed from: h */
    public static synchronized rk0 m63697h() {
        rk0 rk0;
        synchronized (rk0.class) {
            if (f34660a == null) {
                f34660a = new rk0(Executors.newSingleThreadExecutor());
            }
            rk0 = f34660a;
        }
        return rk0;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m63698k(Context context) {
        if (this.f34663a == null && context != null) {
            this.f34663a = context.getSharedPreferences("FirebasePerfSharedPrefs", 0);
        }
    }

    /* renamed from: b */
    public void mo43923b(String str) {
        if (str == null) {
            f34661a.mo46000a("Key is null. Cannot clear nullable key");
        } else {
            this.f34663a.edit().remove(str).apply();
        }
    }

    /* renamed from: d */
    public boolean mo43924d(String str) {
        return (this.f34663a == null || str == null || !this.f34663a.contains(str)) ? false : true;
    }

    /* renamed from: e */
    public rw2<Boolean> mo43925e(String str) {
        if (str == null) {
            f34661a.mo46000a("Key is null when getting boolean value on device cache.");
        } else {
            if (this.f34663a == null) {
                mo43930l(mo43926f());
                if (this.f34663a == null) {
                    return rw2.m63941a();
                }
            }
            if (!this.f34663a.contains(str)) {
                return rw2.m63941a();
            }
            try {
                return rw2.m63943e(Boolean.valueOf(this.f34663a.getBoolean(str, false)));
            } catch (ClassCastException e) {
                f34661a.mo46001b("Key %s from sharedPreferences has type other than long: %s", str, e.getMessage());
            }
        }
        return rw2.m63941a();
    }

    @ts2
    /* renamed from: f */
    public final Context mo43926f() {
        try {
            w31.m68755p();
            return w31.m68755p().mo46527n();
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    /* renamed from: g */
    public rw2<Float> mo43927g(String str) {
        if (str == null) {
            f34661a.mo46000a("Key is null when getting float value on device cache.");
        } else {
            if (this.f34663a == null) {
                mo43930l(mo43926f());
                if (this.f34663a == null) {
                    return rw2.m63941a();
                }
            }
            if (!this.f34663a.contains(str)) {
                return rw2.m63941a();
            }
            try {
                return rw2.m63943e(Float.valueOf(this.f34663a.getFloat(str, 0.0f)));
            } catch (ClassCastException e) {
                f34661a.mo46001b("Key %s from sharedPreferences has type other than float: %s", str, e.getMessage());
            }
        }
        return rw2.m63941a();
    }

    /* renamed from: i */
    public rw2<Long> mo43928i(String str) {
        if (str == null) {
            f34661a.mo46000a("Key is null when getting long value on device cache.");
        } else {
            if (this.f34663a == null) {
                mo43930l(mo43926f());
                if (this.f34663a == null) {
                    return rw2.m63941a();
                }
            }
            if (!this.f34663a.contains(str)) {
                return rw2.m63941a();
            }
            try {
                return rw2.m63943e(Long.valueOf(this.f34663a.getLong(str, 0)));
            } catch (ClassCastException e) {
                f34661a.mo46001b("Key %s from sharedPreferences has type other than long: %s", str, e.getMessage());
            }
        }
        return rw2.m63941a();
    }

    /* renamed from: j */
    public rw2<String> mo43929j(String str) {
        if (str == null) {
            f34661a.mo46000a("Key is null when getting String value on device cache.");
        } else {
            if (this.f34663a == null) {
                mo43930l(mo43926f());
                if (this.f34663a == null) {
                    return rw2.m63941a();
                }
            }
            if (!this.f34663a.contains(str)) {
                return rw2.m63941a();
            }
            try {
                return rw2.m63943e(this.f34663a.getString(str, ""));
            } catch (ClassCastException e) {
                f34661a.mo46001b("Key %s from sharedPreferences has type other than String: %s", str, e.getMessage());
            }
        }
        return rw2.m63941a();
    }

    /* renamed from: l */
    public synchronized void mo43930l(Context context) {
        if (this.f34663a == null && context != null) {
            this.f34664a.execute(new qk0(this, context));
        }
    }

    /* renamed from: m */
    public boolean mo43931m(String str, float f) {
        if (str == null) {
            f34661a.mo46000a("Key is null when setting float value on device cache.");
            return false;
        }
        if (this.f34663a == null) {
            mo43930l(mo43926f());
            if (this.f34663a == null) {
                return false;
            }
        }
        this.f34663a.edit().putFloat(str, f).apply();
        return true;
    }

    /* renamed from: n */
    public boolean mo43932n(String str, long j) {
        if (str == null) {
            f34661a.mo46000a("Key is null when setting long value on device cache.");
            return false;
        }
        if (this.f34663a == null) {
            mo43930l(mo43926f());
            if (this.f34663a == null) {
                return false;
            }
        }
        this.f34663a.edit().putLong(str, j).apply();
        return true;
    }

    /* renamed from: o */
    public boolean mo43933o(String str, String str2) {
        if (str == null) {
            f34661a.mo46000a("Key is null when setting String value on device cache.");
            return false;
        }
        if (this.f34663a == null) {
            mo43930l(mo43926f());
            if (this.f34663a == null) {
                return false;
            }
        }
        if (str2 == null) {
            this.f34663a.edit().remove(str).apply();
            return true;
        }
        this.f34663a.edit().putString(str, str2).apply();
        return true;
    }

    /* renamed from: p */
    public boolean mo43934p(String str, boolean z) {
        if (str == null) {
            f34661a.mo46000a("Key is null when setting boolean value on device cache.");
            return false;
        }
        if (this.f34663a == null) {
            mo43930l(mo43926f());
            if (this.f34663a == null) {
                return false;
            }
        }
        this.f34663a.edit().putBoolean(str, z).apply();
        return true;
    }
}
