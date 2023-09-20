package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.onedelhi.secure.ha5;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.rh5;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.u44;

@SafeParcelable.Class(creator = "StreetViewPanoramaOptionsCreator")
@SafeParcelable.Reserved({1})
public final class StreetViewPanoramaOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    @mr2
    public static final Parcelable.Creator<StreetViewPanoramaOptions> CREATOR = new rh5();
    @SafeParcelable.Field(getter = "getPosition", mo10053id = 4)
    @ts2

    /* renamed from: a */
    public LatLng f7542a;
    @SafeParcelable.Field(getter = "getStreetViewPanoramaCamera", mo10053id = 2)
    @ts2

    /* renamed from: a */
    public StreetViewPanoramaCamera f7543a;
    @SafeParcelable.Field(getter = "getSource", mo10053id = 11)

    /* renamed from: a */
    public u44 f7544a = u44.f21212a;
    @SafeParcelable.Field(getter = "getUserNavigationEnabledForParcel", mo10053id = 6, type = "byte")
    @ts2

    /* renamed from: a */
    public Boolean f7545a;
    @SafeParcelable.Field(getter = "getRadius", mo10053id = 5)
    @ts2

    /* renamed from: a */
    public Integer f7546a;
    @SafeParcelable.Field(getter = "getZoomGesturesEnabledForParcel", mo10053id = 7, type = "byte")
    @ts2

    /* renamed from: b */
    public Boolean f7547b;
    @SafeParcelable.Field(getter = "getPanoramaId", mo10053id = 3)
    @ts2

    /* renamed from: b */
    public String f7548b;
    @SafeParcelable.Field(getter = "getPanningGesturesEnabledForParcel", mo10053id = 8, type = "byte")
    @ts2

    /* renamed from: c */
    public Boolean f7549c;
    @SafeParcelable.Field(getter = "getStreetNamesEnabledForParcel", mo10053id = 9, type = "byte")
    @ts2

    /* renamed from: d */
    public Boolean f7550d;
    @SafeParcelable.Field(getter = "getUseViewLifecycleInFragmentForParcel", mo10053id = 10, type = "byte")
    @ts2

    /* renamed from: e */
    public Boolean f7551e;

    public StreetViewPanoramaOptions() {
        Boolean bool = Boolean.TRUE;
        this.f7545a = bool;
        this.f7547b = bool;
        this.f7549c = bool;
        this.f7550d = bool;
    }

    @SafeParcelable.Constructor
    public StreetViewPanoramaOptions(@SafeParcelable.Param(mo10056id = 2) @ts2 StreetViewPanoramaCamera streetViewPanoramaCamera, @SafeParcelable.Param(mo10056id = 3) @ts2 String str, @SafeParcelable.Param(mo10056id = 4) @ts2 LatLng latLng, @SafeParcelable.Param(mo10056id = 5) @ts2 Integer num, @SafeParcelable.Param(mo10056id = 6) byte b, @SafeParcelable.Param(mo10056id = 7) byte b2, @SafeParcelable.Param(mo10056id = 8) byte b3, @SafeParcelable.Param(mo10056id = 9) byte b4, @SafeParcelable.Param(mo10056id = 10) byte b5, @SafeParcelable.Param(mo10056id = 11) u44 u44) {
        Boolean bool = Boolean.TRUE;
        this.f7545a = bool;
        this.f7547b = bool;
        this.f7549c = bool;
        this.f7550d = bool;
        this.f7543a = streetViewPanoramaCamera;
        this.f7542a = latLng;
        this.f7546a = num;
        this.f7548b = str;
        this.f7545a = ha5.m16583b(b);
        this.f7547b = ha5.m16583b(b2);
        this.f7549c = ha5.m16583b(b3);
        this.f7550d = ha5.m16583b(b4);
        this.f7551e = ha5.m16583b(b5);
        this.f7544a = u44;
    }

    @ts2
    /* renamed from: K2 */
    public Boolean mo10637K2() {
        return this.f7549c;
    }

    @ts2
    /* renamed from: L2 */
    public String mo10638L2() {
        return this.f7548b;
    }

    @ts2
    /* renamed from: M2 */
    public LatLng mo10639M2() {
        return this.f7542a;
    }

    @ts2
    /* renamed from: N2 */
    public Integer mo10640N2() {
        return this.f7546a;
    }

    @mr2
    /* renamed from: O2 */
    public u44 mo10641O2() {
        return this.f7544a;
    }

    @ts2
    /* renamed from: P2 */
    public Boolean mo10642P2() {
        return this.f7550d;
    }

    @ts2
    /* renamed from: Q2 */
    public StreetViewPanoramaCamera mo10643Q2() {
        return this.f7543a;
    }

    @ts2
    /* renamed from: R2 */
    public Boolean mo10644R2() {
        return this.f7551e;
    }

    @ts2
    /* renamed from: S2 */
    public Boolean mo10645S2() {
        return this.f7545a;
    }

    @ts2
    /* renamed from: T2 */
    public Boolean mo10646T2() {
        return this.f7547b;
    }

    @mr2
    /* renamed from: U2 */
    public StreetViewPanoramaOptions mo10647U2(boolean z) {
        this.f7549c = Boolean.valueOf(z);
        return this;
    }

    @mr2
    /* renamed from: V2 */
    public StreetViewPanoramaOptions mo10648V2(@ts2 StreetViewPanoramaCamera streetViewPanoramaCamera) {
        this.f7543a = streetViewPanoramaCamera;
        return this;
    }

    @mr2
    /* renamed from: W2 */
    public StreetViewPanoramaOptions mo10649W2(@ts2 String str) {
        this.f7548b = str;
        return this;
    }

    @mr2
    /* renamed from: X2 */
    public StreetViewPanoramaOptions mo10650X2(@ts2 LatLng latLng) {
        this.f7542a = latLng;
        return this;
    }

    @mr2
    /* renamed from: Y2 */
    public StreetViewPanoramaOptions mo10651Y2(@ts2 LatLng latLng, @mr2 u44 u44) {
        this.f7542a = latLng;
        this.f7544a = u44;
        return this;
    }

    @mr2
    /* renamed from: Z2 */
    public StreetViewPanoramaOptions mo10652Z2(@ts2 LatLng latLng, @ts2 Integer num) {
        this.f7542a = latLng;
        this.f7546a = num;
        return this;
    }

    @mr2
    /* renamed from: a3 */
    public StreetViewPanoramaOptions mo10653a3(@ts2 LatLng latLng, @ts2 Integer num, @mr2 u44 u44) {
        this.f7542a = latLng;
        this.f7546a = num;
        this.f7544a = u44;
        return this;
    }

    @mr2
    /* renamed from: b3 */
    public StreetViewPanoramaOptions mo10654b3(boolean z) {
        this.f7550d = Boolean.valueOf(z);
        return this;
    }

    @mr2
    /* renamed from: c3 */
    public StreetViewPanoramaOptions mo10655c3(boolean z) {
        this.f7551e = Boolean.valueOf(z);
        return this;
    }

    @mr2
    /* renamed from: d3 */
    public StreetViewPanoramaOptions mo10656d3(boolean z) {
        this.f7545a = Boolean.valueOf(z);
        return this;
    }

    @mr2
    /* renamed from: e3 */
    public StreetViewPanoramaOptions mo10657e3(boolean z) {
        this.f7547b = Boolean.valueOf(z);
        return this;
    }

    @mr2
    public String toString() {
        return Objects.toStringHelper(this).add("PanoramaId", this.f7548b).add("Position", this.f7542a).add("Radius", this.f7546a).add("Source", this.f7544a).add("StreetViewPanoramaCamera", this.f7543a).add("UserNavigationEnabled", this.f7545a).add("ZoomGesturesEnabled", this.f7547b).add("PanningGesturesEnabled", this.f7549c).add("StreetNamesEnabled", this.f7550d).add("UseViewLifecycleInFragment", this.f7551e).toString();
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, mo10643Q2(), i, false);
        SafeParcelWriter.writeString(parcel, 3, mo10638L2(), false);
        SafeParcelWriter.writeParcelable(parcel, 4, mo10639M2(), i, false);
        SafeParcelWriter.writeIntegerObject(parcel, 5, mo10640N2(), false);
        SafeParcelWriter.writeByte(parcel, 6, ha5.m16582a(this.f7545a));
        SafeParcelWriter.writeByte(parcel, 7, ha5.m16582a(this.f7547b));
        SafeParcelWriter.writeByte(parcel, 8, ha5.m16582a(this.f7549c));
        SafeParcelWriter.writeByte(parcel, 9, ha5.m16582a(this.f7550d));
        SafeParcelWriter.writeByte(parcel, 10, ha5.m16582a(this.f7551e));
        SafeParcelWriter.writeParcelable(parcel, 11, mo10641O2(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
