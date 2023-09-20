package com.onedelhi.secure;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.onedelhi.secure.tn1;

@SafeParcelable.Class(creator = "GroundOverlayOptionsCreator")
@SafeParcelable.Reserved({1})
public final class xi1 extends AbstractSafeParcelable {
    @mr2
    public static final Parcelable.Creator<xi1> CREATOR = new hx5();

    /* renamed from: h */
    public static final float f22572h = -1.0f;
    @SafeParcelable.Field(getter = "getWidth", mo10053id = 4)

    /* renamed from: a */
    public float f22573a;
    @SafeParcelable.Field(getter = "getLocation", mo10053id = 3)
    @ts2

    /* renamed from: a */
    public LatLng f22574a;
    @SafeParcelable.Field(getter = "getBounds", mo10053id = 6)
    @ts2

    /* renamed from: a */
    public LatLngBounds f22575a;
    @SafeParcelable.Field(getter = "getWrappedImageDescriptorImplBinder", mo10053id = 2, type = "android.os.IBinder")

    /* renamed from: a */
    public C3798vl f22576a;
    @SafeParcelable.Field(getter = "getHeight", mo10053id = 5)

    /* renamed from: b */
    public float f22577b;
    @SafeParcelable.Field(getter = "isVisible", mo10053id = 9)

    /* renamed from: b */
    public boolean f22578b = true;
    @SafeParcelable.Field(getter = "getBearing", mo10053id = 7)

    /* renamed from: c */
    public float f22579c;
    @SafeParcelable.Field(getter = "isClickable", mo10053id = 13)

    /* renamed from: c */
    public boolean f22580c = false;
    @SafeParcelable.Field(getter = "getZIndex", mo10053id = 8)

    /* renamed from: d */
    public float f22581d;
    @SafeParcelable.Field(getter = "getTransparency", mo10053id = 10)

    /* renamed from: e */
    public float f22582e = 0.0f;
    @SafeParcelable.Field(getter = "getAnchorU", mo10053id = 11)

    /* renamed from: f */
    public float f22583f = 0.5f;
    @SafeParcelable.Field(getter = "getAnchorV", mo10053id = 12)

    /* renamed from: g */
    public float f22584g = 0.5f;

    public xi1() {
    }

    @SafeParcelable.Constructor
    public xi1(@SafeParcelable.Param(mo10056id = 2) IBinder iBinder, @SafeParcelable.Param(mo10056id = 3) LatLng latLng, @SafeParcelable.Param(mo10056id = 4) float f, @SafeParcelable.Param(mo10056id = 5) float f2, @SafeParcelable.Param(mo10056id = 6) LatLngBounds latLngBounds, @SafeParcelable.Param(mo10056id = 7) float f3, @SafeParcelable.Param(mo10056id = 8) float f4, @SafeParcelable.Param(mo10056id = 9) boolean z, @SafeParcelable.Param(mo10056id = 10) float f5, @SafeParcelable.Param(mo10056id = 11) float f6, @SafeParcelable.Param(mo10056id = 12) float f7, @SafeParcelable.Param(mo10056id = 13) boolean z2) {
        this.f22576a = new C3798vl(tn1.C3647a.m28820j8(iBinder));
        this.f22574a = latLng;
        this.f22573a = f;
        this.f22577b = f2;
        this.f22575a = latLngBounds;
        this.f22579c = f3;
        this.f22581d = f4;
        this.f22578b = z;
        this.f22582e = f5;
        this.f22583f = f6;
        this.f22584g = f7;
        this.f22580c = z2;
    }

    @mr2
    /* renamed from: K2 */
    public xi1 mo26926K2(float f, float f2) {
        this.f22583f = f;
        this.f22584g = f2;
        return this;
    }

    @mr2
    /* renamed from: L2 */
    public xi1 mo26927L2(float f) {
        this.f22579c = ((f % 360.0f) + 360.0f) % 360.0f;
        return this;
    }

    @mr2
    /* renamed from: M2 */
    public xi1 mo26928M2(boolean z) {
        this.f22580c = z;
        return this;
    }

    /* renamed from: N2 */
    public float mo26929N2() {
        return this.f22583f;
    }

    /* renamed from: O2 */
    public float mo26930O2() {
        return this.f22584g;
    }

    /* renamed from: P2 */
    public float mo26931P2() {
        return this.f22579c;
    }

    @ts2
    /* renamed from: Q2 */
    public LatLngBounds mo26932Q2() {
        return this.f22575a;
    }

