package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.r17;
import com.onedelhi.secure.ts2;

@SafeParcelable.Class(creator = "StreetViewPanoramaOrientationCreator")
@SafeParcelable.Reserved({1})
/* renamed from: com.google.android.gms.maps.model.a */
public class C1444a extends AbstractSafeParcelable {
    @mr2
    public static final Parcelable.Creator<C1444a> CREATOR = new r17();
    @SafeParcelable.Field(mo10053id = 2)

    /* renamed from: a */
    public final float f7577a;
    @SafeParcelable.Field(mo10053id = 3)

    /* renamed from: b */
    public final float f7578b;

    /* renamed from: com.google.android.gms.maps.model.a$a */
    public static final class C1445a {

        /* renamed from: a */
        public float f7579a;

        /* renamed from: b */
        public float f7580b;

        public C1445a() {
        }

        public C1445a(@mr2 C1444a aVar) {
            Preconditions.checkNotNull(aVar, "StreetViewPanoramaOrientation must not be null.");
            this.f7579a = aVar.f7578b;
            this.f7580b = aVar.f7577a;
        }

        @mr2
        /* renamed from: a */
        public C1445a mo10709a(float f) {
            this.f7579a = f;
            return this;
        }

        @mr2
        /* renamed from: b */
        public C1444a mo10710b() {
            return new C1444a(this.f7580b, this.f7579a);
        }

        @mr2
        /* renamed from: c */
        public C1445a mo10711c(float f) {
            this.f7580b = f;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public C1444a(@SafeParcelable.Param(mo10056id = 2) float f, @SafeParcelable.Param(mo10056id = 3) float f2) {
        boolean z = false;
        if (f >= -90.0f && f <= 90.0f) {
            z = true;
        }
        Preconditions.checkArgument(z, "Tilt needs to be between -90 and 90 inclusive: " + f);
        this.f7577a = f + 0.0f;
        this.f7578b = (((double) f2) <= 0.0d ? (f2 % 360.0f) + 360.0f : f2) % 360.0f;
    }

    @mr2
    /* renamed from: K2 */
    public static C1445a m9166K2() {
        return new C1445a();
    }

    @mr2
    /* renamed from: L2 */
    public static C1445a m9167L2(@mr2 C1444a aVar) {
        return new C1445a(aVar);
    }

    public boolean equals(@ts2 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1444a)) {
            return false;
        }
        C1444a aVar = (C1444a) obj;
        return Float.floatToIntBits(this.f7577a) == Float.floatToIntBits(aVar.f7577a) && Float.floatToIntBits(this.f7578b) == Float.floatToIntBits(aVar.f7578b);
    }

    public int hashCode() {
        return Objects.hashCode(Float.valueOf(this.f7577a), Float.valueOf(this.f7578b));
    }

    @mr2
    public String toString() {
        return Objects.toStringHelper(this).add("tilt", Float.valueOf(this.f7577a)).add("bearing", Float.valueOf(this.f7578b)).toString();
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeFloat(parcel, 2, this.f7577a);
        SafeParcelWriter.writeFloat(parcel, 3, this.f7578b);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
