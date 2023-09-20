package com.onedelhi.secure;

import com.onedelhi.secure.pr3;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.onedelhi.secure.gh */
public final class C2247gh extends pr3 {

    /* renamed from: a */
    public final C2106ez f12574a;

    /* renamed from: a */
    public final Map<d53, pr3.C3184b> f12575a;

    public C2247gh(C2106ez ezVar, Map<d53, pr3.C3184b> map) {
        Objects.requireNonNull(ezVar, "Null clock");
        this.f12574a = ezVar;
        Objects.requireNonNull(map, "Null values");
        this.f12575a = map;
    }

    /* renamed from: e */
    public C2106ez mo16570e() {
        return this.f12574a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pr3)) {
            return false;
        }
        pr3 pr3 = (pr3) obj;
        return this.f12574a.equals(pr3.mo16570e()) && this.f12575a.equals(pr3.mo16573i());
    }

    public int hashCode() {
        return ((this.f12574a.hashCode() ^ 1000003) * 1000003) ^ this.f12575a.hashCode();
    }

    /* renamed from: i */
    public Map<d53, pr3.C3184b> mo16573i() {
        return this.f12575a;
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f12574a + ", values=" + this.f12575a + "}";
    }
}
