package com.onedelhi.secure;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "UserChallengeRequestCreator")
public final class pm5 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<pm5> CREATOR = new vm5();
    @SafeParcelable.Field(mo10053id = 3)

    /* renamed from: a */
    public final PendingIntent f18615a;
    @SafeParcelable.Field(mo10053id = 2)

    /* renamed from: b */
    public final String f18616b;
    @SafeParcelable.VersionField(mo10062id = 1)

    /* renamed from: n */
    public final int f18617n;

    @SafeParcelable.Constructor
    public pm5(@SafeParcelable.Param(mo10056id = 1) int i, @SafeParcelable.Param(mo10056id = 2) String str, @SafeParcelable.Param(mo10056id = 3) PendingIntent pendingIntent) {
        this.f18617n = 1;
        this.f18616b = (String) Preconditions.checkNotNull(str);
        this.f18615a = (PendingIntent) Preconditions.checkNotNull(pendingIntent);
    }

    public pm5(String str, PendingIntent pendingIntent) {
        this(1, str, pendingIntent);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f18617n);
        SafeParcelWriter.writeString(parcel, 2, this.f18616b, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f18615a, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
