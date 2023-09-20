package com.delhitransport.onedelhi.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.onedelhi.secure.m04;

public class SmsBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public C1398a f7206a;

    /* renamed from: com.delhitransport.onedelhi.util.SmsBroadcastReceiver$a */
    public interface C1398a {
        /* renamed from: a */
        void mo7921a(Intent intent);

        /* renamed from: b */
        void mo7922b();
    }

    public void onReceive(Context context, Intent intent) {
        if (intent.getAction() == m04.f15749b) {
            Bundle extras = intent.getExtras();
            int statusCode = ((Status) extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS")).getStatusCode();
            if (statusCode == 0) {
                this.f7206a.mo7921a((Intent) extras.getParcelable(m04.f15752e));
            } else if (statusCode == 15) {
                this.f7206a.mo7922b();
            }
        }
    }
}
