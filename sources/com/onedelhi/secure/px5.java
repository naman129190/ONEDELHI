package com.onedelhi.secure;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

public final class px5 implements Parcelable {
    public static final Parcelable.Creator<px5> CREATOR = new xl5();

    /* renamed from: a */
    public Messenger f18775a;

    /* renamed from: a */
    public rn1 f18776a;

    public px5(IBinder iBinder) {
        this.f18775a = new Messenger(iBinder);
    }

    /* renamed from: a */
    public final IBinder mo22722a() {
        Messenger messenger = this.f18775a;
        return messenger != null ? messenger.getBinder() : this.f18776a.asBinder();
    }

    /* renamed from: b */
    public final void mo22723b(Message message) throws RemoteException {
        Messenger messenger = this.f18775a;
        if (messenger != null) {
            messenger.send(message);
        } else {
            this.f18776a.mo23959J1(message);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@ts2 Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return mo22722a().equals(((px5) obj).mo22722a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return mo22722a().hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.f18775a;
        parcel.writeStrongBinder(messenger != null ? messenger.getBinder() : this.f18776a.asBinder());
    }
}
