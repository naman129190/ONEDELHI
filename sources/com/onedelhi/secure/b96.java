package com.onedelhi.secure;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class b96 extends xo6 implements qd5 {

    /* renamed from: a */
    public final h07 f9768a = new v86(this);
    @VisibleForTesting

    /* renamed from: a */
    public final mb2 f9769a = new s86(this, 20);

    /* renamed from: a */
    public final Map f9770a = new C3042oa();
    @VisibleForTesting

    /* renamed from: b */
    public final Map f9771b = new C3042oa();
    @VisibleForTesting

    /* renamed from: c */
    public final Map f9772c = new C3042oa();
    @VisibleForTesting

    /* renamed from: d */
    public final Map f9773d = new C3042oa();

    /* renamed from: e */
    public final Map f9774e = new C3042oa();

    /* renamed from: f */
    public final Map f9775f = new C3042oa();

    /* renamed from: g */
    public final Map f9776g = new C3042oa();

    /* renamed from: h */
    public final Map f9777h = new C3042oa();

    /* renamed from: i */
    public final Map f9778i = new C3042oa();

    public b96(qq6 qq6) {
        super(qq6);
    }

    /* renamed from: q */
    public static final Map m11725q(g76 g76) {
        C3042oa oaVar = new C3042oa();
        if (g76 != null) {
            for (s76 s76 : g76.mo16380P()) {
                oaVar.put(s76.mo24261C(), s76.mo24262D());
            }
        }
        return oaVar;
    }

    /* renamed from: s */
    public static /* bridge */ /* synthetic */ wr5 m11726s(b96 b96, String str) {
        b96.mo27038i();
        Preconditions.checkNotEmpty(str);
        if (!b96.mo13569C(str)) {
            return null;
        }
        if (!b96.f9774e.containsKey(str) || b96.f9774e.get(str) == null) {
            b96.mo13585o(str);
        } else {
            b96.mo13586p(str, (g76) b96.f9774e.get(str));
        }
        return (wr5) b96.f9769a.mo20279q().get(str);
    }

    @ly4
    /* renamed from: A */
    public final void mo13567A(String str) {
        mo15139h();
        this.f9774e.remove(str);
    }

    @ly4
    /* renamed from: B */
    public final boolean mo13568B(String str) {
        mo15139h();
        g76 t = mo13588t(str);
        if (t == null) {
            return false;
        }
        return t.mo16381S();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r3 = (com.onedelhi.secure.g76) r2.f9774e.get(r3);
     */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo13569C(java.lang.String r3) {
        /*
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            java.util.Map r0 = r2.f9774e
            java.lang.Object r3 = r0.get(r3)
            com.onedelhi.secure.g76 r3 = (com.onedelhi.secure.g76) r3
            if (r3 != 0) goto L_0x0013
            return r1
        L_0x0013:
            int r3 = r3.mo16369B()
            if (r3 == 0) goto L_0x001b
            r3 = 1
            return r3
        L_0x001b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.b96.mo13569C(java.lang.String):boolean");
    }

    /* renamed from: D */
    public final boolean mo13570D(String str) {
        return mm0.f16219f.equals(mo13581b(str, "measurement.upload.blacklist_internal"));
    }

    @ly4
    /* renamed from: E */
    public final boolean mo13571E(String str, String str2) {
        Boolean bool;
        mo15139h();
        mo13585o(str);
        if ("ecommerce_purchase".equals(str2) || FirebaseAnalytics.C4304c.f24900D.equals(str2) || FirebaseAnalytics.C4304c.f24901E.equals(str2)) {
            return true;
        }
        Map map = (Map) this.f9773d.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @ly4
    /* renamed from: F */
    public final boolean mo13572F(String str, String str2) {
        Boolean bool;
        mo15139h();
        mo13585o(str);
        if (mo13570D(str) && gr6.m16175Y(str2)) {
            return true;
        }
        if (mo13573G(str) && gr6.m16176Z(str2)) {
            return true;
        }
        Map map = (Map) this.f9772c.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: G */
    public final boolean mo13573G(String str) {
        return mm0.f16219f.equals(mo13581b(str, "measurement.upload.blacklist_public"));
    }

    @ly4
    /* renamed from: H */
    public final boolean mo13574H(String str, byte[] bArr, String str2, String str3) {
        mo27038i();
        mo15139h();
        Preconditions.checkNotEmpty(str);
        d76 d76 = (d76) mo13583m(str, bArr).mo18543k();
        mo13584n(str, d76);
        mo13586p(str, (g76) d76.mo17922m());
        this.f9774e.put(str, (g76) d76.mo17922m());
        this.f9776g.put(str, d76.mo14547u());
        this.f9777h.put(str, str2);
        this.f9778i.put(str, str3);
        this.f9770a.put(str, m11725q((g76) d76.mo17922m()));
        this.f21907a.mo23370W().mo26082n(str, new ArrayList(d76.mo14548v()));
        try {
            d76.mo14545s();
            bArr = ((g76) d76.mo17922m()).mo22497h();
        } catch (RuntimeException e) {
            this.f11205a.mo15136e().mo12731w().mo25381c("Unable to serialize reduced-size config. Storing full config instead. appId", a56.m10802z(str), e);
        }
        vg5 W = this.f21907a.mo23370W();
        Preconditions.checkNotEmpty(str);
        W.mo15139h();
        W.mo27038i();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        contentValues.put("e_tag", str3);
        try {
            if (((long) W.mo26063P().update("apps", contentValues, "app_id = ?", new String[]{str})) == 0) {
                W.f11205a.mo15136e().mo12726r().mo25380b("Failed to update remote config (got 0). appId", a56.m10802z(str));
            }
        } catch (SQLiteException e2) {
            W.f11205a.mo15136e().mo12726r().mo25381c("Error storing remote config. appId", a56.m10802z(str), e2);
        }
        this.f9774e.put(str, (g76) d76.mo17922m());
        return true;
    }

    @ly4
    /* renamed from: I */
    public final boolean mo13575I(String str) {
        mo15139h();
        mo13585o(str);
        return this.f9771b.get(str) != null && ((Set) this.f9771b.get(str)).contains("app_instance_id");
    }

    @ly4
    /* renamed from: J */
    public final boolean mo13576J(String str) {
        mo15139h();
        mo13585o(str);
        return this.f9771b.get(str) != null && (((Set) this.f9771b.get(str)).contains("device_model") || ((Set) this.f9771b.get(str)).contains("device_info"));
    }

    @ly4
    /* renamed from: K */
    public final boolean mo13577K(String str) {
        mo15139h();
        mo13585o(str);
        return this.f9771b.get(str) != null && ((Set) this.f9771b.get(str)).contains("enhanced_user_id");
    }

    @ly4
    /* renamed from: L */
    public final boolean mo13578L(String str) {
        mo15139h();
        mo13585o(str);
        return this.f9771b.get(str) != null && ((Set) this.f9771b.get(str)).contains("google_signals");
    }

    @ly4
    /* renamed from: M */
    public final boolean mo13579M(String str) {
        mo15139h();
        mo13585o(str);
        return this.f9771b.get(str) != null && (((Set) this.f9771b.get(str)).contains("os_version") || ((Set) this.f9771b.get(str)).contains("device_info"));
    }

    @ly4
    /* renamed from: N */
    public final boolean mo13580N(String str) {
        mo15139h();
        mo13585o(str);
        return this.f9771b.get(str) != null && ((Set) this.f9771b.get(str)).contains("user_id");
    }

    @ly4
    /* renamed from: b */
    public final String mo13581b(String str, String str2) {
        mo15139h();
        mo13585o(str);
        Map map = (Map) this.f9770a.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    /* renamed from: l */
    public final boolean mo13582l() {
        return false;
    }

    @ly4
    /* renamed from: m */
    public final g76 mo13583m(String str, byte[] bArr) {
        if (bArr == null) {
            return g76.m15571H();
        }
        try {
            g76 g76 = (g76) ((d76) uq6.m29499C(g76.m15569F(), bArr)).mo17922m();
            u46 v = this.f11205a.mo15136e().mo12730v();
            String str2 = null;
            Long valueOf = g76.mo16383U() ? Long.valueOf(g76.mo16371D()) : null;
            if (g76.mo16382T()) {
                str2 = g76.mo16373I();
            }
            v.mo25381c("Parsed config. version, gmp_app_id", valueOf, str2);
            return g76;
        } catch (dr6 | RuntimeException e) {
            this.f11205a.mo15136e().mo12731w().mo25381c("Unable to merge remote config. appId", a56.m10802z(str), e);
            return g76.m15571H();
        }
    }

    /* renamed from: n */
    public final void mo13584n(String str, d76 d76) {
        HashSet hashSet = new HashSet();
        C3042oa oaVar = new C3042oa();
        C3042oa oaVar2 = new C3042oa();
        C3042oa oaVar3 = new C3042oa();
        for (u66 C : d76.mo14549w()) {
            hashSet.add(C.mo25383C());
        }
        for (int i = 0; i < d76.mo14543q(); i++) {
            x66 x66 = (x66) d76.mo14544r(i).mo18543k();
            if (x66.mo26799s().isEmpty()) {
                this.f11205a.mo15136e().mo12731w().mo25379a("EventConfig contained null event name");
            } else {
                String s = x66.mo26799s();
                String b = le6.m20591b(x66.mo26799s());
                if (!TextUtils.isEmpty(b)) {
                    x66.mo26798r(b);
                    d76.mo14546t(i, x66);
                }
                if (x66.mo26802v() && x66.mo26800t()) {
                    oaVar.put(s, Boolean.TRUE);
                }
                if (x66.mo26803w() && x66.mo26801u()) {
                    oaVar2.put(x66.mo26799s(), Boolean.TRUE);
                }
                if (x66.mo26804x()) {
                    if (x66.mo26797q() < 2 || x66.mo26797q() > 65535) {
                        this.f11205a.mo15136e().mo12731w().mo25381c("Invalid sampling rate. Event name, sample rate", x66.mo26799s(), Integer.valueOf(x66.mo26797q()));
                    } else {
                        oaVar3.put(x66.mo26799s(), Integer.valueOf(x66.mo26797q()));
                    }
                }
            }
        }
        this.f9771b.put(str, hashSet);
        this.f9772c.put(str, oaVar);
        this.f9773d.put(str, oaVar2);
        this.f9775f.put(str, oaVar3);
    }

    /* JADX WARNING: type inference failed for: r1v8, types: [java.lang.String] */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0094, code lost:
        if (r2 != null) goto L_0x0096;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0115  */
    @com.onedelhi.secure.ly4
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13585o(java.lang.String r13) {
        /*
            r12 = this;
            r12.mo27038i()
            r12.mo15139h()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r13)
            java.util.Map r0 = r12.f9774e
            java.lang.Object r0 = r0.get(r13)
            if (r0 != 0) goto L_0x0119
            com.onedelhi.secure.qq6 r0 = r12.f21907a
            com.onedelhi.secure.vg5 r0 = r0.mo23370W()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r13)
            r0.mo15139h()
            r0.mo27038i()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r0.mo26063P()     // Catch:{ SQLiteException -> 0x007e, all -> 0x007b }
            java.lang.String r3 = "apps"
            java.lang.String r4 = "remote_config"
            java.lang.String r5 = "config_last_modified_time"
            java.lang.String r6 = "e_tag"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5, r6}     // Catch:{ SQLiteException -> 0x007e, all -> 0x007b }
            java.lang.String r5 = "app_id=?"
            r10 = 1
            java.lang.String[] r6 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x007e, all -> 0x007b }
            r11 = 0
            r6[r11] = r13     // Catch:{ SQLiteException -> 0x007e, all -> 0x007b }
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SQLiteException -> 0x007e, all -> 0x007b }
            boolean r3 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x0079 }
            if (r3 != 0) goto L_0x0047
            goto L_0x0096
        L_0x0047:
            byte[] r3 = r2.getBlob(r11)     // Catch:{ SQLiteException -> 0x0079 }
            java.lang.String r4 = r2.getString(r10)     // Catch:{ SQLiteException -> 0x0079 }
            r5 = 2
            java.lang.String r5 = r2.getString(r5)     // Catch:{ SQLiteException -> 0x0079 }
            boolean r6 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x0079 }
            if (r6 == 0) goto L_0x006d
            com.onedelhi.secure.za6 r6 = r0.f11205a     // Catch:{ SQLiteException -> 0x0079 }
            com.onedelhi.secure.a56 r6 = r6.mo15136e()     // Catch:{ SQLiteException -> 0x0079 }
            com.onedelhi.secure.u46 r6 = r6.mo12726r()     // Catch:{ SQLiteException -> 0x0079 }
            java.lang.String r7 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r8 = com.onedelhi.secure.a56.m10802z(r13)     // Catch:{ SQLiteException -> 0x0079 }
            r6.mo25380b(r7, r8)     // Catch:{ SQLiteException -> 0x0079 }
        L_0x006d:
            if (r3 != 0) goto L_0x0070
            goto L_0x0096
        L_0x0070:
            com.onedelhi.secure.jf5 r6 = new com.onedelhi.secure.jf5     // Catch:{ SQLiteException -> 0x0079 }
            r6.<init>(r3, r4, r5)     // Catch:{ SQLiteException -> 0x0079 }
            r2.close()
            goto L_0x009a
        L_0x0079:
            r3 = move-exception
            goto L_0x0081
        L_0x007b:
            r13 = move-exception
            goto L_0x0113
        L_0x007e:
            r2 = move-exception
            r3 = r2
            r2 = r1
        L_0x0081:
            com.onedelhi.secure.za6 r0 = r0.f11205a     // Catch:{ all -> 0x0111 }
            com.onedelhi.secure.a56 r0 = r0.mo15136e()     // Catch:{ all -> 0x0111 }
            com.onedelhi.secure.u46 r0 = r0.mo12726r()     // Catch:{ all -> 0x0111 }
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r5 = com.onedelhi.secure.a56.m10802z(r13)     // Catch:{ all -> 0x0111 }
            r0.mo25381c(r4, r5, r3)     // Catch:{ all -> 0x0111 }
            if (r2 == 0) goto L_0x0099
        L_0x0096:
            r2.close()
        L_0x0099:
            r6 = r1
        L_0x009a:
            if (r6 != 0) goto L_0x00ca
            java.util.Map r0 = r12.f9770a
            r0.put(r13, r1)
            java.util.Map r0 = r12.f9772c
            r0.put(r13, r1)
            java.util.Map r0 = r12.f9771b
            r0.put(r13, r1)
            java.util.Map r0 = r12.f9773d
            r0.put(r13, r1)
            java.util.Map r0 = r12.f9774e
            r0.put(r13, r1)
            java.util.Map r0 = r12.f9776g
            r0.put(r13, r1)
            java.util.Map r0 = r12.f9777h
            r0.put(r13, r1)
            java.util.Map r0 = r12.f9778i
            r0.put(r13, r1)
            java.util.Map r0 = r12.f9775f
        L_0x00c6:
            r0.put(r13, r1)
            return
        L_0x00ca:
            byte[] r0 = r6.f14128a
            com.onedelhi.secure.g76 r0 = r12.mo13583m(r13, r0)
            com.onedelhi.secure.ip6 r0 = r0.mo18543k()
            com.onedelhi.secure.d76 r0 = (com.onedelhi.secure.d76) r0
            r12.mo13584n(r13, r0)
            java.util.Map r1 = r12.f9770a
            com.onedelhi.secure.jq6 r2 = r0.mo17922m()
            com.onedelhi.secure.g76 r2 = (com.onedelhi.secure.g76) r2
            java.util.Map r2 = m11725q(r2)
            r1.put(r13, r2)
            java.util.Map r1 = r12.f9774e
            com.onedelhi.secure.jq6 r2 = r0.mo17922m()
            com.onedelhi.secure.g76 r2 = (com.onedelhi.secure.g76) r2
            r1.put(r13, r2)
            com.onedelhi.secure.jq6 r1 = r0.mo17922m()
            com.onedelhi.secure.g76 r1 = (com.onedelhi.secure.g76) r1
            r12.mo13586p(r13, r1)
            java.util.Map r1 = r12.f9776g
            java.lang.String r0 = r0.mo14547u()
            r1.put(r13, r0)
            java.util.Map r0 = r12.f9777h
            java.lang.String r1 = r6.f14127a
            r0.put(r13, r1)
            java.util.Map r0 = r12.f9778i
            java.lang.String r1 = r6.f14129b
            goto L_0x00c6
        L_0x0111:
            r13 = move-exception
            r1 = r2
        L_0x0113:
            if (r1 == 0) goto L_0x0118
            r1.close()
        L_0x0118:
            throw r13
        L_0x0119:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.b96.mo13585o(java.lang.String):void");
    }

    @ly4
    /* renamed from: p */
    public final void mo13586p(String str, g76 g76) {
        if (g76.mo16369B() != 0) {
            this.f11205a.mo15136e().mo12730v().mo25380b("EES programs found", Integer.valueOf(g76.mo16369B()));
            uc6 uc6 = (uc6) g76.mo16379O().get(0);
            try {
                wr5 wr5 = new wr5();
                wr5.mo26666d("internal.remoteConfig", new j86(this, str));
                wr5.mo26666d("internal.appMetadata", new m86(this, str));
                wr5.mo26666d("internal.logger", new p86(this));
                wr5.mo26665c(uc6);
                this.f9769a.mo20272j(str, wr5);
                this.f11205a.mo15136e().mo12730v().mo25381c("EES program loaded for appId, activities", str, Integer.valueOf(uc6.mo25564B().mo17707B()));
                for (oc6 C : uc6.mo25564B().mo17708E()) {
                    this.f11205a.mo15136e().mo12730v().mo25380b("EES program activity", C.mo21866C());
                }
            } catch (bx5 unused) {
                this.f11205a.mo15136e().mo12726r().mo25380b("Failed to load EES program. appId", str);
            }
        } else {
            this.f9769a.mo20274l(str);
        }
    }

    @ly4
    /* renamed from: r */
    public final int mo13587r(String str, String str2) {
        Integer num;
        mo15139h();
        mo13585o(str);
        Map map = (Map) this.f9775f.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    @ly4
    /* renamed from: t */
    public final g76 mo13588t(String str) {
        mo27038i();
        mo15139h();
        Preconditions.checkNotEmpty(str);
        mo13585o(str);
        return (g76) this.f9774e.get(str);
    }

    @ly4
    /* renamed from: u */
    public final String mo13589u(String str) {
        mo15139h();
        return (String) this.f9778i.get(str);
    }

    @ly4
    /* renamed from: v */
    public final String mo13590v(String str) {
        mo15139h();
        return (String) this.f9777h.get(str);
    }

    @ly4
    /* renamed from: w */
    public final String mo13591w(String str) {
        mo15139h();
        mo13585o(str);
        return (String) this.f9776g.get(str);
    }

    @ly4
    /* renamed from: y */
    public final Set mo13592y(String str) {
        mo15139h();
        mo13585o(str);
        return (Set) this.f9771b.get(str);
    }

    @ly4
    /* renamed from: z */
    public final void mo13593z(String str) {
        mo15139h();
        this.f9777h.put(str, (Object) null);
    }
}
