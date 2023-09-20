package com.onedelhi.secure;

import com.onedelhi.secure.p34;
import java.util.Objects;

/* renamed from: com.onedelhi.secure.mh */
public final class C6114mh extends p34.C6361a {

    /* renamed from: a */
    public final int f32135a;

    /* renamed from: a */
    public final pk0 f32136a;

    /* renamed from: a */
    public final String f32137a;

    /* renamed from: b */
    public final String f32138b;

    /* renamed from: c */
    public final String f32139c;

    /* renamed from: d */
    public final String f32140d;

    public C6114mh(String str, String str2, String str3, String str4, int i, pk0 pk0) {
        Objects.requireNonNull(str, "Null appIdentifier");
        this.f32137a = str;
        Objects.requireNonNull(str2, "Null versionCode");
        this.f32138b = str2;
        Objects.requireNonNull(str3, "Null versionName");
        this.f32139c = str3;
        Objects.requireNonNull(str4, "Null installUuid");
        this.f32140d = str4;
        this.f32135a = i;
        Objects.requireNonNull(pk0, "Null developmentPlatformProvider");
        this.f32136a = pk0;
    }

    /* renamed from: a */
    public String mo40583a() {
        return this.f32137a;
    }

    /* renamed from: c */
    public int mo40584c() {
        return this.f32135a;
    }

    /* renamed from: d */
    public pk0 mo40585d() {
        return this.f32136a;
    }

    /* renamed from: e */
    public String mo40586e() {
        return this.f32140d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p34.C6361a)) {
            return false;
        }
        p34.C6361a aVar = (p34.C6361a) obj;
        return this.f32137a.equals(aVar.mo40583a()) && this.f32138b.equals(aVar.mo40588f()) && this.f32139c.equals(aVar.mo40589g()) && this.f32140d.equals(aVar.mo40586e()) && this.f32135a == aVar.mo40584c() && this.f32136a.equals(aVar.mo40585d());
    }

    /* renamed from: f */
    public String mo40588f() {
        return this.f32138b;
    }

    /* renamed from: g */
    public String mo40589g() {
        return this.f32139c;
    }

    public int hashCode() {
        return ((((((((((this.f32137a.hashCode() ^ 1000003) * 1000003) ^ this.f32138b.hashCode()) * 1000003) ^ this.f32139c.hashCode()) * 1000003) ^ this.f32140d.hashCode()) * 1000003) ^ this.f32135a) * 1000003) ^ this.f32136a.hashCode();
    }

    public String toString() {
        return "AppData{appIdentifier=" + this.f32137a + ", versionCode=" + this.f32138b + ", versionName=" + this.f32139c + ", installUuid=" + this.f32140d + ", deliveryMechanism=" + this.f32135a + ", developmentPlatformProvider=" + this.f32136a + "}";
    }
}
