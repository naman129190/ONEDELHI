package com.google.android.gms.maps.model;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.GoogleMapOptions;
import com.onedelhi.secure.ia5;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;

@SafeParcelable.Class(creator = "CameraPositionCreator")
@SafeParcelable.Reserved({1})
public final class CameraPosition extends AbstractSafeParcelable implements ReflectedParcelable {
    @mr2
    public static final Parcelable.Creator<CameraPosition> CREATOR = new ia5();
    @SafeParcelable.Field(mo10053id = 3)

    /* renamed from: a */
    public final float f7554a;
    @SafeParcelable.Field(mo10053id = 2)
    @mr2

    /* renamed from: a */
    public final LatLng f7555a;
    @SafeParcelable.Field(mo10053id = 4)

    /* renamed from: b */
    public final float f7556b;
    @SafeParcelable.Field(mo10053id = 5)

    /* renamed from: c */
    public final float f7557c;

    /* renamed from: com.google.android.gms.maps.model.CameraPosition$a */
    public static final class C1441a {

        /* renamed from: a */
        public float f7558a;

        /* renamed from: a */
        public LatLng f7559a;

        /* renamed from: b */
        public float f7560b;

        /* renamed from: c */
        public float f7561c;

        public C1441a() {
        }

        public C1441a(@mr2 CameraPosition cameraPosition) {
            CameraPosition cameraPosition2 = (CameraPosition) Preconditions.checkNotNull(cameraPosition, "previous must not be null.");
            this.f7559a = cameraPosition2.f7555a;
            this.f7558a = cameraPosition2.f7554a;
            this.f7560b = cameraPosition2.f7556b;
            this.f7561c = cameraPosition2.f7557c;
        }

        @mr2
        /* renamed from: a */
        public C1441a mo10676a(float f) {
            this.f7561c = f;
            return this;
        }

        @mr2
        /* renamed from: b */
        public CameraPosition mo10677b() {
            return new CameraPosition(this.f7559a, this.f7558a, this.f7560b, this.f7561c);
        }

        @mr2
        /* renamed from: c */
        public C1441a mo10678c(@mr2 LatLng latLng) {
            this.f7559a = (LatLng) Preconditions.checkNotNull(latLng, "location must not be null.");
            return this;
        }

        @mr2
        /* renamed from: d */
        public C1441a mo10679d(float f) {
            this.f7560b = f;
            return this;
        }

        @mr2
        /* renamed from: e */
        public C1441a mo10680e(float f) {
            this.f7558a = f;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public CameraPosition(@SafeParcelable.Param(mo10056id = 2) @mr2 LatLng latLng, @SafeParcelable.Param(mo10056id = 3) float f, @SafeParcelable.Param(mo10056id = 4) float f2, @SafeParcelable.Param(mo10056id = 5) float f3) {
        Preconditions.checkNotNull(latLng, "camera target must not be null.");
        Preconditions.checkArgument(f2 >= 0.0f && f2 <= 90.0f, "Tilt needs to be between 0 and 90 inclusive: %s", Float.valueOf(f2));
        this.f7555a = latLng;
        this.f7554a = f;
        this.f7556b = f2 + 0.0f;
        this.f7557c = (((double) f3) <= 0.0d ? (f3 % 360.0f) + 360.0f : f3) % 360.0f;
    }

    @mr2
    /* renamed from: K2 */
    public static C1441a m9141K2() {
        return new C1441a();
    }

    @mr2
    /* renamed from: L2 */
    public static C1441a m9142L2(@mr2 CameraPosition cameraPosition) {
        return new C1441a(cameraPosition);
    }

    @ts2
    /* renamed from: M2 */
    public static CameraPosition m9143M2(@ts2 Context context, @ts2 AttributeSet attributeSet) {
        return GoogleMapOptions.m9050x3(context, attributeSet);
    }

    @mr2
    /* renamed from: N2 */
    public static final CameraPosition m9144N2(@mr2 LatLng latLng, float f) {
        return new CameraPosition(latLng, f, 0.0f, 0.0f);
    }

    public boolean equals(@ts2 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        return this.f7555a.equals(cameraPosition.f7555a) && Float.floatToIntBits(this.f7554a) == Float.floatToIntBits(cameraPosition.f7554a) && Float.floatToIntBits(this.f7556b) == Float.floatToIntBits(cameraPosition.f7556b) && Float.floatToIntBits(this.f7557c) == Float.floatToIntBits(cameraPosition.f7557c);
    }

    public int hashCode() {
        return Objects.hashCode(this.f7555a, Float.valueOf(this.f7554a), Float.valueOf(this.f7556b), Float.valueOf(this.f7557c));
    }

    @mr2
    public String toString() {
        return Objects.toStringHelper(this).add("target", this.f7555a).add("zoom", Float.valueOf(this.f7554a)).add("tilt", Float.valueOf(this.f7556b)).add("bearing", Float.valueOf(this.f7557c)).toString();
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f7555a, i, false);
        SafeParcelWriter.writeFloat(parcel, 3, this.f7554a);
        SafeParcelWriter.writeFloat(parcel, 4, this.f7556b);
        SafeParcelWriter.writeFloat(parcel, 5, this.f7557c);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
