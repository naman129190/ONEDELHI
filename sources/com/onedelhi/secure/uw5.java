package com.onedelhi.secure;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class uw5 extends u95 implements n66 {
    public uw5(IBinder iBinder) {
        super(iBinder, "com.google.android.auth.IAuthManagerService");
    }

    /* renamed from: L6 */
    public final C2469j2 mo20975L6(C2393i2 i2Var) throws RemoteException {
        Parcel j8 = mo25467j8();
        pr5.m24996d(j8, i2Var);
        Parcel k8 = mo25468k8(3, j8);
        C2469j2 j2Var = (C2469j2) pr5.m24993a(k8, C2469j2.CREATOR);
        k8.recycle();
        return j2Var;
    }

    /* renamed from: U0 */
    public final Bundle mo20976U0(Account account) throws RemoteException {
        Parcel j8 = mo25467j8();
        pr5.m24996d(j8, account);
        Parcel k8 = mo25468k8(7, j8);
        Bundle bundle = (Bundle) pr5.m24993a(k8, Bundle.CREATOR);
        k8.recycle();
        return bundle;
    }

    /* renamed from: V1 */
    public final Bundle mo20977V1(String str, Bundle bundle) throws RemoteException {
        Parcel j8 = mo25467j8();
        j8.writeString(str);
        pr5.m24996d(j8, bundle);
        Parcel k8 = mo25468k8(2, j8);
        Bundle bundle2 = (Bundle) pr5.m24993a(k8, Bundle.CREATOR);
        k8.recycle();
        return bundle2;
    }

    /* renamed from: a7 */
    public final Bundle mo20978a7(Account account, String str, Bundle bundle) throws RemoteException {
        Parcel j8 = mo25467j8();
        pr5.m24996d(j8, account);
        j8.writeString(str);
        pr5.m24996d(j8, bundle);
        Parcel k8 = mo25468k8(5, j8);
        Bundle bundle2 = (Bundle) pr5.m24993a(k8, Bundle.CREATOR);
        k8.recycle();
        return bundle2;
    }

    /* renamed from: x2 */
    public final Bundle mo20979x2(String str) throws RemoteException {
        Parcel j8 = mo25467j8();
        j8.writeString(str);
        Parcel k8 = mo25468k8(8, j8);
        Bundle bundle = (Bundle) pr5.m24993a(k8, Bundle.CREATOR);
        k8.recycle();
        return bundle;
    }
}
