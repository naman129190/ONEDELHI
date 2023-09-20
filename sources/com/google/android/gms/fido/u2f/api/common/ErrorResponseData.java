package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.onedelhi.secure.gv0;
import com.onedelhi.secure.mf5;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.ux5;
import com.onedelhi.secure.xf5;
import org.json.JSONException;
import org.json.JSONObject;

@SafeParcelable.Class(creator = "ErrorResponseDataCreator")
@SafeParcelable.Reserved({1})
@Deprecated
public class ErrorResponseData extends ResponseData {
    @mr2
    public static final Parcelable.Creator<ErrorResponseData> CREATOR = new ux5();
    @mr2
    @VisibleForTesting

    /* renamed from: c */
    public static final String f7410c = "errorCode";
    @mr2
    @VisibleForTesting

    /* renamed from: d */
    public static final String f7411d = "errorMessage";
    @SafeParcelable.Field(getter = "getErrorCodeAsInt", mo10053id = 2, type = "int")

    /* renamed from: a */
    public final gv0 f7412a;
    @SafeParcelable.Field(getter = "getErrorMessage", mo10053id = 3)

    /* renamed from: b */
    public final String f7413b;

    @SafeParcelable.Constructor
    public ErrorResponseData(@SafeParcelable.Param(mo10056id = 2) int i, @SafeParcelable.Param(mo10056id = 3) String str) {
        this.f7412a = gv0.m16268b(i);
        this.f7413b = str;
    }

    public ErrorResponseData(@mr2 gv0 gv0) {
        this.f7412a = (gv0) Preconditions.checkNotNull(gv0);
        this.f7413b = null;
    }

    public ErrorResponseData(@mr2 gv0 gv0, @mr2 String str) {
        this.f7412a = (gv0) Preconditions.checkNotNull(gv0);
        this.f7413b = str;
    }

    @mr2
    /* renamed from: K2 */
    public final JSONObject mo10417K2() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errorCode", this.f7412a.mo16921a());
            String str = this.f7413b;
            if (str != null) {
                jSONObject.put("errorMessage", str);
            }
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    @mr2
    /* renamed from: L2 */
    public gv0 mo10418L2() {
        return this.f7412a;
    }

    /* renamed from: M2 */
    public int mo10419M2() {
        return this.f7412a.mo16921a();
    }

    public boolean equals(@ts2 Object obj) {
        if (!(obj instanceof ErrorResponseData)) {
            return false;
        }
        ErrorResponseData errorResponseData = (ErrorResponseData) obj;
        return Objects.equal(this.f7412a, errorResponseData.f7412a) && Objects.equal(this.f7413b, errorResponseData.f7413b);
    }

    @mr2
    public String getErrorMessage() {
        return this.f7413b;
    }

    public int hashCode() {
        return Objects.hashCode(this.f7412a, this.f7413b);
    }

    @mr2
    public String toString() {
        mf5 a = xf5.m31424a(this);
        a.mo20328a("errorCode", this.f7412a.mo16921a());
        String str = this.f7413b;
        if (str != null) {
            a.mo20329b("errorMessage", str);
        }
        return a.toString();
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, mo10419M2());
        SafeParcelWriter.writeString(parcel, 3, getErrorMessage(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
