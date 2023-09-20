package com.onedelhi.secure;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

public final class vt6 {
    @ts2

    /* renamed from: a */
    public final Messenger f21958a;
    @ts2

    /* renamed from: a */
    public final px5 f21959a;

    public vt6(IBinder iBinder) throws RemoteException {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.f21958a = new Messenger(iBinder);
            this.f21959a = null;
        } else if (rn1.f19945a.equals(interfaceDescriptor)) {
            this.f21959a = new px5(iBinder);
            this.f21958a = null;
        } else {
            String valueOf = String.valueOf(interfaceDescriptor);
            Log.w("MessengerIpcClient", valueOf.length() != 0 ? "Invalid interface descriptor: ".concat(valueOf) : new String("Invalid interface descriptor: "));
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public final void mo26331a(Message message) throws RemoteException {
        Messenger messenger = this.f21958a;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        px5 px5 = this.f21959a;
        if (px5 != null) {
            px5.mo22723b(message);
            return;
        }
        throw new IllegalStateException("Both messengers are null");
    }
}
