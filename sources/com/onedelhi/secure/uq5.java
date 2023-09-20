package com.onedelhi.secure;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.onedelhi.secure.h73;
import javax.annotation.Nonnull;

public final class uq5 implements h73.C2315b {

    /* renamed from: a */
    public final Status f21477a;

    /* renamed from: b */
    public final String f21478b;

    public uq5(@Nonnull Status status) {
        this.f21477a = (Status) Preconditions.checkNotNull(status);
        this.f21478b = "";
    }

    public uq5(@Nonnull String str) {
        this.f21478b = (String) Preconditions.checkNotNull(str);
        this.f21477a = Status.RESULT_SUCCESS;
    }

    public final Status getStatus() {
        return this.f21477a;
    }

    /* renamed from: l1 */
    public final String mo17130l1() {
        return this.f21478b;
    }
}
