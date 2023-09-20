package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import com.onedelhi.secure.x50;

public final class ug0 implements x50 {

    /* renamed from: b */
    public static final String f21347b = "ConnectivityMonitor";

    /* renamed from: a */
    public final BroadcastReceiver f21348a = new C3705a();

    /* renamed from: a */
    public final Context f21349a;

    /* renamed from: a */
    public final x50.C3899a f21350a;

    /* renamed from: b */
    public boolean f21351b;

    /* renamed from: c */
    public boolean f21352c;

    /* renamed from: com.onedelhi.secure.ug0$a */
    public class C3705a extends BroadcastReceiver {
        public C3705a() {
        }

        public void onReceive(@mr2 Context context, Intent intent) {
            ug0 ug0 = ug0.this;
            boolean z = ug0.f21351b;
            ug0.f21351b = ug0.mo25597f(context);
            if (z != ug0.this.f21351b) {
                if (Log.isLoggable("ConnectivityMonitor", 3)) {
                    Log.d("ConnectivityMonitor", "connectivity changed, isConnected: " + ug0.this.f21351b);
                }
                ug0 ug02 = ug0.this;
                ug02.f21350a.mo16022a(ug02.f21351b);
            }
        }
    }

    public ug0(@mr2 Context context, @mr2 x50.C3899a aVar) {
        this.f21349a = context.getApplicationContext();
        this.f21350a = aVar;
    }

    /* renamed from: c */
    public void mo15993c() {
        mo25599j();
    }

    /* renamed from: d */
    public void mo15995d() {
        mo25598i();
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: f */
    public boolean mo25597f(@mr2 Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) g43.m15509d((ConnectivityManager) context.getSystemService("connectivity"))).getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (RuntimeException e) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e);
            }
            return true;
        }
    }

    /* renamed from: g */
    public void mo15999g() {
    }

    /* renamed from: i */
    public final void mo25598i() {
        if (!this.f21352c) {
            this.f21351b = mo25597f(this.f21349a);
            try {
                this.f21349a.registerReceiver(this.f21348a, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                this.f21352c = true;
            } catch (SecurityException e) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register", e);
                }
            }
        }
    }

    /* renamed from: j */
    public final void mo25599j() {
        if (this.f21352c) {
            this.f21349a.unregisterReceiver(this.f21348a);
            this.f21352c = false;
        }
    }
}
