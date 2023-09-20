package com.onedelhi.secure;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import com.onedelhi.secure.tn1;

@SafeParcelable.Class(creator = "MarkerOptionsCreator")
@SafeParcelable.Reserved({1})
public final class sd2 extends AbstractSafeParcelable {
    @mr2
    public static final Parcelable.Creator<sd2> CREATOR = new oh6();
    @SafeParcelable.Field(getter = "getAnchorU", mo10053id = 6)

    /* renamed from: a */
    public float f20303a = 0.5f;
    @SafeParcelable.Field(getter = "getPosition", mo10053id = 2)

    /* renamed from: a */
    public LatLng f20304a;
    @SafeParcelable.Field(getter = "getWrappedIconDescriptorImplBinder", mo10053id = 5, type = "android.os.IBinder")
    @ts2

    /* renamed from: a */
    public C3798vl f20305a;
    @SafeParcelable.Field(getter = "getAnchorV", mo10053id = 7)

    /* renamed from: b */
    public float f20306b = 1.0f;
    @SafeParcelable.Field(getter = "getTitle", mo10053id = 3)
    @ts2

    /* renamed from: b */
    public String f20307b;
    @SafeParcelable.Field(getter = "isDraggable", mo10053id = 8)

    /* renamed from: b */
    public boolean f20308b;
    @SafeParcelable.Field(getter = "getRotation", mo10053id = 11)

    /* renamed from: c */
    public float f20309c = 0.0f;
    @SafeParcelable.Field(getter = "getSnippet", mo10053id = 4)
    @ts2

    /* renamed from: c */
    public String f20310c;
    @SafeParcelable.Field(getter = "isVisible", mo10053id = 9)

    /* renamed from: c */
    public boolean f20311c = true;
    @SafeParcelable.Field(defaultValue = "0.5f", getter = "getInfoWindowAnchorU", mo10053id = 12)

    /* renamed from: d */
    public float f20312d = 0.5f;
    @SafeParcelable.Field(getter = "isFlat", mo10053id = 10)

    /* renamed from: d */
    public boolean f20313d = false;
    @SafeParcelable.Field(getter = "getInfoWindowAnchorV", mo10053id = 13)

    /* renamed from: e */
    public float f20314e = 0.0f;
    @SafeParcelable.Field(defaultValue = "1.0f", getter = "getAlpha", mo10053id = 14)

    /* renamed from: f */
    public float f20315f = 1.0f;
    @SafeParcelable.Field(getter = "getZIndex", mo10053id = 15)

    /* renamed from: g */
    public float f20316g;

    public sd2() {
    }

    @SafeParcelable.Constructor
    public sd2(@SafeParcelable.Param(mo10056id = 2) LatLng latLng, @SafeParcelable.Param(mo10056id = 3) String str, @SafeParcelable.Param(mo10056id = 4) String str2, @SafeParcelable.Param(mo10056id = 5) @ts2 IBinder iBinder, @SafeParcelable.Param(mo10056id = 6) float f, @SafeParcelable.Param(mo10056id = 7) float f2, @SafeParcelable.Param(mo10056id = 8) boolean z, @SafeParcelable.Param(mo10056id = 9) boolean z2, @SafeParcelable.Param(mo10056id = 10) boolean z3, @SafeParcelable.Param(mo10056id = 11) float f3, @SafeParcelable.Param(mo10056id = 12) float f4, @SafeParcelable.Param(mo10056id = 13) float f5, @SafeParcelable.Param(mo10056id = 14) float f6, @SafeParcelable.Param(mo10056id = 15) float f7) {
        this.f20304a = latLng;
        this.f20307b = str;
        this.f20310c = str2;
        this.f20305a = iBinder == null ? null : new C3798vl(tn1.C3647a.m28820j8(iBinder));
        this.f20303a = f;
        this.f20306b = f2;
        this.f20308b = z;
        this.f20311c = z2;
        this.f20313d = z3;
        this.f20309c = f3;
        this.f20312d = f4;
        this.f20314e = f5;
        this.f20315f = f6;
        this.f20316g = f7;
    }

    @mr2
    /* renamed from: K2 */
    public sd2 mo24309K2(float f) {
        this.f20315f = f;
        return this;
    }

    @mr2
    /* renamed from: L2 */
    public sd2 mo24310L2(float f, float f2) {
        this.f20303a = f;
        this.f20306b = f2;
        return this;
    }

