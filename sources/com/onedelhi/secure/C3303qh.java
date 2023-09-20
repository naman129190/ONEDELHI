package com.onedelhi.secure;

import com.onedelhi.secure.hl3;
import com.onedelhi.secure.xh4;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: com.onedelhi.secure.qh */
public final class C3303qh extends xh4 {

    /* renamed from: a */
    public final d53 f19171a;

    /* renamed from: a */
    public final String f19172a;

    /* renamed from: a */
    public final byte[] f19173a;

    /* renamed from: com.onedelhi.secure.qh$b */
    public static final class C3305b extends xh4.C3922a {

        /* renamed from: a */
        public d53 f19174a;

        /* renamed from: a */
        public String f19175a;

        /* renamed from: a */
        public byte[] f19176a;

        /* renamed from: a */
        public xh4 mo23182a() {
            String str = "";
            if (this.f19175a == null) {
                str = str + " backendName";
            }
            if (this.f19174a == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new C3303qh(this.f19175a, this.f19176a, this.f19174a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public xh4.C3922a mo23183b(String str) {
            Objects.requireNonNull(str, "Null backendName");
            this.f19175a = str;
            return this;
        }

        /* renamed from: c */
        public xh4.C3922a mo23184c(@ts2 byte[] bArr) {
            this.f19176a = bArr;
            return this;
        }

        /* renamed from: d */
        public xh4.C3922a mo23185d(d53 d53) {
            Objects.requireNonNull(d53, "Null priority");
            this.f19174a = d53;
            return this;
        }
    }

    public C3303qh(String str, @ts2 byte[] bArr, d53 d53) {
        this.f19172a = str;
        this.f19173a = bArr;
        this.f19171a = d53;
    }

    /* renamed from: b */
    public String mo23177b() {
        return this.f19172a;
    }

    @ts2
    /* renamed from: c */
    public byte[] mo23178c() {
        return this.f19173a;
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP})
    /* renamed from: d */
    public d53 mo23179d() {
        return this.f19171a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xh4)) {
            return false;
        }
        xh4 xh4 = (xh4) obj;
        if (this.f19172a.equals(xh4.mo23177b())) {
            return Arrays.equals(this.f19173a, xh4 instanceof C3303qh ? ((C3303qh) xh4).f19173a : xh4.mo23178c()) && this.f19171a.equals(xh4.mo23179d());
        }
    }

    public int hashCode() {
        return ((((this.f19172a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f19173a)) * 1000003) ^ this.f19171a.hashCode();
    }
}
