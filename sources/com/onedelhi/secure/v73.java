package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "PublicKeyCredentialRpEntityCreator")
@SafeParcelable.Reserved({1})
public class v73 extends AbstractSafeParcelable {
    @mr2
    public static final Parcelable.Creator<v73> CREATOR = new uh5();
    @SafeParcelable.Field(getter = "getId", mo10053id = 2)
    @mr2

    /* renamed from: b */
    public final String f21691b;
    @SafeParcelable.Field(getter = "getName", mo10053id = 3)
    @mr2

    /* renamed from: c */
    public final String f21692c;
    @SafeParcelable.Field(getter = "getIcon", mo10053id = 4)
    @ts2

    /* renamed from: d */
    public final String f21693d;

    @SafeParcelable.Constructor
    public v73(@SafeParcelable.Param(mo10056id = 2) @mr2 String str, @SafeParcelable.Param(mo10056id = 3) @mr2 String str2, @SafeParcelable.Param(mo10056id = 4) @ts2 String str3) {
        this.f21691b = (String) Preconditions.checkNotNull(str);
        this.f21692c = (String) Preconditions.checkNotNull(str2);
        this.f21693d = str3;
    }

    @ts2
    /* renamed from: K2 */
    public String mo25873K2() {
        return this.f21693d;
    }

    @mr2
    /* renamed from: L2 */
    public String mo25874L2() {
        return this.f21691b;
    }

    public boolean equals(@mr2 Object obj) {
        if (!(obj instanceof v73)) {
            return false;
        }
        v73 v73 = (v73) obj;
        return Objects.equal(this.f21691b, v73.f21691b) && Objects.equal(this.f21692c, v73.f21692c) && Objects.equal(this.f21693d, v73.f21693d);
    }

    @mr2
    public String getName() {
        return this.f21692c;
    }

    public int hashCode() {
        return Objects.hashCode(this.f21691b, this.f21692c, this.f21693d);
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, mo25874L2(), false);
        SafeParcelWriter.writeString(parcel, 3, getName(), false);
        SafeParcelWriter.writeString(parcel, 4, mo25873K2(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
