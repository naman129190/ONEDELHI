package com.onedelhi.secure;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.GoogleSignatureVerifier;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.UidVerifier;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.messaging.C4311b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

public final class bd6 extends t36 {

    /* renamed from: a */
    public final qq6 f9796a;

    /* renamed from: a */
    public Boolean f9797a;

    /* renamed from: b */
    public String f9798b = null;

    public bd6(qq6 qq6, String str) {
        Preconditions.checkNotNull(qq6);
        this.f9796a = qq6;
    }

    @C4101zk
    /* renamed from: B2 */
    public final void mo13642B2(wq6 wq6, uy6 uy6) {
        Preconditions.checkNotNull(wq6);
        mo13662q8(uy6, false);
        mo13661p8(new pc6(this, wq6, uy6));
    }

    @C4101zk
    /* renamed from: C4 */
    public final void mo13643C4(fc5 fc5) {
        Preconditions.checkNotNull(fc5);
        Preconditions.checkNotNull(fc5.f12016a);
        Preconditions.checkNotEmpty(fc5.f12020b);
        mo13663r8(fc5.f12020b, true);
        mo13661p8(new ib6(this, new fc5(fc5)));
    }

    @C4101zk
    /* renamed from: D2 */
    public final List mo13644D2(String str, String str2, uy6 uy6) {
        mo13662q8(uy6, false);
        String str3 = uy6.f21557b;
        Preconditions.checkNotNull(str3);
        try {
            return (List) this.f9796a.mo15135d().mo23062s(new rb6(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.f9796a.mo15136e().mo12726r().mo25380b("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }

    @C4101zk
    /* renamed from: E1 */
    public final List mo13645E1(uy6 uy6, boolean z) {
        mo13662q8(uy6, false);
        String str = uy6.f21557b;
        Preconditions.checkNotNull(str);
        try {
            List<ar6> list = (List) this.f9796a.mo15135d().mo23062s(new sc6(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (ar6 ar6 : list) {
                if (z || !gr6.m16175Y(ar6.f9510c)) {
                    arrayList.add(new wq6(ar6));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f9796a.mo15136e().mo12726r().mo25381c("Failed to get user properties. appId", a56.m10802z(uy6.f21557b), e);
            return null;
        }
    }

    @C4101zk
    /* renamed from: I2 */
    public final void mo13646I2(uy6 uy6) {
        mo13662q8(uy6, false);
        mo13661p8(new ac6(this, uy6));
    }

    @C4101zk
    /* renamed from: I4 */
    public final List mo13647I4(String str, String str2, String str3, boolean z) {
        mo13663r8(str, true);
        try {
            List<ar6> list = (List) this.f9796a.mo15135d().mo23062s(new ob6(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (ar6 ar6 : list) {
                if (z || !gr6.m16175Y(ar6.f9510c)) {
                    arrayList.add(new wq6(ar6));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f9796a.mo15136e().mo12726r().mo25381c("Failed to get user properties as. appId", a56.m10802z(str), e);
            return Collections.emptyList();
        }
    }

    @C4101zk
    /* renamed from: R0 */
    public final String mo13648R0(uy6 uy6) {
        mo13662q8(uy6, false);
        return this.f9796a.mo23386j0(uy6);
    }

    @C4101zk
    /* renamed from: T0 */
    public final void mo13649T0(xj5 xj5, uy6 uy6) {
        Preconditions.checkNotNull(xj5);
        mo13662q8(uy6, false);
        mo13661p8(new gc6(this, xj5, uy6));
    }

    @C4101zk
    /* renamed from: T3 */
    public final void mo13650T3(Bundle bundle, uy6 uy6) {
        mo13662q8(uy6, false);
        String str = uy6.f21557b;
        Preconditions.checkNotNull(str);
        mo13661p8(new cb6(this, str, bundle));
    }

    @C4101zk
    /* renamed from: V4 */
    public final void mo13651V4(uy6 uy6) {
        Preconditions.checkNotEmpty(uy6.f21557b);
        mo13663r8(uy6.f21557b, false);
        mo13661p8(new xb6(this, uy6));
    }

    @C4101zk
    /* renamed from: Z5 */
    public final void mo13652Z5(xj5 xj5, String str, String str2) {
        Preconditions.checkNotNull(xj5);
        Preconditions.checkNotEmpty(str);
        mo13663r8(str, true);
        mo13661p8(new jc6(this, xj5, str));
    }

    @C4101zk
    /* renamed from: f7 */
    public final List mo13653f7(String str, String str2, String str3) {
        mo13663r8(str, true);
        try {
            return (List) this.f9796a.mo15135d().mo23062s(new ub6(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.f9796a.mo15136e().mo12726r().mo25380b("Failed to get conditional user properties as", e);
            return Collections.emptyList();
        }
    }

    @C4101zk
    /* renamed from: i7 */
    public final List mo13654i7(String str, String str2, boolean z, uy6 uy6) {
        mo13662q8(uy6, false);
        String str3 = uy6.f21557b;
        Preconditions.checkNotNull(str3);
        try {
            List<ar6> list = (List) this.f9796a.mo15135d().mo23062s(new lb6(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (ar6 ar6 : list) {
                if (z || !gr6.m16175Y(ar6.f9510c)) {
                    arrayList.add(new wq6(ar6));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f9796a.mo15136e().mo12726r().mo25381c("Failed to query user properties. appId", a56.m10802z(uy6.f21557b), e);
            return Collections.emptyList();
        }
    }

    /* renamed from: k8 */
    public final void mo13655k8(xj5 xj5, uy6 uy6) {
        this.f9796a.mo23375b();
        this.f9796a.mo23385j(xj5, uy6);
    }

    @VisibleForTesting
    /* renamed from: l8 */
    public final xj5 mo13656l8(xj5 xj5, uy6 uy6) {
        hj5 hj5;
        if (!(!C4311b.C4317f.f25142l.equals(xj5.f22604b) || (hj5 = xj5.f22602a) == null || hj5.zza() == 0)) {
            String P2 = xj5.f22602a.mo17318P2("_cis");
            if ("referrer broadcast".equals(P2) || "referrer API".equals(P2)) {
                this.f9796a.mo15136e().mo12729u().mo25380b("Event has been filtered ", xj5.toString());
                return new xj5("_cmpx", xj5.f22602a, xj5.f22605c, xj5.f22603b);
            }
        }
        return xj5;
    }

    @C4101zk
    /* renamed from: m2 */
    public final void mo13657m2(uy6 uy6) {
        mo13662q8(uy6, false);
        mo13661p8(new vc6(this, uy6));
    }

    /* renamed from: n8 */
    public final void mo13658n8(xj5 xj5, uy6 uy6) {
        u46 v;
        String str;
        String str2;
        if (!this.f9796a.mo23374a0().mo13569C(uy6.f21557b)) {
            mo13655k8(xj5, uy6);
            return;
        }
        this.f9796a.mo15136e().mo12730v().mo25380b("EES config found for", uy6.f21557b);
        b96 a0 = this.f9796a.mo23374a0();
        String str3 = uy6.f21557b;
        wr5 wr5 = TextUtils.isEmpty(str3) ? null : (wr5) a0.f9769a.mo20268f(str3);
        if (wr5 != null) {
            try {
                Map I = this.f9796a.mo23380g0().mo25698I(xj5.f22602a.mo17314L2(), true);
                String a = le6.m20590a(xj5.f22604b);
                if (a == null) {
                    a = xj5.f22604b;
                }
                if (wr5.mo26667e(new mb5(a, xj5.f22603b, I))) {
                    if (wr5.mo26669g()) {
                        this.f9796a.mo15136e().mo12730v().mo25380b("EES edited event", xj5.f22604b);
                        xj5 = this.f9796a.mo23380g0().mo25692A(wr5.mo26663a().mo27901b());
                    }
                    mo13655k8(xj5, uy6);
                    if (wr5.mo26668f()) {
                        for (mb5 mb5 : wr5.mo26663a().mo27902c()) {
                            this.f9796a.mo15136e().mo12730v().mo25380b("EES logging created event", mb5.mo20286d());
                            mo13655k8(this.f9796a.mo23380g0().mo25692A(mb5), uy6);
                        }
                        return;
                    }
                    return;
                }
            } catch (bx5 unused) {
                this.f9796a.mo15136e().mo12726r().mo25381c("EES error. appId, eventName", uy6.f21560c, xj5.f22604b);
            }
            v = this.f9796a.mo15136e().mo12730v();
            str = xj5.f22604b;
            str2 = "EES was not applied to event";
        } else {
            v = this.f9796a.mo15136e().mo12730v();
            str = uy6.f21557b;
            str2 = "EES not loaded for";
        }
        v.mo25380b(str2, str);
        mo13655k8(xj5, uy6);
    }

    @C4101zk
    /* renamed from: o3 */
    public final void mo13659o3(uy6 uy6) {
        Preconditions.checkNotEmpty(uy6.f21557b);
        Preconditions.checkNotNull(uy6.f21576j);
        dc6 dc6 = new dc6(this, uy6);
        Preconditions.checkNotNull(dc6);
        if (this.f9796a.mo15135d().mo23059C()) {
            dc6.run();
        } else {
            this.f9796a.mo15135d().mo23058A(dc6);
        }
    }

    /* renamed from: o8 */
    public final /* synthetic */ void mo13660o8(String str, Bundle bundle) {
        vg5 W = this.f9796a.mo23370W();
        W.mo15139h();
        W.mo27038i();
        byte[] h = W.f21907a.mo23380g0().mo25693B(new ji5(W.f11205a, "", str, "dep", 0, 0, bundle)).mo22497h();
        W.f11205a.mo15136e().mo12730v().mo25381c("Saving default event parameters, appId, data size", W.f11205a.mo27862D().mo19280d(str), Integer.valueOf(h.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put(C7508zn.f38387b, h);
        try {
            if (W.mo26063P().insertWithOnConflict("default_event_params", (String) null, contentValues, 5) == -1) {
                W.f11205a.mo15136e().mo12726r().mo25380b("Failed to insert default event parameters (got -1). appId", a56.m10802z(str));
            }
        } catch (SQLiteException e) {
            W.f11205a.mo15136e().mo12726r().mo25381c("Error storing default event parameters. appId", a56.m10802z(str), e);
        }
    }

    @VisibleForTesting
    /* renamed from: p8 */
    public final void mo13661p8(Runnable runnable) {
        Preconditions.checkNotNull(runnable);
        if (this.f9796a.mo15135d().mo23059C()) {
            runnable.run();
        } else {
            this.f9796a.mo15135d().mo23065z(runnable);
        }
    }

    @C4101zk
    /* renamed from: q8 */
    public final void mo13662q8(uy6 uy6, boolean z) {
        Preconditions.checkNotNull(uy6);
        Preconditions.checkNotEmpty(uy6.f21557b);
        mo13663r8(uy6.f21557b, false);
        this.f9796a.mo23382h0().mo16862M(uy6.f21560c, uy6.f21574h);
    }

    @C4101zk
    /* renamed from: r8 */
    public final void mo13663r8(String str, boolean z) {
        boolean z2;
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                try {
                    if (this.f9797a == null) {
                        if (!"com.google.android.gms".equals(this.f9798b) && !UidVerifier.isGooglePlayServicesUid(this.f9796a.mo15137f(), Binder.getCallingUid())) {
                            if (!GoogleSignatureVerifier.getInstance(this.f9796a.mo15137f()).isUidGoogleSigned(Binder.getCallingUid())) {
                                z2 = false;
                                this.f9797a = Boolean.valueOf(z2);
                            }
                        }
                        z2 = true;
                        this.f9797a = Boolean.valueOf(z2);
                    }
                    if (this.f9797a.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e) {
                    this.f9796a.mo15136e().mo12726r().mo25380b("Measurement Service called with invalid calling package. appId", a56.m10802z(str));
                    throw e;
                }
            }
            if (this.f9798b == null && GooglePlayServicesUtilLight.uidHasPackageName(this.f9796a.mo15137f(), Binder.getCallingUid(), str)) {
                this.f9798b = str;
            }
            if (!str.equals(this.f9798b)) {
                throw new SecurityException(String.format("Unknown calling package name '%s'.", new Object[]{str}));
            }
            return;
        }
        this.f9796a.mo15136e().mo12726r().mo25379a("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    @C4101zk
    /* renamed from: u3 */
    public final void mo13664u3(fc5 fc5, uy6 uy6) {
        Preconditions.checkNotNull(fc5);
        Preconditions.checkNotNull(fc5.f12016a);
        mo13662q8(uy6, false);
        fc5 fc52 = new fc5(fc5);
        fc52.f12020b = uy6.f21557b;
        mo13661p8(new fb6(this, fc52, uy6));
    }

    @C4101zk
    /* renamed from: w4 */
    public final byte[] mo13665w4(xj5 xj5, String str) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(xj5);
        mo13663r8(str, true);
        this.f9796a.mo15136e().mo12725q().mo25380b("Log and bundle. event", this.f9796a.mo23371X().mo19280d(xj5.f22604b));
        long nanoTime = this.f9796a.mo15133a().nanoTime() / zv0.f38454a;
        try {
            byte[] bArr = (byte[]) this.f9796a.mo15135d().mo23063t(new mc6(this, xj5, str)).get();
            if (bArr == null) {
                this.f9796a.mo15136e().mo12726r().mo25380b("Log and bundle returned null. appId", a56.m10802z(str));
                bArr = new byte[0];
            }
            this.f9796a.mo15136e().mo12725q().mo25382d("Log and bundle processed. event, size, time_ms", this.f9796a.mo23371X().mo19280d(xj5.f22604b), Integer.valueOf(bArr.length), Long.valueOf((this.f9796a.mo15133a().nanoTime() / zv0.f38454a) - nanoTime));
            return bArr;
        } catch (InterruptedException | ExecutionException e) {
            this.f9796a.mo15136e().mo12726r().mo25382d("Failed to log and bundle. appId, event, error", a56.m10802z(str), this.f9796a.mo23371X().mo19280d(xj5.f22604b), e);
            return null;
        }
    }

    @C4101zk
    /* renamed from: y3 */
    public final void mo13666y3(long j, String str, String str2, String str3) {
        mo13661p8(new yc6(this, str2, str3, str, j));
    }
}
