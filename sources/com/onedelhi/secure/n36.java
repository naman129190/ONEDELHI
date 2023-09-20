package com.onedelhi.secure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class n36 {

    /* renamed from: A */
    public static final k36 f17010A;

    /* renamed from: A0 */
    public static final k36 f17011A0;

    /* renamed from: B */
    public static final k36 f17012B = m22331a("measurement.upload.retry_time", 1800000L, 1800000L, qo5.f19270a);

    /* renamed from: B0 */
    public static final k36 f17013B0;

    /* renamed from: C */
    public static final k36 f17014C = m22331a("measurement.upload.retry_count", 6, 6, vo5.f21906a);

    /* renamed from: C0 */
    public static final k36 f17015C0;

    /* renamed from: D */
    public static final k36 f17016D = m22331a("measurement.upload.max_queue_time", 2419200000L, 2419200000L, ap5.f9442a);

    /* renamed from: D0 */
    public static final k36 f17017D0;

    /* renamed from: E */
    public static final k36 f17018E = m22331a("measurement.lifetimevalue.max_currency_tracked", 4, 4, kp5.f15044a);

    /* renamed from: E0 */
    public static final k36 f17019E0;

    /* renamed from: F */
    public static final k36 f17020F = m22331a("measurement.audience.filter_result_max_count", 200, 200, pp5.f18640a);

    /* renamed from: F0 */
    public static final k36 f17021F0;

    /* renamed from: G */
    public static final k36 f17022G = m22331a("measurement.upload.max_public_user_properties", 25, 25, (b36) null);

    /* renamed from: G0 */
    public static final k36 f17023G0;

    /* renamed from: H */
    public static final k36 f17024H = m22331a("measurement.upload.max_event_name_cardinality", 500, 500, (b36) null);

    /* renamed from: I */
    public static final k36 f17025I = m22331a("measurement.upload.max_public_event_params", 25, 25, (b36) null);

    /* renamed from: J */
    public static final k36 f17026J = m22331a("measurement.service_client.idle_disconnect_millis", 5000L, 5000L, up5.f21466a);

    /* renamed from: K */
    public static final k36 f17027K;

    /* renamed from: L */
    public static final k36 f17028L = m22331a("measurement.test.string_flag", "---", "---", eq5.f11329a);

    /* renamed from: M */
    public static final k36 f17029M = m22331a("measurement.test.long_flag", -1L, -1L, jq5.f14374a);

    /* renamed from: N */
    public static final k36 f17030N = m22331a("measurement.test.int_flag", -2, -2, tq5.f21051a);

    /* renamed from: O */
    public static final k36 f17031O;

    /* renamed from: P */
    public static final k36 f17032P = m22331a("measurement.experiment.max_ids", 50, 50, dr5.f10887a);

    /* renamed from: Q */
    public static final k36 f17033Q = m22331a("measurement.upload.max_item_scoped_custom_parameters", 27, 27, ir5.f13807a);

    /* renamed from: R */
    public static final k36 f17034R = m22331a("measurement.max_bundles_per_iteration", 100, 100, vs5.f21942a);

    /* renamed from: S */
    public static final k36 f17035S;

    /* renamed from: T */
    public static final k36 f17036T = m22331a("measurement.redaction.app_instance_id.ttl", 7200000L, 7200000L, et5.f11715a);

    /* renamed from: U */
    public static final k36 f17037U;

    /* renamed from: V */
    public static final k36 f17038V;

    /* renamed from: W */
    public static final k36 f17039W;

    /* renamed from: X */
    public static final k36 f17040X;

    /* renamed from: Y */
    public static final k36 f17041Y;

    /* renamed from: Z */
    public static final k36 f17042Z;

    /* renamed from: a */
    public static final k36 f17043a = m22331a("measurement.ad_id_cache_time", 10000L, 10000L, ko5.f15038a);

    /* renamed from: a */
    public static final List f17044a = Collections.synchronizedList(new ArrayList());

    /* renamed from: a */
    public static final Set f17045a = Collections.synchronizedSet(new HashSet());

    /* renamed from: a0 */
    public static final k36 f17046a0;

    /* renamed from: b */
    public static final k36 f17047b = m22331a("measurement.app_uninstalled_additional_ad_id_cache_time", 0L, 0L, om5.f18019a);

    /* renamed from: b0 */
    public static final k36 f17048b0;

    /* renamed from: c */
    public static final k36 f17049c;

    /* renamed from: c0 */
    public static final k36 f17050c0;

    /* renamed from: d */
    public static final k36 f17051d;

    /* renamed from: d0 */
    public static final k36 f17052d0;

    /* renamed from: e */
    public static final k36 f17053e = m22331a("measurement.config.url_scheme", m51.f32019b, m51.f32019b, ou5.f18132a);

    /* renamed from: e0 */
    public static final k36 f17054e0;

    /* renamed from: f */
    public static final k36 f17055f = m22331a("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", kw5.f15098a);

    /* renamed from: f0 */
    public static final k36 f17056f0;

    /* renamed from: g */
    public static final k36 f17057g = m22331a("measurement.upload.max_bundles", 100, 100, jz5.f14669a);

    /* renamed from: g0 */
    public static final k36 f17058g0;

    /* renamed from: h */
    public static final k36 f17059h = m22331a("measurement.upload.max_batch_size", 65536, 65536, f16.f11798a);

    /* renamed from: h0 */
    public static final k36 f17060h0 = m22331a("measurement.service.storage_consent_support_version", 203600, 203600, qv5.f19490a);

    /* renamed from: i */
    public static final k36 f17061i = m22331a("measurement.upload.max_bundle_size", 65536, 65536, q16.f18854a);

    /* renamed from: i0 */
    public static final k36 f17062i0;

    /* renamed from: j */
    public static final k36 f17063j = m22331a("measurement.upload.max_events_per_bundle", 1000, 1000, t16.f20624a);

    /* renamed from: j0 */
    public static final k36 f17064j0;

    /* renamed from: k */
    public static final k36 f17065k;

    /* renamed from: k0 */
    public static final k36 f17066k0;

    /* renamed from: l */
    public static final k36 f17067l = m22331a("measurement.upload.max_error_events_per_day", 1000, 1000, qt5.f19459a);

    /* renamed from: l0 */
    public static final k36 f17068l0;

    /* renamed from: m */
    public static final k36 f17069m = m22331a("measurement.upload.max_public_events_per_day", 50000, 50000, iv5.f13845a);

    /* renamed from: m0 */
    public static final k36 f17070m0;

    /* renamed from: n */
    public static final k36 f17071n = m22331a("measurement.upload.max_conversions_per_day", 10000, 10000, dy5.f11003a);

    /* renamed from: n0 */
    public static final k36 f17072n0;

    /* renamed from: o */
    public static final k36 f17073o = m22331a("measurement.upload.max_realtime_events_per_day", 10, 10, vz5.f22002a);

    /* renamed from: o0 */
    public static final k36 f17074o0;

    /* renamed from: p */
    public static final k36 f17075p;

    /* renamed from: p0 */
    public static final k36 f17076p0;

    /* renamed from: q */
    public static final k36 f17077q = m22331a("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", v26.f21636a);

    /* renamed from: q0 */
    public static final k36 f17078q0;

    /* renamed from: r */
    public static final k36 f17079r = m22331a("measurement.upload.backoff_period", 43200000L, 43200000L, y26.f22867a);

    /* renamed from: r0 */
    public static final k36 f17080r0;

    /* renamed from: s */
    public static final k36 f17081s = m22331a("measurement.upload.window_interval", 3600000L, 3600000L, uk5.f21419a);

    /* renamed from: s0 */
    public static final k36 f17082s0;

    /* renamed from: t */
    public static final k36 f17083t = m22331a("measurement.upload.interval", 3600000L, 3600000L, im5.f13755a);

    /* renamed from: t0 */
    public static final k36 f17084t0;

    /* renamed from: u */
    public static final k36 f17085u = m22331a("measurement.upload.realtime_upload_interval", 10000L, 10000L, um5.f21441a);

    /* renamed from: u0 */
    public static final k36 f17086u0;

    /* renamed from: v */
    public static final k36 f17087v = m22331a("measurement.upload.debug_upload_interval", 1000L, 1000L, an5.f9428a);

    /* renamed from: v0 */
    public static final k36 f17088v0;

    /* renamed from: w */
    public static final k36 f17089w = m22331a("measurement.upload.minimum_delay", 500L, 500L, gn5.f12670a);

    /* renamed from: w0 */
    public static final k36 f17090w0;

    /* renamed from: x */
    public static final k36 f17091x;

    /* renamed from: x0 */
    public static final k36 f17092x0;

    /* renamed from: y */
    public static final k36 f17093y;

    /* renamed from: y0 */
    public static final k36 f17094y0;

    /* renamed from: z */
    public static final k36 f17095z;

    /* renamed from: z0 */
    public static final k36 f17096z0;

    static {
        Long valueOf = Long.valueOf(pr3.f18684a);
        f17049c = m22331a("measurement.monitoring.sample_period_millis", valueOf, valueOf, fp5.f12264a);
        f17051d = m22331a("measurement.config.cache_time", valueOf, 3600000L, nr5.f17554a);
        Integer valueOf2 = Integer.valueOf(BZip2Constants.BASEBLOCKSIZE);
        f17065k = m22331a("measurement.upload.max_events_per_day", valueOf2, valueOf2, oq5.f18079a);
        f17075p = m22331a("measurement.store.max_stored_events_per_app", valueOf2, valueOf2, n16.f16989a);
        Long valueOf3 = Long.valueOf(jg3.f30769e);
        f17091x = m22331a("measurement.alarm_manager.minimum_interval", valueOf3, valueOf3, mn5.f16260a);
        f17093y = m22331a("measurement.upload.stale_data_deletion_interval", valueOf, valueOf, sn5.f20470a);
        Long valueOf4 = Long.valueOf(bw0.f9994b);
        f17095z = m22331a("measurement.upload.refresh_blacklisted_config_interval", valueOf4, valueOf4, yn5.f23260a);
        Long valueOf5 = Long.valueOf(rf4.f19824c);
        f17010A = m22331a("measurement.upload.initial_upload_delay_time", valueOf5, valueOf5, eo5.f11309a);
        Boolean bool = Boolean.FALSE;
        f17027K = m22331a("measurement.test.boolean_flag", bool, bool, zp5.f23832a);
        Double valueOf6 = Double.valueOf(-3.0d);
        f17031O = m22331a("measurement.test.double_flag", valueOf6, valueOf6, yq5.f23298a);
        f17035S = m22331a("measurement.sdk.attribution.cache.ttl", valueOf4, valueOf4, at5.f9533a);
        Boolean bool2 = Boolean.TRUE;
        f17037U = m22331a("measurement.collection.log_event_and_bundle_v2", bool2, bool2, it5.f13837a);
        f17038V = m22331a("measurement.quality.checksum", bool, bool, (b36) null);
        f17039W = m22331a("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool, bool, mt5.f16348a);
        f17040X = m22331a("measurement.audience.refresh_event_count_filters_timestamp", bool, bool, ut5.f21522a);
        f17041Y = m22331a("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool, bool, yt5.f23338a);
        f17042Z = m22331a("measurement.sdk.collection.retrieve_deeplink_from_bow_2", bool2, bool2, cu5.f10497a);
        f17046a0 = m22331a("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool, bool, gu5.f12755a);
        f17048b0 = m22331a("measurement.lifecycle.app_in_background_parameter", bool, bool, ku5.f15082a);
        f17050c0 = m22331a("measurement.integration.disable_firebase_instance_id", bool, bool, su5.f20520a);
        f17052d0 = m22331a("measurement.collection.service.update_with_analytics_fix", bool, bool, wu5.f22307a);
        f17054e0 = m22331a("measurement.client.firebase_feature_rollout.v1.enable", bool2, bool2, av5.f9538a);
        f17056f0 = m22331a("measurement.client.sessions.check_on_reset_and_enable2", bool2, bool2, ev5.f11729a);
        f17058g0 = m22331a("measurement.collection.synthetic_data_mitigation", bool, bool, mv5.f16393a);
        f17062i0 = m22331a("measurement.client.click_identifier_control.dev", bool, bool, uv5.f21532a);
        f17064j0 = m22331a("measurement.service.click_identifier_control", bool, bool, yv5.f23353a);
        f17066k0 = m22331a("measurement.service.store_null_safelist", bool2, bool2, cw5.f10507a);
        f17068l0 = m22331a("measurement.service.store_safelist", bool2, bool2, gw5.f12797a);
        f17070m0 = m22331a("measurement.collection.enable_session_stitching_token.first_open_fix", bool2, bool2, ow5.f18165a);
        f17072n0 = m22331a("measurement.collection.enable_session_stitching_token.client.dev", bool2, bool2, sw5.f20548a);
        f17074o0 = m22331a("measurement.session_stitching_token_enabled", bool, bool, zx5.f23939a);
        f17076p0 = m22331a("measurement.sgtm.client.dev", bool, bool, hy5.f13378a);
        f17078q0 = m22331a("measurement.sgtm.service", bool, bool, ly5.f15699a);
        f17080r0 = m22331a("measurement.redaction.retain_major_os_version", bool2, bool2, py5.f18841a);
        f17082s0 = m22331a("measurement.redaction.scion_payload_generator", bool2, bool2, ty5.f21181a);
        f17084t0 = m22331a("measurement.service.clear_global_params_on_uninstall", bool2, bool2, xy5.f22821a);
        f17086u0 = m22331a("measurement.sessionid.enable_client_session_id", bool2, bool2, bz5.f10042a);
        f17088v0 = m22331a("measurement.sfmc.client", bool, bool, fz5.f12387a);
        f17090w0 = m22331a("measurement.sfmc.service", bool, bool, nz5.f17633a);
        f17092x0 = m22331a("measurement.gmscore_feature_tracking", bool2, bool2, rz5.f20156a);
        f17094y0 = m22331a("measurement.fix_health_monitor_stack_trace", bool2, bool2, zz5.f24011a);
        f17096z0 = m22331a("measurement.item_scoped_custom_parameters.client", bool2, bool2, d06.f10581a);
        f17011A0 = m22331a("measurement.item_scoped_custom_parameters.service", bool, bool, h06.f12860a);
        f17013B0 = m22331a("measurement.remove_app_background.client", bool, bool, l06.f15134a);
        f17015C0 = m22331a("measurement.rb.attribution.service", bool, bool, p06.f18271a);
        f17017D0 = m22331a("measurement.collection.client.log_target_api_version.dev", bool, bool, t06.f20620a);
        f17019E0 = m22331a("measurement.collection.service.log_target_api_version", bool, bool, x06.f22369a);
        f17021F0 = m22331a("measurement.client.deep_link_referrer_fix.dev", bool, bool, b16.f9602a);
        f17023G0 = m22331a("measurement.client.sessions.enable_fix_background_engagement", bool, bool, j16.f13982a);
    }

    /* renamed from: a */
    public static k36 m22331a(String str, Object obj, Object obj2, b36 b36) {
        k36 k36 = new k36(str, obj, obj2, b36, (h36) null);
        f17044a.add(k36);
        return k36;
    }
}
