package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import java.util.Arrays;

@SafeParcelable.Class(creator = "FidoCredentialDetailsCreator")
public class p11 extends AbstractSafeParcelable {
    @mr2
    public static final Parcelable.Creator<p11> CREATOR = new q57();
    @SafeParcelable.Field(getter = "getUserId", mo10053id = 3)
    @ts2

    /* renamed from: a */
    public final byte[] f18280a;
    @SafeParcelable.Field(getter = "getUserName", mo10053id = 1)
    @ts2

    /* renamed from: b */
    public final String f18281b;
    @SafeParcelable.Field(getter = "getIsDiscoverable", mo10053id = 5)

    /* renamed from: b */
    public final boolean f18282b;
    @SafeParcelable.Field(getter = "getCredentialId", mo10053id = 4)
    @mr2

    /* renamed from: b */
    public final byte[] f18283b;
    @SafeParcelable.Field(getter = "getUserDisplayName", mo10053id = 2)
    @ts2

    /* renamed from: c */
    public final String f18284c;
    @SafeParcelable.Field(getter = "getIsPaymentCredential", mo10053id = 6)

    /* renamed from: c */
    public final boolean f18285c;

    @SafeParcelable.Constructor
    public p11(@SafeParcelable.Param(mo10056id = 1) @ts2 String str, @SafeParcelable.Param(mo10056id = 2) @ts2 String str2, @SafeParcelable.Param(mo10056id = 3) @ts2 byte[] bArr, @SafeParcelable.Param(mo10056id = 4) @mr2 byte[] bArr2, @SafeParcelable.Param(mo10056id = 5) boolean z, @SafeParcelable.Param(mo10056id = 6) boolean z2) {
        this.f18281b = str;
        this.f18284c = str2;
        this.f18280a = bArr;
        this.f18283b = bArr2;
        this.f18282b = z;
        this.f18285c = z2;
    }

    @mr2
    /* renamed from: K2 */
    public static p11 m24327K2(@mr2 byte[] bArr) {
        return (p11) SafeParcelableSerializer.deserializeFromBytes(bArr, CREATOR);
    }

    @mr2
    /* renamed from: L2 */
    public byte[] mo22192L2() {
        return this.f18283b;
    }

    /* renamed from: M2 */
    public boolean mo22193M2() {
        return this.f18282b;
    }

    /* renamed from: N2 */
    public boolean mo22194N2() {
        return this.f18285c;
    }

    @ts2
    /* renamed from: O2 */
    public String mo22195O2() {
        return this.f18284c;
    }

    @ts2
    /* renamed from: P2 */
    public byte[] mo22196P2() {
        return this.f18280a;
    }

    @ts2
    /* renamed from: Q2 */
    public String mo22197Q2() {
        return this.f18281b;
    }

    @mr2
    /* renamed from: R2 */
    public byte[] mo22198R2() {
        return SafeParcelableSerializer.serializeToBytes(this);
    }

    public boolean equals(@ts2 Object obj) {
        if (!(obj instanceof p11)) {
            return false;
        }
        p11 p11 = (p11) obj;
        return Objects.equal(this.f18281b, p11.f18281b) && Objects.equal(this.f18284c, p11.f18284c) && Arrays.equals(this.f18280a, p11.f18280a) && Arrays.equals(this.f18283b, p11.f18283b) && this.f18282b == p11.f18282b && this.f18285c == p11.f18285c;
    }

    public int hashCode() {
        return Objects.hashCode(this.f18281b, this.f18284c, this.f18280a, this.f18283b, Boolean.valueOf(this.f18282b), Boolean.valueOf(this.f18285c));
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, mo22197Q2(), false);
        SafeParcelWriter.writeString(parcel, 2, mo22195O2(), false);
        SafeParcelWriter.writeByteArray(parcel, 3, mo22196P2(), false);
        SafeParcelWriter.writeByteArray(parcel, 4, mo22192L2(), false);
        SafeParcelWriter.writeBoolean(parcel, 5, mo22193M2());
        SafeParcelWriter.writeBoolean(parcel, 6, mo22194N2());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
