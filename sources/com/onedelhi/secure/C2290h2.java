package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "AccountChangeEventCreator")
/* renamed from: com.onedelhi.secure.h2 */
public class C2290h2 extends AbstractSafeParcelable {
    @mr2
    public static final Parcelable.Creator<C2290h2> CREATOR = new za5();
    @SafeParcelable.Field(mo10053id = 2)

    /* renamed from: b */
    public final long f12865b;
    @SafeParcelable.Field(mo10053id = 3)

    /* renamed from: b */
    public final String f12866b;
    @SafeParcelable.Field(mo10053id = 6)

    /* renamed from: c */
    public final String f12867c;
    @SafeParcelable.VersionField(mo10062id = 1)

    /* renamed from: n */
    public final int f12868n;
    @SafeParcelable.Field(mo10053id = 4)

    /* renamed from: o */
    public final int f12869o;
    @SafeParcelable.Field(mo10053id = 5)

    /* renamed from: p */
    public final int f12870p;

    @SafeParcelable.Constructor
    public C2290h2(@SafeParcelable.Param(mo10056id = 1) int i, @SafeParcelable.Param(mo10056id = 2) long j, @SafeParcelable.Param(mo10056id = 3) String str, @SafeParcelable.Param(mo10056id = 4) int i2, @SafeParcelable.Param(mo10056id = 5) int i3, @SafeParcelable.Param(mo10056id = 6) String str2) {
        this.f12868n = i;
        this.f12865b = j;
        this.f12866b = (String) Preconditions.checkNotNull(str);
        this.f12869o = i2;
        this.f12870p = i3;
        this.f12867c = str2;
    }

    public C2290h2(long j, @mr2 String str, int i, int i2, @mr2 String str2) {
        this.f12868n = 1;
        this.f12865b = j;
        this.f12866b = (String) Preconditions.checkNotNull(str);
        this.f12869o = i;
        this.f12870p = i2;
        this.f12867c = str2;
    }

    @mr2
    /* renamed from: K2 */
    public String mo17040K2() {
        return this.f12866b;
    }

    @mr2
    /* renamed from: L2 */
    public String mo17041L2() {
        return this.f12867c;
    }

    /* renamed from: M2 */
    public int mo17042M2() {
        return this.f12869o;
    }

    /* renamed from: N2 */
    public int mo17043N2() {
        return this.f12870p;
    }

    public boolean equals(@ts2 Object obj) {
        if (!(obj instanceof C2290h2)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C2290h2 h2Var = (C2290h2) obj;
        return this.f12868n == h2Var.f12868n && this.f12865b == h2Var.f12865b && Objects.equal(this.f12866b, h2Var.f12866b) && this.f12869o == h2Var.f12869o && this.f12870p == h2Var.f12870p && Objects.equal(this.f12867c, h2Var.f12867c);
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f12868n), Long.valueOf(this.f12865b), this.f12866b, Integer.valueOf(this.f12869o), Integer.valueOf(this.f12870p), this.f12867c);
    }

    @mr2
    public String toString() {
        int i = this.f12869o;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "UNKNOWN" : "RENAMED_TO" : "RENAMED_FROM" : "REMOVED" : "ADDED";
        String str2 = this.f12866b;
        String str3 = this.f12867c;
        int i2 = this.f12870p;
        return "AccountChangeEvent {accountName = " + str2 + ", changeType = " + str + ", changeData = " + str3 + ", eventIndex = " + i2 + "}";
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f12868n);
        SafeParcelWriter.writeLong(parcel, 2, this.f12865b);
        SafeParcelWriter.writeString(parcel, 3, this.f12866b, false);
        SafeParcelWriter.writeInt(parcel, 4, this.f12869o);
        SafeParcelWriter.writeInt(parcel, 5, this.f12870p);
        SafeParcelWriter.writeString(parcel, 6, this.f12867c, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
