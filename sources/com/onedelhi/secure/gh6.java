package com.onedelhi.secure;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;

@Deprecated
public final class gh6 implements l11 {
    @ts2

    /* renamed from: a */
    public final PendingIntent f12598a;

    public gh6(@ts2 PendingIntent pendingIntent) {
        this.f12598a = pendingIntent;
    }

    /* renamed from: a */
    public final boolean mo16655a() {
        return this.f12598a != null;
    }

    /* renamed from: b */
    public final void mo16656b(Activity activity, int i) throws IntentSender.SendIntentException {
        PendingIntent pendingIntent = this.f12598a;
        if (pendingIntent != null) {
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i, (Intent) null, 0, 0, 0);
            return;
        }
        throw new IllegalStateException("No PendingIntent available");
    }
}
