package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;
import com.onedelhi.secure.mr2;

public class ResolvableApiException extends ApiException {
    public ResolvableApiException(@mr2 Status status) {
        super(status);
    }

    @mr2
    public PendingIntent getResolution() {
        return getStatus().getResolution();
    }

    public void startResolutionForResult(@mr2 Activity activity, int i) throws IntentSender.SendIntentException {
        getStatus().startResolutionForResult(activity, i);
    }
}
