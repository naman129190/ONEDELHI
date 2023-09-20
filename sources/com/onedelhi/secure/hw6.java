package com.onedelhi.secure;

import android.support.p000v4.media.session.PlaybackStateCompat;

public final class hw6 implements gw6 {

    /* renamed from: A */
    public static final ei6 f13332A;

    /* renamed from: B */
    public static final ei6 f13333B;

    /* renamed from: C */
    public static final ei6 f13334C;

    /* renamed from: D */
    public static final ei6 f13335D;

    /* renamed from: E */
    public static final ei6 f13336E;

    /* renamed from: F */
    public static final ei6 f13337F;

    /* renamed from: G */
    public static final ei6 f13338G;

    /* renamed from: H */
    public static final ei6 f13339H;

    /* renamed from: I */
    public static final ei6 f13340I;

    /* renamed from: J */
    public static final ei6 f13341J;

    /* renamed from: K */
    public static final ei6 f13342K;

    /* renamed from: L */
    public static final ei6 f13343L;

    /* renamed from: M */
    public static final ei6 f13344M;

    /* renamed from: N */
    public static final ei6 f13345N;

    /* renamed from: O */
    public static final ei6 f13346O;

    /* renamed from: P */
    public static final ei6 f13347P;

    /* renamed from: a */
    public static final ei6 f13348a;

    /* renamed from: b */
    public static final ei6 f13349b;

    /* renamed from: c */
    public static final ei6 f13350c;

    /* renamed from: d */
    public static final ei6 f13351d;

    /* renamed from: e */
    public static final ei6 f13352e;

    /* renamed from: f */
    public static final ei6 f13353f;

    /* renamed from: g */
    public static final ei6 f13354g;

    /* renamed from: h */
    public static final ei6 f13355h;

    /* renamed from: i */
    public static final ei6 f13356i;

    /* renamed from: j */
    public static final ei6 f13357j;

    /* renamed from: k */
    public static final ei6 f13358k;

    /* renamed from: l */
    public static final ei6 f13359l;

    /* renamed from: m */
    public static final ei6 f13360m;

    /* renamed from: n */
    public static final ei6 f13361n;

    /* renamed from: o */
    public static final ei6 f13362o;

    /* renamed from: p */
    public static final ei6 f13363p;

    /* renamed from: q */
    public static final ei6 f13364q;

    /* renamed from: r */
    public static final ei6 f13365r;

    /* renamed from: s */
    public static final ei6 f13366s;

    /* renamed from: t */
    public static final ei6 f13367t;

    /* renamed from: u */
    public static final ei6 f13368u;

    /* renamed from: v */
    public static final ei6 f13369v;

    /* renamed from: w */
    public static final ei6 f13370w;

    /* renamed from: x */
    public static final ei6 f13371x;

    /* renamed from: y */
    public static final ei6 f13372y;

    /* renamed from: z */
    public static final ei6 f13373z;

