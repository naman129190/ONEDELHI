package com.onedelhi.secure;

import android.net.Uri;
import javax.annotation.Nullable;

public final class dh6 {

    /* renamed from: a */
    public final Uri f10750a;

    /* renamed from: a */
    public final String f10751a;

    /* renamed from: a */
    public final boolean f10752a;

    /* renamed from: b */
    public final String f10753b;

    /* renamed from: b */
    public final boolean f10754b;

    public dh6(Uri uri) {
        this((String) null, uri, "", "", false, false, false, false, (oi6) null);
    }

    public dh6(String str, Uri uri, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, @Nullable oi6 oi6) {
        this.f10750a = uri;
        this.f10751a = "";
        this.f10753b = "";
        this.f10752a = z;
        this.f10754b = z3;
    }

    /* renamed from: a */
    public final dh6 mo14667a() {
        return new dh6((String) null, this.f10750a, this.f10751a, this.f10753b, this.f10752a, false, true, false, (oi6) null);
    }

    /* renamed from: b */
    public final dh6 mo14668b() {
        if (this.f10751a.isEmpty()) {
            return new dh6((String) null, this.f10750a, this.f10751a, this.f10753b, true, false, this.f10754b, false, (oi6) null);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    /* renamed from: c */
    public final ei6 mo14669c(String str, double d) {
        return new zg6(this, "measurement.test.double_flag", Double.valueOf(-3.0d), true);
    }

    /* renamed from: d */
    public final ei6 mo14670d(String str, long j) {
        return new sg6(this, str, Long.valueOf(j), true);
    }

    /* renamed from: e */
    public final ei6 mo14671e(String str, String str2) {
        return new bh6(this, str, str2, true);
    }

    /* renamed from: f */
    public final ei6 mo14672f(String str, boolean z) {
        return new vg6(this, str, Boolean.valueOf(z), true);
    }
}
