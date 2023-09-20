package com.onedelhi.secure;

import com.onedelhi.secure.uv0;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.onedelhi.secure.ug */
public final class C3702ug extends uv0 {

    /* renamed from: a */
    public final long f21335a;

    /* renamed from: a */
    public final xt0 f21336a;

    /* renamed from: a */
    public final Integer f21337a;

    /* renamed from: a */
    public final String f21338a;

    /* renamed from: a */
    public final Map<String, String> f21339a;

    /* renamed from: b */
    public final long f21340b;

    /* renamed from: com.onedelhi.secure.ug$b */
    public static final class C3704b extends uv0.C3747a {

        /* renamed from: a */
        public xt0 f21341a;

        /* renamed from: a */
        public Integer f21342a;

        /* renamed from: a */
        public Long f21343a;

        /* renamed from: a */
        public String f21344a;

        /* renamed from: a */
        public Map<String, String> f21345a;

        /* renamed from: b */
        public Long f21346b;

        /* renamed from: d */
        public uv0 mo25589d() {
            String str = "";
            if (this.f21344a == null) {
                str = str + " transportName";
            }
            if (this.f21341a == null) {
                str = str + " encodedPayload";
            }
            if (this.f21343a == null) {
                str = str + " eventMillis";
            }
            if (this.f21346b == null) {
                str = str + " uptimeMillis";
            }
            if (this.f21345a == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new C3702ug(this.f21344a, this.f21342a, this.f21341a, this.f21343a.longValue(), this.f21346b.longValue(), this.f21345a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: e */
        public Map<String, String> mo25590e() {
            Map<String, String> map = this.f21345a;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        /* renamed from: f */
        public uv0.C3747a mo25591f(Map<String, String> map) {
            Objects.requireNonNull(map, "Null autoMetadata");
            this.f21345a = map;
            return this;
        }

        /* renamed from: g */
        public uv0.C3747a mo25592g(Integer num) {
            this.f21342a = num;
            return this;
        }

        /* renamed from: h */
        public uv0.C3747a mo25593h(xt0 xt0) {
            Objects.requireNonNull(xt0, "Null encodedPayload");
            this.f21341a = xt0;
            return this;
        }

        /* renamed from: i */
        public uv0.C3747a mo25594i(long j) {
            this.f21343a = Long.valueOf(j);
            return this;
        }

        /* renamed from: j */
        public uv0.C3747a mo25595j(String str) {
            Objects.requireNonNull(str, "Null transportName");
            this.f21344a = str;
            return this;
        }

        /* renamed from: k */
        public uv0.C3747a mo25596k(long j) {
            this.f21346b = Long.valueOf(j);
            return this;
        }
    }

    public C3702ug(String str, @ts2 Integer num, xt0 xt0, long j, long j2, Map<String, String> map) {
        this.f21338a = str;
        this.f21337a = num;
        this.f21336a = xt0;
        this.f21335a = j;
        this.f21340b = j2;
        this.f21339a = map;
    }

    /* renamed from: c */
    public Map<String, String> mo25580c() {
        return this.f21339a;
    }

    @ts2
    /* renamed from: d */
    public Integer mo25581d() {
        return this.f21337a;
    }

    /* renamed from: e */
    public xt0 mo25582e() {
        return this.f21336a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r7.f21337a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof com.onedelhi.secure.uv0
            r2 = 0
            if (r1 == 0) goto L_0x005b
            com.onedelhi.secure.uv0 r8 = (com.onedelhi.secure.uv0) r8
            java.lang.String r1 = r7.f21338a
            java.lang.String r3 = r8.mo25586l()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0059
            java.lang.Integer r1 = r7.f21337a
            if (r1 != 0) goto L_0x0022
            java.lang.Integer r1 = r8.mo25581d()
            if (r1 != 0) goto L_0x0059
            goto L_0x002c
        L_0x0022:
            java.lang.Integer r3 = r8.mo25581d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0059
        L_0x002c:
            com.onedelhi.secure.xt0 r1 = r7.f21336a
            com.onedelhi.secure.xt0 r3 = r8.mo25582e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0059
            long r3 = r7.f21335a
            long r5 = r8.mo25584f()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0059
            long r3 = r7.f21340b
            long r5 = r8.mo25587m()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0059
            java.util.Map<java.lang.String, java.lang.String> r1 = r7.f21339a
            java.util.Map r8 = r8.mo25580c()
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r0 = 0
        L_0x005a:
            return r0
        L_0x005b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C3702ug.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public long mo25584f() {
        return this.f21335a;
    }

    public int hashCode() {
        int hashCode = (this.f21338a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f21337a;
        int hashCode2 = num == null ? 0 : num.hashCode();
        long j = this.f21335a;
        long j2 = this.f21340b;
        return ((((((((hashCode ^ hashCode2) * 1000003) ^ this.f21336a.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f21339a.hashCode();
    }

    /* renamed from: l */
    public String mo25586l() {
        return this.f21338a;
    }

    /* renamed from: m */
    public long mo25587m() {
        return this.f21340b;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f21338a + ", code=" + this.f21337a + ", encodedPayload=" + this.f21336a + ", eventMillis=" + this.f21335a + ", uptimeMillis=" + this.f21340b + ", autoMetadata=" + this.f21339a + "}";
    }
}
