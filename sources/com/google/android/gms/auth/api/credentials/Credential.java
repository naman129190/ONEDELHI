package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.onedelhi.secure.j55;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;
import java.util.List;
import javax.annotation.Nonnull;

@SafeParcelable.Class(creator = "CredentialCreator")
@SafeParcelable.Reserved({1000, 1001, 1002})
@Deprecated
public class Credential extends AbstractSafeParcelable implements ReflectedParcelable {
    @mr2
    public static final Parcelable.Creator<Credential> CREATOR = new j55();
    @mr2

    /* renamed from: h */
    public static final String f7215h = "com.google.android.gms.credentials.Credential";
    @SafeParcelable.Field(getter = "getProfilePictureUri", mo10053id = 3)
    @ts2

    /* renamed from: a */
    public final Uri f7216a;
    @SafeParcelable.Field(getter = "getIdTokens", mo10053id = 4)
    @Nonnull

    /* renamed from: a */
    public final List f7217a;
    @SafeParcelable.Field(getter = "getId", mo10053id = 1)
    @Nonnull

    /* renamed from: b */
    public final String f7218b;
    @SafeParcelable.Field(getter = "getName", mo10053id = 2)
    @ts2

    /* renamed from: c */
    public final String f7219c;
    @SafeParcelable.Field(getter = "getPassword", mo10053id = 5)
    @ts2

    /* renamed from: d */
    public final String f7220d;
    @SafeParcelable.Field(getter = "getAccountType", mo10053id = 6)
    @ts2

    /* renamed from: e */
    public final String f7221e;
    @SafeParcelable.Field(getter = "getGivenName", mo10053id = 9)
    @ts2

    /* renamed from: f */
    public final String f7222f;
    @SafeParcelable.Field(getter = "getFamilyName", mo10053id = 10)
    @ts2

    /* renamed from: g */
    public final String f7223g;

    @Deprecated
    /* renamed from: com.google.android.gms.auth.api.credentials.Credential$a */
    public static class C1399a {
        @ts2

        /* renamed from: a */
        public Uri f7224a;

        /* renamed from: a */
        public final String f7225a;

        /* renamed from: a */
        public List f7226a;
        @ts2

        /* renamed from: b */
        public String f7227b;
        @ts2

        /* renamed from: c */
        public String f7228c;
        @ts2

        /* renamed from: d */
        public String f7229d;
        @ts2

        /* renamed from: e */
        public String f7230e;
        @ts2

        /* renamed from: f */
        public String f7231f;

        public C1399a(@mr2 Credential credential) {
            this.f7225a = credential.f7218b;
            this.f7227b = credential.f7219c;
            this.f7224a = credential.f7216a;
            this.f7226a = credential.f7217a;
            this.f7228c = credential.f7220d;
            this.f7229d = credential.f7221e;
            this.f7230e = credential.f7222f;
            this.f7231f = credential.f7223g;
        }

        public C1399a(@mr2 String str) {
            this.f7225a = str;
        }

        @mr2
        /* renamed from: a */
        public Credential mo9135a() {
            return new Credential(this.f7225a, this.f7227b, this.f7224a, this.f7226a, this.f7228c, this.f7229d, this.f7230e, this.f7231f);
        }

        @mr2
        /* renamed from: b */
        public C1399a mo9136b(@mr2 String str) {
            this.f7229d = str;
            return this;
        }

        @mr2
        /* renamed from: c */
        public C1399a mo9137c(@mr2 String str) {
            this.f7227b = str;
            return this;
        }

        @mr2
        /* renamed from: d */
        public C1399a mo9138d(@ts2 String str) {
            this.f7228c = str;
            return this;
        }

