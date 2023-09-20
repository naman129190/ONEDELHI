package com.onedelhi.secure;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "SaveAccountLinkingTokenResultCreator")
public class rq3 extends AbstractSafeParcelable {
    @mr2
    public static final Parcelable.Creator<rq3> CREATOR = new g85();
    @SafeParcelable.Field(getter = "getPendingIntent", mo10053id = 1)
    @ts2

    /* renamed from: a */
    public final PendingIntent f20083a;

    @SafeParcelable.Constructor
    public rq3(@SafeParcelable.Param(mo10056id = 1) @ts2 PendingIntent pendingIntent) {
        this.f20083a = pendingIntent;
    }

    public boolean equals(@ts2 Object obj) {
        if (!(obj instanceof rq3)) {
            return false;
        }
        return Objects.equal(this.f20083a, ((rq3) obj).f20083a);
    }

    @ts2
    public PendingIntent getPendingIntent() {
        return this.f20083a;
    }

    public boolean hasResolution() {
        return this.f20083a != null;
    }

    public int hashCode() {
        return Objects.hashCode(this.f20083a);
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getPendingIntent(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
