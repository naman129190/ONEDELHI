package com.onedelhi.secure;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.firebase.messaging.C4311b;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class qq6 implements kd6 {

    /* renamed from: a */
    public static volatile qq6 f19404a;

    /* renamed from: a */
    public int f19405a;
    @VisibleForTesting

    /* renamed from: a */
    public long f19406a;

    /* renamed from: a */
    public final b96 f19407a;

    /* renamed from: a */
    public bj6 f19408a;

    /* renamed from: a */
    public final bp6 f19409a;

    /* renamed from: a */
    public db5 f19410a;

    /* renamed from: a */
    public final er6 f19411a = new gq6(this);

    /* renamed from: a */
    public fj6 f19412a;

    /* renamed from: a */
    public final s56 f19413a;

    /* renamed from: a */
    public sm6 f19414a;

    /* renamed from: a */
    public to6 f19415a;

    /* renamed from: a */
    public final uq6 f19416a;

    /* renamed from: a */
    public v66 f19417a;

    /* renamed from: a */
    public vg5 f19418a;

    /* renamed from: a */
    public z76 f19419a;

    /* renamed from: a */
    public final za6 f19420a;

    /* renamed from: a */
    public String f19421a;

    /* renamed from: a */
    public FileChannel f19422a;

    /* renamed from: a */
    public FileLock f19423a;

    /* renamed from: a */
    public List f19424a;

    /* renamed from: a */
    public final Map f19425a;

    /* renamed from: a */
    public boolean f19426a = false;

    /* renamed from: b */
    public int f19427b;

    /* renamed from: b */
    public long f19428b;

    /* renamed from: b */
    public List f19429b;

    /* renamed from: b */
    public final Map f19430b;

    /* renamed from: b */
    public boolean f19431b;

    /* renamed from: c */
    public List f19432c;

    /* renamed from: c */
    public boolean f19433c;

    /* renamed from: d */
    public boolean f19434d;

    /* renamed from: e */
    public boolean f19435e;

    public qq6(sq6 sq6, za6 za6) {
        Preconditions.checkNotNull(sq6);
        this.f19420a = za6.m32969H(sq6.f20493a, (nu5) null, (Long) null);
        this.f19428b = -1;
        this.f19409a = new bp6(this);
        uq6 uq6 = new uq6(this);
        uq6.mo27039j();
        this.f19416a = uq6;
        s56 s56 = new s56(this);
        s56.mo27039j();
        this.f19413a = s56;
        b96 b96 = new b96(this);
        b96.mo27039j();
        this.f19407a = b96;
        this.f19425a = new HashMap();
        this.f19430b = new HashMap();
        mo15135d().mo23065z(new dp6(this, sq6));
    }

    @VisibleForTesting
    /* renamed from: G */
    public static final void m26056G(u86 u86, int i, String str) {
        List F = u86.mo25443F();
        int i2 = 0;
        while (i2 < F.size()) {
            if (!"_err".equals(((j96) F.get(i2)).mo18174H())) {
                i2++;
            } else {
                return;
            }
        }
        g96 F2 = j96.m18221F();
        F2.mo16408z("_err");
        F2.mo16407y(Long.valueOf((long) i).longValue());
        g96 F3 = j96.m18221F();
        F3.mo16408z("_ev");
        F3.mo16398A(str);
        u86.mo25450v((j96) F2.mo17922m());
        u86.mo25450v((j96) F3.mo17922m());
    }

    @VisibleForTesting
    /* renamed from: H */
    public static final void m26057H(u86 u86, @mr2 String str) {
        List F = u86.mo25443F();
        for (int i = 0; i < F.size(); i++) {
            if (str.equals(((j96) F.get(i)).mo18174H())) {
                u86.mo25452x(i);
                return;
            }
        }
    }

    /* renamed from: Q */
    public static final boolean m26058Q(uy6 uy6) {
        return !TextUtils.isEmpty(uy6.f21560c) || !TextUtils.isEmpty(uy6.f21574h);
    }

    /* renamed from: R */
    public static final xo6 m26059R(xo6 xo6) {
        if (xo6 == null) {
            throw new IllegalStateException("Upload Component not created");
        } else if (xo6.mo27040k()) {
            return xo6;
        } else {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(xo6.getClass())));
        }
    }

    /* renamed from: f0 */
    public static qq6 m26061f0(Context context) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (f19404a == null) {
            synchronized (qq6.class) {
                if (f19404a == null) {
                    f19404a = new qq6((sq6) Preconditions.checkNotNull(new sq6(context)), (za6) null);
                }
            }
        }
        return f19404a;
    }

    /* renamed from: k0 */
    public static /* bridge */ /* synthetic */ void m26062k0(qq6 qq6, sq6 sq6) {
        qq6.mo15135d().mo15139h();
        qq6.f19419a = new z76(qq6);
        vg5 vg5 = new vg5(qq6);
        vg5.mo27039j();
        qq6.f19418a = vg5;
        qq6.mo23368U().mo14133z((qd5) Preconditions.checkNotNull(qq6.f19407a));
        sm6 sm6 = new sm6(qq6);
        sm6.mo27039j();
        qq6.f19414a = sm6;
        db5 db5 = new db5(qq6);
        db5.mo27039j();
        qq6.f19410a = db5;
        bj6 bj6 = new bj6(qq6);
        bj6.mo27039j();
        qq6.f19408a = bj6;
        to6 to6 = new to6(qq6);
        to6.mo27039j();
        qq6.f19415a = to6;
        qq6.f19417a = new v66(qq6);
        if (qq6.f19405a != qq6.f19427b) {
            qq6.mo15136e().mo12726r().mo25381c("Not all upload components initialized", Integer.valueOf(qq6.f19405a), Integer.valueOf(qq6.f19427b));
        }
        qq6.f19426a = true;
    }

    @ly4
    /* renamed from: A */
    public final void mo23352A(String str, ye5 ye5) {
        mo15135d().mo15139h();
        mo23379g();
        this.f19425a.put(str, ye5);
        vg5 vg5 = this.f19418a;
        m26059R(vg5);
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(ye5);
        vg5.mo15139h();
        vg5.mo27038i();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", ye5.mo27436h());
        try {
            if (vg5.mo26063P().insertWithOnConflict("consent_settings", (String) null, contentValues, 5) == -1) {
                vg5.f11205a.mo15136e().mo12726r().mo25380b("Failed to insert/update consent setting (got -1). appId", a56.m10802z(str));
            }
        } catch (SQLiteException e) {
            vg5.f11205a.mo15136e().mo12726r().mo25381c("Error storing consent setting. appId, error", a56.m10802z(str), e);
        }
    }

    @ly4
    /* renamed from: B */
    public final void mo23353B(wq6 wq6, uy6 uy6) {
        long j;
        wq6 wq62 = wq6;
        uy6 uy62 = uy6;
        mo15135d().mo15139h();
        mo23379g();
        if (m26058Q(uy6)) {
            if (!uy62.f21558b) {
                mo23366S(uy62);
                return;
            }
            int p0 = mo23382h0().mo16885p0(wq62.f22256b);
            if (p0 != 0) {
                gr6 h0 = mo23382h0();
                String str = wq62.f22256b;
                mo23368U();
                String r = h0.mo16888r(str, 24, true);
                String str2 = wq62.f22256b;
                mo23382h0().mo16852C(this.f19411a, uy62.f21557b, p0, "_ev", r, str2 != null ? str2.length() : 0);
                return;
            }
            int l0 = mo23382h0().mo16879l0(wq62.f22256b, wq6.mo26660K2());
            if (l0 != 0) {
                gr6 h02 = mo23382h0();
                String str3 = wq62.f22256b;
                mo23368U();
                String r2 = h02.mo16888r(str3, 24, true);
                Object K2 = wq6.mo26660K2();
                mo23382h0().mo16852C(this.f19411a, uy62.f21557b, l0, "_ev", r2, (K2 == null || (!(K2 instanceof String) && !(K2 instanceof CharSequence))) ? 0 : K2.toString().length());
                return;
            }
            Object p = mo23382h0().mo16884p(wq62.f22256b, wq6.mo26660K2());
            if (p != null) {
                if ("_sid".equals(wq62.f22256b)) {
                    long j2 = wq62.f22255b;
                    String str4 = wq62.f22258d;
                    String str5 = (String) Preconditions.checkNotNull(uy62.f21557b);
                    vg5 vg5 = this.f19418a;
                    m26059R(vg5);
                    ar6 X = vg5.mo26070X(str5, "_sno");
                    if (X != null) {
                        Object obj = X.f9507a;
                        if (obj instanceof Long) {
                            j = ((Long) obj).longValue();
                            mo23353B(new wq6("_sno", j2, Long.valueOf(j + 1), str4), uy62);
                        }
                    }
                    if (X != null) {
                        mo15136e().mo12731w().mo25380b("Retrieved last session number from database does not contain a valid (long) value", X.f9507a);
                    }
                    vg5 vg52 = this.f19418a;
                    m26059R(vg52);
                    ri5 V = vg52.mo26069V(str5, "_s");
                    if (V != null) {
                        j = V.f19874a;
                        mo15136e().mo12730v().mo25380b("Backfill the session number. Last used session number", Long.valueOf(j));
                    } else {
                        j = 0;
                    }
                    mo23353B(new wq6("_sno", j2, Long.valueOf(j + 1), str4), uy62);
                }
                ar6 ar6 = new ar6((String) Preconditions.checkNotNull(uy62.f21557b), (String) Preconditions.checkNotNull(wq62.f22258d), wq62.f22256b, wq62.f22255b, p);
                mo15136e().mo12730v().mo25381c("Setting user property", this.f19420a.mo27862D().mo19282f(ar6.f9510c), p);
                vg5 vg53 = this.f19418a;
                m26059R(vg53);
                vg53.mo26077e0();
                try {
                    if ("_id".equals(ar6.f9510c)) {
                        vg5 vg54 = this.f19418a;
                        m26059R(vg54);
                        ar6 X2 = vg54.mo26070X(uy62.f21557b, "_id");
                        if (X2 != null && !ar6.f9507a.equals(X2.f9507a)) {
                            vg5 vg55 = this.f19418a;
                            m26059R(vg55);
                            vg55.mo26081m(uy62.f21557b, "_lair");
                        }
                    }
                    mo23366S(uy62);
                    vg5 vg56 = this.f19418a;
                    m26059R(vg56);
                    boolean x = vg56.mo26092x(ar6);
                    vg5 vg57 = this.f19418a;
                    m26059R(vg57);
                    vg57.mo26083o();
                    if (!x) {
                        mo15136e().mo12726r().mo25381c("Too many unique user properties are set. Ignoring user property", this.f19420a.mo27862D().mo19282f(ar6.f9510c), ar6.f9507a);
                        mo23382h0().mo16852C(this.f19411a, uy62.f21557b, 9, (String) null, (String) null, 0);
                    }
                } finally {
                    vg5 vg58 = this.f19418a;
                    m26059R(vg58);
                    vg58.mo26078f0();
                }
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:196|197) */
    /* JADX WARNING: Code restructure failed: missing block: B:124:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0258, code lost:
        r0 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x025a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:?, code lost:
        mo15136e().mo12726r().mo25381c("Failed to parse upload URL. Not uploading. appId", com.onedelhi.secure.a56.m10802z(r6), r0.mo28052a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x04f3, code lost:
        if (r3 != null) goto L_0x04d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0115, code lost:
        if (r11 != null) goto L_0x00f7;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:196:0x0471 */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0281 A[SYNTHETIC, Splitter:B:136:0x0281] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x028a A[Catch:{ all -> 0x011b, all -> 0x0518 }] */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x048c A[Catch:{ all -> 0x011b, all -> 0x0518 }] */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x04fd A[Catch:{ all -> 0x011b, all -> 0x0518 }] */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x0514 A[SYNTHETIC, Splitter:B:236:0x0514] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x011f A[Catch:{ all -> 0x011b, all -> 0x0518 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:210:0x04d0=Splitter:B:210:0x04d0, B:123:0x0255=Splitter:B:123:0x0255, B:48:0x0106=Splitter:B:48:0x0106, B:40:0x00f7=Splitter:B:40:0x00f7, B:226:0x04f7=Splitter:B:226:0x04f7, B:51:0x0118=Splitter:B:51:0x0118, B:133:0x0268=Splitter:B:133:0x0268, B:187:0x03ec=Splitter:B:187:0x03ec} */
    @com.onedelhi.secure.ly4
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo23354C() {
        /*
            r22 = this;
            r1 = r22
            com.onedelhi.secure.qa6 r0 = r22.mo15135d()
            r0.mo15139h()
            r22.mo23379g()
            r2 = 1
            r1.f19435e = r2
            r3 = 0
            com.onedelhi.secure.za6 r0 = r1.f19420a     // Catch:{ all -> 0x0518 }
            r0.mo15134c()     // Catch:{ all -> 0x0518 }
            com.onedelhi.secure.za6 r0 = r1.f19420a     // Catch:{ all -> 0x0518 }
            com.onedelhi.secure.om6 r0 = r0.mo27869L()     // Catch:{ all -> 0x0518 }
            java.lang.Boolean r0 = r0.mo21999J()     // Catch:{ all -> 0x0518 }
            if (r0 != 0) goto L_0x0034
            com.onedelhi.secure.a56 r0 = r22.mo15136e()     // Catch:{ all -> 0x0518 }
            com.onedelhi.secure.u46 r0 = r0.mo12731w()     // Catch:{ all -> 0x0518 }
            java.lang.String r2 = "Upload data called on the client side before use of service was decided"
        L_0x002b:
            r0.mo25379a(r2)     // Catch:{ all -> 0x0518 }
        L_0x002e:
            r1.f19435e = r3
        L_0x0030:
            r22.mo23360K()
            return
        L_0x0034:
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0518 }
            if (r0 == 0) goto L_0x0045
            com.onedelhi.secure.a56 r0 = r22.mo15136e()     // Catch:{ all -> 0x0518 }
            com.onedelhi.secure.u46 r0 = r0.mo12726r()     // Catch:{ all -> 0x0518 }
            java.lang.String r2 = "Upload called in the client side when service should be used"
            goto L_0x002b
        L_0x0045:
            long r4 = r1.f19406a     // Catch:{ all -> 0x0518 }
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0051
        L_0x004d:
            r22.mo23362M()     // Catch:{ all -> 0x0518 }
            goto L_0x002e
        L_0x0051:
            com.onedelhi.secure.qa6 r0 = r22.mo15135d()     // Catch:{ all -> 0x0518 }
            r0.mo15139h()     // Catch:{ all -> 0x0518 }
            java.util.List r0 = r1.f19429b     // Catch:{ all -> 0x0518 }
            if (r0 == 0) goto L_0x0067
            com.onedelhi.secure.a56 r0 = r22.mo15136e()     // Catch:{ all -> 0x0518 }
            com.onedelhi.secure.u46 r0 = r0.mo12730v()     // Catch:{ all -> 0x0518 }
            java.lang.String r2 = "Uploading requested multiple times"
            goto L_0x002b
        L_0x0067:
            com.onedelhi.secure.s56 r0 = r1.f19413a     // Catch:{ all -> 0x0518 }
            m26059R(r0)     // Catch:{ all -> 0x0518 }
            boolean r0 = r0.mo24212m()     // Catch:{ all -> 0x0518 }
            if (r0 != 0) goto L_0x0080
            com.onedelhi.secure.a56 r0 = r22.mo15136e()     // Catch:{ all -> 0x0518 }
            com.onedelhi.secure.u46 r0 = r0.mo12730v()     // Catch:{ all -> 0x0518 }
            java.lang.String r2 = "Network not connected, ignoring upload request"
            r0.mo25379a(r2)     // Catch:{ all -> 0x0518 }
            goto L_0x004d
        L_0x0080:
            com.google.android.gms.common.util.Clock r0 = r22.mo15133a()     // Catch:{ all -> 0x0518 }
            long r4 = r0.currentTimeMillis()     // Catch:{ all -> 0x0518 }
            com.onedelhi.secure.ce5 r0 = r22.mo23368U()     // Catch:{ all -> 0x0518 }
            com.onedelhi.secure.k36 r8 = com.onedelhi.secure.n36.f17034R     // Catch:{ all -> 0x0518 }
            r9 = 0
            int r0 = r0.mo14122o(r9, r8)     // Catch:{ all -> 0x0518 }
            r22.mo23368U()     // Catch:{ all -> 0x0518 }
            long r10 = com.onedelhi.secure.ce5.m12445I()     // Catch:{ all -> 0x0518 }
            long r10 = r4 - r10
            r8 = 0
        L_0x009d:
            if (r8 >= r0) goto L_0x00a8
            boolean r12 = r1.mo23363N(r9, r10)     // Catch:{ all -> 0x0518 }
            if (r12 == 0) goto L_0x00a8
            int r8 = r8 + 1
            goto L_0x009d
        L_0x00a8:
            com.onedelhi.secure.sm6 r0 = r1.f19414a     // Catch:{ all -> 0x0518 }
            com.onedelhi.secure.e76 r0 = r0.f20435c     // Catch:{ all -> 0x0518 }
            long r10 = r0.mo15075a()     // Catch:{ all -> 0x0518 }
            int r0 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x00cb
            com.onedelhi.secure.a56 r0 = r22.mo15136e()     // Catch:{ all -> 0x0518 }
            com.onedelhi.secure.u46 r0 = r0.mo12725q()     // Catch:{ all -> 0x0518 }
            java.lang.String r6 = "Uploading events. Elapsed time since last upload attempt (ms)"
            long r7 = r4 - r10
            long r7 = java.lang.Math.abs(r7)     // Catch:{ all -> 0x0518 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0518 }
            r0.mo25380b(r6, r7)     // Catch:{ all -> 0x0518 }
        L_0x00cb:
            com.onedelhi.secure.vg5 r0 = r1.f19418a     // Catch:{ all -> 0x0518 }
            m26059R(r0)     // Catch:{ all -> 0x0518 }
            java.lang.String r6 = r0.mo26072Z()     // Catch:{ all -> 0x0518 }
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0518 }
            r7 = -1
            if (r0 != 0) goto L_0x0490
            long r10 = r1.f19428b     // Catch:{ all -> 0x0518 }
            int r0 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0123
            com.onedelhi.secure.vg5 r10 = r1.f19418a     // Catch:{ all -> 0x0518 }
            m26059R(r10)     // Catch:{ all -> 0x0518 }
            android.database.sqlite.SQLiteDatabase r0 = r10.mo26063P()     // Catch:{ SQLiteException -> 0x0104, all -> 0x0102 }
            java.lang.String r11 = "select rowid from raw_events order by rowid desc limit 1;"
            android.database.Cursor r11 = r0.rawQuery(r11, r9)     // Catch:{ SQLiteException -> 0x0104, all -> 0x0102 }
            boolean r0 = r11.moveToFirst()     // Catch:{ SQLiteException -> 0x0100 }
            if (r0 != 0) goto L_0x00fb
        L_0x00f7:
            r11.close()     // Catch:{ all -> 0x0518 }
            goto L_0x0118
        L_0x00fb:
            long r7 = r11.getLong(r3)     // Catch:{ SQLiteException -> 0x0100 }
            goto L_0x00f7
        L_0x0100:
            r0 = move-exception
            goto L_0x0106
        L_0x0102:
            r0 = move-exception
            goto L_0x011d
        L_0x0104:
            r0 = move-exception
            r11 = r9
        L_0x0106:
            com.onedelhi.secure.za6 r10 = r10.f11205a     // Catch:{ all -> 0x011b }
            com.onedelhi.secure.a56 r10 = r10.mo15136e()     // Catch:{ all -> 0x011b }
            com.onedelhi.secure.u46 r10 = r10.mo12726r()     // Catch:{ all -> 0x011b }
            java.lang.String r12 = "Error querying raw events"
            r10.mo25380b(r12, r0)     // Catch:{ all -> 0x011b }
            if (r11 == 0) goto L_0x0118
            goto L_0x00f7
        L_0x0118:
            r1.f19428b = r7     // Catch:{ all -> 0x0518 }
            goto L_0x0123
        L_0x011b:
            r0 = move-exception
            r9 = r11
        L_0x011d:
            if (r9 == 0) goto L_0x0122
            r9.close()     // Catch:{ all -> 0x0518 }
        L_0x0122:
            throw r0     // Catch:{ all -> 0x0518 }
        L_0x0123:
            com.onedelhi.secure.ce5 r0 = r22.mo23368U()     // Catch:{ all -> 0x0518 }
            com.onedelhi.secure.k36 r7 = com.onedelhi.secure.n36.f17057g     // Catch:{ all -> 0x0518 }
            int r0 = r0.mo14122o(r6, r7)     // Catch:{ all -> 0x0518 }
            com.onedelhi.secure.ce5 r7 = r22.mo23368U()     // Catch:{ all -> 0x0518 }
            com.onedelhi.secure.k36 r8 = com.onedelhi.secure.n36.f17059h     // Catch:{ all -> 0x0518 }
            int r7 = r7.mo14122o(r6, r8)     // Catch:{ all -> 0x0518 }
            int r7 = java.lang.Math.max(r3, r7)     // Catch:{ all -> 0x0518 }
            com.onedelhi.secure.vg5 r8 = r1.f19418a     // Catch:{ all -> 0x0518 }
            m26059R(r8)     // Catch:{ all -> 0x0518 }
            r8.mo15139h()     // Catch:{ all -> 0x0518 }
            r8.mo27038i()     // Catch:{ all -> 0x0518 }
            if (r0 <= 0) goto L_0x014a
            r10 = 1
            goto L_0x014b
        L_0x014a:
            r10 = 0
        L_0x014b:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r10)     // Catch:{ all -> 0x0518 }
            if (r7 <= 0) goto L_0x0152
            r10 = 1
            goto L_0x0153
        L_0x0152:
            r10 = 0
        L_0x0153:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r10)     // Catch:{ all -> 0x0518 }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r6)     // Catch:{ all -> 0x0518 }
            android.database.sqlite.SQLiteDatabase r11 = r8.mo26063P()     // Catch:{ SQLiteException -> 0x0264, all -> 0x0260 }
            java.lang.String r12 = "queue"
            java.lang.String r13 = "rowid"
            java.lang.String r14 = "data"
            java.lang.String r15 = "retry_count"
            java.lang.String[] r13 = new java.lang.String[]{r13, r14, r15}     // Catch:{ SQLiteException -> 0x0264, all -> 0x0260 }
            java.lang.String r14 = "app_id=?"
            java.lang.String[] r15 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x0264, all -> 0x0260 }
            r15[r3] = r6     // Catch:{ SQLiteException -> 0x0264, all -> 0x0260 }
            r16 = 0
            r17 = 0
            java.lang.String r18 = "rowid"
            java.lang.String r19 = java.lang.String.valueOf(r0)     // Catch:{ SQLiteException -> 0x0264, all -> 0x0260 }
            android.database.Cursor r11 = r11.query(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ SQLiteException -> 0x0264, all -> 0x0260 }
            boolean r0 = r11.moveToFirst()     // Catch:{ SQLiteException -> 0x025c }
            if (r0 != 0) goto L_0x018e
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ SQLiteException -> 0x025c }
            r11.close()     // Catch:{ all -> 0x0518 }
            r20 = r4
            goto L_0x0284
        L_0x018e:
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x025c }
            r12.<init>()     // Catch:{ SQLiteException -> 0x025c }
            r13 = 0
        L_0x0194:
            long r14 = r11.getLong(r3)     // Catch:{ SQLiteException -> 0x025c }
            byte[] r0 = r11.getBlob(r2)     // Catch:{ IOException -> 0x0231 }
            com.onedelhi.secure.qq6 r9 = r8.f21907a     // Catch:{ IOException -> 0x0231 }
            com.onedelhi.secure.uq6 r9 = r9.f19416a     // Catch:{ IOException -> 0x0231 }
            m26059R(r9)     // Catch:{ IOException -> 0x0231 }
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x021c }
            r2.<init>(r0)     // Catch:{ IOException -> 0x021c }
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x021c }
            r0.<init>(r2)     // Catch:{ IOException -> 0x021c }
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x021c }
            r3.<init>()     // Catch:{ IOException -> 0x021c }
            r10 = 1024(0x400, float:1.435E-42)
            byte[] r10 = new byte[r10]     // Catch:{ IOException -> 0x021c }
            r20 = r4
        L_0x01b8:
            int r4 = r0.read(r10)     // Catch:{ IOException -> 0x021a }
            if (r4 > 0) goto L_0x0215
            r0.close()     // Catch:{ IOException -> 0x021a }
            r2.close()     // Catch:{ IOException -> 0x021a }
            byte[] r0 = r3.toByteArray()     // Catch:{ IOException -> 0x021a }
            boolean r2 = r12.isEmpty()     // Catch:{ SQLiteException -> 0x025a }
            if (r2 != 0) goto L_0x01d4
            int r2 = r0.length     // Catch:{ SQLiteException -> 0x025a }
            int r2 = r2 + r13
            if (r2 <= r7) goto L_0x01d4
            goto L_0x0255
        L_0x01d4:
            com.onedelhi.secure.va6 r2 = com.onedelhi.secure.ya6.m32031Q1()     // Catch:{ IOException -> 0x0200 }
            com.onedelhi.secure.us6 r2 = com.onedelhi.secure.uq6.m29499C(r2, r0)     // Catch:{ IOException -> 0x0200 }
            com.onedelhi.secure.va6 r2 = (com.onedelhi.secure.va6) r2     // Catch:{ IOException -> 0x0200 }
            r3 = 2
            boolean r4 = r11.isNull(r3)     // Catch:{ SQLiteException -> 0x025a }
            if (r4 != 0) goto L_0x01ec
            int r4 = r11.getInt(r3)     // Catch:{ SQLiteException -> 0x025a }
            r2.mo25955W(r4)     // Catch:{ SQLiteException -> 0x025a }
        L_0x01ec:
            int r0 = r0.length     // Catch:{ SQLiteException -> 0x025a }
            int r13 = r13 + r0
            com.onedelhi.secure.jq6 r0 = r2.mo17922m()     // Catch:{ SQLiteException -> 0x025a }
            com.onedelhi.secure.ya6 r0 = (com.onedelhi.secure.ya6) r0     // Catch:{ SQLiteException -> 0x025a }
            java.lang.Long r2 = java.lang.Long.valueOf(r14)     // Catch:{ SQLiteException -> 0x025a }
            android.util.Pair r0 = android.util.Pair.create(r0, r2)     // Catch:{ SQLiteException -> 0x025a }
            r12.add(r0)     // Catch:{ SQLiteException -> 0x025a }
            goto L_0x0245
        L_0x0200:
            r0 = move-exception
            com.onedelhi.secure.za6 r2 = r8.f11205a     // Catch:{ SQLiteException -> 0x025a }
            com.onedelhi.secure.a56 r2 = r2.mo15136e()     // Catch:{ SQLiteException -> 0x025a }
            com.onedelhi.secure.u46 r2 = r2.mo12726r()     // Catch:{ SQLiteException -> 0x025a }
            java.lang.String r3 = "Failed to merge queued bundle. appId"
            java.lang.Object r4 = com.onedelhi.secure.a56.m10802z(r6)     // Catch:{ SQLiteException -> 0x025a }
        L_0x0211:
            r2.mo25381c(r3, r4, r0)     // Catch:{ SQLiteException -> 0x025a }
            goto L_0x0245
        L_0x0215:
            r5 = 0
            r3.write(r10, r5, r4)     // Catch:{ IOException -> 0x021a }
            goto L_0x01b8
        L_0x021a:
            r0 = move-exception
            goto L_0x021f
        L_0x021c:
            r0 = move-exception
            r20 = r4
        L_0x021f:
            com.onedelhi.secure.za6 r2 = r9.f11205a     // Catch:{ IOException -> 0x022f }
            com.onedelhi.secure.a56 r2 = r2.mo15136e()     // Catch:{ IOException -> 0x022f }
            com.onedelhi.secure.u46 r2 = r2.mo12726r()     // Catch:{ IOException -> 0x022f }
            java.lang.String r3 = "Failed to ungzip content"
            r2.mo25380b(r3, r0)     // Catch:{ IOException -> 0x022f }
            throw r0     // Catch:{ IOException -> 0x022f }
        L_0x022f:
            r0 = move-exception
            goto L_0x0234
        L_0x0231:
            r0 = move-exception
            r20 = r4
        L_0x0234:
            com.onedelhi.secure.za6 r2 = r8.f11205a     // Catch:{ SQLiteException -> 0x025a }
            com.onedelhi.secure.a56 r2 = r2.mo15136e()     // Catch:{ SQLiteException -> 0x025a }
            com.onedelhi.secure.u46 r2 = r2.mo12726r()     // Catch:{ SQLiteException -> 0x025a }
            java.lang.String r3 = "Failed to unzip queued bundle. appId"
            java.lang.Object r4 = com.onedelhi.secure.a56.m10802z(r6)     // Catch:{ SQLiteException -> 0x025a }
            goto L_0x0211
        L_0x0245:
            boolean r0 = r11.moveToNext()     // Catch:{ SQLiteException -> 0x025a }
            if (r0 == 0) goto L_0x0255
            if (r13 <= r7) goto L_0x024e
            goto L_0x0255
        L_0x024e:
            r4 = r20
            r2 = 1
            r3 = 0
            r9 = 0
            goto L_0x0194
        L_0x0255:
            r11.close()     // Catch:{ all -> 0x0518 }
            r0 = r12
            goto L_0x0284
        L_0x025a:
            r0 = move-exception
            goto L_0x0268
        L_0x025c:
            r0 = move-exception
            r20 = r4
            goto L_0x0268
        L_0x0260:
            r0 = move-exception
            r9 = 0
            goto L_0x048a
        L_0x0264:
            r0 = move-exception
            r20 = r4
            r11 = 0
        L_0x0268:
            com.onedelhi.secure.za6 r2 = r8.f11205a     // Catch:{ all -> 0x0488 }
            com.onedelhi.secure.a56 r2 = r2.mo15136e()     // Catch:{ all -> 0x0488 }
            com.onedelhi.secure.u46 r2 = r2.mo12726r()     // Catch:{ all -> 0x0488 }
            java.lang.String r3 = "Error querying bundles. appId"
            java.lang.Object r4 = com.onedelhi.secure.a56.m10802z(r6)     // Catch:{ all -> 0x0488 }
            r2.mo25381c(r3, r4, r0)     // Catch:{ all -> 0x0488 }
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0488 }
            if (r11 == 0) goto L_0x0284
            r11.close()     // Catch:{ all -> 0x0518 }
        L_0x0284:
            boolean r2 = r0.isEmpty()     // Catch:{ all -> 0x0518 }
            if (r2 != 0) goto L_0x050b
            com.onedelhi.secure.ye5 r2 = r1.mo23369V(r6)     // Catch:{ all -> 0x0518 }
            com.onedelhi.secure.ne5 r3 = com.onedelhi.secure.ne5.AD_STORAGE     // Catch:{ all -> 0x0518 }
            boolean r2 = r2.mo27438i(r3)     // Catch:{ all -> 0x0518 }
            if (r2 == 0) goto L_0x02eb
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x0518 }
        L_0x029a:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0518 }
            if (r3 == 0) goto L_0x02b9
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0518 }
            android.util.Pair r3 = (android.util.Pair) r3     // Catch:{ all -> 0x0518 }
            java.lang.Object r3 = r3.first     // Catch:{ all -> 0x0518 }
            com.onedelhi.secure.ya6 r3 = (com.onedelhi.secure.ya6) r3     // Catch:{ all -> 0x0518 }
            java.lang.String r4 = r3.mo27274L()     // Catch:{ all -> 0x0518 }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x0518 }
            if (r4 != 0) goto L_0x029a
            java.lang.String r2 = r3.mo27274L()     // Catch:{ all -> 0x0518 }
            goto L_0x02ba
        L_0x02b9:
            r2 = 0
        L_0x02ba:
            if (r2 == 0) goto L_0x02eb
            r3 = 0
        L_0x02bd:
            int r4 = r0.size()     // Catch:{ all -> 0x0518 }
            if (r3 >= r4) goto L_0x02eb
            java.lang.Object r4 = r0.get(r3)     // Catch:{ all -> 0x0518 }
            android.util.Pair r4 = (android.util.Pair) r4     // Catch:{ all -> 0x0518 }
            java.lang.Object r4 = r4.first     // Catch:{ all -> 0x0518 }
            com.onedelhi.secure.ya6 r4 = (com.onedelhi.secure.ya6) r4     // Catch:{ all -> 0x0518 }
            java.lang.String r5 = r4.mo27274L()     // Catch:{ all -> 0x0518 }
            boolean r5 = r5.isEmpty()     // Catch:{ all -> 0x0518 }
            if (r5 == 0) goto L_0x02d8
            goto L_0x02e8
        L_0x02d8:
            java.lang.String r4 = r4.mo27274L()     // Catch:{ all -> 0x0518 }
            boolean r4 = r4.equals(r2)     // Catch:{ all -> 0x0518 }
            if (r4 != 0) goto L_0x02e8
            r4 = 0
            java.util.List r0 = r0.subList(r4, r3)     // Catch:{ all -> 0x0518 }
            goto L_0x02eb
        L_0x02e8:
            int r3 = r3 + 1
            goto L_0x02bd
        L_0x02eb:
            com.onedelhi.secure.pa6 r2 = com.onedelhi.secure.sa6.m27406B()     // Catch:{ all -> 0x0518 }
            int r3 = r0.size()     // Catch:{ all -> 0x0518 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0518 }
            int r5 = r0.size()     // Catch:{ all -> 0x0518 }
            r4.<init>(r5)     // Catch:{ all -> 0x0518 }
            com.onedelhi.secure.ce5 r5 = r22.mo23368U()     // Catch:{ all -> 0x0518 }
            boolean r5 = r5.mo14111C(r6)     // Catch:{ all -> 0x0518 }
            if (r5 == 0) goto L_0x0314
            com.onedelhi.secure.ye5 r5 = r1.mo23369V(r6)     // Catch:{ all -> 0x0518 }
            com.onedelhi.secure.ne5 r7 = com.onedelhi.secure.ne5.AD_STORAGE     // Catch:{ all -> 0x0518 }
            boolean r5 = r5.mo27438i(r7)     // Catch:{ all -> 0x0518 }
            if (r5 == 0) goto L_0x0314
            r5 = 1
            goto L_0x0315
        L_0x0314:
            r5 = 0
        L_0x0315:
            com.onedelhi.secure.ye5 r7 = r1.mo23369V(r6)     // Catch:{ all -> 0x0518 }
            com.onedelhi.secure.ne5 r8 = com.onedelhi.secure.ne5.AD_STORAGE     // Catch:{ all -> 0x0518 }
            boolean r7 = r7.mo27438i(r8)     // Catch:{ all -> 0x0518 }
            com.onedelhi.secure.ye5 r8 = r1.mo23369V(r6)     // Catch:{ all -> 0x0518 }
            com.onedelhi.secure.ne5 r9 = com.onedelhi.secure.ne5.ANALYTICS_STORAGE     // Catch:{ all -> 0x0518 }
            boolean r8 = r8.mo27438i(r9)     // Catch:{ all -> 0x0518 }
            com.onedelhi.secure.xz6.m31807c()     // Catch:{ all -> 0x0518 }
            com.onedelhi.secure.ce5 r9 = r22.mo23368U()     // Catch:{ all -> 0x0518 }
            com.onedelhi.secure.k36 r10 = com.onedelhi.secure.n36.f17074o0     // Catch:{ all -> 0x0518 }
            boolean r9 = r9.mo14110B(r6, r10)     // Catch:{ all -> 0x0518 }
            r10 = 0
        L_0x0337:
            if (r10 >= r3) goto L_0x03b5
            java.lang.Object r11 = r0.get(r10)     // Catch:{ all -> 0x0518 }
            android.util.Pair r11 = (android.util.Pair) r11     // Catch:{ all -> 0x0518 }
            java.lang.Object r11 = r11.first     // Catch:{ all -> 0x0518 }
            com.onedelhi.secure.ya6 r11 = (com.onedelhi.secure.ya6) r11     // Catch:{ all -> 0x0518 }
            com.onedelhi.secure.ip6 r11 = r11.mo18543k()     // Catch:{ all -> 0x0518 }
            com.onedelhi.secure.va6 r11 = (com.onedelhi.secure.va6) r11     // Catch:{ all -> 0x0518 }
            java.lang.Object r12 = r0.get(r10)     // Catch:{ all -> 0x0518 }
            android.util.Pair r12 = (android.util.Pair) r12     // Catch:{ all -> 0x0518 }
            java.lang.Object r12 = r12.second     // Catch:{ all -> 0x0518 }
            java.lang.Long r12 = (java.lang.Long) r12     // Catch:{ all -> 0x0518 }
            r4.add(r12)     // Catch:{ all -> 0x0518 }
            com.onedelhi.secure.ce5 r12 = r22.mo23368U()     // Catch:{ all -> 0x0518 }
            r12.mo14124q()     // Catch:{ all -> 0x0518 }
            r12 = 76003(0x128e3, double:3.75505E-319)
            r11.mo25962d0(r12)     // Catch:{ all -> 0x0518 }
            r12 = r20
            r11.mo25961c0(r12)     // Catch:{ all -> 0x0518 }
            com.onedelhi.secure.za6 r14 = r1.f19420a     // Catch:{ all -> 0x0518 }
            r14.mo15134c()     // Catch:{ all -> 0x0518 }
            r14 = 0
            r11.mo25956X(r14)     // Catch:{ all -> 0x0518 }
            if (r5 != 0) goto L_0x0376
            r11.mo25925B0()     // Catch:{ all -> 0x0518 }
        L_0x0376:
            if (r7 != 0) goto L_0x037e
            r11.mo25939I0()     // Catch:{ all -> 0x0518 }
            r11.mo25931E0()     // Catch:{ all -> 0x0518 }
        L_0x037e:
            if (r8 != 0) goto L_0x0383
            r11.mo25992y0()     // Catch:{ all -> 0x0518 }
        L_0x0383:
            r1.mo23381h(r6, r11)     // Catch:{ all -> 0x0518 }
            if (r9 != 0) goto L_0x038b
            r11.mo25941J0()     // Catch:{ all -> 0x0518 }
        L_0x038b:
            com.onedelhi.secure.ce5 r14 = r22.mo23368U()     // Catch:{ all -> 0x0518 }
            com.onedelhi.secure.k36 r15 = com.onedelhi.secure.n36.f17038V     // Catch:{ all -> 0x0518 }
            boolean r14 = r14.mo14110B(r6, r15)     // Catch:{ all -> 0x0518 }
            if (r14 == 0) goto L_0x03ad
            com.onedelhi.secure.jq6 r14 = r11.mo17922m()     // Catch:{ all -> 0x0518 }
            com.onedelhi.secure.ya6 r14 = (com.onedelhi.secure.ya6) r14     // Catch:{ all -> 0x0518 }
            byte[] r14 = r14.mo22497h()     // Catch:{ all -> 0x0518 }
            com.onedelhi.secure.uq6 r15 = r1.f19416a     // Catch:{ all -> 0x0518 }
            m26059R(r15)     // Catch:{ all -> 0x0518 }
            long r14 = r15.mo25705x(r14)     // Catch:{ all -> 0x0518 }
            r11.mo25993z(r14)     // Catch:{ all -> 0x0518 }
        L_0x03ad:
            r2.mo22364q(r11)     // Catch:{ all -> 0x0518 }
            int r10 = r10 + 1
            r20 = r12
            goto L_0x0337
        L_0x03b5:
            r12 = r20
            com.onedelhi.secure.a56 r0 = r22.mo15136e()     // Catch:{ all -> 0x0518 }
            java.lang.String r0 = r0.mo12722D()     // Catch:{ all -> 0x0518 }
            r5 = 2
            boolean r0 = android.util.Log.isLoggable(r0, r5)     // Catch:{ all -> 0x0518 }
            if (r0 == 0) goto L_0x03d6
            com.onedelhi.secure.uq6 r0 = r1.f19416a     // Catch:{ all -> 0x0518 }
            m26059R(r0)     // Catch:{ all -> 0x0518 }
            com.onedelhi.secure.jq6 r5 = r2.mo17922m()     // Catch:{ all -> 0x0518 }
            com.onedelhi.secure.sa6 r5 = (com.onedelhi.secure.sa6) r5     // Catch:{ all -> 0x0518 }
            java.lang.String r9 = r0.mo25694D(r5)     // Catch:{ all -> 0x0518 }
            goto L_0x03d7
        L_0x03d6:
            r9 = 0
        L_0x03d7:
            com.onedelhi.secure.uq6 r0 = r1.f19416a     // Catch:{ all -> 0x0518 }
            m26059R(r0)     // Catch:{ all -> 0x0518 }
            com.onedelhi.secure.jq6 r0 = r2.mo17922m()     // Catch:{ all -> 0x0518 }
            com.onedelhi.secure.sa6 r0 = (com.onedelhi.secure.sa6) r0     // Catch:{ all -> 0x0518 }
            byte[] r14 = r0.mo22497h()     // Catch:{ all -> 0x0518 }
            com.onedelhi.secure.bp6 r0 = r1.f19409a     // Catch:{ all -> 0x0518 }
            com.onedelhi.secure.zo6 r0 = r0.mo13793i(r6)     // Catch:{ all -> 0x0518 }
            boolean r5 = r4.isEmpty()     // Catch:{ MalformedURLException -> 0x0471 }
            r7 = 1
            r5 = r5 ^ r7
            com.google.android.gms.common.internal.Preconditions.checkArgument(r5)     // Catch:{ MalformedURLException -> 0x0471 }
            java.util.List r5 = r1.f19429b     // Catch:{ MalformedURLException -> 0x0471 }
            if (r5 == 0) goto L_0x0407
            com.onedelhi.secure.a56 r4 = r22.mo15136e()     // Catch:{ MalformedURLException -> 0x0471 }
            com.onedelhi.secure.u46 r4 = r4.mo12726r()     // Catch:{ MalformedURLException -> 0x0471 }
            java.lang.String r5 = "Set uploading progress before finishing the previous upload"
            r4.mo25379a(r5)     // Catch:{ MalformedURLException -> 0x0471 }
            goto L_0x040e
        L_0x0407:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ MalformedURLException -> 0x0471 }
            r5.<init>(r4)     // Catch:{ MalformedURLException -> 0x0471 }
            r1.f19429b = r5     // Catch:{ MalformedURLException -> 0x0471 }
        L_0x040e:
            com.onedelhi.secure.sm6 r4 = r1.f19414a     // Catch:{ MalformedURLException -> 0x0471 }
            com.onedelhi.secure.e76 r4 = r4.f20436d     // Catch:{ MalformedURLException -> 0x0471 }
            r4.mo15076b(r12)     // Catch:{ MalformedURLException -> 0x0471 }
            java.lang.String r4 = "?"
            if (r3 <= 0) goto L_0x0422
            r3 = 0
            com.onedelhi.secure.ya6 r2 = r2.mo22365r(r3)     // Catch:{ MalformedURLException -> 0x0471 }
            java.lang.String r4 = r2.mo27287U1()     // Catch:{ MalformedURLException -> 0x0471 }
        L_0x0422:
            com.onedelhi.secure.a56 r2 = r22.mo15136e()     // Catch:{ MalformedURLException -> 0x0471 }
            com.onedelhi.secure.u46 r2 = r2.mo12730v()     // Catch:{ MalformedURLException -> 0x0471 }
            java.lang.String r3 = "Uploading data. app, uncompressed size, data"
            int r5 = r14.length     // Catch:{ MalformedURLException -> 0x0471 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ MalformedURLException -> 0x0471 }
            r2.mo25382d(r3, r4, r5, r9)     // Catch:{ MalformedURLException -> 0x0471 }
            r2 = 1
            r1.f19434d = r2     // Catch:{ MalformedURLException -> 0x0471 }
            com.onedelhi.secure.s56 r11 = r1.f19413a     // Catch:{ MalformedURLException -> 0x0471 }
            m26059R(r11)     // Catch:{ MalformedURLException -> 0x0471 }
            java.net.URL r13 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0471 }
            java.lang.String r2 = r0.mo28052a()     // Catch:{ MalformedURLException -> 0x0471 }
            r13.<init>(r2)     // Catch:{ MalformedURLException -> 0x0471 }
            java.util.Map r15 = r0.mo28053b()     // Catch:{ MalformedURLException -> 0x0471 }
            com.onedelhi.secure.fp6 r2 = new com.onedelhi.secure.fp6     // Catch:{ MalformedURLException -> 0x0471 }
            r2.<init>(r1, r6)     // Catch:{ MalformedURLException -> 0x0471 }
            r11.mo15139h()     // Catch:{ MalformedURLException -> 0x0471 }
            r11.mo27038i()     // Catch:{ MalformedURLException -> 0x0471 }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r13)     // Catch:{ MalformedURLException -> 0x0471 }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r14)     // Catch:{ MalformedURLException -> 0x0471 }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)     // Catch:{ MalformedURLException -> 0x0471 }
            com.onedelhi.secure.za6 r3 = r11.f11205a     // Catch:{ MalformedURLException -> 0x0471 }
            com.onedelhi.secure.qa6 r3 = r3.mo15135d()     // Catch:{ MalformedURLException -> 0x0471 }
            com.onedelhi.secure.p56 r4 = new com.onedelhi.secure.p56     // Catch:{ MalformedURLException -> 0x0471 }
            r10 = r4
            r12 = r6
            r16 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16)     // Catch:{ MalformedURLException -> 0x0471 }
            r3.mo23064y(r4)     // Catch:{ MalformedURLException -> 0x0471 }
            goto L_0x050b
        L_0x0471:
            com.onedelhi.secure.a56 r2 = r22.mo15136e()     // Catch:{ all -> 0x0518 }
            com.onedelhi.secure.u46 r2 = r2.mo12726r()     // Catch:{ all -> 0x0518 }
            java.lang.String r3 = "Failed to parse upload URL. Not uploading. appId"
            java.lang.Object r4 = com.onedelhi.secure.a56.m10802z(r6)     // Catch:{ all -> 0x0518 }
            java.lang.String r0 = r0.mo28052a()     // Catch:{ all -> 0x0518 }
            r2.mo25381c(r3, r4, r0)     // Catch:{ all -> 0x0518 }
            goto L_0x050b
        L_0x0488:
            r0 = move-exception
            r9 = r11
        L_0x048a:
            if (r9 == 0) goto L_0x048f
            r9.close()     // Catch:{ all -> 0x0518 }
        L_0x048f:
            throw r0     // Catch:{ all -> 0x0518 }
        L_0x0490:
            r12 = r4
            r1.f19428b = r7     // Catch:{ all -> 0x0518 }
            com.onedelhi.secure.vg5 r2 = r1.f19418a     // Catch:{ all -> 0x0518 }
            m26059R(r2)     // Catch:{ all -> 0x0518 }
            r22.mo23368U()     // Catch:{ all -> 0x0518 }
            long r3 = com.onedelhi.secure.ce5.m12445I()     // Catch:{ all -> 0x0518 }
            long r4 = r12 - r3
            r2.mo15139h()     // Catch:{ all -> 0x0518 }
            r2.mo27038i()     // Catch:{ all -> 0x0518 }
            android.database.sqlite.SQLiteDatabase r0 = r2.mo26063P()     // Catch:{ SQLiteException -> 0x04e2, all -> 0x04df }
            java.lang.String r3 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            r6 = 1
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x04e2, all -> 0x04df }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ SQLiteException -> 0x04e2, all -> 0x04df }
            r5 = 0
            r6[r5] = r4     // Catch:{ SQLiteException -> 0x04e2, all -> 0x04df }
            android.database.Cursor r3 = r0.rawQuery(r3, r6)     // Catch:{ SQLiteException -> 0x04e2, all -> 0x04df }
            boolean r0 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x04dd }
            if (r0 != 0) goto L_0x04d4
            com.onedelhi.secure.za6 r0 = r2.f11205a     // Catch:{ SQLiteException -> 0x04dd }
            com.onedelhi.secure.a56 r0 = r0.mo15136e()     // Catch:{ SQLiteException -> 0x04dd }
            com.onedelhi.secure.u46 r0 = r0.mo12730v()     // Catch:{ SQLiteException -> 0x04dd }
            java.lang.String r4 = "No expired configs for apps with pending events"
            r0.mo25379a(r4)     // Catch:{ SQLiteException -> 0x04dd }
        L_0x04d0:
            r3.close()     // Catch:{ all -> 0x0518 }
            goto L_0x04f6
        L_0x04d4:
            r4 = 0
            java.lang.String r9 = r3.getString(r4)     // Catch:{ SQLiteException -> 0x04dd }
            r3.close()     // Catch:{ all -> 0x0518 }
            goto L_0x04f7
        L_0x04dd:
            r0 = move-exception
            goto L_0x04e4
        L_0x04df:
            r0 = move-exception
            r9 = 0
            goto L_0x0512
        L_0x04e2:
            r0 = move-exception
            r3 = 0
        L_0x04e4:
            com.onedelhi.secure.za6 r2 = r2.f11205a     // Catch:{ all -> 0x0510 }
            com.onedelhi.secure.a56 r2 = r2.mo15136e()     // Catch:{ all -> 0x0510 }
            com.onedelhi.secure.u46 r2 = r2.mo12726r()     // Catch:{ all -> 0x0510 }
            java.lang.String r4 = "Error selecting expired configs"
            r2.mo25380b(r4, r0)     // Catch:{ all -> 0x0510 }
            if (r3 == 0) goto L_0x04f6
            goto L_0x04d0
        L_0x04f6:
            r9 = 0
        L_0x04f7:
            boolean r0 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x0518 }
            if (r0 != 0) goto L_0x050b
            com.onedelhi.secure.vg5 r0 = r1.f19418a     // Catch:{ all -> 0x0518 }
            m26059R(r0)     // Catch:{ all -> 0x0518 }
            com.onedelhi.secure.yd6 r0 = r0.mo26065R(r9)     // Catch:{ all -> 0x0518 }
            if (r0 == 0) goto L_0x050b
            r1.mo23383i(r0)     // Catch:{ all -> 0x0518 }
        L_0x050b:
            r2 = 0
            r1.f19435e = r2
            goto L_0x0030
        L_0x0510:
            r0 = move-exception
            r9 = r3
        L_0x0512:
            if (r9 == 0) goto L_0x0517
            r9.close()     // Catch:{ all -> 0x0518 }
        L_0x0517:
            throw r0     // Catch:{ all -> 0x0518 }
        L_0x0518:
            r0 = move-exception
            r2 = 0
            r1.f19435e = r2
            r22.mo23360K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.qq6.mo23354C():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:240:0x07cf, code lost:
        if (r14.isEmpty() != false) goto L_0x07d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x09d8, code lost:
        r31 = 1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x033f A[Catch:{ NumberFormatException -> 0x07b9, all -> 0x0b11 }] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0382 A[Catch:{ NumberFormatException -> 0x07b9, all -> 0x0b11 }] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0385 A[Catch:{ NumberFormatException -> 0x07b9, all -> 0x0b11 }] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x03e4 A[Catch:{ NumberFormatException -> 0x07b9, all -> 0x0b11 }] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0411  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0573 A[Catch:{ NumberFormatException -> 0x07b9, all -> 0x0b11 }] */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x05b3 A[Catch:{ NumberFormatException -> 0x07b9, all -> 0x0b11 }] */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x062c A[Catch:{ NumberFormatException -> 0x07b9, all -> 0x0b11 }] */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0677 A[Catch:{ NumberFormatException -> 0x07b9, all -> 0x0b11 }] */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0684 A[Catch:{ NumberFormatException -> 0x07b9, all -> 0x0b11 }] */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0691 A[Catch:{ NumberFormatException -> 0x07b9, all -> 0x0b11 }] */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x06c9 A[Catch:{ NumberFormatException -> 0x07b9, all -> 0x0b11 }] */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x06da A[Catch:{ NumberFormatException -> 0x07b9, all -> 0x0b11 }] */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x071b A[Catch:{ NumberFormatException -> 0x07b9, all -> 0x0b11 }] */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x0742 A[Catch:{ NumberFormatException -> 0x07b9, all -> 0x0b11 }] */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x0747 A[Catch:{ NumberFormatException -> 0x07b9, all -> 0x0b11 }] */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x074d A[Catch:{ NumberFormatException -> 0x07b9, all -> 0x0b11 }] */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x07d4 A[Catch:{ NumberFormatException -> 0x07b9, all -> 0x0b11 }] */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x081a A[Catch:{ NumberFormatException -> 0x07b9, all -> 0x0b11 }] */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x0869 A[Catch:{ NumberFormatException -> 0x07b9, all -> 0x0b11 }] */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x0876 A[Catch:{ NumberFormatException -> 0x07b9, all -> 0x0b11 }] */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x088f A[Catch:{ NumberFormatException -> 0x07b9, all -> 0x0b11 }] */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x091b A[Catch:{ NumberFormatException -> 0x07b9, all -> 0x0b11 }] */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x093a A[Catch:{ NumberFormatException -> 0x07b9, all -> 0x0b11 }] */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x09cc A[Catch:{ NumberFormatException -> 0x07b9, all -> 0x0b11 }] */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x0a7a A[Catch:{ SQLiteException -> 0x0a95 }] */
    /* JADX WARNING: Removed duplicated region for block: B:304:0x0a90  */
    /* JADX WARNING: Removed duplicated region for block: B:342:0x09de A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01ce A[Catch:{ NumberFormatException -> 0x07b9, all -> 0x0b11 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01e7 A[SYNTHETIC, Splitter:B:55:0x01e7] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x024b A[SYNTHETIC, Splitter:B:69:0x024b] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x025b A[Catch:{ NumberFormatException -> 0x07b9, all -> 0x0b11 }] */
    @com.onedelhi.secure.ly4
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo23355D(com.onedelhi.secure.xj5 r36, com.onedelhi.secure.uy6 r37) {
        /*
            r35 = this;
            r1 = r35
            r2 = r36
            r3 = r37
            java.lang.String r4 = "metadata_fingerprint"
            java.lang.String r5 = "app_id"
            java.lang.String r6 = "raw_events"
            java.lang.String r7 = "_sno"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r37)
            java.lang.String r8 = r3.f21557b
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r8)
            long r8 = java.lang.System.nanoTime()
            com.onedelhi.secure.qa6 r10 = r35.mo15135d()
            r10.mo15139h()
            r35.mo23379g()
            java.lang.String r10 = r3.f21557b
            com.onedelhi.secure.uq6 r11 = r1.f19416a
            m26059R(r11)
            boolean r11 = com.onedelhi.secure.uq6.m29504m(r36, r37)
            if (r11 != 0) goto L_0x0032
            return
        L_0x0032:
            boolean r11 = r3.f21558b
            if (r11 == 0) goto L_0x0b1c
            com.onedelhi.secure.b96 r11 = r1.f19407a
            m26059R(r11)
            java.lang.String r12 = r2.f22604b
            boolean r11 = r11.mo13572F(r10, r12)
            java.lang.String r15 = "_err"
            r14 = 0
            if (r11 == 0) goto L_0x00df
            com.onedelhi.secure.a56 r3 = r35.mo15136e()
            com.onedelhi.secure.u46 r3 = r3.mo12731w()
            java.lang.Object r4 = com.onedelhi.secure.a56.m10802z(r10)
            com.onedelhi.secure.za6 r5 = r1.f19420a
            com.onedelhi.secure.l46 r5 = r5.mo27862D()
            java.lang.String r6 = r2.f22604b
            java.lang.String r5 = r5.mo19280d(r6)
            java.lang.String r6 = "Dropping blocked event. appId"
            r3.mo25381c(r6, r4, r5)
            com.onedelhi.secure.b96 r3 = r1.f19407a
            m26059R(r3)
            boolean r3 = r3.mo13570D(r10)
            if (r3 != 0) goto L_0x0097
            com.onedelhi.secure.b96 r3 = r1.f19407a
            m26059R(r3)
            boolean r3 = r3.mo13573G(r10)
            if (r3 == 0) goto L_0x007a
            goto L_0x0097
        L_0x007a:
            java.lang.String r3 = r2.f22604b
            boolean r3 = r15.equals(r3)
            if (r3 != 0) goto L_0x00de
            com.onedelhi.secure.gr6 r11 = r35.mo23382h0()
            com.onedelhi.secure.er6 r12 = r1.f19411a
            java.lang.String r2 = r2.f22604b
            r14 = 11
            r17 = 0
            java.lang.String r15 = "_ev"
            r13 = r10
            r16 = r2
            r11.mo16852C(r12, r13, r14, r15, r16, r17)
            return
        L_0x0097:
            com.onedelhi.secure.vg5 r2 = r1.f19418a
            m26059R(r2)
            com.onedelhi.secure.yd6 r2 = r2.mo26065R(r10)
            if (r2 == 0) goto L_0x00de
            long r3 = r2.mo27381Z()
            long r5 = r2.mo27372Q()
            long r3 = java.lang.Math.max(r3, r5)
            com.google.android.gms.common.util.Clock r5 = r35.mo15133a()
            long r5 = r5.currentTimeMillis()
            long r5 = r5 - r3
            long r3 = java.lang.Math.abs(r5)
            r35.mo23368U()
            com.onedelhi.secure.k36 r5 = com.onedelhi.secure.n36.f17095z
            java.lang.Object r5 = r5.mo18887a(r14)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x00de
            com.onedelhi.secure.a56 r3 = r35.mo15136e()
            com.onedelhi.secure.u46 r3 = r3.mo12725q()
            java.lang.String r4 = "Fetching config for blocked app"
            r3.mo25379a(r4)
            r1.mo23383i(r2)
        L_0x00de:
            return
        L_0x00df:
            com.onedelhi.secure.d56 r2 = com.onedelhi.secure.d56.m12971b(r36)
            com.onedelhi.secure.gr6 r11 = r35.mo23382h0()
            com.onedelhi.secure.ce5 r12 = r35.mo23368U()
            int r12 = r12.mo14121n(r10)
            r11.mo16851B(r2, r12)
            com.onedelhi.secure.by6.m12149c()
            com.onedelhi.secure.ce5 r11 = r35.mo23368U()
            com.onedelhi.secure.k36 r12 = com.onedelhi.secure.n36.f17011A0
            boolean r11 = r11.mo14110B(r14, r12)
            if (r11 == 0) goto L_0x0110
            com.onedelhi.secure.ce5 r11 = r35.mo23368U()
            com.onedelhi.secure.k36 r12 = com.onedelhi.secure.n36.f17033Q
            r13 = 10
            r14 = 35
            int r11 = r11.mo14123p(r10, r12, r13, r14)
            goto L_0x0111
        L_0x0110:
            r11 = 0
        L_0x0111:
            java.util.TreeSet r12 = new java.util.TreeSet
            android.os.Bundle r13 = r2.f10637a
            java.util.Set r13 = r13.keySet()
            r12.<init>(r13)
            java.util.Iterator r12 = r12.iterator()
        L_0x0120:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x015c
            java.lang.Object r13 = r12.next()
            java.lang.String r13 = (java.lang.String) r13
            java.lang.String r14 = "items"
            boolean r14 = r14.equals(r13)
            if (r14 == 0) goto L_0x0120
            com.onedelhi.secure.gr6 r14 = r35.mo23382h0()
            r17 = r12
            android.os.Bundle r12 = r2.f10637a
            android.os.Parcelable[] r12 = r12.getParcelableArray(r13)
            com.onedelhi.secure.by6.m12149c()
            com.onedelhi.secure.ce5 r13 = r35.mo23368U()
            r18 = r15
            com.onedelhi.secure.k36 r15 = com.onedelhi.secure.n36.f17011A0
            r28 = r8
            r8 = 0
            boolean r9 = r13.mo14110B(r8, r15)
            r14.mo16850A(r12, r11, r9)
            r12 = r17
            r15 = r18
            r8 = r28
            goto L_0x0120
        L_0x015c:
            r28 = r8
            r18 = r15
            com.onedelhi.secure.xj5 r2 = r2.mo14531a()
            com.onedelhi.secure.a56 r8 = r35.mo15136e()
            java.lang.String r8 = r8.mo12722D()
            r9 = 2
            boolean r8 = android.util.Log.isLoggable(r8, r9)
            if (r8 == 0) goto L_0x018a
            com.onedelhi.secure.a56 r8 = r35.mo15136e()
            com.onedelhi.secure.u46 r8 = r8.mo12730v()
            com.onedelhi.secure.za6 r11 = r1.f19420a
            com.onedelhi.secure.l46 r11 = r11.mo27862D()
            java.lang.String r11 = r11.mo19279c(r2)
            java.lang.String r12 = "Logging event"
            r8.mo25380b(r12, r11)
        L_0x018a:
            com.onedelhi.secure.yx6.m32757c()
            com.onedelhi.secure.ce5 r8 = r35.mo23368U()
            com.onedelhi.secure.k36 r11 = com.onedelhi.secure.n36.f17092x0
            r14 = 0
            r8.mo14110B(r14, r11)
            com.onedelhi.secure.vg5 r8 = r1.f19418a
            m26059R(r8)
            r8.mo26077e0()
            r1.mo23366S(r3)     // Catch:{ all -> 0x0b11 }
            java.lang.String r8 = "ecommerce_purchase"
            java.lang.String r11 = r2.f22604b     // Catch:{ all -> 0x0b11 }
            boolean r8 = r8.equals(r11)     // Catch:{ all -> 0x0b11 }
            java.lang.String r11 = "refund"
            if (r8 != 0) goto L_0x01c3
            java.lang.String r8 = "purchase"
            java.lang.String r12 = r2.f22604b     // Catch:{ all -> 0x0b11 }
            boolean r8 = r8.equals(r12)     // Catch:{ all -> 0x0b11 }
            if (r8 != 0) goto L_0x01c3
            java.lang.String r8 = r2.f22604b     // Catch:{ all -> 0x0b11 }
            boolean r8 = r11.equals(r8)     // Catch:{ all -> 0x0b11 }
            if (r8 == 0) goto L_0x01c1
            goto L_0x01c3
        L_0x01c1:
            r8 = 0
            goto L_0x01c4
        L_0x01c3:
            r8 = 1
        L_0x01c4:
            java.lang.String r12 = "_iap"
            java.lang.String r13 = r2.f22604b     // Catch:{ all -> 0x0b11 }
            boolean r12 = r12.equals(r13)     // Catch:{ all -> 0x0b11 }
            if (r12 != 0) goto L_0x01db
            if (r8 == 0) goto L_0x01d2
            r8 = 1
            goto L_0x01db
        L_0x01d2:
            r32 = r4
            r33 = r5
            r4 = r18
            r5 = 1
            goto L_0x036f
        L_0x01db:
            com.onedelhi.secure.hj5 r12 = r2.f22602a     // Catch:{ all -> 0x0b11 }
            java.lang.String r13 = "currency"
            java.lang.String r12 = r12.mo17318P2(r13)     // Catch:{ all -> 0x0b11 }
            java.lang.String r13 = "value"
            if (r8 == 0) goto L_0x024b
            com.onedelhi.secure.hj5 r8 = r2.f22602a     // Catch:{ all -> 0x0b11 }
            java.lang.Double r8 = r8.mo17315M2(r13)     // Catch:{ all -> 0x0b11 }
            double r16 = r8.doubleValue()     // Catch:{ all -> 0x0b11 }
            r19 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r16 = r16 * r19
            r21 = 0
            int r8 = (r16 > r21 ? 1 : (r16 == r21 ? 0 : -1))
            if (r8 != 0) goto L_0x020b
            com.onedelhi.secure.hj5 r8 = r2.f22602a     // Catch:{ all -> 0x0b11 }
            java.lang.Long r8 = r8.mo17316N2(r13)     // Catch:{ all -> 0x0b11 }
            long r14 = r8.longValue()     // Catch:{ all -> 0x0b11 }
            double r13 = (double) r14     // Catch:{ all -> 0x0b11 }
            double r16 = r13 * r19
        L_0x020b:
            r13 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r8 = (r16 > r13 ? 1 : (r16 == r13 ? 0 : -1))
            if (r8 > 0) goto L_0x0225
            r13 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            int r8 = (r16 > r13 ? 1 : (r16 == r13 ? 0 : -1))
            if (r8 < 0) goto L_0x0225
            long r13 = java.lang.Math.round(r16)     // Catch:{ all -> 0x0b11 }
            java.lang.String r8 = r2.f22604b     // Catch:{ all -> 0x0b11 }
            boolean r8 = r11.equals(r8)     // Catch:{ all -> 0x0b11 }
            if (r8 == 0) goto L_0x0255
            long r13 = -r13
            goto L_0x0255
        L_0x0225:
            com.onedelhi.secure.a56 r2 = r35.mo15136e()     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.u46 r2 = r2.mo12731w()     // Catch:{ all -> 0x0b11 }
            java.lang.String r3 = "Data lost. Currency value is too big. appId"
            java.lang.Object r4 = com.onedelhi.secure.a56.m10802z(r10)     // Catch:{ all -> 0x0b11 }
            java.lang.Double r5 = java.lang.Double.valueOf(r16)     // Catch:{ all -> 0x0b11 }
            r2.mo25381c(r3, r4, r5)     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.vg5 r2 = r1.f19418a     // Catch:{ all -> 0x0b11 }
            m26059R(r2)     // Catch:{ all -> 0x0b11 }
            r2.mo26083o()     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.vg5 r2 = r1.f19418a
            m26059R(r2)
            r2.mo26078f0()
            return
        L_0x024b:
            com.onedelhi.secure.hj5 r8 = r2.f22602a     // Catch:{ all -> 0x0b11 }
            java.lang.Long r8 = r8.mo17316N2(r13)     // Catch:{ all -> 0x0b11 }
            long r13 = r8.longValue()     // Catch:{ all -> 0x0b11 }
        L_0x0255:
            boolean r8 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x0b11 }
            if (r8 != 0) goto L_0x01d2
            java.util.Locale r8 = java.util.Locale.US     // Catch:{ all -> 0x0b11 }
            java.lang.String r8 = r12.toUpperCase(r8)     // Catch:{ all -> 0x0b11 }
            java.lang.String r11 = "[A-Z]{3}"
            boolean r11 = r8.matches(r11)     // Catch:{ all -> 0x0b11 }
            if (r11 == 0) goto L_0x01d2
            java.lang.String r11 = "_ltv_"
            java.lang.String r8 = r11.concat(r8)     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.vg5 r11 = r1.f19418a     // Catch:{ all -> 0x0b11 }
            m26059R(r11)     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.ar6 r11 = r11.mo26070X(r10, r8)     // Catch:{ all -> 0x0b11 }
            if (r11 == 0) goto L_0x02b3
            java.lang.Object r11 = r11.f9507a     // Catch:{ all -> 0x0b11 }
            boolean r12 = r11 instanceof java.lang.Long     // Catch:{ all -> 0x0b11 }
            if (r12 != 0) goto L_0x0281
            goto L_0x02b3
        L_0x0281:
            java.lang.Long r11 = (java.lang.Long) r11     // Catch:{ all -> 0x0b11 }
            long r11 = r11.longValue()     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.ar6 r19 = new com.onedelhi.secure.ar6     // Catch:{ all -> 0x0b11 }
            java.lang.String r15 = r2.f22605c     // Catch:{ all -> 0x0b11 }
            com.google.android.gms.common.util.Clock r16 = r35.mo15133a()     // Catch:{ all -> 0x0b11 }
            long r16 = r16.currentTimeMillis()     // Catch:{ all -> 0x0b11 }
            long r11 = r11 + r13
            java.lang.Long r20 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0b11 }
            r11 = r19
            r12 = r10
            r14 = 0
            r13 = r15
            r9 = 0
            r15 = 0
            r14 = r8
            r8 = r18
            r15 = r16
            r17 = r20
            r11.<init>(r12, r13, r14, r15, r17)     // Catch:{ all -> 0x0b11 }
            r32 = r4
            r33 = r5
            r4 = r8
            r8 = r19
            r5 = 1
            goto L_0x0334
        L_0x02b3:
            r15 = r18
            r9 = 0
            com.onedelhi.secure.vg5 r11 = r1.f19418a     // Catch:{ all -> 0x0b11 }
            m26059R(r11)     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.ce5 r12 = r35.mo23368U()     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.k36 r9 = com.onedelhi.secure.n36.f17018E     // Catch:{ all -> 0x0b11 }
            int r9 = r12.mo14122o(r10, r9)     // Catch:{ all -> 0x0b11 }
            int r9 = r9 + -1
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r10)     // Catch:{ all -> 0x0b11 }
            r11.mo15139h()     // Catch:{ all -> 0x0b11 }
            r11.mo27038i()     // Catch:{ all -> 0x0b11 }
            android.database.sqlite.SQLiteDatabase r12 = r11.mo26063P()     // Catch:{ SQLiteException -> 0x02fc }
            r18 = r15
            java.lang.String r15 = "delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);"
            r32 = r4
            r4 = 3
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x02f4 }
            r16 = 0
            r4[r16] = r10     // Catch:{ SQLiteException -> 0x02f4 }
            r33 = r5
            r5 = 1
            r4[r5] = r10     // Catch:{ SQLiteException -> 0x02f2 }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ SQLiteException -> 0x02f2 }
            r16 = 2
            r4[r16] = r9     // Catch:{ SQLiteException -> 0x02f2 }
            r12.execSQL(r15, r4)     // Catch:{ SQLiteException -> 0x02f2 }
            goto L_0x0318
        L_0x02f2:
            r0 = move-exception
            goto L_0x0304
        L_0x02f4:
            r0 = move-exception
            goto L_0x02f9
        L_0x02f6:
            r0 = move-exception
            r32 = r4
        L_0x02f9:
            r33 = r5
            goto L_0x0303
        L_0x02fc:
            r0 = move-exception
            r32 = r4
            r33 = r5
            r18 = r15
        L_0x0303:
            r5 = 1
        L_0x0304:
            r4 = r0
            com.onedelhi.secure.za6 r9 = r11.f11205a     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.a56 r9 = r9.mo15136e()     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.u46 r9 = r9.mo12726r()     // Catch:{ all -> 0x0b11 }
            java.lang.String r11 = "Error pruning currencies. appId"
            java.lang.Object r12 = com.onedelhi.secure.a56.m10802z(r10)     // Catch:{ all -> 0x0b11 }
            r9.mo25381c(r11, r12, r4)     // Catch:{ all -> 0x0b11 }
        L_0x0318:
            com.onedelhi.secure.ar6 r19 = new com.onedelhi.secure.ar6     // Catch:{ all -> 0x0b11 }
            java.lang.String r4 = r2.f22605c     // Catch:{ all -> 0x0b11 }
            com.google.android.gms.common.util.Clock r9 = r35.mo15133a()     // Catch:{ all -> 0x0b11 }
            long r15 = r9.currentTimeMillis()     // Catch:{ all -> 0x0b11 }
            java.lang.Long r17 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x0b11 }
            r11 = r19
            r12 = r10
            r13 = r4
            r14 = r8
            r4 = r18
            r11.<init>(r12, r13, r14, r15, r17)     // Catch:{ all -> 0x0b11 }
            r8 = r19
        L_0x0334:
            com.onedelhi.secure.vg5 r9 = r1.f19418a     // Catch:{ all -> 0x0b11 }
            m26059R(r9)     // Catch:{ all -> 0x0b11 }
            boolean r9 = r9.mo26092x(r8)     // Catch:{ all -> 0x0b11 }
            if (r9 != 0) goto L_0x036f
            com.onedelhi.secure.a56 r9 = r35.mo15136e()     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.u46 r9 = r9.mo12726r()     // Catch:{ all -> 0x0b11 }
            java.lang.String r11 = "Too many unique user properties are set. Ignoring user property. appId"
            java.lang.Object r12 = com.onedelhi.secure.a56.m10802z(r10)     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.za6 r13 = r1.f19420a     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.l46 r13 = r13.mo27862D()     // Catch:{ all -> 0x0b11 }
            java.lang.String r14 = r8.f9510c     // Catch:{ all -> 0x0b11 }
            java.lang.String r13 = r13.mo19282f(r14)     // Catch:{ all -> 0x0b11 }
            java.lang.Object r8 = r8.f9507a     // Catch:{ all -> 0x0b11 }
            r9.mo25382d(r11, r12, r13, r8)     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.gr6 r11 = r35.mo23382h0()     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.er6 r12 = r1.f19411a     // Catch:{ all -> 0x0b11 }
            r14 = 9
            r15 = 0
            r16 = 0
            r17 = 0
            r13 = r10
            r11.mo16852C(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0b11 }
        L_0x036f:
            java.lang.String r8 = r2.f22604b     // Catch:{ all -> 0x0b11 }
            boolean r8 = com.onedelhi.secure.gr6.m16176Z(r8)     // Catch:{ all -> 0x0b11 }
            java.lang.String r9 = r2.f22604b     // Catch:{ all -> 0x0b11 }
            boolean r4 = r4.equals(r9)     // Catch:{ all -> 0x0b11 }
            r35.mo23382h0()     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.hj5 r9 = r2.f22602a     // Catch:{ all -> 0x0b11 }
            if (r9 != 0) goto L_0x0385
            r12 = 0
            goto L_0x03a4
        L_0x0385:
            com.onedelhi.secure.zi5 r11 = new com.onedelhi.secure.zi5     // Catch:{ all -> 0x0b11 }
            r11.<init>(r9)     // Catch:{ all -> 0x0b11 }
            r12 = 0
        L_0x038c:
            boolean r16 = r11.hasNext()     // Catch:{ all -> 0x0b11 }
            if (r16 == 0) goto L_0x03a4
            java.lang.String r14 = r11.next()     // Catch:{ all -> 0x0b11 }
            java.lang.Object r14 = r9.mo17317O2(r14)     // Catch:{ all -> 0x0b11 }
            boolean r15 = r14 instanceof android.os.Parcelable[]     // Catch:{ all -> 0x0b11 }
            if (r15 == 0) goto L_0x038c
            android.os.Parcelable[] r14 = (android.os.Parcelable[]) r14     // Catch:{ all -> 0x0b11 }
            int r14 = r14.length     // Catch:{ all -> 0x0b11 }
            long r14 = (long) r14     // Catch:{ all -> 0x0b11 }
            long r12 = r12 + r14
            goto L_0x038c
        L_0x03a4:
            com.onedelhi.secure.vg5 r11 = r1.f19418a     // Catch:{ all -> 0x0b11 }
            m26059R(r11)     // Catch:{ all -> 0x0b11 }
            long r14 = r35.mo23357F()     // Catch:{ all -> 0x0b11 }
            r22 = 1
            long r18 = r12 + r22
            r9 = 1
            r20 = 0
            r21 = 0
            r12 = r14
            r30 = r6
            r5 = 0
            r14 = r10
            r15 = r18
            r17 = r9
            r18 = r8
            r19 = r20
            r20 = r4
            com.onedelhi.secure.uf5 r9 = r11.mo26068U(r12, r14, r15, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x0b11 }
            long r11 = r9.f21331b     // Catch:{ all -> 0x0b11 }
            r35.mo23368U()     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.k36 r13 = com.onedelhi.secure.n36.f17065k     // Catch:{ all -> 0x0b11 }
            r15 = 0
            java.lang.Object r13 = r13.mo18887a(r15)     // Catch:{ all -> 0x0b11 }
            java.lang.Integer r13 = (java.lang.Integer) r13     // Catch:{ all -> 0x0b11 }
            int r13 = r13.intValue()     // Catch:{ all -> 0x0b11 }
            long r13 = (long) r13     // Catch:{ all -> 0x0b11 }
            long r11 = r11 - r13
            r13 = 1000(0x3e8, double:4.94E-321)
            int r16 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r16 <= 0) goto L_0x0411
            long r11 = r11 % r13
            int r2 = (r11 > r22 ? 1 : (r11 == r22 ? 0 : -1))
            if (r2 != 0) goto L_0x0400
            com.onedelhi.secure.a56 r2 = r35.mo15136e()     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.u46 r2 = r2.mo12726r()     // Catch:{ all -> 0x0b11 }
            java.lang.String r3 = "Data loss. Too many events logged. appId, count"
            java.lang.Object r4 = com.onedelhi.secure.a56.m10802z(r10)     // Catch:{ all -> 0x0b11 }
            long r5 = r9.f21331b     // Catch:{ all -> 0x0b11 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0b11 }
            r2.mo25381c(r3, r4, r5)     // Catch:{ all -> 0x0b11 }
        L_0x0400:
            com.onedelhi.secure.vg5 r2 = r1.f19418a     // Catch:{ all -> 0x0b11 }
            m26059R(r2)     // Catch:{ all -> 0x0b11 }
            r2.mo26083o()     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.vg5 r2 = r1.f19418a
            m26059R(r2)
            r2.mo26078f0()
            return
        L_0x0411:
            if (r8 == 0) goto L_0x046d
            long r11 = r9.f21330a     // Catch:{ all -> 0x0b11 }
            r35.mo23368U()     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.k36 r13 = com.onedelhi.secure.n36.f17069m     // Catch:{ all -> 0x0b11 }
            java.lang.Object r13 = r13.mo18887a(r15)     // Catch:{ all -> 0x0b11 }
            java.lang.Integer r13 = (java.lang.Integer) r13     // Catch:{ all -> 0x0b11 }
            int r13 = r13.intValue()     // Catch:{ all -> 0x0b11 }
            long r13 = (long) r13     // Catch:{ all -> 0x0b11 }
            long r11 = r11 - r13
            int r13 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r13 <= 0) goto L_0x046d
            r13 = 1000(0x3e8, double:4.94E-321)
            long r11 = r11 % r13
            int r3 = (r11 > r22 ? 1 : (r11 == r22 ? 0 : -1))
            if (r3 != 0) goto L_0x0448
            com.onedelhi.secure.a56 r3 = r35.mo15136e()     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.u46 r3 = r3.mo12726r()     // Catch:{ all -> 0x0b11 }
            java.lang.String r4 = "Data loss. Too many public events logged. appId, count"
            java.lang.Object r5 = com.onedelhi.secure.a56.m10802z(r10)     // Catch:{ all -> 0x0b11 }
            long r6 = r9.f21330a     // Catch:{ all -> 0x0b11 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0b11 }
            r3.mo25381c(r4, r5, r6)     // Catch:{ all -> 0x0b11 }
        L_0x0448:
            com.onedelhi.secure.gr6 r11 = r35.mo23382h0()     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.er6 r12 = r1.f19411a     // Catch:{ all -> 0x0b11 }
            r14 = 16
            java.lang.String r15 = "_ev"
            java.lang.String r2 = r2.f22604b     // Catch:{ all -> 0x0b11 }
            r17 = 0
            r13 = r10
            r16 = r2
            r11.mo16852C(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.vg5 r2 = r1.f19418a     // Catch:{ all -> 0x0b11 }
            m26059R(r2)     // Catch:{ all -> 0x0b11 }
            r2.mo26083o()     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.vg5 r2 = r1.f19418a
            m26059R(r2)
            r2.mo26078f0()
            return
        L_0x046d:
            r11 = 1000000(0xf4240, float:1.401298E-39)
            if (r4 == 0) goto L_0x04bb
            long r12 = r9.f21333d     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.ce5 r4 = r35.mo23368U()     // Catch:{ all -> 0x0b11 }
            java.lang.String r14 = r3.f21557b     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.k36 r15 = com.onedelhi.secure.n36.f17067l     // Catch:{ all -> 0x0b11 }
            int r4 = r4.mo14122o(r14, r15)     // Catch:{ all -> 0x0b11 }
            int r4 = java.lang.Math.min(r11, r4)     // Catch:{ all -> 0x0b11 }
            r14 = 0
            int r4 = java.lang.Math.max(r14, r4)     // Catch:{ all -> 0x0b11 }
            long r14 = (long) r4     // Catch:{ all -> 0x0b11 }
            long r12 = r12 - r14
            int r4 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x04bb
            int r2 = (r12 > r22 ? 1 : (r12 == r22 ? 0 : -1))
            if (r2 != 0) goto L_0x04aa
            com.onedelhi.secure.a56 r2 = r35.mo15136e()     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.u46 r2 = r2.mo12726r()     // Catch:{ all -> 0x0b11 }
            java.lang.String r3 = "Too many error events logged. appId, count"
            java.lang.Object r4 = com.onedelhi.secure.a56.m10802z(r10)     // Catch:{ all -> 0x0b11 }
            long r5 = r9.f21333d     // Catch:{ all -> 0x0b11 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0b11 }
            r2.mo25381c(r3, r4, r5)     // Catch:{ all -> 0x0b11 }
        L_0x04aa:
            com.onedelhi.secure.vg5 r2 = r1.f19418a     // Catch:{ all -> 0x0b11 }
            m26059R(r2)     // Catch:{ all -> 0x0b11 }
            r2.mo26083o()     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.vg5 r2 = r1.f19418a
            m26059R(r2)
            r2.mo26078f0()
            return
        L_0x04bb:
            com.onedelhi.secure.hj5 r4 = r2.f22602a     // Catch:{ all -> 0x0b11 }
            android.os.Bundle r4 = r4.mo17314L2()     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.gr6 r9 = r35.mo23382h0()     // Catch:{ all -> 0x0b11 }
            java.lang.String r12 = "_o"
            java.lang.String r13 = r2.f22605c     // Catch:{ all -> 0x0b11 }
            r9.mo16853D(r4, r12, r13)     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.gr6 r9 = r35.mo23382h0()     // Catch:{ all -> 0x0b11 }
            boolean r9 = r9.mo16870U(r10)     // Catch:{ all -> 0x0b11 }
            java.lang.String r15 = "_r"
            if (r9 == 0) goto L_0x04ec
            com.onedelhi.secure.gr6 r9 = r35.mo23382h0()     // Catch:{ all -> 0x0b11 }
            java.lang.String r12 = "_dbg"
            java.lang.Long r13 = java.lang.Long.valueOf(r22)     // Catch:{ all -> 0x0b11 }
            r9.mo16853D(r4, r12, r13)     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.gr6 r9 = r35.mo23382h0()     // Catch:{ all -> 0x0b11 }
            r9.mo16853D(r4, r15, r13)     // Catch:{ all -> 0x0b11 }
        L_0x04ec:
            java.lang.String r9 = "_s"
            java.lang.String r12 = r2.f22604b     // Catch:{ all -> 0x0b11 }
            boolean r9 = r9.equals(r12)     // Catch:{ all -> 0x0b11 }
            if (r9 == 0) goto L_0x0512
            com.onedelhi.secure.vg5 r9 = r1.f19418a     // Catch:{ all -> 0x0b11 }
            m26059R(r9)     // Catch:{ all -> 0x0b11 }
            java.lang.String r12 = r3.f21557b     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.ar6 r9 = r9.mo26070X(r12, r7)     // Catch:{ all -> 0x0b11 }
            if (r9 == 0) goto L_0x0512
            java.lang.Object r12 = r9.f9507a     // Catch:{ all -> 0x0b11 }
            boolean r12 = r12 instanceof java.lang.Long     // Catch:{ all -> 0x0b11 }
            if (r12 == 0) goto L_0x0512
            com.onedelhi.secure.gr6 r12 = r35.mo23382h0()     // Catch:{ all -> 0x0b11 }
            java.lang.Object r9 = r9.f9507a     // Catch:{ all -> 0x0b11 }
            r12.mo16853D(r4, r7, r9)     // Catch:{ all -> 0x0b11 }
        L_0x0512:
            com.onedelhi.secure.vg5 r7 = r1.f19418a     // Catch:{ all -> 0x0b11 }
            m26059R(r7)     // Catch:{ all -> 0x0b11 }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r10)     // Catch:{ all -> 0x0b11 }
            r7.mo15139h()     // Catch:{ all -> 0x0b11 }
            r7.mo27038i()     // Catch:{ all -> 0x0b11 }
            android.database.sqlite.SQLiteDatabase r9 = r7.mo26063P()     // Catch:{ SQLiteException -> 0x0556 }
            com.onedelhi.secure.za6 r12 = r7.f11205a     // Catch:{ SQLiteException -> 0x0556 }
            com.onedelhi.secure.ce5 r12 = r12.mo27891z()     // Catch:{ SQLiteException -> 0x0556 }
            com.onedelhi.secure.k36 r13 = com.onedelhi.secure.n36.f17075p     // Catch:{ SQLiteException -> 0x0556 }
            int r12 = r12.mo14122o(r10, r13)     // Catch:{ SQLiteException -> 0x0556 }
            int r11 = java.lang.Math.min(r11, r12)     // Catch:{ SQLiteException -> 0x0556 }
            r14 = 0
            int r11 = java.lang.Math.max(r14, r11)     // Catch:{ SQLiteException -> 0x0552 }
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch:{ SQLiteException -> 0x0552 }
            java.lang.String r12 = "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)"
            r13 = 2
            java.lang.String[] r13 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x0552 }
            r13[r14] = r10     // Catch:{ SQLiteException -> 0x0552 }
            r17 = 1
            r13[r17] = r11     // Catch:{ SQLiteException -> 0x0552 }
            r11 = r30
            int r7 = r9.delete(r11, r12, r13)     // Catch:{ SQLiteException -> 0x0550 }
            long r12 = (long) r7
            goto L_0x056f
        L_0x0550:
            r0 = move-exception
            goto L_0x055a
        L_0x0552:
            r0 = move-exception
            r11 = r30
            goto L_0x055a
        L_0x0556:
            r0 = move-exception
            r11 = r30
            r14 = 0
        L_0x055a:
            r9 = r0
            com.onedelhi.secure.za6 r7 = r7.f11205a     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.a56 r7 = r7.mo15136e()     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.u46 r7 = r7.mo12726r()     // Catch:{ all -> 0x0b11 }
            java.lang.String r12 = "Error deleting over the limit events. appId"
            java.lang.Object r13 = com.onedelhi.secure.a56.m10802z(r10)     // Catch:{ all -> 0x0b11 }
            r7.mo25381c(r12, r13, r9)     // Catch:{ all -> 0x0b11 }
            r12 = r5
        L_0x056f:
            int r7 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0588
            com.onedelhi.secure.a56 r7 = r35.mo15136e()     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.u46 r7 = r7.mo12731w()     // Catch:{ all -> 0x0b11 }
            java.lang.String r9 = "Data lost. Too many events stored on disk, deleted. appId"
            java.lang.Object r14 = com.onedelhi.secure.a56.m10802z(r10)     // Catch:{ all -> 0x0b11 }
            java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0b11 }
            r7.mo25381c(r9, r14, r12)     // Catch:{ all -> 0x0b11 }
        L_0x0588:
            com.onedelhi.secure.ji5 r7 = new com.onedelhi.secure.ji5     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.za6 r12 = r1.f19420a     // Catch:{ all -> 0x0b11 }
            java.lang.String r13 = r2.f22605c     // Catch:{ all -> 0x0b11 }
            java.lang.String r9 = r2.f22604b     // Catch:{ all -> 0x0b11 }
            long r5 = r2.f22603b     // Catch:{ all -> 0x0b11 }
            r18 = 0
            r2 = r11
            r11 = r7
            r31 = 0
            r14 = r10
            r36 = r2
            r34 = r15
            r2 = 0
            r15 = r9
            r16 = r5
            r20 = r4
            r11.<init>((com.onedelhi.secure.za6) r12, (java.lang.String) r13, (java.lang.String) r14, (java.lang.String) r15, (long) r16, (long) r18, (android.os.Bundle) r20)     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.vg5 r4 = r1.f19418a     // Catch:{ all -> 0x0b11 }
            m26059R(r4)     // Catch:{ all -> 0x0b11 }
            java.lang.String r5 = r7.f14186b     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.ri5 r4 = r4.mo26069V(r10, r5)     // Catch:{ all -> 0x0b11 }
            if (r4 != 0) goto L_0x062c
            com.onedelhi.secure.vg5 r4 = r1.f19418a     // Catch:{ all -> 0x0b11 }
            m26059R(r4)     // Catch:{ all -> 0x0b11 }
            long r4 = r4.mo26062O(r10)     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.ce5 r6 = r35.mo23368U()     // Catch:{ all -> 0x0b11 }
            int r6 = r6.mo14119l(r10)     // Catch:{ all -> 0x0b11 }
            long r11 = (long) r6     // Catch:{ all -> 0x0b11 }
            int r6 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r6 < 0) goto L_0x060e
            if (r8 == 0) goto L_0x060e
            com.onedelhi.secure.a56 r2 = r35.mo15136e()     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.u46 r2 = r2.mo12726r()     // Catch:{ all -> 0x0b11 }
            java.lang.String r3 = "Too many event names used, ignoring event. appId, name, supported count"
            java.lang.Object r4 = com.onedelhi.secure.a56.m10802z(r10)     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.za6 r5 = r1.f19420a     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.l46 r5 = r5.mo27862D()     // Catch:{ all -> 0x0b11 }
            java.lang.String r6 = r7.f14186b     // Catch:{ all -> 0x0b11 }
            java.lang.String r5 = r5.mo19280d(r6)     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.ce5 r6 = r35.mo23368U()     // Catch:{ all -> 0x0b11 }
            int r6 = r6.mo14119l(r10)     // Catch:{ all -> 0x0b11 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0b11 }
            r2.mo25382d(r3, r4, r5, r6)     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.gr6 r11 = r35.mo23382h0()     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.er6 r12 = r1.f19411a     // Catch:{ all -> 0x0b11 }
            r14 = 8
            r15 = 0
            r16 = 0
            r17 = 0
            r13 = r10
            r11.mo16852C(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.vg5 r2 = r1.f19418a
            m26059R(r2)
            r2.mo26078f0()
            return
        L_0x060e:
            com.onedelhi.secure.ri5 r4 = new com.onedelhi.secure.ri5     // Catch:{ all -> 0x0b11 }
            java.lang.String r13 = r7.f14186b     // Catch:{ all -> 0x0b11 }
            long r5 = r7.f14182a     // Catch:{ all -> 0x0b11 }
            r14 = 0
            r16 = 0
            r18 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r11 = r4
            r12 = r10
            r20 = r5
            r11.<init>(r12, r13, r14, r16, r18, r20, r22, r24, r25, r26, r27)     // Catch:{ all -> 0x0b11 }
            goto L_0x063a
        L_0x062c:
            com.onedelhi.secure.za6 r5 = r1.f19420a     // Catch:{ all -> 0x0b11 }
            long r8 = r4.f19883d     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.ji5 r7 = r7.mo18440a(r5, r8)     // Catch:{ all -> 0x0b11 }
            long r5 = r7.f14182a     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.ri5 r4 = r4.mo23874c(r5)     // Catch:{ all -> 0x0b11 }
        L_0x063a:
            com.onedelhi.secure.vg5 r5 = r1.f19418a     // Catch:{ all -> 0x0b11 }
            m26059R(r5)     // Catch:{ all -> 0x0b11 }
            r5.mo26085q(r4)     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.qa6 r4 = r35.mo15135d()     // Catch:{ all -> 0x0b11 }
            r4.mo15139h()     // Catch:{ all -> 0x0b11 }
            r35.mo23379g()     // Catch:{ all -> 0x0b11 }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r7)     // Catch:{ all -> 0x0b11 }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r37)     // Catch:{ all -> 0x0b11 }
            java.lang.String r4 = r7.f14184a     // Catch:{ all -> 0x0b11 }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r4)     // Catch:{ all -> 0x0b11 }
            java.lang.String r4 = r7.f14184a     // Catch:{ all -> 0x0b11 }
            java.lang.String r5 = r3.f21557b     // Catch:{ all -> 0x0b11 }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x0b11 }
            com.google.android.gms.common.internal.Preconditions.checkArgument(r4)     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.va6 r4 = com.onedelhi.secure.ya6.m32031Q1()     // Catch:{ all -> 0x0b11 }
            r5 = 1
            r4.mo25953U(r5)     // Catch:{ all -> 0x0b11 }
            java.lang.String r6 = "android"
            r4.mo25948P(r6)     // Catch:{ all -> 0x0b11 }
            java.lang.String r6 = r3.f21557b     // Catch:{ all -> 0x0b11 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0b11 }
            if (r6 != 0) goto L_0x067c
            java.lang.String r6 = r3.f21557b     // Catch:{ all -> 0x0b11 }
            r4.mo25981t(r6)     // Catch:{ all -> 0x0b11 }
        L_0x067c:
            java.lang.String r6 = r3.f21566e     // Catch:{ all -> 0x0b11 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0b11 }
            if (r6 != 0) goto L_0x0689
            java.lang.String r6 = r3.f21566e     // Catch:{ all -> 0x0b11 }
            r4.mo25985v(r6)     // Catch:{ all -> 0x0b11 }
        L_0x0689:
            java.lang.String r6 = r3.f21563d     // Catch:{ all -> 0x0b11 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0b11 }
            if (r6 != 0) goto L_0x0696
            java.lang.String r6 = r3.f21563d     // Catch:{ all -> 0x0b11 }
            r4.mo25987w(r6)     // Catch:{ all -> 0x0b11 }
        L_0x0696:
            com.onedelhi.secure.xz6.m31807c()     // Catch:{ all -> 0x0b11 }
            java.lang.String r6 = r3.f21578l     // Catch:{ all -> 0x0b11 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0b11 }
            if (r6 != 0) goto L_0x06c0
            com.onedelhi.secure.ce5 r6 = r35.mo23368U()     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.k36 r8 = com.onedelhi.secure.n36.f17070m0     // Catch:{ all -> 0x0b11 }
            boolean r6 = r6.mo14110B(r2, r8)     // Catch:{ all -> 0x0b11 }
            if (r6 != 0) goto L_0x06bb
            com.onedelhi.secure.ce5 r6 = r35.mo23368U()     // Catch:{ all -> 0x0b11 }
            java.lang.String r8 = r3.f21557b     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.k36 r9 = com.onedelhi.secure.n36.f17074o0     // Catch:{ all -> 0x0b11 }
            boolean r6 = r6.mo14110B(r8, r9)     // Catch:{ all -> 0x0b11 }
            if (r6 == 0) goto L_0x06c0
        L_0x06bb:
            java.lang.String r6 = r3.f21578l     // Catch:{ all -> 0x0b11 }
            r4.mo25957Y(r6)     // Catch:{ all -> 0x0b11 }
        L_0x06c0:
            long r8 = r3.f21562d     // Catch:{ all -> 0x0b11 }
            r10 = -2147483648(0xffffffff80000000, double:NaN)
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x06cd
            int r6 = (int) r8     // Catch:{ all -> 0x0b11 }
            r4.mo25989x(r6)     // Catch:{ all -> 0x0b11 }
        L_0x06cd:
            long r8 = r3.f21556b     // Catch:{ all -> 0x0b11 }
            r4.mo25944L(r8)     // Catch:{ all -> 0x0b11 }
            java.lang.String r6 = r3.f21560c     // Catch:{ all -> 0x0b11 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0b11 }
            if (r6 != 0) goto L_0x06df
            java.lang.String r6 = r3.f21560c     // Catch:{ all -> 0x0b11 }
            r4.mo25942K(r6)     // Catch:{ all -> 0x0b11 }
        L_0x06df:
            java.lang.String r6 = r3.f21557b     // Catch:{ all -> 0x0b11 }
            java.lang.Object r6 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r6)     // Catch:{ all -> 0x0b11 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.ye5 r6 = r1.mo23369V(r6)     // Catch:{ all -> 0x0b11 }
            java.lang.String r8 = r3.f21576j     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.ye5 r8 = com.onedelhi.secure.ye5.m32305b(r8)     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.ye5 r6 = r6.mo27431c(r8)     // Catch:{ all -> 0x0b11 }
            java.lang.String r6 = r6.mo27436h()     // Catch:{ all -> 0x0b11 }
            r4.mo25924B(r6)     // Catch:{ all -> 0x0b11 }
            java.lang.String r6 = r4.mo25967i0()     // Catch:{ all -> 0x0b11 }
            boolean r6 = r6.isEmpty()     // Catch:{ all -> 0x0b11 }
            if (r6 == 0) goto L_0x0713
            java.lang.String r6 = r3.f21574h     // Catch:{ all -> 0x0b11 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0b11 }
            if (r6 != 0) goto L_0x0713
            java.lang.String r6 = r3.f21574h     // Catch:{ all -> 0x0b11 }
            r4.mo25979s(r6)     // Catch:{ all -> 0x0b11 }
        L_0x0713:
            long r8 = r3.f21559c     // Catch:{ all -> 0x0b11 }
            r10 = 0
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x071e
            r4.mo25926C(r8)     // Catch:{ all -> 0x0b11 }
        L_0x071e:
            long r8 = r3.f21571g     // Catch:{ all -> 0x0b11 }
            r4.mo25932F(r8)     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.uq6 r6 = r1.f19416a     // Catch:{ all -> 0x0b11 }
            m26059R(r6)     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.qq6 r8 = r6.f21907a     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.za6 r8 = r8.f19420a     // Catch:{ all -> 0x0b11 }
            android.content.Context r8 = r8.mo15137f()     // Catch:{ all -> 0x0b11 }
            android.content.ContentResolver r8 = r8.getContentResolver()     // Catch:{ all -> 0x0b11 }
            java.lang.String r9 = "com.google.android.gms.measurement"
            android.net.Uri r9 = com.onedelhi.secure.gg6.m15836a(r9)     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.nk5 r10 = com.onedelhi.secure.nk5.f17479a     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.ze6 r8 = com.onedelhi.secure.ze6.m33095b(r8, r9, r10)     // Catch:{ all -> 0x0b11 }
            if (r8 != 0) goto L_0x0747
            java.util.Map r8 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0b11 }
            goto L_0x074b
        L_0x0747:
            java.util.Map r8 = r8.mo27959c()     // Catch:{ all -> 0x0b11 }
        L_0x074b:
            if (r8 == 0) goto L_0x07d1
            boolean r9 = r8.isEmpty()     // Catch:{ all -> 0x0b11 }
            if (r9 == 0) goto L_0x0755
            goto L_0x07d1
        L_0x0755:
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ all -> 0x0b11 }
            r14.<init>()     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.k36 r9 = com.onedelhi.secure.n36.f17032P     // Catch:{ all -> 0x0b11 }
            java.lang.Object r9 = r9.mo18887a(r2)     // Catch:{ all -> 0x0b11 }
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch:{ all -> 0x0b11 }
            int r9 = r9.intValue()     // Catch:{ all -> 0x0b11 }
            java.util.Set r8 = r8.entrySet()     // Catch:{ all -> 0x0b11 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x0b11 }
        L_0x076e:
            boolean r10 = r8.hasNext()     // Catch:{ all -> 0x0b11 }
            if (r10 == 0) goto L_0x07cb
            java.lang.Object r10 = r8.next()     // Catch:{ all -> 0x0b11 }
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10     // Catch:{ all -> 0x0b11 }
            java.lang.Object r11 = r10.getKey()     // Catch:{ all -> 0x0b11 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0b11 }
            java.lang.String r12 = "measurement.id."
            boolean r11 = r11.startsWith(r12)     // Catch:{ all -> 0x0b11 }
            if (r11 == 0) goto L_0x076e
            java.lang.Object r10 = r10.getValue()     // Catch:{ NumberFormatException -> 0x07b9 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ NumberFormatException -> 0x07b9 }
            int r10 = java.lang.Integer.parseInt(r10)     // Catch:{ NumberFormatException -> 0x07b9 }
            if (r10 == 0) goto L_0x076e
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ NumberFormatException -> 0x07b9 }
            r14.add(r10)     // Catch:{ NumberFormatException -> 0x07b9 }
            int r10 = r14.size()     // Catch:{ NumberFormatException -> 0x07b9 }
            if (r10 < r9) goto L_0x076e
            com.onedelhi.secure.za6 r10 = r6.f11205a     // Catch:{ NumberFormatException -> 0x07b9 }
            com.onedelhi.secure.a56 r10 = r10.mo15136e()     // Catch:{ NumberFormatException -> 0x07b9 }
            com.onedelhi.secure.u46 r10 = r10.mo12731w()     // Catch:{ NumberFormatException -> 0x07b9 }
            java.lang.String r11 = "Too many experiment IDs. Number of IDs"
            int r12 = r14.size()     // Catch:{ NumberFormatException -> 0x07b9 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ NumberFormatException -> 0x07b9 }
            r10.mo25380b(r11, r12)     // Catch:{ NumberFormatException -> 0x07b9 }
            goto L_0x07cb
        L_0x07b9:
            r0 = move-exception
            r10 = r0
            com.onedelhi.secure.za6 r11 = r6.f11205a     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.a56 r11 = r11.mo15136e()     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.u46 r11 = r11.mo12731w()     // Catch:{ all -> 0x0b11 }
            java.lang.String r12 = "Experiment ID NumberFormatException"
            r11.mo25380b(r12, r10)     // Catch:{ all -> 0x0b11 }
            goto L_0x076e
        L_0x07cb:
            boolean r6 = r14.isEmpty()     // Catch:{ all -> 0x0b11 }
            if (r6 == 0) goto L_0x07d2
        L_0x07d1:
            r14 = r2
        L_0x07d2:
            if (r14 == 0) goto L_0x07d7
            r4.mo25980s0(r14)     // Catch:{ all -> 0x0b11 }
        L_0x07d7:
            java.lang.String r6 = r3.f21557b     // Catch:{ all -> 0x0b11 }
            java.lang.Object r6 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r6)     // Catch:{ all -> 0x0b11 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.ye5 r6 = r1.mo23369V(r6)     // Catch:{ all -> 0x0b11 }
            java.lang.String r8 = r3.f21576j     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.ye5 r8 = com.onedelhi.secure.ye5.m32305b(r8)     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.ye5 r6 = r6.mo27431c(r8)     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.ne5 r8 = com.onedelhi.secure.ne5.AD_STORAGE     // Catch:{ all -> 0x0b11 }
            boolean r9 = r6.mo27438i(r8)     // Catch:{ all -> 0x0b11 }
            if (r9 == 0) goto L_0x0823
            boolean r9 = r3.f21564d     // Catch:{ all -> 0x0b11 }
            if (r9 == 0) goto L_0x0823
            com.onedelhi.secure.sm6 r9 = r1.f19414a     // Catch:{ all -> 0x0b11 }
            java.lang.String r10 = r3.f21557b     // Catch:{ all -> 0x0b11 }
            android.util.Pair r9 = r9.mo24483n(r10, r6)     // Catch:{ all -> 0x0b11 }
            java.lang.Object r10 = r9.first     // Catch:{ all -> 0x0b11 }
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10     // Catch:{ all -> 0x0b11 }
            boolean r10 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x0b11 }
            if (r10 != 0) goto L_0x0823
            boolean r10 = r3.f21564d     // Catch:{ all -> 0x0b11 }
            if (r10 == 0) goto L_0x0823
            java.lang.Object r10 = r9.first     // Catch:{ all -> 0x0b11 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x0b11 }
            r4.mo25954V(r10)     // Catch:{ all -> 0x0b11 }
            java.lang.Object r9 = r9.second     // Catch:{ all -> 0x0b11 }
            if (r9 == 0) goto L_0x0823
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch:{ all -> 0x0b11 }
            boolean r9 = r9.booleanValue()     // Catch:{ all -> 0x0b11 }
            r4.mo25946N(r9)     // Catch:{ all -> 0x0b11 }
        L_0x0823:
            com.onedelhi.secure.za6 r9 = r1.f19420a     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.bi5 r9 = r9.mo27859A()     // Catch:{ all -> 0x0b11 }
            r9.mo17201k()     // Catch:{ all -> 0x0b11 }
            java.lang.String r9 = android.os.Build.MODEL     // Catch:{ all -> 0x0b11 }
            r4.mo25928D(r9)     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.za6 r9 = r1.f19420a     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.bi5 r9 = r9.mo27859A()     // Catch:{ all -> 0x0b11 }
            r9.mo17201k()     // Catch:{ all -> 0x0b11 }
            java.lang.String r9 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x0b11 }
            r4.mo25947O(r9)     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.za6 r9 = r1.f19420a     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.bi5 r9 = r9.mo27859A()     // Catch:{ all -> 0x0b11 }
            long r9 = r9.mo13730p()     // Catch:{ all -> 0x0b11 }
            int r10 = (int) r9     // Catch:{ all -> 0x0b11 }
            r4.mo25960b0(r10)     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.za6 r9 = r1.f19420a     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.bi5 r9 = r9.mo27859A()     // Catch:{ all -> 0x0b11 }
            java.lang.String r9 = r9.mo13731q()     // Catch:{ all -> 0x0b11 }
            r4.mo25964f0(r9)     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.ky6.m20117c()     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.ce5 r9 = r35.mo23368U()     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.k36 r10 = com.onedelhi.secure.n36.f17019E0     // Catch:{ all -> 0x0b11 }
            boolean r9 = r9.mo14110B(r2, r10)     // Catch:{ all -> 0x0b11 }
            if (r9 == 0) goto L_0x086e
            long r9 = r3.f21573h     // Catch:{ all -> 0x0b11 }
            r4.mo25959a0(r9)     // Catch:{ all -> 0x0b11 }
        L_0x086e:
            com.onedelhi.secure.za6 r9 = r1.f19420a     // Catch:{ all -> 0x0b11 }
            boolean r9 = r9.mo27884o()     // Catch:{ all -> 0x0b11 }
            if (r9 == 0) goto L_0x0882
            r4.mo25966h0()     // Catch:{ all -> 0x0b11 }
            boolean r9 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0b11 }
            if (r9 != 0) goto L_0x0882
            r4.mo25930E(r2)     // Catch:{ all -> 0x0b11 }
        L_0x0882:
            com.onedelhi.secure.vg5 r9 = r1.f19418a     // Catch:{ all -> 0x0b11 }
            m26059R(r9)     // Catch:{ all -> 0x0b11 }
            java.lang.String r10 = r3.f21557b     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.yd6 r9 = r9.mo26065R(r10)     // Catch:{ all -> 0x0b11 }
            if (r9 != 0) goto L_0x08f2
            com.onedelhi.secure.yd6 r9 = new com.onedelhi.secure.yd6     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.za6 r10 = r1.f19420a     // Catch:{ all -> 0x0b11 }
            java.lang.String r11 = r3.f21557b     // Catch:{ all -> 0x0b11 }
            r9.<init>(r10, r11)     // Catch:{ all -> 0x0b11 }
            java.lang.String r10 = r1.mo23384i0(r6)     // Catch:{ all -> 0x0b11 }
            r9.mo27398i(r10)     // Catch:{ all -> 0x0b11 }
            java.lang.String r10 = r3.f21572g     // Catch:{ all -> 0x0b11 }
            r9.mo27418w(r10)     // Catch:{ all -> 0x0b11 }
            java.lang.String r10 = r3.f21560c     // Catch:{ all -> 0x0b11 }
            r9.mo27419x(r10)     // Catch:{ all -> 0x0b11 }
            boolean r8 = r6.mo27438i(r8)     // Catch:{ all -> 0x0b11 }
            if (r8 == 0) goto L_0x08bc
            com.onedelhi.secure.sm6 r8 = r1.f19414a     // Catch:{ all -> 0x0b11 }
            java.lang.String r10 = r3.f21557b     // Catch:{ all -> 0x0b11 }
            boolean r11 = r3.f21564d     // Catch:{ all -> 0x0b11 }
            java.lang.String r8 = r8.mo24484o(r10, r11)     // Catch:{ all -> 0x0b11 }
            r9.mo27362G(r8)     // Catch:{ all -> 0x0b11 }
        L_0x08bc:
            r10 = 0
            r9.mo27358C(r10)     // Catch:{ all -> 0x0b11 }
            r9.mo27359D(r10)     // Catch:{ all -> 0x0b11 }
            r9.mo27357B(r10)     // Catch:{ all -> 0x0b11 }
            java.lang.String r8 = r3.f21563d     // Catch:{ all -> 0x0b11 }
            r9.mo27402k(r8)     // Catch:{ all -> 0x0b11 }
            long r10 = r3.f21562d     // Catch:{ all -> 0x0b11 }
            r9.mo27404l(r10)     // Catch:{ all -> 0x0b11 }
            java.lang.String r8 = r3.f21566e     // Catch:{ all -> 0x0b11 }
            r9.mo27400j(r8)     // Catch:{ all -> 0x0b11 }
            long r10 = r3.f21556b     // Catch:{ all -> 0x0b11 }
            r9.mo27420y(r10)     // Catch:{ all -> 0x0b11 }
            long r10 = r3.f21559c     // Catch:{ all -> 0x0b11 }
            r9.mo27415t(r10)     // Catch:{ all -> 0x0b11 }
            boolean r8 = r3.f21558b     // Catch:{ all -> 0x0b11 }
            r9.mo27360E(r8)     // Catch:{ all -> 0x0b11 }
            long r10 = r3.f21571g     // Catch:{ all -> 0x0b11 }
            r9.mo27416u(r10)     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.vg5 r8 = r1.f19418a     // Catch:{ all -> 0x0b11 }
            m26059R(r8)     // Catch:{ all -> 0x0b11 }
            r8.mo26084p(r9)     // Catch:{ all -> 0x0b11 }
        L_0x08f2:
            com.onedelhi.secure.ne5 r8 = com.onedelhi.secure.ne5.ANALYTICS_STORAGE     // Catch:{ all -> 0x0b11 }
            boolean r6 = r6.mo27438i(r8)     // Catch:{ all -> 0x0b11 }
            if (r6 == 0) goto L_0x0911
            java.lang.String r6 = r9.mo27401j0()     // Catch:{ all -> 0x0b11 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0b11 }
            if (r6 != 0) goto L_0x0911
            java.lang.String r6 = r9.mo27401j0()     // Catch:{ all -> 0x0b11 }
            java.lang.Object r6 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r6)     // Catch:{ all -> 0x0b11 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x0b11 }
            r4.mo25983u(r6)     // Catch:{ all -> 0x0b11 }
        L_0x0911:
            java.lang.String r6 = r9.mo27407m0()     // Catch:{ all -> 0x0b11 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0b11 }
            if (r6 != 0) goto L_0x0928
            java.lang.String r6 = r9.mo27407m0()     // Catch:{ all -> 0x0b11 }
            java.lang.Object r6 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r6)     // Catch:{ all -> 0x0b11 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x0b11 }
            r4.mo25940J(r6)     // Catch:{ all -> 0x0b11 }
        L_0x0928:
            com.onedelhi.secure.vg5 r6 = r1.f19418a     // Catch:{ all -> 0x0b11 }
            m26059R(r6)     // Catch:{ all -> 0x0b11 }
            java.lang.String r3 = r3.f21557b     // Catch:{ all -> 0x0b11 }
            java.util.List r3 = r6.mo26075c0(r3)     // Catch:{ all -> 0x0b11 }
            r13 = 0
        L_0x0934:
            int r6 = r3.size()     // Catch:{ all -> 0x0b11 }
            if (r13 >= r6) goto L_0x096a
            com.onedelhi.secure.wb6 r6 = com.onedelhi.secure.zb6.m33030E()     // Catch:{ all -> 0x0b11 }
            java.lang.Object r8 = r3.get(r13)     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.ar6 r8 = (com.onedelhi.secure.ar6) r8     // Catch:{ all -> 0x0b11 }
            java.lang.String r8 = r8.f9510c     // Catch:{ all -> 0x0b11 }
            r6.mo26489v(r8)     // Catch:{ all -> 0x0b11 }
            java.lang.Object r8 = r3.get(r13)     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.ar6 r8 = (com.onedelhi.secure.ar6) r8     // Catch:{ all -> 0x0b11 }
            long r8 = r8.f9506a     // Catch:{ all -> 0x0b11 }
            r6.mo26490w(r8)     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.uq6 r8 = r1.f19416a     // Catch:{ all -> 0x0b11 }
            m26059R(r8)     // Catch:{ all -> 0x0b11 }
            java.lang.Object r9 = r3.get(r13)     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.ar6 r9 = (com.onedelhi.secure.ar6) r9     // Catch:{ all -> 0x0b11 }
            java.lang.Object r9 = r9.f9507a     // Catch:{ all -> 0x0b11 }
            r8.mo25700K(r6, r9)     // Catch:{ all -> 0x0b11 }
            r4.mo25988w0(r6)     // Catch:{ all -> 0x0b11 }
            int r13 = r13 + 1
            goto L_0x0934
        L_0x096a:
            com.onedelhi.secure.vg5 r3 = r1.f19418a     // Catch:{ IOException -> 0x0ac7 }
            m26059R(r3)     // Catch:{ IOException -> 0x0ac7 }
            com.onedelhi.secure.jq6 r6 = r4.mo17922m()     // Catch:{ IOException -> 0x0ac7 }
            com.onedelhi.secure.ya6 r6 = (com.onedelhi.secure.ya6) r6     // Catch:{ IOException -> 0x0ac7 }
            r3.mo15139h()     // Catch:{ IOException -> 0x0ac7 }
            r3.mo27038i()     // Catch:{ IOException -> 0x0ac7 }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r6)     // Catch:{ IOException -> 0x0ac7 }
            java.lang.String r8 = r6.mo27287U1()     // Catch:{ IOException -> 0x0ac7 }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r8)     // Catch:{ IOException -> 0x0ac7 }
            byte[] r8 = r6.mo22497h()     // Catch:{ IOException -> 0x0ac7 }
            com.onedelhi.secure.qq6 r9 = r3.f21907a     // Catch:{ IOException -> 0x0ac7 }
            com.onedelhi.secure.uq6 r9 = r9.f19416a     // Catch:{ IOException -> 0x0ac7 }
            m26059R(r9)     // Catch:{ IOException -> 0x0ac7 }
            long r9 = r9.mo25705x(r8)     // Catch:{ IOException -> 0x0ac7 }
            android.content.ContentValues r11 = new android.content.ContentValues     // Catch:{ IOException -> 0x0ac7 }
            r11.<init>()     // Catch:{ IOException -> 0x0ac7 }
            java.lang.String r12 = r6.mo27287U1()     // Catch:{ IOException -> 0x0ac7 }
            r13 = r33
            r11.put(r13, r12)     // Catch:{ IOException -> 0x0ac7 }
            java.lang.Long r12 = java.lang.Long.valueOf(r9)     // Catch:{ IOException -> 0x0ac7 }
            r14 = r32
            r11.put(r14, r12)     // Catch:{ IOException -> 0x0ac7 }
            java.lang.String r12 = "metadata"
            r11.put(r12, r8)     // Catch:{ IOException -> 0x0ac7 }
            android.database.sqlite.SQLiteDatabase r8 = r3.mo26063P()     // Catch:{ SQLiteException -> 0x0aad }
            java.lang.String r12 = "raw_events_metadata"
            r15 = 4
            r8.insertWithOnConflict(r12, r2, r11, r15)     // Catch:{ SQLiteException -> 0x0aad }
            com.onedelhi.secure.vg5 r3 = r1.f19418a     // Catch:{ all -> 0x0b11 }
            m26059R(r3)     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.hj5 r4 = r7.f14183a     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.zi5 r6 = new com.onedelhi.secure.zi5     // Catch:{ all -> 0x0b11 }
            r6.<init>(r4)     // Catch:{ all -> 0x0b11 }
        L_0x09c6:
            boolean r4 = r6.hasNext()     // Catch:{ all -> 0x0b11 }
            if (r4 == 0) goto L_0x09de
            java.lang.String r4 = r6.next()     // Catch:{ all -> 0x0b11 }
            r8 = r34
            boolean r4 = r8.equals(r4)     // Catch:{ all -> 0x0b11 }
            if (r4 == 0) goto L_0x09db
        L_0x09d8:
            r31 = 1
            goto L_0x0a1c
        L_0x09db:
            r34 = r8
            goto L_0x09c6
        L_0x09de:
            com.onedelhi.secure.b96 r4 = r1.f19407a     // Catch:{ all -> 0x0b11 }
            m26059R(r4)     // Catch:{ all -> 0x0b11 }
            java.lang.String r6 = r7.f14184a     // Catch:{ all -> 0x0b11 }
            java.lang.String r8 = r7.f14186b     // Catch:{ all -> 0x0b11 }
            boolean r4 = r4.mo13571E(r6, r8)     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.vg5 r15 = r1.f19418a     // Catch:{ all -> 0x0b11 }
            m26059R(r15)     // Catch:{ all -> 0x0b11 }
            long r16 = r35.mo23357F()     // Catch:{ all -> 0x0b11 }
            java.lang.String r6 = r7.f14184a     // Catch:{ all -> 0x0b11 }
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r18 = r6
            com.onedelhi.secure.uf5 r6 = r15.mo26067T(r16, r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x0b11 }
            if (r4 == 0) goto L_0x0a1c
            long r11 = r6.f21334e     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.ce5 r4 = r35.mo23368U()     // Catch:{ all -> 0x0b11 }
            java.lang.String r6 = r7.f14184a     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.k36 r8 = com.onedelhi.secure.n36.f17073o     // Catch:{ all -> 0x0b11 }
            int r4 = r4.mo14122o(r6, r8)     // Catch:{ all -> 0x0b11 }
            long r5 = (long) r4     // Catch:{ all -> 0x0b11 }
            int r4 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x0a1c
            goto L_0x09d8
        L_0x0a1c:
            r3.mo15139h()     // Catch:{ all -> 0x0b11 }
            r3.mo27038i()     // Catch:{ all -> 0x0b11 }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r7)     // Catch:{ all -> 0x0b11 }
            java.lang.String r4 = r7.f14184a     // Catch:{ all -> 0x0b11 }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r4)     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.qq6 r4 = r3.f21907a     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.uq6 r4 = r4.f19416a     // Catch:{ all -> 0x0b11 }
            m26059R(r4)     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.x86 r4 = r4.mo25693B(r7)     // Catch:{ all -> 0x0b11 }
            byte[] r4 = r4.mo22497h()     // Catch:{ all -> 0x0b11 }
            android.content.ContentValues r5 = new android.content.ContentValues     // Catch:{ all -> 0x0b11 }
            r5.<init>()     // Catch:{ all -> 0x0b11 }
            java.lang.String r6 = r7.f14184a     // Catch:{ all -> 0x0b11 }
            r5.put(r13, r6)     // Catch:{ all -> 0x0b11 }
            java.lang.String r6 = "name"
            java.lang.String r8 = r7.f14186b     // Catch:{ all -> 0x0b11 }
            r5.put(r6, r8)     // Catch:{ all -> 0x0b11 }
            java.lang.String r6 = "timestamp"
            long r11 = r7.f14182a     // Catch:{ all -> 0x0b11 }
            java.lang.Long r8 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0b11 }
            r5.put(r6, r8)     // Catch:{ all -> 0x0b11 }
            java.lang.Long r6 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x0b11 }
            r5.put(r14, r6)     // Catch:{ all -> 0x0b11 }
            java.lang.String r6 = "data"
            r5.put(r6, r4)     // Catch:{ all -> 0x0b11 }
            java.lang.String r4 = "realtime"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r31)     // Catch:{ all -> 0x0b11 }
            r5.put(r4, r6)     // Catch:{ all -> 0x0b11 }
            android.database.sqlite.SQLiteDatabase r4 = r3.mo26063P()     // Catch:{ SQLiteException -> 0x0a95 }
            r6 = r36
            long r4 = r4.insert(r6, r2, r5)     // Catch:{ SQLiteException -> 0x0a95 }
            r8 = -1
            int r2 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r2 != 0) goto L_0x0a90
            com.onedelhi.secure.za6 r2 = r3.f11205a     // Catch:{ SQLiteException -> 0x0a95 }
            com.onedelhi.secure.a56 r2 = r2.mo15136e()     // Catch:{ SQLiteException -> 0x0a95 }
            com.onedelhi.secure.u46 r2 = r2.mo12726r()     // Catch:{ SQLiteException -> 0x0a95 }
            java.lang.String r4 = "Failed to insert raw event (got -1). appId"
            java.lang.String r5 = r7.f14184a     // Catch:{ SQLiteException -> 0x0a95 }
            java.lang.Object r5 = com.onedelhi.secure.a56.m10802z(r5)     // Catch:{ SQLiteException -> 0x0a95 }
            r2.mo25380b(r4, r5)     // Catch:{ SQLiteException -> 0x0a95 }
            goto L_0x0ade
        L_0x0a90:
            r4 = 0
            r1.f19406a = r4     // Catch:{ all -> 0x0b11 }
            goto L_0x0ade
        L_0x0a95:
            r0 = move-exception
            r2 = r0
            com.onedelhi.secure.za6 r3 = r3.f11205a     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.a56 r3 = r3.mo15136e()     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.u46 r3 = r3.mo12726r()     // Catch:{ all -> 0x0b11 }
            java.lang.String r4 = "Error storing raw event. appId"
            java.lang.String r5 = r7.f14184a     // Catch:{ all -> 0x0b11 }
            java.lang.Object r5 = com.onedelhi.secure.a56.m10802z(r5)     // Catch:{ all -> 0x0b11 }
            r3.mo25381c(r4, r5, r2)     // Catch:{ all -> 0x0b11 }
            goto L_0x0ade
        L_0x0aad:
            r0 = move-exception
            r2 = r0
            com.onedelhi.secure.za6 r3 = r3.f11205a     // Catch:{ IOException -> 0x0ac7 }
            com.onedelhi.secure.a56 r3 = r3.mo15136e()     // Catch:{ IOException -> 0x0ac7 }
            com.onedelhi.secure.u46 r3 = r3.mo12726r()     // Catch:{ IOException -> 0x0ac7 }
            java.lang.String r5 = "Error storing raw event metadata. appId"
            java.lang.String r6 = r6.mo27287U1()     // Catch:{ IOException -> 0x0ac7 }
            java.lang.Object r6 = com.onedelhi.secure.a56.m10802z(r6)     // Catch:{ IOException -> 0x0ac7 }
            r3.mo25381c(r5, r6, r2)     // Catch:{ IOException -> 0x0ac7 }
            throw r2     // Catch:{ IOException -> 0x0ac7 }
        L_0x0ac7:
            r0 = move-exception
            r2 = r0
            com.onedelhi.secure.a56 r3 = r35.mo15136e()     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.u46 r3 = r3.mo12726r()     // Catch:{ all -> 0x0b11 }
            java.lang.String r5 = "Data loss. Failed to insert raw event metadata. appId"
            java.lang.String r4 = r4.mo25966h0()     // Catch:{ all -> 0x0b11 }
            java.lang.Object r4 = com.onedelhi.secure.a56.m10802z(r4)     // Catch:{ all -> 0x0b11 }
            r3.mo25381c(r5, r4, r2)     // Catch:{ all -> 0x0b11 }
        L_0x0ade:
            com.onedelhi.secure.vg5 r2 = r1.f19418a     // Catch:{ all -> 0x0b11 }
            m26059R(r2)     // Catch:{ all -> 0x0b11 }
            r2.mo26083o()     // Catch:{ all -> 0x0b11 }
            com.onedelhi.secure.vg5 r2 = r1.f19418a
            m26059R(r2)
            r2.mo26078f0()
            r35.mo23362M()
            com.onedelhi.secure.a56 r2 = r35.mo15136e()
            com.onedelhi.secure.u46 r2 = r2.mo12730v()
            long r3 = java.lang.System.nanoTime()
            long r3 = r3 - r28
            r5 = 500000(0x7a120, double:2.47033E-318)
            long r3 = r3 + r5
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 / r5
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "Background event processing time, ms"
            r2.mo25380b(r4, r3)
            return
        L_0x0b11:
            r0 = move-exception
            r2 = r0
            com.onedelhi.secure.vg5 r3 = r1.f19418a
            m26059R(r3)
            r3.mo26078f0()
            throw r2
        L_0x0b1c:
            r1.mo23366S(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.qq6.mo23355D(com.onedelhi.secure.xj5, com.onedelhi.secure.uy6):void");
    }

    @VisibleForTesting
    @ly4
    /* renamed from: E */
    public final boolean mo23356E() {
        String str;
        u46 u46;
        mo15135d().mo15139h();
        FileLock fileLock = this.f19423a;
        if (fileLock == null || !fileLock.isValid()) {
            this.f19418a.f11205a.mo27891z();
            try {
                FileChannel channel = new RandomAccessFile(new File(this.f19420a.mo15137f().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
                this.f19422a = channel;
                FileLock tryLock = channel.tryLock();
                this.f19423a = tryLock;
                if (tryLock != null) {
                    mo15136e().mo12730v().mo25379a("Storage concurrent access okay");
                    return true;
                }
                mo15136e().mo12726r().mo25379a("Storage concurrent data access panic");
                return false;
            } catch (FileNotFoundException e) {
                e = e;
                u46 = mo15136e().mo12726r();
                str = "Failed to acquire storage lock";
                u46.mo25380b(str, e);
                return false;
            } catch (IOException e2) {
                e = e2;
                u46 = mo15136e().mo12726r();
                str = "Failed to access storage lock file";
                u46.mo25380b(str, e);
                return false;
            } catch (OverlappingFileLockException e3) {
                e = e3;
                u46 = mo15136e().mo12731w();
                str = "Storage lock already acquired";
                u46.mo25380b(str, e);
                return false;
            }
        } else {
            mo15136e().mo12730v().mo25379a("Storage concurrent access okay");
            return true;
        }
    }

    /* renamed from: F */
    public final long mo23357F() {
        long currentTimeMillis = mo15133a().currentTimeMillis();
        sm6 sm6 = this.f19414a;
        sm6.mo27038i();
        sm6.mo15139h();
        long a = sm6.f20437e.mo15075a();
        if (a == 0) {
            a = ((long) sm6.f11205a.mo27871N().mo16892u().nextInt(86400000)) + 1;
            sm6.f20437e.mo15076b(a);
        }
        return ((((currentTimeMillis + a) / 1000) / 60) / 60) / 24;
    }

    @ly4
    /* renamed from: I */
    public final uy6 mo23358I(String str) {
        u46 q;
        String str2;
        Object obj;
        String str3 = str;
        vg5 vg5 = this.f19418a;
        m26059R(vg5);
        yd6 R = vg5.mo26065R(str3);
        if (R == null || TextUtils.isEmpty(R.mo27405l0())) {
            q = mo15136e().mo12725q();
            str2 = "No app data available; dropping";
            obj = str3;
        } else {
            Boolean J = mo23359J(R);
            if (J == null || J.booleanValue()) {
                yd6 yd6 = R;
                yd6.mo27356A();
                return new uy6(str, R.mo27409n0(), R.mo27405l0(), R.mo27371P(), R.mo27403k0(), R.mo27383a0(), R.mo27379X(), (String) null, R.mo27368M(), false, R.mo27407m0(), 0, 0, 0, yd6.mo27367L(), false, yd6.mo27395g0(), yd6.mo27393f0(), yd6.mo27380Y(), yd6.mo27388d(), (String) null, mo23369V(str).mo27436h(), "", (String) null, yd6.mo27370O(), yd6.mo27391e0());
            }
            q = mo15136e().mo12726r();
            str2 = "App version does not match; dropping. appId";
            obj = a56.m10802z(str);
        }
        q.mo25380b(str2, obj);
        return null;
    }

    @ly4
    /* renamed from: J */
    public final Boolean mo23359J(yd6 yd6) {
        try {
            if (yd6.mo27371P() != -2147483648L) {
                if (yd6.mo27371P() == ((long) Wrappers.packageManager(this.f19420a.mo15137f()).getPackageInfo(yd6.mo27399i0(), 0).versionCode)) {
                    return Boolean.TRUE;
                }
            } else {
                String str = Wrappers.packageManager(this.f19420a.mo15137f()).getPackageInfo(yd6.mo27399i0(), 0).versionName;
                String l0 = yd6.mo27405l0();
                if (l0 != null && l0.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @ly4
    /* renamed from: K */
    public final void mo23360K() {
        mo15135d().mo15139h();
        if (this.f19433c || this.f19434d || this.f19435e) {
            mo15136e().mo12730v().mo25382d("Not stopping services. fetch, network, upload", Boolean.valueOf(this.f19433c), Boolean.valueOf(this.f19434d), Boolean.valueOf(this.f19435e));
            return;
        }
        mo15136e().mo12730v().mo25379a("Stopping uploading service(s)");
        List<Runnable> list = this.f19424a;
        if (list != null) {
            for (Runnable run : list) {
                run.run();
            }
            ((List) Preconditions.checkNotNull(this.f19424a)).clear();
        }
    }

    @VisibleForTesting
    /* renamed from: L */
    public final void mo23361L(va6 va6, long j, boolean z) {
        vg5 vg5 = this.f19418a;
        m26059R(vg5);
        String str = true != z ? "_lte" : "_se";
        ar6 X = vg5.mo26070X(va6.mo25966h0(), str);
        ar6 ar6 = (X == null || X.f9507a == null) ? new ar6(va6.mo25966h0(), bf0.f26274c, str, mo15133a().currentTimeMillis(), Long.valueOf(j)) : new ar6(va6.mo25966h0(), bf0.f26274c, str, mo15133a().currentTimeMillis(), Long.valueOf(((Long) X.f9507a).longValue() + j));
        wb6 E = zb6.m33030E();
        E.mo26489v(str);
        E.mo26490w(mo15133a().currentTimeMillis());
        E.mo26488u(((Long) ar6.f9507a).longValue());
        zb6 zb6 = (zb6) E.mo17922m();
        int w = uq6.m29512w(va6, str);
        if (w >= 0) {
            va6.mo25963e0(w, zb6);
        } else {
            va6.mo25990x0(zb6);
        }
        if (j > 0) {
            vg5 vg52 = this.f19418a;
            m26059R(vg52);
            vg52.mo26092x(ar6);
            mo15136e().mo12730v().mo25381c("Updated engagement user property. scope, value", true != z ? "lifetime" : "session-scoped", ar6.f9507a);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x021d  */
    @com.onedelhi.secure.ly4
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo23362M() {
        /*
            r20 = this;
            r0 = r20
            com.onedelhi.secure.qa6 r1 = r20.mo15135d()
            r1.mo15139h()
            r20.mo23379g()
            long r1 = r0.f19406a
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x004e
            r1 = 3600000(0x36ee80, double:1.7786363E-317)
            com.google.android.gms.common.util.Clock r5 = r20.mo15133a()
            long r5 = r5.elapsedRealtime()
            long r7 = r0.f19406a
            long r5 = r5 - r7
            long r5 = java.lang.Math.abs(r5)
            long r1 = r1 - r5
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x004c
            com.onedelhi.secure.a56 r3 = r20.mo15136e()
            com.onedelhi.secure.u46 r3 = r3.mo12730v()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "Upload has been suspended. Will update scheduling later in approximately ms"
            r3.mo25380b(r2, r1)
            com.onedelhi.secure.v66 r1 = r20.mo23373Z()
            r1.mo25869c()
            com.onedelhi.secure.to6 r1 = r0.f19415a
            m26059R(r1)
            r1.mo25240m()
            return
        L_0x004c:
            r0.f19406a = r3
        L_0x004e:
            com.onedelhi.secure.za6 r1 = r0.f19420a
            boolean r1 = r1.mo27887r()
            if (r1 == 0) goto L_0x023a
            boolean r1 = r20.mo23364O()
            if (r1 != 0) goto L_0x005e
            goto L_0x023a
        L_0x005e:
            com.google.android.gms.common.util.Clock r1 = r20.mo15133a()
            long r1 = r1.currentTimeMillis()
            r20.mo23368U()
            com.onedelhi.secure.k36 r5 = com.onedelhi.secure.n36.f17010A
            r6 = 0
            java.lang.Object r5 = r5.mo18887a(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r7 = r5.longValue()
            long r7 = java.lang.Math.max(r3, r7)
            com.onedelhi.secure.vg5 r5 = r0.f19418a
            m26059R(r5)
            boolean r5 = r5.mo26088t()
            r10 = 1
            if (r5 != 0) goto L_0x0093
            com.onedelhi.secure.vg5 r5 = r0.f19418a
            m26059R(r5)
            boolean r5 = r5.mo26087s()
            if (r5 == 0) goto L_0x0092
            goto L_0x0093
        L_0x0092:
            r10 = 0
        L_0x0093:
            if (r10 == 0) goto L_0x00b7
            com.onedelhi.secure.ce5 r5 = r20.mo23368U()
            java.lang.String r5 = r5.mo14128u()
            boolean r11 = android.text.TextUtils.isEmpty(r5)
            if (r11 != 0) goto L_0x00b1
            java.lang.String r11 = ".none."
            boolean r5 = r11.equals(r5)
            if (r5 != 0) goto L_0x00b1
            r20.mo23368U()
            com.onedelhi.secure.k36 r5 = com.onedelhi.secure.n36.f17087v
            goto L_0x00bc
        L_0x00b1:
            r20.mo23368U()
            com.onedelhi.secure.k36 r5 = com.onedelhi.secure.n36.f17085u
            goto L_0x00bc
        L_0x00b7:
            r20.mo23368U()
            com.onedelhi.secure.k36 r5 = com.onedelhi.secure.n36.f17083t
        L_0x00bc:
            java.lang.Object r5 = r5.mo18887a(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r11 = r5.longValue()
            long r11 = java.lang.Math.max(r3, r11)
            com.onedelhi.secure.sm6 r5 = r0.f19414a
            com.onedelhi.secure.e76 r5 = r5.f20435c
            long r13 = r5.mo15075a()
            com.onedelhi.secure.sm6 r5 = r0.f19414a
            com.onedelhi.secure.e76 r5 = r5.f20436d
            long r15 = r5.mo15075a()
            com.onedelhi.secure.vg5 r5 = r0.f19418a
            m26059R(r5)
            r17 = r10
            long r9 = r5.mo26060M()
            com.onedelhi.secure.vg5 r5 = r0.f19418a
            m26059R(r5)
            r18 = r7
            long r6 = r5.mo26061N()
            long r5 = java.lang.Math.max(r9, r6)
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L_0x00fb
        L_0x00f8:
            r9 = r3
            goto L_0x0174
        L_0x00fb:
            long r5 = r5 - r1
            long r5 = java.lang.Math.abs(r5)
            long r5 = r1 - r5
            long r13 = r13 - r1
            long r7 = java.lang.Math.abs(r13)
            long r7 = r1 - r7
            long r15 = r15 - r1
            long r9 = java.lang.Math.abs(r15)
            long r1 = r1 - r9
            long r9 = r5 + r18
            long r7 = java.lang.Math.max(r7, r1)
            if (r17 == 0) goto L_0x0120
            int r13 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r13 <= 0) goto L_0x0120
            long r9 = java.lang.Math.min(r5, r7)
            long r9 = r9 + r11
        L_0x0120:
            com.onedelhi.secure.uq6 r13 = r0.f19416a
            m26059R(r13)
            boolean r13 = r13.mo25701M(r7, r11)
            if (r13 != 0) goto L_0x012d
            long r9 = r7 + r11
        L_0x012d:
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 == 0) goto L_0x0174
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 < 0) goto L_0x0174
            r5 = 0
        L_0x0136:
            r20.mo23368U()
            r6 = 20
            com.onedelhi.secure.k36 r7 = com.onedelhi.secure.n36.f17014C
            r8 = 0
            java.lang.Object r7 = r7.mo18887a(r8)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r11 = 0
            int r7 = java.lang.Math.max(r11, r7)
            int r6 = java.lang.Math.min(r6, r7)
            if (r5 >= r6) goto L_0x00f8
            r6 = 1
            long r6 = r6 << r5
            r20.mo23368U()
            com.onedelhi.secure.k36 r12 = com.onedelhi.secure.n36.f17012B
            java.lang.Object r12 = r12.mo18887a(r8)
            java.lang.Long r12 = (java.lang.Long) r12
            long r12 = r12.longValue()
            long r12 = java.lang.Math.max(r3, r12)
            long r12 = r12 * r6
            long r9 = r9 + r12
            int r6 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r6 <= 0) goto L_0x0171
            goto L_0x0174
        L_0x0171:
            int r5 = r5 + 1
            goto L_0x0136
        L_0x0174:
            int r1 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x021d
            com.onedelhi.secure.s56 r1 = r0.f19413a
            m26059R(r1)
            boolean r1 = r1.mo24212m()
            if (r1 == 0) goto L_0x0200
            com.onedelhi.secure.sm6 r1 = r0.f19414a
            com.onedelhi.secure.e76 r1 = r1.f20434b
            long r1 = r1.mo15075a()
            r20.mo23368U()
            com.onedelhi.secure.k36 r5 = com.onedelhi.secure.n36.f17079r
            r6 = 0
            java.lang.Object r5 = r5.mo18887a(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            long r5 = java.lang.Math.max(r3, r5)
            com.onedelhi.secure.uq6 r7 = r0.f19416a
            m26059R(r7)
            boolean r7 = r7.mo25701M(r1, r5)
            if (r7 != 0) goto L_0x01af
            long r1 = r1 + r5
            long r9 = java.lang.Math.max(r9, r1)
        L_0x01af:
            com.onedelhi.secure.v66 r1 = r20.mo23373Z()
            r1.mo25869c()
            com.google.android.gms.common.util.Clock r1 = r20.mo15133a()
            long r1 = r1.currentTimeMillis()
            long r9 = r9 - r1
            int r1 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x01e6
            r20.mo23368U()
            com.onedelhi.secure.k36 r1 = com.onedelhi.secure.n36.f17089w
            r2 = 0
            java.lang.Object r1 = r1.mo18887a(r2)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            long r9 = java.lang.Math.max(r3, r1)
            com.onedelhi.secure.sm6 r1 = r0.f19414a
            com.onedelhi.secure.e76 r1 = r1.f20435c
            com.google.android.gms.common.util.Clock r2 = r20.mo15133a()
            long r2 = r2.currentTimeMillis()
            r1.mo15076b(r2)
        L_0x01e6:
            com.onedelhi.secure.a56 r1 = r20.mo15136e()
            com.onedelhi.secure.u46 r1 = r1.mo12730v()
            java.lang.Long r2 = java.lang.Long.valueOf(r9)
            java.lang.String r3 = "Upload scheduled in approximately ms"
            r1.mo25380b(r3, r2)
            com.onedelhi.secure.to6 r1 = r0.f19415a
            m26059R(r1)
            r1.mo25241n(r9)
            return
        L_0x0200:
            com.onedelhi.secure.a56 r1 = r20.mo15136e()
            com.onedelhi.secure.u46 r1 = r1.mo12730v()
            java.lang.String r2 = "No network"
            r1.mo25379a(r2)
            com.onedelhi.secure.v66 r1 = r20.mo23373Z()
            r1.mo25868b()
            com.onedelhi.secure.to6 r1 = r0.f19415a
            m26059R(r1)
            r1.mo25240m()
            return
        L_0x021d:
            com.onedelhi.secure.a56 r1 = r20.mo15136e()
            com.onedelhi.secure.u46 r1 = r1.mo12730v()
            java.lang.String r2 = "Next upload time is 0"
            r1.mo25379a(r2)
            com.onedelhi.secure.v66 r1 = r20.mo23373Z()
            r1.mo25869c()
            com.onedelhi.secure.to6 r1 = r0.f19415a
            m26059R(r1)
            r1.mo25240m()
            return
        L_0x023a:
            com.onedelhi.secure.a56 r1 = r20.mo15136e()
            com.onedelhi.secure.u46 r1 = r1.mo12730v()
            java.lang.String r2 = "Nothing to upload or uploading impossible"
            r1.mo25379a(r2)
            com.onedelhi.secure.v66 r1 = r20.mo23373Z()
            r1.mo25869c()
            com.onedelhi.secure.to6 r1 = r0.f19415a
            m26059R(r1)
            r1.mo25240m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.qq6.mo23362M():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:359:0x0b2b, code lost:
        if (r10 > (com.onedelhi.secure.ce5.m12446i() + r8)) goto L_0x0b2d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0383 A[Catch:{ NumberFormatException -> 0x079c, all -> 0x0cc2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0447 A[Catch:{ NumberFormatException -> 0x079c, all -> 0x0cc2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0489 A[Catch:{ NumberFormatException -> 0x079c, all -> 0x0cc2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x07d7 A[Catch:{ NumberFormatException -> 0x079c, all -> 0x0cc2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x0820 A[Catch:{ NumberFormatException -> 0x079c, all -> 0x0cc2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x0840 A[Catch:{ NumberFormatException -> 0x079c, all -> 0x0cc2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x08b7 A[Catch:{ NumberFormatException -> 0x079c, all -> 0x0cc2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x08b9 A[Catch:{ NumberFormatException -> 0x079c, all -> 0x0cc2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x08c1 A[Catch:{ NumberFormatException -> 0x079c, all -> 0x0cc2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x08ea A[Catch:{ NumberFormatException -> 0x079c, all -> 0x0cc2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:358:0x0b1b A[Catch:{ NumberFormatException -> 0x079c, all -> 0x0cc2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:367:0x0ba2 A[Catch:{ NumberFormatException -> 0x079c, all -> 0x0cc2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:371:0x0bbe A[Catch:{ SQLiteException -> 0x0bd6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:382:0x0c25 A[Catch:{ NumberFormatException -> 0x079c, all -> 0x0cc2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:387:0x0c56 A[Catch:{ NumberFormatException -> 0x079c, all -> 0x0cc2 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:55:0x01c0=Splitter:B:55:0x01c0, B:399:0x0cb0=Splitter:B:399:0x0cb0} */
    @com.onedelhi.secure.ly4
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo23363N(java.lang.String r41, long r42) {
        /*
            r40 = this;
            r1 = r40
            java.lang.String r2 = "_npa"
            java.lang.String r3 = "_ai"
            com.onedelhi.secure.vg5 r4 = r1.f19418a
            m26059R(r4)
            r4.mo26077e0()
            com.onedelhi.secure.kq6 r4 = new com.onedelhi.secure.kq6     // Catch:{ all -> 0x0cc2 }
            r12 = 0
            r4.<init>(r1, r12)     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.vg5 r5 = r1.f19418a     // Catch:{ all -> 0x0cc2 }
            m26059R(r5)     // Catch:{ all -> 0x0cc2 }
            r6 = 0
            long r9 = r1.f19428b     // Catch:{ all -> 0x0cc2 }
            r7 = r42
            r11 = r4
            r5.mo26055G(r6, r7, r9, r11)     // Catch:{ all -> 0x0cc2 }
            java.util.List r5 = r4.f15049b     // Catch:{ all -> 0x0cc2 }
            if (r5 == 0) goto L_0x0cb0
            boolean r5 = r5.isEmpty()     // Catch:{ all -> 0x0cc2 }
            if (r5 == 0) goto L_0x002e
            goto L_0x0cb0
        L_0x002e:
            com.onedelhi.secure.ya6 r5 = r4.f15047a     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.ip6 r5 = r5.mo18543k()     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.va6 r5 = (com.onedelhi.secure.va6) r5     // Catch:{ all -> 0x0cc2 }
            r5.mo25927C0()     // Catch:{ all -> 0x0cc2 }
            r11 = r12
            r14 = r11
            r8 = 0
            r9 = 0
            r10 = 0
            r13 = -1
            r15 = -1
        L_0x0040:
            java.util.List r12 = r4.f15049b     // Catch:{ all -> 0x0cc2 }
            int r12 = r12.size()     // Catch:{ all -> 0x0cc2 }
            java.lang.String r6 = "_fr"
            java.lang.String r7 = "_et"
            r16 = r10
            java.lang.String r10 = "_e"
            r17 = r13
            r18 = r14
            if (r8 >= r12) goto L_0x04f9
            java.util.List r12 = r4.f15049b     // Catch:{ all -> 0x0cc2 }
            java.lang.Object r12 = r12.get(r8)     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.x86 r12 = (com.onedelhi.secure.x86) r12     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.ip6 r12 = r12.mo18543k()     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.u86 r12 = (com.onedelhi.secure.u86) r12     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.b96 r14 = r1.f19407a     // Catch:{ all -> 0x0cc2 }
            m26059R(r14)     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.ya6 r13 = r4.f15047a     // Catch:{ all -> 0x0cc2 }
            java.lang.String r13 = r13.mo27287U1()     // Catch:{ all -> 0x0cc2 }
            r19 = r2
            java.lang.String r2 = r12.mo25442E()     // Catch:{ all -> 0x0cc2 }
            boolean r2 = r14.mo13572F(r13, r2)     // Catch:{ all -> 0x0cc2 }
            java.lang.String r13 = "_err"
            if (r2 == 0) goto L_0x00f7
            com.onedelhi.secure.a56 r2 = r40.mo15136e()     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.u46 r2 = r2.mo12731w()     // Catch:{ all -> 0x0cc2 }
            java.lang.String r6 = "Dropping blocked raw event. appId"
            com.onedelhi.secure.ya6 r7 = r4.f15047a     // Catch:{ all -> 0x0cc2 }
            java.lang.String r7 = r7.mo27287U1()     // Catch:{ all -> 0x0cc2 }
            java.lang.Object r7 = com.onedelhi.secure.a56.m10802z(r7)     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.za6 r10 = r1.f19420a     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.l46 r10 = r10.mo27862D()     // Catch:{ all -> 0x0cc2 }
            java.lang.String r14 = r12.mo25442E()     // Catch:{ all -> 0x0cc2 }
            java.lang.String r10 = r10.mo19280d(r14)     // Catch:{ all -> 0x0cc2 }
            r2.mo25381c(r6, r7, r10)     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.b96 r2 = r1.f19407a     // Catch:{ all -> 0x0cc2 }
            m26059R(r2)     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.ya6 r6 = r4.f15047a     // Catch:{ all -> 0x0cc2 }
            java.lang.String r6 = r6.mo27287U1()     // Catch:{ all -> 0x0cc2 }
            boolean r2 = r2.mo13570D(r6)     // Catch:{ all -> 0x0cc2 }
            if (r2 != 0) goto L_0x00e8
            com.onedelhi.secure.b96 r2 = r1.f19407a     // Catch:{ all -> 0x0cc2 }
            m26059R(r2)     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.ya6 r6 = r4.f15047a     // Catch:{ all -> 0x0cc2 }
            java.lang.String r6 = r6.mo27287U1()     // Catch:{ all -> 0x0cc2 }
            boolean r2 = r2.mo13573G(r6)     // Catch:{ all -> 0x0cc2 }
            if (r2 == 0) goto L_0x00c3
            goto L_0x00e8
        L_0x00c3:
            java.lang.String r2 = r12.mo25442E()     // Catch:{ all -> 0x0cc2 }
            boolean r2 = r13.equals(r2)     // Catch:{ all -> 0x0cc2 }
            if (r2 != 0) goto L_0x00e8
            com.onedelhi.secure.gr6 r20 = r40.mo23382h0()     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.er6 r2 = r1.f19411a     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.ya6 r6 = r4.f15047a     // Catch:{ all -> 0x0cc2 }
            java.lang.String r22 = r6.mo27287U1()     // Catch:{ all -> 0x0cc2 }
            r23 = 11
            java.lang.String r24 = "_ev"
            java.lang.String r25 = r12.mo25442E()     // Catch:{ all -> 0x0cc2 }
            r26 = 0
            r21 = r2
            r20.mo16852C(r21, r22, r23, r24, r25, r26)     // Catch:{ all -> 0x0cc2 }
        L_0x00e8:
            r21 = r3
            r6 = r8
            r23 = r11
            r10 = r16
            r13 = r17
            r14 = r18
            r11 = r5
            r5 = -1
            goto L_0x04ee
        L_0x00f7:
            java.lang.String r2 = r12.mo25442E()     // Catch:{ all -> 0x0cc2 }
            java.lang.String r14 = com.onedelhi.secure.le6.m20590a(r3)     // Catch:{ all -> 0x0cc2 }
            boolean r2 = r2.equals(r14)     // Catch:{ all -> 0x0cc2 }
            if (r2 == 0) goto L_0x016d
            r12.mo25453y(r3)     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.a56 r2 = r40.mo15136e()     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.u46 r2 = r2.mo12730v()     // Catch:{ all -> 0x0cc2 }
            java.lang.String r14 = "Renaming ad_impression to _ai"
            r2.mo25379a(r14)     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.a56 r2 = r40.mo15136e()     // Catch:{ all -> 0x0cc2 }
            java.lang.String r2 = r2.mo12722D()     // Catch:{ all -> 0x0cc2 }
            r14 = 5
            boolean r2 = android.util.Log.isLoggable(r2, r14)     // Catch:{ all -> 0x0cc2 }
            if (r2 == 0) goto L_0x016d
            r2 = 0
        L_0x0125:
            int r14 = r12.mo25445q()     // Catch:{ all -> 0x0cc2 }
            if (r2 >= r14) goto L_0x016d
            java.lang.String r14 = "ad_platform"
            com.onedelhi.secure.j96 r20 = r12.mo25441D(r2)     // Catch:{ all -> 0x0cc2 }
            r21 = r3
            java.lang.String r3 = r20.mo18174H()     // Catch:{ all -> 0x0cc2 }
            boolean r3 = r14.equals(r3)     // Catch:{ all -> 0x0cc2 }
            if (r3 == 0) goto L_0x0168
            com.onedelhi.secure.j96 r3 = r12.mo25441D(r2)     // Catch:{ all -> 0x0cc2 }
            java.lang.String r3 = r3.mo18175I()     // Catch:{ all -> 0x0cc2 }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x0cc2 }
            if (r3 != 0) goto L_0x0168
            java.lang.String r3 = "admob"
            com.onedelhi.secure.j96 r14 = r12.mo25441D(r2)     // Catch:{ all -> 0x0cc2 }
            java.lang.String r14 = r14.mo18175I()     // Catch:{ all -> 0x0cc2 }
            boolean r3 = r3.equalsIgnoreCase(r14)     // Catch:{ all -> 0x0cc2 }
            if (r3 == 0) goto L_0x0168
            com.onedelhi.secure.a56 r3 = r40.mo15136e()     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.u46 r3 = r3.mo12732x()     // Catch:{ all -> 0x0cc2 }
            java.lang.String r14 = "AdMob ad impression logged from app. Potentially duplicative."
            r3.mo25379a(r14)     // Catch:{ all -> 0x0cc2 }
        L_0x0168:
            int r2 = r2 + 1
            r3 = r21
            goto L_0x0125
        L_0x016d:
            r21 = r3
            com.onedelhi.secure.b96 r2 = r1.f19407a     // Catch:{ all -> 0x0cc2 }
            m26059R(r2)     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.ya6 r3 = r4.f15047a     // Catch:{ all -> 0x0cc2 }
            java.lang.String r3 = r3.mo27287U1()     // Catch:{ all -> 0x0cc2 }
            java.lang.String r14 = r12.mo25442E()     // Catch:{ all -> 0x0cc2 }
            boolean r2 = r2.mo13571E(r3, r14)     // Catch:{ all -> 0x0cc2 }
            java.lang.String r3 = "_c"
            if (r2 != 0) goto L_0x01b7
            com.onedelhi.secure.uq6 r14 = r1.f19416a     // Catch:{ all -> 0x0cc2 }
            m26059R(r14)     // Catch:{ all -> 0x0cc2 }
            java.lang.String r14 = r12.mo25442E()     // Catch:{ all -> 0x0cc2 }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r14)     // Catch:{ all -> 0x0cc2 }
            r20 = r9
            int r9 = r14.hashCode()     // Catch:{ all -> 0x0cc2 }
            r22 = r8
            r8 = 95027(0x17333, float:1.33161E-40)
            if (r9 == r8) goto L_0x01a0
            goto L_0x01aa
        L_0x01a0:
            java.lang.String r8 = "_ui"
            boolean r8 = r14.equals(r8)
            if (r8 == 0) goto L_0x01aa
            r8 = 0
            goto L_0x01ab
        L_0x01aa:
            r8 = -1
        L_0x01ab:
            if (r8 == 0) goto L_0x01bb
            r25 = r6
            r24 = r7
            r23 = r11
            r2 = 0
            r11 = r5
            goto L_0x0381
        L_0x01b7:
            r22 = r8
            r20 = r9
        L_0x01bb:
            r23 = r11
            r8 = 0
            r9 = 0
            r14 = 0
        L_0x01c0:
            int r11 = r12.mo25445q()     // Catch:{ all -> 0x0cc2 }
            r24 = r7
            java.lang.String r7 = "_r"
            if (r8 >= r11) goto L_0x0227
            com.onedelhi.secure.j96 r11 = r12.mo25441D(r8)     // Catch:{ all -> 0x0cc2 }
            java.lang.String r11 = r11.mo18174H()     // Catch:{ all -> 0x0cc2 }
            boolean r11 = r3.equals(r11)     // Catch:{ all -> 0x0cc2 }
            if (r11 == 0) goto L_0x01f5
            com.onedelhi.secure.j96 r7 = r12.mo25441D(r8)     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.ip6 r7 = r7.mo18543k()     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.g96 r7 = (com.onedelhi.secure.g96) r7     // Catch:{ all -> 0x0cc2 }
            r11 = r5
            r25 = r6
            r5 = 1
            r7.mo16407y(r5)     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.jq6 r5 = r7.mo17922m()     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.j96 r5 = (com.onedelhi.secure.j96) r5     // Catch:{ all -> 0x0cc2 }
            r12.mo25438A(r8, r5)     // Catch:{ all -> 0x0cc2 }
            r9 = 1
            goto L_0x021f
        L_0x01f5:
            r11 = r5
            r25 = r6
            com.onedelhi.secure.j96 r5 = r12.mo25441D(r8)     // Catch:{ all -> 0x0cc2 }
            java.lang.String r5 = r5.mo18174H()     // Catch:{ all -> 0x0cc2 }
            boolean r5 = r7.equals(r5)     // Catch:{ all -> 0x0cc2 }
            if (r5 == 0) goto L_0x021f
            com.onedelhi.secure.j96 r5 = r12.mo25441D(r8)     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.ip6 r5 = r5.mo18543k()     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.g96 r5 = (com.onedelhi.secure.g96) r5     // Catch:{ all -> 0x0cc2 }
            r6 = 1
            r5.mo16407y(r6)     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.jq6 r5 = r5.mo17922m()     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.j96 r5 = (com.onedelhi.secure.j96) r5     // Catch:{ all -> 0x0cc2 }
            r12.mo25438A(r8, r5)     // Catch:{ all -> 0x0cc2 }
            r14 = 1
        L_0x021f:
            int r8 = r8 + 1
            r5 = r11
            r7 = r24
            r6 = r25
            goto L_0x01c0
        L_0x0227:
            r11 = r5
            r25 = r6
            if (r9 != 0) goto L_0x0258
            if (r2 == 0) goto L_0x0258
            com.onedelhi.secure.a56 r5 = r40.mo15136e()     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.u46 r5 = r5.mo12730v()     // Catch:{ all -> 0x0cc2 }
            java.lang.String r6 = "Marking event as conversion"
            com.onedelhi.secure.za6 r8 = r1.f19420a     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.l46 r8 = r8.mo27862D()     // Catch:{ all -> 0x0cc2 }
            java.lang.String r9 = r12.mo25442E()     // Catch:{ all -> 0x0cc2 }
            java.lang.String r8 = r8.mo19280d(r9)     // Catch:{ all -> 0x0cc2 }
            r5.mo25380b(r6, r8)     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.g96 r5 = com.onedelhi.secure.j96.m18221F()     // Catch:{ all -> 0x0cc2 }
            r5.mo16408z(r3)     // Catch:{ all -> 0x0cc2 }
            r8 = 1
            r5.mo16407y(r8)     // Catch:{ all -> 0x0cc2 }
            r12.mo25449u(r5)     // Catch:{ all -> 0x0cc2 }
        L_0x0258:
            if (r14 != 0) goto L_0x0284
            com.onedelhi.secure.a56 r5 = r40.mo15136e()     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.u46 r5 = r5.mo12730v()     // Catch:{ all -> 0x0cc2 }
            java.lang.String r6 = "Marking event as real-time"
            com.onedelhi.secure.za6 r8 = r1.f19420a     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.l46 r8 = r8.mo27862D()     // Catch:{ all -> 0x0cc2 }
            java.lang.String r9 = r12.mo25442E()     // Catch:{ all -> 0x0cc2 }
            java.lang.String r8 = r8.mo19280d(r9)     // Catch:{ all -> 0x0cc2 }
            r5.mo25380b(r6, r8)     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.g96 r5 = com.onedelhi.secure.j96.m18221F()     // Catch:{ all -> 0x0cc2 }
            r5.mo16408z(r7)     // Catch:{ all -> 0x0cc2 }
            r8 = 1
            r5.mo16407y(r8)     // Catch:{ all -> 0x0cc2 }
            r12.mo25449u(r5)     // Catch:{ all -> 0x0cc2 }
        L_0x0284:
            com.onedelhi.secure.vg5 r5 = r1.f19418a     // Catch:{ all -> 0x0cc2 }
            m26059R(r5)     // Catch:{ all -> 0x0cc2 }
            long r27 = r40.mo23357F()     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.ya6 r6 = r4.f15047a     // Catch:{ all -> 0x0cc2 }
            java.lang.String r29 = r6.mo27287U1()     // Catch:{ all -> 0x0cc2 }
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 1
            r26 = r5
            com.onedelhi.secure.uf5 r5 = r26.mo26067T(r27, r29, r30, r31, r32, r33, r34)     // Catch:{ all -> 0x0cc2 }
            long r5 = r5.f21334e     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.ce5 r8 = r40.mo23368U()     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.ya6 r9 = r4.f15047a     // Catch:{ all -> 0x0cc2 }
            java.lang.String r9 = r9.mo27287U1()     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.k36 r14 = com.onedelhi.secure.n36.f17073o     // Catch:{ all -> 0x0cc2 }
            int r8 = r8.mo14122o(r9, r14)     // Catch:{ all -> 0x0cc2 }
            long r8 = (long) r8     // Catch:{ all -> 0x0cc2 }
            int r14 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r14 <= 0) goto L_0x02be
            m26057H(r12, r7)     // Catch:{ all -> 0x0cc2 }
            goto L_0x02c0
        L_0x02be:
            r16 = 1
        L_0x02c0:
            java.lang.String r5 = r12.mo25442E()     // Catch:{ all -> 0x0cc2 }
            boolean r5 = com.onedelhi.secure.gr6.m16176Z(r5)     // Catch:{ all -> 0x0cc2 }
            if (r5 == 0) goto L_0x0381
            if (r2 == 0) goto L_0x0381
            com.onedelhi.secure.vg5 r5 = r1.f19418a     // Catch:{ all -> 0x0cc2 }
            m26059R(r5)     // Catch:{ all -> 0x0cc2 }
            long r27 = r40.mo23357F()     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.ya6 r6 = r4.f15047a     // Catch:{ all -> 0x0cc2 }
            java.lang.String r29 = r6.mo27287U1()     // Catch:{ all -> 0x0cc2 }
            r30 = 0
            r31 = 0
            r32 = 1
            r33 = 0
            r34 = 0
            r26 = r5
            com.onedelhi.secure.uf5 r5 = r26.mo26067T(r27, r29, r30, r31, r32, r33, r34)     // Catch:{ all -> 0x0cc2 }
            long r5 = r5.f21332c     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.ce5 r7 = r40.mo23368U()     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.ya6 r8 = r4.f15047a     // Catch:{ all -> 0x0cc2 }
            java.lang.String r8 = r8.mo27287U1()     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.k36 r9 = com.onedelhi.secure.n36.f17071n     // Catch:{ all -> 0x0cc2 }
            int r7 = r7.mo14122o(r8, r9)     // Catch:{ all -> 0x0cc2 }
            long r7 = (long) r7     // Catch:{ all -> 0x0cc2 }
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x0381
            com.onedelhi.secure.a56 r5 = r40.mo15136e()     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.u46 r5 = r5.mo12731w()     // Catch:{ all -> 0x0cc2 }
            java.lang.String r6 = "Too many conversions. Not logging as conversion. appId"
            com.onedelhi.secure.ya6 r7 = r4.f15047a     // Catch:{ all -> 0x0cc2 }
            java.lang.String r7 = r7.mo27287U1()     // Catch:{ all -> 0x0cc2 }
            java.lang.Object r7 = com.onedelhi.secure.a56.m10802z(r7)     // Catch:{ all -> 0x0cc2 }
            r5.mo25380b(r6, r7)     // Catch:{ all -> 0x0cc2 }
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = -1
        L_0x031d:
            int r9 = r12.mo25445q()     // Catch:{ all -> 0x0cc2 }
            if (r6 >= r9) goto L_0x0347
            com.onedelhi.secure.j96 r9 = r12.mo25441D(r6)     // Catch:{ all -> 0x0cc2 }
            java.lang.String r14 = r9.mo18174H()     // Catch:{ all -> 0x0cc2 }
            boolean r14 = r3.equals(r14)     // Catch:{ all -> 0x0cc2 }
            if (r14 == 0) goto L_0x0339
            com.onedelhi.secure.ip6 r5 = r9.mo18543k()     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.g96 r5 = (com.onedelhi.secure.g96) r5     // Catch:{ all -> 0x0cc2 }
            r8 = r6
            goto L_0x0344
        L_0x0339:
            java.lang.String r9 = r9.mo18174H()     // Catch:{ all -> 0x0cc2 }
            boolean r9 = r13.equals(r9)     // Catch:{ all -> 0x0cc2 }
            if (r9 == 0) goto L_0x0344
            r7 = 1
        L_0x0344:
            int r6 = r6 + 1
            goto L_0x031d
        L_0x0347:
            if (r7 == 0) goto L_0x0350
            if (r5 == 0) goto L_0x034f
            r12.mo25452x(r8)     // Catch:{ all -> 0x0cc2 }
            goto L_0x0381
        L_0x034f:
            r5 = 0
        L_0x0350:
            if (r5 == 0) goto L_0x036a
            com.onedelhi.secure.ip6 r5 = r5.mo17916f()     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.g96 r5 = (com.onedelhi.secure.g96) r5     // Catch:{ all -> 0x0cc2 }
            r5.mo16408z(r13)     // Catch:{ all -> 0x0cc2 }
            r6 = 10
            r5.mo16407y(r6)     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.jq6 r5 = r5.mo17922m()     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.j96 r5 = (com.onedelhi.secure.j96) r5     // Catch:{ all -> 0x0cc2 }
            r12.mo25438A(r8, r5)     // Catch:{ all -> 0x0cc2 }
            goto L_0x0381
        L_0x036a:
            com.onedelhi.secure.a56 r5 = r40.mo15136e()     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.u46 r5 = r5.mo12726r()     // Catch:{ all -> 0x0cc2 }
            java.lang.String r6 = "Did not find conversion parameter. appId"
            com.onedelhi.secure.ya6 r7 = r4.f15047a     // Catch:{ all -> 0x0cc2 }
            java.lang.String r7 = r7.mo27287U1()     // Catch:{ all -> 0x0cc2 }
            java.lang.Object r7 = com.onedelhi.secure.a56.m10802z(r7)     // Catch:{ all -> 0x0cc2 }
            r5.mo25380b(r6, r7)     // Catch:{ all -> 0x0cc2 }
        L_0x0381:
            if (r2 == 0) goto L_0x043a
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0cc2 }
            java.util.List r5 = r12.mo25443F()     // Catch:{ all -> 0x0cc2 }
            r2.<init>(r5)     // Catch:{ all -> 0x0cc2 }
            r5 = 0
            r6 = -1
            r7 = -1
        L_0x038f:
            int r8 = r2.size()     // Catch:{ all -> 0x0cc2 }
            java.lang.String r9 = "currency"
            java.lang.String r13 = "value"
            if (r5 >= r8) goto L_0x03bf
            java.lang.Object r8 = r2.get(r5)     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.j96 r8 = (com.onedelhi.secure.j96) r8     // Catch:{ all -> 0x0cc2 }
            java.lang.String r8 = r8.mo18174H()     // Catch:{ all -> 0x0cc2 }
            boolean r8 = r13.equals(r8)     // Catch:{ all -> 0x0cc2 }
            if (r8 == 0) goto L_0x03ab
            r6 = r5
            goto L_0x03bc
        L_0x03ab:
            java.lang.Object r8 = r2.get(r5)     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.j96 r8 = (com.onedelhi.secure.j96) r8     // Catch:{ all -> 0x0cc2 }
            java.lang.String r8 = r8.mo18174H()     // Catch:{ all -> 0x0cc2 }
            boolean r8 = r9.equals(r8)     // Catch:{ all -> 0x0cc2 }
            if (r8 == 0) goto L_0x03bc
            r7 = r5
        L_0x03bc:
            int r5 = r5 + 1
            goto L_0x038f
        L_0x03bf:
            r5 = -1
            if (r6 != r5) goto L_0x03c4
            goto L_0x043b
        L_0x03c4:
            java.lang.Object r5 = r2.get(r6)     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.j96 r5 = (com.onedelhi.secure.j96) r5     // Catch:{ all -> 0x0cc2 }
            boolean r5 = r5.mo18179W()     // Catch:{ all -> 0x0cc2 }
            if (r5 != 0) goto L_0x03f5
            java.lang.Object r5 = r2.get(r6)     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.j96 r5 = (com.onedelhi.secure.j96) r5     // Catch:{ all -> 0x0cc2 }
            boolean r5 = r5.mo18177U()     // Catch:{ all -> 0x0cc2 }
            if (r5 != 0) goto L_0x03f5
            com.onedelhi.secure.a56 r2 = r40.mo15136e()     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.u46 r2 = r2.mo12732x()     // Catch:{ all -> 0x0cc2 }
            java.lang.String r5 = "Value must be specified with a numeric type."
            r2.mo25379a(r5)     // Catch:{ all -> 0x0cc2 }
            r12.mo25452x(r6)     // Catch:{ all -> 0x0cc2 }
            m26057H(r12, r3)     // Catch:{ all -> 0x0cc2 }
            r2 = 18
            m26056G(r12, r2, r13)     // Catch:{ all -> 0x0cc2 }
            goto L_0x043a
        L_0x03f5:
            r5 = -1
            if (r7 != r5) goto L_0x03f9
            goto L_0x0421
        L_0x03f9:
            java.lang.Object r2 = r2.get(r7)     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.j96 r2 = (com.onedelhi.secure.j96) r2     // Catch:{ all -> 0x0cc2 }
            java.lang.String r2 = r2.mo18175I()     // Catch:{ all -> 0x0cc2 }
            int r7 = r2.length()     // Catch:{ all -> 0x0cc2 }
            r8 = 3
            if (r7 != r8) goto L_0x0421
            r7 = 0
        L_0x040b:
            int r8 = r2.length()     // Catch:{ all -> 0x0cc2 }
            if (r7 >= r8) goto L_0x043b
            int r8 = r2.codePointAt(r7)     // Catch:{ all -> 0x0cc2 }
            boolean r13 = java.lang.Character.isLetter(r8)     // Catch:{ all -> 0x0cc2 }
            if (r13 == 0) goto L_0x0421
            int r8 = java.lang.Character.charCount(r8)     // Catch:{ all -> 0x0cc2 }
            int r7 = r7 + r8
            goto L_0x040b
        L_0x0421:
            com.onedelhi.secure.a56 r2 = r40.mo15136e()     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.u46 r2 = r2.mo12732x()     // Catch:{ all -> 0x0cc2 }
            java.lang.String r7 = "Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter."
            r2.mo25379a(r7)     // Catch:{ all -> 0x0cc2 }
            r12.mo25452x(r6)     // Catch:{ all -> 0x0cc2 }
            m26057H(r12, r3)     // Catch:{ all -> 0x0cc2 }
            r2 = 19
            m26056G(r12, r2, r9)     // Catch:{ all -> 0x0cc2 }
            goto L_0x043b
        L_0x043a:
            r5 = -1
        L_0x043b:
            java.lang.String r2 = r12.mo25442E()     // Catch:{ all -> 0x0cc2 }
            boolean r2 = r10.equals(r2)     // Catch:{ all -> 0x0cc2 }
            r6 = 1000(0x3e8, double:4.94E-321)
            if (r2 == 0) goto L_0x0489
            com.onedelhi.secure.uq6 r2 = r1.f19416a     // Catch:{ all -> 0x0cc2 }
            m26059R(r2)     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.jq6 r2 = r12.mo17922m()     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.x86 r2 = (com.onedelhi.secure.x86) r2     // Catch:{ all -> 0x0cc2 }
            r3 = r25
            com.onedelhi.secure.j96 r2 = com.onedelhi.secure.uq6.m29505n(r2, r3)     // Catch:{ all -> 0x0cc2 }
            if (r2 != 0) goto L_0x04d5
            if (r18 == 0) goto L_0x0482
            long r2 = r18.mo25447s()     // Catch:{ all -> 0x0cc2 }
            long r8 = r12.mo25447s()     // Catch:{ all -> 0x0cc2 }
            long r2 = r2 - r8
            long r2 = java.lang.Math.abs(r2)     // Catch:{ all -> 0x0cc2 }
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 > 0) goto L_0x0482
            com.onedelhi.secure.ip6 r2 = r18.mo17916f()     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.u86 r2 = (com.onedelhi.secure.u86) r2     // Catch:{ all -> 0x0cc2 }
            boolean r3 = r1.mo23365P(r12, r2)     // Catch:{ all -> 0x0cc2 }
            if (r3 == 0) goto L_0x0482
            r11.mo25938I(r15, r2)     // Catch:{ all -> 0x0cc2 }
            r13 = r17
        L_0x047e:
            r14 = 0
            r23 = 0
            goto L_0x04da
        L_0x0482:
            r23 = r12
            r14 = r18
            r13 = r20
            goto L_0x04da
        L_0x0489:
            java.lang.String r2 = "_vs"
            java.lang.String r3 = r12.mo25442E()     // Catch:{ all -> 0x0cc2 }
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0cc2 }
            if (r2 == 0) goto L_0x04d5
            com.onedelhi.secure.uq6 r2 = r1.f19416a     // Catch:{ all -> 0x0cc2 }
            m26059R(r2)     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.jq6 r2 = r12.mo17922m()     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.x86 r2 = (com.onedelhi.secure.x86) r2     // Catch:{ all -> 0x0cc2 }
            r8 = r24
            com.onedelhi.secure.j96 r2 = com.onedelhi.secure.uq6.m29505n(r2, r8)     // Catch:{ all -> 0x0cc2 }
            if (r2 != 0) goto L_0x04d5
            if (r23 == 0) goto L_0x04ce
            long r2 = r23.mo25447s()     // Catch:{ all -> 0x0cc2 }
            long r8 = r12.mo25447s()     // Catch:{ all -> 0x0cc2 }
            long r2 = r2 - r8
            long r2 = java.lang.Math.abs(r2)     // Catch:{ all -> 0x0cc2 }
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 > 0) goto L_0x04ce
            com.onedelhi.secure.ip6 r2 = r23.mo17916f()     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.u86 r2 = (com.onedelhi.secure.u86) r2     // Catch:{ all -> 0x0cc2 }
            boolean r3 = r1.mo23365P(r2, r12)     // Catch:{ all -> 0x0cc2 }
            if (r3 == 0) goto L_0x04ce
            r7 = r17
            r11.mo25938I(r7, r2)     // Catch:{ all -> 0x0cc2 }
            r13 = r7
            goto L_0x047e
        L_0x04ce:
            r7 = r17
            r13 = r7
            r14 = r12
            r15 = r20
            goto L_0x04da
        L_0x04d5:
            r7 = r17
            r13 = r7
            r14 = r18
        L_0x04da:
            java.util.List r2 = r4.f15049b     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.jq6 r3 = r12.mo17922m()     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.x86 r3 = (com.onedelhi.secure.x86) r3     // Catch:{ all -> 0x0cc2 }
            r6 = r22
            r2.set(r6, r3)     // Catch:{ all -> 0x0cc2 }
            int r9 = r20 + 1
            r11.mo25986v0(r12)     // Catch:{ all -> 0x0cc2 }
            r10 = r16
        L_0x04ee:
            int r8 = r6 + 1
            r5 = r11
            r2 = r19
            r3 = r21
            r11 = r23
            goto L_0x0040
        L_0x04f9:
            r19 = r2
            r11 = r5
            r3 = r6
            r8 = r7
            r20 = r9
            r5 = 0
            r12 = r5
            r2 = 0
        L_0x0504:
            if (r2 >= r9) goto L_0x0554
            com.onedelhi.secure.x86 r7 = r11.mo25974p0(r2)     // Catch:{ all -> 0x0cc2 }
            java.lang.String r14 = r7.mo26819I()     // Catch:{ all -> 0x0cc2 }
            boolean r14 = r10.equals(r14)     // Catch:{ all -> 0x0cc2 }
            if (r14 == 0) goto L_0x0527
            com.onedelhi.secure.uq6 r14 = r1.f19416a     // Catch:{ all -> 0x0cc2 }
            m26059R(r14)     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.j96 r14 = com.onedelhi.secure.uq6.m29505n(r7, r3)     // Catch:{ all -> 0x0cc2 }
            if (r14 == 0) goto L_0x0527
            r11.mo25975q(r2)     // Catch:{ all -> 0x0cc2 }
            int r9 = r9 + -1
            int r2 = r2 + -1
            goto L_0x0551
        L_0x0527:
            com.onedelhi.secure.uq6 r14 = r1.f19416a     // Catch:{ all -> 0x0cc2 }
            m26059R(r14)     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.j96 r7 = com.onedelhi.secure.uq6.m29505n(r7, r8)     // Catch:{ all -> 0x0cc2 }
            if (r7 == 0) goto L_0x0551
            boolean r14 = r7.mo18179W()     // Catch:{ all -> 0x0cc2 }
            if (r14 == 0) goto L_0x0541
            long r14 = r7.mo18173E()     // Catch:{ all -> 0x0cc2 }
            java.lang.Long r7 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0cc2 }
            goto L_0x0542
        L_0x0541:
            r7 = 0
        L_0x0542:
            if (r7 == 0) goto L_0x0551
            long r14 = r7.longValue()     // Catch:{ all -> 0x0cc2 }
            int r17 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r17 <= 0) goto L_0x0551
            long r14 = r7.longValue()     // Catch:{ all -> 0x0cc2 }
            long r12 = r12 + r14
        L_0x0551:
            r7 = 1
            int r2 = r2 + r7
            goto L_0x0504
        L_0x0554:
            r2 = 0
            r1.mo23361L(r11, r12, r2)     // Catch:{ all -> 0x0cc2 }
            java.util.List r2 = r11.mo25969k0()     // Catch:{ all -> 0x0cc2 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0cc2 }
        L_0x0560:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0cc2 }
            java.lang.String r7 = "_se"
            if (r3 == 0) goto L_0x0586
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.x86 r3 = (com.onedelhi.secure.x86) r3     // Catch:{ all -> 0x0cc2 }
            java.lang.String r8 = "_s"
            java.lang.String r3 = r3.mo26819I()     // Catch:{ all -> 0x0cc2 }
            boolean r3 = r8.equals(r3)     // Catch:{ all -> 0x0cc2 }
            if (r3 == 0) goto L_0x0560
            com.onedelhi.secure.vg5 r2 = r1.f19418a     // Catch:{ all -> 0x0cc2 }
            m26059R(r2)     // Catch:{ all -> 0x0cc2 }
            java.lang.String r3 = r11.mo25966h0()     // Catch:{ all -> 0x0cc2 }
            r2.mo26081m(r3, r7)     // Catch:{ all -> 0x0cc2 }
        L_0x0586:
            java.lang.String r2 = "_sid"
            int r2 = com.onedelhi.secure.uq6.m29512w(r11, r2)     // Catch:{ all -> 0x0cc2 }
            if (r2 < 0) goto L_0x0593
            r2 = 1
            r1.mo23361L(r11, r12, r2)     // Catch:{ all -> 0x0cc2 }
            goto L_0x05b3
        L_0x0593:
            int r2 = com.onedelhi.secure.uq6.m29512w(r11, r7)     // Catch:{ all -> 0x0cc2 }
            if (r2 < 0) goto L_0x05b3
            r11.mo25977r(r2)     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.a56 r2 = r40.mo15136e()     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.u46 r2 = r2.mo12726r()     // Catch:{ all -> 0x0cc2 }
            java.lang.String r3 = "Session engagement user property is in the bundle without session ID. appId"
            com.onedelhi.secure.ya6 r7 = r4.f15047a     // Catch:{ all -> 0x0cc2 }
            java.lang.String r7 = r7.mo27287U1()     // Catch:{ all -> 0x0cc2 }
            java.lang.Object r7 = com.onedelhi.secure.a56.m10802z(r7)     // Catch:{ all -> 0x0cc2 }
            r2.mo25380b(r3, r7)     // Catch:{ all -> 0x0cc2 }
        L_0x05b3:
            com.onedelhi.secure.uq6 r2 = r1.f19416a     // Catch:{ all -> 0x0cc2 }
            m26059R(r2)     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.za6 r3 = r2.f11205a     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.a56 r3 = r3.mo15136e()     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.u46 r3 = r3.mo12730v()     // Catch:{ all -> 0x0cc2 }
            java.lang.String r7 = "Checking account type status for ad personalization signals"
            r3.mo25379a(r7)     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.qq6 r3 = r2.f21907a     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.b96 r3 = r3.f19407a     // Catch:{ all -> 0x0cc2 }
            m26059R(r3)     // Catch:{ all -> 0x0cc2 }
            java.lang.String r7 = r11.mo25966h0()     // Catch:{ all -> 0x0cc2 }
            boolean r3 = r3.mo13568B(r7)     // Catch:{ all -> 0x0cc2 }
            if (r3 == 0) goto L_0x064a
            com.onedelhi.secure.qq6 r3 = r2.f21907a     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.vg5 r3 = r3.f19418a     // Catch:{ all -> 0x0cc2 }
            m26059R(r3)     // Catch:{ all -> 0x0cc2 }
            java.lang.String r7 = r11.mo25966h0()     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.yd6 r3 = r3.mo26065R(r7)     // Catch:{ all -> 0x0cc2 }
            if (r3 == 0) goto L_0x064a
            boolean r3 = r3.mo27367L()     // Catch:{ all -> 0x0cc2 }
            if (r3 == 0) goto L_0x064a
            com.onedelhi.secure.za6 r3 = r2.f11205a     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.bi5 r3 = r3.mo27859A()     // Catch:{ all -> 0x0cc2 }
            boolean r3 = r3.mo13733s()     // Catch:{ all -> 0x0cc2 }
            if (r3 == 0) goto L_0x064a
            com.onedelhi.secure.za6 r3 = r2.f11205a     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.a56 r3 = r3.mo15136e()     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.u46 r3 = r3.mo12725q()     // Catch:{ all -> 0x0cc2 }
            java.lang.String r7 = "Turning off ad personalization due to account type"
            r3.mo25379a(r7)     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.wb6 r3 = com.onedelhi.secure.zb6.m33030E()     // Catch:{ all -> 0x0cc2 }
            r7 = r19
            r3.mo26489v(r7)     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.za6 r2 = r2.f11205a     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.bi5 r2 = r2.mo27859A()     // Catch:{ all -> 0x0cc2 }
            long r8 = r2.mo13729o()     // Catch:{ all -> 0x0cc2 }
            r3.mo26490w(r8)     // Catch:{ all -> 0x0cc2 }
            r8 = 1
            r3.mo26488u(r8)     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.jq6 r2 = r3.mo17922m()     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.zb6 r2 = (com.onedelhi.secure.zb6) r2     // Catch:{ all -> 0x0cc2 }
            r3 = 0
        L_0x062c:
            int r8 = r11.mo25971m0()     // Catch:{ all -> 0x0cc2 }
            if (r3 >= r8) goto L_0x0647
            com.onedelhi.secure.zb6 r8 = r11.mo25965g0(r3)     // Catch:{ all -> 0x0cc2 }
            java.lang.String r8 = r8.mo27910G()     // Catch:{ all -> 0x0cc2 }
            boolean r8 = r7.equals(r8)     // Catch:{ all -> 0x0cc2 }
            if (r8 == 0) goto L_0x0644
            r11.mo25963e0(r3, r2)     // Catch:{ all -> 0x0cc2 }
            goto L_0x064a
        L_0x0644:
            int r3 = r3 + 1
            goto L_0x062c
        L_0x0647:
            r11.mo25990x0(r2)     // Catch:{ all -> 0x0cc2 }
        L_0x064a:
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r11.mo25958Z(r2)     // Catch:{ all -> 0x0cc2 }
            r2 = -9223372036854775808
            r11.mo25934G(r2)     // Catch:{ all -> 0x0cc2 }
            r2 = 0
        L_0x0658:
            int r3 = r11.mo25949Q()     // Catch:{ all -> 0x0cc2 }
            if (r2 >= r3) goto L_0x068b
            com.onedelhi.secure.x86 r3 = r11.mo25974p0(r2)     // Catch:{ all -> 0x0cc2 }
            long r7 = r3.mo26817E()     // Catch:{ all -> 0x0cc2 }
            long r9 = r11.mo25973o0()     // Catch:{ all -> 0x0cc2 }
            int r12 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r12 >= 0) goto L_0x0675
            long r7 = r3.mo26817E()     // Catch:{ all -> 0x0cc2 }
            r11.mo25958Z(r7)     // Catch:{ all -> 0x0cc2 }
        L_0x0675:
            long r7 = r3.mo26817E()     // Catch:{ all -> 0x0cc2 }
            long r9 = r11.mo25972n0()     // Catch:{ all -> 0x0cc2 }
            int r12 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r12 <= 0) goto L_0x0688
            long r7 = r3.mo26817E()     // Catch:{ all -> 0x0cc2 }
            r11.mo25934G(r7)     // Catch:{ all -> 0x0cc2 }
        L_0x0688:
            int r2 = r2 + 1
            goto L_0x0658
        L_0x068b:
            r11.mo25943K0()     // Catch:{ all -> 0x0cc2 }
            r11.mo25994z0()     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.db5 r2 = r1.f19410a     // Catch:{ all -> 0x0cc2 }
            m26059R(r2)     // Catch:{ all -> 0x0cc2 }
            java.lang.String r20 = r11.mo25966h0()     // Catch:{ all -> 0x0cc2 }
            java.util.List r21 = r11.mo25969k0()     // Catch:{ all -> 0x0cc2 }
            java.util.List r22 = r11.mo25970l0()     // Catch:{ all -> 0x0cc2 }
            long r7 = r11.mo25973o0()     // Catch:{ all -> 0x0cc2 }
            java.lang.Long r23 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0cc2 }
            long r7 = r11.mo25972n0()     // Catch:{ all -> 0x0cc2 }
            java.lang.Long r24 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0cc2 }
            r19 = r2
            java.util.List r2 = r19.mo14591m(r20, r21, r22, r23, r24)     // Catch:{ all -> 0x0cc2 }
            r11.mo25976q0(r2)     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.ce5 r2 = r40.mo23368U()     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.ya6 r3 = r4.f15047a     // Catch:{ all -> 0x0cc2 }
            java.lang.String r3 = r3.mo27287U1()     // Catch:{ all -> 0x0cc2 }
            boolean r2 = r2.mo14114F(r3)     // Catch:{ all -> 0x0cc2 }
            if (r2 == 0) goto L_0x09ff
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ all -> 0x0cc2 }
            r2.<init>()     // Catch:{ all -> 0x0cc2 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0cc2 }
            r3.<init>()     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.gr6 r7 = r40.mo23382h0()     // Catch:{ all -> 0x0cc2 }
            java.security.SecureRandom r7 = r7.mo16892u()     // Catch:{ all -> 0x0cc2 }
            r8 = 0
        L_0x06de:
            int r9 = r11.mo25949Q()     // Catch:{ all -> 0x0cc2 }
            if (r8 >= r9) goto L_0x09c9
            com.onedelhi.secure.x86 r9 = r11.mo25974p0(r8)     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.ip6 r9 = r9.mo18543k()     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.u86 r9 = (com.onedelhi.secure.u86) r9     // Catch:{ all -> 0x0cc2 }
            java.lang.String r10 = r9.mo25442E()     // Catch:{ all -> 0x0cc2 }
            java.lang.String r12 = "_ep"
            boolean r10 = r10.equals(r12)     // Catch:{ all -> 0x0cc2 }
            java.lang.String r12 = "_efs"
            java.lang.String r13 = "_sr"
            if (r10 == 0) goto L_0x0780
            com.onedelhi.secure.uq6 r10 = r1.f19416a     // Catch:{ all -> 0x0cc2 }
            m26059R(r10)     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.jq6 r10 = r9.mo17922m()     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.x86 r10 = (com.onedelhi.secure.x86) r10     // Catch:{ all -> 0x0cc2 }
            java.lang.String r14 = "_en"
            java.lang.Object r10 = com.onedelhi.secure.uq6.m29506o(r10, r14)     // Catch:{ all -> 0x0cc2 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x0cc2 }
            java.lang.Object r14 = r2.get(r10)     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.ri5 r14 = (com.onedelhi.secure.ri5) r14     // Catch:{ all -> 0x0cc2 }
            if (r14 != 0) goto L_0x0735
            com.onedelhi.secure.vg5 r14 = r1.f19418a     // Catch:{ all -> 0x0cc2 }
            m26059R(r14)     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.ya6 r15 = r4.f15047a     // Catch:{ all -> 0x0cc2 }
            java.lang.String r15 = r15.mo27287U1()     // Catch:{ all -> 0x0cc2 }
            java.lang.Object r17 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r10)     // Catch:{ all -> 0x0cc2 }
            r5 = r17
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.ri5 r14 = r14.mo26069V(r15, r5)     // Catch:{ all -> 0x0cc2 }
            if (r14 == 0) goto L_0x0735
            r2.put(r10, r14)     // Catch:{ all -> 0x0cc2 }
        L_0x0735:
            if (r14 == 0) goto L_0x0774
            java.lang.Long r5 = r14.f19879b     // Catch:{ all -> 0x0cc2 }
            if (r5 != 0) goto L_0x0774
            java.lang.Long r5 = r14.f19882c     // Catch:{ all -> 0x0cc2 }
            if (r5 == 0) goto L_0x0753
            long r5 = r5.longValue()     // Catch:{ all -> 0x0cc2 }
            r17 = 1
            int r10 = (r5 > r17 ? 1 : (r5 == r17 ? 0 : -1))
            if (r10 <= 0) goto L_0x0753
            com.onedelhi.secure.uq6 r5 = r1.f19416a     // Catch:{ all -> 0x0cc2 }
            m26059R(r5)     // Catch:{ all -> 0x0cc2 }
            java.lang.Long r5 = r14.f19882c     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.uq6.m29503P(r9, r13, r5)     // Catch:{ all -> 0x0cc2 }
        L_0x0753:
            java.lang.Boolean r5 = r14.f19875a     // Catch:{ all -> 0x0cc2 }
            if (r5 == 0) goto L_0x076b
            boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x0cc2 }
            if (r5 == 0) goto L_0x076b
            com.onedelhi.secure.uq6 r5 = r1.f19416a     // Catch:{ all -> 0x0cc2 }
            m26059R(r5)     // Catch:{ all -> 0x0cc2 }
            r5 = 1
            java.lang.Long r10 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.uq6.m29503P(r9, r12, r10)     // Catch:{ all -> 0x0cc2 }
        L_0x076b:
            com.onedelhi.secure.jq6 r5 = r9.mo17922m()     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.x86 r5 = (com.onedelhi.secure.x86) r5     // Catch:{ all -> 0x0cc2 }
            r3.add(r5)     // Catch:{ all -> 0x0cc2 }
        L_0x0774:
            r11.mo25938I(r8, r9)     // Catch:{ all -> 0x0cc2 }
            r10 = r3
            r21 = r7
            r5 = r11
            r7 = r2
            r2 = 1
            goto L_0x09be
        L_0x0780:
            com.onedelhi.secure.b96 r5 = r1.f19407a     // Catch:{ all -> 0x0cc2 }
            m26059R(r5)     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.ya6 r6 = r4.f15047a     // Catch:{ all -> 0x0cc2 }
            java.lang.String r6 = r6.mo27287U1()     // Catch:{ all -> 0x0cc2 }
            java.lang.String r10 = "measurement.account.time_zone_offset_minutes"
            java.lang.String r10 = r5.mo13581b(r6, r10)     // Catch:{ all -> 0x0cc2 }
            boolean r14 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x0cc2 }
            if (r14 != 0) goto L_0x07b1
            long r5 = java.lang.Long.parseLong(r10)     // Catch:{ NumberFormatException -> 0x079c }
            goto L_0x07b3
        L_0x079c:
            r0 = move-exception
            r10 = r0
            com.onedelhi.secure.za6 r5 = r5.f11205a     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.a56 r5 = r5.mo15136e()     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.u46 r5 = r5.mo12731w()     // Catch:{ all -> 0x0cc2 }
            java.lang.String r14 = "Unable to parse timezone offset. appId"
            java.lang.Object r6 = com.onedelhi.secure.a56.m10802z(r6)     // Catch:{ all -> 0x0cc2 }
            r5.mo25381c(r14, r6, r10)     // Catch:{ all -> 0x0cc2 }
        L_0x07b1:
            r5 = 0
        L_0x07b3:
            com.onedelhi.secure.gr6 r10 = r40.mo23382h0()     // Catch:{ all -> 0x0cc2 }
            long r14 = r9.mo25447s()     // Catch:{ all -> 0x0cc2 }
            long r14 = r10.mo16893u0(r14, r5)     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.jq6 r10 = r9.mo17922m()     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.x86 r10 = (com.onedelhi.secure.x86) r10     // Catch:{ all -> 0x0cc2 }
            r43 = r12
            r17 = 1
            java.lang.Long r12 = java.lang.Long.valueOf(r17)     // Catch:{ all -> 0x0cc2 }
            r17 = r5
            java.lang.String r5 = "_dbg"
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0cc2 }
            if (r6 != 0) goto L_0x080b
            java.util.List r6 = r10.mo26820J()     // Catch:{ all -> 0x0cc2 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0cc2 }
        L_0x07df:
            boolean r10 = r6.hasNext()     // Catch:{ all -> 0x0cc2 }
            if (r10 == 0) goto L_0x080b
            java.lang.Object r10 = r6.next()     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.j96 r10 = (com.onedelhi.secure.j96) r10     // Catch:{ all -> 0x0cc2 }
            r21 = r6
            java.lang.String r6 = r10.mo18174H()     // Catch:{ all -> 0x0cc2 }
            boolean r6 = r5.equals(r6)     // Catch:{ all -> 0x0cc2 }
            if (r6 == 0) goto L_0x0808
            long r5 = r10.mo18173E()     // Catch:{ all -> 0x0cc2 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0cc2 }
            boolean r5 = r12.equals(r5)     // Catch:{ all -> 0x0cc2 }
            if (r5 != 0) goto L_0x0806
            goto L_0x080b
        L_0x0806:
            r5 = 1
            goto L_0x081e
        L_0x0808:
            r6 = r21
            goto L_0x07df
        L_0x080b:
            com.onedelhi.secure.b96 r5 = r1.f19407a     // Catch:{ all -> 0x0cc2 }
            m26059R(r5)     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.ya6 r6 = r4.f15047a     // Catch:{ all -> 0x0cc2 }
            java.lang.String r6 = r6.mo27287U1()     // Catch:{ all -> 0x0cc2 }
            java.lang.String r10 = r9.mo25442E()     // Catch:{ all -> 0x0cc2 }
            int r5 = r5.mo13587r(r6, r10)     // Catch:{ all -> 0x0cc2 }
        L_0x081e:
            if (r5 > 0) goto L_0x0840
            com.onedelhi.secure.a56 r6 = r40.mo15136e()     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.u46 r6 = r6.mo12731w()     // Catch:{ all -> 0x0cc2 }
            java.lang.String r10 = "Sample rate must be positive. event, rate"
            java.lang.String r12 = r9.mo25442E()     // Catch:{ all -> 0x0cc2 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0cc2 }
            r6.mo25381c(r10, r12, r5)     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.jq6 r5 = r9.mo17922m()     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.x86 r5 = (com.onedelhi.secure.x86) r5     // Catch:{ all -> 0x0cc2 }
            r3.add(r5)     // Catch:{ all -> 0x0cc2 }
            goto L_0x0774
        L_0x0840:
            java.lang.String r6 = r9.mo25442E()     // Catch:{ all -> 0x0cc2 }
            java.lang.Object r6 = r2.get(r6)     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.ri5 r6 = (com.onedelhi.secure.ri5) r6     // Catch:{ all -> 0x0cc2 }
            if (r6 != 0) goto L_0x08a0
            com.onedelhi.secure.vg5 r6 = r1.f19418a     // Catch:{ all -> 0x0cc2 }
            m26059R(r6)     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.ya6 r10 = r4.f15047a     // Catch:{ all -> 0x0cc2 }
            java.lang.String r10 = r10.mo27287U1()     // Catch:{ all -> 0x0cc2 }
            java.lang.String r12 = r9.mo25442E()     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.ri5 r6 = r6.mo26069V(r10, r12)     // Catch:{ all -> 0x0cc2 }
            if (r6 != 0) goto L_0x08a0
            com.onedelhi.secure.a56 r6 = r40.mo15136e()     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.u46 r6 = r6.mo12731w()     // Catch:{ all -> 0x0cc2 }
            java.lang.String r10 = "Event being bundled has no eventAggregate. appId, eventName"
            com.onedelhi.secure.ya6 r12 = r4.f15047a     // Catch:{ all -> 0x0cc2 }
            java.lang.String r12 = r12.mo27287U1()     // Catch:{ all -> 0x0cc2 }
            r21 = r14
            java.lang.String r14 = r9.mo25442E()     // Catch:{ all -> 0x0cc2 }
            r6.mo25381c(r10, r12, r14)     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.ri5 r6 = new com.onedelhi.secure.ri5     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.ya6 r10 = r4.f15047a     // Catch:{ all -> 0x0cc2 }
            java.lang.String r24 = r10.mo27287U1()     // Catch:{ all -> 0x0cc2 }
            java.lang.String r25 = r9.mo25442E()     // Catch:{ all -> 0x0cc2 }
            r26 = 1
            r28 = 1
            r30 = 1
            long r32 = r9.mo25447s()     // Catch:{ all -> 0x0cc2 }
            r34 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r23 = r6
            r23.<init>(r24, r25, r26, r28, r30, r32, r34, r36, r37, r38, r39)     // Catch:{ all -> 0x0cc2 }
            goto L_0x08a2
        L_0x08a0:
            r21 = r14
        L_0x08a2:
            com.onedelhi.secure.uq6 r10 = r1.f19416a     // Catch:{ all -> 0x0cc2 }
            m26059R(r10)     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.jq6 r10 = r9.mo17922m()     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.x86 r10 = (com.onedelhi.secure.x86) r10     // Catch:{ all -> 0x0cc2 }
            java.lang.String r12 = "_eid"
            java.lang.Object r10 = com.onedelhi.secure.uq6.m29506o(r10, r12)     // Catch:{ all -> 0x0cc2 }
            java.lang.Long r10 = (java.lang.Long) r10     // Catch:{ all -> 0x0cc2 }
            if (r10 == 0) goto L_0x08b9
            r12 = 1
            goto L_0x08ba
        L_0x08b9:
            r12 = 0
        L_0x08ba:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)     // Catch:{ all -> 0x0cc2 }
            r14 = 1
            if (r5 != r14) goto L_0x08ea
            com.onedelhi.secure.jq6 r5 = r9.mo17922m()     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.x86 r5 = (com.onedelhi.secure.x86) r5     // Catch:{ all -> 0x0cc2 }
            r3.add(r5)     // Catch:{ all -> 0x0cc2 }
            boolean r5 = r12.booleanValue()     // Catch:{ all -> 0x0cc2 }
            if (r5 == 0) goto L_0x0774
            java.lang.Long r5 = r6.f19879b     // Catch:{ all -> 0x0cc2 }
            if (r5 != 0) goto L_0x08dc
            java.lang.Long r5 = r6.f19882c     // Catch:{ all -> 0x0cc2 }
            if (r5 != 0) goto L_0x08dc
            java.lang.Boolean r5 = r6.f19875a     // Catch:{ all -> 0x0cc2 }
            if (r5 == 0) goto L_0x0774
        L_0x08dc:
            r5 = 0
            com.onedelhi.secure.ri5 r6 = r6.mo23872a(r5, r5, r5)     // Catch:{ all -> 0x0cc2 }
            java.lang.String r5 = r9.mo25442E()     // Catch:{ all -> 0x0cc2 }
            r2.put(r5, r6)     // Catch:{ all -> 0x0cc2 }
            goto L_0x0774
        L_0x08ea:
            int r14 = r7.nextInt(r5)     // Catch:{ all -> 0x0cc2 }
            if (r14 != 0) goto L_0x092b
            com.onedelhi.secure.uq6 r10 = r1.f19416a     // Catch:{ all -> 0x0cc2 }
            m26059R(r10)     // Catch:{ all -> 0x0cc2 }
            long r14 = (long) r5     // Catch:{ all -> 0x0cc2 }
            java.lang.Long r5 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.uq6.m29503P(r9, r13, r5)     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.jq6 r10 = r9.mo17922m()     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.x86 r10 = (com.onedelhi.secure.x86) r10     // Catch:{ all -> 0x0cc2 }
            r3.add(r10)     // Catch:{ all -> 0x0cc2 }
            boolean r10 = r12.booleanValue()     // Catch:{ all -> 0x0cc2 }
            if (r10 == 0) goto L_0x0911
            r10 = 0
            com.onedelhi.secure.ri5 r6 = r6.mo23872a(r10, r5, r10)     // Catch:{ all -> 0x0cc2 }
        L_0x0911:
            java.lang.String r5 = r9.mo25442E()     // Catch:{ all -> 0x0cc2 }
            long r12 = r9.mo25447s()     // Catch:{ all -> 0x0cc2 }
            r14 = r21
            com.onedelhi.secure.ri5 r6 = r6.mo23873b(r12, r14)     // Catch:{ all -> 0x0cc2 }
            r2.put(r5, r6)     // Catch:{ all -> 0x0cc2 }
            r10 = r3
            r21 = r7
            r5 = r11
            r7 = r2
            r2 = 1
            goto L_0x09bb
        L_0x092b:
            r14 = r21
            r21 = r7
            java.lang.Long r7 = r6.f19876a     // Catch:{ all -> 0x0cc2 }
            if (r7 == 0) goto L_0x0940
            long r17 = r7.longValue()     // Catch:{ all -> 0x0cc2 }
            r24 = r2
            r25 = r3
            r23 = r10
            r22 = r11
            goto L_0x0956
        L_0x0940:
            com.onedelhi.secure.gr6 r7 = r40.mo23382h0()     // Catch:{ all -> 0x0cc2 }
            r23 = r10
            r22 = r11
            long r10 = r9.mo25446r()     // Catch:{ all -> 0x0cc2 }
            r24 = r2
            r25 = r3
            r2 = r17
            long r17 = r7.mo16893u0(r10, r2)     // Catch:{ all -> 0x0cc2 }
        L_0x0956:
            int r2 = (r17 > r14 ? 1 : (r17 == r14 ? 0 : -1))
            if (r2 == 0) goto L_0x09a1
            com.onedelhi.secure.uq6 r2 = r1.f19416a     // Catch:{ all -> 0x0cc2 }
            m26059R(r2)     // Catch:{ all -> 0x0cc2 }
            r2 = 1
            java.lang.Long r7 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0cc2 }
            r10 = r43
            com.onedelhi.secure.uq6.m29503P(r9, r10, r7)     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.uq6 r7 = r1.f19416a     // Catch:{ all -> 0x0cc2 }
            m26059R(r7)     // Catch:{ all -> 0x0cc2 }
            long r10 = (long) r5     // Catch:{ all -> 0x0cc2 }
            java.lang.Long r5 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.uq6.m29503P(r9, r13, r5)     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.jq6 r7 = r9.mo17922m()     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.x86 r7 = (com.onedelhi.secure.x86) r7     // Catch:{ all -> 0x0cc2 }
            r10 = r25
            r10.add(r7)     // Catch:{ all -> 0x0cc2 }
            boolean r7 = r12.booleanValue()     // Catch:{ all -> 0x0cc2 }
            if (r7 == 0) goto L_0x098f
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0cc2 }
            r11 = 0
            com.onedelhi.secure.ri5 r6 = r6.mo23872a(r11, r5, r7)     // Catch:{ all -> 0x0cc2 }
        L_0x098f:
            java.lang.String r5 = r9.mo25442E()     // Catch:{ all -> 0x0cc2 }
            long r11 = r9.mo25447s()     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.ri5 r6 = r6.mo23873b(r11, r14)     // Catch:{ all -> 0x0cc2 }
            r7 = r24
        L_0x099d:
            r7.put(r5, r6)     // Catch:{ all -> 0x0cc2 }
            goto L_0x09b9
        L_0x09a1:
            r7 = r24
            r10 = r25
            r2 = 1
            boolean r5 = r12.booleanValue()     // Catch:{ all -> 0x0cc2 }
            if (r5 == 0) goto L_0x09b9
            java.lang.String r5 = r9.mo25442E()     // Catch:{ all -> 0x0cc2 }
            r11 = r23
            r12 = 0
            com.onedelhi.secure.ri5 r6 = r6.mo23872a(r11, r12, r12)     // Catch:{ all -> 0x0cc2 }
            goto L_0x099d
        L_0x09b9:
            r5 = r22
        L_0x09bb:
            r5.mo25938I(r8, r9)     // Catch:{ all -> 0x0cc2 }
        L_0x09be:
            int r8 = r8 + 1
            r11 = r5
            r2 = r7
            r3 = r10
            r7 = r21
            r5 = 0
            goto L_0x06de
        L_0x09c9:
            r7 = r2
            r10 = r3
            r5 = r11
            int r2 = r10.size()     // Catch:{ all -> 0x0cc2 }
            int r3 = r5.mo25949Q()     // Catch:{ all -> 0x0cc2 }
            if (r2 >= r3) goto L_0x09dc
            r5.mo25927C0()     // Catch:{ all -> 0x0cc2 }
            r5.mo25978r0(r10)     // Catch:{ all -> 0x0cc2 }
        L_0x09dc:
            java.util.Set r2 = r7.entrySet()     // Catch:{ all -> 0x0cc2 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0cc2 }
        L_0x09e4:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0cc2 }
            if (r3 == 0) goto L_0x0a00
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0cc2 }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.vg5 r6 = r1.f19418a     // Catch:{ all -> 0x0cc2 }
            m26059R(r6)     // Catch:{ all -> 0x0cc2 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.ri5 r3 = (com.onedelhi.secure.ri5) r3     // Catch:{ all -> 0x0cc2 }
            r6.mo26085q(r3)     // Catch:{ all -> 0x0cc2 }
            goto L_0x09e4
        L_0x09ff:
            r5 = r11
        L_0x0a00:
            com.onedelhi.secure.ya6 r2 = r4.f15047a     // Catch:{ all -> 0x0cc2 }
            java.lang.String r2 = r2.mo27287U1()     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.vg5 r3 = r1.f19418a     // Catch:{ all -> 0x0cc2 }
            m26059R(r3)     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.yd6 r3 = r3.mo26065R(r2)     // Catch:{ all -> 0x0cc2 }
            if (r3 != 0) goto L_0x0a29
            com.onedelhi.secure.a56 r3 = r40.mo15136e()     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.u46 r3 = r3.mo12726r()     // Catch:{ all -> 0x0cc2 }
            java.lang.String r6 = "Bundling raw events w/o app info. appId"
            com.onedelhi.secure.ya6 r7 = r4.f15047a     // Catch:{ all -> 0x0cc2 }
            java.lang.String r7 = r7.mo27287U1()     // Catch:{ all -> 0x0cc2 }
            java.lang.Object r7 = com.onedelhi.secure.a56.m10802z(r7)     // Catch:{ all -> 0x0cc2 }
            r3.mo25380b(r6, r7)     // Catch:{ all -> 0x0cc2 }
            goto L_0x0a85
        L_0x0a29:
            int r6 = r5.mo25949Q()     // Catch:{ all -> 0x0cc2 }
            if (r6 <= 0) goto L_0x0a85
            long r6 = r3.mo27385b0()     // Catch:{ all -> 0x0cc2 }
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x0a3d
            r5.mo25951S(r6)     // Catch:{ all -> 0x0cc2 }
            goto L_0x0a40
        L_0x0a3d:
            r5.mo25935G0()     // Catch:{ all -> 0x0cc2 }
        L_0x0a40:
            long r8 = r3.mo27389d0()     // Catch:{ all -> 0x0cc2 }
            r10 = 0
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x0a4b
            goto L_0x0a4c
        L_0x0a4b:
            r6 = r8
        L_0x0a4c:
            int r8 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x0a54
            r5.mo25952T(r6)     // Catch:{ all -> 0x0cc2 }
            goto L_0x0a57
        L_0x0a54:
            r5.mo25937H0()     // Catch:{ all -> 0x0cc2 }
        L_0x0a57:
            r3.mo27392f()     // Catch:{ all -> 0x0cc2 }
            long r6 = r3.mo27387c0()     // Catch:{ all -> 0x0cc2 }
            int r7 = (int) r6     // Catch:{ all -> 0x0cc2 }
            r5.mo25991y(r7)     // Catch:{ all -> 0x0cc2 }
            long r6 = r5.mo25973o0()     // Catch:{ all -> 0x0cc2 }
            r3.mo27359D(r6)     // Catch:{ all -> 0x0cc2 }
            long r6 = r5.mo25972n0()     // Catch:{ all -> 0x0cc2 }
            r3.mo27357B(r6)     // Catch:{ all -> 0x0cc2 }
            java.lang.String r6 = r3.mo27397h0()     // Catch:{ all -> 0x0cc2 }
            if (r6 == 0) goto L_0x0a7a
            r5.mo25945M(r6)     // Catch:{ all -> 0x0cc2 }
            goto L_0x0a7d
        L_0x0a7a:
            r5.mo25929D0()     // Catch:{ all -> 0x0cc2 }
        L_0x0a7d:
            com.onedelhi.secure.vg5 r6 = r1.f19418a     // Catch:{ all -> 0x0cc2 }
            m26059R(r6)     // Catch:{ all -> 0x0cc2 }
            r6.mo26084p(r3)     // Catch:{ all -> 0x0cc2 }
        L_0x0a85:
            int r3 = r5.mo25949Q()     // Catch:{ all -> 0x0cc2 }
            if (r3 <= 0) goto L_0x0c07
            com.onedelhi.secure.za6 r3 = r1.f19420a     // Catch:{ all -> 0x0cc2 }
            r3.mo15134c()     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.b96 r3 = r1.f19407a     // Catch:{ all -> 0x0cc2 }
            m26059R(r3)     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.ya6 r6 = r4.f15047a     // Catch:{ all -> 0x0cc2 }
            java.lang.String r6 = r6.mo27287U1()     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.g76 r3 = r3.mo13588t(r6)     // Catch:{ all -> 0x0cc2 }
            r6 = -1
            if (r3 == 0) goto L_0x0ab2
            boolean r8 = r3.mo16383U()     // Catch:{ all -> 0x0cc2 }
            if (r8 != 0) goto L_0x0aaa
            goto L_0x0ab2
        L_0x0aaa:
            long r8 = r3.mo16371D()     // Catch:{ all -> 0x0cc2 }
            r5.mo25922A(r8)     // Catch:{ all -> 0x0cc2 }
            goto L_0x0ad9
        L_0x0ab2:
            com.onedelhi.secure.ya6 r3 = r4.f15047a     // Catch:{ all -> 0x0cc2 }
            java.lang.String r3 = r3.mo27266H()     // Catch:{ all -> 0x0cc2 }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x0cc2 }
            if (r3 == 0) goto L_0x0ac2
            r5.mo25922A(r6)     // Catch:{ all -> 0x0cc2 }
            goto L_0x0ad9
        L_0x0ac2:
            com.onedelhi.secure.a56 r3 = r40.mo15136e()     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.u46 r3 = r3.mo12731w()     // Catch:{ all -> 0x0cc2 }
            java.lang.String r8 = "Did not find measurement config or missing version info. appId"
            com.onedelhi.secure.ya6 r9 = r4.f15047a     // Catch:{ all -> 0x0cc2 }
            java.lang.String r9 = r9.mo27287U1()     // Catch:{ all -> 0x0cc2 }
            java.lang.Object r9 = com.onedelhi.secure.a56.m10802z(r9)     // Catch:{ all -> 0x0cc2 }
            r3.mo25380b(r8, r9)     // Catch:{ all -> 0x0cc2 }
        L_0x0ad9:
            com.onedelhi.secure.vg5 r3 = r1.f19418a     // Catch:{ all -> 0x0cc2 }
            m26059R(r3)     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.jq6 r5 = r5.mo17922m()     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.ya6 r5 = (com.onedelhi.secure.ya6) r5     // Catch:{ all -> 0x0cc2 }
            r3.mo15139h()     // Catch:{ all -> 0x0cc2 }
            r3.mo27038i()     // Catch:{ all -> 0x0cc2 }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)     // Catch:{ all -> 0x0cc2 }
            java.lang.String r8 = r5.mo27287U1()     // Catch:{ all -> 0x0cc2 }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r8)     // Catch:{ all -> 0x0cc2 }
            boolean r8 = r5.mo27299l1()     // Catch:{ all -> 0x0cc2 }
            com.google.android.gms.common.internal.Preconditions.checkState(r8)     // Catch:{ all -> 0x0cc2 }
            r3.mo26080h0()     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.za6 r8 = r3.f11205a     // Catch:{ all -> 0x0cc2 }
            com.google.android.gms.common.util.Clock r8 = r8.mo15133a()     // Catch:{ all -> 0x0cc2 }
            long r8 = r8.currentTimeMillis()     // Catch:{ all -> 0x0cc2 }
            long r10 = r5.mo27267H1()     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.za6 r12 = r3.f11205a     // Catch:{ all -> 0x0cc2 }
            r12.mo27891z()     // Catch:{ all -> 0x0cc2 }
            long r12 = com.onedelhi.secure.ce5.m12446i()     // Catch:{ all -> 0x0cc2 }
            long r12 = r8 - r12
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 < 0) goto L_0x0b2d
            long r10 = r5.mo27267H1()     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.za6 r12 = r3.f11205a     // Catch:{ all -> 0x0cc2 }
            r12.mo27891z()     // Catch:{ all -> 0x0cc2 }
            long r12 = com.onedelhi.secure.ce5.m12446i()     // Catch:{ all -> 0x0cc2 }
            long r12 = r12 + r8
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 <= 0) goto L_0x0b50
        L_0x0b2d:
            com.onedelhi.secure.za6 r10 = r3.f11205a     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.a56 r10 = r10.mo15136e()     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.u46 r10 = r10.mo12731w()     // Catch:{ all -> 0x0cc2 }
            java.lang.String r11 = "Storing bundle outside of the max uploading time span. appId, now, timestamp"
            java.lang.String r12 = r5.mo27287U1()     // Catch:{ all -> 0x0cc2 }
            java.lang.Object r12 = com.onedelhi.secure.a56.m10802z(r12)     // Catch:{ all -> 0x0cc2 }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0cc2 }
            long r13 = r5.mo27267H1()     // Catch:{ all -> 0x0cc2 }
            java.lang.Long r9 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x0cc2 }
            r10.mo25382d(r11, r12, r8, r9)     // Catch:{ all -> 0x0cc2 }
        L_0x0b50:
            byte[] r8 = r5.mo22497h()     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.qq6 r9 = r3.f21907a     // Catch:{ IOException -> 0x0bf0 }
            com.onedelhi.secure.uq6 r9 = r9.f19416a     // Catch:{ IOException -> 0x0bf0 }
            m26059R(r9)     // Catch:{ IOException -> 0x0bf0 }
            byte[] r8 = r9.mo25702O(r8)     // Catch:{ IOException -> 0x0bf0 }
            com.onedelhi.secure.za6 r9 = r3.f11205a     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.a56 r9 = r9.mo15136e()     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.u46 r9 = r9.mo12730v()     // Catch:{ all -> 0x0cc2 }
            java.lang.String r10 = "Saving bundle, size"
            int r11 = r8.length     // Catch:{ all -> 0x0cc2 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0cc2 }
            r9.mo25380b(r10, r11)     // Catch:{ all -> 0x0cc2 }
            android.content.ContentValues r9 = new android.content.ContentValues     // Catch:{ all -> 0x0cc2 }
            r9.<init>()     // Catch:{ all -> 0x0cc2 }
            java.lang.String r10 = "app_id"
            java.lang.String r11 = r5.mo27287U1()     // Catch:{ all -> 0x0cc2 }
            r9.put(r10, r11)     // Catch:{ all -> 0x0cc2 }
            java.lang.String r10 = "bundle_end_timestamp"
            long r11 = r5.mo27267H1()     // Catch:{ all -> 0x0cc2 }
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0cc2 }
            r9.put(r10, r11)     // Catch:{ all -> 0x0cc2 }
            java.lang.String r10 = "data"
            r9.put(r10, r8)     // Catch:{ all -> 0x0cc2 }
            java.lang.String r8 = "has_realtime"
            java.lang.Integer r10 = java.lang.Integer.valueOf(r16)     // Catch:{ all -> 0x0cc2 }
            r9.put(r8, r10)     // Catch:{ all -> 0x0cc2 }
            boolean r8 = r5.mo27305r1()     // Catch:{ all -> 0x0cc2 }
            if (r8 == 0) goto L_0x0baf
            java.lang.String r8 = "retry_count"
            int r10 = r5.mo27255B1()     // Catch:{ all -> 0x0cc2 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0cc2 }
            r9.put(r8, r10)     // Catch:{ all -> 0x0cc2 }
        L_0x0baf:
            android.database.sqlite.SQLiteDatabase r8 = r3.mo26063P()     // Catch:{ SQLiteException -> 0x0bd6 }
            java.lang.String r10 = "queue"
            r11 = 0
            long r8 = r8.insert(r10, r11, r9)     // Catch:{ SQLiteException -> 0x0bd6 }
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 != 0) goto L_0x0c07
            com.onedelhi.secure.za6 r6 = r3.f11205a     // Catch:{ SQLiteException -> 0x0bd6 }
            com.onedelhi.secure.a56 r6 = r6.mo15136e()     // Catch:{ SQLiteException -> 0x0bd6 }
            com.onedelhi.secure.u46 r6 = r6.mo12726r()     // Catch:{ SQLiteException -> 0x0bd6 }
            java.lang.String r7 = "Failed to insert bundle (got -1). appId"
            java.lang.String r8 = r5.mo27287U1()     // Catch:{ SQLiteException -> 0x0bd6 }
            java.lang.Object r8 = com.onedelhi.secure.a56.m10802z(r8)     // Catch:{ SQLiteException -> 0x0bd6 }
            r6.mo25380b(r7, r8)     // Catch:{ SQLiteException -> 0x0bd6 }
            goto L_0x0c07
        L_0x0bd6:
            r0 = move-exception
            r6 = r0
            com.onedelhi.secure.za6 r3 = r3.f11205a     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.a56 r3 = r3.mo15136e()     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.u46 r3 = r3.mo12726r()     // Catch:{ all -> 0x0cc2 }
            java.lang.String r7 = "Error storing bundle. appId"
            java.lang.String r5 = r5.mo27287U1()     // Catch:{ all -> 0x0cc2 }
            java.lang.Object r5 = com.onedelhi.secure.a56.m10802z(r5)     // Catch:{ all -> 0x0cc2 }
        L_0x0bec:
            r3.mo25381c(r7, r5, r6)     // Catch:{ all -> 0x0cc2 }
            goto L_0x0c07
        L_0x0bf0:
            r0 = move-exception
            r6 = r0
            com.onedelhi.secure.za6 r3 = r3.f11205a     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.a56 r3 = r3.mo15136e()     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.u46 r3 = r3.mo12726r()     // Catch:{ all -> 0x0cc2 }
            java.lang.String r7 = "Data loss. Failed to serialize bundle. appId"
            java.lang.String r5 = r5.mo27287U1()     // Catch:{ all -> 0x0cc2 }
            java.lang.Object r5 = com.onedelhi.secure.a56.m10802z(r5)     // Catch:{ all -> 0x0cc2 }
            goto L_0x0bec
        L_0x0c07:
            com.onedelhi.secure.vg5 r3 = r1.f19418a     // Catch:{ all -> 0x0cc2 }
            m26059R(r3)     // Catch:{ all -> 0x0cc2 }
            java.util.List r4 = r4.f15048a     // Catch:{ all -> 0x0cc2 }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)     // Catch:{ all -> 0x0cc2 }
            r3.mo15139h()     // Catch:{ all -> 0x0cc2 }
            r3.mo27038i()     // Catch:{ all -> 0x0cc2 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0cc2 }
            java.lang.String r6 = "rowid in ("
            r5.<init>(r6)     // Catch:{ all -> 0x0cc2 }
            r6 = 0
        L_0x0c1f:
            int r7 = r4.size()     // Catch:{ all -> 0x0cc2 }
            if (r6 >= r7) goto L_0x0c3c
            if (r6 == 0) goto L_0x0c2c
            java.lang.String r7 = ","
            r5.append(r7)     // Catch:{ all -> 0x0cc2 }
        L_0x0c2c:
            java.lang.Object r7 = r4.get(r6)     // Catch:{ all -> 0x0cc2 }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ all -> 0x0cc2 }
            long r7 = r7.longValue()     // Catch:{ all -> 0x0cc2 }
            r5.append(r7)     // Catch:{ all -> 0x0cc2 }
            int r6 = r6 + 1
            goto L_0x0c1f
        L_0x0c3c:
            java.lang.String r6 = ")"
            r5.append(r6)     // Catch:{ all -> 0x0cc2 }
            android.database.sqlite.SQLiteDatabase r6 = r3.mo26063P()     // Catch:{ all -> 0x0cc2 }
            java.lang.String r7 = "raw_events"
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0cc2 }
            r8 = 0
            int r5 = r6.delete(r7, r5, r8)     // Catch:{ all -> 0x0cc2 }
            int r6 = r4.size()     // Catch:{ all -> 0x0cc2 }
            if (r5 == r6) goto L_0x0c71
            com.onedelhi.secure.za6 r3 = r3.f11205a     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.a56 r3 = r3.mo15136e()     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.u46 r3 = r3.mo12726r()     // Catch:{ all -> 0x0cc2 }
            java.lang.String r6 = "Deleted fewer rows from raw events table than expected"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0cc2 }
            int r4 = r4.size()     // Catch:{ all -> 0x0cc2 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0cc2 }
            r3.mo25381c(r6, r5, r4)     // Catch:{ all -> 0x0cc2 }
        L_0x0c71:
            com.onedelhi.secure.vg5 r3 = r1.f19418a     // Catch:{ all -> 0x0cc2 }
            m26059R(r3)     // Catch:{ all -> 0x0cc2 }
            android.database.sqlite.SQLiteDatabase r4 = r3.mo26063P()     // Catch:{ all -> 0x0cc2 }
            java.lang.String r5 = "delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)"
            r6 = 2
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x0c89 }
            r7 = 0
            r6[r7] = r2     // Catch:{ SQLiteException -> 0x0c89 }
            r7 = 1
            r6[r7] = r2     // Catch:{ SQLiteException -> 0x0c89 }
            r4.execSQL(r5, r6)     // Catch:{ SQLiteException -> 0x0c89 }
            goto L_0x0c9e
        L_0x0c89:
            r0 = move-exception
            r4 = r0
            com.onedelhi.secure.za6 r3 = r3.f11205a     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.a56 r3 = r3.mo15136e()     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.u46 r3 = r3.mo12726r()     // Catch:{ all -> 0x0cc2 }
            java.lang.String r5 = "Failed to remove unused event metadata. appId"
            java.lang.Object r2 = com.onedelhi.secure.a56.m10802z(r2)     // Catch:{ all -> 0x0cc2 }
            r3.mo25381c(r5, r2, r4)     // Catch:{ all -> 0x0cc2 }
        L_0x0c9e:
            com.onedelhi.secure.vg5 r2 = r1.f19418a     // Catch:{ all -> 0x0cc2 }
            m26059R(r2)     // Catch:{ all -> 0x0cc2 }
            r2.mo26083o()     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.vg5 r2 = r1.f19418a
            m26059R(r2)
            r2.mo26078f0()
            r2 = 1
            return r2
        L_0x0cb0:
            com.onedelhi.secure.vg5 r2 = r1.f19418a     // Catch:{ all -> 0x0cc2 }
            m26059R(r2)     // Catch:{ all -> 0x0cc2 }
            r2.mo26083o()     // Catch:{ all -> 0x0cc2 }
            com.onedelhi.secure.vg5 r2 = r1.f19418a
            m26059R(r2)
            r2.mo26078f0()
            r2 = 0
            return r2
        L_0x0cc2:
            r0 = move-exception
            r2 = r0
            com.onedelhi.secure.vg5 r3 = r1.f19418a
            m26059R(r3)
            r3.mo26078f0()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.qq6.mo23363N(java.lang.String, long):boolean");
    }

    /* renamed from: O */
    public final boolean mo23364O() {
        mo15135d().mo15139h();
        mo23379g();
        vg5 vg5 = this.f19418a;
        m26059R(vg5);
        if (vg5.mo26086r()) {
            return true;
        }
        vg5 vg52 = this.f19418a;
        m26059R(vg52);
        return !TextUtils.isEmpty(vg52.mo26072Z());
    }

    /* renamed from: P */
    public final boolean mo23365P(u86 u86, u86 u862) {
        Preconditions.checkArgument("_e".equals(u86.mo25442E()));
        m26059R(this.f19416a);
        j96 n = uq6.m29505n((x86) u86.mo17922m(), "_sc");
        String str = null;
        String I = n == null ? null : n.mo18175I();
        m26059R(this.f19416a);
        j96 n2 = uq6.m29505n((x86) u862.mo17922m(), "_pc");
        if (n2 != null) {
            str = n2.mo18175I();
        }
        if (str == null || !str.equals(I)) {
            return false;
        }
        Preconditions.checkArgument("_e".equals(u86.mo25442E()));
        m26059R(this.f19416a);
        j96 n3 = uq6.m29505n((x86) u86.mo17922m(), "_et");
        if (n3 == null || !n3.mo18179W() || n3.mo18173E() <= 0) {
            return true;
        }
        long E = n3.mo18173E();
        m26059R(this.f19416a);
        j96 n4 = uq6.m29505n((x86) u862.mo17922m(), "_et");
        if (n4 != null && n4.mo18173E() > 0) {
            E += n4.mo18173E();
        }
        m26059R(this.f19416a);
        uq6.m29503P(u862, "_et", Long.valueOf(E));
        m26059R(this.f19416a);
        uq6.m29503P(u86, "_fr", 1L);
        return true;
    }

    @ly4
    /* renamed from: S */
    public final yd6 mo23366S(uy6 uy6) {
        mo15135d().mo15139h();
        mo23379g();
        Preconditions.checkNotNull(uy6);
        Preconditions.checkNotEmpty(uy6.f21557b);
        if (!uy6.f21577k.isEmpty()) {
            this.f19430b.put(uy6.f21557b, new oq6(this, uy6.f21577k));
        }
        vg5 vg5 = this.f19418a;
        m26059R(vg5);
        yd6 R = vg5.mo26065R(uy6.f21557b);
        ye5 c = mo23369V(uy6.f21557b).mo27431c(ye5.m32305b(uy6.f21576j));
        ne5 ne5 = ne5.AD_STORAGE;
        String o = c.mo27438i(ne5) ? this.f19414a.mo24484o(uy6.f21557b, uy6.f21564d) : "";
        if (R == null) {
            R = new yd6(this.f19420a, uy6.f21557b);
            if (c.mo27438i(ne5.ANALYTICS_STORAGE)) {
                R.mo27398i(mo23384i0(c));
            }
            if (c.mo27438i(ne5)) {
                R.mo27362G(o);
            }
        } else if (c.mo27438i(ne5) && o != null && !o.equals(R.mo27384b())) {
            R.mo27362G(o);
            if (uy6.f21564d && !"00000000-0000-0000-0000-000000000000".equals(this.f19414a.mo24483n(uy6.f21557b, c).first)) {
                R.mo27398i(mo23384i0(c));
                vg5 vg52 = this.f19418a;
                m26059R(vg52);
                if (vg52.mo26070X(uy6.f21557b, "_id") != null) {
                    vg5 vg53 = this.f19418a;
                    m26059R(vg53);
                    if (vg53.mo26070X(uy6.f21557b, "_lair") == null) {
                        ar6 ar6 = new ar6(uy6.f21557b, bf0.f26274c, "_lair", mo15133a().currentTimeMillis(), 1L);
                        vg5 vg54 = this.f19418a;
                        m26059R(vg54);
                        vg54.mo26092x(ar6);
                    }
                }
            }
        } else if (TextUtils.isEmpty(R.mo27401j0()) && c.mo27438i(ne5.ANALYTICS_STORAGE)) {
            R.mo27398i(mo23384i0(c));
        }
        R.mo27419x(uy6.f21560c);
        R.mo27394g(uy6.f21574h);
        if (!TextUtils.isEmpty(uy6.f21572g)) {
            R.mo27418w(uy6.f21572g);
        }
        long j = uy6.f21556b;
        if (j != 0) {
            R.mo27420y(j);
        }
        if (!TextUtils.isEmpty(uy6.f21563d)) {
            R.mo27402k(uy6.f21563d);
        }
        R.mo27404l(uy6.f21562d);
        String str = uy6.f21566e;
        if (str != null) {
            R.mo27400j(str);
        }
        R.mo27415t(uy6.f21559c);
        R.mo27360E(uy6.f21558b);
        if (!TextUtils.isEmpty(uy6.f21569f)) {
            R.mo27421z(uy6.f21569f);
        }
        R.mo27396h(uy6.f21564d);
        R.mo27361F(uy6.f21554a);
        R.mo27416u(uy6.f21571g);
        xz6.m31807c();
        if (mo23368U().mo14110B((String) null, n36.f17070m0) || mo23368U().mo14110B(uy6.f21557b, n36.f17074o0)) {
            R.mo27364I(uy6.f21578l);
        }
        lw6.m21031c();
        if (mo23368U().mo14110B((String) null, n36.f17068l0)) {
            R.mo27363H(uy6.f21555a);
        } else {
            lw6.m21031c();
            if (mo23368U().mo14110B((String) null, n36.f17066k0)) {
                R.mo27363H((List) null);
            }
        }
        y07.m31827c();
        if (mo23368U().mo14110B((String) null, n36.f17078q0)) {
            R.mo27365J(uy6.f21570f);
        }
        ky6.m20117c();
        if (mo23368U().mo14110B((String) null, n36.f17019E0)) {
            R.mo27366K(uy6.f21573h);
        }
        if (R.mo27369N()) {
            vg5 vg55 = this.f19418a;
            m26059R(vg55);
            vg55.mo26084p(R);
        }
        return R;
    }

    /* renamed from: T */
    public final db5 mo23367T() {
        db5 db5 = this.f19410a;
        m26059R(db5);
        return db5;
    }

    /* renamed from: U */
    public final ce5 mo23368U() {
        return ((za6) Preconditions.checkNotNull(this.f19420a)).mo27891z();
    }

    @ly4
    /* renamed from: V */
    public final ye5 mo23369V(String str) {
        String str2;
        ye5 ye5 = ye5.f23033a;
        mo15135d().mo15139h();
        mo23379g();
        ye5 ye52 = (ye5) this.f19425a.get(str);
        if (ye52 != null) {
            return ye52;
        }
        vg5 vg5 = this.f19418a;
        m26059R(vg5);
        Preconditions.checkNotNull(str);
        vg5.mo15139h();
        vg5.mo27038i();
        Cursor cursor = null;
        try {
            Cursor rawQuery = vg5.mo26063P().rawQuery("select consent_state from consent_settings where app_id=? limit 1;", new String[]{str});
            if (rawQuery.moveToFirst()) {
                str2 = rawQuery.getString(0);
                rawQuery.close();
            } else {
                rawQuery.close();
                str2 = "G1";
            }
            ye5 b = ye5.m32305b(str2);
            mo23352A(str, b);
            return b;
        } catch (SQLiteException e) {
            vg5.f11205a.mo15136e().mo12726r().mo25381c("Database error", "select consent_state from consent_settings where app_id=? limit 1;", e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: W */
    public final vg5 mo23370W() {
        vg5 vg5 = this.f19418a;
        m26059R(vg5);
        return vg5;
    }

    /* renamed from: X */
    public final l46 mo23371X() {
        return this.f19420a.mo27862D();
    }

    /* renamed from: Y */
    public final s56 mo23372Y() {
        s56 s56 = this.f19413a;
        m26059R(s56);
        return s56;
    }

    /* renamed from: Z */
    public final v66 mo23373Z() {
        v66 v66 = this.f19417a;
        if (v66 != null) {
            return v66;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    /* renamed from: a */
    public final Clock mo15133a() {
        return ((za6) Preconditions.checkNotNull(this.f19420a)).mo15133a();
    }

    /* renamed from: a0 */
    public final b96 mo23374a0() {
        b96 b96 = this.f19407a;
        m26059R(b96);
        return b96;
    }

    @VisibleForTesting
    @ly4
    /* renamed from: b */
    public final void mo23375b() {
        u46 r;
        Integer valueOf;
        Integer valueOf2;
        String str;
        mo15135d().mo15139h();
        mo23379g();
        if (!this.f19431b) {
            this.f19431b = true;
            if (mo23356E()) {
                FileChannel fileChannel = this.f19422a;
                mo15135d().mo15139h();
                int i = 0;
                if (fileChannel == null || !fileChannel.isOpen()) {
                    mo15136e().mo12726r().mo25379a("Bad channel to read from");
                } else {
                    ByteBuffer allocate = ByteBuffer.allocate(4);
                    try {
                        fileChannel.position(0);
                        int read = fileChannel.read(allocate);
                        if (read == 4) {
                            allocate.flip();
                            i = allocate.getInt();
                        } else if (read != -1) {
                            mo15136e().mo12731w().mo25380b("Unexpected data length. Bytes read", Integer.valueOf(read));
                        }
                    } catch (IOException e) {
                        mo15136e().mo12726r().mo25380b("Failed to read from channel", e);
                    }
                }
                int p = this.f19420a.mo27860B().mo27792p();
                mo15135d().mo15139h();
                if (i > p) {
                    r = mo15136e().mo12726r();
                    valueOf = Integer.valueOf(i);
                    valueOf2 = Integer.valueOf(p);
                    str = "Panic: can't downgrade version. Previous, current version";
                } else if (i < p) {
                    FileChannel fileChannel2 = this.f19422a;
                    mo15135d().mo15139h();
                    if (fileChannel2 == null || !fileChannel2.isOpen()) {
                        mo15136e().mo12726r().mo25379a("Bad channel to read from");
                    } else {
                        ByteBuffer allocate2 = ByteBuffer.allocate(4);
                        allocate2.putInt(p);
                        allocate2.flip();
                        try {
                            fileChannel2.truncate(0);
                            fileChannel2.write(allocate2);
                            fileChannel2.force(true);
                            if (fileChannel2.size() != 4) {
                                mo15136e().mo12726r().mo25380b("Error writing to channel. Bytes written", Long.valueOf(fileChannel2.size()));
                            }
                            r = mo15136e().mo12730v();
                            valueOf = Integer.valueOf(i);
                            valueOf2 = Integer.valueOf(p);
                            str = "Storage version upgraded. Previous, current version";
                        } catch (IOException e2) {
                            mo15136e().mo12726r().mo25380b("Failed to write to channel", e2);
                        }
                    }
                    r = mo15136e().mo12726r();
                    valueOf = Integer.valueOf(i);
                    valueOf2 = Integer.valueOf(p);
                    str = "Storage version upgrade failed. Previous, current version";
                } else {
                    return;
                }
                r.mo25381c(str, valueOf, valueOf2);
            }
        }
    }

    /* renamed from: c */
    public final rb5 mo15134c() {
        throw null;
    }

    /* renamed from: c0 */
    public final za6 mo23376c0() {
        return this.f19420a;
    }

    /* renamed from: d */
    public final qa6 mo15135d() {
        return ((za6) Preconditions.checkNotNull(this.f19420a)).mo15135d();
    }

    /* renamed from: d0 */
    public final bj6 mo23377d0() {
        bj6 bj6 = this.f19408a;
        m26059R(bj6);
        return bj6;
    }

    /* renamed from: e */
    public final a56 mo15136e() {
        return ((za6) Preconditions.checkNotNull(this.f19420a)).mo15136e();
    }

    /* renamed from: e0 */
    public final sm6 mo23378e0() {
        return this.f19414a;
    }

    /* renamed from: f */
    public final Context mo15137f() {
        return this.f19420a.mo15137f();
    }

    /* renamed from: g */
    public final void mo23379g() {
        if (!this.f19426a) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    /* renamed from: g0 */
    public final uq6 mo23380g0() {
        uq6 uq6 = this.f19416a;
        m26059R(uq6);
        return uq6;
    }

    /* renamed from: h */
    public final void mo23381h(String str, va6 va6) {
        int w;
        int indexOf;
        b96 b96 = this.f19407a;
        m26059R(b96);
        Set y = b96.mo13592y(str);
        if (y != null) {
            va6.mo25982t0(y);
        }
        b96 b962 = this.f19407a;
        m26059R(b962);
        if (b962.mo13576J(str)) {
            va6.mo25923A0();
        }
        b96 b963 = this.f19407a;
        m26059R(b963);
        if (b963.mo13579M(str)) {
            if (mo23368U().mo14110B(str, n36.f17080r0)) {
                String j0 = va6.mo25968j0();
                if (!TextUtils.isEmpty(j0) && (indexOf = j0.indexOf(".")) != -1) {
                    va6.mo25947O(j0.substring(0, indexOf));
                }
            } else {
                va6.mo25933F0();
            }
        }
        b96 b964 = this.f19407a;
        m26059R(b964);
        if (b964.mo13580N(str) && (w = uq6.m29512w(va6, "_id")) != -1) {
            va6.mo25977r(w);
        }
        b96 b965 = this.f19407a;
        m26059R(b965);
        if (b965.mo13578L(str)) {
            va6.mo25925B0();
        }
        b96 b966 = this.f19407a;
        m26059R(b966);
        if (b966.mo13575I(str)) {
            va6.mo25992y0();
            oq6 oq6 = (oq6) this.f19430b.get(str);
            if (oq6 == null || oq6.f18080a + mo23368U().mo14125r(str, n36.f17036T) < mo15133a().elapsedRealtime()) {
                oq6 = new oq6(this);
                this.f19430b.put(str, oq6);
            }
            va6.mo25936H(oq6.f18081a);
        }
        b96 b967 = this.f19407a;
        m26059R(b967);
        if (b967.mo13577K(str)) {
            va6.mo25941J0();
        }
    }

    /* renamed from: h0 */
    public final gr6 mo23382h0() {
        return ((za6) Preconditions.checkNotNull(this.f19420a)).mo27871N();
    }

    @ly4
    /* renamed from: i */
    public final void mo23383i(yd6 yd6) {
        mo15135d().mo15139h();
        if (!TextUtils.isEmpty(yd6.mo27409n0()) || !TextUtils.isEmpty(yd6.mo27395g0())) {
            bp6 bp6 = this.f19409a;
            Uri.Builder builder = new Uri.Builder();
            String n0 = yd6.mo27409n0();
            if (TextUtils.isEmpty(n0)) {
                n0 = yd6.mo27395g0();
            }
            C3042oa oaVar = null;
            Uri.Builder appendQueryParameter = builder.scheme((String) n36.f17053e.mo18887a((Object) null)).encodedAuthority((String) n36.f17055f.mo18887a((Object) null)).path("config/app/".concat(String.valueOf(n0))).appendQueryParameter("platform", "android");
            bp6.f11205a.mo27891z().mo14124q();
            appendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(76003)).appendQueryParameter("runtime_version", qa0.f34045b);
            String uri = builder.build().toString();
            try {
                String str = (String) Preconditions.checkNotNull(yd6.mo27399i0());
                URL url = new URL(uri);
                mo15136e().mo12730v().mo25380b("Fetching remote configuration", str);
                b96 b96 = this.f19407a;
                m26059R(b96);
                g76 t = b96.mo13588t(str);
                b96 b962 = this.f19407a;
                m26059R(b962);
                String v = b962.mo13590v(str);
                if (t != null) {
                    if (!TextUtils.isEmpty(v)) {
                        C3042oa oaVar2 = new C3042oa();
                        oaVar2.put("If-Modified-Since", v);
                        oaVar = oaVar2;
                    }
                    b96 b963 = this.f19407a;
                    m26059R(b963);
                    String u = b963.mo13589u(str);
                    if (!TextUtils.isEmpty(u)) {
                        if (oaVar == null) {
                            oaVar = new C3042oa();
                        }
                        oaVar.put(ConfigFetchHttpClient.f25306g, u);
                    }
                }
                this.f19433c = true;
                s56 s56 = this.f19413a;
                m26059R(s56);
                hp6 hp6 = new hp6(this);
                s56.mo15139h();
                s56.mo27038i();
                Preconditions.checkNotNull(url);
                Preconditions.checkNotNull(hp6);
                s56.f11205a.mo15135d().mo23064y(new p56(s56, str, url, (byte[]) null, oaVar, hp6));
            } catch (MalformedURLException unused) {
                mo15136e().mo12726r().mo25381c("Failed to parse config URL. Not fetching. appId", a56.m10802z(yd6.mo27399i0()), uri);
            }
        } else {
            mo23391n((String) Preconditions.checkNotNull(yd6.mo27399i0()), 204, (Throwable) null, (byte[]) null, (Map) null);
        }
    }

    @ly4
    /* renamed from: i0 */
    public final String mo23384i0(ye5 ye5) {
        if (!ye5.mo27438i(ne5.ANALYTICS_STORAGE)) {
            return null;
        }
        byte[] bArr = new byte[16];
        mo23382h0().mo16892u().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
    }

    @ly4
    /* renamed from: j */
    public final void mo23385j(xj5 xj5, uy6 uy6) {
        xj5 xj52;
        List<fc5> list;
        List<fc5> list2;
        List<fc5> list3;
        u46 r;
        String str;
        Object z;
        String f;
        Object obj;
        String str2;
        uy6 uy62 = uy6;
        Preconditions.checkNotNull(uy6);
        Preconditions.checkNotEmpty(uy62.f21557b);
        mo15135d().mo15139h();
        mo23379g();
        String str3 = uy62.f21557b;
        long j = xj5.f22603b;
        d56 b = d56.m12971b(xj5);
        mo15135d().mo15139h();
        fj6 fj6 = null;
        if (!(this.f19412a == null || (str2 = this.f19421a) == null || !str2.equals(str3))) {
            fj6 = this.f19412a;
        }
        gr6.m16187y(fj6, b.f10637a, false);
        xj5 a = b.mo14531a();
        m26059R(this.f19416a);
        if (uq6.m29504m(a, uy62)) {
            if (!uy62.f21558b) {
                mo23366S(uy62);
                return;
            }
            List list4 = uy62.f21555a;
            if (list4 == null) {
                xj52 = a;
            } else if (list4.contains(a.f22604b)) {
                Bundle L2 = a.f22602a.mo17314L2();
                L2.putLong("ga_safelisted", 1);
                xj52 = new xj5(a.f22604b, new hj5(L2), a.f22605c, a.f22603b);
            } else {
                mo15136e().mo12725q().mo25382d("Dropping non-safelisted event. appId, event name, origin", str3, a.f22604b, a.f22605c);
                return;
            }
            vg5 vg5 = this.f19418a;
            m26059R(vg5);
            vg5.mo26077e0();
            try {
                vg5 vg52 = this.f19418a;
                m26059R(vg52);
                Preconditions.checkNotEmpty(str3);
                vg52.mo15139h();
                vg52.mo27038i();
                int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
                if (i < 0) {
                    vg52.f11205a.mo15136e().mo12731w().mo25381c("Invalid time querying timed out conditional properties", a56.m10802z(str3), Long.valueOf(j));
                    list = Collections.emptyList();
                } else {
                    list = vg52.mo26074b0("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str3, String.valueOf(j)});
                }
                for (fc5 fc5 : list) {
                    if (fc5 != null) {
                        mo15136e().mo12730v().mo25382d("User property timed out", fc5.f12020b, this.f19420a.mo27862D().mo19282f(fc5.f12016a.f22256b), fc5.f12016a.mo26660K2());
                        xj5 xj53 = fc5.f12017a;
                        if (xj53 != null) {
                            mo23355D(new xj5(xj53, j), uy62);
                        }
                        vg5 vg53 = this.f19418a;
                        m26059R(vg53);
                        vg53.mo26057J(str3, fc5.f12016a.f22256b);
                    }
                }
                vg5 vg54 = this.f19418a;
                m26059R(vg54);
                Preconditions.checkNotEmpty(str3);
                vg54.mo15139h();
                vg54.mo27038i();
                if (i < 0) {
                    vg54.f11205a.mo15136e().mo12731w().mo25381c("Invalid time querying expired conditional properties", a56.m10802z(str3), Long.valueOf(j));
                    list2 = Collections.emptyList();
                } else {
                    list2 = vg54.mo26074b0("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str3, String.valueOf(j)});
                }
                ArrayList<xj5> arrayList = new ArrayList<>(list2.size());
                for (fc5 fc52 : list2) {
                    if (fc52 != null) {
                        mo15136e().mo12730v().mo25382d("User property expired", fc52.f12020b, this.f19420a.mo27862D().mo19282f(fc52.f12016a.f22256b), fc52.f12016a.mo26660K2());
                        vg5 vg55 = this.f19418a;
                        m26059R(vg55);
                        vg55.mo26081m(str3, fc52.f12016a.f22256b);
                        xj5 xj54 = fc52.f12023c;
                        if (xj54 != null) {
                            arrayList.add(xj54);
                        }
                        vg5 vg56 = this.f19418a;
                        m26059R(vg56);
                        vg56.mo26057J(str3, fc52.f12016a.f22256b);
                    }
                }
                for (xj5 xj55 : arrayList) {
                    mo23355D(new xj5(xj55, j), uy62);
                }
                vg5 vg57 = this.f19418a;
                m26059R(vg57);
                String str4 = xj52.f22604b;
                Preconditions.checkNotEmpty(str3);
                Preconditions.checkNotEmpty(str4);
                vg57.mo15139h();
                vg57.mo27038i();
                if (i < 0) {
                    vg57.f11205a.mo15136e().mo12731w().mo25382d("Invalid time querying triggered conditional properties", a56.m10802z(str3), vg57.f11205a.mo27862D().mo19280d(str4), Long.valueOf(j));
                    list3 = Collections.emptyList();
                } else {
                    list3 = vg57.mo26074b0("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str3, str4, String.valueOf(j)});
                }
                ArrayList<xj5> arrayList2 = new ArrayList<>(list3.size());
                for (fc5 fc53 : list3) {
                    if (fc53 != null) {
                        wq6 wq6 = fc53.f12016a;
                        ar6 ar6 = new ar6((String) Preconditions.checkNotNull(fc53.f12020b), fc53.f12024c, wq6.f22256b, j, Preconditions.checkNotNull(wq6.mo26660K2()));
                        vg5 vg58 = this.f19418a;
                        m26059R(vg58);
                        if (vg58.mo26092x(ar6)) {
                            r = mo15136e().mo12730v();
                            str = "User property triggered";
                            z = fc53.f12020b;
                            f = this.f19420a.mo27862D().mo19282f(ar6.f9510c);
                            obj = ar6.f9507a;
                        } else {
                            r = mo15136e().mo12726r();
                            str = "Too many active user properties, ignoring";
                            z = a56.m10802z(fc53.f12020b);
                            f = this.f19420a.mo27862D().mo19282f(ar6.f9510c);
                            obj = ar6.f9507a;
                        }
                        r.mo25382d(str, z, f, obj);
                        xj5 xj56 = fc53.f12019b;
                        if (xj56 != null) {
                            arrayList2.add(xj56);
                        }
                        fc53.f12016a = new wq6(ar6);
                        fc53.f12021b = true;
                        vg5 vg59 = this.f19418a;
                        m26059R(vg59);
                        vg59.mo26091w(fc53);
                    }
                }
                mo23355D(xj52, uy62);
                for (xj5 xj57 : arrayList2) {
                    mo23355D(new xj5(xj57, j), uy62);
                }
                vg5 vg510 = this.f19418a;
                m26059R(vg510);
                vg510.mo26083o();
            } finally {
                vg5 vg511 = this.f19418a;
                m26059R(vg511);
                vg511.mo26078f0();
            }
        }
    }

    /* renamed from: j0 */
    public final String mo23386j0(uy6 uy6) {
        try {
            return (String) mo15135d().mo23062s(new jp6(this, uy6)).get(30000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            mo15136e().mo12726r().mo25381c("Failed to get app instance id. appId", a56.m10802z(uy6.f21557b), e);
            return null;
        }
    }

    @ly4
    /* renamed from: k */
    public final void mo23387k(xj5 xj5, String str) {
        xj5 xj52 = xj5;
        String str2 = str;
        vg5 vg5 = this.f19418a;
        m26059R(vg5);
        yd6 R = vg5.mo26065R(str2);
        if (R == null || TextUtils.isEmpty(R.mo27405l0())) {
            mo15136e().mo12725q().mo25380b("No app data available; dropping event", str2);
            return;
        }
        Boolean J = mo23359J(R);
        if (J == null) {
            if (!"_ui".equals(xj52.f22604b)) {
                mo15136e().mo12731w().mo25380b("Could not find package. appId", a56.m10802z(str));
            }
        } else if (!J.booleanValue()) {
            mo15136e().mo12726r().mo25380b("App version does not match; dropping event. appId", a56.m10802z(str));
            return;
        }
        String n0 = R.mo27409n0();
        String l0 = R.mo27405l0();
        long P = R.mo27371P();
        String k0 = R.mo27403k0();
        long a0 = R.mo27383a0();
        long X = R.mo27379X();
        uy6 uy6 = r2;
        boolean M = R.mo27368M();
        yd6 yd6 = R;
        String m0 = yd6.mo27407m0();
        yd6.mo27356A();
        uy6 uy62 = new uy6(str, n0, l0, P, k0, a0, X, (String) null, M, false, m0, 0, 0, 0, yd6.mo27367L(), false, yd6.mo27395g0(), yd6.mo27393f0(), yd6.mo27380Y(), yd6.mo27388d(), (String) null, mo23369V(str2).mo27436h(), "", (String) null, yd6.mo27370O(), yd6.mo27391e0());
        mo23388l(xj52, uy6);
    }

    @ly4
    /* renamed from: l */
    public final void mo23388l(xj5 xj5, uy6 uy6) {
        Preconditions.checkNotEmpty(uy6.f21557b);
        d56 b = d56.m12971b(xj5);
        gr6 h0 = mo23382h0();
        Bundle bundle = b.f10637a;
        vg5 vg5 = this.f19418a;
        m26059R(vg5);
        h0.mo16900z(bundle, vg5.mo26064Q(uy6.f21557b));
        mo23382h0().mo16851B(b, mo23368U().mo14121n(uy6.f21557b));
        xj5 a = b.mo14531a();
        if (C4311b.C4317f.f25142l.equals(a.f22604b) && "referrer API v2".equals(a.f22602a.mo17318P2("_cis"))) {
            String P2 = a.f22602a.mo17318P2("gclid");
            if (!TextUtils.isEmpty(P2)) {
                mo23353B(new wq6("_lgclid", a.f22603b, P2, bf0.f26274c), uy6);
            }
        }
        mo23385j(a, uy6);
    }

    @ly4
    /* renamed from: l0 */
    public final void mo23389l0(Runnable runnable) {
        mo15135d().mo15139h();
        if (this.f19424a == null) {
            this.f19424a = new ArrayList();
        }
        this.f19424a.add(runnable);
    }

    /* renamed from: m */
    public final void mo23390m() {
        this.f19427b++;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004a A[Catch:{ all -> 0x0173, all -> 0x017d }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005d A[Catch:{ all -> 0x0173, all -> 0x017d }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x012a A[Catch:{ all -> 0x0173, all -> 0x017d }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0138 A[Catch:{ all -> 0x0173, all -> 0x017d }] */
    @com.google.android.gms.common.util.VisibleForTesting
    @com.onedelhi.secure.ly4
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo23391n(java.lang.String r8, int r9, java.lang.Throwable r10, byte[] r11, java.util.Map r12) {
        /*
            r7 = this;
            com.onedelhi.secure.qa6 r0 = r7.mo15135d()
            r0.mo15139h()
            r7.mo23379g()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r8)
            r0 = 0
            if (r11 != 0) goto L_0x0012
            byte[] r11 = new byte[r0]     // Catch:{ all -> 0x017d }
        L_0x0012:
            com.onedelhi.secure.a56 r1 = r7.mo15136e()     // Catch:{ all -> 0x017d }
            com.onedelhi.secure.u46 r1 = r1.mo12730v()     // Catch:{ all -> 0x017d }
            java.lang.String r2 = "onConfigFetched. Response size"
            int r3 = r11.length     // Catch:{ all -> 0x017d }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x017d }
            r1.mo25380b(r2, r3)     // Catch:{ all -> 0x017d }
            com.onedelhi.secure.vg5 r1 = r7.f19418a     // Catch:{ all -> 0x017d }
            m26059R(r1)     // Catch:{ all -> 0x017d }
            r1.mo26077e0()     // Catch:{ all -> 0x017d }
            com.onedelhi.secure.vg5 r1 = r7.f19418a     // Catch:{ all -> 0x0173 }
            m26059R(r1)     // Catch:{ all -> 0x0173 }
            com.onedelhi.secure.yd6 r1 = r1.mo26065R(r8)     // Catch:{ all -> 0x0173 }
            r2 = 200(0xc8, float:2.8E-43)
            r4 = 304(0x130, float:4.26E-43)
            if (r9 == r2) goto L_0x0043
            r2 = 204(0xcc, float:2.86E-43)
            if (r9 == r2) goto L_0x0043
            if (r9 != r4) goto L_0x0047
            r9 = 304(0x130, float:4.26E-43)
        L_0x0043:
            if (r10 != 0) goto L_0x0047
            r2 = 1
            goto L_0x0048
        L_0x0047:
            r2 = 0
        L_0x0048:
            if (r1 != 0) goto L_0x005d
            com.onedelhi.secure.a56 r9 = r7.mo15136e()     // Catch:{ all -> 0x0173 }
            com.onedelhi.secure.u46 r9 = r9.mo12731w()     // Catch:{ all -> 0x0173 }
            java.lang.String r10 = "App does not exist in onConfigFetched. appId"
            java.lang.Object r8 = com.onedelhi.secure.a56.m10802z(r8)     // Catch:{ all -> 0x0173 }
            r9.mo25380b(r10, r8)     // Catch:{ all -> 0x0173 }
            goto L_0x015d
        L_0x005d:
            r5 = 404(0x194, float:5.66E-43)
            if (r2 != 0) goto L_0x00bb
            if (r9 != r5) goto L_0x0064
            goto L_0x00bb
        L_0x0064:
            com.google.android.gms.common.util.Clock r11 = r7.mo15133a()     // Catch:{ all -> 0x0173 }
            long r11 = r11.currentTimeMillis()     // Catch:{ all -> 0x0173 }
            r1.mo27417v(r11)     // Catch:{ all -> 0x0173 }
            com.onedelhi.secure.vg5 r11 = r7.f19418a     // Catch:{ all -> 0x0173 }
            m26059R(r11)     // Catch:{ all -> 0x0173 }
            r11.mo26084p(r1)     // Catch:{ all -> 0x0173 }
            com.onedelhi.secure.a56 r11 = r7.mo15136e()     // Catch:{ all -> 0x0173 }
            com.onedelhi.secure.u46 r11 = r11.mo12730v()     // Catch:{ all -> 0x0173 }
            java.lang.String r12 = "Fetching config failed. code, error"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0173 }
            r11.mo25381c(r12, r1, r10)     // Catch:{ all -> 0x0173 }
            com.onedelhi.secure.b96 r10 = r7.f19407a     // Catch:{ all -> 0x0173 }
            m26059R(r10)     // Catch:{ all -> 0x0173 }
            r10.mo13593z(r8)     // Catch:{ all -> 0x0173 }
            com.onedelhi.secure.sm6 r8 = r7.f19414a     // Catch:{ all -> 0x0173 }
            com.onedelhi.secure.e76 r8 = r8.f20436d     // Catch:{ all -> 0x0173 }
            com.google.android.gms.common.util.Clock r10 = r7.mo15133a()     // Catch:{ all -> 0x0173 }
            long r10 = r10.currentTimeMillis()     // Catch:{ all -> 0x0173 }
            r8.mo15076b(r10)     // Catch:{ all -> 0x0173 }
            r8 = 503(0x1f7, float:7.05E-43)
            if (r9 == r8) goto L_0x00a7
            r8 = 429(0x1ad, float:6.01E-43)
            if (r9 != r8) goto L_0x00b6
        L_0x00a7:
            com.onedelhi.secure.sm6 r8 = r7.f19414a     // Catch:{ all -> 0x0173 }
            com.onedelhi.secure.e76 r8 = r8.f20434b     // Catch:{ all -> 0x0173 }
            com.google.android.gms.common.util.Clock r9 = r7.mo15133a()     // Catch:{ all -> 0x0173 }
            long r9 = r9.currentTimeMillis()     // Catch:{ all -> 0x0173 }
            r8.mo15076b(r9)     // Catch:{ all -> 0x0173 }
        L_0x00b6:
            r7.mo23362M()     // Catch:{ all -> 0x0173 }
            goto L_0x015d
        L_0x00bb:
            r10 = 0
            if (r12 == 0) goto L_0x00c7
            java.lang.String r2 = "Last-Modified"
            java.lang.Object r2 = r12.get(r2)     // Catch:{ all -> 0x0173 }
            java.util.List r2 = (java.util.List) r2     // Catch:{ all -> 0x0173 }
            goto L_0x00c8
        L_0x00c7:
            r2 = r10
        L_0x00c8:
            if (r2 == 0) goto L_0x00d7
            boolean r6 = r2.isEmpty()     // Catch:{ all -> 0x0173 }
            if (r6 != 0) goto L_0x00d7
            java.lang.Object r2 = r2.get(r0)     // Catch:{ all -> 0x0173 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0173 }
            goto L_0x00d8
        L_0x00d7:
            r2 = r10
        L_0x00d8:
            if (r12 == 0) goto L_0x00e3
            java.lang.String r6 = "ETag"
            java.lang.Object r12 = r12.get(r6)     // Catch:{ all -> 0x0173 }
            java.util.List r12 = (java.util.List) r12     // Catch:{ all -> 0x0173 }
            goto L_0x00e4
        L_0x00e3:
            r12 = r10
        L_0x00e4:
            if (r12 == 0) goto L_0x00f3
            boolean r6 = r12.isEmpty()     // Catch:{ all -> 0x0173 }
            if (r6 != 0) goto L_0x00f3
            java.lang.Object r12 = r12.get(r0)     // Catch:{ all -> 0x0173 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0173 }
            goto L_0x00f4
        L_0x00f3:
            r12 = r10
        L_0x00f4:
            if (r9 == r5) goto L_0x0102
            if (r9 != r4) goto L_0x00f9
            goto L_0x0102
        L_0x00f9:
            com.onedelhi.secure.b96 r10 = r7.f19407a     // Catch:{ all -> 0x0173 }
            m26059R(r10)     // Catch:{ all -> 0x0173 }
            r10.mo13574H(r8, r11, r2, r12)     // Catch:{ all -> 0x0173 }
            goto L_0x0115
        L_0x0102:
            com.onedelhi.secure.b96 r11 = r7.f19407a     // Catch:{ all -> 0x0173 }
            m26059R(r11)     // Catch:{ all -> 0x0173 }
            com.onedelhi.secure.g76 r11 = r11.mo13588t(r8)     // Catch:{ all -> 0x0173 }
            if (r11 != 0) goto L_0x0115
            com.onedelhi.secure.b96 r11 = r7.f19407a     // Catch:{ all -> 0x0173 }
            m26059R(r11)     // Catch:{ all -> 0x0173 }
            r11.mo13574H(r8, r10, r10, r10)     // Catch:{ all -> 0x0173 }
        L_0x0115:
            com.google.android.gms.common.util.Clock r10 = r7.mo15133a()     // Catch:{ all -> 0x0173 }
            long r10 = r10.currentTimeMillis()     // Catch:{ all -> 0x0173 }
            r1.mo27406m(r10)     // Catch:{ all -> 0x0173 }
            com.onedelhi.secure.vg5 r10 = r7.f19418a     // Catch:{ all -> 0x0173 }
            m26059R(r10)     // Catch:{ all -> 0x0173 }
            r10.mo26084p(r1)     // Catch:{ all -> 0x0173 }
            if (r9 != r5) goto L_0x0138
            com.onedelhi.secure.a56 r9 = r7.mo15136e()     // Catch:{ all -> 0x0173 }
            com.onedelhi.secure.u46 r9 = r9.mo12732x()     // Catch:{ all -> 0x0173 }
            java.lang.String r10 = "Config not found. Using empty config. appId"
            r9.mo25380b(r10, r8)     // Catch:{ all -> 0x0173 }
            goto L_0x0149
        L_0x0138:
            com.onedelhi.secure.a56 r8 = r7.mo15136e()     // Catch:{ all -> 0x0173 }
            com.onedelhi.secure.u46 r8 = r8.mo12730v()     // Catch:{ all -> 0x0173 }
            java.lang.String r10 = "Successfully fetched config. Got network response. code, size"
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0173 }
            r8.mo25381c(r10, r9, r3)     // Catch:{ all -> 0x0173 }
        L_0x0149:
            com.onedelhi.secure.s56 r8 = r7.f19413a     // Catch:{ all -> 0x0173 }
            m26059R(r8)     // Catch:{ all -> 0x0173 }
            boolean r8 = r8.mo24212m()     // Catch:{ all -> 0x0173 }
            if (r8 == 0) goto L_0x00b6
            boolean r8 = r7.mo23364O()     // Catch:{ all -> 0x0173 }
            if (r8 == 0) goto L_0x00b6
            r7.mo23354C()     // Catch:{ all -> 0x0173 }
        L_0x015d:
            com.onedelhi.secure.vg5 r8 = r7.f19418a     // Catch:{ all -> 0x0173 }
            m26059R(r8)     // Catch:{ all -> 0x0173 }
            r8.mo26083o()     // Catch:{ all -> 0x0173 }
            com.onedelhi.secure.vg5 r8 = r7.f19418a     // Catch:{ all -> 0x017d }
            m26059R(r8)     // Catch:{ all -> 0x017d }
            r8.mo26078f0()     // Catch:{ all -> 0x017d }
            r7.f19433c = r0
            r7.mo23360K()
            return
        L_0x0173:
            r8 = move-exception
            com.onedelhi.secure.vg5 r9 = r7.f19418a     // Catch:{ all -> 0x017d }
            m26059R(r9)     // Catch:{ all -> 0x017d }
            r9.mo26078f0()     // Catch:{ all -> 0x017d }
            throw r8     // Catch:{ all -> 0x017d }
        L_0x017d:
            r8 = move-exception
            r7.f19433c = r0
            r7.mo23360K()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.qq6.mo23391n(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    /* renamed from: o */
    public final void mo23392o(boolean z) {
        mo23362M();
    }

    /* JADX INFO: finally extract failed */
    @VisibleForTesting
    @ly4
    /* renamed from: p */
    public final void mo23393p(int i, Throwable th, byte[] bArr, String str) {
        vg5 vg5;
        mo15135d().mo15139h();
        mo23379g();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.f19434d = false;
                mo23360K();
                throw th2;
            }
        }
        List<Long> list = (List) Preconditions.checkNotNull(this.f19429b);
        this.f19429b = null;
        if (i != 200) {
            if (i == 204) {
                i = 204;
            }
            mo15136e().mo12730v().mo25381c("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
            this.f19414a.f20436d.mo15076b(mo15133a().currentTimeMillis());
            if (i == 503 || i == 429) {
                this.f19414a.f20434b.mo15076b(mo15133a().currentTimeMillis());
            }
            vg5 vg52 = this.f19418a;
            m26059R(vg52);
            vg52.mo26079g0(list);
            mo23362M();
            this.f19434d = false;
            mo23360K();
        }
        if (th == null) {
            try {
                this.f19414a.f20435c.mo15076b(mo15133a().currentTimeMillis());
                this.f19414a.f20436d.mo15076b(0);
                mo23362M();
                mo15136e().mo12730v().mo25381c("Successful upload. Got network response. code, size", Integer.valueOf(i), Integer.valueOf(bArr.length));
                vg5 vg53 = this.f19418a;
                m26059R(vg53);
                vg53.mo26077e0();
                try {
                    for (Long l : list) {
                        try {
                            vg5 = this.f19418a;
                            m26059R(vg5);
                            long longValue = l.longValue();
                            vg5.mo15139h();
                            vg5.mo27038i();
                            if (vg5.mo26063P().delete("queue", "rowid=?", new String[]{String.valueOf(longValue)}) != 1) {
                                throw new SQLiteException("Deleted fewer rows from queue than expected");
                            }
                        } catch (SQLiteException e) {
                            vg5.f11205a.mo15136e().mo12726r().mo25380b("Failed to delete a bundle in a queue table", e);
                            throw e;
                        } catch (SQLiteException e2) {
                            List list2 = this.f19432c;
                            if (list2 == null || !list2.contains(l)) {
                                throw e2;
                            }
                        }
                    }
                    vg5 vg54 = this.f19418a;
                    m26059R(vg54);
                    vg54.mo26083o();
                    vg5 vg55 = this.f19418a;
                    m26059R(vg55);
                    vg55.mo26078f0();
                    this.f19432c = null;
                    s56 s56 = this.f19413a;
                    m26059R(s56);
                    if (!s56.mo24212m() || !mo23364O()) {
                        this.f19428b = -1;
                        mo23362M();
                    } else {
                        mo23354C();
                    }
                    this.f19406a = 0;
                } catch (Throwable th3) {
                    vg5 vg56 = this.f19418a;
                    m26059R(vg56);
                    vg56.mo26078f0();
                    throw th3;
                }
            } catch (SQLiteException e3) {
                mo15136e().mo12726r().mo25380b("Database error while trying to delete uploaded bundles", e3);
                this.f19406a = mo15133a().elapsedRealtime();
                mo15136e().mo12730v().mo25380b("Disable upload, time", Long.valueOf(this.f19406a));
            }
            this.f19434d = false;
            mo23360K();
        }
        mo15136e().mo12730v().mo25381c("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
        this.f19414a.f20436d.mo15076b(mo15133a().currentTimeMillis());
        this.f19414a.f20434b.mo15076b(mo15133a().currentTimeMillis());
        vg5 vg522 = this.f19418a;
        m26059R(vg522);
        vg522.mo26079g0(list);
        mo23362M();
        this.f19434d = false;
        mo23360K();
    }

    /* JADX WARNING: Removed duplicated region for block: B:133:0x03cf A[Catch:{ RuntimeException -> 0x035c, all -> 0x0565 }] */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x03fb A[Catch:{ RuntimeException -> 0x035c, all -> 0x0565 }] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0410 A[SYNTHETIC, Splitter:B:138:0x0410] */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x04b2 A[Catch:{ RuntimeException -> 0x035c, all -> 0x0565 }] */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x04d2 A[Catch:{ RuntimeException -> 0x035c, all -> 0x0565 }] */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0537 A[Catch:{ RuntimeException -> 0x035c, all -> 0x0565 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0126 A[Catch:{ RuntimeException -> 0x035c, all -> 0x0565 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01ef A[Catch:{ RuntimeException -> 0x035c, all -> 0x0565 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01f5 A[Catch:{ RuntimeException -> 0x035c, all -> 0x0565 }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x024e A[Catch:{ RuntimeException -> 0x035c, all -> 0x0565 }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x025d A[Catch:{ RuntimeException -> 0x035c, all -> 0x0565 }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x026d A[Catch:{ RuntimeException -> 0x035c, all -> 0x0565 }] */
    @com.onedelhi.secure.ly4
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo23394q(com.onedelhi.secure.uy6 r24) {
        /*
            r23 = this;
            r1 = r23
            r2 = r24
            java.lang.String r3 = "_sysu"
            java.lang.String r4 = "_sys"
            java.lang.String r5 = "com.android.vending"
            java.lang.String r6 = "_pfo"
            java.lang.String r0 = "_npa"
            java.lang.String r7 = "_uwa"
            java.lang.String r8 = "app_id=?"
            com.onedelhi.secure.qa6 r9 = r23.mo15135d()
            r9.mo15139h()
            r23.mo23379g()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r24)
            java.lang.String r9 = r2.f21557b
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r9)
            boolean r9 = m26058Q(r24)
            if (r9 == 0) goto L_0x056f
            com.onedelhi.secure.vg5 r9 = r1.f19418a
            m26059R(r9)
            java.lang.String r10 = r2.f21557b
            com.onedelhi.secure.yd6 r9 = r9.mo26065R(r10)
            r10 = 0
            if (r9 == 0) goto L_0x0060
            java.lang.String r12 = r9.mo27409n0()
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 == 0) goto L_0x0060
            java.lang.String r12 = r2.f21560c
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 != 0) goto L_0x0060
            r9.mo27406m(r10)
            com.onedelhi.secure.vg5 r12 = r1.f19418a
            m26059R(r12)
            r12.mo26084p(r9)
            com.onedelhi.secure.b96 r9 = r1.f19407a
            m26059R(r9)
            java.lang.String r12 = r2.f21557b
            r9.mo13567A(r12)
        L_0x0060:
            boolean r9 = r2.f21558b
            if (r9 != 0) goto L_0x0068
            r23.mo23366S(r24)
            return
        L_0x0068:
            long r12 = r2.f21568f
            int r9 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r9 != 0) goto L_0x0076
            com.google.android.gms.common.util.Clock r9 = r23.mo15133a()
            long r12 = r9.currentTimeMillis()
        L_0x0076:
            com.onedelhi.secure.za6 r9 = r1.f19420a
            com.onedelhi.secure.bi5 r9 = r9.mo27859A()
            r9.mo13732r()
            int r9 = r2.f21579n
            r15 = 1
            if (r9 == 0) goto L_0x009e
            if (r9 == r15) goto L_0x009e
            com.onedelhi.secure.a56 r16 = r23.mo15136e()
            com.onedelhi.secure.u46 r14 = r16.mo12731w()
            java.lang.String r10 = r2.f21557b
            java.lang.Object r10 = com.onedelhi.secure.a56.m10802z(r10)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.String r11 = "Incorrect app type, assuming installed app. appId, appType"
            r14.mo25381c(r11, r10, r9)
            r9 = 0
        L_0x009e:
            com.onedelhi.secure.vg5 r10 = r1.f19418a
            m26059R(r10)
            r10.mo26077e0()
            com.onedelhi.secure.vg5 r10 = r1.f19418a     // Catch:{ all -> 0x0565 }
            m26059R(r10)     // Catch:{ all -> 0x0565 }
            java.lang.String r11 = r2.f21557b     // Catch:{ all -> 0x0565 }
            com.onedelhi.secure.ar6 r10 = r10.mo26070X(r11, r0)     // Catch:{ all -> 0x0565 }
            r11 = r3
            r20 = r4
            if (r10 == 0) goto L_0x00c3
            java.lang.String r14 = "auto"
            java.lang.String r3 = r10.f9509b     // Catch:{ all -> 0x0565 }
            boolean r3 = r14.equals(r3)     // Catch:{ all -> 0x0565 }
            if (r3 == 0) goto L_0x00c1
            goto L_0x00c3
        L_0x00c1:
            r4 = 1
            goto L_0x00fd
        L_0x00c3:
            java.lang.Boolean r3 = r2.f21554a     // Catch:{ all -> 0x0565 }
            if (r3 == 0) goto L_0x00f7
            com.onedelhi.secure.wq6 r0 = new com.onedelhi.secure.wq6     // Catch:{ all -> 0x0565 }
            java.lang.String r3 = "_npa"
            java.lang.Boolean r4 = r2.f21554a     // Catch:{ all -> 0x0565 }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x0565 }
            if (r15 == r4) goto L_0x00d6
            r18 = 0
            goto L_0x00d8
        L_0x00d6:
            r18 = 1
        L_0x00d8:
            java.lang.Long r18 = java.lang.Long.valueOf(r18)     // Catch:{ all -> 0x0565 }
            java.lang.String r19 = "auto"
            r4 = 0
            r14 = r0
            r4 = 1
            r15 = r3
            r16 = r12
            r14.<init>(r15, r16, r18, r19)     // Catch:{ all -> 0x0565 }
            if (r10 == 0) goto L_0x00f3
            java.lang.Object r3 = r10.f9507a     // Catch:{ all -> 0x0565 }
            java.lang.Long r10 = r0.f22254a     // Catch:{ all -> 0x0565 }
            boolean r3 = r3.equals(r10)     // Catch:{ all -> 0x0565 }
            if (r3 != 0) goto L_0x00fd
        L_0x00f3:
            r1.mo23353B(r0, r2)     // Catch:{ all -> 0x0565 }
            goto L_0x00fd
        L_0x00f7:
            r4 = 1
            if (r10 == 0) goto L_0x00fd
            r1.mo23398u(r0, r2)     // Catch:{ all -> 0x0565 }
        L_0x00fd:
            com.onedelhi.secure.vg5 r0 = r1.f19418a     // Catch:{ all -> 0x0565 }
            m26059R(r0)     // Catch:{ all -> 0x0565 }
            java.lang.String r3 = r2.f21557b     // Catch:{ all -> 0x0565 }
            java.lang.Object r3 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)     // Catch:{ all -> 0x0565 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0565 }
            com.onedelhi.secure.yd6 r0 = r0.mo26065R(r3)     // Catch:{ all -> 0x0565 }
            if (r0 == 0) goto L_0x01ef
            com.onedelhi.secure.gr6 r10 = r23.mo23382h0()     // Catch:{ all -> 0x0565 }
            java.lang.String r14 = r2.f21560c     // Catch:{ all -> 0x0565 }
            java.lang.String r15 = r0.mo27409n0()     // Catch:{ all -> 0x0565 }
            java.lang.String r3 = r2.f21574h     // Catch:{ all -> 0x0565 }
            java.lang.String r4 = r0.mo27395g0()     // Catch:{ all -> 0x0565 }
            boolean r3 = r10.mo16874d0(r14, r15, r3, r4)     // Catch:{ all -> 0x0565 }
            if (r3 == 0) goto L_0x01ef
            com.onedelhi.secure.a56 r3 = r23.mo15136e()     // Catch:{ all -> 0x0565 }
            com.onedelhi.secure.u46 r3 = r3.mo12731w()     // Catch:{ all -> 0x0565 }
            java.lang.String r4 = "New GMP App Id passed in. Removing cached database data. appId"
            java.lang.String r10 = r0.mo27399i0()     // Catch:{ all -> 0x0565 }
            java.lang.Object r10 = com.onedelhi.secure.a56.m10802z(r10)     // Catch:{ all -> 0x0565 }
            r3.mo25380b(r4, r10)     // Catch:{ all -> 0x0565 }
            com.onedelhi.secure.vg5 r3 = r1.f19418a     // Catch:{ all -> 0x0565 }
            m26059R(r3)     // Catch:{ all -> 0x0565 }
            java.lang.String r4 = r0.mo27399i0()     // Catch:{ all -> 0x0565 }
            r3.mo27038i()     // Catch:{ all -> 0x0565 }
            r3.mo15139h()     // Catch:{ all -> 0x0565 }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r4)     // Catch:{ all -> 0x0565 }
            android.database.sqlite.SQLiteDatabase r0 = r3.mo26063P()     // Catch:{ SQLiteException -> 0x01d5 }
            r10 = 1
            java.lang.String[] r14 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x01d5 }
            r10 = 0
            r14[r10] = r4     // Catch:{ SQLiteException -> 0x01d5 }
            java.lang.String r10 = "events"
            int r10 = r0.delete(r10, r8, r14)     // Catch:{ SQLiteException -> 0x01d5 }
            java.lang.String r15 = "user_attributes"
            int r15 = r0.delete(r15, r8, r14)     // Catch:{ SQLiteException -> 0x01d5 }
            int r10 = r10 + r15
            java.lang.String r15 = "conditional_properties"
            int r15 = r0.delete(r15, r8, r14)     // Catch:{ SQLiteException -> 0x01d5 }
            int r10 = r10 + r15
            java.lang.String r15 = "apps"
            int r15 = r0.delete(r15, r8, r14)     // Catch:{ SQLiteException -> 0x01d5 }
            int r10 = r10 + r15
            java.lang.String r15 = "raw_events"
            int r15 = r0.delete(r15, r8, r14)     // Catch:{ SQLiteException -> 0x01d5 }
            int r10 = r10 + r15
            java.lang.String r15 = "raw_events_metadata"
            int r15 = r0.delete(r15, r8, r14)     // Catch:{ SQLiteException -> 0x01d5 }
            int r10 = r10 + r15
            java.lang.String r15 = "event_filters"
            int r15 = r0.delete(r15, r8, r14)     // Catch:{ SQLiteException -> 0x01d5 }
            int r10 = r10 + r15
            java.lang.String r15 = "property_filters"
            int r15 = r0.delete(r15, r8, r14)     // Catch:{ SQLiteException -> 0x01d5 }
            int r10 = r10 + r15
            java.lang.String r15 = "audience_filter_values"
            int r15 = r0.delete(r15, r8, r14)     // Catch:{ SQLiteException -> 0x01d5 }
            int r10 = r10 + r15
            java.lang.String r15 = "consent_settings"
            int r15 = r0.delete(r15, r8, r14)     // Catch:{ SQLiteException -> 0x01d5 }
            int r10 = r10 + r15
            com.onedelhi.secure.vx6.m30535c()     // Catch:{ SQLiteException -> 0x01d5 }
            com.onedelhi.secure.za6 r15 = r3.f11205a     // Catch:{ SQLiteException -> 0x01d5 }
            com.onedelhi.secure.ce5 r15 = r15.mo27891z()     // Catch:{ SQLiteException -> 0x01d5 }
            r21 = r11
            com.onedelhi.secure.k36 r11 = com.onedelhi.secure.n36.f17084t0     // Catch:{ SQLiteException -> 0x01d1 }
            r22 = r6
            r6 = 0
            boolean r11 = r15.mo14110B(r6, r11)     // Catch:{ SQLiteException -> 0x01cf }
            if (r11 == 0) goto L_0x01b9
            java.lang.String r6 = "default_event_params"
            int r0 = r0.delete(r6, r8, r14)     // Catch:{ SQLiteException -> 0x01cf }
            int r10 = r10 + r0
        L_0x01b9:
            if (r10 <= 0) goto L_0x01ed
            com.onedelhi.secure.za6 r0 = r3.f11205a     // Catch:{ SQLiteException -> 0x01cf }
            com.onedelhi.secure.a56 r0 = r0.mo15136e()     // Catch:{ SQLiteException -> 0x01cf }
            com.onedelhi.secure.u46 r0 = r0.mo12730v()     // Catch:{ SQLiteException -> 0x01cf }
            java.lang.String r6 = "Deleted application data. app, records"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)     // Catch:{ SQLiteException -> 0x01cf }
            r0.mo25381c(r6, r4, r8)     // Catch:{ SQLiteException -> 0x01cf }
            goto L_0x01ed
        L_0x01cf:
            r0 = move-exception
            goto L_0x01da
        L_0x01d1:
            r0 = move-exception
            r22 = r6
            goto L_0x01da
        L_0x01d5:
            r0 = move-exception
            r22 = r6
            r21 = r11
        L_0x01da:
            com.onedelhi.secure.za6 r3 = r3.f11205a     // Catch:{ all -> 0x0565 }
            com.onedelhi.secure.a56 r3 = r3.mo15136e()     // Catch:{ all -> 0x0565 }
            com.onedelhi.secure.u46 r3 = r3.mo12726r()     // Catch:{ all -> 0x0565 }
            java.lang.String r6 = "Error deleting application data. appId, error"
            java.lang.Object r4 = com.onedelhi.secure.a56.m10802z(r4)     // Catch:{ all -> 0x0565 }
            r3.mo25381c(r6, r4, r0)     // Catch:{ all -> 0x0565 }
        L_0x01ed:
            r0 = 0
            goto L_0x01f3
        L_0x01ef:
            r22 = r6
            r21 = r11
        L_0x01f3:
            if (r0 == 0) goto L_0x0249
            long r3 = r0.mo27371P()     // Catch:{ all -> 0x0565 }
            r10 = -2147483648(0xffffffff80000000, double:NaN)
            int r6 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x020c
            long r3 = r0.mo27371P()     // Catch:{ all -> 0x0565 }
            long r14 = r2.f21562d     // Catch:{ all -> 0x0565 }
            int r6 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r6 == 0) goto L_0x020c
            r15 = 1
            goto L_0x020d
        L_0x020c:
            r15 = 0
        L_0x020d:
            java.lang.String r3 = r0.mo27405l0()     // Catch:{ all -> 0x0565 }
            long r16 = r0.mo27371P()     // Catch:{ all -> 0x0565 }
            int r0 = (r16 > r10 ? 1 : (r16 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x0225
            if (r3 == 0) goto L_0x0225
            java.lang.String r0 = r2.f21563d     // Catch:{ all -> 0x0565 }
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x0565 }
            if (r0 != 0) goto L_0x0225
            r0 = 1
            goto L_0x0226
        L_0x0225:
            r0 = 0
        L_0x0226:
            r0 = r0 | r15
            if (r0 == 0) goto L_0x0249
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x0565 }
            r0.<init>()     // Catch:{ all -> 0x0565 }
            java.lang.String r4 = "_pv"
            r0.putString(r4, r3)     // Catch:{ all -> 0x0565 }
            com.onedelhi.secure.xj5 r3 = new com.onedelhi.secure.xj5     // Catch:{ all -> 0x0565 }
            java.lang.String r15 = "_au"
            com.onedelhi.secure.hj5 r4 = new com.onedelhi.secure.hj5     // Catch:{ all -> 0x0565 }
            r4.<init>(r0)     // Catch:{ all -> 0x0565 }
            java.lang.String r17 = "auto"
            r14 = r3
            r16 = r4
            r18 = r12
            r14.<init>(r15, r16, r17, r18)     // Catch:{ all -> 0x0565 }
            r1.mo23385j(r3, r2)     // Catch:{ all -> 0x0565 }
        L_0x0249:
            r23.mo23366S(r24)     // Catch:{ all -> 0x0565 }
            if (r9 != 0) goto L_0x025d
            com.onedelhi.secure.vg5 r0 = r1.f19418a     // Catch:{ all -> 0x0565 }
            m26059R(r0)     // Catch:{ all -> 0x0565 }
            java.lang.String r3 = r2.f21557b     // Catch:{ all -> 0x0565 }
            java.lang.String r4 = "_f"
            com.onedelhi.secure.ri5 r0 = r0.mo26069V(r3, r4)     // Catch:{ all -> 0x0565 }
            r15 = 0
            goto L_0x026b
        L_0x025d:
            com.onedelhi.secure.vg5 r0 = r1.f19418a     // Catch:{ all -> 0x0565 }
            m26059R(r0)     // Catch:{ all -> 0x0565 }
            java.lang.String r3 = r2.f21557b     // Catch:{ all -> 0x0565 }
            java.lang.String r4 = "_v"
            com.onedelhi.secure.ri5 r0 = r0.mo26069V(r3, r4)     // Catch:{ all -> 0x0565 }
            r15 = 1
        L_0x026b:
            if (r0 != 0) goto L_0x0537
            r3 = 3600000(0x36ee80, double:1.7786363E-317)
            long r8 = r12 / r3
            r10 = 1
            long r8 = r8 + r10
            long r8 = r8 * r3
            java.lang.String r3 = "_dac"
            java.lang.String r4 = "_et"
            java.lang.String r6 = "_r"
            java.lang.String r10 = "_c"
            if (r15 != 0) goto L_0x04ec
            com.onedelhi.secure.wq6 r0 = new com.onedelhi.secure.wq6     // Catch:{ all -> 0x0565 }
            java.lang.String r15 = "_fot"
            java.lang.Long r18 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0565 }
            java.lang.String r19 = "auto"
            r14 = r0
            r16 = r12
            r14.<init>(r15, r16, r18, r19)     // Catch:{ all -> 0x0565 }
            r1.mo23353B(r0, r2)     // Catch:{ all -> 0x0565 }
            com.onedelhi.secure.qa6 r0 = r23.mo15135d()     // Catch:{ all -> 0x0565 }
            r0.mo15139h()     // Catch:{ all -> 0x0565 }
            com.onedelhi.secure.z76 r0 = r1.f19419a     // Catch:{ all -> 0x0565 }
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch:{ all -> 0x0565 }
            r8 = r0
            com.onedelhi.secure.z76 r8 = (com.onedelhi.secure.z76) r8     // Catch:{ all -> 0x0565 }
            java.lang.String r0 = r2.f21557b     // Catch:{ all -> 0x0565 }
            if (r0 == 0) goto L_0x038d
            boolean r9 = r0.isEmpty()     // Catch:{ all -> 0x0565 }
            if (r9 == 0) goto L_0x02b0
            goto L_0x038d
        L_0x02b0:
            com.onedelhi.secure.za6 r9 = r8.f23490a     // Catch:{ all -> 0x0565 }
            com.onedelhi.secure.qa6 r9 = r9.mo15135d()     // Catch:{ all -> 0x0565 }
            r9.mo15139h()     // Catch:{ all -> 0x0565 }
            boolean r9 = r8.mo27833a()     // Catch:{ all -> 0x0565 }
            if (r9 != 0) goto L_0x02d0
            com.onedelhi.secure.za6 r0 = r8.f23490a     // Catch:{ all -> 0x0565 }
            com.onedelhi.secure.a56 r0 = r0.mo15136e()     // Catch:{ all -> 0x0565 }
            com.onedelhi.secure.u46 r0 = r0.mo12729u()     // Catch:{ all -> 0x0565 }
            java.lang.String r5 = "Install Referrer Reporter is not available"
        L_0x02cb:
            r0.mo25379a(r5)     // Catch:{ all -> 0x0565 }
            goto L_0x039b
        L_0x02d0:
            com.onedelhi.secure.w76 r9 = new com.onedelhi.secure.w76     // Catch:{ all -> 0x0565 }
            r9.<init>(r8, r0)     // Catch:{ all -> 0x0565 }
            com.onedelhi.secure.za6 r0 = r8.f23490a     // Catch:{ all -> 0x0565 }
            com.onedelhi.secure.qa6 r0 = r0.mo15135d()     // Catch:{ all -> 0x0565 }
            r0.mo15139h()     // Catch:{ all -> 0x0565 }
            android.content.Intent r0 = new android.content.Intent     // Catch:{ all -> 0x0565 }
            java.lang.String r11 = "com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE"
            r0.<init>(r11)     // Catch:{ all -> 0x0565 }
            android.content.ComponentName r11 = new android.content.ComponentName     // Catch:{ all -> 0x0565 }
            java.lang.String r14 = "com.google.android.finsky.externalreferrer.GetInstallReferrerService"
            r11.<init>(r5, r14)     // Catch:{ all -> 0x0565 }
            r0.setComponent(r11)     // Catch:{ all -> 0x0565 }
            com.onedelhi.secure.za6 r11 = r8.f23490a     // Catch:{ all -> 0x0565 }
            android.content.Context r11 = r11.mo15137f()     // Catch:{ all -> 0x0565 }
            android.content.pm.PackageManager r11 = r11.getPackageManager()     // Catch:{ all -> 0x0565 }
            if (r11 != 0) goto L_0x0308
            com.onedelhi.secure.za6 r0 = r8.f23490a     // Catch:{ all -> 0x0565 }
            com.onedelhi.secure.a56 r0 = r0.mo15136e()     // Catch:{ all -> 0x0565 }
            com.onedelhi.secure.u46 r0 = r0.mo12733y()     // Catch:{ all -> 0x0565 }
            java.lang.String r5 = "Failed to obtain Package Manager to verify binding conditions for Install Referrer"
            goto L_0x02cb
        L_0x0308:
            r14 = 0
            java.util.List r11 = r11.queryIntentServices(r0, r14)     // Catch:{ all -> 0x0565 }
            if (r11 == 0) goto L_0x037f
            boolean r15 = r11.isEmpty()     // Catch:{ all -> 0x0565 }
            if (r15 != 0) goto L_0x037f
            java.lang.Object r11 = r11.get(r14)     // Catch:{ all -> 0x0565 }
            android.content.pm.ResolveInfo r11 = (android.content.pm.ResolveInfo) r11     // Catch:{ all -> 0x0565 }
            android.content.pm.ServiceInfo r11 = r11.serviceInfo     // Catch:{ all -> 0x0565 }
            if (r11 == 0) goto L_0x039b
            java.lang.String r14 = r11.packageName     // Catch:{ all -> 0x0565 }
            java.lang.String r11 = r11.name     // Catch:{ all -> 0x0565 }
            if (r11 == 0) goto L_0x0371
            boolean r5 = r5.equals(r14)     // Catch:{ all -> 0x0565 }
            if (r5 == 0) goto L_0x0371
            boolean r5 = r8.mo27833a()     // Catch:{ all -> 0x0565 }
            if (r5 == 0) goto L_0x0371
            android.content.Intent r5 = new android.content.Intent     // Catch:{ all -> 0x0565 }
            r5.<init>(r0)     // Catch:{ all -> 0x0565 }
            com.google.android.gms.common.stats.ConnectionTracker r0 = com.google.android.gms.common.stats.ConnectionTracker.getInstance()     // Catch:{ RuntimeException -> 0x035c }
            com.onedelhi.secure.za6 r11 = r8.f23490a     // Catch:{ RuntimeException -> 0x035c }
            android.content.Context r11 = r11.mo15137f()     // Catch:{ RuntimeException -> 0x035c }
            r14 = 1
            boolean r0 = r0.bindService(r11, r5, r9, r14)     // Catch:{ RuntimeException -> 0x035c }
            com.onedelhi.secure.za6 r5 = r8.f23490a     // Catch:{ RuntimeException -> 0x035c }
            com.onedelhi.secure.a56 r5 = r5.mo15136e()     // Catch:{ RuntimeException -> 0x035c }
            com.onedelhi.secure.u46 r5 = r5.mo12730v()     // Catch:{ RuntimeException -> 0x035c }
            java.lang.String r9 = "Install Referrer Service is"
            if (r0 == 0) goto L_0x0356
            java.lang.String r0 = "available"
            goto L_0x0358
        L_0x0356:
            java.lang.String r0 = "not available"
        L_0x0358:
            r5.mo25380b(r9, r0)     // Catch:{ RuntimeException -> 0x035c }
            goto L_0x039b
        L_0x035c:
            r0 = move-exception
            com.onedelhi.secure.za6 r5 = r8.f23490a     // Catch:{ all -> 0x0565 }
            com.onedelhi.secure.a56 r5 = r5.mo15136e()     // Catch:{ all -> 0x0565 }
            com.onedelhi.secure.u46 r5 = r5.mo12726r()     // Catch:{ all -> 0x0565 }
            java.lang.String r8 = "Exception occurred while binding to Install Referrer Service"
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0565 }
            r5.mo25380b(r8, r0)     // Catch:{ all -> 0x0565 }
            goto L_0x039b
        L_0x0371:
            com.onedelhi.secure.za6 r0 = r8.f23490a     // Catch:{ all -> 0x0565 }
            com.onedelhi.secure.a56 r0 = r0.mo15136e()     // Catch:{ all -> 0x0565 }
            com.onedelhi.secure.u46 r0 = r0.mo12731w()     // Catch:{ all -> 0x0565 }
            java.lang.String r5 = "Play Store version 8.3.73 or higher required for Install Referrer"
            goto L_0x02cb
        L_0x037f:
            com.onedelhi.secure.za6 r0 = r8.f23490a     // Catch:{ all -> 0x0565 }
            com.onedelhi.secure.a56 r0 = r0.mo15136e()     // Catch:{ all -> 0x0565 }
            com.onedelhi.secure.u46 r0 = r0.mo12729u()     // Catch:{ all -> 0x0565 }
            java.lang.String r5 = "Play Service for fetching Install Referrer is unavailable on device"
            goto L_0x02cb
        L_0x038d:
            com.onedelhi.secure.za6 r0 = r8.f23490a     // Catch:{ all -> 0x0565 }
            com.onedelhi.secure.a56 r0 = r0.mo15136e()     // Catch:{ all -> 0x0565 }
            com.onedelhi.secure.u46 r0 = r0.mo12733y()     // Catch:{ all -> 0x0565 }
            java.lang.String r5 = "Install Referrer Reporter was called with invalid app package name"
            goto L_0x02cb
        L_0x039b:
            com.onedelhi.secure.qa6 r0 = r23.mo15135d()     // Catch:{ all -> 0x0565 }
            r0.mo15139h()     // Catch:{ all -> 0x0565 }
            r23.mo23379g()     // Catch:{ all -> 0x0565 }
            android.os.Bundle r5 = new android.os.Bundle     // Catch:{ all -> 0x0565 }
            r5.<init>()     // Catch:{ all -> 0x0565 }
            r8 = 1
            r5.putLong(r10, r8)     // Catch:{ all -> 0x0565 }
            r5.putLong(r6, r8)     // Catch:{ all -> 0x0565 }
            r8 = 0
            r5.putLong(r7, r8)     // Catch:{ all -> 0x0565 }
            r6 = r22
            r5.putLong(r6, r8)     // Catch:{ all -> 0x0565 }
            r10 = r20
            r5.putLong(r10, r8)     // Catch:{ all -> 0x0565 }
            r11 = r21
            r5.putLong(r11, r8)     // Catch:{ all -> 0x0565 }
            r8 = 1
            r5.putLong(r4, r8)     // Catch:{ all -> 0x0565 }
            boolean r0 = r2.f21567e     // Catch:{ all -> 0x0565 }
            if (r0 == 0) goto L_0x03d2
            r5.putLong(r3, r8)     // Catch:{ all -> 0x0565 }
        L_0x03d2:
            java.lang.String r0 = r2.f21557b     // Catch:{ all -> 0x0565 }
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch:{ all -> 0x0565 }
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0565 }
            com.onedelhi.secure.vg5 r0 = r1.f19418a     // Catch:{ all -> 0x0565 }
            m26059R(r0)     // Catch:{ all -> 0x0565 }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r3)     // Catch:{ all -> 0x0565 }
            r0.mo15139h()     // Catch:{ all -> 0x0565 }
            r0.mo27038i()     // Catch:{ all -> 0x0565 }
            java.lang.String r4 = "first_open_count"
            long r8 = r0.mo26059L(r3, r4)     // Catch:{ all -> 0x0565 }
            com.onedelhi.secure.za6 r0 = r1.f19420a     // Catch:{ all -> 0x0565 }
            android.content.Context r0 = r0.mo15137f()     // Catch:{ all -> 0x0565 }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ all -> 0x0565 }
            if (r0 != 0) goto L_0x0410
            com.onedelhi.secure.a56 r0 = r23.mo15136e()     // Catch:{ all -> 0x0565 }
            com.onedelhi.secure.u46 r0 = r0.mo12726r()     // Catch:{ all -> 0x0565 }
            java.lang.String r4 = "PackageManager is null, first open report might be inaccurate. appId"
            java.lang.Object r3 = com.onedelhi.secure.a56.m10802z(r3)     // Catch:{ all -> 0x0565 }
            r0.mo25380b(r4, r3)     // Catch:{ all -> 0x0565 }
        L_0x040c:
            r3 = 0
            goto L_0x04ce
        L_0x0410:
            com.onedelhi.secure.za6 r0 = r1.f19420a     // Catch:{ NameNotFoundException -> 0x0420 }
            android.content.Context r0 = r0.mo15137f()     // Catch:{ NameNotFoundException -> 0x0420 }
            com.google.android.gms.common.wrappers.PackageManagerWrapper r0 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r0)     // Catch:{ NameNotFoundException -> 0x0420 }
            r4 = 0
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r3, r4)     // Catch:{ NameNotFoundException -> 0x0420 }
            goto L_0x0433
        L_0x0420:
            r0 = move-exception
            com.onedelhi.secure.a56 r4 = r23.mo15136e()     // Catch:{ all -> 0x0565 }
            com.onedelhi.secure.u46 r4 = r4.mo12726r()     // Catch:{ all -> 0x0565 }
            java.lang.String r14 = "Package info is null, first open report might be inaccurate. appId"
            java.lang.Object r15 = com.onedelhi.secure.a56.m10802z(r3)     // Catch:{ all -> 0x0565 }
            r4.mo25381c(r14, r15, r0)     // Catch:{ all -> 0x0565 }
            r0 = 0
        L_0x0433:
            if (r0 == 0) goto L_0x0488
            long r14 = r0.firstInstallTime     // Catch:{ all -> 0x0565 }
            r16 = 0
            int r4 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r4 == 0) goto L_0x0488
            r20 = r10
            r21 = r11
            long r10 = r0.lastUpdateTime     // Catch:{ all -> 0x0565 }
            int r0 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x0469
            com.onedelhi.secure.ce5 r0 = r23.mo23368U()     // Catch:{ all -> 0x0565 }
            com.onedelhi.secure.k36 r4 = com.onedelhi.secure.n36.f17052d0     // Catch:{ all -> 0x0565 }
            r10 = 0
            boolean r0 = r0.mo14110B(r10, r4)     // Catch:{ all -> 0x0565 }
            if (r0 == 0) goto L_0x0463
            r14 = 0
            int r0 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r0 != 0) goto L_0x0461
            r14 = 1
            r5.putLong(r7, r14)     // Catch:{ all -> 0x0565 }
            r8 = 0
        L_0x0461:
            r15 = 0
            goto L_0x046b
        L_0x0463:
            r14 = 1
            r5.putLong(r7, r14)     // Catch:{ all -> 0x0565 }
            goto L_0x0461
        L_0x0469:
            r10 = 0
            r15 = 1
        L_0x046b:
            com.onedelhi.secure.wq6 r0 = new com.onedelhi.secure.wq6     // Catch:{ all -> 0x0565 }
            java.lang.String r4 = "_fi"
            r7 = 1
            if (r7 == r15) goto L_0x0475
            r14 = 0
            goto L_0x0477
        L_0x0475:
            r14 = 1
        L_0x0477:
            java.lang.Long r18 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0565 }
            java.lang.String r19 = "auto"
            r14 = r0
            r15 = r4
            r16 = r12
            r14.<init>(r15, r16, r18, r19)     // Catch:{ all -> 0x0565 }
            r1.mo23353B(r0, r2)     // Catch:{ all -> 0x0565 }
            goto L_0x048d
        L_0x0488:
            r20 = r10
            r21 = r11
            r10 = 0
        L_0x048d:
            com.onedelhi.secure.za6 r0 = r1.f19420a     // Catch:{ NameNotFoundException -> 0x049d }
            android.content.Context r0 = r0.mo15137f()     // Catch:{ NameNotFoundException -> 0x049d }
            com.google.android.gms.common.wrappers.PackageManagerWrapper r0 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r0)     // Catch:{ NameNotFoundException -> 0x049d }
            r4 = 0
            android.content.pm.ApplicationInfo r3 = r0.getApplicationInfo(r3, r4)     // Catch:{ NameNotFoundException -> 0x049d }
            goto L_0x04b0
        L_0x049d:
            r0 = move-exception
            com.onedelhi.secure.a56 r4 = r23.mo15136e()     // Catch:{ all -> 0x0565 }
            com.onedelhi.secure.u46 r4 = r4.mo12726r()     // Catch:{ all -> 0x0565 }
            java.lang.String r7 = "Application info is null, first open report might be inaccurate. appId"
            java.lang.Object r3 = com.onedelhi.secure.a56.m10802z(r3)     // Catch:{ all -> 0x0565 }
            r4.mo25381c(r7, r3, r0)     // Catch:{ all -> 0x0565 }
            r3 = r10
        L_0x04b0:
            if (r3 == 0) goto L_0x040c
            int r0 = r3.flags     // Catch:{ all -> 0x0565 }
            r4 = 1
            r0 = r0 & r4
            if (r0 == 0) goto L_0x04bf
            r4 = r20
            r10 = 1
            r5.putLong(r4, r10)     // Catch:{ all -> 0x0565 }
        L_0x04bf:
            int r0 = r3.flags     // Catch:{ all -> 0x0565 }
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x040c
            r3 = r21
            r10 = 1
            r5.putLong(r3, r10)     // Catch:{ all -> 0x0565 }
            goto L_0x040c
        L_0x04ce:
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x04d5
            r5.putLong(r6, r8)     // Catch:{ all -> 0x0565 }
        L_0x04d5:
            com.onedelhi.secure.xj5 r0 = new com.onedelhi.secure.xj5     // Catch:{ all -> 0x0565 }
            java.lang.String r15 = "_f"
            com.onedelhi.secure.hj5 r3 = new com.onedelhi.secure.hj5     // Catch:{ all -> 0x0565 }
            r3.<init>(r5)     // Catch:{ all -> 0x0565 }
            java.lang.String r17 = "auto"
            r14 = r0
            r16 = r3
            r18 = r12
            r14.<init>(r15, r16, r17, r18)     // Catch:{ all -> 0x0565 }
            r1.mo23388l(r0, r2)     // Catch:{ all -> 0x0565 }
            goto L_0x0554
        L_0x04ec:
            com.onedelhi.secure.wq6 r0 = new com.onedelhi.secure.wq6     // Catch:{ all -> 0x0565 }
            java.lang.String r15 = "_fvt"
            java.lang.Long r18 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0565 }
            java.lang.String r19 = "auto"
            r14 = r0
            r16 = r12
            r14.<init>(r15, r16, r18, r19)     // Catch:{ all -> 0x0565 }
            r1.mo23353B(r0, r2)     // Catch:{ all -> 0x0565 }
            com.onedelhi.secure.qa6 r0 = r23.mo15135d()     // Catch:{ all -> 0x0565 }
            r0.mo15139h()     // Catch:{ all -> 0x0565 }
            r23.mo23379g()     // Catch:{ all -> 0x0565 }
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x0565 }
            r0.<init>()     // Catch:{ all -> 0x0565 }
            r7 = 1
            r0.putLong(r10, r7)     // Catch:{ all -> 0x0565 }
            r0.putLong(r6, r7)     // Catch:{ all -> 0x0565 }
            r0.putLong(r4, r7)     // Catch:{ all -> 0x0565 }
            boolean r4 = r2.f21567e     // Catch:{ all -> 0x0565 }
            if (r4 == 0) goto L_0x0520
            r0.putLong(r3, r7)     // Catch:{ all -> 0x0565 }
        L_0x0520:
            com.onedelhi.secure.xj5 r3 = new com.onedelhi.secure.xj5     // Catch:{ all -> 0x0565 }
            java.lang.String r15 = "_v"
            com.onedelhi.secure.hj5 r4 = new com.onedelhi.secure.hj5     // Catch:{ all -> 0x0565 }
            r4.<init>(r0)     // Catch:{ all -> 0x0565 }
            java.lang.String r17 = "auto"
            r14 = r3
            r16 = r4
            r18 = r12
            r14.<init>(r15, r16, r17, r18)     // Catch:{ all -> 0x0565 }
        L_0x0533:
            r1.mo23388l(r3, r2)     // Catch:{ all -> 0x0565 }
            goto L_0x0554
        L_0x0537:
            boolean r0 = r2.f21561c     // Catch:{ all -> 0x0565 }
            if (r0 == 0) goto L_0x0554
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x0565 }
            r0.<init>()     // Catch:{ all -> 0x0565 }
            com.onedelhi.secure.xj5 r3 = new com.onedelhi.secure.xj5     // Catch:{ all -> 0x0565 }
            java.lang.String r15 = "_cd"
            com.onedelhi.secure.hj5 r4 = new com.onedelhi.secure.hj5     // Catch:{ all -> 0x0565 }
            r4.<init>(r0)     // Catch:{ all -> 0x0565 }
            java.lang.String r17 = "auto"
            r14 = r3
            r16 = r4
            r18 = r12
            r14.<init>(r15, r16, r17, r18)     // Catch:{ all -> 0x0565 }
            goto L_0x0533
        L_0x0554:
            com.onedelhi.secure.vg5 r0 = r1.f19418a     // Catch:{ all -> 0x0565 }
            m26059R(r0)     // Catch:{ all -> 0x0565 }
            r0.mo26083o()     // Catch:{ all -> 0x0565 }
            com.onedelhi.secure.vg5 r0 = r1.f19418a
            m26059R(r0)
            r0.mo26078f0()
            return
        L_0x0565:
            r0 = move-exception
            com.onedelhi.secure.vg5 r2 = r1.f19418a
            m26059R(r2)
            r2.mo26078f0()
            throw r0
        L_0x056f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.qq6.mo23394q(com.onedelhi.secure.uy6):void");
    }

    /* renamed from: r */
    public final void mo23395r() {
        this.f19405a++;
    }

    @ly4
    /* renamed from: s */
    public final void mo23396s(fc5 fc5) {
        uy6 I = mo23358I((String) Preconditions.checkNotNull(fc5.f12020b));
        if (I != null) {
            mo23397t(fc5, I);
        }
    }

    @ly4
    /* renamed from: t */
    public final void mo23397t(fc5 fc5, uy6 uy6) {
        Preconditions.checkNotNull(fc5);
        Preconditions.checkNotEmpty(fc5.f12020b);
        Preconditions.checkNotNull(fc5.f12016a);
        Preconditions.checkNotEmpty(fc5.f12016a.f22256b);
        mo15135d().mo15139h();
        mo23379g();
        if (m26058Q(uy6)) {
            if (uy6.f21558b) {
                vg5 vg5 = this.f19418a;
                m26059R(vg5);
                vg5.mo26077e0();
                try {
                    mo23366S(uy6);
                    String str = (String) Preconditions.checkNotNull(fc5.f12020b);
                    vg5 vg52 = this.f19418a;
                    m26059R(vg52);
                    fc5 S = vg52.mo26066S(str, fc5.f12016a.f22256b);
                    if (S != null) {
                        mo15136e().mo12725q().mo25381c("Removing conditional user property", fc5.f12020b, this.f19420a.mo27862D().mo19282f(fc5.f12016a.f22256b));
                        vg5 vg53 = this.f19418a;
                        m26059R(vg53);
                        vg53.mo26057J(str, fc5.f12016a.f22256b);
                        if (S.f12021b) {
                            vg5 vg54 = this.f19418a;
                            m26059R(vg54);
                            vg54.mo26081m(str, fc5.f12016a.f22256b);
                        }
                        xj5 xj5 = fc5.f12023c;
                        if (xj5 != null) {
                            hj5 hj5 = xj5.f22602a;
                            mo23355D((xj5) Preconditions.checkNotNull(mo23382h0().mo16899y0(str, ((xj5) Preconditions.checkNotNull(fc5.f12023c)).f22604b, hj5 != null ? hj5.mo17314L2() : null, S.f12024c, fc5.f12023c.f22603b, true, true)), uy6);
                        }
                    } else {
                        mo15136e().mo12731w().mo25381c("Conditional user property doesn't exist", a56.m10802z(fc5.f12020b), this.f19420a.mo27862D().mo19282f(fc5.f12016a.f22256b));
                    }
                    vg5 vg55 = this.f19418a;
                    m26059R(vg55);
                    vg55.mo26083o();
                } finally {
                    vg5 vg56 = this.f19418a;
                    m26059R(vg56);
                    vg56.mo26078f0();
                }
            } else {
                mo23366S(uy6);
            }
        }
    }

    @ly4
    /* renamed from: u */
    public final void mo23398u(String str, uy6 uy6) {
        mo15135d().mo15139h();
        mo23379g();
        if (m26058Q(uy6)) {
            if (!uy6.f21558b) {
                mo23366S(uy6);
            } else if (!"_npa".equals(str) || uy6.f21554a == null) {
                mo15136e().mo12725q().mo25380b("Removing user property", this.f19420a.mo27862D().mo19282f(str));
                vg5 vg5 = this.f19418a;
                m26059R(vg5);
                vg5.mo26077e0();
                try {
                    mo23366S(uy6);
                    if ("_id".equals(str)) {
                        vg5 vg52 = this.f19418a;
                        m26059R(vg52);
                        vg52.mo26081m((String) Preconditions.checkNotNull(uy6.f21557b), "_lair");
                    }
                    vg5 vg53 = this.f19418a;
                    m26059R(vg53);
                    vg53.mo26081m((String) Preconditions.checkNotNull(uy6.f21557b), str);
                    vg5 vg54 = this.f19418a;
                    m26059R(vg54);
                    vg54.mo26083o();
                    mo15136e().mo12725q().mo25380b("User property removed", this.f19420a.mo27862D().mo19282f(str));
                } finally {
                    vg5 vg55 = this.f19418a;
                    m26059R(vg55);
                    vg55.mo26078f0();
                }
            } else {
                mo15136e().mo12725q().mo25379a("Falling back to manifest metadata value for ad personalization");
                mo23353B(new wq6("_npa", mo15133a().currentTimeMillis(), Long.valueOf(true != uy6.f21554a.booleanValue() ? 0 : 1), bf0.f26274c), uy6);
            }
        }
    }

    @VisibleForTesting
    @ly4
    /* renamed from: v */
    public final void mo23399v(uy6 uy6) {
        if (this.f19429b != null) {
            ArrayList arrayList = new ArrayList();
            this.f19432c = arrayList;
            arrayList.addAll(this.f19429b);
        }
        vg5 vg5 = this.f19418a;
        m26059R(vg5);
        String str = (String) Preconditions.checkNotNull(uy6.f21557b);
        Preconditions.checkNotEmpty(str);
        vg5.mo15139h();
        vg5.mo27038i();
        try {
            SQLiteDatabase P = vg5.mo26063P();
            String[] strArr = {str};
            int delete = P.delete("apps", "app_id=?", strArr) + P.delete("events", "app_id=?", strArr) + P.delete("user_attributes", "app_id=?", strArr) + P.delete("conditional_properties", "app_id=?", strArr) + P.delete("raw_events", "app_id=?", strArr) + P.delete("raw_events_metadata", "app_id=?", strArr) + P.delete("queue", "app_id=?", strArr) + P.delete("audience_filter_values", "app_id=?", strArr) + P.delete("main_event_params", "app_id=?", strArr) + P.delete("default_event_params", "app_id=?", strArr);
            if (delete > 0) {
                vg5.f11205a.mo15136e().mo12730v().mo25381c("Reset analytics data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            vg5.f11205a.mo15136e().mo12726r().mo25381c("Error resetting analytics data. appId, error", a56.m10802z(str), e);
        }
        if (uy6.f21558b) {
            mo23394q(uy6);
        }
    }

    @ly4
    /* renamed from: w */
    public final void mo23400w(String str, fj6 fj6) {
        mo15135d().mo15139h();
        String str2 = this.f19421a;
        if (str2 == null || str2.equals(str) || fj6 != null) {
            this.f19421a = str;
            this.f19412a = fj6;
        }
    }

    @ly4
    /* renamed from: x */
    public final void mo23401x() {
        mo15135d().mo15139h();
        vg5 vg5 = this.f19418a;
        m26059R(vg5);
        vg5.mo26080h0();
        if (this.f19414a.f20435c.mo15075a() == 0) {
            this.f19414a.f20435c.mo15076b(mo15133a().currentTimeMillis());
        }
        mo23362M();
    }

    @ly4
    /* renamed from: y */
    public final void mo23402y(fc5 fc5) {
        uy6 I = mo23358I((String) Preconditions.checkNotNull(fc5.f12020b));
        if (I != null) {
            mo23403z(fc5, I);
        }
    }

    @ly4
    /* renamed from: z */
    public final void mo23403z(fc5 fc5, uy6 uy6) {
        u46 r;
        String str;
        Object z;
        String f;
        Object K2;
        u46 r2;
        String str2;
        Object z2;
        String f2;
        Object obj;
        Preconditions.checkNotNull(fc5);
        Preconditions.checkNotEmpty(fc5.f12020b);
        Preconditions.checkNotNull(fc5.f12024c);
        Preconditions.checkNotNull(fc5.f12016a);
        Preconditions.checkNotEmpty(fc5.f12016a.f22256b);
        mo15135d().mo15139h();
        mo23379g();
        if (m26058Q(uy6)) {
            if (!uy6.f21558b) {
                mo23366S(uy6);
                return;
            }
            fc5 fc52 = new fc5(fc5);
            boolean z3 = false;
            fc52.f12021b = false;
            vg5 vg5 = this.f19418a;
            m26059R(vg5);
            vg5.mo26077e0();
            try {
                vg5 vg52 = this.f19418a;
                m26059R(vg52);
                fc5 S = vg52.mo26066S((String) Preconditions.checkNotNull(fc52.f12020b), fc52.f12016a.f22256b);
                if (S != null && !S.f12024c.equals(fc52.f12024c)) {
                    mo15136e().mo12731w().mo25382d("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.f19420a.mo27862D().mo19282f(fc52.f12016a.f22256b), fc52.f12024c, S.f12024c);
                }
                if (S != null && S.f12021b) {
                    fc52.f12024c = S.f12024c;
                    fc52.f12018b = S.f12018b;
                    fc52.f12022c = S.f12022c;
                    fc52.f12026d = S.f12026d;
                    fc52.f12019b = S.f12019b;
                    fc52.f12021b = true;
                    wq6 wq6 = fc52.f12016a;
                    fc52.f12016a = new wq6(wq6.f22256b, S.f12016a.f22255b, wq6.mo26660K2(), S.f12016a.f22258d);
                } else if (TextUtils.isEmpty(fc52.f12026d)) {
                    wq6 wq62 = fc52.f12016a;
                    fc52.f12016a = new wq6(wq62.f22256b, fc52.f12018b, wq62.mo26660K2(), fc52.f12016a.f22258d);
                    fc52.f12021b = true;
                    z3 = true;
                }
                if (fc52.f12021b) {
                    wq6 wq63 = fc52.f12016a;
                    ar6 ar6 = new ar6((String) Preconditions.checkNotNull(fc52.f12020b), fc52.f12024c, wq63.f22256b, wq63.f22255b, Preconditions.checkNotNull(wq63.mo26660K2()));
                    vg5 vg53 = this.f19418a;
                    m26059R(vg53);
                    if (vg53.mo26092x(ar6)) {
                        r2 = mo15136e().mo12725q();
                        str2 = "User property updated immediately";
                        z2 = fc52.f12020b;
                        f2 = this.f19420a.mo27862D().mo19282f(ar6.f9510c);
                        obj = ar6.f9507a;
                    } else {
                        r2 = mo15136e().mo12726r();
                        str2 = "(2)Too many active user properties, ignoring";
                        z2 = a56.m10802z(fc52.f12020b);
                        f2 = this.f19420a.mo27862D().mo19282f(ar6.f9510c);
                        obj = ar6.f9507a;
                    }
                    r2.mo25382d(str2, z2, f2, obj);
                    if (z3 && fc52.f12019b != null) {
                        mo23355D(new xj5(fc52.f12019b, fc52.f12018b), uy6);
                    }
                }
                vg5 vg54 = this.f19418a;
                m26059R(vg54);
                if (vg54.mo26091w(fc52)) {
                    r = mo15136e().mo12725q();
                    str = "Conditional property added";
                    z = fc52.f12020b;
                    f = this.f19420a.mo27862D().mo19282f(fc52.f12016a.f22256b);
                    K2 = fc52.f12016a.mo26660K2();
                } else {
                    r = mo15136e().mo12726r();
                    str = "Too many conditional properties, ignoring";
                    z = a56.m10802z(fc52.f12020b);
                    f = this.f19420a.mo27862D().mo19282f(fc52.f12016a.f22256b);
                    K2 = fc52.f12016a.mo26660K2();
                }
                r.mo25382d(str, z, f, K2);
                vg5 vg55 = this.f19418a;
                m26059R(vg55);
                vg55.mo26083o();
            } finally {
                vg5 vg56 = this.f19418a;
                m26059R(vg56);
                vg56.mo26078f0();
            }
        }
    }
}
