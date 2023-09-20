package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "GoogleTunnelServerIdExtensionCreator")
public final class me5 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<me5> CREATOR = new xe5();
    @SafeParcelable.Field(getter = "getTunnelServerId", mo10053id = 1)
    @mr2

    /* renamed from: b */
    public final String f16083b;

    @SafeParcelable.Constructor
    public me5(@SafeParcelable.Param(mo10056id = 1) @mr2 String str) {
        this.f16083b = (String) Preconditions.checkNotNull(str);
    }

    public final boolean equals(@ts2 Object obj) {
        if (!(obj instanceof me5)) {
            return false;
        }
        return this.f16083b.equals(((me5) obj).f16083b);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f16083b);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f16083b, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
