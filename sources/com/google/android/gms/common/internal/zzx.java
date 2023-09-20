package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.RemoteException;
import com.onedelhi.secure.x95;

public final class zzx extends x95 implements ICancelToken {
    public zzx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICancelToken");
    }

    public final void cancel() throws RemoteException {
        zzD(2, zza());
    }
}
