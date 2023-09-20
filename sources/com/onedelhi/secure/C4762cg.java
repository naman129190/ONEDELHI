package com.onedelhi.secure;

import com.onedelhi.secure.pa0;
import com.onedelhi.secure.tt0;
import java.util.Objects;

/* renamed from: com.onedelhi.secure.cg */
public final class C4762cg extends pa0.C6383f {

    /* renamed from: a */
    public final int f26724a;

    /* renamed from: a */
    public final long f26725a;

    /* renamed from: a */
    public final lp1<pa0.C6383f.C6391d> f26726a;

    /* renamed from: a */
    public final pa0.C6383f.C6384a f26727a;

    /* renamed from: a */
    public final pa0.C6383f.C6389c f26728a;

    /* renamed from: a */
    public final pa0.C6383f.C6411e f26729a;

    /* renamed from: a */
    public final pa0.C6383f.C6413f f26730a;

    /* renamed from: a */
    public final Long f26731a;

    /* renamed from: a */
    public final String f26732a;

    /* renamed from: a */
    public final boolean f26733a;

    /* renamed from: b */
    public final String f26734b;

    /* renamed from: com.onedelhi.secure.cg$b */
    public static final class C4764b extends pa0.C6383f.C6388b {

        /* renamed from: a */
        public lp1<pa0.C6383f.C6391d> f26735a;

        /* renamed from: a */
        public pa0.C6383f.C6384a f26736a;

        /* renamed from: a */
        public pa0.C6383f.C6389c f26737a;

        /* renamed from: a */
        public pa0.C6383f.C6411e f26738a;

        /* renamed from: a */
        public pa0.C6383f.C6413f f26739a;

        /* renamed from: a */
        public Boolean f26740a;

        /* renamed from: a */
        public Integer f26741a;

        /* renamed from: a */
        public Long f26742a;

        /* renamed from: a */
        public String f26743a;

        /* renamed from: b */
        public Long f26744b;

        /* renamed from: b */
        public String f26745b;

        public C4764b() {
        }

        public C4764b(pa0.C6383f fVar) {
            this.f26743a = fVar.mo32341f();
            this.f26745b = fVar.mo32343h();
            this.f26742a = Long.valueOf(fVar.mo32346k());
            this.f26744b = fVar.mo32338d();
            this.f26740a = Boolean.valueOf(fVar.mo32348m());
            this.f26736a = fVar.mo32336b();
            this.f26739a = fVar.mo32347l();
            this.f26738a = fVar.mo32345j();
            this.f26737a = fVar.mo32337c();
            this.f26735a = fVar.mo32339e();
            this.f26741a = Integer.valueOf(fVar.mo32342g());
        }

