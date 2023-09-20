package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

@SafeParcelable.Class(creator = "AuthenticationExtensionsPrfOutputsCreator")
public final class de6 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<de6> CREATOR = new uh6();
    @SafeParcelable.Field(getter = "getOutputs", mo10053id = 2)
    @ts2

    /* renamed from: a */
    public final byte[] f10718a;
    @SafeParcelable.Field(getter = "getSupported", mo10053id = 1)

    /* renamed from: b */
    public final boolean f10719b;

    @SafeParcelable.Constructor
    public de6(@SafeParcelable.Param(mo10056id = 1) @mr2 boolean z, @SafeParcelable.Param(mo10056id = 2) @ts2 byte[] bArr) {
        this.f10719b = z;
        this.f10718a = bArr;
    }

    public final boolean equals(@ts2 Object obj) {
        if (!(obj instanceof de6)) {
            return false;
        }
        de6 de6 = (de6) obj;
        return this.f10719b == de6.f10719b && Arrays.equals(this.f10718a, de6.f10718a);
    }

    public final int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.f10719b), this.f10718a);
    }

    public final void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, this.f10719b);
        SafeParcelWriter.writeByteArray(parcel, 2, this.f10718a, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
