package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.messaging.FirebaseMessaging;
import com.onedelhi.secure.C3042oa;
import com.onedelhi.secure.ba0;
import com.onedelhi.secure.bn6;
import com.onedelhi.secure.bs6;
import com.onedelhi.secure.bu5;
import com.onedelhi.secure.cx6;
import com.onedelhi.secure.dj6;
import com.onedelhi.secure.gf6;
import com.onedelhi.secure.gr6;
import com.onedelhi.secure.h51;
import com.onedelhi.secure.hj5;
import com.onedelhi.secure.ik6;
import com.onedelhi.secure.jf6;
import com.onedelhi.secure.ju5;
import com.onedelhi.secure.kv6;
import com.onedelhi.secure.li6;
import com.onedelhi.secure.mf6;
import com.onedelhi.secure.mj1;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.nt2;
import com.onedelhi.secure.nu5;
import com.onedelhi.secure.ph6;
import com.onedelhi.secure.pi6;
import com.onedelhi.secure.pt5;
import com.onedelhi.secure.ri6;
import com.onedelhi.secure.tn1;
import com.onedelhi.secure.tt6;
import com.onedelhi.secure.up6;
import com.onedelhi.secure.vf6;
import com.onedelhi.secure.xe6;
import com.onedelhi.secure.xj5;
import com.onedelhi.secure.yg6;
import com.onedelhi.secure.ys5;
import com.onedelhi.secure.za6;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

@DynamiteApi
public class AppMeasurementDynamiteService extends ys5 {
    @VisibleForTesting

    /* renamed from: a */
    public za6 f7589a = null;
    @mj1("listenerMap")

    /* renamed from: a */
    public final Map f7590a = new C3042oa();

