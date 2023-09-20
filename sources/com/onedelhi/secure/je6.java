package com.onedelhi.secure;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import java.io.IOException;

public final class je6 implements mn6 {

    /* renamed from: a */
    public final /* synthetic */ Bundle f14116a;

    /* renamed from: a */
    public final /* synthetic */ String f14117a;

    public je6(String str, Bundle bundle) {
        this.f14117a = str;
        this.f14116a = bundle;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo13110a(IBinder iBinder) throws RemoteException, IOException, rh1 {
        Bundle V1 = r26.m26276k8(iBinder).mo20977V1(this.f14117a, this.f14116a);
        Object unused = fq6.m15238t(V1);
        String string = V1.getString(h60.f29526u);
        if (V1.getBoolean("booleanResult")) {
            return null;
        }
        throw new rh1(string);
    }
}
