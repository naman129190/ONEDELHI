package com.onedelhi.secure;

import java.util.Objects;

/* renamed from: com.onedelhi.secure.ih */
public final class C5725ih extends os3 {

    /* renamed from: b */
    public final long f30330b;

    /* renamed from: b */
    public final String f30331b;

    public C5725ih(String str, long j) {
        Objects.requireNonNull(str, "Null sdkName");
        this.f30331b = str;
        this.f30330b = j;
    }

    /* renamed from: e */
    public long mo38090e() {
        return this.f30330b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof os3)) {
            return false;
        }
        os3 os3 = (os3) obj;
        return this.f30331b.equals(os3.mo38092g()) && this.f30330b == os3.mo38090e();
    }

    /* renamed from: g */
    public String mo38092g() {
        return this.f30331b;
    }

    public int hashCode() {
        long j = this.f30330b;
        return ((this.f30331b.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "SdkHeartBeatResult{sdkName=" + this.f30331b + ", millis=" + this.f30330b + "}";
    }
}
