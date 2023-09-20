package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;

public class AccountAccessor extends IAccountAccessor.Stub {
    @KeepForSdk
    @ts2
    public static Account getAccountBinderSafe(@mr2 IAccountAccessor iAccountAccessor) {
        Account account = null;
        if (iAccountAccessor != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                account = iAccountAccessor.zzb();
            } catch (RemoteException unused) {
                Log.w("AccountAccessor", "Remote account accessor probably died");
            } catch (Throwable th) {
                Binder.restoreCallingIdentity(clearCallingIdentity);
                throw th;
            }
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
        return account;
    }

    public final boolean equals(@ts2 Object obj) {
        throw null;
    }

    @mr2
    public final Account zzb() {
        throw null;
    }
}
