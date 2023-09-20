package com.google.firebase.perf.config;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.Keep;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.perf.config.C4337b;
import com.onedelhi.secure.C7012v5;
import com.onedelhi.secure.b73;
import com.onedelhi.secure.n61;
import com.onedelhi.secure.rk0;
import com.onedelhi.secure.rw2;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.u61;
import com.onedelhi.secure.uh3;
import com.onedelhi.secure.w31;
import com.onedelhi.secure.wh3;
import com.onedelhi.secure.xh3;
import com.onedelhi.secure.y24;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@Keep
public class RemoteConfigManager {
    private static final long FETCH_NEVER_HAPPENED_TIMESTAMP_MS = 0;
    private static final String FIREPERF_FRC_NAMESPACE_NAME = "fireperf";
    private static final long MIN_APP_START_CONFIG_FETCH_DELAY_MS = 5000;
    private static final int RANDOM_APP_START_CONFIG_FETCH_DELAY_MS = 25000;
    private static final long TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS = TimeUnit.HOURS.toMillis(12);
    private static final RemoteConfigManager instance = new RemoteConfigManager();
    private static final C7012v5 logger = C7012v5.m67717e();
    private final ConcurrentHashMap<String, u61> allRcConfigMap;
    private final long appStartConfigFetchDelayInMs;
    private final long appStartTimeInMs;
    private final rk0 cache;
    private final Executor executor;
    @ts2
    private n61 firebaseRemoteConfig;
    private long firebaseRemoteConfigLastFetchTimestampMs;
    @ts2
    private b73<uh3> firebaseRemoteConfigProvider;

    @SuppressLint({"ThreadPoolCreation"})
    private RemoteConfigManager() {
        this(rk0.m63697h(), new ThreadPoolExecutor(0, 1, 0, TimeUnit.SECONDS, new LinkedBlockingQueue()), (n61) null, MIN_APP_START_CONFIG_FETCH_DELAY_MS + ((long) new Random().nextInt(RANDOM_APP_START_CONFIG_FETCH_DELAY_MS)), getInitialStartupMillis());
    }

    @VisibleForTesting
    public RemoteConfigManager(rk0 rk0, Executor executor2, n61 n61, long j, long j2) {
        ConcurrentHashMap<String, u61> concurrentHashMap;
        this.firebaseRemoteConfigLastFetchTimestampMs = 0;
        this.cache = rk0;
        this.executor = executor2;
        this.firebaseRemoteConfig = n61;
        if (n61 != null) {
            concurrentHashMap = new ConcurrentHashMap<>(n61.mo40977p());
        }
        this.allRcConfigMap = concurrentHashMap;
        this.appStartTimeInMs = j2;
        this.appStartConfigFetchDelayInMs = j;
    }

    @VisibleForTesting
    public static long getInitialStartupMillis() {
        y24 y24 = (y24) w31.m68755p().mo46526l(y24.class);
        return y24 != null ? y24.mo39259c() : System.currentTimeMillis();
    }

    public static RemoteConfigManager getInstance() {
        return instance;
    }

    private u61 getRemoteConfigValue(String str) {
        triggerRemoteConfigFetchIfNecessary();
        if (!isFirebaseRemoteConfigAvailable() || !this.allRcConfigMap.containsKey(str)) {
            return null;
        }
        u61 u61 = this.allRcConfigMap.get(str);
        if (u61.mo45430c() != 2) {
            return null;
        }
        logger.mo46001b("Fetched value: '%s' for key: '%s' from Firebase Remote Config.", u61.mo45433f(), str);
        return u61;
    }

