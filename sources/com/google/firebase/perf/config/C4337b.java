package com.google.firebase.perf.config;

import com.onedelhi.secure.C4898cp;
import com.onedelhi.secure.g60;
import com.onedelhi.secure.m50;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.firebase.perf.config.b */
public final class C4337b {

    /* renamed from: com.google.firebase.perf.config.b$a */
    public static final class C4338a extends m50<Boolean> {

        /* renamed from: a */
        public static C4338a f25230a;

        /* renamed from: f */
        public static synchronized C4338a m34954f() {
            C4338a aVar;
            synchronized (C4338a.class) {
                if (f25230a == null) {
                    f25230a = new C4338a();
                }
                aVar = f25230a;
            }
            return aVar;
        }

        /* renamed from: c */
        public String mo29895c() {
            return "firebase_performance_collection_deactivated";
        }

        /* renamed from: e */
        public Boolean mo29894a() {
            return Boolean.FALSE;
        }
    }

    /* renamed from: com.google.firebase.perf.config.b$b */
    public static final class C4339b extends m50<Boolean> {

        /* renamed from: a */
        public static C4339b f25231a;

        /* renamed from: f */
        public static synchronized C4339b m34958f() {
            C4339b bVar;
            synchronized (C4339b.class) {
                if (f25231a == null) {
                    f25231a = new C4339b();
                }
                bVar = f25231a;
            }
            return bVar;
        }

        /* renamed from: b */
        public String mo29897b() {
            return g60.f28960b;
        }

        /* renamed from: c */
        public String mo29895c() {
            return "firebase_performance_collection_enabled";
        }

        /* renamed from: e */
        public Boolean mo29894a() {
            return Boolean.TRUE;
        }
    }

    /* renamed from: com.google.firebase.perf.config.b$c */
    public static final class C4340c extends m50<Boolean> {

        /* renamed from: a */
        public static C4340c f25232a;

        /* renamed from: f */
        public static synchronized C4340c m34963f() {
            C4340c cVar;
            synchronized (C4340c.class) {
                if (f25232a == null) {
                    f25232a = new C4340c();
                }
                cVar = f25232a;
            }
            return cVar;
        }

        /* renamed from: b */
        public String mo29897b() {
            return "com.google.firebase.perf.ExperimentTTID";
        }

        /* renamed from: c */
        public String mo29895c() {
            return "experiment_app_start_ttid";
        }

        /* renamed from: d */
        public String mo29899d() {
            return "fpr_experiment_app_start_ttid";
        }

        /* renamed from: e */
        public Boolean mo29894a() {
            return Boolean.FALSE;
        }
    }

    /* renamed from: com.google.firebase.perf.config.b$d */
    public static final class C4341d extends m50<Float> {

        /* renamed from: a */
        public static C4341d f25233a;

        /* renamed from: f */
        public static synchronized C4341d m34969f() {
            C4341d dVar;
            synchronized (C4341d.class) {
                if (f25233a == null) {
                    f25233a = new C4341d();
                }
                dVar = f25233a;
            }
            return dVar;
        }

        /* renamed from: b */
        public String mo29897b() {
            return "com.google.firebase.perf.FragmentSamplingRate";
        }

        /* renamed from: c */
        public String mo29895c() {
            return "fragment_sampling_percentage";
        }

        /* renamed from: d */
        public String mo29899d() {
            return "fpr_vc_fragment_sampling_rate";
        }

        /* renamed from: e */
        public Float mo29894a() {
            return Float.valueOf(0.0f);
        }
    }

    /* renamed from: com.google.firebase.perf.config.b$e */
    public static final class C4342e extends m50<String> {

        /* renamed from: a */
        public static C4342e f25234a;

        /* renamed from: a */
        public static final Map<Long, String> f25235a = Collections.unmodifiableMap(new C4343a());

        /* renamed from: com.google.firebase.perf.config.b$e$a */
        public class C4343a extends HashMap<Long, String> {
            public C4343a() {
                put(461L, "FIREPERF_AUTOPUSH");
                put(462L, "FIREPERF");
                put(675L, "FIREPERF_INTERNAL_LOW");
                put(676L, "FIREPERF_INTERNAL_HIGH");
            }
        }

        /* renamed from: f */
        public static synchronized C4342e m34975f() {
            C4342e eVar;
            synchronized (C4342e.class) {
                if (f25234a == null) {
                    f25234a = new C4342e();
                }
                eVar = f25234a;
            }
            return eVar;
        }

