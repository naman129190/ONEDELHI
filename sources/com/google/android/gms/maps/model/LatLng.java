package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.onedelhi.secure.ba6;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.pl2;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.vf4;

@SafeParcelable.Class(creator = "LatLngCreator")
@SafeParcelable.Reserved({1})
public final class LatLng extends AbstractSafeParcelable implements ReflectedParcelable {
    @mr2
    @KeepForSdk
    public static final Parcelable.Creator<LatLng> CREATOR = new ba6();
    @SafeParcelable.Field(mo10053id = 2)

    /* renamed from: a */
    public final double f7562a;
    @SafeParcelable.Field(mo10053id = 3)

    /* renamed from: b */
    public final double f7563b;

    @SafeParcelable.Constructor
    public LatLng(@SafeParcelable.Param(mo10056id = 2) double d, @SafeParcelable.Param(mo10056id = 3) double d2) {
        this.f7563b = (d2 < -180.0d || d2 >= 180.0d) ? ((((d2 - 0.02490234375d) % 360.0d) + 360.0d) % 360.0d) - 0.02490234375d : d2;
        this.f7562a = Math.max(-90.0d, Math.min(90.0d, d));
    }

    public boolean equals(@ts2 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLng)) {
            return false;
        }
        LatLng latLng = (LatLng) obj;
        return Double.doubleToLongBits(this.f7562a) == Double.doubleToLongBits(latLng.f7562a) && Double.doubleToLongBits(this.f7563b) == Double.doubleToLongBits(latLng.f7563b);
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f7562a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f7563b);
        return ((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    @mr2
    public String toString() {
        double d = this.f7562a;
        double d2 = this.f7563b;
        return "lat/lng: (" + d + vf4.f36537c + d2 + pl2.f33727d;
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeDouble(parcel, 2, this.f7562a);
        SafeParcelWriter.writeDouble(parcel, 3, this.f7563b);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
