package com.google.android.gms.maps.model;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.GoogleMapOptions;
import com.onedelhi.secure.d66;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;

@SafeParcelable.Class(creator = "LatLngBoundsCreator")
@SafeParcelable.Reserved({1})
public final class LatLngBounds extends AbstractSafeParcelable implements ReflectedParcelable {
    @mr2
    @KeepForSdk
    public static final Parcelable.Creator<LatLngBounds> CREATOR = new d66();
    @SafeParcelable.Field(mo10053id = 2)
    @mr2

    /* renamed from: a */
    public final LatLng f7564a;
    @SafeParcelable.Field(mo10053id = 3)
    @mr2

    /* renamed from: b */
    public final LatLng f7565b;

    /* renamed from: com.google.android.gms.maps.model.LatLngBounds$a */
    public static final class C1442a {

        /* renamed from: a */
        public double f7566a = Double.POSITIVE_INFINITY;

        /* renamed from: b */
        public double f7567b = Double.NEGATIVE_INFINITY;

        /* renamed from: c */
        public double f7568c = Double.NaN;

        /* renamed from: d */
        public double f7569d = Double.NaN;

        @mr2
        /* renamed from: a */
        public LatLngBounds mo10693a() {
            Preconditions.checkState(!Double.isNaN(this.f7568c), "no included points");
            return new LatLngBounds(new LatLng(this.f7566a, this.f7568c), new LatLng(this.f7567b, this.f7569d));
        }

        @mr2
        /* renamed from: b */
        public C1442a mo10694b(@mr2 LatLng latLng) {
            Preconditions.checkNotNull(latLng, "point must not be null");
            this.f7566a = Math.min(this.f7566a, latLng.f7562a);
            this.f7567b = Math.max(this.f7567b, latLng.f7562a);
            double d = latLng.f7563b;
            if (Double.isNaN(this.f7568c)) {
                this.f7568c = d;
            } else {
                double d2 = this.f7568c;
                double d3 = this.f7569d;
                if (d2 > d3 ? !(d2 <= d || d <= d3) : !(d2 <= d && d <= d3)) {
                    Parcelable.Creator<LatLngBounds> creator = LatLngBounds.CREATOR;
                    if (((d2 - d) + 360.0d) % 360.0d < ((d - d3) + 360.0d) % 360.0d) {
                        this.f7568c = d;
                    }
                }
                return this;
            }
            this.f7569d = d;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public LatLngBounds(@SafeParcelable.Param(mo10056id = 2) @mr2 LatLng latLng, @SafeParcelable.Param(mo10056id = 3) @mr2 LatLng latLng2) {
        Preconditions.checkNotNull(latLng, "southwest must not be null.");
        Preconditions.checkNotNull(latLng2, "northeast must not be null.");
        double d = latLng2.f7562a;
        double d2 = latLng.f7562a;
        Preconditions.checkArgument(d >= d2, "southern latitude exceeds northern latitude (%s > %s)", Double.valueOf(d2), Double.valueOf(latLng2.f7562a));
        this.f7564a = latLng;
        this.f7565b = latLng2;
    }

    @mr2
    /* renamed from: K2 */
    public static C1442a m9150K2() {
        return new C1442a();
    }

    @ts2
    /* renamed from: M2 */
    public static LatLngBounds m9151M2(@ts2 Context context, @ts2 AttributeSet attributeSet) {
        return GoogleMapOptions.m9051y3(context, attributeSet);
    }

    /* renamed from: L2 */
    public boolean mo10685L2(@mr2 LatLng latLng) {
        LatLng latLng2 = (LatLng) Preconditions.checkNotNull(latLng, "point must not be null.");
        double d = latLng2.f7562a;
        return this.f7564a.f7562a <= d && d <= this.f7565b.f7562a && mo10688P2(latLng2.f7563b);
    }

    @mr2
    /* renamed from: N2 */
    public LatLng mo10686N2() {
        LatLng latLng = this.f7564a;
        double d = latLng.f7562a;
        LatLng latLng2 = this.f7565b;
        double d2 = (d + latLng2.f7562a) / 2.0d;
        double d3 = latLng2.f7563b;
        double d4 = latLng.f7563b;
        if (d4 > d3) {
            d3 += 360.0d;
        }
        return new LatLng(d2, (d3 + d4) / 2.0d);
    }

    @mr2
    /* renamed from: O2 */
    public LatLngBounds mo10687O2(@mr2 LatLng latLng) {
        LatLng latLng2 = (LatLng) Preconditions.checkNotNull(latLng, "point must not be null.");
        double min = Math.min(this.f7564a.f7562a, latLng2.f7562a);
        double max = Math.max(this.f7565b.f7562a, latLng2.f7562a);
        double d = this.f7565b.f7563b;
        double d2 = this.f7564a.f7563b;
        double d3 = latLng2.f7563b;
        if (!mo10688P2(d3)) {
            if (((d2 - d3) + 360.0d) % 360.0d < ((d3 - d) + 360.0d) % 360.0d) {
                d2 = d3;
            } else {
                d = d3;
            }
        }
        return new LatLngBounds(new LatLng(min, d2), new LatLng(max, d));
    }

    /* renamed from: P2 */
    public final boolean mo10688P2(double d) {
        double d2 = this.f7564a.f7563b;
        double d3 = this.f7565b.f7563b;
        return d2 <= d3 ? d2 <= d && d <= d3 : d2 <= d || d <= d3;
    }

    public boolean equals(@ts2 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        return this.f7564a.equals(latLngBounds.f7564a) && this.f7565b.equals(latLngBounds.f7565b);
    }

    public int hashCode() {
        return Objects.hashCode(this.f7564a, this.f7565b);
    }

    @mr2
    public String toString() {
        return Objects.toStringHelper(this).add("southwest", this.f7564a).add("northeast", this.f7565b).toString();
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f7564a, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f7565b, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
