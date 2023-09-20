package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@SafeParcelable.Class(creator = "BeginSignInRequestCreator")
/* renamed from: com.onedelhi.secure.kk */
public final class C2635kk extends AbstractSafeParcelable {
    @mr2
    public static final Parcelable.Creator<C2635kk> CREATOR = new k55();
    @SafeParcelable.Field(getter = "getGoogleIdTokenRequestOptions", mo10053id = 2)

    /* renamed from: a */
    public final C2637b f14912a;
    @SafeParcelable.Field(getter = "getPasskeyJsonRequestOptions", mo10053id = 7)

    /* renamed from: a */
    public final C2639c f14913a;
    @SafeParcelable.Field(getter = "getPasskeysRequestOptions", mo10053id = 6)

    /* renamed from: a */
    public final C2641d f14914a;
    @SafeParcelable.Field(getter = "getPasswordRequestOptions", mo10053id = 1)

    /* renamed from: a */
    public final C2643e f14915a;
    @SafeParcelable.Field(getter = "getSessionId", mo10053id = 3)
    @ts2

    /* renamed from: b */
    public final String f14916b;
    @SafeParcelable.Field(getter = "isAutoSelectEnabled", mo10053id = 4)

    /* renamed from: b */
    public final boolean f14917b;
    @SafeParcelable.Field(getter = "getTheme", mo10053id = 5)

    /* renamed from: n */
    public final int f14918n;

    /* renamed from: com.onedelhi.secure.kk$a */
    public static final class C2636a {

        /* renamed from: a */
        public int f14919a;

        /* renamed from: a */
        public C2637b f14920a;

        /* renamed from: a */
        public C2639c f14921a;

        /* renamed from: a */
        public C2641d f14922a;

        /* renamed from: a */
        public C2643e f14923a;
        @ts2

        /* renamed from: a */
        public String f14924a;

        /* renamed from: a */
        public boolean f14925a;

        public C2636a() {
            C2643e.C2644a K2 = C2643e.m19869K2();
            K2.mo19145b(false);
            this.f14923a = K2.mo19144a();
            C2637b.C2638a K22 = C2637b.m19840K2();
            K22.mo19121g(false);
            this.f14920a = K22.mo19116b();
            C2641d.C2642a K23 = C2641d.m19861K2();
            K23.mo19139d(false);
            this.f14922a = K23.mo19136a();
            C2639c.C2640a K24 = C2639c.m19855K2();
            K24.mo19129c(false);
            this.f14921a = K24.mo19127a();
        }

        @mr2
        /* renamed from: a */
        public C2635kk mo19097a() {
            return new C2635kk(this.f14923a, this.f14920a, this.f14924a, this.f14925a, this.f14919a, this.f14922a, this.f14921a);
        }

        @mr2
        /* renamed from: b */
        public C2636a mo19098b(boolean z) {
            this.f14925a = z;
            return this;
        }

        @mr2
        /* renamed from: c */
        public C2636a mo19099c(@mr2 C2637b bVar) {
            this.f14920a = (C2637b) Preconditions.checkNotNull(bVar);
            return this;
        }

        @mr2
        /* renamed from: d */
        public C2636a mo19100d(@mr2 C2639c cVar) {
            this.f14921a = (C2639c) Preconditions.checkNotNull(cVar);
            return this;
        }

        @mr2
        @Deprecated
        /* renamed from: e */
        public C2636a mo19101e(@mr2 C2641d dVar) {
            this.f14922a = (C2641d) Preconditions.checkNotNull(dVar);
            return this;
        }

        @mr2
        /* renamed from: f */
        public C2636a mo19102f(@mr2 C2643e eVar) {
            this.f14923a = (C2643e) Preconditions.checkNotNull(eVar);
            return this;
        }

        @mr2
        /* renamed from: g */
        public final C2636a mo19103g(@mr2 String str) {
            this.f14924a = str;
            return this;
        }

        @mr2
        /* renamed from: h */
        public final C2636a mo19104h(int i) {
            this.f14919a = i;
            return this;
        }
    }

    @SafeParcelable.Class(creator = "GoogleIdTokenRequestOptionsCreator")
    /* renamed from: com.onedelhi.secure.kk$b */
    public static final class C2637b extends AbstractSafeParcelable {
        @mr2
        public static final Parcelable.Creator<C2637b> CREATOR = new r75();
        @SafeParcelable.Field(getter = "getIdTokenDepositionScopes", mo10053id = 6)
        @ts2

        /* renamed from: a */
        public final List f14926a;
        @SafeParcelable.Field(getter = "getServerClientId", mo10053id = 2)
        @ts2