    static {
        dh6 a = new dh6(gg6.m15836a("com.google.android.gms.measurement")).mo14667a();
        f13348a = a.mo14670d("measurement.ad_id_cache_time", 10000);
        f13349b = a.mo14670d("measurement.app_uninstalled_additional_ad_id_cache_time", 0);
        f13350c = a.mo14670d("measurement.max_bundles_per_iteration", 100);
        f13351d = a.mo14670d("measurement.config.cache_time", pr3.f18684a);
        f13352e = a.mo14671e("measurement.log_tag", "FA");
        f13353f = a.mo14671e("measurement.config.url_authority", "app-measurement.com");
        f13354g = a.mo14671e("measurement.config.url_scheme", m51.f32019b);
        f13355h = a.mo14670d("measurement.upload.debug_upload_interval", 1000);
        f13356i = a.mo14670d("measurement.id.app_uninstalled_additional_ad_id_cache_time", 0);
        f13357j = a.mo14670d("measurement.lifetimevalue.max_currency_tracked", 4);
        f13358k = a.mo14670d("measurement.store.max_stored_events_per_app", 100000);
        f13359l = a.mo14670d("measurement.experiment.max_ids", 50);
        f13360m = a.mo14670d("measurement.audience.filter_result_max_count", 200);
        f13361n = a.mo14670d("measurement.upload.max_item_scoped_custom_parameters", 27);
        f13362o = a.mo14670d("measurement.alarm_manager.minimum_interval", jg3.f30769e);
        f13363p = a.mo14670d("measurement.upload.minimum_delay", 500);
        f13364q = a.mo14670d("measurement.monitoring.sample_period_millis", pr3.f18684a);
        f13365r = a.mo14670d("measurement.upload.realtime_upload_interval", 10000);
        f13366s = a.mo14670d("measurement.upload.refresh_blacklisted_config_interval", bw0.f9994b);
        f13367t = a.mo14670d("measurement.config.cache_time.service", 3600000);
        f13368u = a.mo14670d("measurement.service_client.idle_disconnect_millis", 5000);
        f13369v = a.mo14671e("measurement.log_tag.service", "FA-SVC");
        f13370w = a.mo14670d("measurement.upload.stale_data_deletion_interval", pr3.f18684a);
        f13371x = a.mo14670d("measurement.sdk.attribution.cache.ttl", bw0.f9994b);
        f13372y = a.mo14670d("measurement.redaction.app_instance_id.ttl", 7200000);
        f13373z = a.mo14670d("measurement.upload.backoff_period", 43200000);
        f13332A = a.mo14670d("measurement.upload.initial_upload_delay_time", rf4.f19824c);
        f13333B = a.mo14670d("measurement.upload.interval", 3600000);
        f13334C = a.mo14670d("measurement.upload.max_bundle_size", PlaybackStateCompat.f458w);
        f13335D = a.mo14670d("measurement.upload.max_bundles", 100);
        f13336E = a.mo14670d("measurement.upload.max_conversions_per_day", 500);
        f13337F = a.mo14670d("measurement.upload.max_error_events_per_day", 1000);
        f13338G = a.mo14670d("measurement.upload.max_events_per_bundle", 1000);
        f13339H = a.mo14670d("measurement.upload.max_events_per_day", 100000);
        f13340I = a.mo14670d("measurement.upload.max_public_events_per_day", 50000);
        f13341J = a.mo14670d("measurement.upload.max_queue_time", 2419200000L);
        f13342K = a.mo14670d("measurement.upload.max_realtime_events_per_day", 10);
        f13343L = a.mo14670d("measurement.upload.max_batch_size", PlaybackStateCompat.f458w);
        f13344M = a.mo14670d("measurement.upload.retry_count", 6);
        f13345N = a.mo14670d("measurement.upload.retry_time", 1800000);
        f13346O = a.mo14671e("measurement.upload.url", "https://app-measurement.com/a");
        f13347P = a.mo14670d("measurement.upload.window_interval", 3600000);
    }

    /* renamed from: A */
    public final long mo16963A() {
        return ((Long) f13333B.mo15196b()).longValue();
    }

    /* renamed from: B */
    public final long mo16964B() {
        return ((Long) f13355h.mo15196b()).longValue();
    }

    /* renamed from: C */
    public final long mo16965C() {
        return ((Long) f13340I.mo15196b()).longValue();
    }

    /* renamed from: D */
    public final long mo16966D() {
        return ((Long) f13365r.mo15196b()).longValue();
    }

    /* renamed from: E */
    public final long mo16967E() {
        return ((Long) f13361n.mo15196b()).longValue();
    }

    /* renamed from: F */
    public final long mo16968F() {
        return ((Long) f13345N.mo15196b()).longValue();
    }

    /* renamed from: G */
    public final long mo16969G() {
        return ((Long) f13372y.mo15196b()).longValue();
    }

