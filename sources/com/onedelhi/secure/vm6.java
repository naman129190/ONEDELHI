package com.onedelhi.secure;

import android.os.IBinder;
import android.os.IInterface;

public abstract class vm6 extends fl5 implements op6 {
    /* renamed from: k8 */
    public static op6 m30230k8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
        return queryLocalInterface instanceof op6 ? (op6) queryLocalInterface : new ck6(iBinder);
    }
}
