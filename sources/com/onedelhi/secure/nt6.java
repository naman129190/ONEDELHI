package com.onedelhi.secure;

import android.os.IBinder;
import android.os.IInterface;

public abstract class nt6 extends fl5 implements uv6 {
    /* renamed from: k8 */
    public static uv6 m23171k8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
        return queryLocalInterface instanceof uv6 ? (uv6) queryLocalInterface : new vr6(iBinder);
    }
}
