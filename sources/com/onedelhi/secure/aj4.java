package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import java.util.Calendar;

public class aj4 {

    /* renamed from: a */
    public static final int f9096a = 6;

    /* renamed from: a */
    public static aj4 f9097a = null;

    /* renamed from: a */
    public static final String f9098a = "TwilightManager";

    /* renamed from: b */
    public static final int f9099b = 22;

    /* renamed from: a */
    public final Context f9100a;

    /* renamed from: a */
    public final LocationManager f9101a;

    /* renamed from: a */
    public final C1707a f9102a = new C1707a();

    /* renamed from: com.onedelhi.secure.aj4$a */
    public static class C1707a {

        /* renamed from: a */
        public long f9103a;

        /* renamed from: a */
        public boolean f9104a;

        /* renamed from: b */
        public long f9105b;

        /* renamed from: c */
        public long f9106c;

        /* renamed from: d */
        public long f9107d;

        /* renamed from: e */
        public long f9108e;
    }

    @hw4
    public aj4(@mr2 Context context, @mr2 LocationManager locationManager) {
        this.f9100a = context;
        this.f9101a = locationManager;
    }

    /* renamed from: a */
    public static aj4 m11229a(@mr2 Context context) {
        if (f9097a == null) {
            Context applicationContext = context.getApplicationContext();
            f9097a = new aj4(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f9097a;
    }

    @hw4
    /* renamed from: f */
    public static void m11230f(aj4 aj4) {
        f9097a = aj4;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: b */
    public final Location mo13111b() {
        Location location = null;
        Location c = k13.m19369d(this.f9100a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? mo13112c("network") : null;
        if (k13.m19369d(this.f9100a, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location = mo13112c("gps");
        }
        return (location == null || c == null) ? location != null ? location : c : location.getTime() > c.getTime() ? location : c;
    }

    @wj3(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* renamed from: c */
    public final Location mo13112c(String str) {
        try {
            if (this.f9101a.isProviderEnabled(str)) {
                return this.f9101a.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e) {
            Log.d(f9098a, "Failed to get last known location", e);
            return null;
        }
    }

    /* renamed from: d */
    public boolean mo13113d() {
        C1707a aVar = this.f9102a;
        if (mo13114e()) {
            return aVar.f9104a;
        }
        Location b = mo13111b();
        if (b != null) {
            mo13115g(b);
            return aVar.f9104a;
        }
        Log.i(f9098a, "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }

    /* renamed from: e */
    public final boolean mo13114e() {
        return this.f9102a.f9108e > System.currentTimeMillis();
    }

    /* renamed from: g */
    public final void mo13115g(@mr2 Location location) {
        long j;
        C1707a aVar = this.f9102a;
        long currentTimeMillis = System.currentTimeMillis();
        zi4 b = zi4.m33168b();
        zi4 zi4 = b;
        zi4.mo28003a(currentTimeMillis - pr3.f18684a, location.getLatitude(), location.getLongitude());
        long j2 = b.f23731a;
        zi4.mo28003a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = b.f23730a == 1;
        long j3 = b.f23732b;
        long j4 = j2;
        long j5 = b.f23731a;
        long j6 = j3;
        boolean z2 = z;
        b.mo28003a(pr3.f18684a + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j7 = b.f23732b;
        if (j6 == -1 || j5 == -1) {
            j = 43200000 + currentTimeMillis;
        } else {
            j = (currentTimeMillis > j5 ? 0 + j7 : currentTimeMillis > j6 ? 0 + j5 : 0 + j6) + jg3.f30769e;
        }
        aVar.f9104a = z2;
        aVar.f9103a = j4;
        aVar.f9105b = j6;
        aVar.f9106c = j5;
        aVar.f9107d = j7;
        aVar.f9108e = j;
    }
}
