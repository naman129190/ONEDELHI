package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.onedelhi.secure.C3914xb;
import java.util.Arrays;
import java.util.List;

@SafeParcelable.Class(creator = "PublicKeyCredentialCreationOptionsCreator")
@SafeParcelable.Reserved({1})
public class r73 extends lj3 {
    @mr2
    public static final Parcelable.Creator<r73> CREATOR = new eg5();
    @SafeParcelable.Field(getter = "getAuthenticatorSelection", mo10053id = 8)
    @ts2

    /* renamed from: a */
    public final C2054ed f19650a;
    @SafeParcelable.Field(getter = "getTokenBinding", mo10053id = 10)
    @ts2

    /* renamed from: a */
    public final jf4 f19651a;
    @SafeParcelable.Field(getter = "getAuthenticationExtensions", mo10053id = 12)
    @ts2

    /* renamed from: a */
    public final C3495sc f19652a;
    @SafeParcelable.Field(getter = "getRp", mo10053id = 2)
    @mr2

    /* renamed from: a */
    public final v73 f19653a;
    @SafeParcelable.Field(getter = "getUser", mo10053id = 3)
    @mr2

    /* renamed from: a */
    public final x73 f19654a;
    @SafeParcelable.Field(getter = "getAttestationConveyancePreferenceAsString", mo10053id = 11, type = "java.lang.String")
    @ts2

    /* renamed from: a */
    public final C3914xb f19655a;
    @SafeParcelable.Field(getter = "getTimeoutSeconds", mo10053id = 6)
    @ts2

    /* renamed from: a */
    public final Double f19656a;
    @SafeParcelable.Field(getter = "getRequestId", mo10053id = 9)
    @ts2

    /* renamed from: a */
    public final Integer f19657a;
    @SafeParcelable.Field(getter = "getParameters", mo10053id = 5)
    @mr2

    /* renamed from: a */
    public final List f19658a;
    @SafeParcelable.Field(getter = "getChallenge", mo10053id = 4)
    @mr2

    /* renamed from: a */
    public final byte[] f19659a;
    @SafeParcelable.Field(getter = "getExcludeList", mo10053id = 7)
    @ts2

    /* renamed from: b */
    public final List f19660b;

    /* renamed from: com.onedelhi.secure.r73$a */
    public static final class C3379a {

        /* renamed from: a */
        public C2054ed f19661a;

        /* renamed from: a */
        public jf4 f19662a;

        /* renamed from: a */
        public C3495sc f19663a;

        /* renamed from: a */
        public v73 f19664a;

        /* renamed from: a */
        public x73 f19665a;

        /* renamed from: a */
        public C3914xb f19666a;

        /* renamed from: a */
        public Double f19667a;

        /* renamed from: a */
        public Integer f19668a;

        /* renamed from: a */
        public List f19669a;

        /* renamed from: a */
        public byte[] f19670a;

        /* renamed from: b */
        public List f19671b;

        @mr2
        /* renamed from: a */
        public r73 mo23685a() {
            v73 v73 = this.f19664a;
            x73 x73 = this.f19665a;
            byte[] bArr = this.f19670a;
            List list = this.f19669a;
            Double d = this.f19667a;
            List list2 = this.f19671b;
            C2054ed edVar = this.f19661a;
            Integer num = this.f19668a;
            jf4 jf4 = this.f19662a;
            C3914xb xbVar = this.f19666a;
            return new r73(v73, x73, bArr, list, d, list2, edVar, num, jf4, xbVar == null ? null : xbVar.toString(), this.f19663a);
        }

        @mr2
        /* renamed from: b */
        public C3379a mo23686b(@ts2 C3914xb xbVar) {
            this.f19666a = xbVar;
            return this;
        }

        @mr2
        /* renamed from: c */
        public C3379a mo23687c(@ts2 C3495sc scVar) {
            this.f19663a = scVar;
            return this;
        }

        @mr2
        /* renamed from: d */
        public C3379a mo23688d(@ts2 C2054ed edVar) {
            this.f19661a = edVar;
            return this;
        }

        @mr2
        /* renamed from: e */
        public C3379a mo23689e(@mr2 byte[] bArr) {
            this.f19670a = (byte[]) Preconditions.checkNotNull(bArr);
            return this;
        }

        @mr2
        /* renamed from: f */
        public C3379a mo23690f(@ts2 List<s73> list) {
            this.f19671b = list;
            return this;
        }

