package com.onedelhi.secure;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Map;

public final class jx5 extends h26 {

    /* renamed from: a */
    public long f14607a;

    /* renamed from: a */
    public final Map f14608a = new C3042oa();

    /* renamed from: b */
    public final Map f14609b = new C3042oa();

    public jx5(za6 za6) {
        super(za6);
    }

    /* renamed from: i */
    public static /* synthetic */ void m19243i(jx5 jx5, String str, long j) {
        jx5.mo15139h();
        Preconditions.checkNotEmpty(str);
        if (jx5.f14609b.isEmpty()) {
            jx5.f14607a = j;
        }
        Integer num = (Integer) jx5.f14609b.get(str);
        if (num != null) {
            jx5.f14609b.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (jx5.f14609b.size() >= 100) {
            jx5.f11205a.mo15136e().mo12731w().mo25379a("Too many ads visible");
        } else {
            jx5.f14609b.put(str, 1);
            jx5.f14608a.put(str, Long.valueOf(j));
        }
    }

    /* renamed from: j */
    public static /* synthetic */ void m19244j(jx5 jx5, String str, long j) {
        jx5.mo15139h();
        Preconditions.checkNotEmpty(str);
        Integer num = (Integer) jx5.f14609b.get(str);
        if (num != null) {
            fj6 s = jx5.f11205a.mo27868K().mo26149s(false);
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                jx5.f14609b.remove(str);
                Long l = (Long) jx5.f14608a.get(str);
                if (l == null) {
                    jx5.f11205a.mo15136e().mo12726r().mo25379a("First ad unit exposure time was never set");
                } else {
                    jx5.f14608a.remove(str);
                    jx5.mo18716p(str, j - l.longValue(), s);
                }
                if (jx5.f14609b.isEmpty()) {
                    long j2 = jx5.f14607a;
                    if (j2 == 0) {
                        jx5.f11205a.mo15136e().mo12726r().mo25379a("First ad exposure time was never set");
                        return;
                    }
                    jx5.mo18715o(j - j2, s);
                    jx5.f14607a = 0;
                    return;
                }
                return;
            }
            jx5.f14609b.put(str, Integer.valueOf(intValue));
            return;
        }
        jx5.f11205a.mo15136e().mo12726r().mo25380b("Call to endAdUnitExposure for unknown ad unit id", str);
    }

    /* renamed from: l */
    public final void mo18712l(String str, long j) {
        if (str == null || str.length() == 0) {
            this.f11205a.mo15136e().mo12726r().mo25379a("Ad unit id must be a non-empty string");
        } else {
            this.f11205a.mo15135d().mo23065z(new la5(this, str, j));
        }
    }

    /* renamed from: m */
    public final void mo18713m(String str, long j) {
        if (str == null || str.length() == 0) {
            this.f11205a.mo15136e().mo12726r().mo25379a("Ad unit id must be a non-empty string");
        } else {
            this.f11205a.mo15135d().mo23065z(new ol5(this, str, j));
        }
    }

    @ly4
    /* renamed from: n */
    public final void mo18714n(long j) {
        fj6 s = this.f11205a.mo27868K().mo26149s(false);
        for (String str : this.f14608a.keySet()) {
            mo18716p(str, j - ((Long) this.f14608a.get(str)).longValue(), s);
        }
        if (!this.f14608a.isEmpty()) {
            mo18715o(j - this.f14607a, s);
        }
        mo18717q(j);
    }

    @ly4
    /* renamed from: o */
    public final void mo18715o(long j, fj6 fj6) {
        if (fj6 == null) {
            this.f11205a.mo15136e().mo12730v().mo25379a("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            this.f11205a.mo15136e().mo12730v().mo25380b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            gr6.m16187y(fj6, bundle, true);
            this.f11205a.mo27866I().mo23910u("am", "_xa", bundle);
        }
    }

    @ly4
    /* renamed from: p */
    public final void mo18716p(String str, long j, fj6 fj6) {
        if (fj6 == null) {
            this.f11205a.mo15136e().mo12730v().mo25379a("Not logging ad unit exposure. No active activity");
        } else if (j < 1000) {
            this.f11205a.mo15136e().mo12730v().mo25380b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            gr6.m16187y(fj6, bundle, true);
            this.f11205a.mo27866I().mo23910u("am", "_xu", bundle);
        }
    }

    @ly4
    /* renamed from: q */
    public final void mo18717q(long j) {
        for (String put : this.f14608a.keySet()) {
            this.f14608a.put(put, Long.valueOf(j));
        }
        if (!this.f14608a.isEmpty()) {
            this.f14607a = j;
        }
    }
}
