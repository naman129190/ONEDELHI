package com.onedelhi.secure;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
public final class mm6 implements ServiceConnection, BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {

    /* renamed from: a */
    public volatile o46 f16256a;

    /* renamed from: a */
    public final /* synthetic */ om6 f16257a;

    /* renamed from: b */
    public volatile boolean f16258b;

    public mm6(om6 om6) {
        this.f16257a = om6;
    }

    @ly4
    /* renamed from: b */
    public final void mo20532b(Intent intent) {
        this.f16257a.mo15139h();
        Context f = this.f16257a.f11205a.mo15137f();
        ConnectionTracker instance = ConnectionTracker.getInstance();
        synchronized (this) {
            if (this.f16258b) {
                this.f16257a.f11205a.mo15136e().mo12730v().mo25379a("Connection attempt already in progress");
                return;
            }
            this.f16257a.f11205a.mo15136e().mo12730v().mo25379a("Using local app measurement service");
            this.f16258b = true;
            instance.bindService(f, intent, this.f16257a.f18020a, 129);
        }
    }

    @ly4
    /* renamed from: c */
    public final void mo20533c() {
        this.f16257a.mo15139h();
        Context f = this.f16257a.f11205a.mo15137f();
        synchronized (this) {
            if (this.f16258b) {
                this.f16257a.f11205a.mo15136e().mo12730v().mo25379a("Connection attempt already in progress");
            } else if (this.f16256a == null || (!this.f16256a.isConnecting() && !this.f16256a.isConnected())) {
                this.f16256a = new o46(f, Looper.getMainLooper(), this, this);
                this.f16257a.f11205a.mo15136e().mo12730v().mo25379a("Connecting to remote service");
                this.f16258b = true;
                Preconditions.checkNotNull(this.f16256a);
                this.f16256a.checkAvailabilityAndConnect();
            } else {
                this.f16257a.f11205a.mo15136e().mo12730v().mo25379a("Already awaiting connection attempt");
            }
        }
    }

    @ly4
    /* renamed from: d */
    public final void mo20534d() {
        if (this.f16256a != null && (this.f16256a.isConnected() || this.f16256a.isConnecting())) {
            this.f16256a.disconnect();
        }
        this.f16256a = null;
    }

