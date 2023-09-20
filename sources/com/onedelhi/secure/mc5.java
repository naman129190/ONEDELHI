package com.onedelhi.secure;

import android.os.IBinder;
import android.os.IInterface;

public abstract class mc5 extends fl5 implements yc5 {
    /* renamed from: k8 */
    public static yc5 m21485k8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
        return queryLocalInterface instanceof yc5 ? (yc5) queryLocalInterface : new yb5(iBinder);
    }
}
