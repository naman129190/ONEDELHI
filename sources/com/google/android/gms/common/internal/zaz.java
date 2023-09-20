package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import com.onedelhi.secure.nt2;
import com.onedelhi.secure.zh3;

public final class zaz extends zh3 {
    private static final zaz zaa = new zaz();

    private zaz() {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    public static View zaa(Context context, int i, int i2) throws zh3.C4095a {
        zaz zaz = zaa;
        try {
            zax zax = new zax(1, i, i2, (Scope[]) null);
            return (View) nt2.m23165k8(((zam) zaz.getRemoteCreatorInstance(context)).zae(nt2.m23166l8(context), zax));
        } catch (Exception e) {
            throw new zh3.C4095a("Could not get button with size " + i + " and color " + i2, e);
        }
    }

    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        return queryLocalInterface instanceof zam ? (zam) queryLocalInterface : new zam(iBinder);
    }
}
