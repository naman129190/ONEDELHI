package com.onedelhi.secure;

import com.onedelhi.secure.e92;
import com.onedelhi.secure.tt0;
import java.util.List;

/* renamed from: com.onedelhi.secure.bh */
public final class C1784bh extends e92 {

    /* renamed from: a */
    public final long f9811a;

    /* renamed from: a */
    public final y83 f9812a;

    /* renamed from: a */
    public final C4142zy f9813a;

    /* renamed from: a */
    public final Integer f9814a;

    /* renamed from: a */
    public final String f9815a;

    /* renamed from: a */
    public final List<z82> f9816a;

    /* renamed from: b */
    public final long f9817b;

    /* renamed from: com.onedelhi.secure.bh$b */
    public static final class C1786b extends e92.C2036a {

        /* renamed from: a */
        public y83 f9818a;

        /* renamed from: a */
        public C4142zy f9819a;

        /* renamed from: a */
        public Integer f9820a;

        /* renamed from: a */
        public Long f9821a;

        /* renamed from: a */
        public String f9822a;

        /* renamed from: a */
        public List<z82> f9823a;

        /* renamed from: b */
        public Long f9824b;

        /* renamed from: a */
        public e92 mo13696a() {
            String str = "";
            if (this.f9821a == null) {
                str = str + " requestTimeMs";
            }
            if (this.f9824b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new C1784bh(this.f9821a.longValue(), this.f9824b.longValue(), this.f9819a, this.f9820a, this.f9822a, this.f9823a, this.f9818a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public e92.C2036a mo13697b(@ts2 C4142zy zyVar) {
            this.f9819a = zyVar;
            return this;
        }

        /* renamed from: c */
        public e92.C2036a mo13698c(@ts2 List<z82> list) {
            this.f9823a = list;
            return this;
        }

        /* renamed from: d */
        public e92.C2036a mo13699d(@ts2 Integer num) {
            this.f9820a = num;
            return this;
        }

        /* renamed from: e */
        public e92.C2036a mo13700e(@ts2 String str) {
            this.f9822a = str;
            return this;
        }

        /* renamed from: f */
        public e92.C2036a mo13701f(@ts2 y83 y83) {
            this.f9818a = y83;
            return this;
        }

        /* renamed from: g */
        public e92.C2036a mo13702g(long j) {
            this.f9821a = Long.valueOf(j);
            return this;
        }

        /* renamed from: h */
        public e92.C2036a mo13703h(long j) {
            this.f9824b = Long.valueOf(j);
            return this;
        }
    }

    public C1784bh(long j, long j2, @ts2 C4142zy zyVar, @ts2 Integer num, @ts2 String str, @ts2 List<z82> list, @ts2 y83 y83) {
        this.f9811a = j;
        this.f9817b = j2;
        this.f9813a = zyVar;
        this.f9814a = num;
        this.f9815a = str;
        this.f9816a = list;
        this.f9812a = y83;
    }

    @ts2
    /* renamed from: b */
    public C4142zy mo13686b() {
        return this.f9813a;
    }

    @tt0.C6898a(name = "logEvent")
    @ts2
    /* renamed from: c */
    public List<z82> mo13687c() {
        return this.f9816a;
    }

    @ts2
    /* renamed from: d */
    public Integer mo13688d() {
        return this.f9814a;
    }

    @ts2
    /* renamed from: e */
    public String mo13689e() {
        return this.f9815a;
    }

    public boolean equals(Object obj) {
        C4142zy zyVar;
        Integer num;
        String str;
        List<z82> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e92)) {
            return false;
        }
        e92 e92 = (e92) obj;
        if (this.f9811a == e92.mo13692g() && this.f9817b == e92.mo13693h() && ((zyVar = this.f9813a) != null ? zyVar.equals(e92.mo13686b()) : e92.mo13686b() == null) && ((num = this.f9814a) != null ? num.equals(e92.mo13688d()) : e92.mo13688d() == null) && ((str = this.f9815a) != null ? str.equals(e92.mo13689e()) : e92.mo13689e() == null) && ((list = this.f9816a) != null ? list.equals(e92.mo13687c()) : e92.mo13687c() == null)) {
            y83 y83 = this.f9812a;
            y83 f = e92.mo13691f();
            if (y83 == null) {
                if (f == null) {
                    return true;
                }
            } else if (y83.equals(f)) {
                return true;
            }
        }
        return false;
    }

    @ts2
    /* renamed from: f */
    public y83 mo13691f() {
        return this.f9812a;
    }

    /* renamed from: g */
    public long mo13692g() {
        return this.f9811a;
    }

    /* renamed from: h */
    public long mo13693h() {
        return this.f9817b;
    }

    public int hashCode() {
        long j = this.f9811a;
        long j2 = this.f9817b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        C4142zy zyVar = this.f9813a;
        int i2 = 0;
        int hashCode = (i ^ (zyVar == null ? 0 : zyVar.hashCode())) * 1000003;
        Integer num = this.f9814a;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f9815a;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<z82> list = this.f9816a;
        int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        y83 y83 = this.f9812a;
        if (y83 != null) {
            i2 = y83.hashCode();
        }
        return hashCode4 ^ i2;
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f9811a + ", requestUptimeMs=" + this.f9817b + ", clientInfo=" + this.f9813a + ", logSource=" + this.f9814a + ", logSourceName=" + this.f9815a + ", logEvents=" + this.f9816a + ", qosTier=" + this.f9812a + "}";
    }
}
