package com.onedelhi.secure;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.onedelhi.secure.ub0;
import java.util.concurrent.Executor;

public final class mp5 extends GoogleApi implements jd1 {

    /* renamed from: a */
    public static final Api.ClientKey f16268a;

    /* renamed from: a */
    public static final Api f16269a;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        f16268a = clientKey;
        f16269a = new Api("LocationServices.API", new xo5(), clientKey);
    }

    public mp5(Activity activity) {
        super(activity, f16269a, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public mp5(Context context) {
        super(context, f16269a, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    /* renamed from: A */
    public final w94<Void> mo18262A(LocationRequest locationRequest, z62 z62, @ts2 Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            Preconditions.checkNotNull(looper, "invalid null looper");
        }
        return mo20581V(locationRequest, ListenerHolders.createListenerHolder(z62, looper, z62.class.getSimpleName()));
    }

    /* renamed from: B */
    public final w94<Void> mo18263B() {
        return doWrite(TaskApiCall.builder().run(lj5.f15437a).setMethodKey(2422).build());
    }

    /* renamed from: F */
    public final w94<LocationAvailability> mo18264F() {
        return doRead(TaskApiCall.builder().run(fm5.f12231a).setMethodKey(2416).build());
    }

    /* renamed from: H */
    public final w94<Void> mo18265H(boolean z) {
        return doWrite(TaskApiCall.builder().run(new lm5(z)).setMethodKey(2420).build());
    }

    /* renamed from: K */
    public final w94<Void> mo18266K(Location location) {
        Preconditions.checkArgument(location != null);
        return doWrite(TaskApiCall.builder().run(new tj5(location)).setMethodKey(2421).build());
    }

    /* renamed from: M */
    public final w94<Location> mo18267M(ub0 ub0, @ts2 C3452ru ruVar) {
        if (ruVar != null) {
            Preconditions.checkArgument(!ruVar.mo23251a(), "cancellationToken may not be already canceled");
        }
        w94<Location> doRead = doRead(TaskApiCall.builder().run(new vn5(ub0, ruVar)).setMethodKey(2415).build());
        if (ruVar == null) {
            return doRead;
        }
        x94 x94 = new x94(ruVar);
        doRead.mo17581m(new bo5(x94));
        return x94.mo26835a();
    }

    /* renamed from: N */
    public final w94<Void> mo18268N(c72 c72) {
        return doUnregisterEventListener(ListenerHolders.createListenerKey(c72, c72.class.getSimpleName()), 2418).mo17582n(no5.f17504a, so5.f20481a);
    }

    /* renamed from: P */
    public final w94<Void> mo18269P(PendingIntent pendingIntent) {
        return doWrite(TaskApiCall.builder().run(new pn5(pendingIntent)).setMethodKey(2418).build());
    }

    /* renamed from: Q */
    public final w94<Void> mo18270Q(LocationRequest locationRequest, Executor executor, c72 c72) {
        return mo20582W(locationRequest, ListenerHolders.createListenerHolder(c72, executor, c72.class.getSimpleName()));
    }

    /* renamed from: R */
    public final w94<Location> mo18271R(f12 f12) {
        return doRead(TaskApiCall.builder().run(new ho5(f12)).setMethodKey(2414).setFeatures(xr6.f22723f).build());
    }

    /* renamed from: U */
    public final w94<Location> mo18272U() {
        return doRead(TaskApiCall.builder().run(dn5.f10869a).setMethodKey(2414).build());
    }

    /* renamed from: V */
    public final w94 mo20581V(LocationRequest locationRequest, ListenerHolder listenerHolder) {
        hp5 hp5 = new hp5(this, listenerHolder, bk5.f9874a);
        return doRegisterEventListener(RegistrationMethods.builder().register(new jk5(hp5, locationRequest)).unregister(hp5).withHolder(listenerHolder).setMethodKey(2436).build());
    }

    /* renamed from: W */
    public final w94 mo20582W(LocationRequest locationRequest, ListenerHolder listenerHolder) {
        hp5 hp5 = new hp5(this, listenerHolder, xm5.f22633a);
        return doRegisterEventListener(RegistrationMethods.builder().register(new jn5(hp5, locationRequest)).unregister(hp5).withHolder(listenerHolder).setMethodKey(2435).build());
    }

    /* renamed from: d */
    public final w94<Void> mo18273d(LocationRequest locationRequest, c72 c72, @ts2 Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            Preconditions.checkNotNull(looper, "invalid null looper");
        }
        return mo20582W(locationRequest, ListenerHolders.createListenerHolder(c72, looper, c72.class.getSimpleName()));
    }

    /* renamed from: g */
    public final w94<Void> mo18274g(LocationRequest locationRequest, PendingIntent pendingIntent) {
        return doWrite(TaskApiCall.builder().run(new rk5(pendingIntent, locationRequest)).setMethodKey(2417).build());
    }

    /* renamed from: n */
    public final w94<Void> mo18275n(z62 z62) {
        return doUnregisterEventListener(ListenerHolders.createListenerKey(z62, z62.class.getSimpleName()), 2418).mo17582n(no5.f17504a, rm5.f19925a);
    }

    /* renamed from: r */
    public final w94<Location> mo18276r(int i, @ts2 C3452ru ruVar) {
        ub0.C3691a aVar = new ub0.C3691a();
        aVar.mo25558e(i);
        ub0 a = aVar.mo25554a();
        if (ruVar != null) {
            Preconditions.checkArgument(!ruVar.mo23251a(), "cancellationToken may not be already canceled");
        }
        w94<Location> doRead = doRead(TaskApiCall.builder().run(new vn5(a, ruVar)).setMethodKey(2415).build());
        if (ruVar == null) {
            return doRead;
        }
        x94 x94 = new x94(ruVar);
        doRead.mo17581m(new bo5(x94));
        return x94.mo26835a();
    }

    /* renamed from: t */
    public final w94<Void> mo18277t(LocationRequest locationRequest, Executor executor, z62 z62) {
        return mo20581V(locationRequest, ListenerHolders.createListenerHolder(z62, executor, z62.class.getSimpleName()));
    }
}