        @mr2
        /* renamed from: g */
        public C3379a mo23691g(@mr2 List<t73> list) {
            this.f19669a = (List) Preconditions.checkNotNull(list);
            return this;
        }

        @mr2
        /* renamed from: h */
        public C3379a mo23692h(@ts2 Integer num) {
            this.f19668a = num;
            return this;
        }

        @mr2
        /* renamed from: i */
        public C3379a mo23693i(@mr2 v73 v73) {
            this.f19664a = (v73) Preconditions.checkNotNull(v73);
            return this;
        }

        @mr2
        /* renamed from: j */
        public C3379a mo23694j(@ts2 Double d) {
            this.f19667a = d;
            return this;
        }

        @mr2
        /* renamed from: k */
        public C3379a mo23695k(@ts2 jf4 jf4) {
            this.f19662a = jf4;
            return this;
        }

        @mr2
        /* renamed from: l */
        public C3379a mo23696l(@mr2 x73 x73) {
            this.f19665a = (x73) Preconditions.checkNotNull(x73);
            return this;
        }
    }

    @SafeParcelable.Constructor
    public r73(@SafeParcelable.Param(mo10056id = 2) @mr2 v73 v73, @SafeParcelable.Param(mo10056id = 3) @mr2 x73 x73, @SafeParcelable.Param(mo10056id = 4) @mr2 byte[] bArr, @SafeParcelable.Param(mo10056id = 5) @mr2 List list, @SafeParcelable.Param(mo10056id = 6) @ts2 Double d, @SafeParcelable.Param(mo10056id = 7) @ts2 List list2, @SafeParcelable.Param(mo10056id = 8) @ts2 C2054ed edVar, @SafeParcelable.Param(mo10056id = 9) @ts2 Integer num, @SafeParcelable.Param(mo10056id = 10) @ts2 jf4 jf4, @SafeParcelable.Param(mo10056id = 11) @ts2 String str, @SafeParcelable.Param(mo10056id = 12) @ts2 C3495sc scVar) {
        this.f19653a = (v73) Preconditions.checkNotNull(v73);
        this.f19654a = (x73) Preconditions.checkNotNull(x73);
        this.f19659a = (byte[]) Preconditions.checkNotNull(bArr);
        this.f19658a = (List) Preconditions.checkNotNull(list);
        this.f19656a = d;
        this.f19660b = list2;
        this.f19650a = edVar;
        this.f19657a = num;
        this.f19651a = jf4;
        if (str != null) {
            try {
                this.f19655a = C3914xb.m31388a(str);
            } catch (C3914xb.C3915a e) {
                throw new IllegalArgumentException(e);
            }
        } else {
            this.f19655a = null;
        }
        this.f19652a = scVar;
    }

    @mr2
    /* renamed from: Q2 */
    public static r73 m26448Q2(@mr2 byte[] bArr) {
        return (r73) SafeParcelableSerializer.deserializeFromBytes(bArr, CREATOR);
    }

    @ts2
    /* renamed from: K2 */
    public C3495sc mo17872K2() {
        return this.f19652a;
    }

    @mr2
    /* renamed from: L2 */
    public byte[] mo17873L2() {
        return this.f19659a;
    }

    @ts2
    /* renamed from: M2 */
    public Integer mo17874M2() {
        return this.f19657a;
    }

    @ts2
    /* renamed from: N2 */
    public Double mo17875N2() {
        return this.f19656a;
    }

    @ts2
    /* renamed from: O2 */
    public jf4 mo17876O2() {
        return this.f19651a;
    }

    @mr2
    /* renamed from: P2 */
    public byte[] mo17877P2() {
        return SafeParcelableSerializer.serializeToBytes(this);
    }

    @ts2
    /* renamed from: R2 */
    public C3914xb mo23675R2() {
        return this.f19655a;
    }

    @ts2
    /* renamed from: S2 */
    public String mo23676S2() {
        C3914xb xbVar = this.f19655a;
        if (xbVar == null) {
            return null;
        }
        return xbVar.toString();
    }

    @ts2
    /* renamed from: T2 */
    public C2054ed mo23677T2() {
        return this.f19650a;
    }

    @ts2
    /* renamed from: U2 */
    public List<s73> mo23678U2() {
        return this.f19660b;
    }

