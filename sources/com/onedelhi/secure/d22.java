package com.onedelhi.secure;

import java.io.IOException;
import java.util.Objects;

public class d22 {

    /* renamed from: b */
    public static final zy0 f27183b = zy0.m74393d();

    /* renamed from: a */
    public C5173er f27184a;

    /* renamed from: a */
    public volatile yh2 f27185a;

    /* renamed from: a */
    public zy0 f27186a;

    /* renamed from: b */
    public volatile C5173er f27187b;

    public d22() {
    }

    public d22(zy0 zy0, C5173er erVar) {
        m44603a(zy0, erVar);
        this.f27186a = zy0;
        this.f27184a = erVar;
    }

    /* renamed from: a */
    public static void m44603a(zy0 zy0, C5173er erVar) {
        Objects.requireNonNull(zy0, "found null ExtensionRegistry");
        Objects.requireNonNull(erVar, "found null ByteString");
    }

    /* renamed from: e */
    public static d22 m44604e(yh2 yh2) {
        d22 d22 = new d22();
        d22.mo34158m(yh2);
        return d22;
    }

    /* renamed from: j */
    public static yh2 m44605j(yh2 yh2, C5173er erVar, zy0 zy0) {
        try {
            return yh2.mo43349Ud().mo47812Je(erVar, zy0).mo43381ab();
        } catch (nt1 unused) {
            return yh2;
        }
    }

