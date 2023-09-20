package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.o75;
import com.onedelhi.secure.ts2;

@SafeParcelable.Class(creator = "IdTokenCreator")
@SafeParcelable.Reserved({1000})
@Deprecated
public final class IdToken extends AbstractSafeParcelable implements ReflectedParcelable {
    @mr2
    public static final Parcelable.Creator<IdToken> CREATOR = new o75();
    @SafeParcelable.Field(getter = "getAccountType", mo10053id = 1)
    @mr2

    /* renamed from: b */
    public final String f7257b;
    @SafeParcelable.Field(getter = "getIdToken", mo10053id = 2)
    @mr2

    /* renamed from: c */
    public final String f7258c;

    @SafeParcelable.Constructor
    public IdToken(@SafeParcelable.Param(mo10056id = 1) @mr2 String str, @SafeParcelable.Param(mo10056id = 2) @mr2 String str2) {
        Preconditions.checkArgument(!TextUtils.isEmpty(str), "account type string cannot be null or empty");
        Preconditions.checkArgument(!TextUtils.isEmpty(str2), "id token string cannot be null or empty");
        this.f7257b = str;
        this.f7258c = str2;
    }

    @mr2
    /* renamed from: K2 */
    public String mo9164K2() {
        return this.f7257b;
    }

    @mr2
    /* renamed from: L2 */
    public String mo9165L2() {
        return this.f7258c;
    }

    public boolean equals(@ts2 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdToken)) {
            return false;
        }
        IdToken idToken = (IdToken) obj;
        return Objects.equal(this.f7257b, idToken.f7257b) && Objects.equal(this.f7258c, idToken.f7258c);
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, mo9164K2(), false);
        SafeParcelWriter.writeString(parcel, 2, mo9165L2(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