        @mr2
        /* renamed from: e */
        public C1399a mo9139e(@mr2 Uri uri) {
            this.f7224a = uri;
            return this;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x007b  */
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Credential(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo10056id = 1) java.lang.String r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo10056id = 2) @com.onedelhi.secure.ts2 java.lang.String r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo10056id = 3) @com.onedelhi.secure.ts2 android.net.Uri r6, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo10056id = 4) java.util.List r7, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo10056id = 5) @com.onedelhi.secure.ts2 java.lang.String r8, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo10056id = 6) @com.onedelhi.secure.ts2 java.lang.String r9, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo10056id = 9) @com.onedelhi.secure.ts2 java.lang.String r10, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo10056id = 10) @com.onedelhi.secure.ts2 java.lang.String r11) {
        /*
            r3 = this;
            r3.<init>()
            java.lang.String r0 = "credential identifier cannot be null"
            java.lang.Object r4 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r4, r0)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = r4.trim()
            java.lang.String r0 = "credential identifier cannot be empty"
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r4, r0)
            if (r8 == 0) goto L_0x0025
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x001d
            goto L_0x0025
        L_0x001d:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Password must not be empty if set"
            r4.<init>(r5)
            throw r4
        L_0x0025:
            if (r9 == 0) goto L_0x0083
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 == 0) goto L_0x0030
        L_0x002d:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            goto L_0x0074
        L_0x0030:
            android.net.Uri r0 = android.net.Uri.parse(r9)
            boolean r1 = r0.isAbsolute()
            if (r1 == 0) goto L_0x002d
            boolean r1 = r0.isHierarchical()
            if (r1 == 0) goto L_0x002d
            java.lang.String r1 = r0.getScheme()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x002d
            java.lang.String r1 = r0.getAuthority()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0055
            goto L_0x002d
        L_0x0055:
            java.lang.String r1 = r0.getScheme()
            java.lang.String r2 = "http"
            boolean r1 = r2.equalsIgnoreCase(r1)
            r2 = 1
            if (r1 != 0) goto L_0x0070
            java.lang.String r0 = r0.getScheme()
            java.lang.String r1 = "https"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x006f
            goto L_0x0070
        L_0x006f:
            r2 = 0
        L_0x0070:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
        L_0x0074:
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x007b
            goto L_0x0083
        L_0x007b:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Account type must be a valid Http/Https URI"
            r4.<init>(r5)
            throw r4
        L_0x0083:
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x0098
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto L_0x0090
            goto L_0x0098
        L_0x0090:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Password and AccountType are mutually exclusive"
            r4.<init>(r5)
            throw r4
        L_0x0098:
            if (r5 == 0) goto L_0x00a5
            java.lang.String r0 = r5.trim()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00a5
            r5 = 0
        L_0x00a5:
            r3.f7219c = r5
            r3.f7216a = r6
            if (r7 != 0) goto L_0x00b0
            java.util.List r5 = java.util.Collections.emptyList()
            goto L_0x00b4
        L_0x00b0:
            java.util.List r5 = java.util.Collections.unmodifiableList(r7)
        L_0x00b4:
            r3.f7217a = r5
            r3.f7218b = r4
            r3.f7220d = r8
            r3.f7221e = r9
            r3.f7222f = r10
            r3.f7223g = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.credentials.Credential.<init>(java.lang.String, java.lang.String, android.net.Uri, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    @ts2
    /* renamed from: K2 */
    public String mo9124K2() {
        return this.f7221e;
    }

    @ts2
    /* renamed from: L2 */
    public String mo9125L2() {
        return this.f7223g;
    }

    @ts2
    /* renamed from: M2 */
    public String mo9126M2() {
        return this.f7222f;
    }

    @Nonnull
    /* renamed from: N2 */
    public String mo9127N2() {
        return this.f7218b;
    }

    @Nonnull
    /* renamed from: O2 */
    public List<IdToken> mo9128O2() {
        return this.f7217a;
    }

    @ts2
    /* renamed from: P2 */
    public String mo9129P2() {
        return this.f7220d;
    }

    @ts2
    /* renamed from: Q2 */
    public Uri mo9130Q2() {
        return this.f7216a;
    }

    public boolean equals(@ts2 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Credential)) {
            return false;
        }
        Credential credential = (Credential) obj;
        return TextUtils.equals(this.f7218b, credential.f7218b) && TextUtils.equals(this.f7219c, credential.f7219c) && Objects.equal(this.f7216a, credential.f7216a) && TextUtils.equals(this.f7220d, credential.f7220d) && TextUtils.equals(this.f7221e, credential.f7221e);
    }

    @ts2
    public String getName() {
        return this.f7219c;
    }

    public int hashCode() {
        return Objects.hashCode(this.f7218b, this.f7219c, this.f7216a, this.f7220d, this.f7221e);
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, mo9127N2(), false);
        SafeParcelWriter.writeString(parcel, 2, getName(), false);
        SafeParcelWriter.writeParcelable(parcel, 3, mo9130Q2(), i, false);
        SafeParcelWriter.writeTypedList(parcel, 4, mo9128O2(), false);
        SafeParcelWriter.writeString(parcel, 5, mo9129P2(), false);
        SafeParcelWriter.writeString(parcel, 6, mo9124K2(), false);
        SafeParcelWriter.writeString(parcel, 9, mo9126M2(), false);
        SafeParcelWriter.writeString(parcel, 10, mo9125L2(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
