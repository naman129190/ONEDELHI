package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@ShowFirstParty
@SafeParcelable.Class(creator = "NetworkLocationStatusCreator")
@Deprecated
public final class oc5 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<oc5> CREATOR = new ad5();
    @SafeParcelable.Field(defaultValueUnchecked = "NetworkLocationStatus.STATUS_INVALID_TIMESTAMP", mo10053id = 3)

    /* renamed from: b */
    public final long f17914b;
    @SafeParcelable.Field(defaultValueUnchecked = "NetworkLocationStatus.STATUS_INVALID_TIMESTAMP", mo10053id = 4)

    /* renamed from: c */
    public final long f17915c;
    @SafeParcelable.Field(defaultValueUnchecked = "LocationAvailability.STATUS_UNKNOWN", mo10053id = 1)

    /* renamed from: n */
    public final int f17916n;
    @SafeParcelable.Field(defaultValueUnchecked = "LocationAvailability.STATUS_UNKNOWN", mo10053id = 2)

    /* renamed from: o */
    public final int f17917o;

    @SafeParcelable.Constructor
    public oc5(@SafeParcelable.Param(mo10056id = 1) int i, @SafeParcelable.Param(mo10056id = 2) int i2, @SafeParcelable.Param(mo10056id = 3) long j, @SafeParcelable.Param(mo10056id = 4) long j2) {
        this.f17916n = i;
        this.f17917o = i2;
        this.f17914b = j;
        this.f17915c = j2;
    }

    public final boolean equals(@ts2 Object obj) {
        if (obj instanceof oc5) {
            oc5 oc5 = (oc5) obj;
            return this.f17916n == oc5.f17916n && this.f17917o == oc5.f17917o && this.f17914b == oc5.f17914b && this.f17915c == oc5.f17915c;
        }
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f17917o), Integer.valueOf(this.f17916n), Long.valueOf(this.f17915c), Long.valueOf(this.f17914b));
    }

    public final String toString() {
        int i = this.f17916n;
        int i2 = this.f17917o;
        long j = this.f17915c;
        long j2 = this.f17914b;
        return "NetworkLocationStatus: Wifi status: " + i + " Cell status: " + i2 + " elapsed time NS: " + j + " system time ms: " + j2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f17916n);
        SafeParcelWriter.writeInt(parcel, 2, this.f17917o);
        SafeParcelWriter.writeLong(parcel, 3, this.f17914b);
        SafeParcelWriter.writeLong(parcel, 4, this.f17915c);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
