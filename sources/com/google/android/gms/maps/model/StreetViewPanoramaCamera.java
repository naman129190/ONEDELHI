package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.C1444a;
import com.onedelhi.secure.bx6;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;

@SafeParcelable.Class(creator = "StreetViewPanoramaCameraCreator")
@SafeParcelable.Reserved({1})
public class StreetViewPanoramaCamera extends AbstractSafeParcelable implements ReflectedParcelable {
    @mr2
    public static final Parcelable.Creator<StreetViewPanoramaCamera> CREATOR = new bx6();
    @SafeParcelable.Field(mo10053id = 2)

    /* renamed from: a */
    public final float f7570a;

    /* renamed from: a */
    public final C1444a f7571a;
    @SafeParcelable.Field(mo10053id = 3)

    /* renamed from: b */
    public final float f7572b;
    @SafeParcelable.Field(mo10053id = 4)

    /* renamed from: c */
    public final float f7573c;

    /* renamed from: com.google.android.gms.maps.model.StreetViewPanoramaCamera$a */
    public static final class C1443a {

        /* renamed from: a */
        public float f7574a;

        /* renamed from: b */
        public float f7575b;

        /* renamed from: c */
        public float f7576c;

        public C1443a() {
        }

        public C1443a(@mr2 StreetViewPanoramaCamera streetViewPanoramaCamera) {
            Preconditions.checkNotNull(streetViewPanoramaCamera, "StreetViewPanoramaCamera must not be null.");
            this.f7576c = streetViewPanoramaCamera.f7570a;
            this.f7574a = streetViewPanoramaCamera.f7573c;
            this.f7575b = streetViewPanoramaCamera.f7572b;
        }

        @mr2
        /* renamed from: a */
        public C1443a mo10700a(float f) {
            this.f7574a = f;
            return this;
        }

        @mr2
        /* renamed from: b */
        public StreetViewPanoramaCamera mo10701b() {
            return new StreetViewPanoramaCamera(this.f7576c, this.f7575b, this.f7574a);
        }

        @mr2
        /* renamed from: c */
        public C1443a mo10702c(@mr2 C1444a aVar) {
            Preconditions.checkNotNull(aVar, "orientation must not be null.");
            this.f7575b = aVar.f7577a;
            this.f7574a = aVar.f7578b;
            return this;
        }

        @mr2
        /* renamed from: d */
        public C1443a mo10703d(float f) {
            this.f7575b = f;
            return this;
        }

        @mr2
        /* renamed from: e */
        public C1443a mo10704e(float f) {
            this.f7576c = f;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public StreetViewPanoramaCamera(@SafeParcelable.Param(mo10056id = 2) float f, @SafeParcelable.Param(mo10056id = 3) float f2, @SafeParcelable.Param(mo10056id = 4) float f3) {
        boolean z = false;
        if (f2 >= -90.0f && f2 <= 90.0f) {
            z = true;
        }
        Preconditions.checkArgument(z, "Tilt needs to be between -90 and 90 inclusive: " + f2);
        this.f7570a = ((double) f) <= 0.0d ? 0.0f : f;
        this.f7572b = 0.0f + f2;
        this.f7573c = (((double) f3) <= 0.0d ? (f3 % 360.0f) + 360.0f : f3) % 360.0f;
        C1444a.C1445a aVar = new C1444a.C1445a();
        aVar.mo10711c(f2);
        aVar.mo10709a(f3);
        this.f7571a = aVar.mo10710b();
    }

    @mr2
    /* renamed from: K2 */
    public static C1443a m9158K2() {
        return new C1443a();
    }

    @mr2
    /* renamed from: L2 */
    public static C1443a m9159L2(@mr2 StreetViewPanoramaCamera streetViewPanoramaCamera) {
        return new C1443a(streetViewPanoramaCamera);
    }

    @mr2
    /* renamed from: M2 */
    public C1444a mo10695M2() {
        return this.f7571a;
    }

    public boolean equals(@ts2 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaCamera)) {
            return false;
        }
        StreetViewPanoramaCamera streetViewPanoramaCamera = (StreetViewPanoramaCamera) obj;
        return Float.floatToIntBits(this.f7570a) == Float.floatToIntBits(streetViewPanoramaCamera.f7570a) && Float.floatToIntBits(this.f7572b) == Float.floatToIntBits(streetViewPanoramaCamera.f7572b) && Float.floatToIntBits(this.f7573c) == Float.floatToIntBits(streetViewPanoramaCamera.f7573c);
    }

    public int hashCode() {
        return Objects.hashCode(Float.valueOf(this.f7570a), Float.valueOf(this.f7572b), Float.valueOf(this.f7573c));
    }

    @mr2
    public String toString() {
        return Objects.toStringHelper(this).add("zoom", Float.valueOf(this.f7570a)).add("tilt", Float.valueOf(this.f7572b)).add("bearing", Float.valueOf(this.f7573c)).toString();
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeFloat(parcel, 2, this.f7570a);
        SafeParcelWriter.writeFloat(parcel, 3, this.f7572b);
        SafeParcelWriter.writeFloat(parcel, 4, this.f7573c);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