    @mr2
    /* renamed from: M2 */
    public sd2 mo24311M2(boolean z) {
        this.f20308b = z;
        return this;
    }

    @mr2
    /* renamed from: N2 */
    public sd2 mo24312N2(boolean z) {
        this.f20313d = z;
        return this;
    }

    /* renamed from: O2 */
    public float mo24313O2() {
        return this.f20315f;
    }

    /* renamed from: P2 */
    public float mo24314P2() {
        return this.f20303a;
    }

    /* renamed from: Q2 */
    public float mo24315Q2() {
        return this.f20306b;
    }

    @ts2
    /* renamed from: R2 */
    public C3798vl mo24316R2() {
        return this.f20305a;
    }

    /* renamed from: S2 */
    public float mo24317S2() {
        return this.f20312d;
    }

    /* renamed from: T2 */
    public float mo24318T2() {
        return this.f20314e;
    }

    @mr2
    /* renamed from: U2 */
    public LatLng mo24319U2() {
        return this.f20304a;
    }

    /* renamed from: V2 */
    public float mo24320V2() {
        return this.f20309c;
    }

    @ts2
    /* renamed from: W2 */
    public String mo24321W2() {
        return this.f20310c;
    }

    @ts2
    /* renamed from: X2 */
    public String mo24322X2() {
        return this.f20307b;
    }

    /* renamed from: Y2 */
    public float mo24323Y2() {
        return this.f20316g;
    }

    @mr2
    /* renamed from: Z2 */
    public sd2 mo24324Z2(@ts2 C3798vl vlVar) {
        this.f20305a = vlVar;
        return this;
    }

    @mr2
    /* renamed from: a3 */
    public sd2 mo24325a3(float f, float f2) {
        this.f20312d = f;
        this.f20314e = f2;
        return this;
    }

    /* renamed from: b3 */
    public boolean mo24326b3() {
        return this.f20308b;
    }

    /* renamed from: c3 */
    public boolean mo24327c3() {
        return this.f20313d;
    }

    /* renamed from: d3 */
    public boolean mo24328d3() {
        return this.f20311c;
    }

    @mr2
    /* renamed from: e3 */
    public sd2 mo24329e3(@mr2 LatLng latLng) {
        if (latLng != null) {
            this.f20304a = latLng;
            return this;
        }
        throw new IllegalArgumentException("latlng cannot be null - a position is required.");
    }

    @mr2
    /* renamed from: f3 */
    public sd2 mo24330f3(float f) {
        this.f20309c = f;
        return this;
    }

    @mr2
    /* renamed from: g3 */
    public sd2 mo24331g3(@ts2 String str) {
        this.f20310c = str;
        return this;
    }

    @mr2
    /* renamed from: h3 */
    public sd2 mo24332h3(@ts2 String str) {
        this.f20307b = str;
        return this;
    }

    @mr2
    /* renamed from: i3 */
    public sd2 mo24333i3(boolean z) {
        this.f20311c = z;
        return this;
    }

    @mr2
    /* renamed from: j3 */
    public sd2 mo24334j3(float f) {
        this.f20316g = f;
        return this;
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, mo24319U2(), i, false);
        SafeParcelWriter.writeString(parcel, 3, mo24322X2(), false);
        SafeParcelWriter.writeString(parcel, 4, mo24321W2(), false);
        C3798vl vlVar = this.f20305a;
        SafeParcelWriter.writeIBinder(parcel, 5, vlVar == null ? null : vlVar.mo26166a().asBinder(), false);
        SafeParcelWriter.writeFloat(parcel, 6, mo24314P2());
        SafeParcelWriter.writeFloat(parcel, 7, mo24315Q2());
        SafeParcelWriter.writeBoolean(parcel, 8, mo24326b3());
        SafeParcelWriter.writeBoolean(parcel, 9, mo24328d3());
        SafeParcelWriter.writeBoolean(parcel, 10, mo24327c3());
        SafeParcelWriter.writeFloat(parcel, 11, mo24320V2());
        SafeParcelWriter.writeFloat(parcel, 12, mo24317S2());
        SafeParcelWriter.writeFloat(parcel, 13, mo24318T2());
        SafeParcelWriter.writeFloat(parcel, 14, mo24313O2());
        SafeParcelWriter.writeFloat(parcel, 15, mo24323Y2());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
