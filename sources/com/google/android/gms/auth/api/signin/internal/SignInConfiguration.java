package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.onedelhi.secure.d95;
import com.onedelhi.secure.mk1;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;

@SafeParcelable.Class(creator = "SignInConfigurationCreator")
@SafeParcelable.Reserved({1})
public final class SignInConfiguration extends AbstractSafeParcelable implements ReflectedParcelable {
    @mr2
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new d95();
    @SafeParcelable.Field(getter = "getGoogleConfig", mo10053id = 5)

    /* renamed from: a */
    public final GoogleSignInOptions f7334a;
    @SafeParcelable.Field(getter = "getConsumerPkgName", mo10053id = 2)

    /* renamed from: b */
    public final String f7335b;

    @SafeParcelable.Constructor
    public SignInConfiguration(@SafeParcelable.Param(mo10056id = 2) @mr2 String str, @SafeParcelable.Param(mo10056id = 5) @mr2 GoogleSignInOptions googleSignInOptions) {
        this.f7335b = Preconditions.checkNotEmpty(str);
        this.f7334a = googleSignInOptions;
    }

    @mr2
    /* renamed from: K2 */
    public final GoogleSignInOptions mo9248K2() {
        return this.f7334a;
    }

    public final boolean equals(@ts2 Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.f7335b.equals(signInConfiguration.f7335b)) {
            GoogleSignInOptions googleSignInOptions = this.f7334a;
            GoogleSignInOptions googleSignInOptions2 = signInConfiguration.f7334a;
            if (googleSignInOptions != null) {
                return googleSignInOptions.equals(googleSignInOptions2);
            }
            if (googleSignInOptions2 == null) {
                return true;
            }
        }
    }

    public final int hashCode() {
        return new mk1().mo20455a(this.f7335b).mo20455a(this.f7334a).mo20456b();
    }

    public final void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f7335b, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.f7334a, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
