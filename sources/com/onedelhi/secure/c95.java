package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "SaveRequestCreator")
@SafeParcelable.Reserved({1000})
public final class c95 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<c95> CREATOR = new e95();
    @SafeParcelable.Field(getter = "getCredential", mo10053id = 1)

    /* renamed from: a */
    public final Credential f10202a;

    @SafeParcelable.Constructor
    public c95(@SafeParcelable.Param(mo10056id = 1) Credential credential) {
        this.f10202a = credential;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.f10202a, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
