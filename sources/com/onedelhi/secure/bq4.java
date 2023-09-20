package com.onedelhi.secure;

import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

public class bq4 {
    @hw4

    /* renamed from: a */
    public static final int f26501a = 64;
    @hw4

    /* renamed from: b */
    public static final int f26502b = 1024;

    /* renamed from: b */
    public static final String f26503b = "user-data";
    @hw4

    /* renamed from: c */
    public static final int f26504c = 8192;

    /* renamed from: c */
    public static final String f26505c = "keys";

    /* renamed from: d */
    public static final String f26506d = "internal-keys";

    /* renamed from: a */
    public final C4692a f26507a = new C4692a(false);

    /* renamed from: a */
    public final ca0 f26508a;

    /* renamed from: a */
    public final hi2 f26509a;

    /* renamed from: a */
    public final String f26510a;

    /* renamed from: a */
    public final AtomicMarkableReference<String> f26511a = new AtomicMarkableReference<>((Object) null, false);

    /* renamed from: b */
    public final C4692a f26512b = new C4692a(true);

    /* renamed from: com.onedelhi.secure.bq4$a */
    public class C4692a {

        /* renamed from: a */
        public final AtomicMarkableReference<iz1> f26514a;

        /* renamed from: a */
        public final AtomicReference<Callable<Void>> f26515a = new AtomicReference<>((Object) null);

        /* renamed from: a */
        public final boolean f26516a;

        public C4692a(boolean z) {
            this.f26516a = z;
            this.f26514a = new AtomicMarkableReference<>(new iz1(64, z ? 8192 : 1024), false);
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ Void m40310c() throws Exception {
            this.f26515a.set((Object) null);
            mo32011e();
            return null;
        }

        /* renamed from: b */
        public Map<String, String> mo32009b() {
            return this.f26514a.getReference().mo38298a();
        }

        /* renamed from: d */
        public final void mo32010d() {
            aq4 aq4 = new aq4(this);
            if (this.f26515a.compareAndSet((Object) null, aq4)) {
                bq4.this.f26508a.mo32274h(aq4);
            }
        }

        /* renamed from: e */
        public final void mo32011e() {
            Map<String, String> map;
            synchronized (this) {
                if (this.f26514a.isMarked()) {
                    map = this.f26514a.getReference().mo38298a();
                    AtomicMarkableReference<iz1> atomicMarkableReference = this.f26514a;
                    atomicMarkableReference.set(atomicMarkableReference.getReference(), false);
                } else {
                    map = null;
                }
            }
            if (map != null) {
                bq4.this.f26509a.mo37338n(bq4.this.f26510a, map, this.f26516a);
            }
        }

        /* renamed from: f */
        public boolean mo32012f(String str, String str2) {
            synchronized (this) {
                if (!this.f26514a.getReference().mo38300d(str, str2)) {
                    return false;
                }
                AtomicMarkableReference<iz1> atomicMarkableReference = this.f26514a;
                atomicMarkableReference.set(atomicMarkableReference.getReference(), true);
                mo32010d();
                return true;
            }
        }

        /* renamed from: g */
        public void mo32013g(Map<String, String> map) {
            synchronized (this) {
                this.f26514a.getReference().mo38301e(map);
                AtomicMarkableReference<iz1> atomicMarkableReference = this.f26514a;
                atomicMarkableReference.set(atomicMarkableReference.getReference(), true);
            }
            mo32010d();
        }
    }

    public bq4(String str, t21 t21, ca0 ca0) {
        this.f26510a = str;
        this.f26509a = new hi2(t21);
        this.f26508a = ca0;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ Object m40298h() throws Exception {
        mo32004k();
        return null;
    }

    /* renamed from: i */
    public static bq4 m40299i(String str, t21 t21, ca0 ca0) {
        hi2 hi2 = new hi2(t21);
        bq4 bq4 = new bq4(str, t21, ca0);
        bq4.f26507a.f26514a.getReference().mo38301e(hi2.mo37335h(str, false));
        bq4.f26512b.f26514a.getReference().mo38301e(hi2.mo37335h(str, true));
        bq4.f26511a.set(hi2.mo37336i(str), false);
        return bq4;
    }

    @ts2
    /* renamed from: j */
    public static String m40300j(String str, t21 t21) {
        return new hi2(t21).mo37336i(str);
    }

    /* renamed from: e */
    public Map<String, String> mo32001e() {
        return this.f26507a.mo32009b();
    }

    /* renamed from: f */
    public Map<String, String> mo32002f() {
        return this.f26512b.mo32009b();
    }

    @ts2
    /* renamed from: g */
    public String mo32003g() {
        return this.f26511a.getReference();
    }

    /* renamed from: k */
    public final void mo32004k() {
        boolean z;
        String str;
        synchronized (this.f26511a) {
            z = false;
            if (this.f26511a.isMarked()) {
                str = mo32003g();
                this.f26511a.set(str, false);
                z = true;
            } else {
                str = null;
            }
        }
        if (z) {
            this.f26509a.mo37339o(this.f26510a, str);
        }
    }

    /* renamed from: l */
    public boolean mo32005l(String str, String str2) {
        return this.f26507a.mo32012f(str, str2);
    }

    /* renamed from: m */
    public void mo32006m(Map<String, String> map) {
        this.f26507a.mo32013g(map);
    }

    /* renamed from: n */
    public boolean mo32007n(String str, String str2) {
        return this.f26512b.mo32012f(str, str2);
    }

    /* renamed from: o */
    public void mo32008o(String str) {
        String c = iz1.m52766c(str, 1024);
        synchronized (this.f26511a) {
            if (!u10.m66350E(c, this.f26511a.getReference())) {
                this.f26511a.set(c, true);
                this.f26508a.mo32274h(new zp4(this));
            }
        }
    }
}
