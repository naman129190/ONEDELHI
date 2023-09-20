package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.onedelhi.secure.k75;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;

@SafeParcelable.Class(creator = "HintRequestCreator")
@Deprecated
public final class HintRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    @mr2
    public static final Parcelable.Creator<HintRequest> CREATOR = new k75();
    @SafeParcelable.Field(getter = "getHintPickerConfig", mo10053id = 1)

    /* renamed from: a */
    public final CredentialPickerConfig f7242a;
    @SafeParcelable.Field(getter = "getAccountTypes", mo10053id = 4)

    /* renamed from: a */
    public final String[] f7243a;
    @SafeParcelable.Field(getter = "getServerClientId", mo10053id = 6)
    @ts2

    /* renamed from: b */
    public final String f7244b;
    @SafeParcelable.Field(getter = "isEmailAddressIdentifierSupported", mo10053id = 2)

    /* renamed from: b */
    public final boolean f7245b;
    @SafeParcelable.Field(getter = "getIdTokenNonce", mo10053id = 7)
    @ts2

    /* renamed from: c */
    public final String f7246c;
    @SafeParcelable.Field(getter = "isPhoneNumberIdentifierSupported", mo10053id = 3)

    /* renamed from: c */
    public final boolean f7247c;
    @SafeParcelable.Field(getter = "isIdTokenRequested", mo10053id = 5)

    /* renamed from: d */
    public final boolean f7248d;
    @SafeParcelable.Field(mo10053id = 1000)

    /* renamed from: n */
    public final int f7249n;

    /* renamed from: com.google.android.gms.auth.api.credentials.HintRequest$a */
    public static final class C1402a {

        /* renamed from: a */
        public CredentialPickerConfig f7250a = new CredentialPickerConfig.C1400a().mo9144a();
        @ts2

        /* renamed from: a */
        public String f7251a;

        /* renamed from: a */
        public boolean f7252a;

        /* renamed from: a */
        public String[] f7253a;
        @ts2

        /* renamed from: b */
        public String f7254b;

        /* renamed from: b */
        public boolean f7255b;

        /* renamed from: c */
        public boolean f7256c = false;

        @mr2
        /* renamed from: a */
        public HintRequest mo9156a() {
            if (this.f7253a == null) {
                this.f7253a = new String[0];
            }
            if (this.f7252a || this.f7255b || this.f7253a.length != 0) {
                return new HintRequest(2, this.f7250a, this.f7252a, this.f7255b, this.f7253a, this.f7256c, this.f7251a, this.f7254b);
            }
            throw new IllegalStateException("At least one authentication method must be specified");
        }

        @mr2
        /* renamed from: b */
        public C1402a mo9157b(@mr2 String... strArr) {
            if (strArr == null) {
                strArr = new String[0];
            }
            this.f7253a = strArr;
            return this;
        }

        @mr2
        /* renamed from: c */
        public C1402a mo9158c(boolean z) {
            this.f7252a = z;
            return this;
        }

        @mr2
        /* renamed from: d */
        public C1402a mo9159d(@mr2 CredentialPickerConfig credentialPickerConfig) {
            this.f7250a = (CredentialPickerConfig) Preconditions.checkNotNull(credentialPickerConfig);
            return this;
        }

        @mr2
        /* renamed from: e */
        public C1402a mo9160e(@ts2 String str) {
            this.f7254b = str;
            return this;
        }

        @mr2
        /* renamed from: f */
        public C1402a mo9161f(boolean z) {
            this.f7256c = z;
            return this;
        }

        @mr2
        /* renamed from: g */
        public C1402a mo9162g(boolean z) {
            this.f7255b = z;
            return this;
        }

        @mr2
        /* renamed from: h */
        public C1402a mo9163h(@ts2 String str) {
            this.f7251a = str;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public HintRequest(@SafeParcelable.Param(mo10056id = 1000) int i, @SafeParcelable.Param(mo10056id = 1) CredentialPickerConfig credentialPickerConfig, @SafeParcelable.Param(mo10056id = 2) boolean z, @SafeParcelable.Param(mo10056id = 3) boolean z2, @SafeParcelable.Param(mo10056id = 4) String[] strArr, @SafeParcelable.Param(mo10056id = 5) boolean z3, @SafeParcelable.Param(mo10056id = 6) @ts2 String str, @SafeParcelable.Param(mo10056id = 7) @ts2 String str2) {
        this.f7249n = i;
        this.f7242a = (CredentialPickerConfig) Preconditions.checkNotNull(credentialPickerConfig);
        this.f7245b = z;
        this.f7247c = z2;
        this.f7243a = (String[]) Preconditions.checkNotNull(strArr);
        if (i < 2) {
            this.f7248d = true;
            this.f7244b = null;
            this.f7246c = null;
            return;
        }
        this.f7248d = z3;
        this.f7244b = str;
        this.f7246c = str2;
    }

    @mr2
    /* renamed from: K2 */
    public String[] mo9149K2() {
        return this.f7243a;
    }

    @mr2
    /* renamed from: L2 */
    public CredentialPickerConfig mo9150L2() {
        return this.f7242a;
    }

    @ts2
    /* renamed from: M2 */
    public String mo9151M2() {
        return this.f7246c;
    }

    @ts2
    /* renamed from: N2 */
    public String mo9152N2() {
        return this.f7244b;
    }

    /* renamed from: O2 */
    public boolean mo9153O2() {
        return this.f7245b;
    }

    /* renamed from: P2 */
    public boolean mo9154P2() {
        return this.f7248d;
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, mo9150L2(), i, false);
        SafeParcelWriter.writeBoolean(parcel, 2, mo9153O2());
        SafeParcelWriter.writeBoolean(parcel, 3, this.f7247c);
        SafeParcelWriter.writeStringArray(parcel, 4, mo9149K2(), false);
        SafeParcelWriter.writeBoolean(parcel, 5, mo9154P2());
        SafeParcelWriter.writeString(parcel, 6, mo9152N2(), false);
        SafeParcelWriter.writeString(parcel, 7, mo9151M2(), false);
        SafeParcelWriter.writeInt(parcel, 1000, this.f7249n);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
