package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "AuthenticationExtensionsCreator")
@SafeParcelable.Reserved({1})
/* renamed from: com.onedelhi.secure.sc */
public class C3495sc extends AbstractSafeParcelable {
    @mr2
    public static final Parcelable.Creator<C3495sc> CREATOR = new sx5();
    @SafeParcelable.Field(getter = "getGoogleThirdPartyPaymentExtension", mo10053id = 10)
    @ts2

    /* renamed from: a */
    public final bi1 f20281a;
    @SafeParcelable.Field(getter = "getGoogleSessionIdExtension", mo10053id = 6)
    @ts2

    /* renamed from: a */
    public final cc5 f20282a;
    @SafeParcelable.Field(getter = "getGoogleSilentVerificationExtension", mo10053id = 7)
    @ts2

    /* renamed from: a */
    public final dd5 f20283a;
    @SafeParcelable.Field(getter = "getUserVerificationMethodExtension", mo10053id = 4)
    @ts2

    /* renamed from: a */
    public final dq4 f20284a;
    @SafeParcelable.Field(getter = "getDevicePublicKeyExtension", mo10053id = 8)
    @ts2

    /* renamed from: a */
    public final e37 f20285a;
    @SafeParcelable.Field(getter = "getGoogleMultiAssertionExtension", mo10053id = 5)
    @ts2

    /* renamed from: a */
    public final e67 f20286a;
    @SafeParcelable.Field(getter = "getPrfExtension", mo10053id = 11)
    @ts2

    /* renamed from: a */
    public final if5 f20287a;
    @SafeParcelable.Field(getter = "getGoogleTunnelServerIdExtension", mo10053id = 9)
    @ts2

    /* renamed from: a */
    public final me5 f20288a;
    @SafeParcelable.Field(getter = "getFidoAppIdExtension", mo10053id = 2)
    @ts2

    /* renamed from: a */
    public final o11 f20289a;
    @SafeParcelable.Field(getter = "getCableAuthenticationExtension", mo10053id = 3)
    @ts2

    /* renamed from: a */
    public final w17 f20290a;

    /* renamed from: com.onedelhi.secure.sc$a */
    public static final class C3496a {

        /* renamed from: a */
        public bi1 f20291a;

        /* renamed from: a */
        public cc5 f20292a;

        /* renamed from: a */
        public dd5 f20293a;

        /* renamed from: a */
        public dq4 f20294a;

        /* renamed from: a */
        public e37 f20295a;

        /* renamed from: a */
        public e67 f20296a;

        /* renamed from: a */
        public if5 f20297a;

        /* renamed from: a */
        public me5 f20298a;

        /* renamed from: a */
        public o11 f20299a;

        /* renamed from: a */
        public w17 f20300a;

        public C3496a() {
        }

        public C3496a(@ts2 C3495sc scVar) {
            if (scVar != null) {
                this.f20299a = scVar.mo24289K2();
                this.f20294a = scVar.mo24290L2();
                this.f20300a = scVar.mo24291M2();
                this.f20296a = scVar.mo24293O2();
                this.f20292a = scVar.mo24294P2();
                this.f20293a = scVar.mo24295Q2();
                this.f20295a = scVar.mo24292N2();
                this.f20298a = scVar.mo24297S2();
                this.f20291a = scVar.mo24296R2();
                this.f20297a = scVar.mo24298T2();
            }
        }

        @mr2
        /* renamed from: a */
        public C3495sc mo24302a() {
            return new C3495sc(this.f20299a, this.f20300a, this.f20294a, this.f20296a, this.f20292a, this.f20293a, this.f20295a, this.f20298a, this.f20291a, this.f20297a);
        }

        @mr2
        /* renamed from: b */
        public C3496a mo24303b(@ts2 o11 o11) {
            this.f20299a = o11;
            return this;
        }

        @mr2
        /* renamed from: c */
        public C3496a mo24304c(@ts2 bi1 bi1) {
            this.f20291a = bi1;
            return this;
        }

