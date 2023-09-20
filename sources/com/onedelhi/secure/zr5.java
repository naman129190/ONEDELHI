package com.onedelhi.secure;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zr5 extends u95 implements f26 {
    public zr5(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.account.IWorkAccountService");
    }

    /* renamed from: G7 */
    public final void mo15736G7(gl5 gl5, Account account) throws RemoteException {
        Parcel j8 = mo25467j8();
        pr5.m24997e(j8, gl5);
        pr5.m24996d(j8, account);
        mo25469l8(3, j8);
    }

    /* renamed from: L7 */
    public final void mo15737L7(boolean z) throws RemoteException {
        Parcel j8 = mo25467j8();
        pr5.m24995c(j8, z);
        mo25469l8(1, j8);
    }

    /* renamed from: g4 */
    public final void mo15738g4(gl5 gl5, String str) throws RemoteException {
        Parcel j8 = mo25467j8();
        pr5.m24997e(j8, gl5);
        j8.writeString(str);
        mo25469l8(2, j8);
    }
}
