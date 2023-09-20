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

@SafeParcelable.Class(creator = "AuthenticatorAssertionResponseCreator")
@SafeParcelable.Reserved({1})
/* renamed from: com.onedelhi.secure.ad */
public class C1690ad extends C1967dd {
    @mr2
    public static final Parcelable.Creator<C1690ad> CREATOR = new nk6();
    @SafeParcelable.Field(getter = "getKeyHandle", mo10053id = 2)
    @mr2

    /* renamed from: a */
    public final byte[] f8995a;
    @SafeParcelable.Field(getter = "getClientDataJSON", mo10053id = 3)
    @mr2

    /* renamed from: b */
    public final byte[] f8996b;
    @SafeParcelable.Field(getter = "getAuthenticatorData", mo10053id = 4)
    @mr2

    /* renamed from: c */
    public final byte[] f8997c;
    @SafeParcelable.Field(getter = "getSignature", mo10053id = 5)
    @mr2

    /* renamed from: d */
    public final byte[] f8998d;
    @SafeParcelable.Field(getter = "getUserHandle", mo10053id = 6)
    @ts2

    /* renamed from: e */
    public final byte[] f8999e;

    @SafeParcelable.Constructor
    public C1690ad(@SafeParcelable.Param(mo10056id = 2) @mr2 byte[] bArr, @SafeParcelable.Param(mo10056id = 3) @mr2 byte[] bArr2, @SafeParcelable.Param(mo10056id = 4) @mr2 byte[] bArr3, @SafeParcelable.Param(mo10056id = 5) @mr2 byte[] bArr4, @SafeParcelable.Param(mo10056id = 6) @ts2 byte[] bArr5) {
        this.f8995a = (byte[]) Preconditions.checkNotNull(bArr);
        this.f8996b = (byte[]) Preconditions.checkNotNull(bArr2);
        this.f8997c = (byte[]) Preconditions.checkNotNull(bArr3);
        this.f8998d = (byte[]) Preconditions.checkNotNull(bArr4);
        this.f8999e = bArr5;
    }

    @mr2
    /* renamed from: M2 */
    public static C1690ad m11084M2(@mr2 byte[] bArr) {
        return (C1690ad) SafeParcelableSerializer.deserializeFromBytes(bArr, CREATOR);
    }

    @mr2
    /* renamed from: K2 */
    public byte[] mo12994K2() {
        return this.f8996b;
    }

    @mr2
    /* renamed from: L2 */
    public byte[] mo12995L2() {
        return SafeParcelableSerializer.serializeToBytes(this);
    }

    @mr2
    /* renamed from: N2 */
    public byte[] mo12996N2() {
        return this.f8997c;
    }

    @mr2
    @Deprecated
    /* renamed from: O2 */
    public byte[] mo12997O2() {
        return this.f8995a;
    }

    @mr2
    /* renamed from: P2 */
    public byte[] mo12998P2() {
        return this.f8998d;
    }

    @ts2
    /* renamed from: Q2 */
    public byte[] mo12999Q2() {
        return this.f8999e;
    }

    public boolean equals(@mr2 Object obj) {
        if (!(obj instanceof C1690ad)) {
            return false;
        }
        C1690ad adVar = (C1690ad) obj;
        return Arrays.equals(this.f8995a, adVar.f8995a) && Arrays.equals(this.f8996b, adVar.f8996b) && Arrays.equals(this.f8997c, adVar.f8997c) && Arrays.equals(this.f8998d, adVar.f8998d) && Arrays.equals(this.f8999e, adVar.f8999e);
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(Arrays.hashCode(this.f8995a)), Integer.valueOf(Arrays.hashCode(this.f8996b)), Integer.valueOf(Arrays.hashCode(this.f8997c)), Integer.valueOf(Arrays.hashCode(this.f8998d)), Integer.valueOf(Arrays.hashCode(this.f8999e)));
    }

    @mr2
    public String toString() {
        mf5 a = xf5.m31424a(this);
        in5 c = in5.m17708c();
        byte[] bArr = this.f8995a;
        a.mo20329b(SignResponseData.f7450d, c.mo17871d(bArr, 0, bArr.length));
        in5 c2 = in5.m17708c();
        byte[] bArr2 = this.f8996b;
        a.mo20329b("clientDataJSON", c2.mo17871d(bArr2, 0, bArr2.length));
        in5 c3 = in5.m17708c();
        byte[] bArr3 = this.f8997c;
        a.mo20329b("authenticatorData", c3.mo17871d(bArr3, 0, bArr3.length));
        in5 c4 = in5.m17708c();
        byte[] bArr4 = this.f8998d;
        a.mo20329b("signature", c4.mo17871d(bArr4, 0, bArr4.length));
        byte[] bArr5 = this.f8999e;
        if (bArr5 != null) {
            a.mo20329b("userHandle", in5.m17708c().mo17871d(bArr5, 0, bArr5.length));
        }
        return a.toString();
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 2, mo12997O2(), false);
        SafeParcelWriter.writeByteArray(parcel, 3, mo12994K2(), false);
        SafeParcelWriter.writeByteArray(parcel, 4, mo12996N2(), false);
        SafeParcelWriter.writeByteArray(parcel, 5, mo12998P2(), false);
        SafeParcelWriter.writeByteArray(parcel, 6, mo12999Q2(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
