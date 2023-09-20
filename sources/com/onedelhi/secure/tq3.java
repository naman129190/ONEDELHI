package com.onedelhi.secure;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "SavePasswordResultCreator")
public class tq3 extends AbstractSafeParcelable {
    @mr2
    public static final Parcelable.Creator<tq3> CREATOR = new m85();
    @SafeParcelable.Field(getter = "getPendingIntent", mo10053id = 1)

    /* renamed from: a */
    public final PendingIntent f21050a;

    @SafeParcelable.Constructor
    public tq3(@SafeParcelable.Param(mo10056id = 1) @mr2 PendingIntent pendingIntent) {
        this.f21050a = (PendingIntent) Preconditions.checkNotNull(pendingIntent);
    }

    public boolean equals(@ts2 Object obj) {
        if (!(obj instanceof tq3)) {
            return false;
        }
        return Objects.equal(this.f21050a, ((tq3) obj).f21050a);
    }

    @mr2
    public PendingIntent getPendingIntent() {
        return this.f21050a;
    }

    public int hashCode() {
        return Objects.hashCode(this.f21050a);
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getPendingIntent(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