    @EnsuresNonNull({"scion"})
    /* renamed from: a */
    public final void mo10764a() {
        if (this.f7589a == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    public void beginAdUnitExposure(@mr2 String str, long j) throws RemoteException {
        mo10764a();
        this.f7589a.mo27890y().mo18712l(str, j);
    }

    public void clearConditionalUserProperty(@mr2 String str, @mr2 String str2, @mr2 Bundle bundle) throws RemoteException {
        mo10764a();
        this.f7589a.mo27866I().mo23904o(str, str2, bundle);
    }

    public void clearMeasurementEnabled(long j) throws RemoteException {
        mo10764a();
        this.f7589a.mo27866I().mo23883I((Boolean) null);
    }

    public void endAdUnitExposure(@mr2 String str, long j) throws RemoteException {
        mo10764a();
        this.f7589a.mo27890y().mo18713m(str, j);
    }

    public void generateEventId(pt5 pt5) throws RemoteException {
        mo10764a();
        long t0 = this.f7589a.mo27871N().mo16891t0();
        mo10764a();
        this.f7589a.mo27871N().mo16859J(pt5, t0);
    }

    public void getAppInstanceId(pt5 pt5) throws RemoteException {
        mo10764a();
        this.f7589a.mo15135d().mo23065z(new ph6(this, pt5));
    }

    public void getCachedAppInstanceId(pt5 pt5) throws RemoteException {
        mo10764a();
        mo10783k8(pt5, this.f7589a.mo27866I().mo23896V());
    }

    public void getConditionalUserProperties(String str, String str2, pt5 pt5) throws RemoteException {
        mo10764a();
        this.f7589a.mo15135d().mo23065z(new bs6(this, pt5, str, str2));
    }

    public void getCurrentScreenClass(pt5 pt5) throws RemoteException {
        mo10764a();
        mo10783k8(pt5, this.f7589a.mo27866I().mo23897W());
    }

    public void getCurrentScreenName(pt5 pt5) throws RemoteException {
        mo10764a();
        mo10783k8(pt5, this.f7589a.mo27866I().mo23898X());
    }

    public void getGmpAppId(pt5 pt5) throws RemoteException {
        String str;
        mo10764a();
        ri6 I = this.f7589a.mo27866I();
        if (I.f11205a.mo27872O() != null) {
            str = I.f11205a.mo27872O();
        } else {
            try {
                str = dj6.m13169c(I.f11205a.mo15137f(), h51.f29460i, I.f11205a.mo27875R());
            } catch (IllegalStateException e) {
                I.f11205a.mo15136e().mo12726r().mo25380b("getGoogleAppId failed with exception", e);
                str = null;
            }
        }
        mo10783k8(pt5, str);
    }

    public void getMaxUserProperties(String str, pt5 pt5) throws RemoteException {
        mo10764a();
        this.f7589a.mo27866I().mo23891Q(str);
        mo10764a();
        this.f7589a.mo27871N().mo16858I(pt5, 25);
    }

    public void getSessionId(pt5 pt5) throws RemoteException {
        mo10764a();
        ri6 I = this.f7589a.mo27866I();
        I.f11205a.mo15135d().mo23065z(new yg6(I, pt5));
    }

    public void getTestFlag(pt5 pt5, int i) throws RemoteException {
        mo10764a();
        if (i == 0) {
            this.f7589a.mo27871N().mo16860K(pt5, this.f7589a.mo27866I().mo23899Y());
        } else if (i == 1) {
            this.f7589a.mo27871N().mo16859J(pt5, this.f7589a.mo27866I().mo23895U().longValue());
        } else if (i == 2) {
            gr6 N = this.f7589a.mo27871N();
            double doubleValue = this.f7589a.mo27866I().mo23893S().doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", doubleValue);
            try {
                pt5.mo17408W6(bundle);
            } catch (RemoteException e) {
                N.f11205a.mo15136e().mo12731w().mo25380b("Error returning double value to wrapper", e);
            }
        } else if (i == 3) {
            this.f7589a.mo27871N().mo16858I(pt5, this.f7589a.mo27866I().mo23894T().intValue());
        } else if (i == 4) {
            this.f7589a.mo27871N().mo16854E(pt5, this.f7589a.mo27866I().mo23892R().booleanValue());
        }
    }

    public void getUserProperties(String str, String str2, boolean z, pt5 pt5) throws RemoteException {
        mo10764a();
        this.f7589a.mo15135d().mo23065z(new bn6(this, pt5, str, str2, z));
    }

    public void initForTests(@mr2 Map map) throws RemoteException {
        mo10764a();
    }

    public void initialize(tn1 tn1, nu5 nu5, long j) throws RemoteException {
        za6 za6 = this.f7589a;
        if (za6 == null) {
            this.f7589a = za6.m32969H((Context) Preconditions.checkNotNull((Context) nt2.m23165k8(tn1)), nu5, Long.valueOf(j));
        } else {
            za6.mo15136e().mo12731w().mo25379a("Attempting to initialize multiple times");
        }
    }

    public void isDataCollectionEnabled(pt5 pt5) throws RemoteException {
        mo10764a();
        this.f7589a.mo15135d().mo23065z(new tt6(this, pt5));
    }

    /* renamed from: k8 */
    public final void mo10783k8(pt5 pt5, String str) {
        mo10764a();
        this.f7589a.mo27871N().mo16860K(pt5, str);
    }

    public void logEvent(@mr2 String str, @mr2 String str2, @mr2 Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
        mo10764a();
        this.f7589a.mo27866I().mo23908s(str, str2, bundle, z, z2, j);
    }

    public void logEventAndBundle(String str, String str2, Bundle bundle, pt5 pt5, long j) throws RemoteException {
        Bundle bundle2;
        mo10764a();
        Preconditions.checkNotEmpty(str2);
        if (bundle == null) {
            bundle2 = new Bundle();
        }
        bundle2.putString(ba0.f26250a, FirebaseMessaging.f25020d);
        this.f7589a.mo15135d().mo23065z(new ik6(this, pt5, new xj5(str2, new hj5(bundle), FirebaseMessaging.f25020d, j), str));
    }

    public void logHealthData(int i, @mr2 String str, @mr2 tn1 tn1, @mr2 tn1 tn12, @mr2 tn1 tn13) throws RemoteException {
        mo10764a();
        Object obj = null;
        Object k8 = tn1 == null ? null : nt2.m23165k8(tn1);
        Object k82 = tn12 == null ? null : nt2.m23165k8(tn12);
        if (tn13 != null) {
            obj = nt2.m23165k8(tn13);
        }
        this.f7589a.mo15136e().mo12723G(i, true, false, str, k8, k82, obj);
    }

    public void onActivityCreated(@mr2 tn1 tn1, @mr2 Bundle bundle, long j) throws RemoteException {
        mo10764a();
        pi6 pi6 = this.f7589a.mo27866I().f19888a;
        if (pi6 != null) {
            this.f7589a.mo27866I().mo23905p();
            pi6.onActivityCreated((Activity) nt2.m23165k8(tn1), bundle);
        }
    }

    public void onActivityDestroyed(@mr2 tn1 tn1, long j) throws RemoteException {
        mo10764a();
        pi6 pi6 = this.f7589a.mo27866I().f19888a;
        if (pi6 != null) {
            this.f7589a.mo27866I().mo23905p();
            pi6.onActivityDestroyed((Activity) nt2.m23165k8(tn1));
        }
    }

    public void onActivityPaused(@mr2 tn1 tn1, long j) throws RemoteException {
        mo10764a();
        pi6 pi6 = this.f7589a.mo27866I().f19888a;
        if (pi6 != null) {
            this.f7589a.mo27866I().mo23905p();
            pi6.onActivityPaused((Activity) nt2.m23165k8(tn1));
        }
    }

    public void onActivityResumed(@mr2 tn1 tn1, long j) throws RemoteException {
        mo10764a();
        pi6 pi6 = this.f7589a.mo27866I().f19888a;
        if (pi6 != null) {
            this.f7589a.mo27866I().mo23905p();
            pi6.onActivityResumed((Activity) nt2.m23165k8(tn1));
        }
    }

    public void onActivitySaveInstanceState(tn1 tn1, pt5 pt5, long j) throws RemoteException {
        mo10764a();
        pi6 pi6 = this.f7589a.mo27866I().f19888a;
        Bundle bundle = new Bundle();
        if (pi6 != null) {
            this.f7589a.mo27866I().mo23905p();
            pi6.onActivitySaveInstanceState((Activity) nt2.m23165k8(tn1), bundle);
        }
        try {
            pt5.mo17408W6(bundle);
        } catch (RemoteException e) {
            this.f7589a.mo15136e().mo12731w().mo25380b("Error returning bundle value to wrapper", e);
        }
    }

    public void onActivityStarted(@mr2 tn1 tn1, long j) throws RemoteException {
        mo10764a();
        if (this.f7589a.mo27866I().f19888a != null) {
            this.f7589a.mo27866I().mo23905p();
            Activity activity = (Activity) nt2.m23165k8(tn1);
        }
    }

    public void onActivityStopped(@mr2 tn1 tn1, long j) throws RemoteException {
        mo10764a();
        if (this.f7589a.mo27866I().f19888a != null) {
            this.f7589a.mo27866I().mo23905p();
            Activity activity = (Activity) nt2.m23165k8(tn1);
        }
    }

    public void performAction(Bundle bundle, pt5 pt5, long j) throws RemoteException {
        mo10764a();
        pt5.mo17408W6((Bundle) null);
    }

    public void registerOnMeasurementEventListener(bu5 bu5) throws RemoteException {
        xe6 xe6;
        mo10764a();
        synchronized (this.f7590a) {
            xe6 = (xe6) this.f7590a.get(Integer.valueOf(bu5.mo13821o()));
            if (xe6 == null) {
                xe6 = new cx6(this, bu5);
                this.f7590a.put(Integer.valueOf(bu5.mo13821o()), xe6);
            }
        }
        this.f7589a.mo27866I().mo23913x(xe6);
    }

    public void resetAnalyticsData(long j) throws RemoteException {
        mo10764a();
        this.f7589a.mo27866I().mo23914y(j);
    }

    public void setConditionalUserProperty(@mr2 Bundle bundle, long j) throws RemoteException {
        mo10764a();
        if (bundle == null) {
            this.f7589a.mo15136e().mo12726r().mo25379a("Conditional user property must not be null");
        } else {
            this.f7589a.mo27866I().mo23879E(bundle, j);
        }
    }

    public void setConsent(@mr2 Bundle bundle, long j) throws RemoteException {
        mo10764a();
        ri6 I = this.f7589a.mo27866I();
        I.f11205a.mo15135d().mo23058A(new gf6(I, bundle, j));
    }

    public void setConsentThirdParty(@mr2 Bundle bundle, long j) throws RemoteException {
        mo10764a();
        this.f7589a.mo27866I().mo23880F(bundle, -20, j);
    }

    public void setCurrentScreen(@mr2 tn1 tn1, @mr2 String str, @mr2 String str2, long j) throws RemoteException {
        mo10764a();
        this.f7589a.mo27868K().mo26142D((Activity) nt2.m23165k8(tn1), str, str2);
    }

    public void setDataCollectionEnabled(boolean z) throws RemoteException {
        mo10764a();
        ri6 I = this.f7589a.mo27866I();
        I.mo15845i();
        I.f11205a.mo15135d().mo23065z(new li6(I, z));
    }

    public void setDefaultEventParameters(@mr2 Bundle bundle) {
        mo10764a();
        ri6 I = this.f7589a.mo27866I();
        I.f11205a.mo15135d().mo23065z(new jf6(I, bundle == null ? null : new Bundle(bundle)));
    }

    public void setEventInterceptor(bu5 bu5) throws RemoteException {
        mo10764a();
        kv6 kv6 = new kv6(this, bu5);
        if (this.f7589a.mo15135d().mo23059C()) {
            this.f7589a.mo27866I().mo23882H(kv6);
        } else {
            this.f7589a.mo15135d().mo23065z(new up6(this, kv6));
        }
    }

    public void setInstanceIdProvider(ju5 ju5) throws RemoteException {
        mo10764a();
    }

    public void setMeasurementEnabled(boolean z, long j) throws RemoteException {
        mo10764a();
        this.f7589a.mo27866I().mo23883I(Boolean.valueOf(z));
    }

    public void setMinimumSessionDuration(long j) throws RemoteException {
        mo10764a();
    }

    public void setSessionTimeoutDuration(long j) throws RemoteException {
        mo10764a();
        ri6 I = this.f7589a.mo27866I();
        I.f11205a.mo15135d().mo23065z(new vf6(I, j));
    }

    public void setUserId(@mr2 String str, long j) throws RemoteException {
        mo10764a();
        ri6 I = this.f7589a.mo27866I();
        if (str == null || !TextUtils.isEmpty(str)) {
            I.f11205a.mo15135d().mo23065z(new mf6(I, str));
            I.mo23886L((String) null, "_id", str, true, j);
            return;
        }
        I.f11205a.mo15136e().mo12731w().mo25379a("User ID must be non-empty or null");
    }

    public void setUserProperty(@mr2 String str, @mr2 String str2, @mr2 tn1 tn1, boolean z, long j) throws RemoteException {
        mo10764a();
        this.f7589a.mo27866I().mo23886L(str, str2, nt2.m23165k8(tn1), z, j);
    }

    public void unregisterOnMeasurementEventListener(bu5 bu5) throws RemoteException {
        xe6 xe6;
        mo10764a();
        synchronized (this.f7590a) {
            xe6 = (xe6) this.f7590a.remove(Integer.valueOf(bu5.mo13821o()));
        }
        if (xe6 == null) {
            xe6 = new cx6(this, bu5);
        }
        this.f7589a.mo27866I().mo23888N(xe6);
    }
}
