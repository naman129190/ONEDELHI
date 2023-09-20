package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@ShowFirstParty
@SafeParcelable.Class(creator = "UserPreferredSleepWindowCreator")
@SafeParcelable.Reserved({1000})
public final class qf5 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<qf5> CREATOR = new bg5();
    @SafeParcelable.Field(getter = "getStartHour", mo10053id = 1)

    /* renamed from: n */
    public final int f19153n;
    @SafeParcelable.Field(getter = "getStartMinute", mo10053id = 2)

    /* renamed from: o */
    public final int f19154o;
    @SafeParcelable.Field(getter = "getEndHour", mo10053id = 3)

    /* renamed from: p */
    public final int f19155p;
    @SafeParcelable.Field(getter = "getEndMinute", mo10053id = 4)

    /* renamed from: q */
    public final int f19156q;

    @SafeParcelable.Constructor
    public qf5(@SafeParcelable.Param(mo10056id = 1) int i, @SafeParcelable.Param(mo10056id = 2) int i2, @SafeParcelable.Param(mo10056id = 3) int i3, @SafeParcelable.Param(mo10056id = 4) int i4) {
        boolean z = true;
        Preconditions.checkState(i >= 0 && i <= 23, "Start hour must be in range [0, 23].");
        Preconditions.checkState(i2 >= 0 && i2 <= 59, "Start minute must be in range [0, 59].");
        Preconditions.checkState(i3 >= 0 && i3 <= 23, "End hour must be in range [0, 23].");
        Preconditions.checkState(i4 >= 0 && i4 <= 59, "End minute must be in range [0, 59].");
        Preconditions.checkState(((i + i2) + i3) + i4 <= 0 ? false : z, "Parameters can't be all 0.");
        this.f19153n = i;
        this.f19154o = i2;
        this.f19155p = i3;
        this.f19156q = i4;
    }

    public final boolean equals(@ts2 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qf5)) {
            return false;
        }
        qf5 qf5 = (qf5) obj;
        return this.f19153n == qf5.f19153n && this.f19154o == qf5.f19154o && this.f19155p == qf5.f19155p && this.f19156q == qf5.f19156q;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f19153n), Integer.valueOf(this.f19154o), Integer.valueOf(this.f19155p), Integer.valueOf(this.f19156q));
    }

    public final String toString() {
        int i = this.f19153n;
        int i2 = this.f19154o;
        int i3 = this.f19155p;
        int i4 = this.f19156q;
        return "UserPreferredSleepWindow [startHour=" + i + ", startMinute=" + i2 + ", endHour=" + i3 + ", endMinute=" + i4 + "]";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Preconditions.checkNotNull(parcel);
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f19153n);
        SafeParcelWriter.writeInt(parcel, 2, this.f19154o);
        SafeParcelWriter.writeInt(parcel, 3, this.f19155p);
        SafeParcelWriter.writeInt(parcel, 4, this.f19156q);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
