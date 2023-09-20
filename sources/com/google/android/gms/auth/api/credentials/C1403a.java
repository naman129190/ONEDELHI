package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.onedelhi.secure.c75;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@SafeParcelable.Class(creator = "CredentialRequestCreator")
@Deprecated
/* renamed from: com.google.android.gms.auth.api.credentials.a */
public final class C1403a extends AbstractSafeParcelable {
    @mr2
    public static final Parcelable.Creator<C1403a> CREATOR = new c75();
    @SafeParcelable.Field(getter = "getCredentialPickerConfig", mo10053id = 3)

    /* renamed from: a */
    public final CredentialPickerConfig f7259a;
    @SafeParcelable.Field(getter = "getAccountTypes", mo10053id = 2)

    /* renamed from: a */
    public final String[] f7260a;
    @SafeParcelable.Field(getter = "getCredentialHintPickerConfig", mo10053id = 4)

    /* renamed from: b */
    public final CredentialPickerConfig f7261b;
    @SafeParcelable.Field(getter = "getServerClientId", mo10053id = 6)
    @ts2

    /* renamed from: b */
    public final String f7262b;
    @SafeParcelable.Field(getter = "isPasswordLoginSupported", mo10053id = 1)

    /* renamed from: b */
    public final boolean f7263b;
    @SafeParcelable.Field(getter = "getIdTokenNonce", mo10053id = 7)
    @ts2

    /* renamed from: c */
    public final String f7264c;
    @SafeParcelable.Field(getter = "isIdTokenRequested", mo10053id = 5)

    /* renamed from: c */
    public final boolean f7265c;
    @SafeParcelable.Field(getter = "getRequireUserMediation", mo10053id = 8)

    /* renamed from: d */
    public final boolean f7266d;
    @SafeParcelable.Field(mo10053id = 1000)

    /* renamed from: n */
    public final int f7267n;

    /* renamed from: com.google.android.gms.auth.api.credentials.a$a */
    public static final class C1404a {

        /* renamed from: a */
        public CredentialPickerConfig f7268a;
        @ts2

        /* renamed from: a */
        public String f7269a = null;

        /* renamed from: a */
        public boolean f7270a;

        /* renamed from: a */
        public String[] f7271a;

        /* renamed from: b */
        public CredentialPickerConfig f7272b;
        @ts2

        /* renamed from: b */
        public String f7273b;

        /* renamed from: b */
        public boolean f7274b = false;

        @mr2
        /* renamed from: a */
        public C1403a mo9178a() {
            if (this.f7271a == null) {
                this.f7271a = new String[0];
            }
            if (this.f7270a || this.f7271a.length != 0) {
                return new C1403a(4, this.f7270a, this.f7271a, this.f7268a, this.f7272b, this.f7274b, this.f7269a, this.f7273b, false);
            }
            throw new IllegalStateException("At least one authentication method must be specified");
        }

        @mr2
        /* renamed from: b */
        public C1404a mo9179b(@mr2 String... strArr) {
            if (strArr == null) {
                strArr = new String[0];
            }
            this.f7271a = strArr;
            return this;
        }

        @mr2
        /* renamed from: c */
        public C1404a mo9180c(@mr2 CredentialPickerConfig credentialPickerConfig) {
            this.f7272b = credentialPickerConfig;
            return this;
        }

        @mr2
        /* renamed from: d */
        public C1404a mo9181d(@mr2 CredentialPickerConfig credentialPickerConfig) {
            this.f7268a = credentialPickerConfig;
            return this;
        }

        @mr2
        /* renamed from: e */
        public C1404a mo9182e(@ts2 String str) {
            this.f7273b = str;
            return this;
        }

        @mr2
        /* renamed from: f */
        public C1404a mo9183f(boolean z) {
            this.f7274b = z;
            return this;
        }

        @mr2
        /* renamed from: g */
        public C1404a mo9184g(boolean z) {
            this.f7270a = z;
            return this;
        }

        @mr2
        /* renamed from: h */
        public C1404a mo9185h(@ts2 String str) {
            this.f7269a = str;
            return this;
        }

        @mr2
        @Deprecated
        /* renamed from: i */
        public C1404a mo9186i(boolean z) {
            mo9184g(z);
            return this;
        }
    }

    @SafeParcelable.Constructor
    public C1403a(@SafeParcelable.Param(mo10056id = 1000) int i, @SafeParcelable.Param(mo10056id = 1) boolean z, @SafeParcelable.Param(mo10056id = 2) String[] strArr, @SafeParcelable.Param(mo10056id = 3) @ts2 CredentialPickerConfig credentialPickerConfig, @SafeParcelable.Param(mo10056id = 4) @ts2 CredentialPickerConfig credentialPickerConfig2, @SafeParcelable.Param(mo10056id = 5) boolean z2, @SafeParcelable.Param(mo10056id = 6) @ts2 String str, @SafeParcelable.Param(mo10056id = 7) @ts2 String str2, @SafeParcelable.Param(mo10056id = 8) boolean z3) {
        this.f7267n = i;
        this.f7263b = z;
        this.f7260a = (String[]) Preconditions.checkNotNull(strArr);
        this.f7259a = credentialPickerConfig == null ? new CredentialPickerConfig.C1400a().mo9144a() : credentialPickerConfig;
        this.f7261b = credentialPickerConfig2 == null ? new CredentialPickerConfig.C1400a().mo9144a() : credentialPickerConfig2;
        if (i < 3) {
            this.f7265c = true;
            this.f7262b = null;
            this.f7264c = null;
        } else {
            this.f7265c = z2;
            this.f7262b = str;
            this.f7264c = str2;
        }
        this.f7266d = z3;
    }

    @mr2
    /* renamed from: K2 */
    public String[] mo9168K2() {
        return this.f7260a;
    }

    @mr2
    /* renamed from: L2 */
    public Set<String> mo9169L2() {
        return new HashSet(Arrays.asList(this.f7260a));
    }

    @mr2
    /* renamed from: M2 */
    public CredentialPickerConfig mo9170M2() {
        return this.f7261b;
    }

    @mr2
    /* renamed from: N2 */
    public CredentialPickerConfig mo9171N2() {
        return this.f7259a;
    }

    @ts2
    /* renamed from: O2 */
    public String mo9172O2() {
        return this.f7264c;
    }

    @ts2
    /* renamed from: P2 */
    public String mo9173P2() {
        return this.f7262b;
    }

    @Deprecated
    /* renamed from: Q2 */
    public boolean mo9174Q2() {
        return mo9176S2();
    }

    /* renamed from: R2 */
    public boolean mo9175R2() {
        return this.f7265c;
    }

    /* renamed from: S2 */
    public boolean mo9176S2() {
        return this.f7263b;
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, mo9176S2());
        SafeParcelWriter.writeStringArray(parcel, 2, mo9168K2(), false);
        SafeParcelWriter.writeParcelable(parcel, 3, mo9171N2(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, mo9170M2(), i, false);
        SafeParcelWriter.writeBoolean(parcel, 5, mo9175R2());
        SafeParcelWriter.writeString(parcel, 6, mo9173P2(), false);
        SafeParcelWriter.writeString(parcel, 7, mo9172O2(), false);
        SafeParcelWriter.writeBoolean(parcel, 8, this.f7266d);
        SafeParcelWriter.writeInt(parcel, 1000, this.f7267n);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
