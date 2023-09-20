package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.onedelhi.secure.fv0;

@SafeParcelable.Class(creator = "AuthenticatorErrorResponseCreator")
@SafeParcelable.Reserved({1})
/* renamed from: com.onedelhi.secure.cd */
public class C1893cd extends C1967dd {
    @mr2
    public static final Parcelable.Creator<C1893cd> CREATOR = new zp6();
    @SafeParcelable.Field(getter = "getErrorCodeAsInt", mo10053id = 2, type = "int")
    @mr2

    /* renamed from: a */
    public final fv0 f10224a;
    @SafeParcelable.Field(getter = "getErrorMessage", mo10053id = 3)
    @ts2

    /* renamed from: b */
    public final String f10225b;
    @SafeParcelable.Field(defaultValue = "0", getter = "getInternalErrorCode", mo10053id = 4, type = "int")

    /* renamed from: n */
    public final int f10226n;

    @SafeParcelable.Constructor
    public C1893cd(@SafeParcelable.Param(mo10056id = 2) @mr2 int i, @SafeParcelable.Param(mo10056id = 3) @ts2 String str, @SafeParcelable.Param(mo10056id = 4) int i2) {
        try {
            this.f10224a = fv0.m15331b(i);
            this.f10225b = str;
            this.f10226n = i2;
        } catch (fv0.C2204a e) {
            throw new IllegalArgumentException(e);
        }
    }

    @mr2
    /* renamed from: M2 */
    public static C1893cd m12437M2(@mr2 byte[] bArr) {
        return (C1893cd) SafeParcelableSerializer.deserializeFromBytes(bArr, CREATOR);
    }

    @mr2
    /* renamed from: K2 */
    public byte[] mo12994K2() {
        throw new UnsupportedOperationException();
    }

    @mr2
    /* renamed from: L2 */
    public byte[] mo12995L2() {
        return SafeParcelableSerializer.serializeToBytes(this);
    }

    @mr2
    /* renamed from: N2 */
    public fv0 mo14096N2() {
        return this.f10224a;
    }

    /* renamed from: O2 */
    public int mo14097O2() {
        return this.f10224a.mo16186a();
    }

    public boolean equals(@mr2 Object obj) {
        if (!(obj instanceof C1893cd)) {
            return false;
        }
        C1893cd cdVar = (C1893cd) obj;
        return Objects.equal(this.f10224a, cdVar.f10224a) && Objects.equal(this.f10225b, cdVar.f10225b) && Objects.equal(Integer.valueOf(this.f10226n), Integer.valueOf(cdVar.f10226n));
    }

    @ts2
    public String getErrorMessage() {
        return this.f10225b;
    }

    public int hashCode() {
        return Objects.hashCode(this.f10224a, this.f10225b, Integer.valueOf(this.f10226n));
    }

    @mr2
    public String toString() {
        mf5 a = xf5.m31424a(this);
        a.mo20328a("errorCode", this.f10224a.mo16186a());
        String str = this.f10225b;
        if (str != null) {
            a.mo20329b("errorMessage", str);
        }
        return a.toString();
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, mo14097O2());
        SafeParcelWriter.writeString(parcel, 3, getErrorMessage(), false);
        SafeParcelWriter.writeInt(parcel, 4, this.f10226n);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
