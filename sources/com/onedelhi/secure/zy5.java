package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Locale;

@SafeParcelable.Class(creator = "ParcelableGeofenceCreator")
@SafeParcelable.Reserved({1000})
@VisibleForTesting
public final class zy5 extends AbstractSafeParcelable implements sf1 {
    public static final Parcelable.Creator<zy5> CREATOR = new dz5();
    @SafeParcelable.Field(getter = "getLatitude", mo10053id = 4)

    /* renamed from: a */
    public final double f23983a;
    @SafeParcelable.Field(getter = "getRadius", mo10053id = 6)

    /* renamed from: a */
    public final float f23984a;
    @SafeParcelable.Field(getter = "getType", mo10053id = 3)

    /* renamed from: a */
    public final short f23985a;
    @SafeParcelable.Field(getter = "getLongitude", mo10053id = 5)

    /* renamed from: b */
    public final double f23986b;
    @SafeParcelable.Field(getter = "getExpirationTime", mo10053id = 2)

    /* renamed from: b */
    public final long f23987b;
    @SafeParcelable.Field(getter = "getRequestId", mo10053id = 1)

    /* renamed from: b */
    public final String f23988b;
    @SafeParcelable.Field(getter = "getTransitionTypes", mo10053id = 7)

    /* renamed from: n */
    public final int f23989n;
    @SafeParcelable.Field(defaultValue = "0", getter = "getNotificationResponsiveness", mo10053id = 8)

    /* renamed from: o */
    public final int f23990o;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getLoiteringDelay", mo10053id = 9)

    /* renamed from: p */
    public final int f23991p;

    @SafeParcelable.Constructor
    public zy5(@SafeParcelable.Param(mo10056id = 1) String str, @SafeParcelable.Param(mo10056id = 7) int i, @SafeParcelable.Param(mo10056id = 3) short s, @SafeParcelable.Param(mo10056id = 4) double d, @SafeParcelable.Param(mo10056id = 5) double d2, @SafeParcelable.Param(mo10056id = 6) float f, @SafeParcelable.Param(mo10056id = 2) long j, @SafeParcelable.Param(mo10056id = 8) int i2, @SafeParcelable.Param(mo10056id = 9) int i3) {
        if (str == null || str.length() > 100) {
            throw new IllegalArgumentException("requestId is null or too long: ".concat(String.valueOf(str)));
        } else if (f <= 0.0f) {
            throw new IllegalArgumentException("invalid radius: " + f);
        } else if (d > 90.0d || d < -90.0d) {
            throw new IllegalArgumentException("invalid latitude: " + d);
        } else if (d2 > 180.0d || d2 < -180.0d) {
            throw new IllegalArgumentException("invalid longitude: " + d2);
        } else {
            int i4 = i & 7;
            if (i4 != 0) {
                this.f23985a = s;
                this.f23988b = str;
                this.f23983a = d;
                this.f23986b = d2;
                this.f23984a = f;
                this.f23987b = j;
                this.f23989n = i4;
                this.f23990o = i2;
                this.f23991p = i3;
                return;
            }
            throw new IllegalArgumentException("No supported transition specified: " + i);
        }
    }

    /* renamed from: A1 */
    public final String mo24349A1() {
        return this.f23988b;
    }

    /* renamed from: B1 */
    public final int mo24350B1() {
        return this.f23990o;
    }

    /* renamed from: C1 */
    public final int mo24351C1() {
        return this.f23991p;
    }

    /* renamed from: D1 */
    public final long mo24352D1() {
        return this.f23987b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zy5) {
            zy5 zy5 = (zy5) obj;
            return this.f23984a == zy5.f23984a && this.f23983a == zy5.f23983a && this.f23986b == zy5.f23986b && this.f23985a == zy5.f23985a;
        }
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f23983a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f23986b);
        return ((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + Float.floatToIntBits(this.f23984a)) * 31) + this.f23985a) * 31) + this.f23989n;
    }

    /* renamed from: i2 */
    public final int mo24353i2() {
        return this.f23989n;
    }

    /* renamed from: o0 */
    public final double mo24354o0() {
        return this.f23983a;
    }

    /* renamed from: p0 */
    public final float mo24355p0() {
        return this.f23984a;
    }

    public final String toString() {
        Locale locale = Locale.US;
        Object[] objArr = new Object[9];
        short s = this.f23985a;
        objArr[0] = s != -1 ? s != 1 ? "UNKNOWN" : "CIRCLE" : "INVALID";
        objArr[1] = this.f23988b.replaceAll("\\p{C}", "?");
        objArr[2] = Integer.valueOf(this.f23989n);
        objArr[3] = Double.valueOf(this.f23983a);
        objArr[4] = Double.valueOf(this.f23986b);
        objArr[5] = Float.valueOf(this.f23984a);
        objArr[6] = Integer.valueOf(this.f23990o / 1000);
        objArr[7] = Integer.valueOf(this.f23991p);
        objArr[8] = Long.valueOf(this.f23987b);
        return String.format(locale, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", objArr);
    }

    /* renamed from: w1 */
    public final double mo24356w1() {
        return this.f23986b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f23988b, false);
        SafeParcelWriter.writeLong(parcel, 2, this.f23987b);
        SafeParcelWriter.writeShort(parcel, 3, this.f23985a);
        SafeParcelWriter.writeDouble(parcel, 4, this.f23983a);
        SafeParcelWriter.writeDouble(parcel, 5, this.f23986b);
        SafeParcelWriter.writeFloat(parcel, 6, this.f23984a);
        SafeParcelWriter.writeInt(parcel, 7, this.f23989n);
        SafeParcelWriter.writeInt(parcel, 8, this.f23990o);
        SafeParcelWriter.writeInt(parcel, 9, this.f23991p);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
