package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "SignInPasswordCreator")
public class sy3 extends AbstractSafeParcelable {
    @mr2
    public static final Parcelable.Creator<sy3> CREATOR = new v85();
    @SafeParcelable.Field(getter = "getId", mo10053id = 1)

    /* renamed from: b */
    public final String f20603b;
    @SafeParcelable.Field(getter = "getPassword", mo10053id = 2)

    /* renamed from: c */
    public final String f20604c;

    @SafeParcelable.Constructor
    public sy3(@SafeParcelable.Param(mo10056id = 1) @mr2 String str, @SafeParcelable.Param(mo10056id = 2) @mr2 String str2) {
        this.f20603b = Preconditions.checkNotEmpty(((String) Preconditions.checkNotNull(str, "Account identifier cannot be null")).trim(), "Account identifier cannot be empty");
        this.f20604c = Preconditions.checkNotEmpty(str2);
    }

    @mr2
    /* renamed from: K2 */
    public String mo24667K2() {
        return this.f20603b;
    }

    @mr2
    /* renamed from: L2 */
    public String mo24668L2() {
        return this.f20604c;
    }

    public boolean equals(@ts2 Object obj) {
        if (!(obj instanceof sy3)) {
            return false;
        }
        sy3 sy3 = (sy3) obj;
        return Objects.equal(this.f20603b, sy3.f20603b) && Objects.equal(this.f20604c, sy3.f20604c);
    }

    public int hashCode() {
        return Objects.hashCode(this.f20603b, this.f20604c);
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, mo24667K2(), false);
        SafeParcelWriter.writeString(parcel, 2, mo24668L2(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
