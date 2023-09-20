package com.onedelhi.secure;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "LocationRequestUpdateDataCreator")
@SafeParcelable.Reserved({1000})
@Deprecated
public final class ry5 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ry5> CREATOR = new vy5();
    @SafeParcelable.Field(defaultValueUnchecked = "null", getter = "getPendingIntent", mo10053id = 4)
    @ts2

    /* renamed from: a */
    public final PendingIntent f20135a;
    @SafeParcelable.Field(defaultValueUnchecked = "null", getter = "getLocationCallbackAsBinder", mo10053id = 5, type = "android.os.IBinder")
    @ts2

    /* renamed from: a */
    public final i07 f20136a;
    @SafeParcelable.Field(defaultValueUnchecked = "null", getter = "getLocationRequest", mo10053id = 2)
    @ts2

    /* renamed from: a */
    public final jy5 f20137a;
    @SafeParcelable.Field(defaultValueUnchecked = "null", getter = "getFusedLocationProviderCallbackAsBinder", mo10053id = 6, type = "android.os.IBinder")
    @ts2

    /* renamed from: a */
    public final um6 f20138a;
    @SafeParcelable.Field(defaultValueUnchecked = "null", getter = "getLocationListenerAsBinder", mo10053id = 3, type = "android.os.IBinder")
    @ts2

    /* renamed from: a */
    public final w27 f20139a;
    @SafeParcelable.Field(defaultValueUnchecked = "null", getter = "getListenerId", mo10053id = 8)
    @ts2

    /* renamed from: b */
    public final String f20140b;
    @SafeParcelable.Field(defaultValueUnchecked = "LocationRequestUpdateData.OPERATION_ADD", getter = "getOperation", mo10053id = 1)

    /* renamed from: n */
    public final int f20141n;

    @SafeParcelable.Constructor
    public ry5(@SafeParcelable.Param(mo10056id = 1) int i, @SafeParcelable.Param(mo10056id = 2) @ts2 jy5 jy5, @SafeParcelable.Param(mo10056id = 3) @ts2 IBinder iBinder, @SafeParcelable.Param(mo10056id = 5) @ts2 IBinder iBinder2, @SafeParcelable.Param(mo10056id = 4) @ts2 PendingIntent pendingIntent, @SafeParcelable.Param(mo10056id = 6) @ts2 IBinder iBinder3, @SafeParcelable.Param(mo10056id = 8) @ts2 String str) {
        this.f20141n = i;
        this.f20137a = jy5;
        um6 um6 = null;
        this.f20139a = iBinder != null ? f27.m14580k8(iBinder) : null;
        this.f20135a = pendingIntent;
        this.f20136a = iBinder2 != null ? qy6.m26241k8(iBinder2) : null;
        if (iBinder3 != null) {
            IInterface queryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            um6 = queryLocalInterface instanceof um6 ? (um6) queryLocalInterface : new hh6(iBinder3);
        }
        this.f20138a = um6;
        this.f20140b = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f20141n);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f20137a, i, false);
        w27 w27 = this.f20139a;
        IBinder iBinder = null;
        SafeParcelWriter.writeIBinder(parcel, 3, w27 == null ? null : w27.asBinder(), false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f20135a, i, false);
        i07 i07 = this.f20136a;
        SafeParcelWriter.writeIBinder(parcel, 5, i07 == null ? null : i07.asBinder(), false);
        um6 um6 = this.f20138a;
        if (um6 != null) {
            iBinder = um6.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 6, iBinder, false);
        SafeParcelWriter.writeString(parcel, 8, this.f20140b, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
