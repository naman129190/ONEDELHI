package com.onedelhi.secure;

import android.os.RemoteException;

public final class cb5 implements od4 {

    /* renamed from: a */
    public final /* synthetic */ nd4 f10217a;

    /* renamed from: a */
    public final rg5 f10218a;

    public cb5(nd4 nd4) {
        this.f10217a = nd4;
        this.f10218a = nd4.f17326a;
    }

    @ts2
    /* renamed from: a */
    public final kd4 mo14091a(int i, int i2, int i3) {
        try {
            return this.f10218a.mo23072V6(i, i2, i3);
        } catch (RemoteException unused) {
            return null;
        }
    }
}
