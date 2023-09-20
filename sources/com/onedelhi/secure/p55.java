package com.onedelhi.secure;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

public abstract class p55 extends t65 implements q55 {
    public p55() {
        super("com.google.android.gms.auth.api.identity.internal.IGetPhoneNumberHintIntentCallback");
    }

    /* renamed from: j8 */
    public final boolean mo17694j8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        b75.m11658b(parcel);
        mo20133y0((Status) b75.m11657a(parcel, Status.CREATOR), (PendingIntent) b75.m11657a(parcel, PendingIntent.CREATOR));
        return true;
    }
}