    @VisibleForTesting
    public static int getVersionCode(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    private boolean hasAppStartConfigFetchDelayElapsed(long j) {
        return j - this.appStartTimeInMs >= this.appStartConfigFetchDelayInMs;
    }

    private boolean hasLastFetchBecomeStale(long j) {
        return j - this.firebaseRemoteConfigLastFetchTimestampMs > TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS;
    }

    /* access modifiers changed from: private */
    /* renamed from: lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0 */
    public /* synthetic */ void m34905xc904e813(Boolean bool) {
        syncConfigValues(this.firebaseRemoteConfig.mo40977p());
    }

    /* access modifiers changed from: private */
    /* renamed from: lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1 */
    public /* synthetic */ void m34906xc904e814(Exception exc) {
        this.firebaseRemoteConfigLastFetchTimestampMs = 0;
    }

    private boolean shouldFetchAndActivateRemoteConfigValues() {
        long currentSystemTimeMillis = getCurrentSystemTimeMillis();
        return hasAppStartConfigFetchDelayElapsed(currentSystemTimeMillis) && hasLastFetchBecomeStale(currentSystemTimeMillis);
    }

    private void triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch() {
        this.firebaseRemoteConfigLastFetchTimestampMs = getCurrentSystemTimeMillis();
        this.firebaseRemoteConfig.mo40976o().mo17580l(this.executor, new xh3(this)).mo17577i(this.executor, new wh3(this));
    }

    private void triggerRemoteConfigFetchIfNecessary() {
        if (isFirebaseRemoteConfigAvailable()) {
            if (this.allRcConfigMap.isEmpty()) {
                this.allRcConfigMap.putAll(this.firebaseRemoteConfig.mo40977p());
            }
            if (shouldFetchAndActivateRemoteConfigValues()) {
                triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch();
            }
        }
    }

    public rw2<Boolean> getBoolean(String str) {
        if (str == null) {
            logger.mo46000a("The key to get Remote Config boolean value is null.");
            return rw2.m63941a();
        }
        u61 remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return rw2.m63943e(Boolean.valueOf(remoteConfigValue.mo45428a()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.mo45433f().isEmpty()) {
                    logger.mo46001b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.mo45433f(), str);
                }
            }
        }
        return rw2.m63941a();
    }

    @VisibleForTesting
    public long getCurrentSystemTimeMillis() {
        return System.currentTimeMillis();
    }

    public rw2<Float> getFloat(String str) {
        if (str == null) {
            logger.mo46000a("The key to get Remote Config float value is null.");
            return rw2.m63941a();
        }
        u61 remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return rw2.m63943e(Float.valueOf(Double.valueOf(remoteConfigValue.mo45429b()).floatValue()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.mo45433f().isEmpty()) {
                    logger.mo46001b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.mo45433f(), str);
                }
            }
        }
        return rw2.m63941a();
    }

    public rw2<Long> getLong(String str) {
        if (str == null) {
            logger.mo46000a("The key to get Remote Config long value is null.");
            return rw2.m63941a();
        }
        u61 remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return rw2.m63943e(Long.valueOf(remoteConfigValue.mo45431d()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.mo45433f().isEmpty()) {
                    logger.mo46001b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.mo45433f(), str);
                }
            }
        }
        return rw2.m63941a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> T getRemoteConfigValueOrDefault(java.lang.String r8, T r9) {
        /*
            r7 = this;
            com.onedelhi.secure.u61 r0 = r7.getRemoteConfigValue(r8)
            if (r0 == 0) goto L_0x0076
            r1 = 1
            r2 = 0
            boolean r3 = r9 instanceof java.lang.Boolean     // Catch:{ IllegalArgumentException -> 0x0059 }
            if (r3 == 0) goto L_0x0016
            boolean r3 = r0.mo45428a()     // Catch:{ IllegalArgumentException -> 0x0059 }
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)     // Catch:{ IllegalArgumentException -> 0x0059 }
        L_0x0014:
            r9 = r8
            goto L_0x0076
        L_0x0016:
            boolean r3 = r9 instanceof java.lang.Float     // Catch:{ IllegalArgumentException -> 0x0059 }
            if (r3 == 0) goto L_0x002b
            double r3 = r0.mo45429b()     // Catch:{ IllegalArgumentException -> 0x0059 }
            java.lang.Double r3 = java.lang.Double.valueOf(r3)     // Catch:{ IllegalArgumentException -> 0x0059 }
            float r3 = r3.floatValue()     // Catch:{ IllegalArgumentException -> 0x0059 }
            java.lang.Float r8 = java.lang.Float.valueOf(r3)     // Catch:{ IllegalArgumentException -> 0x0059 }
            goto L_0x0014
        L_0x002b:
            boolean r3 = r9 instanceof java.lang.Long     // Catch:{ IllegalArgumentException -> 0x0059 }
            if (r3 != 0) goto L_0x0050
            boolean r3 = r9 instanceof java.lang.Integer     // Catch:{ IllegalArgumentException -> 0x0059 }
            if (r3 == 0) goto L_0x0034
            goto L_0x0050
        L_0x0034:
            boolean r3 = r9 instanceof java.lang.String     // Catch:{ IllegalArgumentException -> 0x0059 }
            if (r3 == 0) goto L_0x003d
            java.lang.String r8 = r0.mo45433f()     // Catch:{ IllegalArgumentException -> 0x0059 }
            goto L_0x0014
        L_0x003d:
            java.lang.String r3 = r0.mo45433f()     // Catch:{ IllegalArgumentException -> 0x0059 }
            com.onedelhi.secure.v5 r4 = logger     // Catch:{ IllegalArgumentException -> 0x004e }
            java.lang.String r5 = "No matching type found for the defaultValue: '%s', using String."
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ IllegalArgumentException -> 0x004e }
            r6[r2] = r9     // Catch:{ IllegalArgumentException -> 0x004e }
            r4.mo46001b(r5, r6)     // Catch:{ IllegalArgumentException -> 0x004e }
            r9 = r3
            goto L_0x0076
        L_0x004e:
            r9 = r3
            goto L_0x005a
        L_0x0050:
            long r3 = r0.mo45431d()     // Catch:{ IllegalArgumentException -> 0x0059 }
            java.lang.Long r8 = java.lang.Long.valueOf(r3)     // Catch:{ IllegalArgumentException -> 0x0059 }
            goto L_0x0014
        L_0x0059:
        L_0x005a:
            java.lang.String r3 = r0.mo45433f()
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x0076
            com.onedelhi.secure.v5 r3 = logger
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r0 = r0.mo45433f()
            r4[r2] = r0
            r4[r1] = r8
            java.lang.String r8 = "Could not parse value: '%s' for key: '%s'."
            r3.mo46001b(r8, r4)
        L_0x0076:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.config.RemoteConfigManager.getRemoteConfigValueOrDefault(java.lang.String, java.lang.Object):java.lang.Object");
    }

    public rw2<String> getString(String str) {
        if (str == null) {
            logger.mo46000a("The key to get Remote Config String value is null.");
            return rw2.m63941a();
        }
        u61 remoteConfigValue = getRemoteConfigValue(str);
        return remoteConfigValue != null ? rw2.m63943e(remoteConfigValue.mo45433f()) : rw2.m63941a();
    }

    public boolean isFirebaseRemoteConfigAvailable() {
        b73<uh3> b73;
        uh3 uh3;
        if (!(this.firebaseRemoteConfig != null || (b73 = this.firebaseRemoteConfigProvider) == null || (uh3 = b73.get()) == null)) {
            this.firebaseRemoteConfig = uh3.mo45599d(FIREPERF_FRC_NAMESPACE_NAME);
        }
        return this.firebaseRemoteConfig != null;
    }

    public boolean isLastFetchFailed() {
        n61 n61 = this.firebaseRemoteConfig;
        return n61 == null || n61.mo40980s().mo30119a() == 1;
    }

    public void setFirebaseRemoteConfigProvider(@ts2 b73<uh3> b73) {
        this.firebaseRemoteConfigProvider = b73;
    }

    @VisibleForTesting
    public void syncConfigValues(Map<String, u61> map) {
        C7012v5 v5Var;
        String str;
        this.allRcConfigMap.putAll(map);
        for (String next : this.allRcConfigMap.keySet()) {
            if (!map.containsKey(next)) {
                this.allRcConfigMap.remove(next);
            }
        }
        C4337b.C4340c f = C4337b.C4340c.m34963f();
        u61 u61 = this.allRcConfigMap.get(f.mo29899d());
        if (u61 != null) {
            try {
                this.cache.mo43934p(f.mo29897b(), u61.mo45428a());
            } catch (Exception unused) {
                v5Var = logger;
                str = "ExperimentTTID remote config flag has invalid value, expected boolean.";
            }
        } else {
            v5Var = logger;
            str = "ExperimentTTID remote config flag does not exist.";
            v5Var.mo46000a(str);
        }
    }
}
