package com.onedelhi.secure;

import android.os.Bundle;
import com.onedelhi.secure.C1767b9;

public final class h66 implements C1767b9.C1770c {

    /* renamed from: a */
    public final /* synthetic */ fa6 f29533a;

    public h66(fa6 fa6) {
        this.f29533a = fa6;
    }

    /* renamed from: a */
    public final void mo10736a(String str, String str2, Bundle bundle, long j) {
        if (str != null && is5.m52648c(str2)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("name", str2);
            bundle2.putLong("timestampInMillis", j);
            bundle2.putBundle(ba0.f26252c, bundle);
            this.f29533a.f28238a.mo31408a(3, bundle2);
        }
    }
}
