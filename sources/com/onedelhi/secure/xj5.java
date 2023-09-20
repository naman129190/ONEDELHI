package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "EventParcelCreator")
@SafeParcelable.Reserved({1})
public final class xj5 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<xj5> CREATOR = new fk5();
    @SafeParcelable.Field(mo10053id = 3)

    /* renamed from: a */
    public final hj5 f22602a;
    @SafeParcelable.Field(mo10053id = 5)

    /* renamed from: b */
    public final long f22603b;
    @SafeParcelable.Field(mo10053id = 2)

    /* renamed from: b */
    public final String f22604b;
    @SafeParcelable.Field(mo10053id = 4)

    /* renamed from: c */
    public final String f22605c;

    public xj5(xj5 xj5, long j) {
        Preconditions.checkNotNull(xj5);
        this.f22604b = xj5.f22604b;
        this.f22602a = xj5.f22602a;
        this.f22605c = xj5.f22605c;
        this.f22603b = j;
    }

    @SafeParcelable.Constructor
    public xj5(@SafeParcelable.Param(mo10056id = 2) String str, @SafeParcelable.Param(mo10056id = 3) hj5 hj5, @SafeParcelable.Param(mo10056id = 4) String str2, @SafeParcelable.Param(mo10056id = 5) long j) {
        this.f22604b = str;
        this.f22602a = hj5;
        this.f22605c = str2;
        this.f22603b = j;
    }

    public final String toString() {
        String str = this.f22605c;
        String str2 = this.f22604b;
        String valueOf = String.valueOf(this.f22602a);
        return "origin=" + str + ",name=" + str2 + ",params=" + valueOf;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        fk5.m14999a(this, parcel, i);
    }
}
