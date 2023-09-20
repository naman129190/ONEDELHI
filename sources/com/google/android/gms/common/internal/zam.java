package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.onedelhi.secure.k35;
import com.onedelhi.secure.tn1;
import com.onedelhi.secure.u35;

public final class zam extends k35 implements IInterface {
    public zam(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ISignInButtonCreator");
    }

    public final tn1 zae(tn1 tn1, zax zax) throws RemoteException {
        Parcel zaa = zaa();
        u35.m29073e(zaa, tn1);
        u35.m29072d(zaa, zax);
        Parcel zab = zab(2, zaa);
        tn1 j8 = tn1.C3647a.m28820j8(zab.readStrongBinder());
        zab.recycle();
        return j8;
    }
}