    /* renamed from: b */
    public void mo34150b() {
        this.f27184a = null;
        this.f27185a = null;
        this.f27187b = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r2.f27184a;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo32213c() {
        /*
            r2 = this;
            com.onedelhi.secure.er r0 = r2.f27187b
            com.onedelhi.secure.er r1 = com.onedelhi.secure.C5173er.f28039a
            if (r0 == r1) goto L_0x0013
            com.onedelhi.secure.yh2 r0 = r2.f27185a
            if (r0 != 0) goto L_0x0011
            com.onedelhi.secure.er r0 = r2.f27184a
            if (r0 == 0) goto L_0x0013
            if (r0 != r1) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            r0 = 0
            goto L_0x0014
        L_0x0013:
            r0 = 1
        L_0x0014:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.d22.mo32213c():boolean");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:15|16) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3.f27185a = r4;
        r3.f27187b = com.onedelhi.secure.C5173er.f28039a;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x002a */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo34151d(com.onedelhi.secure.yh2 r4) {
        /*
            r3 = this;
            com.onedelhi.secure.yh2 r0 = r3.f27185a
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r3)
            com.onedelhi.secure.yh2 r0 = r3.f27185a     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r3)     // Catch:{ all -> 0x0032 }
            return
        L_0x000c:
            com.onedelhi.secure.er r0 = r3.f27184a     // Catch:{ nt1 -> 0x002a }
            if (r0 == 0) goto L_0x0025
            com.onedelhi.secure.cz2 r0 = r4.mo43348Tc()     // Catch:{ nt1 -> 0x002a }
            com.onedelhi.secure.er r1 = r3.f27184a     // Catch:{ nt1 -> 0x002a }
            com.onedelhi.secure.zy0 r2 = r3.f27186a     // Catch:{ nt1 -> 0x002a }
            java.lang.Object r0 = r0.mo34002b(r1, r2)     // Catch:{ nt1 -> 0x002a }
            com.onedelhi.secure.yh2 r0 = (com.onedelhi.secure.yh2) r0     // Catch:{ nt1 -> 0x002a }
            r3.f27185a = r0     // Catch:{ nt1 -> 0x002a }
            com.onedelhi.secure.er r0 = r3.f27184a     // Catch:{ nt1 -> 0x002a }
        L_0x0022:
            r3.f27187b = r0     // Catch:{ nt1 -> 0x002a }
            goto L_0x0030
        L_0x0025:
            r3.f27185a = r4     // Catch:{ nt1 -> 0x002a }
            com.onedelhi.secure.er r0 = com.onedelhi.secure.C5173er.f28039a     // Catch:{ nt1 -> 0x002a }
            goto L_0x0022
        L_0x002a:
            r3.f27185a = r4     // Catch:{ all -> 0x0032 }
            com.onedelhi.secure.er r4 = com.onedelhi.secure.C5173er.f28039a     // Catch:{ all -> 0x0032 }
            r3.f27187b = r4     // Catch:{ all -> 0x0032 }
        L_0x0030:
            monitor-exit(r3)     // Catch:{ all -> 0x0032 }
            return
        L_0x0032:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0032 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.d22.mo34151d(com.onedelhi.secure.yh2):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d22)) {
            return false;
        }
        d22 d22 = (d22) obj;
        yh2 yh2 = this.f27185a;
        yh2 yh22 = d22.f27185a;
        return (yh2 == null && yh22 == null) ? mo34159n().equals(d22.mo34159n()) : (yh2 == null || yh22 == null) ? yh2 != null ? yh2.equals(d22.mo34153g(yh2.mo43344Dd())) : mo34153g(yh22.mo43344Dd()).equals(yh22) : yh2.equals(yh22);
    }

    /* renamed from: f */
    public int mo34152f() {
        if (this.f27187b != null) {
            return this.f27187b.size();
        }
        C5173er erVar = this.f27184a;
        if (erVar != null) {
            return erVar.size();
        }
        if (this.f27185a != null) {
            return this.f27185a.mo43354ed();
        }
        return 0;
    }

    /* renamed from: g */
    public yh2 mo34153g(yh2 yh2) {
        mo34151d(yh2);
        return this.f27185a;
    }

    /* renamed from: h */
    public void mo34154h(d22 d22) {
        C5173er erVar;
        if (!d22.mo32213c()) {
            if (mo32213c()) {
                mo34156k(d22);
                return;
            }
            if (this.f27186a == null) {
                this.f27186a = d22.f27186a;
            }
            C5173er erVar2 = this.f27184a;
            if (erVar2 != null && (erVar = d22.f27184a) != null) {
                this.f27184a = erVar2.mo35544l(erVar);
            } else if (this.f27185a == null && d22.f27185a != null) {
                mo34158m(m44605j(d22.f27185a, this.f27184a, this.f27186a));
            } else if (this.f27185a == null || d22.f27185a != null) {
                mo34158m(this.f27185a.mo43349Ud().mo47818ia(d22.f27185a).mo43381ab());
            } else {
                mo34158m(m44605j(this.f27185a, d22.f27184a, d22.f27186a));
            }
        }
    }

    public int hashCode() {
        return 1;
    }

    /* renamed from: i */
    public void mo34155i(g00 g00, zy0 zy0) throws IOException {
        C5173er l;
        if (mo32213c()) {
            l = g00.mo36459x();
        } else {
            if (this.f27186a == null) {
                this.f27186a = zy0;
            }
            C5173er erVar = this.f27184a;
            if (erVar != null) {
                l = erVar.mo35544l(g00.mo36459x());
                zy0 = this.f27186a;
            } else {
                try {
                    mo34158m(this.f27185a.mo43349Ud().mo43380Z7(g00, zy0).mo43381ab());
                    return;
                } catch (nt1 unused) {
                    return;
                }
            }
        }
        mo34157l(l, zy0);
    }

    /* renamed from: k */
    public void mo34156k(d22 d22) {
        this.f27184a = d22.f27184a;
        this.f27185a = d22.f27185a;
        this.f27187b = d22.f27187b;
        zy0 zy0 = d22.f27186a;
        if (zy0 != null) {
            this.f27186a = zy0;
        }
    }

    /* renamed from: l */
    public void mo34157l(C5173er erVar, zy0 zy0) {
        m44603a(zy0, erVar);
        this.f27184a = erVar;
        this.f27186a = zy0;
        this.f27185a = null;
        this.f27187b = null;
    }

    /* renamed from: m */
    public yh2 mo34158m(yh2 yh2) {
        yh2 yh22 = this.f27185a;
        this.f27184a = null;
        this.f27187b = null;
        this.f27185a = yh2;
        return yh22;
    }

    /* renamed from: n */
    public C5173er mo34159n() {
        if (this.f27187b != null) {
            return this.f27187b;
        }
        C5173er erVar = this.f27184a;
        if (erVar != null) {
            return erVar;
        }
        synchronized (this) {
            if (this.f27187b != null) {
                C5173er erVar2 = this.f27187b;
                return erVar2;
            }
            this.f27187b = this.f27185a == null ? C5173er.f28039a : this.f27185a.mo47809c8();
            C5173er erVar3 = this.f27187b;
            return erVar3;
        }
    }

    /* renamed from: o */
    public void mo34160o(ty4 ty4, int i) throws IOException {
        C5173er erVar;
        if (this.f27187b != null) {
            erVar = this.f27187b;
        } else {
            erVar = this.f27184a;
            if (erVar == null) {
                if (this.f27185a != null) {
                    ty4.mo38361v(i, this.f27185a);
                    return;
                }
                erVar = C5173er.f28039a;
            }
        }
        ty4.mo38345f(i, erVar);
    }
}
