package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.RootTelemetryConfigManager;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.TelemetryLogging;
import com.google.android.gms.common.internal.TelemetryLoggingClient;
import com.google.android.gms.common.internal.zal;
import com.google.android.gms.common.util.DeviceProperties;
import com.onedelhi.secure.C3679ua;
import com.onedelhi.secure.h55;
import com.onedelhi.secure.ly4;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.np1;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.w94;
import com.onedelhi.secure.x94;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

@ShowFirstParty
@KeepForSdk
public class GoogleApiManager implements Handler.Callback {
    @mr2
    public static final Status zaa = new Status(4, "Sign-out occurred while this API call was in progress.");
    /* access modifiers changed from: private */
    public static final Status zab = new Status(4, "The user must be signed in to make this API call.");
    /* access modifiers changed from: private */
    public static final Object zac = new Object();
    @GuardedBy("lock")
    @ts2
    private static GoogleApiManager zad;
    /* access modifiers changed from: private */
    public long zae = 5000;
    /* access modifiers changed from: private */
    public long zaf = 120000;
    /* access modifiers changed from: private */
    public long zag = 10000;
    /* access modifiers changed from: private */
    public boolean zah = false;
    @ts2
    private TelemetryData zai;
    @ts2
    private TelemetryLoggingClient zaj;
    /* access modifiers changed from: private */
    public final Context zak;
    /* access modifiers changed from: private */
    public final GoogleApiAvailability zal;
    /* access modifiers changed from: private */
    public final zal zam;
    private final AtomicInteger zan = new AtomicInteger(1);
    private final AtomicInteger zao = new AtomicInteger(0);
    /* access modifiers changed from: private */
    public final Map zap = new ConcurrentHashMap(5, 0.75f, 1);
    /* access modifiers changed from: private */
    @GuardedBy("lock")
    @ts2
    public zaae zaq = null;
    /* access modifiers changed from: private */
    @GuardedBy("lock")
    public final Set zar = new C3679ua();
    private final Set zas = new C3679ua();
    /* access modifiers changed from: private */
    @NotOnlyInitialized
    public final Handler zat;
    /* access modifiers changed from: private */
    public volatile boolean zau = true;

    @KeepForSdk
    private GoogleApiManager(Context context, Looper looper, GoogleApiAvailability googleApiAvailability) {
        this.zak = context;
        h55 h55 = new h55(looper, this);
        this.zat = h55;
        this.zal = googleApiAvailability;
        this.zam = new zal(googleApiAvailability);
        if (DeviceProperties.isAuto(context)) {
            this.zau = false;
        }
        h55.sendMessage(h55.obtainMessage(6));
    }

    @KeepForSdk
    public static void reportSignOut() {
        synchronized (zac) {
            GoogleApiManager googleApiManager = zad;
            if (googleApiManager != null) {
                googleApiManager.zao.incrementAndGet();
                Handler handler = googleApiManager.zat;
                handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
            }
        }
    }

    /* access modifiers changed from: private */
    public static Status zaH(ApiKey apiKey, ConnectionResult connectionResult) {
        String zaa2 = apiKey.zaa();
        String valueOf = String.valueOf(connectionResult);
        return new Status(connectionResult, "API: " + zaa2 + " is not available on this device. Connection failed with: " + valueOf);
    }

    @ly4
    private final zabq zaI(GoogleApi googleApi) {
        ApiKey apiKey = googleApi.getApiKey();
        zabq zabq = (zabq) this.zap.get(apiKey);
        if (zabq == null) {
            zabq = new zabq(this, googleApi);
            this.zap.put(apiKey, zabq);
        }
        if (zabq.zaz()) {
            this.zas.add(apiKey);
        }
        zabq.zao();
        return zabq;
    }

    @ly4
    private final TelemetryLoggingClient zaJ() {
        if (this.zaj == null) {
            this.zaj = TelemetryLogging.getClient(this.zak);
        }
        return this.zaj;
    }

