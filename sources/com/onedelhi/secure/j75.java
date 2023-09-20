package com.onedelhi.secure;

import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

public final class j75 implements lb0 {
    @ts2

    /* renamed from: a */
    public final Credential f14036a;

    /* renamed from: a */
    public final Status f14037a;

    public j75(Status status, @ts2 Credential credential) {
        this.f14037a = status;
        this.f14036a = credential;
    }

    @ts2
    /* renamed from: R0 */
    public final Credential mo18157R0() {
        return this.f14036a;
    }

    public final Status getStatus() {
        return this.f14037a;
    }
}
