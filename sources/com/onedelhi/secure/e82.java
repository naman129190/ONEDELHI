package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "LocationSettingsResultCreator")
@SafeParcelable.Reserved({1000})
public final class e82 extends AbstractSafeParcelable implements Result {
    @mr2
    public static final Parcelable.Creator<e82> CREATOR = new nb5();
    @SafeParcelable.Field(getter = "getStatus", mo10053id = 1)

    /* renamed from: a */
    public final Status f11149a;
    @SafeParcelable.Field(getter = "getLocationSettingsStates", mo10053id = 2)
    @ts2

    /* renamed from: a */
    public final f82 f11150a;

    @SafeParcelable.Constructor
    public e82(@SafeParcelable.Param(mo10056id = 1) @mr2 Status status, @SafeParcelable.Param(mo10056id = 2) @ts2 f82 f82) {
        this.f11149a = status;
        this.f11150a = f82;
    }

    @ts2
    /* renamed from: K2 */
    public f82 mo15087K2() {
        return this.f11150a;
    }

    @mr2
    public Status getStatus() {
        return this.f11149a;
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getStatus(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 2, mo15087K2(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
