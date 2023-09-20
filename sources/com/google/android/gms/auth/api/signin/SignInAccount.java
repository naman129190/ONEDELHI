package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.z65;

@SafeParcelable.Class(creator = "SignInAccountCreator")
@SafeParcelable.Reserved({1})
public class SignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    @mr2
    public static final Parcelable.Creator<SignInAccount> CREATOR = new z65();
    @SafeParcelable.Field(getter = "getGoogleSignInAccount", mo10053id = 7)

    /* renamed from: a */
    public final GoogleSignInAccount f7331a;
    @SafeParcelable.Field(defaultValue = "", mo10053id = 4)
    @Deprecated

    /* renamed from: b */
    public final String f7332b;
    @SafeParcelable.Field(defaultValue = "", mo10053id = 8)
    @Deprecated

    /* renamed from: c */
    public final String f7333c;

    @SafeParcelable.Constructor
    public SignInAccount(@SafeParcelable.Param(mo10056id = 4) String str, @SafeParcelable.Param(mo10056id = 7) GoogleSignInAccount googleSignInAccount, @SafeParcelable.Param(mo10056id = 8) String str2) {
        this.f7331a = googleSignInAccount;
        this.f7332b = Preconditions.checkNotEmpty(str, "8.3 and 8.4 SDKs require non-null email");
        this.f7333c = Preconditions.checkNotEmpty(str2, "8.3 and 8.4 SDKs require non-null userId");
    }

    @ts2
    /* renamed from: K2 */
    public final GoogleSignInAccount mo9246K2() {
        return this.f7331a;
    }

    public final void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 4, this.f7332b, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.f7331a, i, false);
        SafeParcelWriter.writeString(parcel, 8, this.f7333c, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
