package com.onedelhi.secure;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;

public final class v66 extends BroadcastReceiver {
    @VisibleForTesting

    /* renamed from: a */
    public static final String f21686a = v66.class.getName();

    /* renamed from: a */
    public final qq6 f21687a;

    /* renamed from: a */
    public boolean f21688a;

    /* renamed from: b */
    public boolean f21689b;

    public v66(qq6 qq6) {
        Preconditions.checkNotNull(qq6);
        this.f21687a = qq6;
    }

    @ly4
    /* renamed from: b */
    public final void mo25868b() {
        this.f21687a.mo23379g();
        this.f21687a.mo15135d().mo15139h();
        if (!this.f21688a) {
            this.f21687a.mo15137f().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f21689b = this.f21687a.mo23372Y().mo24212m();
            this.f21687a.mo15136e().mo12730v().mo25380b("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f21689b));
            this.f21688a = true;
        }
    }

    @ly4
    /* renamed from: c */
    public final void mo25869c() {
        this.f21687a.mo23379g();
        this.f21687a.mo15135d().mo15139h();
        this.f21687a.mo15135d().mo15139h();
        if (this.f21688a) {
            this.f21687a.mo15136e().mo12730v().mo25379a("Unregistering connectivity change receiver");
            this.f21688a = false;
            this.f21689b = false;
            try {
                this.f21687a.mo15137f().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                this.f21687a.mo15136e().mo12726r().mo25380b("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    @bc2
    public final void onReceive(Context context, Intent intent) {
        this.f21687a.mo23379g();
        String action = intent.getAction();
        this.f21687a.mo15136e().mo12730v().mo25380b("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean m = this.f21687a.mo23372Y().mo24212m();
            if (this.f21689b != m) {
                this.f21689b = m;
                this.f21687a.mo15135d().mo23065z(new s66(this, m));
                return;
            }
            return;
        }
        this.f21687a.mo15136e().mo12731w().mo25380b("NetworkBroadcastReceiver received unknown action", action);
    }
}
