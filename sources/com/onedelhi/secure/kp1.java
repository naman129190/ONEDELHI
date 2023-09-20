package com.onedelhi.secure;

import android.os.Bundle;

public final class kp1 {

    /* renamed from: a */
    public static final C7012v5 f31393a = C7012v5.m67717e();

    /* renamed from: a */
    public final Bundle f31394a;

    public kp1() {
        this(new Bundle());
    }

    public kp1(Bundle bundle) {
        this.f31394a = (Bundle) bundle.clone();
    }

    /* renamed from: a */
    public boolean mo39395a(String str) {
        return str != null && this.f31394a.containsKey(str);
    }

    /* renamed from: b */
    public rw2<Boolean> mo39396b(String str) {
        if (!mo39395a(str)) {
            return rw2.m63941a();
        }
        try {
            return rw2.m63942b((Boolean) this.f31394a.get(str));
        } catch (ClassCastException e) {
            f31393a.mo46001b("Metadata key %s contains type other than boolean: %s", str, e.getMessage());
            return rw2.m63941a();
        }
    }

    /* renamed from: c */
    public rw2<Float> mo39397c(String str) {
        if (!mo39395a(str)) {
            return rw2.m63941a();
        }
        try {
            return rw2.m63942b((Float) this.f31394a.get(str));
        } catch (ClassCastException e) {
            f31393a.mo46001b("Metadata key %s contains type other than float: %s", str, e.getMessage());
            return rw2.m63941a();
        }
    }

    /* renamed from: d */
    public final rw2<Integer> mo39398d(String str) {
        if (!mo39395a(str)) {
            return rw2.m63941a();
        }
        try {
            return rw2.m63942b((Integer) this.f31394a.get(str));
        } catch (ClassCastException e) {
            f31393a.mo46001b("Metadata key %s contains type other than int: %s", str, e.getMessage());
            return rw2.m63941a();
        }
    }

    /* renamed from: e */
    public rw2<Long> mo39399e(String str) {
        rw2<Integer> d = mo39398d(str);
        return d.mo44068d() ? rw2.m63943e(Long.valueOf((long) d.mo44067c().intValue())) : rw2.m63941a();
    }
}
