package com.onedelhi.secure;

import android.os.IBinder;
import android.os.IInterface;

public abstract class ex5 extends zk5 implements f26 {
    /* renamed from: k8 */
    public static f26 m14449k8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.IWorkAccountService");
        return queryLocalInterface instanceof f26 ? (f26) queryLocalInterface : new zr5(iBinder);
    }
}
