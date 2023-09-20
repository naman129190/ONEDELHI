package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "NotifyCompletionRequestCreator")
public final class jj5 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<jj5> CREATOR = new rj5();
    @SafeParcelable.Field(mo10053id = 2)

    /* renamed from: b */
    public final String f14196b;
    @SafeParcelable.VersionField(mo10062id = 1)

    /* renamed from: n */
    public final int f14197n;
    @SafeParcelable.Field(mo10053id = 3)

    /* renamed from: o */
    public final int f14198o;

    @SafeParcelable.Constructor
    public jj5(@SafeParcelable.Param(mo10056id = 1) int i, @SafeParcelable.Param(mo10056id = 2) String str, @SafeParcelable.Param(mo10056id = 3) int i2) {
        this.f14197n = 1;
        this.f14196b = (String) Preconditions.checkNotNull(str);
        this.f14198o = i2;
    }

    public jj5(String str, int i) {
        this(1, str, i);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f14197n);
        SafeParcelWriter.writeString(parcel, 2, this.f14196b, false);
        SafeParcelWriter.writeInt(parcel, 3, this.f14198o);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
