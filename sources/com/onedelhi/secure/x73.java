package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

@SafeParcelable.Class(creator = "PublicKeyCredentialUserEntityCreator")
@SafeParcelable.Reserved({1})
public class x73 extends AbstractSafeParcelable {
    @mr2
    public static final Parcelable.Creator<x73> CREATOR = new ki5();
    @SafeParcelable.Field(getter = "getId", mo10053id = 2)
    @mr2

    /* renamed from: a */
    public final byte[] f22458a;
    @SafeParcelable.Field(getter = "getName", mo10053id = 3)
    @mr2

    /* renamed from: b */
    public final String f22459b;
    @SafeParcelable.Field(getter = "getIcon", mo10053id = 4)
    @ts2

    /* renamed from: c */
    public final String f22460c;
    @SafeParcelable.Field(getter = "getDisplayName", mo10053id = 5)
    @mr2

    /* renamed from: d */
    public final String f22461d;

    @SafeParcelable.Constructor
    public x73(@SafeParcelable.Param(mo10056id = 2) @mr2 byte[] bArr, @SafeParcelable.Param(mo10056id = 3) @mr2 String str, @SafeParcelable.Param(mo10056id = 4) @mr2 String str2, @SafeParcelable.Param(mo10056id = 5) @mr2 String str3) {
        this.f22458a = (byte[]) Preconditions.checkNotNull(bArr);
        this.f22459b = (String) Preconditions.checkNotNull(str);
        this.f22460c = str2;
        this.f22461d = (String) Preconditions.checkNotNull(str3);
    }

    @mr2
    /* renamed from: K2 */
    public String mo26805K2() {
        return this.f22461d;
    }

    @ts2
    /* renamed from: L2 */
    public String mo26806L2() {
        return this.f22460c;
    }

    @mr2
    /* renamed from: M2 */
    public byte[] mo26807M2() {
        return this.f22458a;
    }

    public boolean equals(@mr2 Object obj) {
        if (!(obj instanceof x73)) {
            return false;
        }
        x73 x73 = (x73) obj;
        return Arrays.equals(this.f22458a, x73.f22458a) && Objects.equal(this.f22459b, x73.f22459b) && Objects.equal(this.f22460c, x73.f22460c) && Objects.equal(this.f22461d, x73.f22461d);
    }

    @mr2
    public String getName() {
        return this.f22459b;
    }

    public int hashCode() {
        return Objects.hashCode(this.f22458a, this.f22459b, this.f22460c, this.f22461d);
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 2, mo26807M2(), false);
        SafeParcelWriter.writeString(parcel, 3, getName(), false);
        SafeParcelWriter.writeString(parcel, 4, mo26806L2(), false);
        SafeParcelWriter.writeString(parcel, 5, mo26805K2(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
