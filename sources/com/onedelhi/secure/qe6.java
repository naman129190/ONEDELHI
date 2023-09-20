package com.onedelhi.secure;

import android.content.Context;
import javax.annotation.Nullable;

public final class qe6 extends fh6 {

    /* renamed from: a */
    public final Context f19092a;

    /* renamed from: a */
    public final aj6 f19093a;

    public qe6(Context context, @Nullable aj6 aj6) {
        this.f19092a = context;
        this.f19093a = aj6;
    }

    /* renamed from: a */
    public final Context mo15954a() {
        return this.f19092a;
    }

    @Nullable
    /* renamed from: b */
    public final aj6 mo15955b() {
        return this.f19093a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fh6) {
            fh6 fh6 = (fh6) obj;
            if (this.f19092a.equals(fh6.mo15954a())) {
                aj6 aj6 = this.f19093a;
                aj6 b = fh6.mo15955b();
                if (aj6 != null ? aj6.equals(b) : b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f19092a.hashCode() ^ 1000003;
        aj6 aj6 = this.f19093a;
        return (hashCode * 1000003) ^ (aj6 == null ? 0 : aj6.hashCode());
    }

    public final String toString() {
        String obj = this.f19092a.toString();
        String valueOf = String.valueOf(this.f19093a);
        return "FlagsContext{context=" + obj + ", hermeticFileOverrides=" + valueOf + "}";
    }
}
