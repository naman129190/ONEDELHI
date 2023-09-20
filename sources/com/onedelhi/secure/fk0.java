package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Comparator;

@SafeParcelable.Class(creator = "DetectedActivityCreator")
@SafeParcelable.Reserved({1000})
public class fk0 extends AbstractSafeParcelable {
    @mr2
    public static final Parcelable.Creator<fk0> CREATOR = new qp6();
    @mr2

    /* renamed from: a */
    public static final Comparator f12103a = new xm6();

    /* renamed from: p */
    public static final int f12104p = 0;

    /* renamed from: q */
    public static final int f12105q = 1;

    /* renamed from: r */
    public static final int f12106r = 2;

    /* renamed from: s */
    public static final int f12107s = 3;

    /* renamed from: t */
    public static final int f12108t = 4;

    /* renamed from: u */
    public static final int f12109u = 5;

    /* renamed from: v */
    public static final int f12110v = 7;

    /* renamed from: w */
    public static final int f12111w = 8;
    @SafeParcelable.Field(mo10053id = 1)

    /* renamed from: n */
    public int f12112n;
    @SafeParcelable.Field(mo10053id = 2)

    /* renamed from: o */
    public int f12113o;

    @SafeParcelable.Constructor
    public fk0(@SafeParcelable.Param(mo10056id = 1) int i, @SafeParcelable.Param(mo10056id = 2) int i2) {
        this.f12112n = i;
        this.f12113o = i2;
    }

    /* renamed from: K2 */
    public int mo16025K2() {
        return this.f12113o;
    }

    /* renamed from: L2 */
    public int mo16026L2() {
        int i = this.f12112n;
        if (i > 22 || i < 0) {
            return 4;
        }
        return i;
    }

    @ShowFirstParty
    public final boolean equals(@ts2 Object obj) {
        if (obj instanceof fk0) {
            fk0 fk0 = (fk0) obj;
            return this.f12112n == fk0.f12112n && this.f12113o == fk0.f12113o;
        }
    }

    @ShowFirstParty
    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f12112n), Integer.valueOf(this.f12113o));
    }

    @mr2
    public String toString() {
        int L2 = mo16026L2();
        String num = L2 != 0 ? L2 != 1 ? L2 != 2 ? L2 != 3 ? L2 != 4 ? L2 != 5 ? L2 != 7 ? L2 != 8 ? L2 != 16 ? L2 != 17 ? Integer.toString(L2) : "IN_RAIL_VEHICLE" : "IN_ROAD_VEHICLE" : ye0.f37869b : "WALKING" : "TILTING" : "UNKNOWN" : "STILL" : "ON_FOOT" : "ON_BICYCLE" : "IN_VEHICLE";
        int i = this.f12113o;
        return "DetectedActivity [type=" + num + ", confidence=" + i + "]";
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        Preconditions.checkNotNull(parcel);
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f12112n);
        SafeParcelWriter.writeInt(parcel, 2, this.f12113o);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