    @mr2
    /* renamed from: V2 */
    public List<t73> mo23679V2() {
        return this.f19658a;
    }

    @mr2
    /* renamed from: W2 */
    public v73 mo23680W2() {
        return this.f19653a;
    }

    @mr2
    /* renamed from: X2 */
    public x73 mo23681X2() {
        return this.f19654a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0044, code lost:
        r0 = r3.f19660b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004e, code lost:
        r2 = r4.f19660b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(@com.onedelhi.secure.mr2 java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof com.onedelhi.secure.r73
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            com.onedelhi.secure.r73 r4 = (com.onedelhi.secure.r73) r4
            com.onedelhi.secure.v73 r0 = r3.f19653a
            com.onedelhi.secure.v73 r2 = r4.f19653a
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L_0x0096
            com.onedelhi.secure.x73 r0 = r3.f19654a
            com.onedelhi.secure.x73 r2 = r4.f19654a
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L_0x0096
            byte[] r0 = r3.f19659a
            byte[] r2 = r4.f19659a
            boolean r0 = java.util.Arrays.equals(r0, r2)
            if (r0 == 0) goto L_0x0096
            java.lang.Double r0 = r3.f19656a
            java.lang.Double r2 = r4.f19656a
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L_0x0096
            java.util.List r0 = r3.f19658a
            java.util.List r2 = r4.f19658a
            boolean r0 = r0.containsAll(r2)
            if (r0 == 0) goto L_0x0096
            java.util.List r0 = r4.f19658a
            java.util.List r2 = r3.f19658a
            boolean r0 = r0.containsAll(r2)
            if (r0 == 0) goto L_0x0096
            java.util.List r0 = r3.f19660b
            if (r0 != 0) goto L_0x004c
            java.util.List r2 = r4.f19660b
            if (r2 == 0) goto L_0x0062
        L_0x004c:
            if (r0 == 0) goto L_0x0096
            java.util.List r2 = r4.f19660b
            if (r2 == 0) goto L_0x0096
            boolean r0 = r0.containsAll(r2)
            if (r0 == 0) goto L_0x0096
            java.util.List r0 = r4.f19660b
            java.util.List r2 = r3.f19660b
            boolean r0 = r0.containsAll(r2)
            if (r0 == 0) goto L_0x0096
        L_0x0062:
            com.onedelhi.secure.ed r0 = r3.f19650a
            com.onedelhi.secure.ed r2 = r4.f19650a
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L_0x0096
            java.lang.Integer r0 = r3.f19657a
            java.lang.Integer r2 = r4.f19657a
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L_0x0096
            com.onedelhi.secure.jf4 r0 = r3.f19651a
            com.onedelhi.secure.jf4 r2 = r4.f19651a
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L_0x0096
            com.onedelhi.secure.xb r0 = r3.f19655a
            com.onedelhi.secure.xb r2 = r4.f19655a
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L_0x0096
            com.onedelhi.secure.sc r0 = r3.f19652a
            com.onedelhi.secure.sc r4 = r4.f19652a
            boolean r4 = com.google.android.gms.common.internal.Objects.equal(r0, r4)
            if (r4 == 0) goto L_0x0096
            r4 = 1
            return r4
        L_0x0096:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.r73.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return Objects.hashCode(this.f19653a, this.f19654a, Integer.valueOf(Arrays.hashCode(this.f19659a)), this.f19658a, this.f19656a, this.f19660b, this.f19650a, this.f19657a, this.f19651a, this.f19655a, this.f19652a);
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, mo23680W2(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, mo23681X2(), i, false);
        SafeParcelWriter.writeByteArray(parcel, 4, mo17873L2(), false);
        SafeParcelWriter.writeTypedList(parcel, 5, mo23679V2(), false);
        SafeParcelWriter.writeDoubleObject(parcel, 6, mo17875N2(), false);
        SafeParcelWriter.writeTypedList(parcel, 7, mo23678U2(), false);
        SafeParcelWriter.writeParcelable(parcel, 8, mo23677T2(), i, false);
        SafeParcelWriter.writeIntegerObject(parcel, 9, mo17874M2(), false);
        SafeParcelWriter.writeParcelable(parcel, 10, mo17876O2(), i, false);
        SafeParcelWriter.writeString(parcel, 11, mo23676S2(), false);
        SafeParcelWriter.writeParcelable(parcel, 12, mo17872K2(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
