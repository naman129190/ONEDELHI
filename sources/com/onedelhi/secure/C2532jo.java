package com.onedelhi.secure;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;

@SafeParcelable.Class(creator = "BrowserPublicKeyCredentialRequestOptionsCreator")
@SafeParcelable.Reserved({1})
/* renamed from: com.onedelhi.secure.jo */
public class C2532jo extends C2655ko {
    @mr2
    public static final Parcelable.Creator<C2532jo> CREATOR = new ov6();
    @SafeParcelable.Field(getter = "getOrigin", mo10053id = 3)
    @mr2

    /* renamed from: a */
    public final Uri f14296a;
    @SafeParcelable.Field(getter = "getPublicKeyCredentialRequestOptions", mo10053id = 2)
    @mr2

    /* renamed from: a */
    public final u73 f14297a;
    @SafeParcelable.Field(getter = "getClientDataHash", mo10053id = 4)
    @ts2

    /* renamed from: a */
    public final byte[] f14298a;

    /* renamed from: com.onedelhi.secure.jo$a */
    public static final class C2533a {

        /* renamed from: a */
        public Uri f14299a;

        /* renamed from: a */
        public u73 f14300a;

        /* renamed from: a */
        public byte[] f14301a;

        @mr2
        /* renamed from: a */
        public C2532jo mo18518a() {
            return new C2532jo(this.f14300a, this.f14299a, this.f14301a);
        }

        @mr2
        /* renamed from: b */
        public C2533a mo18519b(@mr2 byte[] bArr) {
            byte[] unused = C2532jo.m18695X2(bArr);
            this.f14301a = bArr;
            return this;
        }

        @mr2
        /* renamed from: c */
        public C2533a mo18520c(@mr2 Uri uri) {
            Uri unused = C2532jo.m18694W2(uri);
            this.f14299a = uri;
            return this;
        }

        @mr2
        /* renamed from: d */
        public C2533a mo18521d(@mr2 u73 u73) {
            this.f14300a = (u73) Preconditions.checkNotNull(u73);
            return this;
        }
    }

    @SafeParcelable.Constructor
    public C2532jo(@SafeParcelable.Param(mo10056id = 2) @mr2 u73 u73, @SafeParcelable.Param(mo10056id = 3) @mr2 Uri uri, @SafeParcelable.Param(mo10056id = 4) @ts2 byte[] bArr) {
        this.f14297a = (u73) Preconditions.checkNotNull(u73);
        m18694W2(uri);
        this.f14296a = uri;
        m18695X2(bArr);
        this.f14298a = bArr;
    }

    @mr2
    /* renamed from: S2 */
    public static C2532jo m18691S2(@mr2 byte[] bArr) {
        return (C2532jo) SafeParcelableSerializer.deserializeFromBytes(bArr, CREATOR);
    }

    /* renamed from: W2 */
    public static Uri m18694W2(Uri uri) {
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
    public static byte[] m18695X2(byte[] bArr) {
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
        return this.f14297a.mo17872K2();
    }

    @mr2
    /* renamed from: L2 */
    public byte[] mo17873L2() {
        return this.f14297a.mo17873L2();
    }

    @ts2
    /* renamed from: M2 */
    public Integer mo17874M2() {
        return this.f14297a.mo17874M2();
    }

    @ts2
    /* renamed from: N2 */
    public Double mo17875N2() {
        return this.f14297a.mo17875N2();
    }

    @ts2
    /* renamed from: O2 */
    public jf4 mo17876O2() {
        return this.f14297a.mo17876O2();
    }

    @mr2
    /* renamed from: P2 */
    public byte[] mo17877P2() {
        return SafeParcelableSerializer.serializeToBytes(this);
    }

    @ts2
    /* renamed from: Q2 */
    public byte[] mo17878Q2() {
        return this.f14298a;
    }

    @mr2
    /* renamed from: R2 */
    public Uri mo17879R2() {
        return this.f14296a;
    }

    @mr2
    /* renamed from: T2 */
    public u73 mo18514T2() {
        return this.f14297a;
    }

    public boolean equals(@mr2 Object obj) {
        if (!(obj instanceof C2532jo)) {
            return false;
        }
        C2532jo joVar = (C2532jo) obj;
        return Objects.equal(this.f14297a, joVar.f14297a) && Objects.equal(this.f14296a, joVar.f14296a);
    }

    public int hashCode() {
        return Objects.hashCode(this.f14297a, this.f14296a);
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, mo18514T2(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, mo17879R2(), i, false);
        SafeParcelWriter.writeByteArray(parcel, 4, mo17878Q2(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
