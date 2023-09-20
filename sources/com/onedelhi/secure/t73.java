package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.onedelhi.secure.C4119zr;
import com.onedelhi.secure.w73;

@SafeParcelable.Class(creator = "PublicKeyCredentialParametersCreator")
@SafeParcelable.Reserved({1})
public class t73 extends AbstractSafeParcelable {
    @mr2
    public static final Parcelable.Creator<t73> CREATOR = new eh5();
    @SafeParcelable.Field(getter = "getTypeAsString", mo10053id = 2, type = "java.lang.String")
    @mr2

    /* renamed from: a */
    public final w73 f20673a;
    @SafeParcelable.Field(getter = "getAlgorithmIdAsInteger", mo10053id = 3, type = "java.lang.Integer")
    @mr2

    /* renamed from: a */
    public final C4119zr f20674a;

    @SafeParcelable.Constructor
    public t73(@SafeParcelable.Param(mo10056id = 2) @mr2 String str, @SafeParcelable.Param(mo10056id = 3) int i) {
        Preconditions.checkNotNull(str);
        try {
            this.f20673a = w73.m30706a(str);
            Preconditions.checkNotNull(Integer.valueOf(i));
            try {
                this.f20674a = C4119zr.m33326a(i);
            } catch (C4119zr.C4120a e) {
                throw new IllegalArgumentException(e);
            }
        } catch (w73.C3835a e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    @mr2
    /* renamed from: K2 */
    public C4119zr mo24733K2() {
        return this.f20674a;
    }

    /* renamed from: L2 */
    public int mo24734L2() {
        return this.f20674a.mo28068b();
    }

    @mr2
    /* renamed from: M2 */
    public w73 mo24735M2() {
        return this.f20673a;
    }

    @mr2
    /* renamed from: N2 */
    public String mo24736N2() {
        return this.f20673a.toString();
    }

    public boolean equals(@mr2 Object obj) {
        if (!(obj instanceof t73)) {
            return false;
        }
        t73 t73 = (t73) obj;
        return this.f20673a.equals(t73.f20673a) && this.f20674a.equals(t73.f20674a);
    }

    public int hashCode() {
        return Objects.hashCode(this.f20673a, this.f20674a);
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, mo24736N2(), false);
        SafeParcelWriter.writeIntegerObject(parcel, 3, Integer.valueOf(mo24734L2()), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
