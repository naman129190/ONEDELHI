package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "SendDataRequestCreator")
public final class pk5 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<pk5> CREATOR = new dm5();
    @SafeParcelable.Field(mo10053id = 3)

    /* renamed from: a */
    public final byte[] f18601a;
    @SafeParcelable.Field(mo10053id = 2)

    /* renamed from: b */
    public final String f18602b;
    @SafeParcelable.VersionField(mo10062id = 1)

    /* renamed from: n */
    public final int f18603n;

    @SafeParcelable.Constructor
    public pk5(@SafeParcelable.Param(mo10056id = 1) int i, @SafeParcelable.Param(mo10056id = 2) String str, @SafeParcelable.Param(mo10056id = 3) byte[] bArr) {
        this.f18603n = 1;
        this.f18602b = (String) Preconditions.checkNotNull(str);
        this.f18601a = (byte[]) Preconditions.checkNotNull(bArr);
    }

    public pk5(String str, byte[] bArr) {
        this(1, str, bArr);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f18603n);
        SafeParcelWriter.writeString(parcel, 2, this.f18602b, false);
        SafeParcelWriter.writeByteArray(parcel, 3, this.f18601a, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
