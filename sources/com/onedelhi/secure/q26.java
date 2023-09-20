package com.onedelhi.secure;

import android.os.IBinder;
import android.os.IInterface;

public abstract class q26 extends yk5 implements m66 {
    /* renamed from: j8 */
    public static m66 m25265j8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        return queryLocalInterface instanceof m66 ? (m66) queryLocalInterface : new vx5(iBinder);
    }
}
