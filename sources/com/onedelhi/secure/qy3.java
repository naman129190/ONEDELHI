package com.onedelhi.secure;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "SignInCredentialCreator")
public final class qy3 extends AbstractSafeParcelable {
    @mr2
    public static final Parcelable.Creator<qy3> CREATOR = new p85();
    @SafeParcelable.Field(getter = "getProfilePictureUri", mo10053id = 5)
    @ts2

    /* renamed from: a */
    public final Uri f19498a;
    @SafeParcelable.Field(getter = "getPublicKeyCredential", mo10053id = 9)
    @ts2

    /* renamed from: a */
    public final q73 f19499a;
    @SafeParcelable.Field(getter = "getId", mo10053id = 1)

    /* renamed from: b */
    public final String f19500b;
    @SafeParcelable.Field(getter = "getDisplayName", mo10053id = 2)
    @ts2

    /* renamed from: c */
    public final String f19501c;
    @SafeParcelable.Field(getter = "getGivenName", mo10053id = 3)
    @ts2

    /* renamed from: d */
    public final String f19502d;
    @SafeParcelable.Field(getter = "getFamilyName", mo10053id = 4)
    @ts2

    /* renamed from: e */
    public final String f19503e;
    @SafeParcelable.Field(getter = "getPassword", mo10053id = 6)
    @ts2

    /* renamed from: f */
    public final String f19504f;
    @SafeParcelable.Field(getter = "getGoogleIdToken", mo10053id = 7)
    @ts2

    /* renamed from: g */
    public final String f19505g;
    @SafeParcelable.Field(getter = "getPhoneNumber", mo10053id = 8)
    @ts2

    /* renamed from: h */
    public final String f19506h;

    @SafeParcelable.Constructor
    public qy3(@SafeParcelable.Param(mo10056id = 1) String str, @SafeParcelable.Param(mo10056id = 2) @ts2 String str2, @SafeParcelable.Param(mo10056id = 3) @ts2 String str3, @SafeParcelable.Param(mo10056id = 4) @ts2 String str4, @SafeParcelable.Param(mo10056id = 5) @ts2 Uri uri, @SafeParcelable.Param(mo10056id = 6) @ts2 String str5, @SafeParcelable.Param(mo10056id = 7) @ts2 String str6, @SafeParcelable.Param(mo10056id = 8) @ts2 String str7, @SafeParcelable.Param(mo10056id = 9) @ts2 q73 q73) {
        this.f19500b = Preconditions.checkNotEmpty(str);
        this.f19501c = str2;
        this.f19502d = str3;
        this.f19503e = str4;
        this.f19498a = uri;
        this.f19504f = str5;
        this.f19505g = str6;
        this.f19506h = str7;
        this.f19499a = q73;
    }

    @ts2
    /* renamed from: K2 */
    public String mo23476K2() {
        return this.f19501c;
    }

    @ts2
    /* renamed from: L2 */
    public String mo23477L2() {
        return this.f19503e;
    }

    @ts2
    /* renamed from: M2 */
    public String mo23478M2() {
        return this.f19502d;
    }

    @ts2
    /* renamed from: N2 */
    public String mo23479N2() {
        return this.f19505g;
    }

    @mr2
    /* renamed from: O2 */
    public String mo23480O2() {
        return this.f19500b;
    }

    @ts2
    /* renamed from: P2 */
    public String mo23481P2() {
        return this.f19504f;
    }

    @ts2
    @Deprecated
    /* renamed from: Q2 */
    public String mo23482Q2() {
        return this.f19506h;
    }

    @ts2
    /* renamed from: R2 */
    public Uri mo23483R2() {
        return this.f19498a;
    }

    @ts2
    /* renamed from: S2 */
    public q73 mo23484S2() {
        return this.f19499a;
    }

    public boolean equals(@ts2 Object obj) {
        if (!(obj instanceof qy3)) {
            return false;
        }
        qy3 qy3 = (qy3) obj;
        return Objects.equal(this.f19500b, qy3.f19500b) && Objects.equal(this.f19501c, qy3.f19501c) && Objects.equal(this.f19502d, qy3.f19502d) && Objects.equal(this.f19503e, qy3.f19503e) && Objects.equal(this.f19498a, qy3.f19498a) && Objects.equal(this.f19504f, qy3.f19504f) && Objects.equal(this.f19505g, qy3.f19505g) && Objects.equal(this.f19506h, qy3.f19506h) && Objects.equal(this.f19499a, qy3.f19499a);
    }

    public int hashCode() {
        return Objects.hashCode(this.f19500b, this.f19501c, this.f19502d, this.f19503e, this.f19498a, this.f19504f, this.f19505g, this.f19506h, this.f19499a);
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, mo23480O2(), false);
        SafeParcelWriter.writeString(parcel, 2, mo23476K2(), false);
        SafeParcelWriter.writeString(parcel, 3, mo23478M2(), false);
        SafeParcelWriter.writeString(parcel, 4, mo23477L2(), false);
        SafeParcelWriter.writeParcelable(parcel, 5, mo23483R2(), i, false);
        SafeParcelWriter.writeString(parcel, 6, mo23481P2(), false);
        SafeParcelWriter.writeString(parcel, 7, mo23479N2(), false);
        SafeParcelWriter.writeString(parcel, 8, mo23482Q2(), false);
        SafeParcelWriter.writeParcelable(parcel, 9, mo23484S2(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
