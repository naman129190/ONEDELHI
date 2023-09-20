package com.onedelhi.secure;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Map;

public interface dt5 extends IInterface {
    void beginAdUnitExposure(String str, long j) throws RemoteException;

    void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException;

    void clearMeasurementEnabled(long j) throws RemoteException;

    void endAdUnitExposure(String str, long j) throws RemoteException;

    void generateEventId(pt5 pt5) throws RemoteException;

    void getAppInstanceId(pt5 pt5) throws RemoteException;

    void getCachedAppInstanceId(pt5 pt5) throws RemoteException;

    void getConditionalUserProperties(String str, String str2, pt5 pt5) throws RemoteException;

    void getCurrentScreenClass(pt5 pt5) throws RemoteException;

    void getCurrentScreenName(pt5 pt5) throws RemoteException;

    void getGmpAppId(pt5 pt5) throws RemoteException;

    void getMaxUserProperties(String str, pt5 pt5) throws RemoteException;

    void getSessionId(pt5 pt5) throws RemoteException;

    void getTestFlag(pt5 pt5, int i) throws RemoteException;

    void getUserProperties(String str, String str2, boolean z, pt5 pt5) throws RemoteException;

    void initForTests(Map map) throws RemoteException;

    void initialize(tn1 tn1, nu5 nu5, long j) throws RemoteException;

    void isDataCollectionEnabled(pt5 pt5) throws RemoteException;

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException;

    void logEventAndBundle(String str, String str2, Bundle bundle, pt5 pt5, long j) throws RemoteException;

    void logHealthData(int i, String str, tn1 tn1, tn1 tn12, tn1 tn13) throws RemoteException;

    void onActivityCreated(tn1 tn1, Bundle bundle, long j) throws RemoteException;

    void onActivityDestroyed(tn1 tn1, long j) throws RemoteException;

    void onActivityPaused(tn1 tn1, long j) throws RemoteException;

    void onActivityResumed(tn1 tn1, long j) throws RemoteException;

    void onActivitySaveInstanceState(tn1 tn1, pt5 pt5, long j) throws RemoteException;

    void onActivityStarted(tn1 tn1, long j) throws RemoteException;

    void onActivityStopped(tn1 tn1, long j) throws RemoteException;

    void performAction(Bundle bundle, pt5 pt5, long j) throws RemoteException;

    void registerOnMeasurementEventListener(bu5 bu5) throws RemoteException;

    void resetAnalyticsData(long j) throws RemoteException;

    void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException;

    void setConsent(Bundle bundle, long j) throws RemoteException;

    void setConsentThirdParty(Bundle bundle, long j) throws RemoteException;

    void setCurrentScreen(tn1 tn1, String str, String str2, long j) throws RemoteException;

    void setDataCollectionEnabled(boolean z) throws RemoteException;

    void setDefaultEventParameters(Bundle bundle) throws RemoteException;

    void setEventInterceptor(bu5 bu5) throws RemoteException;

    void setInstanceIdProvider(ju5 ju5) throws RemoteException;

    void setMeasurementEnabled(boolean z, long j) throws RemoteException;

    void setMinimumSessionDuration(long j) throws RemoteException;

    void setSessionTimeoutDuration(long j) throws RemoteException;

    void setUserId(String str, long j) throws RemoteException;

    void setUserProperty(String str, String str2, tn1 tn1, boolean z, long j) throws RemoteException;

    void unregisterOnMeasurementEventListener(bu5 bu5) throws RemoteException;
}
