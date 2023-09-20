package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@SafeParcelable.Class(creator = "SleepSegmentRequestCreator")
@SafeParcelable.Reserved({1000})
public class b04 extends AbstractSafeParcelable {
    @mr2
    public static final Parcelable.Creator<b04> CREATOR = new ue5();

    /* renamed from: o */
    public static final int f9595o = 0;

    /* renamed from: p */
    public static final int f9596p = 1;

    /* renamed from: q */
    public static final int f9597q = 2;
    @SafeParcelable.Field(getter = "getUserPreferredSleepWindow", mo10053id = 1)
    @ts2

    /* renamed from: a */
    public final List f9598a;
    @SafeParcelable.Field(defaultValue = "0", getter = "getRequestedDataType", mo10053id = 2)

    /* renamed from: n */
    public final int f9599n;

    public b04(int i) {
        this((List) null, i);
    }

    @ShowFirstParty
    @SafeParcelable.Constructor
    public b04(@SafeParcelable.Param(mo10056id = 1) @ts2 List list, @SafeParcelable.Param(mo10056id = 2) int i) {
        this.f9598a = list;
        this.f9599n = i;
    }

    @mr2
    /* renamed from: K2 */
    public static b04 m11516K2() {
        return new b04((List) null, 0);
    }

    /* renamed from: L2 */
    public int mo13359L2() {
        return this.f9599n;
    }

    public boolean equals(@ts2 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b04)) {
            return false;
        }
        b04 b04 = (b04) obj;
        return Objects.equal(this.f9598a, b04.f9598a) && this.f9599n == b04.f9599n;
    }

    public int hashCode() {
        return Objects.hashCode(this.f9598a, Integer.valueOf(this.f9599n));
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        Preconditions.checkNotNull(parcel);
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, this.f9598a, false);
        SafeParcelWriter.writeInt(parcel, 2, mo13359L2());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
