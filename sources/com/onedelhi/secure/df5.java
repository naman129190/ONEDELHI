package com.onedelhi.secure;

import android.os.IBinder;
import android.os.IInterface;

public abstract class df5 extends fl5 implements of5 {
    /* renamed from: k8 */
    public static of5 m13090k8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
        return queryLocalInterface instanceof of5 ? (of5) queryLocalInterface : new se5(iBinder);
    }
}
