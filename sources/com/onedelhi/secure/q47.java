package com.onedelhi.secure;

import android.os.IBinder;
import android.os.IInterface;

public final class q47 extends fl5 implements g57 {
    /* renamed from: k8 */
    public static g57 m25326k8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMapCapabilitiesDelegate");
        return queryLocalInterface instanceof g57 ? (g57) queryLocalInterface : new b47(iBinder);
    }
}