        /* renamed from: g */
        public static String m34976g(long j) {
            return f25235a.get(Long.valueOf(j));
        }

        /* renamed from: h */
        public static boolean m34977h(long j) {
            return f25235a.containsKey(Long.valueOf(j));
        }

        /* renamed from: b */
        public String mo29897b() {
            return "com.google.firebase.perf.LogSourceName";
        }

        /* renamed from: d */
        public String mo29899d() {
            return "fpr_log_source";
        }

        /* renamed from: e */
        public String mo29894a() {
            return C4898cp.f27023d;
        }
    }

    /* renamed from: com.google.firebase.perf.config.b$f */
    public static final class C4344f extends m50<Long> {

        /* renamed from: a */
        public static C4344f f25236a;

        /* renamed from: f */
        public static synchronized C4344f m34982f() {
            C4344f fVar;
            synchronized (C4344f.class) {
                if (f25236a == null) {
                    f25236a = new C4344f();
                }
                fVar = f25236a;
            }
            return fVar;
        }

        /* renamed from: b */
        public String mo29897b() {
            return "com.google.firebase.perf.NetworkEventCountBackground";
        }

        /* renamed from: d */
        public String mo29899d() {
            return "fpr_rl_network_event_count_bg";
        }

        /* renamed from: e */
        public Long mo29894a() {
            return 70L;
        }
    }

    /* renamed from: com.google.firebase.perf.config.b$g */
    public static final class C4345g extends m50<Long> {

        /* renamed from: a */
        public static C4345g f25237a;

        /* renamed from: f */
        public static synchronized C4345g m34987f() {
            C4345g gVar;
            synchronized (C4345g.class) {
                if (f25237a == null) {
                    f25237a = new C4345g();
                }
                gVar = f25237a;
            }
            return gVar;
        }

        /* renamed from: b */
        public String mo29897b() {
            return "com.google.firebase.perf.NetworkEventCountForeground";
        }

        /* renamed from: d */
        public String mo29899d() {
            return "fpr_rl_network_event_count_fg";
        }

        /* renamed from: e */
        public Long mo29894a() {
            return 700L;
        }
    }

    /* renamed from: com.google.firebase.perf.config.b$h */
    public static final class C4346h extends m50<Float> {

        /* renamed from: a */
        public static C4346h f25238a;

        /* renamed from: f */
        public static synchronized C4346h m34992f() {
            C4346h hVar;
            synchronized (C4346h.class) {
                if (f25238a == null) {
                    f25238a = new C4346h();
                }
                hVar = f25238a;
            }
            return hVar;
        }

        /* renamed from: b */
        public String mo29897b() {
            return "com.google.firebase.perf.NetworkRequestSamplingRate";
        }

        /* renamed from: d */
        public String mo29899d() {
            return "fpr_vc_network_request_sampling_rate";
        }

        /* renamed from: e */
        public Float mo29894a() {
            return Float.valueOf(1.0f);
        }
    }

    /* renamed from: com.google.firebase.perf.config.b$i */
    public static final class C4347i extends m50<Long> {

        /* renamed from: a */
        public static C4347i f25239a;

        /* renamed from: f */
        public static synchronized C4347i m34997f() {
            C4347i iVar;
            synchronized (C4347i.class) {
                if (f25239a == null) {
                    f25239a = new C4347i();
                }
                iVar = f25239a;
            }
            return iVar;
        }

        /* renamed from: b */
        public String mo29897b() {
            return "com.google.firebase.perf.TimeLimitSec";
        }

        /* renamed from: d */
        public String mo29899d() {
            return "fpr_rl_time_limit_sec";
        }

        /* renamed from: e */
        public Long mo29894a() {
            return 600L;
        }
    }

    /* renamed from: com.google.firebase.perf.config.b$j */
    public static final class C4348j extends m50<String> {

        /* renamed from: a */
        public static C4348j f25240a;

        /* renamed from: f */
        public static synchronized C4348j m35002f() {
            C4348j jVar;
            synchronized (C4348j.class) {
                if (f25240a == null) {
                    f25240a = new C4348j();
                }
                jVar = f25240a;
            }
            return jVar;
        }

        /* renamed from: b */
        public String mo29897b() {
            return "com.google.firebase.perf.SdkDisabledVersions";
        }

        /* renamed from: d */
        public String mo29899d() {
            return "fpr_disabled_android_versions";
        }

