package com.onedelhi.secure;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

public abstract class li5 extends zk5 implements ti5 {
    public li5() {
        super("com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferCallbacks");
    }

    /* renamed from: j8 */
    public final boolean mo13795j8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                pr5.m24994b(parcel);
                mo25125z5((Status) pr5.m24993a(parcel, Status.CREATOR));
                return true;
            case 2:
                pr5.m24994b(parcel);
                mo25123B4((Status) pr5.m24993a(parcel, Status.CREATOR), (s47) pr5.m24993a(parcel, s47.CREATOR));
                return true;
            case 3:
                pr5.m24994b(parcel);
                mo25124a5((Status) pr5.m24993a(parcel, Status.CREATOR), (vv6) pr5.m24993a(parcel, vv6.CREATOR));
                return true;
            case 4:
                mo14830x();
                return true;
            case 5:
                pr5.m24994b(parcel);
                mo14829g2((Status) pr5.m24993a(parcel, Status.CREATOR));
                return true;
            case 6:
                byte[] createByteArray = parcel.createByteArray();
                pr5.m24994b(parcel);
                mo22171x3(createByteArray);
                return true;
            case 7:
                pr5.m24994b(parcel);
                mo17627j2((sk0) pr5.m24993a(parcel, sk0.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
