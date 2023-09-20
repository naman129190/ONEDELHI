package com.onedelhi.secure;

import android.os.IBinder;
import android.os.IInterface;

public abstract class r26 extends zk5 implements n66 {
    /* renamed from: k8 */
    public static n66 m26276k8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
        return queryLocalInterface instanceof n66 ? (n66) queryLocalInterface : new uw5(iBinder);
    }
}
