package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import androidx.appcompat.widget.C0358b;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.firebase.messaging.C4309a;
import com.google.firebase.messaging.C4311b;
import com.onedelhi.secure.es2;
import com.onedelhi.secure.ha4;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.zo1;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.firebase.messaging.c */
public class C4319c {

    /* renamed from: a */
    public static final int f25151a = 5;

    /* renamed from: a */
    public final Context f25152a;

    /* renamed from: a */
    public final C4322f f25153a;

    /* renamed from: a */
    public final ExecutorService f25154a;

    public C4319c(Context context, C4322f fVar, ExecutorService executorService) {
        this.f25154a = executorService;
        this.f25152a = context;
        this.f25153a = fVar;
    }

    /* renamed from: a */
    public boolean mo29727a() {
        if (this.f25153a.mo29741a(C4311b.C4314c.f25090f)) {
            return true;
        }
        if (mo29728b()) {
            return false;
        }
        zo1 d = mo29730d();
        C4309a.C4310a e = C4309a.m34733e(this.f25152a, this.f25153a);
        mo29731e(e.f25061a, d);
        mo29729c(e);
        return true;
    }

    /* renamed from: b */
    public final boolean mo29728b() {
        if (((KeyguardManager) this.f25152a.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!PlatformVersion.isAtLeastLollipop()) {
            SystemClock.sleep(10);
        }
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f25152a.getSystemService(C0358b.f1779e)).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
            if (next.pid == myPid) {
                return next.importance == 100;
            }
        }
        return false;
    }

    /* renamed from: c */
    public final void mo29729c(C4309a.C4310a aVar) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) this.f25152a.getSystemService(C4321e.f25157b)).notify(aVar.f25062a, aVar.f25060a, aVar.f25061a.mo15406h());
    }

    @ts2
    /* renamed from: d */
    public final zo1 mo29730d() {
        zo1 d = zo1.m74203d(this.f25153a.mo29755p(C4311b.C4314c.f25094j));
        if (d != null) {
            d.mo48408l(this.f25154a);
        }
        return d;
    }

    /* renamed from: e */
    public final void mo29731e(es2.C2087g gVar, @ts2 zo1 zo1) {
        if (zo1 != null) {
            try {
                Bitmap bitmap = (Bitmap) ha4.m16567b(zo1.mo48407g(), 5, TimeUnit.SECONDS);
                gVar.mo15397c0(bitmap);
                gVar.mo15442z0(new es2.C2078d().mo15327C(bitmap).mo15326B((Bitmap) null));
            } catch (ExecutionException e) {
                Log.w("FirebaseMessaging", "Failed to download image: " + e.getCause());
            } catch (InterruptedException unused) {
                Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                zo1.close();
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                zo1.close();
            }
        }
    }
}
