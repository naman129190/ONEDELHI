package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fido.u2f.api.common.C1431a;
import com.google.android.gms.fido.u2f.api.common.C1432b;
import com.google.android.gms.fido.u2f.api.common.SignResponseData;
import com.onedelhi.secure.vh3;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

@SafeParcelable.Class(creator = "RegisteredKeyCreator")
@SafeParcelable.Reserved({1})
@Deprecated
public class jh3 extends AbstractSafeParcelable {
    @mr2
    public static final Parcelable.Creator<jh3> CREATOR = new ok6();
    @SafeParcelable.Field(getter = "getKeyHandle", mo10053id = 2)

    /* renamed from: a */
    public final C1431a f14156a;
    @SafeParcelable.Field(getter = "getAppId", mo10053id = 4)

    /* renamed from: b */
    public final String f14157b;
    @SafeParcelable.Field(getter = "getChallengeValue", mo10053id = 3)

    /* renamed from: c */
    public String f14158c;

    public jh3(@mr2 C1431a aVar) {
        this(aVar, (String) null, (String) null);
    }

    @SafeParcelable.Constructor
    public jh3(@SafeParcelable.Param(mo10056id = 2) @mr2 C1431a aVar, @SafeParcelable.Param(mo10056id = 3) @mr2 String str, @SafeParcelable.Param(mo10056id = 4) @mr2 String str2) {
        this.f14156a = (C1431a) Preconditions.checkNotNull(aVar);
        this.f14158c = str;
        this.f14157b = str2;
    }

    @mr2
    /* renamed from: N2 */
    public static jh3 m18578N2(@mr2 JSONObject jSONObject) throws JSONException {
        String str = null;
        String string = jSONObject.has(C3954xy.f22808e) ? jSONObject.getString(C3954xy.f22808e) : null;
        C1431a O2 = C1431a.m8969O2(jSONObject);
        if (jSONObject.has(vh3.C7051b.f36556L)) {
            str = jSONObject.getString(vh3.C7051b.f36556L);
        }
        return new jh3(O2, string, str);
    }

    @mr2
    /* renamed from: K2 */
    public String mo18424K2() {
        return this.f14157b;
    }

    @mr2
    /* renamed from: L2 */
    public String mo18425L2() {
        return this.f14158c;
    }

    @mr2
    /* renamed from: M2 */
    public C1431a mo18426M2() {
        return this.f14156a;
    }

    public boolean equals(@mr2 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jh3)) {
            return false;
        }
        jh3 jh3 = (jh3) obj;
        String str = this.f14158c;
        if (str == null) {
            if (jh3.f14158c != null) {
                return false;
            }
        } else if (!str.equals(jh3.f14158c)) {
            return false;
        }
        if (!this.f14156a.equals(jh3.f14156a)) {
            return false;
        }
        String str2 = this.f14157b;
        String str3 = jh3.f14157b;
        if (str2 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str2.equals(str3)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f14158c;
        int i = 0;
        int hashCode = (((str == null ? 0 : str.hashCode()) + 31) * 31) + this.f14156a.hashCode();
        String str2 = this.f14157b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    @mr2
    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f14158c;
            if (str != null) {
                jSONObject.put(C3954xy.f22808e, str);
            }
            JSONObject P2 = this.f14156a.mo10475P2();
            Iterator<String> keys = P2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject.put(next, P2.get(next));
            }
            String str2 = this.f14157b;
            if (str2 != null) {
                jSONObject.put(vh3.C7051b.f36556L, str2);
            }
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    @mr2
    public String toString() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(SignResponseData.f7450d, Base64.encodeToString(this.f14156a.mo10471K2(), 11));
            if (this.f14156a.mo10472L2() != C1432b.UNKNOWN) {
                jSONObject.put("version", this.f14156a.mo10472L2().toString());
            }
            if (this.f14156a.mo10473M2() != null) {
                jSONObject.put("transports", this.f14156a.mo10473M2().toString());
            }
            String str = this.f14158c;
            if (str != null) {
                jSONObject.put(C3954xy.f22808e, str);
            }
            String str2 = this.f14157b;
            if (str2 != null) {
                jSONObject.put(vh3.C7051b.f36556L, str2);
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, mo18426M2(), i, false);
        SafeParcelWriter.writeString(parcel, 3, mo18425L2(), false);
        SafeParcelWriter.writeString(parcel, 4, mo18424K2(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