        /* renamed from: e */
        public String mo29894a() {
            return "";
        }
    }

    /* renamed from: com.google.firebase.perf.config.b$k */
    public static final class C4349k extends m50<Boolean> {

        /* renamed from: a */
        public static C4349k f25241a;

        /* renamed from: f */
        public static synchronized C4349k m35007f() {
            C4349k kVar;
            synchronized (C4349k.class) {
                if (f25241a == null) {
                    f25241a = new C4349k();
                }
                kVar = f25241a;
            }
            return kVar;
        }

        /* renamed from: b */
        public String mo29897b() {
            return "com.google.firebase.perf.SdkEnabled";
        }

        /* renamed from: d */
        public String mo29899d() {
            return "fpr_enabled";
        }

        /* renamed from: e */
        public Boolean mo29894a() {
            return Boolean.TRUE;
        }
    }

    /* renamed from: com.google.firebase.perf.config.b$l */
    public static final class C4350l extends m50<Long> {

        /* renamed from: a */
        public static C4350l f25242a;

        /* renamed from: f */
        public static synchronized C4350l m35012f() {
            C4350l lVar;
            synchronized (C4350l.class) {
                if (f25242a == null) {
                    f25242a = new C4350l();
                }
                lVar = f25242a;
            }
            return lVar;
        }

        /* renamed from: b */
        public String mo29897b() {
            return "com.google.firebase.perf.SessionsCpuCaptureFrequencyBackgroundMs";
        }

        /* renamed from: c */
        public String mo29895c() {
            return "sessions_cpu_capture_frequency_bg_ms";
        }

        /* renamed from: d */
        public String mo29899d() {
            return "fpr_session_gauge_cpu_capture_frequency_bg_ms";
        }

        /* renamed from: e */
        public Long mo29894a() {
            return 0L;
        }
    }

    /* renamed from: com.google.firebase.perf.config.b$m */
    public static final class C4351m extends m50<Long> {

        /* renamed from: a */
        public static C4351m f25243a;

        /* renamed from: f */
        public static synchronized C4351m m35018f() {
            C4351m mVar;
            synchronized (C4351m.class) {
                if (f25243a == null) {
                    f25243a = new C4351m();
                }
                mVar = f25243a;
            }
            return mVar;
        }

        /* renamed from: b */
        public String mo29897b() {
            return "com.google.firebase.perf.SessionsCpuCaptureFrequencyForegroundMs";
        }

        /* renamed from: c */
        public String mo29895c() {
            return "sessions_cpu_capture_frequency_fg_ms";
        }

        /* renamed from: d */
        public String mo29899d() {
            return "fpr_session_gauge_cpu_capture_frequency_fg_ms";
        }

        /* renamed from: e */
        public Long mo29894a() {
            return 100L;
        }
    }

    /* renamed from: com.google.firebase.perf.config.b$n */
    public static final class C4352n extends m50<Long> {

        /* renamed from: a */
        public static C4352n f25244a;

        /* renamed from: f */
        public static synchronized C4352n m35024f() {
            C4352n nVar;
            synchronized (C4352n.class) {
                if (f25244a == null) {
                    f25244a = new C4352n();
                }
                nVar = f25244a;
            }
            return nVar;
        }

        /* renamed from: b */
        public String mo29897b() {
            return "com.google.firebase.perf.SessionsMaxDurationMinutes";
        }

        /* renamed from: c */
        public String mo29895c() {
            return "sessions_max_length_minutes";
        }

        /* renamed from: d */
        public String mo29899d() {
            return "fpr_session_max_duration_min";
        }

        /* renamed from: e */
        public Long mo29894a() {
            return 240L;
        }
    }

    /* renamed from: com.google.firebase.perf.config.b$o */
    public static final class C4353o extends m50<Long> {

        /* renamed from: a */
        public static C4353o f25245a;

        /* renamed from: f */
        public static synchronized C4353o m35030f() {
            C4353o oVar;
            synchronized (C4353o.class) {
                if (f25245a == null) {
                    f25245a = new C4353o();
                }
                oVar = f25245a;
            }
            return oVar;
        }

        /* renamed from: b */
        public String mo29897b() {
            return "com.google.firebase.perf.SessionsMemoryCaptureFrequencyBackgroundMs";
        }

        /* renamed from: c */
        public String mo29895c() {
            return "sessions_memory_capture_frequency_bg_ms";
        }