        /* renamed from: b */
        public final String f14927b;
        @SafeParcelable.Field(getter = "isSupported", mo10053id = 1)

        /* renamed from: b */
        public final boolean f14928b;
        @SafeParcelable.Field(getter = "getNonce", mo10053id = 3)
        @ts2

        /* renamed from: c */
        public final String f14929c;
        @SafeParcelable.Field(getter = "filterByAuthorizedAccounts", mo10053id = 4)

        /* renamed from: c */
        public final boolean f14930c;
        @SafeParcelable.Field(getter = "getLinkedServiceId", mo10053id = 5)
        @ts2

        /* renamed from: d */
        public final String f14931d;
        @SafeParcelable.Field(getter = "requestVerifiedPhoneNumber", mo10053id = 7)

        /* renamed from: d */
        public final boolean f14932d;

        /* renamed from: com.onedelhi.secure.kk$b$a */
        public static final class C2638a {
            @ts2

            /* renamed from: a */
            public String f14933a = null;
            @ts2

            /* renamed from: a */
            public List f14934a = null;

            /* renamed from: a */
            public boolean f14935a = false;
            @ts2

            /* renamed from: b */
            public String f14936b = null;

            /* renamed from: b */
            public boolean f14937b = true;
            @ts2

            /* renamed from: c */
            public String f14938c = null;

            /* renamed from: c */
            public boolean f14939c = false;

            @mr2
            /* renamed from: a */
            public C2638a mo19115a(@mr2 String str, @ts2 List<String> list) {
                this.f14938c = (String) Preconditions.checkNotNull(str, "linkedServiceId must be provided if you want to associate linked accounts.");
                this.f14934a = list;
                return this;
            }

            @mr2
            /* renamed from: b */
            public C2637b mo19116b() {
                return new C2637b(this.f14935a, this.f14933a, this.f14936b, this.f14937b, this.f14938c, this.f14934a, this.f14939c);
            }

            @mr2
            /* renamed from: c */
            public C2638a mo19117c(boolean z) {
                this.f14937b = z;
                return this;
            }

            @mr2
            /* renamed from: d */
            public C2638a mo19118d(@ts2 String str) {
                this.f14936b = str;
                return this;
            }

            @mr2
            @Deprecated
            /* renamed from: e */
            public C2638a mo19119e(boolean z) {
                this.f14939c = z;
                return this;
            }

            @mr2
            /* renamed from: f */
            public C2638a mo19120f(@mr2 String str) {
                this.f14933a = Preconditions.checkNotEmpty(str);
                return this;
            }

            @mr2
            /* renamed from: g */
            public C2638a mo19121g(boolean z) {
                this.f14935a = z;
                return this;
            }
        }

        @SafeParcelable.Constructor
        public C2637b(@SafeParcelable.Param(mo10056id = 1) boolean z, @SafeParcelable.Param(mo10056id = 2) @ts2 String str, @SafeParcelable.Param(mo10056id = 3) @ts2 String str2, @SafeParcelable.Param(mo10056id = 4) boolean z2, @SafeParcelable.Param(mo10056id = 5) @ts2 String str3, @SafeParcelable.Param(mo10056id = 6) @ts2 List list, @SafeParcelable.Param(mo10056id = 7) boolean z3) {
            boolean z4 = true;
            if (z2 && z3) {
                z4 = false;
            }
            Preconditions.checkArgument(z4, "filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.");
            this.f14928b = z;
            if (z) {
                Preconditions.checkNotNull(str, "serverClientId must be provided if Google ID tokens are requested");
            }
            this.f14927b = str;
            this.f14929c = str2;
            this.f14930c = z2;
            Parcelable.Creator<C2635kk> creator = C2635kk.CREATOR;
            ArrayList arrayList = null;
            if (list != null && !list.isEmpty()) {
                arrayList = new ArrayList(list);
                Collections.sort(arrayList);
            }
            this.f14926a = arrayList;
            this.f14931d = str3;
            this.f14932d = z3;
        }

        @mr2
        /* renamed from: K2 */
        public static C2638a m19840K2() {
            return new C2638a();
        }

        /* renamed from: L2 */
        public boolean mo19105L2() {
            return this.f14930c;
        }

        @ts2
        /* renamed from: M2 */
        public List<String> mo19106M2() {
            return this.f14926a;
        }

        @ts2
        /* renamed from: N2 */
        public String mo19107N2() {
            return this.f14931d;
        }

        @ts2
        /* renamed from: O2 */
        public String mo19108O2() {
            return this.f14929c;
        }

        @ts2
        /* renamed from: P2 */
        public String mo19109P2() {
            return this.f14927b;
        }

