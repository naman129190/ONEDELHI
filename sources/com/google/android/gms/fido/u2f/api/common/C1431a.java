package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.u2f.api.common.C1432b;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.p26;
import com.onedelhi.secure.ts2;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SafeParcelable.Class(creator = "KeyHandleCreator")
@Deprecated
/* renamed from: com.google.android.gms.fido.u2f.api.common.a */
public class C1431a extends AbstractSafeParcelable {
    @mr2
    public static final Parcelable.Creator<C1431a> CREATOR = new p26();
    @SafeParcelable.Field(getter = "getProtocolVersionAsString", mo10053id = 3, type = "java.lang.String")

    /* renamed from: a */
    public final C1432b f7456a;
    @SafeParcelable.Field(getter = "getTransports", mo10053id = 4)
    @ts2

    /* renamed from: a */
    public final List f7457a;
    @SafeParcelable.Field(getter = "getBytes", mo10053id = 2)

    /* renamed from: a */
    public final byte[] f7458a;
    @SafeParcelable.VersionField(getter = "getVersionCode", mo10062id = 1)

    /* renamed from: n */
    public final int f7459n;

    @SafeParcelable.Constructor
    public C1431a(@SafeParcelable.Param(mo10056id = 1) int i, @SafeParcelable.Param(mo10056id = 2) byte[] bArr, @SafeParcelable.Param(mo10056id = 3) String str, @SafeParcelable.Param(mo10056id = 4) @ts2 List list) {
        this.f7459n = i;
        this.f7458a = bArr;
        try {
            this.f7456a = C1432b.m8976b(str);
            this.f7457a = list;
        } catch (C1432b.C1433a e) {
            throw new IllegalArgumentException(e);
        }
    }

    public C1431a(@mr2 byte[] bArr, @mr2 C1432b bVar, @ts2 List<Transport> list) {
        this.f7459n = 1;
        this.f7458a = bArr;
        this.f7456a = bVar;
        this.f7457a = list;
    }

    @mr2
    /* renamed from: O2 */
    public static C1431a m8969O2(@mr2 JSONObject jSONObject) throws JSONException {
        List<Transport> list = null;
        try {
            C1432b b = C1432b.m8976b(jSONObject.has("version") ? jSONObject.getString("version") : null);
            try {
                byte[] decode = Base64.decode(jSONObject.getString(SignResponseData.f7450d), 8);
                if (jSONObject.has("transports")) {
                    list = Transport.m8916b(jSONObject.getJSONArray("transports"));
                }
                return new C1431a(decode, b, list);
            } catch (IllegalArgumentException e) {
                throw new JSONException(e.toString());
            }
        } catch (C1432b.C1433a e2) {
            throw new JSONException(e2.toString());
        }
    }

    @mr2
    /* renamed from: K2 */
    public byte[] mo10471K2() {
        return this.f7458a;
    }

    @mr2
    /* renamed from: L2 */
    public C1432b mo10472L2() {
        return this.f7456a;
    }

    @mr2
    /* renamed from: M2 */
    public List<Transport> mo10473M2() {
        return this.f7457a;
    }

    /* renamed from: N2 */
    public int mo10474N2() {
        return this.f7459n;
    }

    @mr2
    /* renamed from: P2 */
    public final JSONObject mo10475P2() {
        JSONObject jSONObject = new JSONObject();
        try {
            byte[] bArr = this.f7458a;
            if (bArr != null) {
                jSONObject.put(SignResponseData.f7450d, Base64.encodeToString(bArr, 11));
            }
            C1432b bVar = this.f7456a;
            if (bVar != null) {
                jSONObject.put("version", bVar.toString());
            }
            if (this.f7457a != null) {
                JSONArray jSONArray = new JSONArray();
                for (Transport transport : this.f7457a) {
                    jSONArray.put(transport.toString());
                }
                jSONObject.put("transports", jSONArray);
            }
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002e, code lost:
        r3 = r5.f7457a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(@com.onedelhi.secure.mr2 java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.gms.fido.u2f.api.common.C1431a
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            com.google.android.gms.fido.u2f.api.common.a r5 = (com.google.android.gms.fido.u2f.api.common.C1431a) r5
            byte[] r1 = r4.f7458a
            byte[] r3 = r5.f7458a
            boolean r1 = java.util.Arrays.equals(r1, r3)
            if (r1 != 0) goto L_0x0017
            return r2
        L_0x0017:
            com.google.android.gms.fido.u2f.api.common.b r1 = r4.f7456a
            com.google.android.gms.fido.u2f.api.common.b r3 = r5.f7456a
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0022
            return r2
        L_0x0022:
            java.util.List r1 = r4.f7457a
            if (r1 != 0) goto L_0x002c
            java.util.List r3 = r5.f7457a
            if (r3 == 0) goto L_0x002b
            goto L_0x002c
        L_0x002b:
            return r0
        L_0x002c:
            if (r1 == 0) goto L_0x0044
            java.util.List r3 = r5.f7457a
            if (r3 != 0) goto L_0x0033
            goto L_0x0044
        L_0x0033:
            boolean r1 = r1.containsAll(r3)
            if (r1 == 0) goto L_0x0044
            java.util.List r5 = r5.f7457a
            java.util.List r1 = r4.f7457a
            boolean r5 = r5.containsAll(r1)
            if (r5 == 0) goto L_0x0044
            return r0
        L_0x0044:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.u2f.api.common.C1431a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(Arrays.hashCode(this.f7458a)), this.f7456a, this.f7457a);
    }

    @mr2
    public JSONObject toJson() {
        return mo10475P2();
    }

    @mr2
    public String toString() {
        List list = this.f7457a;
        return String.format("{keyHandle: %s, version: %s, transports: %s}", new Object[]{Base64Utils.encode(this.f7458a), this.f7456a, list == null ? "null" : list.toString()});
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, mo10474N2());
        SafeParcelWriter.writeByteArray(parcel, 2, mo10471K2(), false);
        SafeParcelWriter.writeString(parcel, 3, this.f7456a.toString(), false);
        SafeParcelWriter.writeTypedList(parcel, 4, mo10473M2(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
