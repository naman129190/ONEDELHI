package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.onedelhi.secure.d47;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.oc5;
import com.onedelhi.secure.ts2;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

@SafeParcelable.Class(creator = "LocationAvailabilityCreator")
@SafeParcelable.Reserved({1000})
public final class LocationAvailability extends AbstractSafeParcelable implements ReflectedParcelable {
    @mr2
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new d47();
    @mr2

    /* renamed from: a */
    public static final LocationAvailability f7475a = new LocationAvailability(0, 1, 1, 0, (oc5[]) null, true);
    @mr2

    /* renamed from: b */
    public static final LocationAvailability f7476b = new LocationAvailability(1000, 1, 1, 0, (oc5[]) null, false);
    @SafeParcelable.Field(getter = "getBatchedStatus", mo10053id = 5)

    /* renamed from: a */
    public final oc5[] f7477a;
    @SafeParcelable.Field(defaultValueUnchecked = "0", getter = "getElapsedRealtimeNs", mo10053id = 3)

    /* renamed from: b */
    public final long f7478b;
    @SafeParcelable.Field(defaultValueUnchecked = "LocationAvailability.STATUS_UNKNOWN", getter = "getCellStatus", mo10053id = 1)

    /* renamed from: n */
    public final int f7479n;
    @SafeParcelable.Field(defaultValueUnchecked = "LocationAvailability.STATUS_UNKNOWN", getter = "getWifiStatus", mo10053id = 2)

    /* renamed from: o */
    public final int f7480o;
    @SafeParcelable.Field(defaultValueUnchecked = "LocationAvailability.STATUS_UNSUCCESSFUL", mo10053id = 4)

    /* renamed from: p */
    public int f7481p;

    @SafeParcelable.Constructor
    public LocationAvailability(@SafeParcelable.Param(mo10056id = 4) int i, @SafeParcelable.Param(mo10056id = 1) int i2, @SafeParcelable.Param(mo10056id = 2) int i3, @SafeParcelable.Param(mo10056id = 3) long j, @SafeParcelable.Param(mo10056id = 5) oc5[] oc5Arr, @SafeParcelable.Param(mo10056id = 6) boolean z) {
        this.f7481p = i < 1000 ? 0 : 1000;
        this.f7479n = i2;
        this.f7480o = i3;
        this.f7478b = j;
        this.f7477a = oc5Arr;
    }

    @ts2
    /* renamed from: K2 */
    public static LocationAvailability m8992K2(@mr2 Intent intent) {
        if (!m8993L2(intent)) {
            return null;
        }
        try {
            return (LocationAvailability) intent.getParcelableExtra("com.google.android.gms.location.EXTRA_LOCATION_AVAILABILITY");
        } catch (ClassCastException unused) {
            return null;
        }
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = true)
    /* renamed from: L2 */
    public static boolean m8993L2(@ts2 Intent intent) {
        return intent != null && intent.hasExtra("com.google.android.gms.location.EXTRA_LOCATION_AVAILABILITY");
    }

    /* renamed from: M2 */
    public boolean mo10506M2() {
        return this.f7481p < 1000;
    }

    public boolean equals(@ts2 Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            return this.f7479n == locationAvailability.f7479n && this.f7480o == locationAvailability.f7480o && this.f7478b == locationAvailability.f7478b && this.f7481p == locationAvailability.f7481p && Arrays.equals(this.f7477a, locationAvailability.f7477a);
        }
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f7481p));
    }

    @mr2
    public String toString() {
        boolean M2 = mo10506M2();
        return "LocationAvailability[" + M2 + "]";
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f7479n);
        SafeParcelWriter.writeInt(parcel, 2, this.f7480o);
        SafeParcelWriter.writeLong(parcel, 3, this.f7478b);
        SafeParcelWriter.writeInt(parcel, 4, this.f7481p);
        SafeParcelWriter.writeTypedArray(parcel, 5, this.f7477a, i, false);
        SafeParcelWriter.writeBoolean(parcel, 6, mo10506M2());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
