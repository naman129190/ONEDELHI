package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "AuthenticationExtensionsCredPropsOutputsCreator")
/* renamed from: com.onedelhi.secure.uc */
public class C3693uc extends AbstractSafeParcelable {
    @mr2
    public static final Parcelable.Creator<C3693uc> CREATOR = new o26();
    @SafeParcelable.Field(getter = "getIsDiscoverableCredential", mo10053id = 1)

    /* renamed from: b */
    public final boolean f21319b;

    @SafeParcelable.Constructor
    public C3693uc(@SafeParcelable.Param(mo10056id = 1) boolean z) {
        this.f21319b = z;
    }

    /* renamed from: K2 */
    public boolean mo25560K2() {
        return this.f21319b;
    }

    public boolean equals(@ts2 Object obj) {
        return (obj instanceof C3693uc) && this.f21319b == ((C3693uc) obj).f21319b;
    }

    public int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.f21319b));
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, mo25560K2());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
