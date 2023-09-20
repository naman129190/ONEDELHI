package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.w94;
import com.onedelhi.secure.x94;
import java.util.concurrent.CancellationException;

public final class zacc extends zap {
    private x94 zad = new x94();

    private zacc(LifecycleFragment lifecycleFragment) {
        super(lifecycleFragment, GoogleApiAvailability.getInstance());
        this.mLifecycleFragment.addCallback("GmsAvailabilityHelper", this);
    }

    public static zacc zaa(@mr2 Activity activity) {
        LifecycleFragment fragment = LifecycleCallback.getFragment(activity);
        zacc zacc = (zacc) fragment.getCallbackOrNull("GmsAvailabilityHelper", zacc.class);
        if (zacc == null) {
            return new zacc(fragment);
        }
        if (zacc.zad.mo26835a().mo17589u()) {
            zacc.zad = new x94();
        }
        return zacc;
    }

    public final void onDestroy() {
        super.onDestroy();
        this.zad.mo26838d(new CancellationException("Host activity was destroyed before Google Play services could be made available."));
    }

    public final void zab(ConnectionResult connectionResult, int i) {
        String errorMessage = connectionResult.getErrorMessage();
        if (errorMessage == null) {
            errorMessage = "Error connecting to Google Play services";
        }
        this.zad.mo26836b(new ApiException(new Status(connectionResult, errorMessage, connectionResult.getErrorCode())));
    }

    public final void zac() {
        Activity lifecycleActivity = this.mLifecycleFragment.getLifecycleActivity();
        if (lifecycleActivity == null) {
            this.zad.mo26838d(new ApiException(new Status(8)));
            return;
        }
        int isGooglePlayServicesAvailable = this.zac.isGooglePlayServicesAvailable(lifecycleActivity);
        if (isGooglePlayServicesAvailable == 0) {
            this.zad.mo26839e(null);
        } else if (!this.zad.mo26835a().mo17589u()) {
            zah(new ConnectionResult(isGooglePlayServicesAvailable, (PendingIntent) null), 0);
        }
    }

    public final w94 zad() {
        return this.zad.mo26835a();
    }
}
