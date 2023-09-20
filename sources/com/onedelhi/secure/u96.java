package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "FusedLocationProviderResultCreator")
@SafeParcelable.Reserved({1000})
public final class u96 extends AbstractSafeParcelable implements Result {
    public static final Parcelable.Creator<u96> CREATOR = new qd6();

    /* renamed from: a */
    public static final u96 f21278a = new u96(Status.RESULT_SUCCESS);
    @SafeParcelable.Field(getter = "getStatus", mo10053id = 1)

    /* renamed from: a */
    public final Status f21279a;

    @SafeParcelable.Constructor
    public u96(@SafeParcelable.Param(mo10056id = 1) Status status) {
        this.f21279a = status;
    }

    public final Status getStatus() {
        return this.f21279a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.f21279a, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
