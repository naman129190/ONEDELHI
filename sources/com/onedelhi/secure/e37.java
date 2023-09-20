package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "DevicePublicKeyExtensionCreator")
public final class e37 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<e37> CREATOR = new v37();
    @SafeParcelable.Field(getter = "getDevicePublicKey", mo10053id = 1)
    @mr2

    /* renamed from: b */
    public final boolean f11109b;

    @SafeParcelable.Constructor
    public e37(@SafeParcelable.Param(mo10056id = 1) @mr2 boolean z) {
        this.f11109b = ((Boolean) Preconditions.checkNotNull(Boolean.valueOf(z))).booleanValue();
    }

    public final boolean equals(@ts2 Object obj) {
        return (obj instanceof e37) && this.f11109b == ((e37) obj).f11109b;
    }

    public final int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.f11109b));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, this.f11109b);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