        /* renamed from: d */
        public String mo29899d() {
            return "fpr_session_gauge_memory_capture_frequency_bg_ms";
        }

        /* renamed from: e */
        public Long mo29894a() {
            return 0L;
        }
    }

    /* renamed from: com.google.firebase.perf.config.b$p */
    public static final class C4354p extends m50<Long> {

        /* renamed from: a */
        public static C4354p f25246a;

        /* renamed from: f */
        public static synchronized C4354p m35036f() {
            C4354p pVar;
            synchronized (C4354p.class) {
                if (f25246a == null) {
                    f25246a = new C4354p();
                }
                pVar = f25246a;
            }
            return pVar;
        }

        /* renamed from: b */
        public String mo29897b() {
            return "com.google.firebase.perf.SessionsMemoryCaptureFrequencyForegroundMs";
        }

        /* renamed from: c */
        public String mo29895c() {
            return "sessions_memory_capture_frequency_fg_ms";
        }

        /* renamed from: d */
        public String mo29899d() {
            return "fpr_session_gauge_memory_capture_frequency_fg_ms";
        }

        /* renamed from: e */
        public Long mo29894a() {
            return 100L;
        }
    }

    /* renamed from: com.google.firebase.perf.config.b$q */
    public static final class C4355q extends m50<Float> {

        /* renamed from: a */
        public static C4355q f25247a;

        /* renamed from: f */
        public static synchronized C4355q m35042f() {
            C4355q qVar;
            synchronized (C4355q.class) {
                if (f25247a == null) {
                    f25247a = new C4355q();
                }
                qVar = f25247a;
            }
            return qVar;
        }

        /* renamed from: b */
        public String mo29897b() {
            return "com.google.firebase.perf.SessionSamplingRate";
        }

        /* renamed from: c */
        public String mo29895c() {
            return "sessions_sampling_percentage";
        }

        /* renamed from: d */
        public String mo29899d() {
            return "fpr_vc_session_sampling_rate";
        }

        /* renamed from: e */
        public Float mo29894a() {
            return Float.valueOf(0.01f);
        }
    }

    /* renamed from: com.google.firebase.perf.config.b$r */
    public static final class C4356r extends m50<Long> {

        /* renamed from: a */
        public static C4356r f25248a;

        /* renamed from: f */
        public static synchronized C4356r m35048f() {
            C4356r rVar;
            synchronized (C4356r.class) {
                if (f25248a == null) {
                    f25248a = new C4356r();
                }
                rVar = f25248a;
            }
            return rVar;
        }

        /* renamed from: b */
        public String mo29897b() {
            return "com.google.firebase.perf.TraceEventCountBackground";
        }

        /* renamed from: d */
        public String mo29899d() {
            return "fpr_rl_trace_event_count_bg";
        }

        /* renamed from: e */
        public Long mo29894a() {
            return 30L;
        }
    }

    /* renamed from: com.google.firebase.perf.config.b$s */
    public static final class C4357s extends m50<Long> {

        /* renamed from: a */
        public static C4357s f25249a;

        /* renamed from: f */
        public static synchronized C4357s m35053f() {
            C4357s sVar;
            synchronized (C4357s.class) {
                if (f25249a == null) {
                    f25249a = new C4357s();
                }
                sVar = f25249a;
            }
            return sVar;
        }

        /* renamed from: b */
        public String mo29897b() {
            return "com.google.firebase.perf.TraceEventCountForeground";
        }

        /* renamed from: d */
        public String mo29899d() {
            return "fpr_rl_trace_event_count_fg";
        }

        /* renamed from: e */
        public Long mo29894a() {
            return 300L;
        }
    }

    /* renamed from: com.google.firebase.perf.config.b$t */
    public static final class C4358t extends m50<Float> {

        /* renamed from: a */
        public static C4358t f25250a;

        /* renamed from: f */
        public static synchronized C4358t m35058f() {
            C4358t tVar;
            synchronized (C4358t.class) {
                if (f25250a == null) {
                    f25250a = new C4358t();
                }
                tVar = f25250a;
            }
            return tVar;
        }

        /* renamed from: b */
        public String mo29897b() {
            return "com.google.firebase.perf.TraceSamplingRate";
        }

        /* renamed from: d */
        public String mo29899d() {
            return "fpr_vc_trace_sampling_rate";
        }

        /* renamed from: e */
        public Float mo29894a() {
            return Float.valueOf(1.0f);
        }
    }
}
