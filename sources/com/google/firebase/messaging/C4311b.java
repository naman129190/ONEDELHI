package com.google.firebase.messaging;

import android.os.Bundle;
import com.onedelhi.secure.C3042oa;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.messaging.b */
public final class C4311b {

    /* renamed from: a */
    public static final long f25063a = TimeUnit.MINUTES.toMillis(3);

    /* renamed from: a */
    public static final String f25064a = "FirebaseMessaging";

    /* renamed from: b */
    public static final String f25065b = "wake:com.google.firebase.messaging";

    /* renamed from: c */
    public static final String f25066c = "error";

    /* renamed from: com.google.firebase.messaging.b$a */
    public static final class C4312a {

        /* renamed from: a */
        public static final String f25067a = "google.c.a.";

        /* renamed from: b */
        public static final String f25068b = "google.c.a.e";

        /* renamed from: c */
        public static final String f25069c = "google.c.a.c_id";

        /* renamed from: d */
        public static final String f25070d = "google.c.a.c_l";

        /* renamed from: e */
        public static final String f25071e = "google.c.a.ts";

        /* renamed from: f */
        public static final String f25072f = "google.c.a.udt";

        /* renamed from: g */
        public static final String f25073g = "google.c.a.tc";

        /* renamed from: h */
        public static final String f25074h = "google.c.a.abt";

        /* renamed from: i */
        public static final String f25075i = "google.c.a.m_l";

        /* renamed from: j */
        public static final String f25076j = "google.c.a.m_c";
    }

    /* renamed from: com.google.firebase.messaging.b$b */
    public static final class C4313b {

        /* renamed from: a */
        public static final String f25077a = "FCM_CLIENT_EVENT_LOGGING";
    }

    /* renamed from: com.google.firebase.messaging.b$c */
    public static final class C4314c {

        /* renamed from: A */
        public static final String f25078A = "gcm.n.click_action";

        /* renamed from: B */
        public static final String f25079B = "gcm.n.link";

        /* renamed from: C */
        public static final String f25080C = "gcm.n.link_android";

        /* renamed from: D */
        public static final String f25081D = "gcm.n.android_channel_id";

        /* renamed from: E */
        public static final String f25082E = "gcm.n.analytics_data";

        /* renamed from: F */
        public static final String f25083F = "_loc_key";

        /* renamed from: G */
        public static final String f25084G = "_loc_args";

        /* renamed from: a */
        public static final String f25085a = "gcm.";

        /* renamed from: b */
        public static final String f25086b = "gcm.n.";

        /* renamed from: c */
        public static final String f25087c = "gcm.notification.";

        /* renamed from: d */
        public static final String f25088d = "gcm.n.e";

        /* renamed from: e */
        public static final String f25089e = "gcm.n.dnp";

        /* renamed from: f */
        public static final String f25090f = "gcm.n.noui";

        /* renamed from: g */
        public static final String f25091g = "gcm.n.title";

        /* renamed from: h */
        public static final String f25092h = "gcm.n.body";

        /* renamed from: i */
        public static final String f25093i = "gcm.n.icon";

        /* renamed from: j */
        public static final String f25094j = "gcm.n.image";

        /* renamed from: k */
        public static final String f25095k = "gcm.n.tag";

        /* renamed from: l */
        public static final String f25096l = "gcm.n.color";

        /* renamed from: m */
        public static final String f25097m = "gcm.n.ticker";

        /* renamed from: n */
        public static final String f25098n = "gcm.n.local_only";

        /* renamed from: o */
        public static final String f25099o = "gcm.n.sticky";

        /* renamed from: p */
        public static final String f25100p = "gcm.n.notification_priority";

        /* renamed from: q */
        public static final String f25101q = "gcm.n.default_sound";

        /* renamed from: r */
        public static final String f25102r = "gcm.n.default_vibrate_timings";

        /* renamed from: s */
        public static final String f25103s = "gcm.n.default_light_settings";

        /* renamed from: t */
        public static final String f25104t = "gcm.n.notification_count";

        /* renamed from: u */
        public static final String f25105u = "gcm.n.visibility";

