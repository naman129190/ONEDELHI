package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fido.u2f.api.common.C1432b;
import com.onedelhi.secure.C3954xy;
import com.onedelhi.secure.ka6;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.vh3;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

@SafeParcelable.Class(creator = "RegisterRequestCreator")
@Deprecated
/* renamed from: com.google.android.gms.fido.u2f.api.common.c */
public class C1434c extends AbstractSafeParcelable {
    @mr2
    public static final Parcelable.Creator<C1434c> CREATOR = new ka6();

    /* renamed from: o */
    public static final int f7465o = 65;
    @SafeParcelable.Field(getter = "getProtocolVersionAsString", mo10053id = 2, type = "java.lang.String")

    /* renamed from: a */
    public final C1432b f7466a;
    @SafeParcelable.Field(getter = "getChallengeValue", mo10053id = 3)

    /* renamed from: a */
    public final byte[] f7467a;
    @SafeParcelable.Field(getter = "getAppId", mo10053id = 4)

    /* renamed from: b */
    public final String f7468b;
    @SafeParcelable.VersionField(getter = "getVersionCode", mo10062id = 1)

    /* renamed from: n */
    public final int f7469n;

    @SafeParcelable.Constructor
    public C1434c(@SafeParcelable.Param(mo10056id = 1) int i, @SafeParcelable.Param(mo10056id = 2) String str, @SafeParcelable.Param(mo10056id = 3) byte[] bArr, @SafeParcelable.Param(mo10056id = 4) String str2) {
        this.f7469n = i;
        try {
            this.f7466a = C1432b.m8976b(str);
            this.f7467a = bArr;
            this.f7468b = str2;
        } catch (C1432b.C1433a e) {
            throw new IllegalArgumentException(e);
        }
    }

    public C1434c(@mr2 C1432b bVar, @mr2 byte[] bArr, @mr2 String str) {
        boolean z = true;
        this.f7469n = 1;
        this.f7466a = (C1432b) Preconditions.checkNotNull(bVar);
        this.f7467a = (byte[]) Preconditions.checkNotNull(bArr);
        if (bVar == C1432b.V1) {
            Preconditions.checkArgument(bArr.length != 65 ? false : z, "invalid challengeValue length for V1");
        }
        this.f7468b = str;
    }

    @mr2
    /* renamed from: O2 */
    public static C1434c m8978O2(@mr2 JSONObject jSONObject) throws JSONException {
        String str = null;
        try {
            C1432b b = C1432b.m8976b(jSONObject.has("version") ? jSONObject.getString("version") : null);
            try {
                byte[] decode = Base64.decode(jSONObject.getString(C3954xy.f22808e), 8);
                if (jSONObject.has(vh3.C7051b.f36556L)) {
                    str = jSONObject.getString(vh3.C7051b.f36556L);
                }
                try {
                    return new C1434c(b, decode, str);
                } catch (IllegalArgumentException e) {
                    throw new JSONException(e.getMessage());
                }
            } catch (IllegalArgumentException e2) {
                throw new JSONException(e2.toString());
            }
        } catch (C1432b.C1433a e3) {
            throw new JSONException(e3.toString());
        }
    }

    @mr2
    /* renamed from: K2 */
    public String mo10485K2() {
        return this.f7468b;
    }

    @mr2
    /* renamed from: L2 */
    public byte[] mo10486L2() {
        return this.f7467a;
    }

    @mr2
    /* renamed from: M2 */
    public C1432b mo10487M2() {
        return this.f7466a;
    }

    /* renamed from: N2 */
    public int mo10488N2() {
        return this.f7469n;
    }

    public boolean equals(@mr2 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1434c)) {
            return false;
        }
        C1434c cVar = (C1434c) obj;
        if (!Arrays.equals(this.f7467a, cVar.f7467a) || this.f7466a != cVar.f7466a) {
            return false;
        }
        String str = this.f7468b;
        String str2 = cVar.f7468b;
        if (str == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str.equals(str2)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = ((Arrays.hashCode(this.f7467a) + 31) * 31) + this.f7466a.hashCode();
        String str = this.f7468b;
        return (hashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    @mr2
    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("version", this.f7466a.toString());
            jSONObject.put(C3954xy.f22808e, Base64.encodeToString(this.f7467a, 11));
            String str = this.f7468b;
            if (str != null) {
                jSONObject.put(vh3.C7051b.f36556L, str);
            }
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, mo10488N2());
        SafeParcelWriter.writeString(parcel, 2, this.f7466a.toString(), false);
        SafeParcelWriter.writeByteArray(parcel, 3, mo10486L2(), false);
        SafeParcelWriter.writeString(parcel, 4, mo10485K2(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
