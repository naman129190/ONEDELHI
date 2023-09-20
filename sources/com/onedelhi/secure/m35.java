package com.onedelhi.secure;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "AuthAccountResultCreator")
public final class m35 extends AbstractSafeParcelable implements Result {
    public static final Parcelable.Creator<m35> CREATOR = new r35();
    @SafeParcelable.Field(getter = "getRawAuthResolutionIntent", mo10053id = 3)
    @ts2

    /* renamed from: a */
    public Intent f15899a;
    @SafeParcelable.VersionField(mo10062id = 1)

    /* renamed from: n */
    public final int f15900n;
    @SafeParcelable.Field(getter = "getConnectionResultCode", mo10053id = 2)

    /* renamed from: o */
    public int f15901o;

    public m35() {
        this(2, 0, (Intent) null);
    }

    @SafeParcelable.Constructor
    public m35(@SafeParcelable.Param(mo10056id = 1) int i, @SafeParcelable.Param(mo10056id = 2) int i2, @SafeParcelable.Param(mo10056id = 3) @ts2 Intent intent) {
        this.f15900n = i;
        this.f15901o = i2;
        this.f15899a = intent;
    }

    public final Status getStatus() {
        return this.f15901o == 0 ? Status.RESULT_SUCCESS : Status.RESULT_CANCELED;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f15900n);
        SafeParcelWriter.writeInt(parcel, 2, this.f15901o);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f15899a, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
