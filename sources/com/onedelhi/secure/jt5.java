package com.onedelhi.secure;

import android.content.Context;
import java.util.Objects;
import javax.annotation.Nullable;

public final class jt5 extends ay5 {

    /* renamed from: a */
    public final Context f14564a;

    /* renamed from: a */
    public final kz5 f14565a;

    public jt5(Context context, @Nullable kz5 kz5) {
        Objects.requireNonNull(context, "Null context");
        this.f14564a = context;
        this.f14565a = kz5;
    }

    /* renamed from: a */
    public final Context mo13328a() {
        return this.f14564a;
    }

    @Nullable
    /* renamed from: b */
    public final kz5 mo13329b() {
        return this.f14565a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ay5) {
            ay5 ay5 = (ay5) obj;
            if (this.f14564a.equals(ay5.mo13328a())) {
                kz5 kz5 = this.f14565a;
                kz5 b = ay5.mo13329b();
                if (kz5 != null ? kz5.equals(b) : b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f14564a.hashCode() ^ 1000003) * 1000003;
        kz5 kz5 = this.f14565a;
        return hashCode ^ (kz5 == null ? 0 : kz5.hashCode());
    }

    public final String toString() {
        String obj = this.f14564a.toString();
        String valueOf = String.valueOf(this.f14565a);
        return "FlagsContext{context=" + obj + ", hermeticFileOverrides=" + valueOf + "}";
    }
}
