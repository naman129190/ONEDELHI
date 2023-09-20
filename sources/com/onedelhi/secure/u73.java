package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import java.util.Arrays;
import java.util.List;

@SafeParcelable.Class(creator = "PublicKeyCredentialRequestOptionsCreator")
@SafeParcelable.Reserved({1})
public class u73 extends lj3 {
    @mr2
    public static final Parcelable.Creator<u73> CREATOR = new mh5();
    @SafeParcelable.Field(getter = "getTokenBinding", mo10053id = 7)
    @ts2

    /* renamed from: a */
    public final jf4 f21229a;
    @SafeParcelable.Field(getter = "getUserVerificationAsString", mo10053id = 8, type = "java.lang.String")
    @ts2

    /* renamed from: a */
    public final ok5 f21230a;
    @SafeParcelable.Field(getter = "getAuthenticationExtensions", mo10053id = 9)
    @ts2

    /* renamed from: a */
    public final C3495sc f21231a;
    @SafeParcelable.Field(getter = "getTimeoutSeconds", mo10053id = 3)
    @ts2

    /* renamed from: a */
    public final Double f21232a;
    @SafeParcelable.Field(getter = "getRequestId", mo10053id = 6)
    @ts2

    /* renamed from: a */
    public final Integer f21233a;
    @SafeParcelable.Field(getter = "getLongRequestId", mo10053id = 10)
    @ts2

    /* renamed from: a */
    public final Long f21234a;
    @SafeParcelable.Field(getter = "getAllowList", mo10053id = 5)
    @ts2

    /* renamed from: a */
    public final List f21235a;
    @SafeParcelable.Field(getter = "getChallenge", mo10053id = 2)
    @mr2

    /* renamed from: a */
    public final byte[] f21236a;
    @SafeParcelable.Field(getter = "getRpId", mo10053id = 4)
    @mr2

    /* renamed from: b */
    public final String f21237b;

    /* renamed from: com.onedelhi.secure.u73$a */
    public static final class C3670a {

        /* renamed from: a */
        public jf4 f21238a;

        /* renamed from: a */
        public ok5 f21239a;

        /* renamed from: a */
        public C3495sc f21240a;

        /* renamed from: a */
        public Double f21241a;

        /* renamed from: a */
        public Integer f21242a;

        /* renamed from: a */
        public String f21243a;

        /* renamed from: a */
        public List f21244a;

        /* renamed from: a */
        public byte[] f21245a;

        public C3670a() {
        }

        public C3670a(@ts2 u73 u73) {
            if (u73 != null) {
                this.f21245a = u73.mo17873L2();
                this.f21241a = u73.mo17875N2();
                this.f21243a = u73.mo25394S2();
                this.f21244a = u73.mo25393R2();
                this.f21242a = u73.mo17874M2();
                this.f21238a = u73.mo17876O2();
                this.f21239a = u73.mo25395T2();
                this.f21240a = u73.mo17872K2();
            }
        }

        @mr2
        /* renamed from: a */
        public u73 mo25399a() {
            byte[] bArr = this.f21245a;
            Double d = this.f21241a;
            String str = this.f21243a;
            List list = this.f21244a;
            Integer num = this.f21242a;
            jf4 jf4 = this.f21238a;
            ok5 ok5 = this.f21239a;
            return new u73(bArr, d, str, list, num, jf4, ok5 == null ? null : ok5.toString(), this.f21240a, (Long) null);
        }

        @mr2
        /* renamed from: b */
        public C3670a mo25400b(@ts2 List<s73> list) {
            this.f21244a = list;
            return this;
        }

        @mr2
        /* renamed from: c */
        public C3670a mo25401c(@ts2 C3495sc scVar) {
            this.f21240a = scVar;
            return this;
        }

        @mr2
        /* renamed from: d */
        public C3670a mo25402d(@mr2 byte[] bArr) {
            this.f21245a = (byte[]) Preconditions.checkNotNull(bArr);
            return this;
        }

        @mr2
        /* renamed from: e */
        public C3670a mo25403e(@ts2 Integer num) {
            this.f21242a = num;
            return this;
        }

        @mr2
        /* renamed from: f */
        public C3670a mo25404f(@mr2 String str) {
            this.f21243a = (String) Preconditions.checkNotNull(str);
            return this;
        }

        @mr2
        /* renamed from: g */
        public C3670a mo25405g(@ts2 Double d) {
            this.f21241a = d;
            return this;
        }

