package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.onedelhi.secure.aq6;
import com.onedelhi.secure.in5;
import com.onedelhi.secure.mf5;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.xf5;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

@SafeParcelable.Class(creator = "SignResponseDataCreator")
@SafeParcelable.Reserved({1})
@Deprecated
public class SignResponseData extends ResponseData {
    @mr2
    public static final Parcelable.Creator<SignResponseData> CREATOR = new aq6();
    @mr2
    @VisibleForTesting

    /* renamed from: c */
    public static final String f7449c = "clientData";
    @mr2
    @VisibleForTesting

    /* renamed from: d */
    public static final String f7450d = "keyHandle";
    @mr2
    @VisibleForTesting

    /* renamed from: e */
    public static final String f7451e = "signatureData";
    @SafeParcelable.Field(getter = "getKeyHandle", mo10053id = 2)

    /* renamed from: a */
    public final byte[] f7452a;
    @SafeParcelable.Field(getter = "getClientDataString", mo10053id = 3)

    /* renamed from: b */
    public final String f7453b;
    @SafeParcelable.Field(getter = "getSignatureData", mo10053id = 4)

    /* renamed from: b */
    public final byte[] f7454b;
    @SafeParcelable.Field(getter = "getApplication", mo10053id = 5)

    /* renamed from: c */
    public final byte[] f7455c;

    @Deprecated
    public SignResponseData(@mr2 byte[] bArr, @mr2 String str, @mr2 byte[] bArr2) {
        this(bArr, str, bArr2, new byte[0]);
    }

    @SafeParcelable.Constructor
    public SignResponseData(@SafeParcelable.Param(mo10056id = 2) @mr2 byte[] bArr, @SafeParcelable.Param(mo10056id = 3) @mr2 String str, @SafeParcelable.Param(mo10056id = 4) @mr2 byte[] bArr2, @SafeParcelable.Param(mo10056id = 5) @mr2 byte[] bArr3) {
        this.f7452a = (byte[]) Preconditions.checkNotNull(bArr);
        this.f7453b = (String) Preconditions.checkNotNull(str);
        this.f7454b = (byte[]) Preconditions.checkNotNull(bArr2);
        this.f7455c = (byte[]) Preconditions.checkNotNull(bArr3);
    }

    @mr2
    /* renamed from: K2 */
    public JSONObject mo10417K2() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(f7450d, Base64.encodeToString(this.f7452a, 11));
            jSONObject.put(f7449c, Base64.encodeToString(this.f7453b.getBytes(), 11));
            jSONObject.put(f7451e, Base64.encodeToString(this.f7454b, 11));
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    @mr2
    /* renamed from: L2 */
    public String mo10464L2() {
        return this.f7453b;
    }

    @mr2
    /* renamed from: M2 */
    public byte[] mo10465M2() {
        return this.f7452a;
    }

    @mr2
    /* renamed from: N2 */
    public byte[] mo10466N2() {
        return this.f7454b;
    }

    public boolean equals(@ts2 Object obj) {
        if (!(obj instanceof SignResponseData)) {
            return false;
        }
        SignResponseData signResponseData = (SignResponseData) obj;
        return Arrays.equals(this.f7452a, signResponseData.f7452a) && Objects.equal(this.f7453b, signResponseData.f7453b) && Arrays.equals(this.f7454b, signResponseData.f7454b) && Arrays.equals(this.f7455c, signResponseData.f7455c);
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(Arrays.hashCode(this.f7452a)), this.f7453b, Integer.valueOf(Arrays.hashCode(this.f7454b)), Integer.valueOf(Arrays.hashCode(this.f7455c)));
    }

    @mr2
    public String toString() {
        mf5 a = xf5.m31424a(this);
        in5 c = in5.m17708c();
        byte[] bArr = this.f7452a;
        a.mo20329b(f7450d, c.mo17871d(bArr, 0, bArr.length));
        a.mo20329b("clientDataString", this.f7453b);
        in5 c2 = in5.m17708c();
        byte[] bArr2 = this.f7454b;
        a.mo20329b(f7451e, c2.mo17871d(bArr2, 0, bArr2.length));
        in5 c3 = in5.m17708c();
        byte[] bArr3 = this.f7455c;
        a.mo20329b("application", c3.mo17871d(bArr3, 0, bArr3.length));
        return a.toString();
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 2, mo10465M2(), false);
        SafeParcelWriter.writeString(parcel, 3, mo10464L2(), false);
        SafeParcelWriter.writeByteArray(parcel, 4, mo10466N2(), false);
        SafeParcelWriter.writeByteArray(parcel, 5, this.f7455c, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
