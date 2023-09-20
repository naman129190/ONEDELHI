package com.onedelhi.secure;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.IStatusCallback;

public final class ix6 extends u95 implements IInterface {
    public ix6(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.account.data.IGoogleAuthService");
    }

    /* renamed from: m8 */
    public final void mo17995m8(IStatusCallback iStatusCallback, zq5 zq5) throws RemoteException {
        Parcel j8 = mo25467j8();
        pr5.m24997e(j8, iStatusCallback);
        pr5.m24996d(j8, zq5);
        mo25469l8(2, j8);
    }

    /* renamed from: n8 */
    public final void mo17996n8(is6 is6, C2393i2 i2Var) throws RemoteException {
        Parcel j8 = mo25467j8();
        pr5.m24997e(j8, is6);
        pr5.m24996d(j8, i2Var);
        mo25469l8(4, j8);
    }

    /* renamed from: o8 */
    public final void mo17997o8(pv6 pv6, Account account, String str, Bundle bundle) throws RemoteException {
        Parcel j8 = mo25467j8();
        pr5.m24997e(j8, pv6);
        pr5.m24996d(j8, account);
        j8.writeString(str);
        pr5.m24996d(j8, bundle);
        mo25469l8(1, j8);
    }

    /* renamed from: p8 */
    public final void mo17998p8(in6 in6, Account account) throws RemoteException {
        Parcel j8 = mo25467j8();
        pr5.m24997e(j8, in6);
        pr5.m24996d(j8, account);
        mo25469l8(6, j8);
    }

    /* renamed from: q8 */
    public final void mo17999q8(in6 in6, String str) throws RemoteException {
        Parcel j8 = mo25467j8();
        pr5.m24997e(j8, in6);
        j8.writeString(str);
        mo25469l8(3, j8);
    }
}
