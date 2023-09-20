package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "UserVerificationMethodExtensionCreator")
public class dq4 extends AbstractSafeParcelable {
    @mr2
    public static final Parcelable.Creator<dq4> CREATOR = new qj5();
    @SafeParcelable.Field(getter = "getUvm", mo10053id = 1)
    @mr2

    /* renamed from: b */
    public final boolean f10885b;

    @SafeParcelable.Constructor
    public dq4(@SafeParcelable.Param(mo10056id = 1) @mr2 boolean z) {
        this.f10885b = z;
    }

    /* renamed from: K2 */
    public boolean mo14812K2() {
        return this.f10885b;
    }

    public boolean equals(@ts2 Object obj) {
        return (obj instanceof dq4) && this.f10885b == ((dq4) obj).f10885b;
    }

    public int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.f10885b));
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, mo14812K2());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
