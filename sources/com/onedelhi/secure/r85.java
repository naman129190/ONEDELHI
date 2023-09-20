package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "DeleteRequestCreator")
@SafeParcelable.Reserved({1000})
public final class r85 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<r85> CREATOR = new u85();
    @SafeParcelable.Field(getter = "getCredential", mo10053id = 1)

    /* renamed from: a */
    public final Credential f19687a;

    @SafeParcelable.Constructor
    public r85(@SafeParcelable.Param(mo10056id = 1) Credential credential) {
        this.f19687a = credential;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.f19687a, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
