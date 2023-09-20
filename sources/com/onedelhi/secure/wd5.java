package com.onedelhi.secure;

import android.os.IBinder;
import android.os.IInterface;

public abstract class wd5 extends fl5 implements he5 {
    /* renamed from: k8 */
    public static he5 m30795k8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
        return queryLocalInterface instanceof he5 ? (he5) queryLocalInterface : new kd5(iBinder);
    }
}
