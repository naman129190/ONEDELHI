package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "FidoAppIdExtensionCreator")
@SafeParcelable.Reserved({1})
public class o11 extends AbstractSafeParcelable {
    @mr2
    public static final Parcelable.Creator<o11> CREATOR = new a57();
    @SafeParcelable.Field(getter = "getAppId", mo10053id = 2)
    @mr2

    /* renamed from: b */
    public final String f17641b;

    @SafeParcelable.Constructor
    public o11(@SafeParcelable.Param(mo10056id = 2) @mr2 String str) {
        this.f17641b = (String) Preconditions.checkNotNull(str);
    }

    @mr2
    /* renamed from: K2 */
    public String mo21550K2() {
        return this.f17641b;
    }

    public boolean equals(@mr2 Object obj) {
        if (!(obj instanceof o11)) {
            return false;
        }
        return this.f17641b.equals(((o11) obj).f17641b);
    }

    public int hashCode() {
        return Objects.hashCode(this.f17641b);
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, mo21550K2(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
