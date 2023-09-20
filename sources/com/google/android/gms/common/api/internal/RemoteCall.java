package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.onedelhi.secure.mr2;

@KeepForSdk
public interface RemoteCall<T, U> {
    @KeepForSdk
    void accept(@mr2 T t, @mr2 U u) throws RemoteException;
}
