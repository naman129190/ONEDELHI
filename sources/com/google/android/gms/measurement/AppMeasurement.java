package com.google.android.gms.measurement;

import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.VisibleForTesting;
import com.onedelhi.secure.C1767b9;
import com.onedelhi.secure.dj6;
import com.onedelhi.secure.ix5;
import com.onedelhi.secure.ja5;
import com.onedelhi.secure.ly4;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.nd6;
import com.onedelhi.secure.nl5;
import com.onedelhi.secure.qz3;
import com.onedelhi.secure.ti6;
import com.onedelhi.secure.ue6;
import com.onedelhi.secure.xe6;
import com.onedelhi.secure.za6;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@ShowFirstParty
@KeepForSdk
@Deprecated
public class AppMeasurement {

    /* renamed from: a */
    public static volatile AppMeasurement f7581a = null;
    @ShowFirstParty
    @mr2
    @KeepForSdk

    /* renamed from: a */
    public static final String f7582a = "crash";
    @ShowFirstParty
    @mr2
    @KeepForSdk

    /* renamed from: b */
    public static final String f7583b = "fcm";
    @ShowFirstParty
    @mr2
    @KeepForSdk

    /* renamed from: c */
    public static final String f7584c = "fiam";

    /* renamed from: a */
    public final ix5 f7585a;

    @ShowFirstParty
    @KeepForSdk
    public static class ConditionalUserProperty {
        @ShowFirstParty
        @KeepForSdk
        @Keep
        public boolean mActive;
        @ShowFirstParty
        @mr2
        @Keep
        @KeepForSdk
        public String mAppId;
        @ShowFirstParty
        @KeepForSdk
        @Keep
        public long mCreationTimestamp;
        @mr2
        @Keep
        public String mExpiredEventName;
        @mr2
        @Keep
        public Bundle mExpiredEventParams;
        @ShowFirstParty
        @mr2
        @Keep
        @KeepForSdk
        public String mName;
        @ShowFirstParty
        @mr2
        @Keep
        @KeepForSdk
        public String mOrigin;
        @ShowFirstParty
        @KeepForSdk
        @Keep
        public long mTimeToLive;
        @mr2
        @Keep
        public String mTimedOutEventName;
        @mr2
        @Keep
        public Bundle mTimedOutEventParams;
        @ShowFirstParty
        @mr2
        @Keep
        @KeepForSdk
        public String mTriggerEventName;
        @ShowFirstParty
        @KeepForSdk
        @Keep
        public long mTriggerTimeout;
        @mr2
        @Keep
        public String mTriggeredEventName;
        @mr2
        @Keep
        public Bundle mTriggeredEventParams;
        @ShowFirstParty
        @KeepForSdk
        @Keep
        public long mTriggeredTimestamp;
        @ShowFirstParty
        @mr2
        @Keep
        @KeepForSdk
        public Object mValue;

        @KeepForSdk
        public ConditionalUserProperty() {
        }