    /* renamed from: R2 */
    public float mo26933R2() {
        return this.f22577b;
    }

    @mr2
    /* renamed from: S2 */
    public C3798vl mo26934S2() {
        return this.f22576a;
    }

    @ts2
    /* renamed from: T2 */
    public LatLng mo26935T2() {
        return this.f22574a;
    }

    /* renamed from: U2 */
    public float mo26936U2() {
        return this.f22582e;
    }

    /* renamed from: V2 */
    public float mo26937V2() {
        return this.f22573a;
    }

    /* renamed from: W2 */
    public float mo26938W2() {
        return this.f22581d;
    }

    @mr2
    /* renamed from: X2 */
    public xi1 mo26939X2(@mr2 C3798vl vlVar) {
        Preconditions.checkNotNull(vlVar, "imageDescriptor must not be null");
        this.f22576a = vlVar;
        return this;
    }

    /* renamed from: Y2 */
    public boolean mo26940Y2() {
        return this.f22580c;
    }

    /* renamed from: Z2 */
    public boolean mo26941Z2() {
        return this.f22578b;
    }

    @mr2
    /* renamed from: a3 */
    public xi1 mo26942a3(@mr2 LatLng latLng, float f) {
        boolean z = true;
        Preconditions.checkState(this.f22575a == null, "Position has already been set using positionFromBounds");
        Preconditions.checkArgument(latLng != null, "Location must be specified");
        if (f < 0.0f) {
            z = false;
        }
        Preconditions.checkArgument(z, "Width must be non-negative");
        mo26948g3(latLng, f, -1.0f);
        return this;
    }

    @mr2
    /* renamed from: b3 */
    public xi1 mo26943b3(@mr2 LatLng latLng, float f, float f2) {
        boolean z = true;
        Preconditions.checkState(this.f22575a == null, "Position has already been set using positionFromBounds");
        Preconditions.checkArgument(latLng != null, "Location must be specified");
        Preconditions.checkArgument(f >= 0.0f, "Width must be non-negative");
        if (f2 < 0.0f) {
            z = false;
        }
        Preconditions.checkArgument(z, "Height must be non-negative");
        mo26948g3(latLng, f, f2);
        return this;
    }

    @mr2
    /* renamed from: c3 */
    public xi1 mo26944c3(@mr2 LatLngBounds latLngBounds) {
        LatLng latLng = this.f22574a;
        Preconditions.checkState(latLng == null, "Position has already been set using position: ".concat(String.valueOf(latLng)));
        this.f22575a = latLngBounds;
        return this;
    }

    @mr2
    /* renamed from: d3 */
    public xi1 mo26945d3(float f) {
        boolean z = false;
        if (f >= 0.0f && f <= 1.0f) {
            z = true;
        }
        Preconditions.checkArgument(z, "Transparency must be in the range [0..1]");
        this.f22582e = f;
        return this;
    }

    @mr2
    /* renamed from: e3 */
    public xi1 mo26946e3(boolean z) {
        this.f22578b = z;
        return this;
    }

    @mr2
    /* renamed from: f3 */
    public xi1 mo26947f3(float f) {
        this.f22581d = f;
        return this;
    }

    /* renamed from: g3 */
    public final xi1 mo26948g3(LatLng latLng, float f, float f2) {
        this.f22574a = latLng;
        this.f22573a = f;
        this.f22577b = f2;
        return this;
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIBinder(parcel, 2, this.f22576a.mo26166a().asBinder(), false);
        SafeParcelWriter.writeParcelable(parcel, 3, mo26935T2(), i, false);
        SafeParcelWriter.writeFloat(parcel, 4, mo26937V2());
        SafeParcelWriter.writeFloat(parcel, 5, mo26933R2());
        SafeParcelWriter.writeParcelable(parcel, 6, mo26932Q2(), i, false);
        SafeParcelWriter.writeFloat(parcel, 7, mo26931P2());
        SafeParcelWriter.writeFloat(parcel, 8, mo26938W2());
        SafeParcelWriter.writeBoolean(parcel, 9, mo26941Z2());
        SafeParcelWriter.writeFloat(parcel, 10, mo26936U2());
        SafeParcelWriter.writeFloat(parcel, 11, mo26929N2());
        SafeParcelWriter.writeFloat(parcel, 12, mo26930O2());
        SafeParcelWriter.writeBoolean(parcel, 13, mo26940Y2());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
