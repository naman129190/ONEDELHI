package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.WorkSourceUtil;
import com.google.android.gms.location.LocationRequest;
import java.util.Iterator;
import java.util.List;

@SafeParcelable.Class(creator = "LocationRequestInternalCreator")
@SafeParcelable.Reserved({2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 1000})
@Deprecated
public final class jy5 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<jy5> CREATOR = new ny5();
    @SafeParcelable.Field(defaultValueUnchecked = "null", mo10053id = 1)

    /* renamed from: a */
    public LocationRequest f14662a;

    @SafeParcelable.Constructor
    public jy5(@SafeParcelable.Param(mo10056id = 1) LocationRequest locationRequest, @SafeParcelable.RemovedParam(defaultValueUnchecked = "null", mo10059id = 5) @ts2 List list, @SafeParcelable.RemovedParam(defaultValue = "false", mo10059id = 8) boolean z, @SafeParcelable.RemovedParam(defaultValue = "false", mo10059id = 9) boolean z2, @SafeParcelable.RemovedParam(defaultValueUnchecked = "null", mo10059id = 10) @ts2 String str, @SafeParcelable.RemovedParam(defaultValue = "false", mo10059id = 11) boolean z3, @SafeParcelable.RemovedParam(defaultValue = "false", mo10059id = 12) boolean z4, @SafeParcelable.RemovedParam(defaultValueUnchecked = "null", mo10059id = 13) @ts2 String str2, @SafeParcelable.RemovedParam(defaultValueUnchecked = "Long.MAX_VALUE", mo10059id = 14) long j) {
        WorkSource workSource;
        LocationRequest.C1436a aVar = new LocationRequest.C1436a(locationRequest);
        if (list != null) {
            if (list.isEmpty()) {
                workSource = null;
            } else {
                workSource = new WorkSource();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ClientIdentity clientIdentity = (ClientIdentity) it.next();
                    WorkSourceUtil.add(workSource, clientIdentity.uid, clientIdentity.packageName);
                }
            }
            aVar.mo10562o(workSource);
        }
        if (z) {
            aVar.mo10550c(1);
        }
        if (z2) {
            aVar.mo10561n(2);
        }
        if (str != null) {
            aVar.mo10560m(str);
        } else if (str2 != null) {
            aVar.mo10560m(str2);
        }
        if (z3) {
            aVar.mo10559l(true);
        }
        if (z4) {
            aVar.mo10558k(true);
        }
        if (j != Long.MAX_VALUE) {
            aVar.mo10552e(j);
        }
        this.f14662a = aVar.mo10548a();
    }

    @Deprecated
    /* renamed from: K2 */
    public static jy5 m19334K2(@ts2 String str, LocationRequest locationRequest) {
        return new jy5(locationRequest, (List) null, false, false, (String) null, false, false, (String) null, Long.MAX_VALUE);
    }

    public final boolean equals(@ts2 Object obj) {
        if (obj instanceof jy5) {
            return Objects.equal(this.f14662a, ((jy5) obj).f14662a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14662a.hashCode();
    }

    public final String toString() {
        return this.f14662a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.f14662a, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
