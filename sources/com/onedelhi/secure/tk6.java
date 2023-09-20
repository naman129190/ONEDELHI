package com.onedelhi.secure;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.auth.UserRecoverableAuthException;
import java.io.IOException;

public final class tk6 implements mn6 {

    /* renamed from: a */
    public final /* synthetic */ String f20959a;

    public tk6(String str) {
        this.f20959a = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo13110a(IBinder iBinder) throws RemoteException, IOException, rh1 {
        Bundle x2 = r26.m26276k8(iBinder).mo20979x2(this.f20959a);
        Object unused = fq6.m15238t(x2);
        String string = x2.getString(h60.f29526u);
        Intent intent = (Intent) x2.getParcelable("userRecoveryIntent");
        jr5 a = jr5.m18774a(string);
        if (jr5.SUCCESS.equals(a)) {
            return Boolean.TRUE;
        }
        if (jr5.m18775b(a)) {
            fq6.f12272a.mo10174w("isUserRecoverableError status: ".concat(String.valueOf(a)), new Object[0]);
            throw new UserRecoverableAuthException(string, intent);
        }
        throw new rh1(string);
    }
}