    /* renamed from: H */
    public final long mo16970H() {
        return ((Long) f13362o.mo15196b()).longValue();
    }

    /* renamed from: I */
    public final long mo16971I() {
        return ((Long) f13347P.mo15196b()).longValue();
    }

    /* renamed from: J */
    public final long mo16972J() {
        return ((Long) f13338G.mo15196b()).longValue();
    }

    /* renamed from: K */
    public final String mo16973K() {
        return (String) f13353f.mo15196b();
    }

    /* renamed from: L */
    public final long mo16974L() {
        return ((Long) f13373z.mo15196b()).longValue();
    }

    /* renamed from: a */
    public final long mo16975a() {
        return ((Long) f13349b.mo15196b()).longValue();
    }

    /* renamed from: b */
    public final long mo16976b() {
        return ((Long) f13348a.mo15196b()).longValue();
    }

    /* renamed from: c */
    public final long mo16977c() {
        return ((Long) f13350c.mo15196b()).longValue();
    }

    /* renamed from: d */
    public final long mo16978d() {
        return ((Long) f13343L.mo15196b()).longValue();
    }

    /* renamed from: e */
    public final long mo16979e() {
        return ((Long) f13336E.mo15196b()).longValue();
    }

    /* renamed from: f */
    public final long mo16980f() {
        return ((Long) f13359l.mo15196b()).longValue();
    }

    /* renamed from: g */
    public final String mo16981g() {
        return (String) f13354g.mo15196b();
    }

    /* renamed from: h */
    public final long mo16982h() {
        return ((Long) f13370w.mo15196b()).longValue();
    }

    /* renamed from: i */
    public final long mo16983i() {
        return ((Long) f13337F.mo15196b()).longValue();
    }

    /* renamed from: j */
    public final long mo16984j() {
        return ((Long) f13360m.mo15196b()).longValue();
    }

    /* renamed from: k */
    public final long mo16985k() {
        return ((Long) f13344M.mo15196b()).longValue();
    }

    /* renamed from: l */
    public final String mo16986l() {
        return (String) f13346O.mo15196b();
    }

    /* renamed from: m */
    public final long mo16987m() {
        return ((Long) f13371x.mo15196b()).longValue();
    }

    /* renamed from: n */
    public final long mo16988n() {
        return ((Long) f13334C.mo15196b()).longValue();
    }

    /* renamed from: o */
    public final long mo16989o() {
        return ((Long) f13357j.mo15196b()).longValue();
    }

    /* renamed from: p */
    public final long mo16990p() {
        return ((Long) f13341J.mo15196b()).longValue();
    }

    /* renamed from: q */
    public final long mo16991q() {
        return ((Long) f13366s.mo15196b()).longValue();
    }

    /* renamed from: r */
    public final long mo16992r() {
        return ((Long) f13358k.mo15196b()).longValue();
    }

    /* renamed from: s */
    public final long mo16993s() {
        return ((Long) f13342K.mo15196b()).longValue();
    }

    /* renamed from: t */
    public final long mo16994t() {
        return ((Long) f13335D.mo15196b()).longValue();
    }

    /* renamed from: u */
    public final long mo16995u() {
        return ((Long) f13368u.mo15196b()).longValue();
    }

    /* renamed from: v */
    public final long mo16996v() {
        return ((Long) f13363p.mo15196b()).longValue();
    }

    /* renamed from: w */
    public final long mo16997w() {
        return ((Long) f13339H.mo15196b()).longValue();
    }

    /* renamed from: x */
    public final long mo16998x() {
        return ((Long) f13332A.mo15196b()).longValue();
    }

    /* renamed from: y */
    public final long mo16999y() {
        return ((Long) f13351d.mo15196b()).longValue();
    }

    /* renamed from: z */
    public final long mo17000z() {
        return ((Long) f13364q.mo15196b()).longValue();
    }
}
