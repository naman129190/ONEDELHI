package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "GetSignInIntentRequestCreator")
public class gg1 extends AbstractSafeParcelable {
    @mr2
    public static final Parcelable.Creator<gg1> CREATOR = new l75();
    @SafeParcelable.Field(getter = "getServerClientId", mo10053id = 1)

    /* renamed from: b */
    public final String f12559b;
    @SafeParcelable.Field(getter = "requestVerifiedPhoneNumber", mo10053id = 5)

    /* renamed from: b */
    public final boolean f12560b;
    @SafeParcelable.Field(getter = "getHostedDomainFilter", mo10053id = 2)
    @ts2

    /* renamed from: c */
    public final String f12561c;
    @SafeParcelable.Field(getter = "getSessionId", mo10053id = 3)
    @ts2

    /* renamed from: d */
    public final String f12562d;
    @SafeParcelable.Field(getter = "getNonce", mo10053id = 4)
    @ts2

    /* renamed from: e */
    public final String f12563e;
    @SafeParcelable.Field(getter = "getTheme", mo10053id = 6)

    /* renamed from: n */
    public final int f12564n;

    /* renamed from: com.onedelhi.secure.gg1$a */
    public static final class C2245a {

        /* renamed from: a */
        public int f12565a;

        /* renamed from: a */
        public String f12566a;

        /* renamed from: a */
        public boolean f12567a;
        @ts2

        /* renamed from: b */
        public String f12568b;
        @ts2

        /* renamed from: c */
        public String f12569c;
        @ts2

        /* renamed from: d */
        public String f12570d;

        @mr2
        /* renamed from: a */
        public gg1 mo16561a() {
            return new gg1(this.f12566a, this.f12568b, this.f12569c, this.f12570d, this.f12567a, this.f12565a);
        }

        @mr2
        /* renamed from: b */
        public C2245a mo16562b(@ts2 String str) {
            this.f12568b = str;
            return this;
        }

        @mr2
        /* renamed from: c */
        public C2245a mo16563c(@ts2 String str) {
            this.f12570d = str;
            return this;
        }

        @mr2
        @Deprecated
        /* renamed from: d */
        public C2245a mo16564d(boolean z) {
            this.f12567a = z;
            return this;
        }

        @mr2
        /* renamed from: e */
        public C2245a mo16565e(@mr2 String str) {
            Preconditions.checkNotNull(str);
            this.f12566a = str;
            return this;
        }

        @mr2
        /* renamed from: f */
        public final C2245a mo16566f(@ts2 String str) {
            this.f12569c = str;
            return this;
        }

        @mr2
        /* renamed from: g */
        public final C2245a mo16567g(int i) {
            this.f12565a = i;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public gg1(@SafeParcelable.Param(mo10056id = 1) String str, @SafeParcelable.Param(mo10056id = 2) @ts2 String str2, @SafeParcelable.Param(mo10056id = 3) @ts2 String str3, @SafeParcelable.Param(mo10056id = 4) @ts2 String str4, @SafeParcelable.Param(mo10056id = 5) boolean z, @SafeParcelable.Param(mo10056id = 6) int i) {
        Preconditions.checkNotNull(str);
        this.f12559b = str;
        this.f12561c = str2;
        this.f12562d = str3;
        this.f12563e = str4;
        this.f12560b = z;
        this.f12564n = i;
    }

    @mr2
    /* renamed from: K2 */
    public static C2245a m15816K2() {
        return new C2245a();
    }

    @mr2
    /* renamed from: P2 */
    public static C2245a m15817P2(@mr2 gg1 gg1) {
        Preconditions.checkNotNull(gg1);
        C2245a K2 = m15816K2();
        K2.mo16565e(gg1.mo16556N2());
        K2.mo16563c(gg1.mo16555M2());
        K2.mo16562b(gg1.mo16554L2());
        K2.mo16564d(gg1.f12560b);
        K2.mo16567g(gg1.f12564n);
        String str = gg1.f12562d;
        if (str != null) {
            K2.mo16566f(str);
        }
        return K2;
    }

    @ts2
    /* renamed from: L2 */
    public String mo16554L2() {
        return this.f12561c;
    }

    @ts2
    /* renamed from: M2 */
    public String mo16555M2() {
        return this.f12563e;
    }

    @mr2
    /* renamed from: N2 */
    public String mo16556N2() {
        return this.f12559b;
    }

    @Deprecated
    /* renamed from: O2 */
    public boolean mo16557O2() {
        return this.f12560b;
    }

    public boolean equals(@ts2 Object obj) {
        if (!(obj instanceof gg1)) {
            return false;
        }
        gg1 gg1 = (gg1) obj;
        return Objects.equal(this.f12559b, gg1.f12559b) && Objects.equal(this.f12563e, gg1.f12563e) && Objects.equal(this.f12561c, gg1.f12561c) && Objects.equal(Boolean.valueOf(this.f12560b), Boolean.valueOf(gg1.f12560b)) && this.f12564n == gg1.f12564n;
    }

    public int hashCode() {
        return Objects.hashCode(this.f12559b, this.f12561c, this.f12563e, Boolean.valueOf(this.f12560b), Integer.valueOf(this.f12564n));
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, mo16556N2(), false);
        SafeParcelWriter.writeString(parcel, 2, mo16554L2(), false);
        SafeParcelWriter.writeString(parcel, 3, this.f12562d, false);
        SafeParcelWriter.writeString(parcel, 4, mo16555M2(), false);
        SafeParcelWriter.writeBoolean(parcel, 5, mo16557O2());
        SafeParcelWriter.writeInt(parcel, 6, this.f12564n);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
