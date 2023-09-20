package com.onedelhi.secure;

import com.onedelhi.secure.C2631ki;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: com.onedelhi.secure.qf */
public final class C3291qf extends C2631ki {

    /* renamed from: a */
    public final Iterable<uv0> f19094a;

    /* renamed from: a */
    public final byte[] f19095a;

    /* renamed from: com.onedelhi.secure.qf$b */
    public static final class C3293b extends C2631ki.C2632a {

        /* renamed from: a */
        public Iterable<uv0> f19096a;

        /* renamed from: a */
        public byte[] f19097a;

        /* renamed from: a */
        public C2631ki mo19072a() {
            String str = "";
            if (this.f19096a == null) {
                str = str + " events";
            }
            if (str.isEmpty()) {
                return new C3291qf(this.f19096a, this.f19097a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C2631ki.C2632a mo19073b(Iterable<uv0> iterable) {
            Objects.requireNonNull(iterable, "Null events");
            this.f19096a = iterable;
            return this;
        }

        /* renamed from: c */
        public C2631ki.C2632a mo19074c(@ts2 byte[] bArr) {
            this.f19097a = bArr;
            return this;
        }
    }

    public C3291qf(Iterable<uv0> iterable, @ts2 byte[] bArr) {
        this.f19094a = iterable;
        this.f19095a = bArr;
    }

    /* renamed from: c */
    public Iterable<uv0> mo19070c() {
        return this.f19094a;
    }

    @ts2
    /* renamed from: d */
    public byte[] mo19071d() {
        return this.f19095a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2631ki)) {
            return false;
        }
        C2631ki kiVar = (C2631ki) obj;
        if (this.f19094a.equals(kiVar.mo19070c())) {
            if (Arrays.equals(this.f19095a, kiVar instanceof C3291qf ? ((C3291qf) kiVar).f19095a : kiVar.mo19071d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f19094a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f19095a);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f19094a + ", extras=" + Arrays.toString(this.f19095a) + "}";
    }
}
