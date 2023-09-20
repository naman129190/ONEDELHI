package com.onedelhi.secure;

import com.onedelhi.secure.z82;
import java.util.Arrays;

/* renamed from: com.onedelhi.secure.ah */
public final class C1696ah extends z82 {

    /* renamed from: a */
    public final long f9052a;

    /* renamed from: a */
    public final jo2 f9053a;

    /* renamed from: a */
    public final Integer f9054a;

    /* renamed from: a */
    public final String f9055a;

    /* renamed from: a */
    public final byte[] f9056a;

    /* renamed from: b */
    public final long f9057b;

    /* renamed from: c */
    public final long f9058c;

    /* renamed from: com.onedelhi.secure.ah$b */
    public static final class C1698b extends z82.C4049a {

        /* renamed from: a */
        public jo2 f9059a;

        /* renamed from: a */
        public Integer f9060a;

        /* renamed from: a */
        public Long f9061a;

        /* renamed from: a */
        public String f9062a;

        /* renamed from: a */
        public byte[] f9063a;

        /* renamed from: b */
        public Long f9064b;

        /* renamed from: c */
        public Long f9065c;

        /* renamed from: a */
        public z82 mo13076a() {
            String str = "";
            if (this.f9061a == null) {
                str = str + " eventTimeMs";
            }
            if (this.f9064b == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f9065c == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new C1696ah(this.f9061a.longValue(), this.f9060a, this.f9064b.longValue(), this.f9063a, this.f9062a, this.f9065c.longValue(), this.f9059a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public z82.C4049a mo13077b(@ts2 Integer num) {
            this.f9060a = num;
            return this;
        }

        /* renamed from: c */
        public z82.C4049a mo13078c(long j) {
            this.f9061a = Long.valueOf(j);
            return this;
        }

        /* renamed from: d */
        public z82.C4049a mo13079d(long j) {
            this.f9064b = Long.valueOf(j);
            return this;
        }

        /* renamed from: e */
        public z82.C4049a mo13080e(@ts2 jo2 jo2) {
            this.f9059a = jo2;
            return this;
        }

        /* renamed from: f */
        public z82.C4049a mo13081f(@ts2 byte[] bArr) {
            this.f9063a = bArr;
            return this;
        }

        /* renamed from: g */
        public z82.C4049a mo13082g(@ts2 String str) {
            this.f9062a = str;
            return this;
        }

        /* renamed from: h */
        public z82.C4049a mo13083h(long j) {
            this.f9065c = Long.valueOf(j);
            return this;
        }
    }

    public C1696ah(long j, @ts2 Integer num, long j2, @ts2 byte[] bArr, @ts2 String str, long j3, @ts2 jo2 jo2) {
        this.f9052a = j;
        this.f9054a = num;
        this.f9057b = j2;
        this.f9056a = bArr;
        this.f9055a = str;
        this.f9058c = j3;
        this.f9053a = jo2;
    }

    @ts2
    /* renamed from: b */
    public Integer mo13066b() {
        return this.f9054a;
    }

    /* renamed from: c */
    public long mo13067c() {
        return this.f9052a;
    }

    /* renamed from: d */
    public long mo13068d() {
        return this.f9057b;
    }

    @ts2
    /* renamed from: e */
    public jo2 mo13069e() {
        return this.f9053a;
    }

    public boolean equals(Object obj) {
        Integer num;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z82)) {
            return false;
        }
        z82 z82 = (z82) obj;
        if (this.f9052a == z82.mo13067c() && ((num = this.f9054a) != null ? num.equals(z82.mo13066b()) : z82.mo13066b() == null) && this.f9057b == z82.mo13068d()) {
            if (Arrays.equals(this.f9056a, z82 instanceof C1696ah ? ((C1696ah) z82).f9056a : z82.mo13071f()) && ((str = this.f9055a) != null ? str.equals(z82.mo13072g()) : z82.mo13072g() == null) && this.f9058c == z82.mo13073h()) {
                jo2 jo2 = this.f9053a;
                jo2 e = z82.mo13069e();
                if (jo2 == null) {
                    if (e == null) {
                        return true;
                    }
                } else if (jo2.equals(e)) {
                    return true;
                }
            }
        }
        return false;
    }

    @ts2
    /* renamed from: f */
    public byte[] mo13071f() {
        return this.f9056a;
    }

    @ts2
    /* renamed from: g */
    public String mo13072g() {
        return this.f9055a;
    }

    /* renamed from: h */
    public long mo13073h() {
        return this.f9058c;
    }

    public int hashCode() {
        long j = this.f9052a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f9054a;
        int i2 = 0;
        int hashCode = num == null ? 0 : num.hashCode();
        long j2 = this.f9057b;
        int hashCode2 = (((((i ^ hashCode) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f9056a)) * 1000003;
        String str = this.f9055a;
        int hashCode3 = str == null ? 0 : str.hashCode();
        long j3 = this.f9058c;
        int i3 = (((hashCode2 ^ hashCode3) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        jo2 jo2 = this.f9053a;
        if (jo2 != null) {
            i2 = jo2.hashCode();
        }
        return i3 ^ i2;
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f9052a + ", eventCode=" + this.f9054a + ", eventUptimeMs=" + this.f9057b + ", sourceExtension=" + Arrays.toString(this.f9056a) + ", sourceExtensionJsonProto3=" + this.f9055a + ", timezoneOffsetSeconds=" + this.f9058c + ", networkConnectionInfo=" + this.f9053a + "}";
    }
}
