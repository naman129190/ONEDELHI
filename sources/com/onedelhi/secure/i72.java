package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.location.GnssStatus;
import android.location.GpsStatus;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.LocationRequest;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.onedelhi.secure.oh1;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

public final class i72 {

    /* renamed from: a */
    public static final long f13506a = 30000;

    /* renamed from: a */
    public static Field f13507a = null;
    @mj1("sLocationListeners")

    /* renamed from: a */
    public static final WeakHashMap<C2413k, WeakReference<C2414l>> f13508a = new WeakHashMap<>();

    /* renamed from: b */
    public static final long f13509b = 10000;

    /* renamed from: c */
    public static final long f13510c = 5;

    @sj3(19)
    /* renamed from: com.onedelhi.secure.i72$a */
    public static class C2403a {

        /* renamed from: a */
        public static Class<?> f13511a;

        /* renamed from: a */
        public static Method f13512a;

        @pn0
        /* renamed from: a */
        public static boolean m17271a(LocationManager locationManager, String str, a82 a82, e72 e72, Looper looper) {
            try {
                if (f13511a == null) {
                    f13511a = Class.forName("android.location.LocationRequest");
                }
                if (f13512a == null) {
                    Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", new Class[]{f13511a, LocationListener.class, Looper.class});
                    f13512a = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                LocationRequest i = a82.mo12833i(str);
                if (i != null) {
                    f13512a.invoke(locationManager, new Object[]{i, e72, looper});
                    return true;
                }
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
            }
            return false;
        }

        @wj3(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        @pn0
        /* renamed from: b */
        public static boolean m17272b(LocationManager locationManager, String str, a82 a82, C2414l lVar) {
            try {
                if (f13511a == null) {
                    f13511a = Class.forName("android.location.LocationRequest");
                }
                if (f13512a == null) {
                    Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", new Class[]{f13511a, LocationListener.class, Looper.class});
                    f13512a = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                LocationRequest i = a82.mo12833i(str);
                if (i != null) {
                    synchronized (i72.f13508a) {
                        f13512a.invoke(locationManager, new Object[]{i, lVar, Looper.getMainLooper()});
                        i72.m17266m(locationManager, lVar);
                    }
                    return true;
                }
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
            }
            return false;
        }
    }

    @sj3(24)
    /* renamed from: com.onedelhi.secure.i72$b */
    public static class C2404b {
        @wj3(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        @pn0
        /* renamed from: a */
        public static boolean m17273a(LocationManager locationManager, Handler handler, Executor executor, oh1.C3059a aVar) {
            k43.m19444a(handler != null);
            ty3<Object, Object> ty3 = C2409g.f13521a;
            synchronized (ty3) {
                C2415m mVar = (C2415m) ty3.get(aVar);
                if (mVar == null) {
                    mVar = new C2415m(aVar);
                } else {
                    mVar.mo17654j();
                }
                mVar.mo17653i(executor);
                if (!locationManager.registerGnssStatusCallback(mVar, handler)) {
                    return false;
                }
                ty3.put(aVar, mVar);
                return true;
            }
        }

        @pn0
        /* renamed from: b */
        public static void m17274b(LocationManager locationManager, Object obj) {
            if (obj instanceof C2415m) {
                ((C2415m) obj).mo17654j();
            }
            locationManager.unregisterGnssStatusCallback((GnssStatus.Callback) obj);
        }
    }

    @sj3(28)
    /* renamed from: com.onedelhi.secure.i72$c */
    public static class C2405c {
        @pn0
        /* renamed from: a */
        public static String m17275a(LocationManager locationManager) {
            return locationManager.getGnssHardwareModelName();
        }

        @pn0
        /* renamed from: b */
        public static int m17276b(LocationManager locationManager) {
            return locationManager.getGnssYearOfHardware();
        }

        @pn0
        /* renamed from: c */
        public static boolean m17277c(LocationManager locationManager) {
            return locationManager.isLocationEnabled();
        }
    }

    @sj3(30)
    /* renamed from: com.onedelhi.secure.i72$d */
    public static class C2406d {

        /* renamed from: a */
        public static Class<?> f13513a;

        /* renamed from: a */
        public static Method f13514a;

        @wj3(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        @pn0
        /* renamed from: a */
        public static void m17278a(LocationManager locationManager, @mr2 String str, @ts2 C3345qu quVar, @mr2 Executor executor, @mr2 s60<Location> s60) {
            CancellationSignal cancellationSignal = quVar != null ? (CancellationSignal) quVar.mo23440b() : null;
            Objects.requireNonNull(s60);
            locationManager.getCurrentLocation(str, cancellationSignal, executor, new j72(s60));
        }

        @wj3(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        @pn0
        /* renamed from: b */
        public static boolean m17279b(LocationManager locationManager, Handler handler, Executor executor, oh1.C3059a aVar) {
            ty3<Object, Object> ty3 = C2409g.f13521a;
            synchronized (ty3) {
                C2410h hVar = (C2410h) ty3.get(aVar);
                if (hVar == null) {
                    hVar = new C2410h(aVar);
                }
                if (!locationManager.registerGnssStatusCallback(executor, hVar)) {
                    return false;
                }
                ty3.put(aVar, hVar);
                return true;
            }
        }

        @pn0
        /* renamed from: c */
        public static boolean m17280c(LocationManager locationManager, String str, a82 a82, Executor executor, e72 e72) {
            if (Build.VERSION.SDK_INT >= 30) {
                try {
                    if (f13513a == null) {
                        f13513a = Class.forName("android.location.LocationRequest");
                    }
                    if (f13514a == null) {
                        Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", new Class[]{f13513a, Executor.class, LocationListener.class});
                        f13514a = declaredMethod;
                        declaredMethod.setAccessible(true);
                    }
                    LocationRequest i = a82.mo12833i(str);
                    if (i != null) {
                        f13514a.invoke(locationManager, new Object[]{i, executor, e72});
                        return true;
                    }
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
                }
            }
            return false;
        }
    }

    @sj3(31)
    /* renamed from: com.onedelhi.secure.i72$e */
    public static class C2407e {
        @pn0
        /* renamed from: a */
        public static boolean m17281a(LocationManager locationManager, @mr2 String str) {
            return locationManager.hasProvider(str);
        }

        @wj3(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        @pn0
        /* renamed from: b */
        public static void m17282b(LocationManager locationManager, @mr2 String str, @mr2 LocationRequest locationRequest, @mr2 Executor executor, @mr2 LocationListener locationListener) {
            locationManager.requestLocationUpdates(str, locationRequest, executor, locationListener);
        }
    }

    /* renamed from: com.onedelhi.secure.i72$f */
    public static final class C2408f implements LocationListener {

        /* renamed from: a */
        public final LocationManager f13515a;

        /* renamed from: a */
        public final Handler f13516a = new Handler(Looper.getMainLooper());

        /* renamed from: a */
        public s60<Location> f13517a;
        @ts2

        /* renamed from: a */
        public Runnable f13518a;

        /* renamed from: a */
        public final Executor f13519a;
        @mj1("this")

        /* renamed from: b */
        public boolean f13520b;

        public C2408f(LocationManager locationManager, Executor executor, s60<Location> s60) {
            this.f13515a = locationManager;
            this.f13519a = executor;
            this.f13517a = s60;
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m17286f() {
            this.f13518a = null;
            onLocationChanged((Location) null);
        }

        @wj3(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        /* renamed from: c */
        public void mo17628c() {
            synchronized (this) {
                if (!this.f13520b) {
                    this.f13520b = true;
                    mo17629d();
                }
            }
        }

        @wj3(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        /* renamed from: d */
        public final void mo17629d() {
            this.f13517a = null;
            this.f13515a.removeUpdates(this);
            Runnable runnable = this.f13518a;
            if (runnable != null) {
                this.f13516a.removeCallbacks(runnable);
                this.f13518a = null;
            }
        }

        @SuppressLint({"MissingPermission"})
        /* renamed from: g */
        public void mo17630g(long j) {
            synchronized (this) {
                if (!this.f13520b) {
                    l72 l72 = new l72(this);
                    this.f13518a = l72;
                    this.f13516a.postDelayed(l72, j);
                }
            }
        }

        @wj3(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        public void onLocationChanged(@ts2 Location location) {
            synchronized (this) {
                if (!this.f13520b) {
                    this.f13520b = true;
                    this.f13519a.execute(new k72(this.f13517a, location));
                    mo17629d();
                }
            }
        }

        @wj3(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        public void onProviderDisabled(@mr2 String str) {
            onLocationChanged((Location) null);
        }

        public void onProviderEnabled(@mr2 String str) {
        }

        public void onStatusChanged(String str, int i, Bundle bundle) {
        }
    }

    /* renamed from: com.onedelhi.secure.i72$g */
    public static class C2409g {
        @mj1("sGnssStatusListeners")

        /* renamed from: a */
        public static final ty3<Object, Object> f13521a = new ty3<>();
    }

    @sj3(30)
    /* renamed from: com.onedelhi.secure.i72$h */
    public static class C2410h extends GnssStatus.Callback {

        /* renamed from: a */
        public final oh1.C3059a f13522a;

        public C2410h(oh1.C3059a aVar) {
            k43.m19445b(aVar != null, "invalid null callback");
            this.f13522a = aVar;
        }

        public void onFirstFix(int i) {
            this.f13522a.mo21922a(i);
        }

        public void onSatelliteStatusChanged(GnssStatus gnssStatus) {
            this.f13522a.mo21923b(oh1.m23766n(gnssStatus));
        }

        public void onStarted() {
            this.f13522a.mo21924c();
        }

        public void onStopped() {
            this.f13522a.mo21925d();
        }
    }

    /* renamed from: com.onedelhi.secure.i72$i */
    public static class C2411i implements GpsStatus.Listener {

        /* renamed from: a */
        public final LocationManager f13523a;

        /* renamed from: a */
        public final oh1.C3059a f13524a;
        @ts2

        /* renamed from: a */
        public volatile Executor f13525a;

        public C2411i(LocationManager locationManager, oh1.C3059a aVar) {
            k43.m19445b(aVar != null, "invalid null callback");
            this.f13523a = locationManager;
            this.f13524a = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m17294e(Executor executor) {
            if (this.f13525a == executor) {
                this.f13524a.mo21924c();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m17295f(Executor executor) {
            if (this.f13525a == executor) {
                this.f13524a.mo21925d();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public /* synthetic */ void m17296g(Executor executor, int i) {
            if (this.f13525a == executor) {
                this.f13524a.mo21922a(i);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public /* synthetic */ void m17297h(Executor executor, oh1 oh1) {
            if (this.f13525a == executor) {
                this.f13524a.mo21923b(oh1);
            }
        }

        /* renamed from: i */
        public void mo17639i(Executor executor) {
            k43.m19457n(this.f13525a == null);
            this.f13525a = executor;
        }

        /* renamed from: j */
        public void mo17640j() {
            this.f13525a = null;
        }

        @wj3("android.permission.ACCESS_FINE_LOCATION")
        public void onGpsStatusChanged(int i) {
            Runnable runnable;
            Runnable runnable2;
            GpsStatus gpsStatus;
            Executor executor = this.f13525a;
            if (executor != null) {
                if (i == 1) {
                    runnable = new m72(this, executor);
                } else if (i != 2) {
                    if (i == 3) {
                        GpsStatus gpsStatus2 = this.f13523a.getGpsStatus((GpsStatus) null);
                        if (gpsStatus2 != null) {
                            runnable2 = new o72(this, executor, gpsStatus2.getTimeToFirstFix());
                        } else {
                            return;
                        }
                    } else if (i == 4 && (gpsStatus = this.f13523a.getGpsStatus((GpsStatus) null)) != null) {
                        runnable2 = new p72(this, executor, oh1.m23767o(gpsStatus));
                    } else {
                        return;
                    }
                    executor.execute(runnable2);
                    return;
                } else {
                    runnable = new n72(this, executor);
                }
                executor.execute(runnable);
            }
        }
    }

    /* renamed from: com.onedelhi.secure.i72$j */
    public static final class C2412j implements Executor {

        /* renamed from: a */
        public final Handler f13526a;

        public C2412j(@mr2 Handler handler) {
            this.f13526a = (Handler) k43.m19455l(handler);
        }

        public void execute(@mr2 Runnable runnable) {
            if (Looper.myLooper() == this.f13526a.getLooper()) {
                runnable.run();
            } else if (!this.f13526a.post((Runnable) k43.m19455l(runnable))) {
                throw new RejectedExecutionException(this.f13526a + " is shutting down");
            }
        }
    }

    /* renamed from: com.onedelhi.secure.i72$k */
    public static class C2413k {

        /* renamed from: a */
        public final e72 f13527a;

        /* renamed from: a */
        public final String f13528a;

        public C2413k(String str, e72 e72) {
            this.f13528a = (String) ot2.m24060e(str, "invalid null provider");
            this.f13527a = (e72) ot2.m24060e(e72, "invalid null listener");
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C2413k)) {
                return false;
            }
            C2413k kVar = (C2413k) obj;
            return this.f13528a.equals(kVar.f13528a) && this.f13527a.equals(kVar.f13527a);
        }

        public int hashCode() {
            return ot2.m24057b(this.f13528a, this.f13527a);
        }
    }

    /* renamed from: com.onedelhi.secure.i72$l */
    public static class C2414l implements LocationListener {
        @ts2

        /* renamed from: a */
        public volatile C2413k f13529a;

        /* renamed from: a */
        public final Executor f13530a;

        public C2414l(@ts2 C2413k kVar, Executor executor) {
            this.f13529a = kVar;
            this.f13530a = executor;
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public /* synthetic */ void m17306h(int i) {
            C2413k kVar = this.f13529a;
            if (kVar != null) {
                kVar.f13527a.onFlushComplete(i);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public /* synthetic */ void m17307i(Location location) {
            C2413k kVar = this.f13529a;
            if (kVar != null) {
                kVar.f13527a.onLocationChanged(location);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public /* synthetic */ void m17308j(List list) {
            C2413k kVar = this.f13529a;
            if (kVar != null) {
                kVar.f13527a.onLocationChanged(list);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public /* synthetic */ void m17309k(String str) {
            C2413k kVar = this.f13529a;
            if (kVar != null) {
                kVar.f13527a.onProviderDisabled(str);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public /* synthetic */ void m17310l(String str) {
            C2413k kVar = this.f13529a;
            if (kVar != null) {
                kVar.f13527a.onProviderEnabled(str);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: m */
        public /* synthetic */ void m17311m(String str, int i, Bundle bundle) {
            C2413k kVar = this.f13529a;
            if (kVar != null) {
                kVar.f13527a.onStatusChanged(str, i, bundle);
            }
        }

        /* renamed from: g */
        public C2413k mo17645g() {
            return (C2413k) ot2.m24059d(this.f13529a);
        }

        /* renamed from: n */
        public void mo17646n() {
            this.f13529a = null;
        }

        public void onFlushComplete(int i) {
            if (this.f13529a != null) {
                this.f13530a.execute(new q72(this, i));
            }
        }

        public void onLocationChanged(@mr2 Location location) {
            if (this.f13529a != null) {
                this.f13530a.execute(new r72(this, location));
            }
        }

        public void onLocationChanged(@mr2 List<Location> list) {
            if (this.f13529a != null) {
                this.f13530a.execute(new v72(this, list));
            }
        }

        public void onProviderDisabled(@mr2 String str) {
            if (this.f13529a != null) {
                this.f13530a.execute(new t72(this, str));
            }
        }

        public void onProviderEnabled(@mr2 String str) {
            if (this.f13529a != null) {
                this.f13530a.execute(new s72(this, str));
            }
        }

        public void onStatusChanged(String str, int i, Bundle bundle) {
            if (this.f13529a != null) {
                this.f13530a.execute(new u72(this, str, i, bundle));
            }
        }
    }

    @sj3(24)
    /* renamed from: com.onedelhi.secure.i72$m */
    public static class C2415m extends GnssStatus.Callback {

        /* renamed from: a */
        public final oh1.C3059a f13531a;
        @ts2

        /* renamed from: a */
        public volatile Executor f13532a;

        public C2415m(oh1.C3059a aVar) {
            k43.m19445b(aVar != null, "invalid null callback");
            this.f13531a = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m17318e(Executor executor, int i) {
            if (this.f13532a == executor) {
                this.f13531a.mo21922a(i);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m17319f(Executor executor, GnssStatus gnssStatus) {
            if (this.f13532a == executor) {
                this.f13531a.mo21923b(oh1.m23766n(gnssStatus));
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public /* synthetic */ void m17320g(Executor executor) {
            if (this.f13532a == executor) {
                this.f13531a.mo21924c();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public /* synthetic */ void m17321h(Executor executor) {
            if (this.f13532a == executor) {
                this.f13531a.mo21925d();
            }
        }

        /* renamed from: i */
        public void mo17653i(Executor executor) {
            boolean z = true;
            k43.m19445b(executor != null, "invalid null executor");
            if (this.f13532a != null) {
                z = false;
            }
            k43.m19457n(z);
            this.f13532a = executor;
        }

        /* renamed from: j */
        public void mo17654j() {
            this.f13532a = null;
        }

        public void onFirstFix(int i) {
            Executor executor = this.f13532a;
            if (executor != null) {
                executor.execute(new y72(this, executor, i));
            }
        }

        public void onSatelliteStatusChanged(GnssStatus gnssStatus) {
            Executor executor = this.f13532a;
            if (executor != null) {
                executor.execute(new z72(this, executor, gnssStatus));
            }
        }

        public void onStarted() {
            Executor executor = this.f13532a;
            if (executor != null) {
                executor.execute(new x72(this, executor));
            }
        }

        public void onStopped() {
            Executor executor = this.f13532a;
            if (executor != null) {
                executor.execute(new w72(this, executor));
            }
        }
    }

    @wj3(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* renamed from: c */
    public static void m17256c(@mr2 LocationManager locationManager, @mr2 String str, @ts2 C3345qu quVar, @mr2 Executor executor, @mr2 s60<Location> s60) {
        if (Build.VERSION.SDK_INT >= 30) {
            C2406d.m17278a(locationManager, str, quVar, executor, s60);
            return;
        }
        if (quVar != null) {
            quVar.mo23443e();
        }
        Location lastKnownLocation = locationManager.getLastKnownLocation(str);
        if (lastKnownLocation == null || SystemClock.elapsedRealtime() - a72.m10874b(lastKnownLocation) >= 10000) {
            C2408f fVar = new C2408f(locationManager, executor, s60);
            locationManager.requestLocationUpdates(str, 0, 0.0f, fVar, Looper.getMainLooper());
            if (quVar != null) {
                quVar.mo23442d(new f72(fVar));
            }
            fVar.mo17630g(30000);
            return;
        }
        executor.execute(new g72(s60, lastKnownLocation));
    }

    @ts2
    /* renamed from: d */
    public static String m17257d(@mr2 LocationManager locationManager) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C2405c.m17275a(locationManager);
        }
        return null;
    }

    /* renamed from: e */
    public static int m17258e(@mr2 LocationManager locationManager) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C2405c.m17276b(locationManager);
        }
        return 0;
    }

    /* renamed from: f */
    public static boolean m17259f(@mr2 LocationManager locationManager, @mr2 String str) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C2407e.m17281a(locationManager, str);
        }
        if (locationManager.getAllProviders().contains(str)) {
            return true;
        }
        try {
            return locationManager.getProvider(str) != null;
        } catch (SecurityException unused) {
            return false;
        }
    }

    /* renamed from: g */
    public static boolean m17260g(@mr2 LocationManager locationManager) {
        return Build.VERSION.SDK_INT >= 28 ? C2405c.m17277c(locationManager) : locationManager.isProviderEnabled("network") || locationManager.isProviderEnabled("gps");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007e, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0089, code lost:
        return false;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:46:0x0093 */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00c5 A[Catch:{ ExecutionException -> 0x00bb, TimeoutException -> 0x00a2, all -> 0x009f, all -> 0x00e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00da A[Catch:{ ExecutionException -> 0x00bb, TimeoutException -> 0x00a2, all -> 0x009f, all -> 0x00e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00e4 A[SYNTHETIC, Splitter:B:72:0x00e4] */
    @com.onedelhi.secure.wj3("android.permission.ACCESS_FINE_LOCATION")
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m17263j(android.location.LocationManager r9, android.os.Handler r10, java.util.concurrent.Executor r11, com.onedelhi.secure.oh1.C3059a r12) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L_0x000b
            boolean r9 = com.onedelhi.secure.i72.C2406d.m17279b(r9, r10, r11, r12)
            return r9
        L_0x000b:
            r1 = 24
            if (r0 < r1) goto L_0x0014
            boolean r9 = com.onedelhi.secure.i72.C2404b.m17273a(r9, r10, r11, r12)
            return r9
        L_0x0014:
            r0 = 1
            r1 = 0
            if (r10 == 0) goto L_0x001a
            r2 = 1
            goto L_0x001b
        L_0x001a:
            r2 = 0
        L_0x001b:
            com.onedelhi.secure.k43.m19444a(r2)
            com.onedelhi.secure.ty3<java.lang.Object, java.lang.Object> r2 = com.onedelhi.secure.i72.C2409g.f13521a
            monitor-enter(r2)
            java.lang.Object r3 = r2.get(r12)     // Catch:{ all -> 0x0103 }
            com.onedelhi.secure.i72$i r3 = (com.onedelhi.secure.i72.C2411i) r3     // Catch:{ all -> 0x0103 }
            if (r3 != 0) goto L_0x002f
            com.onedelhi.secure.i72$i r3 = new com.onedelhi.secure.i72$i     // Catch:{ all -> 0x0103 }
            r3.<init>(r9, r12)     // Catch:{ all -> 0x0103 }
            goto L_0x0032
        L_0x002f:
            r3.mo17640j()     // Catch:{ all -> 0x0103 }
        L_0x0032:
            r3.mo17639i(r11)     // Catch:{ all -> 0x0103 }
            java.util.concurrent.FutureTask r11 = new java.util.concurrent.FutureTask     // Catch:{ all -> 0x0103 }
            com.onedelhi.secure.h72 r4 = new com.onedelhi.secure.h72     // Catch:{ all -> 0x0103 }
            r4.<init>(r9, r3)     // Catch:{ all -> 0x0103 }
            r11.<init>(r4)     // Catch:{ all -> 0x0103 }
            android.os.Looper r9 = android.os.Looper.myLooper()     // Catch:{ all -> 0x0103 }
            android.os.Looper r4 = r10.getLooper()     // Catch:{ all -> 0x0103 }
            if (r9 != r4) goto L_0x004d
            r11.run()     // Catch:{ all -> 0x0103 }
            goto L_0x0053
        L_0x004d:
            boolean r9 = r10.post(r11)     // Catch:{ all -> 0x0103 }
            if (r9 == 0) goto L_0x00ec
        L_0x0053:
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ ExecutionException -> 0x00bb, TimeoutException -> 0x00a2, all -> 0x009f }
            r4 = 5
            long r4 = r9.toNanos(r4)     // Catch:{ ExecutionException -> 0x00bb, TimeoutException -> 0x00a2, all -> 0x009f }
            long r6 = java.lang.System.nanoTime()     // Catch:{ ExecutionException -> 0x00bb, TimeoutException -> 0x00a2, all -> 0x009f }
            long r6 = r6 + r4
            r9 = 0
        L_0x0061:
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ InterruptedException -> 0x0093, ExecutionException -> 0x0090, TimeoutException -> 0x008d, all -> 0x008a }
            java.lang.Object r4 = r11.get(r4, r8)     // Catch:{ InterruptedException -> 0x0093, ExecutionException -> 0x0090, TimeoutException -> 0x008d, all -> 0x008a }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ InterruptedException -> 0x0093, ExecutionException -> 0x0090, TimeoutException -> 0x008d, all -> 0x008a }
            boolean r4 = r4.booleanValue()     // Catch:{ InterruptedException -> 0x0093, ExecutionException -> 0x0090, TimeoutException -> 0x008d, all -> 0x008a }
            if (r4 == 0) goto L_0x007f
            com.onedelhi.secure.ty3<java.lang.Object, java.lang.Object> r4 = com.onedelhi.secure.i72.C2409g.f13521a     // Catch:{ InterruptedException -> 0x0093, ExecutionException -> 0x0090, TimeoutException -> 0x008d, all -> 0x008a }
            r4.put(r12, r3)     // Catch:{ InterruptedException -> 0x0093, ExecutionException -> 0x0090, TimeoutException -> 0x008d, all -> 0x008a }
            if (r9 == 0) goto L_0x007d
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0103 }
            r9.interrupt()     // Catch:{ all -> 0x0103 }
        L_0x007d:
            monitor-exit(r2)     // Catch:{ all -> 0x0103 }
            return r0
        L_0x007f:
            if (r9 == 0) goto L_0x0088
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0103 }
            r9.interrupt()     // Catch:{ all -> 0x0103 }
        L_0x0088:
            monitor-exit(r2)     // Catch:{ all -> 0x0103 }
            return r1
        L_0x008a:
            r10 = move-exception
            r0 = r9
            goto L_0x00e2
        L_0x008d:
            r11 = move-exception
            r0 = r9
            goto L_0x00a4
        L_0x0090:
            r10 = move-exception
            r0 = r9
            goto L_0x00bd
        L_0x0093:
            long r4 = java.lang.System.nanoTime()     // Catch:{ ExecutionException -> 0x009d, TimeoutException -> 0x009b }
            long r4 = r6 - r4
            r9 = 1
            goto L_0x0061
        L_0x009b:
            r11 = move-exception
            goto L_0x00a4
        L_0x009d:
            r10 = move-exception
            goto L_0x00bd
        L_0x009f:
            r10 = move-exception
            r0 = 0
            goto L_0x00e2
        L_0x00a2:
            r11 = move-exception
            r0 = 0
        L_0x00a4:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00e1 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e1 }
            r12.<init>()     // Catch:{ all -> 0x00e1 }
            r12.append(r10)     // Catch:{ all -> 0x00e1 }
            java.lang.String r10 = " appears to be blocked, please run registerGnssStatusCallback() directly on a Looper thread or ensure the main Looper is not blocked by this thread"
            r12.append(r10)     // Catch:{ all -> 0x00e1 }
            java.lang.String r10 = r12.toString()     // Catch:{ all -> 0x00e1 }
            r9.<init>(r10, r11)     // Catch:{ all -> 0x00e1 }
            throw r9     // Catch:{ all -> 0x00e1 }
        L_0x00bb:
            r10 = move-exception
            r0 = 0
        L_0x00bd:
            java.lang.Throwable r9 = r10.getCause()     // Catch:{ all -> 0x00e1 }
            boolean r9 = r9 instanceof java.lang.RuntimeException     // Catch:{ all -> 0x00e1 }
            if (r9 != 0) goto L_0x00da
            java.lang.Throwable r9 = r10.getCause()     // Catch:{ all -> 0x00e1 }
            boolean r9 = r9 instanceof java.lang.Error     // Catch:{ all -> 0x00e1 }
            if (r9 == 0) goto L_0x00d4
            java.lang.Throwable r9 = r10.getCause()     // Catch:{ all -> 0x00e1 }
            java.lang.Error r9 = (java.lang.Error) r9     // Catch:{ all -> 0x00e1 }
            throw r9     // Catch:{ all -> 0x00e1 }
        L_0x00d4:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00e1 }
            r9.<init>(r10)     // Catch:{ all -> 0x00e1 }
            throw r9     // Catch:{ all -> 0x00e1 }
        L_0x00da:
            java.lang.Throwable r9 = r10.getCause()     // Catch:{ all -> 0x00e1 }
            java.lang.RuntimeException r9 = (java.lang.RuntimeException) r9     // Catch:{ all -> 0x00e1 }
            throw r9     // Catch:{ all -> 0x00e1 }
        L_0x00e1:
            r10 = move-exception
        L_0x00e2:
            if (r0 == 0) goto L_0x00eb
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0103 }
            r9.interrupt()     // Catch:{ all -> 0x0103 }
        L_0x00eb:
            throw r10     // Catch:{ all -> 0x0103 }
        L_0x00ec:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0103 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0103 }
            r11.<init>()     // Catch:{ all -> 0x0103 }
            r11.append(r10)     // Catch:{ all -> 0x0103 }
            java.lang.String r10 = " is shutting down"
            r11.append(r10)     // Catch:{ all -> 0x0103 }
            java.lang.String r10 = r11.toString()     // Catch:{ all -> 0x0103 }
            r9.<init>(r10)     // Catch:{ all -> 0x0103 }
            throw r9     // Catch:{ all -> 0x0103 }
        L_0x0103:
            r9 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0103 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.i72.m17263j(android.location.LocationManager, android.os.Handler, java.util.concurrent.Executor, com.onedelhi.secure.oh1$a):boolean");
    }

    @wj3("android.permission.ACCESS_FINE_LOCATION")
    /* renamed from: k */
    public static boolean m17264k(@mr2 LocationManager locationManager, @mr2 oh1.C3059a aVar, @mr2 Handler handler) {
        return Build.VERSION.SDK_INT >= 30 ? m17265l(locationManager, xw0.m31746a(handler), aVar) : m17265l(locationManager, new C2412j(handler), aVar);
    }

    @wj3("android.permission.ACCESS_FINE_LOCATION")
    /* renamed from: l */
    public static boolean m17265l(@mr2 LocationManager locationManager, @mr2 Executor executor, @mr2 oh1.C3059a aVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            return m17263j(locationManager, (Handler) null, executor, aVar);
        }
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        return m17263j(locationManager, new Handler(myLooper), executor, aVar);
    }

    @mj1("sLocationListeners")
    @wj3(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* renamed from: m */
    public static void m17266m(LocationManager locationManager, C2414l lVar) {
        WeakReference put = f13508a.put(lVar.mo17645g(), new WeakReference(lVar));
        C2414l lVar2 = put != null ? (C2414l) put.get() : null;
        if (lVar2 != null) {
            lVar2.mo17646n();
            locationManager.removeUpdates(lVar2);
        }
    }

    @wj3(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* renamed from: n */
    public static void m17267n(@mr2 LocationManager locationManager, @mr2 e72 e72) {
        WeakHashMap<C2413k, WeakReference<C2414l>> weakHashMap = f13508a;
        synchronized (weakHashMap) {
            ArrayList arrayList = null;
            for (WeakReference<C2414l> weakReference : weakHashMap.values()) {
                C2414l lVar = (C2414l) weakReference.get();
                if (lVar != null) {
                    C2413k g = lVar.mo17645g();
                    if (g.f13527a == e72) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(g);
                        lVar.mo17646n();
                        locationManager.removeUpdates(lVar);
                    }
                }
            }
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    f13508a.remove((C2413k) it.next());
                }
            }
        }
        locationManager.removeUpdates(e72);
    }

    @wj3(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* renamed from: o */
    public static void m17268o(@mr2 LocationManager locationManager, @mr2 String str, @mr2 a82 a82, @mr2 e72 e72, @mr2 Looper looper) {
        if (Build.VERSION.SDK_INT >= 31) {
            C2407e.m17282b(locationManager, str, a82.mo12831h(), xw0.m31746a(new Handler(looper)), e72);
        } else if (!C2403a.m17271a(locationManager, str, a82, e72, looper)) {
            locationManager.requestLocationUpdates(str, a82.mo12824b(), a82.mo12827e(), e72, looper);
        }
    }

    @wj3(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* renamed from: p */
    public static void m17269p(@mr2 LocationManager locationManager, @mr2 String str, @mr2 a82 a82, @mr2 Executor executor, @mr2 e72 e72) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            C2407e.m17282b(locationManager, str, a82.mo12831h(), executor, e72);
        } else if (i < 30 || !C2406d.m17280c(locationManager, str, a82, executor, e72)) {
            C2414l lVar = new C2414l(new C2413k(str, e72), executor);
            if (!C2403a.m17272b(locationManager, str, a82, lVar)) {
                synchronized (f13508a) {
                    locationManager.requestLocationUpdates(str, a82.mo12824b(), a82.mo12827e(), lVar, Looper.getMainLooper());
                    m17266m(locationManager, lVar);
                }
            }
        }
    }

    /* renamed from: q */
    public static void m17270q(@mr2 LocationManager locationManager, @mr2 oh1.C3059a aVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            ty3<Object, Object> ty3 = C2409g.f13521a;
            synchronized (ty3) {
                Object remove = ty3.remove(aVar);
                if (remove != null) {
                    C2404b.m17274b(locationManager, remove);
                }
            }
            return;
        }
        ty3<Object, Object> ty32 = C2409g.f13521a;
        synchronized (ty32) {
            C2411i iVar = (C2411i) ty32.remove(aVar);
            if (iVar != null) {
                iVar.mo17640j();
                locationManager.removeGpsStatusListener(iVar);
            }
        }
    }
}
