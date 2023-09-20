package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SafeParcelable.Class(creator = "PolygonOptionsCreator")
@SafeParcelable.Reserved({1})
public final class e33 extends AbstractSafeParcelable {
    @mr2
    public static final Parcelable.Creator<e33> CREATOR = new tp6();
    @SafeParcelable.Field(getter = "getStrokeWidth", mo10053id = 4)

    /* renamed from: a */
    public float f11097a;
    @SafeParcelable.Field(getter = "getPoints", mo10053id = 2)

    /* renamed from: a */
    public final List f11098a;
    @SafeParcelable.Field(getter = "getZIndex", mo10053id = 7)

    /* renamed from: b */
    public float f11099b;
    @SafeParcelable.Field(getter = "getHolesForParcel", mo10053id = 3, type = "java.util.List")

    /* renamed from: b */
    public final List f11100b;
    @SafeParcelable.Field(getter = "isVisible", mo10053id = 8)

    /* renamed from: b */
    public boolean f11101b;
    @SafeParcelable.Field(getter = "getStrokePattern", mo10053id = 12)
    @ts2

    /* renamed from: c */
    public List f11102c;
    @SafeParcelable.Field(getter = "isGeodesic", mo10053id = 9)

    /* renamed from: c */
    public boolean f11103c;
    @SafeParcelable.Field(getter = "isClickable", mo10053id = 10)

    /* renamed from: d */
    public boolean f11104d;
    @SafeParcelable.Field(getter = "getStrokeColor", mo10053id = 5)

    /* renamed from: n */
    public int f11105n;
    @SafeParcelable.Field(getter = "getFillColor", mo10053id = 6)

    /* renamed from: o */
    public int f11106o;
    @SafeParcelable.Field(getter = "getStrokeJointType", mo10053id = 11)

    /* renamed from: p */
    public int f11107p;

    public e33() {
        this.f11097a = 10.0f;
        this.f11105n = -16777216;
        this.f11106o = 0;
        this.f11099b = 0.0f;
        this.f11101b = true;
        this.f11103c = false;
        this.f11104d = false;
        this.f11107p = 0;
        this.f11102c = null;
        this.f11098a = new ArrayList();
        this.f11100b = new ArrayList();
    }

    @SafeParcelable.Constructor
    public e33(@SafeParcelable.Param(mo10056id = 2) List list, @SafeParcelable.Param(mo10056id = 3) List list2, @SafeParcelable.Param(mo10056id = 4) float f, @SafeParcelable.Param(mo10056id = 5) int i, @SafeParcelable.Param(mo10056id = 6) int i2, @SafeParcelable.Param(mo10056id = 7) float f2, @SafeParcelable.Param(mo10056id = 8) boolean z, @SafeParcelable.Param(mo10056id = 9) boolean z2, @SafeParcelable.Param(mo10056id = 10) boolean z3, @SafeParcelable.Param(mo10056id = 11) int i3, @SafeParcelable.Param(mo10056id = 12) @ts2 List list3) {
        this.f11098a = list;
        this.f11100b = list2;
        this.f11097a = f;
        this.f11105n = i;
        this.f11106o = i2;
        this.f11099b = f2;
        this.f11101b = z;
        this.f11103c = z2;
        this.f11104d = z3;
        this.f11107p = i3;
        this.f11102c = list3;
    }

    @mr2
    /* renamed from: K2 */
    public e33 mo15005K2(@mr2 LatLng latLng) {
        Preconditions.checkNotNull(latLng, "point must not be null.");
        this.f11098a.add(latLng);
        return this;
    }

    @mr2
    /* renamed from: L2 */
    public e33 mo15006L2(@mr2 LatLng... latLngArr) {
        Preconditions.checkNotNull(latLngArr, "points must not be null.");
        this.f11098a.addAll(Arrays.asList(latLngArr));
        return this;
    }

