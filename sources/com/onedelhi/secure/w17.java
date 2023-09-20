package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.HashSet;
import java.util.List;

@SafeParcelable.Class(creator = "CableAuthenticationExtensionCreator")
public final class w17 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<w17> CREATOR = new n27();
    @SafeParcelable.Field(getter = "getCableAuthentication", mo10053id = 1)
    @mr2

    /* renamed from: a */
    public final List f22028a;

    @SafeParcelable.Constructor
    public w17(@SafeParcelable.Param(mo10056id = 1) @mr2 List list) {
        this.f22028a = (List) Preconditions.checkNotNull(list);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w17)) {
            return false;
        }
        w17 w17 = (w17) obj;
        return this.f22028a.containsAll(w17.f22028a) && w17.f22028a.containsAll(this.f22028a);
    }

    public final int hashCode() {
        return Objects.hashCode(new HashSet(this.f22028a));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, this.f22028a, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
