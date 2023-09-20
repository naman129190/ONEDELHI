package com.onedelhi.secure;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.onedelhi.secure.C2758li;
import com.onedelhi.secure.a92;
import com.onedelhi.secure.hl3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

public class fp4 {

    /* renamed from: a */
    public static final String f12253a = "Uploader";

    /* renamed from: b */
    public static final String f12254b = "GDT_CLIENT_METRICS";

    /* renamed from: a */
    public final Context f12255a;

    /* renamed from: a */
    public final aw0 f12256a;

    /* renamed from: a */
    public final C2106ez f12257a;

    /* renamed from: a */
    public final C2448ii f12258a;

    /* renamed from: a */
    public final ky4 f12259a;

    /* renamed from: a */
    public final q84 f12260a;

    /* renamed from: a */
    public final C4029yy f12261a;

    /* renamed from: a */
    public final Executor f12262a;

    /* renamed from: b */
    public final C2106ez f12263b;

    @qq1
    public fp4(Context context, C2448ii iiVar, aw0 aw0, ky4 ky4, Executor executor, q84 q84, @rw4 C2106ez ezVar, @uk2 C2106ez ezVar2, C4029yy yyVar) {
        this.f12255a = context;
        this.f12258a = iiVar;
        this.f12256a = aw0;
        this.f12259a = ky4;
        this.f12262a = executor;
        this.f12260a = q84;
        this.f12257a = ezVar;
        this.f12263b = ezVar2;
        this.f12261a = yyVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ Boolean m15174l(xh4 xh4) {
        return Boolean.valueOf(this.f12256a.mo13295Q(xh4));
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ Iterable m15175m(xh4 xh4) {
        return this.f12256a.mo13293H0(xh4);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ Object m15176n(Iterable iterable, xh4 xh4, long j) {
        this.f12256a.mo13298x0(iterable);
        this.f12256a.mo13299y(xh4, this.f12257a.mo15656a() + j);
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ Object m15177o(Iterable iterable) {
        this.f12256a.mo13297t2(iterable);
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ Object m15178p() {
        this.f12261a.mo16820c();
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ Object m15179q(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.f12261a.mo16817a((long) ((Integer) entry.getValue()).intValue(), a92.C1672b.INVALID_PAYLOD, (String) entry.getKey());
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ Object m15180r(xh4 xh4, long j) {
        this.f12256a.mo13299y(xh4, this.f12257a.mo15656a() + j);
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ Object m15181s(xh4 xh4, int i) {
        this.f12259a.mo18889a(xh4, i + 1);
        return null;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0031, code lost:
        r6.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0034, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0024, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        r3.f12259a.mo18889a(r4, r5 + 1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0026 */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void m15182t(com.onedelhi.secure.xh4 r4, int r5, java.lang.Runnable r6) {
        /*
            r3 = this;
            com.onedelhi.secure.q84 r0 = r3.f12260a     // Catch:{ p84 -> 0x0026 }
            com.onedelhi.secure.aw0 r1 = r3.f12256a     // Catch:{ p84 -> 0x0026 }
            java.util.Objects.requireNonNull(r1)     // Catch:{ p84 -> 0x0026 }
            com.onedelhi.secure.wo4 r2 = new com.onedelhi.secure.wo4     // Catch:{ p84 -> 0x0026 }
            r2.<init>(r1)     // Catch:{ p84 -> 0x0026 }
            r0.mo16818b(r2)     // Catch:{ p84 -> 0x0026 }
            boolean r0 = r3.mo16134k()     // Catch:{ p84 -> 0x0026 }
            if (r0 != 0) goto L_0x0020
            com.onedelhi.secure.q84 r0 = r3.f12260a     // Catch:{ p84 -> 0x0026 }
            com.onedelhi.secure.ap4 r1 = new com.onedelhi.secure.ap4     // Catch:{ p84 -> 0x0026 }
            r1.<init>(r3, r4, r5)     // Catch:{ p84 -> 0x0026 }
            r0.mo16818b(r1)     // Catch:{ p84 -> 0x0026 }
            goto L_0x002d
        L_0x0020:
            r3.mo16135u(r4, r5)     // Catch:{ p84 -> 0x0026 }
            goto L_0x002d
        L_0x0024:
            r4 = move-exception
            goto L_0x0031
        L_0x0026:
            com.onedelhi.secure.ky4 r0 = r3.f12259a     // Catch:{ all -> 0x0024 }
            int r5 = r5 + 1
            r0.mo18889a(r4, r5)     // Catch:{ all -> 0x0024 }
        L_0x002d:
            r6.run()
            return
        L_0x0031:
            r6.run()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.fp4.m15182t(com.onedelhi.secure.xh4, int, java.lang.Runnable):void");
    }

    @hw4
    /* renamed from: j */
    public uv0 mo16133j(wh4 wh4) {
        q84 q84 = this.f12260a;
        C4029yy yyVar = this.f12261a;
        Objects.requireNonNull(yyVar);
        return wh4.mo20677b(uv0.m29608a().mo25594i(this.f12257a.mo15656a()).mo25596k(this.f12263b.mo15656a()).mo25595j(f12254b).mo25593h(new xt0(hu0.m16939b("proto"), ((C1738az) q84.mo16818b(new uo4(yyVar))).mo13338i())).mo25589d());
    }

    /* renamed from: k */
    public boolean mo16134k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f12255a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @hl3({hl3.C2354a.f13187b})
    /* renamed from: u */
    public C2758li mo16135u(xh4 xh4, int i) {
        C2758li a;
        wh4 a2 = this.f12258a.mo17813a(xh4.mo23177b());
        long j = 0;
        C2758li e = C2758li.m20710e(0);
        while (true) {
            long j2 = j;
            while (((Boolean) this.f12260a.mo16818b(new yo4(this, xh4))).booleanValue()) {
                Iterable<p13> iterable = (Iterable) this.f12260a.mo16818b(new zo4(this, xh4));
                if (!iterable.iterator().hasNext()) {
                    return e;
                }
                if (a2 == null) {
                    r92.m26529c(f12253a, "Unknown backend for %s, deleting event batch for it...", xh4);
                    a = C2758li.m20708a();
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (p13 b : iterable) {
                        arrayList.add(b.mo15177b());
                    }
                    if (xh4.mo26923e()) {
                        arrayList.add(mo16133j(a2));
                    }
                    a = a2.mo20676a(C2631ki.m19805a().mo19073b(arrayList).mo19074c(xh4.mo23178c()).mo19072a());
                }
                e = a;
                if (e.mo19617c() == C2758li.C2759a.TRANSIENT_ERROR) {
                    this.f12260a.mo16818b(new dp4(this, iterable, xh4, j2));
                    this.f12259a.mo18890b(xh4, i + 1, true);
                    return e;
                }
                this.f12260a.mo16818b(new cp4(this, iterable));
                if (e.mo19617c() == C2758li.C2759a.OK) {
                    j = Math.max(j2, e.mo19616b());
                    if (xh4.mo26923e()) {
                        this.f12260a.mo16818b(new xo4(this));
                    }
                } else if (e.mo19617c() == C2758li.C2759a.INVALID_PAYLOAD) {
                    HashMap hashMap = new HashMap();
                    for (p13 b2 : iterable) {
                        String l = b2.mo15177b().mo25586l();
                        hashMap.put(l, !hashMap.containsKey(l) ? 1 : Integer.valueOf(((Integer) hashMap.get(l)).intValue() + 1));
                    }
                    this.f12260a.mo16818b(new ep4(this, hashMap));
                }
            }
            this.f12260a.mo16818b(new bp4(this, xh4, j2));
            return e;
        }
    }

    /* renamed from: v */
    public void mo16136v(xh4 xh4, int i, Runnable runnable) {
        this.f12262a.execute(new vo4(this, xh4, i, runnable));
    }
}