        /* renamed from: Q2 */
        public boolean mo19110Q2() {
            return this.f14928b;
        }

        @Deprecated
        /* renamed from: R2 */
        public boolean mo19111R2() {
            return this.f14932d;
        }

        public boolean equals(@ts2 Object obj) {
            if (!(obj instanceof C2637b)) {
                return false;
            }
            C2637b bVar = (C2637b) obj;
            return this.f14928b == bVar.f14928b && Objects.equal(this.f14927b, bVar.f14927b) && Objects.equal(this.f14929c, bVar.f14929c) && this.f14930c == bVar.f14930c && Objects.equal(this.f14931d, bVar.f14931d) && Objects.equal(this.f14926a, bVar.f14926a) && this.f14932d == bVar.f14932d;
        }

        public int hashCode() {
            return Objects.hashCode(Boolean.valueOf(this.f14928b), this.f14927b, this.f14929c, Boolean.valueOf(this.f14930c), this.f14931d, this.f14926a, Boolean.valueOf(this.f14932d));
        }

        public void writeToParcel(@mr2 Parcel parcel, int i) {
            int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeBoolean(parcel, 1, mo19110Q2());
            SafeParcelWriter.writeString(parcel, 2, mo19109P2(), false);
            SafeParcelWriter.writeString(parcel, 3, mo19108O2(), false);
            SafeParcelWriter.writeBoolean(parcel, 4, mo19105L2());
            SafeParcelWriter.writeString(parcel, 5, mo19107N2(), false);
            SafeParcelWriter.writeStringList(parcel, 6, mo19106M2(), false);
            SafeParcelWriter.writeBoolean(parcel, 7, mo19111R2());
            SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        }
    }

    @SafeParcelable.Class(creator = "PasskeyJsonRequestOptionsCreator")
    /* renamed from: com.onedelhi.secure.kk$c */
    public static final class C2639c extends AbstractSafeParcelable {
        @mr2
        public static final Parcelable.Creator<C2639c> CREATOR = new u75();
        @SafeParcelable.Field(getter = "getRequestJson", mo10053id = 2)

        /* renamed from: b */
        public final String f14940b;
        @SafeParcelable.Field(getter = "isSupported", mo10053id = 1)

        /* renamed from: b */
        public final boolean f14941b;

        /* renamed from: com.onedelhi.secure.kk$c$a */
        public static final class C2640a {

            /* renamed from: a */
            public String f14942a;

            /* renamed from: a */
            public boolean f14943a = false;

            @mr2
            /* renamed from: a */
            public C2639c mo19127a() {
                return new C2639c(this.f14943a, this.f14942a);
            }

            @mr2
            /* renamed from: b */
            public C2640a mo19128b(@mr2 String str) {
                this.f14942a = str;
                return this;
            }

            @mr2
            /* renamed from: c */
            public C2640a mo19129c(boolean z) {
                this.f14943a = z;
                return this;
            }
        }

        @SafeParcelable.Constructor
        public C2639c(@SafeParcelable.Param(mo10056id = 1) boolean z, @SafeParcelable.Param(mo10056id = 2) String str) {
            if (z) {
                Preconditions.checkNotNull(str);
            }
            this.f14941b = z;
            this.f14940b = str;
        }

        @mr2
        /* renamed from: K2 */
        public static C2640a m19855K2() {
            return new C2640a();
        }

        @mr2
        /* renamed from: L2 */
        public String mo19122L2() {
            return this.f14940b;
        }

        /* renamed from: M2 */
        public boolean mo19123M2() {
            return this.f14941b;
        }

