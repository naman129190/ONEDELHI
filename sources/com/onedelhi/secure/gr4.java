package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "UvmEntryCreator")
public class gr4 extends AbstractSafeParcelable {
    @mr2
    public static final Parcelable.Creator<gr4> CREATOR = new jm5();
    @SafeParcelable.Field(getter = "getKeyProtectionType", mo10053id = 2)

    /* renamed from: a */
    public final short f12727a;
    @SafeParcelable.Field(getter = "getMatcherProtectionType", mo10053id = 3)

    /* renamed from: b */
    public final short f12728b;
    @SafeParcelable.Field(getter = "getUserVerificationMethod", mo10053id = 1)

    /* renamed from: n */
    public final int f12729n;

    /* renamed from: com.onedelhi.secure.gr4$a */
    public static final class C2277a {

        /* renamed from: a */
        public int f12730a;

        /* renamed from: a */
        public short f12731a;

        /* renamed from: b */
        public short f12732b;

        @mr2
        /* renamed from: a */
        public gr4 mo16846a() {
            return new gr4(this.f12730a, this.f12731a, this.f12732b);
        }

        @mr2
        /* renamed from: b */
        public C2277a mo16847b(short s) {
            this.f12731a = s;
            return this;
        }

        @mr2
        /* renamed from: c */
        public C2277a mo16848c(short s) {
            this.f12732b = s;
            return this;
        }

        @mr2
        /* renamed from: d */
        public C2277a mo16849d(int i) {
            this.f12730a = i;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public gr4(@SafeParcelable.Param(mo10056id = 1) int i, @SafeParcelable.Param(mo10056id = 2) short s, @SafeParcelable.Param(mo10056id = 3) short s2) {
        this.f12729n = i;
        this.f12727a = s;
        this.f12728b = s2;
    }

    /* renamed from: K2 */
    public short mo16840K2() {
        return this.f12727a;
    }

    /* renamed from: L2 */
    public short mo16841L2() {
        return this.f12728b;
    }

    /* renamed from: M2 */
    public int mo16842M2() {
        return this.f12729n;
    }

    public boolean equals(@mr2 Object obj) {
        if (!(obj instanceof gr4)) {
            return false;
        }
        gr4 gr4 = (gr4) obj;
        return this.f12729n == gr4.f12729n && this.f12727a == gr4.f12727a && this.f12728b == gr4.f12728b;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f12729n), Short.valueOf(this.f12727a), Short.valueOf(this.f12728b));
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, mo16842M2());
        SafeParcelWriter.writeShort(parcel, 2, mo16840K2());
        SafeParcelWriter.writeShort(parcel, 3, mo16841L2());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
