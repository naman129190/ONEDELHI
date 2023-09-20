package com.onedelhi.secure;

import android.content.pm.PackageManager;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public final class sm6 extends xo6 {

    /* renamed from: a */
    public final e76 f20432a;

    /* renamed from: a */
    public final Map f20433a = new HashMap();

    /* renamed from: b */
    public final e76 f20434b;

    /* renamed from: c */
    public final e76 f20435c;

    /* renamed from: d */
    public final e76 f20436d;

    /* renamed from: e */
    public final e76 f20437e;

    public sm6(qq6 qq6) {
        super(qq6);
        q76 F = this.f11205a.mo27864F();
        F.getClass();
        this.f20432a = new e76(F, "last_delete_stale", 0);
        q76 F2 = this.f11205a.mo27864F();
        F2.getClass();
        this.f20434b = new e76(F2, "backoff", 0);
        q76 F3 = this.f11205a.mo27864F();
        F3.getClass();
        this.f20435c = new e76(F3, "last_upload", 0);
        q76 F4 = this.f11205a.mo27864F();
        F4.getClass();
        this.f20436d = new e76(F4, "last_upload_attempt", 0);
        q76 F5 = this.f11205a.mo27864F();
        F5.getClass();
        this.f20437e = new e76(F5, "midnight_offset", 0);
    }

    /* renamed from: l */
    public final boolean mo13582l() {
        return false;
    }

    @Deprecated
    @ly4
    /* renamed from: m */
    public final Pair mo24482m(String str) {
        qm6 qm6;
        mo15139h();
        long elapsedRealtime = this.f11205a.mo15133a().elapsedRealtime();
        qm6 qm62 = (qm6) this.f20433a.get(str);
        if (qm62 != null && elapsedRealtime < qm62.f19256a) {
            return new Pair(qm62.f19257a, Boolean.valueOf(qm62.f19258a));
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        long r = this.f11205a.mo27891z().mo14125r(str, n36.f17043a) + elapsedRealtime;
        try {
            long r2 = this.f11205a.mo27891z().mo14125r(str, n36.f17047b);
            AdvertisingIdClient.Info info = null;
            if (r2 > 0) {
                try {
                    info = AdvertisingIdClient.getAdvertisingIdInfo(this.f11205a.mo15137f());
                } catch (PackageManager.NameNotFoundException unused) {
                    if (qm62 != null) {
                        if (elapsedRealtime < qm62.f19256a + r2) {
                            return new Pair(qm62.f19257a, Boolean.valueOf(qm62.f19258a));
                        }
                    }
                }
            } else {
                info = AdvertisingIdClient.getAdvertisingIdInfo(this.f11205a.mo15137f());
            }
            if (info == null) {
                return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
            }
            String id = info.getId();
            qm6 = id != null ? new qm6(id, info.isLimitAdTrackingEnabled(), r) : new qm6("", info.isLimitAdTrackingEnabled(), r);
            this.f20433a.put(str, qm6);
            AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
            return new Pair(qm6.f19257a, Boolean.valueOf(qm6.f19258a));
        } catch (Exception e) {
            this.f11205a.mo15136e().mo12725q().mo25380b("Unable to get advertising id", e);
            qm6 = new qm6("", false, r);
        }
    }

    @ly4
    /* renamed from: n */
    public final Pair mo24483n(String str, ye5 ye5) {
        return ye5.mo27438i(ne5.AD_STORAGE) ? mo24482m(str) : new Pair("", Boolean.FALSE);
    }

    @Deprecated
    @ly4
    /* renamed from: o */
    public final String mo24484o(String str, boolean z) {
        mo15139h();
        String str2 = z ? (String) mo24482m(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest t = gr6.m16185t();
        if (t == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, t.digest(str2.getBytes()))});
    }
}
