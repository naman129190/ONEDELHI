package com.onedelhi.secure;

import android.os.WorkSource;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;

@ShowFirstParty
public final class fa5 {

    /* renamed from: a */
    public long f11999a = Long.MIN_VALUE;

    /* renamed from: a */
    public final fa5 mo15908a(long j) {
        Preconditions.checkArgument(j >= 0, "intervalMillis can't be negative.");
        this.f11999a = j;
        return this;
    }

    /* renamed from: b */
    public final jl5 mo15909b() {
        Preconditions.checkState(this.f11999a != Long.MIN_VALUE, "Must set intervalMillis.");
        return new jl5(this.f11999a, true, (WorkSource) null, (String) null, (int[]) null, false, (String) null, 0, (String) null);
    }
}
