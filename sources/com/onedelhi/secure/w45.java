package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zav;

@SafeParcelable.Class(creator = "SignInResponseCreator")
public final class w45 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<w45> CREATOR = new y45();
    @SafeParcelable.Field(getter = "getConnectionResult", mo10053id = 2)

    /* renamed from: a */
    public final ConnectionResult f22043a;
    @SafeParcelable.Field(getter = "getResolveAccountResponse", mo10053id = 3)
    @ts2

    /* renamed from: a */
    public final zav f22044a;
    @SafeParcelable.VersionField(mo10062id = 1)

    /* renamed from: n */
    public final int f22045n;

    @SafeParcelable.Constructor
    public w45(@SafeParcelable.Param(mo10056id = 1) int i, @SafeParcelable.Param(mo10056id = 2) ConnectionResult connectionResult, @SafeParcelable.Param(mo10056id = 3) @ts2 zav zav) {
        this.f22045n = i;
        this.f22043a = connectionResult;
        this.f22044a = zav;
    }

    @ts2
    /* renamed from: K2 */
    public final zav mo26438K2() {
        return this.f22044a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f22045n);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f22043a, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f22044a, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final ConnectionResult zaa() {
        return this.f22043a;
    }
}
