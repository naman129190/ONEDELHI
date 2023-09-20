package com.onedelhi.secure;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import androidx.lifecycle.LiveData;
import com.delhitransport.onedelhi.models.ConnectionModel;

public class t50 extends LiveData<ConnectionModel> {

    /* renamed from: a */
    public BroadcastReceiver f20653a = new C3565a();

    /* renamed from: a */
    public Context f20654a;

    /* renamed from: com.onedelhi.secure.t50$a */
    public class C3565a extends BroadcastReceiver {
        public C3565a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent.getExtras() != null) {
                NetworkInfo networkInfo = (NetworkInfo) intent.getExtras().get(pj0.m61166a(-143210401863495L));
                if (networkInfo != null && networkInfo.isConnectedOrConnecting()) {
                    int type = networkInfo.getType();
                    if (type == 0) {
                        t50.this.mo4930n(new ConnectionModel(0, true));
                    } else if (type == 1) {
                        t50.this.mo4930n(new ConnectionModel(1, true));
                    }
                } else {
                    t50.this.mo4930n(new ConnectionModel(0, false));
                }
            }
        }
    }

    public t50(Context context) {
        this.f20654a = context;
    }

    /* renamed from: l */
    public void mo4928l() {
        super.mo4928l();
        this.f20654a.registerReceiver(this.f20653a, new IntentFilter(pj0.m61166a(-143261941471047L)));
    }

    /* renamed from: m */
    public void mo4929m() {
        super.mo4929m();
        this.f20654a.unregisterReceiver(this.f20653a);
    }
}