        @mr2
        /* renamed from: h */
        public C3670a mo25406h(@ts2 jf4 jf4) {
            this.f21238a = jf4;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public u73(@SafeParcelable.Param(mo10056id = 2) @mr2 byte[] bArr, @SafeParcelable.Param(mo10056id = 3) @ts2 Double d, @SafeParcelable.Param(mo10056id = 4) @mr2 String str, @SafeParcelable.Param(mo10056id = 5) @ts2 List list, @SafeParcelable.Param(mo10056id = 6) @ts2 Integer num, @SafeParcelable.Param(mo10056id = 7) @ts2 jf4 jf4, @SafeParcelable.Param(mo10056id = 8) @ts2 String str2, @SafeParcelable.Param(mo10056id = 9) @ts2 C3495sc scVar, @SafeParcelable.Param(mo10056id = 10) @ts2 Long l) {
        this.f21236a = (byte[]) Preconditions.checkNotNull(bArr);
        this.f21232a = d;
        this.f21237b = (String) Preconditions.checkNotNull(str);
        this.f21235a = list;
        this.f21233a = num;
        this.f21229a = jf4;
        this.f21234a = l;
        if (str2 != null) {
            try {
                this.f21230a = ok5.m23862a(str2);
            } catch (gk5 e) {
                throw new IllegalArgumentException(e);
            }
        } else {
            this.f21230a = null;
        }
        this.f21231a = scVar;
    }

    @mr2
    /* renamed from: Q2 */
    public static u73 m29112Q2(@ts2 byte[] bArr) {
        return (u73) SafeParcelableSerializer.deserializeFromBytes(bArr, CREATOR);
    }

    @ts2
    /* renamed from: K2 */
    public C3495sc mo17872K2() {
        return this.f21231a;
    }

    @mr2
    /* renamed from: L2 */
    public byte[] mo17873L2() {
        return this.f21236a;
    }

    @ts2
    /* renamed from: M2 */
    public Integer mo17874M2() {
        return this.f21233a;
    }

    @ts2
    /* renamed from: N2 */
    public Double mo17875N2() {
        return this.f21232a;
    }

    @ts2
    /* renamed from: O2 */
    public jf4 mo17876O2() {
        return this.f21229a;
    }

    @mr2
    /* renamed from: P2 */
    public byte[] mo17877P2() {
        return SafeParcelableSerializer.serializeToBytes(this);
    }

    @ts2
    /* renamed from: R2 */
    public List<s73> mo25393R2() {
        return this.f21235a;
    }

    @mr2
    /* renamed from: S2 */
    public String mo25394S2() {
        return this.f21237b;
    }

    @ts2
    /* renamed from: T2 */
    public final ok5 mo25395T2() {
        return this.f21230a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        r2 = r4.f21235a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        r0 = r3.f21235a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(@com.onedelhi.secure.mr2 java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof com.onedelhi.secure.u73
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            com.onedelhi.secure.u73 r4 = (com.onedelhi.secure.u73) r4
            byte[] r0 = r3.f21236a
            byte[] r2 = r4.f21236a
            boolean r0 = java.util.Arrays.equals(r0, r2)
            if (r0 == 0) goto L_0x0078
            java.lang.Double r0 = r3.f21232a
            java.lang.Double r2 = r4.f21232a
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L_0x0078
            java.lang.String r0 = r3.f21237b
            java.lang.String r2 = r4.f21237b
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L_0x0078
            java.util.List r0 = r3.f21235a
            if (r0 != 0) goto L_0x002e
            java.util.List r2 = r4.f21235a
            if (r2 == 0) goto L_0x0044
        L_0x002e:
            if (r0 == 0) goto L_0x0078
            java.util.List r2 = r4.f21235a
            if (r2 == 0) goto L_0x0078
            boolean r0 = r0.containsAll(r2)
            if (r0 == 0) goto L_0x0078
            java.util.List r0 = r4.f21235a
            java.util.List r2 = r3.f21235a
            boolean r0 = r0.containsAll(r2)
            if (r0 == 0) goto L_0x0078
        L_0x0044:
            java.lang.Integer r0 = r3.f21233a
            java.lang.Integer r2 = r4.f21233a
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L_0x0078
            com.onedelhi.secure.jf4 r0 = r3.f21229a
            com.onedelhi.secure.jf4 r2 = r4.f21229a
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L_0x0078
            com.onedelhi.secure.ok5 r0 = r3.f21230a
            com.onedelhi.secure.ok5 r2 = r4.f21230a
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L_0x0078
            com.onedelhi.secure.sc r0 = r3.f21231a
            com.onedelhi.secure.sc r2 = r4.f21231a
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L_0x0078
            java.lang.Long r0 = r3.f21234a
            java.lang.Long r4 = r4.f21234a
            boolean r4 = com.google.android.gms.common.internal.Objects.equal(r0, r4)
            if (r4 == 0) goto L_0x0078
            r4 = 1
            return r4
        L_0x0078:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.u73.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(Arrays.hashCode(this.f21236a)), this.f21232a, this.f21237b, this.f21235a, this.f21233a, this.f21229a, this.f21230a, this.f21231a, this.f21234a);
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 2, mo17873L2(), false);
        SafeParcelWriter.writeDoubleObject(parcel, 3, mo17875N2(), false);
        SafeParcelWriter.writeString(parcel, 4, mo25394S2(), false);
        SafeParcelWriter.writeTypedList(parcel, 5, mo25393R2(), false);
        SafeParcelWriter.writeIntegerObject(parcel, 6, mo17874M2(), false);
        SafeParcelWriter.writeParcelable(parcel, 7, mo17876O2(), i, false);
        ok5 ok5 = this.f21230a;
        SafeParcelWriter.writeString(parcel, 8, ok5 == null ? null : ok5.toString(), false);
        SafeParcelWriter.writeParcelable(parcel, 9, mo17872K2(), i, false);
        SafeParcelWriter.writeLongObject(parcel, 10, this.f21234a, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
