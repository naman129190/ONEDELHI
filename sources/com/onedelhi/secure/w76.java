package com.onedelhi.secure;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

public final class w76 implements ServiceConnection {

    /* renamed from: a */
    public final /* synthetic */ z76 f22064a;

    /* renamed from: b */
    public final String f22065b;

    public w76(z76 z76, String str) {
        this.f22064a = z76;
        this.f22065b = str;
    }

    @bc2
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder != null) {
            try {
                xp5 k8 = sp5.m27749k8(iBinder);
                if (k8 == null) {
                    this.f22064a.f23490a.mo15136e().mo12731w().mo25379a("Install Referrer Service implementation was not found");
                    return;
                }
                this.f22064a.f23490a.mo15136e().mo12730v().mo25379a("Install Referrer Service connected");
                this.f22064a.f23490a.mo15135d().mo23065z(new t76(this, k8, this));
            } catch (RuntimeException e) {
                this.f22064a.f23490a.mo15136e().mo12731w().mo25380b("Exception occurred while calling Install Referrer API", e);
            }
        } else {
            this.f22064a.f23490a.mo15136e().mo12731w().mo25379a("Install Referrer connection returned with null binder");
        }
    }

    @bc2
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f22064a.f23490a.mo15136e().mo12730v().mo25379a("Install Referrer Service disconnected");
    }
}
