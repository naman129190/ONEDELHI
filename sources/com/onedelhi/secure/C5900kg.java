package com.onedelhi.secure;

import com.onedelhi.secure.pa0;
import java.util.Objects;

/* renamed from: com.onedelhi.secure.kg */
public final class C5900kg extends pa0.C6383f.C6391d.C6392a.C6394b.C6398c {

    /* renamed from: a */
    public final int f31212a;

    /* renamed from: a */
    public final lp1<pa0.C6383f.C6391d.C6392a.C6394b.C6402e.C6404b> f31213a;

    /* renamed from: a */
    public final pa0.C6383f.C6391d.C6392a.C6394b.C6398c f31214a;

    /* renamed from: a */
    public final String f31215a;

    /* renamed from: b */
    public final String f31216b;

    /* renamed from: com.onedelhi.secure.kg$b */
    public static final class C5902b extends pa0.C6383f.C6391d.C6392a.C6394b.C6398c.C6399a {

        /* renamed from: a */
        public lp1<pa0.C6383f.C6391d.C6392a.C6394b.C6402e.C6404b> f31217a;

        /* renamed from: a */
        public pa0.C6383f.C6391d.C6392a.C6394b.C6398c f31218a;

        /* renamed from: a */
        public Integer f31219a;

        /* renamed from: a */
        public String f31220a;

        /* renamed from: b */
        public String f31221b;

        /* renamed from: a */
        public pa0.C6383f.C6391d.C6392a.C6394b.C6398c mo39250a() {
            String str = "";
            if (this.f31220a == null) {
                str = str + " type";
            }
            if (this.f31217a == null) {
                str = str + " frames";
            }
            if (this.f31219a == null) {
                str = str + " overflowCount";
            }
            if (str.isEmpty()) {
                return new C5900kg(this.f31220a, this.f31221b, this.f31217a, this.f31218a, this.f31219a.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public pa0.C6383f.C6391d.C6392a.C6394b.C6398c.C6399a mo39251b(pa0.C6383f.C6391d.C6392a.C6394b.C6398c cVar) {
            this.f31218a = cVar;
            return this;
        }

        /* renamed from: c */
        public pa0.C6383f.C6391d.C6392a.C6394b.C6398c.C6399a mo39252c(lp1<pa0.C6383f.C6391d.C6392a.C6394b.C6402e.C6404b> lp1) {
            Objects.requireNonNull(lp1, "Null frames");
            this.f31217a = lp1;
            return this;
        }

        /* renamed from: d */
        public pa0.C6383f.C6391d.C6392a.C6394b.C6398c.C6399a mo39253d(int i) {
            this.f31219a = Integer.valueOf(i);
            return this;
        }

        /* renamed from: e */
        public pa0.C6383f.C6391d.C6392a.C6394b.C6398c.C6399a mo39254e(String str) {
            this.f31221b = str;
            return this;
        }

        /* renamed from: f */
        public pa0.C6383f.C6391d.C6392a.C6394b.C6398c.C6399a mo39255f(String str) {
            Objects.requireNonNull(str, "Null type");
            this.f31220a = str;
            return this;
        }
    }

    public C5900kg(String str, @ts2 String str2, lp1<pa0.C6383f.C6391d.C6392a.C6394b.C6402e.C6404b> lp1, @ts2 pa0.C6383f.C6391d.C6392a.C6394b.C6398c cVar, int i) {
        this.f31215a = str;
        this.f31216b = str2;
        this.f31213a = lp1;
        this.f31214a = cVar;
        this.f31212a = i;
    }

    @ts2
    /* renamed from: b */
    public pa0.C6383f.C6391d.C6392a.C6394b.C6398c mo39242b() {
        return this.f31214a;
    }

    @mr2
    /* renamed from: c */
    public lp1<pa0.C6383f.C6391d.C6392a.C6394b.C6402e.C6404b> mo39243c() {
        return this.f31213a;
    }

    /* renamed from: d */
    public int mo39244d() {
        return this.f31212a;
    }

    @ts2
    /* renamed from: e */
    public String mo39245e() {
        return this.f31216b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        r1 = r4.f31214a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.f31216b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.onedelhi.secure.pa0.C6383f.C6391d.C6392a.C6394b.C6398c
            r2 = 0
            if (r1 == 0) goto L_0x0058
            com.onedelhi.secure.pa0$f$d$a$b$c r5 = (com.onedelhi.secure.pa0.C6383f.C6391d.C6392a.C6394b.C6398c) r5
            java.lang.String r1 = r4.f31215a
            java.lang.String r3 = r5.mo39247f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0056
            java.lang.String r1 = r4.f31216b
            if (r1 != 0) goto L_0x0022
            java.lang.String r1 = r5.mo39245e()
            if (r1 != 0) goto L_0x0056
            goto L_0x002c
        L_0x0022:
            java.lang.String r3 = r5.mo39245e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0056
        L_0x002c:
            com.onedelhi.secure.lp1<com.onedelhi.secure.pa0$f$d$a$b$e$b> r1 = r4.f31213a
            com.onedelhi.secure.lp1 r3 = r5.mo39243c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0056
            com.onedelhi.secure.pa0$f$d$a$b$c r1 = r4.f31214a
            if (r1 != 0) goto L_0x0043
            com.onedelhi.secure.pa0$f$d$a$b$c r1 = r5.mo39242b()
            if (r1 != 0) goto L_0x0056
            goto L_0x004d
        L_0x0043:
            com.onedelhi.secure.pa0$f$d$a$b$c r3 = r5.mo39242b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0056
        L_0x004d:
            int r1 = r4.f31212a
            int r5 = r5.mo39244d()
            if (r1 != r5) goto L_0x0056
            goto L_0x0057
        L_0x0056:
            r0 = 0
        L_0x0057:
            return r0
        L_0x0058:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C5900kg.equals(java.lang.Object):boolean");
    }

    @mr2
    /* renamed from: f */
    public String mo39247f() {
        return this.f31215a;
    }

    public int hashCode() {
        int hashCode = (this.f31215a.hashCode() ^ 1000003) * 1000003;
        String str = this.f31216b;
        int i = 0;
        int hashCode2 = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f31213a.hashCode()) * 1000003;
        pa0.C6383f.C6391d.C6392a.C6394b.C6398c cVar = this.f31214a;
        if (cVar != null) {
            i = cVar.hashCode();
        }
        return ((hashCode2 ^ i) * 1000003) ^ this.f31212a;
    }

    public String toString() {
        return "Exception{type=" + this.f31215a + ", reason=" + this.f31216b + ", frames=" + this.f31213a + ", causedBy=" + this.f31214a + ", overflowCount=" + this.f31212a + "}";
    }
}
