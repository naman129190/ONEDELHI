package com.onedelhi.secure;

import com.onedelhi.secure.pa0;
import java.util.Objects;

/* renamed from: com.onedelhi.secure.ng */
public final class C6185ng extends pa0.C6383f.C6391d.C6392a.C6394b.C6402e.C6404b {

    /* renamed from: a */
    public final int f32498a;

    /* renamed from: a */
    public final long f32499a;

    /* renamed from: a */
    public final String f32500a;

    /* renamed from: b */
    public final long f32501b;

    /* renamed from: b */
    public final String f32502b;

    /* renamed from: com.onedelhi.secure.ng$b */
    public static final class C6187b extends pa0.C6383f.C6391d.C6392a.C6394b.C6402e.C6404b.C6405a {

        /* renamed from: a */
        public Integer f32503a;

        /* renamed from: a */
        public Long f32504a;

        /* renamed from: a */
        public String f32505a;

        /* renamed from: b */
        public Long f32506b;

        /* renamed from: b */
        public String f32507b;

        /* renamed from: a */
        public pa0.C6383f.C6391d.C6392a.C6394b.C6402e.C6404b mo41046a() {
            String str = "";
            if (this.f32504a == null) {
                str = str + " pc";
            }
            if (this.f32505a == null) {
                str = str + " symbol";
            }
            if (this.f32506b == null) {
                str = str + " offset";
            }
            if (this.f32503a == null) {
                str = str + " importance";
            }
            if (str.isEmpty()) {
                return new C6185ng(this.f32504a.longValue(), this.f32505a, this.f32507b, this.f32506b.longValue(), this.f32503a.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public pa0.C6383f.C6391d.C6392a.C6394b.C6402e.C6404b.C6405a mo41047b(String str) {
            this.f32507b = str;
            return this;
        }

        /* renamed from: c */
        public pa0.C6383f.C6391d.C6392a.C6394b.C6402e.C6404b.C6405a mo41048c(int i) {
            this.f32503a = Integer.valueOf(i);
            return this;
        }

        /* renamed from: d */
        public pa0.C6383f.C6391d.C6392a.C6394b.C6402e.C6404b.C6405a mo41049d(long j) {
            this.f32506b = Long.valueOf(j);
            return this;
        }

        /* renamed from: e */
        public pa0.C6383f.C6391d.C6392a.C6394b.C6402e.C6404b.C6405a mo41050e(long j) {
            this.f32504a = Long.valueOf(j);
            return this;
        }

        /* renamed from: f */
        public pa0.C6383f.C6391d.C6392a.C6394b.C6402e.C6404b.C6405a mo41051f(String str) {
            Objects.requireNonNull(str, "Null symbol");
            this.f32505a = str;
            return this;
        }
    }

    public C6185ng(long j, String str, @ts2 String str2, long j2, int i) {
        this.f32499a = j;
        this.f32500a = str;
        this.f32502b = str2;
        this.f32501b = j2;
        this.f32498a = i;
    }

    @ts2
    /* renamed from: b */
    public String mo41038b() {
        return this.f32502b;
    }

    /* renamed from: c */
    public int mo41039c() {
        return this.f32498a;
    }

    /* renamed from: d */
    public long mo41040d() {
        return this.f32501b;
    }

    /* renamed from: e */
    public long mo41041e() {
        return this.f32499a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        r1 = r7.f32502b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof com.onedelhi.secure.pa0.C6383f.C6391d.C6392a.C6394b.C6402e.C6404b
            r2 = 0
            if (r1 == 0) goto L_0x004b
            com.onedelhi.secure.pa0$f$d$a$b$e$b r8 = (com.onedelhi.secure.pa0.C6383f.C6391d.C6392a.C6394b.C6402e.C6404b) r8
            long r3 = r7.f32499a
            long r5 = r8.mo41041e()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0049
            java.lang.String r1 = r7.f32500a
            java.lang.String r3 = r8.mo41043f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0049
            java.lang.String r1 = r7.f32502b
            if (r1 != 0) goto L_0x002c
            java.lang.String r1 = r8.mo41038b()
            if (r1 != 0) goto L_0x0049
            goto L_0x0036
        L_0x002c:
            java.lang.String r3 = r8.mo41038b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0049
        L_0x0036:
            long r3 = r7.f32501b
            long r5 = r8.mo41040d()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0049
            int r1 = r7.f32498a
            int r8 = r8.mo41039c()
            if (r1 != r8) goto L_0x0049
            goto L_0x004a
        L_0x0049:
            r0 = 0
        L_0x004a:
            return r0
        L_0x004b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C6185ng.equals(java.lang.Object):boolean");
    }

    @mr2
    /* renamed from: f */
    public String mo41043f() {
        return this.f32500a;
    }

    public int hashCode() {
        long j = this.f32499a;
        int hashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f32500a.hashCode()) * 1000003;
        String str = this.f32502b;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j2 = this.f32501b;
        return this.f32498a ^ ((((hashCode ^ hashCode2) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public String toString() {
        return "Frame{pc=" + this.f32499a + ", symbol=" + this.f32500a + ", file=" + this.f32502b + ", offset=" + this.f32501b + ", importance=" + this.f32498a + "}";
    }
}
