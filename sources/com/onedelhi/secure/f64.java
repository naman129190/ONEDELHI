package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "StyleSpanCreator")
@SafeParcelable.Reserved({1})
public final class f64 extends AbstractSafeParcelable {
    @mr2
    public static final Parcelable.Creator<f64> CREATOR = new g47();
    @SafeParcelable.Field(getter = "getSegments", mo10053id = 3)

    /* renamed from: a */
    public final double f11946a;
    @SafeParcelable.Field(getter = "getStyle", mo10053id = 2)

    /* renamed from: a */
    public final y54 f11947a;

    public f64(int i) {
        this.f11947a = y54.m31950K2(i).mo27207a();
        this.f11946a = 1.0d;
    }

    public f64(int i, double d) {
        if (d > 0.0d) {
            this.f11947a = y54.m31950K2(i).mo27207a();
            this.f11946a = d;
            return;
        }
        throw new IllegalArgumentException("A style must be applied to some segments on a polyline.");
    }

    public f64(@mr2 y54 y54) {
        this.f11947a = y54;
        this.f11946a = 1.0d;
    }

    @SafeParcelable.Constructor
    public f64(@SafeParcelable.Param(mo10056id = 2) @mr2 y54 y54, @SafeParcelable.Param(mo10056id = 3) double d) {
        if (d > 0.0d) {
            this.f11947a = y54;
            this.f11946a = d;
            return;
        }
        throw new IllegalArgumentException("A style must be applied to some segments on a polyline.");
    }

    /* renamed from: K2 */
    public double mo15842K2() {
        return this.f11946a;
    }

    @mr2
    /* renamed from: L2 */
    public y54 mo15843L2() {
        return this.f11947a;
    }

    public final void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, mo15843L2(), i, false);
        SafeParcelWriter.writeDouble(parcel, 3, mo15842K2());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