    @mr2
    /* renamed from: M2 */
    public e33 mo15007M2(@mr2 Iterable<LatLng> iterable) {
        Preconditions.checkNotNull(iterable, "points must not be null.");
        for (LatLng add : iterable) {
            this.f11098a.add(add);
        }
        return this;
    }

    @mr2
    /* renamed from: N2 */
    public e33 mo15008N2(@mr2 Iterable<LatLng> iterable) {
        Preconditions.checkNotNull(iterable, "points must not be null.");
        ArrayList arrayList = new ArrayList();
        for (LatLng add : iterable) {
            arrayList.add(add);
        }
        this.f11100b.add(arrayList);
        return this;
    }

    @mr2
    /* renamed from: O2 */
    public e33 mo15009O2(boolean z) {
        this.f11104d = z;
        return this;
    }

    @mr2
    /* renamed from: P2 */
    public e33 mo15010P2(int i) {
        this.f11106o = i;
        return this;
    }

    @mr2
    /* renamed from: Q2 */
    public e33 mo15011Q2(boolean z) {
        this.f11103c = z;
        return this;
    }

    /* renamed from: R2 */
    public int mo15012R2() {
        return this.f11106o;
    }

    @mr2
    /* renamed from: S2 */
    public List<List<LatLng>> mo15013S2() {
        return this.f11100b;
    }

    @mr2
    /* renamed from: T2 */
    public List<LatLng> mo15014T2() {
        return this.f11098a;
    }

    /* renamed from: U2 */
    public int mo15015U2() {
        return this.f11105n;
    }

    /* renamed from: V2 */
    public int mo15016V2() {
        return this.f11107p;
    }

    @ts2
    /* renamed from: W2 */
    public List<h03> mo15017W2() {
        return this.f11102c;
    }

    /* renamed from: X2 */
    public float mo15018X2() {
        return this.f11097a;
    }

    /* renamed from: Y2 */
    public float mo15019Y2() {
        return this.f11099b;
    }

    /* renamed from: Z2 */
    public boolean mo15020Z2() {
        return this.f11104d;
    }

    /* renamed from: a3 */
    public boolean mo15021a3() {
        return this.f11103c;
    }

    /* renamed from: b3 */
    public boolean mo15022b3() {
        return this.f11101b;
    }

    @mr2
    /* renamed from: c3 */
    public e33 mo15023c3(int i) {
        this.f11105n = i;
        return this;
    }

    @mr2
    /* renamed from: d3 */
    public e33 mo15024d3(int i) {
        this.f11107p = i;
        return this;
    }

    @mr2
    /* renamed from: e3 */
    public e33 mo15025e3(@ts2 List<h03> list) {
        this.f11102c = list;
        return this;
    }

    @mr2
    /* renamed from: f3 */
    public e33 mo15026f3(float f) {
        this.f11097a = f;
        return this;
    }

    @mr2
    /* renamed from: g3 */
    public e33 mo15027g3(boolean z) {
        this.f11101b = z;
        return this;
    }

    @mr2
    /* renamed from: h3 */
    public e33 mo15028h3(float f) {
        this.f11099b = f;
        return this;
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 2, mo15014T2(), false);
        SafeParcelWriter.writeList(parcel, 3, this.f11100b, false);
        SafeParcelWriter.writeFloat(parcel, 4, mo15018X2());
        SafeParcelWriter.writeInt(parcel, 5, mo15015U2());
        SafeParcelWriter.writeInt(parcel, 6, mo15012R2());
        SafeParcelWriter.writeFloat(parcel, 7, mo15019Y2());
        SafeParcelWriter.writeBoolean(parcel, 8, mo15022b3());
        SafeParcelWriter.writeBoolean(parcel, 9, mo15021a3());
        SafeParcelWriter.writeBoolean(parcel, 10, mo15020Z2());
        SafeParcelWriter.writeInt(parcel, 11, mo15016V2());
        SafeParcelWriter.writeTypedList(parcel, 12, mo15017W2(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
