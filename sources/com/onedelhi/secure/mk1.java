package com.onedelhi.secure;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;

@KeepForSdk
public class mk1 {
    @VisibleForTesting

    /* renamed from: b */
    public static int f16165b = 31;

    /* renamed from: a */
    public int f16166a = 1;

    @mr2
    @KeepForSdk
    @C7277xt
    /* renamed from: a */
    public mk1 mo20455a(@ts2 Object obj) {
        this.f16166a = (f16165b * this.f16166a) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    @KeepForSdk
    /* renamed from: b */
    public int mo20456b() {
        return this.f16166a;
    }

    @mr2
    @C7277xt
    /* renamed from: c */
    public final mk1 mo20457c(boolean z) {
        this.f16166a = (f16165b * this.f16166a) + (z ? 1 : 0);
        return this;
    }
}