        @mr2
        /* renamed from: d */
        public C3496a mo24305d(@ts2 dq4 dq4) {
            this.f20294a = dq4;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public C3495sc(@SafeParcelable.Param(mo10056id = 2) @ts2 o11 o11, @SafeParcelable.Param(mo10056id = 3) @ts2 w17 w17, @SafeParcelable.Param(mo10056id = 4) @ts2 dq4 dq4, @SafeParcelable.Param(mo10056id = 5) @ts2 e67 e67, @SafeParcelable.Param(mo10056id = 6) @ts2 cc5 cc5, @SafeParcelable.Param(mo10056id = 7) @ts2 dd5 dd5, @SafeParcelable.Param(mo10056id = 8) @ts2 e37 e37, @SafeParcelable.Param(mo10056id = 9) @ts2 me5 me5, @SafeParcelable.Param(mo10056id = 10) @ts2 bi1 bi1, @SafeParcelable.Param(mo10056id = 11) @ts2 if5 if5) {
        this.f20289a = o11;
        this.f20284a = dq4;
        this.f20290a = w17;
        this.f20286a = e67;
        this.f20282a = cc5;
        this.f20283a = dd5;
        this.f20285a = e37;
        this.f20288a = me5;
        this.f20281a = bi1;
        this.f20287a = if5;
    }

    @ts2
    /* renamed from: K2 */
    public o11 mo24289K2() {
        return this.f20289a;
    }

    @ts2
    /* renamed from: L2 */
    public dq4 mo24290L2() {
        return this.f20284a;
    }

    @ts2
    /* renamed from: M2 */
    public final w17 mo24291M2() {
        return this.f20290a;
    }

    @ts2
    /* renamed from: N2 */
    public final e37 mo24292N2() {
        return this.f20285a;
    }

    @ts2
    /* renamed from: O2 */
    public final e67 mo24293O2() {
        return this.f20286a;
    }

    @ts2
    /* renamed from: P2 */
    public final cc5 mo24294P2() {
        return this.f20282a;
    }

    @ts2
    /* renamed from: Q2 */
    public final dd5 mo24295Q2() {
        return this.f20283a;
    }

    @ts2
    /* renamed from: R2 */
    public final bi1 mo24296R2() {
        return this.f20281a;
    }

    @ts2
    /* renamed from: S2 */
    public final me5 mo24297S2() {
        return this.f20288a;
    }

    @ts2
    /* renamed from: T2 */
    public final if5 mo24298T2() {
        return this.f20287a;
    }

    public boolean equals(@mr2 Object obj) {
        if (!(obj instanceof C3495sc)) {
            return false;
        }
        C3495sc scVar = (C3495sc) obj;
        return Objects.equal(this.f20289a, scVar.f20289a) && Objects.equal(this.f20290a, scVar.f20290a) && Objects.equal(this.f20284a, scVar.f20284a) && Objects.equal(this.f20286a, scVar.f20286a) && Objects.equal(this.f20282a, scVar.f20282a) && Objects.equal(this.f20283a, scVar.f20283a) && Objects.equal(this.f20285a, scVar.f20285a) && Objects.equal(this.f20288a, scVar.f20288a) && Objects.equal(this.f20281a, scVar.f20281a) && Objects.equal(this.f20287a, scVar.f20287a);
    }

    public int hashCode() {
        return Objects.hashCode(this.f20289a, this.f20290a, this.f20284a, this.f20286a, this.f20282a, this.f20283a, this.f20285a, this.f20288a, this.f20281a, this.f20287a);
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, mo24289K2(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f20290a, i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, mo24290L2(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.f20286a, i, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.f20282a, i, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.f20283a, i, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.f20285a, i, false);
        SafeParcelWriter.writeParcelable(parcel, 9, this.f20288a, i, false);
        SafeParcelWriter.writeParcelable(parcel, 10, this.f20281a, i, false);
        SafeParcelWriter.writeParcelable(parcel, 11, this.f20287a, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
