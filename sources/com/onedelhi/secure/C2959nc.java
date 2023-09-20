package com.onedelhi.secure;

import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;

@ShowFirstParty
@KeepForSdk
/* renamed from: com.onedelhi.secure.nc */
public final class C2959nc implements Api.ApiOptions.Optional {
    @mr2

    /* renamed from: a */
    public static final C2959nc f17298a = new C2959nc(new Bundle(), (rl5) null);

    /* renamed from: a */
    public final Bundle f17299a;

    public /* synthetic */ C2959nc(Bundle bundle, rl5 rl5) {
        this.f17299a = bundle;
    }

    @mr2
    /* renamed from: a */
    public final Bundle mo21071a() {
        return new Bundle(this.f17299a);
    }

    public final boolean equals(@ts2 Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2959nc)) {
            return false;
        }
        return Objects.checkBundlesEquality(this.f17299a, ((C2959nc) obj).f17299a);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f17299a);
    }
}
