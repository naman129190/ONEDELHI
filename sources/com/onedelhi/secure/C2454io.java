package com.onedelhi.secure;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;

@SafeParcelable.Class(creator = "BrowserPublicKeyCredentialCreationOptionsCreator")
@SafeParcelable.Reserved({1})
/* renamed from: com.onedelhi.secure.io */
public class C2454io extends C2655ko {
    @mr2
    public static final Parcelable.Creator<C2454io> CREATOR = new yt6();
    @SafeParcelable.Field(getter = "getOrigin", mo10053id = 3)
    @mr2

    /* renamed from: a */
    public final Uri f13773a;
    @SafeParcelable.Field(getter = "getPublicKeyCredentialCreationOptions", mo10053id = 2)
    @mr2

    /* renamed from: a */
    public final r73 f13774a;
    @SafeParcelable.Field(getter = "getClientDataHash", mo10053id = 4)
    @ts2

    /* renamed from: a */
    public final byte[] f13775a;

    /* renamed from: com.onedelhi.secure.io$a */
    public static final class C2455a {

        /* renamed from: a */
        public Uri f13776a;

        /* renamed from: a */
        public r73 f13777a;

        /* renamed from: a */
        public byte[] f13778a;

        @mr2
        /* renamed from: a */
        public C2454io mo17884a() {
            return new C2454io(this.f13777a, this.f13776a, this.f13778a);
        }

        @mr2
        /* renamed from: b */
        public C2455a mo17885b(@mr2 byte[] bArr) {
            byte[] unused = C2454io.m17717X2(bArr);
            this.f13778a = bArr;
            return this;
        }

        @mr2
        /* renamed from: c */
        public C2455a mo17886c(@mr2 Uri uri) {
            Uri unused = C2454io.m17716W2(uri);
            this.f13776a = uri;
            return this;
        }

        @mr2
        /* renamed from: d */
        public C2455a mo17887d(@mr2 r73 r73) {
            this.f13777a = r73;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public C2454io(@SafeParcelable.Param(mo10056id = 2) @mr2 r73 r73, @SafeParcelable.Param(mo10056id = 3) @mr2 Uri uri, @SafeParcelable.Param(mo10056id = 4) @ts2 byte[] bArr) {
        this.f13774a = (r73) Preconditions.checkNotNull(r73);
        m17716W2(uri);
        this.f13773a = uri;
        m17717X2(bArr);
        this.f13775a = bArr;
    }

    @mr2
    /* renamed from: S2 */
    public static C2454io m17713S2(@mr2 byte[] bArr) {
        return (C2454io) SafeParcelableSerializer.deserializeFromBytes(bArr, CREATOR);
    }

    /* renamed from: W2 */
    public static Uri m17716W2(Uri uri) {
        Preconditions.checkNotNull(uri);
        boolean z = true;
        Preconditions.checkArgument(uri.getScheme() != null, "origin scheme must be non-empty");
        if (uri.getAuthority() == null) {
            z = false;
        }
        Preconditions.checkArgument(z, "origin authority must be non-empty");
        return uri;
    }

    /* renamed from: X2 */
    public static byte[] m17717X2(byte[] bArr) {
        boolean z = true;
        if (!(bArr == null || bArr.length == 32)) {
            z = false;
        }
        Preconditions.checkArgument(z, "clientDataHash must be 32 bytes long");
        return bArr;
    }

    @ts2
    /* renamed from: K2 */
    public C3495sc mo17872K2() {
        return this.f13774a.mo17872K2();
    }

    @mr2
    /* renamed from: L2 */
    public byte[] mo17873L2() {
        return this.f13774a.mo17873L2();
    }

    @ts2
    /* renamed from: M2 */
    public Integer mo17874M2() {
        return this.f13774a.mo17874M2();
    }

    @ts2
    /* renamed from: N2 */
    public Double mo17875N2() {
        return this.f13774a.mo17875N2();
    }

    @ts2
    /* renamed from: O2 */
    public jf4 mo17876O2() {
        return this.f13774a.mo17876O2();
    }

    @mr2
    /* renamed from: P2 */
    public byte[] mo17877P2() {
        return SafeParcelableSerializer.serializeToBytes(this);
    }

    @ts2
    /* renamed from: Q2 */
    public byte[] mo17878Q2() {
        return this.f13775a;
    }

    @mr2
    /* renamed from: R2 */
    public Uri mo17879R2() {
        return this.f13773a;
    }

    @mr2
    /* renamed from: T2 */
    public r73 mo17880T2() {
        return this.f13774a;
    }

    public boolean equals(@mr2 Object obj) {
        if (!(obj instanceof C2454io)) {
            return false;
        }
        C2454io ioVar = (C2454io) obj;
        return Objects.equal(this.f13774a, ioVar.f13774a) && Objects.equal(this.f13773a, ioVar.f13773a);
    }

    public int hashCode() {
        return Objects.hashCode(this.f13774a, this.f13773a);
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, mo17880T2(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, mo17879R2(), i, false);
        SafeParcelWriter.writeByteArray(parcel, 4, mo17878Q2(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
