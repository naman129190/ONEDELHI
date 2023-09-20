package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

@SafeParcelable.Class(creator = "AuthenticationExtensionsDevicePublicKeyOutputsCreator")
public final class l66 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<l66> CREATOR = new ja6();
    @SafeParcelable.Field(getter = "getSignature", mo10053id = 1)
    @ts2

    /* renamed from: a */
    public final byte[] f15172a;
    @SafeParcelable.Field(getter = "getAuthenticatorOutput", mo10053id = 2)
    @ts2

    /* renamed from: b */
    public final byte[] f15173b;

    @SafeParcelable.Constructor
    public l66(@SafeParcelable.Param(mo10056id = 1) @ts2 byte[] bArr, @SafeParcelable.Param(mo10056id = 2) @ts2 byte[] bArr2) {
        this.f15172a = bArr;
        this.f15173b = bArr2;
    }

    public final boolean equals(@ts2 Object obj) {
        if (!(obj instanceof l66)) {
            return false;
        }
        l66 l66 = (l66) obj;
        return Arrays.equals(this.f15172a, l66.f15172a) && Arrays.equals(this.f15173b, l66.f15173b);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f15172a, this.f15173b);
    }

    public final void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 1, this.f15172a, false);
        SafeParcelWriter.writeByteArray(parcel, 2, this.f15173b, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
