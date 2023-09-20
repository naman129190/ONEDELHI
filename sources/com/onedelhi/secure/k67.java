package com.onedelhi.secure;

import android.os.IBinder;
import android.os.IInterface;

public abstract class k67 extends fl5 implements lb5 {
    /* renamed from: k8 */
    public static lb5 m19509k8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        return queryLocalInterface instanceof lb5 ? (lb5) queryLocalInterface : new w57(iBinder);
    }
}
