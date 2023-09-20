package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.onedelhi.secure.mr2;

public interface IGmsCallbacks extends IInterface {
    void onPostInitComplete(int i, @mr2 IBinder iBinder, @mr2 Bundle bundle) throws RemoteException;

    void zzb(int i, @mr2 Bundle bundle) throws RemoteException;

    void zzc(int i, IBinder iBinder, zzk zzk) throws RemoteException;
}
