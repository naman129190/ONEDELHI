package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "GoogleSilentVerificationExtensionCreator")
public final class dd5 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<dd5> CREATOR = new pd5();
    @SafeParcelable.Field(getter = "getSilentVerification", mo10053id = 1)
    @mr2

    /* renamed from: b */
    public final boolean f10715b;

    @SafeParcelable.Constructor
    public dd5(@SafeParcelable.Param(mo10056id = 1) @mr2 boolean z) {
        this.f10715b = ((Boolean) Preconditions.checkNotNull(Boolean.valueOf(z))).booleanValue();
    }

    public final boolean equals(@ts2 Object obj) {
        return (obj instanceof dd5) && this.f10715b == ((dd5) obj).f10715b;
    }

    public final int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.f10715b));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, this.f10715b);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
