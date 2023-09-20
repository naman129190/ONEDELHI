package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.fido.u2f.api.common.SignResponseData;
import java.util.Arrays;

@SafeParcelable.Class(creator = "AuthenticatorAttestationResponseCreator")
@SafeParcelable.Reserved({1})
/* renamed from: com.onedelhi.secure.bd */
public class C1781bd extends C1967dd {
    @mr2
    public static final Parcelable.Creator<C1781bd> CREATOR = new gn6();
    @SafeParcelable.Field(getter = "getKeyHandle", mo10053id = 2)
    @mr2

    /* renamed from: a */
    public final byte[] f9788a;
    @SafeParcelable.Field(getter = "getTransports", mo10053id = 5)
    @mr2

    /* renamed from: a */
    public final String[] f9789a;
    @SafeParcelable.Field(getter = "getClientDataJSON", mo10053id = 3)
    @mr2

    /* renamed from: b */
    public final byte[] f9790b;
    @SafeParcelable.Field(getter = "getAttestationObject", mo10053id = 4)
    @mr2

    /* renamed from: c */
    public final byte[] f9791c;

    @SafeParcelable.Constructor
    public C1781bd(@SafeParcelable.Param(mo10056id = 2) @mr2 byte[] bArr, @SafeParcelable.Param(mo10056id = 3) @mr2 byte[] bArr2, @SafeParcelable.Param(mo10056id = 4) @mr2 byte[] bArr3, @SafeParcelable.Param(mo10056id = 5) @mr2 String[] strArr) {
        this.f9788a = (byte[]) Preconditions.checkNotNull(bArr);
        this.f9790b = (byte[]) Preconditions.checkNotNull(bArr2);
        this.f9791c = (byte[]) Preconditions.checkNotNull(bArr3);
        this.f9789a = (String[]) Preconditions.checkNotNull(strArr);
    }

    @mr2
    /* renamed from: M2 */
    public static C1781bd m11794M2(@mr2 byte[] bArr) {
        return (C1781bd) SafeParcelableSerializer.deserializeFromBytes(bArr, CREATOR);
    }

    @mr2
    /* renamed from: K2 */
    public byte[] mo12994K2() {
        return this.f9790b;
    }

    @mr2
    /* renamed from: L2 */
    public byte[] mo12995L2() {
        return SafeParcelableSerializer.serializeToBytes(this);
    }

    @mr2
    /* renamed from: N2 */
    public byte[] mo13620N2() {
        return this.f9791c;
    }

    @mr2
    @Deprecated
    /* renamed from: O2 */
    public byte[] mo13621O2() {
        return this.f9788a;
    }

    @mr2
    /* renamed from: P2 */
    public String[] mo13622P2() {
        return this.f9789a;
    }

    public boolean equals(@mr2 Object obj) {
        if (!(obj instanceof C1781bd)) {
            return false;
        }
        C1781bd bdVar = (C1781bd) obj;
        return Arrays.equals(this.f9788a, bdVar.f9788a) && Arrays.equals(this.f9790b, bdVar.f9790b) && Arrays.equals(this.f9791c, bdVar.f9791c);
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(Arrays.hashCode(this.f9788a)), Integer.valueOf(Arrays.hashCode(this.f9790b)), Integer.valueOf(Arrays.hashCode(this.f9791c)));
    }

    @mr2
    public String toString() {
        mf5 a = xf5.m31424a(this);
        in5 c = in5.m17708c();
        byte[] bArr = this.f9788a;
        a.mo20329b(SignResponseData.f7450d, c.mo17871d(bArr, 0, bArr.length));
        in5 c2 = in5.m17708c();
        byte[] bArr2 = this.f9790b;
        a.mo20329b("clientDataJSON", c2.mo17871d(bArr2, 0, bArr2.length));
        in5 c3 = in5.m17708c();
        byte[] bArr3 = this.f9791c;
        a.mo20329b("attestationObject", c3.mo17871d(bArr3, 0, bArr3.length));
        a.mo20329b("transports", Arrays.toString(this.f9789a));
        return a.toString();
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 2, mo13621O2(), false);
        SafeParcelWriter.writeByteArray(parcel, 3, mo12994K2(), false);
        SafeParcelWriter.writeByteArray(parcel, 4, mo13620N2(), false);
        SafeParcelWriter.writeStringArray(parcel, 5, mo13622P2(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
