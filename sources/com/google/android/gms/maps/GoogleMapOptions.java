package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.C1437a;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.onedelhi.secure.bc5;
import com.onedelhi.secure.d10;
import com.onedelhi.secure.ha5;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;

@SafeParcelable.Class(creator = "GoogleMapOptionsCreator")
@SafeParcelable.Reserved({1})
public final class GoogleMapOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    @mr2
    public static final Parcelable.Creator<GoogleMapOptions> CREATOR = new bc5();

    /* renamed from: b */
    public static final Integer f7520b = Integer.valueOf(Color.argb(255, 236, 233, 225));
    @SafeParcelable.Field(getter = "getCamera", mo10053id = 5)
    @ts2

    /* renamed from: a */
    public CameraPosition f7521a;
    @SafeParcelable.Field(getter = "getLatLngBoundsForCameraTarget", mo10053id = 18)
    @ts2

    /* renamed from: a */
    public LatLngBounds f7522a = null;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getZOrderOnTopForParcel", mo10053id = 2, type = "byte")
    @ts2

    /* renamed from: a */
    public Boolean f7523a;
    @SafeParcelable.Field(getter = "getMinZoomPreference", mo10053id = 16)
    @ts2

    /* renamed from: a */
    public Float f7524a = null;
    @SafeParcelable.Field(getter = "getBackgroundColor", mo10053id = 20)
    @ts2
    @d10

    /* renamed from: a */
    public Integer f7525a = null;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getUseViewLifecycleInFragmentForParcel", mo10053id = 3, type = "byte")
    @ts2

    /* renamed from: b */
    public Boolean f7526b;
    @SafeParcelable.Field(getter = "getMaxZoomPreference", mo10053id = 17)
    @ts2

    /* renamed from: b */
    public Float f7527b = null;
    @SafeParcelable.Field(getter = "getMapId", mo10053id = 21)
    @ts2

    /* renamed from: b */
    public String f7528b = null;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getZoomControlsEnabledForParcel", mo10053id = 6, type = "byte")
    @ts2

    /* renamed from: c */
    public Boolean f7529c;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getCompassEnabledForParcel", mo10053id = 7, type = "byte")
    @ts2

    /* renamed from: d */
    public Boolean f7530d;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getScrollGesturesEnabledForParcel", mo10053id = 8, type = "byte")
    @ts2

    /* renamed from: e */
    public Boolean f7531e;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getZoomGesturesEnabledForParcel", mo10053id = 9, type = "byte")
    @ts2

    /* renamed from: f */
    public Boolean f7532f;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getTiltGesturesEnabledForParcel", mo10053id = 10, type = "byte")
    @ts2

    /* renamed from: g */
    public Boolean f7533g;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getRotateGesturesEnabledForParcel", mo10053id = 11, type = "byte")
    @ts2

    /* renamed from: h */
    public Boolean f7534h;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getLiteModeForParcel", mo10053id = 12, type = "byte")
    @ts2

    /* renamed from: i */
    public Boolean f7535i;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getMapToolbarEnabledForParcel", mo10053id = 14, type = "byte")
    @ts2

    /* renamed from: j */
    public Boolean f7536j;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getAmbientEnabledForParcel", mo10053id = 15, type = "byte")
    @ts2

    /* renamed from: k */
    public Boolean f7537k;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getScrollGesturesEnabledDuringRotateOrZoomForParcel", mo10053id = 19, type = "byte")
    @ts2

    /* renamed from: l */
    public Boolean f7538l;
    @SafeParcelable.Field(getter = "getMapType", mo10053id = 4)

    /* renamed from: n */
    public int f7539n = -1;

    public GoogleMapOptions() {
    }

    @SafeParcelable.Constructor
    public GoogleMapOptions(@SafeParcelable.Param(mo10056id = 2) byte b, @SafeParcelable.Param(mo10056id = 3) byte b2, @SafeParcelable.Param(mo10056id = 4) int i, @SafeParcelable.Param(mo10056id = 5) @ts2 CameraPosition cameraPosition, @SafeParcelable.Param(mo10056id = 6) byte b3, @SafeParcelable.Param(mo10056id = 7) byte b4, @SafeParcelable.Param(mo10056id = 8) byte b5, @SafeParcelable.Param(mo10056id = 9) byte b6, @SafeParcelable.Param(mo10056id = 10) byte b7, @SafeParcelable.Param(mo10056id = 11) byte b8, @SafeParcelable.Param(mo10056id = 12) byte b9, @SafeParcelable.Param(mo10056id = 14) byte b10, @SafeParcelable.Param(mo10056id = 15) byte b11, @SafeParcelable.Param(mo10056id = 16) @ts2 Float f, @SafeParcelable.Param(mo10056id = 17) @ts2 Float f2, @SafeParcelable.Param(mo10056id = 18) @ts2 LatLngBounds latLngBounds, @SafeParcelable.Param(mo10056id = 19) byte b12, @SafeParcelable.Param(mo10056id = 20) @ts2 @d10 Integer num, @SafeParcelable.Param(mo10056id = 21) @ts2 String str) {
        this.f7523a = ha5.m16583b(b);
        this.f7526b = ha5.m16583b(b2);
        this.f7539n = i;
        this.f7521a = cameraPosition;
        this.f7529c = ha5.m16583b(b3);
        this.f7530d = ha5.m16583b(b4);
        this.f7531e = ha5.m16583b(b5);
        this.f7532f = ha5.m16583b(b6);
        this.f7533g = ha5.m16583b(b7);
        this.f7534h = ha5.m16583b(b8);
        this.f7535i = ha5.m16583b(b9);
        this.f7536j = ha5.m16583b(b10);
        this.f7537k = ha5.m16583b(b11);
        this.f7524a = f;
        this.f7527b = f2;
        this.f7522a = latLngBounds;
        this.f7538l = ha5.m16583b(b12);
        this.f7525a = num;
        this.f7528b = str;
    }

    @ts2
    /* renamed from: O2 */
    public static GoogleMapOptions m9049O2(@ts2 Context context, @ts2 AttributeSet attributeSet) {
        String string;
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C1437a.C1440c.MapAttrs);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        int i = C1437a.C1440c.MapAttrs_mapType;
        if (obtainAttributes.hasValue(i)) {
            googleMapOptions.mo10596m3(obtainAttributes.getInt(i, -1));
        }
        int i2 = C1437a.C1440c.MapAttrs_zOrderOnTop;
        if (obtainAttributes.hasValue(i2)) {
            googleMapOptions.mo10605u3(obtainAttributes.getBoolean(i2, false));
        }
        int i3 = C1437a.C1440c.MapAttrs_useViewLifecycle;
        if (obtainAttributes.hasValue(i3)) {
            googleMapOptions.mo10603t3(obtainAttributes.getBoolean(i3, false));
        }
        int i4 = C1437a.C1440c.MapAttrs_uiCompass;
        if (obtainAttributes.hasValue(i4)) {
            googleMapOptions.mo10572N2(obtainAttributes.getBoolean(i4, true));
        }
        int i5 = C1437a.C1440c.MapAttrs_uiRotateGestures;
        if (obtainAttributes.hasValue(i5)) {
            googleMapOptions.mo10599p3(obtainAttributes.getBoolean(i5, true));
        }
        int i6 = C1437a.C1440c.MapAttrs_uiScrollGesturesDuringRotateOrZoom;
        if (obtainAttributes.hasValue(i6)) {
            googleMapOptions.mo10601r3(obtainAttributes.getBoolean(i6, true));
        }
        int i7 = C1437a.C1440c.MapAttrs_uiScrollGestures;
        if (obtainAttributes.hasValue(i7)) {
            googleMapOptions.mo10600q3(obtainAttributes.getBoolean(i7, true));
        }
        int i8 = C1437a.C1440c.MapAttrs_uiTiltGestures;
        if (obtainAttributes.hasValue(i8)) {
            googleMapOptions.mo10602s3(obtainAttributes.getBoolean(i8, true));
        }
        int i9 = C1437a.C1440c.MapAttrs_uiZoomGestures;
        if (obtainAttributes.hasValue(i9)) {
            googleMapOptions.mo10607w3(obtainAttributes.getBoolean(i9, true));
        }
        int i10 = C1437a.C1440c.MapAttrs_uiZoomControls;
        if (obtainAttributes.hasValue(i10)) {
            googleMapOptions.mo10606v3(obtainAttributes.getBoolean(i10, true));
        }
        int i11 = C1437a.C1440c.MapAttrs_liteMode;
        if (obtainAttributes.hasValue(i11)) {
            googleMapOptions.mo10593j3(obtainAttributes.getBoolean(i11, false));
        }
        int i12 = C1437a.C1440c.MapAttrs_uiMapToolbar;
        if (obtainAttributes.hasValue(i12)) {
            googleMapOptions.mo10595l3(obtainAttributes.getBoolean(i12, true));
        }
        int i13 = C1437a.C1440c.MapAttrs_ambientEnabled;
        if (obtainAttributes.hasValue(i13)) {
            googleMapOptions.mo10569K2(obtainAttributes.getBoolean(i13, false));
        }
        int i14 = C1437a.C1440c.MapAttrs_cameraMinZoomPreference;
        if (obtainAttributes.hasValue(i14)) {
            googleMapOptions.mo10598o3(obtainAttributes.getFloat(i14, Float.NEGATIVE_INFINITY));
        }
        if (obtainAttributes.hasValue(i14)) {
            googleMapOptions.mo10597n3(obtainAttributes.getFloat(C1437a.C1440c.MapAttrs_cameraMaxZoomPreference, Float.POSITIVE_INFINITY));
        }
        int i15 = C1437a.C1440c.MapAttrs_backgroundColor;
        if (obtainAttributes.hasValue(i15)) {
            googleMapOptions.mo10570L2(Integer.valueOf(obtainAttributes.getColor(i15, f7520b.intValue())));
        }
        int i16 = C1437a.C1440c.MapAttrs_mapId;
        if (obtainAttributes.hasValue(i16) && (string = obtainAttributes.getString(i16)) != null && !string.isEmpty()) {
            googleMapOptions.mo10594k3(string);
        }
        googleMapOptions.mo10592i3(m9051y3(context, attributeSet));
        googleMapOptions.mo10571M2(m9050x3(context, attributeSet));
        obtainAttributes.recycle();
        return googleMapOptions;
    }

    @ts2
    /* renamed from: x3 */
    public static CameraPosition m9050x3(@ts2 Context context, @ts2 AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C1437a.C1440c.MapAttrs);
        int i = C1437a.C1440c.MapAttrs_cameraTargetLat;
        float f = obtainAttributes.hasValue(i) ? obtainAttributes.getFloat(i, 0.0f) : 0.0f;
        int i2 = C1437a.C1440c.MapAttrs_cameraTargetLng;
        LatLng latLng = new LatLng((double) f, (double) (obtainAttributes.hasValue(i2) ? obtainAttributes.getFloat(i2, 0.0f) : 0.0f));
        CameraPosition.C1441a K2 = CameraPosition.m9141K2();
        K2.mo10678c(latLng);
        int i3 = C1437a.C1440c.MapAttrs_cameraZoom;
        if (obtainAttributes.hasValue(i3)) {
            K2.mo10680e(obtainAttributes.getFloat(i3, 0.0f));
        }
        int i4 = C1437a.C1440c.MapAttrs_cameraBearing;
        if (obtainAttributes.hasValue(i4)) {
            K2.mo10676a(obtainAttributes.getFloat(i4, 0.0f));
        }
        int i5 = C1437a.C1440c.MapAttrs_cameraTilt;
        if (obtainAttributes.hasValue(i5)) {
            K2.mo10679d(obtainAttributes.getFloat(i5, 0.0f));
        }
        obtainAttributes.recycle();
        return K2.mo10677b();
    }

    @ts2
    /* renamed from: y3 */
    public static LatLngBounds m9051y3(@ts2 Context context, @ts2 AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C1437a.C1440c.MapAttrs);
        int i = C1437a.C1440c.MapAttrs_latLngBoundsSouthWestLatitude;
        Float valueOf = obtainAttributes.hasValue(i) ? Float.valueOf(obtainAttributes.getFloat(i, 0.0f)) : null;
        int i2 = C1437a.C1440c.MapAttrs_latLngBoundsSouthWestLongitude;
        Float valueOf2 = obtainAttributes.hasValue(i2) ? Float.valueOf(obtainAttributes.getFloat(i2, 0.0f)) : null;
        int i3 = C1437a.C1440c.MapAttrs_latLngBoundsNorthEastLatitude;
        Float valueOf3 = obtainAttributes.hasValue(i3) ? Float.valueOf(obtainAttributes.getFloat(i3, 0.0f)) : null;
        int i4 = C1437a.C1440c.MapAttrs_latLngBoundsNorthEastLongitude;
        Float valueOf4 = obtainAttributes.hasValue(i4) ? Float.valueOf(obtainAttributes.getFloat(i4, 0.0f)) : null;
        obtainAttributes.recycle();
        if (valueOf == null || valueOf2 == null || valueOf3 == null || valueOf4 == null) {
            return null;
        }
        return new LatLngBounds(new LatLng((double) valueOf.floatValue(), (double) valueOf2.floatValue()), new LatLng((double) valueOf3.floatValue(), (double) valueOf4.floatValue()));
    }

    @mr2
    /* renamed from: K2 */
    public GoogleMapOptions mo10569K2(boolean z) {
        this.f7537k = Boolean.valueOf(z);
        return this;
    }

    @mr2
    /* renamed from: L2 */
    public GoogleMapOptions mo10570L2(@ts2 @d10 Integer num) {
        this.f7525a = num;
        return this;
    }

    @mr2
    /* renamed from: M2 */
    public GoogleMapOptions mo10571M2(@ts2 CameraPosition cameraPosition) {
        this.f7521a = cameraPosition;
        return this;
    }

    @mr2
    /* renamed from: N2 */
    public GoogleMapOptions mo10572N2(boolean z) {
        this.f7530d = Boolean.valueOf(z);
        return this;
    }

    @ts2
    /* renamed from: P2 */
    public Boolean mo10573P2() {
        return this.f7537k;
    }

    @ts2
    @d10
    /* renamed from: Q2 */
    public Integer mo10574Q2() {
        return this.f7525a;
    }

    @ts2
    /* renamed from: R2 */
    public CameraPosition mo10575R2() {
        return this.f7521a;
    }

    @ts2
    /* renamed from: S2 */
    public Boolean mo10576S2() {
        return this.f7530d;
    }

    @ts2
    /* renamed from: T2 */
    public LatLngBounds mo10577T2() {
        return this.f7522a;
    }

    @ts2
    /* renamed from: U2 */
    public Boolean mo10578U2() {
        return this.f7535i;
    }

    @ts2
    /* renamed from: V2 */
    public String mo10579V2() {
        return this.f7528b;
    }

    @ts2
    /* renamed from: W2 */
    public Boolean mo10580W2() {
        return this.f7536j;
    }

    /* renamed from: X2 */
    public int mo10581X2() {
        return this.f7539n;
    }

    @ts2
    /* renamed from: Y2 */
    public Float mo10582Y2() {
        return this.f7527b;
    }

    @ts2
    /* renamed from: Z2 */
    public Float mo10583Z2() {
        return this.f7524a;
    }

    @ts2
    /* renamed from: a3 */
    public Boolean mo10584a3() {
        return this.f7534h;
    }

    @ts2
    /* renamed from: b3 */
    public Boolean mo10585b3() {
        return this.f7531e;
    }

    @ts2
    /* renamed from: c3 */
    public Boolean mo10586c3() {
        return this.f7538l;
    }

    @ts2
    /* renamed from: d3 */
    public Boolean mo10587d3() {
        return this.f7533g;
    }

    @ts2
    /* renamed from: e3 */
    public Boolean mo10588e3() {
        return this.f7526b;
    }

    @ts2
    /* renamed from: f3 */
    public Boolean mo10589f3() {
        return this.f7523a;
    }

    @ts2
    /* renamed from: g3 */
    public Boolean mo10590g3() {
        return this.f7529c;
    }

    @ts2
    /* renamed from: h3 */
    public Boolean mo10591h3() {
        return this.f7532f;
    }

    @mr2
    /* renamed from: i3 */
    public GoogleMapOptions mo10592i3(@ts2 LatLngBounds latLngBounds) {
        this.f7522a = latLngBounds;
        return this;
    }

    @mr2
    /* renamed from: j3 */
    public GoogleMapOptions mo10593j3(boolean z) {
        this.f7535i = Boolean.valueOf(z);
        return this;
    }

    @mr2
    /* renamed from: k3 */
    public GoogleMapOptions mo10594k3(@mr2 String str) {
        this.f7528b = str;
        return this;
    }

    @mr2
    /* renamed from: l3 */
    public GoogleMapOptions mo10595l3(boolean z) {
        this.f7536j = Boolean.valueOf(z);
        return this;
    }

    @mr2
    /* renamed from: m3 */
    public GoogleMapOptions mo10596m3(int i) {
        this.f7539n = i;
        return this;
    }

    @mr2
    /* renamed from: n3 */
    public GoogleMapOptions mo10597n3(float f) {
        this.f7527b = Float.valueOf(f);
        return this;
    }

    @mr2
    /* renamed from: o3 */
    public GoogleMapOptions mo10598o3(float f) {
        this.f7524a = Float.valueOf(f);
        return this;
    }

    @mr2
    /* renamed from: p3 */
    public GoogleMapOptions mo10599p3(boolean z) {
        this.f7534h = Boolean.valueOf(z);
        return this;
    }

    @mr2
    /* renamed from: q3 */
    public GoogleMapOptions mo10600q3(boolean z) {
        this.f7531e = Boolean.valueOf(z);
        return this;
    }

    @mr2
    /* renamed from: r3 */
    public GoogleMapOptions mo10601r3(boolean z) {
        this.f7538l = Boolean.valueOf(z);
        return this;
    }

    @mr2
    /* renamed from: s3 */
    public GoogleMapOptions mo10602s3(boolean z) {
        this.f7533g = Boolean.valueOf(z);
        return this;
    }

    @mr2
    /* renamed from: t3 */
    public GoogleMapOptions mo10603t3(boolean z) {
        this.f7526b = Boolean.valueOf(z);
        return this;
    }

    @mr2
    public String toString() {
        return Objects.toStringHelper(this).add("MapType", Integer.valueOf(this.f7539n)).add("LiteMode", this.f7535i).add("Camera", this.f7521a).add("CompassEnabled", this.f7530d).add("ZoomControlsEnabled", this.f7529c).add("ScrollGesturesEnabled", this.f7531e).add("ZoomGesturesEnabled", this.f7532f).add("TiltGesturesEnabled", this.f7533g).add("RotateGesturesEnabled", this.f7534h).add("ScrollGesturesEnabledDuringRotateOrZoom", this.f7538l).add("MapToolbarEnabled", this.f7536j).add("AmbientEnabled", this.f7537k).add("MinZoomPreference", this.f7524a).add("MaxZoomPreference", this.f7527b).add("BackgroundColor", this.f7525a).add("LatLngBoundsForCameraTarget", this.f7522a).add("ZOrderOnTop", this.f7523a).add("UseViewLifecycleInFragment", this.f7526b).toString();
    }

    @mr2
    /* renamed from: u3 */
    public GoogleMapOptions mo10605u3(boolean z) {
        this.f7523a = Boolean.valueOf(z);
        return this;
    }

    @mr2
    /* renamed from: v3 */
    public GoogleMapOptions mo10606v3(boolean z) {
        this.f7529c = Boolean.valueOf(z);
        return this;
    }

    @mr2
    /* renamed from: w3 */
    public GoogleMapOptions mo10607w3(boolean z) {
        this.f7532f = Boolean.valueOf(z);
        return this;
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByte(parcel, 2, ha5.m16582a(this.f7523a));
        SafeParcelWriter.writeByte(parcel, 3, ha5.m16582a(this.f7526b));
        SafeParcelWriter.writeInt(parcel, 4, mo10581X2());
        SafeParcelWriter.writeParcelable(parcel, 5, mo10575R2(), i, false);
        SafeParcelWriter.writeByte(parcel, 6, ha5.m16582a(this.f7529c));
        SafeParcelWriter.writeByte(parcel, 7, ha5.m16582a(this.f7530d));
        SafeParcelWriter.writeByte(parcel, 8, ha5.m16582a(this.f7531e));
        SafeParcelWriter.writeByte(parcel, 9, ha5.m16582a(this.f7532f));
        SafeParcelWriter.writeByte(parcel, 10, ha5.m16582a(this.f7533g));
        SafeParcelWriter.writeByte(parcel, 11, ha5.m16582a(this.f7534h));
        SafeParcelWriter.writeByte(parcel, 12, ha5.m16582a(this.f7535i));
        SafeParcelWriter.writeByte(parcel, 14, ha5.m16582a(this.f7536j));
        SafeParcelWriter.writeByte(parcel, 15, ha5.m16582a(this.f7537k));
        SafeParcelWriter.writeFloatObject(parcel, 16, mo10583Z2(), false);
        SafeParcelWriter.writeFloatObject(parcel, 17, mo10582Y2(), false);
        SafeParcelWriter.writeParcelable(parcel, 18, mo10577T2(), i, false);
        SafeParcelWriter.writeByte(parcel, 19, ha5.m16582a(this.f7538l));
        SafeParcelWriter.writeIntegerObject(parcel, 20, mo10574Q2(), false);
        SafeParcelWriter.writeString(parcel, 21, mo10579V2(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
