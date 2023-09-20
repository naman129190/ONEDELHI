package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import com.onedelhi.secure.y54;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SafeParcelable.Class(creator = "PolylineOptionsCreator")
@SafeParcelable.Reserved({1})
public final class g33 extends AbstractSafeParcelable {
    @mr2
    public static final Parcelable.Creator<g33> CREATOR = new as6();
    @SafeParcelable.Field(getter = "getWidth", mo10053id = 3)

    /* renamed from: a */
    public float f12400a;
    @SafeParcelable.Field(getter = "getStartCap", mo10053id = 9)

    /* renamed from: a */
    public C3952xu f12401a;
    @SafeParcelable.Field(getter = "getPoints", mo10053id = 2)

    /* renamed from: a */
    public final List f12402a;
    @SafeParcelable.Field(getter = "getZIndex", mo10053id = 5)

    /* renamed from: b */
    public float f12403b;
    @SafeParcelable.Field(getter = "getEndCap", mo10053id = 10)

    /* renamed from: b */
    public C3952xu f12404b;
    @SafeParcelable.Field(getter = "getPattern", mo10053id = 12)
    @ts2

    /* renamed from: b */
    public List f12405b;
    @SafeParcelable.Field(getter = "isVisible", mo10053id = 6)

    /* renamed from: b */
    public boolean f12406b;
    @SafeParcelable.Field(getter = "getSpans", mo10053id = 13)

    /* renamed from: c */
    public List f12407c;
    @SafeParcelable.Field(getter = "isGeodesic", mo10053id = 7)

    /* renamed from: c */
    public boolean f12408c;
    @SafeParcelable.Field(getter = "isClickable", mo10053id = 8)

    /* renamed from: d */
    public boolean f12409d;
    @SafeParcelable.Field(getter = "getColor", mo10053id = 4)

    /* renamed from: n */
    public int f12410n;
    @SafeParcelable.Field(getter = "getJointType", mo10053id = 11)

    /* renamed from: o */
    public int f12411o;

    public g33() {
        this.f12400a = 10.0f;
        this.f12410n = -16777216;
        this.f12403b = 0.0f;
        this.f12406b = true;
        this.f12408c = false;
        this.f12409d = false;
        this.f12401a = new C2539jq();
        this.f12404b = new C2539jq();
        this.f12411o = 0;
        this.f12405b = null;
        this.f12407c = new ArrayList();
        this.f12402a = new ArrayList();
    }

    @SafeParcelable.Constructor
    public g33(@SafeParcelable.Param(mo10056id = 2) List list, @SafeParcelable.Param(mo10056id = 3) float f, @SafeParcelable.Param(mo10056id = 4) int i, @SafeParcelable.Param(mo10056id = 5) float f2, @SafeParcelable.Param(mo10056id = 6) boolean z, @SafeParcelable.Param(mo10056id = 7) boolean z2, @SafeParcelable.Param(mo10056id = 8) boolean z3, @SafeParcelable.Param(mo10056id = 9) @ts2 C3952xu xuVar, @SafeParcelable.Param(mo10056id = 10) @ts2 C3952xu xuVar2, @SafeParcelable.Param(mo10056id = 11) int i2, @SafeParcelable.Param(mo10056id = 12) @ts2 List list2, @SafeParcelable.Param(mo10056id = 13) @ts2 List list3) {
        this.f12400a = 10.0f;
        this.f12410n = -16777216;
        this.f12403b = 0.0f;
        this.f12406b = true;
        this.f12408c = false;
        this.f12409d = false;
        this.f12401a = new C2539jq();
        this.f12404b = new C2539jq();
        this.f12411o = 0;
        this.f12405b = null;
        this.f12407c = new ArrayList();
        this.f12402a = list;
        this.f12400a = f;
        this.f12410n = i;
        this.f12403b = f2;
        this.f12406b = z;
        this.f12408c = z2;
        this.f12409d = z3;
        if (xuVar != null) {
            this.f12401a = xuVar;
        }
        if (xuVar2 != null) {
            this.f12404b = xuVar2;
        }
        this.f12411o = i2;
        this.f12405b = list2;
        if (list3 != null) {
            this.f12407c = list3;
        }
    }

    @mr2
    /* renamed from: K2 */
    public g33 mo16288K2(@mr2 LatLng latLng) {
        Preconditions.checkNotNull(this.f12402a, "point must not be null.");
        this.f12402a.add(latLng);
        return this;
    }

    @mr2
    /* renamed from: L2 */
    public g33 mo16289L2(@mr2 LatLng... latLngArr) {
        Preconditions.checkNotNull(latLngArr, "points must not be null.");
        Collections.addAll(this.f12402a, latLngArr);
        return this;
    }

    @mr2
    /* renamed from: M2 */
    public g33 mo16290M2(@mr2 Iterable<LatLng> iterable) {
        Preconditions.checkNotNull(iterable, "points must not be null.");
        for (LatLng add : iterable) {
            this.f12402a.add(add);
        }
        return this;
    }

