package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

@SafeParcelable.Class(creator = "CableAuthenticationDataCreator")
public final class zy6 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zy6> CREATOR = new r07();
    @SafeParcelable.Field(getter = "getClientEid", mo10053id = 2)
    @mr2

    /* renamed from: a */
    public final byte[] f23992a;
    @SafeParcelable.Field(getter = "getVersion", mo10053id = 1)

    /* renamed from: b */
    public final long f23993b;
    @SafeParcelable.Field(getter = "getAuthenticatorEid", mo10053id = 3)
    @mr2

    /* renamed from: b */
    public final byte[] f23994b;
    @SafeParcelable.Field(getter = "getSessionPreKey", mo10053id = 4)
    @mr2

    /* renamed from: c */
    public final byte[] f23995c;

    @SafeParcelable.Constructor
    public zy6(@SafeParcelable.Param(mo10056id = 1) long j, @SafeParcelable.Param(mo10056id = 2) @mr2 byte[] bArr, @SafeParcelable.Param(mo10056id = 3) @mr2 byte[] bArr2, @SafeParcelable.Param(mo10056id = 4) @mr2 byte[] bArr3) {
        this.f23993b = j;
        this.f23992a = (byte[]) Preconditions.checkNotNull(bArr);
        this.f23994b = (byte[]) Preconditions.checkNotNull(bArr2);
        this.f23995c = (byte[]) Preconditions.checkNotNull(bArr3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zy6)) {
            return false;
        }
        zy6 zy6 = (zy6) obj;
        return this.f23993b == zy6.f23993b && Arrays.equals(this.f23992a, zy6.f23992a) && Arrays.equals(this.f23994b, zy6.f23994b) && Arrays.equals(this.f23995c, zy6.f23995c);
    }

    public final int hashCode() {
        return Objects.hashCode(Long.valueOf(this.f23993b), this.f23992a, this.f23994b, this.f23995c);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, this.f23993b);
        SafeParcelWriter.writeByteArray(parcel, 2, this.f23992a, false);
        SafeParcelWriter.writeByteArray(parcel, 3, this.f23994b, false);
        SafeParcelWriter.writeByteArray(parcel, 4, this.f23995c, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
