package com.onedelhi.secure;

import java.util.List;
import java.util.Objects;

/* renamed from: com.onedelhi.secure.wg */
public final class C7167wg extends dl1 {

    /* renamed from: a */
    public final String f36983a;

    /* renamed from: a */
    public final List<String> f36984a;

    public C7167wg(String str, List<String> list) {
        Objects.requireNonNull(str, "Null userAgent");
        this.f36983a = str;
        Objects.requireNonNull(list, "Null usedDates");
        this.f36984a = list;
    }

    /* renamed from: b */
    public List<String> mo34495b() {
        return this.f36984a;
    }

    /* renamed from: c */
    public String mo34496c() {
        return this.f36983a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dl1)) {
            return false;
        }
        dl1 dl1 = (dl1) obj;
        return this.f36983a.equals(dl1.mo34496c()) && this.f36984a.equals(dl1.mo34495b());
    }

    public int hashCode() {
        return ((this.f36983a.hashCode() ^ 1000003) * 1000003) ^ this.f36984a.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.f36983a + ", usedDates=" + this.f36984a + "}";
    }
}
