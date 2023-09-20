package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;

@SafeParcelable.Class(creator = "CircleOptionsCreator")
@SafeParcelable.Reserved({1})
/* renamed from: com.onedelhi.secure.cy */
public final class C1927cy extends AbstractSafeParcelable {
    @mr2
    public static final Parcelable.Creator<C1927cy> CREATOR = new cs5();
    @SafeParcelable.Field(getter = "getRadius", mo10053id = 3)

    /* renamed from: a */
    public double f10515a;
    @SafeParcelable.Field(getter = "getStrokeWidth", mo10053id = 4)

    /* renamed from: a */
    public float f10516a;
    @SafeParcelable.Field(getter = "getCenter", mo10053id = 2)
    @ts2

    /* renamed from: a */
    public LatLng f10517a;
    @SafeParcelable.Field(getter = "getStrokePattern", mo10053id = 10)
    @ts2

    /* renamed from: a */
    public List f10518a;
    @SafeParcelable.Field(getter = "getZIndex", mo10053id = 7)

    /* renamed from: b */
    public float f10519b;
    @SafeParcelable.Field(getter = "isVisible", mo10053id = 8)

    /* renamed from: b */
    public boolean f10520b;
    @SafeParcelable.Field(getter = "isClickable", mo10053id = 9)

    /* renamed from: c */
    public boolean f10521c;
    @SafeParcelable.Field(getter = "getStrokeColor", mo10053id = 5)

    /* renamed from: n */
    public int f10522n;
    @SafeParcelable.Field(getter = "getFillColor", mo10053id = 6)

    /* renamed from: o */
    public int f10523o;

    public C1927cy() {
        this.f10517a = null;
        this.f10515a = 0.0d;
        this.f10516a = 10.0f;
        this.f10522n = -16777216;
        this.f10523o = 0;
        this.f10519b = 0.0f;
        this.f10520b = true;
        this.f10521c = false;
        this.f10518a = null;
    }

    @SafeParcelable.Constructor
    public C1927cy(@SafeParcelable.Param(mo10056id = 2) LatLng latLng, @SafeParcelable.Param(mo10056id = 3) double d, @SafeParcelable.Param(mo10056id = 4) float f, @SafeParcelable.Param(mo10056id = 5) int i, @SafeParcelable.Param(mo10056id = 6) int i2, @SafeParcelable.Param(mo10056id = 7) float f2, @SafeParcelable.Param(mo10056id = 8) boolean z, @SafeParcelable.Param(mo10056id = 9) boolean z2, @SafeParcelable.Param(mo10056id = 10) @ts2 List list) {
        this.f10517a = latLng;
        this.f10515a = d;
        this.f10516a = f;
        this.f10522n = i;
        this.f10523o = i2;
        this.f10519b = f2;
        this.f10520b = z;
        this.f10521c = z2;
        this.f10518a = list;
    }

    @mr2
    /* renamed from: K2 */
    public C1927cy mo14408K2(@mr2 LatLng latLng) {
        Preconditions.checkNotNull(latLng, "center must not be null.");
        this.f10517a = latLng;
        return this;
    }

    @mr2
    /* renamed from: L2 */
    public C1927cy mo14409L2(boolean z) {
        this.f10521c = z;
        return this;
    }

    @mr2
    /* renamed from: M2 */
    public C1927cy mo14410M2(int i) {
        this.f10523o = i;
        return this;
    }

    @ts2
    /* renamed from: N2 */
    public LatLng mo14411N2() {
        return this.f10517a;
    }

    /* renamed from: O2 */
    public int mo14412O2() {
        return this.f10523o;
    }

    /* renamed from: P2 */
    public double mo14413P2() {
        return this.f10515a;
    }

    /* renamed from: Q2 */
    public int mo14414Q2() {
        return this.f10522n;
    }

    @ts2
    /* renamed from: R2 */
    public List<h03> mo14415R2() {
        return this.f10518a;
    }

    /* renamed from: S2 */
    public float mo14416S2() {
        return this.f10516a;
    }

    /* renamed from: T2 */
    public float mo14417T2() {
        return this.f10519b;
    }

    /* renamed from: U2 */
    public boolean mo14418U2() {
        return this.f10521c;
    }

    /* renamed from: V2 */
    public boolean mo14419V2() {
        return this.f10520b;
    }

    @mr2
    /* renamed from: W2 */
    public C1927cy mo14420W2(double d) {
        this.f10515a = d;
        return this;
    }

    @mr2
    /* renamed from: X2 */
    public C1927cy mo14421X2(int i) {
        this.f10522n = i;
        return this;
    }

    @mr2
    /* renamed from: Y2 */
    public C1927cy mo14422Y2(@ts2 List<h03> list) {
        this.f10518a = list;
        return this;
    }

    @mr2
    /* renamed from: Z2 */
    public C1927cy mo14423Z2(float f) {
        this.f10516a = f;
        return this;
    }

    @mr2
    /* renamed from: a3 */
    public C1927cy mo14424a3(boolean z) {
        this.f10520b = z;
        return this;
    }

    @mr2
    /* renamed from: b3 */
    public C1927cy mo14425b3(float f) {
        this.f10519b = f;
        return this;
    }

    public final void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, mo14411N2(), i, false);
        SafeParcelWriter.writeDouble(parcel, 3, mo14413P2());
        SafeParcelWriter.writeFloat(parcel, 4, mo14416S2());
        SafeParcelWriter.writeInt(parcel, 5, mo14414Q2());
        SafeParcelWriter.writeInt(parcel, 6, mo14412O2());
        SafeParcelWriter.writeFloat(parcel, 7, mo14417T2());
        SafeParcelWriter.writeBoolean(parcel, 8, mo14419V2());
        SafeParcelWriter.writeBoolean(parcel, 9, mo14418U2());
        SafeParcelWriter.writeTypedList(parcel, 10, mo14415R2(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
