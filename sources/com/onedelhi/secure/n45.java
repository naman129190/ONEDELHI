package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@SafeParcelable.Class(creator = "RecordConsentByConsentResultResponseCreator")
public final class n45 extends AbstractSafeParcelable implements Result {
    public static final Parcelable.Creator<n45> CREATOR = new q45();
    @SafeParcelable.Field(getter = "getGrantedScopes", mo10053id = 1)

    /* renamed from: a */
    public final List f17098a;
    @SafeParcelable.Field(getter = "getToken", mo10053id = 2)
    @ts2

    /* renamed from: b */
    public final String f17099b;

    @SafeParcelable.Constructor
    public n45(@SafeParcelable.Param(mo10056id = 1) List list, @SafeParcelable.Param(mo10056id = 2) @ts2 String str) {
        this.f17098a = list;
        this.f17099b = str;
    }

    public final Status getStatus() {
        return this.f17099b != null ? Status.RESULT_SUCCESS : Status.RESULT_CANCELED;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeStringList(parcel, 1, this.f17098a, false);
        SafeParcelWriter.writeString(parcel, 2, this.f17099b, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
