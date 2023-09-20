package com.onedelhi.secure;

import android.util.Log;

public class o92 {

    /* renamed from: a */
    public static final o92 f32944a = new o92(f32945b);

    /* renamed from: b */
    public static final String f32945b = "FirebaseCrashlytics";

    /* renamed from: a */
    public int f32946a = 4;

    /* renamed from: a */
    public final String f32947a;

    public o92(String str) {
        this.f32947a = str;
    }

    /* renamed from: f */
    public static o92 m59120f() {
        return f32944a;
    }

    /* renamed from: a */
    public final boolean mo41612a(int i) {
        return this.f32946a <= i || Log.isLoggable(this.f32947a, i);
    }

    /* renamed from: b */
    public void mo41613b(String str) {
        mo41614c(str, (Throwable) null);
    }

    /* renamed from: c */
    public void mo41614c(String str, Throwable th) {
        if (mo41612a(3)) {
            Log.d(this.f32947a, str, th);
        }
    }

    /* renamed from: d */
    public void mo41615d(String str) {
        mo41616e(str, (Throwable) null);
    }

    /* renamed from: e */
    public void mo41616e(String str, Throwable th) {
        if (mo41612a(6)) {
            Log.e(this.f32947a, str, th);
        }
    }

    /* renamed from: g */
    public void mo41617g(String str) {
        mo41618h(str, (Throwable) null);
    }

    /* renamed from: h */
    public void mo41618h(String str, Throwable th) {
        if (mo41612a(4)) {
            Log.i(this.f32947a, str, th);
        }
    }

    /* renamed from: i */
    public void mo41619i(int i, String str) {
        mo41620j(i, str, false);
    }

    /* renamed from: j */
    public void mo41620j(int i, String str, boolean z) {
        if (z || mo41612a(i)) {
            Log.println(i, this.f32947a, str);
        }
    }

    /* renamed from: k */
    public void mo41621k(String str) {
        mo41622l(str, (Throwable) null);
    }

    /* renamed from: l */
    public void mo41622l(String str, Throwable th) {
        if (mo41612a(2)) {
            Log.v(this.f32947a, str, th);
        }
    }

    /* renamed from: m */
    public void mo41623m(String str) {
        mo41624n(str, (Throwable) null);
    }

    /* renamed from: n */
    public void mo41624n(String str, Throwable th) {
        if (mo41612a(5)) {
            Log.w(this.f32947a, str, th);
        }
    }
}
