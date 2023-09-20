package com.onedelhi.secure;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;

public final class ts5 extends yo5 implements dt5 {
    public ts5(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public final void beginAdUnitExposure(String str, long j) throws RemoteException {
        Parcel j8 = mo27654j8();
        j8.writeString(str);
        j8.writeLong(j);
        mo27656l8(23, j8);
    }

    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        Parcel j8 = mo27654j8();
        j8.writeString(str);
        j8.writeString(str2);
        ip5.m17766d(j8, bundle);
        mo27656l8(9, j8);
    }

    public final void clearMeasurementEnabled(long j) throws RemoteException {
        Parcel j8 = mo27654j8();
        j8.writeLong(j);
        mo27656l8(43, j8);
    }

    public final void endAdUnitExposure(String str, long j) throws RemoteException {
        Parcel j8 = mo27654j8();
        j8.writeString(str);
        j8.writeLong(j);
        mo27656l8(24, j8);
    }

    public final void generateEventId(pt5 pt5) throws RemoteException {
        Parcel j8 = mo27654j8();
        ip5.m17767e(j8, pt5);
        mo27656l8(22, j8);
    }

    public final void getAppInstanceId(pt5 pt5) throws RemoteException {
        Parcel j8 = mo27654j8();
        ip5.m17767e(j8, pt5);
        mo27656l8(20, j8);
    }

    public final void getCachedAppInstanceId(pt5 pt5) throws RemoteException {
        Parcel j8 = mo27654j8();
        ip5.m17767e(j8, pt5);
        mo27656l8(19, j8);
    }

    public final void getConditionalUserProperties(String str, String str2, pt5 pt5) throws RemoteException {
        Parcel j8 = mo27654j8();
        j8.writeString(str);
        j8.writeString(str2);
        ip5.m17767e(j8, pt5);
        mo27656l8(10, j8);
    }

    public final void getCurrentScreenClass(pt5 pt5) throws RemoteException {
        Parcel j8 = mo27654j8();
        ip5.m17767e(j8, pt5);
        mo27656l8(17, j8);
    }

    public final void getCurrentScreenName(pt5 pt5) throws RemoteException {
        Parcel j8 = mo27654j8();
        ip5.m17767e(j8, pt5);
        mo27656l8(16, j8);
    }

    public final void getGmpAppId(pt5 pt5) throws RemoteException {
        Parcel j8 = mo27654j8();
        ip5.m17767e(j8, pt5);
        mo27656l8(21, j8);
    }

    public final void getMaxUserProperties(String str, pt5 pt5) throws RemoteException {
        Parcel j8 = mo27654j8();
        j8.writeString(str);
        ip5.m17767e(j8, pt5);
        mo27656l8(6, j8);
    }

    public final void getSessionId(pt5 pt5) throws RemoteException {
        Parcel j8 = mo27654j8();
        ip5.m17767e(j8, pt5);
        mo27656l8(46, j8);
    }

    public final void getTestFlag(pt5 pt5, int i) throws RemoteException {
        Parcel j8 = mo27654j8();
        ip5.m17767e(j8, pt5);
        j8.writeInt(i);
        mo27656l8(38, j8);
    }

    public final void getUserProperties(String str, String str2, boolean z, pt5 pt5) throws RemoteException {
        Parcel j8 = mo27654j8();
        j8.writeString(str);
        j8.writeString(str2);
        int i = ip5.f13795a;
        j8.writeInt(z ? 1 : 0);
        ip5.m17767e(j8, pt5);
        mo27656l8(5, j8);
    }

    public final void initForTests(Map map) throws RemoteException {
        throw null;
    }

    public final void initialize(tn1 tn1, nu5 nu5, long j) throws RemoteException {
        Parcel j8 = mo27654j8();
        ip5.m17767e(j8, tn1);
        ip5.m17766d(j8, nu5);
        j8.writeLong(j);
        mo27656l8(1, j8);
    }

