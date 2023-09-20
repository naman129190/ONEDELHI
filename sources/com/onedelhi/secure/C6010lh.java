package com.onedelhi.secure;

import com.onedelhi.secure.p34;
import java.util.Objects;

/* renamed from: com.onedelhi.secure.lh */
public final class C6010lh extends p34 {

    /* renamed from: a */
    public final p34.C6361a f31660a;

    /* renamed from: a */
    public final p34.C6362b f31661a;

    /* renamed from: a */
    public final p34.C6363c f31662a;

    public C6010lh(p34.C6361a aVar, p34.C6363c cVar, p34.C6362b bVar) {
        Objects.requireNonNull(aVar, "Null appData");
        this.f31660a = aVar;
        Objects.requireNonNull(cVar, "Null osData");
        this.f31662a = cVar;
        Objects.requireNonNull(bVar, "Null deviceData");
        this.f31661a = bVar;
    }

    /* renamed from: a */
    public p34.C6361a mo39847a() {
        return this.f31660a;
    }

    /* renamed from: c */
    public p34.C6362b mo39848c() {
        return this.f31661a;
    }

    /* renamed from: d */
    public p34.C6363c mo39849d() {
        return this.f31662a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p34)) {
            return false;
        }
        p34 p34 = (p34) obj;
        return this.f31660a.equals(p34.mo39847a()) && this.f31662a.equals(p34.mo39849d()) && this.f31661a.equals(p34.mo39848c());
    }

    public int hashCode() {
        return ((((this.f31660a.hashCode() ^ 1000003) * 1000003) ^ this.f31662a.hashCode()) * 1000003) ^ this.f31661a.hashCode();
    }

    public String toString() {
        return "StaticSessionData{appData=" + this.f31660a + ", osData=" + this.f31662a + ", deviceData=" + this.f31661a + "}";
    }
}
