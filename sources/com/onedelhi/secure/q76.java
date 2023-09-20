package com.onedelhi.secure;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.internal.Preconditions;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

public final class q76 extends hd6 {

    /* renamed from: a */
    public static final Pair f18939a = new Pair("", 0L);

    /* renamed from: a */
    public long f18940a;

    /* renamed from: a */
    public SharedPreferences f18941a;

    /* renamed from: a */
    public final b76 f18942a = new b76(this, "default_event_parameters", (Bundle) null);

    /* renamed from: a */
    public final e76 f18943a = new e76(this, "first_open_time", 0);

    /* renamed from: a */
    public k76 f18944a;

    /* renamed from: a */
    public final n76 f18945a = new n76(this, "app_instance_id", (String) null);

    /* renamed from: a */
    public final y66 f18946a = new y66(this, "start_new_session", true);

    /* renamed from: a */
    public String f18947a;

    /* renamed from: b */
    public final e76 f18948b = new e76(this, "app_install_time", 0);

    /* renamed from: b */
    public final n76 f18949b = new n76(this, "non_personalized_ads", (String) null);

    /* renamed from: b */
    public final y66 f18950b = new y66(this, "allow_remote_dynamite", false);

    /* renamed from: b */
    public boolean f18951b;

    /* renamed from: c */
    public final e76 f18952c = new e76(this, "session_timeout", 1800000);

    /* renamed from: c */
    public final n76 f18953c = new n76(this, "firebase_feature_rollouts", (String) null);

    /* renamed from: c */
    public final y66 f18954c = new y66(this, "app_backgrounded", false);

    /* renamed from: c */
    public boolean f18955c;

    /* renamed from: d */
    public final e76 f18956d = new e76(this, "last_pause_time", 0);

    /* renamed from: d */
    public final n76 f18957d = new n76(this, "deferred_attribution_cache", (String) null);

    /* renamed from: d */
    public final y66 f18958d = new y66(this, "deep_link_retrieval_complete", false);

    /* renamed from: e */
    public final e76 f18959e = new e76(this, "session_id", 0);

    /* renamed from: f */
    public final e76 f18960f = new e76(this, "deep_link_retrieval_attempts", 0);

    /* renamed from: g */
    public final e76 f18961g = new e76(this, "deferred_attribution_cache_timestamp", 0);

    public q76(za6 za6) {
        super(za6);
    }

    @EnsuresNonNull.List({@EnsuresNonNull({"this.preferences"}), @EnsuresNonNull({"this.monitoringSample"})})
    @ly4
    /* renamed from: i */
    public final void mo16877i() {
        SharedPreferences sharedPreferences = this.f11205a.mo15137f().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f18941a = sharedPreferences;
        boolean z = sharedPreferences.getBoolean("has_been_opened", false);
        this.f18955c = z;
        if (!z) {
            SharedPreferences.Editor edit = this.f18941a.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.f11205a.mo27891z();
        this.f18944a = new k76(this, "health_monitor", Math.max(0, ((Long) n36.f17049c.mo18887a((Object) null)).longValue()), (h76) null);
    }

    /* renamed from: j */
    public final boolean mo12724j() {
        return true;
    }

    @ly4
    /* renamed from: o */
    public final SharedPreferences mo22924o() {
        mo15139h();
        mo17201k();
        Preconditions.checkNotNull(this.f18941a);
        return this.f18941a;
    }

    @ly4
    /* renamed from: p */
    public final Pair mo22925p(String str) {
        mo15139h();
        long elapsedRealtime = this.f11205a.mo15133a().elapsedRealtime();
        String str2 = this.f18947a;
        if (str2 != null && elapsedRealtime < this.f18940a) {
            return new Pair(str2, Boolean.valueOf(this.f18951b));
        }
        this.f18940a = elapsedRealtime + this.f11205a.mo27891z().mo14125r(str, n36.f17043a);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.f11205a.mo15137f());
            this.f18947a = "";
            String id = advertisingIdInfo.getId();
            if (id != null) {
                this.f18947a = id;
            }
            this.f18951b = advertisingIdInfo.isLimitAdTrackingEnabled();
        } catch (Exception e) {
            this.f11205a.mo15136e().mo12725q().mo25380b("Unable to get advertising id", e);
            this.f18947a = "";
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair(this.f18947a, Boolean.valueOf(this.f18951b));
    }

    @ly4
    /* renamed from: q */
    public final ye5 mo22926q() {
        mo15139h();
        return ye5.m32305b(mo22924o().getString("consent_settings", "G1"));
    }

    @ly4
    /* renamed from: r */
    public final Boolean mo22927r() {
        mo15139h();
        if (mo22924o().contains("measurement_enabled")) {
            return Boolean.valueOf(mo22924o().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    @ly4
    /* renamed from: s */
    public final void mo22928s(Boolean bool) {
        mo15139h();
        SharedPreferences.Editor edit = mo22924o().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }

    @ly4
    /* renamed from: t */
    public final void mo22929t(boolean z) {
        mo15139h();
        this.f11205a.mo15136e().mo12730v().mo25380b("App measurement setting deferred collection", Boolean.valueOf(z));
        SharedPreferences.Editor edit = mo22924o().edit();
        edit.putBoolean("deferred_analytics_collection", z);
        edit.apply();
    }

    @ly4
    /* renamed from: u */
    public final boolean mo22930u() {
        SharedPreferences sharedPreferences = this.f18941a;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }

    /* renamed from: v */
    public final boolean mo22931v(long j) {
        return j - this.f18952c.mo15075a() > this.f18956d.mo15075a();
    }

    @ly4
    /* renamed from: w */
    public final boolean mo22932w(int i) {
        return ye5.m32307j(i, mo22924o().getInt("consent_source", 100));
    }
}
