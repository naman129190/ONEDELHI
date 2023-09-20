package com.onedelhi.secure;

public final class tw6 implements sw6 {

    /* renamed from: a */
    public static final ei6 f21160a;

    /* renamed from: b */
    public static final ei6 f21161b;

    /* renamed from: c */
    public static final ei6 f21162c;

    /* renamed from: d */
    public static final ei6 f21163d;

    static {
        dh6 a = new dh6(gg6.m15836a("com.google.android.gms.measurement")).mo14667a();
        f21160a = a.mo14672f("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f21161b = a.mo14672f("measurement.audience.refresh_event_count_filters_timestamp", false);
        f21162c = a.mo14672f("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f21163d = a.mo14672f("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    /* renamed from: a */
    public final boolean mo24572a() {
        return true;
    }

    /* renamed from: b */
    public final boolean mo24573b() {
        return ((Boolean) f21161b.mo15196b()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo24574c() {
        return ((Boolean) f21162c.mo15196b()).booleanValue();
    }

    /* renamed from: s */
    public final boolean mo24575s() {
        return ((Boolean) f21163d.mo15196b()).booleanValue();
    }
}