    @ly4
    private final void zaK() {
        TelemetryData telemetryData = this.zai;
        if (telemetryData != null) {
            if (telemetryData.zaa() > 0 || zaF()) {
                zaJ().log(telemetryData);
            }
            this.zai = null;
        }
    }

    private final void zaL(x94 x94, int i, GoogleApi googleApi) {
        zacd zaa2;
        if (i != 0 && (zaa2 = zacd.zaa(this, i, googleApi.getApiKey())) != null) {
            w94 a = x94.mo26835a();
            Handler handler = this.zat;
            handler.getClass();
            a.mo17574f(new zabk(handler), zaa2);
        }
    }

    @mr2
    public static GoogleApiManager zal() {
        GoogleApiManager googleApiManager;
        synchronized (zac) {
            Preconditions.checkNotNull(zad, "Must guarantee manager is non-null before using getInstance");
            googleApiManager = zad;
        }
        return googleApiManager;
    }

    @mr2
    public static GoogleApiManager zam(@mr2 Context context) {
        GoogleApiManager googleApiManager;
        synchronized (zac) {
            if (zad == null) {
                zad = new GoogleApiManager(context.getApplicationContext(), GmsClientSupervisor.getOrStartHandlerThread().getLooper(), GoogleApiAvailability.getInstance());
            }
            googleApiManager = zad;
        }
        return googleApiManager;
    }