        /* renamed from: a */
        public pa0.C6383f mo32351a() {
            String str = "";
            if (this.f26743a == null) {
                str = str + " generator";
            }
            if (this.f26745b == null) {
                str = str + " identifier";
            }
            if (this.f26742a == null) {
                str = str + " startedAt";
            }
            if (this.f26740a == null) {
                str = str + " crashed";
            }
            if (this.f26736a == null) {
                str = str + " app";
            }
            if (this.f26741a == null) {
                str = str + " generatorType";
            }
            if (str.isEmpty()) {
                return new C4762cg(this.f26743a, this.f26745b, this.f26742a.longValue(), this.f26744b, this.f26740a.booleanValue(), this.f26736a, this.f26739a, this.f26738a, this.f26737a, this.f26735a, this.f26741a.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public pa0.C6383f.C6388b mo32352b(pa0.C6383f.C6384a aVar) {
            Objects.requireNonNull(aVar, "Null app");
            this.f26736a = aVar;
            return this;
        }

        /* renamed from: c */
        public pa0.C6383f.C6388b mo32353c(boolean z) {
            this.f26740a = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: d */
        public pa0.C6383f.C6388b mo32354d(pa0.C6383f.C6389c cVar) {
            this.f26737a = cVar;
            return this;
        }

        /* renamed from: e */
        public pa0.C6383f.C6388b mo32355e(Long l) {
            this.f26744b = l;
            return this;
        }

        /* renamed from: f */
        public pa0.C6383f.C6388b mo32356f(lp1<pa0.C6383f.C6391d> lp1) {
            this.f26735a = lp1;
            return this;
        }

        /* renamed from: g */
        public pa0.C6383f.C6388b mo32357g(String str) {
            Objects.requireNonNull(str, "Null generator");
            this.f26743a = str;
            return this;
        }

        /* renamed from: h */
        public pa0.C6383f.C6388b mo32358h(int i) {
            this.f26741a = Integer.valueOf(i);
            return this;
        }

        /* renamed from: i */
        public pa0.C6383f.C6388b mo32359i(String str) {
            Objects.requireNonNull(str, "Null identifier");
            this.f26745b = str;
            return this;
        }

        /* renamed from: k */
        public pa0.C6383f.C6388b mo32360k(pa0.C6383f.C6411e eVar) {
            this.f26738a = eVar;
            return this;
        }

        /* renamed from: l */
        public pa0.C6383f.C6388b mo32361l(long j) {
            this.f26742a = Long.valueOf(j);
            return this;
        }

        /* renamed from: m */
        public pa0.C6383f.C6388b mo32362m(pa0.C6383f.C6413f fVar) {
            this.f26739a = fVar;
            return this;
        }
    }

    public C4762cg(String str, String str2, long j, @ts2 Long l, boolean z, pa0.C6383f.C6384a aVar, @ts2 pa0.C6383f.C6413f fVar, @ts2 pa0.C6383f.C6411e eVar, @ts2 pa0.C6383f.C6389c cVar, @ts2 lp1<pa0.C6383f.C6391d> lp1, int i) {
        this.f26732a = str;
        this.f26734b = str2;
        this.f26725a = j;
        this.f26731a = l;
        this.f26733a = z;
        this.f26727a = aVar;
        this.f26730a = fVar;
        this.f26729a = eVar;
        this.f26728a = cVar;
        this.f26726a = lp1;
        this.f26724a = i;
    }

    @mr2
    /* renamed from: b */
    public pa0.C6383f.C6384a mo32336b() {
        return this.f26727a;
    }

    @ts2
    /* renamed from: c */
    public pa0.C6383f.C6389c mo32337c() {
        return this.f26728a;
    }

    @ts2
    /* renamed from: d */
    public Long mo32338d() {
        return this.f26731a;
    }

    @ts2
    /* renamed from: e */
    public lp1<pa0.C6383f.C6391d> mo32339e() {
        return this.f26726a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002d, code lost:
        r1 = r7.f26731a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
        r1 = r7.f26730a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006b, code lost:
        r1 = r7.f26729a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0080, code lost:
        r1 = r7.f26728a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0095, code lost:
        r1 = r7.f26726a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof com.onedelhi.secure.pa0.C6383f
            r2 = 0
            if (r1 == 0) goto L_0x00b5
            com.onedelhi.secure.pa0$f r8 = (com.onedelhi.secure.pa0.C6383f) r8
            java.lang.String r1 = r7.f26732a
            java.lang.String r3 = r8.mo32341f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
            java.lang.String r1 = r7.f26734b
            java.lang.String r3 = r8.mo32343h()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
            long r3 = r7.f26725a
            long r5 = r8.mo32346k()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x00b3
            java.lang.Long r1 = r7.f26731a
            if (r1 != 0) goto L_0x0038
            java.lang.Long r1 = r8.mo32338d()
            if (r1 != 0) goto L_0x00b3
            goto L_0x0042
        L_0x0038:
            java.lang.Long r3 = r8.mo32338d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
        L_0x0042:
            boolean r1 = r7.f26733a
            boolean r3 = r8.mo32348m()
            if (r1 != r3) goto L_0x00b3
            com.onedelhi.secure.pa0$f$a r1 = r7.f26727a
            com.onedelhi.secure.pa0$f$a r3 = r8.mo32336b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
            com.onedelhi.secure.pa0$f$f r1 = r7.f26730a
            if (r1 != 0) goto L_0x0061
            com.onedelhi.secure.pa0$f$f r1 = r8.mo32347l()
            if (r1 != 0) goto L_0x00b3
            goto L_0x006b
        L_0x0061:
            com.onedelhi.secure.pa0$f$f r3 = r8.mo32347l()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
        L_0x006b:
            com.onedelhi.secure.pa0$f$e r1 = r7.f26729a
            if (r1 != 0) goto L_0x0076
            com.onedelhi.secure.pa0$f$e r1 = r8.mo32345j()
            if (r1 != 0) goto L_0x00b3
            goto L_0x0080
        L_0x0076:
            com.onedelhi.secure.pa0$f$e r3 = r8.mo32345j()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
        L_0x0080:
            com.onedelhi.secure.pa0$f$c r1 = r7.f26728a
            if (r1 != 0) goto L_0x008b
            com.onedelhi.secure.pa0$f$c r1 = r8.mo32337c()
            if (r1 != 0) goto L_0x00b3
            goto L_0x0095
        L_0x008b:
            com.onedelhi.secure.pa0$f$c r3 = r8.mo32337c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
        L_0x0095:
            com.onedelhi.secure.lp1<com.onedelhi.secure.pa0$f$d> r1 = r7.f26726a
            if (r1 != 0) goto L_0x00a0
            com.onedelhi.secure.lp1 r1 = r8.mo32339e()
            if (r1 != 0) goto L_0x00b3
            goto L_0x00aa
        L_0x00a0:
            com.onedelhi.secure.lp1 r3 = r8.mo32339e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
        L_0x00aa:
            int r1 = r7.f26724a
            int r8 = r8.mo32342g()
            if (r1 != r8) goto L_0x00b3
            goto L_0x00b4
        L_0x00b3:
            r0 = 0
        L_0x00b4:
            return r0
        L_0x00b5:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C4762cg.equals(java.lang.Object):boolean");
    }

    @mr2
    /* renamed from: f */
    public String mo32341f() {
        return this.f26732a;
    }

    /* renamed from: g */
    public int mo32342g() {
        return this.f26724a;
    }

    @mr2
    @tt0.C6899b
    /* renamed from: h */
    public String mo32343h() {
        return this.f26734b;
    }

    public int hashCode() {
        long j = this.f26725a;
        int hashCode = (((((this.f26732a.hashCode() ^ 1000003) * 1000003) ^ this.f26734b.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        Long l = this.f26731a;
        int i = 0;
        int hashCode2 = (((((hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ (this.f26733a ? 1231 : 1237)) * 1000003) ^ this.f26727a.hashCode()) * 1000003;
        pa0.C6383f.C6413f fVar = this.f26730a;
        int hashCode3 = (hashCode2 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        pa0.C6383f.C6411e eVar = this.f26729a;
        int hashCode4 = (hashCode3 ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        pa0.C6383f.C6389c cVar = this.f26728a;
        int hashCode5 = (hashCode4 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        lp1<pa0.C6383f.C6391d> lp1 = this.f26726a;
        if (lp1 != null) {
            i = lp1.hashCode();
        }
        return ((hashCode5 ^ i) * 1000003) ^ this.f26724a;
    }

    @ts2
    /* renamed from: j */
    public pa0.C6383f.C6411e mo32345j() {
        return this.f26729a;
    }

    /* renamed from: k */
    public long mo32346k() {
        return this.f26725a;
    }

    @ts2
    /* renamed from: l */
    public pa0.C6383f.C6413f mo32347l() {
        return this.f26730a;
    }

    /* renamed from: m */
    public boolean mo32348m() {
        return this.f26733a;
    }

    /* renamed from: n */
    public pa0.C6383f.C6388b mo32349n() {
        return new C4764b(this);
    }

    public String toString() {
        return "Session{generator=" + this.f26732a + ", identifier=" + this.f26734b + ", startedAt=" + this.f26725a + ", endedAt=" + this.f26731a + ", crashed=" + this.f26733a + ", app=" + this.f26727a + ", user=" + this.f26730a + ", os=" + this.f26729a + ", device=" + this.f26728a + ", events=" + this.f26726a + ", generatorType=" + this.f26724a + "}";
    }
}
