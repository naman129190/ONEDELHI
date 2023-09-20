package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@SafeParcelable.Class(creator = "AccountChangeEventsResponseCreator")
/* renamed from: com.onedelhi.secure.j2 */
public class C2469j2 extends AbstractSafeParcelable {
    @mr2
    public static final Parcelable.Creator<C2469j2> CREATOR = new rs5();
    @SafeParcelable.Field(mo10053id = 2)

    /* renamed from: a */
    public final List f13984a;
    @SafeParcelable.VersionField(mo10062id = 1)

    /* renamed from: n */
    public final int f13985n;

    @SafeParcelable.Constructor
    public C2469j2(@SafeParcelable.Param(mo10056id = 1) int i, @SafeParcelable.Param(mo10056id = 2) List list) {
        this.f13985n = i;
        this.f13984a = (List) Preconditions.checkNotNull(list);
    }

    public C2469j2(@mr2 List<C2290h2> list) {
        this.f13985n = 1;
        this.f13984a = (List) Preconditions.checkNotNull(list);
    }

    @mr2
    /* renamed from: K2 */
    public List<C2290h2> mo18089K2() {
        return this.f13984a;
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f13985n);
        SafeParcelWriter.writeTypedList(parcel, 2, this.f13984a, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