        public boolean equals(@ts2 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2639c)) {
                return false;
            }
            C2639c cVar = (C2639c) obj;
            return this.f14941b == cVar.f14941b && Objects.equal(this.f14940b, cVar.f14940b);
        }

        public int hashCode() {
            return Objects.hashCode(Boolean.valueOf(this.f14941b), this.f14940b);
        }

        public void writeToParcel(@mr2 Parcel parcel, int i) {
            int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeBoolean(parcel, 1, mo19123M2());
            SafeParcelWriter.writeString(parcel, 2, mo19122L2(), false);
            SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        }
    }

    @SafeParcelable.Class(creator = "PasskeysRequestOptionsCreator")
    @Deprecated
    /* renamed from: com.onedelhi.secure.kk$d */
    public static final class C2641d extends AbstractSafeParcelable {
        @mr2
        public static final Parcelable.Creator<C2641d> CREATOR = new x75();
        @SafeParcelable.Field(getter = "getChallenge", mo10053id = 2)

        /* renamed from: a */
        public final byte[] f14944a;
        @SafeParcelable.Field(getter = "getRpId", mo10053id = 3)

        /* renamed from: b */
        public final String f14945b;
        @SafeParcelable.Field(getter = "isSupported", mo10053id = 1)

        /* renamed from: b */
        public final boolean f14946b;

        /* renamed from: com.onedelhi.secure.kk$d$a */
        public static final class C2642a {

            /* renamed from: a */
            public String f14947a;

            /* renamed from: a */
            public boolean f14948a = false;

            /* renamed from: a */
            public byte[] f14949a;

            @mr2
            /* renamed from: a */
            public C2641d mo19136a() {
                return new C2641d(this.f14948a, this.f14949a, this.f14947a);
            }

            @mr2
            /* renamed from: b */
            public C2642a mo19137b(@mr2 byte[] bArr) {
                this.f14949a = bArr;
                return this;
            }

            @mr2
            /* renamed from: c */
            public C2642a mo19138c(@mr2 String str) {
                this.f14947a = str;
                return this;
            }

            @mr2
            /* renamed from: d */
            public C2642a mo19139d(boolean z) {
                this.f14948a = z;
                return this;
            }
        }

        @SafeParcelable.Constructor
        public C2641d(@SafeParcelable.Param(mo10056id = 1) boolean z, @SafeParcelable.Param(mo10056id = 2) byte[] bArr, @SafeParcelable.Param(mo10056id = 3) String str) {
            if (z) {
                Preconditions.checkNotNull(bArr);
                Preconditions.checkNotNull(str);
            }
            this.f14946b = z;
            this.f14944a = bArr;
            this.f14945b = str;
        }

        @mr2
        /* renamed from: K2 */
        public static C2642a m19861K2() {
            return new C2642a();
        }

        @mr2
        /* renamed from: L2 */
        public byte[] mo19130L2() {
            return this.f14944a;
        }

        @mr2
        /* renamed from: M2 */
        public String mo19131M2() {
            return this.f14945b;
        }

        /* renamed from: N2 */
        public boolean mo19132N2() {
            return this.f14946b;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
            r1 = r4.f14945b;
            r5 = r5.f14945b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(@com.onedelhi.secure.ts2 java.lang.Object r5) {
            /*
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L_0x0004
                return r0
            L_0x0004:
                boolean r1 = r5 instanceof com.onedelhi.secure.C2635kk.C2641d
                r2 = 0
                if (r1 != 0) goto L_0x000a
                return r2
            L_0x000a:
                com.onedelhi.secure.kk$d r5 = (com.onedelhi.secure.C2635kk.C2641d) r5
                boolean r1 = r4.f14946b
                boolean r3 = r5.f14946b
                if (r1 != r3) goto L_0x002b
                byte[] r1 = r4.f14944a
                byte[] r3 = r5.f14944a
                boolean r1 = java.util.Arrays.equals(r1, r3)
                if (r1 == 0) goto L_0x002b
                java.lang.String r1 = r4.f14945b
                java.lang.String r5 = r5.f14945b
                if (r1 == r5) goto L_0x002a
                if (r1 == 0) goto L_0x002b
                boolean r5 = r1.equals(r5)
                if (r5 == 0) goto L_0x002b
            L_0x002a:
                return r0
            L_0x002b:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C2635kk.C2641d.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            return (Arrays.hashCode(new Object[]{Boolean.valueOf(this.f14946b), this.f14945b}) * 31) + Arrays.hashCode(this.f14944a);
        }

        public void writeToParcel(@mr2 Parcel parcel, int i) {
            int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeBoolean(parcel, 1, mo19132N2());
            SafeParcelWriter.writeByteArray(parcel, 2, mo19130L2(), false);
            SafeParcelWriter.writeString(parcel, 3, mo19131M2(), false);
            SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        }
    }

    @SafeParcelable.Class(creator = "PasswordRequestOptionsCreator")
    /* renamed from: com.onedelhi.secure.kk$e */
    public static final class C2643e extends AbstractSafeParcelable {
        @mr2
        public static final Parcelable.Creator<C2643e> CREATOR = new a85();
        @SafeParcelable.Field(getter = "isSupported", mo10053id = 1)

        /* renamed from: b */
        public final boolean f14950b;

        /* renamed from: com.onedelhi.secure.kk$e$a */
        public static final class C2644a {

            /* renamed from: a */
            public boolean f14951a = false;

            @mr2
            /* renamed from: a */
            public C2643e mo19144a() {
                return new C2643e(this.f14951a);
            }

            @mr2
            /* renamed from: b */
            public C2644a mo19145b(boolean z) {
                this.f14951a = z;
                return this;
            }
        }

        @SafeParcelable.Constructor
        public C2643e(@SafeParcelable.Param(mo10056id = 1) boolean z) {
            this.f14950b = z;
        }

        @mr2
        /* renamed from: K2 */
        public static C2644a m19869K2() {
            return new C2644a();
        }

        /* renamed from: L2 */
        public boolean mo19140L2() {
            return this.f14950b;
        }

        public boolean equals(@ts2 Object obj) {
            return (obj instanceof C2643e) && this.f14950b == ((C2643e) obj).f14950b;
        }

        public int hashCode() {
            return Objects.hashCode(Boolean.valueOf(this.f14950b));
        }

        public void writeToParcel(@mr2 Parcel parcel, int i) {
            int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeBoolean(parcel, 1, mo19140L2());
            SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        }
    }

    @SafeParcelable.Constructor
    public C2635kk(@SafeParcelable.Param(mo10056id = 1) C2643e eVar, @SafeParcelable.Param(mo10056id = 2) C2637b bVar, @SafeParcelable.Param(mo10056id = 3) @ts2 String str, @SafeParcelable.Param(mo10056id = 4) boolean z, @SafeParcelable.Param(mo10056id = 5) int i, @SafeParcelable.Param(mo10056id = 6) @ts2 C2641d dVar, @SafeParcelable.Param(mo10056id = 7) @ts2 C2639c cVar) {
        this.f14915a = (C2643e) Preconditions.checkNotNull(eVar);
        this.f14912a = (C2637b) Preconditions.checkNotNull(bVar);
        this.f14916b = str;
        this.f14917b = z;
        this.f14918n = i;
        if (dVar == null) {
            C2641d.C2642a K2 = C2641d.m19861K2();
            K2.mo19139d(false);
            dVar = K2.mo19136a();
        }
        this.f14914a = dVar;
        if (cVar == null) {
            C2639c.C2640a K22 = C2639c.m19855K2();
            K22.mo19129c(false);
            cVar = K22.mo19127a();
        }
        this.f14913a = cVar;
    }

    @mr2
    /* renamed from: K2 */
    public static C2636a m19825K2() {
        return new C2636a();
    }

    @mr2
    /* renamed from: Q2 */
    public static C2636a m19826Q2(@mr2 C2635kk kkVar) {
        Preconditions.checkNotNull(kkVar);
        C2636a K2 = m19825K2();
        K2.mo19099c(kkVar.mo19089L2());
        K2.mo19102f(kkVar.mo19092O2());
        K2.mo19101e(kkVar.mo19091N2());
        K2.mo19100d(kkVar.mo19090M2());
        K2.mo19098b(kkVar.f14917b);
        K2.mo19104h(kkVar.f14918n);
        String str = kkVar.f14916b;
        if (str != null) {
            K2.mo19103g(str);
        }
        return K2;
    }

    @mr2
    /* renamed from: L2 */
    public C2637b mo19089L2() {
        return this.f14912a;
    }

    @mr2
    /* renamed from: M2 */
    public C2639c mo19090M2() {
        return this.f14913a;
    }

    @mr2
    /* renamed from: N2 */
    public C2641d mo19091N2() {
        return this.f14914a;
    }

    @mr2
    /* renamed from: O2 */
    public C2643e mo19092O2() {
        return this.f14915a;
    }

    /* renamed from: P2 */
    public boolean mo19093P2() {
        return this.f14917b;
    }

    public boolean equals(@ts2 Object obj) {
        if (!(obj instanceof C2635kk)) {
            return false;
        }
        C2635kk kkVar = (C2635kk) obj;
        return Objects.equal(this.f14915a, kkVar.f14915a) && Objects.equal(this.f14912a, kkVar.f14912a) && Objects.equal(this.f14914a, kkVar.f14914a) && Objects.equal(this.f14913a, kkVar.f14913a) && Objects.equal(this.f14916b, kkVar.f14916b) && this.f14917b == kkVar.f14917b && this.f14918n == kkVar.f14918n;
    }

    public int hashCode() {
        return Objects.hashCode(this.f14915a, this.f14912a, this.f14914a, this.f14913a, this.f14916b, Boolean.valueOf(this.f14917b));
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, mo19092O2(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 2, mo19089L2(), i, false);
        SafeParcelWriter.writeString(parcel, 3, this.f14916b, false);
        SafeParcelWriter.writeBoolean(parcel, 4, mo19093P2());
        SafeParcelWriter.writeInt(parcel, 5, this.f14918n);
        SafeParcelWriter.writeParcelable(parcel, 6, mo19091N2(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 7, mo19090M2(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
