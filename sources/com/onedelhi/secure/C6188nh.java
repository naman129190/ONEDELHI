package com.onedelhi.secure;

import com.onedelhi.secure.p34;
import java.util.Objects;

/* renamed from: com.onedelhi.secure.nh */
public final class C6188nh extends p34.C6362b {

    /* renamed from: a */
    public final int f32510a;

    /* renamed from: a */
    public final long f32511a;

    /* renamed from: a */
    public final String f32512a;

    /* renamed from: a */
    public final boolean f32513a;

    /* renamed from: b */
    public final int f32514b;

    /* renamed from: b */
    public final long f32515b;

    /* renamed from: b */
    public final String f32516b;

    /* renamed from: c */
    public final int f32517c;

    /* renamed from: c */
    public final String f32518c;

    public C6188nh(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        this.f32510a = i;
        Objects.requireNonNull(str, "Null model");
        this.f32512a = str;
        this.f32514b = i2;
        this.f32511a = j;
        this.f32515b = j2;
        this.f32513a = z;
        this.f32517c = i3;
        Objects.requireNonNull(str2, "Null manufacturer");
        this.f32516b = str2;
        Objects.requireNonNull(str3, "Null modelClass");
        this.f32518c = str3;
    }

    /* renamed from: a */
    public int mo41053a() {
        return this.f32510a;
    }

    /* renamed from: b */
    public int mo41054b() {
        return this.f32514b;
    }

    /* renamed from: d */
    public long mo41055d() {
        return this.f32515b;
    }

    /* renamed from: e */
    public boolean mo41056e() {
        return this.f32513a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p34.C6362b)) {
            return false;
        }
        p34.C6362b bVar = (p34.C6362b) obj;
        return this.f32510a == bVar.mo41053a() && this.f32512a.equals(bVar.mo41059g()) && this.f32514b == bVar.mo41054b() && this.f32511a == bVar.mo41063j() && this.f32515b == bVar.mo41055d() && this.f32513a == bVar.mo41056e() && this.f32517c == bVar.mo41062i() && this.f32516b.equals(bVar.mo41058f()) && this.f32518c.equals(bVar.mo41060h());
    }

    /* renamed from: f */
    public String mo41058f() {
        return this.f32516b;
    }

    /* renamed from: g */
    public String mo41059g() {
        return this.f32512a;
    }

    /* renamed from: h */
    public String mo41060h() {
        return this.f32518c;
    }

    public int hashCode() {
        long j = this.f32511a;
        long j2 = this.f32515b;
        return ((((((((((((((((this.f32510a ^ 1000003) * 1000003) ^ this.f32512a.hashCode()) * 1000003) ^ this.f32514b) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ (this.f32513a ? 1231 : 1237)) * 1000003) ^ this.f32517c) * 1000003) ^ this.f32516b.hashCode()) * 1000003) ^ this.f32518c.hashCode();
    }

    /* renamed from: i */
    public int mo41062i() {
        return this.f32517c;
    }

    /* renamed from: j */
    public long mo41063j() {
        return this.f32511a;
    }

    public String toString() {
        return "DeviceData{arch=" + this.f32510a + ", model=" + this.f32512a + ", availableProcessors=" + this.f32514b + ", totalRam=" + this.f32511a + ", diskSpace=" + this.f32515b + ", isEmulator=" + this.f32513a + ", state=" + this.f32517c + ", manufacturer=" + this.f32516b + ", modelClass=" + this.f32518c + "}";
    }
}
