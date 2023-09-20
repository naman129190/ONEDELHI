package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "GoogleMultiAssertionExtensionCreator")
public final class e67 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<e67> CREATOR = new fb5();
    @SafeParcelable.Field(getter = "getRequestForMultiAssertion", mo10053id = 1)
    @mr2

    /* renamed from: b */
    public final boolean f11127b;

    @SafeParcelable.Constructor
    public e67(@SafeParcelable.Param(mo10056id = 1) @mr2 boolean z) {
        this.f11127b = ((Boolean) Preconditions.checkNotNull(Boolean.valueOf(z))).booleanValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof e67) && this.f11127b == ((e67) obj).f11127b;
    }

    public final int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.f11127b));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, this.f11127b);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
