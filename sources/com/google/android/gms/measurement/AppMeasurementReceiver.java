package com.google.android.gms.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.onedelhi.secure.b86;
import com.onedelhi.secure.bc2;
import com.onedelhi.secure.d86;
import com.onedelhi.secure.mr2;

public final class AppMeasurementReceiver extends WakefulBroadcastReceiver implements b86 {

    /* renamed from: a */
    public d86 f7587a;

    @bc2
    /* renamed from: a */
    public void mo10754a(@mr2 Context context, @mr2 Intent intent) {
        WakefulBroadcastReceiver.m4720c(context, intent);
    }

    @mr2
    /* renamed from: d */
    public BroadcastReceiver.PendingResult mo10755d() {
        return goAsync();
    }

    @bc2
    public void onReceive(@mr2 Context context, @mr2 Intent intent) {
        if (this.f7587a == null) {
            this.f7587a = new d86(this);
        }
        this.f7587a.mo14566a(context, intent);
    }
}