        @VisibleForTesting
        public ConditionalUserProperty(@mr2 Bundle bundle) {
            Class<Long> cls = Long.class;
            Class<String> cls2 = String.class;
            Preconditions.checkNotNull(bundle);
            this.mAppId = (String) nd6.m22703a(bundle, "app_id", cls2, (Object) null);
            this.mOrigin = (String) nd6.m22703a(bundle, "origin", cls2, (Object) null);
            this.mName = (String) nd6.m22703a(bundle, "name", cls2, (Object) null);
            this.mValue = nd6.m22703a(bundle, "value", Object.class, (Object) null);
            this.mTriggerEventName = (String) nd6.m22703a(bundle, C1767b9.C1768a.f9755d, cls2, (Object) null);
            this.mTriggerTimeout = ((Long) nd6.m22703a(bundle, C1767b9.C1768a.f9756e, cls, 0L)).longValue();
            this.mTimedOutEventName = (String) nd6.m22703a(bundle, C1767b9.C1768a.f9757f, cls2, (Object) null);
            this.mTimedOutEventParams = (Bundle) nd6.m22703a(bundle, C1767b9.C1768a.f9758g, Bundle.class, (Object) null);
            this.mTriggeredEventName = (String) nd6.m22703a(bundle, C1767b9.C1768a.f9759h, cls2, (Object) null);
            this.mTriggeredEventParams = (Bundle) nd6.m22703a(bundle, C1767b9.C1768a.f9760i, Bundle.class, (Object) null);
            this.mTimeToLive = ((Long) nd6.m22703a(bundle, C1767b9.C1768a.f9761j, cls, 0L)).longValue();
            this.mExpiredEventName = (String) nd6.m22703a(bundle, C1767b9.C1768a.f9762k, cls2, (Object) null);
            this.mExpiredEventParams = (Bundle) nd6.m22703a(bundle, C1767b9.C1768a.f9763l, Bundle.class, (Object) null);
            this.mActive = ((Boolean) nd6.m22703a(bundle, C1767b9.C1768a.f9765n, Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((Long) nd6.m22703a(bundle, C1767b9.C1768a.f9764m, cls, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) nd6.m22703a(bundle, C1767b9.C1768a.f9766o, cls, 0L)).longValue();
        }

        @KeepForSdk
        public ConditionalUserProperty(@mr2 ConditionalUserProperty conditionalUserProperty) {
            Preconditions.checkNotNull(conditionalUserProperty);
            this.mAppId = conditionalUserProperty.mAppId;
            this.mOrigin = conditionalUserProperty.mOrigin;
            this.mCreationTimestamp = conditionalUserProperty.mCreationTimestamp;
            this.mName = conditionalUserProperty.mName;
            Object obj = conditionalUserProperty.mValue;
            if (obj != null) {
                Object a = dj6.m13167a(obj);
                this.mValue = a;
                if (a == null) {
                    this.mValue = conditionalUserProperty.mValue;
                }
            }
            this.mActive = conditionalUserProperty.mActive;
            this.mTriggerEventName = conditionalUserProperty.mTriggerEventName;
            this.mTriggerTimeout = conditionalUserProperty.mTriggerTimeout;
            this.mTimedOutEventName = conditionalUserProperty.mTimedOutEventName;
            Bundle bundle = conditionalUserProperty.mTimedOutEventParams;
            if (bundle != null) {
                this.mTimedOutEventParams = new Bundle(bundle);
            }
            this.mTriggeredEventName = conditionalUserProperty.mTriggeredEventName;
            Bundle bundle2 = conditionalUserProperty.mTriggeredEventParams;
            if (bundle2 != null) {
                this.mTriggeredEventParams = new Bundle(bundle2);
            }
            this.mTriggeredTimestamp = conditionalUserProperty.mTriggeredTimestamp;
            this.mTimeToLive = conditionalUserProperty.mTimeToLive;
            this.mExpiredEventName = conditionalUserProperty.mExpiredEventName;
            Bundle bundle3 = conditionalUserProperty.mExpiredEventParams;
            if (bundle3 != null) {
                this.mExpiredEventParams = new Bundle(bundle3);
            }
        }
    }

    @ShowFirstParty
    @KeepForSdk
    /* renamed from: com.google.android.gms.measurement.AppMeasurement$a */
    public interface C1446a extends ue6 {
        @ShowFirstParty
        @KeepForSdk
        @ly4
        /* renamed from: a */
        void mo10735a(@mr2 String str, @mr2 String str2, @mr2 Bundle bundle, long j);
    }

    @ShowFirstParty
    @KeepForSdk
    /* renamed from: com.google.android.gms.measurement.AppMeasurement$b */
    public interface C1447b extends xe6 {
        @ShowFirstParty
        @KeepForSdk
        @ly4
        /* renamed from: a */
        void mo10736a(@mr2 String str, @mr2 String str2, @mr2 Bundle bundle, long j);
    }

    public AppMeasurement(ti6 ti6) {
        this.f7585a = new nl5(ti6);
    }

    public AppMeasurement(za6 za6) {
        this.f7585a = new ja5(za6);
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    @com.google.android.gms.common.internal.ShowFirstParty
    @com.onedelhi.secure.mr2
    @androidx.annotation.Keep
    @com.onedelhi.secure.wj3(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.measurement.AppMeasurement getInstance(@com.onedelhi.secure.mr2 android.content.Context r14) {
        /*
            com.google.android.gms.measurement.AppMeasurement r0 = f7581a
            if (r0 != 0) goto L_0x0059
            java.lang.Class<com.google.android.gms.measurement.AppMeasurement> r0 = com.google.android.gms.measurement.AppMeasurement.class
            monitor-enter(r0)
            com.google.android.gms.measurement.AppMeasurement r1 = f7581a     // Catch:{ all -> 0x0056 }
            if (r1 != 0) goto L_0x0054
            r1 = 0
            java.lang.Class<com.google.firebase.analytics.FirebaseAnalytics> r2 = com.google.firebase.analytics.FirebaseAnalytics.class
            java.lang.String r3 = "getScionFrontendApiImplementation"
            r4 = 2
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{  }
            java.lang.Class<android.content.Context> r6 = android.content.Context.class
            r7 = 0
            r5[r7] = r6     // Catch:{  }
            java.lang.Class<android.os.Bundle> r6 = android.os.Bundle.class
            r8 = 1
            r5[r8] = r6     // Catch:{  }
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r5)     // Catch:{  }
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch:{  }
            r3[r7] = r14     // Catch:{  }
            r3[r8] = r1     // Catch:{  }
            java.lang.Object r2 = r2.invoke(r1, r3)     // Catch:{  }
            com.onedelhi.secure.ti6 r2 = (com.onedelhi.secure.ti6) r2     // Catch:{  }
            goto L_0x002f
        L_0x002e:
            r2 = r1
        L_0x002f:
            if (r2 == 0) goto L_0x0039
            com.google.android.gms.measurement.AppMeasurement r14 = new com.google.android.gms.measurement.AppMeasurement     // Catch:{ all -> 0x0056 }
            r14.<init>((com.onedelhi.secure.ti6) r2)     // Catch:{ all -> 0x0056 }
            f7581a = r14     // Catch:{ all -> 0x0056 }
            goto L_0x0054
        L_0x0039:
            com.onedelhi.secure.nu5 r13 = new com.onedelhi.secure.nu5     // Catch:{ all -> 0x0056 }
            r3 = 0
            r5 = 0
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r2 = r13
            r2.<init>(r3, r5, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0056 }
            com.onedelhi.secure.za6 r14 = com.onedelhi.secure.za6.m32969H(r14, r13, r1)     // Catch:{ all -> 0x0056 }
            com.google.android.gms.measurement.AppMeasurement r1 = new com.google.android.gms.measurement.AppMeasurement     // Catch:{ all -> 0x0056 }
            r1.<init>((com.onedelhi.secure.za6) r14)     // Catch:{ all -> 0x0056 }
            f7581a = r1     // Catch:{ all -> 0x0056 }
        L_0x0054:
            monitor-exit(r0)     // Catch:{ all -> 0x0056 }
            goto L_0x0059
        L_0x0056:
            r14 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0056 }
            throw r14
        L_0x0059:
            com.google.android.gms.measurement.AppMeasurement r14 = f7581a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.AppMeasurement.getInstance(android.content.Context):com.google.android.gms.measurement.AppMeasurement");
    }

    @mr2
    @KeepForSdk
    /* renamed from: a */
    public Boolean mo10712a() {
        return this.f7585a.mo17989q();
    }

    @mr2
    @KeepForSdk
    /* renamed from: b */
    public Double mo10713b() {
        return this.f7585a.mo17990r();
    }

    @Keep
    public void beginAdUnitExposure(@mr2 @qz3(min = 1) String str) {
        this.f7585a.mo18197k(str);
    }

    @mr2
    @KeepForSdk
    /* renamed from: c */
    public Integer mo10715c() {
        return this.f7585a.mo17991s();
    }

    @ShowFirstParty
    @KeepForSdk
    @Keep
    public void clearConditionalUserProperty(@mr2 @qz3(max = 24, min = 1) String str, @mr2 String str2, @mr2 Bundle bundle) {
        this.f7585a.mo18189c(str, str2, bundle);
    }

    @mr2
    @KeepForSdk
    /* renamed from: d */
    public Long mo10717d() {
        return this.f7585a.mo17992t();
    }

    @mr2
    @KeepForSdk
    /* renamed from: e */
    public String mo10718e() {
        return this.f7585a.mo17993u();
    }

    @Keep
    public void endAdUnitExposure(@mr2 @qz3(min = 1) String str) {
        this.f7585a.mo18192f(str);
    }

    @ShowFirstParty
    @mr2
    @ly4
    @KeepForSdk
    /* renamed from: f */
    public Map<String, Object> mo10720f(boolean z) {
        return this.f7585a.mo17994v(z);
    }

    @ShowFirstParty
    @KeepForSdk
    /* renamed from: g */
    public void mo10721g(@mr2 String str, @mr2 String str2, @mr2 Bundle bundle, long j) {
        this.f7585a.mo18195i(str, str2, bundle, j);
    }

    @Keep
    public long generateEventId() {
        return this.f7585a.mo18187a();
    }

    @mr2
    @Keep
    public String getAppInstanceId() {
        return this.f7585a.mo18193g();
    }

    @ShowFirstParty
    @mr2
    @Keep
    @ly4
    @KeepForSdk
    public List<ConditionalUserProperty> getConditionalUserProperties(@mr2 String str, @mr2 @qz3(max = 23, min = 1) String str2) {
        List<Bundle> o = this.f7585a.mo18201o(str, str2);
        ArrayList arrayList = new ArrayList(o == null ? 0 : o.size());
        for (Bundle conditionalUserProperty : o) {
            arrayList.add(new ConditionalUserProperty(conditionalUserProperty));
        }
        return arrayList;
    }

    @mr2
    @Keep
    public String getCurrentScreenClass() {
        return this.f7585a.mo18188b();
    }

    @mr2
    @Keep
    public String getCurrentScreenName() {
        return this.f7585a.mo18185A();
    }

    @mr2
    @Keep
    public String getGmpAppId() {
        return this.f7585a.mo18186D();
    }

    @ShowFirstParty
    @Keep
    @ly4
    @KeepForSdk
    public int getMaxUserProperties(@mr2 @qz3(min = 1) String str) {
        return this.f7585a.mo18196j(str);
    }

    @mr2
    @Keep
    @ly4
    @VisibleForTesting
    public Map<String, Object> getUserProperties(@mr2 String str, @mr2 @qz3(max = 24, min = 1) String str2, boolean z) {
        return this.f7585a.mo18202p(str, str2, z);
    }

    @ShowFirstParty
    @KeepForSdk
    /* renamed from: h */
    public void mo10730h(@mr2 C1447b bVar) {
        this.f7585a.mo18194h(bVar);
    }

    @ShowFirstParty
    @KeepForSdk
    @ly4
    /* renamed from: i */
    public void mo10731i(@mr2 C1446a aVar) {
        this.f7585a.mo18190d(aVar);
    }

    @ShowFirstParty
    @KeepForSdk
    /* renamed from: j */
    public void mo10732j(@mr2 C1447b bVar) {
        this.f7585a.mo18191e(bVar);
    }

    @ShowFirstParty
    @Keep
    public void logEventInternal(@mr2 String str, @mr2 String str2, @mr2 Bundle bundle) {
        this.f7585a.mo18199m(str, str2, bundle);
    }

    @ShowFirstParty
    @KeepForSdk
    @Keep
    public void setConditionalUserProperty(@mr2 ConditionalUserProperty conditionalUserProperty) {
        Preconditions.checkNotNull(conditionalUserProperty);
        ix5 ix5 = this.f7585a;
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            nd6.m22704b(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString(C1767b9.C1768a.f9755d, str4);
        }
        bundle.putLong(C1767b9.C1768a.f9756e, conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString(C1767b9.C1768a.f9757f, str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle(C1767b9.C1768a.f9758g, bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString(C1767b9.C1768a.f9759h, str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle(C1767b9.C1768a.f9760i, bundle3);
        }
        bundle.putLong(C1767b9.C1768a.f9761j, conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString(C1767b9.C1768a.f9762k, str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle(C1767b9.C1768a.f9763l, bundle4);
        }
        bundle.putLong(C1767b9.C1768a.f9764m, conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean(C1767b9.C1768a.f9765n, conditionalUserProperty.mActive);
        bundle.putLong(C1767b9.C1768a.f9766o, conditionalUserProperty.mTriggeredTimestamp);
        ix5.mo18200n(bundle);
    }
}
