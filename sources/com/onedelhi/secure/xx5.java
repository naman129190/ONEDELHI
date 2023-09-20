package com.onedelhi.secure;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import java.util.List;

public final class xx5 extends GmsClient {

    /* renamed from: n */
    public static final /* synthetic */ int f22799n = 0;

    /* renamed from: a */
    public final ty3 f22800a = new ty3();

    /* renamed from: b */
    public final ty3 f22801b = new ty3();

    /* renamed from: c */
    public final ty3 f22802c = new ty3();

    public xx5(Context context, Looper looper, ClientSettings clientSettings, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 23, clientSettings, connectionCallbacks, onConnectionFailedListener);
    }

    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return queryLocalInterface instanceof tv6 ? (tv6) queryLocalInterface : new du6(iBinder);
    }

    /* renamed from: d */
    public final void mo27124d(boolean z, x94 x94) throws RemoteException {
        if (mo27128h(xr6.f22724g)) {
            ((tv6) getService()).mo14882l2(z, new mu5(this, (Object) null, x94));
            return;
        }
        ((tv6) getService()).mo14872N0(z);
        x94.mo26837c(null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005a, code lost:
        return;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo27125e(com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey r10, boolean r11, com.onedelhi.secure.x94 r12) throws android.os.RemoteException {
        /*
            r9 = this;
            com.onedelhi.secure.ty3 r0 = r9.f22801b
            monitor-enter(r0)
            com.onedelhi.secure.ty3 r1 = r9.f22801b     // Catch:{ all -> 0x005b }
            java.lang.Object r10 = r1.remove(r10)     // Catch:{ all -> 0x005b }
            r5 = r10
            com.onedelhi.secure.ew5 r5 = (com.onedelhi.secure.ew5) r5     // Catch:{ all -> 0x005b }
            if (r5 != 0) goto L_0x0015
            java.lang.Boolean r10 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x005b }
            r12.mo26837c(r10)     // Catch:{ all -> 0x005b }
            monitor-exit(r0)     // Catch:{ all -> 0x005b }
            return
        L_0x0015:
            r5.mo15621n4()     // Catch:{ all -> 0x005b }
            if (r11 == 0) goto L_0x0054
            com.google.android.gms.common.Feature r10 = com.onedelhi.secure.xr6.f22727j     // Catch:{ all -> 0x005b }
            boolean r10 = r9.mo27128h(r10)     // Catch:{ all -> 0x005b }
            if (r10 == 0) goto L_0x0038
            android.os.IInterface r10 = r9.getService()     // Catch:{ all -> 0x005b }
            com.onedelhi.secure.tv6 r10 = (com.onedelhi.secure.tv6) r10     // Catch:{ all -> 0x005b }
            r11 = 0
            com.onedelhi.secure.by5 r11 = com.onedelhi.secure.by5.m12147L2(r11, r5, r11, r11)     // Catch:{ all -> 0x005b }
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x005b }
            com.onedelhi.secure.mu5 r2 = new com.onedelhi.secure.mu5     // Catch:{ all -> 0x005b }
            r2.<init>(r9, r1, r12)     // Catch:{ all -> 0x005b }
            r10.mo14883l5(r11, r2)     // Catch:{ all -> 0x005b }
            goto L_0x0059
        L_0x0038:
            android.os.IInterface r10 = r9.getService()     // Catch:{ all -> 0x005b }
            com.onedelhi.secure.tv6 r10 = (com.onedelhi.secure.tv6) r10     // Catch:{ all -> 0x005b }
            java.lang.Boolean r11 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x005b }
            com.onedelhi.secure.uu5 r7 = new com.onedelhi.secure.uu5     // Catch:{ all -> 0x005b }
            r7.<init>(r11, r12)     // Catch:{ all -> 0x005b }
            com.onedelhi.secure.ry5 r11 = new com.onedelhi.secure.ry5     // Catch:{ all -> 0x005b }
            r2 = 2
            r3 = 0
            r4 = 0
            r6 = 0
            r8 = 0
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x005b }
            r10.mo14879h6(r11)     // Catch:{ all -> 0x005b }
            goto L_0x0059
        L_0x0054:
            java.lang.Boolean r10 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x005b }
            r12.mo26837c(r10)     // Catch:{ all -> 0x005b }
        L_0x0059:
            monitor-exit(r0)     // Catch:{ all -> 0x005b }
            return
        L_0x005b:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005b }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.xx5.mo27125e(com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey, boolean, com.onedelhi.secure.x94):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005a, code lost:
        return;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo27126f(com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey r10, boolean r11, com.onedelhi.secure.x94 r12) throws android.os.RemoteException {
        /*
            r9 = this;
            com.onedelhi.secure.ty3 r0 = r9.f22800a
            monitor-enter(r0)
            com.onedelhi.secure.ty3 r1 = r9.f22800a     // Catch:{ all -> 0x005b }
            java.lang.Object r10 = r1.remove(r10)     // Catch:{ all -> 0x005b }
            r4 = r10
            com.onedelhi.secure.qw5 r4 = (com.onedelhi.secure.qw5) r4     // Catch:{ all -> 0x005b }
            if (r4 != 0) goto L_0x0015
            java.lang.Boolean r10 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x005b }
            r12.mo26837c(r10)     // Catch:{ all -> 0x005b }
            monitor-exit(r0)     // Catch:{ all -> 0x005b }
            return
        L_0x0015:
            r4.mo23469q3()     // Catch:{ all -> 0x005b }
            if (r11 == 0) goto L_0x0054
            com.google.android.gms.common.Feature r10 = com.onedelhi.secure.xr6.f22727j     // Catch:{ all -> 0x005b }
            boolean r10 = r9.mo27128h(r10)     // Catch:{ all -> 0x005b }
            if (r10 == 0) goto L_0x0038
            android.os.IInterface r10 = r9.getService()     // Catch:{ all -> 0x005b }
            com.onedelhi.secure.tv6 r10 = (com.onedelhi.secure.tv6) r10     // Catch:{ all -> 0x005b }
            r11 = 0
            com.onedelhi.secure.by5 r11 = com.onedelhi.secure.by5.m12148M2(r11, r4, r11, r11)     // Catch:{ all -> 0x005b }
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x005b }
            com.onedelhi.secure.mu5 r2 = new com.onedelhi.secure.mu5     // Catch:{ all -> 0x005b }
            r2.<init>(r9, r1, r12)     // Catch:{ all -> 0x005b }
            r10.mo14883l5(r11, r2)     // Catch:{ all -> 0x005b }
            goto L_0x0059
        L_0x0038:
            android.os.IInterface r10 = r9.getService()     // Catch:{ all -> 0x005b }
            com.onedelhi.secure.tv6 r10 = (com.onedelhi.secure.tv6) r10     // Catch:{ all -> 0x005b }
            java.lang.Boolean r11 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x005b }
            com.onedelhi.secure.uu5 r7 = new com.onedelhi.secure.uu5     // Catch:{ all -> 0x005b }
            r7.<init>(r11, r12)     // Catch:{ all -> 0x005b }
            com.onedelhi.secure.ry5 r11 = new com.onedelhi.secure.ry5     // Catch:{ all -> 0x005b }
            r2 = 2
            r3 = 0
            r5 = 0
            r6 = 0
            r8 = 0
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x005b }
            r10.mo14879h6(r11)     // Catch:{ all -> 0x005b }
            goto L_0x0059
        L_0x0054:
            java.lang.Boolean r10 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x005b }
            r12.mo26837c(r10)     // Catch:{ all -> 0x005b }
        L_0x0059:
            monitor-exit(r0)     // Catch:{ all -> 0x005b }
            return
        L_0x005b:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005b }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.xx5.mo27126f(com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey, boolean, com.onedelhi.secure.x94):void");
    }

    /* renamed from: g */
    public final void mo27127g(PendingIntent pendingIntent, x94 x94, Object obj) throws RemoteException {
        if (mo27128h(xr6.f22727j)) {
            ((tv6) getService()).mo14883l5(by5.m12146K2(pendingIntent, (String) null, (String) null), new mu5(this, (Object) null, x94));
            return;
        }
        ((tv6) getService()).mo14879h6(new ry5(2, (jy5) null, (IBinder) null, (IBinder) null, pendingIntent, new uu5((Object) null, x94), (String) null));
    }

    public final Feature[] getApiFeatures() {
        return xr6.f22718a;
    }

    public final int getMinApkVersion() {
        return 11717000;
    }

    public final String getServiceDescriptor() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    public final String getStartServiceAction() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    /* renamed from: h */
    public final boolean mo27128h(Feature feature) {
        Feature feature2;
        Feature[] availableFeatures = getAvailableFeatures();
        if (availableFeatures == null) {
            return false;
        }
        int length = availableFeatures.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                feature2 = null;
                break;
            }
            feature2 = availableFeatures[i];
            if (feature.getName().equals(feature2.getName())) {
                break;
            }
            i++;
        }
        return feature2 != null && feature2.getVersion() >= feature.getVersion();
    }

    /* renamed from: i */
    public final LocationAvailability mo27129i() throws RemoteException {
        return ((tv6) getService()).mo14868F4(getContext().getPackageName());
    }

    /* renamed from: j */
    public final void mo27130j(xf1 xf1, PendingIntent pendingIntent, x94 x94) throws RemoteException {
        Preconditions.checkNotNull(xf1, "geofencingRequest can't be null.");
        Preconditions.checkNotNull(pendingIntent, "PendingIntent must be specified.");
        ((tv6) getService()).mo14869I1(xf1, pendingIntent, new au5(x94));
    }

    /* renamed from: k */
    public final void mo27131k(x94 x94) throws RemoteException {
        ((tv6) getService()).mo14873P1(new uu5((Object) null, x94));
    }

    /* renamed from: l */
    public final void mo27132l(ub0 ub0, C3452ru ruVar, x94 x94) throws RemoteException {
        getContext();
        if (mo27128h(xr6.f22722e)) {
            ICancelToken C2 = ((tv6) getService()).mo14863C2(ub0, new qu5(this, x94));
            if (ruVar != null) {
                ruVar.mo23252b(new ot5(C2));
                return;
            }
            return;
        }
        ListenerHolder createListenerHolder = ListenerHolders.createListenerHolder(new eu5(this, x94), l16.m20174a(), "GetCurrentLocation");
        ListenerHolder.ListenerKey listenerKey = createListenerHolder.getListenerKey();
        listenerKey.getClass();
        iu5 iu5 = new iu5(this, createListenerHolder, x94);
        x94 x942 = new x94();
        LocationRequest.C1436a aVar = new LocationRequest.C1436a(ub0.mo25544N2(), 0);
        aVar.mo10556i(0);
        aVar.mo10549b(ub0.mo25541K2());
        aVar.mo10550c(ub0.mo25542L2());
        aVar.mo10552e(ub0.mo25543M2());
        aVar.mo10559l(ub0.mo25548R2());
        aVar.mo10561n(ub0.zza());
        aVar.mo10558k(true);
        aVar.mo10560m(ub0.mo25547Q2());
        aVar.mo10562o(ub0.mo25545O2());
        mo27134n(iu5, aVar.mo10548a(), x942);
        x942.mo26835a().mo17573e(new st5(x94));
        if (ruVar != null) {
            ruVar.mo23252b(new wt5(this, listenerKey));
        }
    }

    /* renamed from: m */
    public final void mo27133m(f12 f12, x94 x94) throws RemoteException {
        getContext();
        if (mo27128h(xr6.f22723f)) {
            ((tv6) getService()).mo14864C6(f12, new qu5(this, x94));
        } else {
            x94.mo26837c(((tv6) getService()).mo14866E2());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0057  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo27134n(com.onedelhi.secure.ov5 r18, com.google.android.gms.location.LocationRequest r19, com.onedelhi.secure.x94 r20) throws android.os.RemoteException {
        /*
            r17 = this;
            r1 = r17
            r0 = r19
            r2 = r20
            com.google.android.gms.common.api.internal.ListenerHolder r3 = r18.mo17373c()
            com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey r4 = r3.getListenerKey()
            r4.getClass()
            com.google.android.gms.common.Feature r5 = com.onedelhi.secure.xr6.f22727j
            boolean r5 = r1.mo27128h(r5)
            com.onedelhi.secure.ty3 r6 = r1.f22801b
            monitor-enter(r6)
            com.onedelhi.secure.ty3 r7 = r1.f22801b     // Catch:{ all -> 0x0082 }
            java.lang.Object r7 = r7.get(r4)     // Catch:{ all -> 0x0082 }
            com.onedelhi.secure.ew5 r7 = (com.onedelhi.secure.ew5) r7     // Catch:{ all -> 0x0082 }
            r8 = 0
            if (r7 == 0) goto L_0x002e
            if (r5 == 0) goto L_0x0028
            goto L_0x002e
        L_0x0028:
            r7.mo15620m8(r3)     // Catch:{ all -> 0x0082 }
            r13 = r7
            r7 = r8
            goto L_0x003b
        L_0x002e:
            com.onedelhi.secure.ew5 r3 = new com.onedelhi.secure.ew5     // Catch:{ all -> 0x0082 }
            r9 = r18
            r3.<init>(r9)     // Catch:{ all -> 0x0082 }
            com.onedelhi.secure.ty3 r9 = r1.f22801b     // Catch:{ all -> 0x0082 }
            r9.put(r4, r3)     // Catch:{ all -> 0x0082 }
            r13 = r3
        L_0x003b:
            r17.getContext()     // Catch:{ all -> 0x0082 }
            java.lang.String r3 = r4.toIdString()     // Catch:{ all -> 0x0082 }
            if (r5 == 0) goto L_0x0057
            android.os.IInterface r4 = r17.getService()     // Catch:{ all -> 0x0082 }
            com.onedelhi.secure.tv6 r4 = (com.onedelhi.secure.tv6) r4     // Catch:{ all -> 0x0082 }
            com.onedelhi.secure.by5 r3 = com.onedelhi.secure.by5.m12147L2(r7, r13, r8, r3)     // Catch:{ all -> 0x0082 }
            com.onedelhi.secure.mu5 r5 = new com.onedelhi.secure.mu5     // Catch:{ all -> 0x0082 }
            r5.<init>(r1, r8, r2)     // Catch:{ all -> 0x0082 }
            r4.mo14870I3(r3, r0, r5)     // Catch:{ all -> 0x0082 }
            goto L_0x0080
        L_0x0057:
            android.os.IInterface r4 = r17.getService()     // Catch:{ all -> 0x0082 }
            com.onedelhi.secure.tv6 r4 = (com.onedelhi.secure.tv6) r4     // Catch:{ all -> 0x0082 }
            com.google.android.gms.location.LocationRequest$a r5 = new com.google.android.gms.location.LocationRequest$a     // Catch:{ all -> 0x0082 }
            r5.<init>((com.google.android.gms.location.LocationRequest) r0)     // Catch:{ all -> 0x0082 }
            r5.mo10560m(r8)     // Catch:{ all -> 0x0082 }
            com.google.android.gms.location.LocationRequest r0 = r5.mo10548a()     // Catch:{ all -> 0x0082 }
            com.onedelhi.secure.jy5 r11 = com.onedelhi.secure.jy5.m19334K2(r8, r0)     // Catch:{ all -> 0x0082 }
            com.onedelhi.secure.cv5 r15 = new com.onedelhi.secure.cv5     // Catch:{ all -> 0x0082 }
            r15.<init>(r2, r13)     // Catch:{ all -> 0x0082 }
            com.onedelhi.secure.ry5 r0 = new com.onedelhi.secure.ry5     // Catch:{ all -> 0x0082 }
            r10 = 1
            r12 = 0
            r14 = 0
            r9 = r0
            r16 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x0082 }
            r4.mo14879h6(r0)     // Catch:{ all -> 0x0082 }
        L_0x0080:
            monitor-exit(r6)     // Catch:{ all -> 0x0082 }
            return
        L_0x0082:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0082 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.xx5.mo27134n(com.onedelhi.secure.ov5, com.google.android.gms.location.LocationRequest, com.onedelhi.secure.x94):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0057  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo27135o(com.onedelhi.secure.ov5 r18, com.google.android.gms.location.LocationRequest r19, com.onedelhi.secure.x94 r20) throws android.os.RemoteException {
        /*
            r17 = this;
            r1 = r17
            r0 = r19
            r2 = r20
            com.google.android.gms.common.api.internal.ListenerHolder r3 = r18.mo17373c()
            com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey r4 = r3.getListenerKey()
            r4.getClass()
            com.google.android.gms.common.Feature r5 = com.onedelhi.secure.xr6.f22727j
            boolean r5 = r1.mo27128h(r5)
            com.onedelhi.secure.ty3 r6 = r1.f22800a
            monitor-enter(r6)
            com.onedelhi.secure.ty3 r7 = r1.f22800a     // Catch:{ all -> 0x0082 }
            java.lang.Object r7 = r7.get(r4)     // Catch:{ all -> 0x0082 }
            com.onedelhi.secure.qw5 r7 = (com.onedelhi.secure.qw5) r7     // Catch:{ all -> 0x0082 }
            r8 = 0
            if (r7 == 0) goto L_0x002e
            if (r5 == 0) goto L_0x0028
            goto L_0x002e
        L_0x0028:
            r7.mo23468m8(r3)     // Catch:{ all -> 0x0082 }
            r12 = r7
            r7 = r8
            goto L_0x003b
        L_0x002e:
            com.onedelhi.secure.qw5 r3 = new com.onedelhi.secure.qw5     // Catch:{ all -> 0x0082 }
            r9 = r18
            r3.<init>(r9)     // Catch:{ all -> 0x0082 }
            com.onedelhi.secure.ty3 r9 = r1.f22800a     // Catch:{ all -> 0x0082 }
            r9.put(r4, r3)     // Catch:{ all -> 0x0082 }
            r12 = r3
        L_0x003b:
            r17.getContext()     // Catch:{ all -> 0x0082 }
            java.lang.String r3 = r4.toIdString()     // Catch:{ all -> 0x0082 }
            if (r5 == 0) goto L_0x0057
            android.os.IInterface r4 = r17.getService()     // Catch:{ all -> 0x0082 }
            com.onedelhi.secure.tv6 r4 = (com.onedelhi.secure.tv6) r4     // Catch:{ all -> 0x0082 }
            com.onedelhi.secure.by5 r3 = com.onedelhi.secure.by5.m12148M2(r7, r12, r8, r3)     // Catch:{ all -> 0x0082 }
            com.onedelhi.secure.mu5 r5 = new com.onedelhi.secure.mu5     // Catch:{ all -> 0x0082 }
            r5.<init>(r1, r8, r2)     // Catch:{ all -> 0x0082 }
            r4.mo14870I3(r3, r0, r5)     // Catch:{ all -> 0x0082 }
            goto L_0x0080
        L_0x0057:
            android.os.IInterface r4 = r17.getService()     // Catch:{ all -> 0x0082 }
            com.onedelhi.secure.tv6 r4 = (com.onedelhi.secure.tv6) r4     // Catch:{ all -> 0x0082 }
            com.google.android.gms.location.LocationRequest$a r5 = new com.google.android.gms.location.LocationRequest$a     // Catch:{ all -> 0x0082 }
            r5.<init>((com.google.android.gms.location.LocationRequest) r0)     // Catch:{ all -> 0x0082 }
            r5.mo10560m(r8)     // Catch:{ all -> 0x0082 }
            com.google.android.gms.location.LocationRequest r0 = r5.mo10548a()     // Catch:{ all -> 0x0082 }
            com.onedelhi.secure.jy5 r11 = com.onedelhi.secure.jy5.m19334K2(r8, r0)     // Catch:{ all -> 0x0082 }
            com.onedelhi.secure.yu5 r15 = new com.onedelhi.secure.yu5     // Catch:{ all -> 0x0082 }
            r15.<init>(r2, r12)     // Catch:{ all -> 0x0082 }
            com.onedelhi.secure.ry5 r0 = new com.onedelhi.secure.ry5     // Catch:{ all -> 0x0082 }
            r10 = 1
            r13 = 0
            r14 = 0
            r9 = r0
            r16 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x0082 }
            r4.mo14879h6(r0)     // Catch:{ all -> 0x0082 }
        L_0x0080:
            monitor-exit(r6)     // Catch:{ all -> 0x0082 }
            return
        L_0x0082:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0082 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.xx5.mo27135o(com.onedelhi.secure.ov5, com.google.android.gms.location.LocationRequest, com.onedelhi.secure.x94):void");
    }

    public final void onConnectionSuspended(int i) {
        super.onConnectionSuspended(i);
        synchronized (this.f22800a) {
            this.f22800a.clear();
        }
        synchronized (this.f22801b) {
            this.f22801b.clear();
        }
        synchronized (this.f22802c) {
            this.f22802c.clear();
        }
    }

    /* renamed from: p */
    public final void mo27136p(PendingIntent pendingIntent, LocationRequest locationRequest, x94 x94) throws RemoteException {
        getContext();
        if (mo27128h(xr6.f22727j)) {
            ((tv6) getService()).mo14870I3(by5.m12146K2(pendingIntent, (String) null, (String) null), locationRequest, new mu5(this, (Object) null, x94));
            return;
        }
        LocationRequest.C1436a aVar = new LocationRequest.C1436a(locationRequest);
        aVar.mo10560m((String) null);
        jy5 K2 = jy5.m19334K2((String) null, aVar.mo10548a());
        uu5 uu5 = new uu5((Object) null, x94);
        int hashCode = pendingIntent.hashCode();
        ((tv6) getService()).mo14879h6(new ry5(1, K2, (IBinder) null, (IBinder) null, pendingIntent, uu5, "PendingIntent@" + hashCode));
    }

    /* renamed from: q */
    public final void mo27137q(PendingIntent pendingIntent, x94 x94) throws RemoteException {
        Preconditions.checkNotNull(pendingIntent, "PendingIntent must be specified.");
        ((tv6) getService()).mo14865D5(pendingIntent, new au5(x94), getContext().getPackageName());
    }

    /* renamed from: r */
    public final void mo27138r(List list, x94 x94) throws RemoteException {
        Preconditions.checkArgument(list != null && !list.isEmpty(), "geofenceRequestIds can't be null nor empty.");
        ((tv6) getService()).mo14871L3((String[]) list.toArray(new String[0]), new au5(x94), getContext().getPackageName());
    }

    /* renamed from: s */
    public final void mo27139s(Location location, x94 x94) throws RemoteException {
        if (mo27128h(xr6.f22725h)) {
            ((tv6) getService()).mo14878h3(location, new mu5(this, (Object) null, x94));
            return;
        }
        ((tv6) getService()).mo14881i3(location);
        x94.mo26837c(null);
    }

    public final boolean usesClientTelemetry() {
        return true;
    }
}
