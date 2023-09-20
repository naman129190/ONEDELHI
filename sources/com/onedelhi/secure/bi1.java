package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "GoogleThirdPartyPaymentExtensionCreator")
public class bi1 extends AbstractSafeParcelable {
    @mr2
    public static final Parcelable.Creator<bi1> CREATOR = new be5();
    @SafeParcelable.Field(getter = "getThirdPartyPayment", mo10053id = 1)
    @mr2

    /* renamed from: b */
    public final boolean f9831b;

    @SafeParcelable.Constructor
    public bi1(@SafeParcelable.Param(mo10056id = 1) boolean z) {
        this.f9831b = z;
    }

    /* renamed from: K2 */
    public boolean mo13722K2() {
        return this.f9831b;
    }

    public boolean equals(@ts2 Object obj) {
        return (obj instanceof bi1) && this.f9831b == ((bi1) obj).mo13722K2();
    }

    public int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.f9831b));
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, mo13722K2());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