        /* renamed from: v */
        public static final String f25106v = "gcm.n.vibrate_timings";

        /* renamed from: w */
        public static final String f25107w = "gcm.n.light_settings";

        /* renamed from: x */
        public static final String f25108x = "gcm.n.event_time";

        /* renamed from: y */
        public static final String f25109y = "gcm.n.sound2";

        /* renamed from: z */
        public static final String f25110z = "gcm.n.sound";
    }

    /* renamed from: com.google.firebase.messaging.b$d */
    public static final class C4315d {

        /* renamed from: a */
        public static final String f25111a = "google.";

        /* renamed from: b */
        public static final String f25112b = "from";

        /* renamed from: c */
        public static final String f25113c = "rawData";

        /* renamed from: d */
        public static final String f25114d = "message_type";

        /* renamed from: e */
        public static final String f25115e = "collapse_key";

        /* renamed from: f */
        public static final String f25116f = "message_id";

        /* renamed from: g */
        public static final String f25117g = "google.to";

        /* renamed from: h */
        public static final String f25118h = "google.message_id";

        /* renamed from: i */
        public static final String f25119i = "google.ttl";

        /* renamed from: j */
        public static final String f25120j = "google.sent_time";

        /* renamed from: k */
        public static final String f25121k = "google.original_priority";

        /* renamed from: l */
        public static final String f25122l = "google.delivered_priority";

        /* renamed from: m */
        public static final String f25123m = "google.priority";

        /* renamed from: n */
        public static final String f25124n = "google.priority_reduced";

        /* renamed from: o */
        public static final String f25125o = "google.c.";

        /* renamed from: p */
        public static final String f25126p = "google.c.sender.id";

        /* renamed from: a */
        public static C3042oa<String, String> m34746a(Bundle bundle) {
            C3042oa<String, String> oaVar = new C3042oa<>();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith(f25111a) && !str.startsWith(C4314c.f25085a) && !str.equals("from") && !str.equals(f25114d) && !str.equals(f25115e)) {
                        oaVar.put(str, str2);
                    }
                }
            }
            return oaVar;
        }
    }

    /* renamed from: com.google.firebase.messaging.b$e */
    public static final class C4316e {

        /* renamed from: a */
        public static final String f25127a = "gcm";

        /* renamed from: b */
        public static final String f25128b = "deleted_messages";

        /* renamed from: c */
        public static final String f25129c = "send_event";

        /* renamed from: d */
        public static final String f25130d = "send_error";
    }

    /* renamed from: com.google.firebase.messaging.b$f */
    public static final class C4317f {

        /* renamed from: a */
        public static final String f25131a = "fcm";

        /* renamed from: b */
        public static final String f25132b = "source";

        /* renamed from: c */
        public static final String f25133c = "medium";

        /* renamed from: d */
        public static final String f25134d = "label";

        /* renamed from: e */
        public static final String f25135e = "_nt";

        /* renamed from: f */
        public static final String f25136f = "campaign";

        /* renamed from: g */
        public static final String f25137g = "_nmn";

        /* renamed from: h */
        public static final String f25138h = "_nmt";

        /* renamed from: i */
        public static final String f25139i = "_ndt";

        /* renamed from: j */
        public static final String f25140j = "message_channel";

        /* renamed from: k */
        public static final String f25141k = "_nmc";

        /* renamed from: l */
        public static final String f25142l = "_cmp";

        /* renamed from: m */
        public static final String f25143m = "_nr";

        /* renamed from: n */
        public static final String f25144n = "_no";

        /* renamed from: o */
        public static final String f25145o = "_nd";

        /* renamed from: p */
        public static final String f25146p = "_nf";

        /* renamed from: q */
        public static final String f25147q = "_ln";

        /* renamed from: r */
        public static final String f25148r = "_nmid";

        /* renamed from: com.google.firebase.messaging.b$f$a */
        public @interface C4318a {

            /* renamed from: a */
            public static final String f25149a = "data";

            /* renamed from: b */
            public static final String f25150b = "display";
        }
    }
}
