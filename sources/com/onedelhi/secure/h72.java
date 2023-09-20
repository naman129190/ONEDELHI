package com.onedelhi.secure;

import android.location.LocationManager;
import com.onedelhi.secure.i72;
import java.util.concurrent.Callable;

public final /* synthetic */ class h72 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ LocationManager f29536a;

    /* renamed from: a */
    public final /* synthetic */ i72.C2411i f29537a;

    public /* synthetic */ h72(LocationManager locationManager, i72.C2411i iVar) {
        this.f29536a = locationManager;
        this.f29537a = iVar;
    }

    public final Object call() {
        return Boolean.valueOf(this.f29536a.addGpsStatusListener(this.f29537a));
    }
}
