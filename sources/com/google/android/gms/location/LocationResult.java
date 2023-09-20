package com.google.android.gms.location;

import android.content.Intent;
import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.onedelhi.secure.j57;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;
import java.util.Collections;
import java.util.List;

@SafeParcelable.Class(creator = "LocationResultCreator")
@SafeParcelable.Reserved({1000})
public final class LocationResult extends AbstractSafeParcelable implements ReflectedParcelable {
    @mr2
    public static final Parcelable.Creator<LocationResult> CREATOR = new j57();

    /* renamed from: b */
    public static final List f7518b = Collections.emptyList();
    @SafeParcelable.Field(defaultValueUnchecked = "LocationResult.DEFAULT_LOCATIONS", getter = "getLocations", mo10053id = 1)

    /* renamed from: a */
    public final List f7519a;

    @SafeParcelable.Constructor
    public LocationResult(@SafeParcelable.Param(mo10056id = 1) List list) {
        this.f7519a = list;
    }

    @mr2
    /* renamed from: K2 */
    public static LocationResult m9044K2(@mr2 List<Location> list) {
        if (list == null) {
            list = f7518b;
        }
        return new LocationResult(list);
    }

    @ts2
    /* renamed from: L2 */
    public static LocationResult m9045L2(@mr2 Intent intent) {
        if (!m9046O2(intent)) {
            return null;
        }
        LocationResult locationResult = (LocationResult) SafeParcelableSerializer.deserializeFromIntentExtra(intent, "com.google.android.gms.location.EXTRA_LOCATION_RESULT_BYTES", CREATOR);
        return locationResult == null ? (LocationResult) intent.getParcelableExtra("com.google.android.gms.location.EXTRA_LOCATION_RESULT") : locationResult;
    }

    /* renamed from: O2 */
    public static boolean m9046O2(@mr2 Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.hasExtra("com.google.android.gms.location.EXTRA_LOCATION_RESULT") || intent.hasExtra("com.google.android.gms.location.EXTRA_LOCATION_RESULT_BYTES");
    }

    @ts2
    /* renamed from: M2 */
    public Location mo10563M2() {
        int size = this.f7519a.size();
        if (size == 0) {
            return null;
        }
        return (Location) this.f7519a.get(size - 1);
    }

    @mr2
    /* renamed from: N2 */
    public List<Location> mo10564N2() {
        return this.f7519a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(@com.onedelhi.secure.ts2 java.lang.Object r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.google.android.gms.location.LocationResult
            r1 = 0
            if (r0 == 0) goto L_0x008c
            com.google.android.gms.location.LocationResult r10 = (com.google.android.gms.location.LocationResult) r10
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r0 < r2) goto L_0x0016
            java.util.List r0 = r9.f7519a
            java.util.List r10 = r10.f7519a
            boolean r10 = r0.equals(r10)
            return r10
        L_0x0016:
            java.util.List r0 = r9.f7519a
            int r0 = r0.size()
            java.util.List r2 = r10.f7519a
            int r2 = r2.size()
            if (r0 == r2) goto L_0x0025
            return r1
        L_0x0025:
            java.util.List r0 = r9.f7519a
            java.util.Iterator r0 = r0.iterator()
            java.util.List r10 = r10.f7519a
            java.util.Iterator r10 = r10.iterator()
        L_0x0031:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x008a
            java.lang.Object r2 = r0.next()
            android.location.Location r2 = (android.location.Location) r2
            java.lang.Object r3 = r10.next()
            android.location.Location r3 = (android.location.Location) r3
            double r4 = r2.getLatitude()
            double r6 = r3.getLatitude()
            int r4 = java.lang.Double.compare(r4, r6)
            if (r4 == 0) goto L_0x0052
            return r1
        L_0x0052:
            double r4 = r2.getLongitude()
            double r6 = r3.getLongitude()
            int r4 = java.lang.Double.compare(r4, r6)
            if (r4 == 0) goto L_0x0061
            return r1
        L_0x0061:
            long r4 = r2.getTime()
            long r6 = r3.getTime()
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x006e
            return r1
        L_0x006e:
            long r4 = r2.getElapsedRealtimeNanos()
            long r6 = r3.getElapsedRealtimeNanos()
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x007b
            return r1
        L_0x007b:
            java.lang.String r2 = r2.getProvider()
            java.lang.String r3 = r3.getProvider()
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 != 0) goto L_0x0031
            return r1
        L_0x008a:
            r10 = 1
            return r10
        L_0x008c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.LocationResult.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return Objects.hashCode(this.f7519a);
    }

    @mr2
    public String toString() {
        return "LocationResult".concat(String.valueOf(this.f7519a));
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, mo10564N2(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
