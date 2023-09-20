package com.onedelhi.secure;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;

@SafeParcelable.Class(creator = "LocationSettingsStatesCreator")
@SafeParcelable.Reserved({1000})
public final class f82 extends AbstractSafeParcelable {
    @mr2
    public static final Parcelable.Creator<f82> CREATOR = new ac5();
    @SafeParcelable.Field(getter = "isGpsUsable", mo10053id = 1)

    /* renamed from: b */
    public final boolean f11953b;
    @SafeParcelable.Field(getter = "isNetworkLocationUsable", mo10053id = 2)

    /* renamed from: c */
    public final boolean f11954c;
    @SafeParcelable.Field(getter = "isBleUsable", mo10053id = 3)

    /* renamed from: d */
    public final boolean f11955d;
    @SafeParcelable.Field(getter = "isGpsPresent", mo10053id = 4)

    /* renamed from: e */
    public final boolean f11956e;
    @SafeParcelable.Field(getter = "isNetworkLocationPresent", mo10053id = 5)

    /* renamed from: f */
    public final boolean f11957f;
    @SafeParcelable.Field(getter = "isBlePresent", mo10053id = 6)

    /* renamed from: g */
    public final boolean f11958g;

    @SafeParcelable.Constructor
    public f82(@SafeParcelable.Param(mo10056id = 1) boolean z, @SafeParcelable.Param(mo10056id = 2) boolean z2, @SafeParcelable.Param(mo10056id = 3) boolean z3, @SafeParcelable.Param(mo10056id = 4) boolean z4, @SafeParcelable.Param(mo10056id = 5) boolean z5, @SafeParcelable.Param(mo10056id = 6) boolean z6) {
        this.f11953b = z;
        this.f11954c = z2;
        this.f11955d = z3;
        this.f11956e = z4;
        this.f11957f = z5;
        this.f11958g = z6;
    }

    @ts2
    /* renamed from: K2 */
    public static f82 m14802K2(@mr2 Intent intent) {
        return (f82) SafeParcelableSerializer.deserializeFromIntentExtra(intent, "com.google.android.gms.location.LOCATION_SETTINGS_STATES", CREATOR);
    }

    /* renamed from: L2 */
    public boolean mo15879L2() {
        return this.f11958g;
    }

    /* renamed from: M2 */
    public boolean mo15880M2() {
        return this.f11955d;
    }

    /* renamed from: N2 */
    public boolean mo15881N2() {
        return this.f11956e;
    }

    /* renamed from: O2 */
    public boolean mo15882O2() {
        return this.f11953b;
    }

    /* renamed from: P2 */
    public boolean mo15883P2() {
        return this.f11956e || this.f11957f;
    }

    /* renamed from: Q2 */
    public boolean mo15884Q2() {
        return this.f11953b || this.f11954c;
    }

    /* renamed from: R2 */
    public boolean mo15885R2() {
        return this.f11957f;
    }

    /* renamed from: S2 */
    public boolean mo15886S2() {
        return this.f11954c;
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, mo15882O2());
        SafeParcelWriter.writeBoolean(parcel, 2, mo15886S2());
        SafeParcelWriter.writeBoolean(parcel, 3, mo15880M2());
        SafeParcelWriter.writeBoolean(parcel, 4, mo15881N2());
        SafeParcelWriter.writeBoolean(parcel, 5, mo15885R2());
        SafeParcelWriter.writeBoolean(parcel, 6, mo15879L2());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
