package com.onedelhi.secure;

import com.onedelhi.secure.pa0;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: com.onedelhi.secure.bg */
public final class C4669bg extends pa0.C6379e.C6381b {

    /* renamed from: a */
    public final String f26333a;

    /* renamed from: a */
    public final byte[] f26334a;

    /* renamed from: com.onedelhi.secure.bg$b */
    public static final class C4671b extends pa0.C6379e.C6381b.C6382a {

        /* renamed from: a */
        public String f26335a;

        /* renamed from: a */
        public byte[] f26336a;

        /* renamed from: a */
        public pa0.C6379e.C6381b mo31660a() {
            String str = "";
            if (this.f26335a == null) {
                str = str + " filename";
            }
            if (this.f26336a == null) {
                str = str + " contents";
            }
            if (str.isEmpty()) {
                return new C4669bg(this.f26335a, this.f26336a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public pa0.C6379e.C6381b.C6382a mo31661b(byte[] bArr) {
            Objects.requireNonNull(bArr, "Null contents");
            this.f26336a = bArr;
            return this;
        }

        /* renamed from: c */
        public pa0.C6379e.C6381b.C6382a mo31662c(String str) {
            Objects.requireNonNull(str, "Null filename");
            this.f26335a = str;
            return this;
        }
    }

    public C4669bg(String str, byte[] bArr) {
        this.f26333a = str;
        this.f26334a = bArr;
    }

    @mr2
    /* renamed from: b */
    public byte[] mo31655b() {
        return this.f26334a;
    }

    @mr2
    /* renamed from: c */
    public String mo31656c() {
        return this.f26333a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pa0.C6379e.C6381b)) {
            return false;
        }
        pa0.C6379e.C6381b bVar = (pa0.C6379e.C6381b) obj;
        if (this.f26333a.equals(bVar.mo31656c())) {
            if (Arrays.equals(this.f26334a, bVar instanceof C4669bg ? ((C4669bg) bVar).f26334a : bVar.mo31655b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f26333a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f26334a);
    }

    public String toString() {
        return "File{filename=" + this.f26333a + ", contents=" + Arrays.toString(this.f26334a) + "}";
    }
}
