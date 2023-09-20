package com.onedelhi.secure;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "BeginSignInResultCreator")
/* renamed from: com.onedelhi.secure.lk */
public final class C2767lk extends AbstractSafeParcelable {
    @mr2
    public static final Parcelable.Creator<C2767lk> CREATOR = new q65();
    @SafeParcelable.Field(getter = "getPendingIntent", mo10053id = 1)

    /* renamed from: a */
    public final PendingIntent f15443a;

    @SafeParcelable.Constructor
    public C2767lk(@SafeParcelable.Param(mo10056id = 1) @mr2 PendingIntent pendingIntent) {
        this.f15443a = (PendingIntent) Preconditions.checkNotNull(pendingIntent);
    }

    @mr2
    public PendingIntent getPendingIntent() {
        return this.f15443a;
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getPendingIntent(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