    @mr2
    /* renamed from: N2 */
    public g33 mo16291N2(@mr2 Iterable<f64> iterable) {
        for (f64 O2 : iterable) {
            mo16292O2(O2);
        }
        return this;
    }

    @mr2
    /* renamed from: O2 */
    public g33 mo16292O2(@mr2 f64 f64) {
        this.f12407c.add(f64);
        return this;
    }

    @mr2
    /* renamed from: P2 */
    public g33 mo16293P2(@mr2 f64... f64Arr) {
        for (f64 O2 : f64Arr) {
            mo16292O2(O2);
        }
        return this;
    }

    @mr2
    /* renamed from: Q2 */
    public g33 mo16294Q2(boolean z) {
        this.f12409d = z;
        return this;
    }

    @mr2
    /* renamed from: R2 */
    public g33 mo16295R2(int i) {
        this.f12410n = i;
        return this;
    }

    @mr2
    /* renamed from: S2 */
    public g33 mo16296S2(@mr2 C3952xu xuVar) {
        this.f12404b = (C3952xu) Preconditions.checkNotNull(xuVar, "endCap must not be null");
        return this;
    }

    @mr2
    /* renamed from: T2 */
    public g33 mo16297T2(boolean z) {
        this.f12408c = z;
        return this;
    }

    /* renamed from: U2 */
    public int mo16298U2() {
        return this.f12410n;
    }

    @mr2
    /* renamed from: V2 */
    public C3952xu mo16299V2() {
        return this.f12404b.mo27100K2();
    }

    /* renamed from: W2 */
    public int mo16300W2() {
        return this.f12411o;
    }

    @ts2
    /* renamed from: X2 */
    public List<h03> mo16301X2() {
        return this.f12405b;
    }

    @mr2
    /* renamed from: Y2 */
    public List<LatLng> mo16302Y2() {
        return this.f12402a;
    }

    @mr2
    /* renamed from: Z2 */
    public C3952xu mo16303Z2() {
        return this.f12401a.mo27100K2();
    }

    /* renamed from: a3 */
    public float mo16304a3() {
        return this.f12400a;
    }

    /* renamed from: b3 */
    public float mo16305b3() {
        return this.f12403b;
    }

    /* renamed from: c3 */
    public boolean mo16306c3() {
        return this.f12409d;
    }

    /* renamed from: d3 */
    public boolean mo16307d3() {
        return this.f12408c;
    }

    /* renamed from: e3 */
    public boolean mo16308e3() {
        return this.f12406b;
    }

    @mr2
    /* renamed from: f3 */
    public g33 mo16309f3(int i) {
        this.f12411o = i;
        return this;
    }

    @mr2
    /* renamed from: g3 */
    public g33 mo16310g3(@ts2 List<h03> list) {
        this.f12405b = list;
        return this;
    }

    @mr2
    /* renamed from: h3 */
    public g33 mo16311h3(@mr2 C3952xu xuVar) {
        this.f12401a = (C3952xu) Preconditions.checkNotNull(xuVar, "startCap must not be null");
        return this;
    }

    @mr2
    /* renamed from: i3 */
    public g33 mo16312i3(boolean z) {
        this.f12406b = z;
        return this;
    }

    @mr2
    /* renamed from: j3 */
    public g33 mo16313j3(float f) {
        this.f12400a = f;
        return this;
    }

    @mr2
    /* renamed from: k3 */
    public g33 mo16314k3(float f) {
        this.f12403b = f;
        return this;
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 2, mo16302Y2(), false);
        SafeParcelWriter.writeFloat(parcel, 3, mo16304a3());
        SafeParcelWriter.writeInt(parcel, 4, mo16298U2());
        SafeParcelWriter.writeFloat(parcel, 5, mo16305b3());
        SafeParcelWriter.writeBoolean(parcel, 6, mo16308e3());
        SafeParcelWriter.writeBoolean(parcel, 7, mo16307d3());
        SafeParcelWriter.writeBoolean(parcel, 8, mo16306c3());
        SafeParcelWriter.writeParcelable(parcel, 9, mo16303Z2(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 10, mo16299V2(), i, false);
        SafeParcelWriter.writeInt(parcel, 11, mo16300W2());
        SafeParcelWriter.writeTypedList(parcel, 12, mo16301X2(), false);
        ArrayList arrayList = new ArrayList(this.f12407c.size());
        for (f64 f64 : this.f12407c) {
            y54.C3975a aVar = new y54.C3975a(f64.mo15843L2());
            aVar.mo27212f(this.f12400a);
            aVar.mo27211e(this.f12406b);
            arrayList.add(new f64(aVar.mo27207a(), f64.mo15842K2()));
        }
        SafeParcelWriter.writeTypedList(parcel, 13, arrayList, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
