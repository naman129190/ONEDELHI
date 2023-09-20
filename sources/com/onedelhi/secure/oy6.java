package com.onedelhi.secure;

import android.os.IBinder;
import android.os.IInterface;

public abstract class oy6 extends fl5 implements g07 {
    /* renamed from: k8 */
    public static g07 m24281k8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
        return queryLocalInterface instanceof g07 ? (g07) queryLocalInterface : new ww6(iBinder);
    }
}
