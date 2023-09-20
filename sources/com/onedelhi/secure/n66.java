package com.onedelhi.secure;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import javax.annotation.Nullable;

public interface n66 extends IInterface {
    /* renamed from: L6 */
    C2469j2 mo20975L6(C2393i2 i2Var) throws RemoteException;

    @Nullable
    /* renamed from: U0 */
    Bundle mo20976U0(Account account) throws RemoteException;

    /* renamed from: V1 */
    Bundle mo20977V1(String str, Bundle bundle) throws RemoteException;

    @Nullable
    /* renamed from: a7 */
    Bundle mo20978a7(Account account, String str, Bundle bundle) throws RemoteException;

    /* renamed from: x2 */
    Bundle mo20979x2(String str) throws RemoteException;
}
