package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.u2f.api.common.C1432b;

/* renamed from: com.google.android.gms.fido.u2f.api.common.d */
public final class C1435d implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return C1432b.m8976b(parcel.readString());
        } catch (C1432b.C1433a e) {
            throw new RuntimeException(e);
        }
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C1432b[i];
    }
}
