package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;

@SafeParcelable.Class(creator = "AuthenticationExtensionsClientOutputsCreator")
/* renamed from: com.onedelhi.secure.tc */
public class C3593tc extends AbstractSafeParcelable {
    @mr2
    public static final Parcelable.Creator<C3593tc> CREATOR = new ns5();
    @SafeParcelable.Field(getter = "getPrf", mo10053id = 4)
    @ts2

    /* renamed from: a */
    public final de6 f20741a;
    @SafeParcelable.Field(getter = "getUvmEntries", mo10053id = 1)
    @ts2

    /* renamed from: a */
    public final fr4 f20742a;
    @SafeParcelable.Field(getter = "getDevicePubKey", mo10053id = 2)
    @ts2

    /* renamed from: a */
    public final l66 f20743a;
    @SafeParcelable.Field(getter = "getCredProps", mo10053id = 3)
    @ts2

    /* renamed from: a */
    public final C3693uc f20744a;

    /* renamed from: com.onedelhi.secure.tc$a */
    public static final class C3594a {
        @ts2

        /* renamed from: a */
        public fr4 f20745a;
        @ts2

        /* renamed from: a */
        public C3693uc f20746a;

        @mr2
        /* renamed from: a */
        public C3593tc mo24844a() {
            return new C3593tc(this.f20745a, (l66) null, this.f20746a, (de6) null);
        }

        @mr2
        /* renamed from: b */
        public C3594a mo24845b(@ts2 C3693uc ucVar) {
            this.f20746a = ucVar;
            return this;
        }

        @mr2
        /* renamed from: c */
        public C3594a mo24846c(@ts2 fr4 fr4) {
            this.f20745a = fr4;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public C3593tc(@SafeParcelable.Param(mo10056id = 1) @ts2 fr4 fr4, @SafeParcelable.Param(mo10056id = 2) @ts2 l66 l66, @SafeParcelable.Param(mo10056id = 3) @ts2 C3693uc ucVar, @SafeParcelable.Param(mo10056id = 4) @ts2 de6 de6) {
        this.f20742a = fr4;
        this.f20743a = l66;
        this.f20744a = ucVar;
        this.f20741a = de6;
    }

    @mr2
    /* renamed from: K2 */
    public static C3593tc m28324K2(@mr2 byte[] bArr) {
        return (C3593tc) SafeParcelableSerializer.deserializeFromBytes(bArr, CREATOR);
    }

    @ts2
    /* renamed from: L2 */
    public C3693uc mo24838L2() {
        return this.f20744a;
    }

    @ts2
    /* renamed from: M2 */
    public fr4 mo24839M2() {
        return this.f20742a;
    }

    @mr2
    /* renamed from: N2 */
    public byte[] mo24840N2() {
        return SafeParcelableSerializer.serializeToBytes(this);
    }

    public boolean equals(@ts2 Object obj) {
        if (!(obj instanceof C3593tc)) {
            return false;
        }
        C3593tc tcVar = (C3593tc) obj;
        return Objects.equal(this.f20742a, tcVar.f20742a) && Objects.equal(this.f20743a, tcVar.f20743a) && Objects.equal(this.f20744a, tcVar.f20744a) && Objects.equal(this.f20741a, tcVar.f20741a);
    }

    public int hashCode() {
        return Objects.hashCode(this.f20742a, this.f20743a, this.f20744a, this.f20741a);
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, mo24839M2(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f20743a, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, mo24838L2(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f20741a, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
