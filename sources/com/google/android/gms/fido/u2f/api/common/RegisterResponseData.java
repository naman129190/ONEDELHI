package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fido.u2f.api.common.C1432b;
import com.onedelhi.secure.in5;
import com.onedelhi.secure.mf5;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.vh6;
import com.onedelhi.secure.xf5;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

@SafeParcelable.Class(creator = "RegisterResponseDataCreator")
@SafeParcelable.Reserved({1})
@Deprecated
public class RegisterResponseData extends ResponseData {
    @mr2
    public static final Parcelable.Creator<RegisterResponseData> CREATOR = new vh6();
    @SafeParcelable.Field(getter = "getProtocolVersionAsString", mo10053id = 3, type = "java.lang.String")

    /* renamed from: a */
    public final C1432b f7430a;
    @SafeParcelable.Field(getter = "getRegisterData", mo10053id = 2)

    /* renamed from: a */
    public final byte[] f7431a;
    @SafeParcelable.Field(getter = "getClientDataString", mo10053id = 4)
    @ts2

    /* renamed from: b */
    public final String f7432b;

    public RegisterResponseData(@mr2 byte[] bArr) {
        this.f7431a = (byte[]) Preconditions.checkNotNull(bArr);
        this.f7430a = C1432b.V1;
        this.f7432b = null;
    }

    public RegisterResponseData(@mr2 byte[] bArr, @mr2 C1432b bVar, @ts2 String str) {
        String str2;
        this.f7431a = (byte[]) Preconditions.checkNotNull(bArr);
        this.f7430a = (C1432b) Preconditions.checkNotNull(bVar);
        boolean z = true;
        Preconditions.checkArgument(bVar != C1432b.UNKNOWN);
        if (bVar == C1432b.V1) {
            Preconditions.checkArgument(str != null ? false : z);
            str2 = null;
        } else {
            str2 = (String) Preconditions.checkNotNull(str);
        }
        this.f7432b = str2;
    }

    @SafeParcelable.Constructor
    public RegisterResponseData(@SafeParcelable.Param(mo10056id = 2) byte[] bArr, @SafeParcelable.Param(mo10056id = 3) String str, @SafeParcelable.Param(mo10056id = 4) @ts2 String str2) {
        this.f7431a = bArr;
        try {
            this.f7430a = C1432b.m8976b(str);
            this.f7432b = str2;
        } catch (C1432b.C1433a e) {
            throw new IllegalArgumentException(e);
        }
    }

    @mr2
    /* renamed from: K2 */
    public JSONObject mo10417K2() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("registrationData", Base64.encodeToString(this.f7431a, 11));
            jSONObject.put("version", this.f7430a.toString());
            String str = this.f7432b;
            if (str != null) {
                jSONObject.put(SignResponseData.f7449c, Base64.encodeToString(str.getBytes(), 11));
            }
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    @mr2
    /* renamed from: L2 */
    public String mo10444L2() {
        return this.f7432b;
    }

    @mr2
    /* renamed from: M2 */
    public C1432b mo10445M2() {
        return this.f7430a;
    }

    @mr2
    /* renamed from: N2 */
    public byte[] mo10446N2() {
        return this.f7431a;
    }

    /* renamed from: O2 */
    public int mo10447O2() {
        C1432b bVar = C1432b.UNKNOWN;
        int ordinal = this.f7430a.ordinal();
        int i = 1;
        if (ordinal != 1) {
            i = 2;
            if (ordinal != 2) {
                return -1;
            }
        }
        return i;
    }

    public boolean equals(@ts2 Object obj) {
        if (!(obj instanceof RegisterResponseData)) {
            return false;
        }
        RegisterResponseData registerResponseData = (RegisterResponseData) obj;
        return Objects.equal(this.f7430a, registerResponseData.f7430a) && Arrays.equals(this.f7431a, registerResponseData.f7431a) && Objects.equal(this.f7432b, registerResponseData.f7432b);
    }

    public int hashCode() {
        return Objects.hashCode(this.f7430a, Integer.valueOf(Arrays.hashCode(this.f7431a)), this.f7432b);
    }

    @mr2
    public String toString() {
        mf5 a = xf5.m31424a(this);
        a.mo20329b("protocolVersion", this.f7430a);
        in5 c = in5.m17708c();
        byte[] bArr = this.f7431a;
        a.mo20329b("registerData", c.mo17871d(bArr, 0, bArr.length));
        String str = this.f7432b;
        if (str != null) {
            a.mo20329b("clientDataString", str);
        }
        return a.toString();
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 2, mo10446N2(), false);
        SafeParcelWriter.writeString(parcel, 3, this.f7430a.toString(), false);
        SafeParcelWriter.writeString(parcel, 4, mo10444L2(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
