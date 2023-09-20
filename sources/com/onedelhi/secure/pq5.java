package com.onedelhi.secure;

import com.google.android.gms.common.api.Status;
import com.onedelhi.secure.h73;

public final class pq5 implements h73.C2314a {

    /* renamed from: a */
    public final Status f18681a;

    /* renamed from: a */
    public o73 f18682a;

    public pq5(Status status) {
        this.f18681a = status;
    }

    public pq5(o73 o73) {
        this.f18682a = o73;
        this.f18681a = Status.RESULT_SUCCESS;
    }

    /* renamed from: b */
    public final o73 mo17129b() {
        return this.f18682a;
    }

    public final Status getStatus() {
        return this.f18681a;
    }
}
