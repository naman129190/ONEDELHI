package com.onedelhi.secure;

import android.os.IBinder;
import android.os.IInterface;

public abstract class t27 extends fl5 implements k37 {
    /* renamed from: k8 */
    public static k37 m28086k8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
        return queryLocalInterface instanceof k37 ? (k37) queryLocalInterface : new c27(iBinder);
    }
}
