package com.onedelhi.secure;

import android.accounts.Account;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class z95 extends zk5 implements gl5 {
    public z95() {
        super("com.google.android.gms.auth.account.IWorkAccountCallback");
    }

    /* renamed from: j8 */
    public final boolean mo13795j8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            pr5.m24994b(parcel);
            mo16712h8((Account) pr5.m24993a(parcel, Account.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            boolean f = pr5.m24998f(parcel);
            pr5.m24994b(parcel);
            mo16713v1(f);
        }
        return true;
    }
}
