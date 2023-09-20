package com.onedelhi.secure;

import android.os.IBinder;
import android.os.IInterface;

public abstract class rd6 extends fl5 implements ih6 {
    /* renamed from: k8 */
    public static ih6 m26660k8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
        return queryLocalInterface instanceof ih6 ? (ih6) queryLocalInterface : new v96(iBinder);
    }
}
