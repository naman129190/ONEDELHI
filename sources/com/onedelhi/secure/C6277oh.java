package com.onedelhi.secure;

import com.onedelhi.secure.p34;
import java.util.Objects;

/* renamed from: com.onedelhi.secure.oh */
public final class C6277oh extends p34.C6363c {

    /* renamed from: a */
    public final String f33031a;

    /* renamed from: a */
    public final boolean f33032a;

    /* renamed from: b */
    public final String f33033b;

    public C6277oh(String str, String str2, boolean z) {
        Objects.requireNonNull(str, "Null osRelease");
        this.f33031a = str;
        Objects.requireNonNull(str2, "Null osCodeName");
        this.f33033b = str2;
        this.f33032a = z;
    }

    /* renamed from: b */
    public boolean mo41779b() {
        return this.f33032a;
    }

    /* renamed from: c */
    public String mo41780c() {
        return this.f33033b;
    }

    /* renamed from: d */
    public String mo41781d() {
        return this.f33031a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p34.C6363c)) {
            return false;
        }
        p34.C6363c cVar = (p34.C6363c) obj;
        return this.f33031a.equals(cVar.mo41781d()) && this.f33033b.equals(cVar.mo41780c()) && this.f33032a == cVar.mo41779b();
    }

    public int hashCode() {
        return ((((this.f33031a.hashCode() ^ 1000003) * 1000003) ^ this.f33033b.hashCode()) * 1000003) ^ (this.f33032a ? 1231 : 1237);
    }

    public String toString() {
        return "OsData{osRelease=" + this.f33031a + ", osCodeName=" + this.f33033b + ", isRooted=" + this.f33032a + "}";
    }
}
