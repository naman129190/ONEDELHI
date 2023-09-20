package com.onedelhi.secure;

import com.onedelhi.secure.kr1;
import java.util.Objects;

/* renamed from: com.onedelhi.secure.yg */
public final class C7347yg extends kr1 {

    /* renamed from: a */
    public final long f37895a;

    /* renamed from: a */
    public final String f37896a;

    /* renamed from: b */
    public final long f37897b;

    /* renamed from: com.onedelhi.secure.yg$b */
    public static final class C7349b extends kr1.C5933a {

        /* renamed from: a */
        public Long f37898a;

        /* renamed from: a */
        public String f37899a;

        /* renamed from: b */
        public Long f37900b;

        public C7349b() {
        }

        public C7349b(kr1 kr1) {
            this.f37899a = kr1.mo39411b();
            this.f37898a = Long.valueOf(kr1.mo39413d());
            this.f37900b = Long.valueOf(kr1.mo39412c());
        }

        /* renamed from: a */
        public kr1 mo39415a() {
            String str = "";
            if (this.f37899a == null) {
                str = str + " token";
            }
            if (this.f37898a == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.f37900b == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new C7347yg(this.f37899a, this.f37898a.longValue(), this.f37900b.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public kr1.C5933a mo39416b(String str) {
            Objects.requireNonNull(str, "Null token");
            this.f37899a = str;
            return this;
        }

        /* renamed from: c */
        public kr1.C5933a mo39417c(long j) {
            this.f37900b = Long.valueOf(j);
            return this;
        }

        /* renamed from: d */
        public kr1.C5933a mo39418d(long j) {
            this.f37898a = Long.valueOf(j);
            return this;
        }
    }

    public C7347yg(String str, long j, long j2) {
        this.f37896a = str;
        this.f37895a = j;
        this.f37897b = j2;
    }

    @mr2
    /* renamed from: b */
    public String mo39411b() {
        return this.f37896a;
    }

    @mr2
    /* renamed from: c */
    public long mo39412c() {
        return this.f37897b;
    }

    @mr2
    /* renamed from: d */
    public long mo39413d() {
        return this.f37895a;
    }

    /* renamed from: e */
    public kr1.C5933a mo39414e() {
        return new C7349b(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kr1)) {
            return false;
        }
        kr1 kr1 = (kr1) obj;
        return this.f37896a.equals(kr1.mo39411b()) && this.f37895a == kr1.mo39413d() && this.f37897b == kr1.mo39412c();
    }

    public int hashCode() {
        long j = this.f37895a;
        long j2 = this.f37897b;
        return ((((this.f37896a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f37896a + ", tokenExpirationTimestamp=" + this.f37895a + ", tokenCreationTimestamp=" + this.f37897b + "}";
    }
}