    @ly4
    public final boolean handleMessage(@mr2 Message message) {
        x94 x94;
        Boolean bool;
        int i = message.what;
        long j = np1.f32709a;
        zabq zabq = null;
        switch (i) {
            case 1:
                if (true == ((Boolean) message.obj).booleanValue()) {
                    j = 10000;
                }
                this.zag = j;
                this.zat.removeMessages(12);
                for (ApiKey obtainMessage : this.zap.keySet()) {
                    Handler handler = this.zat;
                    handler.sendMessageDelayed(handler.obtainMessage(12, obtainMessage), this.zag);
                }
                break;
            case 2:
                zal zal2 = (zal) message.obj;
                Iterator it = zal2.zab().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else {
                        ApiKey apiKey = (ApiKey) it.next();
                        zabq zabq2 = (zabq) this.zap.get(apiKey);
                        if (zabq2 == null) {
                            zal2.zac(apiKey, new ConnectionResult(13), (String) null);
                            break;
                        } else if (zabq2.zay()) {
                            zal2.zac(apiKey, ConnectionResult.RESULT_SUCCESS, zabq2.zaf().getEndpointPackageName());
                        } else {
                            ConnectionResult zad2 = zabq2.zad();
                            if (zad2 != null) {
                                zal2.zac(apiKey, zad2, (String) null);
                            } else {
                                zabq2.zat(zal2);
                                zabq2.zao();
                            }
                        }
                    }
                }
            case 3:
                for (zabq zabq3 : this.zap.values()) {
                    zabq3.zan();
                    zabq3.zao();
                }
                break;
            case 4:
            case 8:
            case 13:
                zach zach = (zach) message.obj;
                zabq zabq4 = (zabq) this.zap.get(zach.zac.getApiKey());
                if (zabq4 == null) {
                    zabq4 = zaI(zach.zac);
                }
                if (zabq4.zaz() && this.zao.get() != zach.zab) {
                    zach.zaa.zad(zaa);
                    zabq4.zav();
                    break;
                } else {
                    zabq4.zap(zach.zaa);
                    break;
                }
                break;
            case 5:
                int i2 = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                Iterator it2 = this.zap.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        zabq zabq5 = (zabq) it2.next();
                        if (zabq5.zab() == i2) {
                            zabq = zabq5;
                        }
                    }
                }
                if (zabq != null) {
                    if (connectionResult.getErrorCode() != 13) {
                        zabq.zaD(zaH(zabq.zad, connectionResult));
                        break;
                    } else {
                        String errorString = this.zal.getErrorString(connectionResult.getErrorCode());
                        String errorMessage = connectionResult.getErrorMessage();
                        zabq.zaD(new Status(17, "Error resolution was canceled by the user, original error message: " + errorString + ": " + errorMessage));
                        break;
                    }
                } else {
                    Log.wtf("GoogleApiManager", "Could not find API instance " + i2 + " while trying to fail enqueued calls.", new Exception());
                    break;
                }
            case 6:
                if (this.zak.getApplicationContext() instanceof Application) {
                    BackgroundDetector.initialize((Application) this.zak.getApplicationContext());
                    BackgroundDetector.getInstance().addListener(new zabl(this));
                    if (!BackgroundDetector.getInstance().readCurrentStateIfPossible(true)) {
                        this.zag = np1.f32709a;
                        break;
                    }
                }
                break;
            case 7:
                zaI((GoogleApi) message.obj);
                break;
            case 9:
                if (this.zap.containsKey(message.obj)) {
                    ((zabq) this.zap.get(message.obj)).zau();
                    break;
                }
                break;
            case 10:
                for (ApiKey remove : this.zas) {
                    zabq zabq6 = (zabq) this.zap.remove(remove);
                    if (zabq6 != null) {
                        zabq6.zav();
                    }
                }
                this.zas.clear();
                break;
            case 11:
                if (this.zap.containsKey(message.obj)) {
                    ((zabq) this.zap.get(message.obj)).zaw();
                    break;
                }
                break;
            case 12:
                if (this.zap.containsKey(message.obj)) {
                    ((zabq) this.zap.get(message.obj)).zaA();
                    break;
                }
                break;
            case 14:
                zaaf zaaf = (zaaf) message.obj;
                ApiKey zaa2 = zaaf.zaa();
                if (!this.zap.containsKey(zaa2)) {
                    x94 = zaaf.zab();
                    bool = Boolean.FALSE;
                } else {
                    boolean zax = ((zabq) this.zap.get(zaa2)).zaN(false);
                    x94 = zaaf.zab();
                    bool = Boolean.valueOf(zax);
                }
                x94.mo26837c(bool);
                break;
            case 15:
                zabs zabs = (zabs) message.obj;
                if (this.zap.containsKey(zabs.zaa)) {
                    zabq.zal((zabq) this.zap.get(zabs.zaa), zabs);
                    break;
                }
                break;
            case 16:
                zabs zabs2 = (zabs) message.obj;
                if (this.zap.containsKey(zabs2.zaa)) {
                    zabq.zam((zabq) this.zap.get(zabs2.zaa), zabs2);
                    break;
                }
                break;
            case 17:
                zaK();
                break;
            case 18:
                zace zace = (zace) message.obj;
                if (zace.zac != 0) {
                    TelemetryData telemetryData = this.zai;
                    if (telemetryData != null) {
                        List zab2 = telemetryData.zab();
                        if (telemetryData.zaa() != zace.zab || (zab2 != null && zab2.size() >= zace.zad)) {
                            this.zat.removeMessages(17);
                            zaK();
                        } else {
                            this.zai.zac(zace.zaa);
                        }
                    }
                    if (this.zai == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(zace.zaa);
                        this.zai = new TelemetryData(zace.zab, arrayList);
                        Handler handler2 = this.zat;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), zace.zac);
                        break;
                    }
                } else {
                    zaJ().log(new TelemetryData(zace.zab, Arrays.asList(new MethodInvocation[]{zace.zaa})));
                    break;
                }
                break;
            case 19:
                this.zah = false;
                break;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + i);
                return false;
        }
        return true;
    }

    public final void zaA() {
        Handler handler = this.zat;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void zaB(@mr2 GoogleApi googleApi) {
        Handler handler = this.zat;
        handler.sendMessage(handler.obtainMessage(7, googleApi));
    }

    public final void zaC(@mr2 zaae zaae) {
        synchronized (zac) {
            if (this.zaq != zaae) {
                this.zaq = zaae;
                this.zar.clear();
            }
            this.zar.addAll(zaae.zaa());
        }
    }

    public final void zaD(@mr2 zaae zaae) {
        synchronized (zac) {
            if (this.zaq == zaae) {
                this.zaq = null;
                this.zar.clear();
            }
        }
    }

    @ly4
    public final boolean zaF() {
        if (this.zah) {
            return false;
        }
        RootTelemetryConfiguration config = RootTelemetryConfigManager.getInstance().getConfig();
        if (config != null && !config.getMethodInvocationTelemetryEnabled()) {
            return false;
        }
        int zaa2 = this.zam.zaa(this.zak, 203400000);
        return zaa2 == -1 || zaa2 == 0;
    }

    public final boolean zaG(ConnectionResult connectionResult, int i) {
        return this.zal.zah(this.zak, connectionResult, i);
    }

    public final int zaa() {
        return this.zan.getAndIncrement();
    }

    @ts2
    public final zabq zak(ApiKey apiKey) {
        return (zabq) this.zap.get(apiKey);
    }

    @mr2
    public final w94 zao(@mr2 Iterable iterable) {
        zal zal2 = new zal(iterable);
        Handler handler = this.zat;
        handler.sendMessage(handler.obtainMessage(2, zal2));
        return zal2.zaa();
    }

    @mr2
    public final w94 zap(@mr2 GoogleApi googleApi) {
        zaaf zaaf = new zaaf(googleApi.getApiKey());
        Handler handler = this.zat;
        handler.sendMessage(handler.obtainMessage(14, zaaf));
        return zaaf.zab().mo26835a();
    }

    @mr2
    public final w94 zaq(@mr2 GoogleApi googleApi, @mr2 RegisterListenerMethod registerListenerMethod, @mr2 UnregisterListenerMethod unregisterListenerMethod, @mr2 Runnable runnable) {
        x94 x94 = new x94();
        zaL(x94, registerListenerMethod.zaa(), googleApi);
        zaf zaf2 = new zaf(new zaci(registerListenerMethod, unregisterListenerMethod, runnable), x94);
        Handler handler = this.zat;
        handler.sendMessage(handler.obtainMessage(8, new zach(zaf2, this.zao.get(), googleApi)));
        return x94.mo26835a();
    }

    @mr2
    public final w94 zar(@mr2 GoogleApi googleApi, @mr2 ListenerHolder.ListenerKey listenerKey, int i) {
        x94 x94 = new x94();
        zaL(x94, i, googleApi);
        zah zah2 = new zah(listenerKey, x94);
        Handler handler = this.zat;
        handler.sendMessage(handler.obtainMessage(13, new zach(zah2, this.zao.get(), googleApi)));
        return x94.mo26835a();
    }

    public final void zaw(@mr2 GoogleApi googleApi, int i, @mr2 BaseImplementation.ApiMethodImpl apiMethodImpl) {
        zae zae2 = new zae(i, apiMethodImpl);
        Handler handler = this.zat;
        handler.sendMessage(handler.obtainMessage(4, new zach(zae2, this.zao.get(), googleApi)));
    }

    public final void zax(@mr2 GoogleApi googleApi, int i, @mr2 TaskApiCall taskApiCall, @mr2 x94 x94, @mr2 StatusExceptionMapper statusExceptionMapper) {
        zaL(x94, taskApiCall.zaa(), googleApi);
        zag zag2 = new zag(i, taskApiCall, x94, statusExceptionMapper);
        Handler handler = this.zat;
        handler.sendMessage(handler.obtainMessage(4, new zach(zag2, this.zao.get(), googleApi)));
    }

    public final void zay(MethodInvocation methodInvocation, int i, long j, int i2) {
        Handler handler = this.zat;
        handler.sendMessage(handler.obtainMessage(18, new zace(methodInvocation, i, j, i2)));
    }

    public final void zaz(@mr2 ConnectionResult connectionResult, int i) {
        if (!zaG(connectionResult, i)) {
            Handler handler = this.zat;
            handler.sendMessage(handler.obtainMessage(5, i, 0, connectionResult));
        }
    }
}
