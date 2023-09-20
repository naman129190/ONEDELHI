package com.onedelhi.secure;

import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;

public final class z76 {

    /* renamed from: a */
    public final za6 f23490a;

    public z76(qq6 qq6) {
        this.f23490a = qq6.mo23376c0();
    }

    @VisibleForTesting
    /* renamed from: a */
    public final boolean mo27833a() {
        try {
            PackageManagerWrapper packageManager = Wrappers.packageManager(this.f23490a.mo15137f());
            if (packageManager != null) {
                return packageManager.getPackageInfo("com.android.vending", 128).versionCode >= 80837300;
            }
            this.f23490a.mo15136e().mo12730v().mo25379a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e) {
            this.f23490a.mo15136e().mo12730v().mo25380b("Failed to retrieve Play Store version for Install Referrer", e);
            return false;
        }
    }
}
