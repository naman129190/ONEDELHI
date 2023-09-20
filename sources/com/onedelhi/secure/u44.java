package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "StreetViewSourceCreator")
@SafeParcelable.Reserved({1})
public final class u44 extends AbstractSafeParcelable {
    @mr2
    public static final Parcelable.Creator<u44> CREATOR = new i27();
    @mr2

    /* renamed from: a */
    public static final u44 f21212a = new u44(0);
    @mr2

    /* renamed from: b */
    public static final u44 f21213b = new u44(1);

    /* renamed from: b */
    public static final String f21214b = u44.class.getSimpleName();
    @SafeParcelable.Field(getter = "getType", mo10053id = 2)

    /* renamed from: n */
    public final int f21215n;

    @SafeParcelable.Constructor
    public u44(@SafeParcelable.Param(mo10056id = 2) int i) {
        this.f21215n = i;
    }

    public boolean equals(@ts2 Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u44) && this.f21215n == ((u44) obj).f21215n;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f21215n));
    }

    @mr2
    public String toString() {
        String str;
        int i = this.f21215n;
        if (i == 0) {
            str = "DEFAULT";
        } else if (i != 1) {
            str = String.format("UNKNOWN(%s)", new Object[]{Integer.valueOf(i)});
        } else {
            str = "OUTDOOR";
        }
        return String.format("StreetViewSource:%s", new Object[]{str});
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.f21215n);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
