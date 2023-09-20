package com.onedelhi.secure;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;

public final class r27 implements vk4 {

    /* renamed from: a */
    public final PendingIntent f19566a;

    public r27(PendingIntent pendingIntent) {
        this.f19566a = pendingIntent;
    }

    /* renamed from: a */
    public final boolean mo23555a() {
        return this.f19566a != null;
    }

    /* renamed from: b */
    public final void mo23556b(Activity activity, int i) throws IntentSender.SendIntentException {
        PendingIntent pendingIntent = this.f19566a;
        if (pendingIntent != null) {
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i, (Intent) null, 0, 0, 0);
            return;
        }
        throw new IllegalStateException("No PendingIntent available");
    }
}
