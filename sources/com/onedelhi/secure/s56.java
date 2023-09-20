package com.onedelhi.secure;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public final class s56 extends xo6 {
    public s56(qq6 qq6) {
        super(qq6);
    }

    /* renamed from: l */
    public final boolean mo13582l() {
        return false;
    }

    /* renamed from: m */
    public final boolean mo24212m() {
        mo27038i();
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f11205a.mo15137f().getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return networkInfo != null && networkInfo.isConnected();
    }
}
