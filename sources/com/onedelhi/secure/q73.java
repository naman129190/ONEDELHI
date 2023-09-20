package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import java.util.Arrays;

@SafeParcelable.Class(creator = "PublicKeyCredentialCreator")
public class q73 extends AbstractSafeParcelable {
    @mr2
    public static final Parcelable.Creator<q73> CREATOR = new ng5();
    @SafeParcelable.Field(getter = "getSignResponse", mo10053id = 5)
    @ts2

    /* renamed from: a */
    public final C1690ad f18925a;
    @SafeParcelable.Field(getter = "getRegisterResponse", mo10053id = 4)
    @ts2

    /* renamed from: a */
    public final C1781bd f18926a;
    @SafeParcelable.Field(getter = "getErrorResponse", mo10053id = 6)
    @ts2

    /* renamed from: a */
    public final C1893cd f18927a;
    @SafeParcelable.Field(getter = "getClientExtensionResults", mo10053id = 7)
    @ts2

    /* renamed from: a */
    public final C3593tc f18928a;
    @SafeParcelable.Field(getter = "getRawId", mo10053id = 3)
    @mr2

    /* renamed from: a */
    public final byte[] f18929a;
    @SafeParcelable.Field(getter = "getId", mo10053id = 1)
    @mr2

    /* renamed from: b */
    public final String f18930b;
    @SafeParcelable.Field(getter = "getType", mo10053id = 2)
    @mr2

    /* renamed from: c */
    public final String f18931c;
    @SafeParcelable.Field(getter = "getAuthenticatorAttachment", mo10053id = 8)
    @ts2

    /* renamed from: d */
    public final String f18932d;

    /* renamed from: com.onedelhi.secure.q73$a */
    public static class C3242a {

        /* renamed from: a */
        public C1967dd f18933a;

        /* renamed from: a */
        public C3593tc f18934a;

        /* renamed from: a */
        public String f18935a;

        /* renamed from: a */
        public byte[] f18936a;

        /* renamed from: b */
        public String f18937b;

        @mr2
        /* renamed from: a */
        public q73 mo22918a() {
            C1967dd ddVar = this.f18933a;
            C1893cd cdVar = null;
            C1781bd bdVar = ddVar instanceof C1781bd ? (C1781bd) ddVar : null;
            C1690ad adVar = ddVar instanceof C1690ad ? (C1690ad) ddVar : null;
            if (ddVar instanceof C1893cd) {
                cdVar = (C1893cd) ddVar;
            }
            return new q73(this.f18935a, w73.PUBLIC_KEY.toString(), this.f18936a, bdVar, adVar, cdVar, this.f18934a, this.f18937b);
        }

        @mr2
        /* renamed from: b */
        public C3242a mo22919b(@ts2 C3593tc tcVar) {
            this.f18934a = tcVar;
            return this;
        }

        @mr2
        /* renamed from: c */
        public C3242a mo22920c(@mr2 String str) {
            this.f18937b = str;
            return this;
        }

        @mr2
        /* renamed from: d */
        public C3242a mo22921d(@mr2 String str) {
            this.f18935a = str;
            return this;
        }

        @mr2
        /* renamed from: e */
        public C3242a mo22922e(@mr2 byte[] bArr) {
            this.f18936a = bArr;
            return this;
        }

        @mr2
        /* renamed from: f */
        public C3242a mo22923f(@mr2 C1967dd ddVar) {
            this.f18933a = ddVar;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public q73(@SafeParcelable.Param(mo10056id = 1) @mr2 String str, @SafeParcelable.Param(mo10056id = 2) @mr2 String str2, @SafeParcelable.Param(mo10056id = 3) @mr2 byte[] bArr, @SafeParcelable.Param(mo10056id = 4) @ts2 C1781bd bdVar, @SafeParcelable.Param(mo10056id = 5) @ts2 C1690ad adVar, @SafeParcelable.Param(mo10056id = 6) @ts2 C1893cd cdVar, @SafeParcelable.Param(mo10056id = 7) @ts2 C3593tc tcVar, @SafeParcelable.Param(mo10056id = 8) @ts2 String str3) {
        boolean z = true;
        if (!((bdVar != null && adVar == null && cdVar == null) || ((bdVar == null && adVar != null && cdVar == null) || (bdVar == null && adVar == null && cdVar != null)))) {
            z = false;
        }
        Preconditions.checkArgument(z);
        this.f18930b = str;
        this.f18931c = str2;
        this.f18929a = bArr;
        this.f18926a = bdVar;
        this.f18925a = adVar;
        this.f18927a = cdVar;
        this.f18928a = tcVar;
        this.f18932d = str3;
    }

    @mr2
    /* renamed from: K2 */
    public static q73 m25419K2(@mr2 byte[] bArr) {
        return (q73) SafeParcelableSerializer.deserializeFromBytes(bArr, CREATOR);
    }

    @ts2
    /* renamed from: L2 */
    public String mo22908L2() {
        return this.f18932d;
    }

    @ts2
    /* renamed from: M2 */
    public C3593tc mo22909M2() {
        return this.f18928a;
    }

    @mr2
    /* renamed from: N2 */
    public String mo22910N2() {
        return this.f18930b;
    }

    @mr2
    /* renamed from: O2 */
    public byte[] mo22911O2() {
        return this.f18929a;
    }

    @mr2
    /* renamed from: P2 */
    public C1967dd mo22912P2() {
        C1781bd bdVar = this.f18926a;
        if (bdVar != null) {
            return bdVar;
        }
        C1690ad adVar = this.f18925a;
        if (adVar != null) {
            return adVar;
        }
        C1893cd cdVar = this.f18927a;
        if (cdVar != null) {
            return cdVar;
        }
        throw new IllegalStateException("No response set.");
    }

    @mr2
    /* renamed from: Q2 */
    public String mo22913Q2() {
        return this.f18931c;
    }

    @mr2
    /* renamed from: R2 */
    public byte[] mo22914R2() {
        return SafeParcelableSerializer.serializeToBytes(this);
    }

    public boolean equals(@ts2 Object obj) {
        if (!(obj instanceof q73)) {
            return false;
        }
        q73 q73 = (q73) obj;
        return Objects.equal(this.f18930b, q73.f18930b) && Objects.equal(this.f18931c, q73.f18931c) && Arrays.equals(this.f18929a, q73.f18929a) && Objects.equal(this.f18926a, q73.f18926a) && Objects.equal(this.f18925a, q73.f18925a) && Objects.equal(this.f18927a, q73.f18927a) && Objects.equal(this.f18928a, q73.f18928a) && Objects.equal(this.f18932d, q73.f18932d);
    }

    public int hashCode() {
        return Objects.hashCode(this.f18930b, this.f18931c, this.f18929a, this.f18925a, this.f18926a, this.f18927a, this.f18928a, this.f18932d);
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, mo22910N2(), false);
        SafeParcelWriter.writeString(parcel, 2, mo22913Q2(), false);
        SafeParcelWriter.writeByteArray(parcel, 3, mo22911O2(), false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f18926a, i, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.f18925a, i, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.f18927a, i, false);
        SafeParcelWriter.writeParcelable(parcel, 7, mo22909M2(), i, false);
        SafeParcelWriter.writeString(parcel, 8, mo22908L2(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