    @bc2
    public final void onConnected(Bundle bundle) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                Preconditions.checkNotNull(this.f16256a);
                this.f16257a.f11205a.mo15135d().mo23065z(new gm6(this, (w36) this.f16256a.getService()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f16256a = null;
                this.f16258b = false;
            }
        }
    }

    @bc2
    public final void onConnectionFailed(@mr2 ConnectionResult connectionResult) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnectionFailed");
        a56 E = this.f16257a.f11205a.mo27863E();
        if (E != null) {
            E.mo12731w().mo25380b("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.f16258b = false;
            this.f16256a = null;
        }
        this.f16257a.f11205a.mo15135d().mo23065z(new km6(this));
    }

    @bc2
    public final void onConnectionSuspended(int i) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnectionSuspended");
        this.f16257a.f11205a.mo15136e().mo12725q().mo25379a("Service connection suspended");
        this.f16257a.f11205a.mo15135d().mo23065z(new im6(this));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r3.f16257a.f11205a.mo15136e().mo12726r().mo25379a("Service connect failed to get IMeasurementService");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0065 */
    @com.onedelhi.secure.bc2
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceConnected(android.content.ComponentName r4, android.os.IBinder r5) {
        /*
            r3 = this;
            java.lang.String r4 = "MeasurementServiceConnection.onServiceConnected"
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r4)
            monitor-enter(r3)
            r4 = 0
            if (r5 != 0) goto L_0x001e
            r3.f16258b = r4     // Catch:{ all -> 0x0063 }
            com.onedelhi.secure.om6 r4 = r3.f16257a     // Catch:{ all -> 0x0063 }
            com.onedelhi.secure.za6 r4 = r4.f11205a     // Catch:{ all -> 0x0063 }
            com.onedelhi.secure.a56 r4 = r4.mo15136e()     // Catch:{ all -> 0x0063 }
            com.onedelhi.secure.u46 r4 = r4.mo12726r()     // Catch:{ all -> 0x0063 }
            java.lang.String r5 = "Service connected with null binder"
            r4.mo25379a(r5)     // Catch:{ all -> 0x0063 }
            monitor-exit(r3)     // Catch:{ all -> 0x0063 }
            return
        L_0x001e:
            r0 = 0
            java.lang.String r1 = r5.getInterfaceDescriptor()     // Catch:{ RemoteException -> 0x0065 }
            java.lang.String r2 = "com.google.android.gms.measurement.internal.IMeasurementService"
            boolean r2 = r2.equals(r1)     // Catch:{ RemoteException -> 0x0065 }
            if (r2 == 0) goto L_0x0051
            java.lang.String r1 = "com.google.android.gms.measurement.internal.IMeasurementService"
            android.os.IInterface r1 = r5.queryLocalInterface(r1)     // Catch:{ RemoteException -> 0x0065 }
            boolean r2 = r1 instanceof com.onedelhi.secure.w36     // Catch:{ RemoteException -> 0x0065 }
            if (r2 == 0) goto L_0x0039
            com.onedelhi.secure.w36 r1 = (com.onedelhi.secure.w36) r1     // Catch:{ RemoteException -> 0x0065 }
        L_0x0037:
            r0 = r1
            goto L_0x003f
        L_0x0039:
            com.onedelhi.secure.q36 r1 = new com.onedelhi.secure.q36     // Catch:{ RemoteException -> 0x0065 }
            r1.<init>(r5)     // Catch:{ RemoteException -> 0x0065 }
            goto L_0x0037
        L_0x003f:
            com.onedelhi.secure.om6 r5 = r3.f16257a     // Catch:{ RemoteException -> 0x0065 }
            com.onedelhi.secure.za6 r5 = r5.f11205a     // Catch:{ RemoteException -> 0x0065 }
            com.onedelhi.secure.a56 r5 = r5.mo15136e()     // Catch:{ RemoteException -> 0x0065 }
            com.onedelhi.secure.u46 r5 = r5.mo12730v()     // Catch:{ RemoteException -> 0x0065 }
            java.lang.String r1 = "Bound to IMeasurementService interface"
            r5.mo25379a(r1)     // Catch:{ RemoteException -> 0x0065 }
            goto L_0x0076
        L_0x0051:
            com.onedelhi.secure.om6 r5 = r3.f16257a     // Catch:{ RemoteException -> 0x0065 }
            com.onedelhi.secure.za6 r5 = r5.f11205a     // Catch:{ RemoteException -> 0x0065 }
            com.onedelhi.secure.a56 r5 = r5.mo15136e()     // Catch:{ RemoteException -> 0x0065 }
            com.onedelhi.secure.u46 r5 = r5.mo12726r()     // Catch:{ RemoteException -> 0x0065 }
            java.lang.String r2 = "Got binder with a wrong descriptor"
            r5.mo25380b(r2, r1)     // Catch:{ RemoteException -> 0x0065 }
            goto L_0x0076
        L_0x0063:
            r4 = move-exception
            goto L_0x00a2
        L_0x0065:
            com.onedelhi.secure.om6 r5 = r3.f16257a     // Catch:{ all -> 0x0063 }
            com.onedelhi.secure.za6 r5 = r5.f11205a     // Catch:{ all -> 0x0063 }
            com.onedelhi.secure.a56 r5 = r5.mo15136e()     // Catch:{ all -> 0x0063 }
            com.onedelhi.secure.u46 r5 = r5.mo12726r()     // Catch:{ all -> 0x0063 }
            java.lang.String r1 = "Service connect failed to get IMeasurementService"
            r5.mo25379a(r1)     // Catch:{ all -> 0x0063 }
        L_0x0076:
            if (r0 != 0) goto L_0x0090
            r3.f16258b = r4     // Catch:{ all -> 0x0063 }
            com.google.android.gms.common.stats.ConnectionTracker r4 = com.google.android.gms.common.stats.ConnectionTracker.getInstance()     // Catch:{ IllegalArgumentException -> 0x00a0 }
            com.onedelhi.secure.om6 r5 = r3.f16257a     // Catch:{ IllegalArgumentException -> 0x00a0 }
            com.onedelhi.secure.za6 r5 = r5.f11205a     // Catch:{ IllegalArgumentException -> 0x00a0 }
            android.content.Context r5 = r5.mo15137f()     // Catch:{ IllegalArgumentException -> 0x00a0 }
            com.onedelhi.secure.om6 r0 = r3.f16257a     // Catch:{ IllegalArgumentException -> 0x00a0 }
            com.onedelhi.secure.mm6 r0 = r0.f18020a     // Catch:{ IllegalArgumentException -> 0x00a0 }
            r4.unbindService(r5, r0)     // Catch:{ IllegalArgumentException -> 0x00a0 }
            goto L_0x00a0
        L_0x0090:
            com.onedelhi.secure.om6 r4 = r3.f16257a     // Catch:{ all -> 0x0063 }
            com.onedelhi.secure.za6 r4 = r4.f11205a     // Catch:{ all -> 0x0063 }
            com.onedelhi.secure.qa6 r4 = r4.mo15135d()     // Catch:{ all -> 0x0063 }
            com.onedelhi.secure.cm6 r5 = new com.onedelhi.secure.cm6     // Catch:{ all -> 0x0063 }
            r5.<init>(r3, r0)     // Catch:{ all -> 0x0063 }
            r4.mo23065z(r5)     // Catch:{ all -> 0x0063 }
        L_0x00a0:
            monitor-exit(r3)     // Catch:{ all -> 0x0063 }
            return
        L_0x00a2:
            monitor-exit(r3)     // Catch:{ all -> 0x0063 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.mm6.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    @bc2
    public final void onServiceDisconnected(ComponentName componentName) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onServiceDisconnected");
        this.f16257a.f11205a.mo15136e().mo12725q().mo25379a("Service disconnected");
        this.f16257a.f11205a.mo15135d().mo23065z(new em6(this, componentName));
    }
}