    public final void isDataCollectionEnabled(pt5 pt5) throws RemoteException {
        throw null;
    }

    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
        Parcel j8 = mo27654j8();
        j8.writeString(str);
        j8.writeString(str2);
        ip5.m17766d(j8, bundle);
        j8.writeInt(z ? 1 : 0);
        j8.writeInt(z2 ? 1 : 0);
        j8.writeLong(j);
        mo27656l8(2, j8);
    }

    public final void logEventAndBundle(String str, String str2, Bundle bundle, pt5 pt5, long j) throws RemoteException {
        throw null;
    }

    public final void logHealthData(int i, String str, tn1 tn1, tn1 tn12, tn1 tn13) throws RemoteException {
        Parcel j8 = mo27654j8();
        j8.writeInt(5);
        j8.writeString(str);
        ip5.m17767e(j8, tn1);
        ip5.m17767e(j8, tn12);
        ip5.m17767e(j8, tn13);
        mo27656l8(33, j8);
    }

    public final void onActivityCreated(tn1 tn1, Bundle bundle, long j) throws RemoteException {
        Parcel j8 = mo27654j8();
        ip5.m17767e(j8, tn1);
        ip5.m17766d(j8, bundle);
        j8.writeLong(j);
        mo27656l8(27, j8);
    }

    public final void onActivityDestroyed(tn1 tn1, long j) throws RemoteException {
        Parcel j8 = mo27654j8();
        ip5.m17767e(j8, tn1);
        j8.writeLong(j);
        mo27656l8(28, j8);
    }

    public final void onActivityPaused(tn1 tn1, long j) throws RemoteException {
        Parcel j8 = mo27654j8();
        ip5.m17767e(j8, tn1);
        j8.writeLong(j);
        mo27656l8(29, j8);
    }

    public final void onActivityResumed(tn1 tn1, long j) throws RemoteException {
        Parcel j8 = mo27654j8();
        ip5.m17767e(j8, tn1);
        j8.writeLong(j);
        mo27656l8(30, j8);
    }

    public final void onActivitySaveInstanceState(tn1 tn1, pt5 pt5, long j) throws RemoteException {
        Parcel j8 = mo27654j8();
        ip5.m17767e(j8, tn1);
        ip5.m17767e(j8, pt5);
        j8.writeLong(j);
        mo27656l8(31, j8);
    }

    public final void onActivityStarted(tn1 tn1, long j) throws RemoteException {
        Parcel j8 = mo27654j8();
        ip5.m17767e(j8, tn1);
        j8.writeLong(j);
        mo27656l8(25, j8);
    }

    public final void onActivityStopped(tn1 tn1, long j) throws RemoteException {
        Parcel j8 = mo27654j8();
        ip5.m17767e(j8, tn1);
        j8.writeLong(j);
        mo27656l8(26, j8);
    }

    public final void performAction(Bundle bundle, pt5 pt5, long j) throws RemoteException {
        Parcel j8 = mo27654j8();
        ip5.m17766d(j8, bundle);
        ip5.m17767e(j8, pt5);
        j8.writeLong(j);
        mo27656l8(32, j8);
    }

    public final void registerOnMeasurementEventListener(bu5 bu5) throws RemoteException {
        Parcel j8 = mo27654j8();
        ip5.m17767e(j8, bu5);
        mo27656l8(35, j8);
    }

    public final void resetAnalyticsData(long j) throws RemoteException {
        Parcel j8 = mo27654j8();
        j8.writeLong(j);
        mo27656l8(12, j8);
    }

    public final void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException {
        Parcel j8 = mo27654j8();
        ip5.m17766d(j8, bundle);
        j8.writeLong(j);
        mo27656l8(8, j8);
    }

    public final void setConsent(Bundle bundle, long j) throws RemoteException {
        Parcel j8 = mo27654j8();
        ip5.m17766d(j8, bundle);
        j8.writeLong(j);
        mo27656l8(44, j8);
    }

    public final void setConsentThirdParty(Bundle bundle, long j) throws RemoteException {
        Parcel j8 = mo27654j8();
        ip5.m17766d(j8, bundle);
        j8.writeLong(j);
        mo27656l8(45, j8);
    }

    public final void setCurrentScreen(tn1 tn1, String str, String str2, long j) throws RemoteException {
        Parcel j8 = mo27654j8();
        ip5.m17767e(j8, tn1);
        j8.writeString(str);
        j8.writeString(str2);
        j8.writeLong(j);
        mo27656l8(15, j8);
    }

    public final void setDataCollectionEnabled(boolean z) throws RemoteException {
        Parcel j8 = mo27654j8();
        int i = ip5.f13795a;
        j8.writeInt(z ? 1 : 0);
        mo27656l8(39, j8);
    }

    public final void setDefaultEventParameters(Bundle bundle) throws RemoteException {
        Parcel j8 = mo27654j8();
        ip5.m17766d(j8, bundle);
        mo27656l8(42, j8);
    }

    public final void setEventInterceptor(bu5 bu5) throws RemoteException {
        Parcel j8 = mo27654j8();
        ip5.m17767e(j8, bu5);
        mo27656l8(34, j8);
    }

    public final void setInstanceIdProvider(ju5 ju5) throws RemoteException {
        throw null;
    }

    public final void setMeasurementEnabled(boolean z, long j) throws RemoteException {
        Parcel j8 = mo27654j8();
        int i = ip5.f13795a;
        j8.writeInt(z ? 1 : 0);
        j8.writeLong(j);
        mo27656l8(11, j8);
    }

    public final void setMinimumSessionDuration(long j) throws RemoteException {
        throw null;
    }

    public final void setSessionTimeoutDuration(long j) throws RemoteException {
        Parcel j8 = mo27654j8();
        j8.writeLong(j);
        mo27656l8(14, j8);
    }

    public final void setUserId(String str, long j) throws RemoteException {
        Parcel j8 = mo27654j8();
        j8.writeString(str);
        j8.writeLong(j);
        mo27656l8(7, j8);
    }

    public final void setUserProperty(String str, String str2, tn1 tn1, boolean z, long j) throws RemoteException {
        Parcel j8 = mo27654j8();
        j8.writeString(str);
        j8.writeString(str2);
        ip5.m17767e(j8, tn1);
        j8.writeInt(z ? 1 : 0);
        j8.writeLong(j);
        mo27656l8(4, j8);
    }

    public final void unregisterOnMeasurementEventListener(bu5 bu5) throws RemoteException {
        Parcel j8 = mo27654j8();
        ip5.m17767e(j8, bu5);
        mo27656l8(36, j8);
    }
}
