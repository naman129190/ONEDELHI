package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "ActivityTransitionEventCreator")
@SafeParcelable.Reserved({1000})
/* renamed from: com.onedelhi.secure.q3 */
public class C3223q3 extends AbstractSafeParcelable {
    @mr2
    public static final Parcelable.Creator<C3223q3> CREATOR = new a66();
    @SafeParcelable.Field(getter = "getElapsedRealTimeNanos", mo10053id = 3)

    /* renamed from: b */
    public final long f18857b;
    @SafeParcelable.Field(getter = "getActivityType", mo10053id = 1)

    /* renamed from: n */
    public final int f18858n;
    @SafeParcelable.Field(getter = "getTransitionType", mo10053id = 2)

    /* renamed from: o */
    public final int f18859o;

    @SafeParcelable.Constructor
    public C3223q3(@SafeParcelable.Param(mo10056id = 1) int i, @SafeParcelable.Param(mo10056id = 2) int i2, @SafeParcelable.Param(mo10056id = 3) long j) {
        C3115p3.m24368M2(i2);
        this.f18858n = i;
        this.f18859o = i2;
        this.f18857b = j;
    }

    /* renamed from: K2 */
    public int mo22813K2() {
        return this.f18858n;
    }

    /* renamed from: L2 */
    public long mo22814L2() {
        return this.f18857b;
    }

    /* renamed from: M2 */
    public int mo22815M2() {
        return this.f18859o;
    }

    public boolean equals(@ts2 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3223q3)) {
            return false;
        }
        C3223q3 q3Var = (C3223q3) obj;
        return this.f18858n == q3Var.f18858n && this.f18859o == q3Var.f18859o && this.f18857b == q3Var.f18857b;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f18858n), Integer.valueOf(this.f18859o), Long.valueOf(this.f18857b));
    }

    @mr2
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f18858n;
        sb.append("ActivityType " + i);
        sb.append(" ");
        int i2 = this.f18859o;
        sb.append("TransitionType " + i2);
        sb.append(" ");
        long j = this.f18857b;
        sb.append("ElapsedRealTimeNanos " + j);
        return sb.toString();
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        Preconditions.checkNotNull(parcel);
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, mo22813K2());
        SafeParcelWriter.writeInt(parcel, 2, mo22815M2());
        SafeParcelWriter.writeLong(parcel, 3, mo22814L2());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
