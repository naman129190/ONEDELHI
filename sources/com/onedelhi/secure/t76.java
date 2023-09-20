package com.onedelhi.secure;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.firebase.messaging.C4311b;

public final class t76 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ServiceConnection f20677a;

    /* renamed from: a */
    public final /* synthetic */ w76 f20678a;

    /* renamed from: a */
    public final /* synthetic */ xp5 f20679a;

    public t76(w76 w76, xp5 xp5, ServiceConnection serviceConnection) {
        this.f20678a = w76;
        this.f20679a = xp5;
        this.f20677a = serviceConnection;
    }

    public final void run() {
        Bundle bundle;
        u46 r;
        String str;
        w76 w76 = this.f20678a;
        z76 z76 = w76.f22064a;
        String a = w76.f22065b;
        xp5 xp5 = this.f20679a;
        ServiceConnection serviceConnection = this.f20677a;
        z76.f23490a.mo15135d().mo15139h();
        Bundle bundle2 = new Bundle();
        bundle2.putString("package_name", a);
        try {
            bundle = xp5.mo21417g7(bundle2);
            if (bundle == null) {
                z76.f23490a.mo15136e().mo12726r().mo25379a("Install Referrer Service returned a null response");
                bundle = null;
            }
        } catch (Exception e) {
            z76.f23490a.mo15136e().mo12726r().mo25380b("Exception occurred while retrieving the Install Referrer", e.getMessage());
        }
        z76.f23490a.mo15135d().mo15139h();
        za6.m32971t();
        if (bundle != null) {
            long j = bundle.getLong("install_begin_timestamp_seconds", 0) * 1000;
            if (j == 0) {
                r = z76.f23490a.mo15136e().mo12731w();
                str = "Service response is missing Install Referrer install timestamp";
            } else {
                String string = bundle.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    r = z76.f23490a.mo15136e().mo12726r();
                    str = "No referrer defined in Install Referrer response";
                } else {
                    z76.f23490a.mo15136e().mo12730v().mo25380b("InstallReferrer API result", string);
                    gr6 N = z76.f23490a.mo27871N();
                    Uri parse = Uri.parse("?".concat(string));
                    d07.m12872c();
                    Bundle v0 = N.mo16894v0(parse, z76.f23490a.mo27891z().mo14110B((String) null, n36.f17090w0));
                    if (v0 == null) {
                        r = z76.f23490a.mo15136e().mo12726r();
                        str = "No campaign params defined in Install Referrer result";
                    } else {
                        String string2 = v0.getString("medium");
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            long j2 = bundle.getLong("referrer_click_timestamp_seconds", 0) * 1000;
                            if (j2 == 0) {
                                r = z76.f23490a.mo15136e().mo12726r();
                                str = "Install Referrer is missing click timestamp for ad campaign";
                            } else {
                                v0.putLong("click_timestamp", j2);
                            }
                        }
                        if (j == z76.f23490a.mo27864F().f18948b.mo15075a()) {
                            z76.f23490a.mo15136e().mo12730v().mo25379a("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (z76.f23490a.mo27884o()) {
                            z76.f23490a.mo27864F().f18948b.mo15076b(j);
                            z76.f23490a.mo15136e().mo12730v().mo25380b("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            v0.putString("_cis", "referrer API v2");
                            z76.f23490a.mo27866I().mo23909t(bf0.f26274c, C4311b.C4317f.f25142l, v0, a);
                        }
                    }
                }
            }
            r.mo25379a(str);
        }
        ConnectionTracker.getInstance().unbindService(z76.f23490a.mo15137f(), serviceConnection);
    }
}
