package com.onedelhi.secure;

import com.onedelhi.secure.pa0;
import java.util.Objects;

/* renamed from: com.onedelhi.secure.hg */
public final class C5516hg extends pa0.C6383f.C6391d.C6392a {

    /* renamed from: a */
    public final int f29594a;

    /* renamed from: a */
    public final lp1<pa0.C6377d> f29595a;

    /* renamed from: a */
    public final pa0.C6383f.C6391d.C6392a.C6394b f29596a;

    /* renamed from: a */
    public final Boolean f29597a;

    /* renamed from: b */
    public final lp1<pa0.C6377d> f29598b;

    /* renamed from: com.onedelhi.secure.hg$b */
    public static final class C5518b extends pa0.C6383f.C6391d.C6392a.C6393a {

        /* renamed from: a */
        public lp1<pa0.C6377d> f29599a;

        /* renamed from: a */
        public pa0.C6383f.C6391d.C6392a.C6394b f29600a;

        /* renamed from: a */
        public Boolean f29601a;

        /* renamed from: a */
        public Integer f29602a;

        /* renamed from: b */
        public lp1<pa0.C6377d> f29603b;

        public C5518b() {
        }

        public C5518b(pa0.C6383f.C6391d.C6392a aVar) {
            this.f29600a = aVar.mo37288d();
            this.f29599a = aVar.mo37287c();
            this.f29603b = aVar.mo37289e();
            this.f29601a = aVar.mo37286b();
            this.f29602a = Integer.valueOf(aVar.mo37291f());
        }

        /* renamed from: a */
        public pa0.C6383f.C6391d.C6392a mo37295a() {
            String str = "";
            if (this.f29600a == null) {
                str = str + " execution";
            }
            if (this.f29602a == null) {
                str = str + " uiOrientation";
            }
            if (str.isEmpty()) {
                return new C5516hg(this.f29600a, this.f29599a, this.f29603b, this.f29601a, this.f29602a.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public pa0.C6383f.C6391d.C6392a.C6393a mo37296b(@ts2 Boolean bool) {
            this.f29601a = bool;
            return this;
        }

        /* renamed from: c */
        public pa0.C6383f.C6391d.C6392a.C6393a mo37297c(lp1<pa0.C6377d> lp1) {
            this.f29599a = lp1;
            return this;
        }

        /* renamed from: d */
        public pa0.C6383f.C6391d.C6392a.C6393a mo37298d(pa0.C6383f.C6391d.C6392a.C6394b bVar) {
            Objects.requireNonNull(bVar, "Null execution");
            this.f29600a = bVar;
            return this;
        }

        /* renamed from: e */
        public pa0.C6383f.C6391d.C6392a.C6393a mo37299e(lp1<pa0.C6377d> lp1) {
            this.f29603b = lp1;
            return this;
        }

        /* renamed from: f */
        public pa0.C6383f.C6391d.C6392a.C6393a mo37300f(int i) {
            this.f29602a = Integer.valueOf(i);
            return this;
        }
    }

    public C5516hg(pa0.C6383f.C6391d.C6392a.C6394b bVar, @ts2 lp1<pa0.C6377d> lp1, @ts2 lp1<pa0.C6377d> lp12, @ts2 Boolean bool, int i) {
        this.f29596a = bVar;
        this.f29595a = lp1;
        this.f29598b = lp12;
        this.f29597a = bool;
        this.f29594a = i;
    }

    @ts2
    /* renamed from: b */
    public Boolean mo37286b() {
        return this.f29597a;
    }

    @ts2
    /* renamed from: c */
    public lp1<pa0.C6377d> mo37287c() {
        return this.f29595a;
    }

    @mr2
    /* renamed from: d */
    public pa0.C6383f.C6391d.C6392a.C6394b mo37288d() {
        return this.f29596a;
    }

    @ts2
    /* renamed from: e */
    public lp1<pa0.C6377d> mo37289e() {
        return this.f29598b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        r1 = r4.f29598b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0041, code lost:
        r1 = r4.f29597a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.f29595a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.onedelhi.secure.pa0.C6383f.C6391d.C6392a
            r2 = 0
            if (r1 == 0) goto L_0x0061
            com.onedelhi.secure.pa0$f$d$a r5 = (com.onedelhi.secure.pa0.C6383f.C6391d.C6392a) r5
            com.onedelhi.secure.pa0$f$d$a$b r1 = r4.f29596a
            com.onedelhi.secure.pa0$f$d$a$b r3 = r5.mo37288d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x005f
            com.onedelhi.secure.lp1<com.onedelhi.secure.pa0$d> r1 = r4.f29595a
            if (r1 != 0) goto L_0x0022
            com.onedelhi.secure.lp1 r1 = r5.mo37287c()
            if (r1 != 0) goto L_0x005f
            goto L_0x002c
        L_0x0022:
            com.onedelhi.secure.lp1 r3 = r5.mo37287c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x005f
        L_0x002c:
            com.onedelhi.secure.lp1<com.onedelhi.secure.pa0$d> r1 = r4.f29598b
            if (r1 != 0) goto L_0x0037
            com.onedelhi.secure.lp1 r1 = r5.mo37289e()
            if (r1 != 0) goto L_0x005f
            goto L_0x0041
        L_0x0037:
            com.onedelhi.secure.lp1 r3 = r5.mo37289e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x005f
        L_0x0041:
            java.lang.Boolean r1 = r4.f29597a
            if (r1 != 0) goto L_0x004c
            java.lang.Boolean r1 = r5.mo37286b()
            if (r1 != 0) goto L_0x005f
            goto L_0x0056
        L_0x004c:
            java.lang.Boolean r3 = r5.mo37286b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x005f
        L_0x0056:
            int r1 = r4.f29594a
            int r5 = r5.mo37291f()
            if (r1 != r5) goto L_0x005f
            goto L_0x0060
        L_0x005f:
            r0 = 0
        L_0x0060:
            return r0
        L_0x0061:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C5516hg.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public int mo37291f() {
        return this.f29594a;
    }

    /* renamed from: g */
    public pa0.C6383f.C6391d.C6392a.C6393a mo37292g() {
        return new C5518b(this);
    }

    public int hashCode() {
        int hashCode = (this.f29596a.hashCode() ^ 1000003) * 1000003;
        lp1<pa0.C6377d> lp1 = this.f29595a;
        int i = 0;
        int hashCode2 = (hashCode ^ (lp1 == null ? 0 : lp1.hashCode())) * 1000003;
        lp1<pa0.C6377d> lp12 = this.f29598b;
        int hashCode3 = (hashCode2 ^ (lp12 == null ? 0 : lp12.hashCode())) * 1000003;
        Boolean bool = this.f29597a;
        if (bool != null) {
            i = bool.hashCode();
        }
        return ((hashCode3 ^ i) * 1000003) ^ this.f29594a;
    }

    public String toString() {
        return "Application{execution=" + this.f29596a + ", customAttributes=" + this.f29595a + ", internalKeys=" + this.f29598b + ", background=" + this.f29597a + ", uiOrientation=" + this.f29594a + "}";
    }
}
