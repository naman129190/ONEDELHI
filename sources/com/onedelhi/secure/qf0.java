package com.onedelhi.secure;

import android.os.Build;
import android.util.Log;
import com.bumptech.glide.C1182c;
import com.bumptech.glide.load.data.C1195a;
import com.onedelhi.secure.mz0;
import com.onedelhi.secure.n33;
import com.onedelhi.secure.qd0;
import com.onedelhi.secure.rf0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class qf0<R> implements qd0.C3289a, Runnable, Comparable<qf0<?>>, mz0.C2908f {

    /* renamed from: b */
    public static final String f19098b = "DecodeJob";

    /* renamed from: a */
    public C1182c f19099a;

    /* renamed from: a */
    public f53 f19100a;

    /* renamed from: a */
    public final k34 f19101a = k34.m19424a();

    /* renamed from: a */
    public km0 f19102a;

    /* renamed from: a */
    public ky1 f19103a;

    /* renamed from: a */
    public final n33.C2922a<qf0<?>> f19104a;

    /* renamed from: a */
    public final nf0<R> f19105a = new nf0<>();

    /* renamed from: a */
    public pd0<?> f19106a;

    /* renamed from: a */
    public volatile qd0 f19107a;

    /* renamed from: a */
    public C3295b<R> f19108a;

    /* renamed from: a */
    public final C3297d<?> f19109a = new C3297d<>();

    /* renamed from: a */
    public final C3298e f19110a;

    /* renamed from: a */
    public final C3299f f19111a = new C3299f();

    /* renamed from: a */
    public C3300g f19112a;

    /* renamed from: a */
    public C3301h f19113a;

    /* renamed from: a */
    public qu0 f19114a;

    /* renamed from: a */
    public vd0 f19115a;

    /* renamed from: a */
    public zw2 f19116a;

    /* renamed from: a */
    public Object f19117a;

    /* renamed from: a */
    public Thread f19118a;

    /* renamed from: a */
    public final List<Throwable> f19119a = new ArrayList();

    /* renamed from: b */
    public long f19120b;

    /* renamed from: b */
    public ky1 f19121b;

    /* renamed from: b */
    public Object f19122b;

    /* renamed from: b */
    public boolean f19123b;

    /* renamed from: c */
    public ky1 f19124c;

    /* renamed from: c */
    public volatile boolean f19125c;

    /* renamed from: d */
    public volatile boolean f19126d;

    /* renamed from: e */
    public boolean f19127e;

    /* renamed from: n */
    public int f19128n;

    /* renamed from: o */
    public int f19129o;

    /* renamed from: p */
    public int f19130p;

    /* renamed from: com.onedelhi.secure.qf0$a */
    public static /* synthetic */ class C3294a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f19131a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f19132b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f19133c;

        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|1|2|3|(2:5|6)|7|9|10|11|12|13|15|16|17|18|19|20|21|23|24|25|26|27|28|30) */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x006a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0074 */
        static {
            /*
                com.onedelhi.secure.vt0[] r0 = com.onedelhi.secure.vt0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f19133c = r0
                r1 = 1
                com.onedelhi.secure.vt0 r2 = com.onedelhi.secure.vt0.SOURCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f19133c     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.vt0 r3 = com.onedelhi.secure.vt0.TRANSFORMED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                com.onedelhi.secure.qf0$h[] r2 = com.onedelhi.secure.qf0.C3301h.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f19132b = r2
                com.onedelhi.secure.qf0$h r3 = com.onedelhi.secure.qf0.C3301h.RESOURCE_CACHE     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = f19132b     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.onedelhi.secure.qf0$h r3 = com.onedelhi.secure.qf0.C3301h.DATA_CACHE     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                r2 = 3
                int[] r3 = f19132b     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.onedelhi.secure.qf0$h r4 = com.onedelhi.secure.qf0.C3301h.SOURCE     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r3 = f19132b     // Catch:{ NoSuchFieldError -> 0x004e }
                com.onedelhi.secure.qf0$h r4 = com.onedelhi.secure.qf0.C3301h.FINISHED     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r5 = 4
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r3 = f19132b     // Catch:{ NoSuchFieldError -> 0x0059 }
                com.onedelhi.secure.qf0$h r4 = com.onedelhi.secure.qf0.C3301h.INITIALIZE     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r5 = 5
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                com.onedelhi.secure.qf0$g[] r3 = com.onedelhi.secure.qf0.C3300g.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f19131a = r3
                com.onedelhi.secure.qf0$g r4 = com.onedelhi.secure.qf0.C3300g.INITIALIZE     // Catch:{ NoSuchFieldError -> 0x006a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x006a }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x006a }
            L_0x006a:
                int[] r1 = f19131a     // Catch:{ NoSuchFieldError -> 0x0074 }
                com.onedelhi.secure.qf0$g r3 = com.onedelhi.secure.qf0.C3300g.SWITCH_TO_SOURCE_SERVICE     // Catch:{ NoSuchFieldError -> 0x0074 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0074 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0074 }
            L_0x0074:
                int[] r0 = f19131a     // Catch:{ NoSuchFieldError -> 0x007e }
                com.onedelhi.secure.qf0$g r1 = com.onedelhi.secure.qf0.C3300g.DECODE_DATA     // Catch:{ NoSuchFieldError -> 0x007e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007e }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007e }
            L_0x007e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.qf0.C3294a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.qf0$b */
    public interface C3295b<R> {
        /* renamed from: a */
        void mo22064a(yg1 yg1);

        /* renamed from: c */
        void mo22065c(ck3<R> ck3, vd0 vd0, boolean z);

        /* renamed from: d */
        void mo22066d(qf0<?> qf0);
    }

    /* renamed from: com.onedelhi.secure.qf0$c */
    public final class C3296c<Z> implements rf0.C3414a<Z> {

        /* renamed from: a */
        public final vd0 f19135a;

        public C3296c(vd0 vd0) {
            this.f19135a = vd0;
        }

        @mr2
        /* renamed from: a */
        public ck3<Z> mo23140a(@mr2 ck3<Z> ck3) {
            return qf0.this.mo23119G(this.f19135a, ck3);
        }
    }

    /* renamed from: com.onedelhi.secure.qf0$d */
    public static class C3297d<Z> {

        /* renamed from: a */
        public ky1 f19136a;

        /* renamed from: a */
        public nk3<Z> f19137a;

        /* renamed from: a */
        public r82<Z> f19138a;

        /* renamed from: a */
        public void mo23141a() {
            this.f19136a = null;
            this.f19137a = null;
            this.f19138a = null;
        }

        /* renamed from: b */
        public void mo23142b(C3298e eVar, zw2 zw2) {
            eh1.m13752a("DecodeJob.encode");
            try {
                eVar.mo21491a().mo17846b(this.f19136a, new jd0(this.f19137a, this.f19138a, zw2));
            } finally {
                this.f19138a.mo23709h();
                eh1.m13756e();
            }
        }

        /* renamed from: c */
        public boolean mo23143c() {
            return this.f19138a != null;
        }

        /* renamed from: d */
        public <X> void mo23144d(ky1 ky1, nk3<X> nk3, r82<X> r82) {
            this.f19136a = ky1;
            this.f19137a = nk3;
            this.f19138a = r82;
        }
    }

    /* renamed from: com.onedelhi.secure.qf0$e */
    public interface C3298e {
        /* renamed from: a */
        im0 mo21491a();
    }

    /* renamed from: com.onedelhi.secure.qf0$f */
    public static class C3299f {

        /* renamed from: a */
        public boolean f19139a;

        /* renamed from: b */
        public boolean f19140b;

        /* renamed from: c */
        public boolean f19141c;

        /* renamed from: a */
        public final boolean mo23145a(boolean z) {
            return (this.f19141c || z || this.f19140b) && this.f19139a;
        }

        /* renamed from: b */
        public synchronized boolean mo23146b() {
            this.f19140b = true;
            return mo23145a(false);
        }

        /* renamed from: c */
        public synchronized boolean mo23147c() {
            this.f19141c = true;
            return mo23145a(false);
        }

        /* renamed from: d */
        public synchronized boolean mo23148d(boolean z) {
            this.f19139a = true;
            return mo23145a(z);
        }

        /* renamed from: e */
        public synchronized void mo23149e() {
            this.f19140b = false;
            this.f19139a = false;
            this.f19141c = false;
        }
    }

    /* renamed from: com.onedelhi.secure.qf0$g */
    public enum C3300g {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    /* renamed from: com.onedelhi.secure.qf0$h */
    public enum C3301h {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    public qf0(C3298e eVar, n33.C2922a<qf0<?>> aVar) {
        this.f19110a = eVar;
        this.f19104a = aVar;
    }

    /* renamed from: A */
    public final void mo23113A(String str, long j, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(j92.m18213a(j));
        sb.append(", load key: ");
        sb.append(this.f19114a);
        if (str2 != null) {
            str3 = ", " + str2;
        } else {
            str3 = "";
        }
        sb.append(str3);
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
        Log.v(f19098b, sb.toString());
    }

    /* renamed from: B */
    public final void mo23114B(ck3<R> ck3, vd0 vd0, boolean z) {
        mo23125M();
        this.f19108a.mo22065c(ck3, vd0, z);
    }

    /* renamed from: C */
    public final void mo23115C(ck3<R> ck3, vd0 vd0, boolean z) {
        if (ck3 instanceof kq1) {
            ((kq1) ck3).mo13178b();
        }
        r82<R> r82 = null;
        r82<R> r822 = ck3;
        if (this.f19109a.mo23143c()) {
            r82<R> f = r82.m26490f(ck3);
            r82 = f;
            r822 = f;
        }
        mo23114B(r822, vd0, z);
        this.f19113a = C3301h.ENCODE;
        try {
            if (this.f19109a.mo23143c()) {
                this.f19109a.mo23142b(this.f19110a, this.f19116a);
            }
            mo23117E();
        } finally {
            if (r82 != null) {
                r82.mo23709h();
            }
        }
    }

    /* renamed from: D */
    public final void mo23116D() {
        mo23125M();
        this.f19108a.mo22064a(new yg1("Failed to load resource", (List<Throwable>) new ArrayList(this.f19119a)));
        mo23118F();
    }

    /* renamed from: E */
    public final void mo23117E() {
        if (this.f19111a.mo23146b()) {
            mo23121I();
        }
    }

    /* renamed from: F */
    public final void mo23118F() {
        if (this.f19111a.mo23147c()) {
            mo23121I();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: com.onedelhi.secure.id0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: com.onedelhi.secure.fk3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: com.onedelhi.secure.fk3} */
    /* JADX WARNING: type inference failed for: r12v5, types: [com.onedelhi.secure.ky1] */
    /* JADX WARNING: Multi-variable type inference failed */
    @com.onedelhi.secure.mr2
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <Z> com.onedelhi.secure.ck3<Z> mo23119G(com.onedelhi.secure.vd0 r12, @com.onedelhi.secure.mr2 com.onedelhi.secure.ck3<Z> r13) {
        /*
            r11 = this;
            java.lang.Object r0 = r13.get()
            java.lang.Class r8 = r0.getClass()
            com.onedelhi.secure.vd0 r0 = com.onedelhi.secure.vd0.RESOURCE_DISK_CACHE
            r1 = 0
            if (r12 == r0) goto L_0x0020
            com.onedelhi.secure.nf0<R> r0 = r11.f19105a
            com.onedelhi.secure.sg4 r0 = r0.mo21223r(r8)
            com.bumptech.glide.c r2 = r11.f19099a
            int r3 = r11.f19128n
            int r4 = r11.f19129o
            com.onedelhi.secure.ck3 r2 = r0.mo13753b(r2, r13, r3, r4)
            r7 = r0
            r0 = r2
            goto L_0x0022
        L_0x0020:
            r0 = r13
            r7 = r1
        L_0x0022:
            boolean r2 = r13.equals(r0)
            if (r2 != 0) goto L_0x002b
            r13.mo13177a()
        L_0x002b:
            com.onedelhi.secure.nf0<R> r13 = r11.f19105a
            boolean r13 = r13.mo21227v(r0)
            if (r13 == 0) goto L_0x0040
            com.onedelhi.secure.nf0<R> r13 = r11.f19105a
            com.onedelhi.secure.nk3 r1 = r13.mo21219n(r0)
            com.onedelhi.secure.zw2 r13 = r11.f19116a
            com.onedelhi.secure.vt0 r13 = r1.mo14793a(r13)
            goto L_0x0042
        L_0x0040:
            com.onedelhi.secure.vt0 r13 = com.onedelhi.secure.vt0.NONE
        L_0x0042:
            r10 = r1
            com.onedelhi.secure.nf0<R> r1 = r11.f19105a
            com.onedelhi.secure.ky1 r2 = r11.f19121b
            boolean r1 = r1.mo21229x(r2)
            r2 = 1
            r1 = r1 ^ r2
            com.onedelhi.secure.km0 r3 = r11.f19102a
            boolean r12 = r3.mo19161d(r1, r12, r13)
            if (r12 == 0) goto L_0x00b3
            if (r10 == 0) goto L_0x00a5
            int[] r12 = com.onedelhi.secure.qf0.C3294a.f19133c
            int r1 = r13.ordinal()
            r12 = r12[r1]
            if (r12 == r2) goto L_0x0092
            r1 = 2
            if (r12 != r1) goto L_0x007b
            com.onedelhi.secure.fk3 r12 = new com.onedelhi.secure.fk3
            com.onedelhi.secure.nf0<R> r13 = r11.f19105a
            com.onedelhi.secure.pa r2 = r13.mo21207b()
            com.onedelhi.secure.ky1 r3 = r11.f19121b
            com.onedelhi.secure.ky1 r4 = r11.f19103a
            int r5 = r11.f19128n
            int r6 = r11.f19129o
            com.onedelhi.secure.zw2 r9 = r11.f19116a
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x009b
        L_0x007b:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown strategy: "
            r0.append(r1)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r12.<init>(r13)
            throw r12
        L_0x0092:
            com.onedelhi.secure.id0 r12 = new com.onedelhi.secure.id0
            com.onedelhi.secure.ky1 r13 = r11.f19121b
            com.onedelhi.secure.ky1 r1 = r11.f19103a
            r12.<init>(r13, r1)
        L_0x009b:
            com.onedelhi.secure.r82 r0 = com.onedelhi.secure.r82.m26490f(r0)
            com.onedelhi.secure.qf0$d<?> r13 = r11.f19109a
            r13.mo23144d(r12, r10, r0)
            goto L_0x00b3
        L_0x00a5:
            com.onedelhi.secure.lh3$d r12 = new com.onedelhi.secure.lh3$d
            java.lang.Object r13 = r0.get()
            java.lang.Class r13 = r13.getClass()
            r12.<init>(r13)
            throw r12
        L_0x00b3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.qf0.mo23119G(com.onedelhi.secure.vd0, com.onedelhi.secure.ck3):com.onedelhi.secure.ck3");
    }

    /* renamed from: H */
    public void mo23120H(boolean z) {
        if (this.f19111a.mo23148d(z)) {
            mo23121I();
        }
    }

    /* renamed from: I */
    public final void mo23121I() {
        this.f19111a.mo23149e();
        this.f19109a.mo23141a();
        this.f19105a.mo21206a();
        this.f19125c = false;
        this.f19099a = null;
        this.f19103a = null;
        this.f19116a = null;
        this.f19100a = null;
        this.f19114a = null;
        this.f19108a = null;
        this.f19113a = null;
        this.f19107a = null;
        this.f19118a = null;
        this.f19121b = null;
        this.f19122b = null;
        this.f19115a = null;
        this.f19106a = null;
        this.f19120b = 0;
        this.f19126d = false;
        this.f19117a = null;
        this.f19119a.clear();
        this.f19104a.mo20817a(this);
    }

    /* renamed from: J */
    public final void mo23122J() {
        this.f19118a = Thread.currentThread();
        this.f19120b = j92.m18214b();
        boolean z = false;
        while (!this.f19126d && this.f19107a != null && !(z = this.f19107a.mo13881a())) {
            this.f19113a = mo23135v(this.f19113a);
            this.f19107a = mo23134u();
            if (this.f19113a == C3301h.SOURCE) {
                mo13888g();
                return;
            }
        }
        if ((this.f19113a == C3301h.FINISHED || this.f19126d) && !z) {
            mo23116D();
        }
    }

    /* renamed from: K */
    public final <Data, ResourceType> ck3<R> mo23123K(Data data, vd0 vd0, g62<Data, ResourceType, R> g62) throws yg1 {
        zw2 w = mo23136w(vd0);
        C1195a l = this.f19099a.mo7501i().mo19563l(data);
        try {
            return g62.mo16363b(l, w, this.f19128n, this.f19129o, new C3296c(vd0));
        } finally {
            l.mo7514b();
        }
    }

    /* renamed from: L */
    public final void mo23124L() {
        int i = C3294a.f19131a[this.f19112a.ordinal()];
        if (i == 1) {
            this.f19113a = mo23135v(C3301h.INITIALIZE);
            this.f19107a = mo23134u();
        } else if (i != 2) {
            if (i == 3) {
                mo23133t();
                return;
            }
            throw new IllegalStateException("Unrecognized run reason: " + this.f19112a);
        }
        mo23122J();
    }

    /* renamed from: M */
    public final void mo23125M() {
        Throwable th;
        this.f19101a.mo18881c();
        if (this.f19125c) {
            if (this.f19119a.isEmpty()) {
                th = null;
            } else {
                List<Throwable> list = this.f19119a;
                th = list.get(list.size() - 1);
            }
            throw new IllegalStateException("Already notified", th);
        }
        this.f19125c = true;
    }

    /* renamed from: N */
    public boolean mo23126N() {
        C3301h v = mo23135v(C3301h.INITIALIZE);
        return v == C3301h.RESOURCE_CACHE || v == C3301h.DATA_CACHE;
    }

    /* renamed from: a */
    public void mo23127a() {
        this.f19126d = true;
        qd0 qd0 = this.f19107a;
        if (qd0 != null) {
            qd0.cancel();
        }
    }

    @mr2
    /* renamed from: b */
    public k34 mo20819b() {
        return this.f19101a;
    }

    /* renamed from: e */
    public void mo13886e(ky1 ky1, Object obj, pd0<?> pd0, vd0 vd0, ky1 ky12) {
        this.f19121b = ky1;
        this.f19122b = obj;
        this.f19106a = pd0;
        this.f19115a = vd0;
        this.f19124c = ky12;
        boolean z = false;
        if (ky1 != this.f19105a.mo21208c().get(0)) {
            z = true;
        }
        this.f19127e = z;
        if (Thread.currentThread() != this.f19118a) {
            this.f19112a = C3300g.DECODE_DATA;
            this.f19108a.mo22066d(this);
            return;
        }
        eh1.m13752a("DecodeJob.decodeFromRetrievedData");
        try {
            mo23133t();
        } finally {
            eh1.m13756e();
        }
    }

    /* renamed from: g */
    public void mo13888g() {
        this.f19112a = C3300g.SWITCH_TO_SOURCE_SERVICE;
        this.f19108a.mo22066d(this);
    }

    /* renamed from: l */
    public void mo13891l(ky1 ky1, Exception exc, pd0<?> pd0, vd0 vd0) {
        pd0.mo14569b();
        yg1 yg1 = new yg1("Fetching data failed", (Throwable) exc);
        yg1.mo27467k(ky1, vd0, pd0.mo14075a());
        this.f19119a.add(yg1);
        if (Thread.currentThread() != this.f19118a) {
            this.f19112a = C3300g.SWITCH_TO_SOURCE_SERVICE;
            this.f19108a.mo22066d(this);
            return;
        }
        mo23122J();
    }

    /* renamed from: q */
    public int compareTo(@mr2 qf0<?> qf0) {
        int x = mo23137x() - qf0.mo23137x();
        return x == 0 ? this.f19130p - qf0.f19130p : x;
    }

    /* renamed from: r */
    public final <Data> ck3<R> mo23130r(pd0<?> pd0, Data data, vd0 vd0) throws yg1 {
        if (data == null) {
            pd0.mo14569b();
            return null;
        }
        try {
            long b = j92.m18214b();
            ck3<R> s = mo23132s(data, vd0);
            if (Log.isLoggable(f19098b, 2)) {
                mo23139z("Decoded result " + s, b);
            }
            return s;
        } finally {
            pd0.mo14569b();
        }
    }

    public void run() {
        eh1.m13753b("DecodeJob#run(model=%s)", this.f19117a);
        pd0<?> pd0 = this.f19106a;
        try {
            if (this.f19126d) {
                mo23116D();
                if (pd0 != null) {
                    pd0.mo14569b();
                }
                eh1.m13756e();
                return;
            }
            mo23124L();
            if (pd0 != null) {
                pd0.mo14569b();
            }
            eh1.m13756e();
        } catch (C3947xs e) {
            throw e;
        } catch (Throwable th) {
            if (pd0 != null) {
                pd0.mo14569b();
            }
            eh1.m13756e();
            throw th;
        }
    }

    /* renamed from: s */
    public final <Data> ck3<R> mo23132s(Data data, vd0 vd0) throws yg1 {
        return mo23123K(data, vd0, this.f19105a.mo21213h(data.getClass()));
    }

    /* renamed from: t */
    public final void mo23133t() {
        if (Log.isLoggable(f19098b, 2)) {
            long j = this.f19120b;
            mo23113A("Retrieved data", j, "data: " + this.f19122b + ", cache key: " + this.f19121b + ", fetcher: " + this.f19106a);
        }
        ck3<R> ck3 = null;
        try {
            ck3 = mo23130r(this.f19106a, this.f19122b, this.f19115a);
        } catch (yg1 e) {
            e.mo27466j(this.f19124c, this.f19115a);
            this.f19119a.add(e);
        }
        if (ck3 != null) {
            mo23115C(ck3, this.f19115a, this.f19127e);
        } else {
            mo23122J();
        }
    }

    /* renamed from: u */
    public final qd0 mo23134u() {
        int i = C3294a.f19132b[this.f19113a.ordinal()];
        if (i == 1) {
            return new ek3(this.f19105a, this);
        }
        if (i == 2) {
            return new hd0(this.f19105a, this);
        }
        if (i == 3) {
            return new c14(this.f19105a, this);
        }
        if (i == 4) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.f19113a);
    }

    /* renamed from: v */
    public final C3301h mo23135v(C3301h hVar) {
        int i = C3294a.f19132b[hVar.ordinal()];
        if (i == 1) {
            return this.f19102a.mo19158a() ? C3301h.DATA_CACHE : mo23135v(C3301h.DATA_CACHE);
        }
        if (i == 2) {
            return this.f19123b ? C3301h.FINISHED : C3301h.SOURCE;
        }
        if (i == 3 || i == 4) {
            return C3301h.FINISHED;
        }
        if (i == 5) {
            return this.f19102a.mo19159b() ? C3301h.RESOURCE_CACHE : mo23135v(C3301h.RESOURCE_CACHE);
        }
        throw new IllegalArgumentException("Unrecognized stage: " + hVar);
    }

    @mr2
    /* renamed from: w */
    public final zw2 mo23136w(vd0 vd0) {
        zw2 zw2 = this.f19116a;
        if (Build.VERSION.SDK_INT < 26) {
            return zw2;
        }
        boolean z = vd0 == vd0.RESOURCE_DISK_CACHE || this.f19105a.mo21228w();
        ow2 ow2 = oo0.f18046e;
        Boolean bool = (Boolean) zw2.mo28148c(ow2);
        if (bool != null && (!bool.booleanValue() || z)) {
            return zw2;
        }
        zw2 zw22 = new zw2();
        zw22.mo28149d(this.f19116a);
        zw22.mo28150e(ow2, Boolean.valueOf(z));
        return zw22;
    }

    /* renamed from: x */
    public final int mo23137x() {
        return this.f19100a.ordinal();
    }

    /* renamed from: y */
    public qf0<R> mo23138y(C1182c cVar, Object obj, qu0 qu0, ky1 ky1, int i, int i2, Class<?> cls, Class<R> cls2, f53 f53, km0 km0, Map<Class<?>, sg4<?>> map, boolean z, boolean z2, boolean z3, zw2 zw2, C3295b<R> bVar, int i3) {
        this.f19105a.mo21226u(cVar, obj, ky1, i, i2, km0, cls, cls2, f53, zw2, map, z, z2, this.f19110a);
        this.f19099a = cVar;
        this.f19103a = ky1;
        this.f19100a = f53;
        this.f19114a = qu0;
        this.f19128n = i;
        this.f19129o = i2;
        this.f19102a = km0;
        this.f19123b = z3;
        this.f19116a = zw2;
        this.f19108a = bVar;
        this.f19130p = i3;
        this.f19112a = C3300g.INITIALIZE;
        this.f19117a = obj;
        return this;
    }

    /* renamed from: z */
    public final void mo23139z(String str, long j) {
        mo23113A(str, j, (String) null);
    }
}
