package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "GoogleSessionIdExtensionCreator")
public final class cc5 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<cc5> CREATOR = new qc5();
    @SafeParcelable.Field(getter = "getSessionId", mo10053id = 1)
    @mr2

    /* renamed from: b */
    public final long f10222b;

    @SafeParcelable.Constructor
    public cc5(@SafeParcelable.Param(mo10056id = 1) @mr2 long j) {
        this.f10222b = ((Long) Preconditions.checkNotNull(Long.valueOf(j))).longValue();
    }

    public final boolean equals(@ts2 Object obj) {
        return (obj instanceof cc5) && this.f10222b == ((cc5) obj).f10222b;
    }

    public final int hashCode() {
        return Objects.hashCode(Long.valueOf(this.f10222b));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, this.f10222b);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
