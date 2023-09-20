package com.onedelhi.secure;

import android.os.IBinder;
import android.os.IInterface;

public abstract class sp5 extends dp5 implements xp5 {
    /* renamed from: k8 */
    public static xp5 m27749k8(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        return queryLocalInterface instanceof xp5 ? (xp5) queryLocalInterface : new np5(iBinder);
    }
}
