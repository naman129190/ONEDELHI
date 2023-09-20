package com.onedelhi.secure;

import java.util.Arrays;
import java.util.Objects;

public final class xt0 {

    /* renamed from: a */
    public final hu0 f22768a;

    /* renamed from: a */
    public final byte[] f22769a;

    public xt0(@mr2 hu0 hu0, @mr2 byte[] bArr) {
        Objects.requireNonNull(hu0, "encoding is null");
        Objects.requireNonNull(bArr, "bytes is null");
        this.f22768a = hu0;
        this.f22769a = bArr;
    }

    /* renamed from: a */
    public byte[] mo27087a() {
        return this.f22769a;
    }

    /* renamed from: b */
    public hu0 mo27088b() {
        return this.f22768a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xt0)) {
            return false;
        }
        xt0 xt0 = (xt0) obj;
        if (!this.f22768a.equals(xt0.f22768a)) {
            return false;
        }
        return Arrays.equals(this.f22769a, xt0.f22769a);
    }

    public int hashCode() {
        return ((this.f22768a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f22769a);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f22768a + ", bytes=[...]}";
    }
}
